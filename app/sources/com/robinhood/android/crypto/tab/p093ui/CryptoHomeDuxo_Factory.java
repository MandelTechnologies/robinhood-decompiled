package com.robinhood.android.crypto.tab.p093ui;

import com.android.shared.portfolio.lists.handler.CryptoHomeListsAdditionClickHandler;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.util.LockscreenManager;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoHomeStore;
import com.robinhood.librobinhood.data.store.CryptoOnboardingM1Store;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.data.store.iac.IacUpsellStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0093\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/CryptoHomeDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/tab/ui/CryptoHomeDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/tab/ui/CryptoHomeStateProvider;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoOnboardingM1Store", "Lcom/robinhood/librobinhood/data/store/CryptoOnboardingM1Store;", "cryptoHomeStore", "Lcom/robinhood/librobinhood/data/store/CryptoHomeStore;", "iacUpsellStore", "Lcom/robinhood/shared/data/store/iac/IacUpsellStore;", "lockscreenManager", "Lcom/robinhood/android/util/LockscreenManager;", "listsAdditionClickHandler", "Lcom/android/shared/portfolio/lists/handler/CryptoHomeListsAdditionClickHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CryptoHomeDuxo_Factory implements Factory<CryptoHomeDuxo> {
    private final Provider<AppType> appType;
    private final Provider<CryptoAccountProvider> cryptoAccountProvider;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CryptoHomeStore> cryptoHomeStore;
    private final Provider<CryptoOnboardingM1Store> cryptoOnboardingM1Store;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<IacUpsellStore> iacUpsellStore;
    private final Provider<CryptoHomeListsAdditionClickHandler> listsAdditionClickHandler;
    private final Provider<LockscreenManager> lockscreenManager;
    private final Provider<CryptoHomeStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoHomeDuxo_Factory create(Provider<DuxoBundle> provider, Provider<CryptoHomeStateProvider> provider2, Provider<AppType> provider3, Provider<CryptoAccountProvider> provider4, Provider<CryptoExperimentsStore> provider5, Provider<CryptoOnboardingM1Store> provider6, Provider<CryptoHomeStore> provider7, Provider<IacUpsellStore> provider8, Provider<LockscreenManager> provider9, Provider<CryptoHomeListsAdditionClickHandler> provider10) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    @JvmStatic
    public static final CryptoHomeDuxo newInstance(DuxoBundle duxoBundle, CryptoHomeStateProvider cryptoHomeStateProvider, AppType appType, CryptoAccountProvider cryptoAccountProvider, CryptoExperimentsStore cryptoExperimentsStore, CryptoOnboardingM1Store cryptoOnboardingM1Store, CryptoHomeStore cryptoHomeStore, IacUpsellStore iacUpsellStore, LockscreenManager lockscreenManager, CryptoHomeListsAdditionClickHandler cryptoHomeListsAdditionClickHandler) {
        return INSTANCE.newInstance(duxoBundle, cryptoHomeStateProvider, appType, cryptoAccountProvider, cryptoExperimentsStore, cryptoOnboardingM1Store, cryptoHomeStore, iacUpsellStore, lockscreenManager, cryptoHomeListsAdditionClickHandler);
    }

    public CryptoHomeDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<CryptoHomeStateProvider> stateProvider, Provider<AppType> appType, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoOnboardingM1Store> cryptoOnboardingM1Store, Provider<CryptoHomeStore> cryptoHomeStore, Provider<IacUpsellStore> iacUpsellStore, Provider<LockscreenManager> lockscreenManager, Provider<CryptoHomeListsAdditionClickHandler> listsAdditionClickHandler) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoOnboardingM1Store, "cryptoOnboardingM1Store");
        Intrinsics.checkNotNullParameter(cryptoHomeStore, "cryptoHomeStore");
        Intrinsics.checkNotNullParameter(iacUpsellStore, "iacUpsellStore");
        Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
        Intrinsics.checkNotNullParameter(listsAdditionClickHandler, "listsAdditionClickHandler");
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.appType = appType;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoOnboardingM1Store = cryptoOnboardingM1Store;
        this.cryptoHomeStore = cryptoHomeStore;
        this.iacUpsellStore = iacUpsellStore;
        this.lockscreenManager = lockscreenManager;
        this.listsAdditionClickHandler = listsAdditionClickHandler;
    }

    @Override // javax.inject.Provider
    public CryptoHomeDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoHomeStateProvider cryptoHomeStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHomeStateProvider, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        CryptoAccountProvider cryptoAccountProvider = this.cryptoAccountProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountProvider, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        CryptoOnboardingM1Store cryptoOnboardingM1Store = this.cryptoOnboardingM1Store.get();
        Intrinsics.checkNotNullExpressionValue(cryptoOnboardingM1Store, "get(...)");
        CryptoHomeStore cryptoHomeStore = this.cryptoHomeStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHomeStore, "get(...)");
        IacUpsellStore iacUpsellStore = this.iacUpsellStore.get();
        Intrinsics.checkNotNullExpressionValue(iacUpsellStore, "get(...)");
        LockscreenManager lockscreenManager = this.lockscreenManager.get();
        Intrinsics.checkNotNullExpressionValue(lockscreenManager, "get(...)");
        CryptoHomeListsAdditionClickHandler cryptoHomeListsAdditionClickHandler = this.listsAdditionClickHandler.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHomeListsAdditionClickHandler, "get(...)");
        return companion.newInstance(duxoBundle, cryptoHomeStateProvider, appType, cryptoAccountProvider, cryptoExperimentsStore, cryptoOnboardingM1Store, cryptoHomeStore, iacUpsellStore, lockscreenManager, cryptoHomeListsAdditionClickHandler);
    }

    /* compiled from: CryptoHomeDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0094\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007H\u0007JX\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/CryptoHomeDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/crypto/tab/ui/CryptoHomeDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/tab/ui/CryptoHomeStateProvider;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoOnboardingM1Store", "Lcom/robinhood/librobinhood/data/store/CryptoOnboardingM1Store;", "cryptoHomeStore", "Lcom/robinhood/librobinhood/data/store/CryptoHomeStore;", "iacUpsellStore", "Lcom/robinhood/shared/data/store/iac/IacUpsellStore;", "lockscreenManager", "Lcom/robinhood/android/util/LockscreenManager;", "listsAdditionClickHandler", "Lcom/android/shared/portfolio/lists/handler/CryptoHomeListsAdditionClickHandler;", "newInstance", "Lcom/robinhood/android/crypto/tab/ui/CryptoHomeDuxo;", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoHomeDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<CryptoHomeStateProvider> stateProvider, Provider<AppType> appType, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoOnboardingM1Store> cryptoOnboardingM1Store, Provider<CryptoHomeStore> cryptoHomeStore, Provider<IacUpsellStore> iacUpsellStore, Provider<LockscreenManager> lockscreenManager, Provider<CryptoHomeListsAdditionClickHandler> listsAdditionClickHandler) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoOnboardingM1Store, "cryptoOnboardingM1Store");
            Intrinsics.checkNotNullParameter(cryptoHomeStore, "cryptoHomeStore");
            Intrinsics.checkNotNullParameter(iacUpsellStore, "iacUpsellStore");
            Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
            Intrinsics.checkNotNullParameter(listsAdditionClickHandler, "listsAdditionClickHandler");
            return new CryptoHomeDuxo_Factory(duxoBundle, stateProvider, appType, cryptoAccountProvider, cryptoExperimentsStore, cryptoOnboardingM1Store, cryptoHomeStore, iacUpsellStore, lockscreenManager, listsAdditionClickHandler);
        }

        @JvmStatic
        public final CryptoHomeDuxo newInstance(DuxoBundle duxoBundle, CryptoHomeStateProvider stateProvider, AppType appType, CryptoAccountProvider cryptoAccountProvider, CryptoExperimentsStore cryptoExperimentsStore, CryptoOnboardingM1Store cryptoOnboardingM1Store, CryptoHomeStore cryptoHomeStore, IacUpsellStore iacUpsellStore, LockscreenManager lockscreenManager, CryptoHomeListsAdditionClickHandler listsAdditionClickHandler) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoOnboardingM1Store, "cryptoOnboardingM1Store");
            Intrinsics.checkNotNullParameter(cryptoHomeStore, "cryptoHomeStore");
            Intrinsics.checkNotNullParameter(iacUpsellStore, "iacUpsellStore");
            Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
            Intrinsics.checkNotNullParameter(listsAdditionClickHandler, "listsAdditionClickHandler");
            return new CryptoHomeDuxo(duxoBundle, stateProvider, appType, cryptoAccountProvider, cryptoExperimentsStore, cryptoOnboardingM1Store, cryptoHomeStore, iacUpsellStore, lockscreenManager, listsAdditionClickHandler);
        }
    }
}
