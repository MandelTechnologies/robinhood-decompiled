package com.robinhood.android.common.recurring.trade;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderActionType;
import com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment;
import com.robinhood.android.common.recurring.trade.RecurringOrderFragment;
import com.robinhood.android.common.recurring.trade.RecurringOrderParentFragment;
import com.robinhood.android.common.recurring.trade.confirmation.RecurringBrokerageCashTransferConfirmationFragment;
import com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationFragment;
import com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationViewState;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.trade.BaseOrderParentFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.fragment.ReplaceFragmentBuilder;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.recurring.contracts.RecurringOrderConfiguration;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.InvestmentScheduleAmount;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.shared.i18n.car.CarSuitabilityType;
import com.robinhood.shared.recurring.contracts.InvestmentScheduleSettingsFragmentKey;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.reactivex.Observable;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import rosetta.account.BrokerageAccountType;

/* compiled from: RecurringOrderParentFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 R2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0003PQRB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u00107\u001a\u000208H\u0016J\u0012\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0012\u0010=\u001a\u00020:2\b\u0010,\u001a\u0004\u0018\u00010>H\u0016J\u0010\u0010?\u001a\u00020:2\u0006\u0010@\u001a\u00020\u001cH\u0016J\u0010\u0010A\u001a\u00020:2\u0006\u0010@\u001a\u00020\u001cH\u0016J\u0010\u0010B\u001a\u00020:2\u0006\u0010C\u001a\u000204H\u0016J\u0010\u0010D\u001a\u00020:2\u0006\u0010,\u001a\u00020+H\u0016J.\u0010E\u001a\u00020:2\b\u0010,\u001a\u0004\u0018\u00010F2\u0006\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010J2\b\u0010@\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010K\u001a\u00020:2\u0006\u0010L\u001a\u00020MH\u0016J\b\u0010N\u001a\u00020:H\u0016J\b\u0010O\u001a\u00020:H\u0014R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u00028\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u001cX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020'X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R/\u0010,\u001a\u0004\u0018\u00010+2\b\u0010*\u001a\u0004\u0018\u00010+8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00103\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006S"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/RecurringOrderParentFragment;", "Lcom/robinhood/android/lib/trade/BaseOrderParentFragment;", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderManager;", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderFragment$Callbacks;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsFragment$Callbacks;", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationFragment$Callbacks;", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringBrokerageCashTransferConfirmationFragment$Callbacks;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderParentFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/recurring/trade/RecurringOrderParentFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "orderManager", "getOrderManager", "()Lcom/robinhood/android/common/recurring/trade/RecurringOrderManager;", "setOrderManager", "(Lcom/robinhood/android/common/recurring/trade/RecurringOrderManager;)V", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "accountNumberObs", "Lio/reactivex/Observable;", "", "getAccountNumberObs", "()Lio/reactivex/Observable;", "carSuitabilityType", "Lcom/robinhood/shared/i18n/car/CarSuitabilityType;", "getCarSuitabilityType", "()Lcom/robinhood/shared/i18n/car/CarSuitabilityType;", "analyticsErrorString", "getAnalyticsErrorString", "()Ljava/lang/String;", "side", "Lcom/robinhood/models/db/OrderSide;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "<set-?>", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "amount", "getAmount", "()Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "setAmount", "(Lcom/robinhood/recurring/models/InvestmentScheduleAmount;)V", "amount$delegate", "Lkotlin/properties/ReadWriteProperty;", "submittingConfirmationCombined", "", "getSubmittingConfirmationCombined", "()Z", "createOrderConfirmationFragment", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationFragment;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "launchSourceOfFundsSelection", "Lcom/robinhood/models/util/Money;", "startOrderConfigurationSelection", "accountNumber", "editRecurringOrder", "onReviewingStateChanged", "isReviewing", "onAmountChanged", "onSourceOfFundsSelectionComplete", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount$Dollar;", "sourceOfFunds", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "achRelationshipId", "Ljava/util/UUID;", "onSecondaryButtonClicked", "secondaryButtonState", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationViewState$SecondaryButtonState;", "onOrderCompleted", "showOrderConfirmationFragment", "Callbacks", "Args", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringOrderParentFragment extends BaseOrderParentFragment<RecurringOrderManager> implements RecurringOrderFragment.Callbacks, RecurringOrderSourceOfFundsFragment.Callbacks, RecurringOrderConfirmationFragment.Callbacks, RecurringBrokerageCashTransferConfirmationFragment.Callbacks {
    public AccountProvider accountProvider;
    public RecurringOrderManager orderManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecurringOrderParentFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/recurring/trade/RecurringOrderParentFragment$Callbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RecurringOrderParentFragment.class, "amount", "getAmount()Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderParentFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof RecurringOrderParentFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final String analyticsErrorString = AnalyticsStrings.ERROR_PLACE_ORDER;
    private final OrderSide side = OrderSide.BUY;

    /* renamed from: amount$delegate, reason: from kotlin metadata */
    private final Interfaces3 amount = (Interfaces3) BindSavedState2.savedParcelable(this).provideDelegate(this, $$delegatedProperties[1]);

    /* compiled from: RecurringOrderParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/RecurringOrderParentFragment$Callbacks;", "", "startOrderConfigurationSelection", "", "accountNumber", "", "editRecurringOrder", "setRecurringOrderConfiguration", "orderConfiguration", "Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;", "onReviewingStateChanged", "isReviewing", "", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void editRecurringOrder(String accountNumber);

        void onReviewingStateChanged(boolean isReviewing);

        void setRecurringOrderConfiguration(RecurringOrderConfiguration orderConfiguration);

        void startOrderConfigurationSelection(String accountNumber);
    }

    /* compiled from: RecurringOrderParentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
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
        }
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public RecurringOrderManager getOrderManager() {
        RecurringOrderManager recurringOrderManager = this.orderManager;
        if (recurringOrderManager != null) {
            return recurringOrderManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderManager");
        return null;
    }

    public void setOrderManager(RecurringOrderManager recurringOrderManager) {
        Intrinsics.checkNotNullParameter(recurringOrderManager, "<set-?>");
        this.orderManager = recurringOrderManager;
    }

    public final AccountProvider getAccountProvider() {
        AccountProvider accountProvider = this.accountProvider;
        if (accountProvider != null) {
            return accountProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountProvider");
        return null;
    }

    public final void setAccountProvider(AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "<set-?>");
        this.accountProvider = accountProvider;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public Observable<String> getAccountNumberObs() {
        return getAccountProvider().streamIndividualAccountNumber();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public CarSuitabilityType getCarSuitabilityType() {
        List listEmptyList;
        Companion companion = INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$1[((Args) companion.getArgs((Fragment) this)).getInvestmentTarget().getTargetType().ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i == 2 || i == 3 || i == 4) {
                return CarSuitabilityType.Unsupported.INSTANCE;
            }
            throw new NoWhenBranchMatchedException();
        }
        UUID instrumentId = ((Args) companion.getArgs((Fragment) this)).getInvestmentTarget().getInstrumentId();
        if (instrumentId == null || (listEmptyList = CollectionsKt.listOf(instrumentId)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[getSide().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        return new CarSuitabilityType.Equity(listEmptyList, z);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public String getAnalyticsErrorString() {
        return this.analyticsErrorString;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public OrderSide getSide() {
        return this.side;
    }

    private final InvestmentScheduleAmount getAmount() {
        return (InvestmentScheduleAmount) this.amount.getValue(this, $$delegatedProperties[1]);
    }

    private final void setAmount(InvestmentScheduleAmount investmentScheduleAmount) {
        this.amount.setValue(this, $$delegatedProperties[1], investmentScheduleAmount);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public boolean getSubmittingConfirmationCombined() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getInvestmentTarget().getTargetType() != ApiAssetType.BROKERAGE_CASH;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public RecurringOrderConfirmationFragment createOrderConfirmationFragment() {
        RecurringOrderConfirmationFragment.Companion companion = RecurringOrderConfirmationFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        return companion.newInstance(((Args) companion2.getArgs((Fragment) this)).getInvestmentTarget().isCrypto(), ((Args) companion2.getArgs((Fragment) this)).getInvestmentTarget().isBrokerageCashTransfer());
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            RecurringOrderFragment.Companion companion = RecurringOrderFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            setFragment(i, companion.newInstance((Parcelable) new RecurringOrderArgs(((Args) companion2.getArgs((Fragment) this)).getInvestmentTarget(), ((Args) companion2.getArgs((Fragment) this)).getOrderConfiguration(), ((Args) companion2.getArgs((Fragment) this)).getCrashlyticsLoggingEntryPoint())));
        }
    }

    @Override // com.robinhood.android.common.recurring.trade.RecurringOrderFragment.Callbacks
    public void launchSourceOfFundsSelection(Money amount) {
        RecurringOrderSourceOfFundsFragment.Companion companion = RecurringOrderSourceOfFundsFragment.INSTANCE;
        RecurringOrderActionType.Create create = RecurringOrderActionType.Create.INSTANCE;
        InvestmentScheduleAmount.Dollar dollar = amount != null ? new InvestmentScheduleAmount.Dollar(amount) : null;
        Companion companion2 = INSTANCE;
        replaceFragment(companion.newInstance((Parcelable) new RecurringOrderSourceOfFundsFragment.Args(create, ((Args) companion2.getArgs((Fragment) this)).getInvestmentTarget(), dollar, null, false, ((Args) companion2.getArgs((Fragment) this)).getOrderConfiguration().getAccountNumber(), 24, null)));
    }

    @Override // com.robinhood.android.common.recurring.trade.RecurringOrderFragment.Callbacks
    public void startOrderConfigurationSelection(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        getCallbacks().startOrderConfigurationSelection(accountNumber);
    }

    @Override // com.robinhood.android.common.recurring.trade.RecurringOrderFragment.Callbacks
    public void editRecurringOrder(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        getCallbacks().editRecurringOrder(accountNumber);
    }

    @Override // com.robinhood.android.common.recurring.trade.RecurringOrderFragment.Callbacks
    public void onReviewingStateChanged(boolean isReviewing) {
        getCallbacks().onReviewingStateChanged(isReviewing);
    }

    @Override // com.robinhood.android.common.recurring.trade.RecurringOrderFragment.Callbacks
    public void onAmountChanged(InvestmentScheduleAmount amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        setAmount(amount);
    }

    @Override // com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment.Callbacks
    public void onSourceOfFundsSelectionComplete(InvestmentScheduleAmount.Dollar amount, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID achRelationshipId, String accountNumber) {
        Intrinsics.checkNotNullParameter(sourceOfFunds, "sourceOfFunds");
        RecurringOrderConfiguration orderConfiguration = ((Args) INSTANCE.getArgs((Fragment) this)).getOrderConfiguration();
        getCallbacks().setRecurringOrderConfiguration(new RecurringOrderConfiguration(amount != null ? amount.getDollarAmount() : null, null, false, orderConfiguration.getFrequency(), orderConfiguration.getStartDate(), sourceOfFunds, achRelationshipId, null, null, false, false, orderConfiguration.getPaycheckRecurringBrokerageCashStatus(), false, null, accountNumber, 14086, null));
    }

    @Override // com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationFragment.Callbacks, com.robinhood.android.common.recurring.trade.confirmation.RecurringBrokerageCashTransferConfirmationFragment.Callbacks
    public void onSecondaryButtonClicked(RecurringOrderConfirmationViewState.SecondaryButtonState secondaryButtonState) {
        Intrinsics.checkNotNullParameter(secondaryButtonState, "secondaryButtonState");
        if (secondaryButtonState instanceof RecurringOrderConfirmationViewState.SecondaryButtonState.SetUpAnotherPaycheckRecurringInvestment) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new HostIntentKey.ShowFragmentInStandaloneRdsActivity(((RecurringOrderConfirmationViewState.SecondaryButtonState.SetUpAnotherPaycheckRecurringInvestment) secondaryButtonState).getFragmentKey(), false, false, false, false, false, false, 118, null), null, false, null, null, 60, null);
            onOrderCompleted();
            return;
        }
        if (!(secondaryButtonState instanceof RecurringOrderConfirmationViewState.SecondaryButtonState.ViewRecurringInvestment)) {
            throw new NoWhenBranchMatchedException();
        }
        Navigator navigator2 = getNavigator();
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator2, contextRequireContext2, new InvestmentScheduleSettingsFragmentKey(((RecurringOrderConfirmationViewState.SecondaryButtonState.ViewRecurringInvestment) secondaryButtonState).getPaycheckRecurringInvestmentId(), false, 2, null), false, false, false, false, null, false, null, null, 992, null);
        onOrderCompleted();
    }

    @Override // com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationFragment.Callbacks, com.robinhood.android.common.recurring.trade.confirmation.RecurringBrokerageCashTransferConfirmationFragment.Callbacks
    public void onOrderCompleted() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        fragmentActivityRequireActivity.setResult(-1);
        fragmentActivityRequireActivity.finish();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    protected void showOrderConfirmationFragment() {
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).getInvestmentTarget().getTargetType() == ApiAssetType.BROKERAGE_CASH) {
            RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus = ((Args) companion.getArgs((Fragment) this)).getOrderConfiguration().getPaycheckRecurringBrokerageCashStatus();
            if (paycheckRecurringBrokerageCashStatus == null) {
                paycheckRecurringBrokerageCashStatus = new RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus(false, false);
            }
            RecurringBrokerageCashTransferConfirmationFragment.Companion companion2 = RecurringBrokerageCashTransferConfirmationFragment.INSTANCE;
            InvestmentScheduleAmount amount = getAmount();
            Intrinsics.checkNotNull(amount);
            BrokerageAccountType accountType = ((Args) companion.getArgs((Fragment) this)).getOrderConfiguration().getAccountType();
            Intrinsics.checkNotNull(accountType);
            new ReplaceFragmentBuilder((RecurringBrokerageCashTransferConfirmationFragment) companion2.newInstance((Parcelable) new RecurringBrokerageCashTransferConfirmationFragment.Args(amount, accountType, paycheckRecurringBrokerageCashStatus))).setUseDefaultAnimation(false).buildAndExecute(this);
            onShowOrderConfirmation();
            return;
        }
        super.showOrderConfirmationFragment();
    }

    /* compiled from: RecurringOrderParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/RecurringOrderParentFragment$Args;", "Landroid/os/Parcelable;", "investmentTarget", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "orderConfiguration", "Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;", "crashlyticsLoggingEntryPoint", "", "<init>", "(Lcom/robinhood/recurring/models/db/InvestmentTarget;Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;Ljava/lang/String;)V", "getInvestmentTarget", "()Lcom/robinhood/recurring/models/db/InvestmentTarget;", "getOrderConfiguration", "()Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;", "getCrashlyticsLoggingEntryPoint", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String crashlyticsLoggingEntryPoint;
        private final InvestmentTarget investmentTarget;
        private final RecurringOrderConfiguration orderConfiguration;

        /* compiled from: RecurringOrderParentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((InvestmentTarget) parcel.readParcelable(Args.class.getClassLoader()), (RecurringOrderConfiguration) parcel.readParcelable(Args.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, InvestmentTarget investmentTarget, RecurringOrderConfiguration recurringOrderConfiguration, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                investmentTarget = args.investmentTarget;
            }
            if ((i & 2) != 0) {
                recurringOrderConfiguration = args.orderConfiguration;
            }
            if ((i & 4) != 0) {
                str = args.crashlyticsLoggingEntryPoint;
            }
            return args.copy(investmentTarget, recurringOrderConfiguration, str);
        }

        /* renamed from: component1, reason: from getter */
        public final InvestmentTarget getInvestmentTarget() {
            return this.investmentTarget;
        }

        /* renamed from: component2, reason: from getter */
        public final RecurringOrderConfiguration getOrderConfiguration() {
            return this.orderConfiguration;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCrashlyticsLoggingEntryPoint() {
            return this.crashlyticsLoggingEntryPoint;
        }

        public final Args copy(InvestmentTarget investmentTarget, RecurringOrderConfiguration orderConfiguration, String crashlyticsLoggingEntryPoint) {
            Intrinsics.checkNotNullParameter(investmentTarget, "investmentTarget");
            Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
            Intrinsics.checkNotNullParameter(crashlyticsLoggingEntryPoint, "crashlyticsLoggingEntryPoint");
            return new Args(investmentTarget, orderConfiguration, crashlyticsLoggingEntryPoint);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.investmentTarget, args.investmentTarget) && Intrinsics.areEqual(this.orderConfiguration, args.orderConfiguration) && Intrinsics.areEqual(this.crashlyticsLoggingEntryPoint, args.crashlyticsLoggingEntryPoint);
        }

        public int hashCode() {
            return (((this.investmentTarget.hashCode() * 31) + this.orderConfiguration.hashCode()) * 31) + this.crashlyticsLoggingEntryPoint.hashCode();
        }

        public String toString() {
            return "Args(investmentTarget=" + this.investmentTarget + ", orderConfiguration=" + this.orderConfiguration + ", crashlyticsLoggingEntryPoint=" + this.crashlyticsLoggingEntryPoint + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.investmentTarget, flags);
            dest.writeParcelable(this.orderConfiguration, flags);
            dest.writeString(this.crashlyticsLoggingEntryPoint);
        }

        public Args(InvestmentTarget investmentTarget, RecurringOrderConfiguration orderConfiguration, String crashlyticsLoggingEntryPoint) {
            Intrinsics.checkNotNullParameter(investmentTarget, "investmentTarget");
            Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
            Intrinsics.checkNotNullParameter(crashlyticsLoggingEntryPoint, "crashlyticsLoggingEntryPoint");
            this.investmentTarget = investmentTarget;
            this.orderConfiguration = orderConfiguration;
            this.crashlyticsLoggingEntryPoint = crashlyticsLoggingEntryPoint;
        }

        public final InvestmentTarget getInvestmentTarget() {
            return this.investmentTarget;
        }

        public final RecurringOrderConfiguration getOrderConfiguration() {
            return this.orderConfiguration;
        }

        public final String getCrashlyticsLoggingEntryPoint() {
            return this.crashlyticsLoggingEntryPoint;
        }
    }

    /* compiled from: RecurringOrderParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/RecurringOrderParentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderParentFragment;", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderParentFragment$Args;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecurringOrderParentFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecurringOrderParentFragment recurringOrderParentFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recurringOrderParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecurringOrderParentFragment newInstance(Args args) {
            return (RecurringOrderParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecurringOrderParentFragment recurringOrderParentFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recurringOrderParentFragment, args);
        }
    }
}
