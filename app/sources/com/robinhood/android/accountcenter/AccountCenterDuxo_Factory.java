package com.robinhood.android.accountcenter;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.redesign.accounttab.prefs.AccountSelectorHomeManager;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.AccountCenterStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.FeatureDiscoveryStore;
import com.robinhood.librobinhood.data.store.ProfileStore;
import com.robinhood.librobinhood.data.store.ReferralStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.prefs.IntPreference;
import com.robinhood.shared.common.store.media.MediaStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountCenterDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BË\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004¢\u0006\u0004\b \u0010!J\b\u0010\"\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/AccountCenterDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/accountcenter/AccountCenterDuxo;", "accountCenterStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AccountCenterStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "profileStore", "Lcom/robinhood/librobinhood/data/store/ProfileStore;", "referralStore", "Lcom/robinhood/librobinhood/data/store/ReferralStore;", "mediaStore", "Lcom/robinhood/shared/common/store/media/MediaStore;", "featureDiscoveryStore", "Lcom/robinhood/librobinhood/data/store/FeatureDiscoveryStore;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountSelectorHomeManager", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "accountTabCurrencyPref", "Lcom/robinhood/prefs/IntPreference;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AccountCenterDuxo_Factory implements Factory<AccountCenterDuxo> {
    private final Provider<AccountCenterStore> accountCenterStore;
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AccountSelectorHomeManager> accountSelectorHomeManager;
    private final Provider<IntPreference> accountTabCurrencyPref;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<FeatureDiscoveryStore> featureDiscoveryStore;
    private final Provider<MediaStore> mediaStore;
    private final Provider<ProfileStore> profileStore;
    private final Provider<ReferralStore> referralStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<TransferAccountStore> transferAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AccountCenterDuxo_Factory create(Provider<AccountCenterStore> provider, Provider<ExperimentsStore> provider2, Provider<ProfileStore> provider3, Provider<ReferralStore> provider4, Provider<MediaStore> provider5, Provider<FeatureDiscoveryStore> provider6, Provider<TransferAccountStore> provider7, Provider<RegionGateProvider> provider8, Provider<AccountProvider> provider9, Provider<AccountSelectorHomeManager> provider10, Provider<IntPreference> provider11, Provider<DispatcherProvider> provider12, Provider<RxFactory> provider13, Provider<RxGlobalErrorHandler> provider14) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    @JvmStatic
    public static final AccountCenterDuxo newInstance(AccountCenterStore accountCenterStore, ExperimentsStore experimentsStore, ProfileStore profileStore, ReferralStore referralStore, MediaStore mediaStore, FeatureDiscoveryStore featureDiscoveryStore, TransferAccountStore transferAccountStore, RegionGateProvider regionGateProvider, AccountProvider accountProvider, AccountSelectorHomeManager accountSelectorHomeManager, IntPreference intPreference) {
        return INSTANCE.newInstance(accountCenterStore, experimentsStore, profileStore, referralStore, mediaStore, featureDiscoveryStore, transferAccountStore, regionGateProvider, accountProvider, accountSelectorHomeManager, intPreference);
    }

    public AccountCenterDuxo_Factory(Provider<AccountCenterStore> accountCenterStore, Provider<ExperimentsStore> experimentsStore, Provider<ProfileStore> profileStore, Provider<ReferralStore> referralStore, Provider<MediaStore> mediaStore, Provider<FeatureDiscoveryStore> featureDiscoveryStore, Provider<TransferAccountStore> transferAccountStore, Provider<RegionGateProvider> regionGateProvider, Provider<AccountProvider> accountProvider, Provider<AccountSelectorHomeManager> accountSelectorHomeManager, Provider<IntPreference> accountTabCurrencyPref, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(accountCenterStore, "accountCenterStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(profileStore, "profileStore");
        Intrinsics.checkNotNullParameter(referralStore, "referralStore");
        Intrinsics.checkNotNullParameter(mediaStore, "mediaStore");
        Intrinsics.checkNotNullParameter(featureDiscoveryStore, "featureDiscoveryStore");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
        Intrinsics.checkNotNullParameter(accountTabCurrencyPref, "accountTabCurrencyPref");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.accountCenterStore = accountCenterStore;
        this.experimentsStore = experimentsStore;
        this.profileStore = profileStore;
        this.referralStore = referralStore;
        this.mediaStore = mediaStore;
        this.featureDiscoveryStore = featureDiscoveryStore;
        this.transferAccountStore = transferAccountStore;
        this.regionGateProvider = regionGateProvider;
        this.accountProvider = accountProvider;
        this.accountSelectorHomeManager = accountSelectorHomeManager;
        this.accountTabCurrencyPref = accountTabCurrencyPref;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public AccountCenterDuxo get() {
        Companion companion = INSTANCE;
        AccountCenterStore accountCenterStore = this.accountCenterStore.get();
        Intrinsics.checkNotNullExpressionValue(accountCenterStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        ProfileStore profileStore = this.profileStore.get();
        Intrinsics.checkNotNullExpressionValue(profileStore, "get(...)");
        ReferralStore referralStore = this.referralStore.get();
        Intrinsics.checkNotNullExpressionValue(referralStore, "get(...)");
        MediaStore mediaStore = this.mediaStore.get();
        Intrinsics.checkNotNullExpressionValue(mediaStore, "get(...)");
        FeatureDiscoveryStore featureDiscoveryStore = this.featureDiscoveryStore.get();
        Intrinsics.checkNotNullExpressionValue(featureDiscoveryStore, "get(...)");
        TransferAccountStore transferAccountStore = this.transferAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(transferAccountStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AccountSelectorHomeManager accountSelectorHomeManager = this.accountSelectorHomeManager.get();
        Intrinsics.checkNotNullExpressionValue(accountSelectorHomeManager, "get(...)");
        IntPreference intPreference = this.accountTabCurrencyPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference, "get(...)");
        AccountCenterDuxo accountCenterDuxoNewInstance = companion.newInstance(accountCenterStore, experimentsStore, profileStore, referralStore, mediaStore, featureDiscoveryStore, transferAccountStore, regionGateProvider, accountProvider, accountSelectorHomeManager, intPreference);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(accountCenterDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(accountCenterDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(accountCenterDuxoNewInstance, rxGlobalErrorHandler);
        return accountCenterDuxoNewInstance;
    }

    /* compiled from: AccountCenterDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÌ\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0007H\u0007J`\u0010#\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/AccountCenterDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/accountcenter/AccountCenterDuxo_Factory;", "accountCenterStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AccountCenterStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "profileStore", "Lcom/robinhood/librobinhood/data/store/ProfileStore;", "referralStore", "Lcom/robinhood/librobinhood/data/store/ReferralStore;", "mediaStore", "Lcom/robinhood/shared/common/store/media/MediaStore;", "featureDiscoveryStore", "Lcom/robinhood/librobinhood/data/store/FeatureDiscoveryStore;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountSelectorHomeManager", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "accountTabCurrencyPref", "Lcom/robinhood/prefs/IntPreference;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/accountcenter/AccountCenterDuxo;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccountCenterDuxo_Factory create(Provider<AccountCenterStore> accountCenterStore, Provider<ExperimentsStore> experimentsStore, Provider<ProfileStore> profileStore, Provider<ReferralStore> referralStore, Provider<MediaStore> mediaStore, Provider<FeatureDiscoveryStore> featureDiscoveryStore, Provider<TransferAccountStore> transferAccountStore, Provider<RegionGateProvider> regionGateProvider, Provider<AccountProvider> accountProvider, Provider<AccountSelectorHomeManager> accountSelectorHomeManager, Provider<IntPreference> accountTabCurrencyPref, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(accountCenterStore, "accountCenterStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(profileStore, "profileStore");
            Intrinsics.checkNotNullParameter(referralStore, "referralStore");
            Intrinsics.checkNotNullParameter(mediaStore, "mediaStore");
            Intrinsics.checkNotNullParameter(featureDiscoveryStore, "featureDiscoveryStore");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
            Intrinsics.checkNotNullParameter(accountTabCurrencyPref, "accountTabCurrencyPref");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new AccountCenterDuxo_Factory(accountCenterStore, experimentsStore, profileStore, referralStore, mediaStore, featureDiscoveryStore, transferAccountStore, regionGateProvider, accountProvider, accountSelectorHomeManager, accountTabCurrencyPref, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final AccountCenterDuxo newInstance(AccountCenterStore accountCenterStore, ExperimentsStore experimentsStore, ProfileStore profileStore, ReferralStore referralStore, MediaStore mediaStore, FeatureDiscoveryStore featureDiscoveryStore, TransferAccountStore transferAccountStore, RegionGateProvider regionGateProvider, AccountProvider accountProvider, AccountSelectorHomeManager accountSelectorHomeManager, IntPreference accountTabCurrencyPref) {
            Intrinsics.checkNotNullParameter(accountCenterStore, "accountCenterStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(profileStore, "profileStore");
            Intrinsics.checkNotNullParameter(referralStore, "referralStore");
            Intrinsics.checkNotNullParameter(mediaStore, "mediaStore");
            Intrinsics.checkNotNullParameter(featureDiscoveryStore, "featureDiscoveryStore");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
            Intrinsics.checkNotNullParameter(accountTabCurrencyPref, "accountTabCurrencyPref");
            return new AccountCenterDuxo(accountCenterStore, experimentsStore, profileStore, referralStore, mediaStore, featureDiscoveryStore, transferAccountStore, regionGateProvider, accountProvider, accountSelectorHomeManager, accountTabCurrencyPref);
        }
    }
}
