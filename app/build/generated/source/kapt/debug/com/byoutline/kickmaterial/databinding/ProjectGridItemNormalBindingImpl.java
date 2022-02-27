package com.byoutline.kickmaterial.databinding;
import com.byoutline.kickmaterial.R;
import com.byoutline.kickmaterial.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ProjectGridItemNormalBindingImpl extends ProjectGridItemNormalBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(5);
        sIncludes.setIncludes(1, 
            new String[] {"project_grid_item_photo"},
            new int[] {4},
            new int[] {R.layout.project_grid_item_photo});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.support.v7.widget.CardView mboundView0;
    @NonNull
    private final android.widget.FrameLayout mboundView1;
    // variables
    // values
    // listeners
    private RunnableImpl mViewModelOnClickJavaLangRunnable;
    // Inverse Binding Event Handlers

    public ProjectGridItemNormalBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ProjectGridItemNormalBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.byoutline.kickmaterial.databinding.ProjectGridItemPhotoBinding) bindings[4]
            , (com.byoutline.kickmaterial.views.DisabledSeekBar) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (android.support.v7.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.FrameLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.projectItemBigProgressSb.setTag(null);
        this.projectItemBigTitleTv.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        photoLayout.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (photoLayout.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.byoutline.kickmaterial.features.projectlist.ProjectItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.byoutline.kickmaterial.features.projectlist.ProjectItemViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable android.arch.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        photoLayout.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangePhotoLayout((com.byoutline.kickmaterial.databinding.ProjectGridItemPhotoBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangePhotoLayout(com.byoutline.kickmaterial.databinding.ProjectGridItemPhotoBinding PhotoLayout, int fieldId) {
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
        java.lang.Runnable viewModelOnClickJavaLangRunnable = null;
        java.lang.String viewModelProjectProjectName = null;
        com.byoutline.kickmaterial.model.Project viewModelProject = null;
        int viewModelPercentProgress = 0;
        com.byoutline.kickmaterial.features.projectlist.ProjectItemViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x6L) != 0) {



                if (viewModel != null) {
                    // read viewModel::onClick
                    viewModelOnClickJavaLangRunnable = (((mViewModelOnClickJavaLangRunnable == null) ? (mViewModelOnClickJavaLangRunnable = new RunnableImpl()) : mViewModelOnClickJavaLangRunnable).setValue(viewModel));
                    // read viewModel.project
                    viewModelProject = viewModel.getProject();
                    // read viewModel.percentProgress
                    viewModelPercentProgress = viewModel.getPercentProgress();
                }


                if (viewModelProject != null) {
                    // read viewModel.project.projectName
                    viewModelProjectProjectName = viewModelProject.getProjectName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.byoutline.secretsauce.databinding.BindingAdapters.onClick(this.mboundView0, viewModelOnClickJavaLangRunnable);
            this.photoLayout.setViewModel(viewModel);
            this.projectItemBigProgressSb.setProgress(viewModelPercentProgress);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.projectItemBigTitleTv, viewModelProjectProjectName);
        }
        executeBindingsOn(photoLayout);
    }
    // Listener Stub Implementations
    public static class RunnableImpl implements java.lang.Runnable{
        private com.byoutline.kickmaterial.features.projectlist.ProjectItemViewModel value;
        public RunnableImpl setValue(com.byoutline.kickmaterial.features.projectlist.ProjectItemViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void run() {
            this.value.onClick(); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): photoLayout
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}