package com.robinhood.shared.education.order.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.education.order.C38811R;

/* loaded from: classes6.dex */
public final class FragmentOrderTypeEducationBinding implements ViewBinding {
    public final ConstraintLayout constraintLayout;
    public final RdsButton continueBtn;
    public final RhTextView disclaimerTxt;
    public final RdsButton dismissBtn;
    public final LinearLayout expandedToolbar;
    public final LottieAnimationView orderTypeAnimation;
    public final RhTextView orderTypePrompt;
    public final RhTextView orderTypeTitle;
    private final ConstraintLayout rootView;

    private FragmentOrderTypeEducationBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RdsButton rdsButton, RhTextView rhTextView, RdsButton rdsButton2, LinearLayout linearLayout, LottieAnimationView lottieAnimationView, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = constraintLayout;
        this.constraintLayout = constraintLayout2;
        this.continueBtn = rdsButton;
        this.disclaimerTxt = rhTextView;
        this.dismissBtn = rdsButton2;
        this.expandedToolbar = linearLayout;
        this.orderTypeAnimation = lottieAnimationView;
        this.orderTypePrompt = rhTextView2;
        this.orderTypeTitle = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOrderTypeEducationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOrderTypeEducationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C38811R.layout.fragment_order_type_education, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOrderTypeEducationBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C38811R.id.continue_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C38811R.id.disclaimer_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C38811R.id.dismiss_btn;
                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton2 != null) {
                    i = C38811R.id.expanded_toolbar;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C38811R.id.order_type_animation;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                        if (lottieAnimationView != null) {
                            i = C38811R.id.order_type_prompt;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                i = C38811R.id.order_type_title;
                                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView3 != null) {
                                    return new FragmentOrderTypeEducationBinding(constraintLayout, constraintLayout, rdsButton, rhTextView, rdsButton2, linearLayout, lottieAnimationView, rhTextView2, rhTextView3);
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
