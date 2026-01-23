package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.history.p082ui.HistoryRowView;
import com.robinhood.android.equitydetail.C15314R;

/* loaded from: classes3.dex */
public final class IncludeInstrumentHistoryRowBinding implements ViewBinding {
    private final HistoryRowView rootView;

    private IncludeInstrumentHistoryRowBinding(HistoryRowView historyRowView) {
        this.rootView = historyRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public HistoryRowView getRoot() {
        return this.rootView;
    }

    public static IncludeInstrumentHistoryRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeInstrumentHistoryRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.include_instrument_history_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeInstrumentHistoryRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeInstrumentHistoryRowBinding((HistoryRowView) view);
    }
}
