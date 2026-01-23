package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.models.retirement.dao.RetirementNuxDao;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: RetirementNuxStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bi\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementNuxStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementNuxStore;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/retirement/RetirementApi;", "retirementApi", "Lcom/robinhood/android/models/retirement/dao/RetirementNuxDao;", "retirementNuxDao", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/prefs/StringPreference;", "retirementOptionsAssetHomeTooltipLastShownPref", "Lcom/robinhood/prefs/IntPreference;", "retirementOptionsAssetHomeTooltipTimesShownPref", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementNuxStore;", "Ljavax/inject/Provider;", "Companion", "lib-store-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RetirementNuxStore_Factory implements Factory<RetirementNuxStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Clock> clock;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<RetirementApi> retirementApi;
    private final Provider<RetirementNuxDao> retirementNuxDao;
    private final Provider<StringPreference> retirementOptionsAssetHomeTooltipLastShownPref;
    private final Provider<IntPreference> retirementOptionsAssetHomeTooltipTimesShownPref;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final RetirementNuxStore_Factory create(Provider<RetirementApi> provider, Provider<RetirementNuxDao> provider2, Provider<RegionGateProvider> provider3, Provider<StringPreference> provider4, Provider<IntPreference> provider5, Provider<Clock> provider6, Provider<StoreBundle> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final RetirementNuxStore newInstance(RetirementApi retirementApi, RetirementNuxDao retirementNuxDao, RegionGateProvider regionGateProvider, StringPreference stringPreference, IntPreference intPreference, Clock clock, StoreBundle storeBundle) {
        return INSTANCE.newInstance(retirementApi, retirementNuxDao, regionGateProvider, stringPreference, intPreference, clock, storeBundle);
    }

    public RetirementNuxStore_Factory(Provider<RetirementApi> retirementApi, Provider<RetirementNuxDao> retirementNuxDao, Provider<RegionGateProvider> regionGateProvider, Provider<StringPreference> retirementOptionsAssetHomeTooltipLastShownPref, Provider<IntPreference> retirementOptionsAssetHomeTooltipTimesShownPref, Provider<Clock> clock, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(retirementApi, "retirementApi");
        Intrinsics.checkNotNullParameter(retirementNuxDao, "retirementNuxDao");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(retirementOptionsAssetHomeTooltipLastShownPref, "retirementOptionsAssetHomeTooltipLastShownPref");
        Intrinsics.checkNotNullParameter(retirementOptionsAssetHomeTooltipTimesShownPref, "retirementOptionsAssetHomeTooltipTimesShownPref");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.retirementApi = retirementApi;
        this.retirementNuxDao = retirementNuxDao;
        this.regionGateProvider = regionGateProvider;
        this.retirementOptionsAssetHomeTooltipLastShownPref = retirementOptionsAssetHomeTooltipLastShownPref;
        this.retirementOptionsAssetHomeTooltipTimesShownPref = retirementOptionsAssetHomeTooltipTimesShownPref;
        this.clock = clock;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public RetirementNuxStore get() {
        Companion companion = INSTANCE;
        RetirementApi retirementApi = this.retirementApi.get();
        Intrinsics.checkNotNullExpressionValue(retirementApi, "get(...)");
        RetirementNuxDao retirementNuxDao = this.retirementNuxDao.get();
        Intrinsics.checkNotNullExpressionValue(retirementNuxDao, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        StringPreference stringPreference = this.retirementOptionsAssetHomeTooltipLastShownPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        IntPreference intPreference = this.retirementOptionsAssetHomeTooltipTimesShownPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(retirementApi, retirementNuxDao, regionGateProvider, stringPreference, intPreference, clock, storeBundle);
    }

    /* compiled from: RetirementNuxStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jq\u0010\u0014\u001a\u00020\u00132\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015JG\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementNuxStore_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/retirement/RetirementApi;", "retirementApi", "Lcom/robinhood/android/models/retirement/dao/RetirementNuxDao;", "retirementNuxDao", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/prefs/StringPreference;", "retirementOptionsAssetHomeTooltipLastShownPref", "Lcom/robinhood/prefs/IntPreference;", "retirementOptionsAssetHomeTooltipTimesShownPref", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementNuxStore_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementNuxStore_Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementNuxStore;", "newInstance", "(Lcom/robinhood/android/api/retirement/RetirementApi;Lcom/robinhood/android/models/retirement/dao/RetirementNuxDao;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/IntPreference;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementNuxStore;", "lib-store-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RetirementNuxStore_Factory create(Provider<RetirementApi> retirementApi, Provider<RetirementNuxDao> retirementNuxDao, Provider<RegionGateProvider> regionGateProvider, Provider<StringPreference> retirementOptionsAssetHomeTooltipLastShownPref, Provider<IntPreference> retirementOptionsAssetHomeTooltipTimesShownPref, Provider<Clock> clock, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(retirementApi, "retirementApi");
            Intrinsics.checkNotNullParameter(retirementNuxDao, "retirementNuxDao");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(retirementOptionsAssetHomeTooltipLastShownPref, "retirementOptionsAssetHomeTooltipLastShownPref");
            Intrinsics.checkNotNullParameter(retirementOptionsAssetHomeTooltipTimesShownPref, "retirementOptionsAssetHomeTooltipTimesShownPref");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new RetirementNuxStore_Factory(retirementApi, retirementNuxDao, regionGateProvider, retirementOptionsAssetHomeTooltipLastShownPref, retirementOptionsAssetHomeTooltipTimesShownPref, clock, storeBundle);
        }

        @JvmStatic
        public final RetirementNuxStore newInstance(RetirementApi retirementApi, RetirementNuxDao retirementNuxDao, RegionGateProvider regionGateProvider, StringPreference retirementOptionsAssetHomeTooltipLastShownPref, IntPreference retirementOptionsAssetHomeTooltipTimesShownPref, Clock clock, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(retirementApi, "retirementApi");
            Intrinsics.checkNotNullParameter(retirementNuxDao, "retirementNuxDao");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(retirementOptionsAssetHomeTooltipLastShownPref, "retirementOptionsAssetHomeTooltipLastShownPref");
            Intrinsics.checkNotNullParameter(retirementOptionsAssetHomeTooltipTimesShownPref, "retirementOptionsAssetHomeTooltipTimesShownPref");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new RetirementNuxStore(retirementApi, retirementNuxDao, regionGateProvider, retirementOptionsAssetHomeTooltipLastShownPref, retirementOptionsAssetHomeTooltipTimesShownPref, clock, storeBundle);
        }
    }
}
