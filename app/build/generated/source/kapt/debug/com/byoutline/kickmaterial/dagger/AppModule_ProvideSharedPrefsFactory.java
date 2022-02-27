// Generated by Dagger (https://google.github.io/dagger).
package com.byoutline.kickmaterial.dagger;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class AppModule_ProvideSharedPrefsFactory implements Factory<SharedPreferences> {
  private final AppModule module;

  public AppModule_ProvideSharedPrefsFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public SharedPreferences get() {
    return provideInstance(module);
  }

  public static SharedPreferences provideInstance(AppModule module) {
    return proxyProvideSharedPrefs(module);
  }

  public static AppModule_ProvideSharedPrefsFactory create(AppModule module) {
    return new AppModule_ProvideSharedPrefsFactory(module);
  }

  public static SharedPreferences proxyProvideSharedPrefs(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.provideSharedPrefs(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
