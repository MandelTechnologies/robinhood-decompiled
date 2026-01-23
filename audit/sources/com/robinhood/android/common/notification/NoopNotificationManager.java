package com.robinhood.android.common.notification;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.common.notification.NotificationManager;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NoopNotificationManager.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u009a\u0001\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0096@¢\u0006\u0002\u0010\u001cJ\u001e\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@¢\u0006\u0002\u0010 J\u0018\u0010!\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020#H\u0016J\u0018\u0010!\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&H\u0016¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/common/notification/NoopNotificationManager;", "Lcom/robinhood/android/common/notification/NotificationManager;", "<init>", "()V", "initNotificationChannels", "", "context", "Landroid/content/Context;", "showNotification", "title", "", CarResultComposable2.BODY, "expandedBodyOverride", "url", "timestamp", "", "notificationId", "", "uuid", "type", "channel", "poBox", RhGcmListenerService.EXTRA_CATEGORY, WebsocketGatewayConstants.DATA_KEY, "", "notificationActions", "", "Lcom/robinhood/android/common/notification/RhNotificationAction;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onNotificationDismissed", "intent", "Landroid/content/Intent;", "(Landroid/content/Context;Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelNotifications", "uri", "Landroid/net/Uri;", "addInterceptor", "interceptor", "Lcom/robinhood/android/common/notification/NotificationManager$Interceptor;", "removeInterceptor", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class NoopNotificationManager implements NotificationManager {
    public static final int $stable = 0;
    public static final NoopNotificationManager INSTANCE = new NoopNotificationManager();

    @Override // com.robinhood.android.common.notification.NotificationManager
    public void addInterceptor(NotificationManager.Interceptor interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
    }

    @Override // com.robinhood.android.common.notification.NotificationManager
    public void cancelNotifications(Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
    }

    @Override // com.robinhood.android.common.notification.NotificationManager
    public void cancelNotifications(Context context, String uuid) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
    }

    @Override // com.robinhood.android.common.notification.NotificationManager
    public void initNotificationChannels(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.robinhood.android.common.notification.NotificationManager
    public void removeInterceptor(NotificationManager.Interceptor interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
    }

    private NoopNotificationManager() {
    }

    @Override // com.robinhood.android.common.notification.NotificationManager
    public Object showNotification(Context context, String str, String str2, String str3, String str4, long j, int i, String str5, String str6, String str7, String str8, String str9, Map<String, String> map, List<RhNotificationAction> list, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.notification.NotificationManager
    public Object onNotificationDismissed(Context context, Intent intent, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }
}
