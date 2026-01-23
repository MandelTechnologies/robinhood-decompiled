package com.robinhood.android.common.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.history.C11183R;
import com.robinhood.android.designsystem.chip.RdsChip;

/* loaded from: classes2.dex */
public final class IncludeHistoryFilterChipBinding implements ViewBinding {
    private final RdsChip rootView;

    private IncludeHistoryFilterChipBinding(RdsChip rdsChip) {
        this.rootView = rdsChip;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsChip getRoot() {
        return this.rootView;
    }

    public static IncludeHistoryFilterChipBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeHistoryFilterChipBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11183R.layout.include_history_filter_chip, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeHistoryFilterChipBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeHistoryFilterChipBinding((RdsChip) view);
    }
}
