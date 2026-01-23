package com.robinhood.android.inbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.inbox.C18721R;

/* loaded from: classes10.dex */
public final class MergeThreadTimestampRowViewBinding implements ViewBinding {
    public final RhTextView inboxThreadTimestampTxt;
    private final View rootView;

    private MergeThreadTimestampRowViewBinding(View view, RhTextView rhTextView) {
        this.rootView = view;
        this.inboxThreadTimestampTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeThreadTimestampRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C18721R.layout.merge_thread_timestamp_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeThreadTimestampRowViewBinding bind(View view) {
        int i = C18721R.id.inbox_thread_timestamp_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            return new MergeThreadTimestampRowViewBinding(view, rhTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
