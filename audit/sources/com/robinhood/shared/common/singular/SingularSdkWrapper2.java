package com.robinhood.shared.common.singular;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.lifecycle.ActivityLifecycleListener;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.TimberLogger;
import com.singular.sdk.SDIDAccessorHandler;
import com.singular.sdk.Singular;
import com.singular.sdk.SingularConfig;
import com.singular.sdk.SingularLinkHandler;
import com.singular.sdk.SingularLinkParams;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;

/* compiled from: SingularSdkWrapper.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB/\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u0016H\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/common/singular/RealSingularSdkWrapper;", "Lcom/robinhood/shared/common/singular/SingularSdkWrapper;", "appContext", "Landroid/content/Context;", "disableTrackingPref", "Lcom/robinhood/prefs/BooleanPreference;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Landroid/content/Context;Lcom/robinhood/prefs/BooleanPreference;Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/analytics/EventLogger;)V", "urlParamsRelay", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/robinhood/shared/common/singular/LinkParams;", "lastKnownData", "Landroid/net/Uri;", "init", "", "intent", "Landroid/content/Intent;", "listener", "Lkotlin/Function1;", "activityLifecycleCallbacks", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "getActivityLifecycleCallbacks", "()Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "enableSingular", "disableSingular", "Companion", "lib-singular_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.common.singular.RealSingularSdkWrapper, reason: use source file name */
/* loaded from: classes26.dex */
public final class SingularSdkWrapper2 implements SingularSdkWrapper {
    private static final String FB_APP_ID_STRING = "674753905956192";
    private static final String SINGULAR_SDK_KEY = "robinhood_acd79726";
    private static final String SINGULAR_SDK_SECRET = "2dfd9e2bcb8721e931ed33fd786edffe";
    private final Context appContext;
    private final CoroutineScope coroutineScope;
    private final BooleanPreference disableTrackingPref;
    private final EventLogger eventLogger;
    private Uri lastKnownData;
    private final SharedFlow2<LinkParams> urlParamsRelay;

    public SingularSdkWrapper2(Context appContext, @SingularDisableTrackingPref BooleanPreference disableTrackingPref, @RootCoroutineScope CoroutineScope coroutineScope, EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(disableTrackingPref, "disableTrackingPref");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.appContext = appContext;
        this.disableTrackingPref = disableTrackingPref;
        this.coroutineScope = coroutineScope;
        this.eventLogger = eventLogger;
        this.urlParamsRelay = SharedFlow4.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
    }

    @Override // com.robinhood.shared.common.singular.SingularSdkWrapper
    public void init(Intent intent, final Function1<? super LinkParams, Unit> listener) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.lastKnownData != null && Intrinsics.areEqual(intent.getData(), this.lastKnownData)) {
            TimberLogger.INSTANCE.mo1679d("[Singular] SDK initialized with the same url, relaying cached params: " + intent.getData(), new Object[0]);
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C374871(listener, null), 3, null);
        } else {
            this.lastKnownData = intent.getData();
            TimberLogger.INSTANCE.mo1679d("[Singular] initializing SDK: " + intent.getData(), new Object[0]);
            try {
                Singular.init(this.appContext, new SingularConfig(SINGULAR_SDK_KEY, SINGULAR_SDK_SECRET).withFacebookAppId(FB_APP_ID_STRING).withLoggingEnabled().withLogLevel(1).withSingularLink(intent, new SingularLinkHandler() { // from class: com.robinhood.shared.common.singular.RealSingularSdkWrapper$init$config$1
                    @Override // com.singular.sdk.SingularLinkHandler
                    public final void onResolved(SingularLinkParams singularLinkParams) {
                        Intrinsics.checkNotNull(singularLinkParams);
                        LinkParams linkParams = LinkParams2.toLinkParams(singularLinkParams);
                        TimberLogger.INSTANCE.mo1679d("[Singular] Link parsed with params:" + linkParams, new Object[0]);
                        listener.invoke(linkParams);
                        this.urlParamsRelay.tryEmit(linkParams);
                    }
                }).withSdidAccessorHandler(new SDIDAccessorHandler() { // from class: com.robinhood.shared.common.singular.RealSingularSdkWrapper$init$config$2
                    @Override // com.singular.sdk.SDIDAccessorHandler
                    public void didSetSdid(String p0) {
                    }

                    @Override // com.singular.sdk.SDIDAccessorHandler
                    public void sdidReceived(String p0) {
                        EventLogger eventLogger = this.this$0.eventLogger;
                        if (p0 == null) {
                            p0 = "";
                        }
                        eventLogger.updateSingularDeviceId(p0);
                    }
                }));
            } catch (Exception e) {
                TimberLogger.INSTANCE.mo1679d("[Singular] unable to initialize SDK", new Object[0]);
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
                Unit unit = Unit.INSTANCE;
            }
        }
        if (this.disableTrackingPref.get()) {
            TimberLogger.INSTANCE.mo1679d("[Singular] disabling tracking", new Object[0]);
            Singular.stopAllTracking();
        }
    }

    /* compiled from: SingularSdkWrapper.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.singular.RealSingularSdkWrapper$init$1", m3645f = "SingularSdkWrapper.kt", m3646l = {62}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.common.singular.RealSingularSdkWrapper$init$1 */
    static final class C374871 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<LinkParams, Unit> $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C374871(Function1<? super LinkParams, Unit> function1, Continuation<? super C374871> continuation) {
            super(2, continuation);
            this.$listener = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SingularSdkWrapper2.this.new C374871(this.$listener, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C374871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow2 sharedFlow2 = SingularSdkWrapper2.this.urlParamsRelay;
                    Duration.Companion companion = Duration.INSTANCE;
                    Flow flowM28821timeoutHG0u8IE = FlowKt.m28821timeoutHG0u8IE(sharedFlow2, Duration3.toDuration(1, DurationUnitJvm.SECONDS));
                    this.label = 1;
                    obj = FlowKt.first(flowM28821timeoutHG0u8IE, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                LinkParams linkParams = (LinkParams) obj;
                TimberLogger.INSTANCE.mo1679d("[Singular] Relayed cached params: " + linkParams, new Object[0]);
                this.$listener.invoke(linkParams);
            } catch (Exception e) {
                TimberLogger.INSTANCE.mo1682e(e, "[Singular] Failed to fetch cached url params", new Object[0]);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.shared.common.singular.SingularSdkWrapper
    public ActivityLifecycleListener getActivityLifecycleCallbacks() {
        return new ActivityLifecycleListener() { // from class: com.robinhood.shared.common.singular.RealSingularSdkWrapper$activityLifecycleCallbacks$1
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
                Singular.onActivityResumed();
            }

            @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Singular.onActivityPaused();
            }
        };
    }

    @Override // com.robinhood.shared.common.singular.SingularSdkWrapper
    public void enableSingular() {
        TimberLogger.INSTANCE.mo1679d("[Singular] SDK: enabling tracking", new Object[0]);
        Singular.resumeAllTracking();
        this.disableTrackingPref.set(false);
    }

    @Override // com.robinhood.shared.common.singular.SingularSdkWrapper
    public void disableSingular() {
        TimberLogger.INSTANCE.mo1679d("[Singular] SDK: disabling tracking", new Object[0]);
        Singular.stopAllTracking();
        this.disableTrackingPref.set(true);
    }
}
