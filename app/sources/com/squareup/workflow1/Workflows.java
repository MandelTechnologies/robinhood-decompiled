package com.squareup.workflow1;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KType;
import kotlinx.coroutines.flow.Flow;

@Metadata(m3635d1 = {"com/squareup/workflow1/Workflows__BaseRenderContextKt", "com/squareup/workflow1/Workflows__SinkKt", "com/squareup/workflow1/Workflows__StatefulWorkflowKt", "com/squareup/workflow1/Workflows__WorkerWorkflowKt", "com/squareup/workflow1/Workflows__WorkflowActionKt", "com/squareup/workflow1/Workflows__WorkflowIdentifierKt"}, m3636d2 = {}, m3637k = 4, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class Workflows {
    public static final <PropsT, StateT, OutputT, RenderingT> StatefulWorkflow<PropsT, StateT, OutputT, RenderingT>.RenderContext RenderContext(BaseRenderContext<? extends PropsT, StateT, ? super OutputT> baseRenderContext, StatefulWorkflow<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> statefulWorkflow) {
        return StatefulWorkflow2.RenderContext(baseRenderContext, statefulWorkflow);
    }

    public static final <PropsT, StateT, OutputT, RenderingT> WorkflowAction<PropsT, StateT, OutputT> action(StatefulWorkflow<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> statefulWorkflow, String str, Function1<? super WorkflowAction<? super PropsT, StateT, ? extends OutputT>.Updater, Unit> function1) {
        return StatefulWorkflow2.action(statefulWorkflow, str, function1);
    }

    public static final <PropsT, StateT, OutputT, RenderingT> WorkflowAction<PropsT, StateT, OutputT> action(StatefulWorkflow<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> statefulWorkflow, Function0<String> function0, Function1<? super WorkflowAction<? super PropsT, StateT, ? extends OutputT>.Updater, Unit> function1) {
        return StatefulWorkflow2.action(statefulWorkflow, function0, function1);
    }

    public static final <PropsT, StateT, OutputT> WorkflowAction<PropsT, StateT, OutputT> action(String str, Function1<? super WorkflowAction<? super PropsT, StateT, ? extends OutputT>.Updater, Unit> function1) {
        return WorkflowAction4.action(str, function1);
    }

    public static final <PropsT, StateT, OutputT> WorkflowAction<PropsT, StateT, OutputT> action(Function0<String> function0, Function1<? super WorkflowAction<? super PropsT, StateT, ? extends OutputT>.Updater, Unit> function1) {
        return WorkflowAction4.action(function0, function1);
    }

    public static final <PropsT, StateT, OutputT> Tuples2<StateT, WorkflowOutput<OutputT>> applyTo(WorkflowAction<? super PropsT, StateT, ? extends OutputT> workflowAction, PropsT propst, StateT statet) {
        return WorkflowAction4.applyTo(workflowAction, propst, statet);
    }

    public static final <T, PropsT, StateT, OutputT> Object collectToSink(Flow<? extends T> flow, Sink<? super WorkflowAction<? super PropsT, StateT, ? extends OutputT>> sink, Function1<? super T, ? extends WorkflowAction<? super PropsT, StateT, ? extends OutputT>> function1, Continuation<? super Unit> continuation) {
        return Sink2.collectToSink(flow, sink, function1, continuation);
    }

    public static final WorkflowIdentifier getIdentifier(Workflow<?, ?, ?> workflow) {
        return WorkflowIdentifier4.getIdentifier(workflow);
    }

    public static final <OutputT> Object runWorker(Worker<? extends OutputT> worker, String str, Sink<? super WorkflowAction<? super Worker<? extends OutputT>, Integer, ? extends OutputT>> sink, Continuation<? super Unit> continuation) {
        return WorkerWorkflow3.runWorker(worker, str, sink, continuation);
    }

    @PublishedApi
    public static final <T, PropsT, StateT, OutputT> void runningWorker(BaseRenderContext<? extends PropsT, StateT, ? super OutputT> baseRenderContext, Worker<? extends T> worker, KType kType, String str, Function1<? super T, ? extends WorkflowAction<? super PropsT, StateT, ? extends OutputT>> function1) {
        BaseRenderContext2.runningWorker(baseRenderContext, worker, kType, str, function1);
    }

    public static final <PropsT, StateT, OutputT> Object sendAndAwaitApplication(Sink<? super WorkflowAction<? super PropsT, StateT, ? extends OutputT>> sink, WorkflowAction<? super PropsT, StateT, ? extends OutputT> workflowAction, Continuation<? super Unit> continuation) {
        return Sink2.sendAndAwaitApplication(sink, workflowAction, continuation);
    }

    public static final WorkflowIdentifier unsnapshottableIdentifier(KType kType) {
        return WorkflowIdentifier4.unsnapshottableIdentifier(kType);
    }
}
