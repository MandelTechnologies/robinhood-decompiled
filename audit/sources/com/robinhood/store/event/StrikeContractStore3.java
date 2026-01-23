package com.robinhood.store.event;

import com.robinhood.android.models.event.p186db.dao.EventToContractMapDao;
import com.robinhood.android.models.event.p186db.dao.StrikeContractDao;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractElement;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup3;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup5;
import com.robinhood.android.models.event.p186db.predictionmarkets.EventToContractMap;
import com.robinhood.android.models.event.p186db.predictionmarkets.StrikeContract;
import com.robinhood.idl.Response;
import com.robinhood.prediction_markets.proto.p361v1.idl.ContractElementDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.ListStrikesResponseDto;
import com.robinhood.store.event.StrikeContractStore;
import com.robinhood.utils.extensions.StringsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StrikeContractStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, m3636d2 = {"<anonymous>", "", "params", "Lcom/robinhood/store/event/StrikeContractStore$ListStrikesParams;", "response", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.StrikeContractStore$listStrikesEndpoint$2", m3645f = "StrikeContractStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.store.event.StrikeContractStore$listStrikesEndpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class StrikeContractStore3 extends ContinuationImpl7 implements Function3<StrikeContractStore.ListStrikesParams, Response<? extends ListStrikesResponseDto>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ StrikeContractStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StrikeContractStore3(StrikeContractStore strikeContractStore, Continuation<? super StrikeContractStore3> continuation) {
        super(3, continuation);
        this.this$0 = strikeContractStore;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(StrikeContractStore.ListStrikesParams listStrikesParams, Response<ListStrikesResponseDto> response, Continuation<? super Unit> continuation) {
        StrikeContractStore3 strikeContractStore3 = new StrikeContractStore3(this.this$0, continuation);
        strikeContractStore3.L$0 = listStrikesParams;
        strikeContractStore3.L$1 = response;
        return strikeContractStore3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(StrikeContractStore.ListStrikesParams listStrikesParams, Response<? extends ListStrikesResponseDto> response, Continuation<? super Unit> continuation) {
        return invoke2(listStrikesParams, (Response<ListStrikesResponseDto>) response, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        StrikeContractStore.ListStrikesParams listStrikesParams = (StrikeContractStore.ListStrikesParams) this.L$0;
        ListStrikesResponseDto listStrikesResponseDto = (ListStrikesResponseDto) ((Response) this.L$1).getData();
        StrikeContractDao strikeContractDao = this.this$0.strikeContractDao;
        UUID moneylineEventId = listStrikesParams.getMoneylineEventId();
        UUID contractId = listStrikesParams.getContractId();
        List<ContractElement> listContractElementListToDbModel = ContractGroup5.contractElementListToDbModel(listStrikesResponseDto.getContracts());
        strikeContractDao.insert(new StrikeContract(moneylineEventId, contractId, listStrikesParams.getContractSide(), listStrikesResponseDto.getDefault_index(), listContractElementListToDbModel));
        EventToContractMapDao eventToContractMapDao = this.this$0.eventToContractMapDao;
        List<ContractElementDto> contracts2 = listStrikesResponseDto.getContracts();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contracts2, 10));
        Iterator<T> it = contracts2.iterator();
        while (it.hasNext()) {
            arrayList.add(new EventToContractMap(StringsKt.toUuid(((ContractElementDto) it.next()).getContract_id()), listStrikesParams.getMoneylineEventId(), listStrikesParams.getMoneylineEventId(), ContractGroup3.CONTRACT_COLUMN_TYPE_ALTERNATE_STRIKE));
        }
        eventToContractMapDao.insert((Iterable) arrayList);
        return Unit.INSTANCE;
    }
}
