package com.robinhood.android.helm;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.shared.common.microgramdeeplinklaunch.RealMicrogramDeeplinkService;
import com.robinhood.shared.common.microgramuilaunch.RealMicrogramUiLaunchService2;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.logging.TimberLogger;
import com.robinhood.utils.moshi.LazyMoshi;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import microgram.android.service.ManagedServiceExtension2;
import microgram.contracts.helm.proto.p492v1.HelmClientService;
import microgram.contracts.helm.proto.p492v1.HelmService;
import microgram.contracts.helm.proto.p492v1.StartFlowRequestDto;
import timber.log.Timber;

/* compiled from: Helm.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B=\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0002J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ,\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/helm/Helm;", "", "application", "Landroid/app/Application;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "microgramCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Landroid/app/Application;Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/android/navigation/Navigator;Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)V", "helmClientService", "Lcom/robinhood/android/helm/RealHelmClientService;", "microgramComponent", "Lmicrogram/android/inject/MicrogramComponent;", "lifecycleScope", "start", "", "source", "", "callback", "Lcom/robinhood/android/helm/HelmCallback;", "onSubFlowFinished", "flowId", "subFlowId", "metadata", "", "Companion", "lib-helm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class Helm {
    private static final String GLOBAL_NOTIFICATION_ACTION = "com.robinhood.android.GLOBAL_NOTIFICATION";
    private static final String GLOBAL_NOTIFICATION_EXTRA_KEY = "GLOBAL_NOTIFICATION_EXTRA";
    private static final String GLOBAL_NOTIFICATION_ID_KEY = "GLOBAL_NOTIFICATION_ID";
    private static final String SUBFLOW_FINISHED_NOTIFICATION_ID = "helm_subflow_finished";
    private final Application application;
    private final Context context;
    private final RealHelmClientService helmClientService;
    private final CoroutineScope microgramCoroutineScope;
    private final MicrogramManager microgramManager;
    private final LazyMoshi moshi;
    private final Navigator navigator;
    public static final int $stable = 8;

    public Helm(Application application, MicrogramManager microgramManager, LazyMoshi moshi, Navigator navigator, Context context, @RootCoroutineScope CoroutineScope microgramCoroutineScope) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(microgramCoroutineScope, "microgramCoroutineScope");
        this.application = application;
        this.microgramManager = microgramManager;
        this.moshi = moshi;
        this.navigator = navigator;
        this.context = context;
        this.microgramCoroutineScope = microgramCoroutineScope;
        this.helmClientService = new RealHelmClientService();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MicrogramComponent microgramComponent(CoroutineScope lifecycleScope) {
        return RealMicrogramUiLaunchService2.getComponentWithUiLaunch(this.microgramManager, new RemoteMicrogramApplication("app-helm", null, 2, null), lifecycleScope, this.moshi, MapsKt.mapOf(ManagedServiceExtension2.providedBy(Reflection.getOrCreateKotlinClass(HelmClientService.class), this.helmClientService), RealMicrogramDeeplinkService.INSTANCE.getExtension(this.context, this.navigator)), new Function1() { // from class: com.robinhood.android.helm.Helm$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Helm.microgramComponent$lambda$0(this.f$0, (FragmentKey) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.helm.Helm$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Helm.microgramComponent$lambda$1((DialogFragmentKey) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit microgramComponent$lambda$0(Helm helm, FragmentKey fragmentKey) {
        Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
        Timber.INSTANCE.mo3350d("[Helm] microgram launchUI: " + fragmentKey, new Object[0]);
        HelmCallback callback = helm.helmClientService.getCallback();
        if (callback != null) {
            callback.launchUi(fragmentKey);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit microgramComponent$lambda$1(DialogFragmentKey dialogKey) {
        Intrinsics.checkNotNullParameter(dialogKey, "dialogKey");
        TimberLogger.INSTANCE.mo1679d("[Helm] launchDialog not supported: " + dialogKey, new Object[0]);
        return Unit.INSTANCE;
    }

    public final void start(String source, HelmCallback callback) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.helmClientService.setCallback(callback);
        BuildersKt__Builders_commonKt.launch$default(this.microgramCoroutineScope, null, null, new C183541(source, null), 3, null);
        TimberLogger.INSTANCE.mo1679d("[Helm] Starting", new Object[0]);
    }

    /* compiled from: Helm.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.helm.Helm$start$1", m3645f = "Helm.kt", m3646l = {60}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.helm.Helm$start$1 */
    static final class C183541 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $source;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C183541(String str, Continuation<? super C183541> continuation) {
            super(2, continuation);
            this.$source = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Helm.this.new C183541(this.$source, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C183541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Helm helm = Helm.this;
                HelmService helmService = (HelmService) helm.microgramComponent(helm.microgramCoroutineScope).getServiceLocator().getClient(HelmService.class);
                StartFlowRequestDto startFlowRequestDto = new StartFlowRequestDto(this.$source);
                this.label = 1;
                if (helmService.StartFlow(startFlowRequestDto, this) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onSubFlowFinished$default(Helm helm, String str, String str2, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        helm.onSubFlowFinished(str, str2, map);
    }

    public final void onSubFlowFinished(String flowId, String subFlowId, Map<String, String> metadata) {
        Intrinsics.checkNotNullParameter(flowId, "flowId");
        Intrinsics.checkNotNullParameter(subFlowId, "subFlowId");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        TimberLogger.INSTANCE.mo1679d("[Helm] Sending sub flow finished event for flow:" + flowId + " sub-flow:" + subFlowId, new Object[0]);
        Intent intent = new Intent(GLOBAL_NOTIFICATION_ACTION);
        intent.putExtra(GLOBAL_NOTIFICATION_ID_KEY, SUBFLOW_FINISHED_NOTIFICATION_ID);
        intent.putExtra(GLOBAL_NOTIFICATION_EXTRA_KEY, new HashMap(MapsKt.plus(metadata, MapsKt.mapOf(Tuples4.m3642to("flow_id", flowId), Tuples4.m3642to("subflow_id", subFlowId)))));
        this.application.sendBroadcast(intent);
    }
}
