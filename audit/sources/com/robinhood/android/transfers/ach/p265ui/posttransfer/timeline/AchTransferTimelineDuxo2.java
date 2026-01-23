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
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AchTransferTimelineDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.posttransfer.timeline.AchTransferTimelineDuxo$onCreate$2$1", m3645f = "AchTransferTimelineDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ach.ui.posttransfer.timeline.AchTransferTimelineDuxo$onCreate$2$1, reason: use source file name */
/* loaded from: classes9.dex */
final class AchTransferTimelineDuxo2 extends ContinuationImpl7 implements Function2<AchTransferTimelineState, Continuation<? super AchTransferTimelineState>, Object> {
    final /* synthetic */ AchTransferTimelineState.Loaded $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AchTransferTimelineDuxo2(AchTransferTimelineState.Loaded loaded, Continuation<? super AchTransferTimelineDuxo2> continuation) {
        super(2, continuation);
        this.$state = loaded;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AchTransferTimelineDuxo2(this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AchTransferTimelineState achTransferTimelineState, Continuation<? super AchTransferTimelineState> continuation) {
        return ((AchTransferTimelineDuxo2) create(achTransferTimelineState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AchTransferTimelineState.Loaded loaded = this.$state;
        Intrinsics.checkNotNull(loaded);
        return loaded;
    }
}
