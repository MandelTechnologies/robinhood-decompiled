package com.robinhood.store.futures;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.polling.IdlBackendPolling;
import com.robinhood.android.models.futures.api.account.FuturesAccountType;
import com.robinhood.android.models.futures.dao.FuturesCostBasisDao;
import com.robinhood.android.models.futures.p189db.FuturesCostBasis;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.PnLCostBasisDto;
import com.robinhood.idl.Response;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.futures.RhdCostBasisStore;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;

/* compiled from: RhdCostBasisStore.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 -2\u00020\u0001:\u0004./0-B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00180\u001b0\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R&\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00180'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R,\u0010,\u001a\u001a\u0012\u0004\u0012\u00020+\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00180\u001b0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*¨\u00061"}, m3636d2 = {"Lcom/robinhood/store/futures/RhdCostBasisStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresAccountStore", "Lcom/robinhood/android/models/futures/dao/FuturesCostBasisDao;", "costBasisDao", "Lcom/robinhood/ceres/v1/Ceres;", "ceres", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/android/models/futures/dao/FuturesCostBasisDao;Lcom/robinhood/ceres/v1/Ceres;Lcom/robinhood/store/StoreBundle;)V", "Ljava/util/UUID;", "contractId", "Lcom/robinhood/android/models/futures/api/account/FuturesAccountType;", "accountType", "", "force", "", "refreshCostBasis", "(Ljava/util/UUID;Lcom/robinhood/android/models/futures/api/account/FuturesAccountType;Z)V", "j$/time/Duration", "duration", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/models/futures/db/FuturesCostBasis;", "streamCostBasis", "(Ljava/util/UUID;Lcom/robinhood/android/models/futures/api/account/FuturesAccountType;Lj$/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "", "streamCostBases", "(Lcom/robinhood/android/models/futures/api/account/FuturesAccountType;Lj$/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/store/futures/FuturesAccountStore;", "Lcom/robinhood/android/models/futures/dao/FuturesCostBasisDao;", "Lcom/robinhood/ceres/v1/Ceres;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/store/futures/RhdCostBasisStore$ApiCostBasisParam;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/ceres/v1/PnLCostBasisDto;", "rhdCostBasisEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/store/futures/RhdCostBasisStore$PnLParameters;", "streamRhdCostBasis", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/store/futures/RhdCostBasisStore$AccountPnlParameters;", "streamRhdCostBases", "Companion", "PnLParameters", "AccountPnlParameters", "ApiCostBasisParam", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class RhdCostBasisStore extends Store {
    private static final Duration DefaultGetCostBasisDuration;
    private final Ceres ceres;
    private final FuturesCostBasisDao costBasisDao;
    private final FuturesAccountStore futuresAccountStore;
    private final Endpoint<ApiCostBasisParam, Response<PnLCostBasisDto>> rhdCostBasisEndpoint;
    private final Query<AccountPnlParameters, Map<UUID, FuturesCostBasis>> streamRhdCostBases;
    private final Query<PnLParameters, FuturesCostBasis> streamRhdCostBasis;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhdCostBasisStore(FuturesAccountStore futuresAccountStore, FuturesCostBasisDao costBasisDao, Ceres ceres, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(costBasisDao, "costBasisDao");
        Intrinsics.checkNotNullParameter(ceres, "ceres");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.futuresAccountStore = futuresAccountStore;
        this.costBasisDao = costBasisDao;
        this.ceres = ceres;
        this.rhdCostBasisEndpoint = Endpoint.Companion.createWithParams$default(Endpoint.INSTANCE, new RhdCostBasisStore2(this, null), storeBundle.getLogoutKillswitch(), new RhdCostBasisStore3(this, null), storeBundle.getClock(), null, 16, null);
        Query.Companion companion = Query.INSTANCE;
        this.streamRhdCostBasis = Store.create$default(this, companion, "streamRhdCostBasis", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.futures.RhdCostBasisStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhdCostBasisStore.streamRhdCostBasis$lambda$0(this.f$0, (RhdCostBasisStore.PnLParameters) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.futures.RhdCostBasisStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhdCostBasisStore.streamRhdCostBasis$lambda$1(this.f$0, (RhdCostBasisStore.PnLParameters) obj);
            }
        }, false, 8, null);
        this.streamRhdCostBases = Store.create$default(this, companion, "streamRhdCostBases", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.futures.RhdCostBasisStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhdCostBasisStore.streamRhdCostBases$lambda$2(this.f$0, (RhdCostBasisStore.AccountPnlParameters) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.futures.RhdCostBasisStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhdCostBasisStore.streamRhdCostBases$lambda$5(this.f$0, (RhdCostBasisStore.AccountPnlParameters) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamRhdCostBasis$lambda$0(RhdCostBasisStore rhdCostBasisStore, PnLParameters param) {
        Intrinsics.checkNotNullParameter(param, "param");
        return IdlBackendPolling.backendPoll$default(rhdCostBasisStore.rhdCostBasisEndpoint, new ApiCostBasisParam(param.getRhdAccountId(), param.getContractId()), param.getPollingDuration(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamRhdCostBasis$lambda$1(RhdCostBasisStore rhdCostBasisStore, PnLParameters params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return rhdCostBasisStore.costBasisDao.streamCostBasis(params.getRhdAccountId(), params.getContractId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamRhdCostBases$lambda$2(RhdCostBasisStore rhdCostBasisStore, AccountPnlParameters params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return IdlBackendPolling.backendPoll$default(rhdCostBasisStore.rhdCostBasisEndpoint, new ApiCostBasisParam(params.getRhdAccountId(), null), params.getPollingDuration(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamRhdCostBases$lambda$5(RhdCostBasisStore rhdCostBasisStore, AccountPnlParameters params) {
        Intrinsics.checkNotNullParameter(params, "params");
        final Flow<List<FuturesCostBasis>> flowStreamAllCostBases = rhdCostBasisStore.costBasisDao.streamAllCostBases(params.getRhdAccountId());
        return new Flow<Map<UUID, ? extends FuturesCostBasis>>() { // from class: com.robinhood.store.futures.RhdCostBasisStore$streamRhdCostBases$lambda$5$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.futures.RhdCostBasisStore$streamRhdCostBases$lambda$5$$inlined$map$1$2 */
            public static final class C414802<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.futures.RhdCostBasisStore$streamRhdCostBases$lambda$5$$inlined$map$1$2", m3645f = "RhdCostBasisStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.futures.RhdCostBasisStore$streamRhdCostBases$lambda$5$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C414802.this.emit(null, this);
                    }
                }

                public C414802(FlowCollector flowCollector) {
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
                        List list = (List) obj;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                        for (T t : list) {
                            linkedHashMap.put(((FuturesCostBasis) t).getContractId(), t);
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(linkedHashMap, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super Map<UUID, ? extends FuturesCostBasis>> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamAllCostBases.collect(new C414802(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public static /* synthetic */ void refreshCostBasis$default(RhdCostBasisStore rhdCostBasisStore, UUID uuid, FuturesAccountType futuresAccountType, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        rhdCostBasisStore.refreshCostBasis(uuid, futuresAccountType, z);
    }

    /* compiled from: RhdCostBasisStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.RhdCostBasisStore$refreshCostBasis$1", m3645f = "RhdCostBasisStore.kt", m3646l = {96}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.futures.RhdCostBasisStore$refreshCostBasis$1 */
    static final class C414811 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FuturesAccountType $accountType;
        final /* synthetic */ UUID $contractId;
        final /* synthetic */ boolean $force;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C414811(FuturesAccountType futuresAccountType, UUID uuid, boolean z, Continuation<? super C414811> continuation) {
            super(2, continuation);
            this.$accountType = futuresAccountType;
            this.$contractId = uuid;
            this.$force = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhdCostBasisStore.this.new C414811(this.$accountType, this.$contractId, this.$force, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C414811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FuturesAccountStore futuresAccountStore = RhdCostBasisStore.this.futuresAccountStore;
                FuturesAccountType futuresAccountType = this.$accountType;
                this.label = 1;
                obj = futuresAccountStore.getRhdAccountId(futuresAccountType, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            UUID uuid = (UUID) obj;
            if (uuid == null) {
                return Unit.INSTANCE;
            }
            Endpoint.DefaultImpls.refresh$default(RhdCostBasisStore.this.rhdCostBasisEndpoint, new ApiCostBasisParam(uuid, this.$contractId), this.$force, null, 4, null);
            return Unit.INSTANCE;
        }
    }

    public final void refreshCostBasis(UUID contractId, FuturesAccountType accountType, boolean force) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C414811(accountType, contractId, force, null), 3, null);
    }

    public static /* synthetic */ Flow streamCostBasis$default(RhdCostBasisStore rhdCostBasisStore, UUID uuid, FuturesAccountType futuresAccountType, Duration duration, int i, Object obj) {
        if ((i & 4) != 0) {
            duration = DefaultGetCostBasisDuration;
        }
        return rhdCostBasisStore.streamCostBasis(uuid, futuresAccountType, duration);
    }

    /* compiled from: RhdCostBasisStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.RhdCostBasisStore$streamCostBasis$1", m3645f = "RhdCostBasisStore.kt", m3646l = {110, 112}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.futures.RhdCostBasisStore$streamCostBasis$1 */
    static final class C414831 extends ContinuationImpl7 implements Function2<FlowCollector<? super UUID>, Continuation<? super Unit>, Object> {
        final /* synthetic */ FuturesAccountType $accountType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C414831(FuturesAccountType futuresAccountType, Continuation<? super C414831> continuation) {
            super(2, continuation);
            this.$accountType = futuresAccountType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C414831 c414831 = RhdCostBasisStore.this.new C414831(this.$accountType, continuation);
            c414831.L$0 = obj;
            return c414831;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super UUID> flowCollector, Continuation<? super Unit> continuation) {
            return ((C414831) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                FuturesAccountStore futuresAccountStore = RhdCostBasisStore.this.futuresAccountStore;
                FuturesAccountType futuresAccountType = this.$accountType;
                this.L$0 = flowCollector;
                this.label = 1;
                obj = futuresAccountStore.getRhdAccountId(futuresAccountType, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            UUID uuid = (UUID) obj;
            if (uuid != null) {
                this.L$0 = null;
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    public final Flow<FuturesCostBasis> streamCostBasis(UUID contractId, FuturesAccountType accountType, Duration duration) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(duration, "duration");
        return FlowKt.transformLatest(FlowKt.flow(new C414831(accountType, null)), new RhdCostBasisStore$streamCostBasis$$inlined$flatMapLatest$1(null, this, duration, contractId));
    }

    public static /* synthetic */ Flow streamCostBases$default(RhdCostBasisStore rhdCostBasisStore, FuturesAccountType futuresAccountType, Duration duration, int i, Object obj) {
        if ((i & 2) != 0) {
            duration = DefaultGetCostBasisDuration;
        }
        return rhdCostBasisStore.streamCostBases(futuresAccountType, duration);
    }

    /* compiled from: RhdCostBasisStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.RhdCostBasisStore$streamCostBases$1", m3645f = "RhdCostBasisStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.futures.RhdCostBasisStore$streamCostBases$1 */
    static final class C414821 extends ContinuationImpl7 implements Function2<FlowCollector<? super UUID>, Continuation<? super Unit>, Object> {
        final /* synthetic */ FuturesAccountType $accountType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C414821(FuturesAccountType futuresAccountType, Continuation<? super C414821> continuation) {
            super(2, continuation);
            this.$accountType = futuresAccountType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C414821 c414821 = RhdCostBasisStore.this.new C414821(this.$accountType, continuation);
            c414821.L$0 = obj;
            return c414821;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super UUID> flowCollector, Continuation<? super Unit> continuation) {
            return ((C414821) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                FuturesAccountStore futuresAccountStore = RhdCostBasisStore.this.futuresAccountStore;
                FuturesAccountType futuresAccountType = this.$accountType;
                this.L$0 = flowCollector;
                this.label = 1;
                obj = futuresAccountStore.getRhdAccountId(futuresAccountType, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            UUID uuid = (UUID) obj;
            if (uuid != null) {
                this.L$0 = null;
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    public final Flow<Map<UUID, FuturesCostBasis>> streamCostBases(FuturesAccountType accountType, Duration duration) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(duration, "duration");
        return FlowKt.transformLatest(FlowKt.flow(new C414821(accountType, null)), new RhdCostBasisStore$streamCostBases$$inlined$flatMapLatest$1(null, this, duration));
    }

    /* compiled from: RhdCostBasisStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/store/futures/RhdCostBasisStore$PnLParameters;", "", "Ljava/util/UUID;", "rhdAccountId", "j$/time/Duration", "pollingDuration", "contractId", "<init>", "(Ljava/util/UUID;Lj$/time/Duration;Ljava/util/UUID;)V", "Ljava/util/UUID;", "getRhdAccountId", "()Ljava/util/UUID;", "Lj$/time/Duration;", "getPollingDuration", "()Lj$/time/Duration;", "getContractId", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PnLParameters {
        private final UUID contractId;
        private final Duration pollingDuration;
        private final UUID rhdAccountId;

        public PnLParameters(UUID rhdAccountId, Duration pollingDuration, UUID contractId) {
            Intrinsics.checkNotNullParameter(rhdAccountId, "rhdAccountId");
            Intrinsics.checkNotNullParameter(pollingDuration, "pollingDuration");
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            this.rhdAccountId = rhdAccountId;
            this.pollingDuration = pollingDuration;
            this.contractId = contractId;
        }

        public final UUID getRhdAccountId() {
            return this.rhdAccountId;
        }

        public final Duration getPollingDuration() {
            return this.pollingDuration;
        }

        public final UUID getContractId() {
            return this.contractId;
        }
    }

    /* compiled from: RhdCostBasisStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/store/futures/RhdCostBasisStore$AccountPnlParameters;", "", "Ljava/util/UUID;", "rhdAccountId", "j$/time/Duration", "pollingDuration", "<init>", "(Ljava/util/UUID;Lj$/time/Duration;)V", "Ljava/util/UUID;", "getRhdAccountId", "()Ljava/util/UUID;", "Lj$/time/Duration;", "getPollingDuration", "()Lj$/time/Duration;", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AccountPnlParameters {
        private final Duration pollingDuration;
        private final UUID rhdAccountId;

        public AccountPnlParameters(UUID rhdAccountId, Duration pollingDuration) {
            Intrinsics.checkNotNullParameter(rhdAccountId, "rhdAccountId");
            Intrinsics.checkNotNullParameter(pollingDuration, "pollingDuration");
            this.rhdAccountId = rhdAccountId;
            this.pollingDuration = pollingDuration;
        }

        public final UUID getRhdAccountId() {
            return this.rhdAccountId;
        }

        public final Duration getPollingDuration() {
            return this.pollingDuration;
        }
    }

    /* compiled from: RhdCostBasisStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/store/futures/RhdCostBasisStore$ApiCostBasisParam;", "", "rhdAccountId", "Ljava/util/UUID;", "contractId", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;)V", "getRhdAccountId", "()Ljava/util/UUID;", "getContractId", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ApiCostBasisParam {
        private final UUID contractId;
        private final UUID rhdAccountId;

        public ApiCostBasisParam(UUID rhdAccountId, UUID uuid) {
            Intrinsics.checkNotNullParameter(rhdAccountId, "rhdAccountId");
            this.rhdAccountId = rhdAccountId;
            this.contractId = uuid;
        }

        public final UUID getRhdAccountId() {
            return this.rhdAccountId;
        }

        public final UUID getContractId() {
            return this.contractId;
        }
    }

    static {
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        DefaultGetCostBasisDuration = durationOfSeconds;
    }
}
