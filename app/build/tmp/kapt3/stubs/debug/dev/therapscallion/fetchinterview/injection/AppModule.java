package dev.therapscallion.fetchinterview.injection;

import android.content.Context;
import androidx.room.Room;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import dev.therapscallion.fetchinterview.network.HiringApi;
import dev.therapscallion.fetchinterview.storage.FetchDb;
import dev.therapscallion.fetchinterview.storage.HiringItemDao;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import javax.inject.Singleton;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007\u00a8\u0006\f"}, d2 = {"Ldev/therapscallion/fetchinterview/injection/AppModule;", "", "()V", "provideApiService", "Ldev/therapscallion/fetchinterview/network/HiringApi;", "provideAppDatabase", "Ldev/therapscallion/fetchinterview/storage/FetchDb;", "appContext", "Landroid/content/Context;", "provideHiringItemDao", "Ldev/therapscallion/fetchinterview/storage/HiringItemDao;", "db", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final dev.therapscallion.fetchinterview.injection.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final dev.therapscallion.fetchinterview.network.HiringApi provideApiService() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final dev.therapscallion.fetchinterview.storage.FetchDb provideAppDatabase(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context appContext) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final dev.therapscallion.fetchinterview.storage.HiringItemDao provideHiringItemDao(@org.jetbrains.annotations.NotNull()
    dev.therapscallion.fetchinterview.storage.FetchDb db) {
        return null;
    }
}