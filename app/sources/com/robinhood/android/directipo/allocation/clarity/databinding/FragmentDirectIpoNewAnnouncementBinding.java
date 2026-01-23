package com.robinhood.android.directipo.allocation.clarity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directipo.allocation.clarity.C14172R;
import com.robinhood.android.directipo.allocation.clarity.p103ui.announcement.DirectIpoNewAnnouncementStatsView;
import com.robinhood.android.directipo.p106ui.allocation.DirectIpoAllocationClarityCardHookView;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;

/* loaded from: classes27.dex */
public final class FragmentDirectIpoNewAnnouncementBinding implements ViewBinding {
    public final DirectIpoAllocationClarityCardHookView ipoAnnouncementCardHookView;
    public final RhTextView ipoAnnouncementDisclosure;
    public final ClientComponentButtonView ipoAnnouncementFooterBtn;
    public final ImageView ipoAnnouncementImage;
    public final ShimmerLoadingView ipoAnnouncementLoadingView;
    public final ScrollView ipoAnnouncementScrollView;
    public final DirectIpoNewAnnouncementStatsView ipoAnnouncementStatsView;
    public final RhTextView ipoAnnouncementSubtitle;
    public final RdsButton ipoAnnouncementSubtitleSeeMoreBtn;
    public final RhTextView ipoAnnouncementTitle;
    private final ConstraintLayout rootView;

    private FragmentDirectIpoNewAnnouncementBinding(ConstraintLayout constraintLayout, DirectIpoAllocationClarityCardHookView directIpoAllocationClarityCardHookView, RhTextView rhTextView, ClientComponentButtonView clientComponentButtonView, ImageView imageView, ShimmerLoadingView shimmerLoadingView, ScrollView scrollView, DirectIpoNewAnnouncementStatsView directIpoNewAnnouncementStatsView, RhTextView rhTextView2, RdsButton rdsButton, RhTextView rhTextView3) {
        this.rootView = constraintLayout;
        this.ipoAnnouncementCardHookView = directIpoAllocationClarityCardHookView;
        this.ipoAnnouncementDisclosure = rhTextView;
        this.ipoAnnouncementFooterBtn = clientComponentButtonView;
        this.ipoAnnouncementImage = imageView;
        this.ipoAnnouncementLoadingView = shimmerLoadingView;
        this.ipoAnnouncementScrollView = scrollView;
        this.ipoAnnouncementStatsView = directIpoNewAnnouncementStatsView;
        this.ipoAnnouncementSubtitle = rhTextView2;
        this.ipoAnnouncementSubtitleSeeMoreBtn = rdsButton;
        this.ipoAnnouncementTitle = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDirectIpoNewAnnouncementBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDirectIpoNewAnnouncementBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14172R.layout.fragment_direct_ipo_new_announcement, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDirectIpoNewAnnouncementBinding bind(View view) {
        int i = C14172R.id.ipo_announcement_card_hook_view;
        DirectIpoAllocationClarityCardHookView directIpoAllocationClarityCardHookView = (DirectIpoAllocationClarityCardHookView) ViewBindings.findChildViewById(view, i);
        if (directIpoAllocationClarityCardHookView != null) {
            i = C14172R.id.ipo_announcement_disclosure;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C14172R.id.ipo_announcement_footer_btn;
                ClientComponentButtonView clientComponentButtonView = (ClientComponentButtonView) ViewBindings.findChildViewById(view, i);
                if (clientComponentButtonView != null) {
                    i = C14172R.id.ipo_announcement_image;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C14172R.id.ipo_announcement_loading_view;
                        ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                        if (shimmerLoadingView != null) {
                            i = C14172R.id.ipo_announcement_scroll_view;
                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                            if (scrollView != null) {
                                i = C14172R.id.ipo_announcement_stats_view;
                                DirectIpoNewAnnouncementStatsView directIpoNewAnnouncementStatsView = (DirectIpoNewAnnouncementStatsView) ViewBindings.findChildViewById(view, i);
                                if (directIpoNewAnnouncementStatsView != null) {
                                    i = C14172R.id.ipo_announcement_subtitle;
                                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView2 != null) {
                                        i = C14172R.id.ipo_announcement_subtitle_see_more_btn;
                                        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                        if (rdsButton != null) {
                                            i = C14172R.id.ipo_announcement_title;
                                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView3 != null) {
                                                return new FragmentDirectIpoNewAnnouncementBinding((ConstraintLayout) view, directIpoAllocationClarityCardHookView, rhTextView, clientComponentButtonView, imageView, shimmerLoadingView, scrollView, directIpoNewAnnouncementStatsView, rhTextView2, rdsButton, rhTextView3);
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
