package com.robinhood.android.margin.upgrade.agreements;

import androidx.lifecycle.SavedStateHandle;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.JointAccountsOnboardingService;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.jointaccounts.api.JointAccountsApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.lib.margin.MarginInvestingInfoStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginUpgradeAgreementDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0093\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "marginInvestingInfoStore", "Lcom/robinhood/android/lib/margin/MarginInvestingInfoStore;", "leveredMarginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "jointAccountsApi", "Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;", "jointAccountsOnboardingService", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountsOnboardingService;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "stateProvider", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class MarginUpgradeAgreementDuxo_Factory implements Factory<MarginUpgradeAgreementDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AgreementsStore> agreementsStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<JointAccountsApi> jointAccountsApi;
    private final Provider<JointAccountsOnboardingService> jointAccountsOnboardingService;
    private final Provider<LeveredMarginSettingsStore> leveredMarginSettingsStore;
    private final Provider<MarginInvestingInfoStore> marginInvestingInfoStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<MarginUpgradeAgreementState2> stateProvider;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MarginUpgradeAgreementDuxo_Factory create(Provider<AccountProvider> provider, Provider<MarginInvestingInfoStore> provider2, Provider<LeveredMarginSettingsStore> provider3, Provider<JointAccountsApi> provider4, Provider<JointAccountsOnboardingService> provider5, Provider<UserStore> provider6, Provider<AgreementsStore> provider7, Provider<MarginUpgradeAgreementState2> provider8, Provider<DuxoBundle> provider9, Provider<SavedStateHandle> provider10) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    @JvmStatic
    public static final MarginUpgradeAgreementDuxo newInstance(AccountProvider accountProvider, MarginInvestingInfoStore marginInvestingInfoStore, LeveredMarginSettingsStore leveredMarginSettingsStore, JointAccountsApi jointAccountsApi, JointAccountsOnboardingService jointAccountsOnboardingService, UserStore userStore, AgreementsStore agreementsStore, MarginUpgradeAgreementState2 marginUpgradeAgreementState2, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(accountProvider, marginInvestingInfoStore, leveredMarginSettingsStore, jointAccountsApi, jointAccountsOnboardingService, userStore, agreementsStore, marginUpgradeAgreementState2, duxoBundle, savedStateHandle);
    }

    public MarginUpgradeAgreementDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<MarginInvestingInfoStore> marginInvestingInfoStore, Provider<LeveredMarginSettingsStore> leveredMarginSettingsStore, Provider<JointAccountsApi> jointAccountsApi, Provider<JointAccountsOnboardingService> jointAccountsOnboardingService, Provider<UserStore> userStore, Provider<AgreementsStore> agreementsStore, Provider<MarginUpgradeAgreementState2> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(marginInvestingInfoStore, "marginInvestingInfoStore");
        Intrinsics.checkNotNullParameter(leveredMarginSettingsStore, "leveredMarginSettingsStore");
        Intrinsics.checkNotNullParameter(jointAccountsApi, "jointAccountsApi");
        Intrinsics.checkNotNullParameter(jointAccountsOnboardingService, "jointAccountsOnboardingService");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.marginInvestingInfoStore = marginInvestingInfoStore;
        this.leveredMarginSettingsStore = leveredMarginSettingsStore;
        this.jointAccountsApi = jointAccountsApi;
        this.jointAccountsOnboardingService = jointAccountsOnboardingService;
        this.userStore = userStore;
        this.agreementsStore = agreementsStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public MarginUpgradeAgreementDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        MarginInvestingInfoStore marginInvestingInfoStore = this.marginInvestingInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(marginInvestingInfoStore, "get(...)");
        LeveredMarginSettingsStore leveredMarginSettingsStore = this.leveredMarginSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(leveredMarginSettingsStore, "get(...)");
        JointAccountsApi jointAccountsApi = this.jointAccountsApi.get();
        Intrinsics.checkNotNullExpressionValue(jointAccountsApi, "get(...)");
        JointAccountsOnboardingService jointAccountsOnboardingService = this.jointAccountsOnboardingService.get();
        Intrinsics.checkNotNullExpressionValue(jointAccountsOnboardingService, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        AgreementsStore agreementsStore = this.agreementsStore.get();
        Intrinsics.checkNotNullExpressionValue(agreementsStore, "get(...)");
        MarginUpgradeAgreementState2 marginUpgradeAgreementState2 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(marginUpgradeAgreementState2, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(accountProvider, marginInvestingInfoStore, leveredMarginSettingsStore, jointAccountsApi, jointAccountsOnboardingService, userStore, agreementsStore, marginUpgradeAgreementState2, duxoBundle, savedStateHandle);
    }

    /* compiled from: MarginUpgradeAgreementDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0094\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007H\u0007JX\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "marginInvestingInfoStore", "Lcom/robinhood/android/lib/margin/MarginInvestingInfoStore;", "leveredMarginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "jointAccountsApi", "Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;", "jointAccountsOnboardingService", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountsOnboardingService;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "stateProvider", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementDuxo;", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MarginUpgradeAgreementDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<MarginInvestingInfoStore> marginInvestingInfoStore, Provider<LeveredMarginSettingsStore> leveredMarginSettingsStore, Provider<JointAccountsApi> jointAccountsApi, Provider<JointAccountsOnboardingService> jointAccountsOnboardingService, Provider<UserStore> userStore, Provider<AgreementsStore> agreementsStore, Provider<MarginUpgradeAgreementState2> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(marginInvestingInfoStore, "marginInvestingInfoStore");
            Intrinsics.checkNotNullParameter(leveredMarginSettingsStore, "leveredMarginSettingsStore");
            Intrinsics.checkNotNullParameter(jointAccountsApi, "jointAccountsApi");
            Intrinsics.checkNotNullParameter(jointAccountsOnboardingService, "jointAccountsOnboardingService");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new MarginUpgradeAgreementDuxo_Factory(accountProvider, marginInvestingInfoStore, leveredMarginSettingsStore, jointAccountsApi, jointAccountsOnboardingService, userStore, agreementsStore, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final MarginUpgradeAgreementDuxo newInstance(AccountProvider accountProvider, MarginInvestingInfoStore marginInvestingInfoStore, LeveredMarginSettingsStore leveredMarginSettingsStore, JointAccountsApi jointAccountsApi, JointAccountsOnboardingService jointAccountsOnboardingService, UserStore userStore, AgreementsStore agreementsStore, MarginUpgradeAgreementState2 stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(marginInvestingInfoStore, "marginInvestingInfoStore");
            Intrinsics.checkNotNullParameter(leveredMarginSettingsStore, "leveredMarginSettingsStore");
            Intrinsics.checkNotNullParameter(jointAccountsApi, "jointAccountsApi");
            Intrinsics.checkNotNullParameter(jointAccountsOnboardingService, "jointAccountsOnboardingService");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new MarginUpgradeAgreementDuxo(accountProvider, marginInvestingInfoStore, leveredMarginSettingsStore, jointAccountsApi, jointAccountsOnboardingService, userStore, agreementsStore, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
