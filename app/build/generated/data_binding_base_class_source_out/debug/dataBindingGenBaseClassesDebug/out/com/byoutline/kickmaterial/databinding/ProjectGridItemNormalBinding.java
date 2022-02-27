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

public abstract class ProjectGridItemNormalBinding extends ViewDataBinding {
  @NonNull
  public final ProjectGridItemPhotoBinding photoLayout;

  @NonNull
  public final DisabledSeekBar projectItemBigProgressSb;

  @NonNull
  public final TextView projectItemBigTitleTv;

  @Bindable
  protected ProjectItemViewModel mViewModel;

  protected ProjectGridItemNormalBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ProjectGridItemPhotoBinding photoLayout,
      DisabledSeekBar projectItemBigProgressSb, TextView projectItemBigTitleTv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.photoLayout = photoLayout;
    setContainedBinding(this.photoLayout);;
    this.projectItemBigProgressSb = projectItemBigProgressSb;
    this.projectItemBigTitleTv = projectItemBigTitleTv;
  }

  public abstract void setViewModel(@Nullable ProjectItemViewModel viewModel);

  @Nullable
  public ProjectItemViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ProjectGridItemNormalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ProjectGridItemNormalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ProjectGridItemNormalBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.project_grid_item_normal, root, attachToRoot, component);
  }

  @NonNull
  public static ProjectGridItemNormalBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ProjectGridItemNormalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ProjectGridItemNormalBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.project_grid_item_normal, null, false, component);
  }

  public static ProjectGridItemNormalBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ProjectGridItemNormalBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ProjectGridItemNormalBinding)bind(component, view, com.byoutline.kickmaterial.R.layout.project_grid_item_normal);
  }
}
