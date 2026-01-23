package com.robinhood.android.common.notification;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: NotificationManager.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 '2\u00020\u0001:\u0002&'J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u009a\u0001\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H¦@¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH&J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH&J\u001e\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!H¦@¢\u0006\u0002\u0010\"J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010$\u001a\u00020%H&J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\bH&¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/common/notification/NotificationManager;", "", "initNotificationChannels", "", "context", "Landroid/content/Context;", "showNotification", "title", "", CarResultComposable2.BODY, "expandedBodyOverride", "url", "timestamp", "", "notificationId", "", "uuid", "type", "channel", "poBox", RhGcmListenerService.EXTRA_CATEGORY, WebsocketGatewayConstants.DATA_KEY, "", "notificationActions", "", "Lcom/robinhood/android/common/notification/RhNotificationAction;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addInterceptor", "interceptor", "Lcom/robinhood/android/common/notification/NotificationManager$Interceptor;", "removeInterceptor", "onNotificationDismissed", "intent", "Landroid/content/Intent;", "(Landroid/content/Context;Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelNotifications", "uri", "Landroid/net/Uri;", "Interceptor", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface NotificationManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int DEFAULT_GCM_NOTIFICATION_ID = 2789;

    /* compiled from: NotificationManager.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/common/notification/NotificationManager$Interceptor;", "", "intercept", "", "uri", "Landroid/net/Uri;", WebsocketGatewayConstants.DATA_KEY, "", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Interceptor {
        boolean intercept(Uri uri, Map<String, String> data);
    }

    void addInterceptor(Interceptor interceptor);

    void cancelNotifications(Context context, Uri uri);

    void cancelNotifications(Context context, String uuid);

    @TargetApi(26)
    void initNotificationChannels(Context context);

    Object onNotificationDismissed(Context context, Intent intent, Continuation<? super Unit> continuation);

    void removeInterceptor(Interceptor interceptor);

    Object showNotification(Context context, String str, String str2, String str3, String str4, long j, int i, String str5, String str6, String str7, String str8, String str9, Map<String, String> map, List<RhNotificationAction> list, Continuation<? super Unit> continuation);

    /* compiled from: NotificationManager.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/common/notification/NotificationManager$Companion;", "", "<init>", "()V", "DEFAULT_GCM_NOTIFICATION_ID", "", "generateNotificationId", "uuid", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int DEFAULT_GCM_NOTIFICATION_ID = 2789;

        private Companion() {
        }

        public final int generateNotificationId(String uuid) {
            if (uuid != null) {
                return uuid.hashCode();
            }
            return 2789;
        }
    }
}
