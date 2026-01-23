package com.robinhood.android.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.settings.C28315R;
import com.robinhood.android.settings.p254ui.notification.NotificationSettingsTitleSubtitleRow;

/* loaded from: classes5.dex */
public final class IncludeNotificationSettingsTitleSubtitleRowBinding implements ViewBinding {
    private final NotificationSettingsTitleSubtitleRow rootView;

    private IncludeNotificationSettingsTitleSubtitleRowBinding(NotificationSettingsTitleSubtitleRow notificationSettingsTitleSubtitleRow) {
        this.rootView = notificationSettingsTitleSubtitleRow;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NotificationSettingsTitleSubtitleRow getRoot() {
        return this.rootView;
    }

    public static IncludeNotificationSettingsTitleSubtitleRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNotificationSettingsTitleSubtitleRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28315R.layout.include_notification_settings_title_subtitle_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNotificationSettingsTitleSubtitleRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNotificationSettingsTitleSubtitleRowBinding((NotificationSettingsTitleSubtitleRow) view);
    }
}
