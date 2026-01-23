package com.robinhood.android.cash.disputes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.designsystem.row.RdsRowView;

/* loaded from: classes7.dex */
public final class IncludeMultipleChoiceRdsRowBinding implements ViewBinding {
    private final RdsRowView rootView;

    private IncludeMultipleChoiceRdsRowBinding(RdsRowView rdsRowView) {
        this.rootView = rdsRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsRowView getRoot() {
        return this.rootView;
    }

    public static IncludeMultipleChoiceRdsRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeMultipleChoiceRdsRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10007R.layout.include_multiple_choice_rds_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeMultipleChoiceRdsRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeMultipleChoiceRdsRowBinding((RdsRowView) view);
    }
}
