package com.squareup.workflow1;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;

/* compiled from: BaseRenderContext.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0083\u0001\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2$\u0010\r\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\f0\u000bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"T", "PropsT", "StateT", "OutputT", "Lcom/squareup/workflow1/BaseRenderContext;", "Lcom/squareup/workflow1/Worker;", "worker", "Lkotlin/reflect/KType;", "workerType", "", "key", "Lkotlin/Function1;", "Lcom/squareup/workflow1/WorkflowAction;", "handler", "", "runningWorker", "(Lcom/squareup/workflow1/BaseRenderContext;Lcom/squareup/workflow1/Worker;Lkotlin/reflect/KType;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "wf1-workflow-core"}, m3637k = 5, m3638mv = {1, 6, 0}, m3640xi = 48, m3641xs = "com/squareup/workflow1/Workflows")
/* renamed from: com.squareup.workflow1.Workflows__BaseRenderContextKt, reason: use source file name */
/* loaded from: classes12.dex */
final /* synthetic */ class BaseRenderContext2 {
    /* JADX WARN: Multi-variable type inference failed */
    @PublishedApi
    public static final <T, PropsT, StateT, OutputT> void runningWorker(BaseRenderContext<? extends PropsT, StateT, ? super OutputT> baseRenderContext, Worker<? extends T> worker, KType workerType, String key, Function1<? super T, ? extends WorkflowAction<? super PropsT, StateT, ? extends OutputT>> handler) {
        Intrinsics.checkNotNullParameter(baseRenderContext, "<this>");
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(workerType, "workerType");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handler, "handler");
        baseRenderContext.renderChild(new WorkerWorkflow(workerType, key), worker, key, handler);
    }
}
