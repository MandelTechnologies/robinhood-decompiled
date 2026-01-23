package com.robinhood.android.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.widget.C31480R;

/* loaded from: classes9.dex */
public final class WidgetHeaderRowBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final ImageView widgetHeaderCaretImg;
    public final LinearLayout widgetHeaderRow;
    public final TextView widgetHeaderTxt;

    private WidgetHeaderRowBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, TextView textView) {
        this.rootView = linearLayout;
        this.widgetHeaderCaretImg = imageView;
        this.widgetHeaderRow = linearLayout2;
        this.widgetHeaderTxt = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static WidgetHeaderRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static WidgetHeaderRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31480R.layout.widget_header_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static WidgetHeaderRowBinding bind(View view) {
        int i = C31480R.id.widget_header_caret_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i2 = C31480R.id.widget_header_txt;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
            if (textView != null) {
                return new WidgetHeaderRowBinding(linearLayout, imageView, linearLayout, textView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
