package com.robinhood.android.doc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.doc.C14254R;

/* loaded from: classes7.dex */
public final class FragmentPersonaStartBinding implements ViewBinding {
    public final Space personaFilledButtonSpace;
    public final LottieAnimationView personaStartAnimation;
    public final RhTextView personaStartDisclosure;
    public final AppCompatImageView personaStartImage;
    public final RdsButton personaStartPrimaryCta;
    public final RdsButton personaStartSecondaryCta;
    public final RhTextView personaStartSubtitle;
    public final RhTextView personaStartTitle;
    private final LinearLayout rootView;

    private FragmentPersonaStartBinding(LinearLayout linearLayout, Space space, LottieAnimationView lottieAnimationView, RhTextView rhTextView, AppCompatImageView appCompatImageView, RdsButton rdsButton, RdsButton rdsButton2, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = linearLayout;
        this.personaFilledButtonSpace = space;
        this.personaStartAnimation = lottieAnimationView;
        this.personaStartDisclosure = rhTextView;
        this.personaStartImage = appCompatImageView;
        this.personaStartPrimaryCta = rdsButton;
        this.personaStartSecondaryCta = rdsButton2;
        this.personaStartSubtitle = rhTextView2;
        this.personaStartTitle = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPersonaStartBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPersonaStartBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14254R.layout.fragment_persona_start, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPersonaStartBinding bind(View view) {
        int i = C14254R.id.persona_filled_button_space;
        Space space = (Space) ViewBindings.findChildViewById(view, i);
        if (space != null) {
            i = C14254R.id.persona_start_animation;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null) {
                i = C14254R.id.persona_start_disclosure;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C14254R.id.persona_start_image;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView != null) {
                        i = C14254R.id.persona_start_primary_cta;
                        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton != null) {
                            i = C14254R.id.persona_start_secondary_cta;
                            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton2 != null) {
                                i = C14254R.id.persona_start_subtitle;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    i = C14254R.id.persona_start_title;
                                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView3 != null) {
                                        return new FragmentPersonaStartBinding((LinearLayout) view, space, lottieAnimationView, rhTextView, appCompatImageView, rdsButton, rdsButton2, rhTextView2, rhTextView3);
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
