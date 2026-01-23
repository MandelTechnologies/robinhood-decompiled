package com.robinhood.store.event;

import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.models.event.p186db.dao.ContractDisplayDetailsDao;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractDisplayDetails;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractDisplayDetails2;
import com.robinhood.idl.Response;
import com.robinhood.prediction_markets.proto.p361v1.idl.GetContractDisplayDetailsResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: ContractDetailsDisplayStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, m3636d2 = {"<anonymous>", "", "params", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "response", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.ContractDetailsDisplayStore$getContractDisplayDetailsEndpoint$2", m3645f = "ContractDetailsDisplayStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.event.ContractDetailsDisplayStore$getContractDisplayDetailsEndpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class ContractDetailsDisplayStore3 extends ContinuationImpl7 implements Function3<ContractIdWithSide, Response<? extends GetContractDisplayDetailsResponseDto>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContractDetailsDisplayStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContractDetailsDisplayStore3(ContractDetailsDisplayStore contractDetailsDisplayStore, Continuation<? super ContractDetailsDisplayStore3> continuation) {
        super(3, continuation);
        this.this$0 = contractDetailsDisplayStore;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(ContractIdWithSide contractIdWithSide, Response<GetContractDisplayDetailsResponseDto> response, Continuation<? super Unit> continuation) {
        ContractDetailsDisplayStore3 contractDetailsDisplayStore3 = new ContractDetailsDisplayStore3(this.this$0, continuation);
        contractDetailsDisplayStore3.L$0 = response;
        return contractDetailsDisplayStore3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(ContractIdWithSide contractIdWithSide, Response<? extends GetContractDisplayDetailsResponseDto> response, Continuation<? super Unit> continuation) {
        return invoke2(contractIdWithSide, (Response<GetContractDisplayDetailsResponseDto>) response, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ContractDisplayDetails dbModel = ContractDisplayDetails2.toDbModel((GetContractDisplayDetailsResponseDto) ((Response) this.L$0).getData());
        if (dbModel != null) {
            this.this$0.contractDisplayDetailsDao.insert((ContractDisplayDetailsDao) dbModel);
        }
        return Unit.INSTANCE;
    }
}
