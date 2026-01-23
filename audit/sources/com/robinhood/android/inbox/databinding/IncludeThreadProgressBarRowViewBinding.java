package com.robinhood.android.inbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.inbox.C18721R;
import com.robinhood.android.inbox.p156ui.thread.ThreadProgressBarRowView;

/* loaded from: classes10.dex */
public final class IncludeThreadProgressBarRowViewBinding implements ViewBinding {
    private final ThreadProgressBarRowView rootView;

    private IncludeThreadProgressBarRowViewBinding(ThreadProgressBarRowView threadProgressBarRowView) {
        this.rootView = threadProgressBarRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ThreadProgressBarRowView getRoot() {
        return this.rootView;
    }

    public static IncludeThreadProgressBarRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeThreadProgressBarRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18721R.layout.include_thread_progress_bar_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeThreadProgressBarRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeThreadProgressBarRowViewBinding((ThreadProgressBarRowView) view);
    }
}
