package com.robinhood.librobinhood.data.store;

import android.app.Application;
import android.os.PowerManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.Batch;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.directipo.models.api.ApiIpoQuote;
import com.robinhood.directipo.models.p292db.IpoQuote;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.experiments.OptionsEquityFastQuotePolling;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiInstrumentPrice;
import com.robinhood.models.api.ApiQuote;
import com.robinhood.models.dao.IpoQuoteDao;
import com.robinhood.models.dao.QuoteDao;
import com.robinhood.models.p320db.InstrumentPrice;
import com.robinhood.models.p320db.InstrumentPrice2;
import com.robinhood.models.p320db.Quote;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.PowerManagers;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Duration;

/* compiled from: QuoteStore.kt */
@Metadata(m3635d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u0000 J2\u00020\u0001:\u0001JBI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010$\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00170#0\"2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140 ¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\"\u0010/\u001a\u0010\u0012\f\u0012\n .*\u0004\u0018\u00010-0-0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R+\u00103\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140#\u0012\u0006\u0012\u0004\u0018\u000102018\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u000202078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R(\u0010;\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140#\u0012\u0006\u0012\u0004\u0018\u00010:018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00104R&\u0010>\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00170<8\u0006¢\u0006\f\n\u0004\b\u001a\u0010?\u001a\u0004\b@\u0010AR#\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020B0<8\u0006¢\u0006\f\n\u0004\bC\u0010?\u001a\u0004\bD\u0010AR8\u0010F\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170E0<8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bF\u0010?\u0012\u0004\bH\u0010I\u001a\u0004\bG\u0010A¨\u0006K"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/QuoteStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/models/dao/QuoteDao;", "quoteDao", "Lcom/robinhood/models/dao/IpoQuoteDao;", "ipoQuoteDao", "Lcom/robinhood/api/retrofit/Brokeback;", "brokeback", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "equitiesBrokeback", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Landroid/os/PowerManager;", "powerManager", "Landroid/app/Application;", "application", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/QuoteDao;Lcom/robinhood/models/dao/IpoQuoteDao;Lcom/robinhood/api/retrofit/Brokeback;Lcom/robinhood/api/equity/EquitiesBrokeback;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Landroid/os/PowerManager;Landroid/app/Application;)V", "Ljava/util/UUID;", "instrumentId", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/Quote;", "streamQuoteInternal", "(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "streamQuote", "", "force", "", "refresh", "(ZLjava/util/UUID;)V", "", "instrumentIds", "Lio/reactivex/Observable;", "", "pollQuotesByInstrumentIds", "(Ljava/util/Collection;)Lio/reactivex/Observable;", "Lcom/robinhood/models/db/InstrumentPrice;", "getInstrumentPrice", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/dao/QuoteDao;", "Lcom/robinhood/models/dao/IpoQuoteDao;", "Lcom/robinhood/api/retrofit/Brokeback;", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "j$/time/Duration", "kotlin.jvm.PlatformType", "pollIntervalObs", "Lio/reactivex/Observable;", "Lcom/robinhood/api/PaginatedEndpoint;", "Lcom/robinhood/models/api/ApiQuote;", "getQuotes", "Lcom/robinhood/api/PaginatedEndpoint;", "getGetQuotes", "()Lcom/robinhood/api/PaginatedEndpoint;", "Lcom/robinhood/android/moria/network/Endpoint;", "getQuote", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/directipo/models/api/ApiIpoQuote;", "getIpoQuotes", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/utils/Optional;", "quoteQuery", "Lcom/robinhood/android/moria/db/Query;", "getStreamQuote", "()Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/directipo/models/db/IpoQuote;", "streamIpoQuote", "getStreamIpoQuote", "", "streamAllQuotes", "getStreamAllQuotes", "getStreamAllQuotes$annotations", "()V", "Companion", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class QuoteStore extends Store {
    public static final long DEFAULT_INCREASED_POLL = 500;
    public static final long DEFAULT_POLL = 1000;
    public static final int MAX_BATCH_SIZE_BY_UUID = 125;
    public static final long POWER_SAVE_MODE_INCREASED_POLL = 1000;
    public static final long POWER_SAVE_MODE_POLL = 5000;
    private final Brokeback brokeback;
    private final EquitiesBrokeback equitiesBrokeback;
    private final PaginatedEndpoint<Iterable<UUID>, ApiIpoQuote> getIpoQuotes;
    private final Endpoint<UUID, ApiQuote> getQuote;
    private final PaginatedEndpoint<Iterable<UUID>, ApiQuote> getQuotes;
    private final IpoQuoteDao ipoQuoteDao;
    private final Observable<Duration> pollIntervalObs;
    private final QuoteDao quoteDao;
    private final Query<UUID, Optional<Quote>> quoteQuery;
    private final Query<Iterable<UUID>, List<Quote>> streamAllQuotes;
    private final Query<UUID, IpoQuote> streamIpoQuote;
    private final Query<UUID, Quote> streamQuote;

    /* compiled from: QuoteStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.QuoteStore", m3645f = "QuoteStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE}, m3647m = "getInstrumentPrice")
    /* renamed from: com.robinhood.librobinhood.data.store.QuoteStore$getInstrumentPrice$1 */
    static final class C342711 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C342711(Continuation<? super C342711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return QuoteStore.this.getInstrumentPrice(null, this);
        }
    }

    @Deprecated
    public static /* synthetic */ void getStreamAllQuotes$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuoteStore(StoreBundle storeBundle, QuoteDao quoteDao, IpoQuoteDao ipoQuoteDao, Brokeback brokeback, EquitiesBrokeback equitiesBrokeback, ExperimentsStore experimentsStore, PowerManager powerManager, Application application) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(quoteDao, "quoteDao");
        Intrinsics.checkNotNullParameter(ipoQuoteDao, "ipoQuoteDao");
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(equitiesBrokeback, "equitiesBrokeback");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(powerManager, "powerManager");
        Intrinsics.checkNotNullParameter(application, "application");
        this.quoteDao = quoteDao;
        this.ipoQuoteDao = ipoQuoteDao;
        this.brokeback = brokeback;
        this.equitiesBrokeback = equitiesBrokeback;
        Observables observables = Observables.INSTANCE;
        Observable observableCombineLatest = Observable.combineLatest(PowerManagers.powerSaveModeChanges(powerManager, application), ExperimentsProvider.DefaultImpls.streamState$default(experimentsStore, new Experiment[]{OptionsEquityFastQuotePolling.INSTANCE}, false, null, 6, null), new BiFunction<T1, T2, R>() { // from class: com.robinhood.librobinhood.data.store.QuoteStore$special$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                boolean zBooleanValue = ((Boolean) t2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) t1).booleanValue();
                if (zBooleanValue) {
                    return (R) Duration.ofMillis(zBooleanValue2 ? 1000L : 500L);
                }
                return (R) Duration.ofMillis(zBooleanValue2 ? 5000L : 1000L);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        Observable<Duration> observableRefCount = observableCombineLatest.replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        this.pollIntervalObs = observableRefCount;
        PaginatedEndpoint.Companion companion = PaginatedEndpoint.INSTANCE;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.getQuotes = PaginatedEndpoint.Companion.createBatched$default(companion, 125, new QuoteStore6(this, null), getLogoutKillswitch(), new QuoteStore7(this, null), storeBundle.getClock(), null, 32, null);
        this.getQuote = Endpoint.Companion.create$default(Endpoint.INSTANCE, new QuoteStore4(this, null), getLogoutKillswitch(), new QuoteStore5(this, null), storeBundle.getClock(), null, 16, null);
        this.getIpoQuotes = PaginatedEndpoint.Companion.createBatched$default(companion, 125, new QuoteStore2(this, null), getLogoutKillswitch(), new QuoteStore3(this, null), storeBundle.getClock(), null, 32, null);
        Query.Companion companion2 = Query.INSTANCE;
        int i = 12;
        int i2 = 125;
        boolean z = false;
        long j = 0;
        this.quoteQuery = Store.createOptional$default(this, companion2, "quoteQuery", CollectionsKt.listOf(new Batch(getStoreScope(), i2, z, j, new Function1() { // from class: com.robinhood.librobinhood.data.store.QuoteStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuoteStore.quoteQuery$lambda$2(this.f$0, (Collection) obj);
            }
        }, i, defaultConstructorMarker)), new QuoteStore8(quoteDao), false, 8, null);
        this.streamQuote = Store.create$default(this, companion2, CollectionsKt.emptyList(), new C342742(this), false, 4, null);
        this.streamIpoQuote = Store.create$default(this, companion2, CollectionsKt.listOf(new Batch(getStoreScope(), i2, z, j, new Function1() { // from class: com.robinhood.librobinhood.data.store.QuoteStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuoteStore.streamIpoQuote$lambda$5(this.f$0, (Collection) obj);
            }
        }, i, defaultConstructorMarker)), new QuoteStore9(ipoQuoteDao), false, 4, null);
        this.streamAllQuotes = Store.create$default(this, companion2, "streamAllQuotes", CollectionsKt.emptyList(), new Function1() { // from class: com.robinhood.librobinhood.data.store.QuoteStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuoteStore.streamAllQuotes$lambda$6(this.f$0, (Iterable) obj);
            }
        }, false, 8, null);
    }

    public final PaginatedEndpoint<Iterable<UUID>, ApiQuote> getGetQuotes() {
        return this.getQuotes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow quoteQuery$lambda$2(QuoteStore quoteStore, Collection uuids) {
        Intrinsics.checkNotNullParameter(uuids, "uuids");
        return FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(quoteStore.pollIntervalObs), Integer.MAX_VALUE, null, 2, null), new QuoteStore$quoteQuery$lambda$2$$inlined$flatMapLatest$1(null, quoteStore, uuids));
    }

    public final Flow<Quote> streamQuote(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        final Flow<Optional<Quote>> flowAsFlow = this.quoteQuery.asFlow(instrumentId);
        return new Flow<Quote>() { // from class: com.robinhood.librobinhood.data.store.QuoteStore$streamQuote$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Quote> flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new C342692(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.QuoteStore$streamQuote$$inlined$map$1$2 */
            public static final class C342692<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.QuoteStore$streamQuote$$inlined$map$1$2", m3645f = "QuoteStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.QuoteStore$streamQuote$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C342692.this.emit(null, this);
                    }
                }

                public C342692(FlowCollector flowCollector) {
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
    }

    public final Query<UUID, Quote> getStreamQuote() {
        return this.streamQuote;
    }

    /* compiled from: QuoteStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.QuoteStore$streamQuote$2 */
    /* synthetic */ class C342742 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends Quote>> {
        C342742(Object obj) {
            super(1, obj, QuoteStore.class, "streamQuoteInternal", "streamQuoteInternal(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Flow<Quote> invoke(UUID p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((QuoteStore) this.receiver).streamQuoteInternal(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<Quote> streamQuoteInternal(UUID instrumentId) {
        final Flow<Quote> flowStreamQuote = streamQuote(instrumentId);
        return new Flow<Quote>() { // from class: com.robinhood.librobinhood.data.store.QuoteStore$streamQuoteInternal$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Quote> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamQuote.collect(new C342702(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.QuoteStore$streamQuoteInternal$$inlined$mapNotNull$1$2 */
            public static final class C342702<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.QuoteStore$streamQuoteInternal$$inlined$mapNotNull$1$2", m3645f = "QuoteStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.QuoteStore$streamQuoteInternal$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        return C342702.this.emit(null, this);
                    }
                }

                public C342702(FlowCollector flowCollector) {
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
                        Quote quote = (Quote) obj;
                        if (quote != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(quote, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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

    public final Query<UUID, IpoQuote> getStreamIpoQuote() {
        return this.streamIpoQuote;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamIpoQuote$lambda$5(QuoteStore quoteStore, Collection instrumentIds) {
        Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
        return quoteStore.getIpoQuotes.fetchAllPages(instrumentIds);
    }

    public final Query<Iterable<UUID>, List<Quote>> getStreamAllQuotes() {
        return this.streamAllQuotes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamAllQuotes$lambda$6(QuoteStore quoteStore, Iterable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return quoteStore.quoteDao.getAllQuotes();
    }

    public final void refresh(boolean force, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Endpoint.DefaultImpls.refresh$default(this.getQuote, instrumentId, force, null, 4, null);
    }

    public final Observable<? extends Iterable<Quote>> pollQuotesByInstrumentIds(final Collection<UUID> instrumentIds) {
        Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
        if (instrumentIds.isEmpty()) {
            Observable<? extends Iterable<Quote>> observableEmpty = Observable.empty();
            Intrinsics.checkNotNull(observableEmpty);
            return observableEmpty;
        }
        Observable<? extends Iterable<Quote>> map = this.pollIntervalObs.switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.QuoteStore.pollQuotesByInstrumentIds.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends PaginatedResult<ApiQuote>> apply(Duration interval) {
                Intrinsics.checkNotNullParameter(interval, "interval");
                QuoteStore quoteStore = QuoteStore.this;
                return quoteStore.asObservable(quoteStore.getGetQuotes().pollAllPages(instrumentIds, interval));
            }
        }).map(new Function() { // from class: com.robinhood.librobinhood.data.store.QuoteStore.pollQuotesByInstrumentIds.2
            @Override // io.reactivex.functions.Function
            public final List<Quote> apply(PaginatedResult<ApiQuote> quotes) {
                Intrinsics.checkNotNullParameter(quotes, "quotes");
                ArrayList arrayList = new ArrayList();
                Iterator<ApiQuote> it = quotes.iterator();
                while (it.hasNext()) {
                    ApiQuote next = it.next();
                    Quote dbQuote$default = next != null ? ApiQuote.toDbQuote$default(next, null, 1, null) : null;
                    if (dbQuote$default != null) {
                        arrayList.add(dbQuote$default);
                    }
                }
                return arrayList;
            }
        });
        Intrinsics.checkNotNull(map);
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getInstrumentPrice(UUID uuid, Continuation<? super InstrumentPrice> continuation) {
        C342711 c342711;
        Object objM28550constructorimpl;
        if (continuation instanceof C342711) {
            c342711 = (C342711) continuation;
            int i = c342711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c342711.label = i - Integer.MIN_VALUE;
            } else {
                c342711 = new C342711(continuation);
            }
        }
        Object instrumentPrice = c342711.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c342711.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(instrumentPrice);
                Result.Companion companion = Result.INSTANCE;
                EquitiesBrokeback equitiesBrokeback = this.equitiesBrokeback;
                Boolean boolBoxBoolean = boxing.boxBoolean(true);
                c342711.label = 1;
                instrumentPrice = equitiesBrokeback.getInstrumentPrice(uuid, boolBoxBoolean, c342711);
                if (instrumentPrice == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(instrumentPrice);
            }
            objM28550constructorimpl = Result.m28550constructorimpl(InstrumentPrice2.toDbModel((ApiInstrumentPrice) instrumentPrice));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            return null;
        }
        return objM28550constructorimpl;
    }
}
