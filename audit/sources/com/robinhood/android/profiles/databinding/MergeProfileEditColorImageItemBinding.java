package com.robinhood.android.profiles.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.profiles.C25898R;

/* loaded from: classes11.dex */
public final class MergeProfileEditColorImageItemBinding implements ViewBinding {
    public final ImageView profileEditColorImg;
    public final FrameLayout profileEditUserImageContainer;
    public final ImageView profileEditUserImageSelectCheckmarkImg;
    public final ImageView profileEditUserImageSelectRingImg;
    private final View rootView;

    private MergeProfileEditColorImageItemBinding(View view, ImageView imageView, FrameLayout frameLayout, ImageView imageView2, ImageView imageView3) {
        this.rootView = view;
        this.profileEditColorImg = imageView;
        this.profileEditUserImageContainer = frameLayout;
        this.profileEditUserImageSelectCheckmarkImg = imageView2;
        this.profileEditUserImageSelectRingImg = imageView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeProfileEditColorImageItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C25898R.layout.merge_profile_edit_color_image_item, viewGroup);
        return bind(viewGroup);
    }

    public static MergeProfileEditColorImageItemBinding bind(View view) {
        int i = C25898R.id.profile_edit_color_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C25898R.id.profile_edit_user_image_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C25898R.id.profile_edit_user_image_select_checkmark_img;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = C25898R.id.profile_edit_user_image_select_ring_img;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView3 != null) {
                        return new MergeProfileEditColorImageItemBinding(view, imageView, frameLayout, imageView2, imageView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
