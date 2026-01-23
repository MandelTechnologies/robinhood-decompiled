package com.robinhood.android.onboarding.store.identi;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.sortinghat.SortingHatApi;
import com.robinhood.models.api.sortinghat.SortingHatBonfireApi;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.dao.SortingHatDaoV2;
import com.robinhood.models.dao.identi.SortingHatUserStateDao;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.Installation;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: TraderSortingHatStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0085\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/onboarding/store/identi/TraderSortingHatStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/onboarding/store/identi/TraderSortingHatStore;", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/models/api/sortinghat/SortingHatApi;", "sortingHatApi", "Lcom/robinhood/models/api/sortinghat/SortingHatBonfireApi;", "sortingHatBonfireApi", "Lcom/robinhood/prefs/Installation;", "installation", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/models/dao/SortingHatDaoV2;", "sortingHatDao", "Lcom/robinhood/models/dao/identi/SortingHatUserStateDao;", "userStateStore", "Lcom/robinhood/prefs/BooleanPreference;", "hasCryptoImpressionPref", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/onboarding/store/identi/TraderSortingHatStore;", "Ljavax/inject/Provider;", "Companion", "lib-store-identi-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class TraderSortingHatStore_Factory implements Factory<TraderSortingHatStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Clock> clock;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<BooleanPreference> hasCryptoImpressionPref;
    private final Provider<Installation> installation;
    private final Provider<SortingHatApi> sortingHatApi;
    private final Provider<SortingHatBonfireApi> sortingHatBonfireApi;
    private final Provider<SortingHatDaoV2> sortingHatDao;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<SortingHatUserStateDao> userStateStore;

    @JvmStatic
    public static final TraderSortingHatStore_Factory create(Provider<Clock> provider, Provider<SortingHatApi> provider2, Provider<SortingHatBonfireApi> provider3, Provider<Installation> provider4, Provider<ExperimentsStore> provider5, Provider<SortingHatDaoV2> provider6, Provider<SortingHatUserStateDao> provider7, Provider<BooleanPreference> provider8, Provider<StoreBundle> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final TraderSortingHatStore newInstance(Clock clock, SortingHatApi sortingHatApi, SortingHatBonfireApi sortingHatBonfireApi, Installation installation, ExperimentsStore experimentsStore, SortingHatDaoV2 sortingHatDaoV2, SortingHatUserStateDao sortingHatUserStateDao, BooleanPreference booleanPreference, StoreBundle storeBundle) {
        return INSTANCE.newInstance(clock, sortingHatApi, sortingHatBonfireApi, installation, experimentsStore, sortingHatDaoV2, sortingHatUserStateDao, booleanPreference, storeBundle);
    }

    public TraderSortingHatStore_Factory(Provider<Clock> clock, Provider<SortingHatApi> sortingHatApi, Provider<SortingHatBonfireApi> sortingHatBonfireApi, Provider<Installation> installation, Provider<ExperimentsStore> experimentsStore, Provider<SortingHatDaoV2> sortingHatDao, Provider<SortingHatUserStateDao> userStateStore, Provider<BooleanPreference> hasCryptoImpressionPref, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(sortingHatApi, "sortingHatApi");
        Intrinsics.checkNotNullParameter(sortingHatBonfireApi, "sortingHatBonfireApi");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(sortingHatDao, "sortingHatDao");
        Intrinsics.checkNotNullParameter(userStateStore, "userStateStore");
        Intrinsics.checkNotNullParameter(hasCryptoImpressionPref, "hasCryptoImpressionPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.clock = clock;
        this.sortingHatApi = sortingHatApi;
        this.sortingHatBonfireApi = sortingHatBonfireApi;
        this.installation = installation;
        this.experimentsStore = experimentsStore;
        this.sortingHatDao = sortingHatDao;
        this.userStateStore = userStateStore;
        this.hasCryptoImpressionPref = hasCryptoImpressionPref;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public TraderSortingHatStore get() {
        Companion companion = INSTANCE;
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        SortingHatApi sortingHatApi = this.sortingHatApi.get();
        Intrinsics.checkNotNullExpressionValue(sortingHatApi, "get(...)");
        SortingHatBonfireApi sortingHatBonfireApi = this.sortingHatBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(sortingHatBonfireApi, "get(...)");
        Installation installation = this.installation.get();
        Intrinsics.checkNotNullExpressionValue(installation, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        SortingHatDaoV2 sortingHatDaoV2 = this.sortingHatDao.get();
        Intrinsics.checkNotNullExpressionValue(sortingHatDaoV2, "get(...)");
        SortingHatUserStateDao sortingHatUserStateDao = this.userStateStore.get();
        Intrinsics.checkNotNullExpressionValue(sortingHatUserStateDao, "get(...)");
        BooleanPreference booleanPreference = this.hasCryptoImpressionPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(clock, sortingHatApi, sortingHatBonfireApi, installation, experimentsStore, sortingHatDaoV2, sortingHatUserStateDao, booleanPreference, storeBundle);
    }

    /* compiled from: TraderSortingHatStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u008d\u0001\u0010\u0018\u001a\u00020\u00172\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019JW\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/onboarding/store/identi/TraderSortingHatStore_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/models/api/sortinghat/SortingHatApi;", "sortingHatApi", "Lcom/robinhood/models/api/sortinghat/SortingHatBonfireApi;", "sortingHatBonfireApi", "Lcom/robinhood/prefs/Installation;", "installation", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/models/dao/SortingHatDaoV2;", "sortingHatDao", "Lcom/robinhood/models/dao/identi/SortingHatUserStateDao;", "userStateStore", "Lcom/robinhood/prefs/BooleanPreference;", "hasCryptoImpressionPref", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/android/onboarding/store/identi/TraderSortingHatStore_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/onboarding/store/identi/TraderSortingHatStore_Factory;", "Lcom/robinhood/android/onboarding/store/identi/TraderSortingHatStore;", "newInstance", "(Lj$/time/Clock;Lcom/robinhood/models/api/sortinghat/SortingHatApi;Lcom/robinhood/models/api/sortinghat/SortingHatBonfireApi;Lcom/robinhood/prefs/Installation;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/models/dao/SortingHatDaoV2;Lcom/robinhood/models/dao/identi/SortingHatUserStateDao;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/store/StoreBundle;)Lcom/robinhood/android/onboarding/store/identi/TraderSortingHatStore;", "lib-store-identi-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TraderSortingHatStore_Factory create(Provider<Clock> clock, Provider<SortingHatApi> sortingHatApi, Provider<SortingHatBonfireApi> sortingHatBonfireApi, Provider<Installation> installation, Provider<ExperimentsStore> experimentsStore, Provider<SortingHatDaoV2> sortingHatDao, Provider<SortingHatUserStateDao> userStateStore, Provider<BooleanPreference> hasCryptoImpressionPref, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(sortingHatApi, "sortingHatApi");
            Intrinsics.checkNotNullParameter(sortingHatBonfireApi, "sortingHatBonfireApi");
            Intrinsics.checkNotNullParameter(installation, "installation");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(sortingHatDao, "sortingHatDao");
            Intrinsics.checkNotNullParameter(userStateStore, "userStateStore");
            Intrinsics.checkNotNullParameter(hasCryptoImpressionPref, "hasCryptoImpressionPref");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new TraderSortingHatStore_Factory(clock, sortingHatApi, sortingHatBonfireApi, installation, experimentsStore, sortingHatDao, userStateStore, hasCryptoImpressionPref, storeBundle);
        }

        @JvmStatic
        public final TraderSortingHatStore newInstance(Clock clock, SortingHatApi sortingHatApi, SortingHatBonfireApi sortingHatBonfireApi, Installation installation, ExperimentsStore experimentsStore, SortingHatDaoV2 sortingHatDao, SortingHatUserStateDao userStateStore, BooleanPreference hasCryptoImpressionPref, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(sortingHatApi, "sortingHatApi");
            Intrinsics.checkNotNullParameter(sortingHatBonfireApi, "sortingHatBonfireApi");
            Intrinsics.checkNotNullParameter(installation, "installation");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(sortingHatDao, "sortingHatDao");
            Intrinsics.checkNotNullParameter(userStateStore, "userStateStore");
            Intrinsics.checkNotNullParameter(hasCryptoImpressionPref, "hasCryptoImpressionPref");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new TraderSortingHatStore(clock, sortingHatApi, sortingHatBonfireApi, installation, experimentsStore, sortingHatDao, userStateStore, hasCryptoImpressionPref, storeBundle);
        }
    }
}
