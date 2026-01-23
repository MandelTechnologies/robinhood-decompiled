package com.robinhood.shared.crypto.transfer.selection;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSelectionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionDuxo;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "transfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CryptoTransferSelectionDuxo_Factory implements Factory<CryptoTransferSelectionDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CryptoTransferSelectionDuxo6> stateProvider;
    private final Provider<CryptoTransfersStore> transfersStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoTransferSelectionDuxo_Factory create(Provider<CryptoTransferSelectionDuxo6> provider, Provider<DuxoBundle> provider2, Provider<SavedStateHandle> provider3, Provider<AccountProvider> provider4, Provider<CryptoTransfersStore> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final CryptoTransferSelectionDuxo newInstance(CryptoTransferSelectionDuxo6 cryptoTransferSelectionDuxo6, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, AccountProvider accountProvider, CryptoTransfersStore cryptoTransfersStore) {
        return INSTANCE.newInstance(cryptoTransferSelectionDuxo6, duxoBundle, savedStateHandle, accountProvider, cryptoTransfersStore);
    }

    public CryptoTransferSelectionDuxo_Factory(Provider<CryptoTransferSelectionDuxo6> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<AccountProvider> accountProvider, Provider<CryptoTransfersStore> transfersStore) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(transfersStore, "transfersStore");
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
        this.accountProvider = accountProvider;
        this.transfersStore = transfersStore;
    }

    @Override // javax.inject.Provider
    public CryptoTransferSelectionDuxo get() {
        Companion companion = INSTANCE;
        CryptoTransferSelectionDuxo6 cryptoTransferSelectionDuxo6 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTransferSelectionDuxo6, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        CryptoTransfersStore cryptoTransfersStore = this.transfersStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTransfersStore, "get(...)");
        return companion.newInstance(cryptoTransferSelectionDuxo6, duxoBundle, savedStateHandle, accountProvider, cryptoTransfersStore);
    }

    /* compiled from: CryptoTransferSelectionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionDuxo_Factory;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "transfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "newInstance", "Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionDuxo;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoTransferSelectionDuxo_Factory create(Provider<CryptoTransferSelectionDuxo6> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<AccountProvider> accountProvider, Provider<CryptoTransfersStore> transfersStore) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(transfersStore, "transfersStore");
            return new CryptoTransferSelectionDuxo_Factory(stateProvider, duxoBundle, savedStateHandle, accountProvider, transfersStore);
        }

        @JvmStatic
        public final CryptoTransferSelectionDuxo newInstance(CryptoTransferSelectionDuxo6 stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, AccountProvider accountProvider, CryptoTransfersStore transfersStore) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(transfersStore, "transfersStore");
            return new CryptoTransferSelectionDuxo(stateProvider, duxoBundle, savedStateHandle, accountProvider, transfersStore);
        }
    }
}
