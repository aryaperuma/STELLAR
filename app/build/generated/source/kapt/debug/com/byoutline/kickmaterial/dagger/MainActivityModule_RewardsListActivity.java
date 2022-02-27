package com.byoutline.kickmaterial.dagger;

import android.app.Activity;
import com.byoutline.kickmaterial.features.rewardlist.RewardsListActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = MainActivityModule_RewardsListActivity.RewardsListActivitySubcomponent.class
)
public abstract class MainActivityModule_RewardsListActivity {
  private MainActivityModule_RewardsListActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(RewardsListActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      RewardsListActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface RewardsListActivitySubcomponent extends AndroidInjector<RewardsListActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<RewardsListActivity> {}
  }
}
