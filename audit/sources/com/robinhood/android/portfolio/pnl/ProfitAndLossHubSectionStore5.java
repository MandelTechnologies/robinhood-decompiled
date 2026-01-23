package com.robinhood.android.portfolio.pnl;

import com.robinhood.android.portfolio.pnl.dao.ProfitAndLossRealizedDao;
import com.robinhood.android.portfolio.pnl.dao.ProfitAndLossRealizedDao2;
import java.util.List;
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
import p479j$.time.Instant;
import rosetta.portfolio.p541v1.AssetClassDto;
import rosetta.portfolio.p541v1.GetRealizedPerformanceSummaryResponseDto;

/* compiled from: ProfitAndLossHubSectionStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryResponseDto;", "", "Lrosetta/portfolio/v1/AssetClassDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnl.ProfitAndLossHubSectionStore$realizedPnlEndpoint$2", m3645f = "ProfitAndLossHubSectionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.portfolio.pnl.ProfitAndLossHubSectionStore$realizedPnlEndpoint$2, reason: use source file name */
/* loaded from: classes11.dex */
final class ProfitAndLossHubSectionStore5 extends ContinuationImpl7 implements Function2<Tuples2<? extends GetRealizedPerformanceSummaryResponseDto, ? extends List<? extends AssetClassDto>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ProfitAndLossHubSectionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfitAndLossHubSectionStore5(ProfitAndLossHubSectionStore profitAndLossHubSectionStore, Continuation<? super ProfitAndLossHubSectionStore5> continuation) {
        super(2, continuation);
        this.this$0 = profitAndLossHubSectionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProfitAndLossHubSectionStore5 profitAndLossHubSectionStore5 = new ProfitAndLossHubSectionStore5(this.this$0, continuation);
        profitAndLossHubSectionStore5.L$0 = obj;
        return profitAndLossHubSectionStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends GetRealizedPerformanceSummaryResponseDto, ? extends List<? extends AssetClassDto>> tuples2, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<GetRealizedPerformanceSummaryResponseDto, ? extends List<? extends AssetClassDto>>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<GetRealizedPerformanceSummaryResponseDto, ? extends List<? extends AssetClassDto>> tuples2, Continuation<? super Unit> continuation) {
        return ((ProfitAndLossHubSectionStore5) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            GetRealizedPerformanceSummaryResponseDto getRealizedPerformanceSummaryResponseDto = (GetRealizedPerformanceSummaryResponseDto) tuples2.component1();
            List list = (List) tuples2.component2();
            ProfitAndLossRealizedDao profitAndLossRealizedDao = this.this$0.realizedPnlDao;
            Instant instant = this.this$0.clock.instant();
            Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
            profitAndLossRealizedDao.insert(ProfitAndLossRealizedDao2.toDbModel(getRealizedPerformanceSummaryResponseDto, list, instant));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
