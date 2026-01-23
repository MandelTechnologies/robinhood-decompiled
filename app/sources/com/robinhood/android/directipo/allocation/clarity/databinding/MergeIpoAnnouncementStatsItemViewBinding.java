package com.robinhood.android.directipo.allocation.clarity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directipo.allocation.clarity.C14172R;

/* loaded from: classes27.dex */
public final class MergeIpoAnnouncementStatsItemViewBinding implements ViewBinding {
    public final LinearLayout ipoAnnouncementStatsLayout;
    public final RhTextView ipoAnnouncementStatsSubtitle;
    public final RhTextView ipoAnnouncementStatsTitle;
    public final View ipoAnnouncementStatsVerticalDivider;
    private final View rootView;

    private MergeIpoAnnouncementStatsItemViewBinding(View view, LinearLayout linearLayout, RhTextView rhTextView, RhTextView rhTextView2, View view2) {
        this.rootView = view;
        this.ipoAnnouncementStatsLayout = linearLayout;
        this.ipoAnnouncementStatsSubtitle = rhTextView;
        this.ipoAnnouncementStatsTitle = rhTextView2;
        this.ipoAnnouncementStatsVerticalDivider = view2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeIpoAnnouncementStatsItemViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C14172R.layout.merge_ipo_announcement_stats_item_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeIpoAnnouncementStatsItemViewBinding bind(View view) {
        View viewFindChildViewById;
        int i = C14172R.id.ipo_announcement_stats_layout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C14172R.id.ipo_announcement_stats_subtitle;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C14172R.id.ipo_announcement_stats_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C14172R.id.ipo_announcement_stats_vertical_divider))) != null) {
                    return new MergeIpoAnnouncementStatsItemViewBinding(view, linearLayout, rhTextView, rhTextView2, viewFindChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
