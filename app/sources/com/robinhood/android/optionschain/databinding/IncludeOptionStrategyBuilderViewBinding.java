package com.robinhood.android.optionschain.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.android.optionschain.OptionStrategyBuilderView;

/* loaded from: classes11.dex */
public final class IncludeOptionStrategyBuilderViewBinding implements ViewBinding {
    private final OptionStrategyBuilderView rootView;

    private IncludeOptionStrategyBuilderViewBinding(OptionStrategyBuilderView optionStrategyBuilderView) {
        this.rootView = optionStrategyBuilderView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public OptionStrategyBuilderView getRoot() {
        return this.rootView;
    }

    public static IncludeOptionStrategyBuilderViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOptionStrategyBuilderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24135R.layout.include_option_strategy_builder_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOptionStrategyBuilderViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeOptionStrategyBuilderViewBinding((OptionStrategyBuilderView) view);
    }
}
