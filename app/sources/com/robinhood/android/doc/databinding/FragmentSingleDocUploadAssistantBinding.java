package com.robinhood.android.doc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.doc.C14254R;

/* loaded from: classes7.dex */
public final class FragmentSingleDocUploadAssistantBinding implements ViewBinding {
    private final LinearLayoutCompat rootView;
    public final RdsButton singleDocUploadAssistantPrimaryCta;
    public final RdsButton singleDocUploadAssistantSecondaryCta;
    public final RhTextView singleDocUploadAssistantSubtitle;
    public final RhTextView singleDocUploadAssistantTitle;
    public final LottieAnimationView singleDocUploadSplashAnimation;
    public final AppCompatImageView singleDocUploadSplashImage;

    private FragmentSingleDocUploadAssistantBinding(LinearLayoutCompat linearLayoutCompat, RdsButton rdsButton, RdsButton rdsButton2, RhTextView rhTextView, RhTextView rhTextView2, LottieAnimationView lottieAnimationView, AppCompatImageView appCompatImageView) {
        this.rootView = linearLayoutCompat;
        this.singleDocUploadAssistantPrimaryCta = rdsButton;
        this.singleDocUploadAssistantSecondaryCta = rdsButton2;
        this.singleDocUploadAssistantSubtitle = rhTextView;
        this.singleDocUploadAssistantTitle = rhTextView2;
        this.singleDocUploadSplashAnimation = lottieAnimationView;
        this.singleDocUploadSplashImage = appCompatImageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static FragmentSingleDocUploadAssistantBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSingleDocUploadAssistantBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14254R.layout.fragment_single_doc_upload_assistant, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSingleDocUploadAssistantBinding bind(View view) {
        int i = C14254R.id.single_doc_upload_assistant_primary_cta;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C14254R.id.single_doc_upload_assistant_secondary_cta;
            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton2 != null) {
                i = C14254R.id.single_doc_upload_assistant_subtitle;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C14254R.id.single_doc_upload_assistant_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C14254R.id.single_doc_upload_splash_animation;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                        if (lottieAnimationView != null) {
                            i = C14254R.id.single_doc_upload_splash_image;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView != null) {
                                return new FragmentSingleDocUploadAssistantBinding((LinearLayoutCompat) view, rdsButton, rdsButton2, rhTextView, rhTextView2, lottieAnimationView, appCompatImageView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
