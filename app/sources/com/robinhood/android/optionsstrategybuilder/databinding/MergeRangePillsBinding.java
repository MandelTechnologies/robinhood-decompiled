package com.robinhood.android.optionsstrategybuilder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.optionsstrategybuilder.C24876R;
import com.robinhood.android.optionsstrategybuilder.pills.StrategyBuilderChip;

/* loaded from: classes11.dex */
public final class MergeRangePillsBinding implements ViewBinding {
    public final StrategyBuilderChip endPill;
    private final View rootView;
    public final StrategyBuilderChip startPill;

    private MergeRangePillsBinding(View view, StrategyBuilderChip strategyBuilderChip, StrategyBuilderChip strategyBuilderChip2) {
        this.rootView = view;
        this.endPill = strategyBuilderChip;
        this.startPill = strategyBuilderChip2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeRangePillsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C24876R.layout.merge_range_pills, viewGroup);
        return bind(viewGroup);
    }

    public static MergeRangePillsBinding bind(View view) {
        int i = C24876R.id.end_pill;
        StrategyBuilderChip strategyBuilderChip = (StrategyBuilderChip) ViewBindings.findChildViewById(view, i);
        if (strategyBuilderChip != null) {
            i = C24876R.id.start_pill;
            StrategyBuilderChip strategyBuilderChip2 = (StrategyBuilderChip) ViewBindings.findChildViewById(view, i);
            if (strategyBuilderChip2 != null) {
                return new MergeRangePillsBinding(view, strategyBuilderChip, strategyBuilderChip2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
