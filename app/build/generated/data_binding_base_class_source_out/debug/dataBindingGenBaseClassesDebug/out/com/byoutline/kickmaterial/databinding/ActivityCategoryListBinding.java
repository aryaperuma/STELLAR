package com.byoutline.kickmaterial.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.byoutline.kickmaterial.features.selectcategory.CategoriesListViewModel;
import com.byoutline.secretsauce.views.RoundedImageView;

public abstract class ActivityCategoryListBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout categoriesHeaderLl;

  @NonNull
  public final RecyclerView categoriesRv;

  @NonNull
  public final ImageView categoryCircleIv;

  @NonNull
  public final ImageView categoryCircleRevealIv;

  @NonNull
  public final FrameLayout circleImageContainer;

  @NonNull
  public final FloatingActionButton closeCategoriesIv;

  @NonNull
  public final FrameLayout drawerLayout;

  @NonNull
  public final TextView selectCategoryTv;

  @NonNull
  public final RoundedImageView selectedCategoryIv;

  @NonNull
  public final Toolbar toolbar;

  @Bindable
  protected CategoriesListViewModel mViewModel;

  protected ActivityCategoryListBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout categoriesHeaderLl, RecyclerView categoriesRv,
      ImageView categoryCircleIv, ImageView categoryCircleRevealIv,
      FrameLayout circleImageContainer, FloatingActionButton closeCategoriesIv,
      FrameLayout drawerLayout, TextView selectCategoryTv, RoundedImageView selectedCategoryIv,
      Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.categoriesHeaderLl = categoriesHeaderLl;
    this.categoriesRv = categoriesRv;
    this.categoryCircleIv = categoryCircleIv;
    this.categoryCircleRevealIv = categoryCircleRevealIv;
    this.circleImageContainer = circleImageContainer;
    this.closeCategoriesIv = closeCategoriesIv;
    this.drawerLayout = drawerLayout;
    this.selectCategoryTv = selectCategoryTv;
    this.selectedCategoryIv = selectedCategoryIv;
    this.toolbar = toolbar;
  }

  public abstract void setViewModel(@Nullable CategoriesListViewModel viewModel);

  @Nullable
  public CategoriesListViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityCategoryListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityCategoryListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityCategoryListBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.activity_category_list, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCategoryListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityCategoryListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityCategoryListBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.activity_category_list, null, false, component);
  }

  public static ActivityCategoryListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityCategoryListBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityCategoryListBinding)bind(component, view, com.byoutline.kickmaterial.R.layout.activity_category_list);
  }
}
