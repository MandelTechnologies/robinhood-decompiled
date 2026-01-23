package com.robinhood.android.trade.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.recommendations.C29895R;

/* loaded from: classes9.dex */
public final class IncludeRecommendationsDisclosuresToolbarContentBinding implements ViewBinding {
    public final FrameLayout recsDisclosuresToolbarContent;
    private final FrameLayout rootView;
    public final RhTextView toolbarTitle;

    private IncludeRecommendationsDisclosuresToolbarContentBinding(FrameLayout frameLayout, FrameLayout frameLayout2, RhTextView rhTextView) {
        this.rootView = frameLayout;
        this.recsDisclosuresToolbarContent = frameLayout2;
        this.toolbarTitle = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IncludeRecommendationsDisclosuresToolbarContentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRecommendationsDisclosuresToolbarContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29895R.layout.include_recommendations_disclosures_toolbar_content, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRecommendationsDisclosuresToolbarContentBinding bind(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = C29895R.id.toolbar_title;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            return new IncludeRecommendationsDisclosuresToolbarContentBinding(frameLayout, frameLayout, rhTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
