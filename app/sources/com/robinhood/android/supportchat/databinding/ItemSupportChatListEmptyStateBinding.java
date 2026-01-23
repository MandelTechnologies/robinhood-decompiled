package com.robinhood.android.supportchat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.supportchat.C29104R;

/* loaded from: classes9.dex */
public final class ItemSupportChatListEmptyStateBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final ConstraintLayout supportChatListEmptyStateContainer;
    public final RdsPogView supportChatListEmptyStatePog;
    public final RhTextView supportChatListEmptyStateSubtitle;
    public final RhTextView supportChatListEmptyStateTitle;

    private ItemSupportChatListEmptyStateBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RdsPogView rdsPogView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.supportChatListEmptyStateContainer = constraintLayout2;
        this.supportChatListEmptyStatePog = rdsPogView;
        this.supportChatListEmptyStateSubtitle = rhTextView;
        this.supportChatListEmptyStateTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemSupportChatListEmptyStateBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemSupportChatListEmptyStateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29104R.layout.item_support_chat_list_empty_state, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemSupportChatListEmptyStateBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C29104R.id.support_chat_list_empty_state_pog;
        RdsPogView rdsPogView = (RdsPogView) ViewBindings.findChildViewById(view, i);
        if (rdsPogView != null) {
            i = C29104R.id.support_chat_list_empty_state_subtitle;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C29104R.id.support_chat_list_empty_state_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new ItemSupportChatListEmptyStateBinding(constraintLayout, constraintLayout, rdsPogView, rhTextView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
