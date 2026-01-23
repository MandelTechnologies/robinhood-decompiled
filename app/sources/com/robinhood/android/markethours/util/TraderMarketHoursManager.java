package com.robinhood.android.markethours.util;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.markethours.data.store.MarketHoursStore;
import com.robinhood.android.markethours.extensions.Clocks;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.EquityOrderSession;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.SessionBehavior;
import com.robinhood.models.p320db.TradingSession;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.HyperExtendedPref;
import com.robinhood.store.base.MarketHoursManager;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.datetime.ZoneIds;
import com.robinhood.utils.extensions.Disposable4;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZoneOffset;

/* compiled from: TraderMarketHoursManager.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 T2\u00020\u0001:\u0001TB-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0018\u001a\u00020\u00172\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00150\u0014\"\u0004\u0018\u00010\u0015H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001bJ'\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\"2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\"¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001fH\u0016¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001f0\"H\u0016¢\u0006\u0004\b/\u0010&J#\u00102\u001a\b\u0012\u0004\u0012\u00020\f0\"2\u0006\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u001f¢\u0006\u0004\b2\u0010$J\u0015\u00103\u001a\b\u0012\u0004\u0012\u00020\u001f0\"H\u0016¢\u0006\u0004\b3\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00107R\u0018\u00108\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\f0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010A\u001a\n @*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00106R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020'0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0B8\u0006¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bE\u0010FR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0B8\u0006¢\u0006\f\n\u0004\b\u000e\u0010D\u001a\u0004\bG\u0010FR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010DR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00110B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010DR\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00110I8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\b\u0012\u0010LR\u001a\u0010P\u001a\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\bO\u0010\u001b\u001a\u0004\bM\u0010NR\u0017\u0010R\u001a\b\u0012\u0004\u0012\u00020\f0\"8F¢\u0006\u0006\u001a\u0004\bQ\u0010&R\u0011\u0010-\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b-\u0010,R\u0011\u0010S\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bS\u0010,¨\u0006U"}, m3636d2 = {"Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "Lcom/robinhood/store/base/MarketHoursManager;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lcom/robinhood/prefs/BooleanPreference;", "hyperExtendedPref", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "marketHoursStore", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/prefs/BooleanPreference;Lj$/time/Clock;Lcom/robinhood/android/markethours/data/store/MarketHoursStore;)V", "Lcom/robinhood/models/db/MarketHours;", "todaysMarketHours", "nextOpenMarketHours", "Lcom/robinhood/models/db/EquityOrderSession;", "shortSellOrderSession", "Lcom/robinhood/models/db/TradingSession;", "getCurrentTradingSession", "(Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/EquityOrderSession;)Lcom/robinhood/models/db/TradingSession;", "", "j$/time/Instant", "time", "", "delayUntilNearestTime", "([Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reset", "()V", "fetchNewMarketHours", "fetchCurrentMarketHours", "resetIfNewDay", "", "includeToday", "force", "Lio/reactivex/Observable;", "openMarketHoursObservable", "(ZZ)Lio/reactivex/Observable;", "nextOpenMarketHoursObservable", "()Lio/reactivex/Observable;", "j$/time/LocalDate", InquiryField.DateField.TYPE, "bestGuessForDate", "(Lj$/time/LocalDate;)Lcom/robinhood/models/db/MarketHours;", "areMarketsOpenExtended", "()Z", "isPreMarket", "(Lj$/time/Instant;)Z", "marketChangesObservable", "allDayHours", "extendedHours", "effectiveMarketHoursObservable", "streamIsAdtHours", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/robinhood/prefs/BooleanPreference;", "Lj$/time/Clock;", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "today", "Lj$/time/LocalDate;", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "marketHoursRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lio/reactivex/disposables/Disposable;", "openDisposable", "Lio/reactivex/disposables/Disposable;", "kotlin.jvm.PlatformType", "estClock", "Lkotlinx/coroutines/flow/SharedFlow;", "currentMarketDate", "Lkotlinx/coroutines/flow/SharedFlow;", "getTodaysMarketHours", "()Lkotlinx/coroutines/flow/SharedFlow;", "getNextOpenMarketHours", "_currentTradingSession", "Lkotlinx/coroutines/flow/Flow;", "currentTradingSession", "Lkotlinx/coroutines/flow/Flow;", "()Lkotlinx/coroutines/flow/Flow;", "getCurrentMarketHours", "()Lcom/robinhood/models/db/MarketHours;", "getCurrentMarketHours$annotations", "currentMarketHours", "getCurrentMarketHoursObservable", "currentMarketHoursObservable", "isExtendedHours", "Companion", "lib-market-hours_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class TraderMarketHoursManager implements MarketHoursManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int NUM_DAYS_IN_ADVANCE_TO_FETCH = 3;
    private final SharedFlow<TradingSession> _currentTradingSession;
    private final Clock clock;
    private final CoroutineScope coroutineScope;
    private final SharedFlow<LocalDate> currentMarketDate;
    private final Flow<TradingSession> currentTradingSession;
    private final Clock estClock;
    private final BooleanPreference hyperExtendedPref;
    private final BehaviorRelay<MarketHours> marketHoursRelay;
    private final MarketHoursStore marketHoursStore;
    private final SharedFlow<MarketHours> nextOpenMarketHours;
    private Disposable openDisposable;
    private final SharedFlow<EquityOrderSession> shortSellOrderSession;
    private LocalDate today;
    private final SharedFlow<MarketHours> todaysMarketHours;

    @Deprecated
    public static /* synthetic */ void getCurrentMarketHours$annotations() {
    }

    public TraderMarketHoursManager(@RootCoroutineScope CoroutineScope coroutineScope, @HyperExtendedPref BooleanPreference hyperExtendedPref, Clock clock, MarketHoursStore marketHoursStore) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(hyperExtendedPref, "hyperExtendedPref");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
        this.coroutineScope = coroutineScope;
        this.hyperExtendedPref = hyperExtendedPref;
        this.clock = clock;
        this.marketHoursStore = marketHoursStore;
        BehaviorRelay<MarketHours> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.marketHoursRelay = behaviorRelayCreate;
        this.estClock = clock.withZone(ZoneIds.INSTANCE.getNEW_YORK());
        Flow flow = FlowKt.flow(new TraderMarketHoursManager4(this, null));
        SharingStarted.Companion companion = SharingStarted.INSTANCE;
        SharedFlow<LocalDate> sharedFlowShareIn = FlowKt.shareIn(flow, coroutineScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.currentMarketDate = sharedFlowShareIn;
        SharedFlow<MarketHours> sharedFlowShareIn2 = FlowKt.shareIn(FlowKt.distinctUntilChanged(FlowKt.transformLatest(sharedFlowShareIn, new TraderMarketHoursManager$special$$inlined$flatMapLatest$1(null, this))), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.todaysMarketHours = sharedFlowShareIn2;
        SharedFlow<MarketHours> sharedFlowShareIn3 = FlowKt.shareIn(FlowKt.distinctUntilChanged(FlowKt.transformLatest(sharedFlowShareIn2, new TraderMarketHoursManager$special$$inlined$flatMapLatest$2(null, this))), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.nextOpenMarketHours = sharedFlowShareIn3;
        SharedFlow<EquityOrderSession> sharedFlowShareIn4 = FlowKt.shareIn(FlowKt.distinctUntilChanged(FlowKt.transformLatest(sharedFlowShareIn, new TraderMarketHoursManager$special$$inlined$flatMapLatest$3(null, this))), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.shortSellOrderSession = sharedFlowShareIn4;
        SharedFlow<TradingSession> sharedFlowShareIn5 = FlowKt.shareIn(FlowKt.transformLatest(FlowKt.combine(sharedFlowShareIn2, sharedFlowShareIn3, sharedFlowShareIn4, new TraderMarketHoursManager2(null)), new TraderMarketHoursManager3(this, null)), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this._currentTradingSession = sharedFlowShareIn5;
        this.currentTradingSession = FlowKt.distinctUntilChanged(sharedFlowShareIn5);
        reset();
    }

    public final Observable<MarketHours> getCurrentMarketHoursObservable() {
        Observable<MarketHours> observableHide = this.marketHoursRelay.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    public static /* synthetic */ Observable openMarketHoursObservable$default(TraderMarketHoursManager traderMarketHoursManager, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return traderMarketHoursManager.openMarketHoursObservable(z, z2);
    }

    public final Observable<MarketHours> openMarketHoursObservable(final boolean includeToday, final boolean force) {
        Observable observableSwitchMap = getCurrentMarketHoursObservable().distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.markethours.util.TraderMarketHoursManager.openMarketHoursObservable.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends MarketHours> apply(MarketHours marketHours) {
                Intrinsics.checkNotNullParameter(marketHours, "marketHours");
                if (includeToday && marketHours.isOpen()) {
                    Observable observableJust = Observable.just(marketHours);
                    Intrinsics.checkNotNull(observableJust);
                    return observableJust;
                }
                LocalDate nextOpenHours = marketHours.getNextOpenHours();
                this.marketHoursStore.refresh(force, nextOpenHours);
                return this.marketHoursStore.getMarketHours(nextOpenHours);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    public final Observable<MarketHours> nextOpenMarketHoursObservable() {
        Observable observableSwitchMap = getCurrentMarketHoursObservable().distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.markethours.util.TraderMarketHoursManager.nextOpenMarketHoursObservable.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends MarketHours> apply(MarketHours marketHours) {
                Intrinsics.checkNotNullParameter(marketHours, "marketHours");
                LocalDate nextOpenHours = marketHours.getNextOpenHours();
                TraderMarketHoursManager.this.marketHoursStore.refresh(false, nextOpenHours);
                return TraderMarketHoursManager.this.marketHoursStore.getMarketHours(nextOpenHours);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    public final SharedFlow<MarketHours> getTodaysMarketHours() {
        return this.todaysMarketHours;
    }

    public final SharedFlow<MarketHours> getNextOpenMarketHours() {
        return this.nextOpenMarketHours;
    }

    public final Flow<TradingSession> getCurrentTradingSession() {
        return this.currentTradingSession;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TradingSession getCurrentTradingSession(MarketHours todaysMarketHours, MarketHours nextOpenMarketHours, EquityOrderSession shortSellOrderSession) {
        Map<OrderMarketHours, SessionBehavior> currentSessionBehaviors;
        Instant instant = this.clock.instant();
        if (shortSellOrderSession != null) {
            Intrinsics.checkNotNull(instant);
            currentSessionBehaviors = shortSellOrderSession.getCurrentSessionBehaviors(instant);
        } else {
            currentSessionBehaviors = null;
        }
        MarketHours marketHours = todaysMarketHours.isOpen() ? todaysMarketHours : nextOpenMarketHours;
        Intrinsics.checkNotNull(instant);
        if (marketHours.isBeforeExtendedHours(instant)) {
            return new TradingSession.Overnight(todaysMarketHours, nextOpenMarketHours, currentSessionBehaviors);
        }
        if (marketHours.isPreMarket(instant)) {
            return new TradingSession.Extended.PreMarket(todaysMarketHours, nextOpenMarketHours, currentSessionBehaviors);
        }
        if (marketHours.isOpenRegular(instant)) {
            return new TradingSession.Regular(todaysMarketHours, nextOpenMarketHours, currentSessionBehaviors);
        }
        if (marketHours.isAfterHours(instant)) {
            return new TradingSession.Extended.AfterHours(todaysMarketHours, nextOpenMarketHours, currentSessionBehaviors);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object delayUntilNearestTime(Instant[] instantArr, Continuation<? super Unit> continuation) {
        Object obj;
        Iterator it = ArraysKt.filterNotNull(instantArr).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long epochMilli = ((Instant) next).toEpochMilli();
                do {
                    Object next2 = it.next();
                    long epochMilli2 = ((Instant) next2).toEpochMilli();
                    if (epochMilli > epochMilli2) {
                        next = next2;
                        epochMilli = epochMilli2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Instant instant = (Instant) obj;
        if (instant == null) {
            return Unit.INSTANCE;
        }
        Object objDelay = DelayKt.delay(Duration.between(this.clock.instant(), instant).toMillis(), continuation);
        return objDelay == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDelay : Unit.INSTANCE;
    }

    public final MarketHours getCurrentMarketHours() {
        MarketHours value = this.marketHoursRelay.getValue();
        Intrinsics.checkNotNull(value);
        return value;
    }

    public final boolean isPreMarket() {
        Instant instantNow = Instant.now(this.clock);
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        return isPreMarket(instantNow);
    }

    public final boolean isExtendedHours() {
        Instant instantNow = Instant.now(this.clock);
        MarketHours currentMarketHours = getCurrentMarketHours();
        Intrinsics.checkNotNull(instantNow);
        return currentMarketHours.isPreMarket(instantNow) || getCurrentMarketHours().isAfterHours(instantNow);
    }

    public final MarketHours bestGuessForDate(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return MarketHours.INSTANCE.bestGuessForDate(date, this.hyperExtendedPref.get());
    }

    private final void reset() {
        LocalDate currentDateInEasternTime = Clocks.getCurrentDateInEasternTime(this.clock);
        this.today = currentDateInEasternTime;
        BehaviorRelay<MarketHours> behaviorRelay = this.marketHoursRelay;
        Intrinsics.checkNotNull(currentDateInEasternTime);
        behaviorRelay.accept(bestGuessForDate(currentDateInEasternTime));
        fetchNewMarketHours();
        fetchCurrentMarketHours();
    }

    private final void fetchNewMarketHours() {
        final LocalDate localDatePlusDays = Clocks.getCurrentDateInEasternTime(this.clock).plusDays(1L);
        MarketHoursStore marketHoursStore = this.marketHoursStore;
        Intrinsics.checkNotNull(localDatePlusDays);
        Observable<MarketHours> observableTake = marketHoursStore.getMarketHours(localDatePlusDays).take(1L).take(5L, TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        Observable observableDefaultIfEmpty = ObservablesKt.toOptionals(observableTake).defaultIfEmpty(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(observableDefaultIfEmpty, "defaultIfEmpty(...)");
        ScopedSubscriptionKt.subscribeIn$default(observableDefaultIfEmpty, this.coroutineScope, new Function1() { // from class: com.robinhood.android.markethours.util.TraderMarketHoursManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderMarketHoursManager.fetchNewMarketHours$lambda$4(this.f$0, localDatePlusDays, (Optional) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.markethours.util.TraderMarketHoursManager$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderMarketHoursManager.fetchNewMarketHours$lambda$5((Throwable) obj);
            }
        }, (Function0) null, 8, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchNewMarketHours$lambda$4(TraderMarketHoursManager traderMarketHoursManager, LocalDate localDate, Optional optional) {
        if (optional.getOrNull() == null) {
            for (int i = 0; i < 3; i++) {
                MarketHoursStore marketHoursStore = traderMarketHoursManager.marketHoursStore;
                LocalDate localDatePlusDays = localDate.plusDays(i);
                Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
                marketHoursStore.refresh(true, localDatePlusDays);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchNewMarketHours$lambda$5(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    private final void fetchCurrentMarketHours() {
        Disposable4.disposeSafe(this.openDisposable);
        MarketHoursStore marketHoursStore = this.marketHoursStore;
        LocalDate localDate = this.today;
        Intrinsics.checkNotNull(localDate);
        marketHoursStore.refresh(false, localDate);
        MarketHoursStore marketHoursStore2 = this.marketHoursStore;
        LocalDate localDate2 = this.today;
        Intrinsics.checkNotNull(localDate2);
        this.openDisposable = ScopedSubscriptionKt.subscribeIn$default(marketHoursStore2.getMarketHours(localDate2), this.coroutineScope, new Function1() { // from class: com.robinhood.android.markethours.util.TraderMarketHoursManager$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderMarketHoursManager.fetchCurrentMarketHours$lambda$6(this.f$0, (MarketHours) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.markethours.util.TraderMarketHoursManager$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderMarketHoursManager.fetchCurrentMarketHours$lambda$7(this.f$0, (Throwable) obj);
            }
        }, (Function0) null, 8, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchCurrentMarketHours$lambda$6(TraderMarketHoursManager traderMarketHoursManager, MarketHours marketHours) {
        Intrinsics.checkNotNullParameter(marketHours, "marketHours");
        traderMarketHoursManager.marketHoursRelay.accept(marketHours);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchCurrentMarketHours$lambda$7(TraderMarketHoursManager traderMarketHoursManager, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        traderMarketHoursManager.today = null;
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.store.base.MarketHoursManager
    public boolean areMarketsOpenExtended() {
        resetIfNewDay();
        MarketHours currentMarketHours = getCurrentMarketHours();
        Instant instantNow = Instant.now(this.clock);
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        return currentMarketHours.isOpenExtended(instantNow);
    }

    public final boolean isPreMarket(Instant time) {
        Intrinsics.checkNotNullParameter(time, "time");
        return getCurrentMarketHours().isPreMarket(time);
    }

    @Override // com.robinhood.store.base.MarketHoursManager
    public Observable<Boolean> marketChangesObservable() {
        Observable<Boolean> observableSwitchMap = Observable.merge(Observable.interval(INSTANCE.timeUntilNextDay(this.clock) + 1000, TimeUnit.DAYS.toMillis(1L), TimeUnit.MILLISECONDS), getCurrentMarketHoursObservable().distinctUntilChanged().map(new Function() { // from class: com.robinhood.android.markethours.util.TraderMarketHoursManager.marketChangesObservable.1
            @Override // io.reactivex.functions.Function
            public final Long apply(MarketHours it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return 0L;
            }
        })).startWith((Observable) 0L).switchMap(new Function() { // from class: com.robinhood.android.markethours.util.TraderMarketHoursManager.marketChangesObservable.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Boolean> apply(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TraderMarketHoursManager.this.resetIfNewDay();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jMax = Math.max(TraderMarketHoursManager.this.getCurrentMarketHours().getExtendedOpensAt().toEpochMilli() - jCurrentTimeMillis, -1L);
                long jMax2 = Math.max(TraderMarketHoursManager.this.getCurrentMarketHours().getExtendedClosesAt().toEpochMilli() - jCurrentTimeMillis, -1L);
                Observable<R> map = jMax != -1 ? Observable.timer(jMax, TimeUnit.MILLISECONDS).map(new Function() { // from class: com.robinhood.android.markethours.util.TraderMarketHoursManager$marketChangesObservable$2$closeToOpen$1
                    @Override // io.reactivex.functions.Function
                    public final Boolean apply(Long it2) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return Boolean.TRUE;
                    }
                }) : null;
                Observable<R> map2 = jMax2 != -1 ? Observable.timer(jMax2, TimeUnit.MILLISECONDS).map(new Function() { // from class: com.robinhood.android.markethours.util.TraderMarketHoursManager$marketChangesObservable$2$openToClose$1
                    @Override // io.reactivex.functions.Function
                    public final Boolean apply(Long it2) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return Boolean.FALSE;
                    }
                }) : null;
                if (map != null && map2 != null) {
                    map = map.mergeWith(map2);
                } else if (map == null) {
                    map = map2 == null ? Observable.never() : map2;
                }
                MarketHours currentMarketHours = TraderMarketHoursManager.this.getCurrentMarketHours();
                Instant instantNow = Instant.now(TraderMarketHoursManager.this.clock);
                Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
                return map.startWith((Observable<R>) Boolean.valueOf(currentMarketHours.isOpenExtended(instantNow))).distinctUntilChanged();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    public final Observable<MarketHours> effectiveMarketHoursObservable(boolean allDayHours, boolean extendedHours) {
        MarketHours currentMarketHours = getCurrentMarketHours();
        Instant instantNow = Instant.now(this.clock);
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        if (currentMarketHours.wouldOrderBeEffectiveToday(allDayHours, extendedHours, instantNow)) {
            Observable<MarketHours> observableJust = Observable.just(currentMarketHours);
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }
        LocalDate nextOpenHours = currentMarketHours.getNextOpenHours();
        this.marketHoursStore.refresh(false, nextOpenHours);
        Observable<MarketHours> observableTake = this.marketHoursStore.getMarketHours(nextOpenHours).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        return observableTake;
    }

    @Override // com.robinhood.store.base.MarketHoursManager
    public Observable<Boolean> streamIsAdtHours() {
        Observable<Boolean> observableDistinctUntilChanged = this.marketHoursStore.streamTime().switchMap(new Function() { // from class: com.robinhood.android.markethours.util.TraderMarketHoursManager.streamIsAdtHours.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<MarketHours, Instant>> apply(final Instant now) {
                Intrinsics.checkNotNullParameter(now, "now");
                TraderMarketHoursManager.this.marketHoursStore.refreshToday(false);
                return TraderMarketHoursManager.this.marketHoursStore.getMarketHoursToday().map(new Function() { // from class: com.robinhood.android.markethours.util.TraderMarketHoursManager.streamIsAdtHours.1.1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<MarketHours, Instant> apply(MarketHours it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Tuples4.m3642to(it, now);
                    }
                });
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.markethours.util.TraderMarketHoursManager.streamIsAdtHours.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Boolean> apply(Tuples2<MarketHours, Instant> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                MarketHours marketHoursComponent1 = tuples2.component1();
                Intrinsics.checkNotNullExpressionValue(marketHoursComponent1, "component1(...)");
                Instant instantComponent2 = tuples2.component2();
                Intrinsics.checkNotNullExpressionValue(instantComponent2, "component2(...)");
                final Instant instant = instantComponent2;
                if (!marketHoursComponent1.isInAdtSession(instant)) {
                    MarketHoursStore marketHoursStore = TraderMarketHoursManager.this.marketHoursStore;
                    LocalDate localDatePlusDays = Clocks.getCurrentDateInEasternTime(TraderMarketHoursManager.this.clock).plusDays(1L);
                    Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
                    return marketHoursStore.getMarketHours(localDatePlusDays).map(new Function() { // from class: com.robinhood.android.markethours.util.TraderMarketHoursManager.streamIsAdtHours.2.1
                        @Override // io.reactivex.functions.Function
                        public final Boolean apply(MarketHours nextHours) {
                            Intrinsics.checkNotNullParameter(nextHours, "nextHours");
                            return Boolean.valueOf(nextHours.isInAdtSession(instant));
                        }
                    });
                }
                return Observable.just(Boolean.TRUE);
            }
        }).onErrorReturn(new Function() { // from class: com.robinhood.android.markethours.util.TraderMarketHoursManager.streamIsAdtHours.3
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.FALSE;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetIfNewDay() {
        if (Intrinsics.areEqual(Clocks.getCurrentDateInEasternTime(this.clock), this.today)) {
            return;
        }
        reset();
    }

    /* compiled from: TraderMarketHoursManager.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/markethours/util/TraderMarketHoursManager$Companion;", "", "<init>", "()V", "j$/time/Clock", Card.Icon.CLOCK, "", "timeUntilNextDay", "(Lj$/time/Clock;)J", "", "NUM_DAYS_IN_ADVANCE_TO_FETCH", "I", "lib-market-hours_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long timeUntilNextDay(Clock clock) {
            Instant instant = Clocks.getCurrentDateInEasternTime(clock).plusDays(1L).atStartOfDay().toInstant(ZoneOffset.UTC);
            Instant instantNow = Instant.now(clock);
            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
            Intrinsics.checkNotNull(instant);
            Duration durationBetween = Duration.between(instantNow, instant);
            Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
            return durationBetween.toMillis();
        }
    }
}
