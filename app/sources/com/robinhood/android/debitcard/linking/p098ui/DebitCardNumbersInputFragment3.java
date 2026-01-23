package com.robinhood.android.debitcard.linking.p098ui;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DebitCardNumbersInputFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeParams;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.debitcard.linking.ui.DebitCardNumbersInputFragment$onViewCreated$1$1$2", m3645f = "DebitCardNumbersInputFragment.kt", m3646l = {80}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.debitcard.linking.ui.DebitCardNumbersInputFragment$onViewCreated$1$1$2, reason: use source file name */
/* loaded from: classes2.dex */
final class DebitCardNumbersInputFragment3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiServiceFeeParams>, Object> {
    int label;
    final /* synthetic */ DebitCardNumbersInputFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardNumbersInputFragment3(DebitCardNumbersInputFragment debitCardNumbersInputFragment, Continuation<? super DebitCardNumbersInputFragment3> continuation) {
        super(2, continuation);
        this.this$0 = debitCardNumbersInputFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DebitCardNumbersInputFragment3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiServiceFeeParams> continuation) {
        return ((DebitCardNumbersInputFragment3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        TransfersBonfireApi transfersBonfireApi = this.this$0.getTransfersBonfireApi();
        TransferType transferType = TransferType.DEBIT_CARD_TRANSFER;
        this.label = 1;
        Object serviceFeeParams$default = TransfersBonfireApi.DefaultImpls.getServiceFeeParams$default(transfersBonfireApi, transferType, null, null, this, 6, null);
        return serviceFeeParams$default == coroutine_suspended ? coroutine_suspended : serviceFeeParams$default;
    }
}
