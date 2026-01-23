package com.robinhood.android.common.gold.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.gold.C11182R;
import com.robinhood.android.common.gold.GoldValuePropView;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class GoldValuePropViewBinding implements ViewBinding {
    public final RhTextView descriptionTxt;
    public final RdsPogView pog;
    private final GoldValuePropView rootView;
    public final ImageView sparkle;
    public final RhTextView titleTxt;
    public final GoldValuePropView valuePropView;

    private GoldValuePropViewBinding(GoldValuePropView goldValuePropView, RhTextView rhTextView, RdsPogView rdsPogView, ImageView imageView, RhTextView rhTextView2, GoldValuePropView goldValuePropView2) {
        this.rootView = goldValuePropView;
        this.descriptionTxt = rhTextView;
        this.pog = rdsPogView;
        this.sparkle = imageView;
        this.titleTxt = rhTextView2;
        this.valuePropView = goldValuePropView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public GoldValuePropView getRoot() {
        return this.rootView;
    }

    public static GoldValuePropViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GoldValuePropViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11182R.layout.gold_value_prop_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static GoldValuePropViewBinding bind(View view) {
        int i = C11182R.id.description_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C11182R.id.pog;
            RdsPogView rdsPogView = (RdsPogView) ViewBindings.findChildViewById(view, i);
            if (rdsPogView != null) {
                i = C11182R.id.sparkle;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C11182R.id.title_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        GoldValuePropView goldValuePropView = (GoldValuePropView) view;
                        return new GoldValuePropViewBinding(goldValuePropView, rhTextView, rdsPogView, imageView, rhTextView2, goldValuePropView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
