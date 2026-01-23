package com.robinhood.android.systemnotifications.p259di;

import android.content.SharedPreferences;
import com.robinhood.android.common.notification.NotificationManager;
import com.robinhood.android.common.notification.actions.NotificationActionParser;
import com.robinhood.android.common.util.GcmManager;
import com.robinhood.android.common.util.lifecycle.MainTabActivityListener;
import com.robinhood.android.systemnotifications.DefaultGcmManager;
import com.robinhood.android.systemnotifications.content.DefaultNotificationContentHandler;
import com.robinhood.android.systemnotifications.content.actions.DefaultNotificationActionParser;
import com.robinhood.android.systemnotifications.prefs.NotificationChannelListUpdatedAtTimePref;
import com.robinhood.android.util.notification.RhNotificationManager;
import com.robinhood.android.util.notification.content.NotificationContentHandler;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SystemNotificationsModule.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/systemnotifications/di/SystemNotificationsModule;", "", "<init>", "()V", "provideDefaultGcmManager", "Lcom/robinhood/android/common/util/GcmManager;", "gcmManager", "Lcom/robinhood/android/systemnotifications/DefaultGcmManager;", "provideDefaultNotificationContentHandler", "Lcom/robinhood/android/util/notification/content/NotificationContentHandler;", "handler", "Lcom/robinhood/android/systemnotifications/content/DefaultNotificationContentHandler;", "provideLastChannelUpdateTimePref", "Lcom/robinhood/prefs/LongPreference;", "preferences", "Landroid/content/SharedPreferences;", "provideRhMainTabActivityListener", "Lcom/robinhood/android/common/util/lifecycle/MainTabActivityListener;", "provideNotificationManager", "Lcom/robinhood/android/common/notification/NotificationManager;", "notificationManager", "Lcom/robinhood/android/util/notification/RhNotificationManager;", "provideNotificationActionParser", "Lcom/robinhood/android/common/notification/actions/NotificationActionParser;", "resolver", "Lcom/robinhood/android/systemnotifications/content/actions/DefaultNotificationActionParser;", "lib-system-notifications_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SystemNotificationsModule {
    public static final SystemNotificationsModule INSTANCE = new SystemNotificationsModule();

    public final GcmManager provideDefaultGcmManager(DefaultGcmManager gcmManager) {
        Intrinsics.checkNotNullParameter(gcmManager, "gcmManager");
        return gcmManager;
    }

    public final NotificationContentHandler provideDefaultNotificationContentHandler(DefaultNotificationContentHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return handler;
    }

    public final NotificationActionParser provideNotificationActionParser(DefaultNotificationActionParser resolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return resolver;
    }

    public final NotificationManager provideNotificationManager(RhNotificationManager notificationManager) {
        Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        return notificationManager;
    }

    public final MainTabActivityListener provideRhMainTabActivityListener(DefaultGcmManager gcmManager) {
        Intrinsics.checkNotNullParameter(gcmManager, "gcmManager");
        return gcmManager;
    }

    private SystemNotificationsModule() {
    }

    @NotificationChannelListUpdatedAtTimePref
    public final LongPreference provideLastChannelUpdateTimePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new LongPreference(preferences, "lastChannelUpdateTime", 0L, 4, null);
    }
}
