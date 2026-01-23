package com.robinhood.android.banking.lib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.banking.p065ui.DebitCardUserStatusBannerView;

/* loaded from: classes7.dex */
public final class IncludeDebitCardUserStatusBannerViewBinding implements ViewBinding {
    public final FrameLayout debitCardUserStatusBanner;
    public final DebitCardUserStatusBannerView debitCardUserStatusBannerView;
    private final FrameLayout rootView;

    private IncludeDebitCardUserStatusBannerViewBinding(FrameLayout frameLayout, FrameLayout frameLayout2, DebitCardUserStatusBannerView debitCardUserStatusBannerView) {
        this.rootView = frameLayout;
        this.debitCardUserStatusBanner = frameLayout2;
        this.debitCardUserStatusBannerView = debitCardUserStatusBannerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IncludeDebitCardUserStatusBannerViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeDebitCardUserStatusBannerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C9631R.layout.include_debit_card_user_status_banner_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeDebitCardUserStatusBannerViewBinding bind(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = C9631R.id.debit_card_user_status_banner_view;
        DebitCardUserStatusBannerView debitCardUserStatusBannerView = (DebitCardUserStatusBannerView) ViewBindings.findChildViewById(view, i);
        if (debitCardUserStatusBannerView != null) {
            return new IncludeDebitCardUserStatusBannerViewBinding(frameLayout, frameLayout, debitCardUserStatusBannerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
