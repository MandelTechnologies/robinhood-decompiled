package com.robinhood.android.advisory.onboarding.firstdeposit;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryRequest;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

/* compiled from: AdvisoryFirstDepositTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$3$2$1", m3645f = "AdvisoryFirstDepositTransferDuxo.kt", m3646l = {85}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$3$2$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AdvisoryFirstDepositTransferDuxo3 extends ContinuationImpl7 implements Function1<Continuation<? super ApiTransferSummaryResponse>, Object> {
    final /* synthetic */ ApiTransferSummaryRequest $request;
    int label;
    final /* synthetic */ AdvisoryFirstDepositTransferDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisoryFirstDepositTransferDuxo3(AdvisoryFirstDepositTransferDuxo advisoryFirstDepositTransferDuxo, ApiTransferSummaryRequest apiTransferSummaryRequest, Continuation<? super AdvisoryFirstDepositTransferDuxo3> continuation) {
        super(1, continuation);
        this.this$0 = advisoryFirstDepositTransferDuxo;
        this.$request = apiTransferSummaryRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AdvisoryFirstDepositTransferDuxo3(this.this$0, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ApiTransferSummaryResponse> continuation) {
        return ((AdvisoryFirstDepositTransferDuxo3) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiTransferSummaryRequest apiTransferSummaryRequest = this.$request;
        this.label = 1;
        Object objPostTransferSummary = transfersBonfireApi.postTransferSummary(apiTransferSummaryRequest, this);
        return objPostTransferSummary == coroutine_suspended ? coroutine_suspended : objPostTransferSummary;
    }
}
