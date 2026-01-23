package com.robinhood.android.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.settings.C28315R;
import com.robinhood.android.settings.p254ui.notification.NotificationSettingsSectionTitleRow;

/* loaded from: classes5.dex */
public final class IncludeNotificationSettingsTopSectionTitleRowBinding implements ViewBinding {
    private final NotificationSettingsSectionTitleRow rootView;

    private IncludeNotificationSettingsTopSectionTitleRowBinding(NotificationSettingsSectionTitleRow notificationSettingsSectionTitleRow) {
        this.rootView = notificationSettingsSectionTitleRow;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NotificationSettingsSectionTitleRow getRoot() {
        return this.rootView;
    }

    public static IncludeNotificationSettingsTopSectionTitleRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNotificationSettingsTopSectionTitleRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28315R.layout.include_notification_settings_top_section_title_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNotificationSettingsTopSectionTitleRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNotificationSettingsTopSectionTitleRowBinding((NotificationSettingsSectionTitleRow) view);
    }
}
