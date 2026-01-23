package com.robinhood.android.search.selector.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.search.selector.C28142R;

/* loaded from: classes5.dex */
public final class RowViewSearchResultBinding implements ViewBinding {
    private final RdsRowView rootView;

    private RowViewSearchResultBinding(RdsRowView rdsRowView) {
        this.rootView = rdsRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsRowView getRoot() {
        return this.rootView;
    }

    public static RowViewSearchResultBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowViewSearchResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28142R.layout.row_view_search_result, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowViewSearchResultBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new RowViewSearchResultBinding((RdsRowView) view);
    }
}
