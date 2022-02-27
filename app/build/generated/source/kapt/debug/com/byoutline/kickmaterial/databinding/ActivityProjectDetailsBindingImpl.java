package com.byoutline.kickmaterial.databinding;
import com.byoutline.kickmaterial.R;
import com.byoutline.kickmaterial.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityProjectDetailsBindingImpl extends ActivityProjectDetailsBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(28);
        sIncludes.setIncludes(6, 
            new String[] {"toolbar_with_back"},
            new int[] {17},
            new int[] {R.layout.toolbar_with_back});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scroll_view, 18);
        sViewsWithIds.put(R.id.scroll_view_child, 19);
        sViewsWithIds.put(R.id.read_more_btn, 20);
        sViewsWithIds.put(R.id.project_author_name_label_tv, 21);
        sViewsWithIds.put(R.id.project_comments_ll, 22);
        sViewsWithIds.put(R.id.project_updates_ll, 23);
        sViewsWithIds.put(R.id.project_photo_container, 24);
        sViewsWithIds.put(R.id.project_photo_iv, 25);
        sViewsWithIds.put(R.id.project_details_title_container, 26);
        sViewsWithIds.put(R.id.details_container, 27);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @Nullable
    private final com.byoutline.kickmaterial.databinding.ToolbarWithBackBinding mboundView6;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityProjectDetailsBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 28, sIncludes, sViewsWithIds));
    }
    private ActivityProjectDetailsBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.byoutline.secretsauce.views.RoundedImageView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.RelativeLayout) bindings[6]
            , (android.support.design.widget.FloatingActionButton) bindings[16]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[9]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.TextView) bindings[1]
            , (android.widget.LinearLayout) bindings[26]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[13]
            , (com.byoutline.kickmaterial.views.DisabledSeekBar) bindings[15]
            , (android.widget.TextView) bindings[14]
            , (android.widget.FrameLayout) bindings[24]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.TextView) bindings[20]
            , (com.byoutline.kickmaterial.features.projectdetails.ObservableScrollView) bindings[18]
            , (android.widget.FrameLayout) bindings[19]
            , (android.widget.TextView) bindings[5]
            );
        this.authorPhotoIv.setTag(null);
        this.commentsCountValueTv.setTag(null);
        this.detailsHeader.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView6 = (com.byoutline.kickmaterial.databinding.ToolbarWithBackBinding) bindings[17];
        setContainedBinding(this.mboundView6);
        this.playVideoBtn.setTag(null);
        this.projectAuthorNameTv.setTag(null);
        this.projectBackingProgress.setTag(null);
        this.projectDescriptionTv.setTag(null);
        this.projectItemBigBackersTv.setTag(null);
        this.projectItemBigDaysLeft.setTag(null);
        this.projectItemBigGatheredMoneyTv.setTag(null);
        this.projectItemBigPledgedOfTv.setTag(null);
        this.projectItemBigProgressSb.setTag(null);
        this.projectItemTimeLeftTypeTv.setTag(null);
        this.projectSubtitleTv.setTag(null);
        this.projectTitleTv.setTag(null);
        this.updatesCountValueTv.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        mboundView6.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView6.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.model == variableId) {
            setModel((com.byoutline.kickmaterial.features.projectdetails.ProjectDetailsTransitionHelper) variable);
        }
        else if (BR.project == variableId) {
            setProject((android.databinding.ObservableField<com.byoutline.kickmaterial.model.ProjectDetails>) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.byoutline.kickmaterial.features.projectdetails.ProjectDetailsTransitionHelper Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setProject(@Nullable android.databinding.ObservableField<com.byoutline.kickmaterial.model.ProjectDetails> Project) {
        updateRegistration(0, Project);
        this.mProject = Project;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.project);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable android.arch.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView6.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeProject((android.databinding.ObservableField<com.byoutline.kickmaterial.model.ProjectDetails>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeProject(android.databinding.ObservableField<com.byoutline.kickmaterial.model.ProjectDetails> Project, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String projectDesc = null;
        int projectCommentsCount = 0;
        java.lang.String projectItemBigPledgedOfTvAndroidStringPledgedOfProjectGetTotalAmount = null;
        java.lang.String projectGetProjectName = null;
        java.lang.String projectGetTimeLeftDescription = null;
        int modelProjectBackingProgressTxtId = 0;
        float projectGetTotalAmount = 0f;
        java.lang.String projectSubtitleTvAndroidStringProjectDetailsMadeByProjectAuthorName = null;
        int projectPercentProgressInt = 0;
        com.byoutline.kickmaterial.features.projectdetails.ProjectDetailsTransitionHelper model = mModel;
        java.lang.String projectGetProjectCreatorAvatar = null;
        java.lang.String stringValueOfProjectCommentsCount = null;
        java.lang.String integerToStringProjectBackers = null;
        com.byoutline.kickmaterial.model.ProjectDetails projectGet = null;
        int projectBackers = 0;
        java.lang.String projectGetGatheredAmountWithCurrency = null;
        java.lang.String projectGetAuthorName = null;
        java.lang.String projectGetTimeLeftValue = null;
        int projectUpdatesCount = 0;
        com.byoutline.kickmaterial.model.ProjectVideo projectVideo = null;
        java.lang.String stringValueOfProjectUpdatesCount = null;
        java.lang.String projectAuthorName = null;
        android.databinding.ObservableField<com.byoutline.kickmaterial.model.ProjectDetails> project = mProject;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x6L) != 0) {

                    if (model != null) {
                        // read model.projectBackingProgressTxtId
                        modelProjectBackingProgressTxtId = model.getProjectBackingProgressTxtId();
                    }
            }

                if (project != null) {
                    // read project.get()
                    projectGet = project.get();
                }

            if ((dirtyFlags & 0x5L) != 0) {

                    if (projectGet != null) {
                        // read project.get().desc
                        projectDesc = projectGet.getDesc();
                        // read project.get().commentsCount
                        projectCommentsCount = projectGet.getCommentsCount();
                        // read project.get().getProjectName()
                        projectGetProjectName = projectGet.getProjectName();
                        // read project.get().getTimeLeftDescription()
                        projectGetTimeLeftDescription = projectGet.getTimeLeftDescription();
                        // read project.get().getTotalAmount()
                        projectGetTotalAmount = projectGet.getTotalAmount();
                        // read project.get().percentProgressInt
                        projectPercentProgressInt = projectGet.getPercentProgressInt();
                        // read project.get().getProjectCreatorAvatar()
                        projectGetProjectCreatorAvatar = projectGet.getProjectCreatorAvatar();
                        // read project.get().backers
                        projectBackers = projectGet.getBackers();
                        // read project.get().getGatheredAmountWithCurrency()
                        projectGetGatheredAmountWithCurrency = projectGet.getGatheredAmountWithCurrency();
                        // read project.get().getAuthorName()
                        projectGetAuthorName = projectGet.getAuthorName();
                        // read project.get().getTimeLeftValue()
                        projectGetTimeLeftValue = projectGet.getTimeLeftValue();
                        // read project.get().updatesCount
                        projectUpdatesCount = projectGet.getUpdatesCount();
                        // read project.get().authorName
                        projectAuthorName = projectGet.getAuthorName();
                    }


                    // read String.valueOf(project.get().commentsCount)
                    stringValueOfProjectCommentsCount = java.lang.String.valueOf(projectCommentsCount);
                    // read @android:string/pledged_of
                    projectItemBigPledgedOfTvAndroidStringPledgedOfProjectGetTotalAmount = projectItemBigPledgedOfTv.getResources().getString(R.string.pledged_of, projectGetTotalAmount);
                    // read Integer.toString(project.get().backers)
                    integerToStringProjectBackers = java.lang.Integer.toString(projectBackers);
                    // read String.valueOf(project.get().updatesCount)
                    stringValueOfProjectUpdatesCount = java.lang.String.valueOf(projectUpdatesCount);
                    // read @android:string/project_details_made_by
                    projectSubtitleTvAndroidStringProjectDetailsMadeByProjectAuthorName = projectSubtitleTv.getResources().getString(R.string.project_details_made_by, projectAuthorName);
            }

                if (projectGet != null) {
                    // read project.get().video
                    projectVideo = projectGet.getVideo();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.byoutline.kickmaterial.utils.BindingAdaptersKt.loadImage(this.authorPhotoIv, projectGetProjectCreatorAvatar, getDrawableFromResource(authorPhotoIv, R.drawable.avatar_placeholder));
            android.databinding.adapters.TextViewBindingAdapter.setText(this.commentsCountValueTv, stringValueOfProjectCommentsCount);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.projectAuthorNameTv, projectGetAuthorName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.projectDescriptionTv, projectDesc);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.projectItemBigBackersTv, integerToStringProjectBackers);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.projectItemBigDaysLeft, projectGetTimeLeftValue);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.projectItemBigGatheredMoneyTv, projectGetGatheredAmountWithCurrency);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.projectItemBigPledgedOfTv, projectItemBigPledgedOfTvAndroidStringPledgedOfProjectGetTotalAmount);
            android.databinding.adapters.SeekBarBindingAdapter.setProgress(this.projectItemBigProgressSb, projectPercentProgressInt);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.projectItemTimeLeftTypeTv, projectGetTimeLeftDescription);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.projectSubtitleTv, projectSubtitleTvAndroidStringProjectDetailsMadeByProjectAuthorName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.projectTitleTv, projectGetProjectName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.updatesCountValueTv, stringValueOfProjectUpdatesCount);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.byoutline.kickmaterial.features.projectdetails.VideoAlphaAnimatorKt.animateVideoBtn(this.playVideoBtn, projectVideo, model);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.projectBackingProgress.setText(modelProjectBackingProgressTxtId);
        }
        executeBindingsOn(mboundView6);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): project
        flag 1 (0x2L): model
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}