package com.robinhood.android.advisory.onboarding.outro;

import androidx.lifecycle.SavedStateHandle;
import bonfire.proto.idl.advisory.p030v1.AdvisoryOnboardingService;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.dashboard.store.HomeDashboardStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.transfers.lib.validation.TransferValidator;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementAccountSwitcherStore;
import com.robinhood.store.advisory.AdvisoryOnboardingStore;
import com.robinhood.userleap.SurveyManager3;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryPostAgreementsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B½\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010 \u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "advisoryOnboardingService", "Lbonfire/proto/idl/advisory/v1/AdvisoryOnboardingService;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "homeDashboardStore", "Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "onboardingStore", "Lcom/robinhood/store/advisory/AdvisoryOnboardingStore;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "validator", "Lcom/robinhood/android/transfers/lib/validation/TransferValidator;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "retirementAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementAccountSwitcherStore;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AdvisoryPostAgreementsDuxo_Factory implements Factory<AdvisoryPostAgreementsDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AdvisoryOnboardingService> advisoryOnboardingService;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<HomeDashboardStore> homeDashboardStore;
    private final Provider<TraderMarketHoursManager> marketHoursManager;
    private final Provider<AdvisoryOnboardingStore> onboardingStore;
    private final Provider<RetirementAccountSwitcherStore> retirementAccountSwitcherStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<TransferAccountStore> transferAccountStore;
    private final Provider<TransfersBonfireApi> transfersBonfireApi;
    private final Provider<SurveyManager3> userLeapManager;
    private final Provider<TransferValidator> validator;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AdvisoryPostAgreementsDuxo_Factory create(Provider<AccountProvider> provider, Provider<AdvisoryOnboardingService> provider2, Provider<ExperimentsStore> provider3, Provider<HomeDashboardStore> provider4, Provider<AdvisoryOnboardingStore> provider5, Provider<TransferAccountStore> provider6, Provider<TransferValidator> provider7, Provider<TraderMarketHoursManager> provider8, Provider<TransfersBonfireApi> provider9, Provider<RetirementAccountSwitcherStore> provider10, Provider<SurveyManager3> provider11, Provider<SavedStateHandle> provider12, Provider<DuxoBundle> provider13) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    @JvmStatic
    public static final AdvisoryPostAgreementsDuxo newInstance(AccountProvider accountProvider, AdvisoryOnboardingService advisoryOnboardingService, ExperimentsStore experimentsStore, HomeDashboardStore homeDashboardStore, AdvisoryOnboardingStore advisoryOnboardingStore, TransferAccountStore transferAccountStore, TransferValidator transferValidator, TraderMarketHoursManager traderMarketHoursManager, TransfersBonfireApi transfersBonfireApi, RetirementAccountSwitcherStore retirementAccountSwitcherStore, SurveyManager3 surveyManager3, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(accountProvider, advisoryOnboardingService, experimentsStore, homeDashboardStore, advisoryOnboardingStore, transferAccountStore, transferValidator, traderMarketHoursManager, transfersBonfireApi, retirementAccountSwitcherStore, surveyManager3, savedStateHandle, duxoBundle);
    }

    public AdvisoryPostAgreementsDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<AdvisoryOnboardingService> advisoryOnboardingService, Provider<ExperimentsStore> experimentsStore, Provider<HomeDashboardStore> homeDashboardStore, Provider<AdvisoryOnboardingStore> onboardingStore, Provider<TransferAccountStore> transferAccountStore, Provider<TransferValidator> validator, Provider<TraderMarketHoursManager> marketHoursManager, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<RetirementAccountSwitcherStore> retirementAccountSwitcherStore, Provider<SurveyManager3> userLeapManager, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(advisoryOnboardingService, "advisoryOnboardingService");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
        Intrinsics.checkNotNullParameter(onboardingStore, "onboardingStore");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(retirementAccountSwitcherStore, "retirementAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.advisoryOnboardingService = advisoryOnboardingService;
        this.experimentsStore = experimentsStore;
        this.homeDashboardStore = homeDashboardStore;
        this.onboardingStore = onboardingStore;
        this.transferAccountStore = transferAccountStore;
        this.validator = validator;
        this.marketHoursManager = marketHoursManager;
        this.transfersBonfireApi = transfersBonfireApi;
        this.retirementAccountSwitcherStore = retirementAccountSwitcherStore;
        this.userLeapManager = userLeapManager;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public AdvisoryPostAgreementsDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AdvisoryOnboardingService advisoryOnboardingService = this.advisoryOnboardingService.get();
        Intrinsics.checkNotNullExpressionValue(advisoryOnboardingService, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        HomeDashboardStore homeDashboardStore = this.homeDashboardStore.get();
        Intrinsics.checkNotNullExpressionValue(homeDashboardStore, "get(...)");
        AdvisoryOnboardingStore advisoryOnboardingStore = this.onboardingStore.get();
        Intrinsics.checkNotNullExpressionValue(advisoryOnboardingStore, "get(...)");
        TransferAccountStore transferAccountStore = this.transferAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(transferAccountStore, "get(...)");
        TransferValidator transferValidator = this.validator.get();
        Intrinsics.checkNotNullExpressionValue(transferValidator, "get(...)");
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(transfersBonfireApi, "get(...)");
        RetirementAccountSwitcherStore retirementAccountSwitcherStore = this.retirementAccountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(retirementAccountSwitcherStore, "get(...)");
        SurveyManager3 surveyManager3 = this.userLeapManager.get();
        Intrinsics.checkNotNullExpressionValue(surveyManager3, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(accountProvider, advisoryOnboardingService, experimentsStore, homeDashboardStore, advisoryOnboardingStore, transferAccountStore, transferValidator, traderMarketHoursManager, transfersBonfireApi, retirementAccountSwitcherStore, surveyManager3, savedStateHandle, duxoBundle);
    }

    /* compiled from: AdvisoryPostAgreementsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¾\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0007H\u0007Jp\u0010!\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0007¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "advisoryOnboardingService", "Lbonfire/proto/idl/advisory/v1/AdvisoryOnboardingService;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "homeDashboardStore", "Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "onboardingStore", "Lcom/robinhood/store/advisory/AdvisoryOnboardingStore;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "validator", "Lcom/robinhood/android/transfers/lib/validation/TransferValidator;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "retirementAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementAccountSwitcherStore;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDuxo;", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AdvisoryPostAgreementsDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<AdvisoryOnboardingService> advisoryOnboardingService, Provider<ExperimentsStore> experimentsStore, Provider<HomeDashboardStore> homeDashboardStore, Provider<AdvisoryOnboardingStore> onboardingStore, Provider<TransferAccountStore> transferAccountStore, Provider<TransferValidator> validator, Provider<TraderMarketHoursManager> marketHoursManager, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<RetirementAccountSwitcherStore> retirementAccountSwitcherStore, Provider<SurveyManager3> userLeapManager, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(advisoryOnboardingService, "advisoryOnboardingService");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
            Intrinsics.checkNotNullParameter(onboardingStore, "onboardingStore");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(validator, "validator");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(retirementAccountSwitcherStore, "retirementAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AdvisoryPostAgreementsDuxo_Factory(accountProvider, advisoryOnboardingService, experimentsStore, homeDashboardStore, onboardingStore, transferAccountStore, validator, marketHoursManager, transfersBonfireApi, retirementAccountSwitcherStore, userLeapManager, savedStateHandle, duxoBundle);
        }

        @JvmStatic
        public final AdvisoryPostAgreementsDuxo newInstance(AccountProvider accountProvider, AdvisoryOnboardingService advisoryOnboardingService, ExperimentsStore experimentsStore, HomeDashboardStore homeDashboardStore, AdvisoryOnboardingStore onboardingStore, TransferAccountStore transferAccountStore, TransferValidator validator, TraderMarketHoursManager marketHoursManager, TransfersBonfireApi transfersBonfireApi, RetirementAccountSwitcherStore retirementAccountSwitcherStore, SurveyManager3 userLeapManager, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(advisoryOnboardingService, "advisoryOnboardingService");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
            Intrinsics.checkNotNullParameter(onboardingStore, "onboardingStore");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(validator, "validator");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(retirementAccountSwitcherStore, "retirementAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AdvisoryPostAgreementsDuxo(accountProvider, advisoryOnboardingService, experimentsStore, homeDashboardStore, onboardingStore, transferAccountStore, validator, marketHoursManager, transfersBonfireApi, retirementAccountSwitcherStore, userLeapManager, savedStateHandle, duxoBundle);
        }
    }
}
