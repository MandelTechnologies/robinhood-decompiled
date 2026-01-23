package com.robinhood.android.transfers.transferhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.transfers.transferhub.C30556R;

/* loaded from: classes9.dex */
public final class IncludeDebitCardActionRowBinding implements ViewBinding {
    private final RdsRowView rootView;

    private IncludeDebitCardActionRowBinding(RdsRowView rdsRowView) {
        this.rootView = rdsRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsRowView getRoot() {
        return this.rootView;
    }

    public static IncludeDebitCardActionRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeDebitCardActionRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30556R.layout.include_debit_card_action_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeDebitCardActionRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeDebitCardActionRowBinding((RdsRowView) view);
    }
}
