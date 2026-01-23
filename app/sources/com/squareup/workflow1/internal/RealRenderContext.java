package com.squareup.workflow1.internal;

import com.squareup.workflow1.BaseRenderContext;
import com.squareup.workflow1.Sink;
import com.squareup.workflow1.Workflow;
import com.squareup.workflow1.WorkflowAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel9;

/* compiled from: RealRenderContext.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005:\u0002,-BG\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\f¢\u0006\u0002\u0010\rJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0006\u0010\u0015\u001a\u00020\u0014Jo\u0010\u0016\u001a\u0002H\u0017\"\u0004\b\u0003\u0010\u0018\"\u0004\b\u0004\u0010\u0019\"\u0004\b\u0005\u0010\u00172\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u00170\u001b2\u0006\u0010\u001c\u001a\u0002H\u00182\u0006\u0010\u001d\u001a\u00020\u001e2$\u0010\u001f\u001a \u0012\u0004\u0012\u0002H\u0019\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060 H\u0016¢\u0006\u0002\u0010!JA\u0010\"\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001e2'\u0010#\u001a#\b\u0001\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140&\u0012\u0006\u0012\u0004\u0018\u00010'0$¢\u0006\u0002\b(H\u0016ø\u0001\u0000¢\u0006\u0002\u0010)J\"\u0010*\u001a\u00020\u00142\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006H\u0016R,\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R&\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\bX\u0088\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, m3636d2 = {"Lcom/squareup/workflow1/internal/RealRenderContext;", "PropsT", "StateT", "OutputT", "Lcom/squareup/workflow1/BaseRenderContext;", "Lcom/squareup/workflow1/Sink;", "Lcom/squareup/workflow1/WorkflowAction;", "renderer", "Lcom/squareup/workflow1/internal/RealRenderContext$Renderer;", "sideEffectRunner", "Lcom/squareup/workflow1/internal/RealRenderContext$SideEffectRunner;", "eventActionsChannel", "Lkotlinx/coroutines/channels/SendChannel;", "(Lcom/squareup/workflow1/internal/RealRenderContext$Renderer;Lcom/squareup/workflow1/internal/RealRenderContext$SideEffectRunner;Lkotlinx/coroutines/channels/SendChannel;)V", "actionSink", "getActionSink", "()Lcom/squareup/workflow1/Sink;", "frozen", "", "checkNotFrozen", "", "freeze", "renderChild", "ChildRenderingT", "ChildPropsT", "ChildOutputT", "child", "Lcom/squareup/workflow1/Workflow;", "props", "key", "", "handler", "Lkotlin/Function1;", "(Lcom/squareup/workflow1/Workflow;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "runningSideEffect", "sideEffect", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "send", "value", "Renderer", "SideEffectRunner", "wf1-workflow-runtime"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class RealRenderContext<PropsT, StateT, OutputT> implements BaseRenderContext<PropsT, StateT, OutputT>, Sink<WorkflowAction<? super PropsT, StateT, ? extends OutputT>> {
    private final Channel9<WorkflowAction<? super PropsT, StateT, ? extends OutputT>> eventActionsChannel;
    private boolean frozen;
    private final Renderer<PropsT, StateT, OutputT> renderer;
    private final SideEffectRunner sideEffectRunner;

    /* compiled from: RealRenderContext.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\u00020\u0004Jo\u0010\u0005\u001a\u0002H\u0006\"\u0004\b\u0006\u0010\u0007\"\u0004\b\u0007\u0010\b\"\u0004\b\b\u0010\u00062\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u00060\n2\u0006\u0010\u000b\u001a\u0002H\u00072\u0006\u0010\f\u001a\u00020\r2$\u0010\u000e\u001a \u0012\u0004\u0012\u0002H\b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00100\u000fH&¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/squareup/workflow1/internal/RealRenderContext$Renderer;", "PropsT", "StateT", "OutputT", "", "render", "ChildRenderingT", "ChildPropsT", "ChildOutputT", "child", "Lcom/squareup/workflow1/Workflow;", "props", "key", "", "handler", "Lkotlin/Function1;", "Lcom/squareup/workflow1/WorkflowAction;", "(Lcom/squareup/workflow1/Workflow;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "wf1-workflow-runtime"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    public interface Renderer<PropsT, StateT, OutputT> {
        <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT render(Workflow<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT props, String key, Function1<? super ChildOutputT, ? extends WorkflowAction<? super PropsT, StateT, ? extends OutputT>> handler);
    }

    /* compiled from: RealRenderContext.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JA\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0002\b\nH&ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m3636d2 = {"Lcom/squareup/workflow1/internal/RealRenderContext$SideEffectRunner;", "", "runningSideEffect", "", "key", "", "sideEffect", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "wf1-workflow-runtime"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    public interface SideEffectRunner {
        void runningSideEffect(String key, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> sideEffect);
    }

    @Override // com.squareup.workflow1.BaseRenderContext
    public Sink<WorkflowAction<? super PropsT, StateT, ? extends OutputT>> getActionSink() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RealRenderContext(Renderer<PropsT, StateT, OutputT> renderer, SideEffectRunner sideEffectRunner, Channel9<? super WorkflowAction<? super PropsT, StateT, ? extends OutputT>> eventActionsChannel) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(sideEffectRunner, "sideEffectRunner");
        Intrinsics.checkNotNullParameter(eventActionsChannel, "eventActionsChannel");
        this.renderer = renderer;
        this.sideEffectRunner = sideEffectRunner;
        this.eventActionsChannel = eventActionsChannel;
    }

    @Override // com.squareup.workflow1.Sink
    public void send(WorkflowAction<? super PropsT, StateT, ? extends OutputT> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!this.frozen) {
            throw new UnsupportedOperationException(Intrinsics.stringPlus("Expected sink to not be sent to until after the render pass. Received action: ", value));
        }
        this.eventActionsChannel.offer(value);
    }

    @Override // com.squareup.workflow1.BaseRenderContext
    public <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT renderChild(Workflow<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT props, String key, Function1<? super ChildOutputT, ? extends WorkflowAction<? super PropsT, StateT, ? extends OutputT>> handler) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handler, "handler");
        checkNotFrozen();
        return (ChildRenderingT) this.renderer.render(child, props, key, handler);
    }

    @Override // com.squareup.workflow1.BaseRenderContext
    public void runningSideEffect(String key, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> sideEffect) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        checkNotFrozen();
        this.sideEffectRunner.runningSideEffect(key, sideEffect);
    }

    public final void freeze() {
        checkNotFrozen();
        this.frozen = true;
    }

    private final void checkNotFrozen() {
        if (this.frozen) {
            throw new IllegalStateException("RenderContext cannot be used after render method returns.");
        }
    }
}
