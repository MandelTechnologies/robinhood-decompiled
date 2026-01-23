package com.robinhood.android.transfers.ach.p265ui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ReviewAchTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.ReviewAchTransferDuxo$createRecurringDeposit$4$1", m3645f = "ReviewAchTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ach.ui.ReviewAchTransferDuxo$createRecurringDeposit$4$1, reason: use source file name */
/* loaded from: classes9.dex */
final class ReviewAchTransferDuxo2 extends ContinuationImpl7 implements Function2<ReviewAchTransferViewState, Continuation<? super ReviewAchTransferViewState>, Object> {
    final /* synthetic */ Throwable $throwable;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewAchTransferDuxo2(Throwable th, Continuation<? super ReviewAchTransferDuxo2> continuation) {
        super(2, continuation);
        this.$throwable = th;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ReviewAchTransferDuxo2 reviewAchTransferDuxo2 = new ReviewAchTransferDuxo2(this.$throwable, continuation);
        reviewAchTransferDuxo2.L$0 = obj;
        return reviewAchTransferDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ReviewAchTransferViewState reviewAchTransferViewState, Continuation<? super ReviewAchTransferViewState> continuation) {
        return ((ReviewAchTransferDuxo2) create(reviewAchTransferViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ReviewAchTransferViewState.copy$default((ReviewAchTransferViewState) this.L$0, null, null, null, null, null, null, new UiEvent(Either2.asLeft(this.$throwable)), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
    }
}
