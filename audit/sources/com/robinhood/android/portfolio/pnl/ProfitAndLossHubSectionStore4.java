package com.robinhood.android.portfolio.pnl;

import com.robinhood.android.portfolio.pnl.ProfitAndLossHubSectionStore;
import com.robinhood.rosetta.common.CurrencyDto;
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
import kotlin.jvm.functions.Function2;
import rosetta.portfolio.p541v1.AssetClassDto;
import rosetta.portfolio.p541v1.GetRealizedPerformanceSummaryRequestDto;
import rosetta.portfolio.p541v1.GetRealizedPerformanceSummaryResponseDto;
import rosetta.portfolio.p541v1.Portfolio;
import rosetta.portfolio.p541v1.SpanDto;

/* compiled from: ProfitAndLossHubSectionStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryResponseDto;", "", "Lrosetta/portfolio/v1/AssetClassDto;", "params", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore$RealizedPnlParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnl.ProfitAndLossHubSectionStore$realizedPnlEndpoint$1", m3645f = "ProfitAndLossHubSectionStore.kt", m3646l = {73}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.portfolio.pnl.ProfitAndLossHubSectionStore$realizedPnlEndpoint$1, reason: use source file name */
/* loaded from: classes11.dex */
final class ProfitAndLossHubSectionStore4 extends ContinuationImpl7 implements Function2<ProfitAndLossHubSectionStore.RealizedPnlParams, Continuation<? super Tuples2<? extends GetRealizedPerformanceSummaryResponseDto, ? extends List<? extends AssetClassDto>>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ProfitAndLossHubSectionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfitAndLossHubSectionStore4(ProfitAndLossHubSectionStore profitAndLossHubSectionStore, Continuation<? super ProfitAndLossHubSectionStore4> continuation) {
        super(2, continuation);
        this.this$0 = profitAndLossHubSectionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProfitAndLossHubSectionStore4 profitAndLossHubSectionStore4 = new ProfitAndLossHubSectionStore4(this.this$0, continuation);
        profitAndLossHubSectionStore4.L$0 = obj;
        return profitAndLossHubSectionStore4;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(ProfitAndLossHubSectionStore.RealizedPnlParams realizedPnlParams, Continuation<? super Tuples2<GetRealizedPerformanceSummaryResponseDto, ? extends List<? extends AssetClassDto>>> continuation) {
        return ((ProfitAndLossHubSectionStore4) create(realizedPnlParams, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ProfitAndLossHubSectionStore.RealizedPnlParams realizedPnlParams, Continuation<? super Tuples2<? extends GetRealizedPerformanceSummaryResponseDto, ? extends List<? extends AssetClassDto>>> continuation) {
        return invoke2(realizedPnlParams, (Continuation<? super Tuples2<GetRealizedPerformanceSummaryResponseDto, ? extends List<? extends AssetClassDto>>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        ProfitAndLossHubSectionStore.RealizedPnlParams realizedPnlParams;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ProfitAndLossHubSectionStore.RealizedPnlParams realizedPnlParams2 = (ProfitAndLossHubSectionStore.RealizedPnlParams) this.L$0;
            Portfolio portfolio = this.this$0.portfolioService;
            GetRealizedPerformanceSummaryRequestDto getRealizedPerformanceSummaryRequestDto = new GetRealizedPerformanceSummaryRequestDto(realizedPnlParams2.getAccountNumber(), CollectionsKt.listOf((Object[]) new SpanDto[]{SpanDto.SPAN_1M, SpanDto.SPAN_YTD}), realizedPnlParams2.getAssetClasses(), CurrencyDto.INSTANCE.fromProto(realizedPnlParams2.getDisplayCurrency()));
            this.L$0 = realizedPnlParams2;
            this.label = 1;
            Object objGetRealizedPerformanceSummary = portfolio.GetRealizedPerformanceSummary(getRealizedPerformanceSummaryRequestDto, this);
            if (objGetRealizedPerformanceSummary == coroutine_suspended) {
                return coroutine_suspended;
            }
            realizedPnlParams = realizedPnlParams2;
            obj = objGetRealizedPerformanceSummary;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            realizedPnlParams = (ProfitAndLossHubSectionStore.RealizedPnlParams) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return new Tuples2(obj, realizedPnlParams.getAssetClasses());
    }
}
