package com.byoutline.kickmaterial.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.byoutline.kickmaterial.features.search.SearchViewModel;

public abstract class FragmentSearchResultsBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView searchRecyclerView;

  @Bindable
  protected SearchViewModel mViewModel;

  protected FragmentSearchResultsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RecyclerView searchRecyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.searchRecyclerView = searchRecyclerView;
  }

  public abstract void setViewModel(@Nullable SearchViewModel viewModel);

  @Nullable
  public SearchViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentSearchResultsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentSearchResultsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentSearchResultsBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.fragment_search_results, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSearchResultsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentSearchResultsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentSearchResultsBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.fragment_search_results, null, false, component);
  }

  public static FragmentSearchResultsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentSearchResultsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentSearchResultsBinding)bind(component, view, com.byoutline.kickmaterial.R.layout.fragment_search_results);
  }
}
