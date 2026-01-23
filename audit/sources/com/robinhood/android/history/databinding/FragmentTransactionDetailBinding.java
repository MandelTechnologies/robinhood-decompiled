package com.robinhood.android.history.databinding;

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
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class FragmentTransactionDetailBinding implements ViewBinding {
    public final ShimmerLoadingView loadingView;
    private final FrameLayout rootView;
    public final RhTextView transactionDetailAmount;
    public final Space transactionDetailBottomSpace;
    public final RhTextView transactionDetailFooter;
    public final RecyclerView transactionDetailRecyclerView;
    public final NestedScrollView transactionDetailScrollView;
    public final RhTextView transactionDetailSubtitle;

    private FragmentTransactionDetailBinding(FrameLayout frameLayout, ShimmerLoadingView shimmerLoadingView, RhTextView rhTextView, Space space, RhTextView rhTextView2, RecyclerView recyclerView, NestedScrollView nestedScrollView, RhTextView rhTextView3) {
        this.rootView = frameLayout;
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

    public static FragmentTransactionDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTransactionDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.fragment_transaction_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentTransactionDetailBinding bind(View view) {
        int i = C18359R.id.loading_view;
        ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
        if (shimmerLoadingView != null) {
            i = C18359R.id.transaction_detail_amount;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C18359R.id.transaction_detail_bottom_space;
                Space space = (Space) ViewBindings.findChildViewById(view, i);
                if (space != null) {
                    i = C18359R.id.transaction_detail_footer;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C18359R.id.transaction_detail_recycler_view;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = C18359R.id.transaction_detail_scroll_view;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                            if (nestedScrollView != null) {
                                i = C18359R.id.transaction_detail_subtitle;
                                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView3 != null) {
                                    return new FragmentTransactionDetailBinding((FrameLayout) view, shimmerLoadingView, rhTextView, space, rhTextView2, recyclerView, nestedScrollView, rhTextView3);
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
