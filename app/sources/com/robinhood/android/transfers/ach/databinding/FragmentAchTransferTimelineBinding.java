package com.robinhood.android.transfers.ach.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.utils.p409ui.view.FocusSafeNestedScrollView;

/* loaded from: classes9.dex */
public final class FragmentAchTransferTimelineBinding implements ViewBinding {
    public final RhTextView achTransferTimelineAccount;
    public final RhTextView achTransferTimelineAmount;
    public final RdsButton achTransferTimelineContinueBtn;
    public final FrameLayout achTransferTimelineContinueBtnContainer;
    public final RhTextView achTransferTimelineDetail;
    public final ShimmerLoadingView achTransferTimelineLoadingView;
    public final RecyclerView achTransferTimelineRecyclerView;
    public final FocusSafeNestedScrollView achTransferTimelineScrollView;
    public final View achTransferTimelineShadow;
    public final RhTextView achTransferTimelineTitle;
    private final ConstraintLayout rootView;

    private FragmentAchTransferTimelineBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, RhTextView rhTextView2, RdsButton rdsButton, FrameLayout frameLayout, RhTextView rhTextView3, ShimmerLoadingView shimmerLoadingView, RecyclerView recyclerView, FocusSafeNestedScrollView focusSafeNestedScrollView, View view, RhTextView rhTextView4) {
        this.rootView = constraintLayout;
        this.achTransferTimelineAccount = rhTextView;
        this.achTransferTimelineAmount = rhTextView2;
        this.achTransferTimelineContinueBtn = rdsButton;
        this.achTransferTimelineContinueBtnContainer = frameLayout;
        this.achTransferTimelineDetail = rhTextView3;
        this.achTransferTimelineLoadingView = shimmerLoadingView;
        this.achTransferTimelineRecyclerView = recyclerView;
        this.achTransferTimelineScrollView = focusSafeNestedScrollView;
        this.achTransferTimelineShadow = view;
        this.achTransferTimelineTitle = rhTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAchTransferTimelineBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAchTransferTimelineBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30082R.layout.fragment_ach_transfer_timeline, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAchTransferTimelineBinding bind(View view) {
        View viewFindChildViewById;
        int i = C30082R.id.ach_transfer_timeline_account;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C30082R.id.ach_transfer_timeline_amount;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C30082R.id.ach_transfer_timeline_continue_btn;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C30082R.id.ach_transfer_timeline_continue_btn_container;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout != null) {
                        i = C30082R.id.ach_transfer_timeline_detail;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C30082R.id.ach_transfer_timeline_loading_view;
                            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                            if (shimmerLoadingView != null) {
                                i = C30082R.id.ach_transfer_timeline_recycler_view;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = C30082R.id.ach_transfer_timeline_scroll_view;
                                    FocusSafeNestedScrollView focusSafeNestedScrollView = (FocusSafeNestedScrollView) ViewBindings.findChildViewById(view, i);
                                    if (focusSafeNestedScrollView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C30082R.id.ach_transfer_timeline_shadow))) != null) {
                                        i = C30082R.id.ach_transfer_timeline_title;
                                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView4 != null) {
                                            return new FragmentAchTransferTimelineBinding((ConstraintLayout) view, rhTextView, rhTextView2, rdsButton, frameLayout, rhTextView3, shimmerLoadingView, recyclerView, focusSafeNestedScrollView, viewFindChildViewById, rhTextView4);
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
