package com.robinhood.android.cash.rewards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class FragmentRewardsNotificationDetailsBinding implements ViewBinding {
    public final LottieAnimationView rewardsNotificationDetailsAnimation;
    public final RhTextView rewardsNotificationDetailsBonus;
    public final RhTextView rewardsNotificationDetailsBonusAmount;
    public final RhTextView rewardsNotificationDetailsBonusRate;
    public final RhTextView rewardsNotificationDetailsCongrats;
    public final RhTextView rewardsNotificationDetailsDisclaimer;
    public final RdsButton rewardsNotificationDetailsDismissButton;
    public final View rewardsNotificationDetailsDivider;
    public final ImageView rewardsNotificationDetailsIcon;
    public final Guideline rewardsNotificationDetailsLeftGuideline;
    public final Guideline rewardsNotificationDetailsRightGuideline;
    public final RhTextView rewardsNotificationDetailsRoundup;
    public final RhTextView rewardsNotificationDetailsRoundupAmount;
    public final RdsButton rewardsNotificationDetailsSeeOrderButton;
    public final RhTextView rewardsNotificationDetailsTotal;
    public final RhTextView rewardsNotificationDetailsTotalAmount;
    private final ConstraintLayout rootView;

    private FragmentRewardsNotificationDetailsBinding(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4, RhTextView rhTextView5, RdsButton rdsButton, View view, ImageView imageView, Guideline guideline, Guideline guideline2, RhTextView rhTextView6, RhTextView rhTextView7, RdsButton rdsButton2, RhTextView rhTextView8, RhTextView rhTextView9) {
        this.rootView = constraintLayout;
        this.rewardsNotificationDetailsAnimation = lottieAnimationView;
        this.rewardsNotificationDetailsBonus = rhTextView;
        this.rewardsNotificationDetailsBonusAmount = rhTextView2;
        this.rewardsNotificationDetailsBonusRate = rhTextView3;
        this.rewardsNotificationDetailsCongrats = rhTextView4;
        this.rewardsNotificationDetailsDisclaimer = rhTextView5;
        this.rewardsNotificationDetailsDismissButton = rdsButton;
        this.rewardsNotificationDetailsDivider = view;
        this.rewardsNotificationDetailsIcon = imageView;
        this.rewardsNotificationDetailsLeftGuideline = guideline;
        this.rewardsNotificationDetailsRightGuideline = guideline2;
        this.rewardsNotificationDetailsRoundup = rhTextView6;
        this.rewardsNotificationDetailsRoundupAmount = rhTextView7;
        this.rewardsNotificationDetailsSeeOrderButton = rdsButton2;
        this.rewardsNotificationDetailsTotal = rhTextView8;
        this.rewardsNotificationDetailsTotalAmount = rhTextView9;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRewardsNotificationDetailsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRewardsNotificationDetailsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10176R.layout.fragment_rewards_notification_details, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRewardsNotificationDetailsBinding bind(View view) {
        View viewFindChildViewById;
        int i = C10176R.id.rewards_notification_details_animation;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = C10176R.id.rewards_notification_details_bonus;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C10176R.id.rewards_notification_details_bonus_amount;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C10176R.id.rewards_notification_details_bonus_rate;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        i = C10176R.id.rewards_notification_details_congrats;
                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView4 != null) {
                            i = C10176R.id.rewards_notification_details_disclaimer;
                            RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView5 != null) {
                                i = C10176R.id.rewards_notification_details_dismiss_button;
                                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C10176R.id.rewards_notification_details_divider))) != null) {
                                    i = C10176R.id.rewards_notification_details_icon;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView != null) {
                                        i = C10176R.id.rewards_notification_details_left_guideline;
                                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                        if (guideline != null) {
                                            i = C10176R.id.rewards_notification_details_right_guideline;
                                            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                                            if (guideline2 != null) {
                                                i = C10176R.id.rewards_notification_details_roundup;
                                                RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView6 != null) {
                                                    i = C10176R.id.rewards_notification_details_roundup_amount;
                                                    RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView7 != null) {
                                                        i = C10176R.id.rewards_notification_details_see_order_button;
                                                        RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                        if (rdsButton2 != null) {
                                                            i = C10176R.id.rewards_notification_details_total;
                                                            RhTextView rhTextView8 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                            if (rhTextView8 != null) {
                                                                i = C10176R.id.rewards_notification_details_total_amount;
                                                                RhTextView rhTextView9 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                if (rhTextView9 != null) {
                                                                    return new FragmentRewardsNotificationDetailsBinding((ConstraintLayout) view, lottieAnimationView, rhTextView, rhTextView2, rhTextView3, rhTextView4, rhTextView5, rdsButton, viewFindChildViewById, imageView, guideline, guideline2, rhTextView6, rhTextView7, rdsButton2, rhTextView8, rhTextView9);
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
