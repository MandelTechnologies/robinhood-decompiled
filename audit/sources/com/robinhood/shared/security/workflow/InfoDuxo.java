package com.robinhood.shared.security.workflow;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.workflow.p358ui.UiWorkflowActionResponse;
import com.robinhood.models.workflow.p358ui.screens.InfoScreen;
import com.robinhood.shared.security.contracts.InfoFragmentKey;
import com.robinhood.shared.security.lib.workflow.WorkflowActionResult;
import com.robinhood.shared.security.lib.workflow.WorkflowManager;
import com.robinhood.shared.security.workflow.InfoEvent;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: InfoDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001aB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/security/workflow/InfoDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/shared/security/workflow/InfoViewState;", "Lcom/robinhood/shared/security/workflow/InfoEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "workflowManager", "Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "invalidParams", "", "getInvalidParams", "()Z", "toolbarVisible", "getToolbarVisible", "onCreate", "", "onPrimaryCtaClicked", "onSecondaryCtaClicked", "onBackPressed", "Companion", "feature-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class InfoDuxo extends BaseDuxo5<InfoViewState, InfoEvent> implements HasSavedState {
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
    public InfoDuxo(WorkflowManager workflowManager, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new InfoViewState(false), duxoBundle);
        Intrinsics.checkNotNullParameter(workflowManager, "workflowManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.workflowManager = workflowManager;
        this.savedStateHandle = savedStateHandle;
    }

    private final boolean getInvalidParams() {
        Companion companion = INSTANCE;
        return ((InfoFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen().getPrimaryCtaText() == null && ((InfoFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen().getSecondaryCtaText() == null && ((InfoFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen().getCloseBtnCallback() == null;
    }

    public final boolean getToolbarVisible() {
        return ((InfoFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getWorkflowScreen().getCloseBtnCallback() != null || getInvalidParams();
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        if (getInvalidParams()) {
            CrashReporter.INSTANCE.reportNonFatal(new IllegalArgumentException("All CTA buttons are null"), false, new EventMetadata(SentryTeam.AUTH_AND_SAFETY, null, null, 6, null));
        } else {
            getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C397541(null));
        }
    }

    /* compiled from: InfoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.workflow.InfoDuxo$onCreate$1", m3645f = "InfoDuxo.kt", m3646l = {53}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.security.workflow.InfoDuxo$onCreate$1 */
    static final class C397541 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C397541(Continuation<? super C397541> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InfoDuxo.this.new C397541(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C397541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowFilterNotNull = FlowKt.filterNotNull(InfoDuxo.this.workflowManager.getActionResultFlow());
                Flow<WorkflowActionResult> flow = new Flow<WorkflowActionResult>() { // from class: com.robinhood.shared.security.workflow.InfoDuxo$onCreate$1$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.security.workflow.InfoDuxo$onCreate$1$invokeSuspend$$inlined$filter$1$2 */
                    public static final class C397532<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.security.workflow.InfoDuxo$onCreate$1$invokeSuspend$$inlined$filter$1$2", m3645f = "InfoDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.security.workflow.InfoDuxo$onCreate$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C397532.this.emit(null, this);
                            }
                        }

                        public C397532(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (((WorkflowActionResult) obj).getAction() instanceof InfoScreen.Action) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super WorkflowActionResult> flowCollector, Continuation continuation) {
                        Object objCollect = flowFilterNotNull.collect(new C397532(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                final InfoDuxo infoDuxo = InfoDuxo.this;
                FlowCollector<? super WorkflowActionResult> flowCollector = new FlowCollector() { // from class: com.robinhood.shared.security.workflow.InfoDuxo.onCreate.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((WorkflowActionResult) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(WorkflowActionResult workflowActionResult, Continuation<? super Unit> continuation) {
                        Object objM25661peekd1pmJ48 = workflowActionResult.m25661peekd1pmJ48();
                        if (Result.m28556isSuccessimpl(objM25661peekd1pmJ48) && ((UiWorkflowActionResponse) objM25661peekd1pmJ48).getRoute() == null) {
                            CrashReporter.INSTANCE.reportNonFatal(new IllegalArgumentException("InfoScreen action response does not contain a route"), false, new EventMetadata(SentryTeam.AUTH_AND_SAFETY, null, null, 6, null));
                        }
                        Throwable thConsumeError = workflowActionResult.consumeError();
                        if (thConsumeError != null) {
                            infoDuxo.submit(new InfoEvent.Error(thConsumeError));
                        }
                        infoDuxo.applyMutation(new AnonymousClass3(null));
                        return Unit.INSTANCE;
                    }

                    /* compiled from: InfoDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/security/workflow/InfoViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.shared.security.workflow.InfoDuxo$onCreate$1$2$3", m3645f = "InfoDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.shared.security.workflow.InfoDuxo$onCreate$1$2$3, reason: invalid class name */
                    static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<InfoViewState, Continuation<? super InfoViewState>, Object> {
                        private /* synthetic */ Object L$0;
                        int label;

                        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                            super(2, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                            anonymousClass3.L$0 = obj;
                            return anonymousClass3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InfoViewState infoViewState, Continuation<? super InfoViewState> continuation) {
                            return ((AnonymousClass3) create(infoViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return ((InfoViewState) this.L$0).copy(false);
                        }
                    }
                };
                this.label = 1;
                if (flow.collect(flowCollector, this) == coroutine_suspended) {
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

    public final void onPrimaryCtaClicked() {
        Companion companion = INSTANCE;
        InfoScreen.Callback primaryCtaCallback = ((InfoFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen().getPrimaryCtaCallback();
        if (primaryCtaCallback != null) {
            applyMutation(new InfoDuxo3(null));
            this.workflowManager.sendActionRequest(((InfoFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowId(), InfoScreen.Action.PrimaryCta.INSTANCE, ((InfoFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen());
            if (primaryCtaCallback == InfoScreen.Callback.EXIT) {
                submit(InfoEvent.Exit.INSTANCE);
            } else if (primaryCtaCallback == InfoScreen.Callback.DEEPLINK) {
                String primaryCtaDeeplink = ((InfoFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen().getPrimaryCtaDeeplink();
                if (primaryCtaDeeplink == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                submit(new InfoEvent.Deeplink(primaryCtaDeeplink));
            }
        }
    }

    public final void onSecondaryCtaClicked() {
        Companion companion = INSTANCE;
        InfoScreen.Callback secondaryCtaCallback = ((InfoFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen().getSecondaryCtaCallback();
        if (secondaryCtaCallback != null) {
            applyMutation(new InfoDuxo4(null));
            this.workflowManager.sendActionRequest(((InfoFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowId(), InfoScreen.Action.SecondaryCta.INSTANCE, ((InfoFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen());
            if (secondaryCtaCallback == InfoScreen.Callback.EXIT) {
                submit(InfoEvent.Exit.INSTANCE);
            } else if (secondaryCtaCallback == InfoScreen.Callback.DEEPLINK) {
                String secondaryCtaDeeplink = ((InfoFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen().getSecondaryCtaDeeplink();
                if (secondaryCtaDeeplink == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                submit(new InfoEvent.Deeplink(secondaryCtaDeeplink));
            }
        }
    }

    public final void onBackPressed() {
        if (getInvalidParams()) {
            submit(InfoEvent.Exit.INSTANCE);
            return;
        }
        Companion companion = INSTANCE;
        InfoScreen.Callback closeBtnCallback = ((InfoFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen().getCloseBtnCallback();
        if (closeBtnCallback != null) {
            applyMutation(new InfoDuxo2(null));
            this.workflowManager.sendActionRequest(((InfoFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowId(), InfoScreen.Action.CustomerAbandon.INSTANCE, ((InfoFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen());
            if (closeBtnCallback == InfoScreen.Callback.EXIT) {
                submit(InfoEvent.Exit.INSTANCE);
            }
        }
    }

    /* compiled from: InfoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/security/workflow/InfoDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/security/workflow/InfoDuxo;", "Lcom/robinhood/shared/security/contracts/InfoFragmentKey;", "<init>", "()V", "feature-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<InfoDuxo, InfoFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InfoFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (InfoFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InfoFragmentKey getArgs(InfoDuxo infoDuxo) {
            return (InfoFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, infoDuxo);
        }
    }
}
