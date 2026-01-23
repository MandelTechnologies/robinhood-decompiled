package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.dao.AggregateOptionPositionQuoteDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: AggregateOptionQuoteStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "optionsApi", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/models/dao/AggregateOptionPositionQuoteDao;", "dao", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "optionsExtendedHoursEnabledStore", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore;", "Ljavax/inject/Provider;", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class AggregateOptionQuoteStore_Factory implements Factory<AggregateOptionQuoteStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Clock> clock;
    private final Provider<AggregateOptionPositionQuoteDao> dao;
    private final Provider<OptionsApi> optionsApi;
    private final Provider<OptionsExtendedHoursEnabledStore> optionsExtendedHoursEnabledStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final AggregateOptionQuoteStore_Factory create(Provider<OptionsApi> provider, Provider<Clock> provider2, Provider<StoreBundle> provider3, Provider<AggregateOptionPositionQuoteDao> provider4, Provider<OptionsExtendedHoursEnabledStore> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final AggregateOptionQuoteStore newInstance(OptionsApi optionsApi, Clock clock, StoreBundle storeBundle, AggregateOptionPositionQuoteDao aggregateOptionPositionQuoteDao, OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore) {
        return INSTANCE.newInstance(optionsApi, clock, storeBundle, aggregateOptionPositionQuoteDao, optionsExtendedHoursEnabledStore);
    }

    public AggregateOptionQuoteStore_Factory(Provider<OptionsApi> optionsApi, Provider<Clock> clock, Provider<StoreBundle> storeBundle, Provider<AggregateOptionPositionQuoteDao> dao, Provider<OptionsExtendedHoursEnabledStore> optionsExtendedHoursEnabledStore) {
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
        this.optionsApi = optionsApi;
        this.clock = clock;
        this.storeBundle = storeBundle;
        this.dao = dao;
        this.optionsExtendedHoursEnabledStore = optionsExtendedHoursEnabledStore;
    }

    @Override // javax.inject.Provider
    public AggregateOptionQuoteStore get() {
        Companion companion = INSTANCE;
        OptionsApi optionsApi = this.optionsApi.get();
        Intrinsics.checkNotNullExpressionValue(optionsApi, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        AggregateOptionPositionQuoteDao aggregateOptionPositionQuoteDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(aggregateOptionPositionQuoteDao, "get(...)");
        OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore = this.optionsExtendedHoursEnabledStore.get();
        Intrinsics.checkNotNullExpressionValue(optionsExtendedHoursEnabledStore, "get(...)");
        return companion.newInstance(optionsApi, clock, storeBundle, aggregateOptionPositionQuoteDao, optionsExtendedHoursEnabledStore);
    }

    /* compiled from: AggregateOptionQuoteStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "optionsApi", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/models/dao/AggregateOptionPositionQuoteDao;", "dao", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "optionsExtendedHoursEnabledStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore_Factory;", "Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore;", "newInstance", "(Lcom/robinhood/android/api/options/retrofit/OptionsApi;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/AggregateOptionPositionQuoteDao;Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;)Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AggregateOptionQuoteStore_Factory create(Provider<OptionsApi> optionsApi, Provider<Clock> clock, Provider<StoreBundle> storeBundle, Provider<AggregateOptionPositionQuoteDao> dao, Provider<OptionsExtendedHoursEnabledStore> optionsExtendedHoursEnabledStore) {
            Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
            return new AggregateOptionQuoteStore_Factory(optionsApi, clock, storeBundle, dao, optionsExtendedHoursEnabledStore);
        }

        @JvmStatic
        public final AggregateOptionQuoteStore newInstance(OptionsApi optionsApi, Clock clock, StoreBundle storeBundle, AggregateOptionPositionQuoteDao dao, OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore) {
            Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
            return new AggregateOptionQuoteStore(optionsApi, clock, storeBundle, dao, optionsExtendedHoursEnabledStore);
        }
    }
}
