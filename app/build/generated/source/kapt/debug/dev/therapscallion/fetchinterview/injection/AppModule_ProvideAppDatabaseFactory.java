package dev.therapscallion.fetchinterview.injection;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import dev.therapscallion.fetchinterview.storage.FetchDb;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class AppModule_ProvideAppDatabaseFactory implements Factory<FetchDb> {
  private final Provider<Context> appContextProvider;

  public AppModule_ProvideAppDatabaseFactory(Provider<Context> appContextProvider) {
    this.appContextProvider = appContextProvider;
  }

  @Override
  public FetchDb get() {
    return provideAppDatabase(appContextProvider.get());
  }

  public static AppModule_ProvideAppDatabaseFactory create(Provider<Context> appContextProvider) {
    return new AppModule_ProvideAppDatabaseFactory(appContextProvider);
  }

  public static FetchDb provideAppDatabase(Context appContext) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideAppDatabase(appContext));
  }
}
