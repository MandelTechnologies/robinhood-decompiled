package com.robinhood.android.rewards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.rewards.C27314R;

/* loaded from: classes5.dex */
public final class FragmentRewardDetailBinding implements ViewBinding {
    public final RdsInfoBannerView rewardClaimBanner;
    public final RdsDataRowView rewardDetailBackupWithholding;
    public final RdsDataRowView rewardDetailCostValue;
    public final RdsDataRowView rewardDetailDate;
    public final RhTextView rewardDetailHeader;
    public final RdsDataRowView rewardDetailNetCredit;
    public final RdsDataRowView rewardDetailReward;
    public final RdsDataRowView rewardDetailRewardValue;
    public final RdsDataRowView rewardDetailStatus;
    public final RhTextView rewardDetailSubheader;
    private final ScrollView rootView;

    private FragmentRewardDetailBinding(ScrollView scrollView, RdsInfoBannerView rdsInfoBannerView, RdsDataRowView rdsDataRowView, RdsDataRowView rdsDataRowView2, RdsDataRowView rdsDataRowView3, RhTextView rhTextView, RdsDataRowView rdsDataRowView4, RdsDataRowView rdsDataRowView5, RdsDataRowView rdsDataRowView6, RdsDataRowView rdsDataRowView7, RhTextView rhTextView2) {
        this.rootView = scrollView;
        this.rewardClaimBanner = rdsInfoBannerView;
        this.rewardDetailBackupWithholding = rdsDataRowView;
        this.rewardDetailCostValue = rdsDataRowView2;
        this.rewardDetailDate = rdsDataRowView3;
        this.rewardDetailHeader = rhTextView;
        this.rewardDetailNetCredit = rdsDataRowView4;
        this.rewardDetailReward = rdsDataRowView5;
        this.rewardDetailRewardValue = rdsDataRowView6;
        this.rewardDetailStatus = rdsDataRowView7;
        this.rewardDetailSubheader = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentRewardDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRewardDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27314R.layout.fragment_reward_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRewardDetailBinding bind(View view) {
        int i = C27314R.id.reward_claim_banner;
        RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) ViewBindings.findChildViewById(view, i);
        if (rdsInfoBannerView != null) {
            i = C27314R.id.reward_detail_backup_withholding;
            RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
            if (rdsDataRowView != null) {
                i = C27314R.id.reward_detail_cost_value;
                RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                if (rdsDataRowView2 != null) {
                    i = C27314R.id.reward_detail_date;
                    RdsDataRowView rdsDataRowView3 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsDataRowView3 != null) {
                        i = C27314R.id.reward_detail_header;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C27314R.id.reward_detail_net_credit;
                            RdsDataRowView rdsDataRowView4 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsDataRowView4 != null) {
                                i = C27314R.id.reward_detail_reward;
                                RdsDataRowView rdsDataRowView5 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                if (rdsDataRowView5 != null) {
                                    i = C27314R.id.reward_detail_reward_value;
                                    RdsDataRowView rdsDataRowView6 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                    if (rdsDataRowView6 != null) {
                                        i = C27314R.id.reward_detail_status;
                                        RdsDataRowView rdsDataRowView7 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                        if (rdsDataRowView7 != null) {
                                            i = C27314R.id.reward_detail_subheader;
                                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView2 != null) {
                                                return new FragmentRewardDetailBinding((ScrollView) view, rdsInfoBannerView, rdsDataRowView, rdsDataRowView2, rdsDataRowView3, rhTextView, rdsDataRowView4, rdsDataRowView5, rdsDataRowView6, rdsDataRowView7, rhTextView2);
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
