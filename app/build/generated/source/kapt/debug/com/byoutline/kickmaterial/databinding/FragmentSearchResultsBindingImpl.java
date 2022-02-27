package com.byoutline.kickmaterial.databinding;
import com.byoutline.kickmaterial.R;
import com.byoutline.kickmaterial.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSearchResultsBindingImpl extends FragmentSearchResultsBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSearchResultsBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }
    private FragmentSearchResultsBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.support.v7.widget.RecyclerView) bindings[0]
            );
        this.searchRecyclerView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setViewModel((com.byoutline.kickmaterial.features.search.SearchViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.byoutline.kickmaterial.features.search.SearchViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelItems((me.tatarka.bindingcollectionadapter2.collections.DiffObservableList<com.byoutline.kickmaterial.features.search.SearchItemViewModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelItems(me.tatarka.bindingcollectionadapter2.collections.DiffObservableList<com.byoutline.kickmaterial.features.search.SearchItemViewModel> ViewModelItems, int fieldId) {
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
        me.tatarka.bindingcollectionadapter2.ItemBinding<com.byoutline.kickmaterial.features.search.SearchItemViewModel> viewModelItemBinding = null;
        com.byoutline.kickmaterial.features.projectlist.ProjectListAdapter<com.byoutline.kickmaterial.features.search.SearchItemViewModel> viewModelAdapter = null;
        me.tatarka.bindingcollectionadapter2.collections.DiffObservableList<com.byoutline.kickmaterial.features.search.SearchItemViewModel> viewModelItems = null;
        com.byoutline.kickmaterial.features.search.SearchViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.itemBinding
                    viewModelItemBinding = viewModel.getItemBinding();
                    // read viewModel.adapter
                    viewModelAdapter = viewModel.getAdapter();
                    // read viewModel.items
                    viewModelItems = viewModel.getItems();
                }
                updateRegistration(0, viewModelItems);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapters.setLayoutManager(this.searchRecyclerView, me.tatarka.bindingcollectionadapter2.LayoutManagers.linear());
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapters.setAdapter(this.searchRecyclerView, viewModelItemBinding, viewModelItems, viewModelAdapter, (me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter.ItemIds)null, (me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter.ViewHolderFactory)null);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.items
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}