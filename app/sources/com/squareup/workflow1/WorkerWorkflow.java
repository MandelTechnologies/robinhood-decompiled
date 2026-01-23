package com.squareup.workflow1;

import com.squareup.workflow1.StatefulWorkflow;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WorkerWorkflow.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012 \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00022\u00020\u0006B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0017\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JO\u0010\u001d\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001a\u001a\u00020\u00042(\u0010\u001c\u001a$0\u001bR \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$R\u001a\u0010&\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, m3636d2 = {"Lcom/squareup/workflow1/WorkerWorkflow;", "OutputT", "Lcom/squareup/workflow1/StatefulWorkflow;", "Lcom/squareup/workflow1/Worker;", "", "", "Lcom/squareup/workflow1/ImpostorWorkflow;", "Lkotlin/reflect/KType;", "workerType", "", "key", "<init>", "(Lkotlin/reflect/KType;Ljava/lang/String;)V", "describeRealIdentifier", "()Ljava/lang/String;", "props", "Lcom/squareup/workflow1/Snapshot;", "snapshot", "initialState", "(Lcom/squareup/workflow1/Worker;Lcom/squareup/workflow1/Snapshot;)Ljava/lang/Integer;", "old", "new", "state", "onPropsChanged", "(Lcom/squareup/workflow1/Worker;Lcom/squareup/workflow1/Worker;I)Ljava/lang/Integer;", "renderProps", "renderState", "Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;", "context", "render", "(Lcom/squareup/workflow1/Worker;ILcom/squareup/workflow1/StatefulWorkflow$RenderContext;)V", "snapshotState", "(I)Lcom/squareup/workflow1/Snapshot;", "Lkotlin/reflect/KType;", "getWorkerType", "()Lkotlin/reflect/KType;", "Ljava/lang/String;", "Lcom/squareup/workflow1/WorkflowIdentifier;", "realIdentifier", "Lcom/squareup/workflow1/WorkflowIdentifier;", "getRealIdentifier", "()Lcom/squareup/workflow1/WorkflowIdentifier;", "wf1-workflow-core"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class WorkerWorkflow<OutputT> extends StatefulWorkflow<Worker<? extends OutputT>, Integer, OutputT, Unit> implements ImpostorWorkflow {
    private final String key;
    private final WorkflowIdentifier realIdentifier;
    private final KType workerType;

    public Snapshot snapshotState(int state) {
        return null;
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public /* bridge */ /* synthetic */ Integer onPropsChanged(Object obj, Object obj2, Integer num) {
        return onPropsChanged((Worker) obj, (Worker) obj2, num.intValue());
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public /* bridge */ /* synthetic */ Unit render(Object obj, Integer num, StatefulWorkflow.RenderContext renderContext) {
        render((Worker) obj, num.intValue(), renderContext);
        return Unit.INSTANCE;
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public /* bridge */ /* synthetic */ Snapshot snapshotState(Integer num) {
        return snapshotState(num.intValue());
    }

    public WorkerWorkflow(KType workerType, String key) {
        Intrinsics.checkNotNullParameter(workerType, "workerType");
        Intrinsics.checkNotNullParameter(key, "key");
        this.workerType = workerType;
        this.key = key;
        this.realIdentifier = Workflows.unsnapshottableIdentifier(workerType);
    }

    @Override // com.squareup.workflow1.ImpostorWorkflow
    public WorkflowIdentifier getRealIdentifier() {
        return this.realIdentifier;
    }

    @Override // com.squareup.workflow1.ImpostorWorkflow
    public String describeRealIdentifier() {
        return Intrinsics.stringPlus("worker ", this.workerType);
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public Integer initialState(Worker<? extends OutputT> props, Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(props, "props");
        return 0;
    }

    public Integer onPropsChanged(Worker<? extends OutputT> old, Worker<? extends OutputT> worker, int state) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(worker, "new");
        if (!old.doesSameWorkAs(worker)) {
            state++;
        }
        return Integer.valueOf(state);
    }

    /* compiled from: WorkerWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "OutputT", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.squareup.workflow1.WorkerWorkflow$render$1", m3645f = "WorkerWorkflow.kt", m3646l = {57}, m3647m = "invokeSuspend")
    /* renamed from: com.squareup.workflow1.WorkerWorkflow$render$1 */
    static final class C424691 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StatefulWorkflow<Worker<? extends OutputT>, Integer, OutputT, Unit>.RenderContext $context;
        final /* synthetic */ Worker<OutputT> $renderProps;
        int label;
        final /* synthetic */ WorkerWorkflow<OutputT> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C424691(Worker<? extends OutputT> worker, WorkerWorkflow<OutputT> workerWorkflow, StatefulWorkflow<? super Worker<? extends OutputT>, Integer, ? extends OutputT, Unit>.RenderContext renderContext, Continuation<? super C424691> continuation) {
            super(2, continuation);
            this.$renderProps = worker;
            this.this$0 = workerWorkflow;
            this.$context = renderContext;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C424691(this.$renderProps, this.this$0, this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C424691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Worker<OutputT> worker = this.$renderProps;
                String str = ((WorkerWorkflow) this.this$0).key;
                Sink<WorkflowAction<? super Worker<? extends OutputT>, Integer, ? extends OutputT>> actionSink = this.$context.getActionSink();
                this.label = 1;
                if (Workflows.runWorker(worker, str, actionSink, this) == coroutine_suspended) {
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

    public void render(Worker<? extends OutputT> renderProps, int renderState, StatefulWorkflow<? super Worker<? extends OutputT>, Integer, ? extends OutputT, Unit>.RenderContext context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(context, "context");
        context.runningSideEffect(String.valueOf(renderState), new C424691(renderProps, this, context, null));
    }
}
