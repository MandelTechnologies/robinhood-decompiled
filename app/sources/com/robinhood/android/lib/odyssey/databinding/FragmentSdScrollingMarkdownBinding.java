package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdButton;
import com.robinhood.android.odyssey.lib.view.SdScrollViewer;
import com.robinhood.android.odyssey.lib.view.SdTextView;

/* loaded from: classes8.dex */
public final class FragmentSdScrollingMarkdownBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final LinearLayout sdScrollingMarkdownPanel;
    public final SdTextView sdScrollingMarkdownPanelText;
    public final SdButton sdScrollingMarkdownPrimaryCta;
    public final SdScrollViewer sdScrollingMarkdownScrollViewer;
    public final SdButton sdScrollingMarkdownSecondaryCta;

    private FragmentSdScrollingMarkdownBinding(LinearLayout linearLayout, LinearLayout linearLayout2, SdTextView sdTextView, SdButton sdButton, SdScrollViewer sdScrollViewer, SdButton sdButton2) {
        this.rootView = linearLayout;
        this.sdScrollingMarkdownPanel = linearLayout2;
        this.sdScrollingMarkdownPanelText = sdTextView;
        this.sdScrollingMarkdownPrimaryCta = sdButton;
        this.sdScrollingMarkdownScrollViewer = sdScrollViewer;
        this.sdScrollingMarkdownSecondaryCta = sdButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSdScrollingMarkdownBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSdScrollingMarkdownBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.fragment_sd_scrolling_markdown, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSdScrollingMarkdownBinding bind(View view) {
        int i = C20335R.id.sd_scrolling_markdown_panel;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C20335R.id.sd_scrolling_markdown_panel_text;
            SdTextView sdTextView = (SdTextView) ViewBindings.findChildViewById(view, i);
            if (sdTextView != null) {
                i = C20335R.id.sd_scrolling_markdown_primary_cta;
                SdButton sdButton = (SdButton) ViewBindings.findChildViewById(view, i);
                if (sdButton != null) {
                    i = C20335R.id.sd_scrolling_markdown_scroll_viewer;
                    SdScrollViewer sdScrollViewer = (SdScrollViewer) ViewBindings.findChildViewById(view, i);
                    if (sdScrollViewer != null) {
                        i = C20335R.id.sd_scrolling_markdown_secondary_cta;
                        SdButton sdButton2 = (SdButton) ViewBindings.findChildViewById(view, i);
                        if (sdButton2 != null) {
                            return new FragmentSdScrollingMarkdownBinding((LinearLayout) view, linearLayout, sdTextView, sdButton, sdScrollViewer, sdButton2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
