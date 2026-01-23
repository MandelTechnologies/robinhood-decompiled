package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierUpgraded;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.fee.CryptoFeeTierStore;
import com.robinhood.shared.trade.crypto.fee.CryptoFeeTierNotificationStatusProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoFeeTierUpgradedDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedDuxo;", "feeTierStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierStore;", "feeTierNotificationProvider", "Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoFeeTierUpgradedDuxo_Factory implements Factory<CryptoFeeTierUpgradedDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<CryptoFeeTierNotificationStatusProvider> feeTierNotificationProvider;
    private final Provider<CryptoFeeTierStore> feeTierStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CryptoFeeTierUpgradedDuxo2> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoFeeTierUpgradedDuxo_Factory create(Provider<CryptoFeeTierStore> provider, Provider<CryptoFeeTierNotificationStatusProvider> provider2, Provider<CryptoFeeTierUpgradedDuxo2> provider3, Provider<DuxoBundle> provider4, Provider<SavedStateHandle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final CryptoFeeTierUpgradedDuxo newInstance(CryptoFeeTierStore cryptoFeeTierStore, CryptoFeeTierNotificationStatusProvider cryptoFeeTierNotificationStatusProvider, CryptoFeeTierUpgradedDuxo2 cryptoFeeTierUpgradedDuxo2, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(cryptoFeeTierStore, cryptoFeeTierNotificationStatusProvider, cryptoFeeTierUpgradedDuxo2, duxoBundle, savedStateHandle);
    }

    public CryptoFeeTierUpgradedDuxo_Factory(Provider<CryptoFeeTierStore> feeTierStore, Provider<CryptoFeeTierNotificationStatusProvider> feeTierNotificationProvider, Provider<CryptoFeeTierUpgradedDuxo2> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(feeTierStore, "feeTierStore");
        Intrinsics.checkNotNullParameter(feeTierNotificationProvider, "feeTierNotificationProvider");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.feeTierStore = feeTierStore;
        this.feeTierNotificationProvider = feeTierNotificationProvider;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public CryptoFeeTierUpgradedDuxo get() {
        Companion companion = INSTANCE;
        CryptoFeeTierStore cryptoFeeTierStore = this.feeTierStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoFeeTierStore, "get(...)");
        CryptoFeeTierNotificationStatusProvider cryptoFeeTierNotificationStatusProvider = this.feeTierNotificationProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoFeeTierNotificationStatusProvider, "get(...)");
        CryptoFeeTierUpgradedDuxo2 cryptoFeeTierUpgradedDuxo2 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoFeeTierUpgradedDuxo2, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(cryptoFeeTierStore, cryptoFeeTierNotificationStatusProvider, cryptoFeeTierUpgradedDuxo2, duxoBundle, savedStateHandle);
    }

    /* compiled from: CryptoFeeTierUpgradedDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedDuxo_Factory;", "feeTierStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierStore;", "feeTierNotificationProvider", "Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedDuxo;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoFeeTierUpgradedDuxo_Factory create(Provider<CryptoFeeTierStore> feeTierStore, Provider<CryptoFeeTierNotificationStatusProvider> feeTierNotificationProvider, Provider<CryptoFeeTierUpgradedDuxo2> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(feeTierStore, "feeTierStore");
            Intrinsics.checkNotNullParameter(feeTierNotificationProvider, "feeTierNotificationProvider");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CryptoFeeTierUpgradedDuxo_Factory(feeTierStore, feeTierNotificationProvider, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final CryptoFeeTierUpgradedDuxo newInstance(CryptoFeeTierStore feeTierStore, CryptoFeeTierNotificationStatusProvider feeTierNotificationProvider, CryptoFeeTierUpgradedDuxo2 stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(feeTierStore, "feeTierStore");
            Intrinsics.checkNotNullParameter(feeTierNotificationProvider, "feeTierNotificationProvider");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CryptoFeeTierUpgradedDuxo(feeTierStore, feeTierNotificationProvider, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
