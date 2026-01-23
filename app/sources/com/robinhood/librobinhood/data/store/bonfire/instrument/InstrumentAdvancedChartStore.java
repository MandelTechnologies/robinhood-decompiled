package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.android.charts.models.api.ApiAdvancedChart;
import com.robinhood.android.charts.models.dao.AdvancedChartDao;
import com.robinhood.android.charts.models.p080db.AdvancedChartModel;
import com.robinhood.android.charts.models.p080db.AdvancedChartModel2;
import com.robinhood.librobinhood.data.store.bonfire.api.InstrumentsApi;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.shared.chart.store.advancedChart.BaseAdvancedChartStore;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;

/* compiled from: InstrumentAdvancedChartStore.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002&\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0001B)\b\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0017\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00062\n\u0010\u0018\u001a\u00060\u0002j\u0002`\u0003H\u0094@¢\u0006\u0002\u0010\u0019J \u0010\u001a\u001a\u00020\u001b2\u0010\u0010\u001c\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0094@¢\u0006\u0002\u0010\u001dJ\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b0\u001f2\n\u0010\u0018\u001a\u00060\u0002j\u0002`\u0003H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010 \u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\"\u0012\u0006\u0012\u0004\u0018\u00010#0!8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006&"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAdvancedChartStore;", "Lcom/robinhood/shared/chart/store/advancedChart/BaseAdvancedChartStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAdvancedChartRequest;", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/Request;", "Lcom/robinhood/android/charts/models/api/ApiAdvancedChart;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/ApiModel;", "Lcom/robinhood/android/charts/models/db/AdvancedChartModel;", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/DbModel;", "instrumentsApi", "Lcom/robinhood/librobinhood/data/store/bonfire/api/InstrumentsApi;", "chartDao", "Lcom/robinhood/android/charts/models/dao/AdvancedChartDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/api/InstrumentsApi;Lcom/robinhood/android/charts/models/dao/AdvancedChartDao;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/utils/moshi/LazyMoshi;)V", "apiTechnicalIndicatorListJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "fetchChart", "request", "(Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAdvancedChartRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cacheChart", "", "response", "(Lcom/robinhood/android/charts/models/api/ApiAdvancedChart;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCachedChart", "Lkotlinx/coroutines/flow/Flow;", "deleteAllFromDb", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "getDeleteAllFromDb", "()Lkotlin/jvm/functions/Function1;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class InstrumentAdvancedChartStore extends BaseAdvancedChartStore<InstrumentAdvancedChartRequest, ApiAdvancedChart<GenericAction>, AdvancedChartModel> {
    private final JsonAdapter<List<ApiTechnicalIndicator>> apiTechnicalIndicatorListJsonAdapter;
    private final AdvancedChartDao chartDao;
    private final InstrumentsApi instrumentsApi;

    @Override // com.robinhood.shared.chart.store.advancedChart.BaseAdvancedChartStore
    public /* bridge */ /* synthetic */ Object cacheChart(ApiAdvancedChart<GenericAction> apiAdvancedChart, Continuation continuation) {
        return cacheChart2(apiAdvancedChart, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentAdvancedChartStore(InstrumentsApi instrumentsApi, AdvancedChartDao chartDao, StoreBundle storeBundle, LazyMoshi moshi) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(instrumentsApi, "instrumentsApi");
        Intrinsics.checkNotNullParameter(chartDao, "chartDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.instrumentsApi = instrumentsApi;
        this.chartDao = chartDao;
        Types types = Types.INSTANCE;
        this.apiTechnicalIndicatorListJsonAdapter = moshi.adapter(new TypeToken<List<? extends ApiTechnicalIndicator>>() { // from class: com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAdvancedChartStore$special$$inlined$getAdapter$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.shared.chart.store.advancedChart.BaseAdvancedChartStore
    public Object fetchChart(InstrumentAdvancedChartRequest instrumentAdvancedChartRequest, Continuation<? super ApiAdvancedChart<GenericAction>> continuation) {
        InstrumentsApi instrumentsApi = this.instrumentsApi;
        UUID instrumentId = instrumentAdvancedChartRequest.getInstrumentId();
        String displaySpan = instrumentAdvancedChartRequest.getDisplaySpan();
        String json = this.apiTechnicalIndicatorListJsonAdapter.toJson(instrumentAdvancedChartRequest.getTechnicalIndicators());
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return instrumentsApi.getAdvancedChart(instrumentId, displaySpan, json, instrumentAdvancedChartRequest.getHideExtendedHours(), instrumentAdvancedChartRequest.getShowCandlesticks(), instrumentAdvancedChartRequest.getInterval(), boxing.boxBoolean(instrumentAdvancedChartRequest.getShowGridlines()), continuation);
    }

    /* renamed from: cacheChart, reason: avoid collision after fix types in other method */
    protected Object cacheChart2(ApiAdvancedChart<GenericAction> apiAdvancedChart, Continuation<? super Unit> continuation) {
        this.chartDao.insert(AdvancedChartModel2.toDbModel(apiAdvancedChart));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.shared.chart.store.advancedChart.BaseAdvancedChartStore
    public Flow<AdvancedChartModel> getCachedChart(InstrumentAdvancedChartRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        AdvancedChartDao advancedChartDao = this.chartDao;
        UUID instrumentId = request.getInstrumentId();
        String displaySpan = request.getDisplaySpan();
        String interval = request.getInterval();
        boolean hideExtendedHours = request.getHideExtendedHours();
        boolean showCandlesticks = request.getShowCandlesticks();
        String json = this.apiTechnicalIndicatorListJsonAdapter.toJson(request.getTechnicalIndicators());
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return advancedChartDao.getAdvancedChartModel(instrumentId, displaySpan, interval, hideExtendedHours, showCandlesticks, json);
    }

    @Override // com.robinhood.shared.chart.store.advancedChart.BaseAdvancedChartStore
    protected Function1<Continuation<? super Unit>, Object> getDeleteAllFromDb() {
        return new InstrumentAdvancedChartStore3(this.chartDao);
    }
}
