package com.robinhood.android.transfers.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.history.C30262R;

/* loaded from: classes9.dex */
public final class FragmentInternalTransferHistoryDetailBinding implements ViewBinding {
    public final RhTextView additionalInfoText;
    public final RdsButton cancelButton;
    public final ShimmerLoadingView loadingView;
    private final FrameLayout rootView;
    public final RhTextView transactionDetailAmount;
    public final Space transactionDetailBottomSpace;
    public final RhTextView transactionDetailFooter;
    public final RecyclerView transactionDetailRecyclerView;
    public final NestedScrollView transactionDetailScrollView;
    public final RhTextView transactionDetailSubtitle;

    private FragmentInternalTransferHistoryDetailBinding(FrameLayout frameLayout, RhTextView rhTextView, RdsButton rdsButton, ShimmerLoadingView shimmerLoadingView, RhTextView rhTextView2, Space space, RhTextView rhTextView3, RecyclerView recyclerView, NestedScrollView nestedScrollView, RhTextView rhTextView4) {
        this.rootView = frameLayout;
        this.additionalInfoText = rhTextView;
        this.cancelButton = rdsButton;
        this.loadingView = shimmerLoadingView;
        this.transactionDetailAmount = rhTextView2;
        this.transactionDetailBottomSpace = space;
        this.transactionDetailFooter = rhTextView3;
        this.transactionDetailRecyclerView = recyclerView;
        this.transactionDetailScrollView = nestedScrollView;
        this.transactionDetailSubtitle = rhTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentInternalTransferHistoryDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentInternalTransferHistoryDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30262R.layout.fragment_internal_transfer_history_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentInternalTransferHistoryDetailBinding bind(View view) {
        int i = C30262R.id.additional_info_text;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C30262R.id.cancel_button;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C30262R.id.loading_view;
                ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                if (shimmerLoadingView != null) {
                    i = C30262R.id.transaction_detail_amount;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C30262R.id.transaction_detail_bottom_space;
                        Space space = (Space) ViewBindings.findChildViewById(view, i);
                        if (space != null) {
                            i = C30262R.id.transaction_detail_footer;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                i = C30262R.id.transaction_detail_recycler_view;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = C30262R.id.transaction_detail_scroll_view;
                                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                    if (nestedScrollView != null) {
                                        i = C30262R.id.transaction_detail_subtitle;
                                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView4 != null) {
                                            return new FragmentInternalTransferHistoryDetailBinding((FrameLayout) view, rhTextView, rdsButton, shimmerLoadingView, rhTextView2, space, rhTextView3, recyclerView, nestedScrollView, rhTextView4);
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
