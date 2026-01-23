package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.options.InstrumentDetailOptionStrategyView;

/* loaded from: classes3.dex */
public final class IncludeInstrumentDetailOptionsStrategyBinding implements ViewBinding {
    private final InstrumentDetailOptionStrategyView rootView;

    private IncludeInstrumentDetailOptionsStrategyBinding(InstrumentDetailOptionStrategyView instrumentDetailOptionStrategyView) {
        this.rootView = instrumentDetailOptionStrategyView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public InstrumentDetailOptionStrategyView getRoot() {
        return this.rootView;
    }

    public static IncludeInstrumentDetailOptionsStrategyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeInstrumentDetailOptionsStrategyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.include_instrument_detail_options_strategy, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeInstrumentDetailOptionsStrategyBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeInstrumentDetailOptionsStrategyBinding((InstrumentDetailOptionStrategyView) view);
    }
}
