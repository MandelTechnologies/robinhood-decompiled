package com.robinhood.android.cash.disputes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.utils.p409ui.view.FocusSafeNestedScrollView;

/* loaded from: classes7.dex */
public final class FragmentDisputeReasonSelectionBinding implements ViewBinding {
    public final LinearLayout disputeReasonSelectionContent;
    public final ShimmerLoadingView disputeReasonSelectionLoadingView;
    public final RecyclerView disputeReasonSelectionRecyclerView;
    public final RhTextView disputeReasonSelectionTitle;
    private final FocusSafeNestedScrollView rootView;

    private FragmentDisputeReasonSelectionBinding(FocusSafeNestedScrollView focusSafeNestedScrollView, LinearLayout linearLayout, ShimmerLoadingView shimmerLoadingView, RecyclerView recyclerView, RhTextView rhTextView) {
        this.rootView = focusSafeNestedScrollView;
        this.disputeReasonSelectionContent = linearLayout;
        this.disputeReasonSelectionLoadingView = shimmerLoadingView;
        this.disputeReasonSelectionRecyclerView = recyclerView;
        this.disputeReasonSelectionTitle = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FocusSafeNestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentDisputeReasonSelectionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDisputeReasonSelectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10007R.layout.fragment_dispute_reason_selection, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDisputeReasonSelectionBinding bind(View view) {
        int i = C10007R.id.dispute_reason_selection_content;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C10007R.id.dispute_reason_selection_loading_view;
            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
            if (shimmerLoadingView != null) {
                i = C10007R.id.dispute_reason_selection_recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C10007R.id.dispute_reason_selection_title;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        return new FragmentDisputeReasonSelectionBinding((FocusSafeNestedScrollView) view, linearLayout, shimmerLoadingView, recyclerView, rhTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
