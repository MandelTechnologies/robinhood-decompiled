package com.robinhood.android.common.recurring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class MergeRecurringInvestmentNuxBinding implements ViewBinding {
    public final RdsTextButton launchRecurringFlowTextBtn;
    public final RhTextView recurringNuxDescription;
    private final LinearLayout rootView;

    private MergeRecurringInvestmentNuxBinding(LinearLayout linearLayout, RdsTextButton rdsTextButton, RhTextView rhTextView) {
        this.rootView = linearLayout;
        this.launchRecurringFlowTextBtn = rdsTextButton;
        this.recurringNuxDescription = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static MergeRecurringInvestmentNuxBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MergeRecurringInvestmentNuxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11595R.layout.merge_recurring_investment_nux, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MergeRecurringInvestmentNuxBinding bind(View view) {
        int i = C11595R.id.launch_recurring_flow_text_btn;
        RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
        if (rdsTextButton != null) {
            i = C11595R.id.recurring_nux_description;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new MergeRecurringInvestmentNuxBinding((LinearLayout) view, rdsTextButton, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
