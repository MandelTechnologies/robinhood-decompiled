package com.robinhood.android.inbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.inbox.C18721R;
import com.robinhood.android.inbox.p156ui.thread.ThreadMessageRowView;

/* loaded from: classes10.dex */
public final class IncludeThreadMessageRowViewBinding implements ViewBinding {
    private final ThreadMessageRowView rootView;

    private IncludeThreadMessageRowViewBinding(ThreadMessageRowView threadMessageRowView) {
        this.rootView = threadMessageRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ThreadMessageRowView getRoot() {
        return this.rootView;
    }

    public static IncludeThreadMessageRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeThreadMessageRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18721R.layout.include_thread_message_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeThreadMessageRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeThreadMessageRowViewBinding((ThreadMessageRowView) view);
    }
}
