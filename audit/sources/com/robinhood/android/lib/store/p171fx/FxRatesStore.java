package com.robinhood.android.lib.store.p171fx;

import com.robinhood.android.lib.api.p164fx.MarketDataApi;
import com.robinhood.android.lib.p166fx.provider.FxRatesProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p325fx.api.ApiFxQuote;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Duration;

/* compiled from: FxRatesStore.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001 B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/lib/store/fx/FxRatesStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/lib/fx/provider/FxRatesProvider;", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Lcom/robinhood/android/lib/api/fx/MarketDataApi;", "marketDataApi", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/lib/api/fx/MarketDataApi;Lcom/robinhood/store/StoreBundle;)V", "j$/time/Duration", "pollingInterval", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/fx/api/ApiFxQuote;", "streamFxRate", "(Lj$/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "forceFetchFxRate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/shared/store/user/UserStore;", "Lcom/robinhood/android/lib/api/fx/MarketDataApi;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "fxQuoteFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/robinhood/android/moria/network/Endpoint;", "", "fxRateEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/utils/Optional;", "fxRateQuery", "Lcom/robinhood/android/moria/db/Query;", "CurrencyPairs", "lib-store-fx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class FxRatesStore extends Store implements FxRatesProvider {
    private final SharedFlow2<ApiFxQuote> fxQuoteFlow;
    private final Endpoint<Unit, ApiFxQuote> fxRateEndpoint;
    private final Query<Duration, Optional<ApiFxQuote>> fxRateQuery;
    private final MarketDataApi marketDataApi;
    private final UserStore userStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FxRatesStore(UserStore userStore, MarketDataApi marketDataApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(marketDataApi, "marketDataApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.userStore = userStore;
        this.marketDataApi = marketDataApi;
        SharedFlow2<ApiFxQuote> sharedFlow2MutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        sharedFlow2MutableSharedFlow$default.tryEmit(null);
        this.fxQuoteFlow = sharedFlow2MutableSharedFlow$default;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        FxRatesStore2 fxRatesStore2 = new FxRatesStore2(sharedFlow2MutableSharedFlow$default);
        this.fxRateEndpoint = Endpoint.Companion.create$default(companion, new FxRatesStore3(this, null), getLogoutKillswitch(), fxRatesStore2, storeBundle.getClock(), null, 16, null);
        this.fxRateQuery = Store.createOptional$default(this, Query.INSTANCE, "streamFxRate", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.lib.store.fx.FxRatesStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FxRatesStore.fxRateQuery$lambda$1(this.f$0, (Duration) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.lib.store.fx.FxRatesStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FxRatesStore.fxRateQuery$lambda$2(this.f$0, (Duration) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object fxRateEndpoint$tryEmit(SharedFlow2 sharedFlow2, ApiFxQuote apiFxQuote, Continuation continuation) {
        sharedFlow2.tryEmit(apiFxQuote);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow fxRateQuery$lambda$1(FxRatesStore fxRatesStore, Duration pollingInterval) {
        Intrinsics.checkNotNullParameter(pollingInterval, "pollingInterval");
        return Endpoint.DefaultImpls.poll$default(fxRatesStore.fxRateEndpoint, Unit.INSTANCE, pollingInterval, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow fxRateQuery$lambda$2(FxRatesStore fxRatesStore, Duration it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return fxRatesStore.fxQuoteFlow;
    }

    @Override // com.robinhood.android.lib.p166fx.provider.FxRatesProvider
    public Flow<ApiFxQuote> streamFxRate(Duration pollingInterval) {
        Intrinsics.checkNotNullParameter(pollingInterval, "pollingInterval");
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.fxRateQuery.asObservable(pollingInterval)), Integer.MAX_VALUE, null, 2, null);
        return new Flow<ApiFxQuote>() { // from class: com.robinhood.android.lib.store.fx.FxRatesStore$streamFxRate$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.lib.store.fx.FxRatesStore$streamFxRate$$inlined$map$1$2 */
            public static final class C205702<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.lib.store.fx.FxRatesStore$streamFxRate$$inlined$map$1$2", m3645f = "FxRatesStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.lib.store.fx.FxRatesStore$streamFxRate$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C205702.this.emit(null, this);
                    }
                }

                public C205702(FlowCollector flowCollector) {
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
            public Object collect(FlowCollector<? super ApiFxQuote> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new C205702(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.robinhood.android.lib.p166fx.provider.FxRatesProvider
    public Object forceFetchFxRate(Continuation<? super ApiFxQuote> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.fxRateEndpoint, Unit.INSTANCE, null, continuation, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FxRatesStore.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lib/store/fx/FxRatesStore$CurrencyPairs;", "", "<init>", "()V", CurrencyPairs.GBPUSD, "", CurrencyPairs.SGDUSD, "forLocality", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "lib-store-fx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final class CurrencyPairs {
        public static final String GBPUSD = "GBPUSD";
        public static final CurrencyPairs INSTANCE = new CurrencyPairs();
        public static final String SGDUSD = "SGDUSD";

        private CurrencyPairs() {
        }

        public final String forLocality(CountryCode.Supported locality) {
            Intrinsics.checkNotNullParameter(locality, "locality");
            if (Intrinsics.areEqual(locality, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                return GBPUSD;
            }
            if (Intrinsics.areEqual(locality, CountryCode.Supported.Singapore.INSTANCE)) {
                return SGDUSD;
            }
            throw new IllegalStateException(("Unsupported locality: " + locality).toString());
        }
    }
}
