package com.robinhood.android.lib.pathfinder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.lib.pathfinder.C20366R;
import com.robinhood.android.lib.pathfinder.views.PathfinderWebView;
import com.robinhood.android.lib.webview.view.WebErrorView;
import com.robinhood.android.lib.webview.view.WebLoadingView;

/* loaded from: classes8.dex */
public final class FragmentPathfinderBinding implements ViewBinding {
    public final FrameLayout fragmentContainer;
    public final RdsProgressBar loadingProgressBar;
    public final FrameLayout newWebviewContainer;
    public final FrameLayout pathfinderContainer;
    public final WebErrorView pathfinderWebErrorView;
    public final WebLoadingView pathfinderWebLoadingView;
    public final PathfinderWebView pathfinderWebview;
    private final FrameLayout rootView;

    private FragmentPathfinderBinding(FrameLayout frameLayout, FrameLayout frameLayout2, RdsProgressBar rdsProgressBar, FrameLayout frameLayout3, FrameLayout frameLayout4, WebErrorView webErrorView, WebLoadingView webLoadingView, PathfinderWebView pathfinderWebView) {
        this.rootView = frameLayout;
        this.fragmentContainer = frameLayout2;
        this.loadingProgressBar = rdsProgressBar;
        this.newWebviewContainer = frameLayout3;
        this.pathfinderContainer = frameLayout4;
        this.pathfinderWebErrorView = webErrorView;
        this.pathfinderWebLoadingView = webLoadingView;
        this.pathfinderWebview = pathfinderWebView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPathfinderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPathfinderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20366R.layout.fragment_pathfinder, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPathfinderBinding bind(View view) {
        int i = C20366R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C20366R.id.loading_progress_bar;
            RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
            if (rdsProgressBar != null) {
                i = C20366R.id.new_webview_container;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null) {
                    FrameLayout frameLayout3 = (FrameLayout) view;
                    i = C20366R.id.pathfinder_web_error_view;
                    WebErrorView webErrorView = (WebErrorView) ViewBindings.findChildViewById(view, i);
                    if (webErrorView != null) {
                        i = C20366R.id.pathfinder_web_loading_view;
                        WebLoadingView webLoadingView = (WebLoadingView) ViewBindings.findChildViewById(view, i);
                        if (webLoadingView != null) {
                            i = C20366R.id.pathfinder_webview;
                            PathfinderWebView pathfinderWebView = (PathfinderWebView) ViewBindings.findChildViewById(view, i);
                            if (pathfinderWebView != null) {
                                return new FragmentPathfinderBinding(frameLayout3, frameLayout, rdsProgressBar, frameLayout2, frameLayout3, webErrorView, webLoadingView, pathfinderWebView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
