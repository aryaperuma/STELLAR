package com.byoutline.kickmaterial.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableField;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.byoutline.kickmaterial.features.projectdetails.ObservableScrollView;
import com.byoutline.kickmaterial.features.projectdetails.ProjectDetailsTransitionHelper;
import com.byoutline.kickmaterial.model.ProjectDetails;
import com.byoutline.kickmaterial.views.DisabledSeekBar;
import com.byoutline.secretsauce.views.RoundedImageView;

public abstract class ActivityProjectDetailsBinding extends ViewDataBinding {
  @NonNull
  public final RoundedImageView authorPhotoIv;

  @NonNull
  public final TextView commentsCountValueTv;

  @NonNull
  public final LinearLayout detailsContainer;

  @NonNull
  public final RelativeLayout detailsHeader;

  @NonNull
  public final FloatingActionButton playVideoBtn;

  @NonNull
  public final TextView projectAuthorNameLabelTv;

  @NonNull
  public final TextView projectAuthorNameTv;

  @NonNull
  public final TextView projectBackingProgress;

  @NonNull
  public final LinearLayout projectCommentsLl;

  @NonNull
  public final TextView projectDescriptionTv;

  @NonNull
  public final LinearLayout projectDetailsTitleContainer;

  @NonNull
  public final TextView projectItemBigBackersTv;

  @NonNull
  public final TextView projectItemBigDaysLeft;

  @NonNull
  public final TextView projectItemBigGatheredMoneyTv;

  @NonNull
  public final TextView projectItemBigPledgedOfTv;

  @NonNull
  public final DisabledSeekBar projectItemBigProgressSb;

  @NonNull
  public final TextView projectItemTimeLeftTypeTv;

  @NonNull
  public final FrameLayout projectPhotoContainer;

  @NonNull
  public final ImageView projectPhotoIv;

  @NonNull
  public final TextView projectSubtitleTv;

  @NonNull
  public final TextView projectTitleTv;

  @NonNull
  public final LinearLayout projectUpdatesLl;

  @NonNull
  public final TextView readMoreBtn;

  @NonNull
  public final ObservableScrollView scrollView;

  @NonNull
  public final FrameLayout scrollViewChild;

  @NonNull
  public final TextView updatesCountValueTv;

  @Bindable
  protected ObservableField<ProjectDetails> mProject;

  @Bindable
  protected ProjectDetailsTransitionHelper mModel;

  protected ActivityProjectDetailsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RoundedImageView authorPhotoIv, TextView commentsCountValueTv,
      LinearLayout detailsContainer, RelativeLayout detailsHeader,
      FloatingActionButton playVideoBtn, TextView projectAuthorNameLabelTv,
      TextView projectAuthorNameTv, TextView projectBackingProgress, LinearLayout projectCommentsLl,
      TextView projectDescriptionTv, LinearLayout projectDetailsTitleContainer,
      TextView projectItemBigBackersTv, TextView projectItemBigDaysLeft,
      TextView projectItemBigGatheredMoneyTv, TextView projectItemBigPledgedOfTv,
      DisabledSeekBar projectItemBigProgressSb, TextView projectItemTimeLeftTypeTv,
      FrameLayout projectPhotoContainer, ImageView projectPhotoIv, TextView projectSubtitleTv,
      TextView projectTitleTv, LinearLayout projectUpdatesLl, TextView readMoreBtn,
      ObservableScrollView scrollView, FrameLayout scrollViewChild, TextView updatesCountValueTv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.authorPhotoIv = authorPhotoIv;
    this.commentsCountValueTv = commentsCountValueTv;
    this.detailsContainer = detailsContainer;
    this.detailsHeader = detailsHeader;
    this.playVideoBtn = playVideoBtn;
    this.projectAuthorNameLabelTv = projectAuthorNameLabelTv;
    this.projectAuthorNameTv = projectAuthorNameTv;
    this.projectBackingProgress = projectBackingProgress;
    this.projectCommentsLl = projectCommentsLl;
    this.projectDescriptionTv = projectDescriptionTv;
    this.projectDetailsTitleContainer = projectDetailsTitleContainer;
    this.projectItemBigBackersTv = projectItemBigBackersTv;
    this.projectItemBigDaysLeft = projectItemBigDaysLeft;
    this.projectItemBigGatheredMoneyTv = projectItemBigGatheredMoneyTv;
    this.projectItemBigPledgedOfTv = projectItemBigPledgedOfTv;
    this.projectItemBigProgressSb = projectItemBigProgressSb;
    this.projectItemTimeLeftTypeTv = projectItemTimeLeftTypeTv;
    this.projectPhotoContainer = projectPhotoContainer;
    this.projectPhotoIv = projectPhotoIv;
    this.projectSubtitleTv = projectSubtitleTv;
    this.projectTitleTv = projectTitleTv;
    this.projectUpdatesLl = projectUpdatesLl;
    this.readMoreBtn = readMoreBtn;
    this.scrollView = scrollView;
    this.scrollViewChild = scrollViewChild;
    this.updatesCountValueTv = updatesCountValueTv;
  }

  public abstract void setProject(@Nullable ObservableField<ProjectDetails> project);

  @Nullable
  public ObservableField<ProjectDetails> getProject() {
    return mProject;
  }

  public abstract void setModel(@Nullable ProjectDetailsTransitionHelper model);

  @Nullable
  public ProjectDetailsTransitionHelper getModel() {
    return mModel;
  }

  @NonNull
  public static ActivityProjectDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityProjectDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityProjectDetailsBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.activity_project_details, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityProjectDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityProjectDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityProjectDetailsBinding>inflate(inflater, com.byoutline.kickmaterial.R.layout.activity_project_details, null, false, component);
  }

  public static ActivityProjectDetailsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityProjectDetailsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityProjectDetailsBinding)bind(component, view, com.byoutline.kickmaterial.R.layout.activity_project_details);
  }
}
