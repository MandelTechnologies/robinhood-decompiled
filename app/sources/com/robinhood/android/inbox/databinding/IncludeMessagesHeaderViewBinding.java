package com.robinhood.android.inbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.inbox.C18721R;
import com.robinhood.android.inbox.p156ui.messages.MessagesHeaderView;

/* loaded from: classes10.dex */
public final class IncludeMessagesHeaderViewBinding implements ViewBinding {
    private final MessagesHeaderView rootView;

    private IncludeMessagesHeaderViewBinding(MessagesHeaderView messagesHeaderView) {
        this.rootView = messagesHeaderView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public MessagesHeaderView getRoot() {
        return this.rootView;
    }

    public static IncludeMessagesHeaderViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeMessagesHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18721R.layout.include_messages_header_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeMessagesHeaderViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeMessagesHeaderViewBinding((MessagesHeaderView) view);
    }
}
