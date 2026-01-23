package com.robinhood.android.acats.p057ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class FragmentAcatsInConfirmationBinding implements ViewBinding {
    public final RhTextView acatsInConfirmationDescription;
    public final RhTextView acatsInConfirmationTitle;
    public final RdsButton doneBtn;
    public final LottieAnimationView featherSpinLottie;
    public final ComposeView goldPromoCompose;
    private final LinearLayout rootView;
    public final RdsButton viewDetailsBtn;

    private FragmentAcatsInConfirmationBinding(LinearLayout linearLayout, RhTextView rhTextView, RhTextView rhTextView2, RdsButton rdsButton, LottieAnimationView lottieAnimationView, ComposeView composeView, RdsButton rdsButton2) {
        this.rootView = linearLayout;
        this.acatsInConfirmationDescription = rhTextView;
        this.acatsInConfirmationTitle = rhTextView2;
        this.doneBtn = rdsButton;
        this.featherSpinLottie = lottieAnimationView;
        this.goldPromoCompose = composeView;
        this.viewDetailsBtn = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAcatsInConfirmationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAcatsInConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C7686R.layout.fragment_acats_in_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAcatsInConfirmationBinding bind(View view) {
        int i = C7686R.id.acats_in_confirmation_description;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C7686R.id.acats_in_confirmation_title;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C7686R.id.done_btn;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C7686R.id.feather_spin_lottie;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                    if (lottieAnimationView != null) {
                        i = C7686R.id.gold_promo_compose;
                        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                        if (composeView != null) {
                            i = C7686R.id.view_details_btn;
                            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton2 != null) {
                                return new FragmentAcatsInConfirmationBinding((LinearLayout) view, rhTextView, rhTextView2, rdsButton, lottieAnimationView, composeView, rdsButton2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
