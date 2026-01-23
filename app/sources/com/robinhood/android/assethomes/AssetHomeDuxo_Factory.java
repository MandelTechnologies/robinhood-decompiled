package com.robinhood.android.assethomes;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.redesign.accounttab.prefs.AccountSelectorHomeManager;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.AssetHomeStateStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementNuxStore;
import com.robinhood.librobinhood.usecase.CheckOptionUpgradeToLevel3EligibilityUseCase;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetHomeDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BË\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004¢\u0006\u0004\b\u001f\u0010 J\b\u0010!\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/assethomes/AssetHomeDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/assethomes/AssetHomeDuxo;", "assetHomeStateStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/AssetHomeStateStore;", "positionsV2Store", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionsTourShownPref", "Lcom/robinhood/prefs/BooleanPreference;", "pnlNewTagShownPref", "checkOptionUpgradeToLevel3EligibilityUseCase", "Lcom/robinhood/librobinhood/usecase/CheckOptionUpgradeToLevel3EligibilityUseCase;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "retirementNuxStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementNuxStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "accountSelectorHomeManager", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "stateProvider", "Lcom/robinhood/android/assethomes/AssetHomeStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-asset-homes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AssetHomeDuxo_Factory implements Factory<AssetHomeDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AccountSelectorHomeManager> accountSelectorHomeManager;
    private final Provider<AssetHomeStateStore> assetHomeStateStore;
    private final Provider<CheckOptionUpgradeToLevel3EligibilityUseCase> checkOptionUpgradeToLevel3EligibilityUseCase;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<BooleanPreference> optionsTourShownPref;
    private final Provider<BooleanPreference> pnlNewTagShownPref;
    private final Provider<PositionsV2Store> positionsV2Store;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<RetirementNuxStore> retirementNuxStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<AssetHomeStateProvider> stateProvider;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AssetHomeDuxo_Factory create(Provider<AssetHomeStateStore> provider, Provider<PositionsV2Store> provider2, Provider<ExperimentsStore> provider3, Provider<BooleanPreference> provider4, Provider<BooleanPreference> provider5, Provider<CheckOptionUpgradeToLevel3EligibilityUseCase> provider6, Provider<AccountProvider> provider7, Provider<RetirementNuxStore> provider8, Provider<UserStore> provider9, Provider<RegionGateProvider> provider10, Provider<AccountSelectorHomeManager> provider11, Provider<AssetHomeStateProvider> provider12, Provider<DuxoBundle> provider13, Provider<SavedStateHandle> provider14) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    @JvmStatic
    public static final AssetHomeDuxo newInstance(AssetHomeStateStore assetHomeStateStore, PositionsV2Store positionsV2Store, ExperimentsStore experimentsStore, BooleanPreference booleanPreference, BooleanPreference booleanPreference2, CheckOptionUpgradeToLevel3EligibilityUseCase checkOptionUpgradeToLevel3EligibilityUseCase, AccountProvider accountProvider, RetirementNuxStore retirementNuxStore, UserStore userStore, RegionGateProvider regionGateProvider, AccountSelectorHomeManager accountSelectorHomeManager, AssetHomeStateProvider assetHomeStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(assetHomeStateStore, positionsV2Store, experimentsStore, booleanPreference, booleanPreference2, checkOptionUpgradeToLevel3EligibilityUseCase, accountProvider, retirementNuxStore, userStore, regionGateProvider, accountSelectorHomeManager, assetHomeStateProvider, duxoBundle, savedStateHandle);
    }

    public AssetHomeDuxo_Factory(Provider<AssetHomeStateStore> assetHomeStateStore, Provider<PositionsV2Store> positionsV2Store, Provider<ExperimentsStore> experimentsStore, Provider<BooleanPreference> optionsTourShownPref, Provider<BooleanPreference> pnlNewTagShownPref, Provider<CheckOptionUpgradeToLevel3EligibilityUseCase> checkOptionUpgradeToLevel3EligibilityUseCase, Provider<AccountProvider> accountProvider, Provider<RetirementNuxStore> retirementNuxStore, Provider<UserStore> userStore, Provider<RegionGateProvider> regionGateProvider, Provider<AccountSelectorHomeManager> accountSelectorHomeManager, Provider<AssetHomeStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(assetHomeStateStore, "assetHomeStateStore");
        Intrinsics.checkNotNullParameter(positionsV2Store, "positionsV2Store");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(optionsTourShownPref, "optionsTourShownPref");
        Intrinsics.checkNotNullParameter(pnlNewTagShownPref, "pnlNewTagShownPref");
        Intrinsics.checkNotNullParameter(checkOptionUpgradeToLevel3EligibilityUseCase, "checkOptionUpgradeToLevel3EligibilityUseCase");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(retirementNuxStore, "retirementNuxStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.assetHomeStateStore = assetHomeStateStore;
        this.positionsV2Store = positionsV2Store;
        this.experimentsStore = experimentsStore;
        this.optionsTourShownPref = optionsTourShownPref;
        this.pnlNewTagShownPref = pnlNewTagShownPref;
        this.checkOptionUpgradeToLevel3EligibilityUseCase = checkOptionUpgradeToLevel3EligibilityUseCase;
        this.accountProvider = accountProvider;
        this.retirementNuxStore = retirementNuxStore;
        this.userStore = userStore;
        this.regionGateProvider = regionGateProvider;
        this.accountSelectorHomeManager = accountSelectorHomeManager;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public AssetHomeDuxo get() {
        Companion companion = INSTANCE;
        AssetHomeStateStore assetHomeStateStore = this.assetHomeStateStore.get();
        Intrinsics.checkNotNullExpressionValue(assetHomeStateStore, "get(...)");
        PositionsV2Store positionsV2Store = this.positionsV2Store.get();
        Intrinsics.checkNotNullExpressionValue(positionsV2Store, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        BooleanPreference booleanPreference = this.optionsTourShownPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = this.pnlNewTagShownPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        CheckOptionUpgradeToLevel3EligibilityUseCase checkOptionUpgradeToLevel3EligibilityUseCase = this.checkOptionUpgradeToLevel3EligibilityUseCase.get();
        Intrinsics.checkNotNullExpressionValue(checkOptionUpgradeToLevel3EligibilityUseCase, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        RetirementNuxStore retirementNuxStore = this.retirementNuxStore.get();
        Intrinsics.checkNotNullExpressionValue(retirementNuxStore, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        AccountSelectorHomeManager accountSelectorHomeManager = this.accountSelectorHomeManager.get();
        Intrinsics.checkNotNullExpressionValue(accountSelectorHomeManager, "get(...)");
        AssetHomeStateProvider assetHomeStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(assetHomeStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(assetHomeStateStore, positionsV2Store, experimentsStore, booleanPreference, booleanPreference2, checkOptionUpgradeToLevel3EligibilityUseCase, accountProvider, retirementNuxStore, userStore, regionGateProvider, accountSelectorHomeManager, assetHomeStateProvider, duxoBundle, savedStateHandle);
    }

    /* compiled from: AssetHomeDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÌ\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0007H\u0007Jx\u0010\"\u001a\u00020#2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0007¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/assethomes/AssetHomeDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/assethomes/AssetHomeDuxo_Factory;", "assetHomeStateStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/AssetHomeStateStore;", "positionsV2Store", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionsTourShownPref", "Lcom/robinhood/prefs/BooleanPreference;", "pnlNewTagShownPref", "checkOptionUpgradeToLevel3EligibilityUseCase", "Lcom/robinhood/librobinhood/usecase/CheckOptionUpgradeToLevel3EligibilityUseCase;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "retirementNuxStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementNuxStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "accountSelectorHomeManager", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "stateProvider", "Lcom/robinhood/android/assethomes/AssetHomeStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/assethomes/AssetHomeDuxo;", "feature-asset-homes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AssetHomeDuxo_Factory create(Provider<AssetHomeStateStore> assetHomeStateStore, Provider<PositionsV2Store> positionsV2Store, Provider<ExperimentsStore> experimentsStore, Provider<BooleanPreference> optionsTourShownPref, Provider<BooleanPreference> pnlNewTagShownPref, Provider<CheckOptionUpgradeToLevel3EligibilityUseCase> checkOptionUpgradeToLevel3EligibilityUseCase, Provider<AccountProvider> accountProvider, Provider<RetirementNuxStore> retirementNuxStore, Provider<UserStore> userStore, Provider<RegionGateProvider> regionGateProvider, Provider<AccountSelectorHomeManager> accountSelectorHomeManager, Provider<AssetHomeStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(assetHomeStateStore, "assetHomeStateStore");
            Intrinsics.checkNotNullParameter(positionsV2Store, "positionsV2Store");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(optionsTourShownPref, "optionsTourShownPref");
            Intrinsics.checkNotNullParameter(pnlNewTagShownPref, "pnlNewTagShownPref");
            Intrinsics.checkNotNullParameter(checkOptionUpgradeToLevel3EligibilityUseCase, "checkOptionUpgradeToLevel3EligibilityUseCase");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(retirementNuxStore, "retirementNuxStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new AssetHomeDuxo_Factory(assetHomeStateStore, positionsV2Store, experimentsStore, optionsTourShownPref, pnlNewTagShownPref, checkOptionUpgradeToLevel3EligibilityUseCase, accountProvider, retirementNuxStore, userStore, regionGateProvider, accountSelectorHomeManager, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final AssetHomeDuxo newInstance(AssetHomeStateStore assetHomeStateStore, PositionsV2Store positionsV2Store, ExperimentsStore experimentsStore, BooleanPreference optionsTourShownPref, BooleanPreference pnlNewTagShownPref, CheckOptionUpgradeToLevel3EligibilityUseCase checkOptionUpgradeToLevel3EligibilityUseCase, AccountProvider accountProvider, RetirementNuxStore retirementNuxStore, UserStore userStore, RegionGateProvider regionGateProvider, AccountSelectorHomeManager accountSelectorHomeManager, AssetHomeStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(assetHomeStateStore, "assetHomeStateStore");
            Intrinsics.checkNotNullParameter(positionsV2Store, "positionsV2Store");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(optionsTourShownPref, "optionsTourShownPref");
            Intrinsics.checkNotNullParameter(pnlNewTagShownPref, "pnlNewTagShownPref");
            Intrinsics.checkNotNullParameter(checkOptionUpgradeToLevel3EligibilityUseCase, "checkOptionUpgradeToLevel3EligibilityUseCase");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(retirementNuxStore, "retirementNuxStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new AssetHomeDuxo(assetHomeStateStore, positionsV2Store, experimentsStore, optionsTourShownPref, pnlNewTagShownPref, checkOptionUpgradeToLevel3EligibilityUseCase, accountProvider, retirementNuxStore, userStore, regionGateProvider, accountSelectorHomeManager, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
