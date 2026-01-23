package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class FragmentNonOriginatedAchTransferDetailBinding implements ViewBinding {
    public final ShimmerLoadingView loadingView;
    public final RdsDataRowView nonOrigAchGoldDepositBoostSection;
    public final RhTextView nonOrigAchTransferDetailAdditionalInfoTxt;
    public final RdsDataRowView nonOrigAchTransferDetailAmount;
    public final RdsDataRowView nonOrigAchTransferDetailGranted;
    public final RdsDataRowView nonOrigAchTransferDetailInitiated;
    public final RdsDataRowView nonOrigAchTransferDetailLastUpdated;
    public final RdsDataRowView nonOrigAchTransferDetailOriginator;
    public final RdsDataRowView nonOrigAchTransferDetailReason;
    public final RdsDataRowView nonOrigAchTransferDetailReceiver;
    public final RdsDataRowView nonOrigAchTransferDetailStatus;
    private final FrameLayout rootView;

    private FragmentNonOriginatedAchTransferDetailBinding(FrameLayout frameLayout, ShimmerLoadingView shimmerLoadingView, RdsDataRowView rdsDataRowView, RhTextView rhTextView, RdsDataRowView rdsDataRowView2, RdsDataRowView rdsDataRowView3, RdsDataRowView rdsDataRowView4, RdsDataRowView rdsDataRowView5, RdsDataRowView rdsDataRowView6, RdsDataRowView rdsDataRowView7, RdsDataRowView rdsDataRowView8, RdsDataRowView rdsDataRowView9) {
        this.rootView = frameLayout;
        this.loadingView = shimmerLoadingView;
        this.nonOrigAchGoldDepositBoostSection = rdsDataRowView;
        this.nonOrigAchTransferDetailAdditionalInfoTxt = rhTextView;
        this.nonOrigAchTransferDetailAmount = rdsDataRowView2;
        this.nonOrigAchTransferDetailGranted = rdsDataRowView3;
        this.nonOrigAchTransferDetailInitiated = rdsDataRowView4;
        this.nonOrigAchTransferDetailLastUpdated = rdsDataRowView5;
        this.nonOrigAchTransferDetailOriginator = rdsDataRowView6;
        this.nonOrigAchTransferDetailReason = rdsDataRowView7;
        this.nonOrigAchTransferDetailReceiver = rdsDataRowView8;
        this.nonOrigAchTransferDetailStatus = rdsDataRowView9;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentNonOriginatedAchTransferDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentNonOriginatedAchTransferDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.fragment_non_originated_ach_transfer_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentNonOriginatedAchTransferDetailBinding bind(View view) {
        int i = C18359R.id.loading_view;
        ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
        if (shimmerLoadingView != null) {
            i = C18359R.id.non_orig_ach_gold_deposit_boost_section;
            RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
            if (rdsDataRowView != null) {
                i = C18359R.id.non_orig_ach_transfer_detail_additional_info_txt;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C18359R.id.non_orig_ach_transfer_detail_amount;
                    RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsDataRowView2 != null) {
                        i = C18359R.id.non_orig_ach_transfer_detail_granted;
                        RdsDataRowView rdsDataRowView3 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsDataRowView3 != null) {
                            i = C18359R.id.non_orig_ach_transfer_detail_initiated;
                            RdsDataRowView rdsDataRowView4 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsDataRowView4 != null) {
                                i = C18359R.id.non_orig_ach_transfer_detail_last_updated;
                                RdsDataRowView rdsDataRowView5 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                if (rdsDataRowView5 != null) {
                                    i = C18359R.id.non_orig_ach_transfer_detail_originator;
                                    RdsDataRowView rdsDataRowView6 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                    if (rdsDataRowView6 != null) {
                                        i = C18359R.id.non_orig_ach_transfer_detail_reason;
                                        RdsDataRowView rdsDataRowView7 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                        if (rdsDataRowView7 != null) {
                                            i = C18359R.id.non_orig_ach_transfer_detail_receiver;
                                            RdsDataRowView rdsDataRowView8 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                            if (rdsDataRowView8 != null) {
                                                i = C18359R.id.non_orig_ach_transfer_detail_status;
                                                RdsDataRowView rdsDataRowView9 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                                if (rdsDataRowView9 != null) {
                                                    return new FragmentNonOriginatedAchTransferDetailBinding((FrameLayout) view, shimmerLoadingView, rdsDataRowView, rhTextView, rdsDataRowView2, rdsDataRowView3, rdsDataRowView4, rdsDataRowView5, rdsDataRowView6, rdsDataRowView7, rdsDataRowView8, rdsDataRowView9);
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
