package com.robinhood.android.settings.p254ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.settings.p254ui.C28356R;
import com.robinhood.android.settings.p254ui.MarkdownView;

/* loaded from: classes5.dex */
public final class IncludeMarkdownViewBinding implements ViewBinding {
    private final MarkdownView rootView;

    private IncludeMarkdownViewBinding(MarkdownView markdownView) {
        this.rootView = markdownView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public MarkdownView getRoot() {
        return this.rootView;
    }

    public static IncludeMarkdownViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeMarkdownViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28356R.layout.include_markdown_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeMarkdownViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeMarkdownViewBinding((MarkdownView) view);
    }
}
