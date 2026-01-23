package com.robinhood.android.investFlow.submit;

import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.recurring.utils.RecurringLoggingUtils;
import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.android.investFlow.recurring.InvestFlowRecurringViewState;
import com.robinhood.android.investFlow.submit.InvestFlowOrderArgs;
import com.robinhood.android.investFlow.submit.InvestFlowOrderDuxo;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.investflow.models.api.ApiAssetAllocation;
import com.robinhood.investflow.models.api.ApiInvestFlowNbboResponse;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Basket;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.InvestFlowContext;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InvestFlowOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001!B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\u0006\u0010\u001a\u001a\u00020\u0015J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0002H\u0002J\u001e\u0010\u001c\u001a\u00060\u001dj\u0002`\u001e2\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/investFlow/submit/InvestFlowOrderDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "investFlowStore", "Lcom/robinhood/librobinhood/data/store/bonfire/investflow/InvestFlowStore;", "orderManager", "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderSubmissionManager;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/bonfire/investflow/InvestFlowStore;Lcom/robinhood/android/investFlow/submit/InvestFlowOrderSubmissionManager;Lcom/robinhood/analytics/EventLogger;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onResume", "", "refreshNbbo", "submitOrder", "state", "loadRecurring", "logBackPressed", "logSubmit", "makeLoggingContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "recurringViewState", "Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringViewState;", "Companion", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InvestFlowOrderDuxo extends OldBaseDuxo<InvestFlowOrderViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final EventLogger eventLogger;
    private final InstrumentStore instrumentStore;
    private final InvestFlowStore investFlowStore;
    private final InvestFlowOrderSubmissionManager orderManager;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID loadRecurring$lambda$9$lambda$6(UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13, types: [io.reactivex.Scheduler, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r7v15 */
    public InvestFlowOrderDuxo(AccountProvider accountProvider, InstrumentStore instrumentStore, InvestFlowStore investFlowStore, InvestFlowOrderSubmissionManager orderManager, EventLogger eventLogger, SavedStateHandle savedStateHandle) {
        ?? r7;
        ApiInvestFlowNbboResponse apiInvestFlowNbboResponse;
        ApiInvestFlowNbboResponse nbboResponse;
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(investFlowStore, "investFlowStore");
        Intrinsics.checkNotNullParameter(orderManager, "orderManager");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        Money amount = ((InvestFlowOrderArgs) companion.getArgs(savedStateHandle)).getAmount();
        InvestFlowOrderArgs2 viewState = ((InvestFlowOrderArgs) companion.getArgs(savedStateHandle)).getViewState();
        List<ApiAssetAllocation> assetAllocations = ((InvestFlowOrderArgs) companion.getArgs(savedStateHandle)).getAssetAllocations();
        String accountNumber = ((InvestFlowOrderArgs) companion.getArgs(savedStateHandle)).getAccountNumber();
        InvestFlowOrderArgs investFlowOrderArgs = (InvestFlowOrderArgs) companion.getArgs(savedStateHandle);
        if (investFlowOrderArgs instanceof InvestFlowOrderArgs.OneTimeMultiple) {
            nbboResponse = ((InvestFlowOrderArgs.OneTimeMultiple) investFlowOrderArgs).getNbboResponse();
        } else {
            if (!(investFlowOrderArgs instanceof InvestFlowOrderArgs.OneTimeSingle)) {
                if (investFlowOrderArgs instanceof InvestFlowOrderArgs.Recurring) {
                    r7 = 0;
                    apiInvestFlowNbboResponse = null;
                    super(new InvestFlowOrderViewState(false, null, amount, false, assetAllocations, apiInvestFlowNbboResponse, accountNumber, viewState, 11, null), r7, 2, r7);
                    this.accountProvider = accountProvider;
                    this.instrumentStore = instrumentStore;
                    this.investFlowStore = investFlowStore;
                    this.orderManager = orderManager;
                    this.eventLogger = eventLogger;
                    this.savedStateHandle = savedStateHandle;
                }
                throw new NoWhenBranchMatchedException();
            }
            nbboResponse = ((InvestFlowOrderArgs.OneTimeSingle) investFlowOrderArgs).getNbboResponse();
        }
        apiInvestFlowNbboResponse = nbboResponse;
        r7 = 0;
        super(new InvestFlowOrderViewState(false, null, amount, false, assetAllocations, apiInvestFlowNbboResponse, accountNumber, viewState, 11, null), r7, 2, r7);
        this.accountProvider = accountProvider;
        this.instrumentStore = instrumentStore;
        this.investFlowStore = investFlowStore;
        this.orderManager = orderManager;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, this.accountProvider.streamAccount(((InvestFlowOrderArgs) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.submit.InvestFlowOrderDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowOrderDuxo.onResume$lambda$1(this.f$0, (Account) obj);
            }
        });
        refreshNbbo();
        loadRecurring();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(InvestFlowOrderDuxo investFlowOrderDuxo, final Account account) {
        Intrinsics.checkNotNullParameter(account, "account");
        investFlowOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.submit.InvestFlowOrderDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowOrderDuxo.onResume$lambda$1$lambda$0(account, (InvestFlowOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowOrderViewState onResume$lambda$1$lambda$0(Account account, InvestFlowOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        InvestFlowOrderArgs2 contentViewState = applyMutation.getContentViewState();
        InvestFlowRecurringViewState investFlowRecurringViewState = contentViewState instanceof InvestFlowRecurringViewState ? (InvestFlowRecurringViewState) contentViewState : null;
        InvestFlowOrderArgs2 investFlowOrderArgs2Copy = investFlowRecurringViewState != null ? investFlowRecurringViewState.copy((15359 & 1) != 0 ? investFlowRecurringViewState.totalAmount : null, (15359 & 2) != 0 ? investFlowRecurringViewState.frequency : null, (15359 & 4) != 0 ? investFlowRecurringViewState.startDate : null, (15359 & 8) != 0 ? investFlowRecurringViewState.primaryPaymentMethod : null, (15359 & 16) != 0 ? investFlowRecurringViewState.backupPaymentMethod : null, (15359 & 32) != 0 ? investFlowRecurringViewState.isCrypto : false, (15359 & 64) != 0 ? investFlowRecurringViewState.instruments : null, (15359 & 128) != 0 ? investFlowRecurringViewState.brokerageAccountType : null, (15359 & 256) != 0 ? investFlowRecurringViewState.assetAllocations : null, (15359 & 512) != 0 ? investFlowRecurringViewState.accountBuyingPower : null, (15359 & 1024) != 0 ? investFlowRecurringViewState.onReviewEvent : null, (15359 & 2048) != 0 ? investFlowRecurringViewState.isRecurringUpsell : false, (15359 & 4096) != 0 ? investFlowRecurringViewState.accountNumber : null, (15359 & 8192) != 0 ? investFlowRecurringViewState.account : account) : null;
        if (investFlowOrderArgs2Copy == null) {
            investFlowOrderArgs2Copy = applyMutation.getContentViewState();
        }
        return InvestFlowOrderViewState.copy$default(applyMutation, false, account, null, false, null, null, null, investFlowOrderArgs2Copy, 125, null);
    }

    public final void refreshNbbo() {
        Single<ApiInvestFlowNbboResponse> singleDoOnSubscribe = this.investFlowStore.getNbbo(((InvestFlowOrderArgs) INSTANCE.getArgs((HasSavedState) this)).getAssetAllocations()).doOnSubscribe(new C194291());
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.submit.InvestFlowOrderDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowOrderDuxo.refreshNbbo$lambda$3(this.f$0, (ApiInvestFlowNbboResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.investFlow.submit.InvestFlowOrderDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowOrderDuxo.refreshNbbo$lambda$5(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: InvestFlowOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.investFlow.submit.InvestFlowOrderDuxo$refreshNbbo$1 */
    static final class C194291<T> implements Consumer {
        C194291() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InvestFlowOrderViewState accept$lambda$0(InvestFlowOrderViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return InvestFlowOrderViewState.copy$default(applyMutation, true, null, null, false, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            InvestFlowOrderDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.submit.InvestFlowOrderDuxo$refreshNbbo$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestFlowOrderDuxo.C194291.accept$lambda$0((InvestFlowOrderViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshNbbo$lambda$3(InvestFlowOrderDuxo investFlowOrderDuxo, final ApiInvestFlowNbboResponse apiInvestFlowNbboResponse) {
        investFlowOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.submit.InvestFlowOrderDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowOrderDuxo.refreshNbbo$lambda$3$lambda$2(apiInvestFlowNbboResponse, (InvestFlowOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowOrderViewState refreshNbbo$lambda$3$lambda$2(ApiInvestFlowNbboResponse apiInvestFlowNbboResponse, InvestFlowOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowOrderViewState.copy$default(applyMutation, false, null, null, false, null, apiInvestFlowNbboResponse, null, null, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshNbbo$lambda$5(InvestFlowOrderDuxo investFlowOrderDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        investFlowOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.submit.InvestFlowOrderDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowOrderDuxo.refreshNbbo$lambda$5$lambda$4((InvestFlowOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowOrderViewState refreshNbbo$lambda$5$lambda$4(InvestFlowOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowOrderViewState.copy$default(applyMutation, false, null, null, false, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
    }

    public final void submitOrder(InvestFlowOrderViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        logSubmit(state);
        InvestFlowOrderSubmissionManager investFlowOrderSubmissionManager = this.orderManager;
        Companion companion = INSTANCE;
        UUID refId = ((InvestFlowOrderArgs) companion.getArgs((HasSavedState) this)).getRefId();
        Intrinsics.checkNotNull(refId);
        OrderSubmissionManager.submit$default(investFlowOrderSubmissionManager, state.getPostBody(refId, ((InvestFlowOrderArgs) companion.getArgs((HasSavedState) this)).getSourceId()), null, false, 6, null);
    }

    private final void loadRecurring() {
        Parcelable args = INSTANCE.getArgs((HasSavedState) this);
        InvestFlowOrderArgs.Recurring recurring = args instanceof InvestFlowOrderArgs.Recurring ? (InvestFlowOrderArgs.Recurring) args : null;
        if (recurring != null) {
            LifecycleHost.DefaultImpls.bind$default(this, this.instrumentStore.getInstruments(recurring.getInstrumentIds(), new Function1() { // from class: com.robinhood.android.investFlow.submit.InvestFlowOrderDuxo$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestFlowOrderDuxo.loadRecurring$lambda$9$lambda$6((UUID) obj);
                }
            }), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.submit.InvestFlowOrderDuxo$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestFlowOrderDuxo.loadRecurring$lambda$9$lambda$8(this.f$0, (List) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadRecurring$lambda$9$lambda$8(InvestFlowOrderDuxo investFlowOrderDuxo, final List instruments) {
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        investFlowOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.submit.InvestFlowOrderDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowOrderDuxo.loadRecurring$lambda$9$lambda$8$lambda$7(instruments, (InvestFlowOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowOrderViewState loadRecurring$lambda$9$lambda$8$lambda$7(List list, InvestFlowOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        InvestFlowOrderArgs2 contentViewState = applyMutation.getContentViewState();
        InvestFlowRecurringViewState investFlowRecurringViewState = contentViewState instanceof InvestFlowRecurringViewState ? (InvestFlowRecurringViewState) contentViewState : null;
        return InvestFlowOrderViewState.copy$default(applyMutation, false, null, null, false, null, null, null, investFlowRecurringViewState != null ? investFlowRecurringViewState.copy((15359 & 1) != 0 ? investFlowRecurringViewState.totalAmount : null, (15359 & 2) != 0 ? investFlowRecurringViewState.frequency : null, (15359 & 4) != 0 ? investFlowRecurringViewState.startDate : null, (15359 & 8) != 0 ? investFlowRecurringViewState.primaryPaymentMethod : null, (15359 & 16) != 0 ? investFlowRecurringViewState.backupPaymentMethod : null, (15359 & 32) != 0 ? investFlowRecurringViewState.isCrypto : false, (15359 & 64) != 0 ? investFlowRecurringViewState.instruments : list, (15359 & 128) != 0 ? investFlowRecurringViewState.brokerageAccountType : null, (15359 & 256) != 0 ? investFlowRecurringViewState.assetAllocations : null, (15359 & 512) != 0 ? investFlowRecurringViewState.accountBuyingPower : null, (15359 & 1024) != 0 ? investFlowRecurringViewState.onReviewEvent : null, (15359 & 2048) != 0 ? investFlowRecurringViewState.isRecurringUpsell : false, (15359 & 4096) != 0 ? investFlowRecurringViewState.accountNumber : null, (15359 & 8192) != 0 ? investFlowRecurringViewState.account : null) : null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public final void logBackPressed() {
        Single<InvestFlowOrderViewState> singleFirstOrError = getStates().firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.submit.InvestFlowOrderDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowOrderDuxo.logBackPressed$lambda$10(this.f$0, (InvestFlowOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logBackPressed$lambda$10(InvestFlowOrderDuxo investFlowOrderDuxo, InvestFlowOrderViewState investFlowOrderViewState) {
        InvestFlowOrderArgs2 contentViewState = investFlowOrderViewState.getContentViewState();
        InvestFlowRecurringViewState investFlowRecurringViewState = contentViewState instanceof InvestFlowRecurringViewState ? (InvestFlowRecurringViewState) contentViewState : null;
        EventLogger eventLogger = investFlowOrderDuxo.eventLogger;
        Screen screen = new Screen(Screen.Name.INVEST_FLOW_ORDER_REVIEW, null, null, null, 14, null);
        Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
        UserInteractionEventData.Action action = UserInteractionEventData.Action.EDIT;
        Intrinsics.checkNotNull(investFlowOrderViewState);
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component, null, investFlowOrderDuxo.makeLoggingContext(investFlowOrderViewState, investFlowRecurringViewState), false, 40, null);
        return Unit.INSTANCE;
    }

    private final void logSubmit(InvestFlowOrderViewState state) {
        String str;
        InvestFlowOrderArgs2 contentViewState = state.getContentViewState();
        InvestFlowRecurringViewState investFlowRecurringViewState = contentViewState instanceof InvestFlowRecurringViewState ? (InvestFlowRecurringViewState) contentViewState : null;
        EventLogger eventLogger = this.eventLogger;
        UserInteractionEventData.Action action = UserInteractionEventData.Action.SUBMIT_INVEST_FLOW_ORDER;
        Screen.Name name = Screen.Name.INVEST_FLOW_ORDER_REVIEW;
        if (((InvestFlowOrderArgs) INSTANCE.getArgs((HasSavedState) this)).getIsCrypto()) {
            str = InvestFlowConstants.Logging.CRYPTOS;
        } else {
            str = InvestFlowConstants.Logging.STOCKS_AND_ETFS;
        }
        EventLogger.DefaultImpls.logSwipe$default(eventLogger, action, new Screen(name, str, null, null, 12, null), null, null, makeLoggingContext(state, investFlowRecurringViewState), false, 44, null);
    }

    private final Context makeLoggingContext(InvestFlowOrderViewState state, InvestFlowRecurringViewState recurringViewState) {
        String string2;
        BrokerageAccountType brokerageAccountType;
        int size = state.getAssetAllocations().size();
        List<ApiAssetAllocation> assetAllocations = state.getAssetAllocations();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(assetAllocations, 10));
        Iterator<T> it = assetAllocations.iterator();
        while (it.hasNext()) {
            arrayList.add(((ApiAssetAllocation) it.next()).getAsset().getAsset_symbol());
        }
        Basket basket = new Basket(size, arrayList.toString(), null, 4, null);
        RecurringContext recurringContext = recurringViewState != null ? new RecurringContext(RecurringContext.FlowType.CREATE, null, null, RecurringLoggingUtils.toRecurringContextScheduleFrequency(recurringViewState.getFrequency()), null, recurringViewState.getTotalAmount().getDecimalValue().doubleValue(), null, null, 0.0d, null, null, 2006, null) : null;
        InvestFlowContext.Allocation allocation = InvestFlowContext.Allocation.DEFAULT;
        InvestFlowContext.OrderStatus orderStatus = InvestFlowContext.OrderStatus.SUCCESS;
        InvestFlowContext.EntryPoint entryPoint = InvestFlowContext.EntryPoint.INVEST_FLOW_ENTRY_POINT_UNSPECIFIED;
        Account account = state.getAccount();
        if (account == null || (brokerageAccountType = account.getBrokerageAccountType()) == null || (string2 = brokerageAccountType.toString()) == null) {
            string2 = "";
        }
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, recurringContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, basket, new InvestFlowContext(allocation, orderStatus, entryPoint, string2, ((InvestFlowOrderArgs) INSTANCE.getArgs((HasSavedState) this)).getLoggingParams().getSource(), null, 32, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -786433, -1, -1, -1, 16383, null);
    }

    /* compiled from: InvestFlowOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investFlow/submit/InvestFlowOrderDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderDuxo;", "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderArgs;", "<init>", "()V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<InvestFlowOrderDuxo, InvestFlowOrderArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InvestFlowOrderArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InvestFlowOrderArgs) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InvestFlowOrderArgs getArgs(InvestFlowOrderDuxo investFlowOrderDuxo) {
            return (InvestFlowOrderArgs) DuxoCompanion.DefaultImpls.getArgs(this, investFlowOrderDuxo);
        }
    }
}
