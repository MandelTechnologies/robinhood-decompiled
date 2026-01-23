package com.robinhood.android.slip.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.slip.C28532R;

/* loaded from: classes5.dex */
public final class RowSlipAgreementBinding implements ViewBinding {
    public final RhTextView body;
    public final RdsRowView headerRow;
    private final View rootView;

    private RowSlipAgreementBinding(View view, RhTextView rhTextView, RdsRowView rdsRowView) {
        this.rootView = view;
        this.body = rhTextView;
        this.headerRow = rdsRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static RowSlipAgreementBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C28532R.layout.row_slip_agreement, viewGroup);
        return bind(viewGroup);
    }

    public static RowSlipAgreementBinding bind(View view) {
        int i = C28532R.id.body;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C28532R.id.header_row;
            RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
            if (rdsRowView != null) {
                return new RowSlipAgreementBinding(view, rhTextView, rdsRowView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
