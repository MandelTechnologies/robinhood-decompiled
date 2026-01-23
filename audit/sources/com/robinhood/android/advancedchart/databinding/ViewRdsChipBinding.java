package com.robinhood.android.advancedchart.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.advancedchart.C8502R;
import com.robinhood.android.designsystem.chip.RdsChip;

/* loaded from: classes24.dex */
public final class ViewRdsChipBinding implements ViewBinding {
    private final RdsChip rootView;

    private ViewRdsChipBinding(RdsChip rdsChip) {
        this.rootView = rdsChip;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsChip getRoot() {
        return this.rootView;
    }

    public static ViewRdsChipBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewRdsChipBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8502R.layout.view_rds_chip, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ViewRdsChipBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new ViewRdsChipBinding((RdsChip) view);
    }
}
