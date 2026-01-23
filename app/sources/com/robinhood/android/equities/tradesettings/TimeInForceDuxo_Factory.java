package com.robinhood.android.equities.tradesettings;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.EquityOrderExpireDateStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TimeInForceDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/TimeInForceDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/equities/tradesettings/TimeInForceDuxo;", "tradeSettingsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "orderExpireDateStore", "Lcom/robinhood/librobinhood/data/store/EquityOrderExpireDateStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/equities/tradesettings/TimeInForceStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class TimeInForceDuxo_Factory implements Factory<TimeInForceDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<TraderMarketHoursManager> marketHoursManager;
    private final Provider<EquityOrderExpireDateStore> orderExpireDateStore;
    private final Provider<TimeInForceStateProvider> stateProvider;
    private final Provider<TradeSettingsStore> tradeSettingsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final TimeInForceDuxo_Factory create(Provider<TradeSettingsStore> provider, Provider<TraderMarketHoursManager> provider2, Provider<EquityOrderExpireDateStore> provider3, Provider<DuxoBundle> provider4, Provider<TimeInForceStateProvider> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final TimeInForceDuxo newInstance(TradeSettingsStore tradeSettingsStore, TraderMarketHoursManager traderMarketHoursManager, EquityOrderExpireDateStore equityOrderExpireDateStore, DuxoBundle duxoBundle, TimeInForceStateProvider timeInForceStateProvider) {
        return INSTANCE.newInstance(tradeSettingsStore, traderMarketHoursManager, equityOrderExpireDateStore, duxoBundle, timeInForceStateProvider);
    }

    public TimeInForceDuxo_Factory(Provider<TradeSettingsStore> tradeSettingsStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<EquityOrderExpireDateStore> orderExpireDateStore, Provider<DuxoBundle> duxoBundle, Provider<TimeInForceStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(tradeSettingsStore, "tradeSettingsStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(orderExpireDateStore, "orderExpireDateStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.tradeSettingsStore = tradeSettingsStore;
        this.marketHoursManager = marketHoursManager;
        this.orderExpireDateStore = orderExpireDateStore;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public TimeInForceDuxo get() {
        Companion companion = INSTANCE;
        TradeSettingsStore tradeSettingsStore = this.tradeSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(tradeSettingsStore, "get(...)");
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        EquityOrderExpireDateStore equityOrderExpireDateStore = this.orderExpireDateStore.get();
        Intrinsics.checkNotNullExpressionValue(equityOrderExpireDateStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        TimeInForceStateProvider timeInForceStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(timeInForceStateProvider, "get(...)");
        return companion.newInstance(tradeSettingsStore, traderMarketHoursManager, equityOrderExpireDateStore, duxoBundle, timeInForceStateProvider);
    }

    /* compiled from: TimeInForceDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/TimeInForceDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/equities/tradesettings/TimeInForceDuxo_Factory;", "tradeSettingsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "orderExpireDateStore", "Lcom/robinhood/librobinhood/data/store/EquityOrderExpireDateStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/equities/tradesettings/TimeInForceStateProvider;", "newInstance", "Lcom/robinhood/android/equities/tradesettings/TimeInForceDuxo;", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TimeInForceDuxo_Factory create(Provider<TradeSettingsStore> tradeSettingsStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<EquityOrderExpireDateStore> orderExpireDateStore, Provider<DuxoBundle> duxoBundle, Provider<TimeInForceStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(tradeSettingsStore, "tradeSettingsStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(orderExpireDateStore, "orderExpireDateStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new TimeInForceDuxo_Factory(tradeSettingsStore, marketHoursManager, orderExpireDateStore, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final TimeInForceDuxo newInstance(TradeSettingsStore tradeSettingsStore, TraderMarketHoursManager marketHoursManager, EquityOrderExpireDateStore orderExpireDateStore, DuxoBundle duxoBundle, TimeInForceStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(tradeSettingsStore, "tradeSettingsStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(orderExpireDateStore, "orderExpireDateStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new TimeInForceDuxo(tradeSettingsStore, marketHoursManager, orderExpireDateStore, duxoBundle, stateProvider);
        }
    }
}
