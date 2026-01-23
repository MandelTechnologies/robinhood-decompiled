package com.robinhood.android.transfers.ach.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.ach.C30082R;

/* loaded from: classes9.dex */
public final class FragmentDepositScheduleReviewBinding implements ViewBinding {
    public final RdsRowView depositScheduleAmount;
    public final RdsRowView depositScheduleBank;
    public final RhTextView depositScheduleDisclaimer;
    public final RdsRowView depositScheduleFrequency;
    public final RdsRowView depositScheduleNextDeposit;
    public final RhTextView depositScheduleReviewTitle;
    public final RdsButton depositScheduleSubmitBtn;
    public final ConstraintLayout listContainer;
    public final ShimmerLoadingView loadingView;
    private final FrameLayout rootView;

    private FragmentDepositScheduleReviewBinding(FrameLayout frameLayout, RdsRowView rdsRowView, RdsRowView rdsRowView2, RhTextView rhTextView, RdsRowView rdsRowView3, RdsRowView rdsRowView4, RhTextView rhTextView2, RdsButton rdsButton, ConstraintLayout constraintLayout, ShimmerLoadingView shimmerLoadingView) {
        this.rootView = frameLayout;
        this.depositScheduleAmount = rdsRowView;
        this.depositScheduleBank = rdsRowView2;
        this.depositScheduleDisclaimer = rhTextView;
        this.depositScheduleFrequency = rdsRowView3;
        this.depositScheduleNextDeposit = rdsRowView4;
        this.depositScheduleReviewTitle = rhTextView2;
        this.depositScheduleSubmitBtn = rdsButton;
        this.listContainer = constraintLayout;
        this.loadingView = shimmerLoadingView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDepositScheduleReviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDepositScheduleReviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30082R.layout.fragment_deposit_schedule_review, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDepositScheduleReviewBinding bind(View view) {
        int i = C30082R.id.deposit_schedule_amount;
        RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
        if (rdsRowView != null) {
            i = C30082R.id.deposit_schedule_bank;
            RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
            if (rdsRowView2 != null) {
                i = C30082R.id.deposit_schedule_disclaimer;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C30082R.id.deposit_schedule_frequency;
                    RdsRowView rdsRowView3 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsRowView3 != null) {
                        i = C30082R.id.deposit_schedule_next_deposit;
                        RdsRowView rdsRowView4 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsRowView4 != null) {
                            i = C30082R.id.deposit_schedule_review_title;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                i = C30082R.id.deposit_schedule_submit_btn;
                                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton != null) {
                                    i = C30082R.id.list_container;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout != null) {
                                        i = C30082R.id.loading_view;
                                        ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                                        if (shimmerLoadingView != null) {
                                            return new FragmentDepositScheduleReviewBinding((FrameLayout) view, rdsRowView, rdsRowView2, rhTextView, rdsRowView3, rdsRowView4, rhTextView2, rdsButton, constraintLayout, shimmerLoadingView);
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
