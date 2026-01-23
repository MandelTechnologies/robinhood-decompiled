package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdButton;
import com.robinhood.android.odyssey.lib.view.SdImageView;
import com.robinhood.android.odyssey.lib.view.SdTextView;

/* loaded from: classes8.dex */
public final class FragmentSdSplashBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final SdButton sdSplashCta;
    public final SdImageView sdSplashImageHeader;
    public final SdTextView sdSplashSubtitle;
    public final SdTextView sdSplashTitle;

    private FragmentSdSplashBinding(LinearLayout linearLayout, SdButton sdButton, SdImageView sdImageView, SdTextView sdTextView, SdTextView sdTextView2) {
        this.rootView = linearLayout;
        this.sdSplashCta = sdButton;
        this.sdSplashImageHeader = sdImageView;
        this.sdSplashSubtitle = sdTextView;
        this.sdSplashTitle = sdTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSdSplashBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSdSplashBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.fragment_sd_splash, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSdSplashBinding bind(View view) {
        int i = C20335R.id.sd_splash_cta;
        SdButton sdButton = (SdButton) ViewBindings.findChildViewById(view, i);
        if (sdButton != null) {
            i = C20335R.id.sd_splash_image_header;
            SdImageView sdImageView = (SdImageView) ViewBindings.findChildViewById(view, i);
            if (sdImageView != null) {
                i = C20335R.id.sd_splash_subtitle;
                SdTextView sdTextView = (SdTextView) ViewBindings.findChildViewById(view, i);
                if (sdTextView != null) {
                    i = C20335R.id.sd_splash_title;
                    SdTextView sdTextView2 = (SdTextView) ViewBindings.findChildViewById(view, i);
                    if (sdTextView2 != null) {
                        return new FragmentSdSplashBinding((LinearLayout) view, sdButton, sdImageView, sdTextView, sdTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
