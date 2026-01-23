package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdMarkdownView;

/* loaded from: classes8.dex */
public final class RowSdMarkdownSubComponentBinding implements ViewBinding {
    private final SdMarkdownView rootView;
    public final SdMarkdownView sdMarkdownSubComponentView;

    private RowSdMarkdownSubComponentBinding(SdMarkdownView sdMarkdownView, SdMarkdownView sdMarkdownView2) {
        this.rootView = sdMarkdownView;
        this.sdMarkdownSubComponentView = sdMarkdownView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SdMarkdownView getRoot() {
        return this.rootView;
    }

    public static RowSdMarkdownSubComponentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowSdMarkdownSubComponentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.row_sd_markdown_sub_component, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowSdMarkdownSubComponentBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SdMarkdownView sdMarkdownView = (SdMarkdownView) view;
        return new RowSdMarkdownSubComponentBinding(sdMarkdownView, sdMarkdownView);
    }
}
