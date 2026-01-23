package com.robinhood.android.advancedchart.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.advancedchart.C8502R;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class IncludeEditIndicatorRowBinding implements ViewBinding {
    public final View divider;
    public final RhEditText editText;
    public final RhTextView label;
    private final ConstraintLayout rootView;

    private IncludeEditIndicatorRowBinding(ConstraintLayout constraintLayout, View view, RhEditText rhEditText, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.divider = view;
        this.editText = rhEditText;
        this.label = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IncludeEditIndicatorRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEditIndicatorRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8502R.layout.include_edit_indicator_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEditIndicatorRowBinding bind(View view) {
        int i = C8502R.id.divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C8502R.id.edit_text;
            RhEditText rhEditText = (RhEditText) ViewBindings.findChildViewById(view, i);
            if (rhEditText != null) {
                i = C8502R.id.label;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    return new IncludeEditIndicatorRowBinding((ConstraintLayout) view, viewFindChildViewById, rhEditText, rhTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
