package com.robinhood.android.settings.extensions;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationChannelCompat;
import androidx.core.app.NotificationManagerCompat;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.notifications.Channels;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationManagers.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0005¨\u0006\b"}, m3636d2 = {"getContactChannelOrDefault", "Landroidx/core/app/NotificationChannelCompat;", "Landroidx/core/app/NotificationManagerCompat;", "isSystemPushOrContactChannelEnabled", "", "Landroid/content/Context;", "getSystemPushOrContactChannelSettingsIntent", "Landroid/content/Intent;", "feature-lib-settings_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.extensions.NotificationManagersKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class NotificationManagers {
    public static final NotificationChannelCompat getContactChannelOrDefault(NotificationManagerCompat notificationManagerCompat) {
        Intrinsics.checkNotNullParameter(notificationManagerCompat, "<this>");
        NotificationChannelCompat notificationChannelCompat = notificationManagerCompat.getNotificationChannelCompat(Channels.CUSTOMER_SUPPORT.getId());
        if (notificationChannelCompat != null) {
            return notificationChannelCompat;
        }
        NotificationChannelCompat notificationChannelCompat2 = notificationManagerCompat.getNotificationChannelCompat(Channels.DEFAULT.getId());
        Intrinsics.checkNotNull(notificationChannelCompat2);
        return notificationChannelCompat2;
    }

    public static final boolean isSystemPushOrContactChannelEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (Build.VERSION.SDK_INT >= 26) {
            return ContextSystemServices.getNotificationManager(context).areNotificationsEnabled() && getContactChannelOrDefault(ContextSystemServices.getNotificationManager(context)).getImportance() != 0;
        }
        return ContextSystemServices.getNotificationManager(context).areNotificationsEnabled();
    }

    public static final Intent getSystemPushOrContactChannelSettingsIntent(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && ContextSystemServices.getNotificationManager(context).areNotificationsEnabled()) {
            String id = getContactChannelOrDefault(ContextSystemServices.getNotificationManager(context)).getId();
            Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
            Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            intent.putExtra("android.provider.extra.CHANNEL_ID", id);
            return intent;
        }
        if (i >= 26) {
            Intent intent2 = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            intent2.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            return intent2;
        }
        Intent intent3 = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
        intent3.putExtra("app_package", context.getPackageName());
        intent3.putExtra("app_uid", context.getApplicationInfo().uid);
        return intent3;
    }
}
