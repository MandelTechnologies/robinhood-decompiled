package com.robinhood.librobinhood.data.store.rhy;

import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.models.api.bonfire.rhy.ApiRhyTransferIraInfo;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.datetime.Durations;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;

/* compiled from: RhyTransferIraInfoStore.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001a0\u001e2\u0006\u0010\u001f\u001a\u00020\nJ\u001a\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001a0\u001e2\u0006\u0010\u001f\u001a\u00020\nJ\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001a0\"2\u0006\u0010\u001f\u001a\u00020\nR\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\f\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b \u000f*\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u0011\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b \u000f*\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u0013\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b \u000f*\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/rhy/RhyTransferIraInfoStore;", "Lcom/robinhood/store/Store;", "bonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/store/StoreBundle;)V", "contributionInfoCache", "", "Ljava/util/UUID;", "Lcom/robinhood/models/api/bonfire/rhy/ApiRhyTransferIraInfo;", "contributionInfoRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "distributionInfoCache", "distributionInfoRelay", "rothConversionInfoCache", "rothConversionInfoRelay", "contributionInfoEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "distributionInfoEndpoint", "rothConversionInfoEndpoint", "contributionInfoQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/utils/Optional;", "distributionInfoQuery", "rothConversionQuery", "streamContributionInfo", "Lio/reactivex/Observable;", "transferId", "streamDistributionInfo", "streamRothConversionInfo", "Lkotlinx/coroutines/flow/Flow;", "Companion", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class RhyTransferIraInfoStore extends Store {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<UUID, ApiRhyTransferIraInfo> contributionInfoCache;
    private final Endpoint<UUID, ApiRhyTransferIraInfo> contributionInfoEndpoint;
    private final Query<UUID, Optional<ApiRhyTransferIraInfo>> contributionInfoQuery;
    private final PublishRelay<Tuples2<UUID, ApiRhyTransferIraInfo>> contributionInfoRelay;
    private final Map<UUID, ApiRhyTransferIraInfo> distributionInfoCache;
    private final Endpoint<UUID, ApiRhyTransferIraInfo> distributionInfoEndpoint;
    private final Query<UUID, Optional<ApiRhyTransferIraInfo>> distributionInfoQuery;
    private final PublishRelay<Tuples2<UUID, ApiRhyTransferIraInfo>> distributionInfoRelay;
    private final Map<UUID, ApiRhyTransferIraInfo> rothConversionInfoCache;
    private final Endpoint<UUID, ApiRhyTransferIraInfo> rothConversionInfoEndpoint;
    private final PublishRelay<Tuples2<UUID, ApiRhyTransferIraInfo>> rothConversionInfoRelay;
    private final Query<UUID, Optional<ApiRhyTransferIraInfo>> rothConversionQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyTransferIraInfoStore(TransfersBonfireApi bonfireApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.contributionInfoCache = new LinkedHashMap();
        PublishRelay<Tuples2<UUID, ApiRhyTransferIraInfo>> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.contributionInfoRelay = publishRelayCreate;
        this.distributionInfoCache = new LinkedHashMap();
        PublishRelay<Tuples2<UUID, ApiRhyTransferIraInfo>> publishRelayCreate2 = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate2, "create(...)");
        this.distributionInfoRelay = publishRelayCreate2;
        this.rothConversionInfoCache = new LinkedHashMap();
        PublishRelay<Tuples2<UUID, ApiRhyTransferIraInfo>> publishRelayCreate3 = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate3, "create(...)");
        this.rothConversionInfoRelay = publishRelayCreate3;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        RhyTransferIraInfoStore4 rhyTransferIraInfoStore4 = new RhyTransferIraInfoStore4(bonfireApi, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        RhyTransferIraInfoStore5 rhyTransferIraInfoStore5 = new RhyTransferIraInfoStore5(this, null);
        Clock clock = storeBundle.getClock();
        Durations durations = Durations.INSTANCE;
        this.contributionInfoEndpoint = companion.createWithParams(rhyTransferIraInfoStore4, logoutKillswitch, rhyTransferIraInfoStore5, clock, new DefaultStaleDecider(durations.getONE_DAY(), storeBundle.getClock()));
        this.distributionInfoEndpoint = companion.createWithParams(new RhyTransferIraInfoStore6(bonfireApi, null), getLogoutKillswitch(), new RhyTransferIraInfoStore7(this, null), storeBundle.getClock(), new DefaultStaleDecider(durations.getONE_DAY(), storeBundle.getClock()));
        this.rothConversionInfoEndpoint = companion.createWithParams(new RhyTransferIraInfoStore8(bonfireApi, null), getLogoutKillswitch(), new RhyTransferIraInfoStore9(this, null), storeBundle.getClock(), new DefaultStaleDecider(durations.getONE_DAY(), storeBundle.getClock()));
        Query.Companion companion2 = Query.INSTANCE;
        this.contributionInfoQuery = Store.createOptional$default(this, companion2, "queryContributionInfo", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyTransferIraInfoStore.contributionInfoQuery$lambda$0(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyTransferIraInfoStore.contributionInfoQuery$lambda$2(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.distributionInfoQuery = Store.createOptional$default(this, companion2, "queryDistributionInfo", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyTransferIraInfoStore.distributionInfoQuery$lambda$3(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyTransferIraInfoStore.distributionInfoQuery$lambda$5(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.rothConversionQuery = Store.createOptional$default(this, companion2, "queryRothConversionInfo", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyTransferIraInfoStore.rothConversionQuery$lambda$6(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyTransferIraInfoStore.rothConversionQuery$lambda$8(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job contributionInfoQuery$lambda$0(RhyTransferIraInfoStore rhyTransferIraInfoStore, UUID transferId) {
        Intrinsics.checkNotNullParameter(transferId, "transferId");
        return Endpoint.DefaultImpls.refresh$default(rhyTransferIraInfoStore.contributionInfoEndpoint, transferId, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow contributionInfoQuery$lambda$2(RhyTransferIraInfoStore rhyTransferIraInfoStore, UUID transferId) {
        Intrinsics.checkNotNullParameter(transferId, "transferId");
        Companion companion = INSTANCE;
        Observable<Tuples2<UUID, ApiRhyTransferIraInfo>> observableHide = rhyTransferIraInfoStore.contributionInfoRelay.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        Observable observableMapToCacheEntry = companion.mapToCacheEntry(observableHide, transferId, rhyTransferIraInfoStore.contributionInfoCache.get(transferId));
        Intrinsics.checkNotNullExpressionValue(observableMapToCacheEntry, "access$mapToCacheEntry(...)");
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observableMapToCacheEntry), Integer.MAX_VALUE, null, 2, null);
        return new Flow<ApiRhyTransferIraInfo>() { // from class: com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore$contributionInfoQuery$lambda$2$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore$contributionInfoQuery$lambda$2$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore$contributionInfoQuery$lambda$2$$inlined$map$1$2", m3645f = "RhyTransferIraInfoStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore$contributionInfoQuery$lambda$2$$inlined$map$1$2$1, reason: invalid class name */
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Multi-variable type inference failed */
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
                        Object orNull = ((Optional) obj).getOrNull();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(orNull, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super ApiRhyTransferIraInfo> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job distributionInfoQuery$lambda$3(RhyTransferIraInfoStore rhyTransferIraInfoStore, UUID transferId) {
        Intrinsics.checkNotNullParameter(transferId, "transferId");
        return Endpoint.DefaultImpls.refresh$default(rhyTransferIraInfoStore.distributionInfoEndpoint, transferId, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow distributionInfoQuery$lambda$5(RhyTransferIraInfoStore rhyTransferIraInfoStore, UUID transferId) {
        Intrinsics.checkNotNullParameter(transferId, "transferId");
        Companion companion = INSTANCE;
        Observable<Tuples2<UUID, ApiRhyTransferIraInfo>> observableHide = rhyTransferIraInfoStore.distributionInfoRelay.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        Observable observableMapToCacheEntry = companion.mapToCacheEntry(observableHide, transferId, rhyTransferIraInfoStore.distributionInfoCache.get(transferId));
        Intrinsics.checkNotNullExpressionValue(observableMapToCacheEntry, "access$mapToCacheEntry(...)");
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observableMapToCacheEntry), Integer.MAX_VALUE, null, 2, null);
        return new Flow<ApiRhyTransferIraInfo>() { // from class: com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore$distributionInfoQuery$lambda$5$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore$distributionInfoQuery$lambda$5$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore$distributionInfoQuery$lambda$5$$inlined$map$1$2", m3645f = "RhyTransferIraInfoStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore$distributionInfoQuery$lambda$5$$inlined$map$1$2$1, reason: invalid class name */
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Multi-variable type inference failed */
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
                        Object orNull = ((Optional) obj).getOrNull();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(orNull, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super ApiRhyTransferIraInfo> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job rothConversionQuery$lambda$6(RhyTransferIraInfoStore rhyTransferIraInfoStore, UUID transferId) {
        Intrinsics.checkNotNullParameter(transferId, "transferId");
        return Endpoint.DefaultImpls.refresh$default(rhyTransferIraInfoStore.rothConversionInfoEndpoint, transferId, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow rothConversionQuery$lambda$8(RhyTransferIraInfoStore rhyTransferIraInfoStore, UUID transferId) {
        Intrinsics.checkNotNullParameter(transferId, "transferId");
        Observable observableMapToCacheEntry = INSTANCE.mapToCacheEntry(rhyTransferIraInfoStore.rothConversionInfoRelay, transferId, rhyTransferIraInfoStore.rothConversionInfoCache.get(transferId));
        Intrinsics.checkNotNullExpressionValue(observableMapToCacheEntry, "access$mapToCacheEntry(...)");
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observableMapToCacheEntry), Integer.MAX_VALUE, null, 2, null);
        return new Flow<ApiRhyTransferIraInfo>() { // from class: com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore$rothConversionQuery$lambda$8$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore$rothConversionQuery$lambda$8$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore$rothConversionQuery$lambda$8$$inlined$map$1$2", m3645f = "RhyTransferIraInfoStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore$rothConversionQuery$lambda$8$$inlined$map$1$2$1, reason: invalid class name */
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Multi-variable type inference failed */
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
                        Object orNull = ((Optional) obj).getOrNull();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(orNull, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super ApiRhyTransferIraInfo> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Observable<Optional<ApiRhyTransferIraInfo>> streamContributionInfo(UUID transferId) {
        Intrinsics.checkNotNullParameter(transferId, "transferId");
        return this.contributionInfoQuery.asObservable(transferId);
    }

    public final Observable<Optional<ApiRhyTransferIraInfo>> streamDistributionInfo(UUID transferId) {
        Intrinsics.checkNotNullParameter(transferId, "transferId");
        return this.distributionInfoQuery.asObservable(transferId);
    }

    public final Flow<Optional<ApiRhyTransferIraInfo>> streamRothConversionInfo(UUID transferId) {
        Intrinsics.checkNotNullParameter(transferId, "transferId");
        return this.rothConversionQuery.asFlow(transferId);
    }

    /* compiled from: RhyTransferIraInfoStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jl\u0010\u0004\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \b*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t0\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0002¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/rhy/RhyTransferIraInfoStore$Companion;", "", "<init>", "()V", "mapToCacheEntry", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/bonfire/rhy/ApiRhyTransferIraInfo;", "kotlin.jvm.PlatformType", "Lkotlin/Pair;", "Ljava/util/UUID;", "transferId", "cacheEntry", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Observable<Optional<ApiRhyTransferIraInfo>> mapToCacheEntry(Observable<Tuples2<UUID, ApiRhyTransferIraInfo>> observable, final UUID uuid, ApiRhyTransferIraInfo apiRhyTransferIraInfo) {
            return observable.filter(new Predicate() { // from class: com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore$Companion$mapToCacheEntry$1
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Tuples2<UUID, ApiRhyTransferIraInfo> tuples2) {
                    Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                    return Intrinsics.areEqual(uuid, tuples2.component1());
                }
            }).map(new Function() { // from class: com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore$Companion$mapToCacheEntry$2
                @Override // io.reactivex.functions.Function
                public final Optional<ApiRhyTransferIraInfo> apply(Tuples2<UUID, ApiRhyTransferIraInfo> tuples2) {
                    Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                    return Optional3.asOptional(tuples2.component2());
                }
            }).startWith((Observable<R>) Optional3.asOptional(apiRhyTransferIraInfo));
        }
    }
}
