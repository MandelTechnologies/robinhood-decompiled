package com.robinhood.android.matcha.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.matcha.C21284R;

/* loaded from: classes8.dex */
public final class FragmentMatchaTransferDetailBinding implements ViewBinding {
    public final RdsDataRowView accountRow;
    public final RhTextView amountText;
    public final ComposeView avatarComposeView;
    public final ComposeView blockedBanner;
    public final RdsDataRowView dateRow;
    public final RdsInfoBannerView disputeClawbackBanner;
    public final LinearLayout disputeContainer;
    public final RdsDataRowView disputeCreatedAtRow;
    public final RdsInfoBannerView disputeStatusDesc;
    public final RdsDataRowView disputeStatusRow;
    public final RdsDataRowView disputeUpdatedAtRow;
    public final ComposeView memoComposeView;
    private final ConstraintLayout rootView;
    public final ScrollView scrollView;
    public final RdsInfoBannerView statusBanner;
    public final RdsDataRowView statusRow;
    public final RhTextView subtitleText;
    public final RdsDataRowView transactionIdRow;
    public final RdsDataRowView transactorIdentifierRow;

    private FragmentMatchaTransferDetailBinding(ConstraintLayout constraintLayout, RdsDataRowView rdsDataRowView, RhTextView rhTextView, ComposeView composeView, ComposeView composeView2, RdsDataRowView rdsDataRowView2, RdsInfoBannerView rdsInfoBannerView, LinearLayout linearLayout, RdsDataRowView rdsDataRowView3, RdsInfoBannerView rdsInfoBannerView2, RdsDataRowView rdsDataRowView4, RdsDataRowView rdsDataRowView5, ComposeView composeView3, ScrollView scrollView, RdsInfoBannerView rdsInfoBannerView3, RdsDataRowView rdsDataRowView6, RhTextView rhTextView2, RdsDataRowView rdsDataRowView7, RdsDataRowView rdsDataRowView8) {
        this.rootView = constraintLayout;
        this.accountRow = rdsDataRowView;
        this.amountText = rhTextView;
        this.avatarComposeView = composeView;
        this.blockedBanner = composeView2;
        this.dateRow = rdsDataRowView2;
        this.disputeClawbackBanner = rdsInfoBannerView;
        this.disputeContainer = linearLayout;
        this.disputeCreatedAtRow = rdsDataRowView3;
        this.disputeStatusDesc = rdsInfoBannerView2;
        this.disputeStatusRow = rdsDataRowView4;
        this.disputeUpdatedAtRow = rdsDataRowView5;
        this.memoComposeView = composeView3;
        this.scrollView = scrollView;
        this.statusBanner = rdsInfoBannerView3;
        this.statusRow = rdsDataRowView6;
        this.subtitleText = rhTextView2;
        this.transactionIdRow = rdsDataRowView7;
        this.transactorIdentifierRow = rdsDataRowView8;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMatchaTransferDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMatchaTransferDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C21284R.layout.fragment_matcha_transfer_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentMatchaTransferDetailBinding bind(View view) {
        int i = C21284R.id.account_row;
        RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
        if (rdsDataRowView != null) {
            i = C21284R.id.amount_text;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C21284R.id.avatar_compose_view;
                ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                if (composeView != null) {
                    i = C21284R.id.blocked_banner;
                    ComposeView composeView2 = (ComposeView) ViewBindings.findChildViewById(view, i);
                    if (composeView2 != null) {
                        i = C21284R.id.date_row;
                        RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsDataRowView2 != null) {
                            i = C21284R.id.dispute_clawback_banner;
                            RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) ViewBindings.findChildViewById(view, i);
                            if (rdsInfoBannerView != null) {
                                i = C21284R.id.dispute_container;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    i = C21284R.id.dispute_created_at_row;
                                    RdsDataRowView rdsDataRowView3 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                    if (rdsDataRowView3 != null) {
                                        i = C21284R.id.dispute_status_desc;
                                        RdsInfoBannerView rdsInfoBannerView2 = (RdsInfoBannerView) ViewBindings.findChildViewById(view, i);
                                        if (rdsInfoBannerView2 != null) {
                                            i = C21284R.id.dispute_status_row;
                                            RdsDataRowView rdsDataRowView4 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                            if (rdsDataRowView4 != null) {
                                                i = C21284R.id.dispute_updated_at_row;
                                                RdsDataRowView rdsDataRowView5 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                                if (rdsDataRowView5 != null) {
                                                    i = C21284R.id.memo_compose_view;
                                                    ComposeView composeView3 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                                    if (composeView3 != null) {
                                                        i = C21284R.id.scroll_view;
                                                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                                                        if (scrollView != null) {
                                                            i = C21284R.id.status_banner;
                                                            RdsInfoBannerView rdsInfoBannerView3 = (RdsInfoBannerView) ViewBindings.findChildViewById(view, i);
                                                            if (rdsInfoBannerView3 != null) {
                                                                i = C21284R.id.status_row;
                                                                RdsDataRowView rdsDataRowView6 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                                                if (rdsDataRowView6 != null) {
                                                                    i = C21284R.id.subtitle_text;
                                                                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (rhTextView2 != null) {
                                                                        i = C21284R.id.transaction_id_row;
                                                                        RdsDataRowView rdsDataRowView7 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                                                        if (rdsDataRowView7 != null) {
                                                                            i = C21284R.id.transactor_identifier_row;
                                                                            RdsDataRowView rdsDataRowView8 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                                                            if (rdsDataRowView8 != null) {
                                                                                return new FragmentMatchaTransferDetailBinding((ConstraintLayout) view, rdsDataRowView, rhTextView, composeView, composeView2, rdsDataRowView2, rdsInfoBannerView, linearLayout, rdsDataRowView3, rdsInfoBannerView2, rdsDataRowView4, rdsDataRowView5, composeView3, scrollView, rdsInfoBannerView3, rdsDataRowView6, rhTextView2, rdsDataRowView7, rdsDataRowView8);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
