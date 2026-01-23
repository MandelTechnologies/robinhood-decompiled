package com.robinhood.shared.data.store.iac;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.p355ui.IacUpsell;
import com.robinhood.models.p355ui.IacUpsellLocation;
import com.robinhood.models.p355ui.IacUpsellResponse;
import com.robinhood.shared.api.iac.IacUpsellApi;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import io.reactivex.Single;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: IacUpsellStore.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00172\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u001e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u001f2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dJd\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0086@¢\u0006\u0002\u0010%J[\u0010&\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0002\u0010'J\u000e\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/robinhood/shared/data/store/iac/IacUpsellStore;", "Lcom/robinhood/store/Store;", "iacUpsellApi", "Lcom/robinhood/shared/api/iac/IacUpsellApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/shared/api/iac/IacUpsellApi;Lcom/robinhood/store/StoreBundle;)V", "getIacUpsellApi", "()Lcom/robinhood/shared/api/iac/IacUpsellApi;", "preloadCache", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/robinhood/shared/data/store/iac/IacUpsellsParams;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/IacUpsell;", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/ui/IacUpsellResponse;", "seenEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Ljava/util/UUID;", "", "getPostTradeUpsell", "Lio/reactivex/Single;", "instrumentId", "orderId", "accountNumber", "", "notificationStatus", "", "pollPostCryptoTradeUpsell", "Lkotlinx/coroutines/flow/Flow;", "getUpsellByLocation", "location", "Lcom/robinhood/models/ui/IacUpsellLocation;", "depositId", "entryPoint", "(Lcom/robinhood/models/ui/IacUpsellLocation;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "preloadUpsellByLocation", "(Lcom/robinhood/models/ui/IacUpsellLocation;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "postUpsellAsSeen", "receiptUuid", "lib-store-iac_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class IacUpsellStore extends Store {
    private final Endpoint<IacUpsellsParams, IacUpsellResponse> endpoint;
    private final IacUpsellApi iacUpsellApi;
    private final ConcurrentHashMap<IacUpsellsParams, Optional<IacUpsell>> preloadCache;
    private final PostEndpoint<UUID, Unit> seenEndpoint;

    /* compiled from: IacUpsellStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.data.store.iac.IacUpsellStore", m3645f = "IacUpsellStore.kt", m3646l = {114}, m3647m = "getUpsellByLocation")
    /* renamed from: com.robinhood.shared.data.store.iac.IacUpsellStore$getUpsellByLocation$1 */
    static final class C386991 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C386991(Continuation<? super C386991> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IacUpsellStore.this.getUpsellByLocation(null, null, null, null, null, null, null, this);
        }
    }

    public final IacUpsellApi getIacUpsellApi() {
        return this.iacUpsellApi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IacUpsellStore(IacUpsellApi iacUpsellApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(iacUpsellApi, "iacUpsellApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.iacUpsellApi = iacUpsellApi;
        this.preloadCache = new ConcurrentHashMap<>();
        this.endpoint = Endpoint.Companion.createWithParams$default(Endpoint.INSTANCE, new IacUpsellStore2(this, null), getLogoutKillswitch(), new IacUpsellStore3(null), storeBundle.getClock(), null, 16, null);
        this.seenEndpoint = PostEndpoint.INSTANCE.create(new IacUpsellStore4(this, null), new IacUpsellStore5(null));
    }

    /* compiled from: IacUpsellStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/IacUpsell;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.data.store.iac.IacUpsellStore$getPostTradeUpsell$1", m3645f = "IacUpsellStore.kt", m3646l = {65}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.data.store.iac.IacUpsellStore$getPostTradeUpsell$1 */
    static final class C386981 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends IacUpsell>>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ boolean $notificationStatus;
        final /* synthetic */ UUID $orderId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C386981(UUID uuid, UUID uuid2, String str, boolean z, Continuation<? super C386981> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
            this.$orderId = uuid2;
            this.$accountNumber = str;
            this.$notificationStatus = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IacUpsellStore.this.new C386981(this.$instrumentId, this.$orderId, this.$accountNumber, this.$notificationStatus, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends IacUpsell>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<IacUpsell>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<IacUpsell>> continuation) {
            return ((C386981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            IacUpsellStore iacUpsellStore = IacUpsellStore.this;
            IacUpsellLocation iacUpsellLocation = IacUpsellLocation.UPSELL_POST_EQUITY_TRADE;
            UUID uuid = this.$instrumentId;
            UUID uuid2 = this.$orderId;
            String str = this.$accountNumber;
            Boolean boolBoxBoolean = boxing.boxBoolean(this.$notificationStatus);
            this.label = 1;
            Object upsellByLocation$default = IacUpsellStore.getUpsellByLocation$default(iacUpsellStore, iacUpsellLocation, uuid, uuid2, null, str, null, boolBoxBoolean, this, 40, null);
            return upsellByLocation$default == coroutine_suspended ? coroutine_suspended : upsellByLocation$default;
        }
    }

    public final Single<Optional<IacUpsell>> getPostTradeUpsell(UUID instrumentId, UUID orderId, String accountNumber, boolean notificationStatus) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C386981(instrumentId, orderId, accountNumber, notificationStatus, null), 1, null);
    }

    public final Flow<IacUpsell> pollPostCryptoTradeUpsell(UUID orderId, boolean notificationStatus) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        final Flow flowPoll$default = Endpoint.DefaultImpls.poll$default(this.endpoint, new IacUpsellsParams(IacUpsellLocation.UPSELL_POST_CRYPTO_TRADE, null, orderId, null, null, null, Boolean.valueOf(notificationStatus)), Durations.INSTANCE.getONE_SECOND(), null, 4, null);
        return new Flow<IacUpsell>() { // from class: com.robinhood.shared.data.store.iac.IacUpsellStore$pollPostCryptoTradeUpsell$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.data.store.iac.IacUpsellStore$pollPostCryptoTradeUpsell$$inlined$map$1$2 */
            public static final class C386972<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.data.store.iac.IacUpsellStore$pollPostCryptoTradeUpsell$$inlined$map$1$2", m3645f = "IacUpsellStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.shared.data.store.iac.IacUpsellStore$pollPostCryptoTradeUpsell$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C386972.this.emit(null, this);
                    }
                }

                public C386972(FlowCollector flowCollector) {
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
                        Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) ((IacUpsellResponse) obj).getUpsells());
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(objFirstOrNull, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super IacUpsell> flowCollector, Continuation continuation) {
                Object objCollect = flowPoll$default.collect(new C386972(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public static /* synthetic */ Object getUpsellByLocation$default(IacUpsellStore iacUpsellStore, IacUpsellLocation iacUpsellLocation, UUID uuid, UUID uuid2, UUID uuid3, String str, String str2, Boolean bool, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            uuid = null;
        }
        if ((i & 4) != 0) {
            uuid2 = null;
        }
        if ((i & 8) != 0) {
            uuid3 = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            bool = null;
        }
        return iacUpsellStore.getUpsellByLocation(iacUpsellLocation, uuid, uuid2, uuid3, str, str2, bool, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getUpsellByLocation(IacUpsellLocation iacUpsellLocation, UUID uuid, UUID uuid2, UUID uuid3, String str, String str2, Boolean bool, Continuation<? super Optional<IacUpsell>> continuation) {
        C386991 c386991;
        Optional.Companion companion;
        List<IacUpsell> upsells;
        if (continuation instanceof C386991) {
            c386991 = (C386991) continuation;
            int i = c386991.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c386991.label = i - Integer.MIN_VALUE;
            } else {
                c386991 = new C386991(continuation);
            }
        }
        Object obj = c386991.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c386991.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            IacUpsellsParams iacUpsellsParams = new IacUpsellsParams(iacUpsellLocation, uuid, uuid2, uuid3, str, str2, bool);
            Optional<IacUpsell> optional = this.preloadCache.get(iacUpsellsParams);
            if (optional != null) {
                return optional;
            }
            Optional.Companion companion2 = Optional.INSTANCE;
            Endpoint<IacUpsellsParams, IacUpsellResponse> endpoint = this.endpoint;
            c386991.L$0 = companion2;
            c386991.label = 1;
            Object objFetch$default = Endpoint.DefaultImpls.fetch$default(endpoint, iacUpsellsParams, null, c386991, 2, null);
            if (objFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objFetch$default;
            companion = companion2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            companion = (Optional.Companion) c386991.L$0;
            ResultKt.throwOnFailure(obj);
        }
        IacUpsellResponse iacUpsellResponse = (IacUpsellResponse) obj;
        return companion.m2972of((iacUpsellResponse == null || (upsells = iacUpsellResponse.getUpsells()) == null) ? null : (IacUpsell) CollectionsKt.firstOrNull((List) upsells));
    }

    public static /* synthetic */ void preloadUpsellByLocation$default(IacUpsellStore iacUpsellStore, IacUpsellLocation iacUpsellLocation, UUID uuid, UUID uuid2, UUID uuid3, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            uuid = null;
        }
        if ((i & 4) != 0) {
            uuid2 = null;
        }
        if ((i & 8) != 0) {
            uuid3 = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            bool = null;
        }
        iacUpsellStore.preloadUpsellByLocation(iacUpsellLocation, uuid, uuid2, uuid3, str, str2, bool);
    }

    /* compiled from: IacUpsellStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.data.store.iac.IacUpsellStore$preloadUpsellByLocation$1", m3645f = "IacUpsellStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.data.store.iac.IacUpsellStore$preloadUpsellByLocation$1 */
    static final class C387011 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $depositId;
        final /* synthetic */ String $entryPoint;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ IacUpsellLocation $location;
        final /* synthetic */ Boolean $notificationStatus;
        final /* synthetic */ UUID $orderId;
        Object L$0;
        int label;
        final /* synthetic */ IacUpsellStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C387011(IacUpsellLocation iacUpsellLocation, UUID uuid, UUID uuid2, UUID uuid3, String str, String str2, Boolean bool, IacUpsellStore iacUpsellStore, Continuation<? super C387011> continuation) {
            super(2, continuation);
            this.$location = iacUpsellLocation;
            this.$instrumentId = uuid;
            this.$orderId = uuid2;
            this.$depositId = uuid3;
            this.$accountNumber = str;
            this.$entryPoint = str2;
            this.$notificationStatus = bool;
            this.this$0 = iacUpsellStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C387011(this.$location, this.$instrumentId, this.$orderId, this.$depositId, this.$accountNumber, this.$entryPoint, this.$notificationStatus, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C387011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C387011 c387011;
            IacUpsellsParams iacUpsellsParams;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IacUpsellsParams iacUpsellsParams2 = new IacUpsellsParams(this.$location, this.$instrumentId, this.$orderId, this.$depositId, this.$accountNumber, this.$entryPoint, this.$notificationStatus);
                IacUpsellStore iacUpsellStore = this.this$0;
                IacUpsellLocation iacUpsellLocation = this.$location;
                UUID uuid = this.$instrumentId;
                UUID uuid2 = this.$orderId;
                UUID uuid3 = this.$depositId;
                String str = this.$accountNumber;
                String str2 = this.$entryPoint;
                Boolean bool = this.$notificationStatus;
                this.L$0 = iacUpsellsParams2;
                this.label = 1;
                c387011 = this;
                obj = iacUpsellStore.getUpsellByLocation(iacUpsellLocation, uuid, uuid2, uuid3, str, str2, bool, c387011);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                iacUpsellsParams = iacUpsellsParams2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iacUpsellsParams = (IacUpsellsParams) this.L$0;
                ResultKt.throwOnFailure(obj);
                c387011 = this;
            }
            c387011.this$0.preloadCache.put(iacUpsellsParams, (Optional) obj);
            return Unit.INSTANCE;
        }
    }

    public final void preloadUpsellByLocation(IacUpsellLocation location, UUID instrumentId, UUID orderId, UUID depositId, String accountNumber, String entryPoint, Boolean notificationStatus) {
        Intrinsics.checkNotNullParameter(location, "location");
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C387011(location, instrumentId, orderId, depositId, accountNumber, entryPoint, notificationStatus, this, null), 3, null);
    }

    /* compiled from: IacUpsellStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.data.store.iac.IacUpsellStore$postUpsellAsSeen$1", m3645f = "IacUpsellStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.data.store.iac.IacUpsellStore$postUpsellAsSeen$1 */
    static final class C387001 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $receiptUuid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C387001(UUID uuid, Continuation<? super C387001> continuation) {
            super(2, continuation);
            this.$receiptUuid = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IacUpsellStore.this.new C387001(this.$receiptUuid, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C387001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PostEndpoint postEndpoint = IacUpsellStore.this.seenEndpoint;
                    UUID uuid = this.$receiptUuid;
                    this.label = 1;
                    if (PostEndpoint.DefaultImpls.post$default(postEndpoint, uuid, null, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th) {
                if (Throwables.isNetworkRelated(th)) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, new EventMetadata(SentryTeam.CRYPTO, null, null, 6, null), 2, null);
                } else {
                    throw th;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void postUpsellAsSeen(UUID receiptUuid) {
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C387001(receiptUuid, null), 3, null);
    }
}
