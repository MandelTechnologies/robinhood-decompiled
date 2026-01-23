package com.squareup.workflow1.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Add missing generic type declarations: [PropsT] */
/* compiled from: WorkflowRunner.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "PropsT", "OutputT", "RenderingT", "it"}, m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.squareup.workflow1.internal.WorkflowRunner$propsChannel$1", m3645f = "WorkflowRunner.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.squareup.workflow1.internal.WorkflowRunner$propsChannel$1, reason: use source file name */
/* loaded from: classes12.dex */
final class WorkflowRunner3<PropsT> extends ContinuationImpl7 implements Function2<PropsT, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WorkflowRunner<PropsT, OutputT, RenderingT> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WorkflowRunner3(WorkflowRunner<PropsT, OutputT, RenderingT> workflowRunner, Continuation<? super WorkflowRunner3> continuation) {
        super(2, continuation);
        this.this$0 = workflowRunner;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WorkflowRunner3 workflowRunner3 = new WorkflowRunner3(this.this$0, continuation);
        workflowRunner3.L$0 = obj;
        return workflowRunner3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Boolean> continuation) {
        return invoke2((WorkflowRunner3<PropsT>) obj, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PropsT propst, Continuation<? super Boolean> continuation) {
        return ((WorkflowRunner3) create(propst, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return boxing.boxBoolean(Intrinsics.areEqual(this.L$0, ((WorkflowRunner) this.this$0).currentProps));
    }
}
