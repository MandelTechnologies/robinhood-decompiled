package com.robinhood.android.cortex.store.asset;

import bonfire.proto.idl.copilot.p032v1.CopilotService;
import com.robinhood.android.cortex.models.asset.AssetDigest;
import com.robinhood.android.cortex.models.asset.AssetType3;
import com.robinhood.android.cortex.store.asset.AssetDigestStore;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.regiongate.AssetDigestsCryptoRegionGate;
import com.robinhood.android.regiongate.AssetDigestsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.Throwables;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import p479j$.time.Duration;

/* compiled from: AssetDigestStore.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000  2\u00020\u0001:\u0003\u001e\u001f B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ&\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/cortex/store/asset/AssetDigestStore;", "Lcom/robinhood/store/Store;", "copilotService", "Lbonfire/proto/idl/copilot/v1/CopilotService;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lbonfire/proto/idl/copilot/v1/CopilotService;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/store/StoreBundle;)V", "digestCacheFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/robinhood/android/cortex/store/asset/AssetDigestStore$AssetDigestKey;", "Lcom/robinhood/android/cortex/models/asset/AssetDigest;", "digestEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/cortex/store/asset/AssetDigestStore$AssetDigestResult;", "digestQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/utils/Optional;", "getDigest", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "", "instrumentId", "Ljava/util/UUID;", "instrumentType", "Lcom/robinhood/android/cortex/models/asset/CopilotInstrumentType;", "pollDigest", "AssetDigestKey", "AssetDigestResult", "Companion", "lib-store-cortex_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AssetDigestStore extends Store {
    private final CopilotService copilotService;
    private final StateFlow2<Map<AssetDigestKey, AssetDigest>> digestCacheFlow;
    private final Endpoint<AssetDigestKey, AssetDigestResult> digestEndpoint;
    private final Query<AssetDigestKey, Optional<AssetDigest>> digestQuery;
    private final RegionGateProvider regionGateProvider;
    public static final int $stable = 8;
    private static final Duration POLL_INTERVAL_DURATION = Duration.ofSeconds(30);

    /* compiled from: AssetDigestStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssetType3.values().length];
            try {
                iArr[AssetType3.STOCKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetType3.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetDigestStore(CopilotService copilotService, RegionGateProvider regionGateProvider, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(copilotService, "copilotService");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.copilotService = copilotService;
        this.regionGateProvider = regionGateProvider;
        this.digestCacheFlow = StateFlow4.MutableStateFlow(MapsKt.emptyMap());
        this.digestEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new AssetDigestStore2(this, null), getLogoutKillswitch(), new AssetDigestStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.digestQuery = Store.createOptional$default(this, Query.INSTANCE, "getDigestForInstrument", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.cortex.store.asset.AssetDigestStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetDigestStore.digestQuery$lambda$0(this.f$0, (AssetDigestStore.AssetDigestKey) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.cortex.store.asset.AssetDigestStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetDigestStore.digestQuery$lambda$2(this.f$0, (AssetDigestStore.AssetDigestKey) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow digestQuery$lambda$0(AssetDigestStore assetDigestStore, AssetDigestKey it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Endpoint<AssetDigestKey, AssetDigestResult> endpoint = assetDigestStore.digestEndpoint;
        Duration POLL_INTERVAL_DURATION2 = POLL_INTERVAL_DURATION;
        Intrinsics.checkNotNullExpressionValue(POLL_INTERVAL_DURATION2, "POLL_INTERVAL_DURATION");
        return Endpoint.DefaultImpls.poll$default(endpoint, it, POLL_INTERVAL_DURATION2, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow digestQuery$lambda$2(AssetDigestStore assetDigestStore, final AssetDigestKey params) {
        Intrinsics.checkNotNullParameter(params, "params");
        final StateFlow2<Map<AssetDigestKey, AssetDigest>> stateFlow2 = assetDigestStore.digestCacheFlow;
        return FlowKt.distinctUntilChanged(new Flow<AssetDigest>() { // from class: com.robinhood.android.cortex.store.asset.AssetDigestStore$digestQuery$lambda$2$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.cortex.store.asset.AssetDigestStore$digestQuery$lambda$2$$inlined$map$1$2 */
            public static final class C121852<T> implements FlowCollector {
                final /* synthetic */ AssetDigestStore.AssetDigestKey $params$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.cortex.store.asset.AssetDigestStore$digestQuery$lambda$2$$inlined$map$1$2", m3645f = "AssetDigestStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.cortex.store.asset.AssetDigestStore$digestQuery$lambda$2$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C121852.this.emit(null, this);
                    }
                }

                public C121852(FlowCollector flowCollector, AssetDigestStore.AssetDigestKey assetDigestKey) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$params$inlined = assetDigestKey;
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
                        Object obj3 = ((Map) obj).get(this.$params$inlined);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super AssetDigest> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new C121852(flowCollector, params), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    /* compiled from: AssetDigestStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/cortex/models/asset/AssetDigest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.store.asset.AssetDigestStore$getDigest$1", m3645f = "AssetDigestStore.kt", m3646l = {103, 103}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cortex.store.asset.AssetDigestStore$getDigest$1 */
    static final class C121891 extends ContinuationImpl7 implements Function2<FlowCollector<? super AssetDigest>, Continuation<? super Unit>, Object> {
        final /* synthetic */ AssetDigestKey $params;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C121891(AssetDigestKey assetDigestKey, Continuation<? super C121891> continuation) {
            super(2, continuation);
            this.$params = assetDigestKey;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C121891 c121891 = AssetDigestStore.this.new C121891(this.$params, continuation);
            c121891.L$0 = obj;
            return c121891;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super AssetDigest> flowCollector, Continuation<? super Unit> continuation) {
            return ((C121891) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        
            if (r1.emit(r11, r10) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            C121891 c121891;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                Endpoint endpoint = AssetDigestStore.this.digestEndpoint;
                AssetDigestKey assetDigestKey = this.$params;
                this.L$0 = flowCollector;
                this.label = 1;
                c121891 = this;
                obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, assetDigestKey, null, c121891, 2, null);
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
            c121891 = this;
            AssetDigest digest = ((AssetDigestResult) obj).getDigest();
            c121891.L$0 = null;
            c121891.label = 2;
        }
    }

    public final Flow<AssetDigest> getDigest(String accountNumber, UUID instrumentId, AssetType3 instrumentType) {
        RegionGate regionGate;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        AssetDigestKey assetDigestKey = new AssetDigestKey(accountNumber, instrumentId, instrumentType);
        Flow flowM28818catch = FlowKt.m28818catch(FlowKt.onCompletion(FlowKt.flow(new C121891(assetDigestKey, null)), new C121902(assetDigestKey, null)), new C121913(assetDigestKey, null));
        RegionGateProvider regionGateProvider = this.regionGateProvider;
        int i = WhenMappings.$EnumSwitchMapping$0[instrumentType.ordinal()];
        if (i == 1) {
            regionGate = AssetDigestsRegionGate.INSTANCE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            regionGate = AssetDigestsCryptoRegionGate.INSTANCE;
        }
        return Operators.connectWhen(flowM28818catch, RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(regionGateProvider, regionGate, false, 2, null), FlowKt.flowOf((Object) null));
    }

    /* compiled from: AssetDigestStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/cortex/models/asset/AssetDigest;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.store.asset.AssetDigestStore$getDigest$2", m3645f = "AssetDigestStore.kt", m3646l = {106, 107}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cortex.store.asset.AssetDigestStore$getDigest$2 */
    static final class C121902 extends ContinuationImpl7 implements Function3<FlowCollector<? super AssetDigest>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ AssetDigestKey $params;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C121902(AssetDigestKey assetDigestKey, Continuation<? super C121902> continuation) {
            super(3, continuation);
            this.$params = assetDigestKey;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super AssetDigest> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            C121902 c121902 = AssetDigestStore.this.new C121902(this.$params, continuation);
            c121902.L$0 = flowCollector;
            return c121902.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r3, r6) == r0) goto L15;
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
                long millis = AssetDigestStore.POLL_INTERVAL_DURATION.toMillis();
                this.L$0 = flowCollector;
                this.label = 1;
                if (DelayKt.delay(millis, this) != coroutine_suspended) {
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
            final Flow flowAsFlow = AssetDigestStore.this.digestQuery.asFlow(this.$params);
            Flow<AssetDigest> flow = new Flow<AssetDigest>() { // from class: com.robinhood.android.cortex.store.asset.AssetDigestStore$getDigest$2$invokeSuspend$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.cortex.store.asset.AssetDigestStore$getDigest$2$invokeSuspend$$inlined$map$1$2 */
                public static final class C121862<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.cortex.store.asset.AssetDigestStore$getDigest$2$invokeSuspend$$inlined$map$1$2", m3645f = "AssetDigestStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.cortex.store.asset.AssetDigestStore$getDigest$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                            return C121862.this.emit(null, this);
                        }
                    }

                    public C121862(FlowCollector flowCollector) {
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
                public Object collect(FlowCollector<? super AssetDigest> flowCollector2, Continuation continuation) {
                    Object objCollect = flowAsFlow.collect(new C121862(flowCollector2), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            this.L$0 = null;
            this.label = 2;
        }
    }

    /* compiled from: AssetDigestStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/cortex/models/asset/AssetDigest;", "throwable", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.store.asset.AssetDigestStore$getDigest$3", m3645f = "AssetDigestStore.kt", m3646l = {112, 113, 114}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cortex.store.asset.AssetDigestStore$getDigest$3 */
    static final class C121913 extends ContinuationImpl7 implements Function3<FlowCollector<? super AssetDigest>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ AssetDigestKey $params;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C121913(AssetDigestKey assetDigestKey, Continuation<? super C121913> continuation) {
            super(3, continuation);
            this.$params = assetDigestKey;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super AssetDigest> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            C121913 c121913 = AssetDigestStore.this.new C121913(this.$params, continuation);
            c121913.L$0 = flowCollector;
            c121913.L$1 = th;
            return c121913.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r4, r7) != r0) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                Throwable th = (Throwable) this.L$1;
                if (Throwables.isNetworkRelated(th)) {
                    this.L$0 = flowCollector2;
                    this.label = 1;
                    if (flowCollector2.emit(null, this) != coroutine_suspended) {
                        flowCollector = flowCollector2;
                    }
                    return coroutine_suspended;
                }
                throw th;
            }
            if (i == 1) {
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                final Flow flowAsFlow = AssetDigestStore.this.digestQuery.asFlow(this.$params);
                Flow<AssetDigest> flow = new Flow<AssetDigest>() { // from class: com.robinhood.android.cortex.store.asset.AssetDigestStore$getDigest$3$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super AssetDigest> flowCollector3, Continuation continuation) {
                        Object objCollect = flowAsFlow.collect(new C121872(flowCollector3), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.cortex.store.asset.AssetDigestStore$getDigest$3$invokeSuspend$$inlined$map$1$2 */
                    public static final class C121872<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.cortex.store.asset.AssetDigestStore$getDigest$3$invokeSuspend$$inlined$map$1$2", m3645f = "AssetDigestStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.cortex.store.asset.AssetDigestStore$getDigest$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C121872.this.emit(null, this);
                            }
                        }

                        public C121872(FlowCollector flowCollector) {
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
                };
                this.L$0 = null;
                this.label = 3;
            }
            long millis = AssetDigestStore.POLL_INTERVAL_DURATION.toMillis();
            this.L$0 = flowCollector;
            this.label = 2;
            if (DelayKt.delay(millis, this) != coroutine_suspended) {
                final Flow flowAsFlow2 = AssetDigestStore.this.digestQuery.asFlow(this.$params);
                Flow<AssetDigest> flow2 = new Flow<AssetDigest>() { // from class: com.robinhood.android.cortex.store.asset.AssetDigestStore$getDigest$3$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super AssetDigest> flowCollector3, Continuation continuation) {
                        Object objCollect = flowAsFlow2.collect(new C121872(flowCollector3), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.cortex.store.asset.AssetDigestStore$getDigest$3$invokeSuspend$$inlined$map$1$2 */
                    public static final class C121872<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.cortex.store.asset.AssetDigestStore$getDigest$3$invokeSuspend$$inlined$map$1$2", m3645f = "AssetDigestStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.cortex.store.asset.AssetDigestStore$getDigest$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C121872.this.emit(null, this);
                            }
                        }

                        public C121872(FlowCollector flowCollector) {
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
                };
                this.L$0 = null;
                this.label = 3;
            }
            return coroutine_suspended;
        }
    }

    public final Flow<AssetDigest> pollDigest(String accountNumber, UUID instrumentId, AssetType3 instrumentType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        final Flow flowPoll$default = Endpoint.DefaultImpls.poll$default(this.digestEndpoint, new AssetDigestKey(accountNumber, instrumentId, instrumentType), Durations.INSTANCE.getONE_SECOND(), null, 4, null);
        return new Flow<AssetDigest>() { // from class: com.robinhood.android.cortex.store.asset.AssetDigestStore$pollDigest$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super AssetDigest> flowCollector, Continuation continuation) {
                Object objCollect = flowPoll$default.collect(new C121882(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.cortex.store.asset.AssetDigestStore$pollDigest$$inlined$map$1$2 */
            public static final class C121882<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.cortex.store.asset.AssetDigestStore$pollDigest$$inlined$map$1$2", m3645f = "AssetDigestStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.cortex.store.asset.AssetDigestStore$pollDigest$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C121882.this.emit(null, this);
                    }
                }

                public C121882(FlowCollector flowCollector) {
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
                        AssetDigest digest = ((AssetDigestStore.AssetDigestResult) obj).getDigest();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(digest, anonymousClass1) == coroutine_suspended) {
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
        };
    }

    /* compiled from: AssetDigestStore.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/cortex/store/asset/AssetDigestStore$AssetDigestKey;", "", "accountNumber", "", "instrumentId", "Ljava/util/UUID;", "instrumentType", "Lcom/robinhood/android/cortex/models/asset/CopilotInstrumentType;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/android/cortex/models/asset/CopilotInstrumentType;)V", "getAccountNumber", "()Ljava/lang/String;", "getInstrumentId", "()Ljava/util/UUID;", "getInstrumentType", "()Lcom/robinhood/android/cortex/models/asset/CopilotInstrumentType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-cortex_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AssetDigestKey {
        public static final int $stable = 8;
        private final String accountNumber;
        private final UUID instrumentId;
        private final AssetType3 instrumentType;

        public static /* synthetic */ AssetDigestKey copy$default(AssetDigestKey assetDigestKey, String str, UUID uuid, AssetType3 assetType3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = assetDigestKey.accountNumber;
            }
            if ((i & 2) != 0) {
                uuid = assetDigestKey.instrumentId;
            }
            if ((i & 4) != 0) {
                assetType3 = assetDigestKey.instrumentType;
            }
            return assetDigestKey.copy(str, uuid, assetType3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component3, reason: from getter */
        public final AssetType3 getInstrumentType() {
            return this.instrumentType;
        }

        public final AssetDigestKey copy(String accountNumber, UUID instrumentId, AssetType3 instrumentType) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            return new AssetDigestKey(accountNumber, instrumentId, instrumentType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AssetDigestKey)) {
                return false;
            }
            AssetDigestKey assetDigestKey = (AssetDigestKey) other;
            return Intrinsics.areEqual(this.accountNumber, assetDigestKey.accountNumber) && Intrinsics.areEqual(this.instrumentId, assetDigestKey.instrumentId) && this.instrumentType == assetDigestKey.instrumentType;
        }

        public int hashCode() {
            return (((this.accountNumber.hashCode() * 31) + this.instrumentId.hashCode()) * 31) + this.instrumentType.hashCode();
        }

        public String toString() {
            return "AssetDigestKey(accountNumber=" + this.accountNumber + ", instrumentId=" + this.instrumentId + ", instrumentType=" + this.instrumentType + ")";
        }

        public AssetDigestKey(String accountNumber, UUID instrumentId, AssetType3 instrumentType) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            this.accountNumber = accountNumber;
            this.instrumentId = instrumentId;
            this.instrumentType = instrumentType;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final AssetType3 getInstrumentType() {
            return this.instrumentType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AssetDigestStore.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/cortex/store/asset/AssetDigestStore$AssetDigestResult;", "", "digest", "Lcom/robinhood/android/cortex/models/asset/AssetDigest;", "getDigest", "()Lcom/robinhood/android/cortex/models/asset/AssetDigest;", "NotFound", "Success", "Lcom/robinhood/android/cortex/store/asset/AssetDigestStore$AssetDigestResult$NotFound;", "Lcom/robinhood/android/cortex/store/asset/AssetDigestStore$AssetDigestResult$Success;", "lib-store-cortex_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    interface AssetDigestResult {
        AssetDigest getDigest();

        /* compiled from: AssetDigestStore.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/cortex/store/asset/AssetDigestStore$AssetDigestResult$NotFound;", "Lcom/robinhood/android/cortex/store/asset/AssetDigestStore$AssetDigestResult;", "key", "Lcom/robinhood/android/cortex/store/asset/AssetDigestStore$AssetDigestKey;", "<init>", "(Lcom/robinhood/android/cortex/store/asset/AssetDigestStore$AssetDigestKey;)V", "getKey", "()Lcom/robinhood/android/cortex/store/asset/AssetDigestStore$AssetDigestKey;", "digest", "Lcom/robinhood/android/cortex/models/asset/AssetDigest;", "getDigest", "()Lcom/robinhood/android/cortex/models/asset/AssetDigest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-cortex_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NotFound implements AssetDigestResult {
            public static final int $stable = 8;
            private final AssetDigestKey key;

            public static /* synthetic */ NotFound copy$default(NotFound notFound, AssetDigestKey assetDigestKey, int i, Object obj) {
                if ((i & 1) != 0) {
                    assetDigestKey = notFound.key;
                }
                return notFound.copy(assetDigestKey);
            }

            /* renamed from: component1, reason: from getter */
            public final AssetDigestKey getKey() {
                return this.key;
            }

            public final NotFound copy(AssetDigestKey key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return new NotFound(key);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NotFound) && Intrinsics.areEqual(this.key, ((NotFound) other).key);
            }

            @Override // com.robinhood.android.cortex.store.asset.AssetDigestStore.AssetDigestResult
            public AssetDigest getDigest() {
                return null;
            }

            public int hashCode() {
                return this.key.hashCode();
            }

            public String toString() {
                return "NotFound(key=" + this.key + ")";
            }

            public NotFound(AssetDigestKey key) {
                Intrinsics.checkNotNullParameter(key, "key");
                this.key = key;
            }

            public final AssetDigestKey getKey() {
                return this.key;
            }
        }

        /* compiled from: AssetDigestStore.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/cortex/store/asset/AssetDigestStore$AssetDigestResult$Success;", "Lcom/robinhood/android/cortex/store/asset/AssetDigestStore$AssetDigestResult;", "key", "Lcom/robinhood/android/cortex/store/asset/AssetDigestStore$AssetDigestKey;", "digest", "Lcom/robinhood/android/cortex/models/asset/AssetDigest;", "<init>", "(Lcom/robinhood/android/cortex/store/asset/AssetDigestStore$AssetDigestKey;Lcom/robinhood/android/cortex/models/asset/AssetDigest;)V", "getKey", "()Lcom/robinhood/android/cortex/store/asset/AssetDigestStore$AssetDigestKey;", "getDigest", "()Lcom/robinhood/android/cortex/models/asset/AssetDigest;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-cortex_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success implements AssetDigestResult {
            public static final int $stable = 8;
            private final AssetDigest digest;
            private final AssetDigestKey key;

            public static /* synthetic */ Success copy$default(Success success, AssetDigestKey assetDigestKey, AssetDigest assetDigest, int i, Object obj) {
                if ((i & 1) != 0) {
                    assetDigestKey = success.key;
                }
                if ((i & 2) != 0) {
                    assetDigest = success.digest;
                }
                return success.copy(assetDigestKey, assetDigest);
            }

            /* renamed from: component1, reason: from getter */
            public final AssetDigestKey getKey() {
                return this.key;
            }

            /* renamed from: component2, reason: from getter */
            public final AssetDigest getDigest() {
                return this.digest;
            }

            public final Success copy(AssetDigestKey key, AssetDigest digest) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(digest, "digest");
                return new Success(key, digest);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.areEqual(this.key, success.key) && Intrinsics.areEqual(this.digest, success.digest);
            }

            public int hashCode() {
                return (this.key.hashCode() * 31) + this.digest.hashCode();
            }

            public String toString() {
                return "Success(key=" + this.key + ", digest=" + this.digest + ")";
            }

            public Success(AssetDigestKey key, AssetDigest digest) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(digest, "digest");
                this.key = key;
                this.digest = digest;
            }

            public final AssetDigestKey getKey() {
                return this.key;
            }

            @Override // com.robinhood.android.cortex.store.asset.AssetDigestStore.AssetDigestResult
            public AssetDigest getDigest() {
                return this.digest;
            }
        }
    }
}
