package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.TopNavInboxButtonView;
import com.robinhood.android.common.p088ui.view.TopNavButtonView;
import com.robinhood.android.search.C27909R;

/* loaded from: classes5.dex */
public final class NewsfeedFragmentToolbarBinding implements ViewBinding {
    public final ConstraintLayout newsfeedToolbarContainer;
    public final TopNavInboxButtonView newsfeedToolbarInboxButton;
    public final TopNavButtonView newsfeedToolbarSearchButton;
    private final ConstraintLayout rootView;

    private NewsfeedFragmentToolbarBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TopNavInboxButtonView topNavInboxButtonView, TopNavButtonView topNavButtonView) {
        this.rootView = constraintLayout;
        this.newsfeedToolbarContainer = constraintLayout2;
        this.newsfeedToolbarInboxButton = topNavInboxButtonView;
        this.newsfeedToolbarSearchButton = topNavButtonView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static NewsfeedFragmentToolbarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static NewsfeedFragmentToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.newsfeed_fragment_toolbar, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static NewsfeedFragmentToolbarBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C27909R.id.newsfeed_toolbar_inbox_button;
        TopNavInboxButtonView topNavInboxButtonView = (TopNavInboxButtonView) ViewBindings.findChildViewById(view, i);
        if (topNavInboxButtonView != null) {
            i = C27909R.id.newsfeed_toolbar_search_button;
            TopNavButtonView topNavButtonView = (TopNavButtonView) ViewBindings.findChildViewById(view, i);
            if (topNavButtonView != null) {
                return new NewsfeedFragmentToolbarBinding(constraintLayout, constraintLayout, topNavInboxButtonView, topNavButtonView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
