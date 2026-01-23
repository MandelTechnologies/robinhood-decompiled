package com.robinhood.android.options.statistics.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.options.statistics.C23799R;
import com.robinhood.android.options.statistics.OptionStrategyStatisticsView;

/* loaded from: classes11.dex */
public final class IncludeOptionStrategyStatisticsViewBinding implements ViewBinding {
    private final OptionStrategyStatisticsView rootView;

    private IncludeOptionStrategyStatisticsViewBinding(OptionStrategyStatisticsView optionStrategyStatisticsView) {
        this.rootView = optionStrategyStatisticsView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public OptionStrategyStatisticsView getRoot() {
        return this.rootView;
    }

    public static IncludeOptionStrategyStatisticsViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOptionStrategyStatisticsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C23799R.layout.include_option_strategy_statistics_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOptionStrategyStatisticsViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeOptionStrategyStatisticsViewBinding((OptionStrategyStatisticsView) view);
    }
}
