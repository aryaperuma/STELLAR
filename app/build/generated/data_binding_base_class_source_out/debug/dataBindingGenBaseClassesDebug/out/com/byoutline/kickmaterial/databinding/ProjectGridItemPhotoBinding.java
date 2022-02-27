package com.byoutline.kickmaterial.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.byoutline.kickmaterial.features.projectlist.ProjectItemViewModel;

public abstract class ProjectGridItemPhotoBinding extends ViewDataBinding {
  @NonNull
  public final View projectItemBigPhotoIv;

  @Bindable
  protected ProjectItemViewModel mViewModel;

  protected ProjectGridItemPhotoBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, View projectItemBigPhotoIv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.projectItemBigPhotoIv = projectItemBigPhotoIv;
  }

  public abstract void setViewModel(@Nullable ProjectItemViewModel viewModel);

  @Nullable
  public ProjectItemViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ProjectGridItemPhotoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ProjectGridItemPhotoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ProjectGridItemPhotoBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.project_grid_item_photo, root, attachToRoot, component);
  }

  @NonNull
  public static ProjectGridItemPhotoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ProjectGridItemPhotoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ProjectGridItemPhotoBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.project_grid_item_photo, null, false, component);
  }

  public static ProjectGridItemPhotoBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ProjectGridItemPhotoBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ProjectGridItemPhotoBinding)bind(component, view, com.byoutline.kickmaterial.R.layout.project_grid_item_photo);
  }
}
