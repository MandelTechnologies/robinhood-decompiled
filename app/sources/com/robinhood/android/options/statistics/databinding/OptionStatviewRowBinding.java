package com.robinhood.android.options.statistics.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.options.statistics.C23799R;
import com.robinhood.android.options.statistics.OptionStatView;

/* loaded from: classes11.dex */
public final class OptionStatviewRowBinding implements ViewBinding {
    public final OptionStatView optionInstrumentDetailAskStatview;
    private final OptionStatView rootView;

    private OptionStatviewRowBinding(OptionStatView optionStatView, OptionStatView optionStatView2) {
        this.rootView = optionStatView;
        this.optionInstrumentDetailAskStatview = optionStatView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public OptionStatView getRoot() {
        return this.rootView;
    }

    public static OptionStatviewRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static OptionStatviewRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C23799R.layout.option_statview_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static OptionStatviewRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        OptionStatView optionStatView = (OptionStatView) view;
        return new OptionStatviewRowBinding(optionStatView, optionStatView);
    }
}
