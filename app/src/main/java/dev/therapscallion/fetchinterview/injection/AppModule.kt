package dev.therapscallion.fetchinterview.injection

import android.content.Context
import androidx.room.Room
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dev.therapscallion.fetchinterview.network.HiringApi
import dev.therapscallion.fetchinterview.storage.FetchDb
import dev.therapscallion.fetchinterview.storage.HiringItemDao
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideApiService(): HiringApi {
        val moshi = Moshi.Builder()
            .addLast(KotlinJsonAdapterFactory())
            .build()
        val retrofit = Retrofit.Builder()
            .baseUrl("https://fetch-hiring.s3.amazonaws.com")
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
        return retrofit.create(HiringApi::class.java)
    }

    @Provides
    @Singleton
    fun provideAppDatabase(
        @ApplicationContext appContext: Context
    ): FetchDb {
        return Room.databaseBuilder(
            appContext,
            FetchDb::class.java,
            "app.db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideHiringItemDao(
        db: FetchDb
    ): HiringItemDao {
        return db.getHiringItemDao()
    }

}