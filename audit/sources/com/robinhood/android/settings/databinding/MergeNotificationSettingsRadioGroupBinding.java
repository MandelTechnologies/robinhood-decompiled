package com.robinhood.android.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.settings.C28315R;

/* loaded from: classes5.dex */
public final class MergeNotificationSettingsRadioGroupBinding implements ViewBinding {
    private final View rootView;

    private MergeNotificationSettingsRadioGroupBinding(View view) {
        this.rootView = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeNotificationSettingsRadioGroupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C28315R.layout.merge_notification_settings_radio_group, viewGroup);
        return bind(viewGroup);
    }

    public static MergeNotificationSettingsRadioGroupBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new MergeNotificationSettingsRadioGroupBinding(view);
    }
}
