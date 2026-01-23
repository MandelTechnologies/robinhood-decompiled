package com.robinhood.shared.portfolio.listsswipenux;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.shared.store.history.HistoryStore;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: SwipeNuxModule_ProvideEquityWatchlistSwipeNuxProviderFactory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\t\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/listsswipenux/SwipeNuxModule_ProvideEquityWatchlistSwipeNuxProviderFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/portfolio/listsswipenux/SwipeNuxProvider;", "Ljavax/inject/Provider;", "Landroid/content/SharedPreferences;", "preferences", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/shared/store/history/HistoryStore;", "historyStore", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/shared/portfolio/listsswipenux/SwipeNuxProvider;", "Ljavax/inject/Provider;", "Companion", "lib-lists-swipe-nux_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class SwipeNuxModule_ProvideEquityWatchlistSwipeNuxProviderFactory implements Factory<SwipeNuxProvider> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Clock> clock;
    private final Provider<HistoryStore> historyStore;
    private final Provider<SharedPreferences> preferences;
    private final Provider<RegionGateProvider> regionGateProvider;

    @JvmStatic
    public static final SwipeNuxModule_ProvideEquityWatchlistSwipeNuxProviderFactory create(Provider<SharedPreferences> provider, Provider<RegionGateProvider> provider2, Provider<HistoryStore> provider3, Provider<Clock> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final SwipeNuxProvider provideEquityWatchlistSwipeNuxProvider(SharedPreferences sharedPreferences, RegionGateProvider regionGateProvider, HistoryStore historyStore, Clock clock) {
        return INSTANCE.provideEquityWatchlistSwipeNuxProvider(sharedPreferences, regionGateProvider, historyStore, clock);
    }

    public SwipeNuxModule_ProvideEquityWatchlistSwipeNuxProviderFactory(Provider<SharedPreferences> preferences, Provider<RegionGateProvider> regionGateProvider, Provider<HistoryStore> historyStore, Provider<Clock> clock) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.preferences = preferences;
        this.regionGateProvider = regionGateProvider;
        this.historyStore = historyStore;
        this.clock = clock;
    }

    @Override // javax.inject.Provider
    public SwipeNuxProvider get() {
        Companion companion = INSTANCE;
        SharedPreferences sharedPreferences = this.preferences.get();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        HistoryStore historyStore = this.historyStore.get();
        Intrinsics.checkNotNullExpressionValue(historyStore, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        return companion.provideEquityWatchlistSwipeNuxProvider(sharedPreferences, regionGateProvider, historyStore, clock);
    }

    /* compiled from: SwipeNuxModule_ProvideEquityWatchlistSwipeNuxProviderFactory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/listsswipenux/SwipeNuxModule_ProvideEquityWatchlistSwipeNuxProviderFactory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Landroid/content/SharedPreferences;", "preferences", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/shared/store/history/HistoryStore;", "historyStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/shared/portfolio/listsswipenux/SwipeNuxModule_ProvideEquityWatchlistSwipeNuxProviderFactory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/shared/portfolio/listsswipenux/SwipeNuxModule_ProvideEquityWatchlistSwipeNuxProviderFactory;", "Lcom/robinhood/shared/portfolio/listsswipenux/SwipeNuxProvider;", "provideEquityWatchlistSwipeNuxProvider", "(Landroid/content/SharedPreferences;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/shared/store/history/HistoryStore;Lj$/time/Clock;)Lcom/robinhood/shared/portfolio/listsswipenux/SwipeNuxProvider;", "lib-lists-swipe-nux_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SwipeNuxModule_ProvideEquityWatchlistSwipeNuxProviderFactory create(Provider<SharedPreferences> preferences, Provider<RegionGateProvider> regionGateProvider, Provider<HistoryStore> historyStore, Provider<Clock> clock) {
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(historyStore, "historyStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new SwipeNuxModule_ProvideEquityWatchlistSwipeNuxProviderFactory(preferences, regionGateProvider, historyStore, clock);
        }

        @JvmStatic
        public final SwipeNuxProvider provideEquityWatchlistSwipeNuxProvider(SharedPreferences preferences, RegionGateProvider regionGateProvider, HistoryStore historyStore, Clock clock) {
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(historyStore, "historyStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Object objCheckNotNull = Preconditions.checkNotNull(SwipeNuxModule.INSTANCE.provideEquityWatchlistSwipeNuxProvider(preferences, regionGateProvider, historyStore, clock), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (SwipeNuxProvider) objCheckNotNull;
        }
    }
}
