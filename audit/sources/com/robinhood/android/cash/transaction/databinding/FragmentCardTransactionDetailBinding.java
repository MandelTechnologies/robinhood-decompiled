package com.robinhood.android.cash.transaction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.robinhood.android.cash.transaction.C10421R;
import com.robinhood.android.cash.transaction.p079ui.FraudPromptView;
import com.robinhood.android.cash.transaction.p079ui.dispute.TransactionDisputesView;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.view.StyleableMapView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsButtonBarView;
import com.robinhood.android.designsystem.chip.RdsChip;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class FragmentCardTransactionDetailBinding implements ViewBinding {
    public final ShimmerLoadingView loadingView;
    private final FrameLayout rootView;
    public final RhTextView transactionDetailAmount;
    public final Space transactionDetailBottomSpace;
    public final RdsChip transactionDetailCategoryChip;
    public final CoordinatorLayout transactionDetailContainer;
    public final LinearLayout transactionDetailContent;
    public final RdsButton transactionDetailDisputeTransaction;
    public final TransactionDisputesView transactionDetailDisputesView;
    public final RhTextView transactionDetailFooter;
    public final FraudPromptView transactionDetailFraudPrompt;
    public final CollapsingToolbarLayout transactionDetailHeader;
    public final AppBarLayout transactionDetailHeaderAppbar;
    public final StyleableMapView transactionDetailMap;
    public final LinearLayout transactionDetailPulldownContent;
    public final RhTextView transactionDetailPulldownSubtitle;
    public final RhTextView transactionDetailPulldownTitle;
    public final RecyclerView transactionDetailRecyclerView;
    public final NestedScrollView transactionDetailScrollView;
    public final RhTextView transactionDetailSubtitle;
    public final RdsButtonBarView transactionDetailViewReward;

    private FragmentCardTransactionDetailBinding(FrameLayout frameLayout, ShimmerLoadingView shimmerLoadingView, RhTextView rhTextView, Space space, RdsChip rdsChip, CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, RdsButton rdsButton, TransactionDisputesView transactionDisputesView, RhTextView rhTextView2, FraudPromptView fraudPromptView, CollapsingToolbarLayout collapsingToolbarLayout, AppBarLayout appBarLayout, StyleableMapView styleableMapView, LinearLayout linearLayout2, RhTextView rhTextView3, RhTextView rhTextView4, RecyclerView recyclerView, NestedScrollView nestedScrollView, RhTextView rhTextView5, RdsButtonBarView rdsButtonBarView) {
        this.rootView = frameLayout;
        this.loadingView = shimmerLoadingView;
        this.transactionDetailAmount = rhTextView;
        this.transactionDetailBottomSpace = space;
        this.transactionDetailCategoryChip = rdsChip;
        this.transactionDetailContainer = coordinatorLayout;
        this.transactionDetailContent = linearLayout;
        this.transactionDetailDisputeTransaction = rdsButton;
        this.transactionDetailDisputesView = transactionDisputesView;
        this.transactionDetailFooter = rhTextView2;
        this.transactionDetailFraudPrompt = fraudPromptView;
        this.transactionDetailHeader = collapsingToolbarLayout;
        this.transactionDetailHeaderAppbar = appBarLayout;
        this.transactionDetailMap = styleableMapView;
        this.transactionDetailPulldownContent = linearLayout2;
        this.transactionDetailPulldownSubtitle = rhTextView3;
        this.transactionDetailPulldownTitle = rhTextView4;
        this.transactionDetailRecyclerView = recyclerView;
        this.transactionDetailScrollView = nestedScrollView;
        this.transactionDetailSubtitle = rhTextView5;
        this.transactionDetailViewReward = rdsButtonBarView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCardTransactionDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCardTransactionDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10421R.layout.fragment_card_transaction_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCardTransactionDetailBinding bind(View view) {
        int i = C10421R.id.loading_view;
        ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
        if (shimmerLoadingView != null) {
            i = C10421R.id.transaction_detail_amount;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C10421R.id.transaction_detail_bottom_space;
                Space space = (Space) ViewBindings.findChildViewById(view, i);
                if (space != null) {
                    i = C10421R.id.transaction_detail_category_chip;
                    RdsChip rdsChip = (RdsChip) ViewBindings.findChildViewById(view, i);
                    if (rdsChip != null) {
                        i = C10421R.id.transaction_detail_container;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                        if (coordinatorLayout != null) {
                            i = C10421R.id.transaction_detail_content;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = C10421R.id.transaction_detail_dispute_transaction;
                                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton != null) {
                                    i = C10421R.id.transaction_detail_disputes_view;
                                    TransactionDisputesView transactionDisputesView = (TransactionDisputesView) ViewBindings.findChildViewById(view, i);
                                    if (transactionDisputesView != null) {
                                        i = C10421R.id.transaction_detail_footer;
                                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView2 != null) {
                                            i = C10421R.id.transaction_detail_fraud_prompt;
                                            FraudPromptView fraudPromptView = (FraudPromptView) ViewBindings.findChildViewById(view, i);
                                            if (fraudPromptView != null) {
                                                i = C10421R.id.transaction_detail_header;
                                                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) ViewBindings.findChildViewById(view, i);
                                                if (collapsingToolbarLayout != null) {
                                                    i = C10421R.id.transaction_detail_header_appbar;
                                                    AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
                                                    if (appBarLayout != null) {
                                                        i = C10421R.id.transaction_detail_map;
                                                        StyleableMapView styleableMapView = (StyleableMapView) ViewBindings.findChildViewById(view, i);
                                                        if (styleableMapView != null) {
                                                            i = C10421R.id.transaction_detail_pulldown_content;
                                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                            if (linearLayout2 != null) {
                                                                i = C10421R.id.transaction_detail_pulldown_subtitle;
                                                                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                if (rhTextView3 != null) {
                                                                    i = C10421R.id.transaction_detail_pulldown_title;
                                                                    RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (rhTextView4 != null) {
                                                                        i = C10421R.id.transaction_detail_recycler_view;
                                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                        if (recyclerView != null) {
                                                                            i = C10421R.id.transaction_detail_scroll_view;
                                                                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                                                            if (nestedScrollView != null) {
                                                                                i = C10421R.id.transaction_detail_subtitle;
                                                                                RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (rhTextView5 != null) {
                                                                                    i = C10421R.id.transaction_detail_view_reward;
                                                                                    RdsButtonBarView rdsButtonBarView = (RdsButtonBarView) ViewBindings.findChildViewById(view, i);
                                                                                    if (rdsButtonBarView != null) {
                                                                                        return new FragmentCardTransactionDetailBinding((FrameLayout) view, shimmerLoadingView, rhTextView, space, rdsChip, coordinatorLayout, linearLayout, rdsButton, transactionDisputesView, rhTextView2, fraudPromptView, collapsingToolbarLayout, appBarLayout, styleableMapView, linearLayout2, rhTextView3, rhTextView4, recyclerView, nestedScrollView, rhTextView5, rdsButtonBarView);
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
