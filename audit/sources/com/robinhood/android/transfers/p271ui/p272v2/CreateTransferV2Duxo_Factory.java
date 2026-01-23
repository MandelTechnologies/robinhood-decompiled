package com.robinhood.android.transfers.p271ui.p272v2;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.retirement.transfers.RetirementTransfersApi;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.data.store.portfolio.TraderPortfolioStore;
import com.robinhood.android.engagement.depositincentive.DepositIncentiveStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.transfers.TransferFactoryForV2;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.lib.validation.TransferValidator;
import com.robinhood.android.transfers.p271ui.p272v2.additionaldata.CreateTransferV2AdditionalDataClient;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.BalancesStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.SuggestedAmountsStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferV2LimitsStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RothConversionStore;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.shared.data.store.iac.IacUpsellStore;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferV2Duxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00017B×\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0004\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0004\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0004¢\u0006\u0004\b4\u00105J\b\u00106\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Duxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Duxo;", "paymentMethodLastUsagesPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringToLongMapPreference;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "iacUpsellStore", "Lcom/robinhood/shared/data/store/iac/IacUpsellStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "transferLimitsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferV2LimitsStore;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "suggestedAmountsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/SuggestedAmountsStore;", "retirementTransfersApi", "Lcom/robinhood/android/api/retirement/transfers/RetirementTransfersApi;", "additionalDataClient", "Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "transferFactory", "Lcom/robinhood/android/lib/transfers/TransferFactoryForV2;", "transferValidator", "Lcom/robinhood/android/transfers/lib/validation/TransferValidator;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "depositIncentiveStore", "Lcom/robinhood/android/engagement/depositincentive/DepositIncentiveStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "rothConversionStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RothConversionStore;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class CreateTransferV2Duxo_Factory implements Factory<CreateTransferV2Duxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<CreateTransferV2AdditionalDataClient> additionalDataClient;
    private final Provider<BalancesStore> balancesStore;
    private final Provider<Context> context;
    private final Provider<DepositIncentiveStore> depositIncentiveStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<IacUpsellStore> iacUpsellStore;
    private final Provider<TraderMarketHoursManager> marketHoursManager;
    private final Provider<MicrogramManager> microgramManager;
    private final Provider<LazyMoshi> moshi;
    private final Provider<Navigator> navigator;
    private final Provider<StringToLongMapPreference> paymentMethodLastUsagesPref;
    private final Provider<TraderPortfolioStore> portfolioStore;
    private final Provider<RetirementTransfersApi> retirementTransfersApi;
    private final Provider<RothConversionStore> rothConversionStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<SuggestedAmountsStore> suggestedAmountsStore;
    private final Provider<TransferAccountStore> transferAccountStore;
    private final Provider<TransferFactoryForV2> transferFactory;
    private final Provider<TransferV2LimitsStore> transferLimitsStore;
    private final Provider<TransferValidator> transferValidator;
    private final Provider<TransfersBonfireApi> transfersBonfireApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CreateTransferV2Duxo_Factory create(Provider<StringToLongMapPreference> provider, Provider<AccountProvider> provider2, Provider<BalancesStore> provider3, Provider<ExperimentsStore> provider4, Provider<IacUpsellStore> provider5, Provider<TraderMarketHoursManager> provider6, Provider<TransferAccountStore> provider7, Provider<TransferV2LimitsStore> provider8, Provider<TransfersBonfireApi> provider9, Provider<SuggestedAmountsStore> provider10, Provider<RetirementTransfersApi> provider11, Provider<CreateTransferV2AdditionalDataClient> provider12, Provider<TraderPortfolioStore> provider13, Provider<TransferFactoryForV2> provider14, Provider<TransferValidator> provider15, Provider<EventLogger> provider16, Provider<DepositIncentiveStore> provider17, Provider<DuxoBundle> provider18, Provider<SavedStateHandle> provider19, Provider<MicrogramManager> provider20, Provider<LazyMoshi> provider21, Provider<RothConversionStore> provider22, Provider<Navigator> provider23, Provider<Context> provider24) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24);
    }

    @JvmStatic
    public static final CreateTransferV2Duxo newInstance(StringToLongMapPreference stringToLongMapPreference, AccountProvider accountProvider, BalancesStore balancesStore, ExperimentsStore experimentsStore, IacUpsellStore iacUpsellStore, TraderMarketHoursManager traderMarketHoursManager, TransferAccountStore transferAccountStore, TransferV2LimitsStore transferV2LimitsStore, TransfersBonfireApi transfersBonfireApi, SuggestedAmountsStore suggestedAmountsStore, RetirementTransfersApi retirementTransfersApi, CreateTransferV2AdditionalDataClient createTransferV2AdditionalDataClient, TraderPortfolioStore traderPortfolioStore, TransferFactoryForV2 transferFactoryForV2, TransferValidator transferValidator, EventLogger eventLogger, DepositIncentiveStore depositIncentiveStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, MicrogramManager microgramManager, LazyMoshi lazyMoshi, RothConversionStore rothConversionStore, Navigator navigator, Context context) {
        return INSTANCE.newInstance(stringToLongMapPreference, accountProvider, balancesStore, experimentsStore, iacUpsellStore, traderMarketHoursManager, transferAccountStore, transferV2LimitsStore, transfersBonfireApi, suggestedAmountsStore, retirementTransfersApi, createTransferV2AdditionalDataClient, traderPortfolioStore, transferFactoryForV2, transferValidator, eventLogger, depositIncentiveStore, duxoBundle, savedStateHandle, microgramManager, lazyMoshi, rothConversionStore, navigator, context);
    }

    public CreateTransferV2Duxo_Factory(Provider<StringToLongMapPreference> paymentMethodLastUsagesPref, Provider<AccountProvider> accountProvider, Provider<BalancesStore> balancesStore, Provider<ExperimentsStore> experimentsStore, Provider<IacUpsellStore> iacUpsellStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<TransferAccountStore> transferAccountStore, Provider<TransferV2LimitsStore> transferLimitsStore, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<SuggestedAmountsStore> suggestedAmountsStore, Provider<RetirementTransfersApi> retirementTransfersApi, Provider<CreateTransferV2AdditionalDataClient> additionalDataClient, Provider<TraderPortfolioStore> portfolioStore, Provider<TransferFactoryForV2> transferFactory, Provider<TransferValidator> transferValidator, Provider<EventLogger> eventLogger, Provider<DepositIncentiveStore> depositIncentiveStore, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<MicrogramManager> microgramManager, Provider<LazyMoshi> moshi, Provider<RothConversionStore> rothConversionStore, Provider<Navigator> navigator, Provider<Context> context) {
        Intrinsics.checkNotNullParameter(paymentMethodLastUsagesPref, "paymentMethodLastUsagesPref");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(iacUpsellStore, "iacUpsellStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(transferLimitsStore, "transferLimitsStore");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(suggestedAmountsStore, "suggestedAmountsStore");
        Intrinsics.checkNotNullParameter(retirementTransfersApi, "retirementTransfersApi");
        Intrinsics.checkNotNullParameter(additionalDataClient, "additionalDataClient");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(transferFactory, "transferFactory");
        Intrinsics.checkNotNullParameter(transferValidator, "transferValidator");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(depositIncentiveStore, "depositIncentiveStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(rothConversionStore, "rothConversionStore");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        this.paymentMethodLastUsagesPref = paymentMethodLastUsagesPref;
        this.accountProvider = accountProvider;
        this.balancesStore = balancesStore;
        this.experimentsStore = experimentsStore;
        this.iacUpsellStore = iacUpsellStore;
        this.marketHoursManager = marketHoursManager;
        this.transferAccountStore = transferAccountStore;
        this.transferLimitsStore = transferLimitsStore;
        this.transfersBonfireApi = transfersBonfireApi;
        this.suggestedAmountsStore = suggestedAmountsStore;
        this.retirementTransfersApi = retirementTransfersApi;
        this.additionalDataClient = additionalDataClient;
        this.portfolioStore = portfolioStore;
        this.transferFactory = transferFactory;
        this.transferValidator = transferValidator;
        this.eventLogger = eventLogger;
        this.depositIncentiveStore = depositIncentiveStore;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
        this.microgramManager = microgramManager;
        this.moshi = moshi;
        this.rothConversionStore = rothConversionStore;
        this.navigator = navigator;
        this.context = context;
    }

    @Override // javax.inject.Provider
    public CreateTransferV2Duxo get() {
        Companion companion = INSTANCE;
        StringToLongMapPreference stringToLongMapPreference = this.paymentMethodLastUsagesPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToLongMapPreference, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        BalancesStore balancesStore = this.balancesStore.get();
        Intrinsics.checkNotNullExpressionValue(balancesStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        IacUpsellStore iacUpsellStore = this.iacUpsellStore.get();
        Intrinsics.checkNotNullExpressionValue(iacUpsellStore, "get(...)");
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        TransferAccountStore transferAccountStore = this.transferAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(transferAccountStore, "get(...)");
        TransferV2LimitsStore transferV2LimitsStore = this.transferLimitsStore.get();
        Intrinsics.checkNotNullExpressionValue(transferV2LimitsStore, "get(...)");
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(transfersBonfireApi, "get(...)");
        SuggestedAmountsStore suggestedAmountsStore = this.suggestedAmountsStore.get();
        Intrinsics.checkNotNullExpressionValue(suggestedAmountsStore, "get(...)");
        RetirementTransfersApi retirementTransfersApi = this.retirementTransfersApi.get();
        Intrinsics.checkNotNullExpressionValue(retirementTransfersApi, "get(...)");
        CreateTransferV2AdditionalDataClient createTransferV2AdditionalDataClient = this.additionalDataClient.get();
        Intrinsics.checkNotNullExpressionValue(createTransferV2AdditionalDataClient, "get(...)");
        TraderPortfolioStore traderPortfolioStore = this.portfolioStore.get();
        Intrinsics.checkNotNullExpressionValue(traderPortfolioStore, "get(...)");
        TransferFactoryForV2 transferFactoryForV2 = this.transferFactory.get();
        Intrinsics.checkNotNullExpressionValue(transferFactoryForV2, "get(...)");
        TransferFactoryForV2 transferFactoryForV22 = transferFactoryForV2;
        TransferValidator transferValidator = this.transferValidator.get();
        Intrinsics.checkNotNullExpressionValue(transferValidator, "get(...)");
        TransferValidator transferValidator2 = transferValidator;
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        EventLogger eventLogger2 = eventLogger;
        DepositIncentiveStore depositIncentiveStore = this.depositIncentiveStore.get();
        Intrinsics.checkNotNullExpressionValue(depositIncentiveStore, "get(...)");
        DepositIncentiveStore depositIncentiveStore2 = depositIncentiveStore;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        DuxoBundle duxoBundle2 = duxoBundle;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        SavedStateHandle savedStateHandle2 = savedStateHandle;
        MicrogramManager microgramManager = this.microgramManager.get();
        Intrinsics.checkNotNullExpressionValue(microgramManager, "get(...)");
        MicrogramManager microgramManager2 = microgramManager;
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        LazyMoshi lazyMoshi2 = lazyMoshi;
        RothConversionStore rothConversionStore = this.rothConversionStore.get();
        Intrinsics.checkNotNullExpressionValue(rothConversionStore, "get(...)");
        RothConversionStore rothConversionStore2 = rothConversionStore;
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        Navigator navigator2 = navigator;
        Context context = this.context.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        return companion.newInstance(stringToLongMapPreference, accountProvider, balancesStore, experimentsStore, iacUpsellStore, traderMarketHoursManager, transferAccountStore, transferV2LimitsStore, transfersBonfireApi, suggestedAmountsStore, retirementTransfersApi, createTransferV2AdditionalDataClient, traderPortfolioStore, transferFactoryForV22, transferValidator2, eventLogger2, depositIncentiveStore2, duxoBundle2, savedStateHandle2, microgramManager2, lazyMoshi2, rothConversionStore2, navigator2, context);
    }

    /* compiled from: CreateTransferV2Duxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JØ\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00072\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00072\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00072\f\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00072\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00072\f\u00105\u001a\b\u0012\u0004\u0012\u0002060\u0007H\u0007JÈ\u0001\u00107\u001a\u0002082\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0007¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Duxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Duxo_Factory;", "paymentMethodLastUsagesPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringToLongMapPreference;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "iacUpsellStore", "Lcom/robinhood/shared/data/store/iac/IacUpsellStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "transferLimitsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferV2LimitsStore;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "suggestedAmountsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/SuggestedAmountsStore;", "retirementTransfersApi", "Lcom/robinhood/android/api/retirement/transfers/RetirementTransfersApi;", "additionalDataClient", "Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "transferFactory", "Lcom/robinhood/android/lib/transfers/TransferFactoryForV2;", "transferValidator", "Lcom/robinhood/android/transfers/lib/validation/TransferValidator;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "depositIncentiveStore", "Lcom/robinhood/android/engagement/depositincentive/DepositIncentiveStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "rothConversionStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RothConversionStore;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "newInstance", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Duxo;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CreateTransferV2Duxo_Factory create(Provider<StringToLongMapPreference> paymentMethodLastUsagesPref, Provider<AccountProvider> accountProvider, Provider<BalancesStore> balancesStore, Provider<ExperimentsStore> experimentsStore, Provider<IacUpsellStore> iacUpsellStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<TransferAccountStore> transferAccountStore, Provider<TransferV2LimitsStore> transferLimitsStore, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<SuggestedAmountsStore> suggestedAmountsStore, Provider<RetirementTransfersApi> retirementTransfersApi, Provider<CreateTransferV2AdditionalDataClient> additionalDataClient, Provider<TraderPortfolioStore> portfolioStore, Provider<TransferFactoryForV2> transferFactory, Provider<TransferValidator> transferValidator, Provider<EventLogger> eventLogger, Provider<DepositIncentiveStore> depositIncentiveStore, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<MicrogramManager> microgramManager, Provider<LazyMoshi> moshi, Provider<RothConversionStore> rothConversionStore, Provider<Navigator> navigator, Provider<Context> context) {
            Intrinsics.checkNotNullParameter(paymentMethodLastUsagesPref, "paymentMethodLastUsagesPref");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(iacUpsellStore, "iacUpsellStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(transferLimitsStore, "transferLimitsStore");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(suggestedAmountsStore, "suggestedAmountsStore");
            Intrinsics.checkNotNullParameter(retirementTransfersApi, "retirementTransfersApi");
            Intrinsics.checkNotNullParameter(additionalDataClient, "additionalDataClient");
            Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
            Intrinsics.checkNotNullParameter(transferFactory, "transferFactory");
            Intrinsics.checkNotNullParameter(transferValidator, "transferValidator");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(depositIncentiveStore, "depositIncentiveStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(rothConversionStore, "rothConversionStore");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(context, "context");
            return new CreateTransferV2Duxo_Factory(paymentMethodLastUsagesPref, accountProvider, balancesStore, experimentsStore, iacUpsellStore, marketHoursManager, transferAccountStore, transferLimitsStore, transfersBonfireApi, suggestedAmountsStore, retirementTransfersApi, additionalDataClient, portfolioStore, transferFactory, transferValidator, eventLogger, depositIncentiveStore, duxoBundle, savedStateHandle, microgramManager, moshi, rothConversionStore, navigator, context);
        }

        @JvmStatic
        public final CreateTransferV2Duxo newInstance(StringToLongMapPreference paymentMethodLastUsagesPref, AccountProvider accountProvider, BalancesStore balancesStore, ExperimentsStore experimentsStore, IacUpsellStore iacUpsellStore, TraderMarketHoursManager marketHoursManager, TransferAccountStore transferAccountStore, TransferV2LimitsStore transferLimitsStore, TransfersBonfireApi transfersBonfireApi, SuggestedAmountsStore suggestedAmountsStore, RetirementTransfersApi retirementTransfersApi, CreateTransferV2AdditionalDataClient additionalDataClient, TraderPortfolioStore portfolioStore, TransferFactoryForV2 transferFactory, TransferValidator transferValidator, EventLogger eventLogger, DepositIncentiveStore depositIncentiveStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, MicrogramManager microgramManager, LazyMoshi moshi, RothConversionStore rothConversionStore, Navigator navigator, Context context) {
            Intrinsics.checkNotNullParameter(paymentMethodLastUsagesPref, "paymentMethodLastUsagesPref");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(iacUpsellStore, "iacUpsellStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(transferLimitsStore, "transferLimitsStore");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(suggestedAmountsStore, "suggestedAmountsStore");
            Intrinsics.checkNotNullParameter(retirementTransfersApi, "retirementTransfersApi");
            Intrinsics.checkNotNullParameter(additionalDataClient, "additionalDataClient");
            Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
            Intrinsics.checkNotNullParameter(transferFactory, "transferFactory");
            Intrinsics.checkNotNullParameter(transferValidator, "transferValidator");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(depositIncentiveStore, "depositIncentiveStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(rothConversionStore, "rothConversionStore");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(context, "context");
            return new CreateTransferV2Duxo(paymentMethodLastUsagesPref, accountProvider, balancesStore, experimentsStore, iacUpsellStore, marketHoursManager, transferAccountStore, transferLimitsStore, transfersBonfireApi, suggestedAmountsStore, retirementTransfersApi, additionalDataClient, portfolioStore, transferFactory, transferValidator, eventLogger, depositIncentiveStore, duxoBundle, savedStateHandle, microgramManager, moshi, rothConversionStore, navigator, context);
        }
    }
}
