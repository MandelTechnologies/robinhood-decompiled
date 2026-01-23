package com.robinhood.android.paycheckhub.p213ui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.models.retirement.p194db.RetirementMatchRate;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.EarlyPayEnrollmentStore;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore;
import com.robinhood.librobinhood.data.store.bonfire.PaycheckStore;
import com.robinhood.librobinhood.data.store.bonfire.cashier.DirectDepositSwitchStatusStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementMatchStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EarlyPayEnrollment;
import com.robinhood.models.p320db.bonfire.PaycheckV2;
import com.robinhood.models.p320db.mcduckling.SweepsInterest;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PaycheckHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckHubDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/paycheckhub/ui/PaycheckHubViewState;", "directDepositSwitchStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/cashier/DirectDepositSwitchStatusStore;", "earlyPayEnrollmentStore", "Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "paycheckStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaycheckStore;", "sweepsInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "retirementMatchStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/cashier/DirectDepositSwitchStatusStore;Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore;Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;Lcom/robinhood/librobinhood/data/store/bonfire/PaycheckStore;Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;)V", "onResume", "", "showAllPaychecks", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PaycheckHubDuxo extends OldBaseDuxo<PaycheckHubViewState> {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final DirectDepositSwitchStatusStore directDepositSwitchStatusStore;
    private final EarlyPayEnrollmentStore earlyPayEnrollmentStore;
    private final TraderInvestmentScheduleStore investmentScheduleStore;
    private final PaycheckStore paycheckStore;
    private final RetirementMatchStore retirementMatchStore;
    private final SweepsInterestStore sweepsInterestStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaycheckHubDuxo(DirectDepositSwitchStatusStore directDepositSwitchStatusStore, EarlyPayEnrollmentStore earlyPayEnrollmentStore, TraderInvestmentScheduleStore investmentScheduleStore, PaycheckStore paycheckStore, SweepsInterestStore sweepsInterestStore, AccountProvider accountProvider, RetirementMatchStore retirementMatchStore) {
        super(new PaycheckHubViewState(null, null, null, null, false, null, null, null, 255, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(directDepositSwitchStatusStore, "directDepositSwitchStatusStore");
        Intrinsics.checkNotNullParameter(earlyPayEnrollmentStore, "earlyPayEnrollmentStore");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(paycheckStore, "paycheckStore");
        Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(retirementMatchStore, "retirementMatchStore");
        this.directDepositSwitchStatusStore = directDepositSwitchStatusStore;
        this.earlyPayEnrollmentStore = earlyPayEnrollmentStore;
        this.investmentScheduleStore = investmentScheduleStore;
        this.paycheckStore = paycheckStore;
        this.sweepsInterestStore = sweepsInterestStore;
        this.accountProvider = accountProvider;
        this.retirementMatchStore = retirementMatchStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        this.earlyPayEnrollmentStore.refresh(false);
        LifecycleHost.DefaultImpls.bind$default(this, this.earlyPayEnrollmentStore.streamEnrollment(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckHubDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckHubDuxo.onResume$lambda$1(this.f$0, (EarlyPayEnrollment) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.investmentScheduleStore.getHasPaycheckInvestmentSchedules(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckHubDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckHubDuxo.onResume$lambda$3(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        this.paycheckStore.refresh(true);
        LifecycleHost.DefaultImpls.bind$default(this, this.paycheckStore.getPaychecks(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckHubDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckHubDuxo.onResume$lambda$6(this.f$0, (List) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.directDepositSwitchStatusStore.getDirectDepositSwitchStatus(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckHubDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckHubDuxo.onResume$lambda$8(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        this.sweepsInterestStore.refreshNoAccountNumber(false);
        Observable<R> map = this.sweepsInterestStore.streamNoAccountNumber().map(new Function() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckHubDuxo$onResume$$inlined$mapDistinctNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional((Optional) it);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((PaycheckHubDuxo$onResume$$inlined$mapDistinctNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckHubDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckHubDuxo.onResume$lambda$11(this.f$0, (Optional) obj);
            }
        });
        Observable<R> map2 = this.accountProvider.streamAllSelfDirectedAccounts().map(new Function() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckHubDuxo.onResume.7
            @Override // io.reactivex.functions.Function
            public final Boolean apply(List<Account> accounts2) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                List<Account> list = accounts2;
                boolean z3 = list instanceof Collection;
                boolean z4 = true;
                if (z3 && list.isEmpty()) {
                    z = false;
                } else {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((Account) it.next()).getBrokerageAccountType() == BrokerageAccountType.IRA_ROTH) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                }
                if (z3 && list.isEmpty()) {
                    z2 = false;
                } else {
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (((Account) it2.next()).getBrokerageAccountType() == BrokerageAccountType.IRA_TRADITIONAL) {
                            z2 = true;
                            break;
                        }
                    }
                    z2 = false;
                }
                if (!z && !z2) {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckHubDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckHubDuxo.onResume$lambda$13(this.f$0, (Boolean) obj);
            }
        });
        Observable<RetirementMatchRate> observableDistinctUntilChanged2 = this.retirementMatchStore.stream().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckHubDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckHubDuxo.onResume$lambda$15(this.f$0, (RetirementMatchRate) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(PaycheckHubDuxo paycheckHubDuxo, final EarlyPayEnrollment earlyPayEnrollment) {
        Intrinsics.checkNotNullParameter(earlyPayEnrollment, "earlyPayEnrollment");
        paycheckHubDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckHubDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckHubDuxo.onResume$lambda$1$lambda$0(earlyPayEnrollment, (PaycheckHubViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaycheckHubViewState onResume$lambda$1$lambda$0(EarlyPayEnrollment earlyPayEnrollment, PaycheckHubViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PaycheckHubViewState.copy$default(applyMutation, null, earlyPayEnrollment, null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(PaycheckHubDuxo paycheckHubDuxo, final boolean z) {
        paycheckHubDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckHubDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckHubDuxo.onResume$lambda$3$lambda$2(z, (PaycheckHubViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaycheckHubViewState onResume$lambda$3$lambda$2(boolean z, PaycheckHubViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PaycheckHubViewState.copy$default(applyMutation, null, null, null, Boolean.valueOf(z), false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6(PaycheckHubDuxo paycheckHubDuxo, final List paychecks) {
        Intrinsics.checkNotNullParameter(paychecks, "paychecks");
        paycheckHubDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckHubDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckHubDuxo.onResume$lambda$6$lambda$5(paychecks, (PaycheckHubViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaycheckHubViewState onResume$lambda$6$lambda$5(List list, PaycheckHubViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PaycheckHubViewState.copy$default(applyMutation, null, null, CollectionsKt.sortedWith(list, new Comparator() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckHubDuxo$onResume$lambda$6$lambda$5$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((PaycheckV2) t2).getGrantDate(), ((PaycheckV2) t).getGrantDate());
            }
        }), null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$8(PaycheckHubDuxo paycheckHubDuxo, final boolean z) {
        paycheckHubDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckHubDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckHubDuxo.onResume$lambda$8$lambda$7(z, (PaycheckHubViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaycheckHubViewState onResume$lambda$8$lambda$7(boolean z, PaycheckHubViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PaycheckHubViewState.copy$default(applyMutation, null, null, null, null, false, Boolean.valueOf(z), null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$11(PaycheckHubDuxo paycheckHubDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        final SweepsInterest sweepsInterest = (SweepsInterest) optional.component1();
        paycheckHubDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckHubDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckHubDuxo.onResume$lambda$11$lambda$10(sweepsInterest, (PaycheckHubViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaycheckHubViewState onResume$lambda$11$lambda$10(SweepsInterest sweepsInterest, PaycheckHubViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PaycheckHubViewState.copy$default(applyMutation, null, null, null, null, false, null, sweepsInterest, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$13(PaycheckHubDuxo paycheckHubDuxo, final Boolean bool) {
        paycheckHubDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckHubDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckHubDuxo.onResume$lambda$13$lambda$12(bool, (PaycheckHubViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaycheckHubViewState onResume$lambda$13$lambda$12(Boolean bool, PaycheckHubViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PaycheckHubViewState.copy$default(applyMutation, null, null, null, null, false, null, null, bool, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$15(PaycheckHubDuxo paycheckHubDuxo, final RetirementMatchRate retirementMatchRate) {
        paycheckHubDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckHubDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckHubDuxo.onResume$lambda$15$lambda$14(retirementMatchRate, (PaycheckHubViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaycheckHubViewState onResume$lambda$15$lambda$14(RetirementMatchRate retirementMatchRate, PaycheckHubViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PaycheckHubViewState.copy$default(applyMutation, retirementMatchRate.getHighestActiveInternalAccountTransferRate(), null, null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
    }

    public final void showAllPaychecks() {
        applyMutation(new Function1() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckHubDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckHubDuxo.showAllPaychecks$lambda$16((PaycheckHubViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaycheckHubViewState showAllPaychecks$lambda$16(PaycheckHubViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PaycheckHubViewState.copy$default(applyMutation, null, null, null, null, true, null, null, null, 239, null);
    }
}
