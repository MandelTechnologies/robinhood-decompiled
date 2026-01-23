package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.stripe3ds2.R$id;
import com.stripe.android.stripe3ds2.R$layout;
import com.stripe.android.stripe3ds2.views.ThreeDS2WebView;

/* loaded from: classes26.dex */
public final class StripeChallengeZoneWebViewBinding implements ViewBinding {
    private final View rootView;
    public final ThreeDS2WebView webView;

    private StripeChallengeZoneWebViewBinding(View view, ThreeDS2WebView threeDS2WebView) {
        this.rootView = view;
        this.webView = threeDS2WebView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static StripeChallengeZoneWebViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.stripe_challenge_zone_web_view, viewGroup);
        return bind(viewGroup);
    }

    public static StripeChallengeZoneWebViewBinding bind(View view) {
        int i = R$id.web_view;
        ThreeDS2WebView threeDS2WebView = (ThreeDS2WebView) ViewBindings.findChildViewById(view, i);
        if (threeDS2WebView != null) {
            return new StripeChallengeZoneWebViewBinding(view, threeDS2WebView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
