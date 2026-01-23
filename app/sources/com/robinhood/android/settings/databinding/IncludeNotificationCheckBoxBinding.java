package com.robinhood.android.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.settings.C28315R;

/* loaded from: classes5.dex */
public final class IncludeNotificationCheckBoxBinding implements ViewBinding {
    private final CheckBox rootView;

    private IncludeNotificationCheckBoxBinding(CheckBox checkBox) {
        this.rootView = checkBox;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CheckBox getRoot() {
        return this.rootView;
    }

    public static IncludeNotificationCheckBoxBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNotificationCheckBoxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28315R.layout.include_notification_check_box, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNotificationCheckBoxBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNotificationCheckBoxBinding((CheckBox) view);
    }
}
