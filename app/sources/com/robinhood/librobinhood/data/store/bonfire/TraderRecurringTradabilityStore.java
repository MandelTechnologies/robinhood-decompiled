package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.recurring.retrofit.RecurringApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.dao.bonfire.InstrumentRecurringTradabilityDao;
import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.base.InstrumentRecurringTradabilityStore;
import io.reactivex.Single;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* compiled from: TraderRecurringTradabilityStore.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00152\u0006\u0010\u0016\u001a\u00020\u000fJ\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00152\u0006\u0010\u0018\u001a\u00020\u000fJ\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010!\u001a\u00020\"R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0011\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\u0012\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u001b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\u0012\u0012\u0004\u0012\u00020\u00100\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/TraderRecurringTradabilityStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/store/base/InstrumentRecurringTradabilityStore;", "recurringApi", "Lcom/robinhood/android/api/recurring/retrofit/RecurringApi;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/bonfire/InstrumentRecurringTradabilityDao;", "<init>", "(Lcom/robinhood/android/api/recurring/retrofit/RecurringApi;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/bonfire/InstrumentRecurringTradabilityDao;)V", "oldEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability;", "newEndpoint", "Lkotlin/Pair;", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "fetchRecurringInstrumentTradable", "Lio/reactivex/Single;", "instrumentId", "fetchCryptoRecurringTradable", "currencyPairId", "streamRecurringInstrumentTradable", "Lcom/robinhood/android/moria/db/Query;", "streamRecurringInstrumentTradableByAssetType", "Lkotlinx/coroutines/flow/Flow;", "assetType", "Lcom/robinhood/store/base/InstrumentRecurringTradabilityStore$AssetType;", "refresh", "", "force", "", "lib-store-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class TraderRecurringTradabilityStore extends Store implements InstrumentRecurringTradabilityStore {
    private final AccountProvider accountProvider;
    private final InstrumentRecurringTradabilityDao dao;
    private final Endpoint<Tuples2<ApiAssetType, UUID>, InstrumentRecurringTradability> newEndpoint;
    private final Endpoint<UUID, InstrumentRecurringTradability> oldEndpoint;
    private final RecurringApi recurringApi;
    private final Query<UUID, InstrumentRecurringTradability> streamRecurringInstrumentTradable;
    private final Query<Tuples2<? extends ApiAssetType, UUID>, InstrumentRecurringTradability> streamRecurringInstrumentTradableByAssetType;

    /* compiled from: TraderRecurringTradabilityStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InstrumentRecurringTradabilityStore.AssetType.values().length];
            try {
                iArr[InstrumentRecurringTradabilityStore.AssetType.CRYPTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TraderRecurringTradabilityStore(RecurringApi recurringApi, AccountProvider accountProvider, StoreBundle storeBundle, InstrumentRecurringTradabilityDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(recurringApi, "recurringApi");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.recurringApi = recurringApi;
        this.accountProvider = accountProvider;
        this.dao = dao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        Endpoint<UUID, InstrumentRecurringTradability> endpointCreate$default = Endpoint.Companion.create$default(companion, new TraderRecurringTradabilityStore4(this, null), getLogoutKillswitch(), new TraderRecurringTradabilityStore5(this, null), storeBundle.getClock(), null, 16, null);
        this.oldEndpoint = endpointCreate$default;
        Endpoint<Tuples2<ApiAssetType, UUID>, InstrumentRecurringTradability> endpointCreate$default2 = Endpoint.Companion.create$default(companion, new TraderRecurringTradabilityStore2(this, null), getLogoutKillswitch(), new TraderRecurringTradabilityStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.newEndpoint = endpointCreate$default2;
        Query.Companion companion2 = Query.INSTANCE;
        this.streamRecurringInstrumentTradable = Store.create$default(this, companion2, "instrumentRecurringTradability", CollectionsKt.listOf(new RefreshEach(new C346061(endpointCreate$default))), new C346072(dao), false, 8, null);
        this.streamRecurringInstrumentTradableByAssetType = Store.create$default(this, companion2, "streamRecurringInstrumentTradable", CollectionsKt.listOf(new RefreshEach(new C346081(endpointCreate$default2))), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.TraderRecurringTradabilityStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderRecurringTradabilityStore.streamRecurringInstrumentTradableByAssetType$lambda$1(this.f$0, (Tuples2) obj);
            }
        }, false, 8, null);
    }

    /* compiled from: TraderRecurringTradabilityStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.TraderRecurringTradabilityStore$fetchRecurringInstrumentTradable$1", m3645f = "TraderRecurringTradabilityStore.kt", m3646l = {79}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.TraderRecurringTradabilityStore$fetchRecurringInstrumentTradable$1 */
    static final class C346051 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super InstrumentRecurringTradability>, Object> {
        final /* synthetic */ UUID $instrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346051(UUID uuid, Continuation<? super C346051> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TraderRecurringTradabilityStore.this.new C346051(this.$instrumentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InstrumentRecurringTradability> continuation) {
            return ((C346051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = TraderRecurringTradabilityStore.this.oldEndpoint;
            UUID uuid = this.$instrumentId;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, uuid, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<InstrumentRecurringTradability> fetchRecurringInstrumentTradable(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C346051(instrumentId, null), 1, null);
    }

    /* compiled from: TraderRecurringTradabilityStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.TraderRecurringTradabilityStore$fetchCryptoRecurringTradable$1", m3645f = "TraderRecurringTradabilityStore.kt", m3646l = {82}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.TraderRecurringTradabilityStore$fetchCryptoRecurringTradable$1 */
    static final class C346041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super InstrumentRecurringTradability>, Object> {
        final /* synthetic */ UUID $currencyPairId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346041(UUID uuid, Continuation<? super C346041> continuation) {
            super(2, continuation);
            this.$currencyPairId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TraderRecurringTradabilityStore.this.new C346041(this.$currencyPairId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InstrumentRecurringTradability> continuation) {
            return ((C346041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = TraderRecurringTradabilityStore.this.newEndpoint;
            Tuples2 tuples2M3642to = Tuples4.m3642to(ApiAssetType.CRYPTO, this.$currencyPairId);
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, tuples2M3642to, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<InstrumentRecurringTradability> fetchCryptoRecurringTradable(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C346041(currencyPairId, null), 1, null);
    }

    /* compiled from: TraderRecurringTradabilityStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.TraderRecurringTradabilityStore$streamRecurringInstrumentTradable$1 */
    /* synthetic */ class C346061 extends AdaptedFunctionReference implements Function1<UUID, Job> {
        C346061(Object obj) {
            super(1, obj, Endpoint.class, "refresh", "refresh(Ljava/lang/Object;ZLkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/Job;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Job invoke(UUID p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return Endpoint.DefaultImpls.refresh$default((Endpoint) this.receiver, p0, false, null, 6, null);
        }
    }

    /* compiled from: TraderRecurringTradabilityStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.TraderRecurringTradabilityStore$streamRecurringInstrumentTradable$2 */
    /* synthetic */ class C346072 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends InstrumentRecurringTradability>> {
        C346072(Object obj) {
            super(1, obj, InstrumentRecurringTradabilityDao.class, "getInstrumentRecurringTradability", "getInstrumentRecurringTradability(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Flow<InstrumentRecurringTradability> invoke(UUID p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InstrumentRecurringTradabilityDao) this.receiver).getInstrumentRecurringTradability(p0);
        }
    }

    /* compiled from: TraderRecurringTradabilityStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.TraderRecurringTradabilityStore$streamRecurringInstrumentTradableByAssetType$1 */
    /* synthetic */ class C346081 extends AdaptedFunctionReference implements Function1<Tuples2<? extends ApiAssetType, ? extends UUID>, Job> {
        C346081(Object obj) {
            super(1, obj, Endpoint.class, "refresh", "refresh(Ljava/lang/Object;ZLkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/Job;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Job invoke(Tuples2<? extends ApiAssetType, ? extends UUID> tuples2) {
            return invoke2((Tuples2<? extends ApiAssetType, UUID>) tuples2);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Job invoke2(Tuples2<? extends ApiAssetType, UUID> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return Endpoint.DefaultImpls.refresh$default((Endpoint) this.receiver, p0, false, null, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamRecurringInstrumentTradableByAssetType$lambda$1(TraderRecurringTradabilityStore traderRecurringTradabilityStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return traderRecurringTradabilityStore.dao.getInstrumentRecurringTradability((UUID) tuples2.component2());
    }

    @Override // com.robinhood.store.base.InstrumentRecurringTradabilityStore
    public Flow<InstrumentRecurringTradability> streamRecurringInstrumentTradable(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return this.streamRecurringInstrumentTradable.asFlow(instrumentId);
    }

    @Override // com.robinhood.store.base.InstrumentRecurringTradabilityStore
    public Flow<InstrumentRecurringTradability> streamRecurringInstrumentTradableByAssetType(InstrumentRecurringTradabilityStore.AssetType assetType, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Query<Tuples2<? extends ApiAssetType, UUID>, InstrumentRecurringTradability> query = this.streamRecurringInstrumentTradableByAssetType;
        if (WhenMappings.$EnumSwitchMapping$0[assetType.ordinal()] == 1) {
            return query.asFlow(Tuples4.m3642to(ApiAssetType.CRYPTO, instrumentId));
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ void refresh$default(TraderRecurringTradabilityStore traderRecurringTradabilityStore, UUID uuid, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        traderRecurringTradabilityStore.refresh(uuid, z);
    }

    public final void refresh(UUID instrumentId, boolean force) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Endpoint.DefaultImpls.refresh$default(this.oldEndpoint, instrumentId, force, null, 4, null);
    }
}
