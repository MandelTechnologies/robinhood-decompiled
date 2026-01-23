package com.robinhood.librobinhood.data.store.bonfire.chart;

import com.robinhood.android.charts.models.p080db.PortfolioChartModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ServerDrivenPortfolioChartStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/android/charts/models/db/PortfolioChartModel;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.chart.ServerDrivenPortfolioChartStore$portfolioChartEndpoint$2", m3645f = "ServerDrivenPortfolioChartStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.chart.ServerDrivenPortfolioChartStore$portfolioChartEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class ServerDrivenPortfolioChartStore4 extends ContinuationImpl7 implements Function2<PortfolioChartModel, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ServerDrivenPortfolioChartStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ServerDrivenPortfolioChartStore4(ServerDrivenPortfolioChartStore serverDrivenPortfolioChartStore, Continuation<? super ServerDrivenPortfolioChartStore4> continuation) {
        super(2, continuation);
        this.this$0 = serverDrivenPortfolioChartStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ServerDrivenPortfolioChartStore4 serverDrivenPortfolioChartStore4 = new ServerDrivenPortfolioChartStore4(this.this$0, continuation);
        serverDrivenPortfolioChartStore4.L$0 = obj;
        return serverDrivenPortfolioChartStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PortfolioChartModel portfolioChartModel, Continuation<? super Unit> continuation) {
        return ((ServerDrivenPortfolioChartStore4) create(portfolioChartModel, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.portfolioChartDao.insert((PortfolioChartModel) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
