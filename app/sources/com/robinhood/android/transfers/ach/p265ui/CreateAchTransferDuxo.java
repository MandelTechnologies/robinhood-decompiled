package com.robinhood.android.transfers.ach.p265ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.gold.GoldWithdrawableCashBreakdown;
import com.robinhood.android.common.gold.GoldWithdrawableCashBreakdown2;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.transfers.ach.p265ui.CreateAchTransferFragment;
import com.robinhood.android.transfers.ach.p265ui.CreateAchTransferViewState2;
import com.robinhood.android.transfers.ach.p265ui.experiments.OnboardingRecurringDepositCleanup;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.BalancesStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesAndroid;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateAchTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001fB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ \u0010\u001a\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/CreateAchTransferDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/transfers/ach/ui/CreateAchTransferViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/BalancesStore;Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "transferContext", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "onCreate", "", "onResume", "validateDeposit", "amount", "Ljava/math/BigDecimal;", "validateWithdrawal", "maxTransferSize", "", "Lcom/robinhood/android/transfers/ach/ui/ValidationResult;", "state", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class CreateAchTransferDuxo extends OldBaseDuxo<CreateAchTransferViewState> implements HasSavedState {
    private final AchRelationshipStore achRelationshipStore;
    private final BalancesStore balancesStore;
    private final ExperimentsStore experimentsStore;
    private final TraderMarketHoursManager marketHoursManager;
    private final SavedStateHandle savedStateHandle;
    private TransferContext transferContext;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public CreateAchTransferDuxo(BalancesStore balancesStore, AchRelationshipStore achRelationshipStore, TraderMarketHoursManager marketHoursManager, ExperimentsStore experimentsStore, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        UnifiedBalances unifiedBalances = null;
        AchRelationship achRelationship = null;
        UiEvent uiEvent = null;
        boolean z = false;
        boolean z2 = false;
        super(new CreateAchTransferViewState(unifiedBalances, achRelationship, uiEvent, ((CreateAchTransferFragment.Args) companion.getArgs(savedStateHandle)).getTransferContext().showDepositFrequencyButton(), ((CreateAchTransferFragment.Args) companion.getArgs(savedStateHandle)).getTransferContext().getIsDepositFrequencyButtonClickable(), z, z2, ((CreateAchTransferFragment.Args) companion.getArgs(savedStateHandle)).getTransferContext().getDirection(), ((CreateAchTransferFragment.Args) companion.getArgs(savedStateHandle)).getDepositFrequency(), 103, null), null, 2, 0 == true ? 1 : 0);
        this.balancesStore = balancesStore;
        this.achRelationshipStore = achRelationshipStore;
        this.marketHoursManager = marketHoursManager;
        this.experimentsStore = experimentsStore;
        this.savedStateHandle = savedStateHandle;
        this.transferContext = ((CreateAchTransferFragment.Args) companion.getArgs(getSavedStateHandle())).getTransferContext();
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        if (((CreateAchTransferFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getTransferContext() instanceof TransferContext.RecurringDepositFromOnboarding) {
            LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{OnboardingRecurringDepositCleanup.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.CreateAchTransferDuxo$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateAchTransferDuxo.onCreate$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.CreateAchTransferDuxo$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateAchTransferDuxo.onCreate$lambda$2((CreateAchTransferViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(CreateAchTransferDuxo createAchTransferDuxo, final boolean z) {
        createAchTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.CreateAchTransferDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateAchTransferDuxo.onCreate$lambda$1$lambda$0(z, (CreateAchTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateAchTransferViewState onCreate$lambda$1$lambda$0(boolean z, CreateAchTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateAchTransferViewState.copy$default(applyMutation, null, null, null, false, false, z, false, null, null, 479, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateAchTransferViewState onCreate$lambda$2(CreateAchTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateAchTransferViewState.copy$default(applyMutation, null, null, null, false, false, false, false, null, null, 479, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        this.achRelationshipStore.refresh(false);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(this.achRelationshipStore.getDefaultAchRelationship()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.CreateAchTransferDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateAchTransferDuxo.onResume$lambda$4(this.f$0, (Optional) obj);
            }
        });
        if (this.transferContext.getDirection() == TransferDirection.WITHDRAW) {
            this.balancesStore.refreshIndividualAccount(false);
            LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(asObservable(this.balancesStore.streamIndividualAccountUnifiedBalances())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.CreateAchTransferDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateAchTransferDuxo.onResume$lambda$6(this.f$0, (UnifiedBalances) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(final CreateAchTransferDuxo createAchTransferDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        final AchRelationship achRelationship = (AchRelationship) optional.component1();
        createAchTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.CreateAchTransferDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateAchTransferDuxo.onResume$lambda$4$lambda$3(achRelationship, createAchTransferDuxo, (CreateAchTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateAchTransferViewState onResume$lambda$4$lambda$3(AchRelationship achRelationship, CreateAchTransferDuxo createAchTransferDuxo, CreateAchTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateAchTransferViewState.copy$default(applyMutation, null, achRelationship, null, false, false, false, createAchTransferDuxo.marketHoursManager.areMarketsOpenExtended(), null, null, 445, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6(final CreateAchTransferDuxo createAchTransferDuxo, final UnifiedBalances account) {
        Intrinsics.checkNotNullParameter(account, "account");
        createAchTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.CreateAchTransferDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateAchTransferDuxo.onResume$lambda$6$lambda$5(account, createAchTransferDuxo, (CreateAchTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateAchTransferViewState onResume$lambda$6$lambda$5(UnifiedBalances unifiedBalances, CreateAchTransferDuxo createAchTransferDuxo, CreateAchTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateAchTransferViewState.copy$default(applyMutation, unifiedBalances, null, null, false, false, false, createAchTransferDuxo.marketHoursManager.areMarketsOpenExtended(), null, null, 446, null);
    }

    public final void validateDeposit(BigDecimal amount) {
        final CreateAchTransferViewState2 valid;
        Intrinsics.checkNotNullParameter(amount, "amount");
        TransferContext transferContext = this.transferContext;
        if ((transferContext instanceof TransferContext.MarginDeposit) && amount.compareTo(transferContext.getMinAmount()) < 0) {
            valid = new CreateAchTransferViewState2.Invalid.DepositBelowMarginMin(this.transferContext.getMinAmount());
        } else {
            valid = new CreateAchTransferViewState2.Valid(amount);
        }
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.CreateAchTransferDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateAchTransferDuxo.validateDeposit$lambda$7(valid, (CreateAchTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateAchTransferViewState validateDeposit$lambda$7(CreateAchTransferViewState2 createAchTransferViewState2, CreateAchTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateAchTransferViewState.copy$default(applyMutation, null, null, new UiEvent(createAchTransferViewState2), false, false, false, false, null, null, 507, null);
    }

    public final void validateWithdrawal(final BigDecimal amount, final int maxTransferSize) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.CreateAchTransferDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateAchTransferDuxo.validateWithdrawal$lambda$8(this.f$0, amount, maxTransferSize, (CreateAchTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateAchTransferViewState validateWithdrawal$lambda$8(CreateAchTransferDuxo createAchTransferDuxo, BigDecimal bigDecimal, int i, CreateAchTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateAchTransferViewState.copy$default(applyMutation, null, null, new UiEvent(createAchTransferDuxo.validateWithdrawal(bigDecimal, applyMutation, i)), false, false, false, false, null, null, 507, null);
    }

    private final CreateAchTransferViewState2 validateWithdrawal(BigDecimal amount, CreateAchTransferViewState state, int maxTransferSize) {
        UnifiedBalances unifiedBalances = state.getUnifiedBalances();
        if (unifiedBalances == null) {
            return new CreateAchTransferViewState2.Valid(amount);
        }
        BigDecimal bigDecimal = new BigDecimal(maxTransferSize);
        if (amount.compareTo(bigDecimal) > 0) {
            return new CreateAchTransferViewState2.Invalid.WithdrawalExceedsLimit(bigDecimal);
        }
        BigDecimal withdrawalLimit = state.getWithdrawalLimit();
        if (withdrawalLimit == null) {
            return new CreateAchTransferViewState2.Valid(amount);
        }
        BigDecimal recommendedWithdrawalAmountForMargin = state.getRecommendedWithdrawalAmountForMargin();
        if (recommendedWithdrawalAmountForMargin != null && amount.compareTo(recommendedWithdrawalAmountForMargin) > 0) {
            return new CreateAchTransferViewState2.Invalid.WithdrawalExceedsMarginRecommended(amount, recommendedWithdrawalAmountForMargin);
        }
        if (withdrawalLimit.compareTo(amount) >= 0) {
            return new CreateAchTransferViewState2.Valid(amount);
        }
        BigDecimal cashHeldForOrders = unifiedBalances.getCashHeldForOrders();
        if (withdrawalLimit.add(cashHeldForOrders).compareTo(amount) >= 0) {
            return new CreateAchTransferViewState2.Invalid.WithdrawalErrorPendingOrders(amount, withdrawalLimit);
        }
        if (unifiedBalances.getBrokerageBalances().isGold()) {
            GoldWithdrawableCashBreakdown goldWithdrawableCashBreakdownCreateGoldWithdrawableCashBreakdown = GoldWithdrawableCashBreakdown2.createGoldWithdrawableCashBreakdown(unifiedBalances);
            if (goldWithdrawableCashBreakdownCreateGoldWithdrawableCashBreakdown.useDistanceFromMin()) {
                BigDecimal bigDecimalAdd = withdrawalLimit.add(goldWithdrawableCashBreakdownCreateGoldWithdrawableCashBreakdown.getGoldMinimum());
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                if (bigDecimalAdd.compareTo(amount) >= 0) {
                    return new CreateAchTransferViewState2.Invalid.WithdrawalErrorGoldTier(amount, withdrawalLimit);
                }
                BigDecimal bigDecimalAdd2 = bigDecimalAdd.add(cashHeldForOrders);
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "add(...)");
                if (bigDecimalAdd2.compareTo(amount) >= 0) {
                    return new CreateAchTransferViewState2.Invalid.WithdrawalErrorPendingOrdersAndGoldTier(amount, withdrawalLimit);
                }
            }
        }
        return new CreateAchTransferViewState2.Invalid.WithdrawalGenericError(withdrawalLimit);
    }

    /* compiled from: CreateAchTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/CreateAchTransferDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ach/ui/CreateAchTransferDuxo;", "Lcom/robinhood/android/transfers/ach/ui/CreateAchTransferFragment$Args;", "<init>", "()V", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CreateAchTransferDuxo, CreateAchTransferFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CreateAchTransferFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CreateAchTransferFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CreateAchTransferFragment.Args getArgs(CreateAchTransferDuxo createAchTransferDuxo) {
            return (CreateAchTransferFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, createAchTransferDuxo);
        }
    }
}
