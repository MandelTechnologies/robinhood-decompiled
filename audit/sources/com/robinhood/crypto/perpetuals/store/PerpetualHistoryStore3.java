package com.robinhood.crypto.perpetuals.store;

import com.robinhood.crypto.models.perpetuals.dao.PerpetualOrderDetailsDao;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualOrderDetails;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualOrderDetails3;
import com.robinhood.idl.Response;
import crypto_perpetuals.order.p438v1.OrderDetailsDto;
import crypto_perpetuals.service.p440v1.GetOrderResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PerpetualHistoryStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/idl/Response;", "Lcrypto_perpetuals/service/v1/GetOrderResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.crypto.perpetuals.store.PerpetualsHistoryStore$getOrderDetailEndpoint$2", m3645f = "PerpetualHistoryStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualsHistoryStore$getOrderDetailEndpoint$2, reason: use source file name */
/* loaded from: classes15.dex */
final class PerpetualHistoryStore3 extends ContinuationImpl7 implements Function2<Response<? extends GetOrderResponseDto>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PerpetualHistoryStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerpetualHistoryStore3(PerpetualHistoryStore perpetualHistoryStore, Continuation<? super PerpetualHistoryStore3> continuation) {
        super(2, continuation);
        this.this$0 = perpetualHistoryStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PerpetualHistoryStore3 perpetualHistoryStore3 = new PerpetualHistoryStore3(this.this$0, continuation);
        perpetualHistoryStore3.L$0 = obj;
        return perpetualHistoryStore3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Response<GetOrderResponseDto> response, Continuation<? super Unit> continuation) {
        return ((PerpetualHistoryStore3) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Response<? extends GetOrderResponseDto> response, Continuation<? super Unit> continuation) {
        return invoke2((Response<GetOrderResponseDto>) response, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        PerpetualOrderDetails dbModel;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        OrderDetailsDto order = ((GetOrderResponseDto) ((Response) this.L$0).getData()).getOrder();
        if (order != null && (dbModel = PerpetualOrderDetails3.toDbModel(order)) != null) {
            this.this$0.dao.insert((PerpetualOrderDetailsDao) dbModel);
        }
        return Unit.INSTANCE;
    }
}
