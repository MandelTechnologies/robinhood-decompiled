package com.robinhood.shared.trade.crypto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.trade.crypto.C40095R;

/* loaded from: classes12.dex */
public final class IncludeSwipeHintBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final ImageView submitUpArrow;
    public final LinearLayout swipeHint;
    public final RhTextView swipeHintText;

    private IncludeSwipeHintBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, RhTextView rhTextView) {
        this.rootView = linearLayout;
        this.submitUpArrow = imageView;
        this.swipeHint = linearLayout2;
        this.swipeHintText = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IncludeSwipeHintBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSwipeHintBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C40095R.layout.include_swipe_hint, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSwipeHintBinding bind(View view) {
        int i = C40095R.id.submit_up_arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i2 = C40095R.id.swipe_hint_text;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i2);
            if (rhTextView != null) {
                return new IncludeSwipeHintBinding(linearLayout, imageView, linearLayout, rhTextView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
