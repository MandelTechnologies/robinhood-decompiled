package com.robinhood.android.transfers.p271ui.retirement.contributions;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.data.store.portfolio.TraderPortfolioStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.transfers.lib.validation.TransferValidator;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.BalancesStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.ContributionStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementMatchStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementTransfersMatchRateSelectionStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateRetirementContributionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'Bç\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004¢\u0006\u0004\b$\u0010%J\b\u0010&\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "contributionStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/ContributionStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "defaultAchRelationshipPref", "Lcom/robinhood/prefs/StringPreference;", "validator", "Lcom/robinhood/android/transfers/lib/validation/TransferValidator;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "retirementMatchStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "retirementTransfersMatchRateSelectionStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementTransfersMatchRateSelectionStore;", "hasSeenFullscreenMatchSelectionPref", "Lcom/robinhood/prefs/BooleanPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class CreateRetirementContributionDuxo_Factory implements Factory<CreateRetirementContributionDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<BalancesStore> balancesStore;
    private final Provider<ContributionStore> contributionStore;
    private final Provider<StringPreference> defaultAchRelationshipPref;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<BooleanPreference> hasSeenFullscreenMatchSelectionPref;
    private final Provider<TraderMarketHoursManager> marketHoursManager;
    private final Provider<TraderPortfolioStore> portfolioStore;
    private final Provider<RetirementMatchStore> retirementMatchStore;
    private final Provider<RetirementTransfersMatchRateSelectionStore> retirementTransfersMatchRateSelectionStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<TransferAccountStore> transferAccountStore;
    private final Provider<TransfersBonfireApi> transfersBonfireApi;
    private final Provider<TransferValidator> validator;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CreateRetirementContributionDuxo_Factory create(Provider<AccountProvider> provider, Provider<TransfersBonfireApi> provider2, Provider<TransferAccountStore> provider3, Provider<ContributionStore> provider4, Provider<EventLogger> provider5, Provider<StringPreference> provider6, Provider<TransferValidator> provider7, Provider<TraderPortfolioStore> provider8, Provider<BalancesStore> provider9, Provider<TraderMarketHoursManager> provider10, Provider<ExperimentsStore> provider11, Provider<RetirementMatchStore> provider12, Provider<RetirementTransfersMatchRateSelectionStore> provider13, Provider<BooleanPreference> provider14, Provider<DuxoBundle> provider15, Provider<SavedStateHandle> provider16) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16);
    }

    @JvmStatic
    public static final CreateRetirementContributionDuxo newInstance(AccountProvider accountProvider, TransfersBonfireApi transfersBonfireApi, TransferAccountStore transferAccountStore, ContributionStore contributionStore, EventLogger eventLogger, StringPreference stringPreference, TransferValidator transferValidator, TraderPortfolioStore traderPortfolioStore, BalancesStore balancesStore, TraderMarketHoursManager traderMarketHoursManager, ExperimentsStore experimentsStore, RetirementMatchStore retirementMatchStore, RetirementTransfersMatchRateSelectionStore retirementTransfersMatchRateSelectionStore, BooleanPreference booleanPreference, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(accountProvider, transfersBonfireApi, transferAccountStore, contributionStore, eventLogger, stringPreference, transferValidator, traderPortfolioStore, balancesStore, traderMarketHoursManager, experimentsStore, retirementMatchStore, retirementTransfersMatchRateSelectionStore, booleanPreference, duxoBundle, savedStateHandle);
    }

    public CreateRetirementContributionDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<TransferAccountStore> transferAccountStore, Provider<ContributionStore> contributionStore, Provider<EventLogger> eventLogger, Provider<StringPreference> defaultAchRelationshipPref, Provider<TransferValidator> validator, Provider<TraderPortfolioStore> portfolioStore, Provider<BalancesStore> balancesStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<ExperimentsStore> experimentsStore, Provider<RetirementMatchStore> retirementMatchStore, Provider<RetirementTransfersMatchRateSelectionStore> retirementTransfersMatchRateSelectionStore, Provider<BooleanPreference> hasSeenFullscreenMatchSelectionPref, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(contributionStore, "contributionStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(defaultAchRelationshipPref, "defaultAchRelationshipPref");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(retirementMatchStore, "retirementMatchStore");
        Intrinsics.checkNotNullParameter(retirementTransfersMatchRateSelectionStore, "retirementTransfersMatchRateSelectionStore");
        Intrinsics.checkNotNullParameter(hasSeenFullscreenMatchSelectionPref, "hasSeenFullscreenMatchSelectionPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.transfersBonfireApi = transfersBonfireApi;
        this.transferAccountStore = transferAccountStore;
        this.contributionStore = contributionStore;
        this.eventLogger = eventLogger;
        this.defaultAchRelationshipPref = defaultAchRelationshipPref;
        this.validator = validator;
        this.portfolioStore = portfolioStore;
        this.balancesStore = balancesStore;
        this.marketHoursManager = marketHoursManager;
        this.experimentsStore = experimentsStore;
        this.retirementMatchStore = retirementMatchStore;
        this.retirementTransfersMatchRateSelectionStore = retirementTransfersMatchRateSelectionStore;
        this.hasSeenFullscreenMatchSelectionPref = hasSeenFullscreenMatchSelectionPref;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public CreateRetirementContributionDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(transfersBonfireApi, "get(...)");
        TransferAccountStore transferAccountStore = this.transferAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(transferAccountStore, "get(...)");
        ContributionStore contributionStore = this.contributionStore.get();
        Intrinsics.checkNotNullExpressionValue(contributionStore, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        StringPreference stringPreference = this.defaultAchRelationshipPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        TransferValidator transferValidator = this.validator.get();
        Intrinsics.checkNotNullExpressionValue(transferValidator, "get(...)");
        TraderPortfolioStore traderPortfolioStore = this.portfolioStore.get();
        Intrinsics.checkNotNullExpressionValue(traderPortfolioStore, "get(...)");
        BalancesStore balancesStore = this.balancesStore.get();
        Intrinsics.checkNotNullExpressionValue(balancesStore, "get(...)");
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        RetirementMatchStore retirementMatchStore = this.retirementMatchStore.get();
        Intrinsics.checkNotNullExpressionValue(retirementMatchStore, "get(...)");
        RetirementTransfersMatchRateSelectionStore retirementTransfersMatchRateSelectionStore = this.retirementTransfersMatchRateSelectionStore.get();
        Intrinsics.checkNotNullExpressionValue(retirementTransfersMatchRateSelectionStore, "get(...)");
        BooleanPreference booleanPreference = this.hasSeenFullscreenMatchSelectionPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = booleanPreference;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        DuxoBundle duxoBundle2 = duxoBundle;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(accountProvider, transfersBonfireApi, transferAccountStore, contributionStore, eventLogger, stringPreference, transferValidator, traderPortfolioStore, balancesStore, traderMarketHoursManager, experimentsStore, retirementMatchStore, retirementTransfersMatchRateSelectionStore, booleanPreference2, duxoBundle2, savedStateHandle);
    }

    /* compiled from: CreateRetirementContributionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jè\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0007H\u0007J\u0088\u0001\u0010'\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0007¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "contributionStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/ContributionStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "defaultAchRelationshipPref", "Lcom/robinhood/prefs/StringPreference;", "validator", "Lcom/robinhood/android/transfers/lib/validation/TransferValidator;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "retirementMatchStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "retirementTransfersMatchRateSelectionStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementTransfersMatchRateSelectionStore;", "hasSeenFullscreenMatchSelectionPref", "Lcom/robinhood/prefs/BooleanPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDuxo;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CreateRetirementContributionDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<TransferAccountStore> transferAccountStore, Provider<ContributionStore> contributionStore, Provider<EventLogger> eventLogger, Provider<StringPreference> defaultAchRelationshipPref, Provider<TransferValidator> validator, Provider<TraderPortfolioStore> portfolioStore, Provider<BalancesStore> balancesStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<ExperimentsStore> experimentsStore, Provider<RetirementMatchStore> retirementMatchStore, Provider<RetirementTransfersMatchRateSelectionStore> retirementTransfersMatchRateSelectionStore, Provider<BooleanPreference> hasSeenFullscreenMatchSelectionPref, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(contributionStore, "contributionStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(defaultAchRelationshipPref, "defaultAchRelationshipPref");
            Intrinsics.checkNotNullParameter(validator, "validator");
            Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
            Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(retirementMatchStore, "retirementMatchStore");
            Intrinsics.checkNotNullParameter(retirementTransfersMatchRateSelectionStore, "retirementTransfersMatchRateSelectionStore");
            Intrinsics.checkNotNullParameter(hasSeenFullscreenMatchSelectionPref, "hasSeenFullscreenMatchSelectionPref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CreateRetirementContributionDuxo_Factory(accountProvider, transfersBonfireApi, transferAccountStore, contributionStore, eventLogger, defaultAchRelationshipPref, validator, portfolioStore, balancesStore, marketHoursManager, experimentsStore, retirementMatchStore, retirementTransfersMatchRateSelectionStore, hasSeenFullscreenMatchSelectionPref, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final CreateRetirementContributionDuxo newInstance(AccountProvider accountProvider, TransfersBonfireApi transfersBonfireApi, TransferAccountStore transferAccountStore, ContributionStore contributionStore, EventLogger eventLogger, StringPreference defaultAchRelationshipPref, TransferValidator validator, TraderPortfolioStore portfolioStore, BalancesStore balancesStore, TraderMarketHoursManager marketHoursManager, ExperimentsStore experimentsStore, RetirementMatchStore retirementMatchStore, RetirementTransfersMatchRateSelectionStore retirementTransfersMatchRateSelectionStore, BooleanPreference hasSeenFullscreenMatchSelectionPref, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(contributionStore, "contributionStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(defaultAchRelationshipPref, "defaultAchRelationshipPref");
            Intrinsics.checkNotNullParameter(validator, "validator");
            Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
            Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(retirementMatchStore, "retirementMatchStore");
            Intrinsics.checkNotNullParameter(retirementTransfersMatchRateSelectionStore, "retirementTransfersMatchRateSelectionStore");
            Intrinsics.checkNotNullParameter(hasSeenFullscreenMatchSelectionPref, "hasSeenFullscreenMatchSelectionPref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CreateRetirementContributionDuxo(accountProvider, transfersBonfireApi, transferAccountStore, contributionStore, eventLogger, defaultAchRelationshipPref, validator, portfolioStore, balancesStore, marketHoursManager, experimentsStore, retirementMatchStore, retirementTransfersMatchRateSelectionStore, hasSeenFullscreenMatchSelectionPref, duxoBundle, savedStateHandle);
        }
    }
}
