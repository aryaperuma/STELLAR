package com.byoutline.kickmaterial.dagger;

import android.support.v4.app.Fragment;
import com.byoutline.kickmaterial.features.projectlist.ProjectsListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ProjectsListFragmentsModule_ProjectsListFragment.ProjectsListFragmentSubcomponent.class
)
public abstract class ProjectsListFragmentsModule_ProjectsListFragment {
  private ProjectsListFragmentsModule_ProjectsListFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ProjectsListFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ProjectsListFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ProjectsListFragmentSubcomponent extends AndroidInjector<ProjectsListFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ProjectsListFragment> {}
  }
}
