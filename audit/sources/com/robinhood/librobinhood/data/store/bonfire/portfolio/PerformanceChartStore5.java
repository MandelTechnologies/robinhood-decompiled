package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.api.portfolio.PortfolioApi;
import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.android.models.portfolio.PerformanceChartModel2;
import com.robinhood.android.models.portfolio.api.ApiPerformanceChart;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PerformanceChartStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/portfolio/PerformanceChartModel;", "request", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore$PerformanceChartRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$chartEndpoint$1", m3645f = "PerformanceChartStore.kt", m3646l = {67}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$chartEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class PerformanceChartStore5 extends ContinuationImpl7 implements Function2<PerformanceChartStore.PerformanceChartRequest, Continuation<? super PerformanceChartModel>, Object> {
    final /* synthetic */ PortfolioApi $portfolioApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerformanceChartStore5(PortfolioApi portfolioApi, Continuation<? super PerformanceChartStore5> continuation) {
        super(2, continuation);
        this.$portfolioApi = portfolioApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PerformanceChartStore5 performanceChartStore5 = new PerformanceChartStore5(this.$portfolioApi, continuation);
        performanceChartStore5.L$0 = obj;
        return performanceChartStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PerformanceChartStore.PerformanceChartRequest performanceChartRequest, Continuation<? super PerformanceChartModel> continuation) {
        return ((PerformanceChartStore5) create(performanceChartRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        PerformanceChartStore.PerformanceChartRequest performanceChartRequest;
        Object performanceChart;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            performanceChartRequest = (PerformanceChartStore.PerformanceChartRequest) this.L$0;
            PortfolioApi portfolioApi = this.$portfolioApi;
            String accountNumber = performanceChartRequest.getAccountNumber();
            String displaySpan = performanceChartRequest.getDisplaySpan();
            String chartType = performanceChartRequest.getChartType();
            String chartStyle = performanceChartRequest.getChartStyle();
            boolean zIsForWidget = performanceChartRequest.isForWidget();
            boolean zIsPrivacyEnabled = performanceChartRequest.isPrivacyEnabled();
            List<String> benchmarkIds = performanceChartRequest.getBenchmarkIds();
            String strJoinToString$default = benchmarkIds != null ? CollectionsKt.joinToString$default(benchmarkIds, ",", null, null, 0, null, null, 62, null) : null;
            Boolean includeAllHours = performanceChartRequest.getIncludeAllHours();
            DisplayCurrency displayCurrency = performanceChartRequest.getDisplayCurrency();
            this.L$0 = performanceChartRequest;
            this.label = 1;
            performanceChart = portfolioApi.getPerformanceChart(accountNumber, displaySpan, chartType, chartStyle, zIsForWidget, zIsPrivacyEnabled, strJoinToString$default, includeAllHours, displayCurrency, this);
            if (performanceChart == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PerformanceChartStore.PerformanceChartRequest performanceChartRequest2 = (PerformanceChartStore.PerformanceChartRequest) this.L$0;
            ResultKt.throwOnFailure(obj);
            performanceChartRequest = performanceChartRequest2;
            performanceChart = obj;
        }
        return PerformanceChartModel2.toDbModel((ApiPerformanceChart) performanceChart, performanceChartRequest.getDisplaySpanOrDefault(), performanceChartRequest.getChartStyleOrDefault(), performanceChartRequest.getIncludeAllHoursOrDefault(), performanceChartRequest.isForWidget(), performanceChartRequest.isPrivacyEnabled());
    }
}
