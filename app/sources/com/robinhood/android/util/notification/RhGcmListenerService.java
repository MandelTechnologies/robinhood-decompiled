package com.robinhood.android.util.notification;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.robinhood.Logger;
import com.robinhood.android.common.notification.NotificationManager;
import com.robinhood.android.common.notification.actions.NotificationActionParser;
import com.robinhood.android.common.util.GcmManager;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.remoteconfig.RemoteConfigStale;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

/* compiled from: RhGcmListenerService.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0002\u0018\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0082@¢\u0006\u0002\u0010\u000fJ\"\u0010\f\u001a\u00020\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0011H\u0082@¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u000eH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/util/notification/RhGcmListenerService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "entryPoint", "Lcom/robinhood/android/util/notification/RhGcmListenerService$RhGcmListenerServiceEntryPoint;", "getEntryPoint", "()Lcom/robinhood/android/util/notification/RhGcmListenerService$RhGcmListenerServiceEntryPoint;", "onMessageReceived", "", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "showNotification", "message", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", WebsocketGatewayConstants.DATA_KEY, "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTimestamp", "", "bundle", "onNewToken", "token", "RhGcmListenerServiceEntryPoint", "Companion", "lib-system-notifications-base_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class RhGcmListenerService extends FirebaseMessagingService {
    public static final String DEFAULT_TYPE = "android_default_type";
    public static final String DEFAULT_UUID = "android_default_uuid";
    private static final String EXTRA_BODY = "body";
    public static final String EXTRA_CATEGORY = "category";
    private static final String EXTRA_CHANNEL = "channel";
    private static final String EXTRA_DEFAULT = "default";
    private static final String EXTRA_EXPANDED_BODY = "expanded_body";
    private static final String EXTRA_POBOX = "pobox";
    private static final String EXTRA_REMOTE_CONFIG_STALE_KEY = "CONFIG_STATE";
    private static final String EXTRA_REMOTE_CONFIG_TOPIC = "PUSH_RC";
    private static final String EXTRA_TIMESTAMP = "timestamp";
    private static final String EXTRA_TITLE = "title";
    private static final String EXTRA_TYPE = "type";
    public static final String EXTRA_URL = "url";
    private static final String EXTRA_UUID = "uuid";

    /* compiled from: RhGcmListenerService.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH'J\b\u0010\n\u001a\u00020\u000bH'J\b\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/util/notification/RhGcmListenerService$RhGcmListenerServiceEntryPoint;", "", "notificationManager", "Lcom/robinhood/android/common/notification/NotificationManager;", "gcmManager", "Lcom/robinhood/android/common/util/GcmManager;", "firebaseMessaging", "Lcom/google/firebase/messaging/FirebaseMessaging;", "remoteConfigStalePref", "Lcom/robinhood/prefs/BooleanPreference;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "notificationActionParser", "Lcom/robinhood/android/common/notification/actions/NotificationActionParser;", "lib-system-notifications-base_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface RhGcmListenerServiceEntryPoint {
        @RootCoroutineScope
        CoroutineScope coroutineScope();

        FirebaseMessaging firebaseMessaging();

        GcmManager gcmManager();

        NotificationActionParser notificationActionParser();

        NotificationManager notificationManager();

        @RemoteConfigStale
        BooleanPreference remoteConfigStalePref();
    }

    private final RhGcmListenerServiceEntryPoint getEntryPoint() {
        ComponentCallbacks2 componentCallbacks2;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        if (applicationContext instanceof Application) {
            componentCallbacks2 = (Application) applicationContext;
        } else {
            Context applicationContext2 = applicationContext.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            componentCallbacks2 = (Application) applicationContext2;
        }
        return (RhGcmListenerServiceEntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        super.onMessageReceived(remoteMessage);
        Map<String, String> data = remoteMessage.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        Timber.INSTANCE.mo3350d(data.toString(), new Object[0]);
        String str = data.get("default");
        if (str != null) {
            BuildersKt__Builders_commonKt.launch$default(getEntryPoint().coroutineScope(), null, null, new C313611(str, null), 3, null);
            return;
        }
        if (data.containsKey("body")) {
            BuildersKt__Builders_commonKt.launch$default(getEntryPoint().coroutineScope(), null, null, new C313622(data, null), 3, null);
        } else if (data.containsKey(EXTRA_REMOTE_CONFIG_STALE_KEY)) {
            Logger.INSTANCE.mo1679d("Firebase remote config values are stale.", new Object[0]);
            getEntryPoint().remoteConfigStalePref().set(true);
        }
    }

    /* compiled from: RhGcmListenerService.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.util.notification.RhGcmListenerService$onMessageReceived$1", m3645f = "RhGcmListenerService.kt", m3646l = {47}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.util.notification.RhGcmListenerService$onMessageReceived$1 */
    /* loaded from: classes9.dex */
    static final class C313611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C313611(String str, Continuation<? super C313611> continuation) {
            super(2, continuation);
            this.$message = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhGcmListenerService.this.new C313611(this.$message, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RhGcmListenerService rhGcmListenerService = RhGcmListenerService.this;
                String str = this.$message;
                this.label = 1;
                if (rhGcmListenerService.showNotification(str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: RhGcmListenerService.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.util.notification.RhGcmListenerService$onMessageReceived$2", m3645f = "RhGcmListenerService.kt", m3646l = {56}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.util.notification.RhGcmListenerService$onMessageReceived$2 */
    /* loaded from: classes9.dex */
    static final class C313622 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Map<String, String> $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C313622(Map<String, String> map, Continuation<? super C313622> continuation) {
            super(2, continuation);
            this.$data = map;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhGcmListenerService.this.new C313622(this.$data, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313622) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RhGcmListenerService rhGcmListenerService = RhGcmListenerService.this;
                Map<String, String> map = this.$data;
                this.label = 1;
                if (rhGcmListenerService.showNotification(map, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showNotification(String str, Continuation<? super Unit> continuation) {
        Object objShowNotification = getEntryPoint().notificationManager().showNotification(this, null, str, null, DeepLinkPath.ANDROID_DEFAULT.getUri(), System.currentTimeMillis(), NotificationManager.INSTANCE.generateNotificationId(null), DEFAULT_UUID, DEFAULT_TYPE, null, null, null, MapsKt.emptyMap(), CollectionsKt.emptyList(), continuation);
        return objShowNotification == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objShowNotification : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showNotification(Map<String, String> map, Continuation<? super Unit> continuation) {
        String str = (String) MapsKt.getValue(map, "title");
        String str2 = (String) MapsKt.getValue(map, "body");
        String str3 = map.get(EXTRA_EXPANDED_BODY);
        String str4 = (str3 == null || str3.length() <= 0) ? null : str3;
        String str5 = (String) MapsKt.getValue(map, "url");
        long timestamp = getTimestamp(map);
        String str6 = (String) MapsKt.getValue(map, EXTRA_UUID);
        String str7 = (String) MapsKt.getValue(map, "type");
        String str8 = map.get(EXTRA_CHANNEL);
        String str9 = map.get(EXTRA_POBOX);
        String str10 = map.get(EXTRA_CATEGORY);
        int iGenerateNotificationId = NotificationManager.INSTANCE.generateNotificationId(str6);
        Timber.INSTANCE.mo3356i("Showing notification with deep-link: %s", str5);
        Object objShowNotification = getEntryPoint().notificationManager().showNotification(this, str, str2, str4, str5, timestamp, iGenerateNotificationId, str6, str7, str8, str9, str10, map, getEntryPoint().notificationActionParser().parse(map), continuation);
        return objShowNotification == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objShowNotification : Unit.INSTANCE;
    }

    private final long getTimestamp(Map<String, String> bundle) {
        try {
            String str = bundle.get(EXTRA_TIMESTAMP);
            long j = str != null ? Long.parseLong(str) : 0L;
            return j == 0 ? System.currentTimeMillis() : j;
        } catch (Exception unused) {
            return System.currentTimeMillis();
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        RhGcmListenerServiceEntryPoint entryPoint = getEntryPoint();
        entryPoint.gcmManager().refreshGcmToken(this, token);
        entryPoint.firebaseMessaging().subscribeToTopic(EXTRA_REMOTE_CONFIG_TOPIC);
    }
}
