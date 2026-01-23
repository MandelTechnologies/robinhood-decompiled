package com.robinhood.android.trade.options.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.options.C29757R;

/* loaded from: classes9.dex */
public final class MergeOptionMultilegOrderSummaryItemBinding implements ViewBinding {
    public final RhTextView optionOrderMultilegLeftSummary;
    public final RhTextView optionOrderMultilegRightSummary;
    private final View rootView;

    private MergeOptionMultilegOrderSummaryItemBinding(View view, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.optionOrderMultilegLeftSummary = rhTextView;
        this.optionOrderMultilegRightSummary = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeOptionMultilegOrderSummaryItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C29757R.layout.merge_option_multileg_order_summary_item, viewGroup);
        return bind(viewGroup);
    }

    public static MergeOptionMultilegOrderSummaryItemBinding bind(View view) {
        int i = C29757R.id.option_order_multileg_left_summary;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C29757R.id.option_order_multileg_right_summary;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                return new MergeOptionMultilegOrderSummaryItemBinding(view, rhTextView, rhTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
