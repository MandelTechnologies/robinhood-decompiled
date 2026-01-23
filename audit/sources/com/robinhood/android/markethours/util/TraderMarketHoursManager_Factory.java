package com.robinhood.android.markethours.util;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.markethours.data.store.MarketHoursStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.BooleanPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Clock;

/* compiled from: TraderMarketHoursManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/markethours/util/TraderMarketHoursManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lcom/robinhood/prefs/BooleanPreference;", "hyperExtendedPref", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "marketHoursStore", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "Ljavax/inject/Provider;", "Companion", "lib-market-hours_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class TraderMarketHoursManager_Factory implements Factory<TraderMarketHoursManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Clock> clock;
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<BooleanPreference> hyperExtendedPref;
    private final Provider<MarketHoursStore> marketHoursStore;

    @JvmStatic
    public static final TraderMarketHoursManager_Factory create(Provider<CoroutineScope> provider, Provider<BooleanPreference> provider2, Provider<Clock> provider3, Provider<MarketHoursStore> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final TraderMarketHoursManager newInstance(CoroutineScope coroutineScope, BooleanPreference booleanPreference, Clock clock, MarketHoursStore marketHoursStore) {
        return INSTANCE.newInstance(coroutineScope, booleanPreference, clock, marketHoursStore);
    }

    public TraderMarketHoursManager_Factory(Provider<CoroutineScope> coroutineScope, Provider<BooleanPreference> hyperExtendedPref, Provider<Clock> clock, Provider<MarketHoursStore> marketHoursStore) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(hyperExtendedPref, "hyperExtendedPref");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
        this.coroutineScope = coroutineScope;
        this.hyperExtendedPref = hyperExtendedPref;
        this.clock = clock;
        this.marketHoursStore = marketHoursStore;
    }

    @Override // javax.inject.Provider
    public TraderMarketHoursManager get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        BooleanPreference booleanPreference = this.hyperExtendedPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        MarketHoursStore marketHoursStore = this.marketHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(marketHoursStore, "get(...)");
        return companion.newInstance(coroutineScope, booleanPreference, clock, marketHoursStore);
    }

    /* compiled from: TraderMarketHoursManager_Factory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/markethours/util/TraderMarketHoursManager_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lcom/robinhood/prefs/BooleanPreference;", "hyperExtendedPref", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "marketHoursStore", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/markethours/util/TraderMarketHoursManager_Factory;", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "newInstance", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/prefs/BooleanPreference;Lj$/time/Clock;Lcom/robinhood/android/markethours/data/store/MarketHoursStore;)Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "lib-market-hours_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TraderMarketHoursManager_Factory create(Provider<CoroutineScope> coroutineScope, Provider<BooleanPreference> hyperExtendedPref, Provider<Clock> clock, Provider<MarketHoursStore> marketHoursStore) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(hyperExtendedPref, "hyperExtendedPref");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
            return new TraderMarketHoursManager_Factory(coroutineScope, hyperExtendedPref, clock, marketHoursStore);
        }

        @JvmStatic
        public final TraderMarketHoursManager newInstance(CoroutineScope coroutineScope, BooleanPreference hyperExtendedPref, Clock clock, MarketHoursStore marketHoursStore) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(hyperExtendedPref, "hyperExtendedPref");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
            return new TraderMarketHoursManager(coroutineScope, hyperExtendedPref, clock, marketHoursStore);
        }
    }
}
