package com.squareup.workflow1.internal;

import com.squareup.workflow1.WorkflowOutput;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel5;

/* JADX INFO: Add missing generic type declarations: [OutputT, PropsT] */
/* compiled from: WorkflowRunner.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/squareup/workflow1/WorkflowOutput;", "OutputT", "PropsT", "RenderingT", "channelResult", "Lkotlinx/coroutines/channels/ChannelResult;"}, m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.squareup.workflow1.internal.WorkflowRunner$nextOutput$2$1", m3645f = "WorkflowRunner.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.squareup.workflow1.internal.WorkflowRunner$nextOutput$2$1, reason: use source file name */
/* loaded from: classes12.dex */
final class WorkflowRunner2<OutputT, PropsT> extends ContinuationImpl7 implements Function2<Channel5<? extends PropsT>, Continuation<? super WorkflowOutput<? extends OutputT>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WorkflowRunner<PropsT, OutputT, RenderingT> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WorkflowRunner2(WorkflowRunner<PropsT, OutputT, RenderingT> workflowRunner, Continuation<? super WorkflowRunner2> continuation) {
        super(2, continuation);
        this.this$0 = workflowRunner;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WorkflowRunner2 workflowRunner2 = new WorkflowRunner2(this.this$0, continuation);
        workflowRunner2.L$0 = obj;
        return workflowRunner2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m26829invokeWpGqRn0(((Channel5) obj).getHolder(), (Continuation) obj2);
    }

    /* renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m26829invokeWpGqRn0(Object obj, Continuation<? super WorkflowOutput<? extends OutputT>> continuation) {
        return ((WorkflowRunner2) create(Channel5.m28802boximpl(obj), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Object holder = ((Channel5) this.L$0).getHolder();
            Throwable thM28805exceptionOrNullimpl = Channel5.m28805exceptionOrNullimpl(holder);
            if (thM28805exceptionOrNullimpl != null) {
                throw thM28805exceptionOrNullimpl;
            }
            Object objM28806getOrNullimpl = Channel5.m28806getOrNullimpl(holder);
            if (objM28806getOrNullimpl == null) {
                return null;
            }
            WorkflowRunner<PropsT, OutputT, RenderingT> workflowRunner = this.this$0;
            if (Intrinsics.areEqual(((WorkflowRunner) workflowRunner).currentProps, objM28806getOrNullimpl)) {
                return null;
            }
            ((WorkflowRunner) workflowRunner).currentProps = objM28806getOrNullimpl;
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
