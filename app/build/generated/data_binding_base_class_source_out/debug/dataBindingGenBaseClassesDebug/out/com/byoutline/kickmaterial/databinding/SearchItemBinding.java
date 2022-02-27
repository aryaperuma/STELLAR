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
import android.widget.ImageView;
import android.widget.TextView;
import com.byoutline.kickmaterial.features.search.SearchItemViewModel;

public abstract class SearchItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView searchItemDescTv;

  @NonNull
  public final ImageView searchItemPhotoIv;

  @NonNull
  public final TextView searchItemTitleTv;

  @Bindable
  protected SearchItemViewModel mViewModel;

  protected SearchItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView searchItemDescTv, ImageView searchItemPhotoIv,
      TextView searchItemTitleTv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.searchItemDescTv = searchItemDescTv;
    this.searchItemPhotoIv = searchItemPhotoIv;
    this.searchItemTitleTv = searchItemTitleTv;
  }

  public abstract void setViewModel(@Nullable SearchItemViewModel viewModel);

  @Nullable
  public SearchItemViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static SearchItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SearchItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SearchItemBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.search_item, root, attachToRoot, component);
  }

  @NonNull
  public static SearchItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SearchItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SearchItemBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.search_item, null, false, component);
  }

  public static SearchItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SearchItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SearchItemBinding)bind(component, view, com.byoutline.kickmaterial.R.layout.search_item);
  }
}
