package com.byoutline.kickmaterial.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.byoutline.kickmaterial.features.rewardlist.RewardListViewModel;
import com.byoutline.secretsauce.views.RoundedImageView;

public abstract class FragmentRewardsListBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout categoriesHeaderLl;

  @NonNull
  public final RecyclerView categoriesRv;

  @NonNull
  public final ImageView categoryCircleIv;

  @NonNull
  public final ImageView categoryCircleRevealIv;

  @NonNull
  public final FloatingActionButton closeCategoriesIv;

  @NonNull
  public final RelativeLayout drawerLayout;

  @NonNull
  public final FrameLayout rewardsListImageContainer;

  @NonNull
  public final TextView selectCategoryTv;

  @NonNull
  public final RoundedImageView selectedCategoryIv;

  @Bindable
  protected RewardListViewModel mModel;

  protected FragmentRewardsListBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout categoriesHeaderLl, RecyclerView categoriesRv,
      ImageView categoryCircleIv, ImageView categoryCircleRevealIv,
      FloatingActionButton closeCategoriesIv, RelativeLayout drawerLayout,
      FrameLayout rewardsListImageContainer, TextView selectCategoryTv,
      RoundedImageView selectedCategoryIv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.categoriesHeaderLl = categoriesHeaderLl;
    this.categoriesRv = categoriesRv;
    this.categoryCircleIv = categoryCircleIv;
    this.categoryCircleRevealIv = categoryCircleRevealIv;
    this.closeCategoriesIv = closeCategoriesIv;
    this.drawerLayout = drawerLayout;
    this.rewardsListImageContainer = rewardsListImageContainer;
    this.selectCategoryTv = selectCategoryTv;
    this.selectedCategoryIv = selectedCategoryIv;
  }

  public abstract void setModel(@Nullable RewardListViewModel model);

  @Nullable
  public RewardListViewModel getModel() {
    return mModel;
  }

  @NonNull
  public static FragmentRewardsListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentRewardsListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentRewardsListBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.fragment_rewards_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentRewardsListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentRewardsListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentRewardsListBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.fragment_rewards_list, null, false, component);
  }

  public static FragmentRewardsListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentRewardsListBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentRewardsListBinding)bind(component, view, com.byoutline.kickmaterial.R.layout.fragment_rewards_list);
  }
}
