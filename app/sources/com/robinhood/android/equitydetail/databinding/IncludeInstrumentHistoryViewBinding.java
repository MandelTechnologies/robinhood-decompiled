package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.InstrumentHistoryView;

/* loaded from: classes3.dex */
public final class IncludeInstrumentHistoryViewBinding implements ViewBinding {
    private final InstrumentHistoryView rootView;

    private IncludeInstrumentHistoryViewBinding(InstrumentHistoryView instrumentHistoryView) {
        this.rootView = instrumentHistoryView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public InstrumentHistoryView getRoot() {
        return this.rootView;
    }

    public static IncludeInstrumentHistoryViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeInstrumentHistoryViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.include_instrument_history_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeInstrumentHistoryViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeInstrumentHistoryViewBinding((InstrumentHistoryView) view);
    }
}
