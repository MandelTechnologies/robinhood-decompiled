package com.robinhood.android.cash.transaction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.transaction.C10421R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class MerchantCategoryBottomSheetFragmentBinding implements ViewBinding {
    public final RecyclerView merchantCategoryList;
    public final RdsButton merchantChangeCategoryDone;
    public final RhTextView merchantChangeCategoryTitle;
    private final ConstraintLayout rootView;

    private MerchantCategoryBottomSheetFragmentBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, RdsButton rdsButton, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.merchantCategoryList = recyclerView;
        this.merchantChangeCategoryDone = rdsButton;
        this.merchantChangeCategoryTitle = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static MerchantCategoryBottomSheetFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MerchantCategoryBottomSheetFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10421R.layout.merchant_category_bottom_sheet_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MerchantCategoryBottomSheetFragmentBinding bind(View view) {
        int i = C10421R.id.merchant_category_list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C10421R.id.merchant_change_category_done;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C10421R.id.merchant_change_category_title;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    return new MerchantCategoryBottomSheetFragmentBinding((ConstraintLayout) view, recyclerView, rdsButton, rhTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
