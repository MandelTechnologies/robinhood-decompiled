package com.robinhood.android.common.recurring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class FragmentRecurringOrderAmountTypeBinding implements ViewBinding {
    public final RdsRowView amountTypeDollarAmountOptionRow;
    public final RhTextView amountTypeFooter;
    public final RdsRowView amountTypePercentageOptionRow;
    public final RdsButton amountTypeSelectedButton;
    public final RhTextView amountTypeSubtitleText;
    public final RhTextView amountTypeTitleText;
    private final LinearLayout rootView;

    private FragmentRecurringOrderAmountTypeBinding(LinearLayout linearLayout, RdsRowView rdsRowView, RhTextView rhTextView, RdsRowView rdsRowView2, RdsButton rdsButton, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = linearLayout;
        this.amountTypeDollarAmountOptionRow = rdsRowView;
        this.amountTypeFooter = rhTextView;
        this.amountTypePercentageOptionRow = rdsRowView2;
        this.amountTypeSelectedButton = rdsButton;
        this.amountTypeSubtitleText = rhTextView2;
        this.amountTypeTitleText = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRecurringOrderAmountTypeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecurringOrderAmountTypeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11595R.layout.fragment_recurring_order_amount_type, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRecurringOrderAmountTypeBinding bind(View view) {
        int i = C11595R.id.amount_type_dollar_amount_option_row;
        RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
        if (rdsRowView != null) {
            i = C11595R.id.amount_type_footer;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C11595R.id.amount_type_percentage_option_row;
                RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                if (rdsRowView2 != null) {
                    i = C11595R.id.amount_type_selected_button;
                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton != null) {
                        i = C11595R.id.amount_type_subtitle_text;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C11595R.id.amount_type_title_text;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                return new FragmentRecurringOrderAmountTypeBinding((LinearLayout) view, rdsRowView, rhTextView, rdsRowView2, rdsButton, rhTextView2, rhTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
