package com.robinhood.android.rhy.cardactivation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.rhy.cardactivation.C27358R;

/* loaded from: classes5.dex */
public final class FragmentCardActivationSplashBinding implements ViewBinding {
    public final ImageView cardActivationSplashDebitCardView;
    public final RdsButton continueBtn;
    private final LinearLayout rootView;

    private FragmentCardActivationSplashBinding(LinearLayout linearLayout, ImageView imageView, RdsButton rdsButton) {
        this.rootView = linearLayout;
        this.cardActivationSplashDebitCardView = imageView;
        this.continueBtn = rdsButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCardActivationSplashBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCardActivationSplashBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27358R.layout.fragment_card_activation_splash, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCardActivationSplashBinding bind(View view) {
        int i = C27358R.id.card_activation_splash_debit_card_view;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C27358R.id.continue_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                return new FragmentCardActivationSplashBinding((LinearLayout) view, imageView, rdsButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
