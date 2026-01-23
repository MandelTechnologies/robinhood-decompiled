package com.robinhood.android.common.recurring.trade;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.recurring.trade.RecurringOrderDuxo;
import com.robinhood.android.common.recurring.trade.RecurringOrderViewState;
import com.robinhood.android.common.recurring.trade.validation.RecurringOrderContext;
import com.robinhood.android.common.recurring.trade.validation.RecurringOrderValidationFailureResolver;
import com.robinhood.android.common.recurring.trade.validation.RecurringOrderValidator;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.recurring.contracts.RecurringOrderConfiguration;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.BalancesStore;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CurrencyPairStore;
import com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.SweepsStatus;
import com.robinhood.librobinhood.data.store.SweepsStatusStore;
import com.robinhood.librobinhood.data.store.TraderDayTradeStore;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.ContributionLimitRemaining;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementContributionsCombinedSummaryStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.librobinhood.logging.RhyGlobalLoggingContext;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.crypto.p314db.CryptoBuyingPower;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.p320db.bonfire.DirectDepositRelationship;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.recurring.models.AmountType;
import com.robinhood.recurring.models.InvestmentScheduleAmount;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.money.Currencies;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: RecurringOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 X2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001XB±\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'\u0012\u0006\u0010(\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020+\u0012\u0006\u0010,\u001a\u00020-¢\u0006\u0004\b.\u0010/J\b\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020<H\u0016J\b\u0010>\u001a\u00020<H\u0002J\b\u0010?\u001a\u00020<H\u0002J\b\u0010@\u001a\u00020<H\u0002J\b\u0010A\u001a\u00020<H\u0002J\u0010\u0010B\u001a\u00020<2\b\u0010C\u001a\u0004\u0018\u00010DJ\u0010\u0010E\u001a\u00020<2\b\u0010F\u001a\u0004\u0018\u00010GJ\u000e\u0010H\u001a\u00020<2\u0006\u0010I\u001a\u00020JJ\u0010\u0010K\u001a\u00020<2\u0006\u0010L\u001a\u00020MH\u0002J\u0006\u0010N\u001a\u00020<J\u0006\u0010O\u001a\u00020<J\u000e\u0010P\u001a\u00020<2\u0006\u0010Q\u001a\u00020RJ\u0006\u0010S\u001a\u00020<J\b\u0010T\u001a\u00020<H\u0002J\u0010\u0010U\u001a\u00020<2\u0006\u0010V\u001a\u00020WH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\u00020-X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001a\u00102\u001a\u000203X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0014\u00108\u001a\b\u0012\u0004\u0012\u00020:09X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Y"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/RecurringOrderDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "unifiedBalancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "cryptoBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/CryptoBuyingPowerStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "marginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "dayTradeStore", "Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore;", "orderManager", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderManager;", "validator", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidator;", "sweepsStatusStore", "Lcom/robinhood/librobinhood/data/store/SweepsStatusStore;", "retirementContributionsCombinedSummaryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementContributionsCombinedSummaryStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "rhyGlobalLoggingContext", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;Lcom/robinhood/librobinhood/data/store/BalancesStore;Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;Lcom/robinhood/librobinhood/data/store/CryptoBuyingPowerStore;Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore;Lcom/robinhood/android/common/recurring/trade/RecurringOrderManager;Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidator;Lcom/robinhood/librobinhood/data/store/SweepsStatusStore;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementContributionsCombinedSummaryStore;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "investmentTarget", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "getInvestmentTarget", "()Lcom/robinhood/recurring/models/db/InvestmentTarget;", "setInvestmentTarget", "(Lcom/robinhood/recurring/models/db/InvestmentTarget;)V", "accountNumberFlow", "Lkotlinx/coroutines/flow/Flow;", "", "onResume", "", "onCreate", "loadInstrumentData", "loadCryptoData", "loadBrokerageCashData", "loadRetirementData", "setAmount", "amount", "Lcom/robinhood/models/util/Money;", "setPercentage", "percentage", "Ljava/math/BigDecimal;", "setRefId", "refId", "Ljava/util/UUID;", "setConfiguration", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;", "overrideBuyingPowerCheck", "validateAndReviewOrder", "setFormState", "formState", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderState;", "submit", "logOrderSuccess", "checkForInvalidRecurringOrderContextRequest", "recurringOrderContext", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderContext;", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringOrderDuxo extends OldBaseDuxo<RecurringOrderViewState> implements HasSavedState {
    private final Flow<String> accountNumberFlow;
    private final AccountProvider accountProvider;
    private final AchRelationshipStore achRelationshipStore;
    private final AnalyticsLogger analytics;
    private final CryptoAccountStore cryptoAccountStore;
    private final CryptoBuyingPowerStore cryptoBuyingPowerStore;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CurrencyPairStore currencyPairStore;
    private final TraderDayTradeStore dayTradeStore;
    private final DirectDepositRelationshipStore directDepositRelationshipStore;
    private final EventLogger eventLogger;
    private final InstrumentBuyingPowerStore instrumentBuyingPowerStore;
    private final InstrumentStore instrumentStore;
    public InvestmentTarget investmentTarget;
    private final LeveredMarginSettingsStore marginSettingsStore;
    private final RecurringOrderManager orderManager;
    private final RetirementContributionsCombinedSummaryStore retirementContributionsCombinedSummaryStore;
    private final SavedStateHandle savedStateHandle;
    private final SweepsStatusStore sweepsStatusStore;
    private final UnifiedAccountStore unifiedAccountStore;
    private final BalancesStore unifiedBalancesStore;
    private final RecurringOrderValidator validator;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecurringOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[AmountType.values().length];
            try {
                iArr[AmountType.DOLLAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AmountType.PERCENTAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiAssetType.values().length];
            try {
                iArr2[ApiAssetType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ApiAssetType.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiAssetType.BROKERAGE_CASH.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApiAssetType.TOKENIZED_STOCK.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ApiInvestmentSchedule.SourceOfFunds.values().length];
            try {
                iArr3[ApiInvestmentSchedule.SourceOfFunds.ACH_RELATIONSHIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ApiInvestmentSchedule.SourceOfFunds.DIRECT_DEPOSIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    public RecurringOrderDuxo(AccountProvider accountProvider, UnifiedAccountStore unifiedAccountStore, BalancesStore unifiedBalancesStore, AchRelationshipStore achRelationshipStore, DirectDepositRelationshipStore directDepositRelationshipStore, AnalyticsLogger analytics, EventLogger eventLogger, InstrumentStore instrumentStore, InstrumentBuyingPowerStore instrumentBuyingPowerStore, CurrencyPairStore currencyPairStore, CryptoBuyingPowerStore cryptoBuyingPowerStore, CryptoAccountStore cryptoAccountStore, LeveredMarginSettingsStore marginSettingsStore, TraderDayTradeStore dayTradeStore, RecurringOrderManager orderManager, RecurringOrderValidator validator, SweepsStatusStore sweepsStatusStore, RetirementContributionsCombinedSummaryStore retirementContributionsCombinedSummaryStore, CryptoExperimentsStore cryptoExperimentsStore, RhyGlobalLoggingContext rhyGlobalLoggingContext, SavedStateHandle savedStateHandle) {
        InvestmentScheduleAmount dollar;
        Flow<String> flowBuffer$default;
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(unifiedBalancesStore, "unifiedBalancesStore");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(cryptoBuyingPowerStore, "cryptoBuyingPowerStore");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
        Intrinsics.checkNotNullParameter(dayTradeStore, "dayTradeStore");
        Intrinsics.checkNotNullParameter(orderManager, "orderManager");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(sweepsStatusStore, "sweepsStatusStore");
        Intrinsics.checkNotNullParameter(retirementContributionsCombinedSummaryStore, "retirementContributionsCombinedSummaryStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "rhyGlobalLoggingContext");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$0[((RecurringOrderArgs) companion.getArgs(savedStateHandle)).getOrderConfiguration().getAmountType().ordinal()];
        if (i == 1) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            dollar = new InvestmentScheduleAmount.Dollar(Money3.toMoney(ZERO, Currencies.USD));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            BigDecimal ZERO2 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
            dollar = new InvestmentScheduleAmount.Percentage(ZERO2);
        }
        super(new RecurringOrderViewState(((RecurringOrderArgs) companion.getArgs(savedStateHandle)).getInvestmentTarget(), null, null, dollar, ((RecurringOrderArgs) companion.getArgs(savedStateHandle)).getOrderConfiguration().getAmount(), null, null, null, null, null, null, false, null, null, null, null, null, false, null, ((RecurringOrderArgs) companion.getArgs(savedStateHandle)).getOrderConfiguration().getAccountNumber(), null, RhyGlobalLoggingContext.rhyContext$default(rhyGlobalLoggingContext, RHYContext.ProductArea.CASH_ACCOUNTS, null, null, 6, null), false, false, 14155750, null), null, 2, null);
        this.accountProvider = accountProvider;
        this.unifiedAccountStore = unifiedAccountStore;
        this.unifiedBalancesStore = unifiedBalancesStore;
        this.achRelationshipStore = achRelationshipStore;
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.analytics = analytics;
        this.eventLogger = eventLogger;
        this.instrumentStore = instrumentStore;
        this.instrumentBuyingPowerStore = instrumentBuyingPowerStore;
        this.currencyPairStore = currencyPairStore;
        this.cryptoBuyingPowerStore = cryptoBuyingPowerStore;
        this.cryptoAccountStore = cryptoAccountStore;
        this.marginSettingsStore = marginSettingsStore;
        this.dayTradeStore = dayTradeStore;
        this.orderManager = orderManager;
        this.validator = validator;
        this.sweepsStatusStore = sweepsStatusStore;
        this.retirementContributionsCombinedSummaryStore = retirementContributionsCombinedSummaryStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.savedStateHandle = savedStateHandle;
        String accountNumber = ((RecurringOrderArgs) companion.getArgs((HasSavedState) this)).getOrderConfiguration().getAccountNumber();
        if (accountNumber == null) {
            flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(accountProvider.streamIndividualAccountNumber()), Integer.MAX_VALUE, null, 2, null);
        } else {
            flowBuffer$default = StateFlow4.MutableStateFlow(accountNumber);
        }
        this.accountNumberFlow = flowBuffer$default;
    }

    public final InvestmentTarget getInvestmentTarget() {
        InvestmentTarget investmentTarget = this.investmentTarget;
        if (investmentTarget != null) {
            return investmentTarget;
        }
        Intrinsics.throwUninitializedPropertyAccessException("investmentTarget");
        return null;
    }

    public final void setInvestmentTarget(InvestmentTarget investmentTarget) {
        Intrinsics.checkNotNullParameter(investmentTarget, "<set-?>");
        this.investmentTarget = investmentTarget;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        Companion companion = INSTANCE;
        setInvestmentTarget(((RecurringOrderArgs) companion.getArgs((HasSavedState) this)).getInvestmentTarget());
        ApiAssetType targetType = getInvestmentTarget().getTargetType();
        int[] iArr = WhenMappings.$EnumSwitchMapping$1;
        int i = iArr[targetType.ordinal()];
        if (i == 1 || i == 2) {
            if (getInvestmentTarget().getInstrumentId() == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            Unit unit = Unit.INSTANCE;
        }
        setConfiguration(((RecurringOrderArgs) companion.getArgs((HasSavedState) this)).getOrderConfiguration());
        applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderDuxo.onResume$lambda$1((RecurringOrderViewState) obj);
            }
        });
        IdlingResourceCounters2.setBusy(IdlingResourceType.RECURRING_ORDER_UNIFIED_ACCOUNT_LOADING, true);
        int i2 = iArr[getInvestmentTarget().getTargetType().ordinal()];
        if (i2 == 1) {
            loadInstrumentData();
        } else if (i2 == 2) {
            loadCryptoData();
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    throw new IllegalStateException("This flow doesn't support tokenized stocks");
                }
                throw new NoWhenBranchMatchedException();
            }
            loadBrokerageCashData();
        }
        loadRetirementData();
        LifecycleHost.DefaultImpls.bind$default(this, OrderSubmissionManager.orderStateChanges$default(this.orderManager, null, 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderDuxo.onResume$lambda$3(this.f$0, (OrderSubmissionManager.Result) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderViewState onResume$lambda$1(RecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.getInputFocusEvent().getConsumed() ? RecurringOrderViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, new UiEvent(Unit.INSTANCE), null, false, null, null, null, null, false, false, 16744447, null) : applyMutation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(RecurringOrderDuxo recurringOrderDuxo, OrderSubmissionManager.Result result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof OrderSubmissionManager.Result.Submitted) {
            recurringOrderDuxo.logOrderSuccess();
        }
        if (result.getFinished()) {
            recurringOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringOrderDuxo.onResume$lambda$3$lambda$2((RecurringOrderViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderViewState onResume$lambda$3$lambda$2(RecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, false, 16646143, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C117491(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C117502(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C117513(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C117524(null));
    }

    /* compiled from: RecurringOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$onCreate$1", m3645f = "RecurringOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$onCreate$1 */
    static final class C117491 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C117491(Continuation<? super C117491> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecurringOrderDuxo.this.new C117491(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C117491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoRecurringOrdersVTExperiment = RecurringOrderDuxo.this.cryptoExperimentsStore.streamCryptoRecurringOrdersVTExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(RecurringOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoRecurringOrdersVTExperiment, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: RecurringOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$onCreate$1$1", m3645f = "RecurringOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ RecurringOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RecurringOrderDuxo recurringOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = recurringOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final boolean z = this.Z$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$onCreate$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RecurringOrderDuxo.C117491.AnonymousClass1.invokeSuspend$lambda$0(z, (RecurringOrderViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final RecurringOrderViewState invokeSuspend$lambda$0(boolean z, RecurringOrderViewState recurringOrderViewState) {
                return RecurringOrderViewState.copy$default(recurringOrderViewState, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, z, false, 12582911, null);
            }
        }
    }

    /* compiled from: RecurringOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$onCreate$2", m3645f = "RecurringOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$onCreate$2 */
    static final class C117502 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C117502(Continuation<? super C117502> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecurringOrderDuxo.this.new C117502(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C117502) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoMibExperiment = RecurringOrderDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(RecurringOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoMibExperiment, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: RecurringOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isMibEnabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$onCreate$2$1", m3645f = "RecurringOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ RecurringOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RecurringOrderDuxo recurringOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = recurringOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final boolean z = this.Z$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$onCreate$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RecurringOrderDuxo.C117502.AnonymousClass1.invokeSuspend$lambda$0(z, (RecurringOrderViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final RecurringOrderViewState invokeSuspend$lambda$0(boolean z, RecurringOrderViewState recurringOrderViewState) {
                return RecurringOrderViewState.copy$default(recurringOrderViewState, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, z, 8388607, null);
            }
        }
    }

    /* compiled from: RecurringOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$onCreate$3", m3645f = "RecurringOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$onCreate$3 */
    static final class C117513 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C117513(Continuation<? super C117513> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecurringOrderDuxo.this.new C117513(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C117513) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(RecurringOrderDuxo.this.accountNumberFlow, new C11741xfdd27229(null, RecurringOrderDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(RecurringOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: RecurringOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$onCreate$3$2", m3645f = "RecurringOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$onCreate$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Optional<? extends Account>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RecurringOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(RecurringOrderDuxo recurringOrderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = recurringOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Optional<Account> optional, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Optional<? extends Account> optional, Continuation<? super Unit> continuation) {
                return invoke2((Optional<Account>) optional, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final Account account = (Account) ((Optional) this.L$0).component1();
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$onCreate$3$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RecurringOrderDuxo.C117513.AnonymousClass2.invokeSuspend$lambda$0(account, (RecurringOrderViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final RecurringOrderViewState invokeSuspend$lambda$0(Account account, RecurringOrderViewState recurringOrderViewState) {
                return RecurringOrderViewState.copy$default(recurringOrderViewState, null, null, null, null, null, null, null, null, account, null, null, false, null, null, null, null, null, false, null, null, null, null, false, false, 16776959, null);
            }
        }
    }

    /* compiled from: RecurringOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$onCreate$4", m3645f = "RecurringOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$onCreate$4 */
    static final class C117524 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C117524(Continuation<? super C117524> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecurringOrderDuxo.this.new C117524(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C117524) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RecurringOrderDuxo.this.unifiedAccountStore.refresh(false);
                Flow flowTransformLatest = FlowKt.transformLatest(RecurringOrderDuxo.this.accountNumberFlow, new C11742x54f06308(null, RecurringOrderDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(RecurringOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: RecurringOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$onCreate$4$2", m3645f = "RecurringOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$onCreate$4$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Optional<? extends UnifiedAccountV2>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RecurringOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(RecurringOrderDuxo recurringOrderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = recurringOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Optional<UnifiedAccountV2> optional, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Optional<? extends UnifiedAccountV2> optional, Continuation<? super Unit> continuation) {
                return invoke2((Optional<UnifiedAccountV2>) optional, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final UnifiedAccountV2 unifiedAccountV2 = (UnifiedAccountV2) ((Optional) this.L$0).component1();
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$onCreate$4$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RecurringOrderDuxo.C117524.AnonymousClass2.invokeSuspend$lambda$1(unifiedAccountV2, (RecurringOrderViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final RecurringOrderViewState invokeSuspend$lambda$1(UnifiedAccountV2 unifiedAccountV2, RecurringOrderViewState recurringOrderViewState) {
                RecurringOrderViewState recurringOrderViewStateCopy$default = RecurringOrderViewState.copy$default(recurringOrderViewState, null, null, null, null, null, null, null, null, null, unifiedAccountV2, null, false, null, null, null, null, null, false, null, null, null, null, false, false, 16776703, null);
                IdlingResourceCounters2.setBusy(IdlingResourceType.RECURRING_ORDER_UNIFIED_ACCOUNT_LOADING, false);
                return recurringOrderViewStateCopy$default;
            }
        }
    }

    private final void loadInstrumentData() {
        UUID instrumentId = getInvestmentTarget().getInstrumentId();
        if (instrumentId == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.instrumentStore.refresh(true, instrumentId);
        Observable<Instrument> observableDistinctUntilChanged = this.instrumentStore.getInstrument(instrumentId).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderDuxo.loadInstrumentData$lambda$5(this.f$0, (Instrument) obj);
            }
        });
        this.instrumentBuyingPowerStore.refreshIndividualAccount(true, instrumentId);
        LifecycleHost.DefaultImpls.bind$default(this, this.instrumentBuyingPowerStore.getStreamIndividualAccountBuyingPowerForInstrument().asObservable(instrumentId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderDuxo.loadInstrumentData$lambda$7(this.f$0, (InstrumentBuyingPower) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadInstrumentData$lambda$5(RecurringOrderDuxo recurringOrderDuxo, final Instrument instrument) {
        recurringOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderDuxo.loadInstrumentData$lambda$5$lambda$4(instrument, (RecurringOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderViewState loadInstrumentData$lambda$5$lambda$4(Instrument instrument, RecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        RecurringOrderViewState.InvestmentTargetData investmentTargetData = applyMutation.getInvestmentTargetData();
        Intrinsics.checkNotNull(investmentTargetData, "null cannot be cast to non-null type com.robinhood.android.common.recurring.trade.RecurringOrderViewState.InvestmentTargetData.Equity");
        return RecurringOrderViewState.copy$default(applyMutation, null, RecurringOrderViewState.InvestmentTargetData.Equity.copy$default((RecurringOrderViewState.InvestmentTargetData.Equity) investmentTargetData, instrument, null, 2, null), null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, false, 16777213, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadInstrumentData$lambda$7(RecurringOrderDuxo recurringOrderDuxo, final InstrumentBuyingPower instrumentBuyingPower) {
        Intrinsics.checkNotNullParameter(instrumentBuyingPower, "instrumentBuyingPower");
        recurringOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderDuxo.loadInstrumentData$lambda$7$lambda$6(instrumentBuyingPower, (RecurringOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderViewState loadInstrumentData$lambda$7$lambda$6(InstrumentBuyingPower instrumentBuyingPower, RecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        RecurringOrderViewState.InvestmentTargetData investmentTargetData = applyMutation.getInvestmentTargetData();
        Intrinsics.checkNotNull(investmentTargetData, "null cannot be cast to non-null type com.robinhood.android.common.recurring.trade.RecurringOrderViewState.InvestmentTargetData.Equity");
        return RecurringOrderViewState.copy$default(applyMutation, null, RecurringOrderViewState.InvestmentTargetData.Equity.copy$default((RecurringOrderViewState.InvestmentTargetData.Equity) investmentTargetData, null, instrumentBuyingPower, 1, null), null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, false, 16777213, null);
    }

    private final void loadCryptoData() {
        this.currencyPairStore.refreshAll(false);
        CurrencyPairStore currencyPairStore = this.currencyPairStore;
        UUID instrumentId = getInvestmentTarget().getInstrumentId();
        Intrinsics.checkNotNull(instrumentId);
        Observable<UiCurrencyPair> observableRefCount = currencyPairStore.streamCurrencyPair(instrumentId).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableRefCount, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderDuxo.loadCryptoData$lambda$9(this.f$0, (UiCurrencyPair) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C117432(observableRefCount, this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C117443(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C117454(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C117465(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C117476(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadCryptoData$lambda$9(RecurringOrderDuxo recurringOrderDuxo, final UiCurrencyPair uiCurrencyPair) {
        recurringOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderDuxo.loadCryptoData$lambda$9$lambda$8(uiCurrencyPair, (RecurringOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderViewState loadCryptoData$lambda$9$lambda$8(UiCurrencyPair uiCurrencyPair, RecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        RecurringOrderViewState.InvestmentTargetData investmentTargetData = applyMutation.getInvestmentTargetData();
        Intrinsics.checkNotNull(investmentTargetData, "null cannot be cast to non-null type com.robinhood.android.common.recurring.trade.RecurringOrderViewState.InvestmentTargetData.Crypto");
        return RecurringOrderViewState.copy$default(applyMutation, null, RecurringOrderViewState.InvestmentTargetData.Crypto.copy$default((RecurringOrderViewState.InvestmentTargetData.Crypto) investmentTargetData, uiCurrencyPair, null, null, null, null, null, 62, null), null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, false, 16777213, null);
    }

    /* compiled from: RecurringOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$loadCryptoData$2", m3645f = "RecurringOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$loadCryptoData$2 */
    static final class C117432 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Observable<UiCurrencyPair> $currencyPairObs;
        int label;
        final /* synthetic */ RecurringOrderDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C117432(Observable<UiCurrencyPair> observable, RecurringOrderDuxo recurringOrderDuxo, Continuation<? super C117432> continuation) {
            super(2, continuation);
            this.$currencyPairObs = observable;
            this.this$0 = recurringOrderDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C117432(this.$currencyPairObs, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C117432) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.combine(Context7.buffer$default(RxConvert.asFlow(this.$currencyPairObs), Integer.MAX_VALUE, null, 2, null), this.this$0.accountNumberFlow, AnonymousClass3.INSTANCE), new C11736x9dd87874(null, this.this$0));
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass5, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: RecurringOrderDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$loadCryptoData$2$3, reason: invalid class name */
        /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<UiCurrencyPair, String, Continuation<? super Tuples2<? extends UiCurrencyPair, ? extends String>>, Object>, ContinuationImpl6 {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            AnonymousClass3() {
                super(3, Tuples2.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(UiCurrencyPair uiCurrencyPair, String str, Continuation<? super Tuples2<UiCurrencyPair, String>> continuation) {
                return C117432.invokeSuspend$lambda$0(uiCurrencyPair, str, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(UiCurrencyPair uiCurrencyPair, String str, Continuation<? super Tuples2<? extends UiCurrencyPair, ? extends String>> continuation) {
                return invoke2(uiCurrencyPair, str, (Continuation<? super Tuples2<UiCurrencyPair, String>>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(UiCurrencyPair uiCurrencyPair, String str, Continuation continuation) {
            return new Tuples2(uiCurrencyPair, str);
        }

        /* compiled from: RecurringOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "cryptoBuyingPower", "Lcom/robinhood/models/crypto/db/CryptoBuyingPower;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$loadCryptoData$2$5", m3645f = "RecurringOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$loadCryptoData$2$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CryptoBuyingPower, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RecurringOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(RecurringOrderDuxo recurringOrderDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = recurringOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, continuation);
                anonymousClass5.L$0 = obj;
                return anonymousClass5;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoBuyingPower cryptoBuyingPower, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(cryptoBuyingPower, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final CryptoBuyingPower cryptoBuyingPower = (CryptoBuyingPower) this.L$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$loadCryptoData$2$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RecurringOrderDuxo.C117432.AnonymousClass5.invokeSuspend$lambda$0(cryptoBuyingPower, (RecurringOrderViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final RecurringOrderViewState invokeSuspend$lambda$0(CryptoBuyingPower cryptoBuyingPower, RecurringOrderViewState recurringOrderViewState) {
                RecurringOrderViewState.InvestmentTargetData investmentTargetData = recurringOrderViewState.getInvestmentTargetData();
                Intrinsics.checkNotNull(investmentTargetData, "null cannot be cast to non-null type com.robinhood.android.common.recurring.trade.RecurringOrderViewState.InvestmentTargetData.Crypto");
                return RecurringOrderViewState.copy$default(recurringOrderViewState, null, RecurringOrderViewState.InvestmentTargetData.Crypto.copy$default((RecurringOrderViewState.InvestmentTargetData.Crypto) investmentTargetData, null, cryptoBuyingPower, null, null, null, null, 61, null), null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, false, 16777213, null);
            }
        }
    }

    /* compiled from: RecurringOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$loadCryptoData$3", m3645f = "RecurringOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$loadCryptoData$3 */
    static final class C117443 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C117443(Continuation<? super C117443> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecurringOrderDuxo.this.new C117443(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C117443) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(RecurringOrderDuxo.this.accountNumberFlow, new C11737xf4f66953(null, RecurringOrderDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(RecurringOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: RecurringOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "cryptoAccount", "Lcom/robinhood/models/crypto/db/CryptoAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$loadCryptoData$3$2", m3645f = "RecurringOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$loadCryptoData$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoAccount, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RecurringOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(RecurringOrderDuxo recurringOrderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = recurringOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoAccount cryptoAccount, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(cryptoAccount, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final CryptoAccount cryptoAccount = (CryptoAccount) this.L$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$loadCryptoData$3$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RecurringOrderDuxo.C117443.AnonymousClass2.invokeSuspend$lambda$0(cryptoAccount, (RecurringOrderViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final RecurringOrderViewState invokeSuspend$lambda$0(CryptoAccount cryptoAccount, RecurringOrderViewState recurringOrderViewState) {
                RecurringOrderViewState.InvestmentTargetData investmentTargetData = recurringOrderViewState.getInvestmentTargetData();
                Intrinsics.checkNotNull(investmentTargetData, "null cannot be cast to non-null type com.robinhood.android.common.recurring.trade.RecurringOrderViewState.InvestmentTargetData.Crypto");
                return RecurringOrderViewState.copy$default(recurringOrderViewState, null, RecurringOrderViewState.InvestmentTargetData.Crypto.copy$default((RecurringOrderViewState.InvestmentTargetData.Crypto) investmentTargetData, null, null, cryptoAccount, null, null, null, 59, null), null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, false, 16777213, null);
            }
        }
    }

    /* compiled from: RecurringOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$loadCryptoData$4", m3645f = "RecurringOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$loadCryptoData$4 */
    static final class C117454 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C117454(Continuation<? super C117454> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecurringOrderDuxo.this.new C117454(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C117454) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(RecurringOrderDuxo.this.accountNumberFlow, new C11738x4c145a32(null, RecurringOrderDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(RecurringOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: RecurringOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "unifiedBalances", "Lcom/robinhood/models/crypto/db/UnifiedBalances;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$loadCryptoData$4$2", m3645f = "RecurringOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$loadCryptoData$4$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<UnifiedBalances, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RecurringOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(RecurringOrderDuxo recurringOrderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = recurringOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UnifiedBalances unifiedBalances, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(unifiedBalances, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final UnifiedBalances unifiedBalances = (UnifiedBalances) this.L$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$loadCryptoData$4$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RecurringOrderDuxo.C117454.AnonymousClass2.invokeSuspend$lambda$0(unifiedBalances, (RecurringOrderViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final RecurringOrderViewState invokeSuspend$lambda$0(UnifiedBalances unifiedBalances, RecurringOrderViewState recurringOrderViewState) {
                RecurringOrderViewState.InvestmentTargetData investmentTargetData = recurringOrderViewState.getInvestmentTargetData();
                Intrinsics.checkNotNull(investmentTargetData, "null cannot be cast to non-null type com.robinhood.android.common.recurring.trade.RecurringOrderViewState.InvestmentTargetData.Crypto");
                return RecurringOrderViewState.copy$default(recurringOrderViewState, null, RecurringOrderViewState.InvestmentTargetData.Crypto.copy$default((RecurringOrderViewState.InvestmentTargetData.Crypto) investmentTargetData, null, null, null, unifiedBalances, null, null, 55, null), null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, false, 16777213, null);
            }
        }
    }

    /* compiled from: RecurringOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$loadCryptoData$5", m3645f = "RecurringOrderDuxo.kt", m3646l = {347}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$loadCryptoData$5 */
    static final class C117465 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C117465(Continuation<? super C117465> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecurringOrderDuxo.this.new C117465(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C117465) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(RecurringOrderDuxo.this.accountNumberFlow, new C11739xa3324b11(null, RecurringOrderDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(RecurringOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: RecurringOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "marginSettings", "Lcom/robinhood/android/lib/margin/db/models/MarginSettings;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$loadCryptoData$5$2", m3645f = "RecurringOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$loadCryptoData$5$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<MarginSettings, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RecurringOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(RecurringOrderDuxo recurringOrderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = recurringOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MarginSettings marginSettings, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(marginSettings, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final MarginSettings marginSettings = (MarginSettings) this.L$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$loadCryptoData$5$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RecurringOrderDuxo.C117465.AnonymousClass2.invokeSuspend$lambda$0(marginSettings, (RecurringOrderViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final RecurringOrderViewState invokeSuspend$lambda$0(MarginSettings marginSettings, RecurringOrderViewState recurringOrderViewState) {
                RecurringOrderViewState.InvestmentTargetData investmentTargetData = recurringOrderViewState.getInvestmentTargetData();
                Intrinsics.checkNotNull(investmentTargetData, "null cannot be cast to non-null type com.robinhood.android.common.recurring.trade.RecurringOrderViewState.InvestmentTargetData.Crypto");
                return RecurringOrderViewState.copy$default(recurringOrderViewState, null, RecurringOrderViewState.InvestmentTargetData.Crypto.copy$default((RecurringOrderViewState.InvestmentTargetData.Crypto) investmentTargetData, null, null, null, null, marginSettings, null, 47, null), null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, false, 16777213, null);
            }
        }
    }

    /* compiled from: RecurringOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$loadCryptoData$6", m3645f = "RecurringOrderDuxo.kt", m3646l = {365}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$loadCryptoData$6 */
    static final class C117476 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C117476(Continuation<? super C117476> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecurringOrderDuxo.this.new C117476(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C117476) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(RecurringOrderDuxo.this.accountNumberFlow, new C11740xfa503bf0(null, RecurringOrderDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(RecurringOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: RecurringOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "numDayTrades", "", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$loadCryptoData$6$2", m3645f = "RecurringOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$loadCryptoData$6$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Integer, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RecurringOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(RecurringOrderDuxo recurringOrderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = recurringOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Integer num, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(num, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final Integer num = (Integer) this.L$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$loadCryptoData$6$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RecurringOrderDuxo.C117476.AnonymousClass2.invokeSuspend$lambda$0(num, (RecurringOrderViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final RecurringOrderViewState invokeSuspend$lambda$0(Integer num, RecurringOrderViewState recurringOrderViewState) {
                RecurringOrderViewState.InvestmentTargetData investmentTargetData = recurringOrderViewState.getInvestmentTargetData();
                Intrinsics.checkNotNull(investmentTargetData, "null cannot be cast to non-null type com.robinhood.android.common.recurring.trade.RecurringOrderViewState.InvestmentTargetData.Crypto");
                return RecurringOrderViewState.copy$default(recurringOrderViewState, null, RecurringOrderViewState.InvestmentTargetData.Crypto.copy$default((RecurringOrderViewState.InvestmentTargetData.Crypto) investmentTargetData, null, null, null, null, null, num, 31, null), null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, false, 16777213, null);
            }
        }
    }

    private final void loadBrokerageCashData() {
        this.sweepsStatusStore.refresh(true);
        Observable<SweepsStatus> observableDistinctUntilChanged = this.sweepsStatusStore.stream().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderDuxo.loadBrokerageCashData$lambda$11(this.f$0, (SweepsStatus) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadBrokerageCashData$lambda$11(RecurringOrderDuxo recurringOrderDuxo, final SweepsStatus sweepsStatus) {
        recurringOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderDuxo.loadBrokerageCashData$lambda$11$lambda$10(sweepsStatus, (RecurringOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderViewState loadBrokerageCashData$lambda$11$lambda$10(SweepsStatus sweepsStatus, RecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, sweepsStatus, null, false, false, 15728639, null);
    }

    private final void loadRetirementData() {
        Observable<Optional<ContributionLimitRemaining>> observableDistinctUntilChanged = this.retirementContributionsCombinedSummaryStore.getContributionLimitRemaining().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.filterIsPresent(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderDuxo.loadRetirementData$lambda$13(this.f$0, (ContributionLimitRemaining) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadRetirementData$lambda$13(RecurringOrderDuxo recurringOrderDuxo, final ContributionLimitRemaining it) {
        Intrinsics.checkNotNullParameter(it, "it");
        recurringOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderDuxo.loadRetirementData$lambda$13$lambda$12(it, (RecurringOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderViewState loadRetirementData$lambda$13$lambda$12(ContributionLimitRemaining contributionLimitRemaining, RecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, contributionLimitRemaining, null, null, null, false, false, 16515071, null);
    }

    public final void setAmount(final Money amount) {
        applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderDuxo.setAmount$lambda$14(amount, (RecurringOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderViewState setAmount$lambda$14(Money money, RecurringOrderViewState applyMutation) {
        Money money2;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (money == null) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            money2 = Money3.toMoney(ZERO, Currencies.USD);
        } else {
            money2 = money;
        }
        return RecurringOrderViewState.copy$default(applyMutation, null, null, null, new InvestmentScheduleAmount.Dollar(money2), null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, false, 16777207, null);
    }

    public final void setPercentage(final BigDecimal percentage) {
        applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderDuxo.setPercentage$lambda$15(percentage, (RecurringOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderViewState setPercentage$lambda$15(BigDecimal bigDecimal, RecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        BigDecimal bigDecimal2 = bigDecimal == null ? BigDecimal.ZERO : bigDecimal;
        Intrinsics.checkNotNull(bigDecimal2);
        return RecurringOrderViewState.copy$default(applyMutation, null, null, null, new InvestmentScheduleAmount.Percentage(bigDecimal2), null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, false, 16777207, null);
    }

    public final void setRefId(final UUID refId) {
        Intrinsics.checkNotNullParameter(refId, "refId");
        applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderDuxo.setRefId$lambda$16(refId, (RecurringOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderViewState setRefId$lambda$16(UUID uuid, RecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, uuid, false, null, null, null, null, null, false, null, null, null, null, false, false, 16776191, null);
    }

    private final void setConfiguration(final RecurringOrderConfiguration configuration) {
        int i = WhenMappings.$EnumSwitchMapping$2[configuration.getSourceOfFunds().ordinal()];
        if (i == 1) {
            AchRelationshipStore achRelationshipStore = this.achRelationshipStore;
            UUID achRelationshipId = configuration.getAchRelationshipId();
            Intrinsics.checkNotNull(achRelationshipId);
            LifecycleHost.DefaultImpls.bind$default(this, achRelationshipStore.getAchRelationship(achRelationshipId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringOrderDuxo.setConfiguration$lambda$18(this.f$0, configuration, (AchRelationship) obj);
                }
            });
        } else if (i == 2) {
            applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringOrderDuxo.setConfiguration$lambda$19(configuration, (RecurringOrderViewState) obj);
                }
            });
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            UUID directDepositRelationshipId = configuration.getDirectDepositRelationshipId();
            if (directDepositRelationshipId != null) {
                LifecycleHost.DefaultImpls.bind$default(this, this.directDepositRelationshipStore.getDirectDepositRelationship(directDepositRelationshipId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RecurringOrderDuxo.setConfiguration$lambda$21(this.f$0, configuration, (DirectDepositRelationship) obj);
                    }
                });
            } else {
                applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RecurringOrderDuxo.setConfiguration$lambda$22(configuration, (RecurringOrderViewState) obj);
                    }
                });
            }
        }
        if (configuration.isBackupAchEnabled()) {
            UUID backupAchRelationshipId = configuration.getBackupAchRelationshipId();
            if (backupAchRelationshipId == null) {
                throw new IllegalStateException("ACH relationshipId must be non-null when backup is enabled");
            }
            LifecycleHost.DefaultImpls.bind$default(this, this.achRelationshipStore.getAchRelationship(backupAchRelationshipId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringOrderDuxo.setConfiguration$lambda$25(this.f$0, (AchRelationship) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setConfiguration$lambda$18(RecurringOrderDuxo recurringOrderDuxo, final RecurringOrderConfiguration recurringOrderConfiguration, final AchRelationship relationship) {
        Intrinsics.checkNotNullParameter(relationship, "relationship");
        recurringOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderDuxo.setConfiguration$lambda$18$lambda$17(recurringOrderConfiguration, relationship, (RecurringOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderViewState setConfiguration$lambda$18$lambda$17(RecurringOrderConfiguration recurringOrderConfiguration, AchRelationship achRelationship, RecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderViewState.copy$default(applyMutation, null, null, recurringOrderConfiguration, null, null, null, achRelationship, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, false, 16777147, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderViewState setConfiguration$lambda$19(RecurringOrderConfiguration recurringOrderConfiguration, RecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderViewState.copy$default(applyMutation, null, null, recurringOrderConfiguration, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, false, 16777147, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setConfiguration$lambda$21(RecurringOrderDuxo recurringOrderDuxo, final RecurringOrderConfiguration recurringOrderConfiguration, final DirectDepositRelationship directDepositRelationship) {
        Intrinsics.checkNotNullParameter(directDepositRelationship, "directDepositRelationship");
        recurringOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderDuxo.setConfiguration$lambda$21$lambda$20(recurringOrderConfiguration, directDepositRelationship, (RecurringOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderViewState setConfiguration$lambda$21$lambda$20(RecurringOrderConfiguration recurringOrderConfiguration, DirectDepositRelationship directDepositRelationship, RecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderViewState.copy$default(applyMutation, null, null, recurringOrderConfiguration, null, null, null, null, directDepositRelationship, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, false, 16777083, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderViewState setConfiguration$lambda$22(RecurringOrderConfiguration recurringOrderConfiguration, RecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderViewState.copy$default(applyMutation, null, null, recurringOrderConfiguration, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, false, 16777211, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setConfiguration$lambda$25(RecurringOrderDuxo recurringOrderDuxo, final AchRelationship relationship) {
        Intrinsics.checkNotNullParameter(relationship, "relationship");
        recurringOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderDuxo.setConfiguration$lambda$25$lambda$24(relationship, (RecurringOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderViewState setConfiguration$lambda$25$lambda$24(AchRelationship achRelationship, RecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, null, false, achRelationship, null, null, null, null, false, null, null, null, null, false, false, 16773119, null);
    }

    public final void overrideBuyingPowerCheck() {
        applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderDuxo.overrideBuyingPowerCheck$lambda$26((RecurringOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderViewState overrideBuyingPowerCheck$lambda$26(RecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, false, null, null, null, null, false, false, 16775167, null);
    }

    public final void validateAndReviewOrder() {
        mutate(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderDuxo.validateAndReviewOrder$lambda$27(this.f$0, (RecurringOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderViewState validateAndReviewOrder$lambda$27(RecurringOrderDuxo recurringOrderDuxo, RecurringOrderViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        RecurringOrderState formState = state.getFormState();
        RecurringOrderState recurringOrderState = RecurringOrderState.REVIEWING_TRANSFER;
        if (formState == recurringOrderState) {
            return RecurringOrderViewState.copy$default(state, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, new UiEvent(Unit.INSTANCE), false, null, null, null, null, false, false, 16711679, null);
        }
        RecurringOrderContext recurringOrderContext = state.getRecurringOrderContext();
        if (recurringOrderContext == null) {
            return state;
        }
        Validator.Failure<RecurringOrderContext, RecurringOrderValidationFailureResolver> failurePeek = recurringOrderDuxo.validator.validate(recurringOrderContext).peek();
        if (failurePeek == null) {
            if (!(state.getInvestmentTargetData() instanceof RecurringOrderViewState.InvestmentTargetData.BrokerageCash)) {
                recurringOrderState = RecurringOrderState.REVIEWING_ORDER;
            }
            return RecurringOrderViewState.copy$default(state, null, null, null, null, null, recurringOrderState, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, false, 16768991, null);
        }
        recurringOrderDuxo.analytics.logError(AnalyticsStrings.ERROR_ORDER_CHECK, failurePeek.getCheckIdentifier());
        return RecurringOrderViewState.copy$default(state, null, null, null, null, null, null, null, null, null, null, null, false, null, new UiEvent(failurePeek), null, null, null, false, null, null, null, null, false, false, 16769023, null);
    }

    public final void setFormState(final RecurringOrderState formState) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderDuxo.setFormState$lambda$28(formState, (RecurringOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderViewState setFormState$lambda$28(RecurringOrderState recurringOrderState, RecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderViewState.copy$default(applyMutation, null, null, null, null, null, recurringOrderState, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, false, 16777183, null);
    }

    public final void submit() {
        Observable<RecurringOrderViewState> observableTake = getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderDuxo.submit$lambda$31(this.f$0, (RecurringOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submit$lambda$31(RecurringOrderDuxo recurringOrderDuxo, RecurringOrderViewState recurringOrderViewState) {
        recurringOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderDuxo.submit$lambda$31$lambda$29((RecurringOrderViewState) obj);
            }
        });
        RecurringOrderContext recurringOrderContext = recurringOrderViewState.getRecurringOrderContext();
        if (recurringOrderContext != null) {
            recurringOrderDuxo.checkForInvalidRecurringOrderContextRequest(recurringOrderContext);
            OrderSubmissionManager.submit$default(recurringOrderDuxo.orderManager, recurringOrderContext.getApiRequest(), null, false, 6, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderViewState submit$lambda$31$lambda$29(RecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, true, null, null, null, null, false, false, 16646143, null);
    }

    private final void logOrderSuccess() {
        Observable<R> map = getStates().take(1L).map(new Function() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo.logOrderSuccess.1
            @Override // io.reactivex.functions.Function
            public final RecurringContext apply(RecurringOrderViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getLoggingContext();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderDuxo.logOrderSuccess$lambda$32(this.f$0, (RecurringContext) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logOrderSuccess$lambda$32(RecurringOrderDuxo recurringOrderDuxo, RecurringContext recurringContext) {
        EventLogger.DefaultImpls.logSwipe$default(recurringOrderDuxo.eventLogger, UserInteractionEventData.Action.EQUITY_ORDER_SUCCESS, new Screen(Screen.Name.EQUITY_ORDER_REVIEW, null, null, null, 14, null), new Component(Component.ComponentType.RECURRING_SUMMARY_DIALOG, null, null, 6, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, recurringContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
        return Unit.INSTANCE;
    }

    private final void checkForInvalidRecurringOrderContextRequest(RecurringOrderContext recurringOrderContext) {
        if (recurringOrderContext.getApiRequest().getFrequency() != ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK) {
            return;
        }
        BrokerageAccountType brokerageAccountType = recurringOrderContext.getAccount().getBrokerageAccountType();
        boolean z = brokerageAccountType == BrokerageAccountType.IRA_ROTH || brokerageAccountType == BrokerageAccountType.IRA_TRADITIONAL;
        boolean zAreEqual = Intrinsics.areEqual(recurringOrderContext.getAccount().getAccountNumber(), recurringOrderContext.getApiRequest().getAccount_number());
        Companion companion = INSTANCE;
        boolean zAreEqual2 = Intrinsics.areEqual(((RecurringOrderArgs) companion.getArgs((HasSavedState) this)).getOrderConfiguration().getAccountNumber(), recurringOrderContext.getApiRequest().getAccount_number());
        boolean z2 = recurringOrderContext.getApiRequest().getInvestment_asset().getAsset_type() == ApiAssetType.BROKERAGE_CASH;
        if (z && !z2) {
            CrashReporter.Companion companion2 = CrashReporter.INSTANCE;
            String serverValue = recurringOrderContext.getApiRequest().getInvestment_asset().getAsset_type().getServerValue();
            String symbol = recurringOrderContext.getInvestmentTargetData().getSymbol();
            boolean fromPaycheckRecurringInvocation = ((RecurringOrderArgs) companion.getArgs((HasSavedState) this)).getOrderConfiguration().getFromPaycheckRecurringInvocation();
            rosetta.account.BrokerageAccountType accountType = ((RecurringOrderArgs) companion.getArgs((HasSavedState) this)).getOrderConfiguration().getAccountType();
            Integer numValueOf = accountType != null ? Integer.valueOf(accountType.getValue()) : null;
            CrashReporter.DefaultImpls.reportNonFatal$default(companion2, new Throwable(StringsKt.trimIndent("\n                    Unsupported operation: cannot create a non cash recurring paycheck split into a retirement account.\n                    asset_type: " + serverValue + ",\n                    recurringOrderContext.investmentTargetData.symbol: \n                    " + symbol + ",\n                    orderConfiguration.fromPaycheckRecurringInvocation: \n                    " + fromPaycheckRecurringInvocation + ",\n                    orderConfiguration.accountType: \n                    " + numValueOf + ",\n                    crashlyticsLoggingEntryPoint: \n                    " + ((RecurringOrderArgs) companion.getArgs((HasSavedState) this)).getCrashlyticsLoggingEntryPoint() + ",\n                    ")), false, null, 6, null);
        }
        if (!zAreEqual) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new Throwable("Failed operation: account number in request mismatches account for split."), false, null, 6, null);
        }
        if (zAreEqual2) {
            return;
        }
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new Throwable("Failed operation: account number in request mismatches account in order config."), false, null, 6, null);
    }

    /* compiled from: RecurringOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/RecurringOrderDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderDuxo;", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderArgs;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RecurringOrderDuxo, RecurringOrderArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecurringOrderArgs getArgs(SavedStateHandle savedStateHandle) {
            return (RecurringOrderArgs) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecurringOrderArgs getArgs(RecurringOrderDuxo recurringOrderDuxo) {
            return (RecurringOrderArgs) DuxoCompanion.DefaultImpls.getArgs(this, recurringOrderDuxo);
        }
    }
}
