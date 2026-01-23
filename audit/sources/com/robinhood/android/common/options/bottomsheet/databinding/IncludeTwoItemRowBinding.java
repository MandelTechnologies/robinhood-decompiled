package com.robinhood.android.common.options.bottomsheet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.options.bottomsheet.C11312R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class IncludeTwoItemRowBinding implements ViewBinding {
    public final RhTextView headerRowPrimaryText;
    public final RhTextView headerRowSecondaryText;
    private final LinearLayout rootView;

    private IncludeTwoItemRowBinding(LinearLayout linearLayout, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.headerRowPrimaryText = rhTextView;
        this.headerRowSecondaryText = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IncludeTwoItemRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeTwoItemRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11312R.layout.include_two_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeTwoItemRowBinding bind(View view) {
        int i = C11312R.id.header_row_primary_text;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C11312R.id.header_row_secondary_text;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                return new IncludeTwoItemRowBinding((LinearLayout) view, rhTextView, rhTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
