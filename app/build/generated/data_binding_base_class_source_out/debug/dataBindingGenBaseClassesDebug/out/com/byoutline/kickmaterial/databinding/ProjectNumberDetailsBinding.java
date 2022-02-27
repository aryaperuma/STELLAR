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

public abstract class ProjectNumberDetailsBinding extends ViewDataBinding {
  @NonNull
  public final TextView projectItemBigBackersLabelTv;

  @NonNull
  public final TextView projectItemBigBackersTv;

  @NonNull
  public final TextView projectItemBigDaysLeft;

  @NonNull
  public final TextView projectItemBigGatheredMoneyTv;

  @NonNull
  public final TextView projectItemBigPledgedOfTv;

  @NonNull
  public final TextView projectItemTimeLeftTypeTv;

  @Bindable
  protected ProjectItemViewModel mViewModel;

  protected ProjectNumberDetailsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView projectItemBigBackersLabelTv, TextView projectItemBigBackersTv,
      TextView projectItemBigDaysLeft, TextView projectItemBigGatheredMoneyTv,
      TextView projectItemBigPledgedOfTv, TextView projectItemTimeLeftTypeTv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.projectItemBigBackersLabelTv = projectItemBigBackersLabelTv;
    this.projectItemBigBackersTv = projectItemBigBackersTv;
    this.projectItemBigDaysLeft = projectItemBigDaysLeft;
    this.projectItemBigGatheredMoneyTv = projectItemBigGatheredMoneyTv;
    this.projectItemBigPledgedOfTv = projectItemBigPledgedOfTv;
    this.projectItemTimeLeftTypeTv = projectItemTimeLeftTypeTv;
  }

  public abstract void setViewModel(@Nullable ProjectItemViewModel viewModel);

  @Nullable
  public ProjectItemViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ProjectNumberDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ProjectNumberDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ProjectNumberDetailsBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.project_number_details, root, attachToRoot, component);
  }

  @NonNull
  public static ProjectNumberDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ProjectNumberDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ProjectNumberDetailsBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.project_number_details, null, false, component);
  }

  public static ProjectNumberDetailsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ProjectNumberDetailsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ProjectNumberDetailsBinding)bind(component, view, com.byoutline.kickmaterial.R.layout.project_number_details);
  }
}
