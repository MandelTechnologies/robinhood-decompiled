package com.robinhood.android.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.settings.C28315R;
import com.robinhood.android.settings.p254ui.notification.NotificationSettingsSubPageEntryRow;

/* loaded from: classes5.dex */
public final class IncludeNotificationSettingsSubPageEntryRowBinding implements ViewBinding {
    private final NotificationSettingsSubPageEntryRow rootView;

    private IncludeNotificationSettingsSubPageEntryRowBinding(NotificationSettingsSubPageEntryRow notificationSettingsSubPageEntryRow) {
        this.rootView = notificationSettingsSubPageEntryRow;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NotificationSettingsSubPageEntryRow getRoot() {
        return this.rootView;
    }

    public static IncludeNotificationSettingsSubPageEntryRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNotificationSettingsSubPageEntryRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28315R.layout.include_notification_settings_sub_page_entry_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNotificationSettingsSubPageEntryRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNotificationSettingsSubPageEntryRowBinding((NotificationSettingsSubPageEntryRow) view);
    }
}
