package com.squareup.workflow1;

import com.squareup.workflow1.Worker;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlinx.coroutines.flow.Flow;

/* compiled from: Worker.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/squareup/workflow1/TypedWorker;", "OutputT", "Lcom/squareup/workflow1/Worker;", "outputType", "Lkotlin/reflect/KType;", "work", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlin/reflect/KType;Lkotlinx/coroutines/flow/Flow;)V", "run", "toString", "", "wf1-workflow-core"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
@PublishedApi
/* loaded from: classes12.dex */
public final class TypedWorker<OutputT> implements Worker<OutputT> {
    private final KType outputType;
    private final Flow<OutputT> work;

    /* JADX WARN: Multi-variable type inference failed */
    public TypedWorker(KType outputType, Flow<? extends OutputT> work) {
        Intrinsics.checkNotNullParameter(outputType, "outputType");
        Intrinsics.checkNotNullParameter(work, "work");
        this.outputType = outputType;
        this.work = work;
    }

    @Override // com.squareup.workflow1.Worker
    public boolean doesSameWorkAs(Worker<?> worker) {
        return Worker.DefaultImpls.doesSameWorkAs(this, worker);
    }

    @Override // com.squareup.workflow1.Worker
    public Flow<OutputT> run() {
        return this.work;
    }

    public String toString() {
        return "TypedWorker(" + this.outputType + ')';
    }
}
