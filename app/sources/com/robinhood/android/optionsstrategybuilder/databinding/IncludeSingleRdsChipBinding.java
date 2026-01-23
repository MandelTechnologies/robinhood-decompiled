package com.robinhood.android.optionsstrategybuilder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.optionsstrategybuilder.C24876R;
import com.robinhood.android.optionsstrategybuilder.pills.SinglePillView;

/* loaded from: classes11.dex */
public final class IncludeSingleRdsChipBinding implements ViewBinding {
    private final SinglePillView rootView;

    private IncludeSingleRdsChipBinding(SinglePillView singlePillView) {
        this.rootView = singlePillView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SinglePillView getRoot() {
        return this.rootView;
    }

    public static IncludeSingleRdsChipBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSingleRdsChipBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24876R.layout.include_single_rds_chip, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSingleRdsChipBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeSingleRdsChipBinding((SinglePillView) view);
    }
}
