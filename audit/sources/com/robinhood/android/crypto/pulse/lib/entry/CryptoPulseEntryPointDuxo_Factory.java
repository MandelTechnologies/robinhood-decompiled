package com.robinhood.android.crypto.pulse.lib.entry;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.CryptoPulseStore;
import com.robinhood.models.card.p311db.Card;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: CryptoPulseEntryPointDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoPulseStore;", "cryptoPulseStore", "Lcom/robinhood/experiments/ExperimentsProvider;", "experimentsProvider", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointStateProvider;", "stateProvider", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointDuxo;", "Ljavax/inject/Provider;", "Companion", "lib-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoPulseEntryPointDuxo_Factory implements Factory<CryptoPulseEntryPointDuxo> {
    private final Provider<Clock> clock;
    private final Provider<CryptoPulseStore> cryptoPulseStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsProvider> experimentsProvider;
    private final Provider<CryptoPulseEntryPointStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoPulseEntryPointDuxo_Factory create(Provider<CryptoPulseStore> provider, Provider<ExperimentsProvider> provider2, Provider<Clock> provider3, Provider<DuxoBundle> provider4, Provider<CryptoPulseEntryPointStateProvider> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final CryptoPulseEntryPointDuxo newInstance(CryptoPulseStore cryptoPulseStore, ExperimentsProvider experimentsProvider, Clock clock, DuxoBundle duxoBundle, CryptoPulseEntryPointStateProvider cryptoPulseEntryPointStateProvider) {
        return INSTANCE.newInstance(cryptoPulseStore, experimentsProvider, clock, duxoBundle, cryptoPulseEntryPointStateProvider);
    }

    public CryptoPulseEntryPointDuxo_Factory(Provider<CryptoPulseStore> cryptoPulseStore, Provider<ExperimentsProvider> experimentsProvider, Provider<Clock> clock, Provider<DuxoBundle> duxoBundle, Provider<CryptoPulseEntryPointStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(cryptoPulseStore, "cryptoPulseStore");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.cryptoPulseStore = cryptoPulseStore;
        this.experimentsProvider = experimentsProvider;
        this.clock = clock;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public CryptoPulseEntryPointDuxo get() {
        Companion companion = INSTANCE;
        CryptoPulseStore cryptoPulseStore = this.cryptoPulseStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoPulseStore, "get(...)");
        ExperimentsProvider experimentsProvider = this.experimentsProvider.get();
        Intrinsics.checkNotNullExpressionValue(experimentsProvider, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoPulseEntryPointStateProvider cryptoPulseEntryPointStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoPulseEntryPointStateProvider, "get(...)");
        return companion.newInstance(cryptoPulseStore, experimentsProvider, clock, duxoBundle, cryptoPulseEntryPointStateProvider);
    }

    /* compiled from: CryptoPulseEntryPointDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoPulseStore;", "cryptoPulseStore", "Lcom/robinhood/experiments/ExperimentsProvider;", "experimentsProvider", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointStateProvider;", "stateProvider", "Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointDuxo_Factory;", "Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointDuxo;", "newInstance", "(Lcom/robinhood/librobinhood/data/store/CryptoPulseStore;Lcom/robinhood/experiments/ExperimentsProvider;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointStateProvider;)Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointDuxo;", "lib-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoPulseEntryPointDuxo_Factory create(Provider<CryptoPulseStore> cryptoPulseStore, Provider<ExperimentsProvider> experimentsProvider, Provider<Clock> clock, Provider<DuxoBundle> duxoBundle, Provider<CryptoPulseEntryPointStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(cryptoPulseStore, "cryptoPulseStore");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new CryptoPulseEntryPointDuxo_Factory(cryptoPulseStore, experimentsProvider, clock, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final CryptoPulseEntryPointDuxo newInstance(CryptoPulseStore cryptoPulseStore, ExperimentsProvider experimentsProvider, Clock clock, DuxoBundle duxoBundle, CryptoPulseEntryPointStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(cryptoPulseStore, "cryptoPulseStore");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new CryptoPulseEntryPointDuxo(cryptoPulseStore, experimentsProvider, clock, duxoBundle, stateProvider);
        }
    }
}
