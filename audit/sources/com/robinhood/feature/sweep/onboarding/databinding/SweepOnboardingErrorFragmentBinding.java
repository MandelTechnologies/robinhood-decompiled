package com.robinhood.feature.sweep.onboarding.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.feature.sweep.onboarding.C33184R;

/* loaded from: classes15.dex */
public final class SweepOnboardingErrorFragmentBinding implements ViewBinding {
    public final RdsPogView headerPog;
    public final RhTextView messageTxt;
    public final RdsButton positiveBtn;
    private final ConstraintLayout rootView;
    public final RhTextView titleTxt;

    private SweepOnboardingErrorFragmentBinding(ConstraintLayout constraintLayout, RdsPogView rdsPogView, RhTextView rhTextView, RdsButton rdsButton, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.headerPog = rdsPogView;
        this.messageTxt = rhTextView;
        this.positiveBtn = rdsButton;
        this.titleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static SweepOnboardingErrorFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SweepOnboardingErrorFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C33184R.layout.sweep_onboarding_error_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static SweepOnboardingErrorFragmentBinding bind(View view) {
        int i = C33184R.id.header_pog;
        RdsPogView rdsPogView = (RdsPogView) ViewBindings.findChildViewById(view, i);
        if (rdsPogView != null) {
            i = C33184R.id.message_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C33184R.id.positive_btn;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C33184R.id.title_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new SweepOnboardingErrorFragmentBinding((ConstraintLayout) view, rdsPogView, rhTextView, rdsButton, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
