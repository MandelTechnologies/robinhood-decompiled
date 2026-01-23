package com.robinhood.android.acatsin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class RowBrokerageBinding implements ViewBinding {
    public final RhTextView brokerLabelText;
    public final ImageView brokerLogoView;
    public final RhTextView brokerNameTxt;
    private final LinearLayout rootView;

    private RowBrokerageBinding(LinearLayout linearLayout, RhTextView rhTextView, ImageView imageView, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.brokerLabelText = rhTextView;
        this.brokerLogoView = imageView;
        this.brokerNameTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static RowBrokerageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowBrokerageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C7725R.layout.row_brokerage, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowBrokerageBinding bind(View view) {
        int i = C7725R.id.broker_label_text;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C7725R.id.broker_logo_view;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C7725R.id.broker_name_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new RowBrokerageBinding((LinearLayout) view, rhTextView, imageView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
