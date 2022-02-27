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
import android.widget.TextView;
import com.byoutline.kickmaterial.features.projectlist.ProjectItemViewModel;
import com.byoutline.kickmaterial.views.DisabledSeekBar;

public abstract class ProjectGridItemBigBinding extends ViewDataBinding {
  @NonNull
  public final ProjectNumberDetailsBinding numberDetailsLayout;

  @NonNull
  public final ProjectGridItemPhotoBinding photoLayout;

  @NonNull
  public final TextView projectItemBigDescTv;

  @NonNull
  public final DisabledSeekBar projectItemBigProgressSb;

  @NonNull
  public final TextView projectItemBigTitleTv;

  @Bindable
  protected ProjectItemViewModel mViewModel;

  protected ProjectGridItemBigBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ProjectNumberDetailsBinding numberDetailsLayout,
      ProjectGridItemPhotoBinding photoLayout, TextView projectItemBigDescTv,
      DisabledSeekBar projectItemBigProgressSb, TextView projectItemBigTitleTv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.numberDetailsLayout = numberDetailsLayout;
    setContainedBinding(this.numberDetailsLayout);;
    this.photoLayout = photoLayout;
    setContainedBinding(this.photoLayout);;
    this.projectItemBigDescTv = projectItemBigDescTv;
    this.projectItemBigProgressSb = projectItemBigProgressSb;
    this.projectItemBigTitleTv = projectItemBigTitleTv;
  }

  public abstract void setViewModel(@Nullable ProjectItemViewModel viewModel);

  @Nullable
  public ProjectItemViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ProjectGridItemBigBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ProjectGridItemBigBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ProjectGridItemBigBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.project_grid_item_big, root, attachToRoot, component);
  }

  @NonNull
  public static ProjectGridItemBigBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ProjectGridItemBigBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ProjectGridItemBigBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.project_grid_item_big, null, false, component);
  }

  public static ProjectGridItemBigBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ProjectGridItemBigBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ProjectGridItemBigBinding)bind(component, view, com.byoutline.kickmaterial.R.layout.project_grid_item_big);
  }
}
