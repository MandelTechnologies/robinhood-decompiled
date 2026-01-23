package com.robinhood.android.referral.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.referral.C26659R;

/* loaded from: classes5.dex */
public final class FragmentFractionalRewardClaimInProgressBinding implements ViewBinding {
    public final Guideline guideline;
    public final ConstraintLayout loadingView;
    private final ConstraintLayout rootView;

    private FragmentFractionalRewardClaimInProgressBinding(ConstraintLayout constraintLayout, Guideline guideline, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.guideline = guideline;
        this.loadingView = constraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentFractionalRewardClaimInProgressBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentFractionalRewardClaimInProgressBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C26659R.layout.fragment_fractional_reward_claim_in_progress, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentFractionalRewardClaimInProgressBinding bind(View view) {
        int i = C26659R.id.guideline;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            return new FragmentFractionalRewardClaimInProgressBinding(constraintLayout, guideline, constraintLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
