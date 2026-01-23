package com.robinhood.android.optionschain.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderHeaderView;

/* loaded from: classes11.dex */
public final class IncludeOptionStrategyBuilderHeaderViewBinding implements ViewBinding {
    private final OptionStrategyBuilderHeaderView rootView;

    private IncludeOptionStrategyBuilderHeaderViewBinding(OptionStrategyBuilderHeaderView optionStrategyBuilderHeaderView) {
        this.rootView = optionStrategyBuilderHeaderView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public OptionStrategyBuilderHeaderView getRoot() {
        return this.rootView;
    }

    public static IncludeOptionStrategyBuilderHeaderViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOptionStrategyBuilderHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24135R.layout.include_option_strategy_builder_header_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOptionStrategyBuilderHeaderViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeOptionStrategyBuilderHeaderViewBinding((OptionStrategyBuilderHeaderView) view);
    }
}
