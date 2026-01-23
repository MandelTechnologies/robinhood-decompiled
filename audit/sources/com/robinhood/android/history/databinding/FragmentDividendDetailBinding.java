package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.timeline.RdsTimelineRowView;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class FragmentDividendDetailBinding implements ViewBinding {
    public final RdsDataRowView dividendAccountUsed;
    public final RhTextView dividendAlertTxt;
    public final RdsDataRowView dividendAmountPerShare;
    public final RdsDataRowView dividendAmountWithheld;
    public final RdsDataRowView dividendBackupWithholding;
    public final RdsDataRowView dividendDate;
    public final RhTextView dividendDetailAdditionalInfoTxt;
    public final RdsDataRowView dividendNumOfShares;
    public final RdsDataRowView dividendReinvestmentAmount;
    public final RdsDataRowView dividendStatus;
    public final RdsTimelineRowView dividendStatusAnnouncement;
    public final RdsTimelineRowView dividendStatusDividendPayment;
    public final RdsTimelineRowView dividendStatusDividendReinvestment;
    public final RdsDataRowView dividendTotalAmount;
    public final RdsButton dripStatusBtn;
    public final RdsButton dripTradeConfirmationBtn;
    private final LinearLayout rootView;

    private FragmentDividendDetailBinding(LinearLayout linearLayout, RdsDataRowView rdsDataRowView, RhTextView rhTextView, RdsDataRowView rdsDataRowView2, RdsDataRowView rdsDataRowView3, RdsDataRowView rdsDataRowView4, RdsDataRowView rdsDataRowView5, RhTextView rhTextView2, RdsDataRowView rdsDataRowView6, RdsDataRowView rdsDataRowView7, RdsDataRowView rdsDataRowView8, RdsTimelineRowView rdsTimelineRowView, RdsTimelineRowView rdsTimelineRowView2, RdsTimelineRowView rdsTimelineRowView3, RdsDataRowView rdsDataRowView9, RdsButton rdsButton, RdsButton rdsButton2) {
        this.rootView = linearLayout;
        this.dividendAccountUsed = rdsDataRowView;
        this.dividendAlertTxt = rhTextView;
        this.dividendAmountPerShare = rdsDataRowView2;
        this.dividendAmountWithheld = rdsDataRowView3;
        this.dividendBackupWithholding = rdsDataRowView4;
        this.dividendDate = rdsDataRowView5;
        this.dividendDetailAdditionalInfoTxt = rhTextView2;
        this.dividendNumOfShares = rdsDataRowView6;
        this.dividendReinvestmentAmount = rdsDataRowView7;
        this.dividendStatus = rdsDataRowView8;
        this.dividendStatusAnnouncement = rdsTimelineRowView;
        this.dividendStatusDividendPayment = rdsTimelineRowView2;
        this.dividendStatusDividendReinvestment = rdsTimelineRowView3;
        this.dividendTotalAmount = rdsDataRowView9;
        this.dripStatusBtn = rdsButton;
        this.dripTradeConfirmationBtn = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDividendDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDividendDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.fragment_dividend_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDividendDetailBinding bind(View view) {
        int i = C18359R.id.dividend_account_used;
        RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
        if (rdsDataRowView != null) {
            i = C18359R.id.dividend_alert_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C18359R.id.dividend_amount_per_share;
                RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                if (rdsDataRowView2 != null) {
                    i = C18359R.id.dividend_amount_withheld;
                    RdsDataRowView rdsDataRowView3 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsDataRowView3 != null) {
                        i = C18359R.id.dividend_backup_withholding;
                        RdsDataRowView rdsDataRowView4 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsDataRowView4 != null) {
                            i = C18359R.id.dividend_date;
                            RdsDataRowView rdsDataRowView5 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsDataRowView5 != null) {
                                i = C18359R.id.dividend_detail_additional_info_txt;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    i = C18359R.id.dividend_num_of_shares;
                                    RdsDataRowView rdsDataRowView6 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                    if (rdsDataRowView6 != null) {
                                        i = C18359R.id.dividend_reinvestment_amount;
                                        RdsDataRowView rdsDataRowView7 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                        if (rdsDataRowView7 != null) {
                                            i = C18359R.id.dividend_status;
                                            RdsDataRowView rdsDataRowView8 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                            if (rdsDataRowView8 != null) {
                                                i = C18359R.id.dividend_status_announcement;
                                                RdsTimelineRowView rdsTimelineRowView = (RdsTimelineRowView) ViewBindings.findChildViewById(view, i);
                                                if (rdsTimelineRowView != null) {
                                                    i = C18359R.id.dividend_status_dividend_payment;
                                                    RdsTimelineRowView rdsTimelineRowView2 = (RdsTimelineRowView) ViewBindings.findChildViewById(view, i);
                                                    if (rdsTimelineRowView2 != null) {
                                                        i = C18359R.id.dividend_status_dividend_reinvestment;
                                                        RdsTimelineRowView rdsTimelineRowView3 = (RdsTimelineRowView) ViewBindings.findChildViewById(view, i);
                                                        if (rdsTimelineRowView3 != null) {
                                                            i = C18359R.id.dividend_total_amount;
                                                            RdsDataRowView rdsDataRowView9 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                                            if (rdsDataRowView9 != null) {
                                                                i = C18359R.id.drip_status_btn;
                                                                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                                if (rdsButton != null) {
                                                                    i = C18359R.id.drip_trade_confirmation_btn;
                                                                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                                    if (rdsButton2 != null) {
                                                                        return new FragmentDividendDetailBinding((LinearLayout) view, rdsDataRowView, rhTextView, rdsDataRowView2, rdsDataRowView3, rdsDataRowView4, rdsDataRowView5, rhTextView2, rdsDataRowView6, rdsDataRowView7, rdsDataRowView8, rdsTimelineRowView, rdsTimelineRowView2, rdsTimelineRowView3, rdsDataRowView9, rdsButton, rdsButton2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
