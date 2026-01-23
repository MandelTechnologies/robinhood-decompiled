package com.robinhood.android.common.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.history.C11183R;
import com.robinhood.android.common.history.p082ui.HistoryRowCardView;

/* loaded from: classes2.dex */
public final class IncludeNewHistoryRowCardBinding implements ViewBinding {
    private final HistoryRowCardView rootView;

    private IncludeNewHistoryRowCardBinding(HistoryRowCardView historyRowCardView) {
        this.rootView = historyRowCardView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public HistoryRowCardView getRoot() {
        return this.rootView;
    }

    public static IncludeNewHistoryRowCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNewHistoryRowCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11183R.layout.include_new_history_row_card, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNewHistoryRowCardBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNewHistoryRowCardBinding((HistoryRowCardView) view);
    }
}
