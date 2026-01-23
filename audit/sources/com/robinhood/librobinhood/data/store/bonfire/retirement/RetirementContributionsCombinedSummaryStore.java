package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.models.retirement.p194db.RetirementContributionsSummary;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.money.Currencies;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementContributionsCombinedSummaryStore.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementContributionsCombinedSummaryStore;", "", "retirementContributionsSummaryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementContributionsSummaryStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementContributionsSummaryStore;Lcom/robinhood/android/lib/account/AccountProvider;)V", "getContributionLimitRemaining", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/ContributionLimitRemaining;", "lib-store-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RetirementContributionsCombinedSummaryStore {
    private final AccountProvider accountProvider;
    private final RetirementContributionsSummaryStore retirementContributionsSummaryStore;

    public RetirementContributionsCombinedSummaryStore(RetirementContributionsSummaryStore retirementContributionsSummaryStore, AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(retirementContributionsSummaryStore, "retirementContributionsSummaryStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        this.retirementContributionsSummaryStore = retirementContributionsSummaryStore;
        this.accountProvider = accountProvider;
    }

    public final Observable<Optional<ContributionLimitRemaining>> getContributionLimitRemaining() {
        Observable<Optional<ContributionLimitRemaining>> map = this.accountProvider.streamAllSelfDirectedAccounts().flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementContributionsCombinedSummaryStore.getContributionLimitRemaining.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<Optional<RetirementContributionsSummary>, Optional<RetirementContributionsSummary>>> apply(List<Account> accounts2) {
                T next;
                T next2;
                Observable<R> observableJust;
                Observable<R> observableJust2;
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                List<Account> list = accounts2;
                Iterator<T> it = list.iterator();
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
                String accountNumber = account != null ? account.getAccountNumber() : null;
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = (T) null;
                        break;
                    }
                    next2 = it2.next();
                    if (((Account) next2).getBrokerageAccountType() == BrokerageAccountType.IRA_TRADITIONAL) {
                        break;
                    }
                }
                Account account2 = next2;
                String accountNumber2 = account2 != null ? account2.getAccountNumber() : null;
                Observables observables = Observables.INSTANCE;
                if (accountNumber != null) {
                    observableJust = RetirementContributionsCombinedSummaryStore.this.retirementContributionsSummaryStore.getQuery().asObservable(accountNumber).map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementContributionsCombinedSummaryStore.getContributionLimitRemaining.1.1
                        @Override // io.reactivex.functions.Function
                        public final Optional<RetirementContributionsSummary> apply(RetirementContributionsSummary it3) {
                            Intrinsics.checkNotNullParameter(it3, "it");
                            return Optional3.asOptional(it3);
                        }
                    });
                } else {
                    observableJust = Observable.just(Optional2.INSTANCE);
                }
                Intrinsics.checkNotNull(observableJust);
                if (accountNumber2 != null) {
                    observableJust2 = RetirementContributionsCombinedSummaryStore.this.retirementContributionsSummaryStore.getQuery().asObservable(accountNumber2).map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementContributionsCombinedSummaryStore.getContributionLimitRemaining.1.2
                        @Override // io.reactivex.functions.Function
                        public final Optional<RetirementContributionsSummary> apply(RetirementContributionsSummary it3) {
                            Intrinsics.checkNotNullParameter(it3, "it");
                            return Optional3.asOptional(it3);
                        }
                    });
                } else {
                    observableJust2 = Observable.just(Optional2.INSTANCE);
                }
                Intrinsics.checkNotNull(observableJust2);
                return observables.zip(observableJust, observableJust2);
            }
        }).map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementContributionsCombinedSummaryStore.getContributionLimitRemaining.2
            @Override // io.reactivex.functions.Function
            public final Optional<ContributionLimitRemaining> apply(Tuples2<? extends Optional<RetirementContributionsSummary>, ? extends Optional<RetirementContributionsSummary>> tuples2) {
                Money money;
                Money money2;
                int taxYear;
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                Optional<RetirementContributionsSummary> optionalComponent1 = tuples2.component1();
                Optional<RetirementContributionsSummary> optionalComponent2 = tuples2.component2();
                RetirementContributionsSummary orNull = optionalComponent1.getOrNull();
                RetirementContributionsSummary orNull2 = optionalComponent2.getOrNull();
                if (orNull == null || (money = orNull.getAmountContributed()) == null) {
                    BigDecimal ZERO = BigDecimal.ZERO;
                    Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                    money = Money3.toMoney(ZERO, Currencies.USD);
                }
                if (orNull2 == null || (money2 = orNull2.getAmountContributed()) == null) {
                    BigDecimal ZERO2 = BigDecimal.ZERO;
                    Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
                    money2 = Money3.toMoney(ZERO2, Currencies.USD);
                }
                Money moneyPlus = money.plus(money2);
                RetirementContributionsSummary retirementContributionsSummary = orNull2 == null ? orNull : orNull2;
                Money contributionLimit = retirementContributionsSummary != null ? retirementContributionsSummary.getContributionLimit() : null;
                Money moneyMinus = contributionLimit != null ? contributionLimit.minus(moneyPlus) : null;
                if (orNull != null) {
                    taxYear = orNull.getTaxYear();
                } else {
                    if (orNull2 == null) {
                        return Optional2.INSTANCE;
                    }
                    taxYear = orNull2.getTaxYear();
                }
                return Optional3.asOptional(moneyMinus != null ? new ContributionLimitRemaining(taxYear, moneyMinus) : null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
