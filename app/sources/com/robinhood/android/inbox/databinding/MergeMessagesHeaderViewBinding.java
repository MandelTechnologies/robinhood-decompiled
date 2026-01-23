package com.robinhood.android.inbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.inbox.C18721R;

/* loaded from: classes10.dex */
public final class MergeMessagesHeaderViewBinding implements ViewBinding {
    public final RhTextView headerViewText;
    private final View rootView;

    private MergeMessagesHeaderViewBinding(View view, RhTextView rhTextView) {
        this.rootView = view;
        this.headerViewText = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeMessagesHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C18721R.layout.merge_messages_header_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeMessagesHeaderViewBinding bind(View view) {
        int i = C18721R.id.header_view_text;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            return new MergeMessagesHeaderViewBinding(view, rhTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
