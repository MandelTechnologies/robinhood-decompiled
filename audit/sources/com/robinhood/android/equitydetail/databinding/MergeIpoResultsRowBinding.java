package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;

/* loaded from: classes3.dex */
public final class MergeIpoResultsRowBinding implements ViewBinding {
    public final RhTextView detail;
    public final View divider;
    private final View rootView;
    public final RhTextView title;

    private MergeIpoResultsRowBinding(View view, RhTextView rhTextView, View view2, RhTextView rhTextView2) {
        this.rootView = view;
        this.detail = rhTextView;
        this.divider = view2;
        this.title = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeIpoResultsRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C15314R.layout.merge_ipo_results_row, viewGroup);
        return bind(viewGroup);
    }

    public static MergeIpoResultsRowBinding bind(View view) {
        View viewFindChildViewById;
        int i = C15314R.id.detail;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C15314R.id.divider))) != null) {
            i = C15314R.id.title;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                return new MergeIpoResultsRowBinding(view, rhTextView, viewFindChildViewById, rhTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
