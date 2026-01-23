package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.view.DynamicallyThemableToolbar;

/* loaded from: classes2.dex */
public final class MergeToolbarBinding implements ViewBinding {
    private final View rootView;
    public final DynamicallyThemableToolbar toolbar;
    public final FrameLayout toolbarLoadingView;
    public final ViewStub toolbarProgressBarViewStub;

    private MergeToolbarBinding(View view, DynamicallyThemableToolbar dynamicallyThemableToolbar, FrameLayout frameLayout, ViewStub viewStub) {
        this.rootView = view;
        this.toolbar = dynamicallyThemableToolbar;
        this.toolbarLoadingView = frameLayout;
        this.toolbarProgressBarViewStub = viewStub;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11048R.layout.merge_toolbar, viewGroup);
        return bind(viewGroup);
    }

    public static MergeToolbarBinding bind(View view) {
        int i = C11048R.id.toolbar;
        DynamicallyThemableToolbar dynamicallyThemableToolbar = (DynamicallyThemableToolbar) ViewBindings.findChildViewById(view, i);
        if (dynamicallyThemableToolbar != null) {
            i = C11048R.id.toolbar_loading_view;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C11048R.id.toolbar_progress_bar_view_stub;
                ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, i);
                if (viewStub != null) {
                    return new MergeToolbarBinding(view, dynamicallyThemableToolbar, frameLayout, viewStub);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
