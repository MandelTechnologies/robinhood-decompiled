package com.robinhood.librobinhood.data.store;

import android.app.Application;
import android.os.PowerManager;
import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.dao.AggregateOptionStrategyQuoteDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: AggregateOptionStrategyQuoteStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bi\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "optionsApi", "Landroid/app/Application;", "application", "Landroid/os/PowerManager;", "powerManager", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/models/dao/AggregateOptionStrategyQuoteDao;", "dao", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "optionsExtendedHoursEnabledStore", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "Ljavax/inject/Provider;", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class AggregateOptionStrategyQuoteStore_Factory implements Factory<AggregateOptionStrategyQuoteStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Application> application;
    private final Provider<Clock> clock;
    private final Provider<AggregateOptionStrategyQuoteDao> dao;
    private final Provider<OptionsApi> optionsApi;
    private final Provider<OptionsExtendedHoursEnabledStore> optionsExtendedHoursEnabledStore;
    private final Provider<PowerManager> powerManager;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final AggregateOptionStrategyQuoteStore_Factory create(Provider<OptionsApi> provider, Provider<Application> provider2, Provider<PowerManager> provider3, Provider<Clock> provider4, Provider<StoreBundle> provider5, Provider<AggregateOptionStrategyQuoteDao> provider6, Provider<OptionsExtendedHoursEnabledStore> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final AggregateOptionStrategyQuoteStore newInstance(OptionsApi optionsApi, Application application, PowerManager powerManager, Clock clock, StoreBundle storeBundle, AggregateOptionStrategyQuoteDao aggregateOptionStrategyQuoteDao, OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore) {
        return INSTANCE.newInstance(optionsApi, application, powerManager, clock, storeBundle, aggregateOptionStrategyQuoteDao, optionsExtendedHoursEnabledStore);
    }

    public AggregateOptionStrategyQuoteStore_Factory(Provider<OptionsApi> optionsApi, Provider<Application> application, Provider<PowerManager> powerManager, Provider<Clock> clock, Provider<StoreBundle> storeBundle, Provider<AggregateOptionStrategyQuoteDao> dao, Provider<OptionsExtendedHoursEnabledStore> optionsExtendedHoursEnabledStore) {
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(powerManager, "powerManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
        this.optionsApi = optionsApi;
        this.application = application;
        this.powerManager = powerManager;
        this.clock = clock;
        this.storeBundle = storeBundle;
        this.dao = dao;
        this.optionsExtendedHoursEnabledStore = optionsExtendedHoursEnabledStore;
    }

    @Override // javax.inject.Provider
    public AggregateOptionStrategyQuoteStore get() {
        Companion companion = INSTANCE;
        OptionsApi optionsApi = this.optionsApi.get();
        Intrinsics.checkNotNullExpressionValue(optionsApi, "get(...)");
        Application application = this.application.get();
        Intrinsics.checkNotNullExpressionValue(application, "get(...)");
        PowerManager powerManager = this.powerManager.get();
        Intrinsics.checkNotNullExpressionValue(powerManager, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        AggregateOptionStrategyQuoteDao aggregateOptionStrategyQuoteDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(aggregateOptionStrategyQuoteDao, "get(...)");
        OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore = this.optionsExtendedHoursEnabledStore.get();
        Intrinsics.checkNotNullExpressionValue(optionsExtendedHoursEnabledStore, "get(...)");
        return companion.newInstance(optionsApi, application, powerManager, clock, storeBundle, aggregateOptionStrategyQuoteDao, optionsExtendedHoursEnabledStore);
    }

    /* compiled from: AggregateOptionStrategyQuoteStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jq\u0010\u0014\u001a\u00020\u00132\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015JG\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "optionsApi", "Landroid/app/Application;", "application", "Landroid/os/PowerManager;", "powerManager", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/models/dao/AggregateOptionStrategyQuoteDao;", "dao", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "optionsExtendedHoursEnabledStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore_Factory;", "Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "newInstance", "(Lcom/robinhood/android/api/options/retrofit/OptionsApi;Landroid/app/Application;Landroid/os/PowerManager;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/AggregateOptionStrategyQuoteDao;Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;)Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AggregateOptionStrategyQuoteStore_Factory create(Provider<OptionsApi> optionsApi, Provider<Application> application, Provider<PowerManager> powerManager, Provider<Clock> clock, Provider<StoreBundle> storeBundle, Provider<AggregateOptionStrategyQuoteDao> dao, Provider<OptionsExtendedHoursEnabledStore> optionsExtendedHoursEnabledStore) {
            Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(powerManager, "powerManager");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
            return new AggregateOptionStrategyQuoteStore_Factory(optionsApi, application, powerManager, clock, storeBundle, dao, optionsExtendedHoursEnabledStore);
        }

        @JvmStatic
        public final AggregateOptionStrategyQuoteStore newInstance(OptionsApi optionsApi, Application application, PowerManager powerManager, Clock clock, StoreBundle storeBundle, AggregateOptionStrategyQuoteDao dao, OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore) {
            Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(powerManager, "powerManager");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
            return new AggregateOptionStrategyQuoteStore(optionsApi, application, powerManager, clock, storeBundle, dao, optionsExtendedHoursEnabledStore);
        }
    }
}
