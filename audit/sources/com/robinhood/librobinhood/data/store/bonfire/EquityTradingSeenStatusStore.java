package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.api.trade.equity.retrofit.TradeEquityBonfireApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.bonfire.ApiEquityTradingSeenStatusRequest;
import com.robinhood.models.api.bonfire.ApiEquityTradingSeenStatusRequest2;
import com.robinhood.models.api.bonfire.ApiEquityTradingSeenStatusResponse;
import com.robinhood.models.dao.EquityTradingSeenStatusDao;
import com.robinhood.models.p320db.bonfire.EquityTradingSeenStatus;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.ResultKt;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* compiled from: EquityTradingSeenStatusStore.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\u0010\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u0017J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u001bJ\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001d0\u00162\u0006\u0010\u001e\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore;", "Lcom/robinhood/store/Store;", "tradeEquityBonfireApi", "Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;", "dao", "Lcom/robinhood/models/dao/EquityTradingSeenStatusDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;Lcom/robinhood/models/dao/EquityTradingSeenStatusDao;Lcom/robinhood/store/StoreBundle;)V", "patchEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/models/api/bonfire/ApiEquityTradingSeenStatusRequest;", "Lcom/robinhood/models/api/bonfire/ApiEquityTradingSeenStatusPatchResponse;", "getEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/bonfire/ApiEquityTradingSeenStatusResponse;", "query", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/bonfire/EquityTradingSeenStatus;", "hasSeenStatusForAdtInstrumentInfoSheet", "Lio/reactivex/Single;", "", "refresh", "force", "streamSeenStatus", "Lio/reactivex/Observable;", "updateSeenStatus", "Lcom/robinhood/utils/Optional;", "request", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class EquityTradingSeenStatusStore extends Store {
    private final EquityTradingSeenStatusDao dao;
    private final Endpoint<Unit, ApiEquityTradingSeenStatusResponse> getEndpoint;
    private final PostEndpoint<ApiEquityTradingSeenStatusRequest, ApiEquityTradingSeenStatusRequest2> patchEndpoint;
    private final Query<Unit, EquityTradingSeenStatus> query;
    private final TradeEquityBonfireApi tradeEquityBonfireApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityTradingSeenStatusStore(TradeEquityBonfireApi tradeEquityBonfireApi, EquityTradingSeenStatusDao dao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(tradeEquityBonfireApi, "tradeEquityBonfireApi");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.tradeEquityBonfireApi = tradeEquityBonfireApi;
        this.dao = dao;
        this.patchEndpoint = PostEndpoint.INSTANCE.create(new EquityTradingSeenStatusStore4(tradeEquityBonfireApi), new EquityTradingSeenStatusStore5(null));
        this.getEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new EquityTradingSeenStatusStore2(this, null), getLogoutKillswitch(), new EquityTradingSeenStatusStore3(dao), storeBundle.getClock(), null, 16, null);
        this.query = Store.create$default(this, Query.INSTANCE, "streamEquityTradingSeenStatus", CollectionsKt.emptyList(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.EquityTradingSeenStatusStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityTradingSeenStatusStore.query$lambda$0(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getEndpoint$insert(EquityTradingSeenStatusDao equityTradingSeenStatusDao, ApiEquityTradingSeenStatusResponse apiEquityTradingSeenStatusResponse, Continuation continuation) {
        equityTradingSeenStatusDao.insert(apiEquityTradingSeenStatusResponse);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(EquityTradingSeenStatusStore equityTradingSeenStatusStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return equityTradingSeenStatusStore.dao.getEquityTradingStatus();
    }

    /* compiled from: EquityTradingSeenStatusStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.EquityTradingSeenStatusStore$hasSeenStatusForAdtInstrumentInfoSheet$1", m3645f = "EquityTradingSeenStatusStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.EquityTradingSeenStatusStore$hasSeenStatusForAdtInstrumentInfoSheet$1 */
    static final class C345091 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        int label;

        C345091(Continuation<? super C345091> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityTradingSeenStatusStore.this.new C345091(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C345091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return boxing.boxBoolean(EquityTradingSeenStatusStore.this.dao.hasSeenStatusForAdtInstrumentInfoSheet());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Single<Boolean> hasSeenStatusForAdtInstrumentInfoSheet() {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C345091(null), 1, null);
    }

    public static /* synthetic */ void refresh$default(EquityTradingSeenStatusStore equityTradingSeenStatusStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        equityTradingSeenStatusStore.refresh(z);
    }

    public final void refresh(boolean force) {
        Endpoint.DefaultImpls.refresh$default(this.getEndpoint, Unit.INSTANCE, force, null, 4, null);
    }

    public final Observable<EquityTradingSeenStatus> streamSeenStatus() {
        return this.query.asObservable(Unit.INSTANCE);
    }

    /* compiled from: EquityTradingSeenStatusStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/bonfire/ApiEquityTradingSeenStatusPatchResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.EquityTradingSeenStatusStore$updateSeenStatus$1", m3645f = "EquityTradingSeenStatusStore.kt", m3646l = {58}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.EquityTradingSeenStatusStore$updateSeenStatus$1 */
    static final class C345101 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends ApiEquityTradingSeenStatusRequest2>>, Object> {
        final /* synthetic */ ApiEquityTradingSeenStatusRequest $request;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C345101(ApiEquityTradingSeenStatusRequest apiEquityTradingSeenStatusRequest, Continuation<? super C345101> continuation) {
            super(2, continuation);
            this.$request = apiEquityTradingSeenStatusRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityTradingSeenStatusStore.this.new C345101(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends ApiEquityTradingSeenStatusRequest2>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<ApiEquityTradingSeenStatusRequest2>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<ApiEquityTradingSeenStatusRequest2>> continuation) {
            return ((C345101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Optional.Companion companion;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Optional.Companion companion2 = Optional.INSTANCE;
                PostEndpoint postEndpoint = EquityTradingSeenStatusStore.this.patchEndpoint;
                ApiEquityTradingSeenStatusRequest apiEquityTradingSeenStatusRequest = this.$request;
                this.L$0 = companion2;
                this.label = 1;
                Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, apiEquityTradingSeenStatusRequest, null, this, 2, null);
                if (objPost$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                companion = companion2;
                obj = objPost$default;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                companion = (Optional.Companion) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return companion.m2972of(obj);
        }
    }

    public final Single<Optional<ApiEquityTradingSeenStatusRequest2>> updateSeenStatus(ApiEquityTradingSeenStatusRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Single<Optional<ApiEquityTradingSeenStatusRequest2>> singleDoAfterSuccess = RxFactory.DefaultImpls.rxSingle$default(this, null, new C345101(request, null), 1, null).doAfterSuccess(new Consumer() { // from class: com.robinhood.librobinhood.data.store.bonfire.EquityTradingSeenStatusStore.updateSeenStatus.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Optional<ApiEquityTradingSeenStatusRequest2> optional) {
                ApiEquityTradingSeenStatusRequest2 orNull = optional.getOrNull();
                if (orNull == null || !orNull.getSuccess()) {
                    return;
                }
                EquityTradingSeenStatusStore.this.refresh(true);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoAfterSuccess, "doAfterSuccess(...)");
        return singleDoAfterSuccess;
    }
}
