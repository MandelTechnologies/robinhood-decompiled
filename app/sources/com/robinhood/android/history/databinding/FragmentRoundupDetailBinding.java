package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class FragmentRoundupDetailBinding implements ViewBinding {
    public final ShimmerLoadingView loadingView;
    private final FrameLayout rootView;
    public final RdsDataRowView roundupDetailBonusAmount;
    public final RdsDataRowView roundupDetailBonusPercent;
    public final RdsDataRowView roundupDetailRoundupAmount;
    public final RdsDataRowView roundupDetailRoundupPeriod;
    public final RecyclerView roundupDetailTimelineContainer;
    public final RdsInfoBannerView roundupDetailTopBanner;
    public final RdsDataRowView roundupDetailTotalInvested;
    public final RdsButton roundupDetailViewTransactionsButton;

    private FragmentRoundupDetailBinding(FrameLayout frameLayout, ShimmerLoadingView shimmerLoadingView, RdsDataRowView rdsDataRowView, RdsDataRowView rdsDataRowView2, RdsDataRowView rdsDataRowView3, RdsDataRowView rdsDataRowView4, RecyclerView recyclerView, RdsInfoBannerView rdsInfoBannerView, RdsDataRowView rdsDataRowView5, RdsButton rdsButton) {
        this.rootView = frameLayout;
        this.loadingView = shimmerLoadingView;
        this.roundupDetailBonusAmount = rdsDataRowView;
        this.roundupDetailBonusPercent = rdsDataRowView2;
        this.roundupDetailRoundupAmount = rdsDataRowView3;
        this.roundupDetailRoundupPeriod = rdsDataRowView4;
        this.roundupDetailTimelineContainer = recyclerView;
        this.roundupDetailTopBanner = rdsInfoBannerView;
        this.roundupDetailTotalInvested = rdsDataRowView5;
        this.roundupDetailViewTransactionsButton = rdsButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRoundupDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRoundupDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.fragment_roundup_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRoundupDetailBinding bind(View view) {
        int i = C18359R.id.loading_view;
        ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
        if (shimmerLoadingView != null) {
            i = C18359R.id.roundup_detail_bonus_amount;
            RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
            if (rdsDataRowView != null) {
                i = C18359R.id.roundup_detail_bonus_percent;
                RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                if (rdsDataRowView2 != null) {
                    i = C18359R.id.roundup_detail_roundup_amount;
                    RdsDataRowView rdsDataRowView3 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsDataRowView3 != null) {
                        i = C18359R.id.roundup_detail_roundup_period;
                        RdsDataRowView rdsDataRowView4 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsDataRowView4 != null) {
                            i = C18359R.id.roundup_detail_timeline_container;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = C18359R.id.roundup_detail_top_banner;
                                RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) ViewBindings.findChildViewById(view, i);
                                if (rdsInfoBannerView != null) {
                                    i = C18359R.id.roundup_detail_total_invested;
                                    RdsDataRowView rdsDataRowView5 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                    if (rdsDataRowView5 != null) {
                                        i = C18359R.id.roundup_detail_view_transactions_button;
                                        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                        if (rdsButton != null) {
                                            return new FragmentRoundupDetailBinding((FrameLayout) view, shimmerLoadingView, rdsDataRowView, rdsDataRowView2, rdsDataRowView3, rdsDataRowView4, recyclerView, rdsInfoBannerView, rdsDataRowView5, rdsButton);
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
