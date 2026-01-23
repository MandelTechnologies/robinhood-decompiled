package com.robinhood.android.inbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.inbox.C18721R;

/* loaded from: classes10.dex */
public final class MergeThreadMetadataRowViewBinding implements ViewBinding {
    public final RhTextView inboxThreadMetadataActionTxt;
    public final RhTextView inboxThreadMetadataTxt;
    private final View rootView;

    private MergeThreadMetadataRowViewBinding(View view, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.inboxThreadMetadataActionTxt = rhTextView;
        this.inboxThreadMetadataTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeThreadMetadataRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C18721R.layout.merge_thread_metadata_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeThreadMetadataRowViewBinding bind(View view) {
        int i = C18721R.id.inbox_thread_metadata_action_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C18721R.id.inbox_thread_metadata_txt;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                return new MergeThreadMetadataRowViewBinding(view, rhTextView, rhTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
