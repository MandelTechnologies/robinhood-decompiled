package com.robinhood.android.inbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.inbox.C18721R;

/* loaded from: classes10.dex */
public final class MergeThreadMessageRowViewRightBinding implements ViewBinding {
    public final View inboxThreadMessageAvatarView;
    public final FrameLayout inboxThreadMessageContainer;
    public final FrameLayout inboxThreadMessageStatusContainer;
    public final RhTextView inboxThreadMessageTextStatusTxt;
    private final ConstraintLayout rootView;

    private MergeThreadMessageRowViewRightBinding(ConstraintLayout constraintLayout, View view, FrameLayout frameLayout, FrameLayout frameLayout2, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.inboxThreadMessageAvatarView = view;
        this.inboxThreadMessageContainer = frameLayout;
        this.inboxThreadMessageStatusContainer = frameLayout2;
        this.inboxThreadMessageTextStatusTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static MergeThreadMessageRowViewRightBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MergeThreadMessageRowViewRightBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18721R.layout.merge_thread_message_row_view_right, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MergeThreadMessageRowViewRightBinding bind(View view) {
        int i = C18721R.id.inbox_thread_message_avatar_view;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C18721R.id.inbox_thread_message_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C18721R.id.inbox_thread_message_status_container;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null) {
                    i = C18721R.id.inbox_thread_message_text_status_txt;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        return new MergeThreadMessageRowViewRightBinding((ConstraintLayout) view, viewFindChildViewById, frameLayout, frameLayout2, rhTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
