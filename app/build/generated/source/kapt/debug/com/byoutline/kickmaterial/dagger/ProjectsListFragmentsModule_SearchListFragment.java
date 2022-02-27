package com.byoutline.kickmaterial.dagger;

import android.support.v4.app.Fragment;
import com.byoutline.kickmaterial.features.search.SearchListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ProjectsListFragmentsModule_SearchListFragment.SearchListFragmentSubcomponent.class
)
public abstract class ProjectsListFragmentsModule_SearchListFragment {
  private ProjectsListFragmentsModule_SearchListFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(SearchListFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      SearchListFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface SearchListFragmentSubcomponent extends AndroidInjector<SearchListFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SearchListFragment> {}
  }
}
