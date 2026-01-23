package com.robinhood.android.portfolio.pnl;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.portfolio.pnl.dao.InstrumentProfitAndLossRealizedDao;
import com.robinhood.android.portfolio.pnl.dao.ProfitAndLossRealizedDao;
import com.robinhood.android.portfolio.pnl.dao.ProfitAndLossSupportedAssetTypesDao;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import rosetta.portfolio.p541v1.Portfolio;
import wormhole.service.p554v1.PNLService;

/* compiled from: ProfitAndLossHubSectionStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bi\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore;", "Ljavax/inject/Provider;", "Lwormhole/service/v1/PNLService;", "wormholePnlService", "Lrosetta/portfolio/v1/Portfolio;", "portfolioService", "Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossSupportedAssetTypesDao;", "supportedAssetTypesDao", "Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossRealizedDao;", "realizedPnlDao", "Lcom/robinhood/android/portfolio/pnl/dao/InstrumentProfitAndLossRealizedDao;", "instrumentRealizedPnlDao", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore;", "Ljavax/inject/Provider;", "Companion", "lib-store-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ProfitAndLossHubSectionStore_Factory implements Factory<ProfitAndLossHubSectionStore> {
    private final Provider<Clock> clock;
    private final Provider<InstrumentProfitAndLossRealizedDao> instrumentRealizedPnlDao;
    private final Provider<Portfolio> portfolioService;
    private final Provider<ProfitAndLossRealizedDao> realizedPnlDao;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<ProfitAndLossSupportedAssetTypesDao> supportedAssetTypesDao;
    private final Provider<PNLService> wormholePnlService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final ProfitAndLossHubSectionStore_Factory create(Provider<PNLService> provider, Provider<Portfolio> provider2, Provider<ProfitAndLossSupportedAssetTypesDao> provider3, Provider<ProfitAndLossRealizedDao> provider4, Provider<InstrumentProfitAndLossRealizedDao> provider5, Provider<Clock> provider6, Provider<StoreBundle> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final ProfitAndLossHubSectionStore newInstance(PNLService pNLService, Portfolio portfolio, ProfitAndLossSupportedAssetTypesDao profitAndLossSupportedAssetTypesDao, ProfitAndLossRealizedDao profitAndLossRealizedDao, InstrumentProfitAndLossRealizedDao instrumentProfitAndLossRealizedDao, Clock clock, StoreBundle storeBundle) {
        return INSTANCE.newInstance(pNLService, portfolio, profitAndLossSupportedAssetTypesDao, profitAndLossRealizedDao, instrumentProfitAndLossRealizedDao, clock, storeBundle);
    }

    public ProfitAndLossHubSectionStore_Factory(Provider<PNLService> wormholePnlService, Provider<Portfolio> portfolioService, Provider<ProfitAndLossSupportedAssetTypesDao> supportedAssetTypesDao, Provider<ProfitAndLossRealizedDao> realizedPnlDao, Provider<InstrumentProfitAndLossRealizedDao> instrumentRealizedPnlDao, Provider<Clock> clock, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(wormholePnlService, "wormholePnlService");
        Intrinsics.checkNotNullParameter(portfolioService, "portfolioService");
        Intrinsics.checkNotNullParameter(supportedAssetTypesDao, "supportedAssetTypesDao");
        Intrinsics.checkNotNullParameter(realizedPnlDao, "realizedPnlDao");
        Intrinsics.checkNotNullParameter(instrumentRealizedPnlDao, "instrumentRealizedPnlDao");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.wormholePnlService = wormholePnlService;
        this.portfolioService = portfolioService;
        this.supportedAssetTypesDao = supportedAssetTypesDao;
        this.realizedPnlDao = realizedPnlDao;
        this.instrumentRealizedPnlDao = instrumentRealizedPnlDao;
        this.clock = clock;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public ProfitAndLossHubSectionStore get() {
        Companion companion = INSTANCE;
        PNLService pNLService = this.wormholePnlService.get();
        Intrinsics.checkNotNullExpressionValue(pNLService, "get(...)");
        Portfolio portfolio = this.portfolioService.get();
        Intrinsics.checkNotNullExpressionValue(portfolio, "get(...)");
        ProfitAndLossSupportedAssetTypesDao profitAndLossSupportedAssetTypesDao = this.supportedAssetTypesDao.get();
        Intrinsics.checkNotNullExpressionValue(profitAndLossSupportedAssetTypesDao, "get(...)");
        ProfitAndLossRealizedDao profitAndLossRealizedDao = this.realizedPnlDao.get();
        Intrinsics.checkNotNullExpressionValue(profitAndLossRealizedDao, "get(...)");
        InstrumentProfitAndLossRealizedDao instrumentProfitAndLossRealizedDao = this.instrumentRealizedPnlDao.get();
        Intrinsics.checkNotNullExpressionValue(instrumentProfitAndLossRealizedDao, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(pNLService, portfolio, profitAndLossSupportedAssetTypesDao, profitAndLossRealizedDao, instrumentProfitAndLossRealizedDao, clock, storeBundle);
    }

    /* compiled from: ProfitAndLossHubSectionStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jq\u0010\u0014\u001a\u00020\u00132\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015JG\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lwormhole/service/v1/PNLService;", "wormholePnlService", "Lrosetta/portfolio/v1/Portfolio;", "portfolioService", "Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossSupportedAssetTypesDao;", "supportedAssetTypesDao", "Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossRealizedDao;", "realizedPnlDao", "Lcom/robinhood/android/portfolio/pnl/dao/InstrumentProfitAndLossRealizedDao;", "instrumentRealizedPnlDao", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore_Factory;", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore;", "newInstance", "(Lwormhole/service/v1/PNLService;Lrosetta/portfolio/v1/Portfolio;Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossSupportedAssetTypesDao;Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossRealizedDao;Lcom/robinhood/android/portfolio/pnl/dao/InstrumentProfitAndLossRealizedDao;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore;", "lib-store-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ProfitAndLossHubSectionStore_Factory create(Provider<PNLService> wormholePnlService, Provider<Portfolio> portfolioService, Provider<ProfitAndLossSupportedAssetTypesDao> supportedAssetTypesDao, Provider<ProfitAndLossRealizedDao> realizedPnlDao, Provider<InstrumentProfitAndLossRealizedDao> instrumentRealizedPnlDao, Provider<Clock> clock, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(wormholePnlService, "wormholePnlService");
            Intrinsics.checkNotNullParameter(portfolioService, "portfolioService");
            Intrinsics.checkNotNullParameter(supportedAssetTypesDao, "supportedAssetTypesDao");
            Intrinsics.checkNotNullParameter(realizedPnlDao, "realizedPnlDao");
            Intrinsics.checkNotNullParameter(instrumentRealizedPnlDao, "instrumentRealizedPnlDao");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new ProfitAndLossHubSectionStore_Factory(wormholePnlService, portfolioService, supportedAssetTypesDao, realizedPnlDao, instrumentRealizedPnlDao, clock, storeBundle);
        }

        @JvmStatic
        public final ProfitAndLossHubSectionStore newInstance(PNLService wormholePnlService, Portfolio portfolioService, ProfitAndLossSupportedAssetTypesDao supportedAssetTypesDao, ProfitAndLossRealizedDao realizedPnlDao, InstrumentProfitAndLossRealizedDao instrumentRealizedPnlDao, Clock clock, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(wormholePnlService, "wormholePnlService");
            Intrinsics.checkNotNullParameter(portfolioService, "portfolioService");
            Intrinsics.checkNotNullParameter(supportedAssetTypesDao, "supportedAssetTypesDao");
            Intrinsics.checkNotNullParameter(realizedPnlDao, "realizedPnlDao");
            Intrinsics.checkNotNullParameter(instrumentRealizedPnlDao, "instrumentRealizedPnlDao");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new ProfitAndLossHubSectionStore(wormholePnlService, portfolioService, supportedAssetTypesDao, realizedPnlDao, instrumentRealizedPnlDao, clock, storeBundle);
        }
    }
}
