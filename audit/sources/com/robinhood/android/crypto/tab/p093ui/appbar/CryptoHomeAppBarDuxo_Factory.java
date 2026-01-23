package com.robinhood.android.crypto.tab.p093ui.appbar;

import android.content.res.Resources;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.redesign.accounttab.prefs.AccountSelectorHomeManager;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoChartStore;
import com.robinhood.librobinhood.data.store.CryptoHomeStore;
import com.robinhood.librobinhood.data.store.InboxBadgeStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.app.type.AppType;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeAppBarDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0093\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/appbar/CryptoHomeAppBarDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/tab/ui/appbar/CryptoHomeAppBarDuxo;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/crypto/tab/ui/appbar/CryptoHomeAppBarStateProvider;", "resources", "Landroid/content/res/Resources;", "accountSelectorHomeManager", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoChartStore", "Lcom/robinhood/librobinhood/data/store/CryptoChartStore;", "cryptoHomeStore", "Lcom/robinhood/librobinhood/data/store/CryptoHomeStore;", "inboxBadgeStore", "Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;", "portfolioPrivacyPref", "Lcom/robinhood/prefs/BooleanPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CryptoHomeAppBarDuxo_Factory implements Factory<CryptoHomeAppBarDuxo> {
    private final Provider<AccountSelectorHomeManager> accountSelectorHomeManager;
    private final Provider<AppType> appType;
    private final Provider<CryptoAccountProvider> cryptoAccountProvider;
    private final Provider<CryptoChartStore> cryptoChartStore;
    private final Provider<CryptoHomeStore> cryptoHomeStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<InboxBadgeStore> inboxBadgeStore;
    private final Provider<BooleanPreference> portfolioPrivacyPref;
    private final Provider<Resources> resources;
    private final Provider<CryptoHomeAppBarDuxo4> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoHomeAppBarDuxo_Factory create(Provider<CryptoHomeAppBarDuxo4> provider, Provider<Resources> provider2, Provider<AccountSelectorHomeManager> provider3, Provider<AppType> provider4, Provider<CryptoAccountProvider> provider5, Provider<CryptoChartStore> provider6, Provider<CryptoHomeStore> provider7, Provider<InboxBadgeStore> provider8, Provider<BooleanPreference> provider9, Provider<DuxoBundle> provider10) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    @JvmStatic
    public static final CryptoHomeAppBarDuxo newInstance(CryptoHomeAppBarDuxo4 cryptoHomeAppBarDuxo4, Resources resources, AccountSelectorHomeManager accountSelectorHomeManager, AppType appType, CryptoAccountProvider cryptoAccountProvider, CryptoChartStore cryptoChartStore, CryptoHomeStore cryptoHomeStore, InboxBadgeStore inboxBadgeStore, BooleanPreference booleanPreference, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(cryptoHomeAppBarDuxo4, resources, accountSelectorHomeManager, appType, cryptoAccountProvider, cryptoChartStore, cryptoHomeStore, inboxBadgeStore, booleanPreference, duxoBundle);
    }

    public CryptoHomeAppBarDuxo_Factory(Provider<CryptoHomeAppBarDuxo4> stateProvider, Provider<Resources> resources, Provider<AccountSelectorHomeManager> accountSelectorHomeManager, Provider<AppType> appType, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<CryptoChartStore> cryptoChartStore, Provider<CryptoHomeStore> cryptoHomeStore, Provider<InboxBadgeStore> inboxBadgeStore, Provider<BooleanPreference> portfolioPrivacyPref, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoChartStore, "cryptoChartStore");
        Intrinsics.checkNotNullParameter(cryptoHomeStore, "cryptoHomeStore");
        Intrinsics.checkNotNullParameter(inboxBadgeStore, "inboxBadgeStore");
        Intrinsics.checkNotNullParameter(portfolioPrivacyPref, "portfolioPrivacyPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.stateProvider = stateProvider;
        this.resources = resources;
        this.accountSelectorHomeManager = accountSelectorHomeManager;
        this.appType = appType;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoChartStore = cryptoChartStore;
        this.cryptoHomeStore = cryptoHomeStore;
        this.inboxBadgeStore = inboxBadgeStore;
        this.portfolioPrivacyPref = portfolioPrivacyPref;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public CryptoHomeAppBarDuxo get() {
        Companion companion = INSTANCE;
        CryptoHomeAppBarDuxo4 cryptoHomeAppBarDuxo4 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHomeAppBarDuxo4, "get(...)");
        Resources resources = this.resources.get();
        Intrinsics.checkNotNullExpressionValue(resources, "get(...)");
        AccountSelectorHomeManager accountSelectorHomeManager = this.accountSelectorHomeManager.get();
        Intrinsics.checkNotNullExpressionValue(accountSelectorHomeManager, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        CryptoAccountProvider cryptoAccountProvider = this.cryptoAccountProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountProvider, "get(...)");
        CryptoChartStore cryptoChartStore = this.cryptoChartStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoChartStore, "get(...)");
        CryptoHomeStore cryptoHomeStore = this.cryptoHomeStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHomeStore, "get(...)");
        InboxBadgeStore inboxBadgeStore = this.inboxBadgeStore.get();
        Intrinsics.checkNotNullExpressionValue(inboxBadgeStore, "get(...)");
        BooleanPreference booleanPreference = this.portfolioPrivacyPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(cryptoHomeAppBarDuxo4, resources, accountSelectorHomeManager, appType, cryptoAccountProvider, cryptoChartStore, cryptoHomeStore, inboxBadgeStore, booleanPreference, duxoBundle);
    }

    /* compiled from: CryptoHomeAppBarDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0094\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007H\u0007JX\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/appbar/CryptoHomeAppBarDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/crypto/tab/ui/appbar/CryptoHomeAppBarDuxo_Factory;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/crypto/tab/ui/appbar/CryptoHomeAppBarStateProvider;", "resources", "Landroid/content/res/Resources;", "accountSelectorHomeManager", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoChartStore", "Lcom/robinhood/librobinhood/data/store/CryptoChartStore;", "cryptoHomeStore", "Lcom/robinhood/librobinhood/data/store/CryptoHomeStore;", "inboxBadgeStore", "Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;", "portfolioPrivacyPref", "Lcom/robinhood/prefs/BooleanPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/crypto/tab/ui/appbar/CryptoHomeAppBarDuxo;", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoHomeAppBarDuxo_Factory create(Provider<CryptoHomeAppBarDuxo4> stateProvider, Provider<Resources> resources, Provider<AccountSelectorHomeManager> accountSelectorHomeManager, Provider<AppType> appType, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<CryptoChartStore> cryptoChartStore, Provider<CryptoHomeStore> cryptoHomeStore, Provider<InboxBadgeStore> inboxBadgeStore, Provider<BooleanPreference> portfolioPrivacyPref, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(cryptoChartStore, "cryptoChartStore");
            Intrinsics.checkNotNullParameter(cryptoHomeStore, "cryptoHomeStore");
            Intrinsics.checkNotNullParameter(inboxBadgeStore, "inboxBadgeStore");
            Intrinsics.checkNotNullParameter(portfolioPrivacyPref, "portfolioPrivacyPref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CryptoHomeAppBarDuxo_Factory(stateProvider, resources, accountSelectorHomeManager, appType, cryptoAccountProvider, cryptoChartStore, cryptoHomeStore, inboxBadgeStore, portfolioPrivacyPref, duxoBundle);
        }

        @JvmStatic
        public final CryptoHomeAppBarDuxo newInstance(CryptoHomeAppBarDuxo4 stateProvider, Resources resources, AccountSelectorHomeManager accountSelectorHomeManager, AppType appType, CryptoAccountProvider cryptoAccountProvider, CryptoChartStore cryptoChartStore, CryptoHomeStore cryptoHomeStore, InboxBadgeStore inboxBadgeStore, BooleanPreference portfolioPrivacyPref, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(cryptoChartStore, "cryptoChartStore");
            Intrinsics.checkNotNullParameter(cryptoHomeStore, "cryptoHomeStore");
            Intrinsics.checkNotNullParameter(inboxBadgeStore, "inboxBadgeStore");
            Intrinsics.checkNotNullParameter(portfolioPrivacyPref, "portfolioPrivacyPref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CryptoHomeAppBarDuxo(stateProvider, resources, accountSelectorHomeManager, appType, cryptoAccountProvider, cryptoChartStore, cryptoHomeStore, inboxBadgeStore, portfolioPrivacyPref, duxoBundle);
        }
    }
}
