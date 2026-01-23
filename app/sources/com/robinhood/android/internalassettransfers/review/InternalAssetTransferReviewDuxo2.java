package com.robinhood.android.internalassettransfers.review;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferReviewDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewDuxo$submitTransferRequest$3$1", m3645f = "InternalAssetTransferReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewDuxo$submitTransferRequest$3$1, reason: use source file name */
/* loaded from: classes10.dex */
final class InternalAssetTransferReviewDuxo2 extends ContinuationImpl7 implements Function2<InternalAssetTransferReviewDataState, Continuation<? super InternalAssetTransferReviewDataState>, Object> {
    final /* synthetic */ Throwable $throwable;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalAssetTransferReviewDuxo2(Throwable th, Continuation<? super InternalAssetTransferReviewDuxo2> continuation) {
        super(2, continuation);
        this.$throwable = th;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InternalAssetTransferReviewDuxo2 internalAssetTransferReviewDuxo2 = new InternalAssetTransferReviewDuxo2(this.$throwable, continuation);
        internalAssetTransferReviewDuxo2.L$0 = obj;
        return internalAssetTransferReviewDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InternalAssetTransferReviewDataState internalAssetTransferReviewDataState, Continuation<? super InternalAssetTransferReviewDataState> continuation) {
        return ((InternalAssetTransferReviewDuxo2) create(internalAssetTransferReviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InternalAssetTransferReviewDataState internalAssetTransferReviewDataState = (InternalAssetTransferReviewDataState) this.L$0;
        Throwable th = this.$throwable;
        Intrinsics.checkNotNull(th, "null cannot be cast to non-null type java.lang.Exception");
        return InternalAssetTransferReviewDataState.copy$default(internalAssetTransferReviewDataState, null, null, null, null, false, (Exception) th, null, 79, null);
    }
}
