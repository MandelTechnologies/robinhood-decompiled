package com.robinhood.store.futures.marketdata;

import android.app.Application;
import android.os.PowerManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.api.futures.FuturesMarketdataApi;
import com.robinhood.android.models.futures.marketdata.dao.FuturesQuoteDao;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: FuturesQuoteStore_Factory.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B[\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/api/futures/FuturesMarketdataApi;", "marketdataApi", "Lcom/robinhood/android/models/futures/marketdata/dao/FuturesQuoteDao;", "quoteDao", "j$/time/Clock", Card.Icon.CLOCK, "Landroid/os/PowerManager;", "powerManager", "Landroid/app/Application;", "application", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "Ljavax/inject/Provider;", "Companion", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class FuturesQuoteStore_Factory implements Factory<FuturesQuoteStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Application> application;
    private final Provider<Clock> clock;
    private final Provider<FuturesMarketdataApi> marketdataApi;
    private final Provider<PowerManager> powerManager;
    private final Provider<FuturesQuoteDao> quoteDao;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final FuturesQuoteStore_Factory create(Provider<FuturesMarketdataApi> provider, Provider<FuturesQuoteDao> provider2, Provider<Clock> provider3, Provider<PowerManager> provider4, Provider<Application> provider5, Provider<StoreBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final FuturesQuoteStore newInstance(FuturesMarketdataApi futuresMarketdataApi, FuturesQuoteDao futuresQuoteDao, Clock clock, PowerManager powerManager, Application application, StoreBundle storeBundle) {
        return INSTANCE.newInstance(futuresMarketdataApi, futuresQuoteDao, clock, powerManager, application, storeBundle);
    }

    public FuturesQuoteStore_Factory(Provider<FuturesMarketdataApi> marketdataApi, Provider<FuturesQuoteDao> quoteDao, Provider<Clock> clock, Provider<PowerManager> powerManager, Provider<Application> application, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(marketdataApi, "marketdataApi");
        Intrinsics.checkNotNullParameter(quoteDao, "quoteDao");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(powerManager, "powerManager");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.marketdataApi = marketdataApi;
        this.quoteDao = quoteDao;
        this.clock = clock;
        this.powerManager = powerManager;
        this.application = application;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public FuturesQuoteStore get() {
        Companion companion = INSTANCE;
        FuturesMarketdataApi futuresMarketdataApi = this.marketdataApi.get();
        Intrinsics.checkNotNullExpressionValue(futuresMarketdataApi, "get(...)");
        FuturesQuoteDao futuresQuoteDao = this.quoteDao.get();
        Intrinsics.checkNotNullExpressionValue(futuresQuoteDao, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        PowerManager powerManager = this.powerManager.get();
        Intrinsics.checkNotNullExpressionValue(powerManager, "get(...)");
        Application application = this.application.get();
        Intrinsics.checkNotNullExpressionValue(application, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(futuresMarketdataApi, futuresQuoteDao, clock, powerManager, application, storeBundle);
    }

    /* compiled from: FuturesQuoteStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\u0012\u001a\u00020\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/api/futures/FuturesMarketdataApi;", "marketdataApi", "Lcom/robinhood/android/models/futures/marketdata/dao/FuturesQuoteDao;", "quoteDao", "j$/time/Clock", Card.Icon.CLOCK, "Landroid/os/PowerManager;", "powerManager", "Landroid/app/Application;", "application", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore_Factory;", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "newInstance", "(Lcom/robinhood/android/lib/api/futures/FuturesMarketdataApi;Lcom/robinhood/android/models/futures/marketdata/dao/FuturesQuoteDao;Lj$/time/Clock;Landroid/os/PowerManager;Landroid/app/Application;Lcom/robinhood/store/StoreBundle;)Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FuturesQuoteStore_Factory create(Provider<FuturesMarketdataApi> marketdataApi, Provider<FuturesQuoteDao> quoteDao, Provider<Clock> clock, Provider<PowerManager> powerManager, Provider<Application> application, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(marketdataApi, "marketdataApi");
            Intrinsics.checkNotNullParameter(quoteDao, "quoteDao");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(powerManager, "powerManager");
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new FuturesQuoteStore_Factory(marketdataApi, quoteDao, clock, powerManager, application, storeBundle);
        }

        @JvmStatic
        public final FuturesQuoteStore newInstance(FuturesMarketdataApi marketdataApi, FuturesQuoteDao quoteDao, Clock clock, PowerManager powerManager, Application application, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(marketdataApi, "marketdataApi");
            Intrinsics.checkNotNullParameter(quoteDao, "quoteDao");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(powerManager, "powerManager");
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new FuturesQuoteStore(marketdataApi, quoteDao, clock, powerManager, application, storeBundle);
        }
    }
}
