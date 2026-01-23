package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.view.LoadingView;

/* loaded from: classes2.dex */
public final class ReplaceOptionOrderDialogFragmentBinding implements ViewBinding {
    public final LoadingView loadingView;
    private final FrameLayout rootView;

    private ReplaceOptionOrderDialogFragmentBinding(FrameLayout frameLayout, LoadingView loadingView) {
        this.rootView = frameLayout;
        this.loadingView = loadingView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ReplaceOptionOrderDialogFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ReplaceOptionOrderDialogFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11048R.layout.replace_option_order_dialog_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ReplaceOptionOrderDialogFragmentBinding bind(View view) {
        int i = C11048R.id.loading_view;
        LoadingView loadingView = (LoadingView) ViewBindings.findChildViewById(view, i);
        if (loadingView != null) {
            return new ReplaceOptionOrderDialogFragmentBinding((FrameLayout) view, loadingView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
