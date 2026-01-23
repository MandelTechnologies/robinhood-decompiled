package com.robinhood.android.paycheckhub.p213ui;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.models.retirement.p194db.RetirementMatchRate;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.PaycheckInvestmentScheduleStore;
import com.robinhood.librobinhood.data.store.SweepsStatus;
import com.robinhood.librobinhood.data.store.SweepsStatusStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementMatchStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaycheckRecurringInvestmentsHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsHubDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsHubViewState;", "paycheckInvestmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/PaycheckInvestmentScheduleStore;", "sweepsStatusStore", "Lcom/robinhood/librobinhood/data/store/SweepsStatusStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "retirementMatchStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/PaycheckInvestmentScheduleStore;Lcom/robinhood/librobinhood/data/store/SweepsStatusStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;)V", "onStart", "", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PaycheckRecurringInvestmentsHubDuxo extends OldBaseDuxo<PaycheckRecurringInvestmentsHubViewState> {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore;
    private final RetirementMatchStore retirementMatchStore;
    private final SweepsStatusStore sweepsStatusStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaycheckRecurringInvestmentsHubDuxo(PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore, SweepsStatusStore sweepsStatusStore, AccountProvider accountProvider, RetirementMatchStore retirementMatchStore) {
        super(new PaycheckRecurringInvestmentsHubViewState(null, null, null, false, null, 31, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(paycheckInvestmentScheduleStore, "paycheckInvestmentScheduleStore");
        Intrinsics.checkNotNullParameter(sweepsStatusStore, "sweepsStatusStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(retirementMatchStore, "retirementMatchStore");
        this.paycheckInvestmentScheduleStore = paycheckInvestmentScheduleStore;
        this.sweepsStatusStore = sweepsStatusStore;
        this.accountProvider = accountProvider;
        this.retirementMatchStore = retirementMatchStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        this.paycheckInvestmentScheduleStore.refresh(true);
        LifecycleHost.DefaultImpls.bind$default(this, this.paycheckInvestmentScheduleStore.getPaycheckInvestmentSchedules(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckRecurringInvestmentsHubDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckRecurringInvestmentsHubDuxo.onStart$lambda$1(this.f$0, (List) obj);
            }
        });
        this.sweepsStatusStore.refresh(true);
        Observable<SweepsStatus> observableDistinctUntilChanged = this.sweepsStatusStore.stream().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckRecurringInvestmentsHubDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckRecurringInvestmentsHubDuxo.onStart$lambda$3(this.f$0, (SweepsStatus) obj);
            }
        });
        this.accountProvider.refresh(true);
        Observable observableDistinctUntilChanged2 = this.accountProvider.streamAllSelfDirectedAccounts().map(new Function() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckRecurringInvestmentsHubDuxo.onStart.3
            @Override // io.reactivex.functions.Function
            public final Optional<String> apply(List<Account> accounts2) {
                T next;
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                Iterator<T> it = accounts2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                    if (((Account) next).getBrokerageAccountType() == BrokerageAccountType.INDIVIDUAL) {
                        break;
                    }
                }
                Account account = next;
                return Optional3.asOptional(account != null ? account.getAccountNumber() : null);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckRecurringInvestmentsHubDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckRecurringInvestmentsHubDuxo.onStart$lambda$5(this.f$0, (Optional) obj);
            }
        });
        this.retirementMatchStore.refresh(true);
        Observable<RetirementMatchRate> observableDistinctUntilChanged3 = this.retirementMatchStore.stream().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckRecurringInvestmentsHubDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckRecurringInvestmentsHubDuxo.onStart$lambda$7(this.f$0, (RetirementMatchRate) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(PaycheckRecurringInvestmentsHubDuxo paycheckRecurringInvestmentsHubDuxo, final List paycheckInvestmentSchedules) {
        Intrinsics.checkNotNullParameter(paycheckInvestmentSchedules, "paycheckInvestmentSchedules");
        paycheckRecurringInvestmentsHubDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckRecurringInvestmentsHubDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckRecurringInvestmentsHubDuxo.onStart$lambda$1$lambda$0(paycheckInvestmentSchedules, (PaycheckRecurringInvestmentsHubViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaycheckRecurringInvestmentsHubViewState onStart$lambda$1$lambda$0(List list, PaycheckRecurringInvestmentsHubViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PaycheckRecurringInvestmentsHubViewState.copy$default(applyMutation, list, null, null, false, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(PaycheckRecurringInvestmentsHubDuxo paycheckRecurringInvestmentsHubDuxo, final SweepsStatus sweepsStatus) {
        paycheckRecurringInvestmentsHubDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckRecurringInvestmentsHubDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckRecurringInvestmentsHubDuxo.onStart$lambda$3$lambda$2(sweepsStatus, (PaycheckRecurringInvestmentsHubViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaycheckRecurringInvestmentsHubViewState onStart$lambda$3$lambda$2(SweepsStatus sweepsStatus, PaycheckRecurringInvestmentsHubViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PaycheckRecurringInvestmentsHubViewState.copy$default(applyMutation, null, sweepsStatus, null, false, null, 29, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(PaycheckRecurringInvestmentsHubDuxo paycheckRecurringInvestmentsHubDuxo, Optional optional) {
        final String str = (String) optional.component1();
        paycheckRecurringInvestmentsHubDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckRecurringInvestmentsHubDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckRecurringInvestmentsHubDuxo.onStart$lambda$5$lambda$4(str, (PaycheckRecurringInvestmentsHubViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaycheckRecurringInvestmentsHubViewState onStart$lambda$5$lambda$4(String str, PaycheckRecurringInvestmentsHubViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PaycheckRecurringInvestmentsHubViewState.copy$default(applyMutation, null, null, null, false, str, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$7(PaycheckRecurringInvestmentsHubDuxo paycheckRecurringInvestmentsHubDuxo, final RetirementMatchRate retirementMatchRate) {
        paycheckRecurringInvestmentsHubDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckRecurringInvestmentsHubDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckRecurringInvestmentsHubDuxo.onStart$lambda$7$lambda$6(retirementMatchRate, (PaycheckRecurringInvestmentsHubViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaycheckRecurringInvestmentsHubViewState onStart$lambda$7$lambda$6(RetirementMatchRate retirementMatchRate, PaycheckRecurringInvestmentsHubViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PaycheckRecurringInvestmentsHubViewState.copy$default(applyMutation, null, null, retirementMatchRate, false, null, 27, null);
    }
}
