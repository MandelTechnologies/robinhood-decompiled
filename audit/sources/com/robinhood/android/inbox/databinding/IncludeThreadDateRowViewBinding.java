package com.robinhood.android.inbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.inbox.C18721R;
import com.robinhood.android.inbox.p156ui.thread.ThreadDateRowView;

/* loaded from: classes10.dex */
public final class IncludeThreadDateRowViewBinding implements ViewBinding {
    private final ThreadDateRowView rootView;

    private IncludeThreadDateRowViewBinding(ThreadDateRowView threadDateRowView) {
        this.rootView = threadDateRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ThreadDateRowView getRoot() {
        return this.rootView;
    }

    public static IncludeThreadDateRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeThreadDateRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18721R.layout.include_thread_date_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeThreadDateRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeThreadDateRowViewBinding((ThreadDateRowView) view);
    }
}
