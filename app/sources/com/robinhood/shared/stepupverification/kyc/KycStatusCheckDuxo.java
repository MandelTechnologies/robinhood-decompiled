package com.robinhood.shared.stepupverification.kyc;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.workflow.p358ui.screens.KycStatusCheckScreen;
import com.robinhood.models.workflow.p358ui.screens.UiWorkflowScreenAction;
import com.robinhood.models.workflow.p358ui.screens.UiWorkflowScreenActionResponse;
import com.robinhood.shared.security.contracts.KycStatusCheckFragmentKey;
import com.robinhood.shared.security.lib.workflow.WorkflowActionResult;
import com.robinhood.shared.security.lib.workflow.WorkflowManager;
import com.robinhood.shared.stepupverification.kyc.KycStatusCheckEvent;
import com.robinhood.time.annotation.ElapsedRealtime;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
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
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: KycStatusCheckDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\b\t\b\u0007\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001)B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\r\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0011J\r\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0011J\u0015\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R(\u0010(\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\"8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006*"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/kyc/KycStatusCheckDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/shared/stepupverification/kyc/KycStatusCheckViewState;", "Lcom/robinhood/shared/stepupverification/kyc/KycStatusCheckEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;", "workflowManager", "j$/time/Clock", Card.Icon.CLOCK, "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;Lj$/time/Clock;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "", "onPollExpired", "()V", "Lcom/robinhood/shared/security/lib/workflow/WorkflowActionResult;", "result", "handleActionResult", "(Lcom/robinhood/shared/security/lib/workflow/WorkflowActionResult;)V", "onCreate", "onUploaded", "onUploadFailed", "", "timedOut", "sendProceed", "(Z)V", "Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;", "Lj$/time/Clock;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "j$/time/Instant", "value", "getPollExpirationTime", "()Lj$/time/Instant;", "setPollExpirationTime", "(Lj$/time/Instant;)V", KycStatusCheckDuxo.POLL_EXPIRATION_TIME, "Companion", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class KycStatusCheckDuxo extends BaseDuxo5<KycStatusCheckViewState, KycStatusCheckEvent> implements HasSavedState {
    private static final long POLLING_INTERVAL_MILLIS = 5000;
    private static final String POLL_EXPIRATION_TIME = "pollExpirationTime";
    private final Clock clock;
    private final SavedStateHandle savedStateHandle;
    private final WorkflowManager workflowManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycStatusCheckDuxo(WorkflowManager workflowManager, @ElapsedRealtime Clock clock, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new KycStatusCheckViewState(false, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(workflowManager, "workflowManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.workflowManager = workflowManager;
        this.clock = clock;
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Instant getPollExpirationTime() {
        return (Instant) getSavedStateHandle().get(POLL_EXPIRATION_TIME);
    }

    private final void setPollExpirationTime(Instant instant) {
        getSavedStateHandle().set(POLL_EXPIRATION_TIME, instant);
    }

    /* compiled from: KycStatusCheckDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.kyc.KycStatusCheckDuxo$onCreate$1", m3645f = "KycStatusCheckDuxo.kt", m3646l = {41}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.kyc.KycStatusCheckDuxo$onCreate$1 */
    static final class C398831 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C398831(Continuation<? super C398831> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return KycStatusCheckDuxo.this.new C398831(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C398831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: KycStatusCheckDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.stepupverification.kyc.KycStatusCheckDuxo$onCreate$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ KycStatusCheckDuxo $tmp0;

            AnonymousClass1(KycStatusCheckDuxo kycStatusCheckDuxo) {
                this.$tmp0 = kycStatusCheckDuxo;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, KycStatusCheckDuxo.class, "handleActionResult", "handleActionResult(Lcom/robinhood/shared/security/lib/workflow/WorkflowActionResult;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(WorkflowActionResult workflowActionResult, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleActionResult = C398831.invokeSuspend$handleActionResult(this.$tmp0, workflowActionResult, continuation);
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
                Flow flowFilterNotNull = FlowKt.filterNotNull(KycStatusCheckDuxo.this.workflowManager.getActionResultFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(KycStatusCheckDuxo.this);
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
        public static final /* synthetic */ Object invokeSuspend$handleActionResult(KycStatusCheckDuxo kycStatusCheckDuxo, WorkflowActionResult workflowActionResult, Continuation continuation) {
            kycStatusCheckDuxo.handleActionResult(workflowActionResult);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C398831(null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C398842(null));
    }

    /* compiled from: KycStatusCheckDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.kyc.KycStatusCheckDuxo$onCreate$2", m3645f = "KycStatusCheckDuxo.kt", m3646l = {53}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.kyc.KycStatusCheckDuxo$onCreate$2 */
    static final class C398842 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C398842(Continuation<? super C398842> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return KycStatusCheckDuxo.this.new C398842(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C398842) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0 && i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            do {
                Instant pollExpirationTime = KycStatusCheckDuxo.this.getPollExpirationTime();
                if (pollExpirationTime != null) {
                    KycStatusCheckDuxo kycStatusCheckDuxo = KycStatusCheckDuxo.this;
                    if (kycStatusCheckDuxo.clock.instant().isAfter(pollExpirationTime)) {
                        kycStatusCheckDuxo.onPollExpired();
                        return Unit.INSTANCE;
                    }
                    kycStatusCheckDuxo.sendProceed(false);
                }
                this.label = 1;
            } while (DelayKt.delay(5000L, this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }

    public final void onUploaded() {
        WorkflowManager workflowManager = this.workflowManager;
        Companion companion = INSTANCE;
        workflowManager.sendActionRequest(((KycStatusCheckFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowId(), KycStatusCheckScreen.Action.Uploaded.INSTANCE, ((KycStatusCheckFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen());
    }

    public final void onUploadFailed() {
        WorkflowManager workflowManager = this.workflowManager;
        Companion companion = INSTANCE;
        workflowManager.sendActionRequest(((KycStatusCheckFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowId(), KycStatusCheckScreen.Action.UploadFailed.INSTANCE, ((KycStatusCheckFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen());
    }

    public final void sendProceed(boolean timedOut) {
        WorkflowManager workflowManager = this.workflowManager;
        Companion companion = INSTANCE;
        workflowManager.sendActionRequest(((KycStatusCheckFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowId(), new KycStatusCheckScreen.Action.Proceed(timedOut), ((KycStatusCheckFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPollExpired() {
        setPollExpirationTime(null);
        submit(KycStatusCheckEvent.TimedOut.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleActionResult(WorkflowActionResult result) {
        Throwable thConsumeError;
        UiWorkflowScreenAction action = result.getAction();
        if (action instanceof KycStatusCheckScreen.Action.Uploaded) {
            UiWorkflowScreenActionResponse uiWorkflowScreenActionResponseConsumeScreenActionResponse = result.consumeScreenActionResponse();
            if (uiWorkflowScreenActionResponseConsumeScreenActionResponse != null) {
                int timeoutSeconds = ((KycStatusCheckScreen.ActionResponse.Uploaded) uiWorkflowScreenActionResponseConsumeScreenActionResponse).getTimeoutSeconds();
                applyMutation(new KycStatusCheckDuxo2(null));
                setPollExpirationTime(this.clock.instant().plusSeconds(timeoutSeconds));
            }
            Throwable thConsumeError2 = result.consumeError();
            if (thConsumeError2 != null) {
                submit(new KycStatusCheckEvent.Error(thConsumeError2));
                return;
            }
            return;
        }
        if (((action instanceof KycStatusCheckScreen.Action.CustomerAbandon) || (action instanceof KycStatusCheckScreen.Action.Proceed)) && (thConsumeError = result.consumeError()) != null) {
            submit(new KycStatusCheckEvent.Error(thConsumeError));
        }
    }

    /* compiled from: KycStatusCheckDuxo.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/kyc/KycStatusCheckDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/stepupverification/kyc/KycStatusCheckDuxo;", "Lcom/robinhood/shared/security/contracts/KycStatusCheckFragmentKey;", "<init>", "()V", "POLL_EXPIRATION_TIME", "", "POLLING_INTERVAL_MILLIS", "", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<KycStatusCheckDuxo, KycStatusCheckFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public KycStatusCheckFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (KycStatusCheckFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public KycStatusCheckFragmentKey getArgs(KycStatusCheckDuxo kycStatusCheckDuxo) {
            return (KycStatusCheckFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, kycStatusCheckDuxo);
        }
    }
}
