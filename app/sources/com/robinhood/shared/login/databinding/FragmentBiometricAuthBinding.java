package com.robinhood.shared.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.shared.login.C39089R;

/* loaded from: classes6.dex */
public final class FragmentBiometricAuthBinding implements ViewBinding {
    public final LottieAnimationView fragmentBiometricAuthAdtUnlockBackground;
    public final RdsButton fragmentBiometricAuthBackupAuthButton;
    public final RdsButton fragmentBiometricAuthPrimaryButton;
    public final RdsButton fragmentBiometricAuthSecondaryButton;
    public final ImageView fragmentBiometricRobinhoodLogo;
    private final ConstraintLayout rootView;

    private FragmentBiometricAuthBinding(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, RdsButton rdsButton, RdsButton rdsButton2, RdsButton rdsButton3, ImageView imageView) {
        this.rootView = constraintLayout;
        this.fragmentBiometricAuthAdtUnlockBackground = lottieAnimationView;
        this.fragmentBiometricAuthBackupAuthButton = rdsButton;
        this.fragmentBiometricAuthPrimaryButton = rdsButton2;
        this.fragmentBiometricAuthSecondaryButton = rdsButton3;
        this.fragmentBiometricRobinhoodLogo = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentBiometricAuthBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBiometricAuthBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39089R.layout.fragment_biometric_auth, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentBiometricAuthBinding bind(View view) {
        int i = C39089R.id.fragment_biometric_auth_adt_unlock_background;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = C39089R.id.fragment_biometric_auth_backup_auth_button;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C39089R.id.fragment_biometric_auth_primary_button;
                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton2 != null) {
                    i = C39089R.id.fragment_biometric_auth_secondary_button;
                    RdsButton rdsButton3 = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton3 != null) {
                        i = C39089R.id.fragment_biometric_robinhood_logo;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            return new FragmentBiometricAuthBinding((ConstraintLayout) view, lottieAnimationView, rdsButton, rdsButton2, rdsButton3, imageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
