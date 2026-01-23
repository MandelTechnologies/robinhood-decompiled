package com.robinhood.android.advanced.alert.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.advanced.alert.C8387R;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class FragmentAdvancedAlertV2Binding implements ViewBinding {
    public final LinearLayout advancedAlertLoadingView;
    public final ComposeView advancedAlertSegmentedControl;
    public final RhTextView advancedAlertSubtitle;
    public final RhTextView advancedAlertTitle;
    public final AppCompatImageView emptyImageView;
    public final LinearLayout emptyView;
    public final RhTextView emptyViewTextMessage;
    public final RdsInfoBannerView notificationInfoBanner;
    public final RecyclerView recyclerView;
    private final ConstraintLayout rootView;
    public final View topDivider;

    private FragmentAdvancedAlertV2Binding(ConstraintLayout constraintLayout, LinearLayout linearLayout, ComposeView composeView, RhTextView rhTextView, RhTextView rhTextView2, AppCompatImageView appCompatImageView, LinearLayout linearLayout2, RhTextView rhTextView3, RdsInfoBannerView rdsInfoBannerView, RecyclerView recyclerView, View view) {
        this.rootView = constraintLayout;
        this.advancedAlertLoadingView = linearLayout;
        this.advancedAlertSegmentedControl = composeView;
        this.advancedAlertSubtitle = rhTextView;
        this.advancedAlertTitle = rhTextView2;
        this.emptyImageView = appCompatImageView;
        this.emptyView = linearLayout2;
        this.emptyViewTextMessage = rhTextView3;
        this.notificationInfoBanner = rdsInfoBannerView;
        this.recyclerView = recyclerView;
        this.topDivider = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAdvancedAlertV2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAdvancedAlertV2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8387R.layout.fragment_advanced_alert_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAdvancedAlertV2Binding bind(View view) {
        View viewFindChildViewById;
        int i = C8387R.id.advanced_alert_loading_view;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C8387R.id.advanced_alert_segmented_control;
            ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
            if (composeView != null) {
                i = C8387R.id.advanced_alert_subtitle;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C8387R.id.advanced_alert_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C8387R.id.empty_image_view;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView != null) {
                            i = C8387R.id.empty_view;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout2 != null) {
                                i = C8387R.id.empty_view_text_message;
                                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView3 != null) {
                                    i = C8387R.id.notification_info_banner;
                                    RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) ViewBindings.findChildViewById(view, i);
                                    if (rdsInfoBannerView != null) {
                                        i = C8387R.id.recycler_view;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                        if (recyclerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C8387R.id.top_divider))) != null) {
                                            return new FragmentAdvancedAlertV2Binding((ConstraintLayout) view, linearLayout, composeView, rhTextView, rhTextView2, appCompatImageView, linearLayout2, rhTextView3, rdsInfoBannerView, recyclerView, viewFindChildViewById);
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
