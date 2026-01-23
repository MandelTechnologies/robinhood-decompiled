package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.api.portfolio.PortfolioApi;
import com.robinhood.android.models.portfolio.api.ApiAccountMarketValuesLive;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PerformanceChartStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/portfolio/api/ApiAccountMarketValuesLive;", "request", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore$AccountMarketValuesLiveRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$accountMarketValuesLiveEndpoint$1", m3645f = "PerformanceChartStore.kt", m3646l = {56}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$accountMarketValuesLiveEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class PerformanceChartStore2 extends ContinuationImpl7 implements Function2<PerformanceChartStore.AccountMarketValuesLiveRequest, Continuation<? super ApiAccountMarketValuesLive>, Object> {
    final /* synthetic */ PortfolioApi $portfolioApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerformanceChartStore2(PortfolioApi portfolioApi, Continuation<? super PerformanceChartStore2> continuation) {
        super(2, continuation);
        this.$portfolioApi = portfolioApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PerformanceChartStore2 performanceChartStore2 = new PerformanceChartStore2(this.$portfolioApi, continuation);
        performanceChartStore2.L$0 = obj;
        return performanceChartStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PerformanceChartStore.AccountMarketValuesLiveRequest accountMarketValuesLiveRequest, Continuation<? super ApiAccountMarketValuesLive> continuation) {
        return ((PerformanceChartStore2) create(accountMarketValuesLiveRequest, continuation)).invokeSuspend(Unit.INSTANCE);
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
        PerformanceChartStore.AccountMarketValuesLiveRequest accountMarketValuesLiveRequest = (PerformanceChartStore.AccountMarketValuesLiveRequest) this.L$0;
        PortfolioApi portfolioApi = this.$portfolioApi;
        String accountNumber = accountMarketValuesLiveRequest.getAccountNumber();
        DisplayCurrency displayCurrency = accountMarketValuesLiveRequest.getDisplayCurrency();
        this.label = 1;
        Object objAccountMarketValuesLive = portfolioApi.accountMarketValuesLive(accountNumber, displayCurrency, this);
        return objAccountMarketValuesLive == coroutine_suspended ? coroutine_suspended : objAccountMarketValuesLive;
    }
}
