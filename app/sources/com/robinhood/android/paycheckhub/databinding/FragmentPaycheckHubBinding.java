package com.robinhood.android.paycheckhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.paycheckhub.C25434R;
import com.robinhood.android.paycheckhub.p213ui.PaycheckDistributionView;

/* loaded from: classes11.dex */
public final class FragmentPaycheckHubBinding implements ViewBinding {
    public final RhTextView lastPaycheckAmount;
    public final PaycheckDistributionView paycheckDistributionView;
    public final RhTextView paycheckHistoryTitle;
    public final RdsInfoBannerView paycheckHubBanner;
    public final RhTextView paycheckHubSubtitle;
    public final ImageView paycheckHubSubtitleEarlyPayIcon;
    public final RdsTextButton paycheckRecurringInvestmentsButton;
    public final RecyclerView paycheckRecyclerView;
    private final ConstraintLayout rootView;
    public final ComposeView setUpIraCard;
    public final RdsButton setupDirectDepositButton;
    public final RdsButton showAllPaychecksButton;

    private FragmentPaycheckHubBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, PaycheckDistributionView paycheckDistributionView, RhTextView rhTextView2, RdsInfoBannerView rdsInfoBannerView, RhTextView rhTextView3, ImageView imageView, RdsTextButton rdsTextButton, RecyclerView recyclerView, ComposeView composeView, RdsButton rdsButton, RdsButton rdsButton2) {
        this.rootView = constraintLayout;
        this.lastPaycheckAmount = rhTextView;
        this.paycheckDistributionView = paycheckDistributionView;
        this.paycheckHistoryTitle = rhTextView2;
        this.paycheckHubBanner = rdsInfoBannerView;
        this.paycheckHubSubtitle = rhTextView3;
        this.paycheckHubSubtitleEarlyPayIcon = imageView;
        this.paycheckRecurringInvestmentsButton = rdsTextButton;
        this.paycheckRecyclerView = recyclerView;
        this.setUpIraCard = composeView;
        this.setupDirectDepositButton = rdsButton;
        this.showAllPaychecksButton = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPaycheckHubBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPaycheckHubBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25434R.layout.fragment_paycheck_hub, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPaycheckHubBinding bind(View view) {
        int i = C25434R.id.last_paycheck_amount;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C25434R.id.paycheck_distribution_view;
            PaycheckDistributionView paycheckDistributionView = (PaycheckDistributionView) ViewBindings.findChildViewById(view, i);
            if (paycheckDistributionView != null) {
                i = C25434R.id.paycheck_history_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C25434R.id.paycheck_hub_banner;
                    RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) ViewBindings.findChildViewById(view, i);
                    if (rdsInfoBannerView != null) {
                        i = C25434R.id.paycheck_hub_subtitle;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C25434R.id.paycheck_hub_subtitle_early_pay_icon;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = C25434R.id.paycheck_recurring_investments_button;
                                RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
                                if (rdsTextButton != null) {
                                    i = C25434R.id.paycheck_recycler_view;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                    if (recyclerView != null) {
                                        i = C25434R.id.set_up_ira_card;
                                        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                                        if (composeView != null) {
                                            i = C25434R.id.setup_direct_deposit_button;
                                            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                            if (rdsButton != null) {
                                                i = C25434R.id.show_all_paychecks_button;
                                                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                if (rdsButton2 != null) {
                                                    return new FragmentPaycheckHubBinding((ConstraintLayout) view, rhTextView, paycheckDistributionView, rhTextView2, rdsInfoBannerView, rhTextView3, imageView, rdsTextButton, recyclerView, composeView, rdsButton, rdsButton2);
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
