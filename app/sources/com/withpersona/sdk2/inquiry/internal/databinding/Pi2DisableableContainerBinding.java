package com.withpersona.sdk2.inquiry.internal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.withpersona.sdk2.inquiry.internal.R$id;
import com.withpersona.sdk2.inquiry.internal.R$layout;

/* loaded from: classes18.dex */
public final class Pi2DisableableContainerBinding implements ViewBinding {
    public final View overlay;
    private final View rootView;
    public final FrameLayout viewContainer;

    private Pi2DisableableContainerBinding(View view, View view2, FrameLayout frameLayout) {
        this.rootView = view;
        this.overlay = view2;
        this.viewContainer = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static Pi2DisableableContainerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.pi2_disableable_container, viewGroup);
        return bind(viewGroup);
    }

    public static Pi2DisableableContainerBinding bind(View view) {
        int i = R$id.overlay;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = R$id.view_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                return new Pi2DisableableContainerBinding(view, viewFindChildViewById, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
