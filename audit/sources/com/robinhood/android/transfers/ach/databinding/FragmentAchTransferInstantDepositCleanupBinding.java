package com.robinhood.android.transfers.ach.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.ach.C30082R;

/* loaded from: classes9.dex */
public final class FragmentAchTransferInstantDepositCleanupBinding implements ViewBinding {
    public final RhTextView cryptoDetailText;
    public final RhTextView detailText;
    public final RdsButton doneButton;
    public final RdsButton goldHookButton;
    public final LottieAnimationView lottie;
    public final RhTextView restrictionsText;
    private final ConstraintLayout rootView;
    public final ScrollView scrollView;
    public final RhTextView titleText;
    public final ConstraintLayout transferInstantDepositContainer;

    private FragmentAchTransferInstantDepositCleanupBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, RhTextView rhTextView2, RdsButton rdsButton, RdsButton rdsButton2, LottieAnimationView lottieAnimationView, RhTextView rhTextView3, ScrollView scrollView, RhTextView rhTextView4, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.cryptoDetailText = rhTextView;
        this.detailText = rhTextView2;
        this.doneButton = rdsButton;
        this.goldHookButton = rdsButton2;
        this.lottie = lottieAnimationView;
        this.restrictionsText = rhTextView3;
        this.scrollView = scrollView;
        this.titleText = rhTextView4;
        this.transferInstantDepositContainer = constraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAchTransferInstantDepositCleanupBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAchTransferInstantDepositCleanupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30082R.layout.fragment_ach_transfer_instant_deposit_cleanup, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAchTransferInstantDepositCleanupBinding bind(View view) {
        int i = C30082R.id.crypto_detail_text;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C30082R.id.detail_text;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C30082R.id.done_button;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C30082R.id.gold_hook_button;
                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton2 != null) {
                        i = C30082R.id.lottie;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                        if (lottieAnimationView != null) {
                            i = C30082R.id.restrictions_text;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                i = C30082R.id.scroll_view;
                                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                                if (scrollView != null) {
                                    i = C30082R.id.title_text;
                                    RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView4 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                        return new FragmentAchTransferInstantDepositCleanupBinding(constraintLayout, rhTextView, rhTextView2, rdsButton, rdsButton2, lottieAnimationView, rhTextView3, scrollView, rhTextView4, constraintLayout);
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
