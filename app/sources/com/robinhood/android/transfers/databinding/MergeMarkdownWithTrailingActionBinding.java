package com.robinhood.android.transfers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.transfers.C30065R;

/* loaded from: classes9.dex */
public final class MergeMarkdownWithTrailingActionBinding implements ViewBinding {
    public final ComposeView markdownWithTrailingActionComposeView;
    private final View rootView;

    private MergeMarkdownWithTrailingActionBinding(View view, ComposeView composeView) {
        this.rootView = view;
        this.markdownWithTrailingActionComposeView = composeView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeMarkdownWithTrailingActionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C30065R.layout.merge_markdown_with_trailing_action, viewGroup);
        return bind(viewGroup);
    }

    public static MergeMarkdownWithTrailingActionBinding bind(View view) {
        int i = C30065R.id.markdown_with_trailing_action_compose_view;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            return new MergeMarkdownWithTrailingActionBinding(view, composeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
