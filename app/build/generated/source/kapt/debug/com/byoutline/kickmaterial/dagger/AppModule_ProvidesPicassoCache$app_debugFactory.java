// Generated by Dagger (https://google.github.io/dagger).
package com.byoutline.kickmaterial.dagger;

import com.byoutline.kickmaterial.features.projectdetails.LruCacheWithPlaceholders;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class AppModule_ProvidesPicassoCache$app_debugFactory
    implements Factory<LruCacheWithPlaceholders> {
  private final AppModule module;

  public AppModule_ProvidesPicassoCache$app_debugFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public LruCacheWithPlaceholders get() {
    return provideInstance(module);
  }

  public static LruCacheWithPlaceholders provideInstance(AppModule module) {
    return proxyProvidesPicassoCache$app_debug(module);
  }

  public static AppModule_ProvidesPicassoCache$app_debugFactory create(AppModule module) {
    return new AppModule_ProvidesPicassoCache$app_debugFactory(module);
  }

  public static LruCacheWithPlaceholders proxyProvidesPicassoCache$app_debug(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.providesPicassoCache$app_debug(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
