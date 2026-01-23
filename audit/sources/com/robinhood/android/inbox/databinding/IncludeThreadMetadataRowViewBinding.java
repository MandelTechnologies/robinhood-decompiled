package com.robinhood.android.inbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.inbox.C18721R;
import com.robinhood.android.inbox.p156ui.thread.ThreadMetadataRowView;

/* loaded from: classes10.dex */
public final class IncludeThreadMetadataRowViewBinding implements ViewBinding {
    private final ThreadMetadataRowView rootView;

    private IncludeThreadMetadataRowViewBinding(ThreadMetadataRowView threadMetadataRowView) {
        this.rootView = threadMetadataRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ThreadMetadataRowView getRoot() {
        return this.rootView;
    }

    public static IncludeThreadMetadataRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeThreadMetadataRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18721R.layout.include_thread_metadata_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeThreadMetadataRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeThreadMetadataRowViewBinding((ThreadMetadataRowView) view);
    }
}
