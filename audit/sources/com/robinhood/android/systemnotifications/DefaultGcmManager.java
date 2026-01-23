package com.robinhood.android.systemnotifications;

import android.content.Context;
import android.provider.Settings;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.lifecycle.MainTabActivityListener;
import com.robinhood.android.data.prefs.GcmTokenPref;
import com.robinhood.android.data.prefs.PromptedPushPref;
import com.robinhood.android.data.prefs.RegisteredDeviceRhId;
import com.robinhood.android.util.notification.BaseGcmManager;
import com.robinhood.models.api.AppTypes2;
import com.robinhood.models.api.GcmDevice;
import com.robinhood.models.api.retrofit.NotificationsApi;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.utils.buildconfig.BuildVariant;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.extensions.Throwables;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DefaultGcmManager.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B[\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0002\u0010\u0019J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0017H\u0080@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0017H\u0096@¢\u0006\u0002\u0010\u0019J\b\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$H\u0016J \u0010&\u001a\u0004\u0018\u00010\u00172\u0006\u0010'\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/systemnotifications/DefaultGcmManager;", "Lcom/robinhood/android/util/notification/BaseGcmManager;", "Lcom/robinhood/android/common/util/lifecycle/MainTabActivityListener;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "appContext", "Landroid/content/Context;", "notificationsApi", "Lcom/robinhood/models/api/retrofit/NotificationsApi;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "registeredDeviceRhIdPref", "Lcom/robinhood/prefs/StringPreference;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "gcmTokenPref", "promptedPushPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/shared/app/type/AppType;Landroid/content/Context;Lcom/robinhood/models/api/retrofit/NotificationsApi;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/prefs/StringPreference;Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/BooleanPreference;)V", "register", "", "gcmToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "register$lib_system_notifications_externalRelease", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unregister", "", "registeredDeviceId", "shouldSkipRegister", "", "onMainTabActivityResumed", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "onMainTabActivityCreated", "fetchDevice", "token", "lib-system-notifications_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class DefaultGcmManager extends BaseGcmManager implements MainTabActivityListener {
    private final AnalyticsLogger analytics;
    private final Context appContext;
    private final AppType appType;
    private final AuthManager authManager;
    private final CoroutineScope coroutineScope;
    private final NotificationsApi notificationsApi;
    private final StringPreference registeredDeviceRhIdPref;

    /* compiled from: DefaultGcmManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.systemnotifications.DefaultGcmManager", m3645f = "DefaultGcmManager.kt", m3646l = {120}, m3647m = "fetchDevice")
    /* renamed from: com.robinhood.android.systemnotifications.DefaultGcmManager$fetchDevice$1 */
    /* loaded from: classes9.dex */
    static final class C292211 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C292211(Continuation<? super C292211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultGcmManager.this.fetchDevice(null, null, this);
        }
    }

    /* compiled from: DefaultGcmManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.systemnotifications.DefaultGcmManager", m3645f = "DefaultGcmManager.kt", m3646l = {57, 86}, m3647m = "register$lib_system_notifications_externalRelease")
    /* renamed from: com.robinhood.android.systemnotifications.DefaultGcmManager$register$2 */
    /* loaded from: classes9.dex */
    static final class C292232 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C292232(Continuation<? super C292232> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultGcmManager.this.register$lib_system_notifications_externalRelease(null, null, this);
        }
    }

    @Override // com.robinhood.android.common.util.lifecycle.MainTabActivityListener
    public void onMainTabActivityCreated(BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultGcmManager(AnalyticsLogger analytics, AppType appType, Context appContext, NotificationsApi notificationsApi, AuthManager authManager, @RegisteredDeviceRhId StringPreference registeredDeviceRhIdPref, @RootCoroutineScope CoroutineScope coroutineScope, @GcmTokenPref StringPreference gcmTokenPref, @PromptedPushPref BooleanPreference promptedPushPref) {
        super(coroutineScope, gcmTokenPref, registeredDeviceRhIdPref, promptedPushPref);
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(notificationsApi, "notificationsApi");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(registeredDeviceRhIdPref, "registeredDeviceRhIdPref");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(gcmTokenPref, "gcmTokenPref");
        Intrinsics.checkNotNullParameter(promptedPushPref, "promptedPushPref");
        this.analytics = analytics;
        this.appType = appType;
        this.appContext = appContext;
        this.notificationsApi = notificationsApi;
        this.authManager = authManager;
        this.registeredDeviceRhIdPref = registeredDeviceRhIdPref;
        this.coroutineScope = coroutineScope;
    }

    @Override // com.robinhood.android.util.notification.BaseGcmManager
    public Object register(String str, Continuation<? super String> continuation) {
        String string2 = Settings.Secure.getString(this.appContext.getContentResolver(), "android_id");
        Intrinsics.checkNotNull(string2);
        return register$lib_system_notifications_externalRelease(str, string2, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        if (r10 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object register$lib_system_notifications_externalRelease(String str, String str2, Continuation<? super String> continuation) {
        C292232 c292232;
        if (continuation instanceof C292232) {
            c292232 = (C292232) continuation;
            int i = c292232.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c292232.label = i - Integer.MIN_VALUE;
            } else {
                c292232 = new C292232(continuation);
            }
        }
        Object objFetchDevice = c292232.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c292232.label;
        try {
        } catch (Throwable th) {
            Integer httpStatusCode = Throwables.getHttpStatusCode(th);
            this.analytics.logError(AnalyticsStrings.ERROR_REGISTER_DEVICE, String.valueOf(httpStatusCode));
            if (httpStatusCode != null && httpStatusCode.intValue() == 400) {
                if (!this.registeredDeviceRhIdPref.mo23850isSet() || Intrinsics.areEqual(this.registeredDeviceRhIdPref.get(), "na")) {
                    c292232.L$0 = null;
                    c292232.L$1 = null;
                    c292232.label = 2;
                    objFetchDevice = fetchDevice(str, str2, c292232);
                } else {
                    throw th;
                }
            } else {
                throw th;
            }
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFetchDevice);
            NotificationsApi notificationsApi = this.notificationsApi;
            GcmDevice gcmDevice = new GcmDevice(str, str2, BuildVariant.INSTANCE.compute(), this.appType);
            c292232.L$0 = str;
            c292232.L$1 = str2;
            c292232.label = 1;
            objFetchDevice = notificationsApi.postGcmDevice(gcmDevice, c292232);
            if (objFetchDevice == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFetchDevice);
                if (objFetchDevice != null) {
                    return objFetchDevice;
                }
                throw new IllegalStateException("Failed to fetch GCM device");
            }
            str2 = (String) c292232.L$1;
            str = (String) c292232.L$0;
            ResultKt.throwOnFailure(objFetchDevice);
        }
        String id = ((GcmDevice) objFetchDevice).getId();
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Expected non-null GCM Device ID");
    }

    @Override // com.robinhood.android.util.notification.BaseGcmManager
    public Object unregister(String str, Continuation<? super Unit> continuation) {
        Object objDeleteGcmDevice = this.notificationsApi.deleteGcmDevice(str, AppTypes2.getProductId(this.appType), continuation);
        return objDeleteGcmDevice == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDeleteGcmDevice : Unit.INSTANCE;
    }

    @Override // com.robinhood.android.util.notification.BaseGcmManager
    public boolean shouldSkipRegister() {
        return !this.authManager.isLoggedIn();
    }

    /* compiled from: DefaultGcmManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.systemnotifications.DefaultGcmManager$onMainTabActivityResumed$1", m3645f = "DefaultGcmManager.kt", m3646l = {113}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.systemnotifications.DefaultGcmManager$onMainTabActivityResumed$1 */
    /* loaded from: classes9.dex */
    static final class C292221 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BaseActivity $activity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C292221(BaseActivity baseActivity, Continuation<? super C292221> continuation) {
            super(2, continuation);
            this.$activity = baseActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultGcmManager.this.new C292221(this.$activity, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C292221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DefaultGcmManager defaultGcmManager = DefaultGcmManager.this;
                BaseActivity baseActivity = this.$activity;
                this.label = 1;
                if (defaultGcmManager.registerDevice(baseActivity, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.util.lifecycle.MainTabActivityListener
    public void onMainTabActivityResumed(BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        BuildersKt__Builders_commonKt.launch$default(activity.getLifecycleScope(), null, null, new C292221(activity, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchDevice(String str, String str2, Continuation<? super String> continuation) {
        C292211 c292211;
        if (continuation instanceof C292211) {
            c292211 = (C292211) continuation;
            int i = c292211.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c292211.label = i - Integer.MIN_VALUE;
            } else {
                c292211 = new C292211(continuation);
            }
        }
        Object gcmDevices = c292211.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c292211.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(gcmDevices);
            NotificationsApi notificationsApi = this.notificationsApi;
            c292211.L$0 = str;
            c292211.L$1 = str2;
            c292211.label = 1;
            gcmDevices = notificationsApi.getGcmDevices(c292211);
            if (gcmDevices == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) c292211.L$1;
            str = (String) c292211.L$0;
            ResultKt.throwOnFailure(gcmDevices);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) gcmDevices) {
            GcmDevice gcmDevice = (GcmDevice) obj;
            if (Intrinsics.areEqual(gcmDevice.getToken(), str) && Intrinsics.areEqual(gcmDevice.getIdentifier(), str2)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String id = ((GcmDevice) it.next()).getId();
            if (id != null) {
                return id;
            }
        }
        return null;
    }
}
