package com.robinhood.android.acatsin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class RowBrokerSearchBinding implements ViewBinding {
    public final ImageView brokerLogoView;
    public final RhTextView brokerNameTxt;
    private final ConstraintLayout rootView;
    public final View rowBottomDivider;

    private RowBrokerSearchBinding(ConstraintLayout constraintLayout, ImageView imageView, RhTextView rhTextView, View view) {
        this.rootView = constraintLayout;
        this.brokerLogoView = imageView;
        this.brokerNameTxt = rhTextView;
        this.rowBottomDivider = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static RowBrokerSearchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowBrokerSearchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C7725R.layout.row_broker_search, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowBrokerSearchBinding bind(View view) {
        View viewFindChildViewById;
        int i = C7725R.id.broker_logo_view;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C7725R.id.broker_name_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C7725R.id.row_bottom_divider))) != null) {
                return new RowBrokerSearchBinding((ConstraintLayout) view, imageView, rhTextView, viewFindChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
