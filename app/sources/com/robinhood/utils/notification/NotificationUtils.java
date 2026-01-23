package com.robinhood.utils.notification;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationManagerCompat;
import com.robinhood.utils.extensions.ContextSystemServices;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NotificationUtils.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\b\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u001a&\u0010\b\u001a\u00020\u0006*\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000e"}, m3636d2 = {"getDisabledSystemNotificationOrChannelSettingsIntent", "Landroid/content/Intent;", "Landroid/content/Context;", "channelId", "", "isSystemNotificationOrChannelSettingsEnabled", "", "Landroidx/core/app/NotificationManagerCompat;", "notifyIfPossible", "id", "", "notification", "Landroid/app/Notification;", "tag", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.notification.NotificationUtilsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class NotificationUtils {
    public static final Intent getDisabledSystemNotificationOrChannelSettingsIntent(Context context, String channelId) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && ContextSystemServices.getNotificationManager(context).areNotificationsEnabled()) {
            Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            intent.putExtra("android.provider.extra.CHANNEL_ID", channelId);
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

    public static final boolean isSystemNotificationOrChannelSettingsEnabled(NotificationManagerCompat notificationManagerCompat, String channelId) {
        NotificationChannel notificationChannel;
        Intrinsics.checkNotNullParameter(notificationManagerCompat, "<this>");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        if (Build.VERSION.SDK_INT >= 26) {
            return (!notificationManagerCompat.areNotificationsEnabled() || (notificationChannel = notificationManagerCompat.getNotificationChannel(channelId)) == null || notificationChannel.getImportance() == 0) ? false : true;
        }
        return notificationManagerCompat.areNotificationsEnabled();
    }

    @SuppressLint({"MissingPermission"})
    public static final boolean notifyIfPossible(NotificationManagerCompat notificationManagerCompat, int i, Notification notification) {
        Intrinsics.checkNotNullParameter(notificationManagerCompat, "<this>");
        Intrinsics.checkNotNullParameter(notification, "notification");
        return notifyIfPossible(notificationManagerCompat, null, i, notification);
    }

    @SuppressLint({"MissingPermission"})
    public static final boolean notifyIfPossible(NotificationManagerCompat notificationManagerCompat, String str, int i, Notification notification) {
        Intrinsics.checkNotNullParameter(notificationManagerCompat, "<this>");
        Intrinsics.checkNotNullParameter(notification, "notification");
        if (!notificationManagerCompat.areNotificationsEnabled()) {
            return false;
        }
        notificationManagerCompat.notify(str, i, notification);
        return true;
    }
}
