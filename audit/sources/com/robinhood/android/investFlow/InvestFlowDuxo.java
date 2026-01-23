package com.robinhood.android.investFlow;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.investflow.allocationprovider.InvestFlowAllocationProvider;
import com.robinhood.android.common.investflow.allocationprovider.InvestFlowAllocationProviderFactory;
import com.robinhood.android.common.recurring.utils.RecurringLoggingUtils;
import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.android.investFlow.InvestFlowDuxo;
import com.robinhood.android.investFlow.InvestFlowViewState;
import com.robinhood.android.investFlow.core.InvestFlowBasketItem;
import com.robinhood.android.investFlow.core.InvestFlowPaymentMethod;
import com.robinhood.android.investFlow.core.InvestFlowPaymentMethod2;
import com.robinhood.android.investFlow.utils.AssetAllocationUtils;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowIntentKey;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowStep;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.investflow.models.api.ApiAssetAllocation;
import com.robinhood.investflow.models.api.ApiInvestFlowNbboResponse;
import com.robinhood.investflow.models.api.ApiInvestFlowOrderCheckResponse;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.AccountFeature;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowStore;
import com.robinhood.models.api.ApiEquityOrderChecksResponse;
import com.robinhood.models.api.OrderRequest;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.EquityOrderChecksAlert2;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.VisibleEquityOrderChecksAlert;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentAsset;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentSchedule2;
import com.robinhood.rosetta.eventlogging.Basket;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.InvestFlowContext;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.extensions.SinglesKt;
import com.robinhood.utils.logging.CrashReporter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.Singles;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: InvestFlowDuxo.kt */
@Metadata(m3635d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 m2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001mBA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00140\u00192\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020 2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001eH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020 2\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J;\u00102\u001a\u00020 2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u00172\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u00101\u001a\u00020\u0017¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020 2\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b6\u00107J\u001d\u0010;\u001a\u00020 2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020'¢\u0006\u0004\b;\u0010<J-\u0010B\u001a\u00020 2\b\u0010>\u001a\u0004\u0018\u00010=2\b\u0010@\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010+¢\u0006\u0004\bB\u0010CJ!\u0010D\u001a\u00020 2\b\u0010>\u001a\u0004\u0018\u00010=2\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\bD\u0010EJ\u0015\u0010H\u001a\u00020 2\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bH\u0010IJ\u001b\u0010L\u001a\u00020 2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020J0\u0014¢\u0006\u0004\bL\u0010MJ\u0015\u0010O\u001a\u00020 2\u0006\u0010N\u001a\u00020\u001e¢\u0006\u0004\bO\u0010PJ\r\u0010Q\u001a\u00020 ¢\u0006\u0004\bQ\u0010RJ\u0015\u0010U\u001a\u00020 2\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bU\u0010VJ\u001b\u0010Y\u001a\u00020 2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020W0\u0014¢\u0006\u0004\bY\u0010MJ\u001b\u0010[\u001a\u00020 2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b[\u0010MJ9\u0010b\u001a\u00020 2\u0006\u0010]\u001a\u00020\\2\u0006\u0010^\u001a\u00020\u00152\u0006\u0010_\u001a\u00020\u00172\u0012\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020 0`¢\u0006\u0004\bb\u0010cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010gR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010hR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010iR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010j\u001a\u0004\bk\u0010l¨\u0006n"}, m3636d2 = {"Lcom/robinhood/android/investFlow/InvestFlowDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/investFlow/InvestFlowViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/bonfire/investflow/InvestFlowStore;", "investFlowStore", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/android/common/investflow/allocationprovider/InvestFlowAllocationProviderFactory;", "allocationProviderFactory", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "accountAccessStore", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/bonfire/investflow/InvestFlowStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/common/investflow/allocationprovider/InvestFlowAllocationProviderFactory;Lcom/robinhood/librobinhood/data/store/AccountAccessStore;Landroidx/lifecycle/SavedStateHandle;)V", "", "Ljava/util/UUID;", "instrumentIds", "", "forceRefresh", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/Instrument;", "streamInstruments", "(Ljava/util/List;Z)Lio/reactivex/Observable;", "state", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowStep;", "nextStep", "", "runOrderChecks", "(Lcom/robinhood/android/investFlow/InvestFlowViewState;Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowStep;)V", "lastStep", "currentStep", "logScreenAppearDisappear", "(Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowStep;Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowStep;)V", "", "accountNumber", "setAccountNumber", "(Ljava/lang/String;)V", "Lcom/robinhood/models/util/Money;", "total", "", "count", "forceDefaultAllocation", "completeFlowStep", "prefetchNbboResponse", "setTotal", "(Lcom/robinhood/models/util/Money;IZLcom/robinhood/android/recurring/contracts/investflow/InvestFlowStep;Z)V", "Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboResponse;", "nbboResponse", "setNbboResponse", "(Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboResponse;)V", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "frequency", "callerDescription", "setRecurringFrequency", "(Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;Ljava/lang/String;)V", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "sourceOfFunds", "Lcom/robinhood/models/db/AchRelationship;", "achRelationship", "accountBuyingPower", "setPrimaryPaymentMethod", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;Lcom/robinhood/models/db/AchRelationship;Lcom/robinhood/models/util/Money;)V", "setBackupPaymentMethod", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;Lcom/robinhood/models/db/AchRelationship;)V", "j$/time/LocalDate", InquiryField.DateField.TYPE, "setStartDate", "(Lj$/time/LocalDate;)V", "Lcom/robinhood/investflow/models/api/ApiAssetAllocation;", "assetAllocations", "setAssetAmounts", "(Ljava/util/List;)V", "completedStep", "advanceFlow", "(Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowStep;)V", "clearErrorState", "()V", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$Allocation;", "newAllocation", "updateLoggingAllocation", "(Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$Allocation;)V", "Lcom/robinhood/android/investFlow/core/InvestFlowBasketItem;", "items", "setSelectedItems", "ids", "setSelectedItemsFromExternal", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "apiAssetType", "id", "inBasket", "Lkotlin/Function1;", "onPrimaryButtonClicked", "showEmbeddedDetail", "(Lcom/robinhood/recurring/models/api/ApiAssetType;Ljava/util/UUID;ZLkotlin/jvm/functions/Function1;)V", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/investflow/InvestFlowStore;", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/analytics/EventLogger;", "Lcom/robinhood/android/common/investflow/allocationprovider/InvestFlowAllocationProviderFactory;", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InvestFlowDuxo extends OldBaseDuxo<InvestFlowViewState> implements HasSavedState {
    private final AccountAccessStore accountAccessStore;
    private final AccountProvider accountProvider;
    private final InvestFlowAllocationProviderFactory allocationProviderFactory;
    private final EventLogger eventLogger;
    private final InstrumentStore instrumentStore;
    private final InvestFlowStore investFlowStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InvestFlowDuxo(InstrumentStore instrumentStore, InvestFlowStore investFlowStore, AccountProvider accountProvider, EventLogger eventLogger, InvestFlowAllocationProviderFactory allocationProviderFactory, AccountAccessStore accountAccessStore, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(investFlowStore, "investFlowStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(allocationProviderFactory, "allocationProviderFactory");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        List list = null;
        Money money = null;
        InvestFlowFrequency investFlowFrequency = null;
        List list2 = null;
        UiEvent uiEvent = null;
        InvestFlowPaymentMethod investFlowPaymentMethod = null;
        InvestFlowPaymentMethod investFlowPaymentMethod2 = null;
        ApiInvestFlowNbboResponse apiInvestFlowNbboResponse = null;
        Money money2 = null;
        OrderRequest orderRequest = null;
        InvestmentSchedule investmentSchedule = null;
        UiEvent uiEvent2 = null;
        UiEvent uiEvent3 = null;
        UiEvent uiEvent4 = null;
        UiEvent uiEvent5 = null;
        UiEvent uiEvent6 = null;
        UiEvent uiEvent7 = null;
        UiEvent uiEvent8 = null;
        String str = null;
        Account account = null;
        InvestFlowContext.Allocation allocation = null;
        String str2 = null;
        super(new InvestFlowViewState(((InvestFlowIntentKey) companion.getExtras(savedStateHandle)).getAllocationStrategy(), ((InvestFlowIntentKey) companion.getExtras(savedStateHandle)).getForceDefaultAllocation(), ((InvestFlowIntentKey) companion.getExtras(savedStateHandle)).getMinOrderAmount(), ((InvestFlowIntentKey) companion.getExtras(savedStateHandle)).getSkipForceSuitability(), ((InvestFlowIntentKey) companion.getExtras(savedStateHandle)).getLoggingParams(), list, money, investFlowFrequency, list2, uiEvent, investFlowPaymentMethod, investFlowPaymentMethod2, apiInvestFlowNbboResponse, money2, orderRequest, investmentSchedule, uiEvent2, uiEvent3, uiEvent4, uiEvent5, uiEvent6, uiEvent7, uiEvent8, str, account, allocation, str2, ((InvestFlowIntentKey) companion.getExtras(savedStateHandle)).getRecurringOnly(), ((InvestFlowIntentKey) companion.getExtras(savedStateHandle)).isRecurringUpsell(), 134217696, null), null, 2, null);
        this.instrumentStore = instrumentStore;
        this.investFlowStore = investFlowStore;
        this.accountProvider = accountProvider;
        this.eventLogger = eventLogger;
        this.allocationProviderFactory = allocationProviderFactory;
        this.accountAccessStore = accountAccessStore;
        this.savedStateHandle = savedStateHandle;
    }

    public final void setAccountNumber(String accountNumber) {
        Observable<Account> observableStreamIndividualAccount;
        if (accountNumber == null || accountNumber.length() == 0) {
            observableStreamIndividualAccount = this.accountProvider.streamIndividualAccount();
        } else {
            observableStreamIndividualAccount = this.accountProvider.streamAccount(accountNumber);
        }
        Single<R> singleFlatMap = observableStreamIndividualAccount.firstOrError().flatMap(new Function() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo.setAccountNumber.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Tuples2<Account, Boolean>> apply(final Account account) {
                Intrinsics.checkNotNullParameter(account, "account");
                InvestFlowDuxo investFlowDuxo = InvestFlowDuxo.this;
                return investFlowDuxo.asObservable(investFlowDuxo.accountAccessStore.getFeatureAccess(account.getAccountNumber(), AccountFeature.RECURRING)).firstOrError().map(new Function() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo.setAccountNumber.1.1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<Account, Boolean> apply(Boolean it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Tuples4.m3642to(account, it);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFlatMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowDuxo.setAccountNumber$lambda$1(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAccountNumber$lambda$1(InvestFlowDuxo investFlowDuxo, Tuples2 tuples2) {
        Object objComponent1 = tuples2.component1();
        Intrinsics.checkNotNullExpressionValue(objComponent1, "component1(...)");
        final Account account = (Account) objComponent1;
        Object objComponent2 = tuples2.component2();
        Intrinsics.checkNotNullExpressionValue(objComponent2, "component2(...)");
        final Boolean bool = (Boolean) objComponent2;
        investFlowDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowDuxo.setAccountNumber$lambda$1$lambda$0(account, bool, (InvestFlowViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowViewState setAccountNumber$lambda$1$lambda$0(Account account, Boolean bool, InvestFlowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowViewState.copy$default(applyMutation, null, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, !bool.booleanValue() ? new UiEvent(Unit.INSTANCE) : null, null, null, null, null, null, null, account.getAccountNumber(), account, null, account.getBrokerageAccountType().toString(), false, false, 444530687, null);
    }

    static /* synthetic */ Observable streamInstruments$default(InvestFlowDuxo investFlowDuxo, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return investFlowDuxo.streamInstruments(list, z);
    }

    private final Observable<List<Instrument>> streamInstruments(List<UUID> instrumentIds, boolean forceRefresh) {
        Iterator<T> it = instrumentIds.iterator();
        while (it.hasNext()) {
            this.instrumentStore.refresh(forceRefresh, (UUID) it.next());
        }
        return this.instrumentStore.getInstruments(instrumentIds);
    }

    public static /* synthetic */ void setTotal$default(InvestFlowDuxo investFlowDuxo, Money money, int i, boolean z, InvestFlowStep investFlowStep, boolean z2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            investFlowStep = null;
        }
        InvestFlowStep investFlowStep2 = investFlowStep;
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        investFlowDuxo.setTotal(money, i, z, investFlowStep2, z2);
    }

    public final void setTotal(final Money total, int count, boolean forceDefaultAllocation, final InvestFlowStep completeFlowStep, boolean prefetchNbboResponse) {
        Single singleJust;
        Intrinsics.checkNotNullParameter(total, "total");
        if (prefetchNbboResponse) {
            Single<R> singleFlatMap = getStates().firstOrError().flatMap(new Function() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$setTotal$nbboSingle$1
                @Override // io.reactivex.functions.Function
                public final SingleSource<? extends ApiInvestFlowNbboResponse> apply(InvestFlowViewState state) {
                    Intrinsics.checkNotNullParameter(state, "state");
                    return this.this$0.investFlowStore.getNbbo(state.getAssetAllocations());
                }
            });
            Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
            singleJust = SinglesKt.mapToOptional(singleFlatMap);
        } else {
            singleJust = Single.just(Optional2.INSTANCE);
            Intrinsics.checkNotNull(singleJust);
        }
        if (count == 1) {
            LifecycleHost.DefaultImpls.bind$default(this, singleJust, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C193471(completeFlowStep, total));
            return;
        }
        if (forceDefaultAllocation) {
            final InvestFlowAllocationProvider investFlowAllocationProviderCreateProvider = this.allocationProviderFactory.createProvider(((InvestFlowIntentKey) INSTANCE.getExtras((HasSavedState) this)).getAllocationStrategy());
            Single singleFlatMap2 = getStates().firstOrError().map(new InvestFlowDuxo2(new PropertyReference1Impl() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$setTotal$defaultSplitSingle$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
                public Object get(Object obj) {
                    return ((InvestFlowViewState) obj).getSelectedItemIds();
                }
            })).flatMapObservable(new Function() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$setTotal$defaultSplitSingle$2
                @Override // io.reactivex.functions.Function
                public final Observable<List<Instrument>> apply(List<UUID> p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    return InvestFlowDuxo.streamInstruments$default(this.$tmp0, p0, false, 2, null);
                }
            }).first(CollectionsKt.emptyList()).flatMap(new Function() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$setTotal$defaultSplitSingle$3
                @Override // io.reactivex.functions.Function
                public final SingleSource<? extends Map<Instrument, Money>> apply(List<Instrument> instruments) {
                    Intrinsics.checkNotNullParameter(instruments, "instruments");
                    return investFlowAllocationProviderCreateProvider.getSplit(total, instruments);
                }
            });
            Intrinsics.checkNotNullExpressionValue(singleFlatMap2, "flatMap(...)");
            LifecycleHost.DefaultImpls.bind$default(this, Singles.INSTANCE.zip(singleFlatMap2, singleJust), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestFlowDuxo.setTotal$lambda$5(this.f$0, completeFlowStep, total, (Tuples2) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestFlowDuxo.setTotal$lambda$7(this.f$0, (Throwable) obj);
                }
            });
            return;
        }
        LifecycleHost.DefaultImpls.bind$default(this, singleJust, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C193484(completeFlowStep, total));
    }

    /* compiled from: InvestFlowDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.investFlow.InvestFlowDuxo$setTotal$1 */
    static final class C193471 implements Function1<?, Unit> {
        final /* synthetic */ InvestFlowStep $completeFlowStep;
        final /* synthetic */ Money $total;

        C193471(InvestFlowStep investFlowStep, Money money) {
            this.$completeFlowStep = investFlowStep;
            this.$total = money;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((Optional<ApiInvestFlowNbboResponse>) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(Optional<ApiInvestFlowNbboResponse> optional) {
            final ApiInvestFlowNbboResponse apiInvestFlowNbboResponseComponent1 = optional.component1();
            InvestFlowDuxo investFlowDuxo = InvestFlowDuxo.this;
            final Money money = this.$total;
            investFlowDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$setTotal$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestFlowDuxo.C193471.invoke$lambda$0(money, apiInvestFlowNbboResponseComponent1, (InvestFlowViewState) obj);
                }
            });
            InvestFlowStep investFlowStep = this.$completeFlowStep;
            if (investFlowStep != null) {
                InvestFlowDuxo.this.advanceFlow(investFlowStep);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InvestFlowViewState invoke$lambda$0(Money money, ApiInvestFlowNbboResponse apiInvestFlowNbboResponse, InvestFlowViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return InvestFlowViewState.copy$default(applyMutation, null, false, null, false, null, null, money, null, CollectionsKt.listOf(new ApiAssetAllocation(new ApiInvestmentAsset(((InvestFlowBasketItem) CollectionsKt.first((List) applyMutation.getSelectedItems())).getId(), ((InvestFlowBasketItem) CollectionsKt.first((List) applyMutation.getSelectedItems())).getSymbol(), ApiAssetType.EQUITY), money, null)), null, null, null, apiInvestFlowNbboResponse == null ? applyMutation.getNbboResponse() : apiInvestFlowNbboResponse, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 536866495, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setTotal$lambda$5(InvestFlowDuxo investFlowDuxo, InvestFlowStep investFlowStep, final Money money, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        final Map map = (Map) tuples2.component1();
        final Optional optional = (Optional) tuples2.component2();
        investFlowDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowDuxo.setTotal$lambda$5$lambda$3(money, map, optional, (InvestFlowViewState) obj);
            }
        });
        if (investFlowStep != null) {
            investFlowDuxo.advanceFlow(investFlowStep);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowViewState setTotal$lambda$5$lambda$3(Money money, Map map, Optional optional, InvestFlowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(map);
        List<ApiAssetAllocation> listMapToApiAssetAllocations = AssetAllocationUtils.mapToApiAssetAllocations(map, false);
        ApiInvestFlowNbboResponse nbboResponse = (ApiInvestFlowNbboResponse) optional.getOrNull();
        if (nbboResponse == null) {
            nbboResponse = applyMutation.getNbboResponse();
        }
        return InvestFlowViewState.copy$default(applyMutation, null, false, null, false, null, null, money, null, listMapToApiAssetAllocations, null, null, null, nbboResponse, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 536866495, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setTotal$lambda$7(InvestFlowDuxo investFlowDuxo, final Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        investFlowDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowDuxo.setTotal$lambda$7$lambda$6(error, (InvestFlowViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowViewState setTotal$lambda$7$lambda$6(Throwable th, InvestFlowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowViewState.copy$default(applyMutation, null, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new UiEvent(th), null, null, null, null, false, false, 532676607, null);
    }

    /* compiled from: InvestFlowDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.investFlow.InvestFlowDuxo$setTotal$4 */
    static final class C193484 implements Function1<?, Unit> {
        final /* synthetic */ InvestFlowStep $completeFlowStep;
        final /* synthetic */ Money $total;

        C193484(InvestFlowStep investFlowStep, Money money) {
            this.$completeFlowStep = investFlowStep;
            this.$total = money;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((Optional<ApiInvestFlowNbboResponse>) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(Optional<ApiInvestFlowNbboResponse> optional) {
            final ApiInvestFlowNbboResponse apiInvestFlowNbboResponseComponent1 = optional.component1();
            InvestFlowDuxo investFlowDuxo = InvestFlowDuxo.this;
            final Money money = this.$total;
            investFlowDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$setTotal$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestFlowDuxo.C193484.invoke$lambda$0(money, apiInvestFlowNbboResponseComponent1, (InvestFlowViewState) obj);
                }
            });
            InvestFlowStep investFlowStep = this.$completeFlowStep;
            if (investFlowStep != null) {
                InvestFlowDuxo.this.advanceFlow(investFlowStep);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InvestFlowViewState invoke$lambda$0(Money money, ApiInvestFlowNbboResponse apiInvestFlowNbboResponse, InvestFlowViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return InvestFlowViewState.copy$default(applyMutation, null, false, null, false, null, null, money, null, null, null, null, null, apiInvestFlowNbboResponse == null ? applyMutation.getNbboResponse() : apiInvestFlowNbboResponse, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 536866751, null);
        }
    }

    public final void setNbboResponse(final ApiInvestFlowNbboResponse nbboResponse) {
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowDuxo.setNbboResponse$lambda$8(nbboResponse, (InvestFlowViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowViewState setNbboResponse$lambda$8(ApiInvestFlowNbboResponse apiInvestFlowNbboResponse, InvestFlowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowViewState.copy$default(applyMutation, null, false, null, false, null, null, null, null, null, null, null, null, apiInvestFlowNbboResponse, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 536866815, null);
    }

    public final void setRecurringFrequency(final InvestFlowFrequency frequency, String callerDescription) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(callerDescription, "callerDescription");
        InvestFlowFrequency.Recurring recurring = frequency instanceof InvestFlowFrequency.Recurring ? (InvestFlowFrequency.Recurring) frequency : null;
        if ((recurring != null ? recurring.getFrequency() : null) == ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK) {
            throw new IllegalStateException("Cannot use paycheck frequency in Invest Flow.");
        }
        CrashReporter.INSTANCE.log("setRecurringFrequency to " + frequency + " from " + callerDescription);
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowDuxo.setRecurringFrequency$lambda$10(frequency, (InvestFlowViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowViewState setRecurringFrequency$lambda$10(InvestFlowFrequency investFlowFrequency, InvestFlowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowViewState.copy$default(applyMutation, null, false, null, false, null, null, null, investFlowFrequency, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 536870783, null);
    }

    public static /* synthetic */ void setPrimaryPaymentMethod$default(InvestFlowDuxo investFlowDuxo, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, AchRelationship achRelationship, Money money, int i, Object obj) {
        if ((i & 4) != 0) {
            money = null;
        }
        investFlowDuxo.setPrimaryPaymentMethod(sourceOfFunds, achRelationship, money);
    }

    public final void setPrimaryPaymentMethod(ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, AchRelationship achRelationship, final Money accountBuyingPower) {
        if (sourceOfFunds == null) {
            throw new IllegalStateException("primary payment method cannot be null");
        }
        final InvestFlowPaymentMethod investFlowPaymentMethodCreateInvestFlowPaymentMethod = InvestFlowPaymentMethod2.createInvestFlowPaymentMethod(sourceOfFunds, achRelationship);
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowDuxo.setPrimaryPaymentMethod$lambda$12(investFlowPaymentMethodCreateInvestFlowPaymentMethod, (InvestFlowViewState) obj);
            }
        });
        if (accountBuyingPower != null) {
            applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestFlowDuxo.setPrimaryPaymentMethod$lambda$13(accountBuyingPower, (InvestFlowViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowViewState setPrimaryPaymentMethod$lambda$12(InvestFlowPaymentMethod investFlowPaymentMethod, InvestFlowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowViewState.copy$default(applyMutation, null, false, null, false, null, null, null, null, null, null, investFlowPaymentMethod, investFlowPaymentMethod instanceof InvestFlowPaymentMethod.Ach ? null : applyMutation.getBackupPaymentMethod(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 536867839, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowViewState setPrimaryPaymentMethod$lambda$13(Money money, InvestFlowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowViewState.copy$default(applyMutation, null, false, null, false, null, null, null, null, null, null, null, null, null, money, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 536862719, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowViewState setBackupPaymentMethod$lambda$14(InvestFlowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowViewState.copy$default(applyMutation, null, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 536868863, null);
    }

    public final void setBackupPaymentMethod(ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, AchRelationship achRelationship) {
        if (sourceOfFunds == null) {
            applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestFlowDuxo.setBackupPaymentMethod$lambda$14((InvestFlowViewState) obj);
                }
            });
            return;
        }
        ApiInvestmentSchedule.SourceOfFunds.Companion companion = ApiInvestmentSchedule.SourceOfFunds.INSTANCE;
        final InvestFlowPaymentMethod investFlowPaymentMethodCreateInvestFlowPaymentMethod = InvestFlowPaymentMethod2.createInvestFlowPaymentMethod(sourceOfFunds, achRelationship);
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowDuxo.setBackupPaymentMethod$lambda$16(investFlowPaymentMethodCreateInvestFlowPaymentMethod, (InvestFlowViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowViewState setBackupPaymentMethod$lambda$16(InvestFlowPaymentMethod investFlowPaymentMethod, InvestFlowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowViewState.copy$default(applyMutation, null, false, null, false, null, null, null, null, null, null, null, investFlowPaymentMethod, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 536868863, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowViewState setStartDate$lambda$17(LocalDate localDate, InvestFlowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.mutateStartDate(localDate);
    }

    public final void setStartDate(final LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowDuxo.setStartDate$lambda$17(date, (InvestFlowViewState) obj);
            }
        });
    }

    public final void setAssetAmounts(final List<ApiAssetAllocation> assetAllocations) {
        Intrinsics.checkNotNullParameter(assetAllocations, "assetAllocations");
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowDuxo.setAssetAmounts$lambda$18(assetAllocations, (InvestFlowViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowViewState setAssetAmounts$lambda$18(List list, InvestFlowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowViewState.copy$default(applyMutation, null, false, null, false, null, null, null, null, list, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 536870655, null);
    }

    public final void advanceFlow(final InvestFlowStep completedStep) {
        Intrinsics.checkNotNullParameter(completedStep, "completedStep");
        Single singleFirstOrError = getStates().map(new InvestFlowDuxo2(new PropertyReference1Impl() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo.advanceFlow.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((InvestFlowViewState) obj).getSelectedItemIds();
            }
        })).switchMap(new Function() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo.advanceFlow.2
            @Override // io.reactivex.functions.Function
            public final Observable<List<Instrument>> apply(List<UUID> p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return InvestFlowDuxo.streamInstruments$default(InvestFlowDuxo.this, p0, false, 2, null);
            }
        }).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowDuxo.advanceFlow$lambda$21(this.f$0, completedStep, (List) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowDuxo.advanceFlow$lambda$23(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit advanceFlow$lambda$21(final InvestFlowDuxo investFlowDuxo, final InvestFlowStep investFlowStep, List list) {
        investFlowDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowDuxo.advanceFlow$lambda$21$lambda$20(investFlowStep, investFlowDuxo, (InvestFlowViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowViewState advanceFlow$lambda$21$lambda$20(InvestFlowStep investFlowStep, InvestFlowDuxo investFlowDuxo, InvestFlowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        InvestFlowStep nextFlowStep = applyMutation.getNextFlowStep(investFlowStep);
        investFlowDuxo.logScreenAppearDisappear(investFlowStep, nextFlowStep);
        if (nextFlowStep.getRunOrderChecks()) {
            investFlowDuxo.runOrderChecks(applyMutation, nextFlowStep);
            return InvestFlowViewState.copy$default(applyMutation, null, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 536870911, null);
        }
        return InvestFlowViewState.copy$default(applyMutation, null, false, null, false, null, null, null, null, null, new UiEvent(nextFlowStep), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 536870399, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit advanceFlow$lambda$23(InvestFlowDuxo investFlowDuxo, final Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        investFlowDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowDuxo.advanceFlow$lambda$23$lambda$22(it, (InvestFlowViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowViewState advanceFlow$lambda$23$lambda$22(Throwable th, InvestFlowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowViewState.copy$default(applyMutation, null, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new UiEvent(th), null, null, null, null, false, false, 532676607, null);
    }

    private final void runOrderChecks(InvestFlowViewState state, final InvestFlowStep nextStep) {
        LifecycleHost.DefaultImpls.bind$default(this, this.investFlowStore.checkInvestFlow(state.getOrderCheckPostBody()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowDuxo.runOrderChecks$lambda$26(this.f$0, nextStep, (ApiInvestFlowOrderCheckResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowDuxo.runOrderChecks$lambda$28(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runOrderChecks$lambda$26(InvestFlowDuxo investFlowDuxo, final InvestFlowStep investFlowStep, ApiInvestFlowOrderCheckResponse apiInvestFlowOrderChecksResponse) {
        ApiEquityOrderChecksResponse.ApiEquityOrderChecksAlert alert;
        Intrinsics.checkNotNullParameter(apiInvestFlowOrderChecksResponse, "apiInvestFlowOrderChecksResponse");
        ApiEquityOrderChecksResponse order_checks_response = apiInvestFlowOrderChecksResponse.getOrder_checks_response();
        final VisibleEquityOrderChecksAlert dbModel = (order_checks_response == null || (alert = order_checks_response.getAlert()) == null) ? null : EquityOrderChecksAlert2.toDbModel(alert);
        ApiInvestmentSchedule recurring_schedule = apiInvestFlowOrderChecksResponse.getRecurring_schedule();
        final InvestmentSchedule dbModel2 = recurring_schedule != null ? InvestmentSchedule2.toDbModel(recurring_schedule) : null;
        final OrderRequest equity_order_request = apiInvestFlowOrderChecksResponse.getEquity_order_request();
        if (dbModel != null) {
            investFlowDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestFlowDuxo.runOrderChecks$lambda$26$lambda$24(dbModel, equity_order_request, dbModel2, (InvestFlowViewState) obj);
                }
            });
        } else {
            investFlowDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestFlowDuxo.runOrderChecks$lambda$26$lambda$25(investFlowStep, (InvestFlowViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowViewState runOrderChecks$lambda$26$lambda$24(VisibleEquityOrderChecksAlert visibleEquityOrderChecksAlert, OrderRequest orderRequest, InvestmentSchedule investmentSchedule, InvestFlowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowViewState.copy$default(applyMutation, null, false, null, false, null, null, null, null, null, null, null, null, null, null, orderRequest, investmentSchedule, null, new UiEvent(visibleEquityOrderChecksAlert), null, null, null, null, null, null, null, null, null, false, false, 536690687, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowViewState runOrderChecks$lambda$26$lambda$25(InvestFlowStep investFlowStep, InvestFlowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowViewState.copy$default(applyMutation, null, false, null, false, null, null, null, null, null, new UiEvent(investFlowStep), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 536870399, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runOrderChecks$lambda$28(InvestFlowDuxo investFlowDuxo, final Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        investFlowDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowDuxo.runOrderChecks$lambda$28$lambda$27(it, (InvestFlowViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowViewState runOrderChecks$lambda$28$lambda$27(Throwable th, InvestFlowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowViewState.copy$default(applyMutation, null, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new UiEvent(th), null, null, null, null, false, false, 532676607, null);
    }

    public final void clearErrorState() {
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowDuxo.clearErrorState$lambda$29((InvestFlowViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowViewState clearErrorState$lambda$29(InvestFlowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowViewState.copy$default(applyMutation, null, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 536821759, null);
    }

    public final void updateLoggingAllocation(final InvestFlowContext.Allocation newAllocation) {
        Intrinsics.checkNotNullParameter(newAllocation, "newAllocation");
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowDuxo.updateLoggingAllocation$lambda$30(newAllocation, (InvestFlowViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowViewState updateLoggingAllocation$lambda$30(InvestFlowContext.Allocation allocation, InvestFlowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowViewState.copy$default(applyMutation, null, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, allocation, null, false, false, 503316479, null);
    }

    public final void setSelectedItems(final List<? extends InvestFlowBasketItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowDuxo.setSelectedItems$lambda$31(items, (InvestFlowViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowViewState setSelectedItems$lambda$31(List list, InvestFlowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowViewState.copy$default(applyMutation, null, false, null, false, null, list, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 536870879, null);
    }

    public final void setSelectedItemsFromExternal(final List<UUID> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Observable<List<Instrument>> observableTakeUntil = streamInstruments(ids, true).takeUntil(new Predicate() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo.setSelectedItemsFromExternal.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(List<Instrument> instruments) {
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                return instruments.size() == ids.size();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableTakeUntil, "takeUntil(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTakeUntil, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowDuxo.setSelectedItemsFromExternal$lambda$34(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSelectedItemsFromExternal$lambda$34(InvestFlowDuxo investFlowDuxo, List list) {
        Intrinsics.checkNotNull(list);
        List list2 = list;
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new InvestFlowBasketItem.Equity((Instrument) it.next()));
        }
        investFlowDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowDuxo.setSelectedItemsFromExternal$lambda$34$lambda$33(arrayList, (InvestFlowViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowViewState setSelectedItemsFromExternal$lambda$34$lambda$33(List list, InvestFlowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowViewState.copy$default(applyMutation, null, false, null, false, null, list, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 536870879, null);
    }

    public final void showEmbeddedDetail(final ApiAssetType apiAssetType, final UUID id, final boolean inBasket, final Function1<? super UUID, Unit> onPrimaryButtonClicked) {
        Intrinsics.checkNotNullParameter(apiAssetType, "apiAssetType");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(onPrimaryButtonClicked, "onPrimaryButtonClicked");
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowDuxo.showEmbeddedDetail$lambda$35(apiAssetType, id, inBasket, onPrimaryButtonClicked, (InvestFlowViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowViewState showEmbeddedDetail$lambda$35(ApiAssetType apiAssetType, UUID uuid, boolean z, Function1 function1, InvestFlowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowViewState.copy$default(applyMutation, null, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new UiEvent(new InvestFlowViewState.EmbeddedDetailData(apiAssetType, uuid, z, applyMutation.getSelectedItems().size() >= 10, function1)), null, null, null, null, null, null, false, false, 535822335, null);
    }

    private final void logScreenAppearDisappear(final InvestFlowStep lastStep, InvestFlowStep currentStep) {
        Screen.Name loggingScreen = lastStep.getLoggingScreen();
        if (loggingScreen == null) {
            loggingScreen = Screen.Name.NAME_UNSPECIFIED;
        }
        final Screen screen = new Screen(loggingScreen, null, InvestFlowConstants.Logging.STOCKS_AND_ETFS, null, 10, null);
        Screen.Name loggingScreen2 = currentStep.getLoggingScreen();
        if (loggingScreen2 == null) {
            loggingScreen2 = Screen.Name.NAME_UNSPECIFIED;
        }
        final Screen screen2 = new Screen(loggingScreen2, null, InvestFlowConstants.Logging.STOCKS_AND_ETFS, null, 10, null);
        Single<InvestFlowViewState> singleFirstOrError = getStates().firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.InvestFlowDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowDuxo.logScreenAppearDisappear$lambda$37(this.f$0, screen, screen2, lastStep, (InvestFlowViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit logScreenAppearDisappear$lambda$37(InvestFlowDuxo investFlowDuxo, Screen screen, Screen screen2, InvestFlowStep investFlowStep, InvestFlowViewState investFlowViewState) {
        BigDecimal decimalValue;
        Basket basket = new Basket(investFlowViewState.getSelectedItems().size(), InvestFlowExtensions.toInvestFlowLoggingString(investFlowViewState.getSelectedItems()), null, 4, 0 == true ? 1 : 0);
        RecurringContext.FlowType flowType = RecurringContext.FlowType.CREATE;
        InvestFlowFrequency selectedFrequency = investFlowViewState.getSelectedFrequency();
        InvestFlowFrequency.Recurring recurring = selectedFrequency instanceof InvestFlowFrequency.Recurring ? (InvestFlowFrequency.Recurring) selectedFrequency : null;
        RecurringContext.ScheduleFrequency recurringContextScheduleFrequency = RecurringLoggingUtils.toRecurringContextScheduleFrequency(recurring != null ? recurring.getFrequency() : null);
        Money totalAmount = investFlowViewState.getTotalAmount();
        Context context = new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new RecurringContext(flowType, null, null, recurringContextScheduleFrequency, null, (totalAmount == null || (decimalValue = totalAmount.getDecimalValue()) == null) ? 0.0d : decimalValue.doubleValue(), null, null, 0.0d, null, null, 2006, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, basket, new InvestFlowContext(investFlowViewState.getLoggingAllocation(), InvestFlowContext.OrderStatus.SUCCESS, InvestFlowContext.EntryPoint.INVEST_FLOW_ENTRY_POINT_UNSPECIFIED, investFlowViewState.getLoggingAccountType(), ((InvestFlowIntentKey) INSTANCE.getExtras((HasSavedState) investFlowDuxo)).getLoggingParams().getSource(), null, 32, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -786433, -1, -1, -1, 16383, null);
        EventLogger.DefaultImpls.logScreenDisappear$default(investFlowDuxo.eventLogger, null, screen, null, null, context, 13, null);
        EventLogger.DefaultImpls.logScreenAppear$default(investFlowDuxo.eventLogger, null, screen2, null, null, context, 13, null);
        UserInteractionEventData.Action ctaLoggingAction = investFlowStep.getCtaLoggingAction();
        if (ctaLoggingAction != null) {
            EventLogger.DefaultImpls.logTap$default(investFlowDuxo.eventLogger, ctaLoggingAction, screen, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, context, false, 40, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: InvestFlowDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investFlow/InvestFlowDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/investFlow/InvestFlowDuxo;", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowIntentKey;", "<init>", "()V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<InvestFlowDuxo, InvestFlowIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public InvestFlowIntentKey getExtras(SavedStateHandle savedStateHandle) {
            return (InvestFlowIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public InvestFlowIntentKey getExtras(InvestFlowDuxo investFlowDuxo) {
            return (InvestFlowIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, investFlowDuxo);
        }
    }
}
