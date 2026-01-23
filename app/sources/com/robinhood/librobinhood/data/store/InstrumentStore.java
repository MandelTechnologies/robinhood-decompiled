package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.models.api.ApiInstrument;
import com.robinhood.models.api.ApiInstrumentExternalHalt;
import com.robinhood.models.dao.InstrumentDao;
import com.robinhood.models.dao.InstrumentExternalHaltDao;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p355ui.InstrumentExternalHalt;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.datetime.LocalDates;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Completable;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.chrono.ChronoLocalDate;

/* compiled from: InstrumentStore.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 82\u00020\u0001:\u000289B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100!J\u0014\u0010\"\u001a\u00020#2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100!J.\u0010\u001e\u001a\u00020\u001f\"\u0004\b\u0000\u0010$2\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H$0!2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u0002H$\u0012\u0004\u0012\u00020\u00100'J.\u0010\"\u001a\u00020#\"\u0004\b\u0000\u0010$2\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H$0!2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u0002H$\u0012\u0004\u0012\u00020\u00100'J \u0010(\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001c \u001d*\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u001b0\u001aJ:\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a\"\u0004\b\u0000\u0010$2\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H$0!2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u0002H$\u0012\u0004\u0012\u00020\u00100'J \u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u001bJ\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001a2\u0006\u0010*\u001a\u00020\u0010J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001a2\u0006\u0010,\u001a\u00020\u0014H\u0007J\u0016\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020/2\u0006\u0010*\u001a\u00020\u0010J\"\u00100\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020/2\u0006\u0010,\u001a\u00020\u00142\b\b\u0002\u00101\u001a\u00020/H\u0007J\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020/0\u001a2\u0006\u0010*\u001a\u00020\u0010J\u0016\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u000105072\u0006\u0010*\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00180\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0019\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001c \u001d*\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020504X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/InstrumentDao;", "externalHaltDao", "Lcom/robinhood/models/dao/InstrumentExternalHaltDao;", "equitiesBrokeback", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/InstrumentDao;Lcom/robinhood/models/dao/InstrumentExternalHaltDao;Lcom/robinhood/api/equity/EquitiesBrokeback;Lcom/robinhood/librobinhood/data/store/QuoteStore;)V", "instrumentByIdEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/models/api/ApiInstrument;", "instrumentsByIdsEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "", "instrumentsBySymbolEndpoint", "Lcom/robinhood/librobinhood/data/store/InstrumentStore$InstrumentBySymbolRequest;", "externalHaltEndpoint", "Lcom/robinhood/models/api/ApiInstrumentExternalHalt;", "instrumentCache", "Lio/reactivex/Observable;", "", "Lcom/robinhood/models/db/Instrument;", "kotlin.jvm.PlatformType", "pingInstruments", "", "instrumentIds", "", "pingInstrumentsCompletable", "Lio/reactivex/Completable;", "T", WebsocketGatewayConstants.DATA_KEY, "instrumentIdMapper", "Lkotlin/Function1;", "getInstruments", "getInstrument", "instrumentId", "getInstrumentBySymbol", "symbol", "refresh", "force", "", "refreshBySymbol", "activeInstrumentsOnly", "isPreIpo", "streamExternalHaltQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/ui/InstrumentExternalHalt;", "streamExternalHalt", "Lkotlinx/coroutines/flow/Flow;", "Companion", "InstrumentBySymbolRequest", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class InstrumentStore extends Store {
    public static final int BUFFER_SIZE_FOR_FETCHING_INSTRUMENTS = 75;
    private final InstrumentDao dao;
    private final EquitiesBrokeback equitiesBrokeback;
    private final InstrumentExternalHaltDao externalHaltDao;
    private final Endpoint<UUID, ApiInstrumentExternalHalt> externalHaltEndpoint;
    private final Endpoint<UUID, ApiInstrument> instrumentByIdEndpoint;
    private final Observable<List<Instrument>> instrumentCache;
    private final PaginatedEndpoint<String, ApiInstrument> instrumentsByIdsEndpoint;
    private final PaginatedEndpoint<InstrumentBySymbolRequest, ApiInstrument> instrumentsBySymbolEndpoint;
    private final QuoteStore quoteStore;
    private final Query<UUID, InstrumentExternalHalt> streamExternalHaltQuery;

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID getInstruments$lambda$5(UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID pingInstruments$lambda$2(UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID pingInstrumentsCompletable$lambda$3(UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentStore(StoreBundle storeBundle, InstrumentDao dao, InstrumentExternalHaltDao externalHaltDao, EquitiesBrokeback equitiesBrokeback, QuoteStore quoteStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(externalHaltDao, "externalHaltDao");
        Intrinsics.checkNotNullParameter(equitiesBrokeback, "equitiesBrokeback");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        this.dao = dao;
        this.externalHaltDao = externalHaltDao;
        this.equitiesBrokeback = equitiesBrokeback;
        this.quoteStore = quoteStore;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        InstrumentStore4 instrumentStore4 = new InstrumentStore4(equitiesBrokeback);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        InstrumentStore5 instrumentStore5 = new InstrumentStore5(dao);
        Clock clock = storeBundle.getClock();
        Instrument.Companion companion2 = Instrument.INSTANCE;
        this.instrumentByIdEndpoint = companion.create(instrumentStore4, logoutKillswitch, instrumentStore5, clock, new DefaultStaleDecider(companion2.getNormalStaleTimeout(), storeBundle.getClock()));
        PaginatedEndpoint.Companion companion3 = PaginatedEndpoint.INSTANCE;
        this.instrumentsByIdsEndpoint = companion3.create(new InstrumentStore6(this, null), getLogoutKillswitch(), new InstrumentStore7(dao), storeBundle.getClock(), new DefaultStaleDecider(companion2.getNormalStaleTimeout(), storeBundle.getClock()));
        this.instrumentsBySymbolEndpoint = companion3.create(new InstrumentStore8(this, null), getLogoutKillswitch(), new InstrumentStore9(dao), storeBundle.getClock(), new DefaultStaleDecider(companion2.getNormalStaleTimeout(), storeBundle.getClock()));
        InstrumentStore2 instrumentStore2 = new InstrumentStore2(equitiesBrokeback);
        LogoutKillswitch logoutKillswitch2 = getLogoutKillswitch();
        InstrumentStore3 instrumentStore3 = new InstrumentStore3(this, null);
        Clock clock2 = storeBundle.getClock();
        Duration durationOfMinutes = Duration.ofMinutes(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        this.externalHaltEndpoint = companion.create(instrumentStore2, logoutKillswitch2, instrumentStore3, clock2, new DefaultStaleDecider(durationOfMinutes, storeBundle.getClock()));
        Observable<List<Instrument>> observableRefCount = asObservable(dao.getInstruments()).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        this.instrumentCache = observableRefCount;
        this.streamExternalHaltQuery = Store.create$default(this, Query.INSTANCE, "streamExternalHaltQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.InstrumentStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentStore.streamExternalHaltQuery$lambda$8(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.InstrumentStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentStore.streamExternalHaltQuery$lambda$9(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object instrumentByIdEndpoint$insert(InstrumentDao instrumentDao, ApiInstrument apiInstrument, Continuation continuation) {
        instrumentDao.insert(apiInstrument);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object instrumentsByIdsEndpoint$insert$0(InstrumentDao instrumentDao, Iterable iterable, Continuation continuation) {
        instrumentDao.insert((Iterable<ApiInstrument>) iterable);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object instrumentsBySymbolEndpoint$insert$1(InstrumentDao instrumentDao, Iterable iterable, Continuation continuation) {
        instrumentDao.insert((Iterable<ApiInstrument>) iterable);
        return Unit.INSTANCE;
    }

    public final void pingInstruments(Iterable<UUID> instrumentIds) {
        Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
        pingInstruments(instrumentIds, new Function1() { // from class: com.robinhood.librobinhood.data.store.InstrumentStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentStore.pingInstruments$lambda$2((UUID) obj);
            }
        });
    }

    public final Completable pingInstrumentsCompletable(Iterable<UUID> instrumentIds) {
        Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
        return pingInstrumentsCompletable(instrumentIds, new Function1() { // from class: com.robinhood.librobinhood.data.store.InstrumentStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentStore.pingInstrumentsCompletable$lambda$3((UUID) obj);
            }
        });
    }

    public final <T> void pingInstruments(Iterable<? extends T> data, Function1<? super T, UUID> instrumentIdMapper) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(instrumentIdMapper, "instrumentIdMapper");
        ScopedSubscriptionKt.subscribeIn(pingInstrumentsCompletable(data, instrumentIdMapper), getStoreScope());
    }

    public final <T> Completable pingInstrumentsCompletable(Iterable<? extends T> data, Function1<? super T, UUID> instrumentIdMapper) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(instrumentIdMapper, "instrumentIdMapper");
        final Iterable iterableAsIterable = SequencesKt.asIterable(SequencesKt.filter(SequencesKt.distinct(SequencesKt.map(CollectionsKt.asSequence(data), instrumentIdMapper)), new Function1() { // from class: com.robinhood.librobinhood.data.store.InstrumentStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(InstrumentStore.pingInstrumentsCompletable$lambda$4(this.f$0, (UUID) obj));
            }
        }));
        Completable completableFlatMapCompletable = this.instrumentCache.take(1L).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.InstrumentStore.pingInstrumentsCompletable.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends UUID> apply(List<Instrument> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Observable.fromIterable(iterableAsIterable);
            }
        }).buffer(75).flatMapCompletable(new Function() { // from class: com.robinhood.librobinhood.data.store.InstrumentStore.pingInstrumentsCompletable.3
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(List<UUID> instrumentIds) {
                Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
                return Completable.create(new AnonymousClass1(InstrumentStore.this, CollectionsKt.joinToString$default(instrumentIds, ",", null, null, 0, null, null, 62, null)));
            }

            /* compiled from: InstrumentStore.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.librobinhood.data.store.InstrumentStore$pingInstrumentsCompletable$3$1, reason: invalid class name */
            static final class AnonymousClass1 implements CompletableOnSubscribe {
                final /* synthetic */ String $commaSeparatedIds;
                final /* synthetic */ InstrumentStore this$0;

                AnonymousClass1(InstrumentStore instrumentStore, String str) {
                    this.this$0 = instrumentStore;
                    this.$commaSeparatedIds = str;
                }

                @Override // io.reactivex.CompletableOnSubscribe
                public final void subscribe(final CompletableEmitter maybeEmitter) {
                    Intrinsics.checkNotNullParameter(maybeEmitter, "maybeEmitter");
                    try {
                        this.this$0.instrumentsByIdsEndpoint.refreshAllPages(this.$commaSeparatedIds, true).invokeOnCompletion(new Function1() { // from class: com.robinhood.librobinhood.data.store.InstrumentStore$pingInstrumentsCompletable$3$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return InstrumentStore.C339133.AnonymousClass1.subscribe$lambda$0(maybeEmitter, (Throwable) obj);
                            }
                        });
                    } catch (Exception e) {
                        maybeEmitter.onError(e);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit subscribe$lambda$0(CompletableEmitter completableEmitter, Throwable th) {
                    completableEmitter.onComplete();
                    return Unit.INSTANCE;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
        return completableFlatMapCompletable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pingInstrumentsCompletable$lambda$4(InstrumentStore instrumentStore, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Function2<String, Instant, Boolean> staleDecider = instrumentStore.getStaleDecider();
        String string2 = instrumentId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return staleDecider.invoke(string2, null).booleanValue();
    }

    public final Observable<List<Instrument>> getInstruments() {
        return this.instrumentCache;
    }

    public final <T> Observable<List<Instrument>> getInstruments(final Iterable<? extends T> data, final Function1<? super T, UUID> instrumentIdMapper) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(instrumentIdMapper, "instrumentIdMapper");
        Observable<R> map = this.instrumentCache.map(new Function() { // from class: com.robinhood.librobinhood.data.store.InstrumentStore.getInstruments.1
            @Override // io.reactivex.functions.Function
            public final Optional<List<Instrument>> apply(List<Instrument> instruments) {
                T next;
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = data.iterator();
                while (it.hasNext()) {
                    UUID uuidInvoke = instrumentIdMapper.invoke(it.next());
                    Iterator<T> it2 = instruments.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = (T) null;
                            break;
                        }
                        next = it2.next();
                        if (Intrinsics.areEqual(((Instrument) next).getId(), uuidInvoke)) {
                            break;
                        }
                    }
                    Instrument instrument = next;
                    if (instrument == null) {
                        return Optional2.INSTANCE;
                    }
                    arrayList.add(instrument);
                }
                return Optional3.asOptional(arrayList);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable<List<Instrument>> observableSubscribeOn = ObservablesKt.filterIsPresent(map).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        return observableSubscribeOn;
    }

    public final Observable<List<Instrument>> getInstruments(List<UUID> instrumentIds) {
        Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
        return getInstruments(instrumentIds, new Function1() { // from class: com.robinhood.librobinhood.data.store.InstrumentStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentStore.getInstruments$lambda$5((UUID) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getInstrument$lambda$6(UUID uuid, Instrument it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getId(), uuid);
    }

    public final Observable<Instrument> getInstrument(final UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return ObservablesKt.firstOrEmpty(getInstruments(), new Function1() { // from class: com.robinhood.librobinhood.data.store.InstrumentStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(InstrumentStore.getInstrument$lambda$6(instrumentId, (Instrument) obj));
            }
        });
    }

    @Deprecated
    public final Observable<Instrument> getInstrumentBySymbol(String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        final String upperCase = symbol.toUpperCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return ObservablesKt.firstOrEmpty(getInstruments(), new Function1() { // from class: com.robinhood.librobinhood.data.store.InstrumentStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(InstrumentStore.getInstrumentBySymbol$lambda$7(upperCase, (Instrument) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getInstrumentBySymbol$lambda$7(String str, Instrument it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getSymbol(), str);
    }

    public final void refresh(boolean force, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Endpoint.DefaultImpls.refresh$default(this.instrumentByIdEndpoint, instrumentId, force, null, 4, null);
    }

    public static /* synthetic */ void refreshBySymbol$default(InstrumentStore instrumentStore, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = true;
        }
        instrumentStore.refreshBySymbol(z, str, z2);
    }

    @Deprecated
    public final void refreshBySymbol(boolean force, String symbol, boolean activeInstrumentsOnly) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String upperCase = symbol.toUpperCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        this.instrumentsBySymbolEndpoint.refreshAllPages(new InstrumentBySymbolRequest(upperCase, activeInstrumentsOnly), force);
    }

    public final Observable<Boolean> isPreIpo(final UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        final LocalDate localDateCurrentDateInEst$default = LocalDates.currentDateInEst$default(null, 1, null);
        refresh(false, instrumentId);
        Observable observableFlatMap = getInstrument(instrumentId).take(1L).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.InstrumentStore.isPreIpo.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Boolean> apply(final Instrument instrument) {
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                Observable<R> map = InstrumentStore.this.quoteStore.getStreamQuote().asObservable(instrumentId).map(new Function() { // from class: com.robinhood.librobinhood.data.store.InstrumentStore.isPreIpo.1.1
                    @Override // io.reactivex.functions.Function
                    public final Boolean apply(Quote it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Boolean.valueOf(!it.getHasTraded());
                    }
                });
                final LocalDate localDate = localDateCurrentDateInEst$default;
                return map.onErrorReturn(new Function() { // from class: com.robinhood.librobinhood.data.store.InstrumentStore.isPreIpo.1.2
                    @Override // io.reactivex.functions.Function
                    public final Boolean apply(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Boolean.valueOf(instrument.getListDate() != null && localDate.compareTo((ChronoLocalDate) instrument.getListDate()) < 0 && (instrument.isPreIpo() || instrument.isStock()));
                    }
                }).distinctUntilChanged();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return observableFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamExternalHaltQuery$lambda$8(InstrumentStore instrumentStore, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return Endpoint.DefaultImpls.poll$default(instrumentStore.externalHaltEndpoint, instrumentId, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamExternalHaltQuery$lambda$9(InstrumentStore instrumentStore, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return instrumentStore.externalHaltDao.streamInstrumentExternalHalt(instrumentId);
    }

    public final Flow<InstrumentExternalHalt> streamExternalHalt(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return this.streamExternalHaltQuery.asFlow(instrumentId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: InstrumentStore.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/InstrumentStore$InstrumentBySymbolRequest;", "", "symbol", "", "activeInstrumentsOnly", "", "<init>", "(Ljava/lang/String;Z)V", "getSymbol", "()Ljava/lang/String;", "getActiveInstrumentsOnly", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class InstrumentBySymbolRequest {
        private final boolean activeInstrumentsOnly;
        private final String symbol;

        public static /* synthetic */ InstrumentBySymbolRequest copy$default(InstrumentBySymbolRequest instrumentBySymbolRequest, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = instrumentBySymbolRequest.symbol;
            }
            if ((i & 2) != 0) {
                z = instrumentBySymbolRequest.activeInstrumentsOnly;
            }
            return instrumentBySymbolRequest.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getActiveInstrumentsOnly() {
            return this.activeInstrumentsOnly;
        }

        public final InstrumentBySymbolRequest copy(String symbol, boolean activeInstrumentsOnly) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            return new InstrumentBySymbolRequest(symbol, activeInstrumentsOnly);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InstrumentBySymbolRequest)) {
                return false;
            }
            InstrumentBySymbolRequest instrumentBySymbolRequest = (InstrumentBySymbolRequest) other;
            return Intrinsics.areEqual(this.symbol, instrumentBySymbolRequest.symbol) && this.activeInstrumentsOnly == instrumentBySymbolRequest.activeInstrumentsOnly;
        }

        public int hashCode() {
            return (this.symbol.hashCode() * 31) + Boolean.hashCode(this.activeInstrumentsOnly);
        }

        public String toString() {
            return "InstrumentBySymbolRequest(symbol=" + this.symbol + ", activeInstrumentsOnly=" + this.activeInstrumentsOnly + ")";
        }

        public InstrumentBySymbolRequest(String symbol, boolean z) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            this.symbol = symbol;
            this.activeInstrumentsOnly = z;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final boolean getActiveInstrumentsOnly() {
            return this.activeInstrumentsOnly;
        }
    }
}
