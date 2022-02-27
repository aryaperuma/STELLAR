package com.byoutline.kickmaterial.dagger;

import android.app.Activity;
import com.byoutline.kickmaterial.features.projectdetails.ProjectDetailsActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = MainActivityModule_ProjectDetailsActivity.ProjectDetailsActivitySubcomponent.class
)
public abstract class MainActivityModule_ProjectDetailsActivity {
  private MainActivityModule_ProjectDetailsActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(ProjectDetailsActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      ProjectDetailsActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface ProjectDetailsActivitySubcomponent
      extends AndroidInjector<ProjectDetailsActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ProjectDetailsActivity> {}
  }
}
