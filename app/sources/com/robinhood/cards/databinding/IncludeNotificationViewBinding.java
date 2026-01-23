package com.robinhood.cards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.card.RdsCardView;
import com.robinhood.cards.C31879R;
import com.robinhood.shared.cards.NotificationView;

/* loaded from: classes3.dex */
public final class IncludeNotificationViewBinding implements ViewBinding {
    public final RdsCardView notificationviewCard;
    private final NotificationView rootView;

    private IncludeNotificationViewBinding(NotificationView notificationView, RdsCardView rdsCardView) {
        this.rootView = notificationView;
        this.notificationviewCard = rdsCardView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NotificationView getRoot() {
        return this.rootView;
    }

    public static IncludeNotificationViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNotificationViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31879R.layout.include_notification_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNotificationViewBinding bind(View view) {
        int i = C31879R.id.notificationview_card;
        RdsCardView rdsCardView = (RdsCardView) ViewBindings.findChildViewById(view, i);
        if (rdsCardView != null) {
            return new IncludeNotificationViewBinding((NotificationView) view, rdsCardView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
