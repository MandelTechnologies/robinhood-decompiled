package com.robinhood.android.inbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.inbox.C18721R;
import com.robinhood.android.inbox.p156ui.thread.ThreadTimestampRowView;

/* loaded from: classes10.dex */
public final class IncludeThreadTimestampRowViewBinding implements ViewBinding {
    private final ThreadTimestampRowView rootView;

    private IncludeThreadTimestampRowViewBinding(ThreadTimestampRowView threadTimestampRowView) {
        this.rootView = threadTimestampRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ThreadTimestampRowView getRoot() {
        return this.rootView;
    }

    public static IncludeThreadTimestampRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeThreadTimestampRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18721R.layout.include_thread_timestamp_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeThreadTimestampRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeThreadTimestampRowViewBinding((ThreadTimestampRowView) view);
    }
}
