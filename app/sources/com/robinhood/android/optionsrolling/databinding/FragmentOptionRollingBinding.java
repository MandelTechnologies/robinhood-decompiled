package com.robinhood.android.optionsrolling.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.optionsrolling.C24772R;
import com.robinhood.android.optionsrolling.p209ui.view.RollingContractCardView;
import com.robinhood.android.optionsrolling.p209ui.view.RollingSubheaderView;

/* loaded from: classes11.dex */
public final class FragmentOptionRollingBinding implements ViewBinding {
    public final View contentDivider;
    public final ImageView inBetweenIcon;
    public final ShimmerLoadingView loading;
    public final RollingContractCardView optionsCurrentPositionCard;
    public final Barrier optionsRollingBottomBarrier;
    public final RdsButton optionsRollingContinueBtn;
    public final RdsButton optionsRollingEditContractBtn;
    public final View optionsRollingHeaderBackground;
    public final RdsTextButton optionsRollingLearnMore;
    public final RollingSubheaderView optionsRollingSubheaderView;
    public final Group optionsRollingSummaryViews;
    public final TextView optionsRollingTitle;
    public final RollingContractCardView optionsSelectedPositionCard;
    private final ConstraintLayout rootView;
    public final ScrollView scrollView;
    public final View toolbarBackground;
    public final View toolbarBottom;

    private FragmentOptionRollingBinding(ConstraintLayout constraintLayout, View view, ImageView imageView, ShimmerLoadingView shimmerLoadingView, RollingContractCardView rollingContractCardView, Barrier barrier, RdsButton rdsButton, RdsButton rdsButton2, View view2, RdsTextButton rdsTextButton, RollingSubheaderView rollingSubheaderView, Group group, TextView textView, RollingContractCardView rollingContractCardView2, ScrollView scrollView, View view3, View view4) {
        this.rootView = constraintLayout;
        this.contentDivider = view;
        this.inBetweenIcon = imageView;
        this.loading = shimmerLoadingView;
        this.optionsCurrentPositionCard = rollingContractCardView;
        this.optionsRollingBottomBarrier = barrier;
        this.optionsRollingContinueBtn = rdsButton;
        this.optionsRollingEditContractBtn = rdsButton2;
        this.optionsRollingHeaderBackground = view2;
        this.optionsRollingLearnMore = rdsTextButton;
        this.optionsRollingSubheaderView = rollingSubheaderView;
        this.optionsRollingSummaryViews = group;
        this.optionsRollingTitle = textView;
        this.optionsSelectedPositionCard = rollingContractCardView2;
        this.scrollView = scrollView;
        this.toolbarBackground = view3;
        this.toolbarBottom = view4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOptionRollingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionRollingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24772R.layout.fragment_option_rolling, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionRollingBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i = C24772R.id.content_divider;
        View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById4 != null) {
            i = C24772R.id.in_between_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C24772R.id.loading;
                ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                if (shimmerLoadingView != null) {
                    i = C24772R.id.options_current_position_card;
                    RollingContractCardView rollingContractCardView = (RollingContractCardView) ViewBindings.findChildViewById(view, i);
                    if (rollingContractCardView != null) {
                        i = C24772R.id.options_rolling_bottom_barrier;
                        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
                        if (barrier != null) {
                            i = C24772R.id.options_rolling_continue_btn;
                            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton != null) {
                                i = C24772R.id.options_rolling_edit_contract_btn;
                                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C24772R.id.options_rolling_header_background))) != null) {
                                    i = C24772R.id.options_rolling_learn_more;
                                    RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
                                    if (rdsTextButton != null) {
                                        i = C24772R.id.options_rolling_subheader_view;
                                        RollingSubheaderView rollingSubheaderView = (RollingSubheaderView) ViewBindings.findChildViewById(view, i);
                                        if (rollingSubheaderView != null) {
                                            i = C24772R.id.options_rolling_summary_views;
                                            Group group = (Group) ViewBindings.findChildViewById(view, i);
                                            if (group != null) {
                                                i = C24772R.id.options_rolling_title;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView != null) {
                                                    i = C24772R.id.options_selected_position_card;
                                                    RollingContractCardView rollingContractCardView2 = (RollingContractCardView) ViewBindings.findChildViewById(view, i);
                                                    if (rollingContractCardView2 != null) {
                                                        i = C24772R.id.scroll_view;
                                                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                                                        if (scrollView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C24772R.id.toolbar_background))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C24772R.id.toolbar_bottom))) != null) {
                                                            return new FragmentOptionRollingBinding((ConstraintLayout) view, viewFindChildViewById4, imageView, shimmerLoadingView, rollingContractCardView, barrier, rdsButton, rdsButton2, viewFindChildViewById, rdsTextButton, rollingSubheaderView, group, textView, rollingContractCardView2, scrollView, viewFindChildViewById2, viewFindChildViewById3);
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
