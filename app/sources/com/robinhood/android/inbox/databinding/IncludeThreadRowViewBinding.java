package com.robinhood.android.inbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.inbox.C18721R;
import com.robinhood.android.inbox.p156ui.messages.ThreadRowView;

/* loaded from: classes10.dex */
public final class IncludeThreadRowViewBinding implements ViewBinding {
    private final ThreadRowView rootView;

    private IncludeThreadRowViewBinding(ThreadRowView threadRowView) {
        this.rootView = threadRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ThreadRowView getRoot() {
        return this.rootView;
    }

    public static IncludeThreadRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeThreadRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18721R.layout.include_thread_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeThreadRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeThreadRowViewBinding((ThreadRowView) view);
    }
}
