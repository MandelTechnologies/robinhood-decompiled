package com.squareup.workflow1;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BaseRenderContext.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00002\u00020\u0004Js\u0010\u0010\u001a\u00028\u0005\"\u0004\b\u0003\u0010\u0005\"\u0004\b\u0004\u0010\u0006\"\u0004\b\u0005\u0010\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\b2\u0006\u0010\n\u001a\u00028\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2$\u0010\u000f\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011JC\u0010\u0018\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0012¢\u0006\u0002\b\u0016H&ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R,\u0010\u001d\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e0\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m3636d2 = {"Lcom/squareup/workflow1/BaseRenderContext;", "PropsT", "StateT", "OutputT", "", "ChildPropsT", "ChildOutputT", "ChildRenderingT", "Lcom/squareup/workflow1/Workflow;", "child", "props", "", "key", "Lkotlin/Function1;", "Lcom/squareup/workflow1/WorkflowAction;", "handler", "renderChild", "(Lcom/squareup/workflow1/Workflow;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "sideEffect", "runningSideEffect", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lcom/squareup/workflow1/Sink;", "getActionSink", "()Lcom/squareup/workflow1/Sink;", "actionSink", "wf1-workflow-core"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface BaseRenderContext<PropsT, StateT, OutputT> {
    Sink<WorkflowAction<? super PropsT, StateT, ? extends OutputT>> getActionSink();

    <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT renderChild(Workflow<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT props, String key, Function1<? super ChildOutputT, ? extends WorkflowAction<? super PropsT, StateT, ? extends OutputT>> handler);

    void runningSideEffect(String key, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> sideEffect);

    /* compiled from: BaseRenderContext.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object renderChild$default(BaseRenderContext baseRenderContext, Workflow workflow, Object obj, String str, Function1 function1, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderChild");
            }
            if ((i & 4) != 0) {
                str = "";
            }
            return baseRenderContext.renderChild(workflow, obj, str, function1);
        }
    }
}
