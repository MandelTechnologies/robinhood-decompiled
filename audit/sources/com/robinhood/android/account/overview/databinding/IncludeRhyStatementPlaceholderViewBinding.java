package com.robinhood.android.account.overview.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.account.overview.C8159R;
import com.robinhood.android.account.p060ui.documents.RhyStatementPlaceholderView;

/* loaded from: classes24.dex */
public final class IncludeRhyStatementPlaceholderViewBinding implements ViewBinding {
    private final RhyStatementPlaceholderView rootView;
    public final View settingsRowLoadingPrimary;
    public final View settingsRowLoadingSecondary;

    private IncludeRhyStatementPlaceholderViewBinding(RhyStatementPlaceholderView rhyStatementPlaceholderView, View view, View view2) {
        this.rootView = rhyStatementPlaceholderView;
        this.settingsRowLoadingPrimary = view;
        this.settingsRowLoadingSecondary = view2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhyStatementPlaceholderView getRoot() {
        return this.rootView;
    }

    public static IncludeRhyStatementPlaceholderViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRhyStatementPlaceholderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8159R.layout.include_rhy_statement_placeholder_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRhyStatementPlaceholderViewBinding bind(View view) {
        View viewFindChildViewById;
        int i = C8159R.id.settings_row_loading_primary;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C8159R.id.settings_row_loading_secondary))) != null) {
            return new IncludeRhyStatementPlaceholderViewBinding((RhyStatementPlaceholderView) view, viewFindChildViewById2, viewFindChildViewById);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
