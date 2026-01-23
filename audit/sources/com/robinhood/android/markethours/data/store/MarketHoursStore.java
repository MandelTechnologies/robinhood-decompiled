package com.robinhood.android.markethours.data.store;

import com.robinhood.android.markethours.extensions.Clocks;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.models.api.ApiMarketHours;
import com.robinhood.models.api.ApiOrderSessionResponse;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.dao.EquityOrderSessionDao;
import com.robinhood.models.dao.MarketHoursDao;
import com.robinhood.models.p320db.EquityOrderSession;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OptionMarketHoursParam;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;
import p479j$.time.LocalDate;

/* compiled from: MarketHoursStore.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00180\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b'\u0010&J\u001d\u0010(\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b(\u0010&J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010)\u001a\u00020 ¢\u0006\u0004\b*\u0010+J\u0013\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b,\u0010\u0013J'\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010-\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b.\u0010/J=\u00108\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u00100\u001a\u00020 2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u00104\u001a\u0004\u0018\u0001032\u0006\u00105\u001a\u00020 H\u0000¢\u0006\u0004\b6\u00107J%\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u00109\u001a\u00020 2\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b:\u0010;J#\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020 ¢\u0006\u0004\b<\u0010=J\u0013\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u0010¢\u0006\u0004\b?\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010CR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010DR \u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020F0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR \u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020I0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010H¨\u0006K"}, m3636d2 = {"Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/api/retrofit/Brokeback;", "brokeback", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "equitiesBrokeback", "Lcom/robinhood/models/dao/MarketHoursDao;", "marketHoursDao", "Lcom/robinhood/models/dao/EquityOrderSessionDao;", "orderSessionDao", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/api/retrofit/Brokeback;Lcom/robinhood/api/equity/EquitiesBrokeback;Lcom/robinhood/models/dao/MarketHoursDao;Lcom/robinhood/models/dao/EquityOrderSessionDao;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)V", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/MarketHours;", "getMarketHoursToday", "()Lio/reactivex/Observable;", "j$/time/LocalDate", InquiryField.DateField.TYPE, "getMarketHours", "(Lj$/time/LocalDate;)Lio/reactivex/Observable;", "", "dates", "getMarketHoursList", "(Ljava/util/List;)Lio/reactivex/Observable;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/EquityOrderSession;", "getShortSellOrderSession", "(Lj$/time/LocalDate;)Lkotlinx/coroutines/flow/Flow;", "", "force", "", "refreshToday", "(Z)V", "refresh", "(ZLj$/time/LocalDate;)V", "refreshShortSession", "refreshWithoutEviction", "isExtendedHours", "getMostRecentPastOrCurrentMarketHours", "(Z)Lio/reactivex/Observable;", "getAndRefreshMostRecentMarketHours", "includeToday", "getAndRefreshNextOpenMarketHours", "(ZZ)Lio/reactivex/Observable;", "includeEquityExtendedHours", "Lcom/robinhood/models/db/OrderMarketHours;", "orderMarketHours", "Lcom/robinhood/models/db/OptionMarketHoursParam;", "optionMarketHoursParam", "isIndexOptionsExtendedHoursEnabled", "getAndRefreshCurrentOrNextOpenMarketHours$lib_market_hours_externalDebug", "(ZLcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/OptionMarketHoursParam;Z)Lio/reactivex/Observable;", "getAndRefreshCurrentOrNextOpenMarketHours", "includeExtendedHours", "getAndRefreshCurrentOrNextOpenMarketHoursForEquity", "(ZLcom/robinhood/models/db/OrderMarketHours;)Lio/reactivex/Observable;", "getAndRefreshCurrentOrNextOpenMarketHoursForOptions", "(Lcom/robinhood/models/db/OptionMarketHoursParam;Z)Lio/reactivex/Observable;", "j$/time/Instant", "streamTime", "Lcom/robinhood/api/retrofit/Brokeback;", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "Lcom/robinhood/models/dao/MarketHoursDao;", "Lcom/robinhood/models/dao/EquityOrderSessionDao;", "Lj$/time/Clock;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/api/ApiOrderSessionResponse;", "getShortSellOrderSessionEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/api/ApiMarketHours;", "getMarketHoursEndpoint", "lib-market-hours_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class MarketHoursStore extends Store {
    private final Brokeback brokeback;
    private final Clock clock;
    private final EquitiesBrokeback equitiesBrokeback;
    private final Endpoint<LocalDate, ApiMarketHours> getMarketHoursEndpoint;
    private final Endpoint<LocalDate, ApiOrderSessionResponse> getShortSellOrderSessionEndpoint;
    private final MarketHoursDao marketHoursDao;
    private final EquityOrderSessionDao orderSessionDao;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHoursStore(Brokeback brokeback, EquitiesBrokeback equitiesBrokeback, MarketHoursDao marketHoursDao, EquityOrderSessionDao orderSessionDao, Clock clock, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(equitiesBrokeback, "equitiesBrokeback");
        Intrinsics.checkNotNullParameter(marketHoursDao, "marketHoursDao");
        Intrinsics.checkNotNullParameter(orderSessionDao, "orderSessionDao");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.brokeback = brokeback;
        this.equitiesBrokeback = equitiesBrokeback;
        this.marketHoursDao = marketHoursDao;
        this.orderSessionDao = orderSessionDao;
        this.clock = clock;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        MarketHoursStore5 marketHoursStore5 = new MarketHoursStore5(this, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        MarketHoursStore6 marketHoursStore6 = new MarketHoursStore6(orderSessionDao);
        Clock clock2 = storeBundle.getClock();
        Duration durationOfDays = Duration.ofDays(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfDays, "ofDays(...)");
        this.getShortSellOrderSessionEndpoint = companion.create(marketHoursStore5, logoutKillswitch, marketHoursStore6, clock2, new DefaultStaleDecider(durationOfDays, storeBundle.getClock()));
        MarketHoursStore3 marketHoursStore3 = new MarketHoursStore3(this, null);
        LogoutKillswitch logoutKillswitch2 = getLogoutKillswitch();
        MarketHoursStore4 marketHoursStore4 = new MarketHoursStore4(marketHoursDao);
        Clock clock3 = storeBundle.getClock();
        Duration durationOfDays2 = Duration.ofDays(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfDays2, "ofDays(...)");
        this.getMarketHoursEndpoint = companion.create(marketHoursStore3, logoutKillswitch2, marketHoursStore4, clock3, new DefaultStaleDecider(durationOfDays2, storeBundle.getClock()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getShortSellOrderSessionEndpoint$insert(EquityOrderSessionDao equityOrderSessionDao, ApiOrderSessionResponse apiOrderSession3, Continuation continuation) {
        equityOrderSessionDao.insert(apiOrderSession3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getMarketHoursEndpoint$insert$0(MarketHoursDao marketHoursDao, ApiMarketHours apiMarketHours, Continuation continuation) {
        marketHoursDao.insert(apiMarketHours);
        return Unit.INSTANCE;
    }

    public final Observable<MarketHours> getMarketHoursToday() {
        return getMarketHours(Clocks.getCurrentDateInEasternTime(this.clock));
    }

    public final Observable<MarketHours> getMarketHours(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.marketHoursDao.getMarketHours(date))));
    }

    public final Observable<List<MarketHours>> getMarketHoursList(List<LocalDate> dates) {
        Intrinsics.checkNotNullParameter(dates, "dates");
        return asObservable(takeWhileLoggedIn(this.marketHoursDao.getMarketHours(dates)));
    }

    public final Flow<EquityOrderSession> getShortSellOrderSession(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return takeWhileLoggedInNullable(this.orderSessionDao.getEquityOrderSession(date));
    }

    public final void refreshToday(boolean force) {
        refresh(force, Clocks.getCurrentDateInEasternTime(this.clock));
    }

    public final void refresh(boolean force, LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Endpoint.DefaultImpls.refresh$default(this.getMarketHoursEndpoint, date, force, null, 4, null);
    }

    public static /* synthetic */ void refreshShortSession$default(MarketHoursStore marketHoursStore, boolean z, LocalDate localDate, int i, Object obj) {
        if ((i & 2) != 0) {
            localDate = Clocks.getCurrentDateInEasternTime(marketHoursStore.clock);
        }
        marketHoursStore.refreshShortSession(z, localDate);
    }

    public final void refreshShortSession(boolean force, LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Endpoint.DefaultImpls.refresh$default(this.getShortSellOrderSessionEndpoint, date, force, null, 4, null);
    }

    public final void refreshWithoutEviction(boolean force, LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.getMarketHoursEndpoint.refresh(date, force, new C212751(null));
    }

    /* compiled from: MarketHoursStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m3636d2 = {"j$/time/LocalDate", "<unused var>", "Lcom/robinhood/models/api/ApiMarketHours;", "apiMarketHours", "", "<anonymous>", "(Lj$/time/LocalDate;Lcom/robinhood/models/api/ApiMarketHours;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
    @DebugMetadata(m3644c = "com.robinhood.android.markethours.data.store.MarketHoursStore$refreshWithoutEviction$1", m3645f = "MarketHoursStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.markethours.data.store.MarketHoursStore$refreshWithoutEviction$1 */
    /* loaded from: classes8.dex */
    static final class C212751 extends ContinuationImpl7 implements Function3<LocalDate, ApiMarketHours, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C212751(Continuation<? super C212751> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(LocalDate localDate, ApiMarketHours apiMarketHours, Continuation<? super Unit> continuation) {
            C212751 c212751 = MarketHoursStore.this.new C212751(continuation);
            c212751.L$0 = apiMarketHours;
            return c212751.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MarketHoursStore.this.marketHoursDao.insertWithoutEviction((ApiMarketHours) this.L$0);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Observable getMostRecentPastOrCurrentMarketHours$default(MarketHoursStore marketHoursStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return marketHoursStore.getMostRecentPastOrCurrentMarketHours(z);
    }

    public final Observable<MarketHours> getMostRecentPastOrCurrentMarketHours(final boolean isExtendedHours) {
        final Instant instantNow = Instant.now(this.clock);
        refreshToday(false);
        Observable observableFlatMap = getMarketHoursToday().take(1L).flatMap(new Function() { // from class: com.robinhood.android.markethours.data.store.MarketHoursStore.getMostRecentPastOrCurrentMarketHours.1
            /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
            @Override // io.reactivex.functions.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final ObservableSource<? extends MarketHours> apply(MarketHours marketHours) {
                Intrinsics.checkNotNullParameter(marketHours, "marketHours");
                if (isExtendedHours) {
                    Instant instant = instantNow;
                    Intrinsics.checkNotNull(instant);
                    if (!marketHours.isBeforeExtendedHours(instant)) {
                        Instant instant2 = instantNow;
                        Intrinsics.checkNotNull(instant2);
                        if (!marketHours.isBeforeRegularHours(instant2)) {
                            Observable observableJust = Observable.just(marketHours);
                            Intrinsics.checkNotNull(observableJust);
                            return observableJust;
                        }
                    }
                }
                LocalDate previousOpenHours = marketHours.getPreviousOpenHours();
                this.refresh(false, previousOpenHours);
                return this.getMarketHours(previousOpenHours);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return observableFlatMap;
    }

    public final Observable<MarketHours> getAndRefreshMostRecentMarketHours() {
        refreshToday(false);
        Observable observableFlatMap = getMarketHoursToday().take(1L).flatMap(new Function() { // from class: com.robinhood.android.markethours.data.store.MarketHoursStore.getAndRefreshMostRecentMarketHours.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends MarketHours> apply(MarketHours marketHours) {
                Intrinsics.checkNotNullParameter(marketHours, "marketHours");
                if (marketHours.isOpen()) {
                    Observable observableJust = Observable.just(marketHours);
                    Intrinsics.checkNotNull(observableJust);
                    return observableJust;
                }
                LocalDate previousOpenHours = marketHours.getPreviousOpenHours();
                MarketHoursStore.this.refresh(false, previousOpenHours);
                return MarketHoursStore.this.getMarketHours(previousOpenHours);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return observableFlatMap;
    }

    public static /* synthetic */ Observable getAndRefreshNextOpenMarketHours$default(MarketHoursStore marketHoursStore, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return marketHoursStore.getAndRefreshNextOpenMarketHours(z, z2);
    }

    public final Observable<MarketHours> getAndRefreshNextOpenMarketHours(final boolean includeToday, final boolean force) {
        refreshToday(force);
        Observable observableFlatMap = getMarketHoursToday().take(1L).flatMap(new Function() { // from class: com.robinhood.android.markethours.data.store.MarketHoursStore.getAndRefreshNextOpenMarketHours.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends MarketHours> apply(MarketHours marketHours) {
                Intrinsics.checkNotNullParameter(marketHours, "marketHours");
                if (includeToday && marketHours.isOpen()) {
                    Observable observableJust = Observable.just(marketHours);
                    Intrinsics.checkNotNull(observableJust);
                    return observableJust;
                }
                LocalDate nextOpenHours = marketHours.getNextOpenHours();
                this.refresh(force, nextOpenHours);
                return this.getMarketHours(nextOpenHours);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return observableFlatMap;
    }

    /* renamed from: getAndRefreshCurrentOrNextOpenMarketHours$lib_market_hours_externalDebug$default */
    public static /* synthetic */ Observable m2167xcd547b7c(MarketHoursStore marketHoursStore, boolean z, OrderMarketHours orderMarketHours, OptionMarketHoursParam optionMarketHoursParam, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            orderMarketHours = null;
        }
        if ((i & 4) != 0) {
            optionMarketHoursParam = null;
        }
        return marketHoursStore.m2168x3dda4df(z, orderMarketHours, optionMarketHoursParam, z2);
    }

    /* renamed from: getAndRefreshCurrentOrNextOpenMarketHours$lib_market_hours_externalDebug */
    public final Observable<MarketHours> m2168x3dda4df(final boolean includeEquityExtendedHours, final OrderMarketHours orderMarketHours, final OptionMarketHoursParam optionMarketHoursParam, final boolean isIndexOptionsExtendedHoursEnabled) {
        final Instant instantNow = Instant.now(this.clock);
        refreshToday(false);
        Observable observableFlatMap = getMarketHoursToday().take(1L).flatMap(new Function() { // from class: com.robinhood.android.markethours.data.store.MarketHoursStore$getAndRefreshCurrentOrNextOpenMarketHours$1
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
            
                if (r1.compareTo(r4.getAllDayClosesAt()) < 0) goto L38;
             */
            @Override // io.reactivex.functions.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final ObservableSource<? extends MarketHours> apply(MarketHours marketHours) {
                Intrinsics.checkNotNullParameter(marketHours, "marketHours");
                if (marketHours.isOpen()) {
                    if (instantNow.compareTo(marketHours.getRegularClosesAt()) >= 0 && ((optionMarketHoursParam != OptionMarketHoursParam.EQUITY_OPTION_LATE_CLOSE || instantNow.compareTo(marketHours.getLateOptionClosesAt()) >= 0) && (optionMarketHoursParam != OptionMarketHoursParam.INDEX_OPTION_0DTE || instantNow.compareTo(marketHours.getIndexOption0DteClosesAt()) >= 0))) {
                        OptionMarketHoursParam optionMarketHoursParam2 = OptionMarketHoursParam.INDEX_OPTION_NON_0DTE;
                        OptionMarketHoursParam optionMarketHoursParam3 = OptionMarketHoursParam.EXTENDED_HOURS_INDEX_OPTION_NON_0DTE;
                        if (CollectionsKt.contains(SetsKt.setOf((Object[]) new OptionMarketHoursParam[]{optionMarketHoursParam2, optionMarketHoursParam3}), optionMarketHoursParam)) {
                            if (instantNow.compareTo(marketHours.getIndexOptionNon0DteClosesAt()) >= 0) {
                            }
                        }
                        if (optionMarketHoursParam == optionMarketHoursParam3) {
                            if (!isIndexOptionsExtendedHoursEnabled || instantNow.compareTo(marketHours.getIndexOptionCurbClosesAt()) >= 0) {
                            }
                        }
                        if (includeEquityExtendedHours) {
                            if (instantNow.compareTo(marketHours.getExtendedClosesAt()) >= 0) {
                            }
                        }
                        OrderMarketHours orderMarketHours2 = orderMarketHours;
                        if (orderMarketHours2 != null) {
                            if (!orderMarketHours2.getLegacy_extended_hours() || instantNow.compareTo(marketHours.getExtendedClosesAt()) >= 0) {
                            }
                        }
                        if (orderMarketHours == OrderMarketHours.ALL_DAY_HOURS) {
                        }
                    }
                    Observable observableJust = Observable.just(marketHours);
                    Intrinsics.checkNotNull(observableJust);
                    return observableJust;
                }
                LocalDate nextOpenHours = marketHours.getNextOpenHours();
                this.refresh(false, nextOpenHours);
                return this.getMarketHours(nextOpenHours);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return observableFlatMap;
    }

    public final Observable<MarketHours> getAndRefreshCurrentOrNextOpenMarketHoursForEquity(boolean includeExtendedHours, OrderMarketHours orderMarketHours) {
        return m2167xcd547b7c(this, includeExtendedHours, orderMarketHours, null, false, 4, null);
    }

    public final Observable<MarketHours> getAndRefreshCurrentOrNextOpenMarketHoursForOptions(OptionMarketHoursParam optionMarketHoursParam, boolean isIndexOptionsExtendedHoursEnabled) {
        Intrinsics.checkNotNullParameter(optionMarketHoursParam, "optionMarketHoursParam");
        return m2167xcd547b7c(this, false, null, optionMarketHoursParam, isIndexOptionsExtendedHoursEnabled, 2, null);
    }

    public final Observable<Instant> streamTime() {
        Observable map = Observable.interval(0L, 5L, TimeUnit.SECONDS).map(new Function() { // from class: com.robinhood.android.markethours.data.store.MarketHoursStore.streamTime.1
            @Override // io.reactivex.functions.Function
            public final Instant apply(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Instant.now(MarketHoursStore.this.clock);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
