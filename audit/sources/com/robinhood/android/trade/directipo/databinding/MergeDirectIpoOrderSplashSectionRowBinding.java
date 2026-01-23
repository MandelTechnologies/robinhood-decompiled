package com.robinhood.android.trade.directipo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.directipo.C29323R;

/* loaded from: classes9.dex */
public final class MergeDirectIpoOrderSplashSectionRowBinding implements ViewBinding {
    public final ImageView icon;
    private final View rootView;
    public final RhTextView title;

    private MergeDirectIpoOrderSplashSectionRowBinding(View view, ImageView imageView, RhTextView rhTextView) {
        this.rootView = view;
        this.icon = imageView;
        this.title = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeDirectIpoOrderSplashSectionRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C29323R.layout.merge_direct_ipo_order_splash_section_row, viewGroup);
        return bind(viewGroup);
    }

    public static MergeDirectIpoOrderSplashSectionRowBinding bind(View view) {
        int i = C29323R.id.icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C29323R.id.title;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new MergeDirectIpoOrderSplashSectionRowBinding(view, imageView, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
