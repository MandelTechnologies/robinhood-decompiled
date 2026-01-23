package com.robinhood.android.inbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.inbox.C18721R;

/* loaded from: classes10.dex */
public final class IncludeThreadExternalActionViewBinding implements ViewBinding {
    public final ConstraintLayout inboxThreadExternalActionContainer;
    public final RhTextView inboxThreadExternalActionTxt;
    public final RhTextView inboxThreadExternalActionUrlTxt;
    private final ConstraintLayout rootView;

    private IncludeThreadExternalActionViewBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.inboxThreadExternalActionContainer = constraintLayout2;
        this.inboxThreadExternalActionTxt = rhTextView;
        this.inboxThreadExternalActionUrlTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IncludeThreadExternalActionViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeThreadExternalActionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18721R.layout.include_thread_external_action_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeThreadExternalActionViewBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C18721R.id.inbox_thread_external_action_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C18721R.id.inbox_thread_external_action_url_txt;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                return new IncludeThreadExternalActionViewBinding(constraintLayout, constraintLayout, rhTextView, rhTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
