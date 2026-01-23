package com.robinhood.android.equitytradeladder.provider;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore;
import com.robinhood.prefs.BooleanPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LadderNuxScreenProvider_Factory.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/provider/LadderNuxScreenProvider_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/equitytradeladder/provider/LadderNuxScreenProvider;", "equityTradeLadderNuxSeenPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/BooleanPreference;", "futuresTradeLadderFtuxShouldShowPref", "shouldShowEquityLadderFtuxPref", "tradeSettingsStore", "Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class LadderNuxScreenProvider_Factory implements Factory<LadderNuxScreenProvider> {
    private final Provider<BooleanPreference> equityTradeLadderNuxSeenPref;
    private final Provider<BooleanPreference> futuresTradeLadderFtuxShouldShowPref;
    private final Provider<BooleanPreference> shouldShowEquityLadderFtuxPref;
    private final Provider<TradeSettingsStore> tradeSettingsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final LadderNuxScreenProvider_Factory create(Provider<BooleanPreference> provider, Provider<BooleanPreference> provider2, Provider<BooleanPreference> provider3, Provider<TradeSettingsStore> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final LadderNuxScreenProvider newInstance(BooleanPreference booleanPreference, BooleanPreference booleanPreference2, BooleanPreference booleanPreference3, TradeSettingsStore tradeSettingsStore) {
        return INSTANCE.newInstance(booleanPreference, booleanPreference2, booleanPreference3, tradeSettingsStore);
    }

    public LadderNuxScreenProvider_Factory(Provider<BooleanPreference> equityTradeLadderNuxSeenPref, Provider<BooleanPreference> futuresTradeLadderFtuxShouldShowPref, Provider<BooleanPreference> shouldShowEquityLadderFtuxPref, Provider<TradeSettingsStore> tradeSettingsStore) {
        Intrinsics.checkNotNullParameter(equityTradeLadderNuxSeenPref, "equityTradeLadderNuxSeenPref");
        Intrinsics.checkNotNullParameter(futuresTradeLadderFtuxShouldShowPref, "futuresTradeLadderFtuxShouldShowPref");
        Intrinsics.checkNotNullParameter(shouldShowEquityLadderFtuxPref, "shouldShowEquityLadderFtuxPref");
        Intrinsics.checkNotNullParameter(tradeSettingsStore, "tradeSettingsStore");
        this.equityTradeLadderNuxSeenPref = equityTradeLadderNuxSeenPref;
        this.futuresTradeLadderFtuxShouldShowPref = futuresTradeLadderFtuxShouldShowPref;
        this.shouldShowEquityLadderFtuxPref = shouldShowEquityLadderFtuxPref;
        this.tradeSettingsStore = tradeSettingsStore;
    }

    @Override // javax.inject.Provider
    public LadderNuxScreenProvider get() {
        Companion companion = INSTANCE;
        BooleanPreference booleanPreference = this.equityTradeLadderNuxSeenPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = this.futuresTradeLadderFtuxShouldShowPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        BooleanPreference booleanPreference3 = this.shouldShowEquityLadderFtuxPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference3, "get(...)");
        TradeSettingsStore tradeSettingsStore = this.tradeSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(tradeSettingsStore, "get(...)");
        return companion.newInstance(booleanPreference, booleanPreference2, booleanPreference3, tradeSettingsStore);
    }

    /* compiled from: LadderNuxScreenProvider_Factory.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/provider/LadderNuxScreenProvider_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/equitytradeladder/provider/LadderNuxScreenProvider_Factory;", "equityTradeLadderNuxSeenPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/BooleanPreference;", "futuresTradeLadderFtuxShouldShowPref", "shouldShowEquityLadderFtuxPref", "tradeSettingsStore", "Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;", "newInstance", "Lcom/robinhood/android/equitytradeladder/provider/LadderNuxScreenProvider;", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LadderNuxScreenProvider_Factory create(Provider<BooleanPreference> equityTradeLadderNuxSeenPref, Provider<BooleanPreference> futuresTradeLadderFtuxShouldShowPref, Provider<BooleanPreference> shouldShowEquityLadderFtuxPref, Provider<TradeSettingsStore> tradeSettingsStore) {
            Intrinsics.checkNotNullParameter(equityTradeLadderNuxSeenPref, "equityTradeLadderNuxSeenPref");
            Intrinsics.checkNotNullParameter(futuresTradeLadderFtuxShouldShowPref, "futuresTradeLadderFtuxShouldShowPref");
            Intrinsics.checkNotNullParameter(shouldShowEquityLadderFtuxPref, "shouldShowEquityLadderFtuxPref");
            Intrinsics.checkNotNullParameter(tradeSettingsStore, "tradeSettingsStore");
            return new LadderNuxScreenProvider_Factory(equityTradeLadderNuxSeenPref, futuresTradeLadderFtuxShouldShowPref, shouldShowEquityLadderFtuxPref, tradeSettingsStore);
        }

        @JvmStatic
        public final LadderNuxScreenProvider newInstance(BooleanPreference equityTradeLadderNuxSeenPref, BooleanPreference futuresTradeLadderFtuxShouldShowPref, BooleanPreference shouldShowEquityLadderFtuxPref, TradeSettingsStore tradeSettingsStore) {
            Intrinsics.checkNotNullParameter(equityTradeLadderNuxSeenPref, "equityTradeLadderNuxSeenPref");
            Intrinsics.checkNotNullParameter(futuresTradeLadderFtuxShouldShowPref, "futuresTradeLadderFtuxShouldShowPref");
            Intrinsics.checkNotNullParameter(shouldShowEquityLadderFtuxPref, "shouldShowEquityLadderFtuxPref");
            Intrinsics.checkNotNullParameter(tradeSettingsStore, "tradeSettingsStore");
            return new LadderNuxScreenProvider(equityTradeLadderNuxSeenPref, futuresTradeLadderFtuxShouldShowPref, shouldShowEquityLadderFtuxPref, tradeSettingsStore);
        }
    }
}
