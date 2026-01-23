package com.robinhood.shared.crypto.transfer.verification.exchange;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExchangeDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeStateProvider;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ExchangeDuxo_Factory implements Factory<ExchangeDuxo> {
    private final Provider<CryptoTransfersStore> cryptoTransfersStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExchangeDuxo5> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final ExchangeDuxo_Factory create(Provider<DuxoBundle> provider, Provider<ExchangeDuxo5> provider2, Provider<CryptoTransfersStore> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final ExchangeDuxo newInstance(DuxoBundle duxoBundle, ExchangeDuxo5 exchangeDuxo5, CryptoTransfersStore cryptoTransfersStore) {
        return INSTANCE.newInstance(duxoBundle, exchangeDuxo5, cryptoTransfersStore);
    }

    public ExchangeDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<ExchangeDuxo5> stateProvider, Provider<CryptoTransfersStore> cryptoTransfersStore) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.cryptoTransfersStore = cryptoTransfersStore;
    }

    @Override // javax.inject.Provider
    public ExchangeDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        ExchangeDuxo5 exchangeDuxo5 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(exchangeDuxo5, "get(...)");
        CryptoTransfersStore cryptoTransfersStore = this.cryptoTransfersStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTransfersStore, "get(...)");
        return companion.newInstance(duxoBundle, exchangeDuxo5, cryptoTransfersStore);
    }

    /* compiled from: ExchangeDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeStateProvider;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "newInstance", "Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeDuxo;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ExchangeDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<ExchangeDuxo5> stateProvider, Provider<CryptoTransfersStore> cryptoTransfersStore) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
            return new ExchangeDuxo_Factory(duxoBundle, stateProvider, cryptoTransfersStore);
        }

        @JvmStatic
        public final ExchangeDuxo newInstance(DuxoBundle duxoBundle, ExchangeDuxo5 stateProvider, CryptoTransfersStore cryptoTransfersStore) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
            return new ExchangeDuxo(duxoBundle, stateProvider, cryptoTransfersStore);
        }
    }
}
