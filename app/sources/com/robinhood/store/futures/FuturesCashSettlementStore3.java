package com.robinhood.store.futures;

import com.robinhood.android.models.futures.p189db.FuturesCashSettlement;
import com.robinhood.android.models.futures.p189db.FuturesCashSettlement2;
import com.robinhood.ceres.p284v1.FuturesExecutionDto;
import com.robinhood.ceres.p284v1.GetCashSettlementExecutionsResponseDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FuturesCashSettlementStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesCashSettlementStore$getCashSettlementsEndpoint$4", m3645f = "FuturesCashSettlementStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.store.futures.FuturesCashSettlementStore$getCashSettlementsEndpoint$4, reason: use source file name */
/* loaded from: classes12.dex */
final class FuturesCashSettlementStore3 extends ContinuationImpl7 implements Function2<GetCashSettlementExecutionsResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesCashSettlementStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesCashSettlementStore3(FuturesCashSettlementStore futuresCashSettlementStore, Continuation<? super FuturesCashSettlementStore3> continuation) {
        super(2, continuation);
        this.this$0 = futuresCashSettlementStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesCashSettlementStore3 futuresCashSettlementStore3 = new FuturesCashSettlementStore3(this.this$0, continuation);
        futuresCashSettlementStore3.L$0 = obj;
        return futuresCashSettlementStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetCashSettlementExecutionsResponseDto getCashSettlementExecutionsResponseDto, Continuation<? super Unit> continuation) {
        return ((FuturesCashSettlementStore3) create(getCashSettlementExecutionsResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<FuturesExecutionDto> results = ((GetCashSettlementExecutionsResponseDto) this.L$0).getResults();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = results.iterator();
        while (it.hasNext()) {
            FuturesCashSettlement dbModel = FuturesCashSettlement2.toDbModel((FuturesExecutionDto) it.next());
            if (dbModel != null) {
                arrayList.add(dbModel);
            }
        }
        this.this$0.cashSettlementDao.insert((Iterable) arrayList);
        return Unit.INSTANCE;
    }
}
