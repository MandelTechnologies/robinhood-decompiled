package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.views.InstrumentRowView;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class IncludeRowRhListEquityBinding implements ViewBinding {
    private final InstrumentRowView rootView;

    private IncludeRowRhListEquityBinding(InstrumentRowView instrumentRowView) {
        this.rootView = instrumentRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public InstrumentRowView getRoot() {
        return this.rootView;
    }

    public static IncludeRowRhListEquityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRowRhListEquityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.include_row_rh_list_equity, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRowRhListEquityBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeRowRhListEquityBinding((InstrumentRowView) view);
    }
}
