package dev.therapscallion.fetchinterview.injection;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import dev.therapscallion.fetchinterview.storage.FetchDb;
import dev.therapscallion.fetchinterview.storage.HiringItemDao;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
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
public final class AppModule_ProvideHiringItemDaoFactory implements Factory<HiringItemDao> {
  private final Provider<FetchDb> dbProvider;

  public AppModule_ProvideHiringItemDaoFactory(Provider<FetchDb> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public HiringItemDao get() {
    return provideHiringItemDao(dbProvider.get());
  }

  public static AppModule_ProvideHiringItemDaoFactory create(Provider<FetchDb> dbProvider) {
    return new AppModule_ProvideHiringItemDaoFactory(dbProvider);
  }

  public static HiringItemDao provideHiringItemDao(FetchDb db) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideHiringItemDao(db));
  }
}
