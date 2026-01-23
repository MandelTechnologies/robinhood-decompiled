package com.robinhood.android.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.settings.C28315R;

/* loaded from: classes5.dex */
public final class IncludeNotificationSettingsPaddingBinding implements ViewBinding {
    private final Space rootView;

    private IncludeNotificationSettingsPaddingBinding(Space space) {
        this.rootView = space;
    }

    @Override // androidx.viewbinding.ViewBinding
    public Space getRoot() {
        return this.rootView;
    }

    public static IncludeNotificationSettingsPaddingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNotificationSettingsPaddingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28315R.layout.include_notification_settings_padding, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNotificationSettingsPaddingBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNotificationSettingsPaddingBinding((Space) view);
    }
}
