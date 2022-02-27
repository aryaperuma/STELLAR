package com.byoutline.kickmaterial.databinding;
import com.byoutline.kickmaterial.R;
import com.byoutline.kickmaterial.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SearchItemBindingImpl extends SearchItemBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.support.v7.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    private RunnableImpl mViewModelOnClickJavaLangRunnable;
    // Inverse Binding Event Handlers

    public SearchItemBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private SearchItemBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (android.support.v7.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.searchItemDescTv.setTag(null);
        this.searchItemPhotoIv.setTag(null);
        this.searchItemTitleTv.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.byoutline.kickmaterial.features.search.SearchItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.byoutline.kickmaterial.features.search.SearchItemViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String viewModelProjectPhotoUrl = null;
        java.lang.Runnable viewModelOnClickJavaLangRunnable = null;
        java.lang.String viewModelProjectProjectName = null;
        com.byoutline.kickmaterial.model.Project viewModelProject = null;
        java.lang.String viewModelProjectDesc = null;
        com.byoutline.kickmaterial.features.search.SearchItemViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel::onClick
                    viewModelOnClickJavaLangRunnable = (((mViewModelOnClickJavaLangRunnable == null) ? (mViewModelOnClickJavaLangRunnable = new RunnableImpl()) : mViewModelOnClickJavaLangRunnable).setValue(viewModel));
                    // read viewModel.project
                    viewModelProject = viewModel.getProject();
                }


                if (viewModelProject != null) {
                    // read viewModel.project.photoUrl
                    viewModelProjectPhotoUrl = viewModelProject.getPhotoUrl();
                    // read viewModel.project.projectName
                    viewModelProjectProjectName = viewModelProject.getProjectName();
                    // read viewModel.project.desc
                    viewModelProjectDesc = viewModelProject.getDesc();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.byoutline.secretsauce.databinding.BindingAdapters.onClick(this.mboundView0, viewModelOnClickJavaLangRunnable);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.searchItemDescTv, viewModelProjectDesc);
            com.byoutline.kickmaterial.utils.BindingAdaptersKt.loadImage(this.searchItemPhotoIv, viewModelProjectPhotoUrl);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.searchItemTitleTv, viewModelProjectProjectName);
        }
    }
    // Listener Stub Implementations
    public static class RunnableImpl implements java.lang.Runnable{
        private com.byoutline.kickmaterial.features.search.SearchItemViewModel value;
        public RunnableImpl setValue(com.byoutline.kickmaterial.features.search.SearchItemViewModel value) {
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
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}