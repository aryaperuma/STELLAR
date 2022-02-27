package com.byoutline.kickmaterial.databinding;
import com.byoutline.kickmaterial.R;
import com.byoutline.kickmaterial.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CategoryListItemBindingImpl extends CategoryListItemBinding implements com.byoutline.kickmaterial.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.checked_view, 4);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CategoryListItemBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private CategoryListItemBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[2]
            , (android.support.v7.widget.CardView) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.FrameLayout) bindings[4]
            );
        this.categoryCheckedIv.setTag(null);
        this.categoryContainerCv.setTag(null);
        this.categoryDotColor.setTag(null);
        this.categoryNameTv.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.byoutline.kickmaterial.generated.callback.OnClickListener(this, 1);
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
        if (BR.categoryItem == variableId) {
            setCategoryItem((com.byoutline.kickmaterial.model.Category) variable);
        }
        else if (BR.categoryClickListener == variableId) {
            setCategoryClickListener((com.byoutline.kickmaterial.features.selectcategory.CategoryClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCategoryItem(@Nullable com.byoutline.kickmaterial.model.Category CategoryItem) {
        this.mCategoryItem = CategoryItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.categoryItem);
        super.requestRebind();
    }
    public void setCategoryClickListener(@Nullable com.byoutline.kickmaterial.features.selectcategory.CategoryClickListener CategoryClickListener) {
        this.mCategoryClickListener = CategoryClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.categoryClickListener);
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
        int categoryItemGetBgColor = 0;
        int categoryItemColorResId = 0;
        int categoryItemNameResId = 0;
        com.byoutline.kickmaterial.model.Category categoryItem = mCategoryItem;
        com.byoutline.kickmaterial.features.selectcategory.CategoryClickListener categoryClickListener = mCategoryClickListener;

        if ((dirtyFlags & 0x5L) != 0) {



                if (categoryItem != null) {
                    // read categoryItem.getBgColor()
                    categoryItemGetBgColor = categoryItem.getBgColor();
                    // read categoryItem.colorResId
                    categoryItemColorResId = categoryItem.getColorResId();
                    // read categoryItem.nameResId
                    categoryItemNameResId = categoryItem.getNameResId();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.byoutline.kickmaterial.utils.BindingAdaptersKt.setColorFilter(this.categoryCheckedIv, categoryItemColorResId);
            this.categoryContainerCv.setCardBackgroundColor(categoryItemGetBgColor);
            com.byoutline.kickmaterial.utils.BindingAdaptersKt.setColorFilter(this.categoryDotColor, categoryItemColorResId);
            this.categoryNameTv.setText(categoryItemNameResId);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.categoryContainerCv.setOnClickListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // categoryClickListener
        com.byoutline.kickmaterial.features.selectcategory.CategoryClickListener categoryClickListener = mCategoryClickListener;
        // categoryClickListener != null
        boolean categoryClickListenerJavaLangObjectNull = false;
        // categoryItem
        com.byoutline.kickmaterial.model.Category categoryItem = mCategoryItem;



        categoryClickListenerJavaLangObjectNull = (categoryClickListener) != (null);
        if (categoryClickListenerJavaLangObjectNull) {




            categoryClickListener.categoryClicked(callbackArg_0, categoryItem);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): categoryItem
        flag 1 (0x2L): categoryClickListener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}