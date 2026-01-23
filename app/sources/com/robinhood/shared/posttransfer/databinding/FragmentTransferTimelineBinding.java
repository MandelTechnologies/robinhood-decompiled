package com.robinhood.shared.posttransfer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.posttransfer.C39496R;
import com.robinhood.utils.p409ui.view.FocusSafeNestedScrollView;

/* loaded from: classes6.dex */
public final class FragmentTransferTimelineBinding implements ViewBinding {
    public final RdsButton continueBtn;
    public final LinearLayout continueBtnContainer;
    public final RhTextView detailTxt;
    public final RdsInfoBannerView infoBanner;
    public final RecyclerView recyclerView;
    private final ConstraintLayout rootView;
    public final FocusSafeNestedScrollView scrollView;
    public final RdsButton secondaryBtn;
    public final RhTextView subtitleTxt;
    public final View timelineShadow;
    public final RhTextView titleTxt;

    private FragmentTransferTimelineBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, LinearLayout linearLayout, RhTextView rhTextView, RdsInfoBannerView rdsInfoBannerView, RecyclerView recyclerView, FocusSafeNestedScrollView focusSafeNestedScrollView, RdsButton rdsButton2, RhTextView rhTextView2, View view, RhTextView rhTextView3) {
        this.rootView = constraintLayout;
        this.continueBtn = rdsButton;
        this.continueBtnContainer = linearLayout;
        this.detailTxt = rhTextView;
        this.infoBanner = rdsInfoBannerView;
        this.recyclerView = recyclerView;
        this.scrollView = focusSafeNestedScrollView;
        this.secondaryBtn = rdsButton2;
        this.subtitleTxt = rhTextView2;
        this.timelineShadow = view;
        this.titleTxt = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTransferTimelineBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTransferTimelineBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39496R.layout.fragment_transfer_timeline, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentTransferTimelineBinding bind(View view) {
        View viewFindChildViewById;
        int i = C39496R.id.continue_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C39496R.id.continue_btn_container;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C39496R.id.detail_txt;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C39496R.id.info_banner;
                    RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) ViewBindings.findChildViewById(view, i);
                    if (rdsInfoBannerView != null) {
                        i = C39496R.id.recycler_view;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = C39496R.id.scroll_view;
                            FocusSafeNestedScrollView focusSafeNestedScrollView = (FocusSafeNestedScrollView) ViewBindings.findChildViewById(view, i);
                            if (focusSafeNestedScrollView != null) {
                                i = C39496R.id.secondary_btn;
                                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton2 != null) {
                                    i = C39496R.id.subtitle_txt;
                                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C39496R.id.timeline_shadow))) != null) {
                                        i = C39496R.id.title_txt;
                                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView3 != null) {
                                            return new FragmentTransferTimelineBinding((ConstraintLayout) view, rdsButton, linearLayout, rhTextView, rdsInfoBannerView, recyclerView, focusSafeNestedScrollView, rdsButton2, rhTextView2, viewFindChildViewById, rhTextView3);
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
