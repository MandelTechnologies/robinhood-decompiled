package com.robinhood.android.lib.webview.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.webview.C20684R;

/* loaded from: classes8.dex */
public final class MergeWebLoadingViewBinding implements ViewBinding {
    public final RdsButton debugFinish;
    public final LinearLayout debugPanel;
    public final RhTextView debugProgressText;
    public final RdsButton debugStart10s;
    public final RdsButton debugStart30s;
    public final RdsButton debugStartIndeterminate;
    public final LottieAnimationView loadingLottie;
    public final RhTextView loadingMessage;
    private final View rootView;

    private MergeWebLoadingViewBinding(View view, RdsButton rdsButton, LinearLayout linearLayout, RhTextView rhTextView, RdsButton rdsButton2, RdsButton rdsButton3, RdsButton rdsButton4, LottieAnimationView lottieAnimationView, RhTextView rhTextView2) {
        this.rootView = view;
        this.debugFinish = rdsButton;
        this.debugPanel = linearLayout;
        this.debugProgressText = rhTextView;
        this.debugStart10s = rdsButton2;
        this.debugStart30s = rdsButton3;
        this.debugStartIndeterminate = rdsButton4;
        this.loadingLottie = lottieAnimationView;
        this.loadingMessage = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeWebLoadingViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C20684R.layout.merge_web_loading_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeWebLoadingViewBinding bind(View view) {
        int i = C20684R.id.debug_finish;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C20684R.id.debug_panel;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C20684R.id.debug_progress_text;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C20684R.id.debug_start_10s;
                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton2 != null) {
                        i = C20684R.id.debug_start_30s;
                        RdsButton rdsButton3 = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton3 != null) {
                            i = C20684R.id.debug_start_indeterminate;
                            RdsButton rdsButton4 = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton4 != null) {
                                i = C20684R.id.loading_lottie;
                                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                                if (lottieAnimationView != null) {
                                    i = C20684R.id.loading_message;
                                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView2 != null) {
                                        return new MergeWebLoadingViewBinding(view, rdsButton, linearLayout, rhTextView, rdsButton2, rdsButton3, rdsButton4, lottieAnimationView, rhTextView2);
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
