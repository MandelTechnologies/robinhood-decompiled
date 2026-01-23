package com.robinhood.android.investFlow.paymentmethod;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.android.investFlow.core.InvestFlowPaymentMethod;
import com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodFragment;
import com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodViewState;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowPaymentMethodDuxo.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001)B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0013J\u0006\u0010\u001c\u001a\u00020\u0013J\u0006\u0010\u001d\u001a\u00020\u0013J\u0006\u0010\u001e\u001a\u00020\u0013J\u0006\u0010\u001f\u001a\u00020\u0013J\u000e\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"J\u000e\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&J\u0006\u0010'\u001a\u00020\u0013J\u0006\u0010(\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "marginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;Lcom/robinhood/analytics/EventLogger;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onResume", "onPaymentMethodUpdated", "paymentMethod", "Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;", "onRowClicked", "row", "Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Row;", "clearSelectedRow", "confirmPayment", "continueClicked", "logRowTap", "logAddAccountTap", "logMarginReminderAction", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "logWithdrawLimitAction", "logBottomSheetAppear", "id", "", "logWithdrawLimitAlertDisappear", "logMarginReminderAlertDisappear", "Companion", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InvestFlowPaymentMethodDuxo extends OldBaseDuxo<InvestFlowPaymentMethodViewState> implements HasSavedState {
    private final AchRelationshipStore achRelationshipStore;
    private final EventLogger eventLogger;
    private final LeveredMarginSettingsStore marginSettingsStore;
    private final SavedStateHandle savedStateHandle;
    private final UnifiedAccountStore unifiedAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public InvestFlowPaymentMethodDuxo(AchRelationshipStore achRelationshipStore, UnifiedAccountStore unifiedAccountStore, LeveredMarginSettingsStore marginSettingsStore, EventLogger eventLogger, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new InvestFlowPaymentMethodViewState(null, null, ((InvestFlowPaymentMethodArgs) companion.getArgs(savedStateHandle)).isCrypto(), null, ((InvestFlowPaymentMethodArgs) companion.getArgs(savedStateHandle)).isBackup(), null, ((InvestFlowPaymentMethodArgs) companion.getArgs(savedStateHandle)).getAccountNumber(), ((InvestFlowPaymentMethodArgs) companion.getArgs(savedStateHandle)).getShowPaymentMethodAnnotation(), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE, null), null, 2, 0 == true ? 1 : 0);
        this.achRelationshipStore = achRelationshipStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.marginSettingsStore = marginSettingsStore;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        final InvestFlowPaymentMethod paymentMethod = ((InvestFlowPaymentMethodArgs) INSTANCE.getArgs((HasSavedState) this)).getPaymentMethod();
        if (paymentMethod != null) {
            if (paymentMethod instanceof InvestFlowPaymentMethod.Ach) {
                applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodDuxo$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InvestFlowPaymentMethodDuxo.onCreate$lambda$2$lambda$0(paymentMethod, this, (InvestFlowPaymentMethodViewState) obj);
                    }
                });
            } else {
                if (!(paymentMethod instanceof InvestFlowPaymentMethod.BuyingPower)) {
                    throw new NoWhenBranchMatchedException();
                }
                applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodDuxo$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InvestFlowPaymentMethodDuxo.onCreate$lambda$2$lambda$1(this.f$0, (InvestFlowPaymentMethodViewState) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowPaymentMethodViewState onCreate$lambda$2$lambda$0(InvestFlowPaymentMethod investFlowPaymentMethod, InvestFlowPaymentMethodDuxo investFlowPaymentMethodDuxo, InvestFlowPaymentMethodViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowPaymentMethodViewState.copy$default(applyMutation, new InvestFlowPaymentMethodFragment.Row.AchRelationship(((InvestFlowPaymentMethod.Ach) investFlowPaymentMethod).getAchRelationship(), ((InvestFlowPaymentMethodArgs) INSTANCE.getArgs(investFlowPaymentMethodDuxo.getSavedStateHandle())).getShowPaymentMethodAnnotation()), null, false, null, false, null, null, false, null, 510, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowPaymentMethodViewState onCreate$lambda$2$lambda$1(InvestFlowPaymentMethodDuxo investFlowPaymentMethodDuxo, InvestFlowPaymentMethodViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Money accountBuyingPower = ((InvestFlowPaymentMethodArgs) INSTANCE.getArgs(investFlowPaymentMethodDuxo.getSavedStateHandle())).getAccountBuyingPower();
        return InvestFlowPaymentMethodViewState.copy$default(applyMutation, new InvestFlowPaymentMethodFragment.Row.BrokerageBuyingPower(accountBuyingPower != null ? Money.format$default(accountBuyingPower, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null), null, false, null, false, null, null, false, null, 510, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        AchRelationshipStore.refresh$default(this.achRelationshipStore, false, 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.achRelationshipStore.getLinkedAchRelationships(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowPaymentMethodDuxo.onResume$lambda$4(this.f$0, (List) obj);
            }
        });
        UnifiedAccountStore unifiedAccountStore = this.unifiedAccountStore;
        Companion companion = INSTANCE;
        LifecycleHost.DefaultImpls.bind$default(this, unifiedAccountStore.streamAccount(((InvestFlowPaymentMethodArgs) companion.getArgs((HasSavedState) this)).getAccountNumber()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowPaymentMethodDuxo.onResume$lambda$6(this.f$0, (Optional) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.marginSettingsStore.streamMarginSettings(((InvestFlowPaymentMethodArgs) companion.getArgs((HasSavedState) this)).getAccountNumber()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowPaymentMethodDuxo.onResume$lambda$8(this.f$0, (MarginSettings) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(InvestFlowPaymentMethodDuxo investFlowPaymentMethodDuxo, final List relationships) {
        Intrinsics.checkNotNullParameter(relationships, "relationships");
        investFlowPaymentMethodDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowPaymentMethodDuxo.onResume$lambda$4$lambda$3(relationships, (InvestFlowPaymentMethodViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowPaymentMethodViewState onResume$lambda$4$lambda$3(List list, InvestFlowPaymentMethodViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowPaymentMethodViewState.copy$default(applyMutation, null, list, false, null, false, null, null, false, null, 509, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6(InvestFlowPaymentMethodDuxo investFlowPaymentMethodDuxo, final Optional account) {
        Intrinsics.checkNotNullParameter(account, "account");
        investFlowPaymentMethodDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowPaymentMethodDuxo.onResume$lambda$6$lambda$5(account, (InvestFlowPaymentMethodViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowPaymentMethodViewState onResume$lambda$6$lambda$5(Optional optional, InvestFlowPaymentMethodViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowPaymentMethodViewState.copy$default(applyMutation, null, null, false, (UnifiedAccountV2) optional.getOrNull(), false, null, null, false, null, 503, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$8(InvestFlowPaymentMethodDuxo investFlowPaymentMethodDuxo, final MarginSettings marginSettings) {
        Intrinsics.checkNotNullParameter(marginSettings, "marginSettings");
        investFlowPaymentMethodDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowPaymentMethodDuxo.onResume$lambda$8$lambda$7(marginSettings, (InvestFlowPaymentMethodViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowPaymentMethodViewState onResume$lambda$8$lambda$7(MarginSettings marginSettings, InvestFlowPaymentMethodViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowPaymentMethodViewState.copy$default(applyMutation, null, null, false, null, false, null, null, false, marginSettings, 255, null);
    }

    public final void onPaymentMethodUpdated(final InvestFlowPaymentMethod paymentMethod) {
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowPaymentMethodDuxo.onPaymentMethodUpdated$lambda$9(paymentMethod, (InvestFlowPaymentMethodViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowPaymentMethodViewState onPaymentMethodUpdated$lambda$9(InvestFlowPaymentMethod investFlowPaymentMethod, InvestFlowPaymentMethodViewState applyMutation) {
        InvestFlowPaymentMethodFragment.Row row;
        InvestFlowPaymentMethodFragment.Row brokerageBuyingPower;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (investFlowPaymentMethod instanceof InvestFlowPaymentMethod.Ach) {
            brokerageBuyingPower = new InvestFlowPaymentMethodFragment.Row.AchRelationship(((InvestFlowPaymentMethod.Ach) investFlowPaymentMethod).getAchRelationship(), applyMutation.getShowPaymentMethodAnnotation());
        } else {
            row = null;
            if (!(investFlowPaymentMethod instanceof InvestFlowPaymentMethod.BuyingPower)) {
                if (investFlowPaymentMethod != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return InvestFlowPaymentMethodViewState.copy$default(applyMutation, row, null, false, null, false, null, null, false, null, 510, null);
            }
            Money accountBuyingPower = applyMutation.getAccountBuyingPower();
            brokerageBuyingPower = new InvestFlowPaymentMethodFragment.Row.BrokerageBuyingPower(accountBuyingPower != null ? Money.format$default(accountBuyingPower, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null);
        }
        row = brokerageBuyingPower;
        return InvestFlowPaymentMethodViewState.copy$default(applyMutation, row, null, false, null, false, null, null, false, null, 510, null);
    }

    public final void onRowClicked(final InvestFlowPaymentMethodFragment.Row row) {
        Intrinsics.checkNotNullParameter(row, "row");
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowPaymentMethodDuxo.onRowClicked$lambda$10(row, (InvestFlowPaymentMethodViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowPaymentMethodViewState onRowClicked$lambda$10(InvestFlowPaymentMethodFragment.Row row, InvestFlowPaymentMethodViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if ((row instanceof InvestFlowPaymentMethodFragment.Row.AchRelationship) || (row instanceof InvestFlowPaymentMethodFragment.Row.BrokerageBuyingPower) || (row instanceof InvestFlowPaymentMethodFragment.Row.RetirementBuyingPower) || (row instanceof InvestFlowPaymentMethodFragment.Row.JointBuyingPower)) {
            return InvestFlowPaymentMethodViewState.copy$default(applyMutation, row, null, false, null, false, null, null, false, null, 510, null);
        }
        return InvestFlowPaymentMethodViewState.copy$default(applyMutation, null, null, false, null, false, null, null, false, null, 511, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowPaymentMethodViewState clearSelectedRow$lambda$11(InvestFlowPaymentMethodViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowPaymentMethodViewState.copy$default(applyMutation, null, null, false, null, false, null, null, false, null, 510, null);
    }

    public final void clearSelectedRow() {
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowPaymentMethodDuxo.clearSelectedRow$lambda$11((InvestFlowPaymentMethodViewState) obj);
            }
        });
    }

    public final void confirmPayment() {
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowPaymentMethodDuxo.confirmPayment$lambda$12(this.f$0, (InvestFlowPaymentMethodViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowPaymentMethodViewState confirmPayment$lambda$12(InvestFlowPaymentMethodDuxo investFlowPaymentMethodDuxo, InvestFlowPaymentMethodViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (applyMutation.showWithdrawalLimit()) {
            investFlowPaymentMethodDuxo.logBottomSheetAppear(InvestFlowConstants.Logging.WITHDRAW_LIMIT);
            return InvestFlowPaymentMethodViewState.copy$default(applyMutation, null, null, false, null, false, new UiEvent(InvestFlowPaymentMethodViewState.ContinueAction.WITHDRAWAL_LIMIT_DIALOG), null, false, null, 479, null);
        }
        if (applyMutation.getShowMarginLimit()) {
            investFlowPaymentMethodDuxo.logBottomSheetAppear(InvestFlowConstants.Logging.MARGIN_REMINDER);
            return InvestFlowPaymentMethodViewState.copy$default(applyMutation, null, null, false, null, false, new UiEvent(InvestFlowPaymentMethodViewState.ContinueAction.MARGIN_LIMIT_DIALOG), null, false, null, 479, null);
        }
        return InvestFlowPaymentMethodViewState.copy$default(applyMutation, null, null, false, null, false, new UiEvent(InvestFlowPaymentMethodViewState.ContinueAction.CONTINUE), null, false, null, 479, null);
    }

    public final void continueClicked() {
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowPaymentMethodDuxo.continueClicked$lambda$13((InvestFlowPaymentMethodViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowPaymentMethodViewState continueClicked$lambda$13(InvestFlowPaymentMethodViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowPaymentMethodViewState.copy$default(applyMutation, null, null, false, null, false, new UiEvent(InvestFlowPaymentMethodViewState.ContinueAction.CONTINUE), null, false, null, 479, null);
    }

    public final void logRowTap() {
        Screen.Name name;
        EventLogger eventLogger = this.eventLogger;
        if (((InvestFlowPaymentMethodArgs) INSTANCE.getArgs((HasSavedState) this)).isBackup()) {
            name = Screen.Name.RECURRING_BACKUP_PAYMENT_METHOD;
        } else {
            name = Screen.Name.RECURRING_PAYMENT_METHOD;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.SELECT_PAYMENT_METHOD, new Screen(name, null, null, null, 14, null), new Component(Component.ComponentType.RECURRING_PAYMENT_METHOD_ROW, null, null, 6, null), null, null, false, 56, null);
    }

    public final void logAddAccountTap() {
        Screen.Name name;
        EventLogger eventLogger = this.eventLogger;
        if (((InvestFlowPaymentMethodArgs) INSTANCE.getArgs((HasSavedState) this)).isBackup()) {
            name = Screen.Name.RECURRING_BACKUP_PAYMENT_METHOD;
        } else {
            name = Screen.Name.RECURRING_PAYMENT_METHOD;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.ADD_PAYMENT_METHOD, new Screen(name, null, null, null, 14, null), new Component(Component.ComponentType.ADD_ACCOUNT, null, null, 6, null), null, null, false, 56, null);
    }

    public final void logMarginReminderAction(UserInteractionEventData.Action action) {
        Screen.Name name;
        Intrinsics.checkNotNullParameter(action, "action");
        EventLogger eventLogger = this.eventLogger;
        Companion companion = INSTANCE;
        if (((InvestFlowPaymentMethodArgs) companion.getArgs((HasSavedState) this)).isBackup()) {
            name = Screen.Name.RECURRING_BACKUP_PAYMENT_METHOD;
        } else {
            name = Screen.Name.RECURRING_PAYMENT_METHOD;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, new Screen(name, ((InvestFlowPaymentMethodArgs) companion.getArgs((HasSavedState) this)).isCrypto() ? InvestFlowConstants.Logging.CRYPTOS : InvestFlowConstants.Logging.STOCKS_AND_ETFS, null, null, 12, null), new Component(Component.ComponentType.BOTTOM_SHEET, InvestFlowConstants.Logging.MARGIN_REMINDER, null, 4, null), null, null, false, 56, null);
    }

    public final void logWithdrawLimitAction(UserInteractionEventData.Action action) {
        Screen.Name name;
        Intrinsics.checkNotNullParameter(action, "action");
        EventLogger eventLogger = this.eventLogger;
        Companion companion = INSTANCE;
        if (((InvestFlowPaymentMethodArgs) companion.getArgs((HasSavedState) this)).isBackup()) {
            name = Screen.Name.RECURRING_BACKUP_PAYMENT_METHOD;
        } else {
            name = Screen.Name.RECURRING_PAYMENT_METHOD;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, new Screen(name, ((InvestFlowPaymentMethodArgs) companion.getArgs((HasSavedState) this)).isCrypto() ? InvestFlowConstants.Logging.CRYPTOS : InvestFlowConstants.Logging.STOCKS_AND_ETFS, null, null, 12, null), new Component(Component.ComponentType.BOTTOM_SHEET, InvestFlowConstants.Logging.WITHDRAW_LIMIT, null, 4, null), null, null, false, 56, null);
    }

    public final void logBottomSheetAppear(String id) {
        Screen.Name name;
        Intrinsics.checkNotNullParameter(id, "id");
        EventLogger eventLogger = this.eventLogger;
        Companion companion = INSTANCE;
        if (((InvestFlowPaymentMethodArgs) companion.getArgs((HasSavedState) this)).isBackup()) {
            name = Screen.Name.RECURRING_BACKUP_PAYMENT_METHOD;
        } else {
            name = Screen.Name.RECURRING_PAYMENT_METHOD;
        }
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, new Screen(name, ((InvestFlowPaymentMethodArgs) companion.getArgs((HasSavedState) this)).isCrypto() ? InvestFlowConstants.Logging.CRYPTOS : InvestFlowConstants.Logging.STOCKS_AND_ETFS, null, null, 12, null), new Component(Component.ComponentType.BOTTOM_SHEET, id, null, 4, null), null, null, 25, null);
    }

    public final void logWithdrawLimitAlertDisappear() {
        Screen.Name name;
        EventLogger eventLogger = this.eventLogger;
        Companion companion = INSTANCE;
        if (((InvestFlowPaymentMethodArgs) companion.getArgs((HasSavedState) this)).isBackup()) {
            name = Screen.Name.RECURRING_BACKUP_PAYMENT_METHOD;
        } else {
            name = Screen.Name.RECURRING_PAYMENT_METHOD;
        }
        EventLogger.DefaultImpls.logDisappear$default(eventLogger, null, new Screen(name, ((InvestFlowPaymentMethodArgs) companion.getArgs((HasSavedState) this)).isCrypto() ? InvestFlowConstants.Logging.CRYPTOS : InvestFlowConstants.Logging.STOCKS_AND_ETFS, null, null, 12, null), new Component(Component.ComponentType.BOTTOM_SHEET, InvestFlowConstants.Logging.WITHDRAW_LIMIT, null, 4, null), null, null, 25, null);
    }

    public final void logMarginReminderAlertDisappear() {
        Screen.Name name;
        EventLogger eventLogger = this.eventLogger;
        Companion companion = INSTANCE;
        if (((InvestFlowPaymentMethodArgs) companion.getArgs((HasSavedState) this)).isBackup()) {
            name = Screen.Name.RECURRING_BACKUP_PAYMENT_METHOD;
        } else {
            name = Screen.Name.RECURRING_PAYMENT_METHOD;
        }
        EventLogger.DefaultImpls.logDisappear$default(eventLogger, null, new Screen(name, ((InvestFlowPaymentMethodArgs) companion.getArgs((HasSavedState) this)).isCrypto() ? InvestFlowConstants.Logging.CRYPTOS : InvestFlowConstants.Logging.STOCKS_AND_ETFS, null, null, 12, null), new Component(Component.ComponentType.BOTTOM_SHEET, InvestFlowConstants.Logging.MARGIN_REMINDER, null, 4, null), null, null, 25, null);
    }

    /* compiled from: InvestFlowPaymentMethodDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodDuxo;", "Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodArgs;", "<init>", "()V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<InvestFlowPaymentMethodDuxo, InvestFlowPaymentMethodArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InvestFlowPaymentMethodArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InvestFlowPaymentMethodArgs) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InvestFlowPaymentMethodArgs getArgs(InvestFlowPaymentMethodDuxo investFlowPaymentMethodDuxo) {
            return (InvestFlowPaymentMethodArgs) DuxoCompanion.DefaultImpls.getArgs(this, investFlowPaymentMethodDuxo);
        }
    }
}
