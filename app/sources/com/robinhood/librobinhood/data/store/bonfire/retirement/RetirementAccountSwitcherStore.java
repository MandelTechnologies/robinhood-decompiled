package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.models.retirement.dao.RetirementAccountSwitcherDao;
import com.robinhood.android.models.retirement.p194db.RetirementAccountSwitcher;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.models.p320db.Account;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.ActiveRetirementAccountNumberPref;
import com.robinhood.store.AsyncResult;
import com.robinhood.store.AsyncResult2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: RetirementAccountSwitcherStore.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00170\u000fJ\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0!0 J\u0006\u0010\"\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001a0\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementAccountSwitcherStore;", "Lcom/robinhood/store/Store;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "retirementAccountSwitcherDao", "Lcom/robinhood/android/models/retirement/dao/RetirementAccountSwitcherDao;", "retirementApi", "Lcom/robinhood/android/api/retirement/RetirementApi;", "activeRetirementAccountNumberPref", "Lcom/robinhood/prefs/StringPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/models/retirement/dao/RetirementAccountSwitcherDao;Lcom/robinhood/android/api/retirement/RetirementApi;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/store/StoreBundle;)V", "streamAllRetirementAccounts", "Lio/reactivex/Observable;", "", "Lcom/robinhood/models/db/Account;", "setActiveRetirementAccountNumber", "", "accountNumber", "", "streamActiveRetirementAccountNumber", "Lcom/robinhood/utils/Optional;", "retirementAccountSwitcherEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/models/retirement/db/RetirementAccountSwitcher;", "retirementAccountSwitcherQuery", "Lcom/robinhood/android/moria/db/Query;", "getRetirementAccountSwitcherQuery", "()Lcom/robinhood/android/moria/db/Query;", "refreshAccountSwitcher", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/store/AsyncResult;", "refreshAccountSwitcherWithoutSubscribing", "lib-store-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class RetirementAccountSwitcherStore extends Store {
    private final AccountProvider accountProvider;
    private final StringPreference activeRetirementAccountNumberPref;
    private final Endpoint<Unit, RetirementAccountSwitcher> retirementAccountSwitcherEndpoint;
    private final Query<Unit, RetirementAccountSwitcher> retirementAccountSwitcherQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetirementAccountSwitcherStore(AccountProvider accountProvider, final RetirementAccountSwitcherDao retirementAccountSwitcherDao, RetirementApi retirementApi, @ActiveRetirementAccountNumberPref StringPreference activeRetirementAccountNumberPref, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(retirementAccountSwitcherDao, "retirementAccountSwitcherDao");
        Intrinsics.checkNotNullParameter(retirementApi, "retirementApi");
        Intrinsics.checkNotNullParameter(activeRetirementAccountNumberPref, "activeRetirementAccountNumberPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountProvider = accountProvider;
        this.activeRetirementAccountNumberPref = activeRetirementAccountNumberPref;
        Endpoint<Unit, RetirementAccountSwitcher> endpointCreate$default = Endpoint.Companion.create$default(Endpoint.INSTANCE, new RetirementAccountSwitcherStore2(retirementApi, null), getLogoutKillswitch(), new RetirementAccountSwitcherStore3(retirementAccountSwitcherDao), storeBundle.getClock(), null, 16, null);
        this.retirementAccountSwitcherEndpoint = endpointCreate$default;
        this.retirementAccountSwitcherQuery = Store.create$default(this, Query.INSTANCE, "retirementAccountSwitcherQuery", CollectionsKt.listOf(new RefreshEach(new RetirementAccountSwitcherStore4(endpointCreate$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementAccountSwitcherStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementAccountSwitcherStore.retirementAccountSwitcherQuery$lambda$1(retirementAccountSwitcherDao, (Unit) obj);
            }
        }, false, 8, null);
    }

    public final Observable<List<Account>> streamAllRetirementAccounts() {
        AccountProvider.DefaultImpls.refresh$default(this.accountProvider, false, 1, null);
        Observables observables = Observables.INSTANCE;
        Observable observableCombineLatest = Observable.combineLatest(this.accountProvider.streamAllSelfDirectedAccounts(), this.accountProvider.streamAllManagedAccounts(), new BiFunction<T1, T2, R>() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementAccountSwitcherStore$streamAllRetirementAccounts$$inlined$combineLatest$1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                return (R) CollectionsKt.plus((Collection) t1, (Iterable) t2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        Observable<List<Account>> map = observableCombineLatest.map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementAccountSwitcherStore.streamAllRetirementAccounts.2
            @Override // io.reactivex.functions.Function
            public final List<Account> apply(List<Account> accounts2) {
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                ArrayList arrayList = new ArrayList();
                for (T t : accounts2) {
                    if (((Account) t).getBrokerageAccountType().isRetirement()) {
                        arrayList.add(t);
                    }
                }
                return arrayList;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final void setActiveRetirementAccountNumber(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.activeRetirementAccountNumberPref.set(accountNumber);
    }

    public final Observable<Optional<String>> streamActiveRetirementAccountNumber() {
        Observable observableFlatMap = this.activeRetirementAccountNumberPref.changes().flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementAccountSwitcherStore.streamActiveRetirementAccountNumber.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<String>> apply(Optional<String> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                String strComponent1 = optional.component1();
                if (strComponent1 != null) {
                    return Observable.just(Optional3.asOptional(strComponent1));
                }
                Observable<List<Account>> observableStreamAllRetirementAccounts = RetirementAccountSwitcherStore.this.streamAllRetirementAccounts();
                final RetirementAccountSwitcherStore retirementAccountSwitcherStore = RetirementAccountSwitcherStore.this;
                return observableStreamAllRetirementAccounts.map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementAccountSwitcherStore.streamActiveRetirementAccountNumber.1.1
                    @Override // io.reactivex.functions.Function
                    public final Optional<String> apply(List<Account> accounts2) {
                        String accountNumber;
                        Intrinsics.checkNotNullParameter(accounts2, "accounts");
                        Account account = (Account) CollectionsKt.firstOrNull((List) accounts2);
                        if (account == null || (accountNumber = account.getAccountNumber()) == null) {
                            accountNumber = null;
                        } else {
                            retirementAccountSwitcherStore.activeRetirementAccountNumberPref.set(accountNumber);
                        }
                        return Optional3.asOptional(accountNumber);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return observableFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object retirementAccountSwitcherEndpoint$insert(RetirementAccountSwitcherDao retirementAccountSwitcherDao, RetirementAccountSwitcher retirementAccountSwitcher, Continuation continuation) {
        retirementAccountSwitcherDao.insert(retirementAccountSwitcher);
        return Unit.INSTANCE;
    }

    public final Query<Unit, RetirementAccountSwitcher> getRetirementAccountSwitcherQuery() {
        return this.retirementAccountSwitcherQuery;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow retirementAccountSwitcherQuery$lambda$1(RetirementAccountSwitcherDao retirementAccountSwitcherDao, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return retirementAccountSwitcherDao.getRetirementAccountSwitcher();
    }

    /* compiled from: RetirementAccountSwitcherStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/retirement/db/RetirementAccountSwitcher;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementAccountSwitcherStore$refreshAccountSwitcher$1", m3645f = "RetirementAccountSwitcherStore.kt", m3646l = {105}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementAccountSwitcherStore$refreshAccountSwitcher$1 */
    static final class C347171 extends ContinuationImpl7 implements Function1<Continuation<? super RetirementAccountSwitcher>, Object> {
        int label;

        C347171(Continuation<? super C347171> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RetirementAccountSwitcherStore.this.new C347171(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super RetirementAccountSwitcher> continuation) {
            return ((C347171) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Endpoint endpoint = RetirementAccountSwitcherStore.this.retirementAccountSwitcherEndpoint;
            Unit unit = Unit.INSTANCE;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Flow<AsyncResult<RetirementAccountSwitcher>> refreshAccountSwitcher() {
        return FlowKt.flowOn(AsyncResult2.flowCatching(new C347171(null)), Dispatchers.getIO());
    }

    public final void refreshAccountSwitcherWithoutSubscribing() {
        Endpoint8.refresh$default(this.retirementAccountSwitcherEndpoint, true, null, 2, null);
    }
}
