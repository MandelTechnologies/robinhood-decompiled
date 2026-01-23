package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.ipo.IpoResultsSectionRowView;

/* loaded from: classes3.dex */
public final class IncludeIpoResultsRowBinding implements ViewBinding {
    private final IpoResultsSectionRowView rootView;

    private IncludeIpoResultsRowBinding(IpoResultsSectionRowView ipoResultsSectionRowView) {
        this.rootView = ipoResultsSectionRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public IpoResultsSectionRowView getRoot() {
        return this.rootView;
    }

    public static IncludeIpoResultsRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeIpoResultsRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.include_ipo_results_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeIpoResultsRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeIpoResultsRowBinding((IpoResultsSectionRowView) view);
    }
}
