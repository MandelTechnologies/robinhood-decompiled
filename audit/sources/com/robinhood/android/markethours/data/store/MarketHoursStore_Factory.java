package com.robinhood.android.markethours.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.dao.EquityOrderSessionDao;
import com.robinhood.models.dao.MarketHoursDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: MarketHoursStore_Factory.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B[\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/markethours/data/store/MarketHoursStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "Ljavax/inject/Provider;", "Lcom/robinhood/api/retrofit/Brokeback;", "brokeback", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "equitiesBrokeback", "Lcom/robinhood/models/dao/MarketHoursDao;", "marketHoursDao", "Lcom/robinhood/models/dao/EquityOrderSessionDao;", "orderSessionDao", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "Ljavax/inject/Provider;", "Companion", "lib-market-hours_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class MarketHoursStore_Factory implements Factory<MarketHoursStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Brokeback> brokeback;
    private final Provider<Clock> clock;
    private final Provider<EquitiesBrokeback> equitiesBrokeback;
    private final Provider<MarketHoursDao> marketHoursDao;
    private final Provider<EquityOrderSessionDao> orderSessionDao;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final MarketHoursStore_Factory create(Provider<Brokeback> provider, Provider<EquitiesBrokeback> provider2, Provider<MarketHoursDao> provider3, Provider<EquityOrderSessionDao> provider4, Provider<Clock> provider5, Provider<StoreBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final MarketHoursStore newInstance(Brokeback brokeback, EquitiesBrokeback equitiesBrokeback, MarketHoursDao marketHoursDao, EquityOrderSessionDao equityOrderSessionDao, Clock clock, StoreBundle storeBundle) {
        return INSTANCE.newInstance(brokeback, equitiesBrokeback, marketHoursDao, equityOrderSessionDao, clock, storeBundle);
    }

    public MarketHoursStore_Factory(Provider<Brokeback> brokeback, Provider<EquitiesBrokeback> equitiesBrokeback, Provider<MarketHoursDao> marketHoursDao, Provider<EquityOrderSessionDao> orderSessionDao, Provider<Clock> clock, Provider<StoreBundle> storeBundle) {
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
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public MarketHoursStore get() {
        Companion companion = INSTANCE;
        Brokeback brokeback = this.brokeback.get();
        Intrinsics.checkNotNullExpressionValue(brokeback, "get(...)");
        EquitiesBrokeback equitiesBrokeback = this.equitiesBrokeback.get();
        Intrinsics.checkNotNullExpressionValue(equitiesBrokeback, "get(...)");
        MarketHoursDao marketHoursDao = this.marketHoursDao.get();
        Intrinsics.checkNotNullExpressionValue(marketHoursDao, "get(...)");
        EquityOrderSessionDao equityOrderSessionDao = this.orderSessionDao.get();
        Intrinsics.checkNotNullExpressionValue(equityOrderSessionDao, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(brokeback, equitiesBrokeback, marketHoursDao, equityOrderSessionDao, clock, storeBundle);
    }

    /* compiled from: MarketHoursStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\u0012\u001a\u00020\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/markethours/data/store/MarketHoursStore_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/api/retrofit/Brokeback;", "brokeback", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "equitiesBrokeback", "Lcom/robinhood/models/dao/MarketHoursDao;", "marketHoursDao", "Lcom/robinhood/models/dao/EquityOrderSessionDao;", "orderSessionDao", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/markethours/data/store/MarketHoursStore_Factory;", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "newInstance", "(Lcom/robinhood/api/retrofit/Brokeback;Lcom/robinhood/api/equity/EquitiesBrokeback;Lcom/robinhood/models/dao/MarketHoursDao;Lcom/robinhood/models/dao/EquityOrderSessionDao;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "lib-market-hours_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MarketHoursStore_Factory create(Provider<Brokeback> brokeback, Provider<EquitiesBrokeback> equitiesBrokeback, Provider<MarketHoursDao> marketHoursDao, Provider<EquityOrderSessionDao> orderSessionDao, Provider<Clock> clock, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(brokeback, "brokeback");
            Intrinsics.checkNotNullParameter(equitiesBrokeback, "equitiesBrokeback");
            Intrinsics.checkNotNullParameter(marketHoursDao, "marketHoursDao");
            Intrinsics.checkNotNullParameter(orderSessionDao, "orderSessionDao");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new MarketHoursStore_Factory(brokeback, equitiesBrokeback, marketHoursDao, orderSessionDao, clock, storeBundle);
        }

        @JvmStatic
        public final MarketHoursStore newInstance(Brokeback brokeback, EquitiesBrokeback equitiesBrokeback, MarketHoursDao marketHoursDao, EquityOrderSessionDao orderSessionDao, Clock clock, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(brokeback, "brokeback");
            Intrinsics.checkNotNullParameter(equitiesBrokeback, "equitiesBrokeback");
            Intrinsics.checkNotNullParameter(marketHoursDao, "marketHoursDao");
            Intrinsics.checkNotNullParameter(orderSessionDao, "orderSessionDao");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new MarketHoursStore(brokeback, equitiesBrokeback, marketHoursDao, orderSessionDao, clock, storeBundle);
        }
    }
}
