// Generated by Dagger (https://google.github.io/dagger).
package com.byoutline.kickmaterial.dagger;

import dagger.internal.Factory;

public final class AppModule_ProvideAnimationDurationMultiplierFactory implements Factory<Integer> {
  private final AppModule module;

  public AppModule_ProvideAnimationDurationMultiplierFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Integer get() {
    return provideInstance(module);
  }

  public static Integer provideInstance(AppModule module) {
    return proxyProvideAnimationDurationMultiplier(module);
  }

  public static AppModule_ProvideAnimationDurationMultiplierFactory create(AppModule module) {
    return new AppModule_ProvideAnimationDurationMultiplierFactory(module);
  }

  public static int proxyProvideAnimationDurationMultiplier(AppModule instance) {
    return instance.provideAnimationDurationMultiplier();
  }
}