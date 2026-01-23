package com.robinhood.android.transfers.wireshistory.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.wireshistory.C31240R;

/* loaded from: classes9.dex */
public final class FragmentWireDetailBinding implements ViewBinding {
    public final ComposeView gracePeriodBanner;
    public final ComposeView gracePeriodCta;
    public final ComposeView gracePeriodDetails;
    public final ShimmerLoadingView loadingView;
    private final FrameLayout rootView;
    public final RhTextView transactionDetailAmount;
    public final Space transactionDetailBottomSpace;
    public final RhTextView transactionDetailFooter;
    public final RecyclerView transactionDetailRecyclerView;
    public final NestedScrollView transactionDetailScrollView;
    public final RhTextView transactionDetailSubtitle;

    private FragmentWireDetailBinding(FrameLayout frameLayout, ComposeView composeView, ComposeView composeView2, ComposeView composeView3, ShimmerLoadingView shimmerLoadingView, RhTextView rhTextView, Space space, RhTextView rhTextView2, RecyclerView recyclerView, NestedScrollView nestedScrollView, RhTextView rhTextView3) {
        this.rootView = frameLayout;
        this.gracePeriodBanner = composeView;
        this.gracePeriodCta = composeView2;
        this.gracePeriodDetails = composeView3;
        this.loadingView = shimmerLoadingView;
        this.transactionDetailAmount = rhTextView;
        this.transactionDetailBottomSpace = space;
        this.transactionDetailFooter = rhTextView2;
        this.transactionDetailRecyclerView = recyclerView;
        this.transactionDetailScrollView = nestedScrollView;
        this.transactionDetailSubtitle = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentWireDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentWireDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31240R.layout.fragment_wire_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentWireDetailBinding bind(View view) {
        int i = C31240R.id.grace_period_banner;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = C31240R.id.grace_period_cta;
            ComposeView composeView2 = (ComposeView) ViewBindings.findChildViewById(view, i);
            if (composeView2 != null) {
                i = C31240R.id.grace_period_details;
                ComposeView composeView3 = (ComposeView) ViewBindings.findChildViewById(view, i);
                if (composeView3 != null) {
                    i = C31240R.id.loading_view;
                    ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                    if (shimmerLoadingView != null) {
                        i = C31240R.id.transaction_detail_amount;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C31240R.id.transaction_detail_bottom_space;
                            Space space = (Space) ViewBindings.findChildViewById(view, i);
                            if (space != null) {
                                i = C31240R.id.transaction_detail_footer;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    i = C31240R.id.transaction_detail_recycler_view;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                    if (recyclerView != null) {
                                        i = C31240R.id.transaction_detail_scroll_view;
                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                        if (nestedScrollView != null) {
                                            i = C31240R.id.transaction_detail_subtitle;
                                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView3 != null) {
                                                return new FragmentWireDetailBinding((FrameLayout) view, composeView, composeView2, composeView3, shimmerLoadingView, rhTextView, space, rhTextView2, recyclerView, nestedScrollView, rhTextView3);
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
