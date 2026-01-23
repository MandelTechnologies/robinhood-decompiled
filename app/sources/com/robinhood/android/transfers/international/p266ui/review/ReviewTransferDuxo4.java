package com.robinhood.android.transfers.international.p266ui.review;

import com.robinhood.android.transfers.international.p266ui.model.FxData;
import com.robinhood.android.transfers.international.p266ui.model.TransferType;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ReviewTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.review.ReviewTransferDuxo$onStart$1$1", m3645f = "ReviewTransferDuxo.kt", m3646l = {93}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.international.ui.review.ReviewTransferDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class ReviewTransferDuxo4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReviewTransferDataState $state;
    int label;
    final /* synthetic */ ReviewTransferDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewTransferDuxo4(ReviewTransferDuxo reviewTransferDuxo, ReviewTransferDataState reviewTransferDataState, Continuation<? super ReviewTransferDuxo4> continuation) {
        super(2, continuation);
        this.this$0 = reviewTransferDuxo;
        this.$state = reviewTransferDataState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReviewTransferDuxo4(this.this$0, this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReviewTransferDuxo4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Money amount;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ReviewTransferDuxo reviewTransferDuxo = this.this$0;
            FxData fxData = this.$state.getFxData();
            if (fxData == null || (amount = fxData.getTargetAmount()) == null) {
                amount = this.$state.getAmount();
            }
            TransferType transferType = this.$state.getTransferType();
            this.label = 1;
            if (reviewTransferDuxo.fetchServiceFee(amount, transferType, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
