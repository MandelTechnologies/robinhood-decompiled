package com.robinhood.android.util.notification;

import com.robinhood.android.common.notification.NotificationManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.RhProcessLifecycleOwner;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NotificationCancelBroadcastReceiver_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/util/notification/NotificationCancelBroadcastReceiver_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/util/notification/NotificationCancelBroadcastReceiver;", "notificationManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/notification/NotificationManager;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-system-notifications-base_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class NotificationCancelBroadcastReceiver_MembersInjector implements MembersInjector<NotificationCancelBroadcastReceiver> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<NotificationManager> notificationManager;
    private final Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner;

    @JvmStatic
    public static final MembersInjector<NotificationCancelBroadcastReceiver> create(Provider<NotificationManager> provider, Provider<RhProcessLifecycleOwner> provider2, Provider<CoroutineScope> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    @RootCoroutineScope
    public static final void injectCoroutineScope(NotificationCancelBroadcastReceiver notificationCancelBroadcastReceiver, CoroutineScope coroutineScope) {
        INSTANCE.injectCoroutineScope(notificationCancelBroadcastReceiver, coroutineScope);
    }

    @JvmStatic
    public static final void injectNotificationManager(NotificationCancelBroadcastReceiver notificationCancelBroadcastReceiver, NotificationManager notificationManager) {
        INSTANCE.injectNotificationManager(notificationCancelBroadcastReceiver, notificationManager);
    }

    @JvmStatic
    public static final void injectRhProcessLifecycleOwner(NotificationCancelBroadcastReceiver notificationCancelBroadcastReceiver, RhProcessLifecycleOwner rhProcessLifecycleOwner) {
        INSTANCE.injectRhProcessLifecycleOwner(notificationCancelBroadcastReceiver, rhProcessLifecycleOwner);
    }

    public NotificationCancelBroadcastReceiver_MembersInjector(Provider<NotificationManager> notificationManager, Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner, Provider<CoroutineScope> coroutineScope) {
        Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.notificationManager = notificationManager;
        this.rhProcessLifecycleOwner = rhProcessLifecycleOwner;
        this.coroutineScope = coroutineScope;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(NotificationCancelBroadcastReceiver instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        NotificationManager notificationManager = this.notificationManager.get();
        Intrinsics.checkNotNullExpressionValue(notificationManager, "get(...)");
        companion.injectNotificationManager(instance, notificationManager);
        RhProcessLifecycleOwner rhProcessLifecycleOwner = this.rhProcessLifecycleOwner.get();
        Intrinsics.checkNotNullExpressionValue(rhProcessLifecycleOwner, "get(...)");
        companion.injectRhProcessLifecycleOwner(instance, rhProcessLifecycleOwner);
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        companion.injectCoroutineScope(instance, coroutineScope);
    }

    /* compiled from: NotificationCancelBroadcastReceiver_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/util/notification/NotificationCancelBroadcastReceiver_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/util/notification/NotificationCancelBroadcastReceiver;", "notificationManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/notification/NotificationManager;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "injectNotificationManager", "", "instance", "injectRhProcessLifecycleOwner", "injectCoroutineScope", "lib-system-notifications-base_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<NotificationCancelBroadcastReceiver> create(Provider<NotificationManager> notificationManager, Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner, Provider<CoroutineScope> coroutineScope) {
            Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
            Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            return new NotificationCancelBroadcastReceiver_MembersInjector(notificationManager, rhProcessLifecycleOwner, coroutineScope);
        }

        @JvmStatic
        public final void injectNotificationManager(NotificationCancelBroadcastReceiver instance, NotificationManager notificationManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
            instance.setNotificationManager(notificationManager);
        }

        @JvmStatic
        public final void injectRhProcessLifecycleOwner(NotificationCancelBroadcastReceiver instance, RhProcessLifecycleOwner rhProcessLifecycleOwner) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
            instance.setRhProcessLifecycleOwner(rhProcessLifecycleOwner);
        }

        @JvmStatic
        @RootCoroutineScope
        public final void injectCoroutineScope(NotificationCancelBroadcastReceiver instance, CoroutineScope coroutineScope) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            instance.setCoroutineScope(coroutineScope);
        }
    }
}
