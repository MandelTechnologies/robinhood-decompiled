package com.robinhood.android.cash.rhy.tab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.common.p088ui.TopNavInboxButtonView;
import com.robinhood.android.common.p088ui.view.TopNavButtonView;

/* loaded from: classes7.dex */
public final class RhyCommonFragmentToolbarBinding implements ViewBinding {
    public final ConstraintLayout rhyCommonToolbarContainer;
    public final TopNavInboxButtonView rhyCommonToolbarInboxButton;
    public final TopNavButtonView rhyCommonToolbarSearchButton;
    private final ConstraintLayout rootView;

    private RhyCommonFragmentToolbarBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TopNavInboxButtonView topNavInboxButtonView, TopNavButtonView topNavButtonView) {
        this.rootView = constraintLayout;
        this.rhyCommonToolbarContainer = constraintLayout2;
        this.rhyCommonToolbarInboxButton = topNavInboxButtonView;
        this.rhyCommonToolbarSearchButton = topNavButtonView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static RhyCommonFragmentToolbarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RhyCommonFragmentToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10285R.layout.rhy_common_fragment_toolbar, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RhyCommonFragmentToolbarBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C10285R.id.rhy_common_toolbar_inbox_button;
        TopNavInboxButtonView topNavInboxButtonView = (TopNavInboxButtonView) ViewBindings.findChildViewById(view, i);
        if (topNavInboxButtonView != null) {
            i = C10285R.id.rhy_common_toolbar_search_button;
            TopNavButtonView topNavButtonView = (TopNavButtonView) ViewBindings.findChildViewById(view, i);
            if (topNavButtonView != null) {
                return new RhyCommonFragmentToolbarBinding(constraintLayout, constraintLayout, topNavInboxButtonView, topNavButtonView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
