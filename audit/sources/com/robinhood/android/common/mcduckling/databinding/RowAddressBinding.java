package com.robinhood.android.common.mcduckling.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.mcduckling.C11257R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class RowAddressBinding implements ViewBinding {
    public final View addressRowDivider;
    public final RhTextView addressRowPrimaryText;
    public final ConstraintLayout addressRowRoot;
    public final RhTextView addressRowSecondaryText;
    public final ImageView addressRowSelectedIcon;
    private final ConstraintLayout rootView;

    private RowAddressBinding(ConstraintLayout constraintLayout, View view, RhTextView rhTextView, ConstraintLayout constraintLayout2, RhTextView rhTextView2, ImageView imageView) {
        this.rootView = constraintLayout;
        this.addressRowDivider = view;
        this.addressRowPrimaryText = rhTextView;
        this.addressRowRoot = constraintLayout2;
        this.addressRowSecondaryText = rhTextView2;
        this.addressRowSelectedIcon = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static RowAddressBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowAddressBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11257R.layout.row_address, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowAddressBinding bind(View view) {
        int i = C11257R.id.address_row_divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C11257R.id.address_row_primary_text;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = C11257R.id.address_row_secondary_text;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C11257R.id.address_row_selected_icon;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        return new RowAddressBinding(constraintLayout, viewFindChildViewById, rhTextView, constraintLayout, rhTextView2, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
