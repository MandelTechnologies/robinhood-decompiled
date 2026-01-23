package com.robinhood.android.common.options.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.designsystem.row.RdsRowView;

/* loaded from: classes2.dex */
public final class RowAnswerItemBinding implements ViewBinding {
    private final RdsRowView rootView;

    private RowAnswerItemBinding(RdsRowView rdsRowView) {
        this.rootView = rdsRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsRowView getRoot() {
        return this.rootView;
    }

    public static RowAnswerItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowAnswerItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11303R.layout.row_answer_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowAnswerItemBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new RowAnswerItemBinding((RdsRowView) view);
    }
}
