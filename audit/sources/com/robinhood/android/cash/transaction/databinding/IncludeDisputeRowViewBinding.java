package com.robinhood.android.cash.transaction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.cash.transaction.C10421R;
import com.robinhood.android.cash.transaction.p079ui.dispute.DisputeRowView;

/* loaded from: classes7.dex */
public final class IncludeDisputeRowViewBinding implements ViewBinding {
    private final DisputeRowView rootView;

    private IncludeDisputeRowViewBinding(DisputeRowView disputeRowView) {
        this.rootView = disputeRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public DisputeRowView getRoot() {
        return this.rootView;
    }

    public static IncludeDisputeRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeDisputeRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10421R.layout.include_dispute_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeDisputeRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeDisputeRowViewBinding((DisputeRowView) view);
    }
}
