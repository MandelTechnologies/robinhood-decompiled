package com.robinhood.android.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.settings.C28315R;
import com.robinhood.android.settings.p254ui.notification.NotificationSettingsToggleRow;

/* loaded from: classes5.dex */
public final class IncludeNotificationSettingsToggleRowBinding implements ViewBinding {
    private final NotificationSettingsToggleRow rootView;

    private IncludeNotificationSettingsToggleRowBinding(NotificationSettingsToggleRow notificationSettingsToggleRow) {
        this.rootView = notificationSettingsToggleRow;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NotificationSettingsToggleRow getRoot() {
        return this.rootView;
    }

    public static IncludeNotificationSettingsToggleRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNotificationSettingsToggleRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28315R.layout.include_notification_settings_toggle_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNotificationSettingsToggleRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNotificationSettingsToggleRowBinding((NotificationSettingsToggleRow) view);
    }
}
