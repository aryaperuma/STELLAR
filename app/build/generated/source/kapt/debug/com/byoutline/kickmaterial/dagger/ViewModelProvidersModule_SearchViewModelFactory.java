// Generated by Dagger (https://google.github.io/dagger).
package com.byoutline.kickmaterial.dagger;

import android.arch.lifecycle.ViewModel;
import com.byoutline.kickmaterial.model.DiscoverQuery;
import com.byoutline.kickmaterial.model.DiscoverResponse;
import com.byoutline.observablecachedfield.ObservableCachedFieldWithArg;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class ViewModelProvidersModule_SearchViewModelFactory implements Factory<ViewModel> {
  private final ViewModelProvidersModule module;

  private final Provider<ObservableCachedFieldWithArg<DiscoverResponse, DiscoverQuery>>
      discoverFieldProvider;

  public ViewModelProvidersModule_SearchViewModelFactory(
      ViewModelProvidersModule module,
      Provider<ObservableCachedFieldWithArg<DiscoverResponse, DiscoverQuery>>
          discoverFieldProvider) {
    this.module = module;
    this.discoverFieldProvider = discoverFieldProvider;
  }

  @Override
  public ViewModel get() {
    return provideInstance(module, discoverFieldProvider);
  }

  public static ViewModel provideInstance(
      ViewModelProvidersModule module,
      Provider<ObservableCachedFieldWithArg<DiscoverResponse, DiscoverQuery>>
          discoverFieldProvider) {
    return proxySearchViewModel(module, discoverFieldProvider.get());
  }

  public static ViewModelProvidersModule_SearchViewModelFactory create(
      ViewModelProvidersModule module,
      Provider<ObservableCachedFieldWithArg<DiscoverResponse, DiscoverQuery>>
          discoverFieldProvider) {
    return new ViewModelProvidersModule_SearchViewModelFactory(module, discoverFieldProvider);
  }

  public static ViewModel proxySearchViewModel(
      ViewModelProvidersModule instance,
      ObservableCachedFieldWithArg<DiscoverResponse, DiscoverQuery> discoverField) {
    return Preconditions.checkNotNull(
        instance.searchViewModel(discoverField),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}