package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.librobinhood.data.store.MarketDataProxyStore;
import com.robinhood.shared.models.idl.p390ui.UiIdlCacheEntry;
import com.robinhood.shared.store.idl.IdlKeyValueStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.datetime.Durations;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import md_server_proxy.service.p483v1.CurrencyCodeDto;
import md_server_proxy.service.p483v1.FundamentalDetailDto;
import md_server_proxy.service.p483v1.FundamentalDto;
import md_server_proxy.service.p483v1.GetFundamentalsResponseDto;
import md_server_proxy.service.p483v1.GetQuotesResponseDto;
import md_server_proxy.service.p483v1.MdServerProxyService;
import md_server_proxy.service.p483v1.QuoteDetailDataDto;
import md_server_proxy.service.p483v1.QuoteDetailDto;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: MarketDataProxyStore.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002*)B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000fJ%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u0006\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00140\u00170\f2\u0006\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001fR&\u0010(\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0'0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\"¨\u0006+"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/MarketDataProxyStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/shared/store/idl/IdlKeyValueStore;", "idlKeyValueStore", "Lmd_server_proxy/service/v1/MdServerProxyService;", "marketDataProxyService", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/shared/store/idl/IdlKeyValueStore;Lmd_server_proxy/service/v1/MdServerProxyService;Lcom/robinhood/store/StoreBundle;)V", "Ljava/util/UUID;", "currencyPairId", "Lkotlinx/coroutines/flow/Flow;", "Lmd_server_proxy/service/v1/FundamentalDto;", "pollFundamentals", "(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "fetchFundamentals", "instrumentId", "Lmd_server_proxy/service/v1/CurrencyCodeDto;", "displayCurrencyCode", "Lmd_server_proxy/service/v1/QuoteDetailDataDto;", "pollQuote", "(Ljava/util/UUID;Lmd_server_proxy/service/v1/CurrencyCodeDto;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "j$/time/Instant", "pollQuoteWithTimestamp", "Lcom/robinhood/shared/store/idl/IdlKeyValueStore;", "Lmd_server_proxy/service/v1/MdServerProxyService;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lmd_server_proxy/service/v1/GetFundamentalsResponseDto;", "tokenFundamentalsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/moria/db/Query;", "streamTokenFundamentals", "Lcom/robinhood/android/moria/db/Query;", "refreshTokenFundamentals", "Lcom/robinhood/librobinhood/data/store/MarketDataProxyStore$TokenQuoteRequest;", "Lmd_server_proxy/service/v1/GetQuotesResponseDto;", "quoteEndpoint", "Lcom/robinhood/shared/models/idl/ui/UiIdlCacheEntry;", "streamQuote", "Companion", "TokenQuoteRequest", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class MarketDataProxyStore extends Store {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final IdlKeyValueStore idlKeyValueStore;
    private final MdServerProxyService marketDataProxyService;
    private final Endpoint<TokenQuoteRequest, GetQuotesResponseDto> quoteEndpoint;
    private final Query<UUID, GetFundamentalsResponseDto> refreshTokenFundamentals;
    private final Query<TokenQuoteRequest, UiIdlCacheEntry<GetQuotesResponseDto>> streamQuote;
    private final Query<UUID, GetFundamentalsResponseDto> streamTokenFundamentals;
    private final Endpoint<UUID, GetFundamentalsResponseDto> tokenFundamentalsEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketDataProxyStore(IdlKeyValueStore idlKeyValueStore, MdServerProxyService marketDataProxyService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(idlKeyValueStore, "idlKeyValueStore");
        Intrinsics.checkNotNullParameter(marketDataProxyService, "marketDataProxyService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.idlKeyValueStore = idlKeyValueStore;
        this.marketDataProxyService = marketDataProxyService;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        MarketDataProxyStore5 marketDataProxyStore5 = new MarketDataProxyStore5(this, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        MarketDataProxyStore6 marketDataProxyStore6 = new MarketDataProxyStore6(this, null);
        Clock clock = storeBundle.getClock();
        Durations durations = Durations.INSTANCE;
        Endpoint<UUID, GetFundamentalsResponseDto> endpointCreateWithParams = companion.createWithParams(marketDataProxyStore5, logoutKillswitch, marketDataProxyStore6, clock, new DefaultStaleDecider(durations.getFIFTEEN_SECONDS(), storeBundle.getClock()));
        this.tokenFundamentalsEndpoint = endpointCreateWithParams;
        Query.Companion companion2 = Query.INSTANCE;
        this.streamTokenFundamentals = Store.create$default(this, companion2, "streamTokenFundamentals", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.MarketDataProxyStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketDataProxyStore.streamTokenFundamentals$lambda$0(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.MarketDataProxyStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketDataProxyStore.streamTokenFundamentals$lambda$2(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.refreshTokenFundamentals = Store.create$default(this, companion2, "refreshTokenFundamentals", CollectionsKt.listOf(new RefreshEach(new MarketDataProxyStore4(endpointCreateWithParams))), new Function1() { // from class: com.robinhood.librobinhood.data.store.MarketDataProxyStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketDataProxyStore.refreshTokenFundamentals$lambda$5(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.quoteEndpoint = companion.createWithParams(new MarketDataProxyStore2(this, null), getLogoutKillswitch(), new MarketDataProxyStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(durations.getFIVE_SECONDS(), storeBundle.getClock()));
        this.streamQuote = Store.create$default(this, companion2, "streamQuote", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.MarketDataProxyStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketDataProxyStore.streamQuote$lambda$7(this.f$0, (MarketDataProxyStore.TokenQuoteRequest) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.MarketDataProxyStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketDataProxyStore.streamQuote$lambda$8(this.f$0, (MarketDataProxyStore.TokenQuoteRequest) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamTokenFundamentals$lambda$0(MarketDataProxyStore marketDataProxyStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(marketDataProxyStore.tokenFundamentalsEndpoint, it, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamTokenFundamentals$lambda$2(MarketDataProxyStore marketDataProxyStore, UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        final Flow flowStream = marketDataProxyStore.idlKeyValueStore.stream(INSTANCE.tokenFundamentalsKey$lib_store_crypto_externalDebug(currencyPairId), Reflection.getOrCreateKotlinClass(GetFundamentalsResponseDto.class));
        return new Flow<GetFundamentalsResponseDto>() { // from class: com.robinhood.librobinhood.data.store.MarketDataProxyStore$streamTokenFundamentals$lambda$2$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.MarketDataProxyStore$streamTokenFundamentals$lambda$2$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MarketDataProxyStore$streamTokenFundamentals$lambda$2$$inlined$map$1$2", m3645f = "MarketDataProxyStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.MarketDataProxyStore$streamTokenFundamentals$lambda$2$$inlined$map$1$2$1, reason: invalid class name */
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
                        UiIdlCacheEntry uiIdlCacheEntry = (UiIdlCacheEntry) obj;
                        GetFundamentalsResponseDto getFundamentalsResponseDto = uiIdlCacheEntry != null ? (GetFundamentalsResponseDto) uiIdlCacheEntry.getData() : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(getFundamentalsResponseDto, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super GetFundamentalsResponseDto> flowCollector, Continuation continuation) {
                Object objCollect = flowStream.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Flow<FundamentalDto> pollFundamentals(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        final Flow<GetFundamentalsResponseDto> flowAsFlow = this.streamTokenFundamentals.asFlow(currencyPairId);
        return FlowKt.filterNotNull(new Flow<FundamentalDto>() { // from class: com.robinhood.librobinhood.data.store.MarketDataProxyStore$pollFundamentals$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.MarketDataProxyStore$pollFundamentals$$inlined$map$1$2 */
            public static final class C339292<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MarketDataProxyStore$pollFundamentals$$inlined$map$1$2", m3645f = "MarketDataProxyStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.MarketDataProxyStore$pollFundamentals$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C339292.this.emit(null, this);
                    }
                }

                public C339292(FlowCollector flowCollector) {
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
                        FundamentalDetailDto fundamentalDetailDto = (FundamentalDetailDto) CollectionsKt.getOrNull(((GetFundamentalsResponseDto) obj).getData(), 0);
                        FundamentalDto data = fundamentalDetailDto != null ? fundamentalDetailDto.getData() : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(data, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super FundamentalDto> flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new C339292(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow refreshTokenFundamentals$lambda$5(MarketDataProxyStore marketDataProxyStore, UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        final Flow flowStream = marketDataProxyStore.idlKeyValueStore.stream(INSTANCE.tokenFundamentalsKey$lib_store_crypto_externalDebug(currencyPairId), Reflection.getOrCreateKotlinClass(GetFundamentalsResponseDto.class));
        return new Flow<GetFundamentalsResponseDto>() { // from class: com.robinhood.librobinhood.data.store.MarketDataProxyStore$refreshTokenFundamentals$lambda$5$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.MarketDataProxyStore$refreshTokenFundamentals$lambda$5$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MarketDataProxyStore$refreshTokenFundamentals$lambda$5$$inlined$map$1$2", m3645f = "MarketDataProxyStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.MarketDataProxyStore$refreshTokenFundamentals$lambda$5$$inlined$map$1$2$1, reason: invalid class name */
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
                        UiIdlCacheEntry uiIdlCacheEntry = (UiIdlCacheEntry) obj;
                        GetFundamentalsResponseDto getFundamentalsResponseDto = uiIdlCacheEntry != null ? (GetFundamentalsResponseDto) uiIdlCacheEntry.getData() : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(getFundamentalsResponseDto, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super GetFundamentalsResponseDto> flowCollector, Continuation continuation) {
                Object objCollect = flowStream.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Flow<FundamentalDto> fetchFundamentals(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        final Flow<GetFundamentalsResponseDto> flowAsFlow = this.refreshTokenFundamentals.asFlow(currencyPairId);
        return FlowKt.filterNotNull(new Flow<FundamentalDto>() { // from class: com.robinhood.librobinhood.data.store.MarketDataProxyStore$fetchFundamentals$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.MarketDataProxyStore$fetchFundamentals$$inlined$map$1$2 */
            public static final class C339282<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MarketDataProxyStore$fetchFundamentals$$inlined$map$1$2", m3645f = "MarketDataProxyStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.MarketDataProxyStore$fetchFundamentals$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C339282.this.emit(null, this);
                    }
                }

                public C339282(FlowCollector flowCollector) {
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
                        FundamentalDetailDto fundamentalDetailDto = (FundamentalDetailDto) CollectionsKt.getOrNull(((GetFundamentalsResponseDto) obj).getData(), 0);
                        FundamentalDto data = fundamentalDetailDto != null ? fundamentalDetailDto.getData() : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(data, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super FundamentalDto> flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new C339282(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamQuote$lambda$7(MarketDataProxyStore marketDataProxyStore, TokenQuoteRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(marketDataProxyStore.quoteEndpoint, it, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamQuote$lambda$8(MarketDataProxyStore marketDataProxyStore, TokenQuoteRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return marketDataProxyStore.idlKeyValueStore.stream(INSTANCE.tokenQuoteKey$lib_store_crypto_externalDebug(request), Reflection.getOrCreateKotlinClass(GetQuotesResponseDto.class));
    }

    public static /* synthetic */ Flow pollQuote$default(MarketDataProxyStore marketDataProxyStore, UUID uuid, CurrencyCodeDto currencyCodeDto, int i, Object obj) {
        if ((i & 2) != 0) {
            currencyCodeDto = CurrencyCodeDto.EUR;
        }
        return marketDataProxyStore.pollQuote(uuid, currencyCodeDto);
    }

    public final Flow<QuoteDetailDataDto> pollQuote(UUID instrumentId, CurrencyCodeDto displayCurrencyCode) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(displayCurrencyCode, "displayCurrencyCode");
        final Flow<UiIdlCacheEntry<GetQuotesResponseDto>> flowAsFlow = this.streamQuote.asFlow(new TokenQuoteRequest(instrumentId, displayCurrencyCode));
        return FlowKt.filterNotNull(new Flow<QuoteDetailDataDto>() { // from class: com.robinhood.librobinhood.data.store.MarketDataProxyStore$pollQuote$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super QuoteDetailDataDto> flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new C339302(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.MarketDataProxyStore$pollQuote$$inlined$map$1$2 */
            public static final class C339302<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MarketDataProxyStore$pollQuote$$inlined$map$1$2", m3645f = "MarketDataProxyStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.MarketDataProxyStore$pollQuote$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C339302.this.emit(null, this);
                    }
                }

                public C339302(FlowCollector flowCollector) {
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
                        QuoteDetailDto quoteDetailDto = (QuoteDetailDto) CollectionsKt.getOrNull(((GetQuotesResponseDto) ((UiIdlCacheEntry) obj).getData()).getData(), 0);
                        QuoteDetailDataDto data = quoteDetailDto != null ? quoteDetailDto.getData() : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(data, anonymousClass1) == coroutine_suspended) {
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
        });
    }

    public static /* synthetic */ Flow pollQuoteWithTimestamp$default(MarketDataProxyStore marketDataProxyStore, UUID uuid, CurrencyCodeDto currencyCodeDto, int i, Object obj) {
        if ((i & 2) != 0) {
            currencyCodeDto = CurrencyCodeDto.EUR;
        }
        return marketDataProxyStore.pollQuoteWithTimestamp(uuid, currencyCodeDto);
    }

    public final Flow<Tuples2<Instant, QuoteDetailDataDto>> pollQuoteWithTimestamp(UUID instrumentId, CurrencyCodeDto displayCurrencyCode) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(displayCurrencyCode, "displayCurrencyCode");
        final Flow<UiIdlCacheEntry<GetQuotesResponseDto>> flowAsFlow = this.streamQuote.asFlow(new TokenQuoteRequest(instrumentId, displayCurrencyCode));
        return FlowKt.filterNotNull(new Flow<Tuples2<? extends Instant, ? extends QuoteDetailDataDto>>() { // from class: com.robinhood.librobinhood.data.store.MarketDataProxyStore$pollQuoteWithTimestamp$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Tuples2<? extends Instant, ? extends QuoteDetailDataDto>> flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new C339312(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.MarketDataProxyStore$pollQuoteWithTimestamp$$inlined$map$1$2 */
            public static final class C339312<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MarketDataProxyStore$pollQuoteWithTimestamp$$inlined$map$1$2", m3645f = "MarketDataProxyStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.MarketDataProxyStore$pollQuoteWithTimestamp$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C339312.this.emit(null, this);
                    }
                }

                public C339312(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    QuoteDetailDataDto data;
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
                        UiIdlCacheEntry uiIdlCacheEntry = (UiIdlCacheEntry) obj;
                        QuoteDetailDto quoteDetailDto = (QuoteDetailDto) CollectionsKt.getOrNull(((GetQuotesResponseDto) uiIdlCacheEntry.getData()).getData(), 0);
                        Tuples2 tuples2M3642to = (quoteDetailDto == null || (data = quoteDetailDto.getData()) == null) ? null : Tuples4.m3642to(uiIdlCacheEntry.getTimestamp(), data);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
        });
    }

    /* compiled from: MarketDataProxyStore.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/MarketDataProxyStore$TokenQuoteRequest;", "", "instrumentId", "Ljava/util/UUID;", "displayCurrencyCode", "Lmd_server_proxy/service/v1/CurrencyCodeDto;", "<init>", "(Ljava/util/UUID;Lmd_server_proxy/service/v1/CurrencyCodeDto;)V", "getInstrumentId", "()Ljava/util/UUID;", "getDisplayCurrencyCode", "()Lmd_server_proxy/service/v1/CurrencyCodeDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TokenQuoteRequest {
        private final CurrencyCodeDto displayCurrencyCode;
        private final UUID instrumentId;

        public static /* synthetic */ TokenQuoteRequest copy$default(TokenQuoteRequest tokenQuoteRequest, UUID uuid, CurrencyCodeDto currencyCodeDto, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = tokenQuoteRequest.instrumentId;
            }
            if ((i & 2) != 0) {
                currencyCodeDto = tokenQuoteRequest.displayCurrencyCode;
            }
            return tokenQuoteRequest.copy(uuid, currencyCodeDto);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final CurrencyCodeDto getDisplayCurrencyCode() {
            return this.displayCurrencyCode;
        }

        public final TokenQuoteRequest copy(UUID instrumentId, CurrencyCodeDto displayCurrencyCode) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(displayCurrencyCode, "displayCurrencyCode");
            return new TokenQuoteRequest(instrumentId, displayCurrencyCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TokenQuoteRequest)) {
                return false;
            }
            TokenQuoteRequest tokenQuoteRequest = (TokenQuoteRequest) other;
            return Intrinsics.areEqual(this.instrumentId, tokenQuoteRequest.instrumentId) && this.displayCurrencyCode == tokenQuoteRequest.displayCurrencyCode;
        }

        public int hashCode() {
            return (this.instrumentId.hashCode() * 31) + this.displayCurrencyCode.hashCode();
        }

        public String toString() {
            return "TokenQuoteRequest(instrumentId=" + this.instrumentId + ", displayCurrencyCode=" + this.displayCurrencyCode + ")";
        }

        public TokenQuoteRequest(UUID instrumentId, CurrencyCodeDto displayCurrencyCode) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(displayCurrencyCode, "displayCurrencyCode");
            this.instrumentId = instrumentId;
            this.displayCurrencyCode = displayCurrencyCode;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final CurrencyCodeDto getDisplayCurrencyCode() {
            return this.displayCurrencyCode;
        }
    }

    /* compiled from: MarketDataProxyStore.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/MarketDataProxyStore$Companion;", "", "<init>", "()V", "tokenFundamentalsKey", "", "currencyPairId", "Ljava/util/UUID;", "tokenFundamentalsKey$lib_store_crypto_externalDebug", "tokenQuoteKey", "request", "Lcom/robinhood/librobinhood/data/store/MarketDataProxyStore$TokenQuoteRequest;", "tokenQuoteKey$lib_store_crypto_externalDebug", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String tokenFundamentalsKey$lib_store_crypto_externalDebug(UUID currencyPairId) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            return "token_fundamentals_" + currencyPairId;
        }

        public final String tokenQuoteKey$lib_store_crypto_externalDebug(TokenQuoteRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return "token_quote_" + request.getInstrumentId() + "_" + request.getDisplayCurrencyCode();
        }
    }
}
