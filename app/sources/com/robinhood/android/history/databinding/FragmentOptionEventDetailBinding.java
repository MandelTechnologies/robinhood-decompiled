package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class FragmentOptionEventDetailBinding implements ViewBinding {
    public final ShimmerLoadingView loadingView;
    public final RdsDataRowView optionEventDetailAccountUsed;
    public final RdsInfoBannerView optionEventDetailAlertText;
    public final RdsButton optionEventDetailCancelExercise;
    public final RdsButton optionEventDetailContactSupport;
    public final RdsDataRowView optionEventDetailContracts;
    public final RdsDataRowView optionEventDetailCost;
    public final RdsDataRowView optionEventDetailCredit;
    public final RdsDataRowView optionEventDetailDate;
    public final Space optionEventDetailMultilegSentinel;
    public final LinearLayout optionEventDetailParent;
    public final RdsDataRowView optionEventDetailPrice;
    public final RdsDataRowView optionEventDetailRealizedProfitLoss;
    public final RdsDataRowView optionEventDetailStatus;
    public final RhTextView optionEventDetailStatusSupplementaryTxt;
    private final FrameLayout rootView;

    private FragmentOptionEventDetailBinding(FrameLayout frameLayout, ShimmerLoadingView shimmerLoadingView, RdsDataRowView rdsDataRowView, RdsInfoBannerView rdsInfoBannerView, RdsButton rdsButton, RdsButton rdsButton2, RdsDataRowView rdsDataRowView2, RdsDataRowView rdsDataRowView3, RdsDataRowView rdsDataRowView4, RdsDataRowView rdsDataRowView5, Space space, LinearLayout linearLayout, RdsDataRowView rdsDataRowView6, RdsDataRowView rdsDataRowView7, RdsDataRowView rdsDataRowView8, RhTextView rhTextView) {
        this.rootView = frameLayout;
        this.loadingView = shimmerLoadingView;
        this.optionEventDetailAccountUsed = rdsDataRowView;
        this.optionEventDetailAlertText = rdsInfoBannerView;
        this.optionEventDetailCancelExercise = rdsButton;
        this.optionEventDetailContactSupport = rdsButton2;
        this.optionEventDetailContracts = rdsDataRowView2;
        this.optionEventDetailCost = rdsDataRowView3;
        this.optionEventDetailCredit = rdsDataRowView4;
        this.optionEventDetailDate = rdsDataRowView5;
        this.optionEventDetailMultilegSentinel = space;
        this.optionEventDetailParent = linearLayout;
        this.optionEventDetailPrice = rdsDataRowView6;
        this.optionEventDetailRealizedProfitLoss = rdsDataRowView7;
        this.optionEventDetailStatus = rdsDataRowView8;
        this.optionEventDetailStatusSupplementaryTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOptionEventDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionEventDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.fragment_option_event_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionEventDetailBinding bind(View view) {
        int i = C18359R.id.loading_view;
        ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
        if (shimmerLoadingView != null) {
            i = C18359R.id.option_event_detail_account_used;
            RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
            if (rdsDataRowView != null) {
                i = C18359R.id.option_event_detail_alert_text;
                RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) ViewBindings.findChildViewById(view, i);
                if (rdsInfoBannerView != null) {
                    i = C18359R.id.option_event_detail_cancel_exercise;
                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton != null) {
                        i = C18359R.id.option_event_detail_contact_support;
                        RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton2 != null) {
                            i = C18359R.id.option_event_detail_contracts;
                            RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsDataRowView2 != null) {
                                i = C18359R.id.option_event_detail_cost;
                                RdsDataRowView rdsDataRowView3 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                if (rdsDataRowView3 != null) {
                                    i = C18359R.id.option_event_detail_credit;
                                    RdsDataRowView rdsDataRowView4 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                    if (rdsDataRowView4 != null) {
                                        i = C18359R.id.option_event_detail_date;
                                        RdsDataRowView rdsDataRowView5 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                        if (rdsDataRowView5 != null) {
                                            i = C18359R.id.option_event_detail_multileg_sentinel;
                                            Space space = (Space) ViewBindings.findChildViewById(view, i);
                                            if (space != null) {
                                                i = C18359R.id.option_event_detail_parent;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout != null) {
                                                    i = C18359R.id.option_event_detail_price;
                                                    RdsDataRowView rdsDataRowView6 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                                    if (rdsDataRowView6 != null) {
                                                        i = C18359R.id.option_event_detail_realized_profit_loss;
                                                        RdsDataRowView rdsDataRowView7 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                                        if (rdsDataRowView7 != null) {
                                                            i = C18359R.id.option_event_detail_status;
                                                            RdsDataRowView rdsDataRowView8 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                                            if (rdsDataRowView8 != null) {
                                                                i = C18359R.id.option_event_detail_status_supplementary_txt;
                                                                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                if (rhTextView != null) {
                                                                    return new FragmentOptionEventDetailBinding((FrameLayout) view, shimmerLoadingView, rdsDataRowView, rdsInfoBannerView, rdsButton, rdsButton2, rdsDataRowView2, rdsDataRowView3, rdsDataRowView4, rdsDataRowView5, space, linearLayout, rdsDataRowView6, rdsDataRowView7, rdsDataRowView8, rhTextView);
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
