package com.robinhood.librobinhood.data.store.costbasis;

import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nummus.p512v1.CostBasisStatusDto;
import nummus.p512v1.GetCostBasisSummaryRequestDto;
import nummus.p512v1.GetCostBasisSummaryResponseDto;
import nummus.p512v1.RestNummusService;

/* compiled from: CryptoCostBasisStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lnummus/v1/GetCostBasisSummaryResponseDto;", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/librobinhood/data/store/costbasis/CryptoCostBasisStore$SummaryParams;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore$getSummary$1", m3645f = "CryptoCostBasisStore.kt", m3646l = {64}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore$getSummary$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoCostBasisStore5 extends ContinuationImpl7 implements Function2<Tuples2<? extends CryptoCostBasisStore.SummaryParams, ? extends IdlPaginationCursor>, Continuation<? super GetCostBasisSummaryResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoCostBasisStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoCostBasisStore5(CryptoCostBasisStore cryptoCostBasisStore, Continuation<? super CryptoCostBasisStore5> continuation) {
        super(2, continuation);
        this.this$0 = cryptoCostBasisStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoCostBasisStore5 cryptoCostBasisStore5 = new CryptoCostBasisStore5(this.this$0, continuation);
        cryptoCostBasisStore5.L$0 = obj;
        return cryptoCostBasisStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends CryptoCostBasisStore.SummaryParams, ? extends IdlPaginationCursor> tuples2, Continuation<? super GetCostBasisSummaryResponseDto> continuation) {
        return invoke2((Tuples2<CryptoCostBasisStore.SummaryParams, IdlPaginationCursor>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<CryptoCostBasisStore.SummaryParams, IdlPaginationCursor> tuples2, Continuation<? super GetCostBasisSummaryResponseDto> continuation) {
        return ((CryptoCostBasisStore5) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String cursor;
        String string2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Tuples2 tuples2 = (Tuples2) this.L$0;
        CryptoCostBasisStore.SummaryParams summaryParams = (CryptoCostBasisStore.SummaryParams) tuples2.component1();
        IdlPaginationCursor idlPaginationCursor = (IdlPaginationCursor) tuples2.component2();
        RestNummusService restNummusService = this.this$0.nummusService;
        String string3 = summaryParams.getAccountId().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        String sourceType = summaryParams.getSourceType();
        UUID currencyPairId = summaryParams.getCurrencyPairId();
        String str = (currencyPairId == null || (string2 = currencyPairId.toString()) == null) ? "" : string2;
        int limit = summaryParams.getLimit();
        CostBasisStatusDto status = summaryParams.getStatus();
        if (status == null) {
            status = CostBasisStatusDto.INSTANCE.getZeroValue();
        }
        CostBasisStatusDto costBasisStatusDto = status;
        Integer year = summaryParams.getYear();
        GetCostBasisSummaryRequestDto getCostBasisSummaryRequestDto = new GetCostBasisSummaryRequestDto(string3, null, sourceType, str, costBasisStatusDto, year != null ? year.intValue() : 0, limit, ((idlPaginationCursor == null || (cursor = idlPaginationCursor.getValue()) == null) && (cursor = summaryParams.getCursor()) == null) ? "" : cursor, summaryParams.getAllowCorrection(), 2, null);
        this.label = 1;
        Object objGetCostBasisSummary = restNummusService.GetCostBasisSummary(getCostBasisSummaryRequestDto, this);
        return objGetCostBasisSummary == coroutine_suspended ? coroutine_suspended : objGetCostBasisSummary;
    }
}
