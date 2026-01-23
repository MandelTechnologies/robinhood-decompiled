package com.robinhood.android.transfers.international.p266ui.review;

import bff_money_movement.service.p019v1.GetServiceFeeResponseDto;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ReviewTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.review.ReviewTransferDuxo$fetchServiceFee$3$1", m3645f = "ReviewTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.international.ui.review.ReviewTransferDuxo$fetchServiceFee$3$1, reason: use source file name */
/* loaded from: classes9.dex */
final class ReviewTransferDuxo3 extends ContinuationImpl7 implements Function2<ReviewTransferDataState, Continuation<? super ReviewTransferDataState>, Object> {
    final /* synthetic */ GetServiceFeeResponseDto $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewTransferDuxo3(GetServiceFeeResponseDto getServiceFeeResponseDto, Continuation<? super ReviewTransferDuxo3> continuation) {
        super(2, continuation);
        this.$it = getServiceFeeResponseDto;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ReviewTransferDuxo3 reviewTransferDuxo3 = new ReviewTransferDuxo3(this.$it, continuation);
        reviewTransferDuxo3.L$0 = obj;
        return reviewTransferDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ReviewTransferDataState reviewTransferDataState, Continuation<? super ReviewTransferDataState> continuation) {
        return ((ReviewTransferDuxo3) create(reviewTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ReviewTransferDataState.copy$default((ReviewTransferDataState) this.L$0, null, null, null, null, null, this.$it, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
    }
}
