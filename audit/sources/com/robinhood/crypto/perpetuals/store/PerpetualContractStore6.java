package com.robinhood.crypto.perpetuals.store;

import com.robinhood.crypto.models.perpetuals.dao.PerpetualContractDao;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualContract2;
import crypto_perpetuals.contract.p436v1.ContractDto;
import crypto_perpetuals.service.p440v1.ListContractResponseDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PerpetualContractStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcrypto_perpetuals/service/v1/ListContractResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.crypto.perpetuals.store.PerpetualContractStore$listContractsEndpoint$2", m3645f = "PerpetualContractStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualContractStore$listContractsEndpoint$2, reason: use source file name */
/* loaded from: classes15.dex */
final class PerpetualContractStore6 extends ContinuationImpl7 implements Function2<ListContractResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PerpetualContractStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerpetualContractStore6(PerpetualContractStore perpetualContractStore, Continuation<? super PerpetualContractStore6> continuation) {
        super(2, continuation);
        this.this$0 = perpetualContractStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PerpetualContractStore6 perpetualContractStore6 = new PerpetualContractStore6(this.this$0, continuation);
        perpetualContractStore6.L$0 = obj;
        return perpetualContractStore6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ListContractResponseDto listContractResponseDto, Continuation<? super Unit> continuation) {
        return ((PerpetualContractStore6) create(listContractResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ListContractResponseDto listContractResponseDto = (ListContractResponseDto) this.L$0;
            PerpetualContractDao perpetualContractDao = this.this$0.contractDao;
            List<ContractDto> contracts2 = listContractResponseDto.getContracts();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contracts2, 10));
            Iterator<T> it = contracts2.iterator();
            while (it.hasNext()) {
                arrayList.add(PerpetualContract2.toDbModel((ContractDto) it.next()));
            }
            perpetualContractDao.insert((Iterable) arrayList);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
