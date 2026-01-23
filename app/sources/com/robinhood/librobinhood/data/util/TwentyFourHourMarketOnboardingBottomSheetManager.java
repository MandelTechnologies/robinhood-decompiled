package com.robinhood.librobinhood.data.util;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.librobinhood.data.prefs.HasShownAdtOnboardingBottomSheetPref;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.bonfire.EquityTradingSeenStatusStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Tradability;
import com.robinhood.models.p320db.bonfire.EquityTradingSeenStatus;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.ZoneIds;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.rxkotlin.Observables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.LocalDate;

/* compiled from: TwentyFourHourMarketOnboardingBottomSheetManager.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/util/TwentyFourHourMarketOnboardingBottomSheetManager;", "", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "equityTradingSeenStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore;", "hasShownAdtOnboardingBottomSheetPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore;Lcom/robinhood/prefs/BooleanPreference;)V", "fetchTwentyFourHourMarketOnboardingBottomSheetId", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "Lcom/robinhood/models/db/Account;", "selectedAccountNumberStream", "instrumentId", "Ljava/util/UUID;", "Companion", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class TwentyFourHourMarketOnboardingBottomSheetManager {
    private static final String TWENTY_FOUR_HOUR_MARKET_INFO_SHEET_ID = "adt_onboarding";
    private final AccountProvider accountProvider;
    private final EquityTradingSeenStatusStore equityTradingSeenStatusStore;
    private final BooleanPreference hasShownAdtOnboardingBottomSheetPref;
    private final InstrumentStore instrumentStore;
    private final TraderMarketHoursManager marketHoursManager;

    public TwentyFourHourMarketOnboardingBottomSheetManager(TraderMarketHoursManager marketHoursManager, InstrumentStore instrumentStore, AccountProvider accountProvider, EquityTradingSeenStatusStore equityTradingSeenStatusStore, @HasShownAdtOnboardingBottomSheetPref BooleanPreference hasShownAdtOnboardingBottomSheetPref) {
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(equityTradingSeenStatusStore, "equityTradingSeenStatusStore");
        Intrinsics.checkNotNullParameter(hasShownAdtOnboardingBottomSheetPref, "hasShownAdtOnboardingBottomSheetPref");
        this.marketHoursManager = marketHoursManager;
        this.instrumentStore = instrumentStore;
        this.accountProvider = accountProvider;
        this.equityTradingSeenStatusStore = equityTradingSeenStatusStore;
        this.hasShownAdtOnboardingBottomSheetPref = hasShownAdtOnboardingBottomSheetPref;
    }

    public final Observable<Tuples2<String, Account>> fetchTwentyFourHourMarketOnboardingBottomSheetId(Observable<String> selectedAccountNumberStream, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(selectedAccountNumberStream, "selectedAccountNumberStream");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        ObservableSource observableSourceFlatMap = selectedAccountNumberStream.flatMap(new Function() { // from class: com.robinhood.librobinhood.data.util.TwentyFourHourMarketOnboardingBottomSheetManager$fetchTwentyFourHourMarketOnboardingBottomSheetId$selectedAccountStream$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Account> apply(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.this$0.accountProvider.streamAccount(it);
            }
        });
        Observables observables = Observables.INSTANCE;
        Observable<Boolean> observableStreamIsAdtHours = this.marketHoursManager.streamIsAdtHours();
        Observable<Instrument> instrument = this.instrumentStore.getInstrument(instrumentId);
        Intrinsics.checkNotNull(observableSourceFlatMap);
        Observable observableCombineLatest = Observable.combineLatest(observableStreamIsAdtHours, instrument, observableSourceFlatMap, new Function3<T1, T2, T3, R>() { // from class: com.robinhood.librobinhood.data.util.TwentyFourHourMarketOnboardingBottomSheetManager$fetchTwentyFourHourMarketOnboardingBottomSheetId$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public final R apply(T1 t1, T2 t2, T3 t3) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                return (R) Boolean.valueOf(((Boolean) t1).booleanValue() && ((Instrument) t2).getAllDayTradability() == Tradability.TRADABLE && !Intrinsics.areEqual(((Account) t3).getDisableAdt(), Boolean.TRUE));
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…neFunction(t1, t2, t3) })");
        Observable observableFlatMap = observableCombineLatest.flatMap(new Function() { // from class: com.robinhood.librobinhood.data.util.TwentyFourHourMarketOnboardingBottomSheetManager.fetchTwentyFourHourMarketOnboardingBottomSheetId.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Boolean> apply(Boolean fetchSeen) {
                Intrinsics.checkNotNullParameter(fetchSeen, "fetchSeen");
                if (fetchSeen.booleanValue()) {
                    TwentyFourHourMarketOnboardingBottomSheetManager.this.equityTradingSeenStatusStore.refresh(true);
                    Observable<EquityTradingSeenStatus> observableStreamSeenStatus = TwentyFourHourMarketOnboardingBottomSheetManager.this.equityTradingSeenStatusStore.streamSeenStatus();
                    final TwentyFourHourMarketOnboardingBottomSheetManager twentyFourHourMarketOnboardingBottomSheetManager = TwentyFourHourMarketOnboardingBottomSheetManager.this;
                    return observableStreamSeenStatus.map(new Function() { // from class: com.robinhood.librobinhood.data.util.TwentyFourHourMarketOnboardingBottomSheetManager.fetchTwentyFourHourMarketOnboardingBottomSheetId.2.1
                        /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
                        @Override // io.reactivex.functions.Function
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Boolean apply(EquityTradingSeenStatus it) {
                            Boolean boolValueOf;
                            Intrinsics.checkNotNullParameter(it, "it");
                            boolean z = true;
                            if (it.getAdtBottomSheetSeenOn() != null) {
                                twentyFourHourMarketOnboardingBottomSheetManager.hasShownAdtOnboardingBottomSheetPref.set(true);
                            } else {
                                Instant crV2TooltipSeenOn = it.getCrV2TooltipSeenOn();
                                if (crV2TooltipSeenOn != null) {
                                    ZoneIds zoneIds = ZoneIds.INSTANCE;
                                    LocalDate localDate = Instants.toLocalDate(crV2TooltipSeenOn, zoneIds.getUTC());
                                    if (localDate != null) {
                                        boolValueOf = Boolean.valueOf(localDate.toEpochDay() == LocalDate.now(zoneIds.getUTC()).toEpochDay());
                                    } else {
                                        boolValueOf = null;
                                    }
                                    if (boolValueOf == null || boolValueOf.booleanValue()) {
                                    }
                                }
                                return Boolean.valueOf(z);
                            }
                            z = false;
                            return Boolean.valueOf(z);
                        }
                    });
                }
                return Observable.empty();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        Observable map = observableFlatMap.map(new Function() { // from class: com.robinhood.librobinhood.data.util.TwentyFourHourMarketOnboardingBottomSheetManager$fetchTwentyFourHourMarketOnboardingBottomSheetId$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((Boolean) it).booleanValue() ? "adt_onboarding" : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C34894x712dcce0<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable<Tuples2<String, Account>> observableZipWith = ObservablesKt.filterIsPresent(map).take(1L).zipWith(observableSourceFlatMap, new BiFunction() { // from class: com.robinhood.librobinhood.data.util.TwentyFourHourMarketOnboardingBottomSheetManager.fetchTwentyFourHourMarketOnboardingBottomSheetId.4
            @Override // io.reactivex.functions.BiFunction
            public final Tuples2<String, Account> apply(String bottomSheetId, Account account) {
                Intrinsics.checkNotNullParameter(bottomSheetId, "bottomSheetId");
                Intrinsics.checkNotNullParameter(account, "account");
                return new Tuples2<>(bottomSheetId, account);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableZipWith, "zipWith(...)");
        return observableZipWith;
    }
}
