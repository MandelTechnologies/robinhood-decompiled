package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class FragmentDebitCardTransferDetailBinding implements ViewBinding {
    public final RdsRowView acatMatchRemovalRow;
    public final ComposeView composeContent;
    public final RdsRowView feeRow;
    public final RdsRowView fromRow;
    public final ScrollView genericInstantContent;
    public final RdsDataRowView goldDepositBoostRow;
    public final ComposeView gracePeriodBanner;
    public final ComposeView gracePeriodCta;
    public final ComposeView gracePeriodDetails;
    private final FrameLayout rootView;
    public final RdsRowView statusRow;
    public final RhTextView subtitle;
    public final RhTextView title;
    public final RdsRowView toRow;
    public final RdsRowView transferAmountRow;

    private FragmentDebitCardTransferDetailBinding(FrameLayout frameLayout, RdsRowView rdsRowView, ComposeView composeView, RdsRowView rdsRowView2, RdsRowView rdsRowView3, ScrollView scrollView, RdsDataRowView rdsDataRowView, ComposeView composeView2, ComposeView composeView3, ComposeView composeView4, RdsRowView rdsRowView4, RhTextView rhTextView, RhTextView rhTextView2, RdsRowView rdsRowView5, RdsRowView rdsRowView6) {
        this.rootView = frameLayout;
        this.acatMatchRemovalRow = rdsRowView;
        this.composeContent = composeView;
        this.feeRow = rdsRowView2;
        this.fromRow = rdsRowView3;
        this.genericInstantContent = scrollView;
        this.goldDepositBoostRow = rdsDataRowView;
        this.gracePeriodBanner = composeView2;
        this.gracePeriodCta = composeView3;
        this.gracePeriodDetails = composeView4;
        this.statusRow = rdsRowView4;
        this.subtitle = rhTextView;
        this.title = rhTextView2;
        this.toRow = rdsRowView5;
        this.transferAmountRow = rdsRowView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDebitCardTransferDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDebitCardTransferDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.fragment_debit_card_transfer_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDebitCardTransferDetailBinding bind(View view) {
        int i = C18359R.id.acat_match_removal_row;
        RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
        if (rdsRowView != null) {
            i = C18359R.id.compose_content;
            ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
            if (composeView != null) {
                i = C18359R.id.fee_row;
                RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                if (rdsRowView2 != null) {
                    i = C18359R.id.from_row;
                    RdsRowView rdsRowView3 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsRowView3 != null) {
                        i = C18359R.id.generic_instant_content;
                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                        if (scrollView != null) {
                            i = C18359R.id.gold_deposit_boost_row;
                            RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsDataRowView != null) {
                                i = C18359R.id.grace_period_banner;
                                ComposeView composeView2 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                if (composeView2 != null) {
                                    i = C18359R.id.grace_period_cta;
                                    ComposeView composeView3 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                    if (composeView3 != null) {
                                        i = C18359R.id.grace_period_details;
                                        ComposeView composeView4 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                        if (composeView4 != null) {
                                            i = C18359R.id.status_row;
                                            RdsRowView rdsRowView4 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                            if (rdsRowView4 != null) {
                                                i = C18359R.id.subtitle;
                                                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView != null) {
                                                    i = C18359R.id.title;
                                                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView2 != null) {
                                                        i = C18359R.id.to_row;
                                                        RdsRowView rdsRowView5 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                                        if (rdsRowView5 != null) {
                                                            i = C18359R.id.transfer_amount_row;
                                                            RdsRowView rdsRowView6 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                                            if (rdsRowView6 != null) {
                                                                return new FragmentDebitCardTransferDetailBinding((FrameLayout) view, rdsRowView, composeView, rdsRowView2, rdsRowView3, scrollView, rdsDataRowView, composeView2, composeView3, composeView4, rdsRowView4, rhTextView, rhTextView2, rdsRowView5, rdsRowView6);
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
