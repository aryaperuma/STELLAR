package com.byoutline.kickmaterial.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class ProjectsListHeaderBinding extends ViewDataBinding {
  protected ProjectsListHeaderBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  @NonNull
  public static ProjectsListHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ProjectsListHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ProjectsListHeaderBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.projects_list_header, root, attachToRoot, component);
  }

  @NonNull
  public static ProjectsListHeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ProjectsListHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ProjectsListHeaderBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.projects_list_header, null, false, component);
  }

  public static ProjectsListHeaderBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ProjectsListHeaderBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ProjectsListHeaderBinding)bind(component, view, com.byoutline.kickmaterial.R.layout.projects_list_header);
  }
}
