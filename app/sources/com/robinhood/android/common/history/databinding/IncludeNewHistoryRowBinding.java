package com.robinhood.android.common.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.history.C11183R;
import com.robinhood.android.common.history.p082ui.HistoryRowView;

/* loaded from: classes2.dex */
public final class IncludeNewHistoryRowBinding implements ViewBinding {
    private final HistoryRowView rootView;

    private IncludeNewHistoryRowBinding(HistoryRowView historyRowView) {
        this.rootView = historyRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public HistoryRowView getRoot() {
        return this.rootView;
    }

    public static IncludeNewHistoryRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNewHistoryRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11183R.layout.include_new_history_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNewHistoryRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNewHistoryRowBinding((HistoryRowView) view);
    }
}
