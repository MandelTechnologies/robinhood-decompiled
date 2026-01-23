package com.robinhood.librobinhood.data.store;

import com.robinhood.models.crypto.dao.CryptoCashInterestPaymentDao;
import com.robinhood.models.crypto.p314db.interest.CryptoCashInterestPayment;
import com.robinhood.models.crypto.p314db.interest.CryptoCashInterestPayment2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import moneytree.p510v1.GetMonthlyInterestHistoryResponseDto;
import moneytree.p510v1.InterestPaymentDto;

/* compiled from: CryptoCashInterestStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lmoneytree/v1/GetMonthlyInterestHistoryResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoCashInterestStore$historyDetailEndpoint$2", m3645f = "CryptoCashInterestStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CryptoCashInterestStore$historyDetailEndpoint$2 extends ContinuationImpl7 implements Function2<GetMonthlyInterestHistoryResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoCashInterestStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoCashInterestStore$historyDetailEndpoint$2(CryptoCashInterestStore cryptoCashInterestStore, Continuation<? super CryptoCashInterestStore$historyDetailEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoCashInterestStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoCashInterestStore$historyDetailEndpoint$2 cryptoCashInterestStore$historyDetailEndpoint$2 = new CryptoCashInterestStore$historyDetailEndpoint$2(this.this$0, continuation);
        cryptoCashInterestStore$historyDetailEndpoint$2.L$0 = obj;
        return cryptoCashInterestStore$historyDetailEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetMonthlyInterestHistoryResponseDto getMonthlyInterestHistoryResponseDto, Continuation<? super Unit> continuation) {
        return ((CryptoCashInterestStore$historyDetailEndpoint$2) create(getMonthlyInterestHistoryResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        CryptoCashInterestPayment dbModel;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InterestPaymentDto payment = ((GetMonthlyInterestHistoryResponseDto) this.L$0).getPayment();
        if (payment != null && (dbModel = CryptoCashInterestPayment2.toDbModel(payment)) != null) {
            this.this$0.interestPaymentDao.insert((CryptoCashInterestPaymentDao) dbModel);
        }
        return Unit.INSTANCE;
    }
}
