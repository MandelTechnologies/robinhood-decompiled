package com.robinhood.android.common.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.history.C11183R;
import com.robinhood.android.designsystem.row.RdsRowView;

/* loaded from: classes2.dex */
public final class MergeNewHistoryRowBinding implements ViewBinding {
    public final IncludeHistoryRowLoadingBinding newHistoryLoadingRow;
    public final RdsRowView newHistoryPendingCryptoOrderRow;
    public final RdsRowView newHistoryPrimaryRow;
    private final View rootView;

    private MergeNewHistoryRowBinding(View view, IncludeHistoryRowLoadingBinding includeHistoryRowLoadingBinding, RdsRowView rdsRowView, RdsRowView rdsRowView2) {
        this.rootView = view;
        this.newHistoryLoadingRow = includeHistoryRowLoadingBinding;
        this.newHistoryPendingCryptoOrderRow = rdsRowView;
        this.newHistoryPrimaryRow = rdsRowView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeNewHistoryRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11183R.layout.merge_new_history_row, viewGroup);
        return bind(viewGroup);
    }

    public static MergeNewHistoryRowBinding bind(View view) {
        int i = C11183R.id.new_history_loading_row;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            IncludeHistoryRowLoadingBinding includeHistoryRowLoadingBindingBind = IncludeHistoryRowLoadingBinding.bind(viewFindChildViewById);
            int i2 = C11183R.id.new_history_pending_crypto_order_row;
            RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i2);
            if (rdsRowView != null) {
                i2 = C11183R.id.new_history_primary_row;
                RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i2);
                if (rdsRowView2 != null) {
                    return new MergeNewHistoryRowBinding(view, includeHistoryRowLoadingBindingBind, rdsRowView, rdsRowView2);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
