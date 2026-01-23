package com.robinhood.android.crypto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.history.p082ui.UnifiedHistoryView;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.crypto.p094ui.view.availableCoins.AvailableCoinsView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.newsfeed.p200ui.AssetNewsFeedView;

/* loaded from: classes2.dex */
public final class FragmentCryptoDetailBinding implements ViewBinding {
    public final AssetNewsFeedView assetNewsfeedView;
    public final AvailableCoinsView availableCoinsView;
    public final ComposeView cryptoAboutView;
    public final ComposeView cryptoDetailCard;
    public final LinearLayout cryptoDetailContainer;
    public final ComposeView cryptoDetailCopilotDigest;
    public final NestedScrollView cryptoDetailScrollview;
    public final ViewStub cryptoHistoricalGraphLayoutStub;
    public final ComposeView cryptoHistoricalSduiChartComposeView;
    public final ComposeView cryptoPendingOrdersSection;
    public final ComposeView cryptoPerpetualsBannerView;
    public final ComposeView cryptoRecurringView;
    public final ComposeView cryptoRewardsDetails;
    public final ComposeView cryptoStakingView;
    public final ComposeView cryptoStatsView;
    public final ComposeView disclosure;
    public final RhTextView historyViewHeaderTxt;
    public final RhTextView newsViewHeaderTxt;
    public final ComposeView rhcPositionView;
    private final ConstraintLayout rootView;
    public final ComposeView topInfoBanner;
    public final ComposeView tradeBar;
    public final ComposeView traderPositionView;
    public final UnifiedHistoryView unifiedHistory;

    private FragmentCryptoDetailBinding(ConstraintLayout constraintLayout, AssetNewsFeedView assetNewsFeedView, AvailableCoinsView availableCoinsView, ComposeView composeView, ComposeView composeView2, LinearLayout linearLayout, ComposeView composeView3, NestedScrollView nestedScrollView, ViewStub viewStub, ComposeView composeView4, ComposeView composeView5, ComposeView composeView6, ComposeView composeView7, ComposeView composeView8, ComposeView composeView9, ComposeView composeView10, ComposeView composeView11, RhTextView rhTextView, RhTextView rhTextView2, ComposeView composeView12, ComposeView composeView13, ComposeView composeView14, ComposeView composeView15, UnifiedHistoryView unifiedHistoryView) {
        this.rootView = constraintLayout;
        this.assetNewsfeedView = assetNewsFeedView;
        this.availableCoinsView = availableCoinsView;
        this.cryptoAboutView = composeView;
        this.cryptoDetailCard = composeView2;
        this.cryptoDetailContainer = linearLayout;
        this.cryptoDetailCopilotDigest = composeView3;
        this.cryptoDetailScrollview = nestedScrollView;
        this.cryptoHistoricalGraphLayoutStub = viewStub;
        this.cryptoHistoricalSduiChartComposeView = composeView4;
        this.cryptoPendingOrdersSection = composeView5;
        this.cryptoPerpetualsBannerView = composeView6;
        this.cryptoRecurringView = composeView7;
        this.cryptoRewardsDetails = composeView8;
        this.cryptoStakingView = composeView9;
        this.cryptoStatsView = composeView10;
        this.disclosure = composeView11;
        this.historyViewHeaderTxt = rhTextView;
        this.newsViewHeaderTxt = rhTextView2;
        this.rhcPositionView = composeView12;
        this.topInfoBanner = composeView13;
        this.tradeBar = composeView14;
        this.traderPositionView = composeView15;
        this.unifiedHistory = unifiedHistoryView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCryptoDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCryptoDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C12757R.layout.fragment_crypto_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCryptoDetailBinding bind(View view) {
        int i = C12757R.id.asset_newsfeed_view;
        AssetNewsFeedView assetNewsFeedView = (AssetNewsFeedView) ViewBindings.findChildViewById(view, i);
        if (assetNewsFeedView != null) {
            i = C12757R.id.available_coins_view;
            AvailableCoinsView availableCoinsView = (AvailableCoinsView) ViewBindings.findChildViewById(view, i);
            if (availableCoinsView != null) {
                i = C12757R.id.crypto_about_view;
                ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                if (composeView != null) {
                    i = C12757R.id.crypto_detail_card;
                    ComposeView composeView2 = (ComposeView) ViewBindings.findChildViewById(view, i);
                    if (composeView2 != null) {
                        i = C12757R.id.crypto_detail_container;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = C12757R.id.crypto_detail_copilot_digest;
                            ComposeView composeView3 = (ComposeView) ViewBindings.findChildViewById(view, i);
                            if (composeView3 != null) {
                                i = C12757R.id.crypto_detail_scrollview;
                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                if (nestedScrollView != null) {
                                    i = C12757R.id.crypto_historical_graph_layout_stub;
                                    ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, i);
                                    if (viewStub != null) {
                                        i = C12757R.id.crypto_historical_sdui_chart_compose_view;
                                        ComposeView composeView4 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                        if (composeView4 != null) {
                                            i = C12757R.id.crypto_pending_orders_section;
                                            ComposeView composeView5 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                            if (composeView5 != null) {
                                                i = C12757R.id.crypto_perpetuals_banner_view;
                                                ComposeView composeView6 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                                if (composeView6 != null) {
                                                    i = C12757R.id.crypto_recurring_view;
                                                    ComposeView composeView7 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                                    if (composeView7 != null) {
                                                        i = C12757R.id.crypto_rewards_details;
                                                        ComposeView composeView8 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                                        if (composeView8 != null) {
                                                            i = C12757R.id.crypto_staking_view;
                                                            ComposeView composeView9 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                                            if (composeView9 != null) {
                                                                i = C12757R.id.crypto_stats_view;
                                                                ComposeView composeView10 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                                                if (composeView10 != null) {
                                                                    i = C12757R.id.disclosure;
                                                                    ComposeView composeView11 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                                                    if (composeView11 != null) {
                                                                        i = C12757R.id.history_view_header_txt;
                                                                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (rhTextView != null) {
                                                                            i = C12757R.id.news_view_header_txt;
                                                                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (rhTextView2 != null) {
                                                                                i = C12757R.id.rhc_position_view;
                                                                                ComposeView composeView12 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                                                                if (composeView12 != null) {
                                                                                    i = C12757R.id.top_info_banner;
                                                                                    ComposeView composeView13 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                                                                    if (composeView13 != null) {
                                                                                        i = C12757R.id.trade_bar;
                                                                                        ComposeView composeView14 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                                                                        if (composeView14 != null) {
                                                                                            i = C12757R.id.trader_position_view;
                                                                                            ComposeView composeView15 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                                                                            if (composeView15 != null) {
                                                                                                i = C12757R.id.unified_history;
                                                                                                UnifiedHistoryView unifiedHistoryView = (UnifiedHistoryView) ViewBindings.findChildViewById(view, i);
                                                                                                if (unifiedHistoryView != null) {
                                                                                                    return new FragmentCryptoDetailBinding((ConstraintLayout) view, assetNewsFeedView, availableCoinsView, composeView, composeView2, linearLayout, composeView3, nestedScrollView, viewStub, composeView4, composeView5, composeView6, composeView7, composeView8, composeView9, composeView10, composeView11, rhTextView, rhTextView2, composeView12, composeView13, composeView14, composeView15, unifiedHistoryView);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
