package com.robinhood.android.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.widget.C31480R;

/* loaded from: classes9.dex */
public final class WidgetErrorUnauthenticatedBinding implements ViewBinding {
    private final FrameLayout rootView;
    public final TextView widgetErrorTxt;
    public final ImageButton widgetRefreshBtn;
    public final FrameLayout widgetRoot;

    private WidgetErrorUnauthenticatedBinding(FrameLayout frameLayout, TextView textView, ImageButton imageButton, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.widgetErrorTxt = textView;
        this.widgetRefreshBtn = imageButton;
        this.widgetRoot = frameLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static WidgetErrorUnauthenticatedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static WidgetErrorUnauthenticatedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31480R.layout.widget_error_unauthenticated, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static WidgetErrorUnauthenticatedBinding bind(View view) {
        int i = C31480R.id.widget_error_txt;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C31480R.id.widget_refresh_btn;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
            if (imageButton != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                return new WidgetErrorUnauthenticatedBinding(frameLayout, textView, imageButton, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
