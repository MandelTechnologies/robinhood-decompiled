package com.robinhood.android.profiles.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.profiles.C25898R;
import com.robinhood.android.profiles.p218ui.view.ProfileEditColorItemView;

/* loaded from: classes11.dex */
public final class IncludeProfileEditColorImageItemBinding implements ViewBinding {
    private final ProfileEditColorItemView rootView;

    private IncludeProfileEditColorImageItemBinding(ProfileEditColorItemView profileEditColorItemView) {
        this.rootView = profileEditColorItemView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ProfileEditColorItemView getRoot() {
        return this.rootView;
    }

    public static IncludeProfileEditColorImageItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeProfileEditColorImageItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25898R.layout.include_profile_edit_color_image_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeProfileEditColorImageItemBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeProfileEditColorImageItemBinding((ProfileEditColorItemView) view);
    }
}
