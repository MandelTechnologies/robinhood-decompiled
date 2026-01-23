package com.robinhood.android.history.p153ui;

import com.robinhood.models.p320db.NonOriginatedAchTransfer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: NonOriginatedAchTransferDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/history/ui/NonOriginatedAchTransferDetailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.history.ui.NonOriginatedAchTransferDetailDuxo$onResume$1$1", m3645f = "NonOriginatedAchTransferDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.history.ui.NonOriginatedAchTransferDetailDuxo$onResume$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class NonOriginatedAchTransferDetailDuxo2 extends ContinuationImpl7 implements Function2<NonOriginatedAchTransferDetailViewState, Continuation<? super NonOriginatedAchTransferDetailViewState>, Object> {
    final /* synthetic */ NonOriginatedAchTransfer $transfer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NonOriginatedAchTransferDetailDuxo2(NonOriginatedAchTransfer nonOriginatedAchTransfer, Continuation<? super NonOriginatedAchTransferDetailDuxo2> continuation) {
        super(2, continuation);
        this.$transfer = nonOriginatedAchTransfer;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NonOriginatedAchTransferDetailDuxo2 nonOriginatedAchTransferDetailDuxo2 = new NonOriginatedAchTransferDetailDuxo2(this.$transfer, continuation);
        nonOriginatedAchTransferDetailDuxo2.L$0 = obj;
        return nonOriginatedAchTransferDetailDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(NonOriginatedAchTransferDetailViewState nonOriginatedAchTransferDetailViewState, Continuation<? super NonOriginatedAchTransferDetailViewState> continuation) {
        return ((NonOriginatedAchTransferDetailDuxo2) create(nonOriginatedAchTransferDetailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((NonOriginatedAchTransferDetailViewState) this.L$0).copy(this.$transfer);
    }
}
