package com.robinhood.android.cash.disputes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class FragmentDisputeSubmittedBinding implements ViewBinding {
    public final RdsButton disputeSubmittedDoneButton;
    public final ImageView disputeSubmittedSplashImage;
    public final RdsPogView disputeSubmittedStatusChangePog;
    public final RhTextView disputeSubmittedStatusChangeText;
    public final RdsPogView disputeSubmittedTemporaryCreditPog;
    public final RhTextView disputeSubmittedTemporaryCreditText;
    public final RhTextView disputeSubmittedTitle;
    private final ConstraintLayout rootView;

    private FragmentDisputeSubmittedBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, ImageView imageView, RdsPogView rdsPogView, RhTextView rhTextView, RdsPogView rdsPogView2, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = constraintLayout;
        this.disputeSubmittedDoneButton = rdsButton;
        this.disputeSubmittedSplashImage = imageView;
        this.disputeSubmittedStatusChangePog = rdsPogView;
        this.disputeSubmittedStatusChangeText = rhTextView;
        this.disputeSubmittedTemporaryCreditPog = rdsPogView2;
        this.disputeSubmittedTemporaryCreditText = rhTextView2;
        this.disputeSubmittedTitle = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDisputeSubmittedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDisputeSubmittedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10007R.layout.fragment_dispute_submitted, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDisputeSubmittedBinding bind(View view) {
        int i = C10007R.id.dispute_submitted_done_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C10007R.id.dispute_submitted_splash_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C10007R.id.dispute_submitted_status_change_pog;
                RdsPogView rdsPogView = (RdsPogView) ViewBindings.findChildViewById(view, i);
                if (rdsPogView != null) {
                    i = C10007R.id.dispute_submitted_status_change_text;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C10007R.id.dispute_submitted_temporary_credit_pog;
                        RdsPogView rdsPogView2 = (RdsPogView) ViewBindings.findChildViewById(view, i);
                        if (rdsPogView2 != null) {
                            i = C10007R.id.dispute_submitted_temporary_credit_text;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                i = C10007R.id.dispute_submitted_title;
                                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView3 != null) {
                                    return new FragmentDisputeSubmittedBinding((ConstraintLayout) view, rdsButton, imageView, rdsPogView, rhTextView, rdsPogView2, rhTextView2, rhTextView3);
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
