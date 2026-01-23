package com.robinhood.android.cash.disputes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class MergeDateSelectionViewBinding implements ViewBinding {
    public final RhTextView dateSelectionTextView;
    private final View rootView;

    private MergeDateSelectionViewBinding(View view, RhTextView rhTextView) {
        this.rootView = view;
        this.dateSelectionTextView = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeDateSelectionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C10007R.layout.merge_date_selection_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeDateSelectionViewBinding bind(View view) {
        int i = C10007R.id.date_selection_text_view;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            return new MergeDateSelectionViewBinding(view, rhTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
