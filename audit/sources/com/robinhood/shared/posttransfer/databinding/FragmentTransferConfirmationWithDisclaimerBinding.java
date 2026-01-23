package com.robinhood.shared.posttransfer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.posttransfer.C39496R;

/* loaded from: classes6.dex */
public final class FragmentTransferConfirmationWithDisclaimerBinding implements ViewBinding {
    public final RhTextView additionalDetailTxt;
    public final RhTextView disclaimer;
    public final ImageView image;
    public final LottieAnimationView lottie;
    public final RdsButton primaryBtn;
    private final ConstraintLayout rootView;
    public final RdsButton secondaryBtn;
    public final RhTextView subtitle;
    public final RhTextView title;
    public final Guideline topGuideline;
    public final FrameLayout visual;

    private FragmentTransferConfirmationWithDisclaimerBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, RhTextView rhTextView2, ImageView imageView, LottieAnimationView lottieAnimationView, RdsButton rdsButton, RdsButton rdsButton2, RhTextView rhTextView3, RhTextView rhTextView4, Guideline guideline, FrameLayout frameLayout) {
        this.rootView = constraintLayout;
        this.additionalDetailTxt = rhTextView;
        this.disclaimer = rhTextView2;
        this.image = imageView;
        this.lottie = lottieAnimationView;
        this.primaryBtn = rdsButton;
        this.secondaryBtn = rdsButton2;
        this.subtitle = rhTextView3;
        this.title = rhTextView4;
        this.topGuideline = guideline;
        this.visual = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTransferConfirmationWithDisclaimerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTransferConfirmationWithDisclaimerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39496R.layout.fragment_transfer_confirmation_with_disclaimer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentTransferConfirmationWithDisclaimerBinding bind(View view) {
        int i = C39496R.id.additional_detail_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C39496R.id.disclaimer;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C39496R.id.image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C39496R.id.lottie;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                    if (lottieAnimationView != null) {
                        i = C39496R.id.primary_btn;
                        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton != null) {
                            i = C39496R.id.secondary_btn;
                            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton2 != null) {
                                i = C39496R.id.subtitle;
                                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView3 != null) {
                                    i = C39496R.id.title;
                                    RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView4 != null) {
                                        i = C39496R.id.top_guideline;
                                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                        if (guideline != null) {
                                            i = C39496R.id.visual;
                                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                            if (frameLayout != null) {
                                                return new FragmentTransferConfirmationWithDisclaimerBinding((ConstraintLayout) view, rhTextView, rhTextView2, imageView, lottieAnimationView, rdsButton, rdsButton2, rhTextView3, rhTextView4, guideline, frameLayout);
                                            }
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
