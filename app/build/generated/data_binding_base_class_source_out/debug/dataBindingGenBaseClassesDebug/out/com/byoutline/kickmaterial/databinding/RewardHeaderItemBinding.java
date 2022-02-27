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
import com.byoutline.kickmaterial.features.rewardlist.RewardHeader;

public abstract class RewardHeaderItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView rewardHeaderTv;

  @Bindable
  protected RewardHeader mHeader;

  protected RewardHeaderItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView rewardHeaderTv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.rewardHeaderTv = rewardHeaderTv;
  }

  public abstract void setHeader(@Nullable RewardHeader header);

  @Nullable
  public RewardHeader getHeader() {
    return mHeader;
  }

  @NonNull
  public static RewardHeaderItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static RewardHeaderItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<RewardHeaderItemBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.reward_header_item, root, attachToRoot, component);
  }

  @NonNull
  public static RewardHeaderItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static RewardHeaderItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<RewardHeaderItemBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.reward_header_item, null, false, component);
  }

  public static RewardHeaderItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static RewardHeaderItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (RewardHeaderItemBinding)bind(component, view, com.byoutline.kickmaterial.R.layout.reward_header_item);
  }
}
