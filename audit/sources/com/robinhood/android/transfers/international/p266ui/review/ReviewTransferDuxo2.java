package com.robinhood.android.transfers.international.p266ui.review;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import retrofit2.Response;

/* compiled from: ReviewTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.review.ReviewTransferDuxo$createTransferAndSubmitResultEvent$result$1", m3645f = "ReviewTransferDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.international.ui.review.ReviewTransferDuxo$createTransferAndSubmitResultEvent$result$1, reason: use source file name */
/* loaded from: classes9.dex */
final class ReviewTransferDuxo2 extends ContinuationImpl7 implements Function1<Continuation<? super Response<ApiCreateTransferResponse>>, Object> {
    final /* synthetic */ ApiCreateTransferRequest $transferRequest;
    int label;
    final /* synthetic */ ReviewTransferDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewTransferDuxo2(ReviewTransferDuxo reviewTransferDuxo, ApiCreateTransferRequest apiCreateTransferRequest, Continuation<? super ReviewTransferDuxo2> continuation) {
        super(1, continuation);
        this.this$0 = reviewTransferDuxo;
        this.$transferRequest = apiCreateTransferRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ReviewTransferDuxo2(this.this$0, this.$transferRequest, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Response<ApiCreateTransferResponse>> continuation) {
        return ((ReviewTransferDuxo2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        TransfersBonfireApi transfersBonfireApi = this.this$0.transfersBonfireApi;
        ApiCreateTransferRequest apiCreateTransferRequest = this.$transferRequest;
        this.label = 1;
        Object objCreateTransfer = transfersBonfireApi.createTransfer(apiCreateTransferRequest, this);
        return objCreateTransfer == coroutine_suspended ? coroutine_suspended : objCreateTransfer;
    }
}
