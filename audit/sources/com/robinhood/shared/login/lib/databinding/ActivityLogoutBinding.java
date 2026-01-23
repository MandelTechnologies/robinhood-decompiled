package com.robinhood.shared.login.lib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.view.LoadingView;
import com.robinhood.shared.login.lib.C39090R;

/* loaded from: classes6.dex */
public final class ActivityLogoutBinding implements ViewBinding {
    public final LoadingView loadingView;
    private final LoadingView rootView;

    private ActivityLogoutBinding(LoadingView loadingView, LoadingView loadingView2) {
        this.rootView = loadingView;
        this.loadingView = loadingView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LoadingView getRoot() {
        return this.rootView;
    }

    public static ActivityLogoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityLogoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39090R.layout.activity_logout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityLogoutBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        LoadingView loadingView = (LoadingView) view;
        return new ActivityLogoutBinding(loadingView, loadingView);
    }
}
