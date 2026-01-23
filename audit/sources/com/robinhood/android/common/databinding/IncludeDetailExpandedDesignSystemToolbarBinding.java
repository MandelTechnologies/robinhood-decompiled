package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class IncludeDetailExpandedDesignSystemToolbarBinding implements ViewBinding {
    public final LinearLayout expandedToolbar;
    public final ImageView expandedToolbarIcon;
    public final RhTextView expandedToolbarSubtitleTxt;
    public final RhTextView expandedToolbarTitleTxt;
    private final LinearLayout rootView;

    private IncludeDetailExpandedDesignSystemToolbarBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.expandedToolbar = linearLayout2;
        this.expandedToolbarIcon = imageView;
        this.expandedToolbarSubtitleTxt = rhTextView;
        this.expandedToolbarTitleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IncludeDetailExpandedDesignSystemToolbarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeDetailExpandedDesignSystemToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11048R.layout.include_detail_expanded_design_system_toolbar, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeDetailExpandedDesignSystemToolbarBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = C11048R.id.expanded_toolbar_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C11048R.id.expanded_toolbar_subtitle_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C11048R.id.expanded_toolbar_title_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new IncludeDetailExpandedDesignSystemToolbarBinding(linearLayout, linearLayout, imageView, rhTextView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
