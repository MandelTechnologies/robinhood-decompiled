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
public final class FragmentDepositScheduleTimelineBinding implements ViewBinding {
    public final RhTextView depositScheduleTimelineAccount;
    public final RhTextView depositScheduleTimelineAmount;
    public final RdsButton depositScheduleTimelineContinueBtn;
    public final FrameLayout depositScheduleTimelineContinueBtnContainer;
    public final RhTextView depositScheduleTimelineDetail;
    public final ShimmerLoadingView depositScheduleTimelineLoadingView;
    public final RecyclerView depositScheduleTimelineRecyclerView;
    public final FocusSafeNestedScrollView depositScheduleTimelineScrollView;
    public final View depositScheduleTimelineShadow;
    public final RhTextView depositScheduleTimelineTitle;
    private final ConstraintLayout rootView;

    private FragmentDepositScheduleTimelineBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, RhTextView rhTextView2, RdsButton rdsButton, FrameLayout frameLayout, RhTextView rhTextView3, ShimmerLoadingView shimmerLoadingView, RecyclerView recyclerView, FocusSafeNestedScrollView focusSafeNestedScrollView, View view, RhTextView rhTextView4) {
        this.rootView = constraintLayout;
        this.depositScheduleTimelineAccount = rhTextView;
        this.depositScheduleTimelineAmount = rhTextView2;
        this.depositScheduleTimelineContinueBtn = rdsButton;
        this.depositScheduleTimelineContinueBtnContainer = frameLayout;
        this.depositScheduleTimelineDetail = rhTextView3;
        this.depositScheduleTimelineLoadingView = shimmerLoadingView;
        this.depositScheduleTimelineRecyclerView = recyclerView;
        this.depositScheduleTimelineScrollView = focusSafeNestedScrollView;
        this.depositScheduleTimelineShadow = view;
        this.depositScheduleTimelineTitle = rhTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDepositScheduleTimelineBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDepositScheduleTimelineBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30082R.layout.fragment_deposit_schedule_timeline, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDepositScheduleTimelineBinding bind(View view) {
        View viewFindChildViewById;
        int i = C30082R.id.deposit_schedule_timeline_account;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C30082R.id.deposit_schedule_timeline_amount;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C30082R.id.deposit_schedule_timeline_continue_btn;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C30082R.id.deposit_schedule_timeline_continue_btn_container;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout != null) {
                        i = C30082R.id.deposit_schedule_timeline_detail;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C30082R.id.deposit_schedule_timeline_loading_view;
                            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                            if (shimmerLoadingView != null) {
                                i = C30082R.id.deposit_schedule_timeline_recycler_view;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = C30082R.id.deposit_schedule_timeline_scroll_view;
                                    FocusSafeNestedScrollView focusSafeNestedScrollView = (FocusSafeNestedScrollView) ViewBindings.findChildViewById(view, i);
                                    if (focusSafeNestedScrollView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C30082R.id.deposit_schedule_timeline_shadow))) != null) {
                                        i = C30082R.id.deposit_schedule_timeline_title;
                                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView4 != null) {
                                            return new FragmentDepositScheduleTimelineBinding((ConstraintLayout) view, rhTextView, rhTextView2, rdsButton, frameLayout, rhTextView3, shimmerLoadingView, recyclerView, focusSafeNestedScrollView, viewFindChildViewById, rhTextView4);
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
