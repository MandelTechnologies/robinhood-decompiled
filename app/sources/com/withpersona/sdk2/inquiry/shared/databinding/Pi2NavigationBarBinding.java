package com.withpersona.sdk2.inquiry.shared.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.withpersona.sdk2.inquiry.shared.R$id;
import com.withpersona.sdk2.inquiry.shared.R$layout;

/* loaded from: classes18.dex */
public final class Pi2NavigationBarBinding implements ViewBinding {
    public final ImageView navBarBackButton;
    public final ImageView navBarCancelButton;
    private final View rootView;

    private Pi2NavigationBarBinding(View view, ImageView imageView, ImageView imageView2) {
        this.rootView = view;
        this.navBarBackButton = imageView;
        this.navBarCancelButton = imageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static Pi2NavigationBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.pi2_navigation_bar, viewGroup);
        return bind(viewGroup);
    }

    public static Pi2NavigationBarBinding bind(View view) {
        int i = R$id.nav_bar_back_button;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R$id.nav_bar_cancel_button;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                return new Pi2NavigationBarBinding(view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
