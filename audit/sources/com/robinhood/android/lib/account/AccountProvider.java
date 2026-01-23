package com.robinhood.android.lib.account;

import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.utils.Optional;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* compiled from: AccountProvider.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0007H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH&J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H&J\u000e\u0010\f\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\u0006\u0010\u0014\u001a\u00020\u0015H¦@¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00130\u0003H&J\u0014\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00130\u0003H&J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H&J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0010\u001a\u00020\u0005H&J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u001c\u001a\u00020\u0005H&J\u001c\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\u0006\u0010\u0010\u001a\u00020\u0005H&J\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\u0006\u0010\u001c\u001a\u00020\u0005H&J\"\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00130 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\"H&J\u0014\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00130\u0003H&J\u0014\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00130\u0003H&J\u0014\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00130\u0003H&J\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H&J&\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H&J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0007H&J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H&J\u0014\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u0003H&J\u0012\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u00020-H&J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u00020-H&J\u0014\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00130 H&J\u0014\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00130 H&¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/lib/account/AccountProvider;", "", "getActiveAccountNumber", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "", "getIndividualAccountNumber", "Lio/reactivex/Single;", "getIndividualAccountNumberMaybe", "Lio/reactivex/Maybe;", "streamIndividualAccountNumberOptional", "streamIndividualAccountNumber", "getIndividualAccountNumberForced", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAccountForced", "Lcom/robinhood/models/db/Account;", "accountNumber", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAccountsByTypeForced", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "(Lcom/robinhood/models/api/BrokerageAccountType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamAllSelfDirectedAccountNumbers", "streamAllManagedAccountNumbers", "streamIndividualAccount", "streamAccount", "streamAccountByRhs", "rhsAccountNumber", "streamAccountOptional", "streamAccountOptionalByRhs", "streamAccountsByTypes", "Lkotlinx/coroutines/flow/Flow;", "types", "", "streamAllSelfDirectedAccounts", "streamAllManagedAccounts", "streamAllAccounts", "pollIndividualAccount", "interval", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "pollAccount", "forceFetchHasBrokerageAccountIfNotCached", "", "getIndividualAccountForced", "streamIndividualAccountOptional", "refresh", "Lkotlinx/coroutines/Job;", "force", "setWithdrawalsLocked", "Lio/reactivex/Completable;", "locked", "streamAllSelfDirectedIndividualAccounts", "getAllSelfDirectedIndividualAccountsForced", "lib-account-provider_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface AccountProvider {
    Single<Boolean> forceFetchHasBrokerageAccountIfNotCached();

    Object getAccountForced(String str, Continuation<? super Account> continuation);

    Object getAccountsByTypeForced(BrokerageAccountType brokerageAccountType, Continuation<? super List<Account>> continuation);

    @Deprecated
    /* renamed from: getActiveAccountNumber */
    Observable<Optional<String>> mo22580getActiveAccountNumber();

    Flow<List<Account>> getAllSelfDirectedIndividualAccountsForced();

    Observable<Account> getIndividualAccountForced();

    Single<Optional<String>> getIndividualAccountNumber();

    Object getIndividualAccountNumberForced(Continuation<? super String> continuation);

    Maybe<String> getIndividualAccountNumberMaybe();

    Observable<Account> pollAccount(String accountNumber, long interval, TimeUnit timeUnit);

    Observable<Account> pollIndividualAccount(long interval, TimeUnit timeUnit);

    Job refresh(boolean force);

    Completable setWithdrawalsLocked(boolean locked);

    Observable<Account> streamAccount(String accountNumber);

    Observable<Account> streamAccountByRhs(String rhsAccountNumber);

    Observable<Optional<Account>> streamAccountOptional(String accountNumber);

    Observable<Optional<Account>> streamAccountOptionalByRhs(String rhsAccountNumber);

    Flow<List<Account>> streamAccountsByTypes(Set<? extends BrokerageAccountType> types);

    Observable<List<Account>> streamAllAccounts();

    Observable<List<String>> streamAllManagedAccountNumbers();

    Observable<List<Account>> streamAllManagedAccounts();

    Observable<List<String>> streamAllSelfDirectedAccountNumbers();

    Observable<List<Account>> streamAllSelfDirectedAccounts();

    Flow<List<Account>> streamAllSelfDirectedIndividualAccounts();

    Observable<Account> streamIndividualAccount();

    Observable<String> streamIndividualAccountNumber();

    Observable<Optional<String>> streamIndividualAccountNumberOptional();

    Observable<Optional<Account>> streamIndividualAccountOptional();

    /* compiled from: AccountProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes8.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Job refresh$default(AccountProvider accountProvider, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refresh");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return accountProvider.refresh(z);
        }
    }
}
