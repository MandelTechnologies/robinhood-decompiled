package com.robinhood.android.common.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.history.C11183R;
import com.robinhood.android.common.history.p082ui.HistoryRowView;

/* loaded from: classes2.dex */
public final class MergeHistoryRowCardBinding implements ViewBinding {
    public final HistoryRowView historyRowView;
    private final HistoryRowView rootView;

    private MergeHistoryRowCardBinding(HistoryRowView historyRowView, HistoryRowView historyRowView2) {
        this.rootView = historyRowView;
        this.historyRowView = historyRowView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public HistoryRowView getRoot() {
        return this.rootView;
    }

    public static MergeHistoryRowCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MergeHistoryRowCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11183R.layout.merge_history_row_card, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MergeHistoryRowCardBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        HistoryRowView historyRowView = (HistoryRowView) view;
        return new MergeHistoryRowCardBinding(historyRowView, historyRowView);
    }
}
