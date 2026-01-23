package com.withpersona.sdk2.inquiry.shared.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.withpersona.sdk2.inquiry.shared.R$layout;
import com.withpersona.sdk2.inquiry.shared.p422ui.ThemeableLottieAnimationView;

/* loaded from: classes18.dex */
public final class Pi2UiImageLottieBinding implements ViewBinding {
    public final ThemeableLottieAnimationView lottieView;
    private final ThemeableLottieAnimationView rootView;

    private Pi2UiImageLottieBinding(ThemeableLottieAnimationView themeableLottieAnimationView, ThemeableLottieAnimationView themeableLottieAnimationView2) {
        this.rootView = themeableLottieAnimationView;
        this.lottieView = themeableLottieAnimationView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ThemeableLottieAnimationView getRoot() {
        return this.rootView;
    }

    public static Pi2UiImageLottieBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static Pi2UiImageLottieBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_ui_image_lottie, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2UiImageLottieBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) view;
        return new Pi2UiImageLottieBinding(themeableLottieAnimationView, themeableLottieAnimationView);
    }
}
