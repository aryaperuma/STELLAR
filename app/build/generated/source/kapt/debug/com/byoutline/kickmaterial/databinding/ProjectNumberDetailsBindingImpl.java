package com.byoutline.kickmaterial.databinding;
import com.byoutline.kickmaterial.R;
import com.byoutline.kickmaterial.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ProjectNumberDetailsBindingImpl extends ProjectNumberDetailsBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.project_item_big_backers_label_tv, 7);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ProjectNumberDetailsBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View[] root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ProjectNumberDetailsBindingImpl(android.databinding.DataBindingComponent bindingComponent, View[] root, Object[] bindings) {
        super(bindingComponent, root[0], 0
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.projectItemBigBackersTv.setTag(null);
        this.projectItemBigDaysLeft.setTag(null);
        this.projectItemBigGatheredMoneyTv.setTag(null);
        this.projectItemBigPledgedOfTv.setTag(null);
        this.projectItemTimeLeftTypeTv.setTag(null);
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
        java.lang.String viewModelGetTimeLeftDescription = null;
        java.lang.String projectItemBigGatheredMoneyTvAndroidStringGatheredFormatViewModelProjectGetGatheredAmount = null;
        java.lang.String projectItemTimeLeftTypeTvAndroidStringDaysLeftViewModelGetTimeLeftDescription = null;
        java.lang.String projectItemBigPledgedOfTvAndroidStringPledgedOfViewModelProjectGetTotalAmount = null;
        float viewModelProjectGetTotalAmount = 0f;
        int viewModelProjectBackers = 0;
        float viewModelProjectGetGatheredAmount = 0f;
        com.byoutline.kickmaterial.model.ProjectTime viewModelGetTimeLeft = null;
        com.byoutline.kickmaterial.model.Project viewModelProject = null;
        java.lang.String viewModelGetTimeLeftValue = null;
        java.lang.String integerToStringViewModelProjectBackers = null;
        com.byoutline.kickmaterial.features.projectlist.ProjectItemViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.getTimeLeft()
                    viewModelGetTimeLeft = viewModel.getTimeLeft();
                    // read viewModel.project
                    viewModelProject = viewModel.getProject();
                }


                if (viewModelGetTimeLeft != null) {
                    // read viewModel.getTimeLeft().description
                    viewModelGetTimeLeftDescription = viewModelGetTimeLeft.getDescription();
                    // read viewModel.getTimeLeft().value
                    viewModelGetTimeLeftValue = viewModelGetTimeLeft.getValue();
                }
                if (viewModelProject != null) {
                    // read viewModel.project.getTotalAmount()
                    viewModelProjectGetTotalAmount = viewModelProject.getTotalAmount();
                    // read viewModel.project.backers
                    viewModelProjectBackers = viewModelProject.getBackers();
                    // read viewModel.project.getGatheredAmount()
                    viewModelProjectGetGatheredAmount = viewModelProject.getGatheredAmount();
                }


                // read @android:string/days_left
                projectItemTimeLeftTypeTvAndroidStringDaysLeftViewModelGetTimeLeftDescription = projectItemTimeLeftTypeTv.getResources().getString(R.string.days_left, viewModelGetTimeLeftDescription);
                // read @android:string/pledged_of
                projectItemBigPledgedOfTvAndroidStringPledgedOfViewModelProjectGetTotalAmount = projectItemBigPledgedOfTv.getResources().getString(R.string.pledged_of, viewModelProjectGetTotalAmount);
                // read Integer.toString(viewModel.project.backers)
                integerToStringViewModelProjectBackers = java.lang.Integer.toString(viewModelProjectBackers);
                // read @android:string/gathered_format
                projectItemBigGatheredMoneyTvAndroidStringGatheredFormatViewModelProjectGetGatheredAmount = projectItemBigGatheredMoneyTv.getResources().getString(R.string.gathered_format, viewModelProjectGetGatheredAmount);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.projectItemBigBackersTv, integerToStringViewModelProjectBackers);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.projectItemBigDaysLeft, viewModelGetTimeLeftValue);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.projectItemBigGatheredMoneyTv, projectItemBigGatheredMoneyTvAndroidStringGatheredFormatViewModelProjectGetGatheredAmount);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.projectItemBigPledgedOfTv, projectItemBigPledgedOfTvAndroidStringPledgedOfViewModelProjectGetTotalAmount);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.projectItemTimeLeftTypeTv, projectItemTimeLeftTypeTvAndroidStringDaysLeftViewModelGetTimeLeftDescription);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}