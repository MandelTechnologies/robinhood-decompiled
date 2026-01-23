package com.robinhood.shared.security.lib.workflow;

import com.robinhood.models.workflow.p358ui.UiWorkflowActionResponse;
import com.robinhood.models.workflow.p358ui.screens.UiWorkflowScreen;
import com.robinhood.models.workflow.p358ui.screens.UiWorkflowScreenAction;
import com.robinhood.shared.security.store.workflow.WorkflowStore;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.extensions.Throwables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: WorkflowManager.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "workflowStore", "Lcom/robinhood/shared/security/store/workflow/WorkflowStore;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/shared/security/store/workflow/WorkflowStore;)V", "actionResultFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/robinhood/shared/security/lib/workflow/WorkflowActionResult;", "getActionResultFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "_actionResultFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "sendActionRequest", "", "workflowId", "Ljava/util/UUID;", "action", "Lcom/robinhood/models/workflow/ui/screens/UiWorkflowScreenAction;", "screen", "Lcom/robinhood/models/workflow/ui/screens/UiWorkflowScreen;", "Companion", "lib-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class WorkflowManager {
    public static final String CLIENT_VERSION = "1.2.1";
    private final StateFlow2<WorkflowActionResult> _actionResultFlow;
    private final CoroutineScope coroutineScope;
    private final WorkflowStore workflowStore;

    public WorkflowManager(@RootCoroutineScope CoroutineScope coroutineScope, WorkflowStore workflowStore) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(workflowStore, "workflowStore");
        this.coroutineScope = coroutineScope;
        this.workflowStore = workflowStore;
        this._actionResultFlow = StateFlow4.MutableStateFlow(null);
    }

    public final StateFlow<WorkflowActionResult> getActionResultFlow() {
        return this._actionResultFlow;
    }

    public static /* synthetic */ void sendActionRequest$default(WorkflowManager workflowManager, UUID uuid, UiWorkflowScreenAction uiWorkflowScreenAction, UiWorkflowScreen uiWorkflowScreen, int i, Object obj) {
        if ((i & 4) != 0) {
            uiWorkflowScreen = null;
        }
        workflowManager.sendActionRequest(uuid, uiWorkflowScreenAction, uiWorkflowScreen);
    }

    /* compiled from: WorkflowManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.lib.workflow.WorkflowManager$sendActionRequest$1", m3645f = "WorkflowManager.kt", m3646l = {37, 33}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.security.lib.workflow.WorkflowManager$sendActionRequest$1 */
    static final class C396691 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UiWorkflowScreenAction $action;
        final /* synthetic */ UiWorkflowScreen $screen;
        final /* synthetic */ UUID $workflowId;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C396691(UiWorkflowScreenAction uiWorkflowScreenAction, UUID uuid, UiWorkflowScreen uiWorkflowScreen, Continuation<? super C396691> continuation) {
            super(2, continuation);
            this.$action = uiWorkflowScreenAction;
            this.$workflowId = uuid;
            this.$screen = uiWorkflowScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WorkflowManager.this.new C396691(this.$action, this.$workflowId, this.$screen, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C396691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
        
            if (r4.emit(r0, r11) != r1) goto L33;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            StateFlow2 stateFlow2;
            C396691 c396691;
            Throwable th;
            UiWorkflowScreenAction uiWorkflowScreenAction;
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                stateFlow2 = WorkflowManager.this._actionResultFlow;
                UiWorkflowScreenAction uiWorkflowScreenAction2 = this.$action;
                WorkflowManager workflowManager = WorkflowManager.this;
                UUID uuid = this.$workflowId;
                UiWorkflowScreen uiWorkflowScreen = this.$screen;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    WorkflowStore workflowStore = workflowManager.workflowStore;
                    this.L$0 = stateFlow2;
                    this.L$1 = uiWorkflowScreenAction2;
                    this.label = 1;
                    c396691 = this;
                    try {
                        obj = workflowStore.sendActionRequest(WorkflowManager.CLIENT_VERSION, uuid, uiWorkflowScreenAction2, uiWorkflowScreen, c396691);
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        uiWorkflowScreenAction = uiWorkflowScreenAction2;
                        Throwables.rethrowIfNotNetworkRelated(th);
                        Result.Companion companion2 = Result.INSTANCE;
                        objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                        WorkflowActionResult workflowActionResult = new WorkflowActionResult(uiWorkflowScreenAction, objM28550constructorimpl);
                        c396691.L$0 = null;
                        c396691.L$1 = null;
                        c396691.label = 2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c396691 = this;
                }
                if (obj != coroutine_suspended) {
                    uiWorkflowScreenAction = uiWorkflowScreenAction2;
                    objM28550constructorimpl = Result.m28550constructorimpl((UiWorkflowActionResponse) obj);
                    WorkflowActionResult workflowActionResult2 = new WorkflowActionResult(uiWorkflowScreenAction, objM28550constructorimpl);
                    c396691.L$0 = null;
                    c396691.L$1 = null;
                    c396691.label = 2;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            uiWorkflowScreenAction = (UiWorkflowScreenAction) this.L$1;
            stateFlow2 = (StateFlow2) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                c396691 = this;
            } catch (Throwable th4) {
                th = th4;
                c396691 = this;
                Throwables.rethrowIfNotNetworkRelated(th);
                Result.Companion companion22 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                WorkflowActionResult workflowActionResult22 = new WorkflowActionResult(uiWorkflowScreenAction, objM28550constructorimpl);
                c396691.L$0 = null;
                c396691.L$1 = null;
                c396691.label = 2;
            }
            try {
                objM28550constructorimpl = Result.m28550constructorimpl((UiWorkflowActionResponse) obj);
            } catch (Throwable th5) {
                th = th5;
                Throwables.rethrowIfNotNetworkRelated(th);
                Result.Companion companion222 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                WorkflowActionResult workflowActionResult222 = new WorkflowActionResult(uiWorkflowScreenAction, objM28550constructorimpl);
                c396691.L$0 = null;
                c396691.L$1 = null;
                c396691.label = 2;
            }
            WorkflowActionResult workflowActionResult2222 = new WorkflowActionResult(uiWorkflowScreenAction, objM28550constructorimpl);
            c396691.L$0 = null;
            c396691.L$1 = null;
            c396691.label = 2;
        }
    }

    public final void sendActionRequest(UUID workflowId, UiWorkflowScreenAction action, UiWorkflowScreen screen) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(action, "action");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C396691(action, workflowId, screen, null), 3, null);
    }
}
