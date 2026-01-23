package com.robinhood.librobinhood.data.store;

import android.app.Application;
import android.os.PowerManager;
import android.util.LruCache;
import androidx.room.RoomDatabase;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.CommaSeparatedList2;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiOptionQuote;
import com.robinhood.models.dao.OptionQuoteDao;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.coroutine.Flows3;
import com.robinhood.utils.extensions.Maybes2;
import com.robinhood.utils.extensions.PowerManagers;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.ObservablesKt;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;
import p479j$.time.LocalDate;
import timber.log.Timber;

/* compiled from: OptionQuoteStore.kt */
@Metadata(m3635d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005\b\u0007\u0018\u0000 P2\u00020\u0001:\u0001PB9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010!J3\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130$0#2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u0017H\u0002¢\u0006\u0004\b%\u0010&J)\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000#\"\b\b\u0000\u0010(*\u00020'*\b\u0012\u0004\u0012\u00028\u00000#H\u0002¢\u0006\u0004\b)\u0010*J)\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000#\"\b\b\u0000\u0010(*\u00020'*\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0002¢\u0006\u0004\b)\u0010+J/\u0010.\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020-0,0#2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u0017¢\u0006\u0004\b.\u0010/J\u001b\u00100\u001a\b\u0012\u0004\u0012\u00020-0#2\u0006\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b0\u00101J!\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00170#2\u0006\u00102\u001a\u00020\u0010¢\u0006\u0004\b3\u00101J)\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u0017062\u0006\u00102\u001a\u00020\u00102\u0006\u00105\u001a\u000204¢\u0006\u0004\b7\u00108J\u001d\u00109\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b9\u0010:J\u0019\u0010;\u001a\u0006\u0012\u0002\b\u00030#2\u0006\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b;\u00101J#\u00109\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u0017¢\u0006\u0004\b9\u0010<J\u001f\u0010=\u001a\u0006\u0012\u0002\b\u00030#2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u0017¢\u0006\u0004\b=\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010?R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010@R,\u0010B\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00170#0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR(\u0010D\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130$\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\"\u0010G\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130$0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\"\u0010K\u001a\u0010\u0012\f\u0012\n J*\u0004\u0018\u00010\u00140\u00140I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\"\u0010N\u001a\u0010\u0012\f\u0012\n J*\u0004\u0018\u00010M0M0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "optionsApi", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/models/dao/OptionQuoteDao;", "dao", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "optionsExtendedHoursEnabledStore", "Landroid/os/PowerManager;", "powerManager", "Landroid/app/Application;", "application", "<init>", "(Lcom/robinhood/android/api/options/retrofit/OptionsApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/OptionQuoteDao;Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;Landroid/os/PowerManager;Landroid/app/Application;)V", "Ljava/util/UUID;", "instrumentId", "Lkotlin/Function1;", "Lcom/robinhood/models/api/ApiOptionQuote;", "", "saveActionWithLogging", "(Ljava/util/UUID;)Lkotlin/jvm/functions/Function1;", "", "apiOptionQuotes", "", "optionQuoteLog", "(Ljava/util/List;)Ljava/lang/String;", "", "force", "optionInstrumentId", "Lio/reactivex/Maybe;", "createNetworkMaybe", "(ZLjava/util/UUID;)Lio/reactivex/Maybe;", "optionInstrumentIds", "Lio/reactivex/Observable;", "Lcom/robinhood/models/PaginatedResult;", "createListNetworkObservable", "(ZLjava/util/List;)Lio/reactivex/Observable;", "", "T", "poll", "(Lio/reactivex/Observable;)Lio/reactivex/Observable;", "(Lio/reactivex/Maybe;)Lio/reactivex/Observable;", "", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "getAllOptionQuotes", "(Ljava/util/List;)Lio/reactivex/Observable;", "getOptionQuote", "(Ljava/util/UUID;)Lio/reactivex/Observable;", "optionChainId", "getQuotesForOptionSymbol", "j$/time/LocalDate", "expirationDate", "Lkotlinx/coroutines/flow/Flow;", "getQuotesForChainPaginated", "(Ljava/util/UUID;Lj$/time/LocalDate;)Lkotlinx/coroutines/flow/Flow;", "refresh", "(ZLjava/util/UUID;)V", "pollQuote", "(ZLjava/util/List;)V", "pollQuotes", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "Lcom/robinhood/models/dao/OptionQuoteDao;", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "Landroid/util/LruCache;", "quoteForChainIdCache", "Landroid/util/LruCache;", "batchPaginatedSaveAction", "Lkotlin/jvm/functions/Function1;", "", "batchedResults", "Ljava/util/List;", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "kotlin.jvm.PlatformType", "insertBatchedResultsRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "j$/time/Duration", "pollIntervalObs", "Lio/reactivex/Observable;", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionQuoteStore extends Store {
    private static final int MAX_BATCH_SIZE_BY_URL = 35;
    private static final long THROTTLE_UPDATE_MS = 1000;
    private final Function1<PaginatedResult<ApiOptionQuote>, Unit> batchPaginatedSaveAction;
    private final List<PaginatedResult<ApiOptionQuote>> batchedResults;
    private final OptionQuoteDao dao;
    private final BehaviorRelay<Unit> insertBatchedResultsRelay;
    private final OptionsApi optionsApi;
    private final OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore;
    private final Observable<Duration> pollIntervalObs;
    private final LruCache<UUID, Observable<List<OptionInstrumentQuote>>> quoteForChainIdCache;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionQuoteStore(OptionsApi optionsApi, StoreBundle storeBundle, OptionQuoteDao dao, OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore, PowerManager powerManager, Application application) {
        super(storeBundle, OptionInstrumentQuote.INSTANCE);
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
        Intrinsics.checkNotNullParameter(powerManager, "powerManager");
        Intrinsics.checkNotNullParameter(application, "application");
        this.optionsApi = optionsApi;
        this.dao = dao;
        this.optionsExtendedHoursEnabledStore = optionsExtendedHoursEnabledStore;
        this.quoteForChainIdCache = new LruCache<>(5);
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.batchPaginatedSaveAction = new Function1<PaginatedResult<? extends ApiOptionQuote>, Unit>() { // from class: com.robinhood.librobinhood.data.store.OptionQuoteStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PaginatedResult<? extends ApiOptionQuote> paginatedResult) {
                m22692invoke(paginatedResult);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22692invoke(PaginatedResult<? extends ApiOptionQuote> paginatedResult) {
                if (logoutKillswitch.isLoggedOut()) {
                    Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
                    return;
                }
                try {
                    PaginatedResult<? extends ApiOptionQuote> paginatedResult2 = paginatedResult;
                    synchronized (this.batchedResults) {
                        this.batchedResults.add(paginatedResult2);
                    }
                    this.insertBatchedResultsRelay.accept(Unit.INSTANCE);
                } catch (IllegalStateException e) {
                    if (logoutKillswitch.isLoggedOut()) {
                        Timber.INSTANCE.mo3355e(e, "Ignoring exception due to logout.", new Object[0]);
                        try {
                            roomDatabase.close();
                            return;
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                    throw e;
                }
            }
        };
        this.batchedResults = new ArrayList();
        BehaviorRelay<Unit> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.insertBatchedResultsRelay = behaviorRelayCreate;
        Observable<Unit> observableTakeUntil = behaviorRelayCreate.throttleLatest(1L, TimeUnit.SECONDS, Schedulers.m3346io()).takeUntil(getLogoutKillswitch().getKillswitchObservable());
        Intrinsics.checkNotNullExpressionValue(observableTakeUntil, "takeUntil(...)");
        ScopedSubscriptionKt.subscribeIn(observableTakeUntil, getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionQuoteStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionQuoteStore._init_$lambda$5(this.f$0, (Unit) obj);
            }
        });
        Observable<Duration> observableRefCount = PowerManagers.powerSaveModeChanges(powerManager, application).map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionQuoteStore$pollIntervalObs$1
            @Override // io.reactivex.functions.Function
            public final Duration apply(Boolean isInPowerSaveMode) {
                Intrinsics.checkNotNullParameter(isInPowerSaveMode, "isInPowerSaveMode");
                return Duration.ofSeconds(isInPowerSaveMode.booleanValue() ? 5L : 1L);
            }
        }).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        this.pollIntervalObs = observableRefCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.util.Collection] */
    public static final Unit _init_$lambda$5(final OptionQuoteStore optionQuoteStore, Unit unit) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (optionQuoteStore.batchedResults) {
            try {
                Sequence sequenceFilterNotNull = SequencesKt.filterNotNull(SequencesKt.flattenSequenceOfIterable(CollectionsKt.asSequence(optionQuoteStore.batchedResults)));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : sequenceFilterNotNull) {
                    linkedHashMap.put(((ApiOptionQuote) obj).getOption_instrument(), obj);
                }
                objectRef.element = linkedHashMap.values();
                optionQuoteStore.batchedResults.clear();
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        final LogoutKillswitch logoutKillswitch = ((Store) optionQuoteStore).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) optionQuoteStore).roomDatabase;
        new Function1<Iterable<? extends ApiOptionQuote>, Unit>() { // from class: com.robinhood.librobinhood.data.store.OptionQuoteStore$_init_$lambda$5$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Iterable<? extends ApiOptionQuote> iterable) {
                m22690invoke(iterable);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22690invoke(Iterable<? extends ApiOptionQuote> iterable) {
                if (!logoutKillswitch.isLoggedOut()) {
                    try {
                        optionQuoteStore.dao.insert((Iterable<ApiOptionQuote>) iterable);
                        return;
                    } catch (IllegalStateException e) {
                        if (logoutKillswitch.isLoggedOut()) {
                            Timber.INSTANCE.mo3355e(e, "Ignoring exception due to logout.", new Object[0]);
                            try {
                                roomDatabase.close();
                                return;
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                        throw e;
                    }
                }
                Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
            }
        }.invoke(objectRef.element);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String optionQuoteLog(List<ApiOptionQuote> apiOptionQuotes) {
        String str = "";
        for (ApiOptionQuote apiOptionQuote : apiOptionQuotes) {
            if (apiOptionQuote != null) {
                str = ((Object) str) + "\n                    " + apiOptionQuote + "\n                    - option_instrument = " + apiOptionQuote.getOption_instrument() + "\n                    - bid_price = " + apiOptionQuote.getBid_price() + "\n                    - ask_price = " + apiOptionQuote.getAsk_price() + "\n                    - adjusted_mark_price = " + apiOptionQuote.getAdjusted_mark_price() + "\n                    - implied_volatility = " + apiOptionQuote.getImplied_volatility() + "\n                    - volume = " + apiOptionQuote.getVolume() + "\n                    ";
            }
        }
        return str;
    }

    public final Observable<? extends Map<UUID, OptionInstrumentQuote>> getAllOptionQuotes(List<UUID> optionInstrumentIds) {
        Intrinsics.checkNotNullParameter(optionInstrumentIds, "optionInstrumentIds");
        final Flow<List<OptionInstrumentQuote>> allOptionQuotes = this.dao.getAllOptionQuotes(optionInstrumentIds);
        return asObservable(takeWhileLoggedIn(new Flow<Map<UUID, ? extends OptionInstrumentQuote>>() { // from class: com.robinhood.librobinhood.data.store.OptionQuoteStore$getAllOptionQuotes$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Map<UUID, ? extends OptionInstrumentQuote>> flowCollector, Continuation continuation) {
                Object objCollect = allOptionQuotes.collect(new C340892(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.OptionQuoteStore$getAllOptionQuotes$$inlined$map$1$2 */
            public static final class C340892<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionQuoteStore$getAllOptionQuotes$$inlined$map$1$2", m3645f = "OptionQuoteStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.OptionQuoteStore$getAllOptionQuotes$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C340892.this.emit(null, this);
                    }
                }

                public C340892(FlowCollector flowCollector) {
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
                            linkedHashMap.put(((OptionInstrumentQuote) t).getOptionInstrumentId(), t);
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
        }));
    }

    public final Observable<OptionInstrumentQuote> getOptionQuote(UUID optionInstrumentId) {
        Intrinsics.checkNotNullParameter(optionInstrumentId, "optionInstrumentId");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.getOptionQuote(optionInstrumentId))));
    }

    public final Observable<List<OptionInstrumentQuote>> getQuotesForOptionSymbol(UUID optionChainId) {
        Observable<List<OptionInstrumentQuote>> observableRefCount;
        Intrinsics.checkNotNullParameter(optionChainId, "optionChainId");
        synchronized (this.quoteForChainIdCache) {
            observableRefCount = this.quoteForChainIdCache.get(optionChainId);
            if (observableRefCount == null) {
                observableRefCount = asObservable(takeWhileLoggedIn(this.dao.getOptionQuotes(optionChainId))).replay(1).refCount();
                this.quoteForChainIdCache.put(optionChainId, observableRefCount);
            }
        }
        return observableRefCount;
    }

    private final Function1<ApiOptionQuote, Unit> saveActionWithLogging(final UUID instrumentId) {
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        return new Function1<ApiOptionQuote, Unit>() { // from class: com.robinhood.librobinhood.data.store.OptionQuoteStore$saveActionWithLogging$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiOptionQuote apiOptionQuote) {
                m22691invoke(apiOptionQuote);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22691invoke(ApiOptionQuote apiOptionQuote) {
                if (logoutKillswitch.isLoggedOut()) {
                    Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
                    return;
                }
                try {
                    ApiOptionQuote apiOptionQuote2 = apiOptionQuote;
                    try {
                        this.dao.insert(apiOptionQuote2);
                    } catch (IllegalArgumentException e) {
                        Timber.INSTANCE.mo3353e(StringsKt.trimIndent("\n                    Unable to parse response from:\n    \n                    request - /marketdata/options/" + instrumentId + "\n                    \n                    response\n                    " + this.optionQuoteLog(CollectionsKt.listOf(apiOptionQuote2)) + "\n                "), new Object[0]);
                        throw e;
                    }
                } catch (IllegalStateException e2) {
                    if (logoutKillswitch.isLoggedOut()) {
                        Timber.INSTANCE.mo3355e(e2, "Ignoring exception due to logout.", new Object[0]);
                        try {
                            roomDatabase.close();
                            return;
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                    throw e2;
                }
            }
        };
    }

    public final Flow<List<OptionInstrumentQuote>> getQuotesForChainPaginated(UUID optionChainId, LocalDate expirationDate) {
        Intrinsics.checkNotNullParameter(optionChainId, "optionChainId");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        return FlowKt.transformLatest(Flows3.throttleLatest(FlowKt.filterNotNull(this.dao.getOptionQuotesUpdated(optionChainId, expirationDate)), 1000L), new C34090x436feaac(null, this, optionChainId, expirationDate));
    }

    public final void refresh(boolean force, UUID optionInstrumentId) {
        Intrinsics.checkNotNullParameter(optionInstrumentId, "optionInstrumentId");
        ScopedSubscriptionKt.subscribeIn(createNetworkMaybe(force, optionInstrumentId), getStoreScope());
    }

    public final Observable<?> pollQuote(UUID optionInstrumentId) {
        Intrinsics.checkNotNullParameter(optionInstrumentId, "optionInstrumentId");
        refresh(false, optionInstrumentId);
        return poll(createNetworkMaybe(true, optionInstrumentId));
    }

    public final void refresh(boolean force, List<UUID> optionInstrumentIds) {
        Intrinsics.checkNotNullParameter(optionInstrumentIds, "optionInstrumentIds");
        ScopedSubscriptionKt.subscribeIn(createListNetworkObservable(force, optionInstrumentIds), getStoreScope());
    }

    public final Observable<?> pollQuotes(List<UUID> optionInstrumentIds) {
        Intrinsics.checkNotNullParameter(optionInstrumentIds, "optionInstrumentIds");
        refresh(false, optionInstrumentIds);
        return poll(createListNetworkObservable(true, optionInstrumentIds));
    }

    /* compiled from: OptionQuoteStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiOptionQuote;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionQuoteStore$createNetworkMaybe$1", m3645f = "OptionQuoteStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE, EnumC7081g.SDK_ASSET_ICON_PIN_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionQuoteStore$createNetworkMaybe$1 */
    static final class C340921 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiOptionQuote>, Object> {
        final /* synthetic */ UUID $optionInstrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C340921(UUID uuid, Continuation<? super C340921> continuation) {
            super(2, continuation);
            this.$optionInstrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionQuoteStore.this.new C340921(this.$optionInstrumentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiOptionQuote> continuation) {
            return ((C340921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowIsIndexOptionsExtendedHoursEnabled = OptionQuoteStore.this.optionsExtendedHoursEnabledStore.isIndexOptionsExtendedHoursEnabled();
                this.label = 1;
                obj = FlowKt.firstOrNull(flowIsIndexOptionsExtendedHoursEnabled, this);
                if (obj != coroutine_suspended) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            OptionsApi optionsApi = OptionQuoteStore.this.optionsApi;
            UUID uuid = this.$optionInstrumentId;
            boolean zAreEqual = Intrinsics.areEqual((Boolean) obj, boxing.boxBoolean(true));
            this.label = 2;
            Object optionQuote = optionsApi.getOptionQuote(uuid, zAreEqual, this);
            return optionQuote == coroutine_suspended ? coroutine_suspended : optionQuote;
        }
    }

    private final Maybe<ApiOptionQuote> createNetworkMaybe(boolean force, UUID optionInstrumentId) {
        return refresh(RxFactory.DefaultImpls.rxSingle$default(this, null, new C340921(optionInstrumentId, null), 1, null)).key(optionInstrumentId).force(force).saveAction(saveActionWithLogging(optionInstrumentId)).toMaybe(getNetworkWrapper());
    }

    private final Observable<PaginatedResult<ApiOptionQuote>> createListNetworkObservable(boolean force, List<UUID> optionInstrumentIds) {
        Observable observableBuffer = Observable.fromIterable(optionInstrumentIds).buffer(35);
        Intrinsics.checkNotNullExpressionValue(observableBuffer, "buffer(...)");
        Observable<PaginatedResult<ApiOptionQuote>> observableFlatMapMaybe = ObservablesKt.withLatestFrom(observableBuffer, asObservable(this.optionsExtendedHoursEnabledStore.isIndexOptionsExtendedHoursEnabled())).flatMapMaybe(new C340911(force));
        Intrinsics.checkNotNullExpressionValue(observableFlatMapMaybe, "flatMapMaybe(...)");
        return observableFlatMapMaybe;
    }

    /* compiled from: OptionQuoteStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.OptionQuoteStore$createListNetworkObservable$1 */
    static final class C340911<T, R> implements Function {
        final /* synthetic */ boolean $force;

        C340911(boolean z) {
            this.$force = z;
        }

        @Override // io.reactivex.functions.Function
        public final MaybeSource<? extends PaginatedResult<ApiOptionQuote>> apply(Tuples2<? extends List<UUID>, Boolean> tuples2) {
            Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
            List<UUID> listComponent1 = tuples2.component1();
            final Boolean boolComponent2 = tuples2.component2();
            Intrinsics.checkNotNull(listComponent1);
            final CommaSeparatedList commaSeparatedList = CommaSeparatedList2.toCommaSeparatedList(listComponent1);
            final OptionQuoteStore optionQuoteStore = OptionQuoteStore.this;
            return optionQuoteStore.refreshPaginated(new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionQuoteStore$createListNetworkObservable$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionQuoteStore.C340911.apply$lambda$0(optionQuoteStore, commaSeparatedList, boolComponent2, (String) obj);
                }
            }).key(commaSeparatedList.toString()).force(this.$force).saveAction(OptionQuoteStore.this.batchPaginatedSaveAction).toMaybe(OptionQuoteStore.this.getNetworkWrapper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Single apply$lambda$0(OptionQuoteStore optionQuoteStore, CommaSeparatedList commaSeparatedList, Boolean bool, String str) {
            return RxFactory.DefaultImpls.rxSingle$default(optionQuoteStore, null, new OptionQuoteStore2(optionQuoteStore, commaSeparatedList, bool, str, null), 1, null);
        }
    }

    private final <T> Observable<T> poll(final Observable<T> observable) {
        Observable<T> observable2 = (Observable<T>) this.pollIntervalObs.switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionQuoteStore.poll.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends T> apply(Duration interval) {
                Intrinsics.checkNotNullParameter(interval, "interval");
                return com.robinhood.utils.extensions.ObservablesKt.poll(observable, interval, true);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observable2, "switchMap(...)");
        return observable2;
    }

    private final <T> Observable<T> poll(final Maybe<T> maybe) {
        Observable<T> observable = (Observable<T>) this.pollIntervalObs.switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionQuoteStore.poll.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends T> apply(Duration interval) {
                Intrinsics.checkNotNullParameter(interval, "interval");
                return Maybes2.poll(maybe, interval, true);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observable, "switchMap(...)");
        return observable;
    }
}
