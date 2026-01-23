package com.robinhood.android.cash.rhy.tab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.RhyActionRowView;

/* loaded from: classes7.dex */
public final class IncludeRhyActionRowViewBinding implements ViewBinding {
    private final RhyActionRowView rootView;

    private IncludeRhyActionRowViewBinding(RhyActionRowView rhyActionRowView) {
        this.rootView = rhyActionRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhyActionRowView getRoot() {
        return this.rootView;
    }

    public static IncludeRhyActionRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRhyActionRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10285R.layout.include_rhy_action_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRhyActionRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeRhyActionRowViewBinding((RhyActionRowView) view);
    }
}
