package com.robinhood.android.matcha.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.matcha.C21284R;

/* loaded from: classes8.dex */
public final class IncludeMatchaEnableContactsRowBinding implements ViewBinding {
    public final RdsButton enableContactsButton;
    public final ImageView enableContactsImage;
    private final LinearLayout rootView;

    private IncludeMatchaEnableContactsRowBinding(LinearLayout linearLayout, RdsButton rdsButton, ImageView imageView) {
        this.rootView = linearLayout;
        this.enableContactsButton = rdsButton;
        this.enableContactsImage = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IncludeMatchaEnableContactsRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeMatchaEnableContactsRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C21284R.layout.include_matcha_enable_contacts_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeMatchaEnableContactsRowBinding bind(View view) {
        int i = C21284R.id.enable_contacts_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C21284R.id.enable_contacts_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                return new IncludeMatchaEnableContactsRowBinding((LinearLayout) view, rdsButton, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
