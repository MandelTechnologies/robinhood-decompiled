package com.robinhood.android.common.recurring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.view.RhMoneyInputView;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.amount.RhPercentageInputView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class FragmentRecurringAmountBinding implements ViewBinding {
    public final View divider;
    public final RdsButton recurringAmountConfirmBtn;
    public final RhTextView recurringAmountLabel;
    public final RdsNumpadView recurringAmountNumpad;
    public final RhTextView recurringAmountSubtext;
    public final ImageView recurringAmountSubtextInfoIcon;
    public final LinearLayout recurringAmountSubtextLayout;
    public final RhMoneyInputView recurringDollarAmountInputView;
    public final RhPercentageInputView recurringPercentageInputView;
    private final ConstraintLayout rootView;

    private FragmentRecurringAmountBinding(ConstraintLayout constraintLayout, View view, RdsButton rdsButton, RhTextView rhTextView, RdsNumpadView rdsNumpadView, RhTextView rhTextView2, ImageView imageView, LinearLayout linearLayout, RhMoneyInputView rhMoneyInputView, RhPercentageInputView rhPercentageInputView) {
        this.rootView = constraintLayout;
        this.divider = view;
        this.recurringAmountConfirmBtn = rdsButton;
        this.recurringAmountLabel = rhTextView;
        this.recurringAmountNumpad = rdsNumpadView;
        this.recurringAmountSubtext = rhTextView2;
        this.recurringAmountSubtextInfoIcon = imageView;
        this.recurringAmountSubtextLayout = linearLayout;
        this.recurringDollarAmountInputView = rhMoneyInputView;
        this.recurringPercentageInputView = rhPercentageInputView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRecurringAmountBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecurringAmountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11595R.layout.fragment_recurring_amount, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRecurringAmountBinding bind(View view) {
        int i = C11595R.id.divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C11595R.id.recurring_amount_confirm_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C11595R.id.recurring_amount_label;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C11595R.id.recurring_amount_numpad;
                    RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                    if (rdsNumpadView != null) {
                        i = C11595R.id.recurring_amount_subtext;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C11595R.id.recurring_amount_subtext_info_icon;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = C11595R.id.recurring_amount_subtext_layout;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    i = C11595R.id.recurring_dollar_amount_input_view;
                                    RhMoneyInputView rhMoneyInputView = (RhMoneyInputView) ViewBindings.findChildViewById(view, i);
                                    if (rhMoneyInputView != null) {
                                        i = C11595R.id.recurring_percentage_input_view;
                                        RhPercentageInputView rhPercentageInputView = (RhPercentageInputView) ViewBindings.findChildViewById(view, i);
                                        if (rhPercentageInputView != null) {
                                            return new FragmentRecurringAmountBinding((ConstraintLayout) view, viewFindChildViewById, rdsButton, rhTextView, rdsNumpadView, rhTextView2, imageView, linearLayout, rhMoneyInputView, rhPercentageInputView);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
