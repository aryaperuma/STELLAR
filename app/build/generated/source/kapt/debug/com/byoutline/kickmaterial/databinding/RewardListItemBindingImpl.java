package com.byoutline.kickmaterial.databinding;
import com.byoutline.kickmaterial.R;
import com.byoutline.kickmaterial.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RewardListItemBindingImpl extends RewardListItemBinding implements com.byoutline.kickmaterial.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.reward_item_currency_tv, 4);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RewardListItemBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private RewardListItemBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.support.v7.widget.CardView) bindings[0]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.rewardContainerCv.setTag(null);
        this.rewardItemAmountTv.setTag(null);
        this.rewardItemDescTv.setTag(null);
        this.rewardItemTypeTv.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.byoutline.kickmaterial.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.reward == variableId) {
            setReward((com.byoutline.kickmaterial.model.Reward) variable);
        }
        else if (BR.bgColor == variableId) {
            setBgColor((int) variable);
        }
        else if (BR.rewardClickListener == variableId) {
            setRewardClickListener((com.byoutline.kickmaterial.features.rewardlist.RewardClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setReward(@Nullable com.byoutline.kickmaterial.model.Reward Reward) {
        this.mReward = Reward;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.reward);
        super.requestRebind();
    }
    public void setBgColor(int BgColor) {
        this.mBgColor = BgColor;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.bgColor);
        super.requestRebind();
    }
    public void setRewardClickListener(@Nullable com.byoutline.kickmaterial.features.rewardlist.RewardClickListener RewardClickListener) {
        this.mRewardClickListener = RewardClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.rewardClickListener);
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
        java.lang.String rewardItemAmountTvAndroidStringRewardValueRewardMinimum = null;
        com.byoutline.kickmaterial.model.Reward reward = mReward;
        int bgColor = mBgColor;
        java.lang.String rewardDescription = null;
        double rewardMinimum = 0.0;
        com.byoutline.kickmaterial.features.rewardlist.RewardClickListener rewardClickListener = mRewardClickListener;
        java.lang.String rewardReward = null;

        if ((dirtyFlags & 0x9L) != 0) {



                if (reward != null) {
                    // read reward.description
                    rewardDescription = reward.getDescription();
                    // read reward.minimum
                    rewardMinimum = reward.getMinimum();
                    // read reward.reward
                    rewardReward = reward.getReward();
                }


                // read @android:string/reward_value
                rewardItemAmountTvAndroidStringRewardValueRewardMinimum = rewardItemAmountTv.getResources().getString(R.string.reward_value, rewardMinimum);
        }
        if ((dirtyFlags & 0xaL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.rewardContainerCv.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.rewardContainerCv.setCardBackgroundColor(bgColor);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.rewardItemAmountTv, rewardItemAmountTvAndroidStringRewardValueRewardMinimum);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.rewardItemDescTv, rewardDescription);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.rewardItemTypeTv, rewardReward);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // reward
        com.byoutline.kickmaterial.model.Reward reward = mReward;
        // rewardClickListener
        com.byoutline.kickmaterial.features.rewardlist.RewardClickListener rewardClickListener = mRewardClickListener;
        // rewardClickListener != null
        boolean rewardClickListenerJavaLangObjectNull = false;



        rewardClickListenerJavaLangObjectNull = (rewardClickListener) != (null);
        if (rewardClickListenerJavaLangObjectNull) {



            rewardClickListener.rewardClicked(reward);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): reward
        flag 1 (0x2L): bgColor
        flag 2 (0x3L): rewardClickListener
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}