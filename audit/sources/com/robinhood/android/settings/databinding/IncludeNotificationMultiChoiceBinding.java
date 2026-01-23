package com.robinhood.android.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.settings.C28315R;
import com.robinhood.android.settings.p254ui.notification.NotificationMultiChoiceView;

/* loaded from: classes5.dex */
public final class IncludeNotificationMultiChoiceBinding implements ViewBinding {
    private final NotificationMultiChoiceView rootView;

    private IncludeNotificationMultiChoiceBinding(NotificationMultiChoiceView notificationMultiChoiceView) {
        this.rootView = notificationMultiChoiceView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NotificationMultiChoiceView getRoot() {
        return this.rootView;
    }

    public static IncludeNotificationMultiChoiceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNotificationMultiChoiceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28315R.layout.include_notification_multi_choice, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNotificationMultiChoiceBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNotificationMultiChoiceBinding((NotificationMultiChoiceView) view);
    }
}
