package com.robinhood.android.common.options.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.common.options.views.OptionStrategyGreeksView;

/* loaded from: classes2.dex */
public final class IncludeOptionStrategyGreeksViewBinding implements ViewBinding {
    private final OptionStrategyGreeksView rootView;

    private IncludeOptionStrategyGreeksViewBinding(OptionStrategyGreeksView optionStrategyGreeksView) {
        this.rootView = optionStrategyGreeksView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public OptionStrategyGreeksView getRoot() {
        return this.rootView;
    }

    public static IncludeOptionStrategyGreeksViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOptionStrategyGreeksViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11303R.layout.include_option_strategy_greeks_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOptionStrategyGreeksViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeOptionStrategyGreeksViewBinding((OptionStrategyGreeksView) view);
    }
}
