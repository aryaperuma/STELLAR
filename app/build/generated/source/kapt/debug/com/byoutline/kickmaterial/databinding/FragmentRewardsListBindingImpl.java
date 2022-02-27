package com.byoutline.kickmaterial.databinding;
import com.byoutline.kickmaterial.R;
import com.byoutline.kickmaterial.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRewardsListBindingImpl extends FragmentRewardsListBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rewards_list_image_container, 2);
        sViewsWithIds.put(R.id.category_circle_iv, 3);
        sViewsWithIds.put(R.id.selected_category_iv, 4);
        sViewsWithIds.put(R.id.category_circle_reveal_iv, 5);
        sViewsWithIds.put(R.id.categories_header_ll, 6);
        sViewsWithIds.put(R.id.close_categories_iv, 7);
        sViewsWithIds.put(R.id.select_category_tv, 8);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRewardsListBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentRewardsListBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.LinearLayout) bindings[6]
            , (android.support.v7.widget.RecyclerView) bindings[1]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[5]
            , (android.support.design.widget.FloatingActionButton) bindings[7]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.FrameLayout) bindings[2]
            , (android.widget.TextView) bindings[8]
            , (com.byoutline.secretsauce.views.RoundedImageView) bindings[4]
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
        if (BR.model == variableId) {
            setModel((com.byoutline.kickmaterial.features.rewardlist.RewardListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.byoutline.kickmaterial.features.rewardlist.RewardListViewModel Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeModelItems((android.databinding.ObservableArrayList<com.byoutline.kickmaterial.model.RewardItem>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeModelItems(android.databinding.ObservableArrayList<com.byoutline.kickmaterial.model.RewardItem> ModelItems, int fieldId) {
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
        me.tatarka.bindingcollectionadapter2.ItemBinding<com.byoutline.kickmaterial.model.RewardItem> modelItemBinding = null;
        com.byoutline.kickmaterial.features.rewardlist.RewardListViewModel model = mModel;
        android.databinding.ObservableArrayList<com.byoutline.kickmaterial.model.RewardItem> modelItems = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (model != null) {
                    // read model.itemBinding
                    modelItemBinding = model.getItemBinding();
                    // read model.items
                    modelItems = model.getItems();
                }
                updateRegistration(0, modelItems);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapters.setLayoutManager(this.categoriesRv, me.tatarka.bindingcollectionadapter2.LayoutManagers.linear());
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapters.setAdapter(this.categoriesRv, modelItemBinding, modelItems, (me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter)null, (me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter.ItemIds)null, (me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter.ViewHolderFactory)null);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model.items
        flag 1 (0x2L): model
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}