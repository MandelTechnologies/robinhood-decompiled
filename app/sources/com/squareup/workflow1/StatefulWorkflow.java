package com.squareup.workflow1;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: StatefulWorkflow.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u0001*\u0006\b\u0003\u0010\u0004 \u00012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0005:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000J\u001f\u0010\b\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0002\u0010\fJ%\u0010\r\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0011JA\u0010\u0012\u001a\u00028\u00032\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u00012\"\u0010\u0015\u001a\u001e0\u0016R\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000H&¢\u0006\u0002\u0010\u0017J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0019¨\u0006\u001b"}, m3636d2 = {"Lcom/squareup/workflow1/StatefulWorkflow;", "PropsT", "StateT", "OutputT", "RenderingT", "Lcom/squareup/workflow1/Workflow;", "()V", "asStatefulWorkflow", "initialState", "props", "snapshot", "Lcom/squareup/workflow1/Snapshot;", "(Ljava/lang/Object;Lcom/squareup/workflow1/Snapshot;)Ljava/lang/Object;", "onPropsChanged", "old", "new", "state", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "render", "renderProps", "renderState", "context", "Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)Ljava/lang/Object;", "snapshotState", "(Ljava/lang/Object;)Lcom/squareup/workflow1/Snapshot;", "RenderContext", "wf1-workflow-core"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class StatefulWorkflow<PropsT, StateT, OutputT, RenderingT> implements Workflow<PropsT, OutputT, RenderingT> {
    @Override // com.squareup.workflow1.Workflow
    public final StatefulWorkflow<PropsT, StateT, OutputT, RenderingT> asStatefulWorkflow() {
        return this;
    }

    public abstract StateT initialState(PropsT props, Snapshot snapshot);

    public StateT onPropsChanged(PropsT old, PropsT propst, StateT state) {
        return state;
    }

    public abstract RenderingT render(PropsT renderProps, StateT renderState, StatefulWorkflow<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT>.RenderContext context);

    public abstract Snapshot snapshotState(StateT state);

    /* compiled from: StatefulWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001B#\b\u0000\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004Jt\u0010\u0010\u001a\u00028\u0006\"\u0004\b\u0004\u0010\u0005\"\u0004\b\u0005\u0010\u0006\"\u0004\b\u0006\u0010\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00060\b2\u0006\u0010\n\u001a\u00028\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2$\u0010\u000f\u001a \u0012\u0004\u0012\u00028\u0005\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e0\rH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011JD\u0010\u0019\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2'\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0012¢\u0006\u0002\b\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR,\u0010\u001e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e0\u001b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, m3636d2 = {"Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;", "Lcom/squareup/workflow1/BaseRenderContext;", "baseContext", "<init>", "(Lcom/squareup/workflow1/StatefulWorkflow;Lcom/squareup/workflow1/BaseRenderContext;)V", "ChildPropsT", "ChildOutputT", "ChildRenderingT", "Lcom/squareup/workflow1/Workflow;", "child", "props", "", "key", "Lkotlin/Function1;", "Lcom/squareup/workflow1/WorkflowAction;", "handler", "renderChild", "(Lcom/squareup/workflow1/Workflow;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "sideEffect", "runningSideEffect", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lcom/squareup/workflow1/Sink;", "getActionSink", "()Lcom/squareup/workflow1/Sink;", "actionSink", "wf1-workflow-core"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    public final class RenderContext implements BaseRenderContext<PropsT, StateT, OutputT> {
        private final /* synthetic */ BaseRenderContext<PropsT, StateT, OutputT> $$delegate_0;
        final /* synthetic */ StatefulWorkflow<PropsT, StateT, OutputT, RenderingT> this$0;

        @Override // com.squareup.workflow1.BaseRenderContext
        public Sink<WorkflowAction<? super PropsT, StateT, ? extends OutputT>> getActionSink() {
            return this.$$delegate_0.getActionSink();
        }

        @Override // com.squareup.workflow1.BaseRenderContext
        public <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT renderChild(Workflow<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT props, String key, Function1<? super ChildOutputT, ? extends WorkflowAction<? super PropsT, StateT, ? extends OutputT>> handler) {
            Intrinsics.checkNotNullParameter(child, "child");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(handler, "handler");
            return (ChildRenderingT) this.$$delegate_0.renderChild(child, props, key, handler);
        }

        @Override // com.squareup.workflow1.BaseRenderContext
        public void runningSideEffect(String key, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> sideEffect) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
            this.$$delegate_0.runningSideEffect(key, sideEffect);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RenderContext(StatefulWorkflow this$0, BaseRenderContext<? extends PropsT, StateT, ? super OutputT> baseContext) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(baseContext, "baseContext");
            this.this$0 = this$0;
            this.$$delegate_0 = baseContext;
        }
    }
}
