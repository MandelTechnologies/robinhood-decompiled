package com.robinhood.android.feature.lib.sweep.interest;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore;
import com.robinhood.lib.sweep.enrollment.api.ApiSweepEnrollment;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import com.robinhood.librobinhood.data.store.SweepsTimelineSummaryStore;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.models.p320db.mcduckling.SweepsInterest;
import com.robinhood.models.p320db.mcduckling.SweepsTimelineSummary;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.util.Money;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Function5;
import io.reactivex.rxkotlin.Observables;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SweepInterestContextFactory.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013J\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00140\u00132\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/feature/lib/sweep/interest/SweepInterestContextFactory;", "", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "sweepsInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "sweepsTimelineSummaryStore", "Lcom/robinhood/librobinhood/data/store/SweepsTimelineSummaryStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "sweepEnrollmentStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;Lcom/robinhood/librobinhood/data/store/SweepsTimelineSummaryStore;Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;)V", "getSweepInterestTimelineData", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/feature/lib/sweep/interest/SweepInterestTimelineData;", "getSweepEnrollmentData", "Lcom/robinhood/android/feature/lib/sweep/interest/SweepEnrollmentData;", "accountNumber", "", "feature-lib-sweep-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class SweepInterestContextFactory {
    private final AccountProvider accountProvider;
    private final MinervaAccountStore minervaAccountStore;
    private final PaymentTransferStore paymentTransferStore;
    private final SweepEnrollmentStore sweepEnrollmentStore;
    private final SweepsInterestStore sweepsInterestStore;
    private final SweepsTimelineSummaryStore sweepsTimelineSummaryStore;
    private final UnifiedAccountStore unifiedAccountStore;

    public SweepInterestContextFactory(AccountProvider accountProvider, MinervaAccountStore minervaAccountStore, PaymentTransferStore paymentTransferStore, SweepsInterestStore sweepsInterestStore, SweepsTimelineSummaryStore sweepsTimelineSummaryStore, UnifiedAccountStore unifiedAccountStore, SweepEnrollmentStore sweepEnrollmentStore) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
        Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
        Intrinsics.checkNotNullParameter(sweepsTimelineSummaryStore, "sweepsTimelineSummaryStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
        this.accountProvider = accountProvider;
        this.minervaAccountStore = minervaAccountStore;
        this.paymentTransferStore = paymentTransferStore;
        this.sweepsInterestStore = sweepsInterestStore;
        this.sweepsTimelineSummaryStore = sweepsTimelineSummaryStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.sweepEnrollmentStore = sweepEnrollmentStore;
    }

    public final Observable<Optional<SweepInterestTimelineData>> getSweepInterestTimelineData() {
        this.minervaAccountStore.refresh(false);
        this.sweepsInterestStore.refreshNoAccountNumber(false);
        final Observable observableDistinctUntilChanged = this.unifiedAccountStore.streamIndividualAccount().map(new Function() { // from class: com.robinhood.android.feature.lib.sweep.interest.SweepInterestContextFactory$getSweepInterestTimelineData$accountBuyingPowerObs$1
            @Override // io.reactivex.functions.Function
            public final Tuples2<Money, Money> apply(UnifiedAccountV2 unifiedAccount) {
                Intrinsics.checkNotNullParameter(unifiedAccount, "unifiedAccount");
                return new Tuples2<>(unifiedAccount.getAccountBuyingPower(), unifiedAccount.getLeveredAmount());
            }
        }).distinctUntilChanged();
        Observable<Optional<SweepInterestTimelineData>> observableSwitchMap = ObservablesKt.filterIsPresent(this.accountProvider.streamIndividualAccountOptional()).switchMap(new Function() { // from class: com.robinhood.android.feature.lib.sweep.interest.SweepInterestContextFactory.getSweepInterestTimelineData.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<SweepInterestTimelineData>> apply(final Account account) {
                Intrinsics.checkNotNullParameter(account, "account");
                Observables observables = Observables.INSTANCE;
                Observable<Tuples2<Money, Money>> observable = observableDistinctUntilChanged;
                Intrinsics.checkNotNull(observable);
                Observable<List<AchTransfer>> achTransfers = this.paymentTransferStore.getAchTransfers(true);
                Observable observableStreamAccount$default = MinervaAccountStore.streamAccount$default(this.minervaAccountStore, null, 1, null);
                Observable<Optional<BigDecimal>> observableDistinctUntilChanged2 = this.sweepsInterestStore.streamInterestNoAccountNumber().distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
                Observable observableCombineLatest = Observable.combineLatest(observable, achTransfers, observableStreamAccount$default, observableDistinctUntilChanged2, SweepsTimelineSummaryStore.getTimelineSummary$default(this.sweepsTimelineSummaryStore, account.getAccountNumber(), null, 2, null), new Function5<T1, T2, T3, T4, T5, R>() { // from class: com.robinhood.android.feature.lib.sweep.interest.SweepInterestContextFactory$getSweepInterestTimelineData$1$apply$$inlined$combineLatest$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // io.reactivex.functions.Function5
                    public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
                        Intrinsics.checkParameterIsNotNull(t1, "t1");
                        Intrinsics.checkParameterIsNotNull(t2, "t2");
                        Intrinsics.checkParameterIsNotNull(t3, "t3");
                        Intrinsics.checkParameterIsNotNull(t4, "t4");
                        Intrinsics.checkParameterIsNotNull(t5, "t5");
                        SweepsTimelineSummary sweepsTimelineSummary = (SweepsTimelineSummary) t5;
                        MinervaAccount minervaAccount = (MinervaAccount) t3;
                        List list = (List) t2;
                        Tuples2 tuples2 = (Tuples2) t1;
                        Money money = (Money) tuples2.component1();
                        Money money2 = (Money) tuples2.component2();
                        BigDecimal bigDecimal = (BigDecimal) ((Optional) t4).component1();
                        if (bigDecimal != null) {
                            Optional.Companion companion = Optional.INSTANCE;
                            boolean z = account.isMargin() && money2.isPositive();
                            Intrinsics.checkNotNull(account);
                            return (R) companion.m2972of(new SweepInterestTimelineData(sweepsTimelineSummary, bigDecimal, minervaAccount, list, money, z, account));
                        }
                        return (R) Optional2.INSTANCE;
                    }
                });
                Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…on(t1, t2, t3, t4, t5) })");
                return observableCombineLatest;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    public final Observable<Optional<SweepEnrollmentData>> getSweepEnrollmentData(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Observable observableSwitchMap = this.accountProvider.streamAccountOptional(accountNumber).switchMap(new Function() { // from class: com.robinhood.android.feature.lib.sweep.interest.SweepInterestContextFactory.getSweepEnrollmentData.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<SweepEnrollmentData>> apply(Optional<Account> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                Account accountComponent1 = optional.component1();
                if (accountComponent1 != null) {
                    Observables observables = Observables.INSTANCE;
                    Observable<Optional<SweepsInterest>> observableDistinctUntilChanged = SweepInterestContextFactory.this.sweepsInterestStore.stream(accountComponent1.getAccountNumber()).distinctUntilChanged();
                    Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
                    Observable observableCombineLatest = Observable.combineLatest(observableDistinctUntilChanged, SweepInterestContextFactory.this.sweepEnrollmentStore.getSweepEnrollmentObservable(accountComponent1.getAccountNumber()), SweepsTimelineSummaryStore.getTimelineSummary$default(SweepInterestContextFactory.this.sweepsTimelineSummaryStore, accountComponent1.getAccountNumber(), null, 2, null), new Function3<T1, T2, T3, R>() { // from class: com.robinhood.android.feature.lib.sweep.interest.SweepInterestContextFactory$getSweepEnrollmentData$1$apply$$inlined$combineLatest$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // io.reactivex.functions.Function3
                        public final R apply(T1 t1, T2 t2, T3 t3) {
                            Intrinsics.checkParameterIsNotNull(t1, "t1");
                            Intrinsics.checkParameterIsNotNull(t2, "t2");
                            Intrinsics.checkParameterIsNotNull(t3, "t3");
                            SweepsTimelineSummary sweepsTimelineSummary = (SweepsTimelineSummary) t3;
                            ApiSweepEnrollment apiSweepEnrollment = (ApiSweepEnrollment) t2;
                            SweepsInterest sweepsInterest = (SweepsInterest) ((Optional) t1).component1();
                            if (sweepsInterest != null) {
                                return (R) Optional.INSTANCE.m2972of(new SweepEnrollmentData(sweepsInterest, apiSweepEnrollment.getSweepEnrolled(), sweepsTimelineSummary));
                            }
                            return (R) Optional2.INSTANCE;
                        }
                    });
                    Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…neFunction(t1, t2, t3) })");
                    return observableCombineLatest;
                }
                Observable observableJust = Observable.just(Optional2.INSTANCE);
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }
}
