package com.robinhood.android.systemnotifications.p259di;

import com.robinhood.android.common.notification.NotificationManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.util.notification.RhNotificationManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SystemNotificationsModule_ProvideNotificationManagerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/systemnotifications/di/SystemNotificationsModule_ProvideNotificationManagerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/notification/NotificationManager;", "notificationManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/util/notification/RhNotificationManager;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-system-notifications_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SystemNotificationsModule_ProvideNotificationManagerFactory implements Factory<NotificationManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<RhNotificationManager> notificationManager;

    @JvmStatic
    public static final SystemNotificationsModule_ProvideNotificationManagerFactory create(Provider<RhNotificationManager> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final NotificationManager provideNotificationManager(RhNotificationManager rhNotificationManager) {
        return INSTANCE.provideNotificationManager(rhNotificationManager);
    }

    public SystemNotificationsModule_ProvideNotificationManagerFactory(Provider<RhNotificationManager> notificationManager) {
        Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        this.notificationManager = notificationManager;
    }

    @Override // javax.inject.Provider
    public NotificationManager get() {
        Companion companion = INSTANCE;
        RhNotificationManager rhNotificationManager = this.notificationManager.get();
        Intrinsics.checkNotNullExpressionValue(rhNotificationManager, "get(...)");
        return companion.provideNotificationManager(rhNotificationManager);
    }

    /* compiled from: SystemNotificationsModule_ProvideNotificationManagerFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/systemnotifications/di/SystemNotificationsModule_ProvideNotificationManagerFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/systemnotifications/di/SystemNotificationsModule_ProvideNotificationManagerFactory;", "notificationManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/util/notification/RhNotificationManager;", "provideNotificationManager", "Lcom/robinhood/android/common/notification/NotificationManager;", "lib-system-notifications_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SystemNotificationsModule_ProvideNotificationManagerFactory create(Provider<RhNotificationManager> notificationManager) {
            Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
            return new SystemNotificationsModule_ProvideNotificationManagerFactory(notificationManager);
        }

        @JvmStatic
        public final NotificationManager provideNotificationManager(RhNotificationManager notificationManager) {
            Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
            Object objCheckNotNull = Preconditions.checkNotNull(SystemNotificationsModule.INSTANCE.provideNotificationManager(notificationManager), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (NotificationManager) objCheckNotNull;
        }
    }
}
