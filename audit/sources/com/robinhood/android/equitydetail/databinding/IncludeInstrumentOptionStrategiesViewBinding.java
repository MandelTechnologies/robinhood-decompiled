package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.options.InstrumentDetailOptionStrategyHeaderView;

/* loaded from: classes3.dex */
public final class IncludeInstrumentOptionStrategiesViewBinding implements ViewBinding {
    private final InstrumentDetailOptionStrategyHeaderView rootView;

    private IncludeInstrumentOptionStrategiesViewBinding(InstrumentDetailOptionStrategyHeaderView instrumentDetailOptionStrategyHeaderView) {
        this.rootView = instrumentDetailOptionStrategyHeaderView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public InstrumentDetailOptionStrategyHeaderView getRoot() {
        return this.rootView;
    }

    public static IncludeInstrumentOptionStrategiesViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeInstrumentOptionStrategiesViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.include_instrument_option_strategies_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeInstrumentOptionStrategiesViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeInstrumentOptionStrategiesViewBinding((InstrumentDetailOptionStrategyHeaderView) view);
    }
}
