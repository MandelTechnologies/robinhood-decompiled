package com.robinhood.shared.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.common.p088ui.view.DotIndicators;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.shared.login.C39089R;

/* loaded from: classes6.dex */
public final class FragmentPinBinding implements ViewBinding {
    public final RdsTextButton forgotPinCta;
    public final LottieAnimationView fragmentPinAuthAdtUnlockBackground;
    public final EditText inputEdt;
    public final RdsNumpadView numpad;
    public final DotIndicators pinbar;
    public final ImageView robinhoodLogo;
    private final FrameLayout rootView;

    private FragmentPinBinding(FrameLayout frameLayout, RdsTextButton rdsTextButton, LottieAnimationView lottieAnimationView, EditText editText, RdsNumpadView rdsNumpadView, DotIndicators dotIndicators, ImageView imageView) {
        this.rootView = frameLayout;
        this.forgotPinCta = rdsTextButton;
        this.fragmentPinAuthAdtUnlockBackground = lottieAnimationView;
        this.inputEdt = editText;
        this.numpad = rdsNumpadView;
        this.pinbar = dotIndicators;
        this.robinhoodLogo = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPinBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39089R.layout.fragment_pin, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPinBinding bind(View view) {
        int i = C39089R.id.forgot_pin_cta;
        RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
        if (rdsTextButton != null) {
            i = C39089R.id.fragment_pin_auth_adt_unlock_background;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null) {
                i = C39089R.id.input_edt;
                EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
                if (editText != null) {
                    i = C39089R.id.numpad;
                    RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                    if (rdsNumpadView != null) {
                        i = C39089R.id.pinbar;
                        DotIndicators dotIndicators = (DotIndicators) ViewBindings.findChildViewById(view, i);
                        if (dotIndicators != null) {
                            i = C39089R.id.robinhood_logo;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                return new FragmentPinBinding((FrameLayout) view, rdsTextButton, lottieAnimationView, editText, rdsNumpadView, dotIndicators, imageView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
