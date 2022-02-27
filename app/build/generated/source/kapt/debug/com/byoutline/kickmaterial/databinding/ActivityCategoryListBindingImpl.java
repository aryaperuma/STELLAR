package com.byoutline.kickmaterial.databinding;
import com.byoutline.kickmaterial.R;
import com.byoutline.kickmaterial.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCategoryListBindingImpl extends ActivityCategoryListBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 2);
        sViewsWithIds.put(R.id.circle_image_container, 3);
        sViewsWithIds.put(R.id.category_circle_iv, 4);
        sViewsWithIds.put(R.id.category_circle_reveal_iv, 5);
        sViewsWithIds.put(R.id.selected_category_iv, 6);
        sViewsWithIds.put(R.id.categories_header_ll, 7);
        sViewsWithIds.put(R.id.close_categories_iv, 8);
        sViewsWithIds.put(R.id.select_category_tv, 9);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCategoryListBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityCategoryListBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.LinearLayout) bindings[7]
            , (android.support.v7.widget.RecyclerView) bindings[1]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.FrameLayout) bindings[3]
            , (android.support.design.widget.FloatingActionButton) bindings[8]
            , (android.widget.FrameLayout) bindings[0]
            , (android.widget.TextView) bindings[9]
            , (com.byoutline.secretsauce.views.RoundedImageView) bindings[6]
            , (android.support.v7.widget.Toolbar) bindings[2]
            );
        this.categoriesRv.setTag(null);
        this.drawerLayout.setTag(null);
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
            setViewModel((com.byoutline.kickmaterial.features.selectcategory.CategoriesListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.byoutline.kickmaterial.features.selectcategory.CategoriesListViewModel ViewModel) {
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
                return onChangeViewModelItems((android.databinding.ObservableArrayList<com.byoutline.kickmaterial.model.Category>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelItems(android.databinding.ObservableArrayList<com.byoutline.kickmaterial.model.Category> ViewModelItems, int fieldId) {
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
        me.tatarka.bindingcollectionadapter2.ItemBinding<com.byoutline.kickmaterial.model.Category> viewModelItemBinding = null;
        android.databinding.ObservableArrayList<com.byoutline.kickmaterial.model.Category> viewModelItems = null;
        com.byoutline.kickmaterial.features.selectcategory.CategoriesListViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.itemBinding
                    viewModelItemBinding = viewModel.getItemBinding();
                    // read viewModel.items
                    viewModelItems = viewModel.getItems();
                }
                updateRegistration(0, viewModelItems);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapters.setLayoutManager(this.categoriesRv, me.tatarka.bindingcollectionadapter2.LayoutManagers.linear());
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapters.setAdapter(this.categoriesRv, viewModelItemBinding, viewModelItems, (me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter)null, (me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter.ItemIds)null, (me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter.ViewHolderFactory)null);
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