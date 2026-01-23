package com.robinhood.android.common.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.history.C11183R;

/* loaded from: classes2.dex */
public final class IncludeHistoryRowLoadingBinding implements ViewBinding {
    public final View historyRowLoadingAmount;
    public final View historyRowLoadingDivider;
    public final View historyRowLoadingPrimary;
    public final View historyRowLoadingSecondary;
    private final ConstraintLayout rootView;

    private IncludeHistoryRowLoadingBinding(ConstraintLayout constraintLayout, View view, View view2, View view3, View view4) {
        this.rootView = constraintLayout;
        this.historyRowLoadingAmount = view;
        this.historyRowLoadingDivider = view2;
        this.historyRowLoadingPrimary = view3;
        this.historyRowLoadingSecondary = view4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IncludeHistoryRowLoadingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeHistoryRowLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11183R.layout.include_history_row_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeHistoryRowLoadingBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i = C11183R.id.history_row_loading_amount;
        View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById4 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C11183R.id.history_row_loading_divider))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C11183R.id.history_row_loading_primary))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C11183R.id.history_row_loading_secondary))) != null) {
            return new IncludeHistoryRowLoadingBinding((ConstraintLayout) view, viewFindChildViewById4, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
