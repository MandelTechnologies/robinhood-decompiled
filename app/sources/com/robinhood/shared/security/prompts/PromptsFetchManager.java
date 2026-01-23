package com.robinhood.shared.security.prompts;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.robinhood.android.common.notification.NotificationManager;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.util.LockscreenManager;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.PromptsPendingChallengeResponse;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.security.contracts.PromptsHandlingInfo;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.lifecycle.ActivityLifecycleListener;
import com.robinhood.utils.logging.CrashReporter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import p479j$.time.Instant;

/* compiled from: PromptsFetchManager.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 )2\u00020\u0001:\u0001)BU\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010$\u001a\u0004\u0018\u00010%H\u0086@¢\u0006\u0002\u0010&J\r\u0010'\u001a\u00020 H\u0001¢\u0006\u0002\b(R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u00020\u00178\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/robinhood/shared/security/prompts/PromptsFetchManager;", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "context", "Landroid/content/Context;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "lockscreenManager", "Lcom/robinhood/android/util/LockscreenManager;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "sheriff", "Lcom/robinhood/api/retrofit/Sheriff;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "notificationManager", "Lcom/robinhood/android/common/notification/NotificationManager;", "promptsFetchKillswitch", "Lcom/robinhood/shared/security/prompts/PromptsFetchKillswitch;", "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/android/util/LockscreenManager;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/api/retrofit/Sheriff;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/common/notification/NotificationManager;Lcom/robinhood/shared/security/prompts/PromptsFetchKillswitch;)V", "notificationInterceptor", "Lcom/robinhood/android/common/notification/NotificationManager$Interceptor;", "getNotificationInterceptor$lib_prompts_externalRelease$annotations", "()V", "getNotificationInterceptor$lib_prompts_externalRelease", "()Lcom/robinhood/android/common/notification/NotificationManager$Interceptor;", "fetchingJob", "Lkotlinx/coroutines/Job;", "pendingCancelJob", "onActivityResumed", "", "activity", "Landroid/app/Activity;", "onActivityPaused", "fetchPendingChallengeHandlingInfo", "Lcom/robinhood/shared/security/contracts/PromptsHandlingInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startFetching", "startFetching$lib_prompts_externalRelease", "Companion", "lib-prompts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public class PromptsFetchManager implements ActivityLifecycleListener {
    private static final String ACTION_FETCH_PENDING_CHALLENGE = "fetch_pending_challenge";
    private static final String EXTRA_DEVICE_APPROVAL_ACTION = "device_approval_action";
    private static final long FETCH_INTERVAL_MS = 5000;
    private final AuthManager authManager;
    private final Context context;
    private final CoroutineScope coroutineScope;
    private final ExperimentsStore experimentsStore;
    private Job fetchingJob;
    private final LockscreenManager lockscreenManager;
    private final Navigator navigator;
    private final NotificationManager.Interceptor notificationInterceptor;
    private final NotificationManager notificationManager;
    private Job pendingCancelJob;
    private final PromptsFetchKillswitch promptsFetchKillswitch;
    private final Sheriff sheriff;

    /* compiled from: PromptsFetchManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.prompts.PromptsFetchManager", m3645f = "PromptsFetchManager.kt", m3646l = {80}, m3647m = "fetchPendingChallengeHandlingInfo")
    /* renamed from: com.robinhood.shared.security.prompts.PromptsFetchManager$fetchPendingChallengeHandlingInfo$1 */
    /* loaded from: classes6.dex */
    static final class C396701 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C396701(Continuation<? super C396701> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PromptsFetchManager.this.fetchPendingChallengeHandlingInfo(this);
        }
    }

    /* renamed from: getNotificationInterceptor$lib_prompts_externalRelease$annotations */
    public static /* synthetic */ void m2835x7c699e32() {
    }

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

    public PromptsFetchManager(Context context, @RootCoroutineScope CoroutineScope coroutineScope, AuthManager authManager, LockscreenManager lockscreenManager, Navigator navigator, Sheriff sheriff, ExperimentsStore experimentsStore, NotificationManager notificationManager, PromptsFetchKillswitch promptsFetchKillswitch) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(sheriff, "sheriff");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        Intrinsics.checkNotNullParameter(promptsFetchKillswitch, "promptsFetchKillswitch");
        this.context = context;
        this.coroutineScope = coroutineScope;
        this.authManager = authManager;
        this.lockscreenManager = lockscreenManager;
        this.navigator = navigator;
        this.sheriff = sheriff;
        this.experimentsStore = experimentsStore;
        this.notificationManager = notificationManager;
        this.promptsFetchKillswitch = promptsFetchKillswitch;
        this.notificationInterceptor = new NotificationManager.Interceptor() { // from class: com.robinhood.shared.security.prompts.PromptsFetchManager$notificationInterceptor$1
            @Override // com.robinhood.android.common.notification.NotificationManager.Interceptor
            public boolean intercept(Uri uri, Map<String, String> data) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                Intrinsics.checkNotNullParameter(data, "data");
                if (!this.this$0.authManager.isLoggedIn() || !Intrinsics.areEqual(data.get("device_approval_action"), "fetch_pending_challenge")) {
                    return false;
                }
                this.this$0.startFetching$lib_prompts_externalRelease();
                return true;
            }
        };
    }

    /* renamed from: getNotificationInterceptor$lib_prompts_externalRelease, reason: from getter */
    public final NotificationManager.Interceptor getNotificationInterceptor() {
        return this.notificationInterceptor;
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.notificationManager.addInterceptor(this.notificationInterceptor);
        Job job = this.pendingCancelJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        if (activity instanceof ExcludedFromPromptsFetching) {
            Job job2 = this.fetchingJob;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, null, 1, null);
                return;
            }
            return;
        }
        if (!this.authManager.isLoggedIn() || this.lockscreenManager.isLocked()) {
            return;
        }
        Job job3 = this.fetchingJob;
        if (job3 == null || !job3.isActive()) {
            startFetching$lib_prompts_externalRelease();
        }
    }

    /* compiled from: PromptsFetchManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.prompts.PromptsFetchManager$onActivityPaused$1", m3645f = "PromptsFetchManager.kt", m3646l = {73}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.security.prompts.PromptsFetchManager$onActivityPaused$1 */
    static final class C396711 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C396711(Continuation<? super C396711> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PromptsFetchManager.this.new C396711(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C396711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Job job = PromptsFetchManager.this.fetchingJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.notificationManager.removeInterceptor(this.notificationInterceptor);
        this.pendingCancelJob = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C396711(null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchPendingChallengeHandlingInfo(Continuation<? super PromptsHandlingInfo> continuation) {
        C396701 c396701;
        ArrayList arrayList;
        if (continuation instanceof C396701) {
            c396701 = (C396701) continuation;
            int i = c396701.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c396701.label = i - Integer.MIN_VALUE;
            } else {
                c396701 = new C396701(continuation);
            }
        }
        Object pendingChallenge = c396701.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c396701.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(pendingChallenge);
                Sheriff sheriff = this.sheriff;
                c396701.label = 1;
                pendingChallenge = sheriff.getPendingChallenge(c396701);
                if (pendingChallenge == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(pendingChallenge);
            }
            PromptsPendingChallengeResponse.PendingChallenge pendingChallenge2 = ((PromptsPendingChallengeResponse) pendingChallenge).getPendingChallenge();
            if (pendingChallenge2 == null) {
                return null;
            }
            UUID id = pendingChallenge2.getId();
            String flowId = pendingChallenge2.getFlowId();
            String deviceName = pendingChallenge2.getDeviceName();
            String deviceType = pendingChallenge2.getDeviceType();
            String location = pendingChallenge2.getLocation();
            Instant actionTime = pendingChallenge2.getActionTime();
            boolean silent = pendingChallenge2.getSilent();
            String title = pendingChallenge2.getTitle();
            String messageBody = pendingChallenge2.getMessageBody();
            String titleMarkdown = pendingChallenge2.getTitleMarkdown();
            String messageBodyMarkdown = pendingChallenge2.getMessageBodyMarkdown();
            Boolean showMap = pendingChallenge2.getShowMap();
            boolean zBooleanValue = showMap != null ? showMap.booleanValue() : false;
            List<PromptsPendingChallengeResponse.PendingChallenge.Location> mapCoordinates = pendingChallenge2.getMapCoordinates();
            if (mapCoordinates != null) {
                List<PromptsPendingChallengeResponse.PendingChallenge.Location> list = mapCoordinates;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (PromptsPendingChallengeResponse.PendingChallenge.Location location2 : list) {
                    arrayList2.add(new PromptsHandlingInfo.Location(location2.getLatitude(), location2.getLongitude(), location2.getDeviceLocation()));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            return new PromptsHandlingInfo(id, flowId, deviceName, deviceType, location, actionTime, silent, title, messageBody, titleMarkdown, messageBodyMarkdown, zBooleanValue, arrayList);
        } catch (Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
            return null;
        }
    }

    public final void startFetching$lib_prompts_externalRelease() {
        Job job = this.fetchingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.fetchingJob = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new PromptsFetchManager3(this, null), 3, null);
    }
}
