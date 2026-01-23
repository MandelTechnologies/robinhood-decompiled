package com.robinhood.android.inbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.inbox.C18721R;
import com.robinhood.android.inbox.p156ui.thread.ThreadResponseRowView;

/* loaded from: classes10.dex */
public final class IncludeThreadResponseRowViewBinding implements ViewBinding {
    private final ThreadResponseRowView rootView;

    private IncludeThreadResponseRowViewBinding(ThreadResponseRowView threadResponseRowView) {
        this.rootView = threadResponseRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ThreadResponseRowView getRoot() {
        return this.rootView;
    }

    public static IncludeThreadResponseRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeThreadResponseRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18721R.layout.include_thread_response_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeThreadResponseRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeThreadResponseRowViewBinding((ThreadResponseRowView) view);
    }
}
