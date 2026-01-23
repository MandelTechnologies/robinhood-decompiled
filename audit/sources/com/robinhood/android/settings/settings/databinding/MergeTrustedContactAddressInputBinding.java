package com.robinhood.android.settings.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.settings.settings.C28321R;

/* loaded from: classes5.dex */
public final class MergeTrustedContactAddressInputBinding implements ViewBinding {
    public final ImageView imageView;
    private final View rootView;
    public final RhTextView textView;

    private MergeTrustedContactAddressInputBinding(View view, ImageView imageView, RhTextView rhTextView) {
        this.rootView = view;
        this.imageView = imageView;
        this.textView = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeTrustedContactAddressInputBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C28321R.layout.merge_trusted_contact_address_input, viewGroup);
        return bind(viewGroup);
    }

    public static MergeTrustedContactAddressInputBinding bind(View view) {
        int i = C28321R.id.image_view;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C28321R.id.text_view;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new MergeTrustedContactAddressInputBinding(view, imageView, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
