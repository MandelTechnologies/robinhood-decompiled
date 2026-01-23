package com.robinhood.librobinhood.data.store.cashier;

import com.robinhood.android.api.cashier.Cashier;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import retrofit2.Response;

/* compiled from: AchTransferStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiAchTransfer;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.cashier.AchTransferStore$createAchTransfer$apiAchTransfer$1", m3645f = "AchTransferStore.kt", m3646l = {43}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.cashier.AchTransferStore$createAchTransfer$apiAchTransfer$1, reason: use source file name */
/* loaded from: classes13.dex */
final class AchTransferStore2 extends ContinuationImpl7 implements Function1<Continuation<? super Response<ApiPaymentTransferDetails.ApiAchTransfer>>, Object> {
    final /* synthetic */ UUID $achRelationshipId;
    final /* synthetic */ BigDecimal $amount;
    final /* synthetic */ TransferDirection $direction;
    final /* synthetic */ UUID $refId;
    int label;
    final /* synthetic */ AchTransferStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AchTransferStore2(AchTransferStore achTransferStore, UUID uuid, BigDecimal bigDecimal, TransferDirection transferDirection, UUID uuid2, Continuation<? super AchTransferStore2> continuation) {
        super(1, continuation);
        this.this$0 = achTransferStore;
        this.$achRelationshipId = uuid;
        this.$amount = bigDecimal;
        this.$direction = transferDirection;
        this.$refId = uuid2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AchTransferStore2(this.this$0, this.$achRelationshipId, this.$amount, this.$direction, this.$refId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Response<ApiPaymentTransferDetails.ApiAchTransfer>> continuation) {
        return ((AchTransferStore2) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
        Cashier cashier = this.this$0.cashier;
        ApiPaymentTransferDetails.ApiAchTransfer.Request request = new ApiPaymentTransferDetails.ApiAchTransfer.Request(AchRelationship.INSTANCE.getUrl(this.$achRelationshipId), this.$amount, this.$direction, this.$refId);
        this.label = 1;
        Object objPostAchTransfer = cashier.postAchTransfer(request, this);
        return objPostAchTransfer == coroutine_suspended ? coroutine_suspended : objPostAchTransfer;
    }
}
