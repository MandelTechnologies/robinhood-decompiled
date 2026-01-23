package com.robinhood.android.trade.options;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.OptionTradeSettingsStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderTradingSessionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderTradingSessionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/trade/options/OptionOrderTradingSessionDuxo;", "marketHoursManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "optionTradeSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionTradeSettingsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/trade/options/OptionOrderTradingSessionStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class OptionOrderTradingSessionDuxo_Factory implements Factory<OptionOrderTradingSessionDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<TraderMarketHoursManager> marketHoursManager;
    private final Provider<OptionTradeSettingsStore> optionTradeSettingsStore;
    private final Provider<OptionOrderTradingSessionDuxo3> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OptionOrderTradingSessionDuxo_Factory create(Provider<TraderMarketHoursManager> provider, Provider<OptionTradeSettingsStore> provider2, Provider<DuxoBundle> provider3, Provider<OptionOrderTradingSessionDuxo3> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final OptionOrderTradingSessionDuxo newInstance(TraderMarketHoursManager traderMarketHoursManager, OptionTradeSettingsStore optionTradeSettingsStore, DuxoBundle duxoBundle, OptionOrderTradingSessionDuxo3 optionOrderTradingSessionDuxo3) {
        return INSTANCE.newInstance(traderMarketHoursManager, optionTradeSettingsStore, duxoBundle, optionOrderTradingSessionDuxo3);
    }

    public OptionOrderTradingSessionDuxo_Factory(Provider<TraderMarketHoursManager> marketHoursManager, Provider<OptionTradeSettingsStore> optionTradeSettingsStore, Provider<DuxoBundle> duxoBundle, Provider<OptionOrderTradingSessionDuxo3> stateProvider) {
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(optionTradeSettingsStore, "optionTradeSettingsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.marketHoursManager = marketHoursManager;
        this.optionTradeSettingsStore = optionTradeSettingsStore;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public OptionOrderTradingSessionDuxo get() {
        Companion companion = INSTANCE;
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        OptionTradeSettingsStore optionTradeSettingsStore = this.optionTradeSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(optionTradeSettingsStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        OptionOrderTradingSessionDuxo3 optionOrderTradingSessionDuxo3 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderTradingSessionDuxo3, "get(...)");
        return companion.newInstance(traderMarketHoursManager, optionTradeSettingsStore, duxoBundle, optionOrderTradingSessionDuxo3);
    }

    /* compiled from: OptionOrderTradingSessionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderTradingSessionDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/trade/options/OptionOrderTradingSessionDuxo_Factory;", "marketHoursManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "optionTradeSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionTradeSettingsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/trade/options/OptionOrderTradingSessionStateProvider;", "newInstance", "Lcom/robinhood/android/trade/options/OptionOrderTradingSessionDuxo;", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionOrderTradingSessionDuxo_Factory create(Provider<TraderMarketHoursManager> marketHoursManager, Provider<OptionTradeSettingsStore> optionTradeSettingsStore, Provider<DuxoBundle> duxoBundle, Provider<OptionOrderTradingSessionDuxo3> stateProvider) {
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(optionTradeSettingsStore, "optionTradeSettingsStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new OptionOrderTradingSessionDuxo_Factory(marketHoursManager, optionTradeSettingsStore, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final OptionOrderTradingSessionDuxo newInstance(TraderMarketHoursManager marketHoursManager, OptionTradeSettingsStore optionTradeSettingsStore, DuxoBundle duxoBundle, OptionOrderTradingSessionDuxo3 stateProvider) {
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(optionTradeSettingsStore, "optionTradeSettingsStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new OptionOrderTradingSessionDuxo(marketHoursManager, optionTradeSettingsStore, duxoBundle, stateProvider);
        }
    }
}
