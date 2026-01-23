package com.robinhood.librobinhood.data.store.costbasis;

import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore;
import com.robinhood.models.crypto.dao.CryptoCostBasisDetailsDao;
import com.robinhood.models.crypto.p314db.costbasis.CryptoCostBasisDetails2;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import nummus.p512v1.GetCostBasisDetailsResponseDto;
import nummus.p512v1.GetCostBasisSummaryResponseDto;

/* compiled from: CryptoCostBasisStore.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/librobinhood/data/store/costbasis/CryptoCostBasisStore$SummaryParams;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;", "response", "Lnummus/v1/GetCostBasisSummaryResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore$getSummary$4", m3645f = "CryptoCostBasisStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore$getSummary$4, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoCostBasisStore6 extends ContinuationImpl7 implements Function3<Tuples2<? extends CryptoCostBasisStore.SummaryParams, ? extends IdlPaginationCursor>, GetCostBasisSummaryResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ CryptoCostBasisStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoCostBasisStore6(CryptoCostBasisStore cryptoCostBasisStore, Continuation<? super CryptoCostBasisStore6> continuation) {
        super(3, continuation);
        this.this$0 = cryptoCostBasisStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends CryptoCostBasisStore.SummaryParams, ? extends IdlPaginationCursor> tuples2, GetCostBasisSummaryResponseDto getCostBasisSummaryResponseDto, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<CryptoCostBasisStore.SummaryParams, IdlPaginationCursor>) tuples2, getCostBasisSummaryResponseDto, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<CryptoCostBasisStore.SummaryParams, IdlPaginationCursor> tuples2, GetCostBasisSummaryResponseDto getCostBasisSummaryResponseDto, Continuation<? super Unit> continuation) {
        CryptoCostBasisStore6 cryptoCostBasisStore6 = new CryptoCostBasisStore6(this.this$0, continuation);
        cryptoCostBasisStore6.L$0 = tuples2;
        cryptoCostBasisStore6.L$1 = getCostBasisSummaryResponseDto;
        return cryptoCostBasisStore6.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            GetCostBasisSummaryResponseDto getCostBasisSummaryResponseDto = (GetCostBasisSummaryResponseDto) this.L$1;
            CryptoCostBasisDetailsDao cryptoCostBasisDetailsDao = this.this$0.costBasisDetailsDao;
            List<GetCostBasisDetailsResponseDto> results = getCostBasisSummaryResponseDto.getResults();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
            Iterator<T> it = results.iterator();
            while (it.hasNext()) {
                arrayList.add(CryptoCostBasisDetails2.toDbModel((GetCostBasisDetailsResponseDto) it.next()));
            }
            cryptoCostBasisDetailsDao.insert((Iterable) arrayList);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
