package com.robinhood.android.portfolio.pnl;

import com.robinhood.android.portfolio.pnl.dao.InstrumentProfitAndLossRealizedDao;
import com.robinhood.android.portfolio.pnl.dao.InstrumentProfitAndLossRealizedDao2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;
import wormhole.service.p554v1.GetRealizedPerformanceSummaryResponseDto;

/* compiled from: ProfitAndLossHubSectionStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lwormhole/service/v1/GetRealizedPerformanceSummaryResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnl.ProfitAndLossHubSectionStore$closedPnlForInstrumentEndpoint$2", m3645f = "ProfitAndLossHubSectionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.portfolio.pnl.ProfitAndLossHubSectionStore$closedPnlForInstrumentEndpoint$2, reason: use source file name */
/* loaded from: classes11.dex */
final class ProfitAndLossHubSectionStore3 extends ContinuationImpl7 implements Function2<GetRealizedPerformanceSummaryResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ProfitAndLossHubSectionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfitAndLossHubSectionStore3(ProfitAndLossHubSectionStore profitAndLossHubSectionStore, Continuation<? super ProfitAndLossHubSectionStore3> continuation) {
        super(2, continuation);
        this.this$0 = profitAndLossHubSectionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProfitAndLossHubSectionStore3 profitAndLossHubSectionStore3 = new ProfitAndLossHubSectionStore3(this.this$0, continuation);
        profitAndLossHubSectionStore3.L$0 = obj;
        return profitAndLossHubSectionStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetRealizedPerformanceSummaryResponseDto getRealizedPerformanceSummaryResponseDto, Continuation<? super Unit> continuation) {
        return ((ProfitAndLossHubSectionStore3) create(getRealizedPerformanceSummaryResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            GetRealizedPerformanceSummaryResponseDto getRealizedPerformanceSummaryResponseDto = (GetRealizedPerformanceSummaryResponseDto) this.L$0;
            InstrumentProfitAndLossRealizedDao instrumentProfitAndLossRealizedDao = this.this$0.instrumentRealizedPnlDao;
            Instant instant = this.this$0.clock.instant();
            Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
            instrumentProfitAndLossRealizedDao.insert(InstrumentProfitAndLossRealizedDao2.toDbModel(getRealizedPerformanceSummaryResponseDto, instant));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
