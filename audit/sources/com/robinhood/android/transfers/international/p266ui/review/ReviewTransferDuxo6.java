package com.robinhood.android.transfers.international.p266ui.review;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
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
@DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.review.ReviewTransferDuxo$submitTransfer$1$1", m3645f = "ReviewTransferDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.international.ui.review.ReviewTransferDuxo$submitTransfer$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class ReviewTransferDuxo6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ApiCreateTransferRequest $transferRequest;
    int label;
    final /* synthetic */ ReviewTransferDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewTransferDuxo6(ReviewTransferDuxo reviewTransferDuxo, ApiCreateTransferRequest apiCreateTransferRequest, Continuation<? super ReviewTransferDuxo6> continuation) {
        super(2, continuation);
        this.this$0 = reviewTransferDuxo;
        this.$transferRequest = apiCreateTransferRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReviewTransferDuxo6(this.this$0, this.$transferRequest, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReviewTransferDuxo6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: ReviewTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.review.ReviewTransferDuxo$submitTransfer$1$1$1", m3645f = "ReviewTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.international.ui.review.ReviewTransferDuxo$submitTransfer$1$1$1 */
    static final class C303801 extends ContinuationImpl7 implements Function2<ReviewTransferDataState, Continuation<? super ReviewTransferDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C303801(Continuation<? super C303801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C303801 c303801 = new C303801(continuation);
            c303801.L$0 = obj;
            return c303801;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ReviewTransferDataState reviewTransferDataState, Continuation<? super ReviewTransferDataState> continuation) {
            return ((C303801) create(reviewTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ReviewTransferDataState.copy$default((ReviewTransferDataState) this.L$0, null, null, null, null, null, null, null, true, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new C303801(null));
            ReviewTransferDuxo reviewTransferDuxo = this.this$0;
            ApiCreateTransferRequest apiCreateTransferRequest = this.$transferRequest;
            this.label = 1;
            if (reviewTransferDuxo.createTransferAndSubmitResultEvent(apiCreateTransferRequest, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.applyMutation(new C303812(null));
        return Unit.INSTANCE;
    }

    /* compiled from: ReviewTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.review.ReviewTransferDuxo$submitTransfer$1$1$2", m3645f = "ReviewTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.international.ui.review.ReviewTransferDuxo$submitTransfer$1$1$2 */
    static final class C303812 extends ContinuationImpl7 implements Function2<ReviewTransferDataState, Continuation<? super ReviewTransferDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C303812(Continuation<? super C303812> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C303812 c303812 = new C303812(continuation);
            c303812.L$0 = obj;
            return c303812;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ReviewTransferDataState reviewTransferDataState, Continuation<? super ReviewTransferDataState> continuation) {
            return ((C303812) create(reviewTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ReviewTransferDataState.copy$default((ReviewTransferDataState) this.L$0, null, null, null, null, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        }
    }
}
