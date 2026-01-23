package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.models.api.bonfire.ApiStockDetail;
import com.robinhood.models.dao.bonfire.StockDetailDao;
import com.robinhood.models.p320db.bonfire.StockDetail;
import com.robinhood.models.p355ui.bonfire.UiStockDetail;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: StockDetailStore.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00162\u0006\u0010\u0017\u001a\u00020\fJ\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0017\u001a\u00020\fJ\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00162\u0006\u0010\u0017\u001a\u00020\fJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u000fX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/StockDetailStore;", "Lcom/robinhood/store/Store;", "bonfireApi", "Lcom/robinhood/api/retrofit/BonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/bonfire/StockDetailDao;", "<init>", "(Lcom/robinhood/api/retrofit/BonfireApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/bonfire/StockDetailDao;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/models/api/bonfire/ApiStockDetail;", "query", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/bonfire/StockDetail;", "uiQuery", "Lcom/robinhood/models/ui/bonfire/UiStockDetail;", "getUiQuery$annotations", "()V", "stream", "Lio/reactivex/Observable;", "instrumentId", "isPreIpo", "Lkotlinx/coroutines/flow/Flow;", "", "isPreIpoObservable", "refresh", "Lkotlinx/coroutines/Job;", "force", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class StockDetailStore extends Store {
    private final BonfireApi bonfireApi;
    private final StockDetailDao dao;
    private final Endpoint<UUID, ApiStockDetail> endpoint;
    private final Query<UUID, StockDetail> query;
    private final Query<UUID, UiStockDetail> uiQuery;

    private static /* synthetic */ void getUiQuery$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StockDetailStore(BonfireApi bonfireApi, StoreBundle storeBundle, StockDetailDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.bonfireApi = bonfireApi;
        this.dao = dao;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new StockDetailStore2(this, null), getLogoutKillswitch(), new StockDetailStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.query = Store.create$default(this, Query.INSTANCE, "queryStockDetail", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.StockDetailStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StockDetailStore.query$lambda$0(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.StockDetailStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StockDetailStore.query$lambda$1(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.uiQuery = new Query<UUID, UiStockDetail>() { // from class: com.robinhood.librobinhood.data.store.bonfire.StockDetailStore$special$$inlined$Query$1
            @Override // com.robinhood.android.moria.p196db.Query
            public Observable<UiStockDetail> asObservable(UUID params) {
                Intrinsics.checkNotNullParameter(params, "params");
                Observable<UiStockDetail> map = this.this$0.query.asObservable(params).map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.StockDetailStore$uiQuery$1$1
                    @Override // io.reactivex.functions.Function
                    public final UiStockDetail apply(StockDetail stockDetail) {
                        Intrinsics.checkNotNullParameter(stockDetail, "stockDetail");
                        return stockDetail.toUiModel();
                    }
                });
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return map;
            }

            @Override // com.robinhood.android.moria.p196db.Query
            public Flow<UiStockDetail> asFlow(UUID params) {
                Intrinsics.checkNotNullParameter(params, "params");
                return Context7.buffer$default(RxConvert.asFlow(asObservable(params)), Integer.MAX_VALUE, null, 2, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(StockDetailStore stockDetailStore, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return Endpoint.DefaultImpls.poll$default(stockDetailStore.endpoint, instrumentId, StockDetail.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(StockDetailStore stockDetailStore, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return stockDetailStore.dao.getStockDetail(instrumentId);
    }

    public final Observable<UiStockDetail> stream(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return this.uiQuery.asObservable(instrumentId);
    }

    public final Flow<Boolean> isPreIpo(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        final Flow<StockDetail> flowAsFlow = this.query.asFlow(instrumentId);
        return new Flow<Boolean>() { // from class: com.robinhood.librobinhood.data.store.bonfire.StockDetailStore$isPreIpo$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.bonfire.StockDetailStore$isPreIpo$$inlined$map$1$2 */
            public static final class C346022<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.StockDetailStore$isPreIpo$$inlined$map$1$2", m3645f = "StockDetailStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.bonfire.StockDetailStore$isPreIpo$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C346022.this.emit(null, this);
                    }
                }

                public C346022(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        StockDetail stockDetail = (StockDetail) obj;
                        Boolean boolBoxBoolean = boxing.boxBoolean(stockDetail.getState() == ApiStockDetail.State.PRE_IPO || stockDetail.getState() == ApiStockDetail.State.PRE_IPO_ACCESS);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new C346022(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Observable<Boolean> isPreIpoObservable(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return asObservable(isPreIpo(instrumentId));
    }

    public final Job refresh(UUID instrumentId, boolean force) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return Endpoint.DefaultImpls.refresh$default(this.endpoint, instrumentId, force, null, 4, null);
    }
}
