package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.C11048R;

/* loaded from: classes2.dex */
public final class AppContainerFrameWithBannerBinding implements ViewBinding {
    public final FrameLayout appContentFrame;
    public final ViewStub mainBanner;
    private final LinearLayout rootView;

    private AppContainerFrameWithBannerBinding(LinearLayout linearLayout, FrameLayout frameLayout, ViewStub viewStub) {
        this.rootView = linearLayout;
        this.appContentFrame = frameLayout;
        this.mainBanner = viewStub;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static AppContainerFrameWithBannerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppContainerFrameWithBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11048R.layout.app_container_frame_with_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static AppContainerFrameWithBannerBinding bind(View view) {
        int i = C11048R.id.app_content_frame;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C11048R.id.main_banner;
            ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, i);
            if (viewStub != null) {
                return new AppContainerFrameWithBannerBinding((LinearLayout) view, frameLayout, viewStub);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
