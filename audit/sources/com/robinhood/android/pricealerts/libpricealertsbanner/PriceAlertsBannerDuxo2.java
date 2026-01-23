package com.robinhood.android.pricealerts.libpricealertsbanner;

import com.robinhood.android.newsfeed.models.breakingnews.p199db.BreakingNews;
import com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerViewState;
import com.robinhood.android.redesigninvesting.models.highlights.volatility.p233db.FundamentalRisk;
import com.robinhood.models.p320db.Instrument;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PriceAlertsBannerDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerViewState;", "breakingNews", "Lcom/robinhood/android/newsfeed/models/breakingnews/db/BreakingNews;", "fundamentalRisks", "", "Lcom/robinhood/android/redesigninvesting/models/highlights/volatility/db/FundamentalRisk;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerDuxo$initPriceAlertsStream$1$1$1", m3645f = "PriceAlertsBannerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerDuxo$initPriceAlertsStream$1$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class PriceAlertsBannerDuxo2 extends ContinuationImpl7 implements Function3<BreakingNews, List<? extends FundamentalRisk>, Continuation<? super Flow<? extends PriceAlertsBannerViewState>>, Object> {
    final /* synthetic */ Instrument $instrument;
    final /* synthetic */ BigDecimal $threshold;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ PriceAlertsBannerDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceAlertsBannerDuxo2(BigDecimal bigDecimal, PriceAlertsBannerDuxo priceAlertsBannerDuxo, Instrument instrument, Continuation<? super PriceAlertsBannerDuxo2> continuation) {
        super(3, continuation);
        this.$threshold = bigDecimal;
        this.this$0 = priceAlertsBannerDuxo;
        this.$instrument = instrument;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(BreakingNews breakingNews, List<FundamentalRisk> list, Continuation<? super Flow<? extends PriceAlertsBannerViewState>> continuation) {
        PriceAlertsBannerDuxo2 priceAlertsBannerDuxo2 = new PriceAlertsBannerDuxo2(this.$threshold, this.this$0, this.$instrument, continuation);
        priceAlertsBannerDuxo2.L$0 = breakingNews;
        priceAlertsBannerDuxo2.L$1 = list;
        return priceAlertsBannerDuxo2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(BreakingNews breakingNews, List<? extends FundamentalRisk> list, Continuation<? super Flow<? extends PriceAlertsBannerViewState>> continuation) {
        return invoke2(breakingNews, (List<FundamentalRisk>) list, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        BigDecimal bigDecimalValueOf;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BreakingNews breakingNews = (BreakingNews) this.L$0;
        FundamentalRisk fundamentalRisk = (FundamentalRisk) CollectionsKt.firstOrNull((List) this.L$1);
        if (fundamentalRisk == null || (bigDecimalValueOf = fundamentalRisk.getVolatilityScore()) == null) {
            bigDecimalValueOf = BigDecimal.valueOf(0L);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        }
        if (breakingNews == null && bigDecimalValueOf.compareTo(this.$threshold) <= 0) {
            return this.this$0.checkForValidPriceAlert(this.$instrument);
        }
        return FlowKt.flowOf(PriceAlertsBannerViewState.None.INSTANCE);
    }
}
