package com.robinhood.android.directipo.allocation.clarity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.directipo.allocation.clarity.C14172R;
import com.robinhood.android.directipo.allocation.clarity.p103ui.announcement.DirectIpoNewAnnouncementStatsItemView;

/* loaded from: classes27.dex */
public final class IncludeIpoAnnouncementStatsItemViewBinding implements ViewBinding {
    private final DirectIpoNewAnnouncementStatsItemView rootView;

    private IncludeIpoAnnouncementStatsItemViewBinding(DirectIpoNewAnnouncementStatsItemView directIpoNewAnnouncementStatsItemView) {
        this.rootView = directIpoNewAnnouncementStatsItemView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public DirectIpoNewAnnouncementStatsItemView getRoot() {
        return this.rootView;
    }

    public static IncludeIpoAnnouncementStatsItemViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeIpoAnnouncementStatsItemViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14172R.layout.include_ipo_announcement_stats_item_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeIpoAnnouncementStatsItemViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeIpoAnnouncementStatsItemViewBinding((DirectIpoNewAnnouncementStatsItemView) view);
    }
}
