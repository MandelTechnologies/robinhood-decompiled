package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.C11048R;

/* loaded from: classes2.dex */
public final class DialogWebviewBinding implements ViewBinding {
    public final Button copyButton;
    private final ConstraintLayout rootView;
    public final Button shareButton;
    public final WebView webView;

    private DialogWebviewBinding(ConstraintLayout constraintLayout, Button button, Button button2, WebView webView) {
        this.rootView = constraintLayout;
        this.copyButton = button;
        this.shareButton = button2;
        this.webView = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogWebviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogWebviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11048R.layout.dialog_webview, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static DialogWebviewBinding bind(View view) {
        int i = C11048R.id.copy_button;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = C11048R.id.share_button;
            Button button2 = (Button) ViewBindings.findChildViewById(view, i);
            if (button2 != null) {
                i = C11048R.id.webView;
                WebView webView = (WebView) ViewBindings.findChildViewById(view, i);
                if (webView != null) {
                    return new DialogWebviewBinding((ConstraintLayout) view, button, button2, webView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
