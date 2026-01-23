package com.robinhood.android.common.p088ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.C11839R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class MergeAvatarViewBinding implements ViewBinding {
    public final ImageView avatarImg;
    public final RhTextView avatarTxt;
    private final View rootView;

    private MergeAvatarViewBinding(View view, ImageView imageView, RhTextView rhTextView) {
        this.rootView = view;
        this.avatarImg = imageView;
        this.avatarTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeAvatarViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11839R.layout.merge_avatar_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeAvatarViewBinding bind(View view) {
        int i = C11839R.id.avatar_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C11839R.id.avatar_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new MergeAvatarViewBinding(view, imageView, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
