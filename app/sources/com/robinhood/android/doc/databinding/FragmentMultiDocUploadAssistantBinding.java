package com.robinhood.android.doc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.doc.C14254R;

/* loaded from: classes7.dex */
public final class FragmentMultiDocUploadAssistantBinding implements ViewBinding {
    public final RdsButton multiDocUploadAssistantPrimaryCta;
    public final RecyclerView multiDocUploadAssistantRecyclerView;
    public final RdsButton multiDocUploadAssistantSecondaryCta;
    public final RhTextView multiDocUploadAssistantSubtitle;
    public final RhTextView multiDocUploadAssistantTitle;
    public final NestedScrollView multiDocUploadScrollView;
    public final LottieAnimationView multiDocUploadSplashAnimation;
    public final LinearLayout multiDocUploadSplashContainer;
    public final AppCompatImageView multiDocUploadSplashImage;
    private final LinearLayoutCompat rootView;

    private FragmentMultiDocUploadAssistantBinding(LinearLayoutCompat linearLayoutCompat, RdsButton rdsButton, RecyclerView recyclerView, RdsButton rdsButton2, RhTextView rhTextView, RhTextView rhTextView2, NestedScrollView nestedScrollView, LottieAnimationView lottieAnimationView, LinearLayout linearLayout, AppCompatImageView appCompatImageView) {
        this.rootView = linearLayoutCompat;
        this.multiDocUploadAssistantPrimaryCta = rdsButton;
        this.multiDocUploadAssistantRecyclerView = recyclerView;
        this.multiDocUploadAssistantSecondaryCta = rdsButton2;
        this.multiDocUploadAssistantSubtitle = rhTextView;
        this.multiDocUploadAssistantTitle = rhTextView2;
        this.multiDocUploadScrollView = nestedScrollView;
        this.multiDocUploadSplashAnimation = lottieAnimationView;
        this.multiDocUploadSplashContainer = linearLayout;
        this.multiDocUploadSplashImage = appCompatImageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static FragmentMultiDocUploadAssistantBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMultiDocUploadAssistantBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14254R.layout.fragment_multi_doc_upload_assistant, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentMultiDocUploadAssistantBinding bind(View view) {
        int i = C14254R.id.multi_doc_upload_assistant_primary_cta;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C14254R.id.multi_doc_upload_assistant_recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C14254R.id.multi_doc_upload_assistant_secondary_cta;
                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton2 != null) {
                    i = C14254R.id.multi_doc_upload_assistant_subtitle;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C14254R.id.multi_doc_upload_assistant_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C14254R.id.multi_doc_upload_scroll_view;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                            if (nestedScrollView != null) {
                                i = C14254R.id.multi_doc_upload_splash_animation;
                                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                                if (lottieAnimationView != null) {
                                    i = C14254R.id.multi_doc_upload_splash_container;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout != null) {
                                        i = C14254R.id.multi_doc_upload_splash_image;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatImageView != null) {
                                            return new FragmentMultiDocUploadAssistantBinding((LinearLayoutCompat) view, rdsButton, recyclerView, rdsButton2, rhTextView, rhTextView2, nestedScrollView, lottieAnimationView, linearLayout, appCompatImageView);
                                        }
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
