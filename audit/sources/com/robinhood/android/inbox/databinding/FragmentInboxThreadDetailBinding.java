package com.robinhood.android.inbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.view.LoggedRecyclerView;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.inbox.C18721R;

/* loaded from: classes10.dex */
public final class FragmentInboxThreadDetailBinding implements ViewBinding {
    public final RecyclerView imagesToSendRecyclerView;
    public final RdsTextInputContainerView inboxEditTextContainer;
    public final RdsTextInputEditText inboxMessageEdt;
    public final RdsProgressBar inboxMessageProgressBar;
    public final LinearLayout inboxThreadListFragment;
    public final LoggedRecyclerView recyclerView;
    private final LinearLayout rootView;

    private FragmentInboxThreadDetailBinding(LinearLayout linearLayout, RecyclerView recyclerView, RdsTextInputContainerView rdsTextInputContainerView, RdsTextInputEditText rdsTextInputEditText, RdsProgressBar rdsProgressBar, LinearLayout linearLayout2, LoggedRecyclerView loggedRecyclerView) {
        this.rootView = linearLayout;
        this.imagesToSendRecyclerView = recyclerView;
        this.inboxEditTextContainer = rdsTextInputContainerView;
        this.inboxMessageEdt = rdsTextInputEditText;
        this.inboxMessageProgressBar = rdsProgressBar;
        this.inboxThreadListFragment = linearLayout2;
        this.recyclerView = loggedRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentInboxThreadDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentInboxThreadDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18721R.layout.fragment_inbox_thread_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentInboxThreadDetailBinding bind(View view) {
        int i = C18721R.id.images_to_send_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C18721R.id.inbox_edit_text_container;
            RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
            if (rdsTextInputContainerView != null) {
                i = C18721R.id.inbox_message_edt;
                RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
                if (rdsTextInputEditText != null) {
                    i = C18721R.id.inbox_message_progress_bar;
                    RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
                    if (rdsProgressBar != null) {
                        LinearLayout linearLayout = (LinearLayout) view;
                        i = C18721R.id.recycler_view;
                        LoggedRecyclerView loggedRecyclerView = (LoggedRecyclerView) ViewBindings.findChildViewById(view, i);
                        if (loggedRecyclerView != null) {
                            return new FragmentInboxThreadDetailBinding(linearLayout, recyclerView, rdsTextInputContainerView, rdsTextInputEditText, rdsProgressBar, linearLayout, loggedRecyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
