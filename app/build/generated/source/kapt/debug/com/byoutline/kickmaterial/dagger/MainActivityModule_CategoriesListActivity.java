package com.byoutline.kickmaterial.dagger;

import android.app.Activity;
import com.byoutline.kickmaterial.features.selectcategory.CategoriesListActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = MainActivityModule_CategoriesListActivity.CategoriesListActivitySubcomponent.class
)
public abstract class MainActivityModule_CategoriesListActivity {
  private MainActivityModule_CategoriesListActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(CategoriesListActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      CategoriesListActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface CategoriesListActivitySubcomponent
      extends AndroidInjector<CategoriesListActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<CategoriesListActivity> {}
  }
}
