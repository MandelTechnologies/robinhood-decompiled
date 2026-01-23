package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class IncludeAcatsTransferDetailOverviewBinding implements ViewBinding {
    public final RdsDataRowView acatsTransferDetailAccountNumber;
    public final RdsDataRowView acatsTransferDetailArrivalDate;
    public final RdsDataRowView acatsTransferDetailBroker;
    public final RdsDataRowView acatsTransferDetailEta;
    public final RdsDataRowView acatsTransferDetailFailure;
    public final RdsDataRowView acatsTransferDetailFeesReimbursed;
    public final RdsDataRowView acatsTransferDetailStatus;
    private final LinearLayout rootView;

    private IncludeAcatsTransferDetailOverviewBinding(LinearLayout linearLayout, RdsDataRowView rdsDataRowView, RdsDataRowView rdsDataRowView2, RdsDataRowView rdsDataRowView3, RdsDataRowView rdsDataRowView4, RdsDataRowView rdsDataRowView5, RdsDataRowView rdsDataRowView6, RdsDataRowView rdsDataRowView7) {
        this.rootView = linearLayout;
        this.acatsTransferDetailAccountNumber = rdsDataRowView;
        this.acatsTransferDetailArrivalDate = rdsDataRowView2;
        this.acatsTransferDetailBroker = rdsDataRowView3;
        this.acatsTransferDetailEta = rdsDataRowView4;
        this.acatsTransferDetailFailure = rdsDataRowView5;
        this.acatsTransferDetailFeesReimbursed = rdsDataRowView6;
        this.acatsTransferDetailStatus = rdsDataRowView7;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IncludeAcatsTransferDetailOverviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAcatsTransferDetailOverviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.include_acats_transfer_detail_overview, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAcatsTransferDetailOverviewBinding bind(View view) {
        int i = C18359R.id.acats_transfer_detail_account_number;
        RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
        if (rdsDataRowView != null) {
            i = C18359R.id.acats_transfer_detail_arrival_date;
            RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
            if (rdsDataRowView2 != null) {
                i = C18359R.id.acats_transfer_detail_broker;
                RdsDataRowView rdsDataRowView3 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                if (rdsDataRowView3 != null) {
                    i = C18359R.id.acats_transfer_detail_eta;
                    RdsDataRowView rdsDataRowView4 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsDataRowView4 != null) {
                        i = C18359R.id.acats_transfer_detail_failure;
                        RdsDataRowView rdsDataRowView5 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsDataRowView5 != null) {
                            i = C18359R.id.acats_transfer_detail_fees_reimbursed;
                            RdsDataRowView rdsDataRowView6 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsDataRowView6 != null) {
                                i = C18359R.id.acats_transfer_detail_status;
                                RdsDataRowView rdsDataRowView7 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                if (rdsDataRowView7 != null) {
                                    return new IncludeAcatsTransferDetailOverviewBinding((LinearLayout) view, rdsDataRowView, rdsDataRowView2, rdsDataRowView3, rdsDataRowView4, rdsDataRowView5, rdsDataRowView6, rdsDataRowView7);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
