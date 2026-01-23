package com.robinhood.android.optionsstrategybuilder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.optionsstrategybuilder.C24876R;
import com.robinhood.android.optionsstrategybuilder.pills.StrategyBuilderChip;

/* loaded from: classes11.dex */
public final class MergeSinglePillBinding implements ViewBinding {
    public final StrategyBuilderChip pill;
    private final View rootView;

    private MergeSinglePillBinding(View view, StrategyBuilderChip strategyBuilderChip) {
        this.rootView = view;
        this.pill = strategyBuilderChip;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeSinglePillBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C24876R.layout.merge_single_pill, viewGroup);
        return bind(viewGroup);
    }

    public static MergeSinglePillBinding bind(View view) {
        int i = C24876R.id.pill;
        StrategyBuilderChip strategyBuilderChip = (StrategyBuilderChip) ViewBindings.findChildViewById(view, i);
        if (strategyBuilderChip != null) {
            return new MergeSinglePillBinding(view, strategyBuilderChip);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
