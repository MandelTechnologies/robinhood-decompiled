package com.robinhood.shared.support.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.shared.support.C39996R;

/* loaded from: classes6.dex */
public final class FragmentContactSupportHybridBinding implements ViewBinding {
    public final ErrorView contactSupportErrorView;
    public final RdsProgressBar inquiryLoadingView;
    public final FrameLayout pathfinderContainer;
    private final FrameLayout rootView;

    private FragmentContactSupportHybridBinding(FrameLayout frameLayout, ErrorView errorView, RdsProgressBar rdsProgressBar, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.contactSupportErrorView = errorView;
        this.inquiryLoadingView = rdsProgressBar;
        this.pathfinderContainer = frameLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentContactSupportHybridBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentContactSupportHybridBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39996R.layout.fragment_contact_support_hybrid, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentContactSupportHybridBinding bind(View view) {
        int i = C39996R.id.contact_support_error_view;
        ErrorView errorView = (ErrorView) ViewBindings.findChildViewById(view, i);
        if (errorView != null) {
            i = C39996R.id.inquiry_loading_view;
            RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
            if (rdsProgressBar != null) {
                i = C39996R.id.pathfinder_container;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    return new FragmentContactSupportHybridBinding((FrameLayout) view, errorView, rdsProgressBar, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
