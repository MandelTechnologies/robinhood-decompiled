package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.android.charts.models.dao.AdvancedChartIndicatorDao;
import com.robinhood.android.charts.models.dao.AdvancedChartSupportedIndicatorDao;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.prefs.ShouldShowAdvancedChartZoomNuxPref;
import com.robinhood.librobinhood.data.store.bonfire.api.InstrumentsApi;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.models.advancedChart.api.ApiAdvancedChartSupportedIndicators;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicatorConfigRequest;
import com.robinhood.shared.models.advancedChart.api.ApiTitledTechnicalIndicatorConfig;
import com.robinhood.shared.models.advancedChart.p386db.SupportedIndicator;
import com.robinhood.shared.models.advancedChart.p386db.TechnicalIndicatorConfig;
import com.robinhood.shared.models.advancedChart.p386db.TechnicalIndicatorConfigList;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Instant;

/* compiled from: AdvancedChartStore.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u001f\u001a\u00020\u00162\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001d2\u0006\u0010\"\u001a\u00020\u0010J\"\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00160$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u001d2\u0006\u0010\"\u001a\u00020\u0010J$\u0010'\u001a\u00020\u00162\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u001d2\u0006\u0010\"\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010(J\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001b0*J\u0012\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0*J\u0006\u0010,\u001a\u00020-J\u0006\u0010.\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0012\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u0014\u0012\u0004\u0012\u00020\u00160\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00180\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/instrument/AdvancedChartStore;", "Lcom/robinhood/store/Store;", "instrumentsApi", "Lcom/robinhood/librobinhood/data/store/bonfire/api/InstrumentsApi;", "indicatorDao", "Lcom/robinhood/android/charts/models/dao/AdvancedChartIndicatorDao;", "supportedIndicatorDao", "Lcom/robinhood/android/charts/models/dao/AdvancedChartSupportedIndicatorDao;", "shouldShowAdvancedChartZoomNuxPref", "Lcom/robinhood/prefs/BooleanPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/api/InstrumentsApi;Lcom/robinhood/android/charts/models/dao/AdvancedChartIndicatorDao;Lcom/robinhood/android/charts/models/dao/AdvancedChartSupportedIndicatorDao;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/store/StoreBundle;)V", "getAdvancedChartConfigEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/shared/models/advancedChart/api/ApiTitledTechnicalIndicatorConfig;", "postAdvancedChartConfigEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lkotlin/Pair;", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicatorConfigRequest;", "", "getSupportedIndicatorsEndpoint", "Lcom/robinhood/shared/models/advancedChart/api/ApiAdvancedChartSupportedIndicators;", "indicatorConfigListQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/shared/models/advancedChart/db/TechnicalIndicatorConfigList;", "supportedIndicatorQuery", "", "Lcom/robinhood/shared/models/advancedChart/db/SupportedIndicator;", "updateIndicatorConfigsWithStoreScope", "newTechnicalIndicatorConfigs", "Lcom/robinhood/shared/models/advancedChart/db/TechnicalIndicatorConfig;", "timestamp", "updateIndicatorsSingle", "Lio/reactivex/Single;", "newIndicators", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "postAdvancedChartConfig", "(Ljava/util/List;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamTechnicalIndicatorConfigList", "Lio/reactivex/Observable;", "streamSupportedIndicators", "shouldShowAdvancedChartZoomNux", "", "recordAdvancedChartZoomNuxShown", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class AdvancedChartStore extends Store {
    private final Endpoint<Long, ApiTitledTechnicalIndicatorConfig> getAdvancedChartConfigEndpoint;
    private final Endpoint<Unit, ApiAdvancedChartSupportedIndicators> getSupportedIndicatorsEndpoint;
    private final Query<Unit, TechnicalIndicatorConfigList> indicatorConfigListQuery;
    private final AdvancedChartIndicatorDao indicatorDao;
    private final InstrumentsApi instrumentsApi;
    private final PostEndpoint<Tuples2<ApiTechnicalIndicatorConfigRequest, Long>, Unit> postAdvancedChartConfigEndpoint;
    private final BooleanPreference shouldShowAdvancedChartZoomNuxPref;
    private final AdvancedChartSupportedIndicatorDao supportedIndicatorDao;
    private final Query<Unit, List<SupportedIndicator>> supportedIndicatorQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedChartStore(InstrumentsApi instrumentsApi, AdvancedChartIndicatorDao indicatorDao, AdvancedChartSupportedIndicatorDao supportedIndicatorDao, @ShouldShowAdvancedChartZoomNuxPref BooleanPreference shouldShowAdvancedChartZoomNuxPref, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(instrumentsApi, "instrumentsApi");
        Intrinsics.checkNotNullParameter(indicatorDao, "indicatorDao");
        Intrinsics.checkNotNullParameter(supportedIndicatorDao, "supportedIndicatorDao");
        Intrinsics.checkNotNullParameter(shouldShowAdvancedChartZoomNuxPref, "shouldShowAdvancedChartZoomNuxPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.instrumentsApi = instrumentsApi;
        this.indicatorDao = indicatorDao;
        this.supportedIndicatorDao = supportedIndicatorDao;
        this.shouldShowAdvancedChartZoomNuxPref = shouldShowAdvancedChartZoomNuxPref;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.getAdvancedChartConfigEndpoint = Endpoint.Companion.createWithParams$default(companion, new AdvancedChartStore2(this, null), getLogoutKillswitch(), new AdvancedChartStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.postAdvancedChartConfigEndpoint = PostEndpoint.INSTANCE.createWithParams(new AdvancedChartStore6(this, null), new AdvancedChartStore7(this, null));
        this.getSupportedIndicatorsEndpoint = Endpoint.Companion.create$default(companion, new AdvancedChartStore4(this, null), getLogoutKillswitch(), new AdvancedChartStore5(this, null), storeBundle.getClock(), null, 16, null);
        Query.Companion companion2 = Query.INSTANCE;
        this.indicatorConfigListQuery = Store.create$default(this, companion2, "queryIndicatorConfigList", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.instrument.AdvancedChartStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartStore.indicatorConfigListQuery$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.instrument.AdvancedChartStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartStore.indicatorConfigListQuery$lambda$1(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.supportedIndicatorQuery = Store.create$default(this, companion2, "supportedIndicatorQuery", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.instrument.AdvancedChartStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartStore.supportedIndicatorQuery$lambda$2(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.instrument.AdvancedChartStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartStore.supportedIndicatorQuery$lambda$3(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job indicatorConfigListQuery$lambda$0(AdvancedChartStore advancedChartStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.refresh$default(advancedChartStore.getAdvancedChartConfigEndpoint, Long.valueOf(Instant.now().toEpochMilli()), true, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow indicatorConfigListQuery$lambda$1(AdvancedChartStore advancedChartStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return advancedChartStore.indicatorDao.getIndicatorConfigList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job supportedIndicatorQuery$lambda$2(AdvancedChartStore advancedChartStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.refresh$default(advancedChartStore.getSupportedIndicatorsEndpoint, Unit.INSTANCE, true, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow supportedIndicatorQuery$lambda$3(AdvancedChartStore advancedChartStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return advancedChartStore.supportedIndicatorDao.getSupportedIndicators();
    }

    /* compiled from: AdvancedChartStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.instrument.AdvancedChartStore$updateIndicatorConfigsWithStoreScope$1", m3645f = "AdvancedChartStore.kt", m3646l = {97}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.instrument.AdvancedChartStore$updateIndicatorConfigsWithStoreScope$1 */
    static final class C346351 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<TechnicalIndicatorConfig> $newTechnicalIndicatorConfigs;
        final /* synthetic */ long $timestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346351(List<TechnicalIndicatorConfig> list, long j, Continuation<? super C346351> continuation) {
            super(2, continuation);
            this.$newTechnicalIndicatorConfigs = list;
            this.$timestamp = j;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvancedChartStore.this.new C346351(this.$newTechnicalIndicatorConfigs, this.$timestamp, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C346351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AdvancedChartStore advancedChartStore = AdvancedChartStore.this;
                List<TechnicalIndicatorConfig> list = this.$newTechnicalIndicatorConfigs;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((TechnicalIndicatorConfig) it.next()).getApiTechnicalIndicator());
                }
                long j = this.$timestamp;
                this.label = 1;
                if (advancedChartStore.postAdvancedChartConfig(arrayList, j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void updateIndicatorConfigsWithStoreScope(List<TechnicalIndicatorConfig> newTechnicalIndicatorConfigs, long timestamp) {
        Intrinsics.checkNotNullParameter(newTechnicalIndicatorConfigs, "newTechnicalIndicatorConfigs");
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C346351(newTechnicalIndicatorConfigs, timestamp, null), 3, null);
    }

    /* compiled from: AdvancedChartStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.instrument.AdvancedChartStore$updateIndicatorsSingle$1", m3645f = "AdvancedChartStore.kt", m3646l = {109}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.instrument.AdvancedChartStore$updateIndicatorsSingle$1 */
    static final class C346361 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<ApiTechnicalIndicator> $newIndicators;
        final /* synthetic */ long $timestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C346361(List<? extends ApiTechnicalIndicator> list, long j, Continuation<? super C346361> continuation) {
            super(2, continuation);
            this.$newIndicators = list;
            this.$timestamp = j;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvancedChartStore.this.new C346361(this.$newIndicators, this.$timestamp, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C346361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AdvancedChartStore advancedChartStore = AdvancedChartStore.this;
                List<ApiTechnicalIndicator> list = this.$newIndicators;
                long j = this.$timestamp;
                this.label = 1;
                if (advancedChartStore.postAdvancedChartConfig(list, j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Single<Unit> updateIndicatorsSingle(List<? extends ApiTechnicalIndicator> newIndicators, long timestamp) {
        Intrinsics.checkNotNullParameter(newIndicators, "newIndicators");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C346361(newIndicators, timestamp, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object postAdvancedChartConfig(List<? extends ApiTechnicalIndicator> list, long j, Continuation<? super Unit> continuation) {
        Object objPost$default = PostEndpoint.DefaultImpls.post$default(this.postAdvancedChartConfigEndpoint, Tuples4.m3642to(new ApiTechnicalIndicatorConfigRequest(list), boxing.boxLong(j)), null, continuation, 2, null);
        return objPost$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPost$default : Unit.INSTANCE;
    }

    public final Observable<TechnicalIndicatorConfigList> streamTechnicalIndicatorConfigList() {
        return this.indicatorConfigListQuery.asObservable(Unit.INSTANCE);
    }

    public final Observable<List<SupportedIndicator>> streamSupportedIndicators() {
        return this.supportedIndicatorQuery.asObservable(Unit.INSTANCE);
    }

    public final boolean shouldShowAdvancedChartZoomNux() {
        return this.shouldShowAdvancedChartZoomNuxPref.get();
    }

    public final void recordAdvancedChartZoomNuxShown() {
        this.shouldShowAdvancedChartZoomNuxPref.set(false);
    }
}
