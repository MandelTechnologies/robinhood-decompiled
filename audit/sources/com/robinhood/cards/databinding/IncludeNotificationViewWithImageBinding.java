package com.robinhood.cards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.card.RdsCardView;
import com.robinhood.cards.C31879R;
import com.robinhood.shared.cards.NotificationViewWithImage;

/* loaded from: classes3.dex */
public final class IncludeNotificationViewWithImageBinding implements ViewBinding {
    public final Space notificationViewContentPadding;
    public final ImageView notificationViewImage;
    public final RdsCardView notificationviewCard;
    private final NotificationViewWithImage rootView;

    private IncludeNotificationViewWithImageBinding(NotificationViewWithImage notificationViewWithImage, Space space, ImageView imageView, RdsCardView rdsCardView) {
        this.rootView = notificationViewWithImage;
        this.notificationViewContentPadding = space;
        this.notificationViewImage = imageView;
        this.notificationviewCard = rdsCardView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NotificationViewWithImage getRoot() {
        return this.rootView;
    }

    public static IncludeNotificationViewWithImageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNotificationViewWithImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31879R.layout.include_notification_view_with_image, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNotificationViewWithImageBinding bind(View view) {
        int i = C31879R.id.notification_view_content_padding;
        Space space = (Space) ViewBindings.findChildViewById(view, i);
        if (space != null) {
            i = C31879R.id.notification_view_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C31879R.id.notificationview_card;
                RdsCardView rdsCardView = (RdsCardView) ViewBindings.findChildViewById(view, i);
                if (rdsCardView != null) {
                    return new IncludeNotificationViewWithImageBinding((NotificationViewWithImage) view, space, imageView, rdsCardView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
