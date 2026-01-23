package com.robinhood.android.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.settings.C28315R;
import com.robinhood.android.settings.p254ui.notification.muted.NotificationSettingsMutedRow;

/* loaded from: classes5.dex */
public final class IncludeNotificationSettingsMutedRowBinding implements ViewBinding {
    private final NotificationSettingsMutedRow rootView;

    private IncludeNotificationSettingsMutedRowBinding(NotificationSettingsMutedRow notificationSettingsMutedRow) {
        this.rootView = notificationSettingsMutedRow;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NotificationSettingsMutedRow getRoot() {
        return this.rootView;
    }

    public static IncludeNotificationSettingsMutedRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNotificationSettingsMutedRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28315R.layout.include_notification_settings_muted_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNotificationSettingsMutedRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNotificationSettingsMutedRowBinding((NotificationSettingsMutedRow) view);
    }
}
