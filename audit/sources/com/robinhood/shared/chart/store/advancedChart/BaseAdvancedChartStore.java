package com.robinhood.shared.chart.store.advancedChart;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.QueryKt;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: BaseAdvancedChartStore.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0002*\b\b\u0002\u0010\u0004*\u00020\u00022\u00020\u0005B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00028\u0000H¤@¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0001H¤@¢\u0006\u0002\u0010\fJ\u001d\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u00112\u0006\u0010\u000b\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u0012J\u0019\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00020\u00112\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012R(\u0010\u0013\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0014X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/chart/store/advancedChart/BaseAdvancedChartStore;", "TRequest", "", "TApiResponse", "TDbModel", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/store/StoreBundle;)V", "fetchChart", "request", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cacheChart", "", "response", "getCachedChart", "Lkotlinx/coroutines/flow/Flow;", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "deleteAllFromDb", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "getDeleteAllFromDb", "()Lkotlin/jvm/functions/Function1;", "getAdvancedChartEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "advancedChartQuery", "Lcom/robinhood/android/moria/db/Query;", "streamAdvancedChart", "lib-store-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public abstract class BaseAdvancedChartStore<TRequest, TApiResponse, TDbModel> extends Store {
    private final Query<TRequest, TDbModel> advancedChartQuery;
    private final Endpoint<TRequest, TApiResponse> getAdvancedChartEndpoint;

    protected abstract Object cacheChart(TApiResponse tapiresponse, Continuation<? super Unit> continuation);

    protected abstract Object fetchChart(TRequest trequest, Continuation<? super TApiResponse> continuation);

    protected abstract Flow<TDbModel> getCachedChart(TRequest request);

    protected abstract Function1<Continuation<? super Unit>, Object> getDeleteAllFromDb();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAdvancedChartStore(StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.getAdvancedChartEndpoint = Endpoint.Companion.createWithParams$default(Endpoint.INSTANCE, new BaseAdvancedChartStore3(this, null), getLogoutKillswitch(), new BaseAdvancedChartStore4(this, null), storeBundle.getClock(), null, 16, null);
        this.advancedChartQuery = Store.create$default(this, Query.INSTANCE, "queryAdvancedChart", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.shared.chart.store.advancedChart.BaseAdvancedChartStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseAdvancedChartStore.advancedChartQuery$lambda$0(this.f$0, obj);
            }
        })), new Function1() { // from class: com.robinhood.shared.chart.store.advancedChart.BaseAdvancedChartStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseAdvancedChartStore.advancedChartQuery$lambda$1(this.f$0, obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow advancedChartQuery$lambda$0(BaseAdvancedChartStore baseAdvancedChartStore, Object request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return FlowKt.flow(new BaseAdvancedChartStore2(baseAdvancedChartStore, request, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow advancedChartQuery$lambda$1(BaseAdvancedChartStore baseAdvancedChartStore, Object request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return baseAdvancedChartStore.getCachedChart(request);
    }

    public final Flow<TDbModel> streamAdvancedChart(TRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return QueryKt.deleteAllOnRoomJsonExceptionFlow$default(this.advancedChartQuery, request, getDeleteAllFromDb(), false, 4, null);
    }
}
