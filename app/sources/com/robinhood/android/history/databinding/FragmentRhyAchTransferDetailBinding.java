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
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class FragmentRhyAchTransferDetailBinding implements ViewBinding {
    public final RdsDataRowView acatMatchRemovalRow;
    public final RdsButton cancelButton;
    public final RdsDataRowView destinationRow;
    public final RdsDataRowView estAvailabilityRow;
    public final RdsDataRowView goldDepositBoostRow;
    public final RdsDataRowView initiatedRow;
    public final ComposeView iraInfoSection;
    public final ShimmerLoadingView loadingView;
    private final FrameLayout rootView;
    public final RdsDataRowView sourceRow;
    public final RdsDataRowView statusRow;
    public final LinearLayout stickyFooterContent;

    private FragmentRhyAchTransferDetailBinding(FrameLayout frameLayout, RdsDataRowView rdsDataRowView, RdsButton rdsButton, RdsDataRowView rdsDataRowView2, RdsDataRowView rdsDataRowView3, RdsDataRowView rdsDataRowView4, RdsDataRowView rdsDataRowView5, ComposeView composeView, ShimmerLoadingView shimmerLoadingView, RdsDataRowView rdsDataRowView6, RdsDataRowView rdsDataRowView7, LinearLayout linearLayout) {
        this.rootView = frameLayout;
        this.acatMatchRemovalRow = rdsDataRowView;
        this.cancelButton = rdsButton;
        this.destinationRow = rdsDataRowView2;
        this.estAvailabilityRow = rdsDataRowView3;
        this.goldDepositBoostRow = rdsDataRowView4;
        this.initiatedRow = rdsDataRowView5;
        this.iraInfoSection = composeView;
        this.loadingView = shimmerLoadingView;
        this.sourceRow = rdsDataRowView6;
        this.statusRow = rdsDataRowView7;
        this.stickyFooterContent = linearLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRhyAchTransferDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRhyAchTransferDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.fragment_rhy_ach_transfer_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRhyAchTransferDetailBinding bind(View view) {
        int i = C18359R.id.acat_match_removal_row;
        RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
        if (rdsDataRowView != null) {
            i = C18359R.id.cancel_button;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C18359R.id.destination_row;
                RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                if (rdsDataRowView2 != null) {
                    i = C18359R.id.est_availability_row;
                    RdsDataRowView rdsDataRowView3 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsDataRowView3 != null) {
                        i = C18359R.id.gold_deposit_boost_row;
                        RdsDataRowView rdsDataRowView4 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsDataRowView4 != null) {
                            i = C18359R.id.initiated_row;
                            RdsDataRowView rdsDataRowView5 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsDataRowView5 != null) {
                                i = C18359R.id.ira_info_section;
                                ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                                if (composeView != null) {
                                    i = C18359R.id.loading_view;
                                    ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                                    if (shimmerLoadingView != null) {
                                        i = C18359R.id.source_row;
                                        RdsDataRowView rdsDataRowView6 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                        if (rdsDataRowView6 != null) {
                                            i = C18359R.id.status_row;
                                            RdsDataRowView rdsDataRowView7 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                            if (rdsDataRowView7 != null) {
                                                i = C18359R.id.sticky_footer_content;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout != null) {
                                                    return new FragmentRhyAchTransferDetailBinding((FrameLayout) view, rdsDataRowView, rdsButton, rdsDataRowView2, rdsDataRowView3, rdsDataRowView4, rdsDataRowView5, composeView, shimmerLoadingView, rdsDataRowView6, rdsDataRowView7, linearLayout);
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
