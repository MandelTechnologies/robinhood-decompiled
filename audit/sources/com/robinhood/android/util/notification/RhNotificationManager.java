package com.robinhood.android.util.notification;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.common.notification.NotificationManager;
import com.robinhood.android.common.notification.RhNotificationAction;
import com.robinhood.android.common.util.Compat;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.DeepLinkOrigin;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.util.collections.WeakHashSet;
import com.robinhood.android.util.notification.content.AppSpecificNotificationContent;
import com.robinhood.android.util.notification.content.NotificationContentHandler;
import com.robinhood.android.util.notification.content.StackInfo;
import com.robinhood.android.util.notification.content.StackableNotification;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.notification.NotificationUtils;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;

/* compiled from: RhNotificationManager.kt */
@Metadata(m3635d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 P2\u00020\u0001:\u0001PB!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0012H\u0016J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0012H\u0016J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0016H\u0016J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2\u0006\u0010%\u001a\u00020\fH\u0016J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0017J\u009a\u0001\u0010'\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2\b\u0010(\u001a\u0004\u0018\u00010\f2\u0006\u0010)\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\f2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u00010\f2\b\u00101\u001a\u0004\u0018\u00010\f2\b\u00102\u001a\u0004\u0018\u00010\f2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f042\f\u00105\u001a\b\u0012\u0004\u0012\u00020706H\u0096@¢\u0006\u0002\u00108J\u001e\u00109\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2\u0006\u0010:\u001a\u00020;H\u0096@¢\u0006\u0002\u0010<J\u0018\u0010=\u001a\u00020>2\u0006\u0010/\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0002JZ\u0010?\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000e062\u0006\u0010,\u001a\u00020-2\u0006\u0010%\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u00010\f2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f04H\u0082@¢\u0006\u0002\u0010AJB\u0010B\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020;2\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00020\f0Dj\b\u0012\u0004\u0012\u00020\f`E2\u0006\u0010/\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010\f2\u0006\u0010)\u001a\u00020\fH\u0002J\u009a\u0001\u0010F\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2\b\u0010(\u001a\u0004\u0018\u00010\f2\u0006\u0010)\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\f2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u00010\f2\b\u00101\u001a\u0004\u0018\u00010\f2\b\u00102\u001a\u0004\u0018\u00010\f2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f042\f\u00105\u001a\b\u0012\u0004\u0012\u00020706H\u0082@¢\u0006\u0002\u00108J\u001a\u0010G\u001a\u00020H*\u00020H2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020J06H\u0002JD\u0010K\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020;2\u0006\u0010%\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u00152\b\u0010(\u001a\u0004\u0018\u00010\f2\u0006\u0010)\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\fH\u0002J\u0018\u0010L\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020;2\u0006\u0010$\u001a\u00020\u0016H\u0002J\u0084\u0001\u0010'\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2\u0006\u0010M\u001a\u00020N2\u0006\u0010.\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010\f2\u0006\u0010)\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\f2\u0006\u0010O\u001a\u00020>2\b\u00101\u001a\u0004\u0018\u00010\f2\b\u00102\u001a\u0004\u0018\u00010\f2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f04H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R6\u0010\n\u001a*\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bj\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/android/util/notification/RhNotificationManager;", "Lcom/robinhood/android/common/notification/NotificationManager;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "contentHandler", "Lcom/robinhood/android/util/notification/content/NotificationContentHandler;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/android/util/notification/content/NotificationContentHandler;Lcom/robinhood/android/navigation/Navigator;)V", "notificationStacks", "Ljava/util/HashMap;", "", "", "Lcom/robinhood/android/util/notification/content/StackableNotification;", "Lkotlin/collections/HashMap;", "interceptors", "Lcom/robinhood/android/util/collections/WeakHashSet;", "Lcom/robinhood/android/common/notification/NotificationManager$Interceptor;", "activeNotifications", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Landroid/net/Uri;", "getActiveNotifications$lib_system_notifications_base_externalDebug$annotations", "()V", "getActiveNotifications$lib_system_notifications_base_externalDebug", "()Ljava/util/concurrent/ConcurrentHashMap;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "addInterceptor", "", "interceptor", "removeInterceptor", "cancelNotifications", "context", "Landroid/content/Context;", "uri", "uuid", "initNotificationChannels", "showNotification", "title", CarResultComposable2.BODY, "expandedBodyOverride", "url", "timestamp", "", RhNotificationManager.EXTRA_NOTIFICATION_ID, "type", "channel", "poBox", RhGcmListenerService.EXTRA_CATEGORY, WebsocketGatewayConstants.DATA_KEY, "", "notificationActions", "", "Lcom/robinhood/android/common/notification/RhNotificationAction;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onNotificationDismissed", "intent", "Landroid/content/Intent;", "(Landroid/content/Context;Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stackTypeContainsUuid", "", "showStackedNotification", "stack", "(Landroid/content/Context;Ljava/util/List;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "configureIntentForStack", "uuids", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "showSingleNotification", "addActions", "Landroidx/core/app/NotificationCompat$Builder;", "actions", "Landroidx/core/app/NotificationCompat$Action;", "configureIntentForSingle", "addDataValueToIntentIfMissing", "notification", "Landroid/app/Notification;", "stacked", "Companion", "lib-system-notifications-base_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class RhNotificationManager implements NotificationManager {
    private static final String EXTRA_FROM_NOTIFICATION = "fromNotification";
    private static final String EXTRA_NOTIFICATION_BODY = "notificationBody";
    private static final String EXTRA_NOTIFICATION_EXPANDED_BODY = "notificationExpandedBody";
    private static final String EXTRA_NOTIFICATION_ID = "notificationId";
    private static final String EXTRA_NOTIFICATION_PO_BOX = "notificationPoBox";
    private static final String EXTRA_NOTIFICATION_TITLE = "notificationTitle";
    private static final String EXTRA_NOTIFICATION_TYPE = "type";
    private static final String EXTRA_NOTIFICATION_UUID = "notificationUuid";
    private static final String EXTRA_STACKED_NOTIFICATION_UUIDS = "stackedNotificationUuids";
    private static final String NOTIFICATION_CARD_IDENTIFIER = "default";
    private static final int PENDING_INTENT_FLAGS = 201326592;
    private final ConcurrentHashMap<Integer, Uri> activeNotifications;
    private final AnalyticsLogger analytics;
    private final NotificationContentHandler contentHandler;
    private final WeakHashSet<NotificationManager.Interceptor> interceptors;
    private final Mutex mutex;
    private final Navigator navigator;
    private final HashMap<String, List<StackableNotification>> notificationStacks;

    /* compiled from: RhNotificationManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.util.notification.RhNotificationManager", m3645f = "RhNotificationManager.kt", m3646l = {568}, m3647m = "onNotificationDismissed")
    /* renamed from: com.robinhood.android.util.notification.RhNotificationManager$onNotificationDismissed$1 */
    /* loaded from: classes9.dex */
    static final class C313631 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C313631(Continuation<? super C313631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RhNotificationManager.this.onNotificationDismissed(null, null, this);
        }
    }

    /* compiled from: RhNotificationManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.util.notification.RhNotificationManager", m3645f = "RhNotificationManager.kt", m3646l = {568, 120, 125, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE}, m3647m = "showNotification")
    /* renamed from: com.robinhood.android.util.notification.RhNotificationManager$showNotification$1 */
    /* loaded from: classes9.dex */
    static final class C313641 extends ContinuationImpl {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        C313641(Continuation<? super C313641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RhNotificationManager.this.showNotification(null, null, null, null, null, 0L, 0, null, null, null, null, null, null, null, this);
        }
    }

    /* compiled from: RhNotificationManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.util.notification.RhNotificationManager", m3645f = "RhNotificationManager.kt", m3646l = {358, 399}, m3647m = "showSingleNotification")
    /* renamed from: com.robinhood.android.util.notification.RhNotificationManager$showSingleNotification$1 */
    /* loaded from: classes9.dex */
    static final class C313651 extends ContinuationImpl {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
        Object L$15;
        Object L$16;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        C313651(Continuation<? super C313651> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RhNotificationManager.this.showSingleNotification(null, null, null, null, null, 0L, 0, null, null, null, null, null, null, null, this);
        }
    }

    /* compiled from: RhNotificationManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.util.notification.RhNotificationManager", m3645f = "RhNotificationManager.kt", m3646l = {271}, m3647m = "showStackedNotification")
    /* renamed from: com.robinhood.android.util.notification.RhNotificationManager$showStackedNotification$1 */
    /* loaded from: classes9.dex */
    static final class C313661 extends ContinuationImpl {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        C313661(Continuation<? super C313661> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RhNotificationManager.this.showStackedNotification(null, null, 0L, null, null, null, null, this);
        }
    }

    /* renamed from: getActiveNotifications$lib_system_notifications_base_externalDebug$annotations */
    public static /* synthetic */ void m2570x690ed30f() {
    }

    public RhNotificationManager(AnalyticsLogger analytics, NotificationContentHandler contentHandler, Navigator navigator) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(contentHandler, "contentHandler");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.analytics = analytics;
        this.contentHandler = contentHandler;
        this.navigator = navigator;
        this.notificationStacks = new HashMap<>();
        this.interceptors = new WeakHashSet<>();
        this.activeNotifications = new ConcurrentHashMap<>();
        this.mutex = Mutex3.Mutex$default(false, 1, null);
    }

    /* renamed from: getActiveNotifications$lib_system_notifications_base_externalDebug */
    public final ConcurrentHashMap<Integer, Uri> m2571x8360350f() {
        return this.activeNotifications;
    }

    @Override // com.robinhood.android.common.notification.NotificationManager
    public void addInterceptor(NotificationManager.Interceptor interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        synchronized (this.interceptors) {
            this.interceptors.add(interceptor);
        }
    }

    @Override // com.robinhood.android.common.notification.NotificationManager
    public void removeInterceptor(NotificationManager.Interceptor interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        synchronized (this.interceptors) {
            this.interceptors.remove(interceptor);
        }
    }

    @Override // com.robinhood.android.common.notification.NotificationManager
    public void cancelNotifications(Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        NotificationManagerCompat notificationManager = ContextSystemServices.getNotificationManager(context);
        Iterator<Map.Entry<Integer, Uri>> it = this.activeNotifications.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Uri> next = it.next();
            int iIntValue = next.getKey().intValue();
            if (Intrinsics.areEqual(uri, next.getValue())) {
                notificationManager.cancel(iIntValue);
                it.remove();
            }
        }
    }

    @Override // com.robinhood.android.common.notification.NotificationManager
    public void cancelNotifications(Context context, String uuid) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        NotificationManagerCompat notificationManager = ContextSystemServices.getNotificationManager(context);
        int iGenerateNotificationId = NotificationManager.INSTANCE.generateNotificationId(uuid);
        Iterator<Map.Entry<Integer, Uri>> it = this.activeNotifications.entrySet().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().getKey().intValue();
            if (iGenerateNotificationId == iIntValue) {
                notificationManager.cancel(iIntValue);
                it.remove();
            }
        }
    }

    @Override // com.robinhood.android.common.notification.NotificationManager
    @TargetApi(26)
    public void initNotificationChannels(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Compat.INSTANCE.isApiSupported(26)) {
            this.contentHandler.setUpNotificationChannels(context);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.robinhood.android.util.notification.RhNotificationManager$showNotification$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.robinhood.android.util.notification.RhNotificationManager] */
    /* JADX WARN: Type inference failed for: r8v5, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // com.robinhood.android.common.notification.NotificationManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object showNotification(Context context, String str, String str2, String str3, String str4, long j, int i, String str5, String str6, String str7, String str8, String str9, Map<String, String> map, List<RhNotificationAction> list, Continuation<? super Unit> continuation) throws Throwable {
        Continuation c313641;
        Context context2;
        String str10;
        String str11;
        String str12;
        List<RhNotificationAction> list2;
        String str13;
        Map<String, String> map2;
        long j2;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        int i2;
        String str19;
        if (continuation instanceof C313641) {
            C313641 c3136412 = (C313641) continuation;
            int i3 = c3136412.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3136412.label = i3 - Integer.MIN_VALUE;
                c313641 = c3136412;
            } else {
                c313641 = new C313641(continuation);
            }
        }
        Object obj = c313641.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c313641.label;
        try {
            try {
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ?? r0 = this.mutex;
                    c313641.L$0 = context;
                    c313641.L$1 = str;
                    c313641.L$2 = str2;
                    c313641.L$3 = str3;
                    c313641.L$4 = str4;
                    c313641.L$5 = str5;
                    c313641.L$6 = str6;
                    c313641.L$7 = str7;
                    c313641.L$8 = str8;
                    c313641.L$9 = str9;
                    c313641.L$10 = map;
                    c313641.L$11 = list;
                    c313641.L$12 = r0;
                    c313641.J$0 = j;
                    c313641.I$0 = i;
                    c313641.label = 1;
                    if (r0.lock(null, c313641) != coroutine_suspended) {
                        context2 = context;
                        str10 = r0;
                        str11 = str2;
                        str12 = str3;
                        list2 = list;
                        str13 = str4;
                        map2 = map;
                        j2 = j;
                        str14 = str9;
                        str15 = str8;
                        str16 = str7;
                        str17 = str6;
                        str18 = str5;
                        i2 = i;
                    }
                    return coroutine_suspended;
                }
                if (i4 != 1) {
                    if (i4 != 2 && i4 != 3 && i4 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c313641 = (Mutex) c313641.L$0;
                    ResultKt.throwOnFailure(obj);
                    Unit unit = Unit.INSTANCE;
                    c313641.unlock(null);
                    return unit;
                }
                int i5 = c313641.I$0;
                long j3 = c313641.J$0;
                ?? r8 = (Mutex) c313641.L$12;
                List<RhNotificationAction> list3 = (List) c313641.L$11;
                Map<String, String> map3 = (Map) c313641.L$10;
                String str20 = (String) c313641.L$9;
                String str21 = (String) c313641.L$8;
                String str22 = (String) c313641.L$7;
                String str23 = (String) c313641.L$6;
                String str24 = (String) c313641.L$5;
                String str25 = (String) c313641.L$4;
                String str26 = (String) c313641.L$3;
                String str27 = (String) c313641.L$2;
                String str28 = (String) c313641.L$1;
                Context context3 = (Context) c313641.L$0;
                ResultKt.throwOnFailure(obj);
                str14 = str20;
                str15 = str21;
                context2 = context3;
                list2 = list3;
                map2 = map3;
                str16 = str22;
                str17 = str23;
                str12 = str26;
                str11 = str27;
                str = str28;
                i2 = i5;
                str18 = str24;
                str10 = r8;
                str13 = str25;
                j2 = j3;
                if (this.contentHandler.isStackable(str17)) {
                    try {
                        String str29 = str11;
                        String str30 = str12;
                        String str31 = str13;
                        int i6 = i2;
                        String str32 = str18;
                        String str33 = str15;
                        StackableNotification stackableNotification = new StackableNotification(str, str29, str30, i6, str32, str31, str33);
                        if (this.notificationStacks.containsKey(str17)) {
                            List<StackableNotification> list4 = this.notificationStacks.get(str17);
                            Intrinsics.checkNotNull(list4);
                            List<StackableNotification> list5 = list4;
                            list5.add(stackableNotification);
                            c313641.L$0 = str10;
                            c313641.L$1 = null;
                            c313641.L$2 = null;
                            c313641.L$3 = null;
                            c313641.L$4 = null;
                            c313641.L$5 = null;
                            c313641.L$6 = null;
                            c313641.L$7 = null;
                            c313641.L$8 = null;
                            c313641.L$9 = null;
                            c313641.L$10 = null;
                            c313641.L$11 = null;
                            c313641.L$12 = null;
                            c313641.label = 2;
                            try {
                                if (showStackedNotification(context2, list5, j2, str32, str17, str16, map2, c313641) != coroutine_suspended) {
                                    c313641 = str10;
                                }
                                return coroutine_suspended;
                            } catch (Throwable th) {
                                th = th;
                                c313641 = str10;
                                c313641.unlock(null);
                                throw th;
                            }
                        }
                        Map<String, String> map4 = map2;
                        Context context4 = context2;
                        this.notificationStacks.put(str17, CollectionsKt.mutableListOf(stackableNotification));
                        c313641.L$0 = str10;
                        c313641.L$1 = null;
                        c313641.L$2 = null;
                        c313641.L$3 = null;
                        c313641.L$4 = null;
                        c313641.L$5 = null;
                        c313641.L$6 = null;
                        c313641.L$7 = null;
                        c313641.L$8 = null;
                        c313641.L$9 = null;
                        c313641.L$10 = null;
                        c313641.L$11 = null;
                        c313641.L$12 = null;
                        c313641.label = 3;
                        Continuation continuation2 = c313641;
                        c313641 = str10;
                        str10 = str;
                        if (showSingleNotification(context4, str10, str29, str30, str31, j2, i6, str32, str17, str16, str33, str14, map4, list2, continuation2) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Unit unit2 = Unit.INSTANCE;
                        c313641.unlock(null);
                        return unit2;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    C313641 c3136413 = c313641;
                    c313641 = str10;
                    Map<String, String> map5 = map2;
                    String str34 = str;
                    Context context5 = context2;
                    try {
                        c3136413.L$0 = c313641;
                        str19 = c313641;
                    } catch (Throwable th3) {
                        th = th3;
                        c313641.unlock(null);
                        throw th;
                    }
                    try {
                        c3136413.L$1 = null;
                        c3136413.L$2 = null;
                        c3136413.L$3 = null;
                        c3136413.L$4 = null;
                        c3136413.L$5 = null;
                        c3136413.L$6 = null;
                        c3136413.L$7 = null;
                        c3136413.L$8 = null;
                        c3136413.L$9 = null;
                        c3136413.L$10 = null;
                        c3136413.L$11 = null;
                        c3136413.L$12 = null;
                        c3136413.label = 4;
                        if (showSingleNotification(context5, str34, str11, str12, str13, j2, i2, str18, str17, str16, str15, str14, map5, list2, c3136413) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c313641 = str19;
                        Unit unit22 = Unit.INSTANCE;
                        c313641.unlock(null);
                        return unit22;
                    } catch (Throwable th4) {
                        th = th4;
                        c313641 = str19;
                        c313641.unlock(null);
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                str19 = str10;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.robinhood.android.common.notification.NotificationManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onNotificationDismissed(Context context, Intent intent, Continuation<? super Unit> continuation) {
        C313631 c313631;
        Mutex mutex;
        Context context2;
        Intent intent2;
        String str;
        if (continuation instanceof C313631) {
            c313631 = (C313631) continuation;
            int i = c313631.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c313631.label = i - Integer.MIN_VALUE;
            } else {
                c313631 = new C313631(continuation);
            }
        }
        Object obj = c313631.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c313631.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Mutex mutex2 = this.mutex;
            c313631.L$0 = context;
            c313631.L$1 = intent;
            c313631.L$2 = mutex2;
            c313631.label = 1;
            if (mutex2.lock(null, c313631) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex = mutex2;
            context2 = context;
            intent2 = intent;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) c313631.L$2;
            intent2 = (Intent) c313631.L$1;
            context2 = (Context) c313631.L$0;
            ResultKt.throwOnFailure(obj);
        }
        try {
            if (intent2.getBooleanExtra(EXTRA_FROM_NOTIFICATION, false)) {
                String stringExtra = intent2.getStringExtra("type");
                Intrinsics.checkNotNull(stringExtra);
                String stringExtra2 = intent2.getStringExtra(EXTRA_NOTIFICATION_UUID);
                ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra(EXTRA_STACKED_NOTIFICATION_UUIDS);
                String stringExtra3 = intent2.getStringExtra(EXTRA_NOTIFICATION_TITLE);
                String stringExtra4 = intent2.getStringExtra(EXTRA_NOTIFICATION_BODY);
                String stringExtra5 = intent2.getStringExtra(EXTRA_NOTIFICATION_BODY);
                String stringExtra6 = intent2.getStringExtra(EXTRA_NOTIFICATION_PO_BOX);
                String stringExtra7 = intent2.getStringExtra(RhGcmListenerService.EXTRA_CATEGORY);
                if (stringExtra2 != null) {
                    str = "dismiss";
                } else {
                    str = AnalyticsStrings.PUSH_NOTIF_EVENT_DISMISS_STACKED;
                }
                String str2 = str;
                if (stringArrayListExtra != null) {
                    this.notificationStacks.remove(stringExtra);
                    Iterator<String> it = stringArrayListExtra.iterator();
                    Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                    while (it.hasNext()) {
                        String next = it.next();
                        AnalyticsLogger analyticsLogger = this.analytics;
                        Intrinsics.checkNotNull(next);
                        AnalyticsLogger.DefaultImpls.logPushNotification$default(analyticsLogger, str2, next, stringExtra, stringExtra3, stringExtra4, stringExtra5, stringExtra6, stringExtra7, null, 256, null);
                    }
                } else if (stringExtra2 != null) {
                    if (stackTypeContainsUuid(stringExtra, stringExtra2)) {
                        this.notificationStacks.remove(stringExtra);
                    }
                    AnalyticsLogger.DefaultImpls.logPushNotification$default(this.analytics, str2, stringExtra2, stringExtra, stringExtra3, stringExtra4, stringExtra5, stringExtra6, stringExtra7, null, 256, null);
                }
                int intExtra = intent2.getIntExtra(EXTRA_NOTIFICATION_ID, -1);
                ContextSystemServices.getNotificationManager(context2).cancel(intExtra);
                this.activeNotifications.remove(boxing.boxInt(intExtra));
            }
            Unit unit = Unit.INSTANCE;
            mutex.unlock(null);
            return unit;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }

    private final boolean stackTypeContainsUuid(String type2, String uuid) {
        List<StackableNotification> list = this.notificationStacks.get(type2);
        if (list == null) {
            return false;
        }
        List<StackableNotification> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(uuid, ((StackableNotification) it.next()).getUuid())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showStackedNotification(Context context, List<StackableNotification> list, long j, String str, String str2, String str3, Map<String, String> map, Continuation<? super Unit> continuation) throws Resources.NotFoundException {
        C313661 c313661;
        int i;
        Map<String, String> map2;
        String str4;
        String str5;
        String str6;
        Uri uri;
        NotificationCompat.InboxStyle inboxStyle;
        ArrayList<String> arrayList;
        Context context2;
        String str7;
        String str8;
        String str9;
        long j2;
        if (continuation instanceof C313661) {
            c313661 = (C313661) continuation;
            int i2 = c313661.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c313661.label = i2 - Integer.MIN_VALUE;
            } else {
                c313661 = new C313661(continuation);
            }
        }
        C313661 c3136612 = c313661;
        Object obj = c3136612.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c3136612.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            StackInfo stackInfo = this.contentHandler.getStackInfo(str2, list);
            Resources resources = context.getResources();
            String title = list.get(0).getTitle();
            int size = list.size();
            int i4 = 1;
            while (true) {
                if (i4 >= size) {
                    break;
                }
                if (!Intrinsics.areEqual(title, list.get(i4).getTitle())) {
                    title = resources.getString(stackInfo.getStackDefaultTitleResId());
                    break;
                }
                i4++;
            }
            int notificationId = list.get(0).getNotificationId();
            String string2 = resources.getString(stackInfo.getStackSummaryResId(), boxing.boxInt(list.size()));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            NotificationCompat.InboxStyle summaryText = new NotificationCompat.InboxStyle().setBigContentTitle(title).setSummaryText(string2);
            Intrinsics.checkNotNullExpressionValue(summaryText, "setSummaryText(...)");
            List<StackableNotification> list2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((StackableNotification) it.next()).getUuid());
            }
            ArrayList<String> arrayList3 = new ArrayList<>(arrayList2);
            String poBox = list.get(0).getPoBox();
            if (stackInfo.getShowOnlyMostRecent()) {
                StackableNotification stackableNotification = (StackableNotification) CollectionsKt.last((List) list);
                String expandedBodyOverride = stackableNotification.getExpandedBodyOverride();
                if (expandedBodyOverride == null) {
                    expandedBodyOverride = stackableNotification.getBody();
                }
                Intrinsics.checkNotNull(summaryText.addLine(expandedBodyOverride));
            } else {
                for (StackableNotification stackableNotification2 : list) {
                    String expandedBodyOverride2 = stackableNotification2.getExpandedBodyOverride();
                    if (expandedBodyOverride2 == null) {
                        expandedBodyOverride2 = stackableNotification2.getBody();
                    }
                    summaryText.addLine(expandedBodyOverride2);
                }
            }
            Uri uri2 = Uri.parse(stackInfo.getStackUrl());
            Navigator navigator = this.navigator;
            Intrinsics.checkNotNull(uri2);
            i = notificationId;
            String str10 = title;
            DeepLinkOrigin.Notification notification = new DeepLinkOrigin.Notification(str, str2, str10, string2, null, DeepLinkOrigin.Notification.Stacking.STACKED, poBox, null, "default", false, 512, null);
            c3136612.L$0 = context;
            c3136612.L$1 = str;
            c3136612.L$2 = str2;
            c3136612.L$3 = str3;
            c3136612.L$4 = map;
            c3136612.L$5 = str10;
            c3136612.L$6 = string2;
            c3136612.L$7 = summaryText;
            c3136612.L$8 = arrayList3;
            c3136612.L$9 = poBox;
            c3136612.L$10 = uri2;
            c3136612.J$0 = j;
            c3136612.I$0 = i;
            c3136612.label = 1;
            Object objResolveDeepLinkDirect$default = Navigator.DefaultImpls.resolveDeepLinkDirect$default(navigator, context, uri2, false, notification, false, true, c3136612, 20, null);
            if (objResolveDeepLinkDirect$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            map2 = map;
            str4 = poBox;
            str5 = string2;
            str6 = str2;
            obj = objResolveDeepLinkDirect$default;
            uri = uri2;
            inboxStyle = summaryText;
            arrayList = arrayList3;
            context2 = context;
            str7 = str;
            str8 = str3;
            str9 = str10;
            j2 = j;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = c3136612.I$0;
            j2 = c3136612.J$0;
            uri = (Uri) c3136612.L$10;
            String str11 = (String) c3136612.L$9;
            arrayList = (ArrayList) c3136612.L$8;
            inboxStyle = (NotificationCompat.InboxStyle) c3136612.L$7;
            String str12 = (String) c3136612.L$6;
            str9 = (String) c3136612.L$5;
            map2 = (Map) c3136612.L$4;
            str8 = (String) c3136612.L$3;
            str6 = (String) c3136612.L$2;
            str7 = (String) c3136612.L$1;
            Context context3 = (Context) c3136612.L$0;
            ResultKt.throwOnFailure(obj);
            str4 = str11;
            str5 = str12;
            i = i5;
            context2 = context3;
        }
        Intent[] intentArr = (Intent[]) obj;
        String str13 = str6;
        String str14 = str5;
        ArrayList<String> arrayList4 = arrayList;
        String str15 = str9;
        configureIntentForStack((Intent) ArraysKt.last(intentArr), arrayList4, str13, str15, str14);
        Intent intent = (Intent) ArraysKt.last(intentArr);
        Intrinsics.checkNotNull(uri);
        addDataValueToIntentIfMissing(intent, uri);
        String str16 = str7;
        PendingIntent activities = PendingIntent.getActivities(context2, 0, intentArr, PENDING_INTENT_FLAGS);
        Intent dismissIntent = NotificationCancelBroadcastReceiver.INSTANCE.getDismissIntent(context2);
        configureIntentForStack(dismissIntent, arrayList4, str13, str15, str14);
        PendingIntent broadcast = PendingIntent.getBroadcast(context2, 0, dismissIntent, PENDING_INTENT_FLAGS);
        AppSpecificNotificationContent appSpecificNotificationContentAppSpecificContent = this.contentHandler.appSpecificContent(context2, str8);
        Notification notificationBuild = new NotificationCompat.Builder(context2).setDefaults(-1).setShowWhen(true).setWhen(j2).setSmallIcon(C20690R.drawable.ic_rh_notification).setAutoCancel(true).setContentIntent(activities).setDeleteIntent(broadcast).setColor(ContextCompat.getColor(context2, appSpecificNotificationContentAppSpecificContent.getColor())).setStyle(inboxStyle).setContentTitle(str9).setContentText(str14).setChannelId(appSpecificNotificationContentAppSpecificContent.getChannelId()).build();
        Intrinsics.checkNotNullExpressionValue(notificationBuild, "build(...)");
        showNotification(context2, notificationBuild, i, str16, uri, str13, str9, str14, null, true, str4, null, map2);
        return Unit.INSTANCE;
    }

    private final void configureIntentForStack(Intent intent, ArrayList<String> uuids, String type2, String title, String body) {
        intent.putExtra(EXTRA_FROM_NOTIFICATION, true);
        intent.putExtra(EXTRA_STACKED_NOTIFICATION_UUIDS, uuids);
        intent.putExtra("type", type2);
        intent.putExtra(EXTRA_NOTIFICATION_TITLE, title);
        intent.putExtra(EXTRA_NOTIFICATION_BODY, body);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x02aa -> B:14:0x00a7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showSingleNotification(Context context, String str, String str2, String str3, String str4, long j, int i, String str5, String str6, String str7, String str8, String str9, Map<String, String> map, List<RhNotificationAction> list, Continuation<? super Unit> continuation) {
        C313651 c313651;
        String str10;
        String str11;
        String str12;
        int i2;
        String str13;
        String str14;
        String str15;
        String str16;
        Map<String, String> map2;
        List<RhNotificationAction> list2;
        Object obj;
        Uri uri;
        long j2;
        String str17;
        Context context2;
        String str18;
        String str19;
        RhNotificationManager rhNotificationManager;
        String str20;
        String str21;
        String str22;
        PendingIntent pendingIntent;
        Iterator it;
        ArrayList arrayList;
        Map<String, String> map3;
        Uri uri2;
        long j3;
        String str23;
        String str24;
        PendingIntent pendingIntent2;
        if (continuation instanceof C313651) {
            c313651 = (C313651) continuation;
            int i3 = c313651.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c313651.label = i3 - Integer.MIN_VALUE;
            } else {
                c313651 = new C313651(continuation);
            }
        }
        C313651 c3136512 = c313651;
        Object obj2 = c3136512.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c3136512.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj2);
            Uri uri3 = Uri.parse(str4);
            Navigator navigator = this.navigator;
            Intrinsics.checkNotNull(uri3);
            DeepLinkOrigin.Notification notification = new DeepLinkOrigin.Notification(str5, str6, str, str2, str3, DeepLinkOrigin.Notification.Stacking.UNSTACKED, str8, str9, "default", false, 512, null);
            c3136512.L$0 = context;
            c3136512.L$1 = str;
            c3136512.L$2 = str2;
            str10 = str3;
            c3136512.L$3 = str10;
            c3136512.L$4 = str5;
            c3136512.L$5 = str6;
            c3136512.L$6 = str7;
            c3136512.L$7 = str8;
            c3136512.L$8 = str9;
            c3136512.L$9 = map;
            c3136512.L$10 = list;
            c3136512.L$11 = uri3;
            c3136512.J$0 = j;
            c3136512.I$0 = i;
            c3136512.label = 1;
            Object objResolveDeepLinkDirect$default = Navigator.DefaultImpls.resolveDeepLinkDirect$default(navigator, context, uri3, false, notification, false, true, c3136512, 20, null);
            if (objResolveDeepLinkDirect$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            str11 = str2;
            str12 = str5;
            i2 = i;
            str13 = str6;
            str14 = str7;
            str15 = str8;
            str16 = str9;
            map2 = map;
            list2 = list;
            obj = objResolveDeepLinkDirect$default;
            uri = uri3;
            j2 = j;
            str17 = str;
            context2 = context;
        } else if (i4 == 1) {
            int i5 = c3136512.I$0;
            long j4 = c3136512.J$0;
            Uri uri4 = (Uri) c3136512.L$11;
            List<RhNotificationAction> list3 = (List) c3136512.L$10;
            map2 = (Map) c3136512.L$9;
            str16 = (String) c3136512.L$8;
            str15 = (String) c3136512.L$7;
            str14 = (String) c3136512.L$6;
            str13 = (String) c3136512.L$5;
            str12 = (String) c3136512.L$4;
            str10 = (String) c3136512.L$3;
            str11 = (String) c3136512.L$2;
            String str25 = (String) c3136512.L$1;
            context2 = (Context) c3136512.L$0;
            ResultKt.throwOnFailure(obj2);
            uri = uri4;
            obj = obj2;
            j2 = j4;
            list2 = list3;
            i2 = i5;
            str17 = str25;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = c3136512.I$0;
            long j5 = c3136512.J$0;
            ?? r6 = (Collection) c3136512.L$16;
            RhNotificationAction rhNotificationAction = (RhNotificationAction) c3136512.L$15;
            Iterator it2 = (Iterator) c3136512.L$14;
            ?? r9 = (Collection) c3136512.L$13;
            PendingIntent pendingIntent3 = (PendingIntent) c3136512.L$12;
            PendingIntent pendingIntent4 = (PendingIntent) c3136512.L$11;
            Uri uri5 = (Uri) c3136512.L$10;
            Map<String, String> map4 = (Map) c3136512.L$9;
            String str26 = (String) c3136512.L$8;
            String str27 = (String) c3136512.L$7;
            String str28 = (String) c3136512.L$6;
            String str29 = (String) c3136512.L$5;
            String str30 = (String) c3136512.L$4;
            String str31 = (String) c3136512.L$3;
            String str32 = (String) c3136512.L$2;
            String str33 = (String) c3136512.L$1;
            Context context3 = (Context) c3136512.L$0;
            ResultKt.throwOnFailure(obj2);
            String str34 = str30;
            String str35 = str31;
            String str36 = str32;
            arrayList = r9;
            C313651 c3136513 = c3136512;
            PendingIntent pendingIntent5 = pendingIntent4;
            RhNotificationAction rhNotificationAction2 = rhNotificationAction;
            Iterator it3 = it2;
            pendingIntent2 = pendingIntent3;
            str14 = str28;
            int i7 = i6;
            Object obj3 = coroutine_suspended;
            Context context4 = context3;
            Object obj4 = obj2;
            String str37 = str33;
            String str38 = str27;
            ArrayList arrayList2 = r6;
            long j6 = j5;
            String str39 = str29;
            arrayList2.add(new NotificationCompat.Action(rhNotificationAction2.getIcon(), rhNotificationAction2.getName(), PendingIntent.getActivities(context4, (int) System.currentTimeMillis(), (Intent[]) obj4, PENDING_INTENT_FLAGS)));
            str21 = str38;
            j3 = j6;
            context2 = context4;
            coroutine_suspended = obj3;
            i2 = i7;
            it = it3;
            uri2 = uri5;
            map3 = map4;
            str20 = str26;
            str18 = str37;
            str24 = str39;
            pendingIntent = pendingIntent5;
            str22 = str34;
            str19 = str35;
            str23 = str36;
            c3136512 = c3136513;
            rhNotificationManager = this;
            if (it.hasNext()) {
                String str40 = str18;
                RhNotificationAction rhNotificationAction3 = (RhNotificationAction) it.next();
                str29 = str24;
                Navigator navigator2 = rhNotificationManager.navigator;
                Uri deeplinkUri = rhNotificationAction3.getDeeplinkUri();
                String str41 = str22;
                String str42 = str19;
                String str43 = str23;
                DeepLinkOrigin.Notification notification2 = new DeepLinkOrigin.Notification(str41, str29, str40, str43, str42, DeepLinkOrigin.Notification.Stacking.UNSTACKED, str21, str20, rhNotificationAction3.getIdentifier(), true);
                int i8 = i2;
                long j7 = j3;
                str38 = str21;
                String str44 = str20;
                c3136512.L$0 = context2;
                c3136512.L$1 = str40;
                c3136512.L$2 = str43;
                c3136512.L$3 = str42;
                c3136512.L$4 = str41;
                c3136512.L$5 = str29;
                c3136512.L$6 = str14;
                c3136512.L$7 = str38;
                c3136512.L$8 = str44;
                c3136512.L$9 = map3;
                c3136512.L$10 = uri2;
                c3136512.L$11 = pendingIntent;
                c3136512.L$12 = pendingIntent2;
                c3136512.L$13 = arrayList;
                c3136512.L$14 = it;
                Context context5 = context2;
                c3136512.L$15 = rhNotificationAction3;
                c3136512.L$16 = arrayList;
                ArrayList arrayList3 = arrayList;
                c3136512.J$0 = j7;
                c3136512.I$0 = i8;
                c3136512.label = 2;
                c3136513 = c3136512;
                Object objResolveDeepLinkDirect$default2 = Navigator.DefaultImpls.resolveDeepLinkDirect$default(navigator2, context5, deeplinkUri, false, notification2, false, true, c3136513, 20, null);
                obj3 = coroutine_suspended;
                context4 = context5;
                if (objResolveDeepLinkDirect$default2 == obj3) {
                    return obj3;
                }
                str34 = str41;
                str36 = str43;
                str37 = str40;
                str35 = str42;
                pendingIntent5 = pendingIntent;
                arrayList2 = arrayList3;
                map4 = map3;
                str26 = str44;
                rhNotificationAction2 = rhNotificationAction3;
                uri5 = uri2;
                j6 = j7;
                obj4 = objResolveDeepLinkDirect$default2;
                arrayList = arrayList2;
                it3 = it;
                i7 = i8;
                String str392 = str29;
                arrayList2.add(new NotificationCompat.Action(rhNotificationAction2.getIcon(), rhNotificationAction2.getName(), PendingIntent.getActivities(context4, (int) System.currentTimeMillis(), (Intent[]) obj4, PENDING_INTENT_FLAGS)));
                str21 = str38;
                j3 = j6;
                context2 = context4;
                coroutine_suspended = obj3;
                i2 = i7;
                it = it3;
                uri2 = uri5;
                map3 = map4;
                str20 = str26;
                str18 = str37;
                str24 = str392;
                pendingIntent = pendingIntent5;
                str22 = str34;
                str19 = str35;
                str23 = str36;
                c3136512 = c3136513;
                rhNotificationManager = this;
                if (it.hasNext()) {
                    ArrayList arrayList4 = arrayList;
                    Context context6 = context2;
                    long j8 = j3;
                    int i9 = i2;
                    String str45 = str18;
                    String str46 = str24;
                    String str47 = str22;
                    String str48 = str19;
                    String str49 = str23;
                    String str50 = str21;
                    String str51 = str20;
                    ArrayList arrayList5 = arrayList4;
                    NotificationCompat.BigTextStyle bigTextStyleBigText = new NotificationCompat.BigTextStyle().bigText(str48 == null ? str49 : str48);
                    Intrinsics.checkNotNullExpressionValue(bigTextStyleBigText, "bigText(...)");
                    AppSpecificNotificationContent appSpecificNotificationContentAppSpecificContent = this.contentHandler.appSpecificContent(context6, str14);
                    NotificationCompat.Builder style = new NotificationCompat.Builder(context6).setDefaults(-1).setShowWhen(true).setWhen(j8).setSmallIcon(C20690R.drawable.ic_rh_notification).setContentTitle(str45).setContentText(str49).setAutoCancel(true).setContentIntent(pendingIntent).setDeleteIntent(pendingIntent2).setColor(context6.getColor(appSpecificNotificationContentAppSpecificContent.getColor())).setStyle(bigTextStyleBigText);
                    Intrinsics.checkNotNullExpressionValue(style, "setStyle(...)");
                    Notification notificationBuild = addActions(style, arrayList5).setChannelId(appSpecificNotificationContentAppSpecificContent.getChannelId()).build();
                    Intrinsics.checkNotNullExpressionValue(notificationBuild, "build(...)");
                    Intrinsics.checkNotNull(uri2);
                    showNotification(context6, notificationBuild, i9, str47, uri2, str46, str45, str49, str48, false, str50, str51, map3);
                    return Unit.INSTANCE;
                }
            }
        }
        Intent[] intentArr = (Intent[]) obj;
        String str52 = str17;
        int i10 = i2;
        String str53 = str13;
        String str54 = str12;
        String str55 = str10;
        String str56 = str11;
        configureIntentForSingle((Intent) ArraysKt.last(intentArr), str54, str53, i10, str52, str56, str55);
        str18 = str52;
        str19 = str55;
        long j9 = j2;
        Intent intent = (Intent) ArraysKt.last(intentArr);
        Intrinsics.checkNotNull(uri);
        Uri uri6 = uri;
        addDataValueToIntentIfMissing(intent, uri6);
        PendingIntent activities = PendingIntent.getActivities(context2, 0, intentArr, PENDING_INTENT_FLAGS);
        Intent dismissIntent = NotificationCancelBroadcastReceiver.INSTANCE.getDismissIntent(context2);
        configureIntentForSingle(dismissIntent, str54, str53, i10, str52, str56, str55);
        rhNotificationManager = this;
        PendingIntent broadcast = PendingIntent.getBroadcast(context2, 0, dismissIntent, PENDING_INTENT_FLAGS);
        List<RhNotificationAction> list4 = list2;
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
        str20 = str16;
        str21 = str15;
        str22 = str54;
        pendingIntent = activities;
        it = list4.iterator();
        arrayList = arrayList6;
        map3 = map2;
        uri2 = uri6;
        j3 = j9;
        str23 = str56;
        str24 = str13;
        pendingIntent2 = broadcast;
        if (it.hasNext()) {
        }
    }

    private final NotificationCompat.Builder addActions(NotificationCompat.Builder builder, List<? extends NotificationCompat.Action> list) {
        Iterator<? extends NotificationCompat.Action> it = list.iterator();
        while (it.hasNext()) {
            builder.addAction(it.next());
        }
        return builder;
    }

    private final void configureIntentForSingle(Intent intent, String uuid, String type2, int notificationId, String title, String body, String expandedBodyOverride) {
        intent.putExtra(EXTRA_FROM_NOTIFICATION, true);
        intent.putExtra(EXTRA_NOTIFICATION_UUID, uuid);
        intent.putExtra("type", type2);
        intent.putExtra(EXTRA_NOTIFICATION_ID, notificationId);
        intent.putExtra(EXTRA_NOTIFICATION_TITLE, title);
        intent.putExtra(EXTRA_NOTIFICATION_BODY, body);
        intent.putExtra(EXTRA_NOTIFICATION_EXPANDED_BODY, expandedBodyOverride);
    }

    private final void addDataValueToIntentIfMissing(Intent intent, Uri uri) {
        if (intent.getData() == null) {
            intent.setData(uri);
        }
    }

    private final void showNotification(Context context, Notification notification, int notificationId, String uuid, Uri uri, String type2, String title, String body, String expandedBodyOverride, boolean stacked, String poBox, String category, Map<String, String> data) {
        List list;
        String str;
        synchronized (this.interceptors) {
            list = CollectionsKt.toList(this.interceptors);
            Unit unit = Unit.INSTANCE;
        }
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((NotificationManager.Interceptor) it.next()).intercept(uri, data)) {
                    return;
                }
            }
        }
        if (NotificationUtils.notifyIfPossible(ContextSystemServices.getNotificationManager(context), notificationId, notification)) {
            this.activeNotifications.put(Integer.valueOf(notificationId), uri);
        }
        if (stacked) {
            str = AnalyticsStrings.PUSH_NOTIF_EVENT_RECEIVED_STACKED;
        } else {
            str = AnalyticsStrings.PUSH_NOTIF_EVENT_RECEIVED;
        }
        AnalyticsLogger.DefaultImpls.logPushNotification$default(this.analytics, str, uuid, type2, title, body, expandedBodyOverride, poBox, category, null, 256, null);
    }
}
