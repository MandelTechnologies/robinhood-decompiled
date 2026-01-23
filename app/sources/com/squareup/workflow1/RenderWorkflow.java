package com.squareup.workflow1;

import com.plaid.internal.EnumC7081g;
import com.squareup.workflow1.internal.ChainedWorkflowInterceptor9;
import com.squareup.workflow1.internal.WorkflowRunner;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: RenderWorkflow.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u009c\u0001\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0005\"\u0004\b\u0002\u0010\u00032\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m3636d2 = {"renderWorkflowIn", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/squareup/workflow1/RenderingAndSnapshot;", "RenderingT", "PropsT", "OutputT", "workflow", "Lcom/squareup/workflow1/Workflow;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "props", "initialSnapshot", "Lcom/squareup/workflow1/TreeSnapshot;", "interceptors", "", "Lcom/squareup/workflow1/WorkflowInterceptor;", "onOutput", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "(Lcom/squareup/workflow1/Workflow;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/StateFlow;Lcom/squareup/workflow1/TreeSnapshot;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;", "wf1-workflow-runtime"}, m3637k = 2, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.RenderWorkflowKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class RenderWorkflow {
    public static final <PropsT, OutputT, RenderingT> StateFlow<RenderingAndSnapshot<RenderingT>> renderWorkflowIn(Workflow<? super PropsT, ? extends OutputT, ? extends RenderingT> workflow, CoroutineScope scope, StateFlow<? extends PropsT> props, TreeSnapshot treeSnapshot, List<? extends WorkflowInterceptor> interceptors, Function2<? super OutputT, ? super Continuation<? super Unit>, ? extends Object> onOutput) {
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        WorkflowRunner workflowRunner = new WorkflowRunner(scope, workflow, props, treeSnapshot, ChainedWorkflowInterceptor9.chained(interceptors));
        try {
            StateFlow2 stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(workflowRunner.nextRendering());
            BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C424661(workflowRunner, stateFlow2MutableStateFlow, onOutput, null), 3, null);
            return stateFlow2MutableStateFlow;
        } catch (Throwable th) {
            CancellationException CancellationException = th instanceof CancellationException ? th : null;
            if (CancellationException == null) {
                CancellationException = ExceptionsKt.CancellationException("Workflow runtime failed", th);
            }
            workflowRunner.cancelRuntime(CancellationException);
            throw th;
        }
    }

    /* compiled from: RenderWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\u00020\u0005H\u008a@"}, m3636d2 = {"<anonymous>", "", "PropsT", "OutputT", "RenderingT", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.squareup.workflow1.RenderWorkflowKt$renderWorkflowIn$1", m3645f = "RenderWorkflow.kt", m3646l = {136, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.squareup.workflow1.RenderWorkflowKt$renderWorkflowIn$1 */
    static final class C424661 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<OutputT, Continuation<? super Unit>, Object> $onOutput;
        final /* synthetic */ StateFlow2<RenderingAndSnapshot<RenderingT>> $renderingsAndSnapshots;
        final /* synthetic */ WorkflowRunner<PropsT, OutputT, RenderingT> $runner;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C424661(WorkflowRunner<PropsT, OutputT, RenderingT> workflowRunner, StateFlow2<RenderingAndSnapshot<RenderingT>> stateFlow2, Function2<? super OutputT, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C424661> continuation) {
            super(2, continuation);
            this.$runner = workflowRunner;
            this.$renderingsAndSnapshots = stateFlow2;
            this.$onOutput = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C424661 c424661 = new C424661(this.$runner, this.$renderingsAndSnapshots, this.$onOutput, continuation);
            c424661.L$0 = obj;
            return c424661;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C424661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
        
            if (r4.invoke(r8, r7) == r0) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0059 -> B:23:0x005b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006b -> B:23:0x005b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            CoroutineScope coroutineScope2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                if (CoroutineScope2.isActive(coroutineScope)) {
                }
            } else if (i == 1) {
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                WorkflowOutput workflowOutput = (WorkflowOutput) obj;
                if (CoroutineScope2.isActive(coroutineScope2)) {
                }
            } else if (i == 2) {
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope2;
                if (CoroutineScope2.isActive(coroutineScope)) {
                    WorkflowRunner<PropsT, OutputT, RenderingT> workflowRunner = this.$runner;
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    Object objNextOutput = workflowRunner.nextOutput(this);
                    if (objNextOutput != coroutine_suspended) {
                        coroutineScope2 = coroutineScope;
                        obj = objNextOutput;
                        WorkflowOutput workflowOutput2 = (WorkflowOutput) obj;
                        if (CoroutineScope2.isActive(coroutineScope2)) {
                            return Unit.INSTANCE;
                        }
                        this.$renderingsAndSnapshots.setValue(this.$runner.nextRendering());
                        if (workflowOutput2 != null) {
                            Function2<OutputT, Continuation<? super Unit>, Object> function2 = this.$onOutput;
                            Object value = workflowOutput2.getValue();
                            this.L$0 = coroutineScope2;
                            this.label = 2;
                        }
                        coroutineScope = coroutineScope2;
                        if (CoroutineScope2.isActive(coroutineScope)) {
                            return Unit.INSTANCE;
                        }
                    }
                    return coroutine_suspended;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
