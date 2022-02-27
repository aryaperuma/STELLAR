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
import android.widget.TextView;
import com.byoutline.kickmaterial.features.rewardlist.RewardClickListener;
import com.byoutline.kickmaterial.model.Reward;

public abstract class RewardListItemBinding extends ViewDataBinding {
  @NonNull
  public final CardView rewardContainerCv;

  @NonNull
  public final TextView rewardItemAmountTv;

  @NonNull
  public final TextView rewardItemCurrencyTv;

  @NonNull
  public final TextView rewardItemDescTv;

  @NonNull
  public final TextView rewardItemTypeTv;

  @Bindable
  protected Reward mReward;

  @Bindable
  protected int mBgColor;

  @Bindable
  protected RewardClickListener mRewardClickListener;

  protected RewardListItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, CardView rewardContainerCv, TextView rewardItemAmountTv,
      TextView rewardItemCurrencyTv, TextView rewardItemDescTv, TextView rewardItemTypeTv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.rewardContainerCv = rewardContainerCv;
    this.rewardItemAmountTv = rewardItemAmountTv;
    this.rewardItemCurrencyTv = rewardItemCurrencyTv;
    this.rewardItemDescTv = rewardItemDescTv;
    this.rewardItemTypeTv = rewardItemTypeTv;
  }

  public abstract void setReward(@Nullable Reward reward);

  @Nullable
  public Reward getReward() {
    return mReward;
  }

  public abstract void setBgColor(int bgColor);

  public int getBgColor() {
    return mBgColor;
  }

  public abstract void setRewardClickListener(@Nullable RewardClickListener rewardClickListener);

  @Nullable
  public RewardClickListener getRewardClickListener() {
    return mRewardClickListener;
  }

  @NonNull
  public static RewardListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static RewardListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<RewardListItemBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.reward_list_item, root, attachToRoot, component);
  }

  @NonNull
  public static RewardListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static RewardListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<RewardListItemBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.reward_list_item, null, false, component);
  }

  public static RewardListItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static RewardListItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (RewardListItemBinding)bind(component, view, com.byoutline.kickmaterial.R.layout.reward_list_item);
  }
}
