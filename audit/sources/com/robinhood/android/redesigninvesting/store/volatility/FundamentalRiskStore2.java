package com.robinhood.android.redesigninvesting.store.volatility;

import com.robinhood.android.redesigninvesting.api.highlights.volatility.HighlightsMarketdataApi;
import com.robinhood.android.redesigninvesting.models.highlights.volatility.api.ApiFundamentalRisk;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FundamentalRiskStore.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/android/redesigninvesting/models/highlights/volatility/api/ApiFundamentalRisk;", "it", "Lkotlin/Pair;", "", "Ljava/util/UUID;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.store.volatility.FundamentalRiskStore$endpoint$1", m3645f = "FundamentalRiskStore.kt", m3646l = {29}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.redesigninvesting.store.volatility.FundamentalRiskStore$endpoint$1, reason: use source file name */
/* loaded from: classes5.dex */
final class FundamentalRiskStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends Iterable<? extends UUID>, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiFundamentalRisk>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FundamentalRiskStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FundamentalRiskStore2(FundamentalRiskStore fundamentalRiskStore, Continuation<? super FundamentalRiskStore2> continuation) {
        super(2, continuation);
        this.this$0 = fundamentalRiskStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FundamentalRiskStore2 fundamentalRiskStore2 = new FundamentalRiskStore2(this.this$0, continuation);
        fundamentalRiskStore2.L$0 = obj;
        return fundamentalRiskStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Iterable<? extends UUID>, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiFundamentalRisk>> continuation) {
        return invoke2((Tuples2<? extends Iterable<UUID>, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiFundamentalRisk>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<? extends Iterable<UUID>, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiFundamentalRisk>> continuation) {
        return ((FundamentalRiskStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
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
        HighlightsMarketdataApi highlightsMarketdataApi = this.this$0.api;
        String strJoinToString$default = CollectionsKt.joinToString$default((Iterable) tuples2.getFirst(), ",", null, null, 0, null, null, 62, null);
        this.label = 1;
        Object fundamentalRisks = highlightsMarketdataApi.getFundamentalRisks(strJoinToString$default, this);
        return fundamentalRisks == coroutine_suspended ? coroutine_suspended : fundamentalRisks;
    }
}
