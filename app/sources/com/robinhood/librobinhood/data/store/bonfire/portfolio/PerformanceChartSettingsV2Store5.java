package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.portfolio.PortfolioApi;
import com.robinhood.android.models.portfolio.PerformanceChartSettingsV2;
import com.robinhood.android.models.portfolio.PerformanceChartSettingsV22;
import com.robinhood.android.models.portfolio.api.ApiPerformanceChartSettingsResponse;
import com.robinhood.android.models.portfolio.api.ApiPerformanceChartSettingsV2;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2Store2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PerformanceChartSettingsV2Store.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;", "params", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartSettingsV2HelperStore$SettingsUpdateParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2HelperStore$postSettingsEndpoint$1", m3645f = "PerformanceChartSettingsV2Store.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2HelperStore$postSettingsEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class PerformanceChartSettingsV2Store5 extends ContinuationImpl7 implements Function2<PerformanceChartSettingsV2Store2.SettingsUpdateParams, Continuation<? super PerformanceChartSettingsV2>, Object> {
    final /* synthetic */ PortfolioApi $portfolioApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerformanceChartSettingsV2Store5(PortfolioApi portfolioApi, Continuation<? super PerformanceChartSettingsV2Store5> continuation) {
        super(2, continuation);
        this.$portfolioApi = portfolioApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PerformanceChartSettingsV2Store5 performanceChartSettingsV2Store5 = new PerformanceChartSettingsV2Store5(this.$portfolioApi, continuation);
        performanceChartSettingsV2Store5.L$0 = obj;
        return performanceChartSettingsV2Store5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PerformanceChartSettingsV2Store2.SettingsUpdateParams settingsUpdateParams, Continuation<? super PerformanceChartSettingsV2> continuation) {
        return ((PerformanceChartSettingsV2Store5) create(settingsUpdateParams, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PerformanceChartSettingsV2Store2.SettingsUpdateParams settingsUpdateParams = (PerformanceChartSettingsV2Store2.SettingsUpdateParams) this.L$0;
            PortfolioApi portfolioApi = this.$portfolioApi;
            String accountNumber = settingsUpdateParams.getAccountNumber();
            String chartType = settingsUpdateParams.getChartType();
            ApiPerformanceChartSettingsV2 updateModel = settingsUpdateParams.getUpdateModel();
            this.label = 1;
            obj = portfolioApi.postPerformanceChartSettingsV2(accountNumber, chartType, updateModel, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return PerformanceChartSettingsV22.toDbModel((ApiPerformanceChartSettingsResponse) obj);
    }
}
