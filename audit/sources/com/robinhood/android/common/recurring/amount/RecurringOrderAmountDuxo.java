package com.robinhood.android.common.recurring.amount;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.recurring.amount.RecurringOrderAmountViewState;
import com.robinhood.android.navigation.app.keys.data.RecurringOrderAmountArgs;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore;
import com.robinhood.recurring.models.InvestmentScheduleAmount;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.udf.UiEvent;
import io.reactivex.Single;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderAmountDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onResume", "", "submitInvestmentScheduleAmountUpdate", "setInvestmentScheduleId", "investmentScheduleId", "Ljava/util/UUID;", "setAmount", "amount", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "setFlowType", "flow", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$FlowType;", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RecurringOrderAmountDuxo extends OldBaseDuxo<RecurringOrderAmountViewState> implements HasSavedState {
    private final TraderInvestmentScheduleStore investmentScheduleStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public RecurringOrderAmountDuxo(TraderInvestmentScheduleStore investmentScheduleStore, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new RecurringOrderAmountViewState(((RecurringOrderAmountArgs) companion.getArgs(savedStateHandle)).getInitialAmount(), ((RecurringOrderAmountArgs) companion.getArgs(savedStateHandle)).getInvestmentScheduleId(), null, null, null, null, ((RecurringOrderAmountArgs) companion.getArgs(savedStateHandle)).getLoggingFlowType(), 60, null), null, 2, 0 == true ? 1 : 0);
        this.investmentScheduleStore = investmentScheduleStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        this.investmentScheduleStore.refresh(false);
        LifecycleHost.DefaultImpls.bind$default(this, this.investmentScheduleStore.getStreamInvestmentSchedule().asObservable(((RecurringOrderAmountArgs) INSTANCE.getArgs((HasSavedState) this)).getInvestmentScheduleId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderAmountDuxo.onResume$lambda$1(this.f$0, (InvestmentSchedule) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(RecurringOrderAmountDuxo recurringOrderAmountDuxo, final InvestmentSchedule investmentSchedule) {
        Intrinsics.checkNotNullParameter(investmentSchedule, "investmentSchedule");
        recurringOrderAmountDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderAmountDuxo.onResume$lambda$1$lambda$0(investmentSchedule, (RecurringOrderAmountViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderAmountViewState onResume$lambda$1$lambda$0(InvestmentSchedule investmentSchedule, RecurringOrderAmountViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderAmountViewState.copy$default(applyMutation, null, null, investmentSchedule, null, null, null, null, 123, null);
    }

    public final void submitInvestmentScheduleAmountUpdate() {
        InvestmentSchedule investmentSchedule;
        InvestmentTarget investmentTarget;
        ApiAssetType targetType;
        RecurringOrderAmountViewState recurringOrderAmountViewStateBlockingFirst = getStates().blockingFirst();
        final InvestmentScheduleAmount amount = recurringOrderAmountViewStateBlockingFirst.getAmount();
        if (((RecurringOrderAmountArgs) INSTANCE.getArgs((HasSavedState) this)).getFromInvestFlow()) {
            applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringOrderAmountDuxo.submitInvestmentScheduleAmountUpdate$lambda$9$lambda$2(amount, (RecurringOrderAmountViewState) obj);
                }
            });
            return;
        }
        UUID scheduleId = recurringOrderAmountViewStateBlockingFirst.getScheduleId();
        if (scheduleId == null || (investmentSchedule = recurringOrderAmountViewStateBlockingFirst.getInvestmentSchedule()) == null || (investmentTarget = investmentSchedule.getInvestmentTarget()) == null || (targetType = investmentTarget.getTargetType()) == null) {
            return;
        }
        if (amount.isValid(targetType)) {
            Single<InvestmentSchedule> singleDoOnSubscribe = this.investmentScheduleStore.updateInvestmentScheduleAmount(scheduleId, recurringOrderAmountViewStateBlockingFirst.getInvestmentSchedule().getDirectDepositRelationshipId(), amount).doOnSubscribe(new RecurringOrderAmountDuxo2(this));
            Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
            LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountDuxo$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringOrderAmountDuxo.submitInvestmentScheduleAmountUpdate$lambda$9$lambda$4(this.f$0, amount, (InvestmentSchedule) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountDuxo$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringOrderAmountDuxo.submitInvestmentScheduleAmountUpdate$lambda$9$lambda$6(this.f$0, (Throwable) obj);
                }
            });
        } else {
            if (amount.isAboveMaxThreshold(targetType)) {
                applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountDuxo$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RecurringOrderAmountDuxo.submitInvestmentScheduleAmountUpdate$lambda$9$lambda$7((RecurringOrderAmountViewState) obj);
                    }
                });
                return;
            }
            if (amount.isBelowMinThreshold()) {
                applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountDuxo$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RecurringOrderAmountDuxo.submitInvestmentScheduleAmountUpdate$lambda$9$lambda$8((RecurringOrderAmountViewState) obj);
                    }
                });
                return;
            }
            throw new IllegalStateException(("Amount " + amount.format() + " in unexpected state").toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderAmountViewState submitInvestmentScheduleAmountUpdate$lambda$9$lambda$2(InvestmentScheduleAmount investmentScheduleAmount, RecurringOrderAmountViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderAmountViewState.copy$default(applyMutation, investmentScheduleAmount, null, null, null, null, new RecurringOrderAmountViewState.UpdateAmountState.Success(new UiEvent(investmentScheduleAmount)), null, 94, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitInvestmentScheduleAmountUpdate$lambda$9$lambda$4(RecurringOrderAmountDuxo recurringOrderAmountDuxo, final InvestmentScheduleAmount investmentScheduleAmount, InvestmentSchedule investmentSchedule) {
        recurringOrderAmountDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderAmountDuxo.submitInvestmentScheduleAmountUpdate$lambda$9$lambda$4$lambda$3(investmentScheduleAmount, (RecurringOrderAmountViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderAmountViewState submitInvestmentScheduleAmountUpdate$lambda$9$lambda$4$lambda$3(InvestmentScheduleAmount investmentScheduleAmount, RecurringOrderAmountViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderAmountViewState.copy$default(applyMutation, investmentScheduleAmount, null, null, null, null, new RecurringOrderAmountViewState.UpdateAmountState.Success(new UiEvent(investmentScheduleAmount)), null, 94, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitInvestmentScheduleAmountUpdate$lambda$9$lambda$6(RecurringOrderAmountDuxo recurringOrderAmountDuxo, final Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        recurringOrderAmountDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderAmountDuxo.submitInvestmentScheduleAmountUpdate$lambda$9$lambda$6$lambda$5(t, (RecurringOrderAmountViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderAmountViewState submitInvestmentScheduleAmountUpdate$lambda$9$lambda$6$lambda$5(Throwable th, RecurringOrderAmountViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderAmountViewState.copy$default(applyMutation, null, null, null, null, null, new RecurringOrderAmountViewState.UpdateAmountState.Error(new UiEvent(th)), null, 95, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderAmountViewState submitInvestmentScheduleAmountUpdate$lambda$9$lambda$7(RecurringOrderAmountViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderAmountViewState.copy$default(applyMutation, null, null, null, new UiEvent(Unit.INSTANCE), null, null, null, 119, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderAmountViewState submitInvestmentScheduleAmountUpdate$lambda$9$lambda$8(RecurringOrderAmountViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderAmountViewState.copy$default(applyMutation, null, null, null, null, new UiEvent(Unit.INSTANCE), null, null, 111, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderAmountViewState setInvestmentScheduleId$lambda$10(UUID uuid, RecurringOrderAmountViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderAmountViewState.copy$default(applyMutation, null, uuid, null, null, null, null, null, 125, null);
    }

    public final void setInvestmentScheduleId(final UUID investmentScheduleId) {
        applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderAmountDuxo.setInvestmentScheduleId$lambda$10(investmentScheduleId, (RecurringOrderAmountViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderAmountViewState setAmount$lambda$11(InvestmentScheduleAmount investmentScheduleAmount, RecurringOrderAmountViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderAmountViewState.copy$default(applyMutation, investmentScheduleAmount, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
    }

    public final void setAmount(final InvestmentScheduleAmount amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderAmountDuxo.setAmount$lambda$11(amount, (RecurringOrderAmountViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderAmountViewState setFlowType$lambda$12(RecurringContext.FlowType flowType, RecurringOrderAmountViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderAmountViewState.copy$default(applyMutation, null, null, null, null, null, null, flowType, 63, null);
    }

    public final void setFlowType(final RecurringContext.FlowType flow) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderAmountDuxo.setFlowType$lambda$12(flow, (RecurringOrderAmountViewState) obj);
            }
        });
    }

    /* compiled from: RecurringOrderAmountDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountDuxo;", "Lcom/robinhood/android/navigation/app/keys/data/RecurringOrderAmountArgs;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RecurringOrderAmountDuxo, RecurringOrderAmountArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecurringOrderAmountArgs getArgs(SavedStateHandle savedStateHandle) {
            return (RecurringOrderAmountArgs) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecurringOrderAmountArgs getArgs(RecurringOrderAmountDuxo recurringOrderAmountDuxo) {
            return (RecurringOrderAmountArgs) DuxoCompanion.DefaultImpls.getArgs(this, recurringOrderAmountDuxo);
        }
    }
}
