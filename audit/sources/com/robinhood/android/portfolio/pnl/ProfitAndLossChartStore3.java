package com.robinhood.android.portfolio.pnl;

import com.robinhood.android.portfolio.pnl.api.ApiProfitAndLossChart;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossChartKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ProfitAndLossChartStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/portfolio/pnl/api/ApiProfitAndLossChart;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnl.ProfitAndLossChartStore$profitAndLossChartEndpoint$2", m3645f = "ProfitAndLossChartStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.portfolio.pnl.ProfitAndLossChartStore$profitAndLossChartEndpoint$2, reason: use source file name */
/* loaded from: classes11.dex */
final class ProfitAndLossChartStore3 extends ContinuationImpl7 implements Function2<ApiProfitAndLossChart, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ProfitAndLossChartStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfitAndLossChartStore3(ProfitAndLossChartStore profitAndLossChartStore, Continuation<? super ProfitAndLossChartStore3> continuation) {
        super(2, continuation);
        this.this$0 = profitAndLossChartStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProfitAndLossChartStore3 profitAndLossChartStore3 = new ProfitAndLossChartStore3(this.this$0, continuation);
        profitAndLossChartStore3.L$0 = obj;
        return profitAndLossChartStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiProfitAndLossChart apiProfitAndLossChart, Continuation<? super Unit> continuation) {
        return ((ProfitAndLossChartStore3) create(apiProfitAndLossChart, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.profitAndLossChartDao.insert(ProfitAndLossChartKt.toDbModel((ApiProfitAndLossChart) this.L$0));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
