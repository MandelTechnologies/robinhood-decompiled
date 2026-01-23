package com.squareup.workflow1;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: Sink.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a{\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00060\u00052$\u0010\t\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00060\bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a[\u0010\u000e\u001a\u00020\n\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u00052\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m3636d2 = {"T", "PropsT", "StateT", "OutputT", "Lkotlinx/coroutines/flow/Flow;", "Lcom/squareup/workflow1/Sink;", "Lcom/squareup/workflow1/WorkflowAction;", "actionSink", "Lkotlin/Function1;", "handler", "", "collectToSink", "(Lkotlinx/coroutines/flow/Flow;Lcom/squareup/workflow1/Sink;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "action", "sendAndAwaitApplication", "(Lcom/squareup/workflow1/Sink;Lcom/squareup/workflow1/WorkflowAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wf1-workflow-core"}, m3637k = 5, m3638mv = {1, 6, 0}, m3640xi = 48, m3641xs = "com/squareup/workflow1/Workflows")
/* renamed from: com.squareup.workflow1.Workflows__SinkKt, reason: use source file name */
/* loaded from: classes12.dex */
final /* synthetic */ class Sink2 {
    public static final <T, PropsT, StateT, OutputT> Object collectToSink(Flow<? extends T> flow, final Sink<? super WorkflowAction<? super PropsT, StateT, ? extends OutputT>> sink, final Function1<? super T, ? extends WorkflowAction<? super PropsT, StateT, ? extends OutputT>> function1, Continuation<? super Unit> continuation) {
        Object objCollect = flow.collect(new FlowCollector<T>() { // from class: com.squareup.workflow1.Workflows__SinkKt$collectToSink$$inlined$collect$1
            @Override // kotlinx.coroutines.flow.FlowCollector
            public Object emit(T t, Continuation<? super Unit> continuation2) {
                Object objSendAndAwaitApplication = Workflows.sendAndAwaitApplication(sink, (WorkflowAction) function1.invoke(t), continuation2);
                return objSendAndAwaitApplication == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendAndAwaitApplication : Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    public static final <PropsT, StateT, OutputT> Object sendAndAwaitApplication(Sink<? super WorkflowAction<? super PropsT, StateT, ? extends OutputT>> sink, final WorkflowAction<? super PropsT, StateT, ? extends OutputT> workflowAction, Continuation<? super Unit> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        sink.send(new WorkflowAction<PropsT, StateT, OutputT>() { // from class: com.squareup.workflow1.Workflows__SinkKt$sendAndAwaitApplication$2$resumingAction$1
            public String toString() {
                return "sendAndAwaitApplication(" + workflowAction + ')';
            }

            @Override // com.squareup.workflow1.WorkflowAction
            public void apply(WorkflowAction<? super PropsT, StateT, ? extends OutputT>.Updater updater) {
                Intrinsics.checkNotNullParameter(updater, "<this>");
                if (cancellableContinuationImpl.isActive()) {
                    workflowAction.apply(updater);
                    CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
                }
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }
}
