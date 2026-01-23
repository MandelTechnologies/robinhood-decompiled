package com.robinhood.android.settings.p254ui.recurring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.settings.p254ui.recurring.C28446R;

/* loaded from: classes5.dex */
public final class DialogConfirmInvestmentScheduleDeleteBinding implements ViewBinding {
    public final RhTextView dialogFragmentMessage;
    public final RdsButton dialogFragmentNegativeBtn;
    public final RdsButton dialogFragmentPositiveBtn;
    public final RhTextView dialogFragmentTitle;
    private final LinearLayout rootView;

    private DialogConfirmInvestmentScheduleDeleteBinding(LinearLayout linearLayout, RhTextView rhTextView, RdsButton rdsButton, RdsButton rdsButton2, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.dialogFragmentMessage = rhTextView;
        this.dialogFragmentNegativeBtn = rdsButton;
        this.dialogFragmentPositiveBtn = rdsButton2;
        this.dialogFragmentTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogConfirmInvestmentScheduleDeleteBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogConfirmInvestmentScheduleDeleteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28446R.layout.dialog_confirm_investment_schedule_delete, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static DialogConfirmInvestmentScheduleDeleteBinding bind(View view) {
        int i = C28446R.id.dialog_fragment_message;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C28446R.id.dialog_fragment_negative_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C28446R.id.dialog_fragment_positive_btn;
                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton2 != null) {
                    i = C28446R.id.dialog_fragment_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new DialogConfirmInvestmentScheduleDeleteBinding((LinearLayout) view, rhTextView, rdsButton, rdsButton2, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
