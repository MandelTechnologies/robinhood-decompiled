package com.robinhood.android.directipo.allocation.clarity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.directipo.allocation.clarity.C14172R;

/* loaded from: classes27.dex */
public final class MergeIpoAnnouncementStatsViewBinding implements ViewBinding {
    public final LinearLayout ipoAnnouncementStatsContainer;
    private final View rootView;

    private MergeIpoAnnouncementStatsViewBinding(View view, LinearLayout linearLayout) {
        this.rootView = view;
        this.ipoAnnouncementStatsContainer = linearLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeIpoAnnouncementStatsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C14172R.layout.merge_ipo_announcement_stats_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeIpoAnnouncementStatsViewBinding bind(View view) {
        int i = C14172R.id.ipo_announcement_stats_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            return new MergeIpoAnnouncementStatsViewBinding(view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
