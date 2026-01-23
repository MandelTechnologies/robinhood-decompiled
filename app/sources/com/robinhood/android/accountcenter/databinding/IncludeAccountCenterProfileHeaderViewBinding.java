package com.robinhood.android.accountcenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.accountcenter.views.AccountCenterProfileHeaderView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.profiles.p218ui.view.ProfilePictureView;

/* loaded from: classes24.dex */
public final class IncludeAccountCenterProfileHeaderViewBinding implements ViewBinding {
    public final RhTextView editProfileText;
    public final ProfilePictureView profilePictureView;
    private final AccountCenterProfileHeaderView rootView;
    public final ImageView userNameAtIcon;
    public final LinearLayout userNameLayout;
    public final RhTextView userNameText;

    private IncludeAccountCenterProfileHeaderViewBinding(AccountCenterProfileHeaderView accountCenterProfileHeaderView, RhTextView rhTextView, ProfilePictureView profilePictureView, ImageView imageView, LinearLayout linearLayout, RhTextView rhTextView2) {
        this.rootView = accountCenterProfileHeaderView;
        this.editProfileText = rhTextView;
        this.profilePictureView = profilePictureView;
        this.userNameAtIcon = imageView;
        this.userNameLayout = linearLayout;
        this.userNameText = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public AccountCenterProfileHeaderView getRoot() {
        return this.rootView;
    }

    public static IncludeAccountCenterProfileHeaderViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAccountCenterProfileHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8293R.layout.include_account_center_profile_header_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAccountCenterProfileHeaderViewBinding bind(View view) {
        int i = C8293R.id.edit_profile_text;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C8293R.id.profile_picture_view;
            ProfilePictureView profilePictureView = (ProfilePictureView) ViewBindings.findChildViewById(view, i);
            if (profilePictureView != null) {
                i = C8293R.id.user_name_at_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C8293R.id.user_name_layout;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C8293R.id.user_name_text;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            return new IncludeAccountCenterProfileHeaderViewBinding((AccountCenterProfileHeaderView) view, rhTextView, profilePictureView, imageView, linearLayout, rhTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
