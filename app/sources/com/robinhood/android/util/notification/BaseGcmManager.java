package com.robinhood.android.util.notification;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.security.ProviderInstaller;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.GcmManager;
import com.robinhood.android.common.util.GcmManager2;
import com.robinhood.android.systemnotifications.base.C29225R;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import dispatch.core.Suspend;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

/* compiled from: BaseGcmManager.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 12\u00020\u0001:\u00011B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\u0010J\b\u0010\u0014\u001a\u00020\u0015H&J\n\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\u0016\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0086@¢\u0006\u0002\u0010\u001bJ\u001e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010\u001eJ\u000e\u0010\u001f\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010 J*\u0010!\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0018\u0010'\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eH\u0016J\u0010\u0010)\u001a\u0004\u0018\u00010\u000eH\u0082@¢\u0006\u0002\u0010 J\u0018\u0010*\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J \u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u0010$\u001a\u00020#H\u0002J\u0010\u00100\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/util/notification/BaseGcmManager;", "Lcom/robinhood/android/common/util/GcmManager;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "gcmTokenPref", "Lcom/robinhood/prefs/StringPreference;", "registeredDeviceRhIdPref", "promptedPushPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/BooleanPreference;)V", "mainHandler", "Landroid/os/Handler;", "register", "", "gcmToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unregister", "", "registeredDeviceId", "shouldSkipRegister", "", "getGcmToken", "isRegistered", "registerDevice", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "promptMode", "Lcom/robinhood/android/common/util/RegisterDevicePromptMode;", "(Landroid/content/Context;Lcom/robinhood/android/common/util/RegisterDevicePromptMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unregisterDevice", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "refreshGcmToken", "token", "fetchGcmToken", "checkPlayServices", "showErrorFragment", "gpsHelper", "Lcom/google/android/gms/common/GoogleApiAvailability;", "activity", "Landroid/app/Activity;", "showFailureToastAndSetPref", "Companion", "lib-system-notifications-base_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public abstract class BaseGcmManager implements GcmManager {
    private static final int GPS_REQUEST_CODE = 9262;
    private final CoroutineScope coroutineScope;
    private final StringPreference gcmTokenPref;
    private final Handler mainHandler;
    private final BooleanPreference promptedPushPref;
    private final StringPreference registeredDeviceRhIdPref;

    public abstract Object register(String str, Continuation<? super String> continuation);

    public abstract boolean shouldSkipRegister();

    public abstract Object unregister(String str, Continuation<? super Unit> continuation);

    public BaseGcmManager(CoroutineScope coroutineScope, StringPreference gcmTokenPref, StringPreference registeredDeviceRhIdPref, BooleanPreference promptedPushPref) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(gcmTokenPref, "gcmTokenPref");
        Intrinsics.checkNotNullParameter(registeredDeviceRhIdPref, "registeredDeviceRhIdPref");
        Intrinsics.checkNotNullParameter(promptedPushPref, "promptedPushPref");
        this.coroutineScope = coroutineScope;
        this.gcmTokenPref = gcmTokenPref;
        this.registeredDeviceRhIdPref = registeredDeviceRhIdPref;
        this.promptedPushPref = promptedPushPref;
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    @Override // com.robinhood.android.common.util.GcmManager
    public String getGcmToken() {
        return this.gcmTokenPref.get();
    }

    @Override // com.robinhood.android.common.util.GcmManager
    public boolean isRegistered() {
        return this.registeredDeviceRhIdPref.mo23850isSet();
    }

    @Override // com.robinhood.android.common.util.GcmManager
    public final Object registerDevice(Context context, Continuation<? super Boolean> continuation) {
        return registerDevice(context, GcmManager2.ALLOW_PROMPT, continuation);
    }

    /* compiled from: BaseGcmManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.util.notification.BaseGcmManager$registerDevice$3", m3645f = "BaseGcmManager.kt", m3646l = {93, 94}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.util.notification.BaseGcmManager$registerDevice$3 */
    static final class C313553 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ GcmManager2 $promptMode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C313553(Context context, GcmManager2 gcmManager2, Continuation<? super C313553> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$promptMode = gcmManager2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseGcmManager.this.new C313553(this.$context, this.$promptMode, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C313553) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
        
            if (r11 == r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!BaseGcmManager.this.shouldSkipRegister()) {
                        if (!BaseGcmManager.this.checkPlayServices(this.$context, this.$promptMode)) {
                            return boxing.boxBoolean(false);
                        }
                        BaseGcmManager baseGcmManager = BaseGcmManager.this;
                        this.label = 1;
                        obj = baseGcmManager.fetchGcmToken(this);
                        if (obj == coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    return boxing.boxBoolean(false);
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    BaseGcmManager.this.registeredDeviceRhIdPref.set((String) obj);
                    return boxing.boxBoolean(true);
                }
                ResultKt.throwOnFailure(obj);
                if (obj == null) {
                    throw new IllegalStateException("Expected non-null GCM token");
                }
                BaseGcmManager baseGcmManager2 = BaseGcmManager.this;
                this.label = 2;
                obj = baseGcmManager2.register((String) obj, this);
            } catch (Throwable th) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new Exception("GCM registration error", th), false, null, 4, null);
                return boxing.boxBoolean(false);
            }
        }
    }

    @Override // com.robinhood.android.common.util.GcmManager
    public final Object registerDevice(Context context, GcmManager2 gcmManager2, Continuation<? super Boolean> continuation) {
        return Suspend.withIO$default(null, new C313553(context, gcmManager2, null), continuation, 1, null);
    }

    /* compiled from: BaseGcmManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.util.notification.BaseGcmManager$unregisterDevice$2", m3645f = "BaseGcmManager.kt", m3646l = {116}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.util.notification.BaseGcmManager$unregisterDevice$2 */
    /* loaded from: classes9.dex */
    static final class C313572 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C313572(Continuation<? super C313572> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseGcmManager.this.new C313572(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313572) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = BaseGcmManager.this.registeredDeviceRhIdPref.get();
                if (str != null && str.length() != 0) {
                    BaseGcmManager baseGcmManager = BaseGcmManager.this;
                    this.label = 1;
                    if (baseGcmManager.unregister(str, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BaseGcmManager.this.registeredDeviceRhIdPref.delete();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.util.GcmManager
    public final Object unregisterDevice(Continuation<? super Unit> continuation) {
        return Suspend.withIO$default(null, new C313572(null), continuation, 1, null);
    }

    /* compiled from: BaseGcmManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.util.notification.BaseGcmManager$onActivityResult$1", m3645f = "BaseGcmManager.kt", m3646l = {131}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.util.notification.BaseGcmManager$onActivityResult$1 */
    /* loaded from: classes9.dex */
    static final class C313531 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C313531(Context context, Continuation<? super C313531> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseGcmManager.this.new C313531(this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BaseGcmManager baseGcmManager = BaseGcmManager.this;
                Context context = this.$context;
                this.label = 1;
                if (baseGcmManager.registerDevice(context, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.util.GcmManager
    public void onActivityResult(Context context, int requestCode, int resultCode, Intent data) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (requestCode == GPS_REQUEST_CODE) {
            if (resultCode == -1) {
                BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C313531(context, null), 3, null);
            } else {
                showFailureToastAndSetPref(context);
            }
        }
    }

    @Override // com.robinhood.android.common.util.GcmManager
    public void refreshGcmToken(Context context, String token) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(token, "token");
        this.registeredDeviceRhIdPref.delete();
        this.gcmTokenPref.set(token);
        this.promptedPushPref.delete();
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C313541(context, null), 3, null);
    }

    /* compiled from: BaseGcmManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.util.notification.BaseGcmManager$refreshGcmToken$1", m3645f = "BaseGcmManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.util.notification.BaseGcmManager$refreshGcmToken$1 */
    static final class C313541 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C313541(Context context, Continuation<? super C313541> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseGcmManager.this.new C313541(this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BaseGcmManager baseGcmManager = BaseGcmManager.this;
                Context context = this.$context;
                this.label = 1;
                if (baseGcmManager.registerDevice(context, this) == coroutine_suspended) {
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
    public final Object fetchGcmToken(Continuation<? super String> continuation) {
        if (this.gcmTokenPref.mo23850isSet()) {
            return this.gcmTokenPref.get();
        }
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Task<String> token = FirebaseMessaging.getInstance().getToken();
        Intrinsics.checkNotNullExpressionValue(token, "getToken(...)");
        token.addOnSuccessListener(new OnSuccessListener() { // from class: com.robinhood.android.util.notification.BaseGcmManager$fetchGcmToken$2$1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(String token2) {
                Intrinsics.checkNotNullParameter(token2, "token");
                this.this$0.gcmTokenPref.set(token2);
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(token2));
            }
        });
        token.addOnFailureListener(new OnFailureListener() { // from class: com.robinhood.android.util.notification.BaseGcmManager$fetchGcmToken$2$2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception t) {
                Intrinsics.checkNotNullParameter(t, "t");
                CancellableContinuation<String> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(t)));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkPlayServices(final Context context, GcmManager2 promptMode) throws Resources.NotFoundException {
        this.mainHandler.post(new Runnable() { // from class: com.robinhood.android.util.notification.BaseGcmManager.checkPlayServices.1
            @Override // java.lang.Runnable
            public final void run() {
                ProviderInstaller.installIfNeededAsync(context, new ProviderInstaller.ProviderInstallListener() { // from class: com.robinhood.android.util.notification.BaseGcmManager.checkPlayServices.1.1
                    @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
                    public void onProviderInstalled() {
                        Timber.INSTANCE.mo3350d("Security provider installed correctly.", new Object[0]);
                    }

                    @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
                    public void onProviderInstallFailed(int i, Intent intent) {
                        Timber.INSTANCE.mo3362w("Security provider failed to be installed. Error code: %d", Integer.valueOf(i));
                    }
                });
            }
        });
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        Intrinsics.checkNotNullExpressionValue(googleApiAvailability, "getInstance(...)");
        int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context);
        boolean z = iIsGooglePlayServicesAvailable == 0;
        if (promptMode != GcmManager2.NO_PROMPT && !z && ((promptMode == GcmManager2.FORCE_PROMPT || !this.promptedPushPref.get()) && googleApiAvailability.isUserResolvableError(iIsGooglePlayServicesAvailable))) {
            if (context instanceof Activity) {
                showErrorFragment(googleApiAvailability, BaseContexts.requireActivityBaseContext(context), iIsGooglePlayServicesAvailable);
                return z;
            }
            GooglePlayServicesUtil.showErrorNotification(iIsGooglePlayServicesAvailable, context);
        }
        return z;
    }

    private final void showErrorFragment(GoogleApiAvailability gpsHelper, final Activity activity, int resultCode) {
        gpsHelper.showErrorDialogFragment(activity, resultCode, GPS_REQUEST_CODE, new DialogInterface.OnCancelListener() { // from class: com.robinhood.android.util.notification.BaseGcmManager.showErrorFragment.1
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                BaseGcmManager.this.showFailureToastAndSetPref(activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFailureToastAndSetPref(Context context) {
        Toast.makeText(context, C29225R.string.gcm_notifications_not_enabled_summary, 1).show();
        this.promptedPushPref.set(true);
    }
}
