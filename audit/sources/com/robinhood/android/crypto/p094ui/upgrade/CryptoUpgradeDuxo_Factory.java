package com.robinhood.android.crypto.p094ui.upgrade;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.CryptoResidencyDocumentStore;
import com.robinhood.librobinhood.data.store.CryptoUpgradeStore;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoUpgradeDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeDuxo;", "cryptoAccountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoResidencyDocumentStore", "Lcom/robinhood/librobinhood/data/store/CryptoResidencyDocumentStore;", "cryptoUpgradeStore", "Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CryptoUpgradeDuxo_Factory implements Factory<CryptoUpgradeDuxo> {
    private final Provider<CryptoAccountStore> cryptoAccountStore;
    private final Provider<CryptoResidencyDocumentStore> cryptoResidencyDocumentStore;
    private final Provider<CryptoUpgradeStore> cryptoUpgradeStore;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoUpgradeDuxo_Factory create(Provider<CryptoAccountStore> provider, Provider<CryptoResidencyDocumentStore> provider2, Provider<CryptoUpgradeStore> provider3, Provider<UserStore> provider4, Provider<SavedStateHandle> provider5, Provider<DispatcherProvider> provider6, Provider<RxFactory> provider7, Provider<RxGlobalErrorHandler> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final CryptoUpgradeDuxo newInstance(CryptoAccountStore cryptoAccountStore, CryptoResidencyDocumentStore cryptoResidencyDocumentStore, CryptoUpgradeStore cryptoUpgradeStore, UserStore userStore, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(cryptoAccountStore, cryptoResidencyDocumentStore, cryptoUpgradeStore, userStore, savedStateHandle);
    }

    public CryptoUpgradeDuxo_Factory(Provider<CryptoAccountStore> cryptoAccountStore, Provider<CryptoResidencyDocumentStore> cryptoResidencyDocumentStore, Provider<CryptoUpgradeStore> cryptoUpgradeStore, Provider<UserStore> userStore, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(cryptoResidencyDocumentStore, "cryptoResidencyDocumentStore");
        Intrinsics.checkNotNullParameter(cryptoUpgradeStore, "cryptoUpgradeStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.cryptoAccountStore = cryptoAccountStore;
        this.cryptoResidencyDocumentStore = cryptoResidencyDocumentStore;
        this.cryptoUpgradeStore = cryptoUpgradeStore;
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public CryptoUpgradeDuxo get() {
        Companion companion = INSTANCE;
        CryptoAccountStore cryptoAccountStore = this.cryptoAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountStore, "get(...)");
        CryptoResidencyDocumentStore cryptoResidencyDocumentStore = this.cryptoResidencyDocumentStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoResidencyDocumentStore, "get(...)");
        CryptoUpgradeStore cryptoUpgradeStore = this.cryptoUpgradeStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoUpgradeStore, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        CryptoUpgradeDuxo cryptoUpgradeDuxoNewInstance = companion.newInstance(cryptoAccountStore, cryptoResidencyDocumentStore, cryptoUpgradeStore, userStore, savedStateHandle);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(cryptoUpgradeDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(cryptoUpgradeDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(cryptoUpgradeDuxoNewInstance, rxGlobalErrorHandler);
        return cryptoUpgradeDuxoNewInstance;
    }

    /* compiled from: CryptoUpgradeDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007J0\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeDuxo_Factory;", "cryptoAccountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoResidencyDocumentStore", "Lcom/robinhood/librobinhood/data/store/CryptoResidencyDocumentStore;", "cryptoUpgradeStore", "Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeDuxo;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoUpgradeDuxo_Factory create(Provider<CryptoAccountStore> cryptoAccountStore, Provider<CryptoResidencyDocumentStore> cryptoResidencyDocumentStore, Provider<CryptoUpgradeStore> cryptoUpgradeStore, Provider<UserStore> userStore, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(cryptoResidencyDocumentStore, "cryptoResidencyDocumentStore");
            Intrinsics.checkNotNullParameter(cryptoUpgradeStore, "cryptoUpgradeStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new CryptoUpgradeDuxo_Factory(cryptoAccountStore, cryptoResidencyDocumentStore, cryptoUpgradeStore, userStore, savedStateHandle, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final CryptoUpgradeDuxo newInstance(CryptoAccountStore cryptoAccountStore, CryptoResidencyDocumentStore cryptoResidencyDocumentStore, CryptoUpgradeStore cryptoUpgradeStore, UserStore userStore, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(cryptoResidencyDocumentStore, "cryptoResidencyDocumentStore");
            Intrinsics.checkNotNullParameter(cryptoUpgradeStore, "cryptoUpgradeStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CryptoUpgradeDuxo(cryptoAccountStore, cryptoResidencyDocumentStore, cryptoUpgradeStore, userStore, savedStateHandle);
        }
    }
}
