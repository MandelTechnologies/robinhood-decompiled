package com.robinhood.android.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.settings.C28315R;
import com.robinhood.android.settings.p254ui.notification.NotificationSettingsRadioGroup;

/* loaded from: classes5.dex */
public final class IncludeNotificationSettingsRadioGroupBinding implements ViewBinding {
    private final NotificationSettingsRadioGroup rootView;

    private IncludeNotificationSettingsRadioGroupBinding(NotificationSettingsRadioGroup notificationSettingsRadioGroup) {
        this.rootView = notificationSettingsRadioGroup;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NotificationSettingsRadioGroup getRoot() {
        return this.rootView;
    }

    public static IncludeNotificationSettingsRadioGroupBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNotificationSettingsRadioGroupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28315R.layout.include_notification_settings_radio_group, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNotificationSettingsRadioGroupBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNotificationSettingsRadioGroupBinding((NotificationSettingsRadioGroup) view);
    }
}
