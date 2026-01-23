package com.robinhood.android.inbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.chip.RdsChip;
import com.robinhood.android.inbox.C18721R;

/* loaded from: classes10.dex */
public final class MergeThreadResponseRowViewBinding implements ViewBinding {
    public final RdsChip inboxThreadResponseTxt;
    private final View rootView;

    private MergeThreadResponseRowViewBinding(View view, RdsChip rdsChip) {
        this.rootView = view;
        this.inboxThreadResponseTxt = rdsChip;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeThreadResponseRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C18721R.layout.merge_thread_response_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeThreadResponseRowViewBinding bind(View view) {
        int i = C18721R.id.inbox_thread_response_txt;
        RdsChip rdsChip = (RdsChip) ViewBindings.findChildViewById(view, i);
        if (rdsChip != null) {
            return new MergeThreadResponseRowViewBinding(view, rdsChip);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
