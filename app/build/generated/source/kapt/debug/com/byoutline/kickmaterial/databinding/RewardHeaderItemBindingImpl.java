package com.byoutline.kickmaterial.databinding;
import com.byoutline.kickmaterial.R;
import com.byoutline.kickmaterial.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RewardHeaderItemBindingImpl extends RewardHeaderItemBinding  {

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

    public RewardHeaderItemBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }
    private RewardHeaderItemBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[0]
            );
        this.rewardHeaderTv.setTag(null);
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
        if (BR.header == variableId) {
            setHeader((com.byoutline.kickmaterial.features.rewardlist.RewardHeader) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHeader(@Nullable com.byoutline.kickmaterial.features.rewardlist.RewardHeader Header) {
        this.mHeader = Header;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.header);
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
        com.byoutline.kickmaterial.features.rewardlist.RewardHeader header = mHeader;
        java.lang.String rewardHeaderTvAndroidStringRewardMoreThanHeaderMinimum = null;
        int headerMinimum = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (header != null) {
                    // read header.minimum
                    headerMinimum = header.getMinimum();
                }


                // read @android:string/reward_more_than
                rewardHeaderTvAndroidStringRewardMoreThanHeaderMinimum = rewardHeaderTv.getResources().getString(R.string.reward_more_than, headerMinimum);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.rewardHeaderTv, rewardHeaderTvAndroidStringRewardMoreThanHeaderMinimum);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): header
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}