package com.robinhood.android.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.settings.C28315R;
import com.robinhood.android.settings.p254ui.notification.NotificationSettingSubtitleRichTextRow;

/* loaded from: classes5.dex */
public final class IncludeNotificationSettingsRichTextRowBinding implements ViewBinding {
    private final NotificationSettingSubtitleRichTextRow rootView;

    private IncludeNotificationSettingsRichTextRowBinding(NotificationSettingSubtitleRichTextRow notificationSettingSubtitleRichTextRow) {
        this.rootView = notificationSettingSubtitleRichTextRow;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NotificationSettingSubtitleRichTextRow getRoot() {
        return this.rootView;
    }

    public static IncludeNotificationSettingsRichTextRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNotificationSettingsRichTextRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28315R.layout.include_notification_settings_rich_text_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNotificationSettingsRichTextRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNotificationSettingsRichTextRowBinding((NotificationSettingSubtitleRichTextRow) view);
    }
}
