package com.robinhood.android.portfolio.pnl;

import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.portfolio.pnl.ProfitAndLossChartStore;
import com.robinhood.android.portfolio.pnl.api.ApiProfitAndLossChart;
import com.robinhood.android.portfolio.pnl.api.ProfitAndLossApi;
import com.robinhood.android.portfolio.pnl.api.ProfitAndLossChartSpan;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.CommaSeparatedList2;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ProfitAndLossChartStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnl/api/ApiProfitAndLossChart;", "<destruct>", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossChartStore$ProfitAndLossChartRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnl.ProfitAndLossChartStore$profitAndLossChartEndpoint$1", m3645f = "ProfitAndLossChartStore.kt", m3646l = {37}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.pnl.ProfitAndLossChartStore$profitAndLossChartEndpoint$1, reason: use source file name */
/* loaded from: classes11.dex */
final class ProfitAndLossChartStore2 extends ContinuationImpl7 implements Function2<ProfitAndLossChartStore.ProfitAndLossChartRequest, Continuation<? super ApiProfitAndLossChart>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ProfitAndLossChartStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfitAndLossChartStore2(ProfitAndLossChartStore profitAndLossChartStore, Continuation<? super ProfitAndLossChartStore2> continuation) {
        super(2, continuation);
        this.this$0 = profitAndLossChartStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProfitAndLossChartStore2 profitAndLossChartStore2 = new ProfitAndLossChartStore2(this.this$0, continuation);
        profitAndLossChartStore2.L$0 = obj;
        return profitAndLossChartStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProfitAndLossChartStore.ProfitAndLossChartRequest profitAndLossChartRequest, Continuation<? super ApiProfitAndLossChart> continuation) {
        return ((ProfitAndLossChartStore2) create(profitAndLossChartRequest, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ProfitAndLossChartStore.ProfitAndLossChartRequest profitAndLossChartRequest = (ProfitAndLossChartStore.ProfitAndLossChartRequest) this.L$0;
        String accountNumber = profitAndLossChartRequest.getAccountNumber();
        List<AssetClass> listComponent2 = profitAndLossChartRequest.component2();
        ProfitAndLossChartSpan span = profitAndLossChartRequest.getSpan();
        ProfitAndLossApi profitAndLossApi = this.this$0.profitAndLossApi;
        List<AssetClass> list = listComponent2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AssetClass) it.next()).getServerValue());
        }
        CommaSeparatedList<String> commaSeparatedList = CommaSeparatedList2.toCommaSeparatedList(arrayList);
        this.label = 1;
        Object profitAndLossChart = profitAndLossApi.getProfitAndLossChart(accountNumber, commaSeparatedList, span, this);
        return profitAndLossChart == coroutine_suspended ? coroutine_suspended : profitAndLossChart;
    }
}
