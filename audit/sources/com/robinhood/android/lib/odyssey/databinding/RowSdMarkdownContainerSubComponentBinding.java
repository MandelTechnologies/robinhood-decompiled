package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdMarkdownContainerView;

/* loaded from: classes8.dex */
public final class RowSdMarkdownContainerSubComponentBinding implements ViewBinding {
    private final SdMarkdownContainerView rootView;
    public final SdMarkdownContainerView sdMarkdownContainerSubComponentView;
    public final RhTextView sdMarkdownContainerText;

    private RowSdMarkdownContainerSubComponentBinding(SdMarkdownContainerView sdMarkdownContainerView, SdMarkdownContainerView sdMarkdownContainerView2, RhTextView rhTextView) {
        this.rootView = sdMarkdownContainerView;
        this.sdMarkdownContainerSubComponentView = sdMarkdownContainerView2;
        this.sdMarkdownContainerText = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SdMarkdownContainerView getRoot() {
        return this.rootView;
    }

    public static RowSdMarkdownContainerSubComponentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowSdMarkdownContainerSubComponentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.row_sd_markdown_container_sub_component, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowSdMarkdownContainerSubComponentBinding bind(View view) {
        SdMarkdownContainerView sdMarkdownContainerView = (SdMarkdownContainerView) view;
        int i = C20335R.id.sd_markdown_container_text;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            return new RowSdMarkdownContainerSubComponentBinding(sdMarkdownContainerView, sdMarkdownContainerView, rhTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
