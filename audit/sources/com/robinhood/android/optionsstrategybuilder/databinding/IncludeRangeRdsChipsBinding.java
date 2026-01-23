package com.robinhood.android.optionsstrategybuilder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.optionsstrategybuilder.C24876R;
import com.robinhood.android.optionsstrategybuilder.pills.RangePillsView;

/* loaded from: classes11.dex */
public final class IncludeRangeRdsChipsBinding implements ViewBinding {
    private final RangePillsView rootView;

    private IncludeRangeRdsChipsBinding(RangePillsView rangePillsView) {
        this.rootView = rangePillsView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RangePillsView getRoot() {
        return this.rootView;
    }

    public static IncludeRangeRdsChipsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRangeRdsChipsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24876R.layout.include_range_rds_chips, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRangeRdsChipsBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeRangeRdsChipsBinding((RangePillsView) view);
    }
}
