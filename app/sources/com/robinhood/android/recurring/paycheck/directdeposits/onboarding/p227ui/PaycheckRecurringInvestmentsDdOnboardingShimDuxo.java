package com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.p196db.QueryKt;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui.PaycheckRecurringInvestmentsDdOnboardingShimFragment;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui.PaycheckRecurringInvestmentsDdOnboardingShimState;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore;
import com.robinhood.lib.sweep.enrollment.api.ApiSweepEnrollment;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import com.robinhood.librobinhood.data.store.SweepsTimelineSummaryStore;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.models.api.ApiSweepsTimelineSummary;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiDirectDepositRelationship;
import com.robinhood.models.entity.RhEntity;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.identi.sortinghat.SortingHatUserState;
import com.robinhood.models.p320db.mcduckling.SweepsTimelineSummary;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function8;
import io.reactivex.rxkotlin.Singles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PaycheckRecurringInvestmentsDdOnboardingShimDuxo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001aBI\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimState;", "Lcom/robinhood/android/udf/HasSavedState;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "sweepEnrollmentStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "sweepsTimelineSummaryStore", "Lcom/robinhood/librobinhood/data/store/SweepsTimelineSummaryStore;", "sweepsInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;Lcom/robinhood/librobinhood/data/store/SweepsTimelineSummaryStore;Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PaycheckRecurringInvestmentsDdOnboardingShimDuxo extends OldBaseDuxo<PaycheckRecurringInvestmentsDdOnboardingShimState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final DirectDepositRelationshipStore directDepositRelationshipStore;
    private final RhyAccountStore rhyAccountStore;
    private final SavedStateHandle savedStateHandle;
    private final BaseSortingHatStore sortingHatStore;
    private final SweepEnrollmentStore sweepEnrollmentStore;
    private final SweepsInterestStore sweepsInterestStore;
    private final SweepsTimelineSummaryStore sweepsTimelineSummaryStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaycheckRecurringInvestmentsDdOnboardingShimState onStart$lambda$2$lambda$1(PaycheckRecurringInvestmentsDdOnboardingShimState.Loaded loaded, PaycheckRecurringInvestmentsDdOnboardingShimState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return loaded;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaycheckRecurringInvestmentsDdOnboardingShimDuxo(DirectDepositRelationshipStore directDepositRelationshipStore, BaseSortingHatStore sortingHatStore, SweepEnrollmentStore sweepEnrollmentStore, SweepsTimelineSummaryStore sweepsTimelineSummaryStore, SweepsInterestStore sweepsInterestStore, AccountProvider accountProvider, RhyAccountStore rhyAccountStore, SavedStateHandle savedStateHandle) {
        super(PaycheckRecurringInvestmentsDdOnboardingShimState.Loading.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
        Intrinsics.checkNotNullParameter(sweepsTimelineSummaryStore, "sweepsTimelineSummaryStore");
        Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.sortingHatStore = sortingHatStore;
        this.sweepEnrollmentStore = sweepEnrollmentStore;
        this.sweepsTimelineSummaryStore = sweepsTimelineSummaryStore;
        this.sweepsInterestStore = sweepsInterestStore;
        this.accountProvider = accountProvider;
        this.rhyAccountStore = rhyAccountStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        this.rhyAccountStore.refresh(true);
        DirectDepositRelationshipStore directDepositRelationshipStore = this.directDepositRelationshipStore;
        RhEntity rhEntity = RhEntity.RHY;
        EnumEntries<ApiDirectDepositRelationship.State> entries = ApiDirectDepositRelationship.State.getEntries();
        ArrayList arrayList = new ArrayList();
        for (ApiDirectDepositRelationship.State state : entries) {
            if (state != ApiDirectDepositRelationship.State.EXPIRED) {
                arrayList.add(state);
            }
        }
        Single<Boolean> singleForceFetchHasDirectDepositRelationshipsIfNotCached = directDepositRelationshipStore.forceFetchHasDirectDepositRelationshipsIfNotCached(rhEntity, arrayList);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Boolean bool = Boolean.FALSE;
        Single<Boolean> singleOnErrorReturnItem = singleForceFetchHasDirectDepositRelationshipsIfNotCached.timeout(10L, timeUnit, Single.just(bool)).onErrorReturnItem(bool);
        Intrinsics.checkNotNullExpressionValue(singleOnErrorReturnItem, "onErrorReturnItem(...)");
        Single single = QueryKt.asObservable(this.sortingHatStore.streamUserState()).take(1L).map(new Function() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.PaycheckRecurringInvestmentsDdOnboardingShimDuxo$onStart$hasBrokerageAccountSingle$1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(SortingHatUserState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getBrokerage().isApproved());
            }
        }).single(bool);
        SingleSource singleSourceFlatMap = this.accountProvider.getIndividualAccountNumber().flatMap(new Function() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.PaycheckRecurringInvestmentsDdOnboardingShimDuxo$onStart$enrolledInSweepSingle$1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Boolean> apply(Optional<String> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                String strComponent1 = optional.component1();
                if (strComponent1 == null) {
                    return Single.just(Boolean.FALSE);
                }
                return this.this$0.sweepEnrollmentStore.getSweepEnrollmentObservable(strComponent1).take(1L).map(new Function() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.PaycheckRecurringInvestmentsDdOnboardingShimDuxo$onStart$enrolledInSweepSingle$1.1
                    @Override // io.reactivex.functions.Function
                    public final Boolean apply(ApiSweepEnrollment it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Boolean.valueOf(it.getSweepEnrolled());
                    }
                }).single(Boolean.FALSE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleSourceFlatMap, "flatMap(...)");
        SingleSource singleSourceFlatMap2 = this.accountProvider.getIndividualAccountNumber().flatMap(new Function() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.PaycheckRecurringInvestmentsDdOnboardingShimDuxo$onStart$eligibleForSweepSingle$1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Boolean> apply(Optional<String> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                String strComponent1 = optional.component1();
                if (strComponent1 == null) {
                    return Single.just(Boolean.FALSE);
                }
                return ObservablesKt.toOptionals(SweepsTimelineSummaryStore.getTimelineSummary$default(this.this$0.sweepsTimelineSummaryStore, strComponent1, null, 2, null)).take(1L).single(Optional2.INSTANCE).map(new Function() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.PaycheckRecurringInvestmentsDdOnboardingShimDuxo$onStart$eligibleForSweepSingle$1.1
                    @Override // io.reactivex.functions.Function
                    public final Boolean apply(Optional<SweepsTimelineSummary> optional2) {
                        Intrinsics.checkNotNullParameter(optional2, "<destruct>");
                        SweepsTimelineSummary sweepsTimelineSummaryComponent1 = optional2.component1();
                        return Boolean.valueOf((sweepsTimelineSummaryComponent1 == null || sweepsTimelineSummaryComponent1.getStatus() == ApiSweepsTimelineSummary.Status.PAUSED) ? false : true);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleSourceFlatMap2, "flatMap(...)");
        Single<List<Account>> singleSingleOrError = this.accountProvider.streamAllSelfDirectedAccounts().take(1L).singleOrError();
        SingleSource map = singleSingleOrError.map(new Function() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.PaycheckRecurringInvestmentsDdOnboardingShimDuxo$onStart$rothIraAccountNumberSingle$1
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
                    if (((Account) next).getBrokerageAccountType() == BrokerageAccountType.IRA_ROTH) {
                        break;
                    }
                }
                Account account = next;
                return Optional3.asOptional(account != null ? account.getAccountNumber() : null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        SingleSource map2 = singleSingleOrError.map(new Function() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.PaycheckRecurringInvestmentsDdOnboardingShimDuxo$onStart$traditionalIraAccountNumberSingle$1
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
                    if (((Account) next).getBrokerageAccountType() == BrokerageAccountType.IRA_TRADITIONAL) {
                        break;
                    }
                }
                Account account = next;
                return Optional3.asOptional(account != null ? account.getAccountNumber() : null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Companion companion = INSTANCE;
        Single singleJust = Single.just(Boolean.valueOf(((PaycheckRecurringInvestmentsDdOnboardingShimFragment.Args) companion.getArgs((HasSavedState) this)).getRetirementOnly()));
        Intrinsics.checkNotNullExpressionValue(singleJust, "just(...)");
        Single singleJust2 = Single.just(Boolean.valueOf(((PaycheckRecurringInvestmentsDdOnboardingShimFragment.Args) companion.getArgs((HasSavedState) this)).getCanSkipCategorySelection()));
        Intrinsics.checkNotNullExpressionValue(singleJust2, "just(...)");
        this.sweepsInterestStore.refreshNoAccountNumber(true);
        Singles singles = Singles.INSTANCE;
        Intrinsics.checkNotNull(single);
        Single singleZip = Single.zip(singleOnErrorReturnItem, single, singleSourceFlatMap, singleSourceFlatMap2, map, map2, singleJust, singleJust2, new Function8<T1, T2, T3, T4, T5, T6, T7, T8, R>() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.PaycheckRecurringInvestmentsDdOnboardingShimDuxo$onStart$$inlined$zip$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function8
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                Intrinsics.checkParameterIsNotNull(t5, "t5");
                Intrinsics.checkParameterIsNotNull(t6, "t6");
                Intrinsics.checkParameterIsNotNull(t7, "t7");
                Intrinsics.checkParameterIsNotNull(t8, "t8");
                boolean zBooleanValue = ((Boolean) t8).booleanValue();
                boolean zBooleanValue2 = ((Boolean) t7).booleanValue();
                Optional optional = (Optional) t5;
                boolean zBooleanValue3 = ((Boolean) t4).booleanValue();
                boolean zBooleanValue4 = ((Boolean) t3).booleanValue();
                boolean zBooleanValue5 = ((Boolean) t2).booleanValue();
                return (R) new PaycheckRecurringInvestmentsDdOnboardingShimState.Loaded(((Boolean) t1).booleanValue(), zBooleanValue5, zBooleanValue4, zBooleanValue3, (Optional<String>) optional, (Optional<String>) t6, zBooleanValue2, zBooleanValue);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(singleZip, "Single.zip(s1, s2, s3, s…3, t4, t5, t6, t7, t8) })");
        LifecycleHost.DefaultImpls.bind$default(this, singleZip, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.PaycheckRecurringInvestmentsDdOnboardingShimDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckRecurringInvestmentsDdOnboardingShimDuxo.onStart$lambda$2(this.f$0, (PaycheckRecurringInvestmentsDdOnboardingShimState.Loaded) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(PaycheckRecurringInvestmentsDdOnboardingShimDuxo paycheckRecurringInvestmentsDdOnboardingShimDuxo, final PaycheckRecurringInvestmentsDdOnboardingShimState.Loaded it) {
        Intrinsics.checkNotNullParameter(it, "it");
        paycheckRecurringInvestmentsDdOnboardingShimDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.PaycheckRecurringInvestmentsDdOnboardingShimDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckRecurringInvestmentsDdOnboardingShimDuxo.onStart$lambda$2$lambda$1(it, (PaycheckRecurringInvestmentsDdOnboardingShimState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* compiled from: PaycheckRecurringInvestmentsDdOnboardingShimDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimDuxo;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimFragment$Args;", "<init>", "()V", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PaycheckRecurringInvestmentsDdOnboardingShimDuxo, PaycheckRecurringInvestmentsDdOnboardingShimFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PaycheckRecurringInvestmentsDdOnboardingShimFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (PaycheckRecurringInvestmentsDdOnboardingShimFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PaycheckRecurringInvestmentsDdOnboardingShimFragment.Args getArgs(PaycheckRecurringInvestmentsDdOnboardingShimDuxo paycheckRecurringInvestmentsDdOnboardingShimDuxo) {
            return (PaycheckRecurringInvestmentsDdOnboardingShimFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, paycheckRecurringInvestmentsDdOnboardingShimDuxo);
        }
    }
}
