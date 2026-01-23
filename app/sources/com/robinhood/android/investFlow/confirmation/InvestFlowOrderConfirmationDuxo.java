package com.robinhood.android.investFlow.confirmation;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.investflow.models.api.ApiInvestFlowPostResponse;
import com.robinhood.investflow.models.api.ApiInvestFlowReceiptPostBody;
import com.robinhood.investflow.models.api.InvestFlowReceiptResponse;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore;
import com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.InvestFlowContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Duration;

/* compiled from: InvestFlowOrderConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001)B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\u0016\u0010\u001a\u001a\u00020\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\u0016\u0010\u001e\u001a\u00020\u00152\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u001dH\u0002J\u0016\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\b\u0010'\u001a\u00020\u0015H\u0002J\b\u0010(\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/investFlow/confirmation/InvestFlowOrderConfirmationDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/investFlow/confirmation/InvestFlowOrderConfirmationViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "investFlowStore", "Lcom/robinhood/librobinhood/data/store/bonfire/investflow/InvestFlowStore;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/investflow/InvestFlowStore;Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/analytics/EventLogger;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onOrderReceived", "", "response", "Lcom/robinhood/investflow/models/api/ApiInvestFlowPostResponse;", "onStop", "loadAccount", "pollReceipt", "orderIds", "", "Ljava/util/UUID;", "getScheduleInformation", "scheduleIds", "getAchRelationshipInformation", "achRelationshipId", "logButtonTap", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "orderStatus", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$OrderStatus;", "logReceiptAppear", "logReceiptDisappear", "Companion", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InvestFlowOrderConfirmationDuxo extends OldBaseDuxo<InvestFlowOrderConfirmationViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final AchRelationshipStore achRelationshipStore;
    private final EventLogger eventLogger;
    private final InvestFlowStore investFlowStore;
    private final TraderInvestmentScheduleStore investmentScheduleStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestFlowOrderConfirmationDuxo(InvestFlowStore investFlowStore, TraderInvestmentScheduleStore investmentScheduleStore, AchRelationshipStore achRelationshipStore, AccountProvider accountProvider, EventLogger eventLogger, SavedStateHandle savedStateHandle) {
        super(new InvestFlowOrderConfirmationViewState(null, null, null, null, null, null, 63, null), null, 2, null);
        Intrinsics.checkNotNullParameter(investFlowStore, "investFlowStore");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.investFlowStore = investFlowStore;
        this.investmentScheduleStore = investmentScheduleStore;
        this.achRelationshipStore = achRelationshipStore;
        this.accountProvider = accountProvider;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
    }

    public final void onOrderReceived(final ApiInvestFlowPostResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.confirmation.InvestFlowOrderConfirmationDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowOrderConfirmationDuxo.onOrderReceived$lambda$0(response, (InvestFlowOrderConfirmationViewState) obj);
            }
        });
        if (!response.getOrder_ids().isEmpty()) {
            pollReceipt(response.getOrder_ids());
        } else {
            getScheduleInformation(response.getSchedule_ids());
            loadAccount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowOrderConfirmationViewState onOrderReceived$lambda$0(ApiInvestFlowPostResponse apiInvestFlowPostResponse, InvestFlowOrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowOrderConfirmationViewState.copy$default(applyMutation, apiInvestFlowPostResponse.getOrder_ids(), apiInvestFlowPostResponse.getSchedule_ids(), CollectionsKt.emptyList(), null, null, null, 56, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStop() {
        super.onStop();
        logReceiptDisappear();
    }

    private final void loadAccount() {
        LifecycleHost.DefaultImpls.bind$default(this, this.accountProvider.streamAccount(((InvestFlowOrderConfirmationArgs) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.confirmation.InvestFlowOrderConfirmationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowOrderConfirmationDuxo.loadAccount$lambda$2(this.f$0, (Account) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadAccount$lambda$2(InvestFlowOrderConfirmationDuxo investFlowOrderConfirmationDuxo, final Account account) {
        Intrinsics.checkNotNullParameter(account, "account");
        investFlowOrderConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.confirmation.InvestFlowOrderConfirmationDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowOrderConfirmationDuxo.loadAccount$lambda$2$lambda$1(account, (InvestFlowOrderConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowOrderConfirmationViewState loadAccount$lambda$2$lambda$1(Account account, InvestFlowOrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowOrderConfirmationViewState.copy$default(applyMutation, null, null, null, null, null, account, 31, null);
    }

    private final void pollReceipt(List<UUID> orderIds) {
        Observable<InvestFlowReceiptResponse> observable = this.investFlowStore.getReceipt(new ApiInvestFlowReceiptPostBody(orderIds, ApiAssetType.EQUITY)).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        Duration durationOfSeconds = Duration.ofSeconds(3L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.poll$default(observable, durationOfSeconds, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.confirmation.InvestFlowOrderConfirmationDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowOrderConfirmationDuxo.pollReceipt$lambda$4(this.f$0, (InvestFlowReceiptResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pollReceipt$lambda$4(InvestFlowOrderConfirmationDuxo investFlowOrderConfirmationDuxo, final InvestFlowReceiptResponse investFlowReceiptResponse) {
        investFlowOrderConfirmationDuxo.logReceiptAppear();
        investFlowOrderConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.confirmation.InvestFlowOrderConfirmationDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowOrderConfirmationDuxo.pollReceipt$lambda$4$lambda$3(investFlowReceiptResponse, (InvestFlowOrderConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowOrderConfirmationViewState pollReceipt$lambda$4$lambda$3(InvestFlowReceiptResponse investFlowReceiptResponse, InvestFlowOrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowOrderConfirmationViewState.copy$default(applyMutation, null, null, null, null, investFlowReceiptResponse, null, 47, null);
    }

    private final void getScheduleInformation(List<UUID> scheduleIds) {
        Observable observableDoOnNext = Observable.fromIterable(scheduleIds).flatMapSingle(new Function() { // from class: com.robinhood.android.investFlow.confirmation.InvestFlowOrderConfirmationDuxo.getScheduleInformation.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends InvestmentSchedule> apply(UUID scheduleId) {
                Intrinsics.checkNotNullParameter(scheduleId, "scheduleId");
                return InvestFlowOrderConfirmationDuxo.this.investmentScheduleStore.fetchInvestmentSchedule(scheduleId);
            }
        }).doOnNext(new Consumer() { // from class: com.robinhood.android.investFlow.confirmation.InvestFlowOrderConfirmationDuxo.getScheduleInformation.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(InvestmentSchedule investmentSchedule) {
                UUID achRelationshipId = investmentSchedule.getAchRelationshipId();
                if (achRelationshipId != null) {
                    InvestFlowOrderConfirmationDuxo.this.getAchRelationshipInformation(achRelationshipId);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDoOnNext, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.confirmation.InvestFlowOrderConfirmationDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowOrderConfirmationDuxo.getScheduleInformation$lambda$6(this.f$0, (InvestmentSchedule) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getScheduleInformation$lambda$6(InvestFlowOrderConfirmationDuxo investFlowOrderConfirmationDuxo, final InvestmentSchedule investmentSchedule) {
        investFlowOrderConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.confirmation.InvestFlowOrderConfirmationDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowOrderConfirmationDuxo.getScheduleInformation$lambda$6$lambda$5(investmentSchedule, (InvestFlowOrderConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowOrderConfirmationViewState getScheduleInformation$lambda$6$lambda$5(InvestmentSchedule investmentSchedule, InvestFlowOrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        List mutableList = CollectionsKt.toMutableList((Collection) applyMutation.getSchedules());
        Intrinsics.checkNotNull(investmentSchedule);
        mutableList.add(investmentSchedule);
        return InvestFlowOrderConfirmationViewState.copy$default(applyMutation, null, null, mutableList, null, null, null, 59, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getAchRelationshipInformation(UUID achRelationshipId) {
        LifecycleHost.DefaultImpls.bind$default(this, this.achRelationshipStore.getAchRelationship(achRelationshipId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.confirmation.InvestFlowOrderConfirmationDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowOrderConfirmationDuxo.getAchRelationshipInformation$lambda$8(this.f$0, (AchRelationship) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAchRelationshipInformation$lambda$8(InvestFlowOrderConfirmationDuxo investFlowOrderConfirmationDuxo, final AchRelationship relationship) {
        Intrinsics.checkNotNullParameter(relationship, "relationship");
        investFlowOrderConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.confirmation.InvestFlowOrderConfirmationDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowOrderConfirmationDuxo.getAchRelationshipInformation$lambda$8$lambda$7(relationship, (InvestFlowOrderConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowOrderConfirmationViewState getAchRelationshipInformation$lambda$8$lambda$7(AchRelationship achRelationship, InvestFlowOrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowOrderConfirmationViewState.copy$default(applyMutation, null, null, null, achRelationship, null, null, 55, null);
    }

    public final void logButtonTap(UserInteractionEventData.Action action, InvestFlowContext.OrderStatus orderStatus) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(orderStatus, "orderStatus");
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, action, new Screen(Screen.Name.INVEST_FLOW_ORDER_RECEIPT, null, null, null, 14, null), new Component(Component.ComponentType.ROW, null, null, 6, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new InvestFlowContext(InvestFlowContext.Allocation.DEFAULT, orderStatus, InvestFlowContext.EntryPoint.INVEST_FLOW_ENTRY_POINT_UNSPECIFIED, "", ((InvestFlowOrderConfirmationArgs) INSTANCE.getArgs((HasSavedState) this)).getLoggingParams().getSource(), null, 32, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -524289, -1, -1, -1, 16383, null), false, 40, null);
    }

    private final void logReceiptAppear() {
        EventLogger.DefaultImpls.logScreenAppear$default(this.eventLogger, null, new Screen(Screen.Name.INVEST_FLOW_ORDER_RECEIPT, null, null, null, 14, null), null, null, null, 29, null);
    }

    private final void logReceiptDisappear() {
        EventLogger.DefaultImpls.logScreenDisappear$default(this.eventLogger, null, new Screen(Screen.Name.INVEST_FLOW_ORDER_RECEIPT, null, null, null, 14, null), null, null, null, 29, null);
    }

    /* compiled from: InvestFlowOrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investFlow/confirmation/InvestFlowOrderConfirmationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/investFlow/confirmation/InvestFlowOrderConfirmationDuxo;", "Lcom/robinhood/android/investFlow/confirmation/InvestFlowOrderConfirmationArgs;", "<init>", "()V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<InvestFlowOrderConfirmationDuxo, InvestFlowOrderConfirmationArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InvestFlowOrderConfirmationArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InvestFlowOrderConfirmationArgs) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InvestFlowOrderConfirmationArgs getArgs(InvestFlowOrderConfirmationDuxo investFlowOrderConfirmationDuxo) {
            return (InvestFlowOrderConfirmationArgs) DuxoCompanion.DefaultImpls.getArgs(this, investFlowOrderConfirmationDuxo);
        }
    }
}
