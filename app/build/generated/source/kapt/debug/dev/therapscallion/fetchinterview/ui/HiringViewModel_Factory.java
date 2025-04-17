package dev.therapscallion.fetchinterview.ui;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import dev.therapscallion.fetchinterview.business.HiringRepository;
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
public final class HiringViewModel_Factory implements Factory<HiringViewModel> {
  private final Provider<HiringRepository> repositoryProvider;

  public HiringViewModel_Factory(Provider<HiringRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public HiringViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static HiringViewModel_Factory create(Provider<HiringRepository> repositoryProvider) {
    return new HiringViewModel_Factory(repositoryProvider);
  }

  public static HiringViewModel newInstance(HiringRepository repository) {
    return new HiringViewModel(repository);
  }
}
