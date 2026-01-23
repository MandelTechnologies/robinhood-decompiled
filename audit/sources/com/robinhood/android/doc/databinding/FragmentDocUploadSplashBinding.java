package com.robinhood.android.doc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.doc.C14254R;

/* loaded from: classes7.dex */
public final class FragmentDocUploadSplashBinding implements ViewBinding {
    public final LinearLayout docUploadSplashButtons;
    public final RhTextView docUploadSplashMessage;
    public final RdsButton docUploadSplashPrimaryCta;
    public final ScrollView docUploadSplashScrollView;
    public final RdsButton docUploadSplashSecondaryCta;
    public final RhTextView docUploadSplashTitle;
    private final ConstraintLayout rootView;

    private FragmentDocUploadSplashBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, RhTextView rhTextView, RdsButton rdsButton, ScrollView scrollView, RdsButton rdsButton2, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.docUploadSplashButtons = linearLayout;
        this.docUploadSplashMessage = rhTextView;
        this.docUploadSplashPrimaryCta = rdsButton;
        this.docUploadSplashScrollView = scrollView;
        this.docUploadSplashSecondaryCta = rdsButton2;
        this.docUploadSplashTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDocUploadSplashBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDocUploadSplashBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14254R.layout.fragment_doc_upload_splash, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDocUploadSplashBinding bind(View view) {
        int i = C14254R.id.doc_upload_splash_buttons;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C14254R.id.doc_upload_splash_message;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C14254R.id.doc_upload_splash_primary_cta;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C14254R.id.doc_upload_splash_scroll_view;
                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                    if (scrollView != null) {
                        i = C14254R.id.doc_upload_splash_secondary_cta;
                        RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton2 != null) {
                            i = C14254R.id.doc_upload_splash_title;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                return new FragmentDocUploadSplashBinding((ConstraintLayout) view, linearLayout, rhTextView, rdsButton, scrollView, rdsButton2, rhTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
