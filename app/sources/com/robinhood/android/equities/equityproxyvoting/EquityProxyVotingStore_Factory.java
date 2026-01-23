package com.robinhood.android.equities.equityproxyvoting;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.equity.EquitiesSay;
import com.robinhood.models.dao.ProxyCommunicationDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityProxyVotingStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingStore;", "equitiesSay", "Ljavax/inject/Provider;", "Lcom/robinhood/api/equity/EquitiesSay;", "proxyCommunicationDao", "Lcom/robinhood/models/dao/ProxyCommunicationDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-equity-proxy-voting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityProxyVotingStore_Factory implements Factory<EquityProxyVotingStore> {
    private final Provider<EquitiesSay> equitiesSay;
    private final Provider<ProxyCommunicationDao> proxyCommunicationDao;
    private final Provider<StoreBundle> storeBundle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final EquityProxyVotingStore_Factory create(Provider<EquitiesSay> provider, Provider<ProxyCommunicationDao> provider2, Provider<StoreBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final EquityProxyVotingStore newInstance(EquitiesSay equitiesSay, ProxyCommunicationDao proxyCommunicationDao, StoreBundle storeBundle) {
        return INSTANCE.newInstance(equitiesSay, proxyCommunicationDao, storeBundle);
    }

    public EquityProxyVotingStore_Factory(Provider<EquitiesSay> equitiesSay, Provider<ProxyCommunicationDao> proxyCommunicationDao, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(equitiesSay, "equitiesSay");
        Intrinsics.checkNotNullParameter(proxyCommunicationDao, "proxyCommunicationDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.equitiesSay = equitiesSay;
        this.proxyCommunicationDao = proxyCommunicationDao;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public EquityProxyVotingStore get() {
        Companion companion = INSTANCE;
        EquitiesSay equitiesSay = this.equitiesSay.get();
        Intrinsics.checkNotNullExpressionValue(equitiesSay, "get(...)");
        ProxyCommunicationDao proxyCommunicationDao = this.proxyCommunicationDao.get();
        Intrinsics.checkNotNullExpressionValue(proxyCommunicationDao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(equitiesSay, proxyCommunicationDao, storeBundle);
    }

    /* compiled from: EquityProxyVotingStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingStore_Factory;", "equitiesSay", "Ljavax/inject/Provider;", "Lcom/robinhood/api/equity/EquitiesSay;", "proxyCommunicationDao", "Lcom/robinhood/models/dao/ProxyCommunicationDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingStore;", "lib-equity-proxy-voting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EquityProxyVotingStore_Factory create(Provider<EquitiesSay> equitiesSay, Provider<ProxyCommunicationDao> proxyCommunicationDao, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(equitiesSay, "equitiesSay");
            Intrinsics.checkNotNullParameter(proxyCommunicationDao, "proxyCommunicationDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new EquityProxyVotingStore_Factory(equitiesSay, proxyCommunicationDao, storeBundle);
        }

        @JvmStatic
        public final EquityProxyVotingStore newInstance(EquitiesSay equitiesSay, ProxyCommunicationDao proxyCommunicationDao, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(equitiesSay, "equitiesSay");
            Intrinsics.checkNotNullParameter(proxyCommunicationDao, "proxyCommunicationDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new EquityProxyVotingStore(equitiesSay, proxyCommunicationDao, storeBundle);
        }
    }
}
