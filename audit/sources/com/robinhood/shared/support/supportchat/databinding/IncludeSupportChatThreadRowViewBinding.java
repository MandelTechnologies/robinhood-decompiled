package com.robinhood.shared.support.supportchat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.shared.support.supportchat.C40042R;
import com.robinhood.shared.support.supportchat.SupportChatThreadRowView;

/* loaded from: classes6.dex */
public final class IncludeSupportChatThreadRowViewBinding implements ViewBinding {
    private final SupportChatThreadRowView rootView;

    private IncludeSupportChatThreadRowViewBinding(SupportChatThreadRowView supportChatThreadRowView) {
        this.rootView = supportChatThreadRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SupportChatThreadRowView getRoot() {
        return this.rootView;
    }

    public static IncludeSupportChatThreadRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSupportChatThreadRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C40042R.layout.include_support_chat_thread_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSupportChatThreadRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeSupportChatThreadRowViewBinding((SupportChatThreadRowView) view);
    }
}
