package com.robinhood.shared.security.workflow;

import androidx.lifecycle.SavedStateHandle;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.workflow.p358ui.UiWorkflowRoute;
import com.robinhood.models.workflow.p358ui.screens.KycStatusCheckScreen;
import com.robinhood.models.workflow.p358ui.screens.UiWorkflowScreen;
import com.robinhood.models.workflow.p358ui.screens.UiWorkflowScreenAction;
import com.robinhood.shared.security.contracts.WorkflowIntentKey;
import com.robinhood.shared.security.lib.workflow.WorkflowActionResult;
import com.robinhood.shared.security.lib.workflow.WorkflowManager;
import com.robinhood.shared.security.workflow.WorkflowEvent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: WorkflowDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001bB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0006\u0010\u0010\u001a\u00020\u0002J\u0016\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/security/workflow/WorkflowDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/shared/security/workflow/WorkflowEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "workflowManager", "Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "loadWorkflow", "sendFinishingRequest", "action", "Lcom/robinhood/models/workflow/ui/screens/UiWorkflowScreenAction;", "screen", "Lcom/robinhood/models/workflow/ui/screens/UiWorkflowScreen;", "handleRoute", PlaceTypes.ROUTE, "Lcom/robinhood/models/workflow/ui/UiWorkflowRoute;", "shouldSkipFragmentAnimation", "", "Companion", "feature-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class WorkflowDuxo extends BaseDuxo5<Unit, WorkflowEvent> implements HasSavedState {
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
    public WorkflowDuxo(SavedStateHandle savedStateHandle, WorkflowManager workflowManager, DuxoBundle duxoBundle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(workflowManager, "workflowManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.savedStateHandle = savedStateHandle;
        this.workflowManager = workflowManager;
    }

    /* compiled from: WorkflowDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.workflow.WorkflowDuxo$onCreate$1", m3645f = "WorkflowDuxo.kt", m3646l = {32}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.security.workflow.WorkflowDuxo$onCreate$1 */
    static final class C397611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C397611(Continuation<? super C397611> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WorkflowDuxo.this.new C397611(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C397611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(WorkflowDuxo.this.workflowManager.getActionResultFlow());
                final WorkflowDuxo workflowDuxo = WorkflowDuxo.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.shared.security.workflow.WorkflowDuxo.onCreate.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((WorkflowActionResult) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(WorkflowActionResult workflowActionResult, Continuation<? super Unit> continuation) {
                        Throwable thConsumeError;
                        UiWorkflowRoute uiWorkflowRouteConsumeRoute = workflowActionResult.consumeRoute();
                        if (uiWorkflowRouteConsumeRoute != null) {
                            workflowDuxo.handleRoute(uiWorkflowRouteConsumeRoute, workflowActionResult.getAction());
                        }
                        if (Intrinsics.areEqual(workflowActionResult.getAction(), UiWorkflowScreenAction.Start.INSTANCE) && (thConsumeError = workflowActionResult.consumeError()) != null) {
                            workflowDuxo.submit(new WorkflowEvent.Error(thConsumeError));
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C397611(null));
    }

    public final void loadWorkflow() {
        WorkflowManager.sendActionRequest$default(this.workflowManager, ((WorkflowIntentKey) INSTANCE.getExtras((HasSavedState) this)).getId(), UiWorkflowScreenAction.Start.INSTANCE, null, 4, null);
    }

    public final void sendFinishingRequest(UiWorkflowScreenAction action, UiWorkflowScreen screen) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.workflowManager.sendActionRequest(((WorkflowIntentKey) INSTANCE.getExtras((HasSavedState) this)).getId(), action, screen);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRoute(UiWorkflowRoute route, UiWorkflowScreenAction action) {
        if (route instanceof UiWorkflowRoute.Replace) {
            submit(new WorkflowEvent.Replace(((UiWorkflowRoute.Replace) route).getScreen(), !shouldSkipFragmentAnimation(action)));
        } else {
            if (!(route instanceof UiWorkflowRoute.Exit)) {
                throw new NoWhenBranchMatchedException();
            }
            submit(new WorkflowEvent.Exit(((UiWorkflowRoute.Exit) route).getStatus()));
        }
    }

    private final boolean shouldSkipFragmentAnimation(UiWorkflowScreenAction action) {
        return Intrinsics.areEqual(action, UiWorkflowScreenAction.Start.INSTANCE) || Intrinsics.areEqual(action, KycStatusCheckScreen.Action.Uploaded.INSTANCE) || Intrinsics.areEqual(action, KycStatusCheckScreen.Action.CustomerAbandon.INSTANCE);
    }

    /* compiled from: WorkflowDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/security/workflow/WorkflowDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/shared/security/workflow/WorkflowDuxo;", "Lcom/robinhood/shared/security/contracts/WorkflowIntentKey;", "<init>", "()V", "feature-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<WorkflowDuxo, WorkflowIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public WorkflowIntentKey getExtras(SavedStateHandle savedStateHandle) {
            return (WorkflowIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public WorkflowIntentKey getExtras(WorkflowDuxo workflowDuxo) {
            return (WorkflowIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, workflowDuxo);
        }
    }
}
