package com.squareup.workflow1;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* compiled from: WorkerWorkflow.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062$\u0010\u0007\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u00020\t0\bH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a\u001d\u0010\f\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\u000e\u001a#\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0010\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u00110\u0004H\u0002¢\u0006\u0002\b\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m3636d2 = {"runWorker", "", "OutputT", "worker", "Lcom/squareup/workflow1/Worker;", "renderKey", "", "actionSink", "Lcom/squareup/workflow1/Sink;", "Lcom/squareup/workflow1/WorkflowAction;", "", "(Lcom/squareup/workflow1/Worker;Ljava/lang/String;Lcom/squareup/workflow1/Sink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "debugName", "key", "debugName$Workflows__WorkerWorkflowKt", "runWithNullCheck", "Lkotlinx/coroutines/flow/Flow;", "T", "runWithNullCheck$Workflows__WorkerWorkflowKt", "wf1-workflow-core"}, m3637k = 5, m3638mv = {1, 6, 0}, m3640xi = 48, m3641xs = "com/squareup/workflow1/Workflows")
/* renamed from: com.squareup.workflow1.Workflows__WorkerWorkflowKt, reason: use source file name */
/* loaded from: classes12.dex */
final /* synthetic */ class WorkerWorkflow3 {

    /* compiled from: WorkerWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "OutputT", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.squareup.workflow1.Workflows__WorkerWorkflowKt$runWorker$2", m3645f = "WorkerWorkflow.kt", m3646l = {78}, m3647m = "invokeSuspend")
    /* renamed from: com.squareup.workflow1.Workflows__WorkerWorkflowKt$runWorker$2 */
    static final class C424742 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Sink<WorkflowAction<? super Worker<? extends OutputT>, Integer, ? extends OutputT>> $actionSink;
        final /* synthetic */ String $renderKey;
        final /* synthetic */ Worker<OutputT> $worker;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C424742(Worker<? extends OutputT> worker, Sink<? super WorkflowAction<? super Worker<? extends OutputT>, Integer, ? extends OutputT>> sink, String str, Continuation<? super C424742> continuation) {
            super(2, continuation);
            this.$worker = worker;
            this.$actionSink = sink;
            this.$renderKey = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C424742(this.$worker, this.$actionSink, this.$renderKey, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C424742) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowRunWithNullCheck$Workflows__WorkerWorkflowKt = WorkerWorkflow3.runWithNullCheck$Workflows__WorkerWorkflowKt(this.$worker);
                Sink<WorkflowAction<? super Worker<? extends OutputT>, Integer, ? extends OutputT>> sink = this.$actionSink;
                final Worker<OutputT> worker = this.$worker;
                final String str = this.$renderKey;
                Function1<OutputT, WorkflowAction<? super Worker<? extends OutputT>, Integer, ? extends OutputT>> function1 = new Function1<OutputT, WorkflowAction<? super Worker<? extends OutputT>, Integer, ? extends OutputT>>() { // from class: com.squareup.workflow1.Workflows__WorkerWorkflowKt.runWorker.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        return invoke((AnonymousClass1<OutputT>) obj2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final WorkflowAction<Worker<? extends OutputT>, Integer, OutputT> invoke(OutputT outputt) {
                        return new WorkerWorkflow2(worker, str, outputt);
                    }
                };
                this.label = 1;
                if (Workflows.collectToSink(flowRunWithNullCheck$Workflows__WorkerWorkflowKt, sink, function1, this) == coroutine_suspended) {
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

    public static final <OutputT> Object runWorker(Worker<? extends OutputT> worker, String str, Sink<? super WorkflowAction<? super Worker<? extends OutputT>, Integer, ? extends OutputT>> sink, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(new CoroutineName(debugName$Workflows__WorkerWorkflowKt(worker, str)), new C424742(worker, sink, str, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Flow<T> runWithNullCheck$Workflows__WorkerWorkflowKt(Worker<? extends T> worker) {
        Flow<? extends T> flowRun = worker.run();
        if (flowRun != null) {
            return flowRun;
        }
        throw new NullPointerException("Worker " + worker + " returned a null Flow. If this is a test mock, make sure you mock the run() method!");
    }

    private static final String debugName$Workflows__WorkerWorkflowKt(Worker<?> worker, String str) {
        String string2 = worker.toString();
        if (StringsKt.isBlank(str)) {
            return string2;
        }
        return string2 + ':' + str;
    }
}
