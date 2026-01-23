package com.robinhood.android.onboarding.directipo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.onboarding.directipo.C22750R;

/* loaded from: classes10.dex */
public final class FragmentDirectIpoOnboardingIntroBinding implements ViewBinding {
    public final RdsButton directIpoOnboardingIntroContinue;
    public final RhTextView directIpoOnboardingIntroDescription;
    public final Guideline directIpoOnboardingIntroGuideline;
    public final ImageView directIpoOnboardingIntroImage;
    public final RhTextView directIpoOnboardingIntroTitle;
    private final ConstraintLayout rootView;

    private FragmentDirectIpoOnboardingIntroBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RhTextView rhTextView, Guideline guideline, ImageView imageView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.directIpoOnboardingIntroContinue = rdsButton;
        this.directIpoOnboardingIntroDescription = rhTextView;
        this.directIpoOnboardingIntroGuideline = guideline;
        this.directIpoOnboardingIntroImage = imageView;
        this.directIpoOnboardingIntroTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDirectIpoOnboardingIntroBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDirectIpoOnboardingIntroBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C22750R.layout.fragment_direct_ipo_onboarding_intro, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDirectIpoOnboardingIntroBinding bind(View view) {
        int i = C22750R.id.direct_ipo_onboarding_intro_continue;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C22750R.id.direct_ipo_onboarding_intro_description;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C22750R.id.direct_ipo_onboarding_intro_guideline;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline != null) {
                    i = C22750R.id.direct_ipo_onboarding_intro_image;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C22750R.id.direct_ipo_onboarding_intro_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            return new FragmentDirectIpoOnboardingIntroBinding((ConstraintLayout) view, rdsButton, rhTextView, guideline, imageView, rhTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
