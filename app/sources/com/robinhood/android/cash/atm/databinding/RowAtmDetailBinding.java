package com.robinhood.android.cash.atm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.atm.C9956R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class RowAtmDetailBinding implements ViewBinding {
    public final RhTextView atmAnnotationTxt;
    public final ImageView atmCaretIcon;
    public final RhTextView atmDistanceTxt;
    public final ImageView atmLocationIcon;
    public final RhTextView atmNameTxt;
    private final ConstraintLayout rootView;

    private RowAtmDetailBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, ImageView imageView, RhTextView rhTextView2, ImageView imageView2, RhTextView rhTextView3) {
        this.rootView = constraintLayout;
        this.atmAnnotationTxt = rhTextView;
        this.atmCaretIcon = imageView;
        this.atmDistanceTxt = rhTextView2;
        this.atmLocationIcon = imageView2;
        this.atmNameTxt = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static RowAtmDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowAtmDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C9956R.layout.row_atm_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowAtmDetailBinding bind(View view) {
        int i = C9956R.id.atm_annotation_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C9956R.id.atm_caret_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C9956R.id.atm_distance_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C9956R.id.atm_location_icon;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = C9956R.id.atm_name_txt;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            return new RowAtmDetailBinding((ConstraintLayout) view, rhTextView, imageView, rhTextView2, imageView2, rhTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
