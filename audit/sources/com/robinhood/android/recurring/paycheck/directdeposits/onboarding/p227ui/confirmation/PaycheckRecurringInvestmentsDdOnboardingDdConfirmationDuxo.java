package com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui.confirmation;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui.confirmation.PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "sweepsInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo extends OldBaseDuxo<PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState> implements HasSavedState {
    private final ExperimentsStore experimentsStore;
    private final SavedStateHandle savedStateHandle;
    private final SweepsInterestStore sweepsInterestStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo(ExperimentsStore experimentsStore, SweepsInterestStore sweepsInterestStore, SavedStateHandle savedStateHandle) {
        super(new PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState(PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState.INSTANCE.getConfirmationType((PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.Args) INSTANCE.getArgs(savedStateHandle)), false, null, 6, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.experimentsStore = experimentsStore;
        this.sweepsInterestStore = sweepsInterestStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        Observable observableDistinctUntilChanged = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiment.SYP_POST_DD.INSTANCE}, false, null, 6, null).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.confirmation.PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo.onStart$lambda$1(this.f$0, (Boolean) obj);
            }
        });
        Observable<Optional<BigDecimal>> observableDistinctUntilChanged2 = this.sweepsInterestStore.streamInterestNoAccountNumber().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.confirmation.PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo.onStart$lambda$3(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo paycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo, final Boolean bool) {
        paycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.confirmation.PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo.onStart$lambda$1$lambda$0(bool, (PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState onStart$lambda$1$lambda$0(Boolean bool, PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(bool);
        return PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState.copy$default(applyMutation, null, bool.booleanValue(), null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo paycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo, Optional optional) {
        final BigDecimal bigDecimal = (BigDecimal) optional.component1();
        paycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.confirmation.PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo.onStart$lambda$3$lambda$2(bigDecimal, (PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState onStart$lambda$3$lambda$2(BigDecimal bigDecimal, PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState.copy$default(applyMutation, null, false, bigDecimal, 3, null);
    }

    /* compiled from: PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment$Args;", "<init>", "()V", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo, PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.Args getArgs(PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo paycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo) {
            return (PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, paycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo);
        }
    }
}
