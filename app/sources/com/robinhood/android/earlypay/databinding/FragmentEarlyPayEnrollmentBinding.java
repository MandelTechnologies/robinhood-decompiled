package com.robinhood.android.earlypay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.earlypay.C14433R;

/* loaded from: classes7.dex */
public final class FragmentEarlyPayEnrollmentBinding implements ViewBinding {
    public final LinearLayout earlyPayEnrollmentButtonContainer;
    public final ShimmerLoadingView earlyPayEnrollmentLoadingView;
    public final RdsButton earlyPayEnrollmentPrimaryBtn;
    public final RecyclerView earlyPayEnrollmentRecyclerView;
    public final RdsButton earlyPayEnrollmentSecondaryBtn;
    private final ConstraintLayout rootView;

    private FragmentEarlyPayEnrollmentBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, ShimmerLoadingView shimmerLoadingView, RdsButton rdsButton, RecyclerView recyclerView, RdsButton rdsButton2) {
        this.rootView = constraintLayout;
        this.earlyPayEnrollmentButtonContainer = linearLayout;
        this.earlyPayEnrollmentLoadingView = shimmerLoadingView;
        this.earlyPayEnrollmentPrimaryBtn = rdsButton;
        this.earlyPayEnrollmentRecyclerView = recyclerView;
        this.earlyPayEnrollmentSecondaryBtn = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEarlyPayEnrollmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEarlyPayEnrollmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14433R.layout.fragment_early_pay_enrollment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEarlyPayEnrollmentBinding bind(View view) {
        int i = C14433R.id.early_pay_enrollment_button_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C14433R.id.early_pay_enrollment_loading_view;
            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
            if (shimmerLoadingView != null) {
                i = C14433R.id.early_pay_enrollment_primary_btn;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C14433R.id.early_pay_enrollment_recycler_view;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = C14433R.id.early_pay_enrollment_secondary_btn;
                        RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton2 != null) {
                            return new FragmentEarlyPayEnrollmentBinding((ConstraintLayout) view, linearLayout, shimmerLoadingView, rdsButton, recyclerView, rdsButton2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
