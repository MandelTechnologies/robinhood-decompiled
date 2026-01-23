package com.robinhood.android.systemnotifications.p259di;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.systemnotifications.content.DefaultNotificationContentHandler;
import com.robinhood.android.util.notification.content.NotificationContentHandler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SystemNotificationsModule_ProvideDefaultNotificationContentHandlerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/systemnotifications/di/SystemNotificationsModule_ProvideDefaultNotificationContentHandlerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/util/notification/content/NotificationContentHandler;", "handler", "Ljavax/inject/Provider;", "Lcom/robinhood/android/systemnotifications/content/DefaultNotificationContentHandler;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-system-notifications_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.systemnotifications.di.SystemNotificationsModule_ProvideDefaultNotificationContentHandlerFactory */
/* loaded from: classes20.dex */
public final class C29227xc9f504d4 implements Factory<NotificationContentHandler> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<DefaultNotificationContentHandler> handler;

    @JvmStatic
    public static final C29227xc9f504d4 create(Provider<DefaultNotificationContentHandler> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final NotificationContentHandler provideDefaultNotificationContentHandler(DefaultNotificationContentHandler defaultNotificationContentHandler) {
        return INSTANCE.provideDefaultNotificationContentHandler(defaultNotificationContentHandler);
    }

    public C29227xc9f504d4(Provider<DefaultNotificationContentHandler> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.handler = handler;
    }

    @Override // javax.inject.Provider
    public NotificationContentHandler get() {
        Companion companion = INSTANCE;
        DefaultNotificationContentHandler defaultNotificationContentHandler = this.handler.get();
        Intrinsics.checkNotNullExpressionValue(defaultNotificationContentHandler, "get(...)");
        return companion.provideDefaultNotificationContentHandler(defaultNotificationContentHandler);
    }

    /* compiled from: SystemNotificationsModule_ProvideDefaultNotificationContentHandlerFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/systemnotifications/di/SystemNotificationsModule_ProvideDefaultNotificationContentHandlerFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/systemnotifications/di/SystemNotificationsModule_ProvideDefaultNotificationContentHandlerFactory;", "handler", "Ljavax/inject/Provider;", "Lcom/robinhood/android/systemnotifications/content/DefaultNotificationContentHandler;", "provideDefaultNotificationContentHandler", "Lcom/robinhood/android/util/notification/content/NotificationContentHandler;", "lib-system-notifications_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.systemnotifications.di.SystemNotificationsModule_ProvideDefaultNotificationContentHandlerFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C29227xc9f504d4 create(Provider<DefaultNotificationContentHandler> handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new C29227xc9f504d4(handler);
        }

        @JvmStatic
        public final NotificationContentHandler provideDefaultNotificationContentHandler(DefaultNotificationContentHandler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Object objCheckNotNull = Preconditions.checkNotNull(SystemNotificationsModule.INSTANCE.provideDefaultNotificationContentHandler(handler), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (NotificationContentHandler) objCheckNotNull;
        }
    }
}
