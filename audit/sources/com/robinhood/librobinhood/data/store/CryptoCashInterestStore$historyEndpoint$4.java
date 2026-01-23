package com.robinhood.librobinhood.data.store;

import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.idl.Response;
import com.robinhood.librobinhood.data.store.CryptoCashInterestStore;
import com.robinhood.models.crypto.p314db.interest.CryptoCashInterestPayment;
import com.robinhood.models.crypto.p314db.interest.CryptoCashInterestPayment2;
import com.robinhood.util.LastUpdatedAtManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import moneytree.p510v1.InterestPaymentDto;
import moneytree.p510v1.ListMonthlyInterestHistoryResponseDto;

/* compiled from: CryptoCashInterestStore.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/librobinhood/data/store/CryptoCashInterestStore$AllPaymentsRequestArgs;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;", "result", "Lcom/robinhood/idl/Response;", "Lmoneytree/v1/ListMonthlyInterestHistoryResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoCashInterestStore$historyEndpoint$4", m3645f = "CryptoCashInterestStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
final class CryptoCashInterestStore$historyEndpoint$4 extends ContinuationImpl7 implements Function3<Tuples2<? extends CryptoCashInterestStore.AllPaymentsRequestArgs, ? extends IdlPaginationCursor>, Response<? extends ListMonthlyInterestHistoryResponseDto>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ CryptoCashInterestStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoCashInterestStore$historyEndpoint$4(CryptoCashInterestStore cryptoCashInterestStore, Continuation<? super CryptoCashInterestStore$historyEndpoint$4> continuation) {
        super(3, continuation);
        this.this$0 = cryptoCashInterestStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends CryptoCashInterestStore.AllPaymentsRequestArgs, ? extends IdlPaginationCursor> tuples2, Response<? extends ListMonthlyInterestHistoryResponseDto> response, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<CryptoCashInterestStore.AllPaymentsRequestArgs, IdlPaginationCursor>) tuples2, (Response<ListMonthlyInterestHistoryResponseDto>) response, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<CryptoCashInterestStore.AllPaymentsRequestArgs, IdlPaginationCursor> tuples2, Response<ListMonthlyInterestHistoryResponseDto> response, Continuation<? super Unit> continuation) {
        CryptoCashInterestStore$historyEndpoint$4 cryptoCashInterestStore$historyEndpoint$4 = new CryptoCashInterestStore$historyEndpoint$4(this.this$0, continuation);
        cryptoCashInterestStore$historyEndpoint$4.L$0 = tuples2;
        cryptoCashInterestStore$historyEndpoint$4.L$1 = response;
        return cryptoCashInterestStore$historyEndpoint$4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Tuples2 tuples2 = (Tuples2) this.L$0;
        Response response = (Response) this.L$1;
        CryptoCashInterestStore.AllPaymentsRequestArgs allPaymentsRequestArgs = (CryptoCashInterestStore.AllPaymentsRequestArgs) tuples2.component1();
        List<InterestPaymentDto> payments = ((ListMonthlyInterestHistoryResponseDto) response.getData()).getPayments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(payments, 10));
        Iterator<T> it = payments.iterator();
        while (it.hasNext()) {
            arrayList.add(CryptoCashInterestPayment2.toDbModel((InterestPaymentDto) it.next()));
        }
        this.this$0.interestPaymentDao.insert((Iterable) arrayList);
        Long l = (Long) this.this$0.requestIdsToMaxUpdatedAts.get(allPaymentsRequestArgs.getRequestId());
        long jMax = Math.max(l != null ? l.longValue() : 0L, this.this$0.getMaxUpdatedAt(arrayList));
        this.this$0.requestIdsToMaxUpdatedAts.put(allPaymentsRequestArgs.getRequestId(), boxing.boxLong(jMax));
        if ((!((ListMonthlyInterestHistoryResponseDto) response.getData()).getPayments().isEmpty() || ((ListMonthlyInterestHistoryResponseDto) response.getData()).getPrevious_cursor().length() > 0) && ((ListMonthlyInterestHistoryResponseDto) response.getData()).getNext_cursor().length() == 0) {
            LastUpdatedAtManager lastUpdatedAtManager = this.this$0.getLastUpdatedAtManager();
            Duration.Companion companion = Duration.INSTANCE;
            lastUpdatedAtManager.saveLastUpdatedAt(CryptoCashInterestPayment.class, jMax - Duration.m28738getInWholeMillisecondsimpl(Duration3.toDuration(1, DurationUnitJvm.MINUTES)));
            this.this$0.requestIdsToMaxUpdatedAts.remove(allPaymentsRequestArgs.getRequestId());
        }
        return Unit.INSTANCE;
    }
}
