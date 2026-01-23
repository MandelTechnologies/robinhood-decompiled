package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.options.retrofit.OptionsAccountSwitcherBonfireApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.librobinhood.data.prefs.OptionsAccountNumberPref;
import com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore6;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.accountswitcher.OptionsAccountSwitcherId;
import com.robinhood.models.dao.OptionsAccountSwitcherDao;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.accountswitcher.OptionsAccountSwitcher;
import com.robinhood.prefs.StringPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import com.robinhood.utils.moshi.LazyMoshi;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;

/* compiled from: OptionAccountSwitcherStore.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002J\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bJ\u0010\u0010 \u001a\u00020!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cJ\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u001b2\u0006\u0010$\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006%"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "optionsAccountNumberPref", "Lcom/robinhood/prefs/StringPreference;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "dao", "Lcom/robinhood/models/dao/OptionsAccountSwitcherDao;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "optionsAccountSwitcherApi", "Lcom/robinhood/android/api/options/retrofit/OptionsAccountSwitcherBonfireApi;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/models/dao/OptionsAccountSwitcherDao;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/android/api/options/retrofit/OptionsAccountSwitcherBonfireApi;Lcom/robinhood/librobinhood/data/store/AccountAccessStore;)V", "optionsAccountSwitcherEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/api/accountswitcher/OptionsAccountSwitcherId;", "Lcom/robinhood/models/db/accountswitcher/OptionsAccountSwitcher;", "optionsAccountSwitcherQuery", "Lcom/robinhood/android/moria/db/Query;", "getOptionsAccountSwitcherQuery", "()Lcom/robinhood/android/moria/db/Query;", "streamDefaultAccountNumber", "Lio/reactivex/Observable;", "", "streamAccountNumberIfAccessibleToOptions", "accountNumber", "streamActiveAccountNumber", "setActiveAccountNumber", "", "forceFetchAccountSwitcher", "Lcom/robinhood/librobinhood/data/store/OptionsAccountSwitcherRefreshState;", "optionsAccountSwitcherId", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class OptionAccountSwitcherStore extends Store {
    private final AccountAccessStore accountAccessStore;
    private final AccountProvider accountProvider;
    private final OptionsAccountSwitcherDao dao;
    private final LazyMoshi moshi;
    private final StringPreference optionsAccountNumberPref;
    private final OptionsAccountSwitcherBonfireApi optionsAccountSwitcherApi;
    private final Endpoint<OptionsAccountSwitcherId, OptionsAccountSwitcher> optionsAccountSwitcherEndpoint;
    private final Query<OptionsAccountSwitcherId, OptionsAccountSwitcher> optionsAccountSwitcherQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionAccountSwitcherStore(StoreBundle storeBundle, @OptionsAccountNumberPref StringPreference optionsAccountNumberPref, AccountProvider accountProvider, OptionsAccountSwitcherDao dao, LazyMoshi moshi, OptionsAccountSwitcherBonfireApi optionsAccountSwitcherApi, AccountAccessStore accountAccessStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(optionsAccountNumberPref, "optionsAccountNumberPref");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(optionsAccountSwitcherApi, "optionsAccountSwitcherApi");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        this.optionsAccountNumberPref = optionsAccountNumberPref;
        this.accountProvider = accountProvider;
        this.dao = dao;
        this.moshi = moshi;
        this.optionsAccountSwitcherApi = optionsAccountSwitcherApi;
        this.accountAccessStore = accountAccessStore;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        Clock clock = storeBundle.getClock();
        Endpoint<OptionsAccountSwitcherId, OptionsAccountSwitcher> endpointCreate$default = Endpoint.Companion.create$default(companion, new OptionAccountSwitcherStore3(this, null), logoutKillswitch, new OptionAccountSwitcherStore2(dao), clock, null, 16, null);
        this.optionsAccountSwitcherEndpoint = endpointCreate$default;
        this.optionsAccountSwitcherQuery = Store.create$default(this, Query.INSTANCE, "optionsAccountSwitcherQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new OptionAccountSwitcherStore4(endpointCreate$default))), new OptionAccountSwitcherStore5(dao), false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object optionsAccountSwitcherEndpoint$insert(OptionsAccountSwitcherDao optionsAccountSwitcherDao, OptionsAccountSwitcher optionsAccountSwitcher, Continuation continuation) {
        optionsAccountSwitcherDao.insert(optionsAccountSwitcher);
        return Unit.INSTANCE;
    }

    public final Query<OptionsAccountSwitcherId, OptionsAccountSwitcher> getOptionsAccountSwitcherQuery() {
        return this.optionsAccountSwitcherQuery;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<String> streamDefaultAccountNumber() {
        this.accountProvider.refresh(false);
        Observable observableSwitchMap = this.accountProvider.streamAllSelfDirectedAccounts().switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore.streamDefaultAccountNumber.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends String> apply(List<Account> accounts2) {
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                OptionAccountSwitcherStore optionAccountSwitcherStore = OptionAccountSwitcherStore.this;
                return optionAccountSwitcherStore.asObservable(optionAccountSwitcherStore.accountAccessStore.filterAccountsWithFeatureAccess(accounts2, AccountFeature.OPTIONS_HAS_ACCESS)).switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore.streamDefaultAccountNumber.1.1
                    @Override // io.reactivex.functions.Function
                    public final ObservableSource<? extends String> apply(List<Account> accountsWithAccess) {
                        T next;
                        Intrinsics.checkNotNullParameter(accountsWithAccess, "accountsWithAccess");
                        if (accountsWithAccess.isEmpty()) {
                            return Observable.never();
                        }
                        Iterator<T> it = accountsWithAccess.iterator();
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
                        if (account == null) {
                            account = (Account) CollectionsKt.first((List) accountsWithAccess);
                        }
                        return Observable.just(account.getAccountNumber());
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<String> streamAccountNumberIfAccessibleToOptions(final String accountNumber) {
        this.accountProvider.refresh(false);
        Observable observableSwitchMap = this.accountProvider.streamAccount(accountNumber).switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore.streamAccountNumberIfAccessibleToOptions.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends String> apply(Account account) {
                Intrinsics.checkNotNullParameter(account, "account");
                OptionAccountSwitcherStore optionAccountSwitcherStore = OptionAccountSwitcherStore.this;
                Observable<T> observableAsObservable = optionAccountSwitcherStore.asObservable(optionAccountSwitcherStore.accountAccessStore.getFeatureAccess(account, AccountFeature.OPTIONS_HAS_ACCESS));
                final String str = accountNumber;
                final OptionAccountSwitcherStore optionAccountSwitcherStore2 = OptionAccountSwitcherStore.this;
                return observableAsObservable.flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore.streamAccountNumberIfAccessibleToOptions.1.1
                    @Override // io.reactivex.functions.Function
                    public final ObservableSource<? extends String> apply(Boolean hasAccessToOptions) {
                        Intrinsics.checkNotNullParameter(hasAccessToOptions, "hasAccessToOptions");
                        if (!hasAccessToOptions.booleanValue()) {
                            return optionAccountSwitcherStore2.streamDefaultAccountNumber();
                        }
                        Observable observableJust = Observable.just(str);
                        Intrinsics.checkNotNull(observableJust);
                        return observableJust;
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    public final Observable<String> streamActiveAccountNumber() {
        Observable observableSwitchMap = this.optionsAccountNumberPref.changes().distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore.streamActiveAccountNumber.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends String> apply(Optional<String> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                String strComponent1 = optional.component1();
                return strComponent1 != null ? OptionAccountSwitcherStore.this.streamAccountNumberIfAccessibleToOptions(strComponent1) : OptionAccountSwitcherStore.this.streamDefaultAccountNumber();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    public final void setActiveAccountNumber(String accountNumber) {
        this.optionsAccountNumberPref.set(accountNumber);
    }

    /* compiled from: OptionAccountSwitcherStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/librobinhood/data/store/OptionsAccountSwitcherRefreshState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore$forceFetchAccountSwitcher$1", m3645f = "OptionAccountSwitcherStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore$forceFetchAccountSwitcher$1 */
    static final class C339851 extends ContinuationImpl7 implements Function2<FlowCollector<? super OptionAccountSwitcherStore6>, Continuation<? super Unit>, Object> {
        final /* synthetic */ OptionsAccountSwitcherId $optionsAccountSwitcherId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C339851(OptionsAccountSwitcherId optionsAccountSwitcherId, Continuation<? super C339851> continuation) {
            super(2, continuation);
            this.$optionsAccountSwitcherId = optionsAccountSwitcherId;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C339851 c339851 = OptionAccountSwitcherStore.this.new C339851(this.$optionsAccountSwitcherId, continuation);
            c339851.L$0 = obj;
            return c339851;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super OptionAccountSwitcherStore6> flowCollector, Continuation<? super Unit> continuation) {
            return ((C339851) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:(1:(4:(1:(1:8)(2:9|10))(3:11|50|12)|13|44|45)(6:16|52|17|18|54|32))(1:22))(3:23|(1:25)|43)|46|26|27|48|28|(3:31|54|32)|43|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
        
            if (r4.emit(r0, r11) != r1) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
        
            r3 = r12;
            r12 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x008f, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0090, code lost:
        
            r8 = r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
        
            if (r3.emit(r0, r11) == r1) goto L43;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            C339851 c339851;
            FlowCollector flowCollector2;
            Exception exc;
            FlowCollector flowCollector3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                OptionAccountSwitcherStore6.Loading loading = OptionAccountSwitcherStore6.Loading.INSTANCE;
                this.L$0 = flowCollector;
                this.label = 1;
                if (flowCollector.emit(loading, this) == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                flowCollector = flowCollector4;
            } else if (i == 2) {
                flowCollector3 = (FlowCollector) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    c339851 = this;
                } catch (Exception e) {
                    exc = e;
                    c339851 = this;
                    flowCollector2 = flowCollector3;
                    OptionAccountSwitcherStore6.Failure failure = new OptionAccountSwitcherStore6.Failure(exc);
                    c339851.L$0 = null;
                    c339851.label = 4;
                }
                try {
                    OptionAccountSwitcherStore6.Success success = new OptionAccountSwitcherStore6.Success((OptionsAccountSwitcher) obj);
                    c339851.L$0 = flowCollector3;
                    c339851.label = 3;
                } catch (Exception e2) {
                    exc = e2;
                    flowCollector2 = flowCollector3;
                    OptionAccountSwitcherStore6.Failure failure2 = new OptionAccountSwitcherStore6.Failure(exc);
                    c339851.L$0 = null;
                    c339851.label = 4;
                }
            } else {
                if (i == 3) {
                    flowCollector2 = (FlowCollector) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e3) {
                        exc = e3;
                        c339851 = this;
                        OptionAccountSwitcherStore6.Failure failure22 = new OptionAccountSwitcherStore6.Failure(exc);
                        c339851.L$0 = null;
                        c339851.label = 4;
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            Endpoint endpoint = OptionAccountSwitcherStore.this.optionsAccountSwitcherEndpoint;
            OptionsAccountSwitcherId optionsAccountSwitcherId = this.$optionsAccountSwitcherId;
            this.L$0 = flowCollector;
            this.label = 2;
            c339851 = this;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, optionsAccountSwitcherId, null, c339851, 2, null);
            if (objForceFetch$default != coroutine_suspended) {
                flowCollector3 = flowCollector;
                obj = objForceFetch$default;
                OptionAccountSwitcherStore6.Success success2 = new OptionAccountSwitcherStore6.Success((OptionsAccountSwitcher) obj);
                c339851.L$0 = flowCollector3;
                c339851.label = 3;
            }
            return coroutine_suspended;
        }
    }

    public final Observable<OptionAccountSwitcherStore6> forceFetchAccountSwitcher(OptionsAccountSwitcherId optionsAccountSwitcherId) {
        Intrinsics.checkNotNullParameter(optionsAccountSwitcherId, "optionsAccountSwitcherId");
        return asObservable(FlowKt.flowOn(FlowKt.flow(new C339851(optionsAccountSwitcherId, null)), Dispatchers.getIO()));
    }
}
