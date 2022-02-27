package com.byoutline.kickmaterial.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

public abstract class ActivityVideoBinding extends ViewDataBinding {
  @NonNull
  public final VideoView videoView;

  protected ActivityVideoBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, VideoView videoView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.videoView = videoView;
  }

  @NonNull
  public static ActivityVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityVideoBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.activity_video, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityVideoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityVideoBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.activity_video, null, false, component);
  }

  public static ActivityVideoBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityVideoBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityVideoBinding)bind(component, view, com.byoutline.kickmaterial.R.layout.activity_video);
  }
}
