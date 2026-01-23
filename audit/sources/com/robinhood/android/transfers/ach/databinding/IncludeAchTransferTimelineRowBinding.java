package com.robinhood.android.transfers.ach.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.timeline.RdsTimelineRowView;
import com.robinhood.android.transfers.ach.C30082R;

/* loaded from: classes9.dex */
public final class IncludeAchTransferTimelineRowBinding implements ViewBinding {
    private final RdsTimelineRowView rootView;

    private IncludeAchTransferTimelineRowBinding(RdsTimelineRowView rdsTimelineRowView) {
        this.rootView = rdsTimelineRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsTimelineRowView getRoot() {
        return this.rootView;
    }

    public static IncludeAchTransferTimelineRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAchTransferTimelineRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30082R.layout.include_ach_transfer_timeline_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAchTransferTimelineRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeAchTransferTimelineRowBinding((RdsTimelineRowView) view);
    }
}
