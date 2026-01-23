package com.robinhood.android.accountcenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class ReferralCallToActionViewsBinding implements ViewBinding {
    public final ImageView referralCtaIcon;
    public final RhTextView referralCtaText;
    private final View rootView;

    private ReferralCallToActionViewsBinding(View view, ImageView imageView, RhTextView rhTextView) {
        this.rootView = view;
        this.referralCtaIcon = imageView;
        this.referralCtaText = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static ReferralCallToActionViewsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C8293R.layout.referral_call_to_action_views, viewGroup);
        return bind(viewGroup);
    }

    public static ReferralCallToActionViewsBinding bind(View view) {
        int i = C8293R.id.referral_cta_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C8293R.id.referral_cta_text;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new ReferralCallToActionViewsBinding(view, imageView, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
