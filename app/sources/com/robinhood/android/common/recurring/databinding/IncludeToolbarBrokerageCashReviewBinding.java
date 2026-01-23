package com.robinhood.android.common.recurring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class IncludeToolbarBrokerageCashReviewBinding implements ViewBinding {
    public final RdsRippleContainerView brokerageCashEdit;
    public final RhTextView brokerageCashEditTxt;
    public final ConstraintLayout brokerageCashOrderToolbarContent;
    private final ConstraintLayout rootView;

    private IncludeToolbarBrokerageCashReviewBinding(ConstraintLayout constraintLayout, RdsRippleContainerView rdsRippleContainerView, RhTextView rhTextView, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.brokerageCashEdit = rdsRippleContainerView;
        this.brokerageCashEditTxt = rhTextView;
        this.brokerageCashOrderToolbarContent = constraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IncludeToolbarBrokerageCashReviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeToolbarBrokerageCashReviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11595R.layout.include_toolbar_brokerage_cash_review, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeToolbarBrokerageCashReviewBinding bind(View view) {
        int i = C11595R.id.brokerage_cash_edit;
        RdsRippleContainerView rdsRippleContainerView = (RdsRippleContainerView) ViewBindings.findChildViewById(view, i);
        if (rdsRippleContainerView != null) {
            i = C11595R.id.brokerage_cash_edit_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                return new IncludeToolbarBrokerageCashReviewBinding(constraintLayout, rdsRippleContainerView, rhTextView, constraintLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
