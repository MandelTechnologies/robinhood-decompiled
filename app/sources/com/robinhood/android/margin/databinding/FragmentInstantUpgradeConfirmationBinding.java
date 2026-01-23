package com.robinhood.android.margin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.margin.C20999R;

/* loaded from: classes8.dex */
public final class FragmentInstantUpgradeConfirmationBinding implements ViewBinding {
    public final FrameLayout header;
    public final RdsPogView headerPog;
    public final ShimmerLoadingView loadingView;
    public final RhTextView messageTxt;
    public final RdsButton positiveBtn;
    private final FrameLayout rootView;
    public final ImageView successImage;
    public final RhTextView titleTxt;

    private FragmentInstantUpgradeConfirmationBinding(FrameLayout frameLayout, FrameLayout frameLayout2, RdsPogView rdsPogView, ShimmerLoadingView shimmerLoadingView, RhTextView rhTextView, RdsButton rdsButton, ImageView imageView, RhTextView rhTextView2) {
        this.rootView = frameLayout;
        this.header = frameLayout2;
        this.headerPog = rdsPogView;
        this.loadingView = shimmerLoadingView;
        this.messageTxt = rhTextView;
        this.positiveBtn = rdsButton;
        this.successImage = imageView;
        this.titleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentInstantUpgradeConfirmationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentInstantUpgradeConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20999R.layout.fragment_instant_upgrade_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentInstantUpgradeConfirmationBinding bind(View view) {
        int i = C20999R.id.header;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C20999R.id.header_pog;
            RdsPogView rdsPogView = (RdsPogView) ViewBindings.findChildViewById(view, i);
            if (rdsPogView != null) {
                i = C20999R.id.loading_view;
                ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                if (shimmerLoadingView != null) {
                    i = C20999R.id.message_txt;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C20999R.id.positive_btn;
                        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton != null) {
                            i = C20999R.id.success_image;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = C20999R.id.title_txt;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    return new FragmentInstantUpgradeConfirmationBinding((FrameLayout) view, frameLayout, rdsPogView, shimmerLoadingView, rhTextView, rdsButton, imageView, rhTextView2);
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
