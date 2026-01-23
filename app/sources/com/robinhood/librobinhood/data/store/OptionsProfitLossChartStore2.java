package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.models.api.ApiOptionsProfitLossChart;
import com.robinhood.models.api.ApiOptionsProfitLossChartRequestParams;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsProfitLossChartStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiOptionsProfitLossChart;", "params", "Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionsProfitLossChartStore$getOptionsProfitLossChart$1", m3645f = "OptionsProfitLossChartStore.kt", m3646l = {66}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionsProfitLossChartStore$getOptionsProfitLossChart$1, reason: use source file name */
/* loaded from: classes13.dex */
final class OptionsProfitLossChartStore2 extends ContinuationImpl7 implements Function2<ApiOptionsProfitLossChartRequestParams, Continuation<? super ApiOptionsProfitLossChart>, Object> {
    final /* synthetic */ OptionsApi $optionsApi;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionsProfitLossChartStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionsProfitLossChartStore2(OptionsApi optionsApi, OptionsProfitLossChartStore optionsProfitLossChartStore, Continuation<? super OptionsProfitLossChartStore2> continuation) {
        super(2, continuation);
        this.$optionsApi = optionsApi;
        this.this$0 = optionsProfitLossChartStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionsProfitLossChartStore2 optionsProfitLossChartStore2 = new OptionsProfitLossChartStore2(this.$optionsApi, this.this$0, continuation);
        optionsProfitLossChartStore2.L$0 = obj;
        return optionsProfitLossChartStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiOptionsProfitLossChartRequestParams apiOptionsProfitLossChartRequestParams, Continuation<? super ApiOptionsProfitLossChart> continuation) {
        return ((OptionsProfitLossChartStore2) create(apiOptionsProfitLossChartRequestParams, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiOptionsProfitLossChartRequestParams apiOptionsProfitLossChartRequestParams = (ApiOptionsProfitLossChartRequestParams) this.L$0;
        OptionsApi optionsApi = this.$optionsApi;
        String json = this.this$0.apiRequestLegListJsonAdapter.toJson(apiOptionsProfitLossChartRequestParams.getLegs());
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        String json2 = this.this$0.moneyJsonAdapter.toJson(apiOptionsProfitLossChartRequestParams.getOrderPrice());
        Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
        int quantity = apiOptionsProfitLossChartRequestParams.getQuantity();
        String json3 = this.this$0.moneyJsonAdapter.toJson(apiOptionsProfitLossChartRequestParams.getUnderlyingQuote().getCurrentValueInMoney());
        Intrinsics.checkNotNullExpressionValue(json3, "toJson(...)");
        this.label = 1;
        Object optionsProfitLossChart = optionsApi.getOptionsProfitLossChart(json, json2, quantity, json3, this);
        return optionsProfitLossChart == coroutine_suspended ? coroutine_suspended : optionsProfitLossChart;
    }
}
