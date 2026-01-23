package com.robinhood.android.inbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.inbox.C18721R;

/* loaded from: classes10.dex */
public final class MergeImageToSendItemBinding implements ViewBinding {
    public final FrameLayout imageToSendCloseBtn;
    public final ImageView imageToSendImg;
    private final View rootView;

    private MergeImageToSendItemBinding(View view, FrameLayout frameLayout, ImageView imageView) {
        this.rootView = view;
        this.imageToSendCloseBtn = frameLayout;
        this.imageToSendImg = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeImageToSendItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C18721R.layout.merge_image_to_send_item, viewGroup);
        return bind(viewGroup);
    }

    public static MergeImageToSendItemBinding bind(View view) {
        int i = C18721R.id.image_to_send_close_btn;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C18721R.id.image_to_send_img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                return new MergeImageToSendItemBinding(view, frameLayout, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
