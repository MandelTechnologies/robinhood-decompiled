package com.robinhood.crypto.perpetuals.store;

import com.robinhood.crypto.models.perpetuals.dao.PerpetualContractDao;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualContract2;
import com.robinhood.utils.logging.CrashReporter;
import crypto_perpetuals.contract.p436v1.ContractDto;
import crypto_perpetuals.service.p440v1.GetContractResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PerpetualContractStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcrypto_perpetuals/service/v1/GetContractResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.crypto.perpetuals.store.PerpetualContractStore$getContractEndpoint$2", m3645f = "PerpetualContractStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualContractStore$getContractEndpoint$2, reason: use source file name */
/* loaded from: classes15.dex */
final class PerpetualContractStore3 extends ContinuationImpl7 implements Function2<GetContractResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PerpetualContractStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerpetualContractStore3(PerpetualContractStore perpetualContractStore, Continuation<? super PerpetualContractStore3> continuation) {
        super(2, continuation);
        this.this$0 = perpetualContractStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PerpetualContractStore3 perpetualContractStore3 = new PerpetualContractStore3(this.this$0, continuation);
        perpetualContractStore3.L$0 = obj;
        return perpetualContractStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetContractResponseDto getContractResponseDto, Continuation<? super Unit> continuation) {
        return ((PerpetualContractStore3) create(getContractResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        ContractDto contract;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            contract = ((GetContractResponseDto) this.L$0).getContract();
        } catch (IllegalArgumentException e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, true, null, 4, null);
        }
        if (contract != null) {
            this.this$0.contractDao.insert((PerpetualContractDao) PerpetualContract2.toDbModel(contract));
            return Unit.INSTANCE;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
