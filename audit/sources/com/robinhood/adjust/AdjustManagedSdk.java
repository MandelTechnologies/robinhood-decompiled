package com.robinhood.adjust;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.Constants;
import com.adjust.sdk.LogLevel;
import com.adjust.sdk.OnAdidReadListener;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.gdpr.GdprConsentCategory;
import com.robinhood.android.gdpr.GdprManagedSdk;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.lifecycle.ActivityLifecycleListener;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: AdjustManagedSdk.kt */
@Metadata(m3635d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004*\u0001!\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0017J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0016H\u0016J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\"¨\u0006$"}, m3636d2 = {"Lcom/robinhood/adjust/AdjustManagedSdk;", "Lcom/robinhood/android/gdpr/GdprManagedSdk;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "rootScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/analytics/EventLogger;Lkotlinx/coroutines/CoroutineScope;)V", "name", "", "getName", "()Ljava/lang/String;", "consentCategory", "Lcom/robinhood/android/gdpr/GdprConsentCategory;", "getConsentCategory", "()Lcom/robinhood/android/gdpr/GdprConsentCategory;", "appId", "getAppId$lib_adjust_externalRelease", "consentFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "onAppInitialized", "", "app", "Landroid/app/Application;", "updateConsentStatus", "isEnabled", "updateAdjust", "activityLifecycleCallbacks", "com/robinhood/adjust/AdjustManagedSdk$activityLifecycleCallbacks$1", "Lcom/robinhood/adjust/AdjustManagedSdk$activityLifecycleCallbacks$1;", "Companion", "lib-adjust_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AdjustManagedSdk implements GdprManagedSdk {
    private static final String ADJUST_APP_TOKEN = "aa1av1mq68sg";
    private static final String ADJUST_APP_TOKEN_RHC = "n1srgwk8vpq8";
    private static final String FB_APP_ID_STRING = "674753905956192";
    private final AdjustManagedSdk2 activityLifecycleCallbacks;
    private final AppType appType;
    private final StateFlow2<Boolean> consentFlow;
    private final EventLogger eventLogger;
    private final AtomicBoolean initialized;
    private final CoroutineScope rootScope;

    /* compiled from: AdjustManagedSdk.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.RHC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppType.TRADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppType.NCW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [com.robinhood.adjust.AdjustManagedSdk$activityLifecycleCallbacks$1] */
    public AdjustManagedSdk(AppType appType, EventLogger eventLogger, @RootCoroutineScope CoroutineScope rootScope) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(rootScope, "rootScope");
        this.appType = appType;
        this.eventLogger = eventLogger;
        this.rootScope = rootScope;
        this.consentFlow = StateFlow4.MutableStateFlow(Boolean.FALSE);
        this.initialized = new AtomicBoolean(false);
        this.activityLifecycleCallbacks = new ActivityLifecycleListener() { // from class: com.robinhood.adjust.AdjustManagedSdk$activityLifecycleCallbacks$1
            @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                ActivityLifecycleListener.DefaultImpls.onActivityCreated(this, activity, bundle);
            }

            @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                ActivityLifecycleListener.DefaultImpls.onActivityDestroyed(this, activity);
            }

            @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                ActivityLifecycleListener.DefaultImpls.onActivitySaveInstanceState(this, activity, bundle);
            }

            @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                ActivityLifecycleListener.DefaultImpls.onActivityStarted(this, activity);
            }

            @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                ActivityLifecycleListener.DefaultImpls.onActivityStopped(this, activity);
            }

            @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Adjust.onResume();
            }

            @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Adjust.onPause();
            }
        };
    }

    @Override // com.robinhood.android.gdpr.GdprManagedSdk
    public String getName() {
        return Constants.LOGTAG;
    }

    @Override // com.robinhood.android.gdpr.GdprManagedSdk
    public GdprConsentCategory getConsentCategory() {
        return GdprConsentCategory.MARKETING;
    }

    public final String getAppId$lib_adjust_externalRelease() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        if (i == 1) {
            return ADJUST_APP_TOKEN_RHC;
        }
        if (i == 2) {
            return ADJUST_APP_TOKEN;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Adjust is not supported in NCW");
    }

    /* compiled from: AdjustManagedSdk.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.adjust.AdjustManagedSdk$onAppInitialized$1", m3645f = "AdjustManagedSdk.kt", m3646l = {55}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.adjust.AdjustManagedSdk$onAppInitialized$1 */
    /* loaded from: classes24.dex */
    static final class C72831 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C72831(Continuation<? super C72831> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdjustManagedSdk.this.new C72831(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C72831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AdjustManagedSdk.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.adjust.AdjustManagedSdk$onAppInitialized$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ AdjustManagedSdk $tmp0;

            AnonymousClass1(AdjustManagedSdk adjustManagedSdk) {
                this.$tmp0 = adjustManagedSdk;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, AdjustManagedSdk.class, "updateAdjust", "updateAdjust(Z)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) continuation);
            }

            public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$updateAdjust = C72831.invokeSuspend$updateAdjust(this.$tmp0, z, continuation);
                return objInvokeSuspend$updateAdjust == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$updateAdjust : Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$updateAdjust(AdjustManagedSdk adjustManagedSdk, boolean z, Continuation continuation) {
            adjustManagedSdk.updateAdjust(z);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2 stateFlow2 = AdjustManagedSdk.this.consentFlow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AdjustManagedSdk.this);
                this.label = 1;
                if (stateFlow2.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    @Override // com.robinhood.android.gdpr.GdprManagedSdk
    @SuppressLint({"CheckResult"})
    public void onAppInitialized(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        if (this.initialized.getAndSet(true)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.rootScope, null, null, new C72831(null), 3, null);
        AdjustConfig adjustConfig = new AdjustConfig(app, getAppId$lib_adjust_externalRelease(), "production");
        adjustConfig.setLogLevel(LogLevel.SUPPRESS);
        adjustConfig.setFbAppId(FB_APP_ID_STRING);
        app.unregisterActivityLifecycleCallbacks(this.activityLifecycleCallbacks);
        app.registerActivityLifecycleCallbacks(this.activityLifecycleCallbacks);
        Adjust.initSdk(adjustConfig);
        Adjust.getAdid(new OnAdidReadListener() { // from class: com.robinhood.adjust.AdjustManagedSdk.onAppInitialized.2
            @Override // com.adjust.sdk.OnAdidReadListener
            public final void onAdidRead(String str) {
                EventLogger eventLogger = AdjustManagedSdk.this.eventLogger;
                if (str == null) {
                    str = "";
                }
                eventLogger.updateAdjustDeviceId(str);
            }
        });
    }

    @Override // com.robinhood.android.gdpr.GdprManagedSdk
    public void updateConsentStatus(boolean isEnabled) {
        this.consentFlow.setValue(Boolean.valueOf(isEnabled));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAdjust(boolean isEnabled) {
        if (isEnabled) {
            Adjust.enable();
        } else {
            Adjust.disable();
        }
    }
}
