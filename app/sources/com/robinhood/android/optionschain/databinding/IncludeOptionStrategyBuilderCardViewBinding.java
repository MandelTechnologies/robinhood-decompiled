package com.robinhood.android.optionschain.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderCardView;

/* loaded from: classes11.dex */
public final class IncludeOptionStrategyBuilderCardViewBinding implements ViewBinding {
    private final OptionStrategyBuilderCardView rootView;

    private IncludeOptionStrategyBuilderCardViewBinding(OptionStrategyBuilderCardView optionStrategyBuilderCardView) {
        this.rootView = optionStrategyBuilderCardView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public OptionStrategyBuilderCardView getRoot() {
        return this.rootView;
    }

    public static IncludeOptionStrategyBuilderCardViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOptionStrategyBuilderCardViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24135R.layout.include_option_strategy_builder_card_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOptionStrategyBuilderCardViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeOptionStrategyBuilderCardViewBinding((OptionStrategyBuilderCardView) view);
    }
}
