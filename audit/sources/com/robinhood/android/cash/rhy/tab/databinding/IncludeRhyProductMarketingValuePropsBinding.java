package com.robinhood.android.cash.rhy.tab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.p077v2.productmarketing.RhyProductMarketingValuePropsView;

/* loaded from: classes7.dex */
public final class IncludeRhyProductMarketingValuePropsBinding implements ViewBinding {
    private final RhyProductMarketingValuePropsView rootView;

    private IncludeRhyProductMarketingValuePropsBinding(RhyProductMarketingValuePropsView rhyProductMarketingValuePropsView) {
        this.rootView = rhyProductMarketingValuePropsView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhyProductMarketingValuePropsView getRoot() {
        return this.rootView;
    }

    public static IncludeRhyProductMarketingValuePropsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRhyProductMarketingValuePropsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10285R.layout.include_rhy_product_marketing_value_props, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRhyProductMarketingValuePropsBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeRhyProductMarketingValuePropsBinding((RhyProductMarketingValuePropsView) view);
    }
}
