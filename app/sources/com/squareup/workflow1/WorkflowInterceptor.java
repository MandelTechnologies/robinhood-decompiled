package com.squareup.workflow1;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WorkflowInterceptor.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002#$JO\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0005\u001a\u0002H\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u0002H\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u0002H\u00030\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fJY\u0010\r\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u000e\u001a\u0002H\u00042\u0006\u0010\u000f\u001a\u0002H\u00042\u0006\u0010\u0010\u001a\u0002H\u00032\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00030\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\u0012J\u008b\u0001\u0010\u0013\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0015\"\u0004\b\u0003\u0010\u00142\u0006\u0010\u0016\u001a\u0002H\u00042\u0006\u0010\u0017\u001a\u0002H\u00032\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00150\u001922\u0010\b\u001a.\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0015\u0018\u00010\u001a\u0012\u0004\u0012\u0002H\u00140\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u000bH\u0016J;\u0010 \u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0010\u001a\u0002H\u00032\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070!2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\"¨\u0006%"}, m3636d2 = {"Lcom/squareup/workflow1/WorkflowInterceptor;", "", "onInitialState", "S", "P", "props", "snapshot", "Lcom/squareup/workflow1/Snapshot;", "proceed", "Lkotlin/Function2;", "session", "Lcom/squareup/workflow1/WorkflowInterceptor$WorkflowSession;", "(Ljava/lang/Object;Lcom/squareup/workflow1/Snapshot;Lkotlin/jvm/functions/Function2;Lcom/squareup/workflow1/WorkflowInterceptor$WorkflowSession;)Ljava/lang/Object;", "onPropsChanged", "old", "new", "state", "Lkotlin/Function3;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lcom/squareup/workflow1/WorkflowInterceptor$WorkflowSession;)Ljava/lang/Object;", "onRender", "R", "O", "renderProps", "renderState", "context", "Lcom/squareup/workflow1/BaseRenderContext;", "Lcom/squareup/workflow1/WorkflowInterceptor$RenderContextInterceptor;", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/squareup/workflow1/BaseRenderContext;Lkotlin/jvm/functions/Function3;Lcom/squareup/workflow1/WorkflowInterceptor$WorkflowSession;)Ljava/lang/Object;", "onSessionStarted", "", "workflowScope", "Lkotlinx/coroutines/CoroutineScope;", "onSnapshotState", "Lkotlin/Function1;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lcom/squareup/workflow1/WorkflowInterceptor$WorkflowSession;)Lcom/squareup/workflow1/Snapshot;", "RenderContextInterceptor", "WorkflowSession", "wf1-workflow-runtime"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface WorkflowInterceptor {

    /* compiled from: WorkflowInterceptor.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004JH\u0010\u0005\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b2$\u0010\t\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b\u0012\u0004\u0012\u00020\u00060\nH\u0016J\u0083\u0002\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0003\u0010\r\"\u0004\b\u0004\u0010\u000e\"\u0004\b\u0005\u0010\f2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\f0\u00102\u0006\u0010\u0011\u001a\u0002H\r2\u0006\u0010\u0012\u001a\u00020\u00132$\u0010\u0014\u001a \u0012\u0004\u0012\u0002H\u000e\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\n2\u0091\u0001\u0010\t\u001a\u008c\u0001\u0012%\u0012#\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\f0\u0010¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u0011H\r¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0012\u00121\u0012/\u0012\u0004\u0012\u0002H\u000e\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\n¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u0002H\f0\u0015H\u0016¢\u0006\u0002\u0010\u0018J\u0084\u0001\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u001a\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n2L\u0010\t\u001aH\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0012\u0012)\u0012'\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00060\u001cH\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m3636d2 = {"Lcom/squareup/workflow1/WorkflowInterceptor$RenderContextInterceptor;", "P", "S", "O", "", "onActionSent", "", "action", "Lcom/squareup/workflow1/WorkflowAction;", "proceed", "Lkotlin/Function1;", "onRenderChild", "CR", "CP", "CO", "child", "Lcom/squareup/workflow1/Workflow;", "childProps", "key", "", "handler", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "(Lcom/squareup/workflow1/Workflow;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "onRunningSideEffect", "sideEffect", "Lkotlin/coroutines/Continuation;", "Lkotlin/Function2;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "wf1-workflow-runtime"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    public interface RenderContextInterceptor<P, S, O> {
        void onActionSent(WorkflowAction<? super P, S, ? extends O> action, Function1<? super WorkflowAction<? super P, S, ? extends O>, Unit> proceed);

        <CP, CO, CR> CR onRenderChild(Workflow<? super CP, ? extends CO, ? extends CR> child, CP childProps, String key, Function1<? super CO, ? extends WorkflowAction<? super P, S, ? extends O>> handler, Function4<? super Workflow<? super CP, ? extends CO, ? extends CR>, ? super CP, ? super String, ? super Function1<? super CO, ? extends WorkflowAction<? super P, S, ? extends O>>, ? extends CR> proceed);

        void onRunningSideEffect(String key, Function1<? super Continuation<? super Unit>, ? extends Object> sideEffect, Function2<? super String, ? super Function1<? super Continuation<? super Unit>, ? extends Object>, Unit> proceed);
    }

    /* compiled from: WorkflowInterceptor.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"Lcom/squareup/workflow1/WorkflowInterceptor$WorkflowSession;", "", "wf1-workflow-runtime"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    public interface WorkflowSession {
    }

    <P, S> S onInitialState(P props, Snapshot snapshot, Function2<? super P, ? super Snapshot, ? extends S> proceed, WorkflowSession session);

    <P, S> S onPropsChanged(P old, P p, S state, Function3<? super P, ? super P, ? super S, ? extends S> proceed, WorkflowSession session);

    <P, S, O, R> R onRender(P renderProps, S renderState, BaseRenderContext<? extends P, S, ? super O> context, Function3<? super P, ? super S, ? super RenderContextInterceptor<P, S, O>, ? extends R> proceed, WorkflowSession session);

    void onSessionStarted(CoroutineScope workflowScope, WorkflowSession session);

    <S> Snapshot onSnapshotState(S state, Function1<? super S, Snapshot> proceed, WorkflowSession session);

    /* compiled from: WorkflowInterceptor.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static void onSessionStarted(WorkflowInterceptor workflowInterceptor, CoroutineScope workflowScope, WorkflowSession session) {
            Intrinsics.checkNotNullParameter(workflowInterceptor, "this");
            Intrinsics.checkNotNullParameter(workflowScope, "workflowScope");
            Intrinsics.checkNotNullParameter(session, "session");
        }

        public static <P, S> S onInitialState(WorkflowInterceptor workflowInterceptor, P p, Snapshot snapshot, Function2<? super P, ? super Snapshot, ? extends S> proceed, WorkflowSession session) {
            Intrinsics.checkNotNullParameter(workflowInterceptor, "this");
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            Intrinsics.checkNotNullParameter(session, "session");
            return proceed.invoke(p, snapshot);
        }

        public static <P, S> S onPropsChanged(WorkflowInterceptor workflowInterceptor, P p, P p2, S s, Function3<? super P, ? super P, ? super S, ? extends S> proceed, WorkflowSession session) {
            Intrinsics.checkNotNullParameter(workflowInterceptor, "this");
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            Intrinsics.checkNotNullParameter(session, "session");
            return proceed.invoke(p, p2, s);
        }

        public static <P, S, O, R> R onRender(WorkflowInterceptor workflowInterceptor, P p, S s, BaseRenderContext<? extends P, S, ? super O> context, Function3<? super P, ? super S, ? super RenderContextInterceptor<P, S, O>, ? extends R> proceed, WorkflowSession session) {
            Intrinsics.checkNotNullParameter(workflowInterceptor, "this");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            Intrinsics.checkNotNullParameter(session, "session");
            return proceed.invoke(p, s, null);
        }

        public static <S> Snapshot onSnapshotState(WorkflowInterceptor workflowInterceptor, S s, Function1<? super S, Snapshot> proceed, WorkflowSession session) {
            Intrinsics.checkNotNullParameter(workflowInterceptor, "this");
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            Intrinsics.checkNotNullParameter(session, "session");
            return proceed.invoke(s);
        }
    }
}
