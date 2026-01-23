package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.librobinhood.data.store.bonfire.portfolio.prefs.OptionsMarketOrdersEntryNuxLastShownPref;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.prefs.OptionsMarketOrdersEntryNuxTimesShownPref;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.functions.Function3;
import io.reactivex.rxkotlin.Observables;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.format.DateTimeParseException;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: OptionsMarketOrdersEntryNuxStore.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001a¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/OptionsMarketOrdersEntryNuxStore;", "Lcom/robinhood/store/Store;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/StringPreference;", "optionsMarketOrdersEntryNuxLastShownPref", "Lcom/robinhood/prefs/IntPreference;", "optionsMarketOrdersEntryNuxTimesShownPref", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lj$/time/Clock;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/IntPreference;Lcom/robinhood/store/StoreBundle;)V", "", "recordOptionMarketOrderTooltipShown", "()V", "Lcom/robinhood/models/db/MarketHours;", "marketHours", "", "shouldShowMarketOrderOptionTooltip", "(Lcom/robinhood/models/db/MarketHours;)Z", "Lio/reactivex/Observable;", "marketHoursObs", "changes", "(Lio/reactivex/Observable;)Lio/reactivex/Observable;", "Lj$/time/Clock;", "Lcom/robinhood/prefs/StringPreference;", "Lcom/robinhood/prefs/IntPreference;", "Companion", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionsMarketOrdersEntryNuxStore extends Store {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long VOLATILITY_PERIOD_SECONDS = 900;
    private final Clock clock;
    private final StringPreference optionsMarketOrdersEntryNuxLastShownPref;
    private final IntPreference optionsMarketOrdersEntryNuxTimesShownPref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsMarketOrdersEntryNuxStore(Clock clock, @OptionsMarketOrdersEntryNuxLastShownPref StringPreference optionsMarketOrdersEntryNuxLastShownPref, @OptionsMarketOrdersEntryNuxTimesShownPref IntPreference optionsMarketOrdersEntryNuxTimesShownPref, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(optionsMarketOrdersEntryNuxLastShownPref, "optionsMarketOrdersEntryNuxLastShownPref");
        Intrinsics.checkNotNullParameter(optionsMarketOrdersEntryNuxTimesShownPref, "optionsMarketOrdersEntryNuxTimesShownPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.clock = clock;
        this.optionsMarketOrdersEntryNuxLastShownPref = optionsMarketOrdersEntryNuxLastShownPref;
        this.optionsMarketOrdersEntryNuxTimesShownPref = optionsMarketOrdersEntryNuxTimesShownPref;
    }

    public final void recordOptionMarketOrderTooltipShown() {
        this.optionsMarketOrdersEntryNuxLastShownPref.set(this.clock.instant().toString());
        IntPreference intPreference = this.optionsMarketOrdersEntryNuxTimesShownPref;
        intPreference.set(intPreference.get() + 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldShowMarketOrderOptionTooltip(MarketHours marketHours) {
        boolean z;
        Intrinsics.checkNotNullParameter(marketHours, "marketHours");
        Instant instant = this.clock.instant();
        String str = this.optionsMarketOrdersEntryNuxLastShownPref.get();
        Instant instant2 = str != null ? INSTANCE.toInstant(str) : null;
        if (instant2 != null) {
            Intrinsics.checkNotNull(instant);
            z = instant2.until(instant, ChronoUnit.DAYS) < 7;
        }
        return !z && this.optionsMarketOrdersEntryNuxTimesShownPref.get() < 4 && (marketHours.isOpen() && instant.compareTo(marketHours.getRegularOpensAt().plusSeconds(VOLATILITY_PERIOD_SECONDS)) >= 0 && instant.compareTo(marketHours.getRegularClosesAt()) < 0);
    }

    public final Observable<Boolean> changes(Observable<MarketHours> marketHoursObs) {
        Intrinsics.checkNotNullParameter(marketHoursObs, "marketHoursObs");
        Observables observables = Observables.INSTANCE;
        Observable<Boolean> observableCombineLatest = Observable.combineLatest(marketHoursObs, this.optionsMarketOrdersEntryNuxLastShownPref.changes(), this.optionsMarketOrdersEntryNuxTimesShownPref.getChanges(), new Function3<T1, T2, T3, R>() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.OptionsMarketOrdersEntryNuxStore$changes$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public final R apply(T1 t1, T2 t2, T3 t3) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                ((Number) t3).intValue();
                return (R) Boolean.valueOf(this.this$0.shouldShowMarketOrderOptionTooltip((MarketHours) t1));
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…neFunction(t1, t2, t3) })");
        return observableCombineLatest;
    }

    /* compiled from: OptionsMarketOrdersEntryNuxStore.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/OptionsMarketOrdersEntryNuxStore$Companion;", "", "<init>", "()V", "", "j$/time/Instant", "toInstant", "(Ljava/lang/String;)Lj$/time/Instant;", "", "VOLATILITY_PERIOD_SECONDS", "J", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Instant toInstant(String str) {
            try {
                return Instant.parse(str);
            } catch (DateTimeParseException unused) {
                return null;
            }
        }
    }
}
