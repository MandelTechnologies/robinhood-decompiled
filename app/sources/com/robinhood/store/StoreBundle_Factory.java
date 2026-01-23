package com.robinhood.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.utils.NetworkWrapper;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.database.BaseDbHelper;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.util.LastUpdatedAtManager;
import com.robinhood.utils.LogoutKillswitch;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: StoreBundle_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\t\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B[\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/store/StoreBundle_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/StoreBundle;", "Ljavax/inject/Provider;", "Lcom/robinhood/database/BaseDbHelper;", "dbHelper", "Lcom/robinhood/api/utils/NetworkWrapper;", "networkWrapper", "Lcom/robinhood/utils/LogoutKillswitch;", "logoutKillswitch", "Lcom/robinhood/util/LastUpdatedAtManager;", "lastUpdatedAtManager", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxFactory", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/store/StoreBundle;", "Ljavax/inject/Provider;", "Companion", "lib-store_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StoreBundle_Factory implements Factory<StoreBundle> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Clock> clock;
    private final Provider<BaseDbHelper> dbHelper;
    private final Provider<LastUpdatedAtManager> lastUpdatedAtManager;
    private final Provider<LogoutKillswitch> logoutKillswitch;
    private final Provider<NetworkWrapper> networkWrapper;
    private final Provider<RxFactory> rxFactory;

    @JvmStatic
    public static final StoreBundle_Factory create(Provider<BaseDbHelper> provider, Provider<NetworkWrapper> provider2, Provider<LogoutKillswitch> provider3, Provider<LastUpdatedAtManager> provider4, Provider<RxFactory> provider5, Provider<Clock> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final StoreBundle newInstance(BaseDbHelper baseDbHelper, NetworkWrapper networkWrapper, LogoutKillswitch logoutKillswitch, LastUpdatedAtManager lastUpdatedAtManager, RxFactory rxFactory, Clock clock) {
        return INSTANCE.newInstance(baseDbHelper, networkWrapper, logoutKillswitch, lastUpdatedAtManager, rxFactory, clock);
    }

    public StoreBundle_Factory(Provider<BaseDbHelper> dbHelper, Provider<NetworkWrapper> networkWrapper, Provider<LogoutKillswitch> logoutKillswitch, Provider<LastUpdatedAtManager> lastUpdatedAtManager, Provider<RxFactory> rxFactory, Provider<Clock> clock) {
        Intrinsics.checkNotNullParameter(dbHelper, "dbHelper");
        Intrinsics.checkNotNullParameter(networkWrapper, "networkWrapper");
        Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
        Intrinsics.checkNotNullParameter(lastUpdatedAtManager, "lastUpdatedAtManager");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.dbHelper = dbHelper;
        this.networkWrapper = networkWrapper;
        this.logoutKillswitch = logoutKillswitch;
        this.lastUpdatedAtManager = lastUpdatedAtManager;
        this.rxFactory = rxFactory;
        this.clock = clock;
    }

    @Override // javax.inject.Provider
    public StoreBundle get() {
        Companion companion = INSTANCE;
        BaseDbHelper baseDbHelper = this.dbHelper.get();
        Intrinsics.checkNotNullExpressionValue(baseDbHelper, "get(...)");
        NetworkWrapper networkWrapper = this.networkWrapper.get();
        Intrinsics.checkNotNullExpressionValue(networkWrapper, "get(...)");
        LogoutKillswitch logoutKillswitch = this.logoutKillswitch.get();
        Intrinsics.checkNotNullExpressionValue(logoutKillswitch, "get(...)");
        LastUpdatedAtManager lastUpdatedAtManager = this.lastUpdatedAtManager.get();
        Intrinsics.checkNotNullExpressionValue(lastUpdatedAtManager, "get(...)");
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        return companion.newInstance(baseDbHelper, networkWrapper, logoutKillswitch, lastUpdatedAtManager, rxFactory, clock);
    }

    /* compiled from: StoreBundle_Factory.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\u0012\u001a\u00020\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/store/StoreBundle_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/database/BaseDbHelper;", "dbHelper", "Lcom/robinhood/api/utils/NetworkWrapper;", "networkWrapper", "Lcom/robinhood/utils/LogoutKillswitch;", "logoutKillswitch", "Lcom/robinhood/util/LastUpdatedAtManager;", "lastUpdatedAtManager", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxFactory", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/store/StoreBundle_Factory;", "Lcom/robinhood/store/StoreBundle;", "newInstance", "(Lcom/robinhood/database/BaseDbHelper;Lcom/robinhood/api/utils/NetworkWrapper;Lcom/robinhood/utils/LogoutKillswitch;Lcom/robinhood/util/LastUpdatedAtManager;Lcom/robinhood/coroutines/rx/RxFactory;Lj$/time/Clock;)Lcom/robinhood/store/StoreBundle;", "lib-store_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final StoreBundle_Factory create(Provider<BaseDbHelper> dbHelper, Provider<NetworkWrapper> networkWrapper, Provider<LogoutKillswitch> logoutKillswitch, Provider<LastUpdatedAtManager> lastUpdatedAtManager, Provider<RxFactory> rxFactory, Provider<Clock> clock) {
            Intrinsics.checkNotNullParameter(dbHelper, "dbHelper");
            Intrinsics.checkNotNullParameter(networkWrapper, "networkWrapper");
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            Intrinsics.checkNotNullParameter(lastUpdatedAtManager, "lastUpdatedAtManager");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new StoreBundle_Factory(dbHelper, networkWrapper, logoutKillswitch, lastUpdatedAtManager, rxFactory, clock);
        }

        @JvmStatic
        public final StoreBundle newInstance(BaseDbHelper dbHelper, NetworkWrapper networkWrapper, LogoutKillswitch logoutKillswitch, LastUpdatedAtManager lastUpdatedAtManager, RxFactory rxFactory, Clock clock) {
            Intrinsics.checkNotNullParameter(dbHelper, "dbHelper");
            Intrinsics.checkNotNullParameter(networkWrapper, "networkWrapper");
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            Intrinsics.checkNotNullParameter(lastUpdatedAtManager, "lastUpdatedAtManager");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new StoreBundle(dbHelper, networkWrapper, logoutKillswitch, lastUpdatedAtManager, rxFactory, clock);
        }
    }
}
