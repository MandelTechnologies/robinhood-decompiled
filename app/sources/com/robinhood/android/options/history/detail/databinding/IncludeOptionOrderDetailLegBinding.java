package com.robinhood.android.options.history.detail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.options.history.detail.C23086R;
import com.robinhood.android.options.history.detail.order.OptionOrderDetailLegView;

/* loaded from: classes11.dex */
public final class IncludeOptionOrderDetailLegBinding implements ViewBinding {
    public final RdsDataRowView optionOrderDetailLegEffect;
    public final RdsDataRowView optionOrderDetailLegFilled;
    public final RdsDataRowView optionOrderDetailLegFilledQuantity;
    public final RdsDataRowView optionOrderDetailLegSide;
    private final OptionOrderDetailLegView rootView;
    public final RhTextView titleTxt;

    private IncludeOptionOrderDetailLegBinding(OptionOrderDetailLegView optionOrderDetailLegView, RdsDataRowView rdsDataRowView, RdsDataRowView rdsDataRowView2, RdsDataRowView rdsDataRowView3, RdsDataRowView rdsDataRowView4, RhTextView rhTextView) {
        this.rootView = optionOrderDetailLegView;
        this.optionOrderDetailLegEffect = rdsDataRowView;
        this.optionOrderDetailLegFilled = rdsDataRowView2;
        this.optionOrderDetailLegFilledQuantity = rdsDataRowView3;
        this.optionOrderDetailLegSide = rdsDataRowView4;
        this.titleTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public OptionOrderDetailLegView getRoot() {
        return this.rootView;
    }

    public static IncludeOptionOrderDetailLegBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOptionOrderDetailLegBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C23086R.layout.include_option_order_detail_leg, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOptionOrderDetailLegBinding bind(View view) {
        int i = C23086R.id.option_order_detail_leg_effect;
        RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
        if (rdsDataRowView != null) {
            i = C23086R.id.option_order_detail_leg_filled;
            RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
            if (rdsDataRowView2 != null) {
                i = C23086R.id.option_order_detail_leg_filled_quantity;
                RdsDataRowView rdsDataRowView3 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                if (rdsDataRowView3 != null) {
                    i = C23086R.id.option_order_detail_leg_side;
                    RdsDataRowView rdsDataRowView4 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsDataRowView4 != null) {
                        i = C23086R.id.title_txt;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            return new IncludeOptionOrderDetailLegBinding((OptionOrderDetailLegView) view, rdsDataRowView, rdsDataRowView2, rdsDataRowView3, rdsDataRowView4, rhTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
