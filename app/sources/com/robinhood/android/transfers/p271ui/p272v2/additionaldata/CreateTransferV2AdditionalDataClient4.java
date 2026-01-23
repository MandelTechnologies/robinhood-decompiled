package com.robinhood.android.transfers.p271ui.p272v2.additionaldata;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.transfers.p271ui.p272v2.additionaldata.CreateTransferV2AdditionalDataClient;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeParams;
import com.robinhood.transfers.api.TransferType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CreateTransferV2AdditionalDataClient.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeParams;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.additionaldata.CreateTransferV2AdditionalDataClient$getAdditionalData$2$1$2$serviceFeeParams$1", m3645f = "CreateTransferV2AdditionalDataClient.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ui.v2.additionaldata.CreateTransferV2AdditionalDataClient$getAdditionalData$2$1$2$serviceFeeParams$1, reason: use source file name */
/* loaded from: classes9.dex */
final class CreateTransferV2AdditionalDataClient4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiServiceFeeParams>, Object> {
    final /* synthetic */ CreateTransferV2AdditionalDataClient.Request $this_with;
    int label;
    final /* synthetic */ CreateTransferV2AdditionalDataClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTransferV2AdditionalDataClient4(CreateTransferV2AdditionalDataClient createTransferV2AdditionalDataClient, CreateTransferV2AdditionalDataClient.Request request, Continuation<? super CreateTransferV2AdditionalDataClient4> continuation) {
        super(2, continuation);
        this.this$0 = createTransferV2AdditionalDataClient;
        this.$this_with = request;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateTransferV2AdditionalDataClient4(this.this$0, this.$this_with, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiServiceFeeParams> continuation) {
        return ((CreateTransferV2AdditionalDataClient4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        TransferType transferType$feature_transfers_externalRelease = this.this$0.getTransferType$feature_transfers_externalRelease(this.$this_with);
        Intrinsics.checkNotNull(transferType$feature_transfers_externalRelease);
        ApiTransferAccount.TransferAccountType type2 = this.$this_with.getSourceAccount().getType();
        ApiTransferAccount.TransferAccountType type3 = this.$this_with.getSinkAccount().getType();
        this.label = 1;
        Object serviceFeeParams = transfersBonfireApi.getServiceFeeParams(transferType$feature_transfers_externalRelease, type2, type3, this);
        return serviceFeeParams == coroutine_suspended ? coroutine_suspended : serviceFeeParams;
    }
}
