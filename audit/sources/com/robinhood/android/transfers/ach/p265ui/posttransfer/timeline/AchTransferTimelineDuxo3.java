package com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline;

import com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.AchTransferTimelineState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AchTransferTimelineDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.posttransfer.timeline.AchTransferTimelineDuxo$onCreate$3$1", m3645f = "AchTransferTimelineDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ach.ui.posttransfer.timeline.AchTransferTimelineDuxo$onCreate$3$1, reason: use source file name */
/* loaded from: classes9.dex */
final class AchTransferTimelineDuxo3 extends ContinuationImpl7 implements Function2<AchTransferTimelineState, Continuation<? super AchTransferTimelineState>, Object> {
    int label;

    AchTransferTimelineDuxo3(Continuation<? super AchTransferTimelineDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AchTransferTimelineDuxo3(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AchTransferTimelineState achTransferTimelineState, Continuation<? super AchTransferTimelineState> continuation) {
        return ((AchTransferTimelineDuxo3) create(achTransferTimelineState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AchTransferTimelineState.Error.INSTANCE;
    }
}
