package com.robinhood.android.accountcenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.accountcenter.views.AccountCenterBubbleView;
import com.robinhood.android.accountcenter.views.ProfileAccountBreakdownView;
import com.robinhood.android.accountcenter.views.ProfileEmptyAssetBreakdownView;
import com.robinhood.android.accountcenter.views.circlechart.CircleChartView;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.feature.discovery.p382ui.FeatureDiscoveryWidgetView;

/* loaded from: classes24.dex */
public final class IncludeAccountCenterBubbleViewBinding implements ViewBinding {
    public final AccountCenterBubbleView accountCenterBubble;
    public final IncludeProfileAssetTabLayoutBinding assetTabLayout;
    public final RdsInfoBannerView belowChartInfoBanner;
    public final CircleChartView circleChartView;
    public final ProfileAccountBreakdownView profileAccountBreakdownView;
    public final RhTextView profileAssetBreakdownDescriptionTxt;
    public final RecyclerView profileAssetBreakdownRecyclerView;
    public final LinearLayout profileCircleChartHeaderContainer;
    public final RhTextView profileCircleChartHeaderTxt;
    public final RhTextView profileDisclosureTxt;
    public final ProfileEmptyAssetBreakdownView profileEmptyAssetBreakdownView;
    public final FeatureDiscoveryWidgetView profileFeatureDiscovery;
    public final ImageView profileInsightListHeaderInfoImg;
    public final RhTextView profileInsightListHeaderTxt;
    public final RecyclerView profileInsightRecyclerView;
    private final AccountCenterBubbleView rootView;

    private IncludeAccountCenterBubbleViewBinding(AccountCenterBubbleView accountCenterBubbleView, AccountCenterBubbleView accountCenterBubbleView2, IncludeProfileAssetTabLayoutBinding includeProfileAssetTabLayoutBinding, RdsInfoBannerView rdsInfoBannerView, CircleChartView circleChartView, ProfileAccountBreakdownView profileAccountBreakdownView, RhTextView rhTextView, RecyclerView recyclerView, LinearLayout linearLayout, RhTextView rhTextView2, RhTextView rhTextView3, ProfileEmptyAssetBreakdownView profileEmptyAssetBreakdownView, FeatureDiscoveryWidgetView featureDiscoveryWidgetView, ImageView imageView, RhTextView rhTextView4, RecyclerView recyclerView2) {
        this.rootView = accountCenterBubbleView;
        this.accountCenterBubble = accountCenterBubbleView2;
        this.assetTabLayout = includeProfileAssetTabLayoutBinding;
        this.belowChartInfoBanner = rdsInfoBannerView;
        this.circleChartView = circleChartView;
        this.profileAccountBreakdownView = profileAccountBreakdownView;
        this.profileAssetBreakdownDescriptionTxt = rhTextView;
        this.profileAssetBreakdownRecyclerView = recyclerView;
        this.profileCircleChartHeaderContainer = linearLayout;
        this.profileCircleChartHeaderTxt = rhTextView2;
        this.profileDisclosureTxt = rhTextView3;
        this.profileEmptyAssetBreakdownView = profileEmptyAssetBreakdownView;
        this.profileFeatureDiscovery = featureDiscoveryWidgetView;
        this.profileInsightListHeaderInfoImg = imageView;
        this.profileInsightListHeaderTxt = rhTextView4;
        this.profileInsightRecyclerView = recyclerView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public AccountCenterBubbleView getRoot() {
        return this.rootView;
    }

    public static IncludeAccountCenterBubbleViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAccountCenterBubbleViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8293R.layout.include_account_center_bubble_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAccountCenterBubbleViewBinding bind(View view) {
        AccountCenterBubbleView accountCenterBubbleView = (AccountCenterBubbleView) view;
        int i = C8293R.id.asset_tab_layout;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            IncludeProfileAssetTabLayoutBinding includeProfileAssetTabLayoutBindingBind = IncludeProfileAssetTabLayoutBinding.bind(viewFindChildViewById);
            i = C8293R.id.below_chart_info_banner;
            RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) ViewBindings.findChildViewById(view, i);
            if (rdsInfoBannerView != null) {
                i = C8293R.id.circle_chart_view;
                CircleChartView circleChartView = (CircleChartView) ViewBindings.findChildViewById(view, i);
                if (circleChartView != null) {
                    i = C8293R.id.profile_account_breakdown_view;
                    ProfileAccountBreakdownView profileAccountBreakdownView = (ProfileAccountBreakdownView) ViewBindings.findChildViewById(view, i);
                    if (profileAccountBreakdownView != null) {
                        i = C8293R.id.profile_asset_breakdown_description_txt;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C8293R.id.profile_asset_breakdown_recycler_view;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = C8293R.id.profile_circle_chart_header_container;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    i = C8293R.id.profile_circle_chart_header_txt;
                                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView2 != null) {
                                        i = C8293R.id.profile_disclosure_txt;
                                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView3 != null) {
                                            i = C8293R.id.profile_empty_asset_breakdown_view;
                                            ProfileEmptyAssetBreakdownView profileEmptyAssetBreakdownView = (ProfileEmptyAssetBreakdownView) ViewBindings.findChildViewById(view, i);
                                            if (profileEmptyAssetBreakdownView != null) {
                                                i = C8293R.id.profile_feature_discovery;
                                                FeatureDiscoveryWidgetView featureDiscoveryWidgetView = (FeatureDiscoveryWidgetView) ViewBindings.findChildViewById(view, i);
                                                if (featureDiscoveryWidgetView != null) {
                                                    i = C8293R.id.profile_insight_list_header_info_img;
                                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                                    if (imageView != null) {
                                                        i = C8293R.id.profile_insight_list_header_txt;
                                                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                        if (rhTextView4 != null) {
                                                            i = C8293R.id.profile_insight_recycler_view;
                                                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                            if (recyclerView2 != null) {
                                                                return new IncludeAccountCenterBubbleViewBinding(accountCenterBubbleView, accountCenterBubbleView, includeProfileAssetTabLayoutBindingBind, rdsInfoBannerView, circleChartView, profileAccountBreakdownView, rhTextView, recyclerView, linearLayout, rhTextView2, rhTextView3, profileEmptyAssetBreakdownView, featureDiscoveryWidgetView, imageView, rhTextView4, recyclerView2);
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
