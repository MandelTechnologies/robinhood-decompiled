package com.robinhood.android.cash.transaction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.cash.transaction.C10421R;
import com.robinhood.android.designsystem.row.RdsRowView;

/* loaded from: classes7.dex */
public final class IncludeMerchantCategoryRdsRowBinding implements ViewBinding {
    private final RdsRowView rootView;

    private IncludeMerchantCategoryRdsRowBinding(RdsRowView rdsRowView) {
        this.rootView = rdsRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsRowView getRoot() {
        return this.rootView;
    }

    public static IncludeMerchantCategoryRdsRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeMerchantCategoryRdsRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10421R.layout.include_merchant_category_rds_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeMerchantCategoryRdsRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeMerchantCategoryRdsRowBinding((RdsRowView) view);
    }
}
