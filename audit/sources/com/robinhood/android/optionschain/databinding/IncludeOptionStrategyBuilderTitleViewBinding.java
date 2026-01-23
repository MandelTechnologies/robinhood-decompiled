package com.robinhood.android.optionschain.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderTitleView;

/* loaded from: classes11.dex */
public final class IncludeOptionStrategyBuilderTitleViewBinding implements ViewBinding {
    private final OptionStrategyBuilderTitleView rootView;

    private IncludeOptionStrategyBuilderTitleViewBinding(OptionStrategyBuilderTitleView optionStrategyBuilderTitleView) {
        this.rootView = optionStrategyBuilderTitleView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public OptionStrategyBuilderTitleView getRoot() {
        return this.rootView;
    }

    public static IncludeOptionStrategyBuilderTitleViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOptionStrategyBuilderTitleViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24135R.layout.include_option_strategy_builder_title_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOptionStrategyBuilderTitleViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeOptionStrategyBuilderTitleViewBinding((OptionStrategyBuilderTitleView) view);
    }
}
