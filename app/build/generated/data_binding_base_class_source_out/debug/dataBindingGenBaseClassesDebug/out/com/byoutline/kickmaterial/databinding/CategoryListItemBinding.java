package com.byoutline.kickmaterial.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.byoutline.kickmaterial.features.selectcategory.CategoryClickListener;
import com.byoutline.kickmaterial.model.Category;

public abstract class CategoryListItemBinding extends ViewDataBinding {
  @NonNull
  public final ImageView categoryCheckedIv;

  @NonNull
  public final CardView categoryContainerCv;

  @NonNull
  public final ImageView categoryDotColor;

  @NonNull
  public final TextView categoryNameTv;

  @NonNull
  public final FrameLayout checkedView;

  @Bindable
  protected Category mCategoryItem;

  @Bindable
  protected CategoryClickListener mCategoryClickListener;

  protected CategoryListItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView categoryCheckedIv, CardView categoryContainerCv,
      ImageView categoryDotColor, TextView categoryNameTv, FrameLayout checkedView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.categoryCheckedIv = categoryCheckedIv;
    this.categoryContainerCv = categoryContainerCv;
    this.categoryDotColor = categoryDotColor;
    this.categoryNameTv = categoryNameTv;
    this.checkedView = checkedView;
  }

  public abstract void setCategoryItem(@Nullable Category categoryItem);

  @Nullable
  public Category getCategoryItem() {
    return mCategoryItem;
  }

  public abstract void setCategoryClickListener(@Nullable CategoryClickListener categoryClickListener);

  @Nullable
  public CategoryClickListener getCategoryClickListener() {
    return mCategoryClickListener;
  }

  @NonNull
  public static CategoryListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CategoryListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CategoryListItemBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.category_list_item, root, attachToRoot, component);
  }

  @NonNull
  public static CategoryListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CategoryListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CategoryListItemBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.category_list_item, null, false, component);
  }

  public static CategoryListItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static CategoryListItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (CategoryListItemBinding)bind(component, view, com.byoutline.kickmaterial.R.layout.category_list_item);
  }
}
