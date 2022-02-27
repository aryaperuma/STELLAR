package com.byoutline.kickmaterial.databinding;
import com.byoutline.kickmaterial.R;
import com.byoutline.kickmaterial.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ProjectGridItemBigBindingImpl extends ProjectGridItemBigBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(8);
        sIncludes.setIncludes(1, 
            new String[] {"project_grid_item_photo"},
            new int[] {6},
            new int[] {R.layout.project_grid_item_photo});
        sIncludes.setIncludes(2, 
            new String[] {"project_number_details"},
            new int[] {7},
            new int[] {R.layout.project_number_details});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.support.v7.widget.CardView mboundView0;
    @NonNull
    private final android.widget.FrameLayout mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    // variables
    // values
    // listeners
    private RunnableImpl mViewModelOnClickJavaLangRunnable;
    // Inverse Binding Event Handlers

    public ProjectGridItemBigBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ProjectGridItemBigBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.byoutline.kickmaterial.databinding.ProjectNumberDetailsBinding) bindings[7]
            , (com.byoutline.kickmaterial.databinding.ProjectGridItemPhotoBinding) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (com.byoutline.kickmaterial.views.DisabledSeekBar) bindings[5]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (android.support.v7.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.FrameLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.projectItemBigDescTv.setTag(null);
        this.projectItemBigProgressSb.setTag(null);
        this.projectItemBigTitleTv.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        photoLayout.invalidateAll();
        numberDetailsLayout.invalidateAll();
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
        if (numberDetailsLayout.hasPendingBindings()) {
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
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable android.arch.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        photoLayout.setLifecycleOwner(lifecycleOwner);
        numberDetailsLayout.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeNumberDetailsLayout((com.byoutline.kickmaterial.databinding.ProjectNumberDetailsBinding) object, fieldId);
            case 1 :
                return onChangePhotoLayout((com.byoutline.kickmaterial.databinding.ProjectGridItemPhotoBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeNumberDetailsLayout(com.byoutline.kickmaterial.databinding.ProjectNumberDetailsBinding NumberDetailsLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePhotoLayout(com.byoutline.kickmaterial.databinding.ProjectGridItemPhotoBinding PhotoLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        java.lang.String viewModelProjectDesc = null;
        int viewModelPercentProgress = 0;
        com.byoutline.kickmaterial.features.projectlist.ProjectItemViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xcL) != 0) {



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
                    // read viewModel.project.desc
                    viewModelProjectDesc = viewModelProject.getDesc();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            com.byoutline.secretsauce.databinding.BindingAdapters.onClick(this.mboundView0, viewModelOnClickJavaLangRunnable);
            this.numberDetailsLayout.setViewModel(viewModel);
            this.photoLayout.setViewModel(viewModel);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.projectItemBigDescTv, viewModelProjectDesc);
            this.projectItemBigProgressSb.setProgress(viewModelPercentProgress);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.projectItemBigTitleTv, viewModelProjectProjectName);
        }
        executeBindingsOn(photoLayout);
        executeBindingsOn(numberDetailsLayout);
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
        flag 0 (0x1L): numberDetailsLayout
        flag 1 (0x2L): photoLayout
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}