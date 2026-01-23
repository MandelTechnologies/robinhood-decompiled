package com.squareup.workflow1.internal;

import com.squareup.workflow1.BaseRenderContext;
import com.squareup.workflow1.Snapshot;
import com.squareup.workflow1.Workflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.WorkflowInterceptor;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChainedWorkflowInterceptor.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0004JO\u0010\u0005\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u00062\u0006\u0010\b\u001a\u0002H\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u0002H\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u0002H\u00060\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\u000fJY\u0010\u0010\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u0011\u001a\u0002H\u00072\u0006\u0010\u0012\u001a\u0002H\u00072\u0006\u0010\u0013\u001a\u0002H\u00062\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00060\u00142\u0006\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\u0015J\u008b\u0001\u0010\u0016\u001a\u0002H\u0017\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u0006\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u00172\u0006\u0010\u0019\u001a\u0002H\u00072\u0006\u0010\u001a\u001a\u0002H\u00062\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00180\u001c22\u0010\u000b\u001a.\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0018\u0018\u00010\u001d\u0012\u0004\u0012\u0002H\u00170\u00142\u0006\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\u000eH\u0016J;\u0010#\u001a\u0004\u0018\u00010\n\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0013\u001a\u0002H\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\u0006\u0012\u0006\u0012\u0004\u0018\u00010\n0$2\u0006\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010%Jb\u0010&\u001a\u0016\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0018\u0018\u00010\u001d\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u0006\"\u0004\b\u0002\u0010\u0018*\u0016\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0018\u0018\u00010\u001d2\u001a\u0010'\u001a\u0016\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0018\u0018\u00010\u001dH\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"Lcom/squareup/workflow1/internal/ChainedWorkflowInterceptor;", "Lcom/squareup/workflow1/WorkflowInterceptor;", "interceptors", "", "(Ljava/util/List;)V", "onInitialState", "S", "P", "props", "snapshot", "Lcom/squareup/workflow1/Snapshot;", "proceed", "Lkotlin/Function2;", "session", "Lcom/squareup/workflow1/WorkflowInterceptor$WorkflowSession;", "(Ljava/lang/Object;Lcom/squareup/workflow1/Snapshot;Lkotlin/jvm/functions/Function2;Lcom/squareup/workflow1/WorkflowInterceptor$WorkflowSession;)Ljava/lang/Object;", "onPropsChanged", "old", "new", "state", "Lkotlin/Function3;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lcom/squareup/workflow1/WorkflowInterceptor$WorkflowSession;)Ljava/lang/Object;", "onRender", "R", "O", "renderProps", "renderState", "context", "Lcom/squareup/workflow1/BaseRenderContext;", "Lcom/squareup/workflow1/WorkflowInterceptor$RenderContextInterceptor;", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/squareup/workflow1/BaseRenderContext;Lkotlin/jvm/functions/Function3;Lcom/squareup/workflow1/WorkflowInterceptor$WorkflowSession;)Ljava/lang/Object;", "onSessionStarted", "", "workflowScope", "Lkotlinx/coroutines/CoroutineScope;", "onSnapshotState", "Lkotlin/Function1;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lcom/squareup/workflow1/WorkflowInterceptor$WorkflowSession;)Lcom/squareup/workflow1/Snapshot;", "wrap", "inner", "wf1-workflow-runtime"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ChainedWorkflowInterceptor implements WorkflowInterceptor {
    private final List<WorkflowInterceptor> interceptors;

    /* JADX WARN: Multi-variable type inference failed */
    public ChainedWorkflowInterceptor(List<? extends WorkflowInterceptor> interceptors) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        this.interceptors = interceptors;
    }

    @Override // com.squareup.workflow1.WorkflowInterceptor
    public void onSessionStarted(CoroutineScope workflowScope, WorkflowInterceptor.WorkflowSession session) {
        Intrinsics.checkNotNullParameter(workflowScope, "workflowScope");
        Intrinsics.checkNotNullParameter(session, "session");
        Iterator<T> it = this.interceptors.iterator();
        while (it.hasNext()) {
            ((WorkflowInterceptor) it.next()).onSessionStarted(workflowScope, session);
        }
    }

    @Override // com.squareup.workflow1.WorkflowInterceptor
    public <P, S> S onInitialState(P props, Snapshot snapshot, final Function2<? super P, ? super Snapshot, ? extends S> proceed, final WorkflowInterceptor.WorkflowSession session) {
        Intrinsics.checkNotNullParameter(proceed, "proceed");
        Intrinsics.checkNotNullParameter(session, "session");
        List<WorkflowInterceptor> list = this.interceptors;
        if (!list.isEmpty()) {
            ListIterator<WorkflowInterceptor> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                final WorkflowInterceptor workflowInterceptorPrevious = listIterator.previous();
                proceed = new Function2<P, Snapshot, S>() { // from class: com.squareup.workflow1.internal.ChainedWorkflowInterceptor$onInitialState$chainedProceed$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Snapshot snapshot2) {
                        return invoke2((ChainedWorkflowInterceptor2<P, S>) obj, snapshot2);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final S invoke2(P p, Snapshot snapshot2) {
                        return (S) workflowInterceptorPrevious.onInitialState(p, snapshot2, proceed, session);
                    }
                };
            }
        }
        return proceed.invoke(props, snapshot);
    }

    @Override // com.squareup.workflow1.WorkflowInterceptor
    public <P, S> S onPropsChanged(P old, P p, S state, final Function3<? super P, ? super P, ? super S, ? extends S> proceed, final WorkflowInterceptor.WorkflowSession session) {
        Intrinsics.checkNotNullParameter(proceed, "proceed");
        Intrinsics.checkNotNullParameter(session, "session");
        List<WorkflowInterceptor> list = this.interceptors;
        if (!list.isEmpty()) {
            ListIterator<WorkflowInterceptor> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                final WorkflowInterceptor workflowInterceptorPrevious = listIterator.previous();
                proceed = new Function3<P, P, S, S>() { // from class: com.squareup.workflow1.internal.ChainedWorkflowInterceptor$onPropsChanged$chainedProceed$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final S invoke(P p2, P p3, S s) {
                        return (S) workflowInterceptorPrevious.onPropsChanged(p2, p3, s, proceed, session);
                    }
                };
            }
        }
        return proceed.invoke(old, p, state);
    }

    @Override // com.squareup.workflow1.WorkflowInterceptor
    public <P, S, O, R> R onRender(P renderProps, S renderState, final BaseRenderContext<? extends P, S, ? super O> context, Function3<? super P, ? super S, ? super WorkflowInterceptor.RenderContextInterceptor<P, S, O>, ? extends R> proceed, final WorkflowInterceptor.WorkflowSession session) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(proceed, "proceed");
        Intrinsics.checkNotNullParameter(session, "session");
        List<WorkflowInterceptor> list = this.interceptors;
        if (!list.isEmpty()) {
            ListIterator<WorkflowInterceptor> listIterator = list.listIterator(list.size());
            final Function3<? super P, ? super S, ? super WorkflowInterceptor.RenderContextInterceptor<P, S, O>, ? extends R> function3 = proceed;
            while (listIterator.hasPrevious()) {
                final WorkflowInterceptor workflowInterceptorPrevious = listIterator.previous();
                function3 = new Function3<P, S, WorkflowInterceptor.RenderContextInterceptor<P, S, O>, R>() { // from class: com.squareup.workflow1.internal.ChainedWorkflowInterceptor$onRender$chainedProceed$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return invoke((ChainedWorkflowInterceptor4<O, P, R, S>) obj, obj2, (WorkflowInterceptor.RenderContextInterceptor<ChainedWorkflowInterceptor4<O, P, R, S>, Object, O>) obj3);
                    }

                    public final R invoke(P p, S s, final WorkflowInterceptor.RenderContextInterceptor<P, S, O> renderContextInterceptor) {
                        WorkflowInterceptor workflowInterceptor = workflowInterceptorPrevious;
                        BaseRenderContext<P, S, O> baseRenderContext = context;
                        final ChainedWorkflowInterceptor chainedWorkflowInterceptor = this;
                        final Function3<P, S, WorkflowInterceptor.RenderContextInterceptor<P, S, O>, R> function32 = function3;
                        return (R) workflowInterceptor.onRender(p, s, baseRenderContext, new Function3<P, S, WorkflowInterceptor.RenderContextInterceptor<P, S, O>, R>() { // from class: com.squareup.workflow1.internal.ChainedWorkflowInterceptor$onRender$chainedProceed$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                return invoke((C424771) obj, obj2, (WorkflowInterceptor.RenderContextInterceptor<C424771, Object, O>) obj3);
                            }

                            public final R invoke(P p2, S s2, WorkflowInterceptor.RenderContextInterceptor<P, S, O> renderContextInterceptor2) {
                                return function32.invoke(p2, s2, chainedWorkflowInterceptor.wrap(renderContextInterceptor, renderContextInterceptor2));
                            }
                        }, session);
                    }
                };
            }
            proceed = function3;
        }
        return proceed.invoke(renderProps, renderState, null);
    }

    @Override // com.squareup.workflow1.WorkflowInterceptor
    public <S> Snapshot onSnapshotState(S state, final Function1<? super S, Snapshot> proceed, final WorkflowInterceptor.WorkflowSession session) {
        Intrinsics.checkNotNullParameter(proceed, "proceed");
        Intrinsics.checkNotNullParameter(session, "session");
        List<WorkflowInterceptor> list = this.interceptors;
        if (!list.isEmpty()) {
            ListIterator<WorkflowInterceptor> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                final WorkflowInterceptor workflowInterceptorPrevious = listIterator.previous();
                proceed = new Function1<S, Snapshot>() { // from class: com.squareup.workflow1.internal.ChainedWorkflowInterceptor$onSnapshotState$chainedProceed$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Snapshot invoke(Object obj) {
                        return invoke((ChainedWorkflowInterceptor5<S>) obj);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function1
                    public final Snapshot invoke(S s) {
                        return workflowInterceptorPrevious.onSnapshotState(s, proceed, session);
                    }
                };
            }
        }
        return proceed.invoke(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <P, S, O> WorkflowInterceptor.RenderContextInterceptor<P, S, O> wrap(WorkflowInterceptor.RenderContextInterceptor<P, S, O> renderContextInterceptor, WorkflowInterceptor.RenderContextInterceptor<P, S, O> renderContextInterceptor2) {
        if (renderContextInterceptor == null && renderContextInterceptor2 == null) {
            return null;
        }
        return renderContextInterceptor == null ? renderContextInterceptor2 : renderContextInterceptor2 == null ? renderContextInterceptor : new WorkflowInterceptor.RenderContextInterceptor<P, S, O>(renderContextInterceptor, renderContextInterceptor2) { // from class: com.squareup.workflow1.internal.ChainedWorkflowInterceptor.wrap.1
            final /* synthetic */ WorkflowInterceptor.RenderContextInterceptor<P, S, O> $inner;
            final /* synthetic */ WorkflowInterceptor.RenderContextInterceptor<P, S, O> $this_wrap;
            private final WorkflowInterceptor.RenderContextInterceptor<P, S, O> outer;

            {
                this.$this_wrap = renderContextInterceptor;
                this.$inner = renderContextInterceptor2;
                Intrinsics.checkNotNull(renderContextInterceptor);
                this.outer = renderContextInterceptor;
            }

            @Override // com.squareup.workflow1.WorkflowInterceptor.RenderContextInterceptor
            public void onActionSent(WorkflowAction<? super P, S, ? extends O> action, final Function1<? super WorkflowAction<? super P, S, ? extends O>, Unit> proceed) {
                Intrinsics.checkNotNullParameter(action, "action");
                Intrinsics.checkNotNullParameter(proceed, "proceed");
                WorkflowInterceptor.RenderContextInterceptor<P, S, O> renderContextInterceptor3 = this.outer;
                final WorkflowInterceptor.RenderContextInterceptor<P, S, O> renderContextInterceptor4 = this.$inner;
                renderContextInterceptor3.onActionSent(action, new Function1<WorkflowAction<? super P, S, ? extends O>, Unit>() { // from class: com.squareup.workflow1.internal.ChainedWorkflowInterceptor$wrap$1$onActionSent$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                        invoke((WorkflowAction) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(WorkflowAction<? super P, S, ? extends O> interceptedAction) {
                        Intrinsics.checkNotNullParameter(interceptedAction, "interceptedAction");
                        renderContextInterceptor4.onActionSent(interceptedAction, proceed);
                    }
                });
            }

            @Override // com.squareup.workflow1.WorkflowInterceptor.RenderContextInterceptor
            public <CP, CO, CR> CR onRenderChild(Workflow<? super CP, ? extends CO, ? extends CR> child, CP childProps, String key, Function1<? super CO, ? extends WorkflowAction<? super P, S, ? extends O>> handler, final Function4<? super Workflow<? super CP, ? extends CO, ? extends CR>, ? super CP, ? super String, ? super Function1<? super CO, ? extends WorkflowAction<? super P, S, ? extends O>>, ? extends CR> proceed) {
                Intrinsics.checkNotNullParameter(child, "child");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(handler, "handler");
                Intrinsics.checkNotNullParameter(proceed, "proceed");
                WorkflowInterceptor.RenderContextInterceptor<P, S, O> renderContextInterceptor3 = this.outer;
                final WorkflowInterceptor.RenderContextInterceptor<P, S, O> renderContextInterceptor4 = this.$inner;
                return (CR) renderContextInterceptor3.onRenderChild(child, childProps, key, handler, new Function4<Workflow<? super CP, ? extends CO, ? extends CR>, CP, String, Function1<? super CO, ? extends WorkflowAction<? super P, S, ? extends O>>, CR>() { // from class: com.squareup.workflow1.internal.ChainedWorkflowInterceptor$wrap$1$onRenderChild$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(4);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, String str, Object obj3) {
                        return invoke((Workflow<? super Workflow<? super CP, ? extends CO, ? extends CR>, ? extends CO, ? extends CR>) obj, (Workflow<? super CP, ? extends CO, ? extends CR>) obj2, str, (Function1) obj3);
                    }

                    public final CR invoke(Workflow<? super CP, ? extends CO, ? extends CR> c, CP cp, String k, Function1<? super CO, ? extends WorkflowAction<? super P, S, ? extends O>> h) {
                        Intrinsics.checkNotNullParameter(c, "c");
                        Intrinsics.checkNotNullParameter(k, "k");
                        Intrinsics.checkNotNullParameter(h, "h");
                        return (CR) renderContextInterceptor4.onRenderChild(c, cp, k, h, proceed);
                    }
                });
            }

            @Override // com.squareup.workflow1.WorkflowInterceptor.RenderContextInterceptor
            public void onRunningSideEffect(String key, Function1<? super Continuation<? super Unit>, ? extends Object> sideEffect, final Function2<? super String, ? super Function1<? super Continuation<? super Unit>, ? extends Object>, Unit> proceed) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
                Intrinsics.checkNotNullParameter(proceed, "proceed");
                WorkflowInterceptor.RenderContextInterceptor<P, S, O> renderContextInterceptor3 = this.outer;
                final WorkflowInterceptor.RenderContextInterceptor<P, S, O> renderContextInterceptor4 = this.$inner;
                renderContextInterceptor3.onRunningSideEffect(key, sideEffect, new Function2<String, Function1<? super Continuation<? super Unit>, ? extends Object>, Unit>() { // from class: com.squareup.workflow1.internal.ChainedWorkflowInterceptor$wrap$1$onRunningSideEffect$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(String str, Function1<? super Continuation<? super Unit>, ? extends Object> function1) {
                        invoke2(str, function1);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String iKey, Function1<? super Continuation<? super Unit>, ? extends Object> iSideEffect) {
                        Intrinsics.checkNotNullParameter(iKey, "iKey");
                        Intrinsics.checkNotNullParameter(iSideEffect, "iSideEffect");
                        renderContextInterceptor4.onRunningSideEffect(iKey, iSideEffect, proceed);
                    }
                });
            }
        };
    }
}
