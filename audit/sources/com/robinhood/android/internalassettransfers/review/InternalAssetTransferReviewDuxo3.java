package com.robinhood.android.internalassettransfers.review;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InternalAssetTransferReviewDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewDuxo$submitTransferRequest$4$1", m3645f = "InternalAssetTransferReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewDuxo$submitTransferRequest$4$1, reason: use source file name */
/* loaded from: classes10.dex */
final class InternalAssetTransferReviewDuxo3 extends ContinuationImpl7 implements Function2<InternalAssetTransferReviewDataState, Continuation<? super InternalAssetTransferReviewDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    InternalAssetTransferReviewDuxo3(Continuation<? super InternalAssetTransferReviewDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InternalAssetTransferReviewDuxo3 internalAssetTransferReviewDuxo3 = new InternalAssetTransferReviewDuxo3(continuation);
        internalAssetTransferReviewDuxo3.L$0 = obj;
        return internalAssetTransferReviewDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InternalAssetTransferReviewDataState internalAssetTransferReviewDataState, Continuation<? super InternalAssetTransferReviewDataState> continuation) {
        return ((InternalAssetTransferReviewDuxo3) create(internalAssetTransferReviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return InternalAssetTransferReviewDataState.copy$default((InternalAssetTransferReviewDataState) this.L$0, null, null, null, null, false, null, null, 111, null);
    }
}
