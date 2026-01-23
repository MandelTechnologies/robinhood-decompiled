package com.robinhood.android.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.AvatarView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.settings.C28315R;

/* loaded from: classes5.dex */
public final class MergeNotificationSettingsMutedRowBinding implements ViewBinding {
    public final AvatarView avatarView;
    private final View rootView;
    public final RhTextView rowTitle;

    private MergeNotificationSettingsMutedRowBinding(View view, AvatarView avatarView, RhTextView rhTextView) {
        this.rootView = view;
        this.avatarView = avatarView;
        this.rowTitle = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeNotificationSettingsMutedRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C28315R.layout.merge_notification_settings_muted_row, viewGroup);
        return bind(viewGroup);
    }

    public static MergeNotificationSettingsMutedRowBinding bind(View view) {
        int i = C28315R.id.avatar_view;
        AvatarView avatarView = (AvatarView) ViewBindings.findChildViewById(view, i);
        if (avatarView != null) {
            i = C28315R.id.row_title;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new MergeNotificationSettingsMutedRowBinding(view, avatarView, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
