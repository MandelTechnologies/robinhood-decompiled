package com.robinhood.shared.stepupverification.challenge.deviceapproval;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.lib.stepupverification.SuvConstants;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.PromptsStatusResponse;
import com.robinhood.models.workflow.p358ui.screens.DeviceApprovalChallengeScreen;
import com.robinhood.models.workflow.p358ui.screens.UiWorkflowScreenAction;
import com.robinhood.models.workflow.p358ui.screens.UiWorkflowScreenActionResponse;
import com.robinhood.rosetta.eventlogging.ChallengeContext;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeDataState;
import com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeStateProvider;
import com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeViewState;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.security.contracts.DeviceApprovalChallengeFragmentKey;
import com.robinhood.shared.security.lib.workflow.WorkflowActionResult;
import com.robinhood.shared.security.lib.workflow.WorkflowManager;
import com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeEvent;
import com.robinhood.utils.Preconditions;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: DeviceApprovalChallengeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 22\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u00012BI\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010\u001f\u001a\u00020\u001dJ\b\u0010 \u001a\u00020\u001dH\u0002J\u000e\u0010!\u001a\u00020\"H\u0082@¢\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\u001dH\u0002J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020'H\u0002J\u0018\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\"H\u0002J\u0010\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020.H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00063"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/deviceapproval/DeviceApprovalChallengeDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeDataState;", "Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeViewState;", "Lcom/robinhood/shared/stepupverification/challenge/deviceapproval/DeviceApprovalChallengeEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "sheriff", "Lcom/robinhood/api/retrofit/Sheriff;", "workflowManager", "Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeStateProvider;", "<init>", "(Lcom/robinhood/api/retrofit/Sheriff;Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;Lcom/robinhood/analytics/EventLogger;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", ErrorResponse.CHALLENGE, "Lcom/robinhood/models/api/Challenge;", "onCreate", "", "resendNotification", "onSecondaryCtaClicked", "startPolling", "getChallengeStatus", "Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeDataState$ChallengeStatus;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onChallengeCompleted", "handleActionResult", "result", "Lcom/robinhood/shared/security/lib/workflow/WorkflowActionResult;", "logAction", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "challengeStatus", "logBlockedScreen", "type", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$DeviceApprovalBlockedType;", "getEventLoggingContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "blockedType", "Companion", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class DeviceApprovalChallengeDuxo extends BaseDuxo3<DeviceApprovalChallengeDataState, DeviceApprovalChallengeViewState, DeviceApprovalChallengeEvent> implements HasSavedState {
    private static final long POLL_INTERVAL_MILLIS = 2000;
    public static final String REMAINING_ATTEMPTS = "remainingAttempts";
    private Challenge challenge;
    private final EventLogger eventLogger;
    private final SavedStateHandle savedStateHandle;
    private final Sheriff sheriff;
    private final WorkflowManager workflowManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DeviceApprovalChallengeDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PromptsStatusResponse.PromptsChallengeStatus.values().length];
            try {
                iArr[PromptsStatusResponse.PromptsChallengeStatus.VALIDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PromptsStatusResponse.PromptsChallengeStatus.REDEEMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PromptsStatusResponse.PromptsChallengeStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PromptsStatusResponse.PromptsChallengeStatus.EXPIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PromptsStatusResponse.PromptsChallengeStatus.ISSUED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DeviceApprovalChallengeDataState.ChallengeStatus.values().length];
            try {
                iArr2[DeviceApprovalChallengeDataState.ChallengeStatus.BLOCKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DeviceApprovalChallengeDataState.ChallengeStatus.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DeviceApprovalChallengeDataState.ChallengeStatus.TIMEOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: DeviceApprovalChallengeDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeDuxo", m3645f = "DeviceApprovalChallengeDuxo.kt", m3646l = {116}, m3647m = "getChallengeStatus")
    /* renamed from: com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeDuxo$getChallengeStatus$1 */
    static final class C398031 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C398031(Continuation<? super C398031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceApprovalChallengeDuxo.this.getChallengeStatus(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DeviceApprovalChallengeDuxo(Sheriff sheriff, WorkflowManager workflowManager, EventLogger eventLogger, SavedStateHandle savedStateHandle, AppType appType, AuthManager authManager, DuxoBundle duxoBundle, DeviceApprovalChallengeStateProvider stateProvider) {
        Intrinsics.checkNotNullParameter(sheriff, "sheriff");
        Intrinsics.checkNotNullParameter(workflowManager, "workflowManager");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Companion companion = INSTANCE;
        super(new DeviceApprovalChallengeDataState(null, false, ((DeviceApprovalChallengeFragmentKey) companion.getArgs(savedStateHandle)).getWorkflowScreen().getFallbackCtaText(), authManager.isLoggedIn(), appType == AppType.RHC, null, false, 99, null), stateProvider, duxoBundle);
        this.sheriff = sheriff;
        this.workflowManager = workflowManager;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
        this.challenge = ((DeviceApprovalChallengeFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen().getSheriffChallenge();
    }

    /* compiled from: DeviceApprovalChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeDuxo$onCreate$1", m3645f = "DeviceApprovalChallengeDuxo.kt", m3646l = {59}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeDuxo$onCreate$1 */
    static final class C398071 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C398071(Continuation<? super C398071> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceApprovalChallengeDuxo.this.new C398071(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C398071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: DeviceApprovalChallengeDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeDuxo$onCreate$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ DeviceApprovalChallengeDuxo $tmp0;

            AnonymousClass1(DeviceApprovalChallengeDuxo deviceApprovalChallengeDuxo) {
                this.$tmp0 = deviceApprovalChallengeDuxo;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, DeviceApprovalChallengeDuxo.class, "handleActionResult", "handleActionResult(Lcom/robinhood/shared/security/lib/workflow/WorkflowActionResult;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(WorkflowActionResult workflowActionResult, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleActionResult = C398071.invokeSuspend$handleActionResult(this.$tmp0, workflowActionResult, continuation);
                return objInvokeSuspend$handleActionResult == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleActionResult : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((WorkflowActionResult) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(DeviceApprovalChallengeDuxo.this.workflowManager.getActionResultFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DeviceApprovalChallengeDuxo.this);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleActionResult(DeviceApprovalChallengeDuxo deviceApprovalChallengeDuxo, WorkflowActionResult workflowActionResult, Continuation continuation) {
            deviceApprovalChallengeDuxo.handleActionResult(workflowActionResult);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C398071(null));
        startPolling();
    }

    /* compiled from: DeviceApprovalChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeDuxo$resendNotification$1", m3645f = "DeviceApprovalChallengeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeDuxo$resendNotification$1 */
    static final class C398091 extends ContinuationImpl7 implements Function2<DeviceApprovalChallengeDataState, Continuation<? super DeviceApprovalChallengeDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C398091(Continuation<? super C398091> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C398091 c398091 = DeviceApprovalChallengeDuxo.this.new C398091(continuation);
            c398091.L$0 = obj;
            return c398091;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceApprovalChallengeDataState deviceApprovalChallengeDataState, Continuation<? super DeviceApprovalChallengeDataState> continuation) {
            return ((C398091) create(deviceApprovalChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceApprovalChallengeDataState deviceApprovalChallengeDataState = (DeviceApprovalChallengeDataState) this.L$0;
                DeviceApprovalChallengeDuxo.this.logAction(UserInteractionEventData.Action.RESEND_CHALLENGE, deviceApprovalChallengeDataState.getChallengeStatus());
                return DeviceApprovalChallengeDataState.copy$default(deviceApprovalChallengeDataState, null, true, null, false, false, null, false, 125, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void resendNotification() {
        applyMutation(new C398091(null));
        WorkflowManager workflowManager = this.workflowManager;
        Companion companion = INSTANCE;
        workflowManager.sendActionRequest(((DeviceApprovalChallengeFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowId(), DeviceApprovalChallengeScreen.Action.Resend.INSTANCE, ((DeviceApprovalChallengeFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen());
    }

    /* compiled from: DeviceApprovalChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeDuxo$onSecondaryCtaClicked$1", m3645f = "DeviceApprovalChallengeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeDuxo$onSecondaryCtaClicked$1 */
    static final class C398081 extends ContinuationImpl7 implements Function2<DeviceApprovalChallengeDataState, Continuation<? super DeviceApprovalChallengeDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C398081(Continuation<? super C398081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C398081 c398081 = DeviceApprovalChallengeDuxo.this.new C398081(continuation);
            c398081.L$0 = obj;
            return c398081;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceApprovalChallengeDataState deviceApprovalChallengeDataState, Continuation<? super DeviceApprovalChallengeDataState> continuation) {
            return ((C398081) create(deviceApprovalChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceApprovalChallengeDataState deviceApprovalChallengeDataState = (DeviceApprovalChallengeDataState) this.L$0;
                DeviceApprovalChallengeDuxo.this.logAction(UserInteractionEventData.Action.CHALLENGE_FALLBACK, deviceApprovalChallengeDataState.getChallengeStatus());
                return DeviceApprovalChallengeDataState.copy$default(deviceApprovalChallengeDataState, null, true, null, false, false, null, false, 125, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onSecondaryCtaClicked() {
        applyMutation(new C398081(null));
        WorkflowManager workflowManager = this.workflowManager;
        Companion companion = INSTANCE;
        workflowManager.sendActionRequest(((DeviceApprovalChallengeFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowId(), DeviceApprovalChallengeScreen.Action.Fallback.INSTANCE, ((DeviceApprovalChallengeFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen());
    }

    /* compiled from: DeviceApprovalChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeDuxo$startPolling$1", m3645f = "DeviceApprovalChallengeDuxo.kt", m3646l = {92, 98}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeDuxo$startPolling$1 */
    static final class C398101 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* compiled from: DeviceApprovalChallengeDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeDuxo$startPolling$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DeviceApprovalChallengeDataState.ChallengeStatus.values().length];
                try {
                    iArr[DeviceApprovalChallengeDataState.ChallengeStatus.LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DeviceApprovalChallengeDataState.ChallengeStatus.BLOCKED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DeviceApprovalChallengeDataState.ChallengeStatus.TIMEOUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[DeviceApprovalChallengeDataState.ChallengeStatus.COMPLETE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[DeviceApprovalChallengeDataState.ChallengeStatus.ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C398101(Continuation<? super C398101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceApprovalChallengeDuxo.this.new C398101(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C398101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0075 A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:6:0x000f, B:13:0x0022, B:16:0x002d, B:25:0x004e, B:26:0x0053, B:27:0x0054, B:28:0x005e, B:29:0x005f, B:30:0x0065, B:31:0x006d, B:32:0x0075, B:10:0x001b), top: B:38:0x0009 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x007d -> B:13:0x0022). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            try {
            } catch (Throwable unused) {
                DeviceApprovalChallengeDuxo.this.logBlockedScreen(ChallengeContext.DeviceApprovalBlockedType.ERROR);
                DeviceApprovalChallengeDuxo.this.applyMutation(new AnonymousClass2(null));
            }
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    DeviceApprovalChallengeDataState.ChallengeStatus challengeStatus = (DeviceApprovalChallengeDataState.ChallengeStatus) obj;
                    DeviceApprovalChallengeDuxo.this.applyMutation(new AnonymousClass1(challengeStatus, null));
                    i = WhenMappings.$EnumSwitchMapping$0[challengeStatus.ordinal()];
                    if (i != 1) {
                        this.label = 2;
                        if (DelayKt.delay(2000L, this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i == 2) {
                        DeviceApprovalChallengeDuxo.this.logBlockedScreen(ChallengeContext.DeviceApprovalBlockedType.DENIED);
                    } else if (i == 3) {
                        DeviceApprovalChallengeDuxo.this.logBlockedScreen(ChallengeContext.DeviceApprovalBlockedType.TIMEOUT);
                    } else {
                        if (i != 4) {
                            if (i != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Preconditions.INSTANCE.failUnexpectedItemKotlin(challengeStatus);
                            throw new ExceptionsH();
                        }
                        DeviceApprovalChallengeDuxo.this.onChallengeCompleted();
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            DeviceApprovalChallengeDuxo deviceApprovalChallengeDuxo = DeviceApprovalChallengeDuxo.this;
            this.label = 1;
            obj = deviceApprovalChallengeDuxo.getChallengeStatus(this);
            if (obj != coroutine_suspended) {
                DeviceApprovalChallengeDataState.ChallengeStatus challengeStatus2 = (DeviceApprovalChallengeDataState.ChallengeStatus) obj;
                DeviceApprovalChallengeDuxo.this.applyMutation(new AnonymousClass1(challengeStatus2, null));
                i = WhenMappings.$EnumSwitchMapping$0[challengeStatus2.ordinal()];
                if (i != 1) {
                }
            }
            return coroutine_suspended;
        }

        /* compiled from: DeviceApprovalChallengeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeDuxo$startPolling$1$1", m3645f = "DeviceApprovalChallengeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeDuxo$startPolling$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DeviceApprovalChallengeDataState, Continuation<? super DeviceApprovalChallengeDataState>, Object> {
            final /* synthetic */ DeviceApprovalChallengeDataState.ChallengeStatus $status;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DeviceApprovalChallengeDataState.ChallengeStatus challengeStatus, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$status = challengeStatus;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$status, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DeviceApprovalChallengeDataState deviceApprovalChallengeDataState, Continuation<? super DeviceApprovalChallengeDataState> continuation) {
                return ((AnonymousClass1) create(deviceApprovalChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return DeviceApprovalChallengeDataState.copy$default((DeviceApprovalChallengeDataState) this.L$0, this.$status, false, null, false, false, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            }
        }

        /* compiled from: DeviceApprovalChallengeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeDuxo$startPolling$1$2", m3645f = "DeviceApprovalChallengeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeDuxo$startPolling$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<DeviceApprovalChallengeDataState, Continuation<? super DeviceApprovalChallengeDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DeviceApprovalChallengeDataState deviceApprovalChallengeDataState, Continuation<? super DeviceApprovalChallengeDataState> continuation) {
                return ((AnonymousClass2) create(deviceApprovalChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return DeviceApprovalChallengeDataState.copy$default((DeviceApprovalChallengeDataState) this.L$0, DeviceApprovalChallengeDataState.ChallengeStatus.ERROR, false, null, false, false, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            }
        }
    }

    private final void startPolling() {
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C398101(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getChallengeStatus(Continuation<? super DeviceApprovalChallengeDataState.ChallengeStatus> continuation) {
        C398031 c398031;
        if (continuation instanceof C398031) {
            c398031 = (C398031) continuation;
            int i = c398031.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c398031.label = i - Integer.MIN_VALUE;
            } else {
                c398031 = new C398031(continuation);
            }
        }
        Object promptsChallengeStatus = c398031.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c398031.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(promptsChallengeStatus);
            Sheriff sheriff = this.sheriff;
            UUID id = this.challenge.getId();
            c398031.label = 1;
            promptsChallengeStatus = sheriff.getPromptsChallengeStatus(id, c398031);
            if (promptsChallengeStatus == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(promptsChallengeStatus);
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[((PromptsStatusResponse) promptsChallengeStatus).getChallengeStatus().ordinal()];
        if (i3 == 1 || i3 == 2) {
            return DeviceApprovalChallengeDataState.ChallengeStatus.COMPLETE;
        }
        if (i3 == 3) {
            return DeviceApprovalChallengeDataState.ChallengeStatus.BLOCKED;
        }
        if (i3 == 4) {
            return DeviceApprovalChallengeDataState.ChallengeStatus.TIMEOUT;
        }
        if (i3 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return DeviceApprovalChallengeDataState.ChallengeStatus.LOADING;
    }

    /* compiled from: DeviceApprovalChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeDuxo$onChallengeCompleted$1", m3645f = "DeviceApprovalChallengeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeDuxo$onChallengeCompleted$1 */
    static final class C398061 extends ContinuationImpl7 implements Function2<DeviceApprovalChallengeDataState, Continuation<? super DeviceApprovalChallengeDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C398061(Continuation<? super C398061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C398061 c398061 = new C398061(continuation);
            c398061.L$0 = obj;
            return c398061;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceApprovalChallengeDataState deviceApprovalChallengeDataState, Continuation<? super DeviceApprovalChallengeDataState> continuation) {
            return ((C398061) create(deviceApprovalChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return DeviceApprovalChallengeDataState.copy$default((DeviceApprovalChallengeDataState) this.L$0, null, true, null, false, false, null, false, 125, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onChallengeCompleted() {
        applyMutation(new C398061(null));
        EventLogger eventLogger = this.eventLogger;
        Screen.Name name = Screen.Name.DEVICE_APPROVAL_LOGIN_APPROVED;
        Companion companion = INSTANCE;
        EventLogger.DefaultImpls.logScreenAppear$default(eventLogger, null, new Screen(name, null, ((DeviceApprovalChallengeFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen().getSheriffFlowId(), null, 10, null), null, null, null, 29, null);
        this.workflowManager.sendActionRequest(((DeviceApprovalChallengeFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowId(), DeviceApprovalChallengeScreen.Action.Proceed.INSTANCE, ((DeviceApprovalChallengeFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleActionResult(WorkflowActionResult result) {
        UiWorkflowScreenAction action = result.getAction();
        if (action instanceof DeviceApprovalChallengeScreen.Action.Resend) {
            applyMutation(new C398041(null));
            UiWorkflowScreenActionResponse uiWorkflowScreenActionResponseConsumeScreenActionResponse = result.consumeScreenActionResponse();
            if (uiWorkflowScreenActionResponseConsumeScreenActionResponse != null) {
                this.challenge = ((DeviceApprovalChallengeScreen.ActionResponse.Resend) uiWorkflowScreenActionResponseConsumeScreenActionResponse).getSheriffChallenge();
                startPolling();
            }
            Throwable thConsumeError = result.consumeError();
            if (thConsumeError != null) {
                logBlockedScreen(ChallengeContext.DeviceApprovalBlockedType.ERROR);
                submit(new DeviceApprovalChallengeEvent.Error(thConsumeError));
                return;
            }
            return;
        }
        if ((action instanceof DeviceApprovalChallengeScreen.Action.Proceed) || (action instanceof DeviceApprovalChallengeScreen.Action.Fallback)) {
            applyMutation(new C398054(null));
            Throwable thConsumeError2 = result.consumeError();
            if (thConsumeError2 != null) {
                logBlockedScreen(ChallengeContext.DeviceApprovalBlockedType.ERROR);
                submit(new DeviceApprovalChallengeEvent.Error(thConsumeError2));
            }
        }
    }

    /* compiled from: DeviceApprovalChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeDuxo$handleActionResult$1", m3645f = "DeviceApprovalChallengeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeDuxo$handleActionResult$1 */
    static final class C398041 extends ContinuationImpl7 implements Function2<DeviceApprovalChallengeDataState, Continuation<? super DeviceApprovalChallengeDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C398041(Continuation<? super C398041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C398041 c398041 = new C398041(continuation);
            c398041.L$0 = obj;
            return c398041;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceApprovalChallengeDataState deviceApprovalChallengeDataState, Continuation<? super DeviceApprovalChallengeDataState> continuation) {
            return ((C398041) create(deviceApprovalChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return DeviceApprovalChallengeDataState.copy$default((DeviceApprovalChallengeDataState) this.L$0, null, false, null, false, false, null, false, 125, null);
        }
    }

    /* compiled from: DeviceApprovalChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeDuxo$handleActionResult$4", m3645f = "DeviceApprovalChallengeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeDuxo$handleActionResult$4 */
    static final class C398054 extends ContinuationImpl7 implements Function2<DeviceApprovalChallengeDataState, Continuation<? super DeviceApprovalChallengeDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C398054(Continuation<? super C398054> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C398054 c398054 = new C398054(continuation);
            c398054.L$0 = obj;
            return c398054;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceApprovalChallengeDataState deviceApprovalChallengeDataState, Continuation<? super DeviceApprovalChallengeDataState> continuation) {
            return ((C398054) create(deviceApprovalChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return DeviceApprovalChallengeDataState.copy$default((DeviceApprovalChallengeDataState) this.L$0, null, false, null, false, false, null, false, 125, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logAction(UserInteractionEventData.Action action, DeviceApprovalChallengeDataState.ChallengeStatus challengeStatus) {
        Screen.Name name;
        ChallengeContext.DeviceApprovalBlockedType deviceApprovalBlockedType;
        EventLogger eventLogger = this.eventLogger;
        if (challengeStatus == DeviceApprovalChallengeDataState.ChallengeStatus.LOADING) {
            name = Screen.Name.DEVICE_APPROVAL_WAITING;
        } else {
            name = Screen.Name.DEVICE_APPROVAL_WAITING_BLOCKED;
        }
        Screen screen = new Screen(name, null, ((DeviceApprovalChallengeFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getWorkflowScreen().getSheriffFlowId(), null, 10, null);
        int i = WhenMappings.$EnumSwitchMapping$1[challengeStatus.ordinal()];
        if (i == 1) {
            deviceApprovalBlockedType = ChallengeContext.DeviceApprovalBlockedType.DENIED;
        } else if (i == 2) {
            deviceApprovalBlockedType = ChallengeContext.DeviceApprovalBlockedType.ERROR;
        } else if (i == 3) {
            deviceApprovalBlockedType = ChallengeContext.DeviceApprovalBlockedType.TIMEOUT;
        } else {
            deviceApprovalBlockedType = ChallengeContext.DeviceApprovalBlockedType.DEVICE_APPROVAL_BLOCKED_TYPE_UNSPECIFIED;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, null, null, getEventLoggingContext(deviceApprovalBlockedType), false, 44, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logBlockedScreen(ChallengeContext.DeviceApprovalBlockedType type2) {
        EventLogger.DefaultImpls.logScreenAppear$default(this.eventLogger, null, new Screen(Screen.Name.DEVICE_APPROVAL_WAITING_BLOCKED, null, ((DeviceApprovalChallengeFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getWorkflowScreen().getSheriffFlowId(), null, 10, null), null, null, getEventLoggingContext(type2), 13, null);
    }

    private final Context getEventLoggingContext(ChallengeContext.DeviceApprovalBlockedType blockedType) {
        Companion companion = INSTANCE;
        String string2 = ((DeviceApprovalChallengeFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen().getSheriffChallenge().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String string3 = ((DeviceApprovalChallengeFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowId().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ChallengeContext(null, string2, null, null, null, string3, null, blockedType, null, SuvConstants.DEFAULT_FLOW_ID, null, null, 3421, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -4097, -1, -1, -1, 16383, null);
    }

    /* compiled from: DeviceApprovalChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0005R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/deviceapproval/DeviceApprovalChallengeDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/stepupverification/challenge/deviceapproval/DeviceApprovalChallengeDuxo;", "Lcom/robinhood/shared/security/contracts/DeviceApprovalChallengeFragmentKey;", "<init>", "()V", "REMAINING_ATTEMPTS", "", "getREMAINING_ATTEMPTS$feature_step_up_verification_externalDebug$annotations", "POLL_INTERVAL_MILLIS", "", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DeviceApprovalChallengeDuxo, DeviceApprovalChallengeFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getREMAINING_ATTEMPTS$feature_step_up_verification_externalDebug$annotations */
        public static /* synthetic */ void m2839x6dd0079d() {
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DeviceApprovalChallengeFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (DeviceApprovalChallengeFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DeviceApprovalChallengeFragmentKey getArgs(DeviceApprovalChallengeDuxo deviceApprovalChallengeDuxo) {
            return (DeviceApprovalChallengeFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, deviceApprovalChallengeDuxo);
        }
    }
}
