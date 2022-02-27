package com.byoutline.kickmaterial.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public abstract class ToolbarWithBackBinding extends ViewDataBinding {
  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView toolbarTitleTv;

  protected ToolbarWithBackBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Toolbar toolbar, TextView toolbarTitleTv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.toolbar = toolbar;
    this.toolbarTitleTv = toolbarTitleTv;
  }

  @NonNull
  public static ToolbarWithBackBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ToolbarWithBackBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ToolbarWithBackBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.toolbar_with_back, root, attachToRoot, component);
  }

  @NonNull
  public static ToolbarWithBackBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ToolbarWithBackBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ToolbarWithBackBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.toolbar_with_back, null, false, component);
  }

  public static ToolbarWithBackBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ToolbarWithBackBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ToolbarWithBackBinding)bind(component, view, com.byoutline.kickmaterial.R.layout.toolbar_with_back);
  }
}
