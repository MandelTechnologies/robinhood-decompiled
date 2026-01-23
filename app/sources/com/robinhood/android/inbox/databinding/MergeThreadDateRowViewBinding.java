package com.robinhood.android.inbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.inbox.C18721R;

/* loaded from: classes10.dex */
public final class MergeThreadDateRowViewBinding implements ViewBinding {
    public final RhTextView inboxThreadDateTxt;
    private final View rootView;

    private MergeThreadDateRowViewBinding(View view, RhTextView rhTextView) {
        this.rootView = view;
        this.inboxThreadDateTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeThreadDateRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C18721R.layout.merge_thread_date_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeThreadDateRowViewBinding bind(View view) {
        int i = C18721R.id.inbox_thread_date_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            return new MergeThreadDateRowViewBinding(view, rhTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
