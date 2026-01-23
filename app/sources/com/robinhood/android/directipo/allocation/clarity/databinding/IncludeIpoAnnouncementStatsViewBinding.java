package com.robinhood.android.directipo.allocation.clarity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.directipo.allocation.clarity.C14172R;
import com.robinhood.android.directipo.allocation.clarity.p103ui.announcement.DirectIpoNewAnnouncementStatsView;

/* loaded from: classes27.dex */
public final class IncludeIpoAnnouncementStatsViewBinding implements ViewBinding {
    private final DirectIpoNewAnnouncementStatsView rootView;

    private IncludeIpoAnnouncementStatsViewBinding(DirectIpoNewAnnouncementStatsView directIpoNewAnnouncementStatsView) {
        this.rootView = directIpoNewAnnouncementStatsView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public DirectIpoNewAnnouncementStatsView getRoot() {
        return this.rootView;
    }

    public static IncludeIpoAnnouncementStatsViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeIpoAnnouncementStatsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14172R.layout.include_ipo_announcement_stats_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeIpoAnnouncementStatsViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeIpoAnnouncementStatsViewBinding((DirectIpoNewAnnouncementStatsView) view);
    }
}
