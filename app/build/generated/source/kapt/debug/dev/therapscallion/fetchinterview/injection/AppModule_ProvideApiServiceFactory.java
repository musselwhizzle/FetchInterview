package dev.therapscallion.fetchinterview.injection;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import dev.therapscallion.fetchinterview.network.HiringApi;
import javax.annotation.processing.Generated;

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
public final class AppModule_ProvideApiServiceFactory implements Factory<HiringApi> {
  @Override
  public HiringApi get() {
    return provideApiService();
  }

  public static AppModule_ProvideApiServiceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static HiringApi provideApiService() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideApiService());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideApiServiceFactory INSTANCE = new AppModule_ProvideApiServiceFactory();
  }
}
