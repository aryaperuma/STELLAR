package com.byoutline.kickmaterial.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.byoutline.kickmaterial.features.projectlist.ProjectListViewModel;

public abstract class FragmentProjectsBinding extends ViewDataBinding {
  @NonNull
  public final ImageView bubblesIv;

  @NonNull
  public final CoordinatorLayout mainParentRl;

  @NonNull
  public final RecyclerView projectRecyclerView;

  @NonNull
  public final FloatingActionButton showCategoriesFab;

  @NonNull
  public final SwipeRefreshLayout swipeRefreshProjectsSrl;

  @Bindable
  protected ProjectListViewModel mViewModel;

  protected FragmentProjectsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView bubblesIv, CoordinatorLayout mainParentRl,
      RecyclerView projectRecyclerView, FloatingActionButton showCategoriesFab,
      SwipeRefreshLayout swipeRefreshProjectsSrl) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bubblesIv = bubblesIv;
    this.mainParentRl = mainParentRl;
    this.projectRecyclerView = projectRecyclerView;
    this.showCategoriesFab = showCategoriesFab;
    this.swipeRefreshProjectsSrl = swipeRefreshProjectsSrl;
  }

  public abstract void setViewModel(@Nullable ProjectListViewModel viewModel);

  @Nullable
  public ProjectListViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentProjectsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentProjectsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentProjectsBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.fragment_projects, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentProjectsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentProjectsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentProjectsBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.fragment_projects, null, false, component);
  }

  public static FragmentProjectsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentProjectsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentProjectsBinding)bind(component, view, com.byoutline.kickmaterial.R.layout.fragment_projects);
  }
}
