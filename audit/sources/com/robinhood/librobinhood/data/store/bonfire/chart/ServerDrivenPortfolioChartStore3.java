package com.robinhood.librobinhood.data.store.bonfire.chart;

import com.robinhood.android.api.portfolio.PortfolioApi;
import com.robinhood.android.charts.models.api.ApiPortfolioChart;
import com.robinhood.android.charts.models.p080db.PortfolioChartModel;
import com.robinhood.android.charts.models.p080db.PortfolioChartModel2;
import com.robinhood.librobinhood.data.store.bonfire.chart.ServerDrivenPortfolioChartStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ServerDrivenPortfolioChartStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/charts/models/db/PortfolioChartModel;", "request", "Lcom/robinhood/librobinhood/data/store/bonfire/chart/ServerDrivenPortfolioChartStore$Request;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.chart.ServerDrivenPortfolioChartStore$portfolioChartEndpoint$1", m3645f = "ServerDrivenPortfolioChartStore.kt", m3646l = {33}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.chart.ServerDrivenPortfolioChartStore$portfolioChartEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class ServerDrivenPortfolioChartStore3 extends ContinuationImpl7 implements Function2<ServerDrivenPortfolioChartStore.Request, Continuation<? super PortfolioChartModel>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ServerDrivenPortfolioChartStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ServerDrivenPortfolioChartStore3(ServerDrivenPortfolioChartStore serverDrivenPortfolioChartStore, Continuation<? super ServerDrivenPortfolioChartStore3> continuation) {
        super(2, continuation);
        this.this$0 = serverDrivenPortfolioChartStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ServerDrivenPortfolioChartStore3 serverDrivenPortfolioChartStore3 = new ServerDrivenPortfolioChartStore3(this.this$0, continuation);
        serverDrivenPortfolioChartStore3.L$0 = obj;
        return serverDrivenPortfolioChartStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ServerDrivenPortfolioChartStore.Request request, Continuation<? super PortfolioChartModel> continuation) {
        return ((ServerDrivenPortfolioChartStore3) create(request, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ServerDrivenPortfolioChartStore.Request request = (ServerDrivenPortfolioChartStore.Request) this.L$0;
            PortfolioApi portfolioApi = this.this$0.portfolioApi;
            String accountNumber = request.getAccountNumber();
            String spanQueryValue = request.getSpanQueryValue();
            boolean zIsForWidget = request.isForWidget();
            boolean zIsPrivacyEnabled = request.isPrivacyEnabled();
            this.label = 1;
            obj = portfolioApi.getPortfolioChart(accountNumber, spanQueryValue, zIsForWidget, zIsPrivacyEnabled, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return PortfolioChartModel2.toDbModel((ApiPortfolioChart) obj);
    }
}
