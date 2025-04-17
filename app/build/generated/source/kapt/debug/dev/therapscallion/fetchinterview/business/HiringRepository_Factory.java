package dev.therapscallion.fetchinterview.business;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import dev.therapscallion.fetchinterview.network.HiringApi;
import dev.therapscallion.fetchinterview.storage.HiringItemDao;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class HiringRepository_Factory implements Factory<HiringRepository> {
  private final Provider<HiringApi> fetchApiProvider;

  private final Provider<HiringItemDao> hiringDaoProvider;

  public HiringRepository_Factory(Provider<HiringApi> fetchApiProvider,
      Provider<HiringItemDao> hiringDaoProvider) {
    this.fetchApiProvider = fetchApiProvider;
    this.hiringDaoProvider = hiringDaoProvider;
  }

  @Override
  public HiringRepository get() {
    return newInstance(fetchApiProvider.get(), hiringDaoProvider.get());
  }

  public static HiringRepository_Factory create(Provider<HiringApi> fetchApiProvider,
      Provider<HiringItemDao> hiringDaoProvider) {
    return new HiringRepository_Factory(fetchApiProvider, hiringDaoProvider);
  }

  public static HiringRepository newInstance(HiringApi fetchApi, HiringItemDao hiringDao) {
    return new HiringRepository(fetchApi, hiringDao);
  }
}
