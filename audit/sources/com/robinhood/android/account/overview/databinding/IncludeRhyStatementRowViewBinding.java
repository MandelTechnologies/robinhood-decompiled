package com.robinhood.android.account.overview.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.account.overview.C8159R;
import com.robinhood.android.account.p060ui.documents.RhyStatementRowView;

/* loaded from: classes24.dex */
public final class IncludeRhyStatementRowViewBinding implements ViewBinding {
    private final RhyStatementRowView rootView;

    private IncludeRhyStatementRowViewBinding(RhyStatementRowView rhyStatementRowView) {
        this.rootView = rhyStatementRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhyStatementRowView getRoot() {
        return this.rootView;
    }

    public static IncludeRhyStatementRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRhyStatementRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8159R.layout.include_rhy_statement_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRhyStatementRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeRhyStatementRowViewBinding((RhyStatementRowView) view);
    }
}
