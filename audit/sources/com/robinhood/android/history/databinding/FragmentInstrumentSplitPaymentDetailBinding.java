package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.card.RdsCardView;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class FragmentInstrumentSplitPaymentDetailBinding implements ViewBinding {
    public final RdsDataRowView instrumentSplitPaymentAccountUsed;
    public final RdsDataRowView instrumentSplitPaymentDateRecieved;
    public final RhTextView instrumentSplitPaymentInfo;
    public final RdsCardView instrumentSplitPaymentInfoWrapper;
    public final RdsDataRowView instrumentSplitPaymentNewShares;
    public final RdsDataRowView instrumentSplitPaymentPreviousShares;
    public final RdsDataRowView instrumentSplitPaymentSplitQuantity;
    private final ScrollView rootView;

    private FragmentInstrumentSplitPaymentDetailBinding(ScrollView scrollView, RdsDataRowView rdsDataRowView, RdsDataRowView rdsDataRowView2, RhTextView rhTextView, RdsCardView rdsCardView, RdsDataRowView rdsDataRowView3, RdsDataRowView rdsDataRowView4, RdsDataRowView rdsDataRowView5) {
        this.rootView = scrollView;
        this.instrumentSplitPaymentAccountUsed = rdsDataRowView;
        this.instrumentSplitPaymentDateRecieved = rdsDataRowView2;
        this.instrumentSplitPaymentInfo = rhTextView;
        this.instrumentSplitPaymentInfoWrapper = rdsCardView;
        this.instrumentSplitPaymentNewShares = rdsDataRowView3;
        this.instrumentSplitPaymentPreviousShares = rdsDataRowView4;
        this.instrumentSplitPaymentSplitQuantity = rdsDataRowView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentInstrumentSplitPaymentDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentInstrumentSplitPaymentDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.fragment_instrument_split_payment_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentInstrumentSplitPaymentDetailBinding bind(View view) {
        int i = C18359R.id.instrument_split_payment_account_used;
        RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
        if (rdsDataRowView != null) {
            i = C18359R.id.instrument_split_payment_date_recieved;
            RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
            if (rdsDataRowView2 != null) {
                i = C18359R.id.instrument_split_payment_info;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C18359R.id.instrument_split_payment_info_wrapper;
                    RdsCardView rdsCardView = (RdsCardView) ViewBindings.findChildViewById(view, i);
                    if (rdsCardView != null) {
                        i = C18359R.id.instrument_split_payment_new_shares;
                        RdsDataRowView rdsDataRowView3 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsDataRowView3 != null) {
                            i = C18359R.id.instrument_split_payment_previous_shares;
                            RdsDataRowView rdsDataRowView4 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsDataRowView4 != null) {
                                i = C18359R.id.instrument_split_payment_split_quantity;
                                RdsDataRowView rdsDataRowView5 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                if (rdsDataRowView5 != null) {
                                    return new FragmentInstrumentSplitPaymentDetailBinding((ScrollView) view, rdsDataRowView, rdsDataRowView2, rhTextView, rdsCardView, rdsDataRowView3, rdsDataRowView4, rdsDataRowView5);
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
