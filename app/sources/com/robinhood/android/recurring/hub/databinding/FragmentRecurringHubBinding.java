package com.robinhood.android.recurring.hub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.recurring.hub.C26221R;

/* loaded from: classes11.dex */
public final class FragmentRecurringHubBinding implements ViewBinding {
    public final FrameLayout contentContainer;
    public final ComposeView investmentScheduleAccountSelector;
    public final LinearLayout investmentScheduleEmptyContentContainer;
    public final ImageView investmentScheduleEmptyImage;
    public final RdsButton investmentScheduleErrorBtn;
    public final LinearLayout investmentScheduleErrorContentContainer;
    public final ImageView investmentScheduleErrorImage;
    public final AppBarLayout investmentScheduleHistoryBarLayout;
    public final RhTextView investmentScheduleHistoryCollapsingTitle;
    public final RecyclerView investmentScheduleHistoryList;
    public final CoordinatorLayout investmentScheduleHistoryListContainer;
    public final ShimmerLoadingView investmentScheduleLoadingView;
    public final RdsButton investmentScheduleStartInvestmentBtn;
    private final ConstraintLayout rootView;

    private FragmentRecurringHubBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, ComposeView composeView, LinearLayout linearLayout, ImageView imageView, RdsButton rdsButton, LinearLayout linearLayout2, ImageView imageView2, AppBarLayout appBarLayout, RhTextView rhTextView, RecyclerView recyclerView, CoordinatorLayout coordinatorLayout, ShimmerLoadingView shimmerLoadingView, RdsButton rdsButton2) {
        this.rootView = constraintLayout;
        this.contentContainer = frameLayout;
        this.investmentScheduleAccountSelector = composeView;
        this.investmentScheduleEmptyContentContainer = linearLayout;
        this.investmentScheduleEmptyImage = imageView;
        this.investmentScheduleErrorBtn = rdsButton;
        this.investmentScheduleErrorContentContainer = linearLayout2;
        this.investmentScheduleErrorImage = imageView2;
        this.investmentScheduleHistoryBarLayout = appBarLayout;
        this.investmentScheduleHistoryCollapsingTitle = rhTextView;
        this.investmentScheduleHistoryList = recyclerView;
        this.investmentScheduleHistoryListContainer = coordinatorLayout;
        this.investmentScheduleLoadingView = shimmerLoadingView;
        this.investmentScheduleStartInvestmentBtn = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRecurringHubBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecurringHubBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C26221R.layout.fragment_recurring_hub, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRecurringHubBinding bind(View view) {
        int i = C26221R.id.content_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C26221R.id.investment_schedule_account_selector;
            ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
            if (composeView != null) {
                i = C26221R.id.investment_schedule_empty_content_container;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C26221R.id.investment_schedule_empty_image;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C26221R.id.investment_schedule_error_btn;
                        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton != null) {
                            i = C26221R.id.investment_schedule_error_content_container;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout2 != null) {
                                i = C26221R.id.investment_schedule_error_image;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    i = C26221R.id.investment_schedule_history_bar_layout;
                                    AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
                                    if (appBarLayout != null) {
                                        i = C26221R.id.investment_schedule_history_collapsing_title;
                                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView != null) {
                                            i = C26221R.id.investment_schedule_history_list;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                            if (recyclerView != null) {
                                                i = C26221R.id.investment_schedule_history_list_container;
                                                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                                                if (coordinatorLayout != null) {
                                                    i = C26221R.id.investment_schedule_loading_view;
                                                    ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                                                    if (shimmerLoadingView != null) {
                                                        i = C26221R.id.investment_schedule_start_investment_btn;
                                                        RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                        if (rdsButton2 != null) {
                                                            return new FragmentRecurringHubBinding((ConstraintLayout) view, frameLayout, composeView, linearLayout, imageView, rdsButton, linearLayout2, imageView2, appBarLayout, rhTextView, recyclerView, coordinatorLayout, shimmerLoadingView, rdsButton2);
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
