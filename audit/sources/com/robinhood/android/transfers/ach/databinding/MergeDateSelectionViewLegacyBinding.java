package com.robinhood.android.transfers.ach.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.ach.C30082R;

/* loaded from: classes9.dex */
public final class MergeDateSelectionViewLegacyBinding implements ViewBinding {
    public final RhTextView dateSelectionTextView;
    private final View rootView;

    private MergeDateSelectionViewLegacyBinding(View view, RhTextView rhTextView) {
        this.rootView = view;
        this.dateSelectionTextView = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeDateSelectionViewLegacyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C30082R.layout.merge_date_selection_view_legacy, viewGroup);
        return bind(viewGroup);
    }

    public static MergeDateSelectionViewLegacyBinding bind(View view) {
        int i = C30082R.id.date_selection_text_view;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            return new MergeDateSelectionViewLegacyBinding(view, rhTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
