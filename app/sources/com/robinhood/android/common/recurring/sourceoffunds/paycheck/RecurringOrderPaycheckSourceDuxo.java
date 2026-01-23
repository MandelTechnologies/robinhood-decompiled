package com.robinhood.android.common.recurring.sourceoffunds.paycheck;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderActionType;
import com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.PaycheckInvestmentScheduleStore;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.models.entity.RhEntity;
import com.robinhood.models.p355ui.recurring.paycheck.UiPaycheckInvestmentSchedule;
import com.robinhood.recurring.models.AmountType;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.udf.UiEvent;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderPaycheckSourceDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0017B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/RecurringOrderPaycheckSourceDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/EquityRecurringOrderPaycheckSourceViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "paycheckInvestmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/PaycheckInvestmentScheduleStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;Lcom/robinhood/librobinhood/data/store/PaycheckInvestmentScheduleStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "onCheckChanged", "directDepositRelationshipId", "Ljava/util/UUID;", "onEditPaycheckSource", "onSelectPaycheckSource", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RecurringOrderPaycheckSourceDuxo extends OldBaseDuxo<EquityRecurringOrderPaycheckSourceViewState> implements HasSavedState {
    private final DirectDepositRelationshipStore directDepositRelationshipStore;
    private final TraderInvestmentScheduleStore investmentScheduleStore;
    private final PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore;
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
    public RecurringOrderPaycheckSourceDuxo(DirectDepositRelationshipStore directDepositRelationshipStore, TraderInvestmentScheduleStore investmentScheduleStore, PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore, SavedStateHandle savedStateHandle) {
        InvestmentSchedule investmentSchedule;
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(paycheckInvestmentScheduleStore, "paycheckInvestmentScheduleStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        InvestmentTarget investmentTarget = ((RecurringOrderPaycheckSourceFragment.Args) companion.getArgs(savedStateHandle)).getInvestmentTarget();
        RecurringOrderActionType actionType = ((RecurringOrderPaycheckSourceFragment.Args) companion.getArgs(savedStateHandle)).getActionType();
        String loggingSource = ((RecurringOrderPaycheckSourceFragment.Args) companion.getArgs(savedStateHandle)).getLoggingSource();
        RecurringOrderActionType actionType2 = ((RecurringOrderPaycheckSourceFragment.Args) companion.getArgs(savedStateHandle)).getActionType();
        Scheduler scheduler = null;
        Object[] objArr = 0;
        RecurringOrderActionType.Edit edit = actionType2 instanceof RecurringOrderActionType.Edit ? (RecurringOrderActionType.Edit) actionType2 : null;
        super(new EquityRecurringOrderPaycheckSourceViewState(investmentTarget, actionType, loggingSource, (edit == null || (investmentSchedule = edit.getInvestmentSchedule()) == null) ? null : investmentSchedule.getDirectDepositRelationshipId(), null, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null), scheduler, 2, objArr == true ? 1 : 0);
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.investmentScheduleStore = investmentScheduleStore;
        this.paycheckInvestmentScheduleStore = paycheckInvestmentScheduleStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        AmountType amountType;
        super.onStart();
        DirectDepositRelationshipStore directDepositRelationshipStore = this.directDepositRelationshipStore;
        RhEntity rhEntity = RhEntity.RHY;
        RecurringOrderActionType actionType = ((RecurringOrderPaycheckSourceFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getActionType();
        if (Intrinsics.areEqual(actionType, RecurringOrderActionType.Create.INSTANCE)) {
            amountType = null;
        } else {
            if (!(actionType instanceof RecurringOrderActionType.Edit)) {
                throw new NoWhenBranchMatchedException();
            }
            amountType = ((RecurringOrderActionType.Edit) actionType).getInvestmentSchedule().getInvestmentScheduleAmount().getAmountType();
        }
        LifecycleHost.DefaultImpls.bind$default(this, directDepositRelationshipStore.getDirectDepositRelationshipsForAmountType(rhEntity, amountType), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderPaycheckSourceDuxo.onStart$lambda$2(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(RecurringOrderPaycheckSourceDuxo recurringOrderPaycheckSourceDuxo, final List directDepositRelationships) {
        Intrinsics.checkNotNullParameter(directDepositRelationships, "directDepositRelationships");
        recurringOrderPaycheckSourceDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderPaycheckSourceDuxo.onStart$lambda$2$lambda$1(directDepositRelationships, (EquityRecurringOrderPaycheckSourceViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityRecurringOrderPaycheckSourceViewState onStart$lambda$2$lambda$1(List list, EquityRecurringOrderPaycheckSourceViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EquityRecurringOrderPaycheckSourceViewState.copy$default(applyMutation, null, null, null, null, list, false, null, null, 239, null);
    }

    public final void onCheckChanged(final UUID directDepositRelationshipId) {
        Intrinsics.checkNotNullParameter(directDepositRelationshipId, "directDepositRelationshipId");
        applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderPaycheckSourceDuxo.onCheckChanged$lambda$3(directDepositRelationshipId, (EquityRecurringOrderPaycheckSourceViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityRecurringOrderPaycheckSourceViewState onCheckChanged$lambda$3(UUID uuid, EquityRecurringOrderPaycheckSourceViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return !Intrinsics.areEqual(applyMutation.getSelectedDirectDepositRelationshipId(), uuid) ? EquityRecurringOrderPaycheckSourceViewState.copy$default(applyMutation, null, null, null, uuid, null, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null) : applyMutation;
    }

    public final void onEditPaycheckSource(UUID directDepositRelationshipId) {
        Intrinsics.checkNotNullParameter(directDepositRelationshipId, "directDepositRelationshipId");
        applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderPaycheckSourceDuxo.onEditPaycheckSource$lambda$4((EquityRecurringOrderPaycheckSourceViewState) obj);
            }
        });
        TraderInvestmentScheduleStore traderInvestmentScheduleStore = this.investmentScheduleStore;
        RecurringOrderActionType actionType = ((RecurringOrderPaycheckSourceFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getActionType();
        Intrinsics.checkNotNull(actionType, "null cannot be cast to non-null type com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderActionType.Edit");
        LifecycleHost.DefaultImpls.bind$default(this, TraderInvestmentScheduleStore.updateInvestmentSchedule$default(traderInvestmentScheduleStore, ((RecurringOrderActionType.Edit) actionType).getInvestmentScheduleId(), null, null, null, null, directDepositRelationshipId, null, null, null, 478, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderPaycheckSourceDuxo.onEditPaycheckSource$lambda$6(this.f$0, (InvestmentSchedule) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderPaycheckSourceDuxo.onEditPaycheckSource$lambda$8(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityRecurringOrderPaycheckSourceViewState onEditPaycheckSource$lambda$4(EquityRecurringOrderPaycheckSourceViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EquityRecurringOrderPaycheckSourceViewState.copy$default(applyMutation, null, null, null, null, null, true, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEditPaycheckSource$lambda$6(RecurringOrderPaycheckSourceDuxo recurringOrderPaycheckSourceDuxo, InvestmentSchedule it) {
        Intrinsics.checkNotNullParameter(it, "it");
        recurringOrderPaycheckSourceDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderPaycheckSourceDuxo.onEditPaycheckSource$lambda$6$lambda$5((EquityRecurringOrderPaycheckSourceViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityRecurringOrderPaycheckSourceViewState onEditPaycheckSource$lambda$6$lambda$5(EquityRecurringOrderPaycheckSourceViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Result.Companion companion = Result.INSTANCE;
        return EquityRecurringOrderPaycheckSourceViewState.copy$default(applyMutation, null, null, null, null, null, false, new UiEvent(Result.m28549boximpl(Result.m28550constructorimpl(Unit.INSTANCE))), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEditPaycheckSource$lambda$8(RecurringOrderPaycheckSourceDuxo recurringOrderPaycheckSourceDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        recurringOrderPaycheckSourceDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderPaycheckSourceDuxo.onEditPaycheckSource$lambda$8$lambda$7(throwable, (EquityRecurringOrderPaycheckSourceViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityRecurringOrderPaycheckSourceViewState onEditPaycheckSource$lambda$8$lambda$7(Throwable th, EquityRecurringOrderPaycheckSourceViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Result.Companion companion = Result.INSTANCE;
        return EquityRecurringOrderPaycheckSourceViewState.copy$default(applyMutation, null, null, null, null, null, false, new UiEvent(Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(th)))), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, null);
    }

    public final void onSelectPaycheckSource(final UUID directDepositRelationshipId) {
        Intrinsics.checkNotNullParameter(directDepositRelationshipId, "directDepositRelationshipId");
        applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderPaycheckSourceDuxo.onSelectPaycheckSource$lambda$9((EquityRecurringOrderPaycheckSourceViewState) obj);
            }
        });
        Observable<R> map = this.paycheckInvestmentScheduleStore.getPaycheckInvestmentSchedules().map(new Function() { // from class: com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceDuxo.onSelectPaycheckSource.2
            @Override // io.reactivex.functions.Function
            public final List<UiPaycheckInvestmentSchedule> apply(List<UiPaycheckInvestmentSchedule> schedules) {
                Intrinsics.checkNotNullParameter(schedules, "schedules");
                UUID uuid = directDepositRelationshipId;
                ArrayList arrayList = new ArrayList();
                for (T t : schedules) {
                    if (Intrinsics.areEqual(((UiPaycheckInvestmentSchedule) t).getDirectDepositRelationshipId(), uuid)) {
                        arrayList.add(t);
                    }
                }
                return arrayList;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderPaycheckSourceDuxo.onSelectPaycheckSource$lambda$11(this.f$0, (List) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderPaycheckSourceDuxo.onSelectPaycheckSource$lambda$13(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityRecurringOrderPaycheckSourceViewState onSelectPaycheckSource$lambda$9(EquityRecurringOrderPaycheckSourceViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EquityRecurringOrderPaycheckSourceViewState.copy$default(applyMutation, null, null, null, null, null, true, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSelectPaycheckSource$lambda$11(RecurringOrderPaycheckSourceDuxo recurringOrderPaycheckSourceDuxo, final List list) {
        recurringOrderPaycheckSourceDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderPaycheckSourceDuxo.onSelectPaycheckSource$lambda$11$lambda$10(list, (EquityRecurringOrderPaycheckSourceViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityRecurringOrderPaycheckSourceViewState onSelectPaycheckSource$lambda$11$lambda$10(List list, EquityRecurringOrderPaycheckSourceViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Result.Companion companion = Result.INSTANCE;
        Intrinsics.checkNotNull(list);
        return EquityRecurringOrderPaycheckSourceViewState.copy$default(applyMutation, null, null, null, null, null, false, null, new UiEvent(Result.m28549boximpl(Result.m28550constructorimpl(new SuccessfulSelectionEvent(list)))), 95, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSelectPaycheckSource$lambda$13(RecurringOrderPaycheckSourceDuxo recurringOrderPaycheckSourceDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        recurringOrderPaycheckSourceDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderPaycheckSourceDuxo.onSelectPaycheckSource$lambda$13$lambda$12(throwable, (EquityRecurringOrderPaycheckSourceViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityRecurringOrderPaycheckSourceViewState onSelectPaycheckSource$lambda$13$lambda$12(Throwable th, EquityRecurringOrderPaycheckSourceViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Result.Companion companion = Result.INSTANCE;
        return EquityRecurringOrderPaycheckSourceViewState.copy$default(applyMutation, null, null, null, null, null, false, null, new UiEvent(Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(th)))), 95, null);
    }

    /* compiled from: RecurringOrderPaycheckSourceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/RecurringOrderPaycheckSourceDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/RecurringOrderPaycheckSourceDuxo;", "Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/RecurringOrderPaycheckSourceFragment$Args;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RecurringOrderPaycheckSourceDuxo, RecurringOrderPaycheckSourceFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecurringOrderPaycheckSourceFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RecurringOrderPaycheckSourceFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecurringOrderPaycheckSourceFragment.Args getArgs(RecurringOrderPaycheckSourceDuxo recurringOrderPaycheckSourceDuxo) {
            return (RecurringOrderPaycheckSourceFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, recurringOrderPaycheckSourceDuxo);
        }
    }
}
