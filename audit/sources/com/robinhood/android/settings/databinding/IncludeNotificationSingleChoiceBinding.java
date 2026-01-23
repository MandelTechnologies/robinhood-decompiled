package com.robinhood.android.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.settings.C28315R;
import com.robinhood.android.settings.p254ui.notification.NotificationSingleChoiceView;

/* loaded from: classes5.dex */
public final class IncludeNotificationSingleChoiceBinding implements ViewBinding {
    private final NotificationSingleChoiceView rootView;

    private IncludeNotificationSingleChoiceBinding(NotificationSingleChoiceView notificationSingleChoiceView) {
        this.rootView = notificationSingleChoiceView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NotificationSingleChoiceView getRoot() {
        return this.rootView;
    }

    public static IncludeNotificationSingleChoiceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNotificationSingleChoiceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28315R.layout.include_notification_single_choice, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNotificationSingleChoiceBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNotificationSingleChoiceBinding((NotificationSingleChoiceView) view);
    }
}
