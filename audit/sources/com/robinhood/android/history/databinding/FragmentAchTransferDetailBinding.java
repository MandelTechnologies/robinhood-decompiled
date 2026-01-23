package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class FragmentAchTransferDetailBinding implements ViewBinding {
    public final RhTextView additionalInfoText;
    public final RdsDataRowView availableNowSection;
    public final RhTextView bonusRemovedExplanation;
    public final RdsDataRowView bonusRemovedSection;
    public final RdsButton cancelButton;
    public final RdsDataRowView destAccountRow;
    public final RhTextView errorSection;
    public final RdsDataRowView estAvailabilitySection;
    public final RdsDataRowView finalManagementFee;
    public final FrameLayout fragmentContainer;
    public final RdsDataRowView goldDepositBoostSection;
    public final ComposeView gracePeriodBanner;
    public final ComposeView gracePeriodCta;
    public final ComposeView gracePeriodDetails;
    public final RdsDataRowView initiatedSection;
    public final RdsDataRowView lastUpdatedSection;
    public final ShimmerLoadingView loadingView;
    public final RdsDataRowView proceedsFromSale;
    public final RdsDataRowView requestedAmountRow;
    private final FrameLayout rootView;
    public final RdsDataRowView sourceAccountRow;
    public final RdsInfoBannerView statusInfoBanner;
    public final RdsDataRowView statusSection;
    public final LinearLayout stickyFooterContent;

    private FragmentAchTransferDetailBinding(FrameLayout frameLayout, RhTextView rhTextView, RdsDataRowView rdsDataRowView, RhTextView rhTextView2, RdsDataRowView rdsDataRowView2, RdsButton rdsButton, RdsDataRowView rdsDataRowView3, RhTextView rhTextView3, RdsDataRowView rdsDataRowView4, RdsDataRowView rdsDataRowView5, FrameLayout frameLayout2, RdsDataRowView rdsDataRowView6, ComposeView composeView, ComposeView composeView2, ComposeView composeView3, RdsDataRowView rdsDataRowView7, RdsDataRowView rdsDataRowView8, ShimmerLoadingView shimmerLoadingView, RdsDataRowView rdsDataRowView9, RdsDataRowView rdsDataRowView10, RdsDataRowView rdsDataRowView11, RdsInfoBannerView rdsInfoBannerView, RdsDataRowView rdsDataRowView12, LinearLayout linearLayout) {
        this.rootView = frameLayout;
        this.additionalInfoText = rhTextView;
        this.availableNowSection = rdsDataRowView;
        this.bonusRemovedExplanation = rhTextView2;
        this.bonusRemovedSection = rdsDataRowView2;
        this.cancelButton = rdsButton;
        this.destAccountRow = rdsDataRowView3;
        this.errorSection = rhTextView3;
        this.estAvailabilitySection = rdsDataRowView4;
        this.finalManagementFee = rdsDataRowView5;
        this.fragmentContainer = frameLayout2;
        this.goldDepositBoostSection = rdsDataRowView6;
        this.gracePeriodBanner = composeView;
        this.gracePeriodCta = composeView2;
        this.gracePeriodDetails = composeView3;
        this.initiatedSection = rdsDataRowView7;
        this.lastUpdatedSection = rdsDataRowView8;
        this.loadingView = shimmerLoadingView;
        this.proceedsFromSale = rdsDataRowView9;
        this.requestedAmountRow = rdsDataRowView10;
        this.sourceAccountRow = rdsDataRowView11;
        this.statusInfoBanner = rdsInfoBannerView;
        this.statusSection = rdsDataRowView12;
        this.stickyFooterContent = linearLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAchTransferDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAchTransferDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.fragment_ach_transfer_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAchTransferDetailBinding bind(View view) {
        int i = C18359R.id.additional_info_text;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C18359R.id.available_now_section;
            RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
            if (rdsDataRowView != null) {
                i = C18359R.id.bonus_removed_explanation;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C18359R.id.bonus_removed_section;
                    RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsDataRowView2 != null) {
                        i = C18359R.id.cancel_button;
                        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton != null) {
                            i = C18359R.id.dest_account_row;
                            RdsDataRowView rdsDataRowView3 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsDataRowView3 != null) {
                                i = C18359R.id.error_section;
                                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView3 != null) {
                                    i = C18359R.id.est_availability_section;
                                    RdsDataRowView rdsDataRowView4 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                    if (rdsDataRowView4 != null) {
                                        i = C18359R.id.final_management_fee;
                                        RdsDataRowView rdsDataRowView5 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                        if (rdsDataRowView5 != null) {
                                            FrameLayout frameLayout = (FrameLayout) view;
                                            i = C18359R.id.gold_deposit_boost_section;
                                            RdsDataRowView rdsDataRowView6 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                            if (rdsDataRowView6 != null) {
                                                i = C18359R.id.grace_period_banner;
                                                ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                                                if (composeView != null) {
                                                    i = C18359R.id.grace_period_cta;
                                                    ComposeView composeView2 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                                    if (composeView2 != null) {
                                                        i = C18359R.id.grace_period_details;
                                                        ComposeView composeView3 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                                        if (composeView3 != null) {
                                                            i = C18359R.id.initiated_section;
                                                            RdsDataRowView rdsDataRowView7 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                                            if (rdsDataRowView7 != null) {
                                                                i = C18359R.id.last_updated_section;
                                                                RdsDataRowView rdsDataRowView8 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                                                if (rdsDataRowView8 != null) {
                                                                    i = C18359R.id.loading_view;
                                                                    ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                                                                    if (shimmerLoadingView != null) {
                                                                        i = C18359R.id.proceeds_from_sale;
                                                                        RdsDataRowView rdsDataRowView9 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                                                        if (rdsDataRowView9 != null) {
                                                                            i = C18359R.id.requested_amount_row;
                                                                            RdsDataRowView rdsDataRowView10 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                                                            if (rdsDataRowView10 != null) {
                                                                                i = C18359R.id.source_account_row;
                                                                                RdsDataRowView rdsDataRowView11 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                                                                if (rdsDataRowView11 != null) {
                                                                                    i = C18359R.id.status_info_banner;
                                                                                    RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) ViewBindings.findChildViewById(view, i);
                                                                                    if (rdsInfoBannerView != null) {
                                                                                        i = C18359R.id.status_section;
                                                                                        RdsDataRowView rdsDataRowView12 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                                                                        if (rdsDataRowView12 != null) {
                                                                                            i = C18359R.id.sticky_footer_content;
                                                                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                            if (linearLayout != null) {
                                                                                                return new FragmentAchTransferDetailBinding(frameLayout, rhTextView, rdsDataRowView, rhTextView2, rdsDataRowView2, rdsButton, rdsDataRowView3, rhTextView3, rdsDataRowView4, rdsDataRowView5, frameLayout, rdsDataRowView6, composeView, composeView2, composeView3, rdsDataRowView7, rdsDataRowView8, shimmerLoadingView, rdsDataRowView9, rdsDataRowView10, rdsDataRowView11, rdsInfoBannerView, rdsDataRowView12, linearLayout);
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
