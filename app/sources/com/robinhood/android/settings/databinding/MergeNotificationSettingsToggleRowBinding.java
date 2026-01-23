package com.robinhood.android.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.settings.C28315R;

/* loaded from: classes5.dex */
public final class MergeNotificationSettingsToggleRowBinding implements ViewBinding {
    private final View rootView;
    public final RdsToggleView toggleView;

    private MergeNotificationSettingsToggleRowBinding(View view, RdsToggleView rdsToggleView) {
        this.rootView = view;
        this.toggleView = rdsToggleView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeNotificationSettingsToggleRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C28315R.layout.merge_notification_settings_toggle_row, viewGroup);
        return bind(viewGroup);
    }

    public static MergeNotificationSettingsToggleRowBinding bind(View view) {
        int i = C28315R.id.toggle_view;
        RdsToggleView rdsToggleView = (RdsToggleView) ViewBindings.findChildViewById(view, i);
        if (rdsToggleView != null) {
            return new MergeNotificationSettingsToggleRowBinding(view, rdsToggleView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
