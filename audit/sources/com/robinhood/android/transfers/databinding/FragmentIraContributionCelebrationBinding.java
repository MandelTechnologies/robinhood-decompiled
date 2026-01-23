package com.robinhood.android.transfers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.android.transfers.C30065R;

/* loaded from: classes9.dex */
public final class FragmentIraContributionCelebrationBinding implements ViewBinding {
    public final LinearLayout bottomContentContainer;
    public final RhTextView disclosure;
    public final Guideline guidelineHorizontalCenter;
    public final RdsButton investCta;
    public final LottieAnimationView lottie;
    public final ClientComponentButtonView primaryCta;
    private final ConstraintLayout rootView;
    public final RhTextView subtitle;
    public final RhTextView title;

    private FragmentIraContributionCelebrationBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, RhTextView rhTextView, Guideline guideline, RdsButton rdsButton, LottieAnimationView lottieAnimationView, ClientComponentButtonView clientComponentButtonView, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = constraintLayout;
        this.bottomContentContainer = linearLayout;
        this.disclosure = rhTextView;
        this.guidelineHorizontalCenter = guideline;
        this.investCta = rdsButton;
        this.lottie = lottieAnimationView;
        this.primaryCta = clientComponentButtonView;
        this.subtitle = rhTextView2;
        this.title = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentIraContributionCelebrationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentIraContributionCelebrationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30065R.layout.fragment_ira_contribution_celebration, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentIraContributionCelebrationBinding bind(View view) {
        int i = C30065R.id.bottom_content_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C30065R.id.disclosure;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C30065R.id.guideline_horizontal_center;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline != null) {
                    i = C30065R.id.invest_cta;
                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton != null) {
                        i = C30065R.id.lottie;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                        if (lottieAnimationView != null) {
                            i = C30065R.id.primary_cta;
                            ClientComponentButtonView clientComponentButtonView = (ClientComponentButtonView) ViewBindings.findChildViewById(view, i);
                            if (clientComponentButtonView != null) {
                                i = C30065R.id.subtitle;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    i = C30065R.id.title;
                                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView3 != null) {
                                        return new FragmentIraContributionCelebrationBinding((ConstraintLayout) view, linearLayout, rhTextView, guideline, rdsButton, lottieAnimationView, clientComponentButtonView, rhTextView2, rhTextView3);
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
