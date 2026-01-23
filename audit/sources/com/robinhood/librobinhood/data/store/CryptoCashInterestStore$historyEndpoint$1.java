package com.robinhood.librobinhood.data.store;

import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.librobinhood.data.store.CryptoCashInterestStore;
import com.robinhood.models.crypto.p314db.interest.CryptoCashInterestPayment;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import moneytree.p510v1.InterestService;
import moneytree.p510v1.ListMonthlyInterestHistoryRequestDto;
import moneytree.p510v1.ListMonthlyInterestHistoryResponseDto;
import p479j$.time.Instant;

/* compiled from: CryptoCashInterestStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/idl/Response;", "Lmoneytree/v1/ListMonthlyInterestHistoryResponseDto;", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/librobinhood/data/store/CryptoCashInterestStore$AllPaymentsRequestArgs;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoCashInterestStore$historyEndpoint$1", m3645f = "CryptoCashInterestStore.kt", m3646l = {120}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
final class CryptoCashInterestStore$historyEndpoint$1 extends ContinuationImpl7 implements Function2<Tuples2<? extends CryptoCashInterestStore.AllPaymentsRequestArgs, ? extends IdlPaginationCursor>, Continuation<? super Response<? extends ListMonthlyInterestHistoryResponseDto>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoCashInterestStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoCashInterestStore$historyEndpoint$1(CryptoCashInterestStore cryptoCashInterestStore, Continuation<? super CryptoCashInterestStore$historyEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = cryptoCashInterestStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoCashInterestStore$historyEndpoint$1 cryptoCashInterestStore$historyEndpoint$1 = new CryptoCashInterestStore$historyEndpoint$1(this.this$0, continuation);
        cryptoCashInterestStore$historyEndpoint$1.L$0 = obj;
        return cryptoCashInterestStore$historyEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends CryptoCashInterestStore.AllPaymentsRequestArgs, ? extends IdlPaginationCursor> tuples2, Continuation<? super Response<? extends ListMonthlyInterestHistoryResponseDto>> continuation) {
        return invoke2((Tuples2<CryptoCashInterestStore.AllPaymentsRequestArgs, IdlPaginationCursor>) tuples2, (Continuation<? super Response<ListMonthlyInterestHistoryResponseDto>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<CryptoCashInterestStore.AllPaymentsRequestArgs, IdlPaginationCursor> tuples2, Continuation<? super Response<ListMonthlyInterestHistoryResponseDto>> continuation) {
        return ((CryptoCashInterestStore$historyEndpoint$1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        ListMonthlyInterestHistoryRequestDto listMonthlyInterestHistoryRequestDtoCopy$default;
        String value;
        ListMonthlyInterestHistoryRequestDto listMonthlyInterestHistoryRequestDtoCopy$default2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        CryptoCashInterestStore.AllPaymentsRequestArgs allPaymentsRequestArgs = this.label;
        try {
            if (allPaymentsRequestArgs == 0) {
                ResultKt.throwOnFailure(obj);
                Tuples2 tuples2 = (Tuples2) this.L$0;
                CryptoCashInterestStore.AllPaymentsRequestArgs allPaymentsRequestArgs2 = (CryptoCashInterestStore.AllPaymentsRequestArgs) tuples2.component1();
                IdlPaginationCursor idlPaginationCursor = (IdlPaginationCursor) tuples2.component2();
                ListMonthlyInterestHistoryRequestDto request = allPaymentsRequestArgs2.getRequest();
                Instant lastUpdatedAt = this.this$0.getLastUpdatedAtManager().getLastUpdatedAt(CryptoCashInterestPayment.class);
                ListMonthlyInterestHistoryRequestDto listMonthlyInterestHistoryRequestDto = (idlPaginationCursor == null || (value = idlPaginationCursor.getValue()) == null || (listMonthlyInterestHistoryRequestDtoCopy$default2 = ListMonthlyInterestHistoryRequestDto.copy$default(request, value, 0, null, null, 14, null)) == null) ? request : listMonthlyInterestHistoryRequestDtoCopy$default2;
                if (lastUpdatedAt != null && (listMonthlyInterestHistoryRequestDtoCopy$default = ListMonthlyInterestHistoryRequestDto.copy$default(listMonthlyInterestHistoryRequestDto, null, 0, lastUpdatedAt, null, 11, null)) != null) {
                    listMonthlyInterestHistoryRequestDto = listMonthlyInterestHistoryRequestDtoCopy$default;
                }
                InterestService interestService = this.this$0.interestService;
                Request<ListMonthlyInterestHistoryRequestDto> request2 = new Request<>(listMonthlyInterestHistoryRequestDto, null, 2, null);
                this.L$0 = allPaymentsRequestArgs2;
                this.label = 1;
                obj = interestService.ListMonthlyInterestHistory(request2, this);
                allPaymentsRequestArgs = allPaymentsRequestArgs2;
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (allPaymentsRequestArgs != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CryptoCashInterestStore.AllPaymentsRequestArgs allPaymentsRequestArgs3 = (CryptoCashInterestStore.AllPaymentsRequestArgs) this.L$0;
                ResultKt.throwOnFailure(obj);
                allPaymentsRequestArgs = allPaymentsRequestArgs3;
            }
            return (Response) obj;
        } catch (Throwable th) {
            this.this$0.requestIdsToMaxUpdatedAts.remove(allPaymentsRequestArgs.getRequestId());
            throw th;
        }
    }
}
