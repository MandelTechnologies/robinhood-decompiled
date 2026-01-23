package com.robinhood.android.common.recurring.trade.confirmation;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.recurring.trade.RecurringOrderManager;
import com.robinhood.android.common.recurring.trade.confirmation.RecurringBrokerageCashTransferConfirmationFragment;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.models.retirement.p194db.RetirementMatchRate;
import com.robinhood.android.recurring.contracts.RecurringOrderConfiguration;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore;
import com.robinhood.lib.sweep.enrollment.api.ApiSweepEnrollment;
import com.robinhood.librobinhood.data.store.SweepsTimelineSummaryStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementMatchStore;
import com.robinhood.models.api.ApiSweepsTimelineSummary;
import com.robinhood.models.p320db.mcduckling.SweepsTimelineSummary;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Singles;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecurringBrokerageCashTransferConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0016B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringBrokerageCashTransferConfirmationDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringBrokerageCashTransferConfirmationViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "sweepEnrollmentStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "sweepsTimelineSummaryStore", "Lcom/robinhood/librobinhood/data/store/SweepsTimelineSummaryStore;", "orderManager", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderManager;", "retirementMatchStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;Lcom/robinhood/librobinhood/data/store/SweepsTimelineSummaryStore;Lcom/robinhood/android/common/recurring/trade/RecurringOrderManager;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringBrokerageCashTransferConfirmationDuxo extends OldBaseDuxo<RecurringBrokerageCashTransferConfirmationViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final RecurringOrderManager orderManager;
    private final RetirementMatchStore retirementMatchStore;
    private final SavedStateHandle savedStateHandle;
    private final SweepEnrollmentStore sweepEnrollmentStore;
    private final SweepsTimelineSummaryStore sweepsTimelineSummaryStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public RecurringBrokerageCashTransferConfirmationDuxo(AccountProvider accountProvider, SweepEnrollmentStore sweepEnrollmentStore, SweepsTimelineSummaryStore sweepsTimelineSummaryStore, RecurringOrderManager orderManager, RetirementMatchStore retirementMatchStore, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
        Intrinsics.checkNotNullParameter(sweepsTimelineSummaryStore, "sweepsTimelineSummaryStore");
        Intrinsics.checkNotNullParameter(orderManager, "orderManager");
        Intrinsics.checkNotNullParameter(retirementMatchStore, "retirementMatchStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new RecurringBrokerageCashTransferConfirmationViewState(null, ((RecurringBrokerageCashTransferConfirmationFragment.Args) companion.getArgs(savedStateHandle)).getAmount(), ((RecurringBrokerageCashTransferConfirmationFragment.Args) companion.getArgs(savedStateHandle)).getAccountType(), null, ((RecurringBrokerageCashTransferConfirmationFragment.Args) companion.getArgs(savedStateHandle)).getPaycheckRecurringBrokerageCashStatus(), 9, null), null, 2, 0 == true ? 1 : 0);
        this.accountProvider = accountProvider;
        this.sweepEnrollmentStore = sweepEnrollmentStore;
        this.sweepsTimelineSummaryStore = sweepsTimelineSummaryStore;
        this.orderManager = orderManager;
        this.retirementMatchStore = retirementMatchStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        Observable map = this.accountProvider.getIndividualAccountNumberMaybe().flatMapObservable(new Function() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringBrokerageCashTransferConfirmationDuxo$onStart$enrolledInSweepSingle$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ApiSweepEnrollment> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return this.this$0.sweepEnrollmentStore.getSweepEnrollmentObservable(accountNumber);
            }
        }).take(1L).map(new Function() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringBrokerageCashTransferConfirmationDuxo$onStart$enrolledInSweepSingle$2
            @Override // io.reactivex.functions.Function
            public final Boolean apply(ApiSweepEnrollment it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getSweepEnrolled());
            }
        });
        Boolean bool = Boolean.FALSE;
        Single single = map.single(bool);
        Single single2 = SweepsTimelineSummaryStore.getTimelineSummaryIndividualAccount$default(this.sweepsTimelineSummaryStore, null, 1, null).take(1L).map(new Function() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringBrokerageCashTransferConfirmationDuxo$onStart$eligibleForSweepSingle$1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(SweepsTimelineSummary it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getStatus() != ApiSweepsTimelineSummary.Status.PAUSED);
            }
        }).single(bool);
        Singles singles = Singles.INSTANCE;
        Intrinsics.checkNotNull(single);
        Intrinsics.checkNotNull(single2);
        Single singleZip = Single.zip(single, single2, new BiFunction<Boolean, Boolean, R>() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringBrokerageCashTransferConfirmationDuxo$onStart$$inlined$zip$1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(Boolean t, Boolean u) {
                Intrinsics.checkParameterIsNotNull(t, "t");
                Intrinsics.checkParameterIsNotNull(u, "u");
                return (R) new RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus(t.booleanValue(), u.booleanValue());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(singleZip, "Single.zip(s1, s2, BiFun…-> zipper.invoke(t, u) })");
        LifecycleHost.DefaultImpls.bind$default(this, singleZip, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringBrokerageCashTransferConfirmationDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringBrokerageCashTransferConfirmationDuxo.onStart$lambda$1(this.f$0, (RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus) obj);
            }
        });
        Observable<RetirementMatchRate> observableDistinctUntilChanged = this.retirementMatchStore.getQuery().asObservable(Unit.INSTANCE).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringBrokerageCashTransferConfirmationDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringBrokerageCashTransferConfirmationDuxo.onStart$lambda$3(this.f$0, (RetirementMatchRate) obj);
            }
        });
        Observable observableOfType = OrderSubmissionManager.orderStateChanges$default(this.orderManager, null, 1, null).ofType(OrderSubmissionManager.Result.Submitted.class);
        Intrinsics.checkExpressionValueIsNotNull(observableOfType, "ofType(R::class.java)");
        LifecycleHost.DefaultImpls.bind$default(this, observableOfType, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringBrokerageCashTransferConfirmationDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringBrokerageCashTransferConfirmationDuxo.onStart$lambda$5(this.f$0, (OrderSubmissionManager.Result.Submitted) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RecurringBrokerageCashTransferConfirmationDuxo recurringBrokerageCashTransferConfirmationDuxo, final RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        recurringBrokerageCashTransferConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringBrokerageCashTransferConfirmationDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringBrokerageCashTransferConfirmationDuxo.onStart$lambda$1$lambda$0(status, (RecurringBrokerageCashTransferConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringBrokerageCashTransferConfirmationViewState onStart$lambda$1$lambda$0(RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus, RecurringBrokerageCashTransferConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringBrokerageCashTransferConfirmationViewState.copy$default(applyMutation, null, null, null, null, paycheckRecurringBrokerageCashStatus, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(RecurringBrokerageCashTransferConfirmationDuxo recurringBrokerageCashTransferConfirmationDuxo, final RetirementMatchRate retirementMatchRate) {
        recurringBrokerageCashTransferConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringBrokerageCashTransferConfirmationDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringBrokerageCashTransferConfirmationDuxo.onStart$lambda$3$lambda$2(retirementMatchRate, (RecurringBrokerageCashTransferConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringBrokerageCashTransferConfirmationViewState onStart$lambda$3$lambda$2(RetirementMatchRate retirementMatchRate, RecurringBrokerageCashTransferConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringBrokerageCashTransferConfirmationViewState.copy$default(applyMutation, null, null, null, retirementMatchRate, null, 23, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(RecurringBrokerageCashTransferConfirmationDuxo recurringBrokerageCashTransferConfirmationDuxo, final OrderSubmissionManager.Result.Submitted result) {
        Intrinsics.checkNotNullParameter(result, "result");
        recurringBrokerageCashTransferConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringBrokerageCashTransferConfirmationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringBrokerageCashTransferConfirmationDuxo.onStart$lambda$5$lambda$4(result, (RecurringBrokerageCashTransferConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringBrokerageCashTransferConfirmationViewState onStart$lambda$5$lambda$4(OrderSubmissionManager.Result.Submitted submitted, RecurringBrokerageCashTransferConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringBrokerageCashTransferConfirmationViewState.copy$default(applyMutation, (InvestmentSchedule) submitted.getData(), null, null, null, null, 30, null);
    }

    /* compiled from: RecurringBrokerageCashTransferConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringBrokerageCashTransferConfirmationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringBrokerageCashTransferConfirmationDuxo;", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringBrokerageCashTransferConfirmationFragment$Args;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RecurringBrokerageCashTransferConfirmationDuxo, RecurringBrokerageCashTransferConfirmationFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecurringBrokerageCashTransferConfirmationFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RecurringBrokerageCashTransferConfirmationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecurringBrokerageCashTransferConfirmationFragment.Args getArgs(RecurringBrokerageCashTransferConfirmationDuxo recurringBrokerageCashTransferConfirmationDuxo) {
            return (RecurringBrokerageCashTransferConfirmationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, recurringBrokerageCashTransferConfirmationDuxo);
        }
    }
}
