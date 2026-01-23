package com.robinhood.librobinhood.data.store;

import androidx.room.RoomDatabase;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.api.AccountApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiAccount;
import com.robinhood.models.api.ApiReceivedAchSettings;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.dao.AccountDao;
import com.robinhood.models.p320db.Account;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.Some;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.SinglesKt;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxAwait3;
import p479j$.time.Duration;
import timber.log.Timber;

/* compiled from: AccountStore.kt */
@Metadata(m3635d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 [2\u00020\u00012\u00020\u0002:\u0001[B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\u0006\u0010\u001d\u001a\u00020\u0013H\u0002J\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\u0006\u0010\u001f\u001a\u00020\u0013H\u0002J\u0014\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00160\u0015H\u0017J\u0014\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00160\u0015H\u0016J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0016J\u0014\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00160&H\u0016J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130+H\u0016J\u000e\u0010,\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010-J\u0016\u0010.\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010/J\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\u0017012\u0006\u00102\u001a\u000203H\u0096@¢\u0006\u0002\u00104J\u0014\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00160&H\u0002J\u0014\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0013010\u0015H\u0016J\u0014\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0013010\u0015H\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00170\u0015H\u0016J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\u001d\u001a\u00020\u0013H\u0016J\u0010\u0010:\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u0013H\u0002J\u001c\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\u0006\u0010\u001d\u001a\u00020\u0013H\u0016J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\u001f\u001a\u00020\u0013H\u0016J\u001c\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\u0006\u0010\u001f\u001a\u00020\u0013H\u0016J\"\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0017010@2\f\u0010A\u001a\b\u0012\u0004\u0012\u0002030BH\u0016J\u0014\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0017010\u0015H\u0016J\u0014\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0017010\u0015H\u0016J\u0014\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0017010\u0015H\u0016J\u001e\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0016J&\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0016J\u000e\u0010L\u001a\b\u0012\u0004\u0012\u00020M0&H\u0016J\u000e\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00170\u0015H\u0016J\u0014\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015H\u0016J\u0014\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0017010@H\u0016J\u0014\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0017010@H\u0016J\u0010\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020MH\u0016J\u0010\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020MH\u0016J\u001e\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00170\u0015*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100Y0@H\u0002J$\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160&*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100Y0@H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R'\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00160!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b\"\u0010#R\u001c\u0010%\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0016\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\\"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AccountStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/lib/account/AccountProvider;", "dao", "Lcom/robinhood/models/dao/AccountDao;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "accountApi", "Lcom/robinhood/android/account/api/AccountApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/models/dao/AccountDao;Lcom/robinhood/api/retrofit/Brokeback;Lcom/robinhood/android/account/api/AccountApi;Lcom/robinhood/store/StoreBundle;)V", "getAccounts", "Lcom/robinhood/api/PaginatedEndpoint;", "", "Lcom/robinhood/models/api/ApiAccount;", "getAccount", "Lcom/robinhood/android/moria/network/Endpoint;", "", "streamCachedOriginalSelfDirectedIndividualAccount", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/Account;", "getStreamCachedOriginalSelfDirectedIndividualAccount", "()Lio/reactivex/Observable;", "streamCachedOriginalSelfDirectedIndividualAccount$delegate", "Lkotlin/Lazy;", "streamCachedAccount", "accountNumber", "streamCachedAccountByRhs", "rhsAccountNumber", "activeAccountNumber", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "getActiveAccountNumber", "()Lcom/jakewharton/rxrelay2/BehaviorRelay;", "activeAccountNumber$delegate", "accountNumberSingle", "Lio/reactivex/Single;", "streamIndividualAccountNumberOptional", "streamIndividualAccountNumber", "getIndividualAccountNumber", "getIndividualAccountNumberMaybe", "Lio/reactivex/Maybe;", "getIndividualAccountNumberForced", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAccountForced", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAccountsByTypeForced", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "(Lcom/robinhood/models/api/BrokerageAccountType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOriginalSelfDirectedIndividualAccountNumberObservable", "streamAllSelfDirectedAccountNumbers", "streamAllManagedAccountNumbers", "streamIndividualAccount", "streamAccount", "reportIncorrectAccountNumberArgument", "message", "streamAccountOptional", "streamAccountByRhs", "streamAccountOptionalByRhs", "streamAccountsByTypes", "Lkotlinx/coroutines/flow/Flow;", "types", "", "streamAllSelfDirectedAccounts", "streamAllManagedAccounts", "streamAllAccounts", "pollIndividualAccount", "interval", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "pollAccount", "forceFetchHasBrokerageAccountIfNotCached", "", "getIndividualAccountForced", "streamIndividualAccountOptional", "streamAllSelfDirectedIndividualAccounts", "getAllSelfDirectedIndividualAccountsForced", "refresh", "Lkotlinx/coroutines/Job;", "force", "setWithdrawalsLocked", "Lio/reactivex/Completable;", "locked", "mapOriginalSelfDirectedIndividualAccount", "Lcom/robinhood/models/PaginatedResult;", "mapOriginalSelfDirectedIndividualAccountOptional", "Companion", "lib-store-account_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class AccountStore extends Store implements AccountProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AccountApi accountApi;
    private Single<Optional<String>> accountNumberSingle;

    /* renamed from: activeAccountNumber$delegate, reason: from kotlin metadata */
    private final Lazy activeAccountNumber;
    private final Brokeback brokeback;
    private final AccountDao dao;
    private final Endpoint<String, ApiAccount> getAccount;
    private final PaginatedEndpoint<Unit, ApiAccount> getAccounts;

    /* renamed from: streamCachedOriginalSelfDirectedIndividualAccount$delegate, reason: from kotlin metadata */
    private final Lazy streamCachedOriginalSelfDirectedIndividualAccount;

    /* compiled from: AccountStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountStore", m3645f = "AccountStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE}, m3647m = "getAccountForced")
    /* renamed from: com.robinhood.librobinhood.data.store.AccountStore$getAccountForced$1 */
    /* loaded from: classes13.dex */
    static final class C334971 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C334971(Continuation<? super C334971> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountStore.this.getAccountForced(null, this);
        }
    }

    /* compiled from: AccountStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountStore", m3645f = "AccountStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE, EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE}, m3647m = "getAccountsByTypeForced")
    /* renamed from: com.robinhood.librobinhood.data.store.AccountStore$getAccountsByTypeForced$1 */
    /* loaded from: classes13.dex */
    static final class C334981 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C334981(Continuation<? super C334981> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountStore.this.getAccountsByTypeForced(null, this);
        }
    }

    /* compiled from: AccountStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountStore", m3645f = "AccountStore.kt", m3646l = {457}, m3647m = "getIndividualAccountNumberForced")
    /* renamed from: com.robinhood.librobinhood.data.store.AccountStore$getIndividualAccountNumberForced$1 */
    /* loaded from: classes13.dex */
    static final class C335021 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C335021(Continuation<? super C335021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountStore.this.getIndividualAccountNumberForced(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountStore(AccountDao dao, Brokeback brokeback, AccountApi accountApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(accountApi, "accountApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.dao = dao;
        this.brokeback = brokeback;
        this.accountApi = accountApi;
        this.getAccounts = PaginatedEndpoint.Companion.create$default(PaginatedEndpoint.INSTANCE, new AccountStore$getAccounts$1(this, null), getLogoutKillswitch(), new AccountStore$getAccounts$2(this, null), storeBundle.getClock(), null, 16, null);
        this.getAccount = Endpoint.Companion.create$default(Endpoint.INSTANCE, new AccountStore$getAccount$1(this, null), getLogoutKillswitch(), new AccountStore$getAccount$2(this, null), storeBundle.getClock(), null, 16, null);
        this.streamCachedOriginalSelfDirectedIndividualAccount = LazyKt.lazy(new Function0() { // from class: com.robinhood.librobinhood.data.store.AccountStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountStore.m2604xc9a98520(this.f$0);
            }
        });
        this.activeAccountNumber = LazyKt.lazy(new Function0() { // from class: com.robinhood.librobinhood.data.store.AccountStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountStore.activeAccountNumber_delegate$lambda$1(this.f$0);
            }
        });
    }

    private final Observable<Optional<Account>> getStreamCachedOriginalSelfDirectedIndividualAccount() {
        Object value = this.streamCachedOriginalSelfDirectedIndividualAccount.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Observable) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: streamCachedOriginalSelfDirectedIndividualAccount_delegate$lambda$0 */
    public static final Observable m2604xc9a98520(AccountStore accountStore) {
        return accountStore.asObservable(accountStore.dao.getIndividualAccounts()).doOnSubscribe(new Consumer() { // from class: com.robinhood.librobinhood.data.store.AccountStore$streamCachedOriginalSelfDirectedIndividualAccount$2$1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                Timber.INSTANCE.mo3350d("AccountStore subscribed to dao", new Object[0]);
            }
        }).doOnDispose(new Action() { // from class: com.robinhood.librobinhood.data.store.AccountStore$streamCachedOriginalSelfDirectedIndividualAccount$2$2
            @Override // io.reactivex.functions.Action
            public final void run() {
                Timber.INSTANCE.mo3350d("AccountStore unsubscribed from dao", new Object[0]);
            }
        }).doOnNext(new Consumer() { // from class: com.robinhood.librobinhood.data.store.AccountStore$streamCachedOriginalSelfDirectedIndividualAccount$2$3
            @Override // io.reactivex.functions.Consumer
            public final void accept(List<Account> list) {
                Timber.INSTANCE.mo3350d("Dao emitted account list with " + list.size() + " accounts", new Object[0]);
            }
        }).takeUntil(accountStore.getLogoutKillswitch().getKillswitchObservable()).map(new Function() { // from class: com.robinhood.librobinhood.data.store.AccountStore$streamCachedOriginalSelfDirectedIndividualAccount$2$4
            @Override // io.reactivex.functions.Function
            public final Optional<Account> apply(List<Account> accounts2) {
                T next;
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                ArrayList arrayList = new ArrayList();
                for (T t : accounts2) {
                    if (((Account) t).getManagementType() == ManagementType.SELF_DIRECTED) {
                        arrayList.add(t);
                    }
                }
                Iterator<T> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                    if (((Account) next).isOriginal()) {
                        break;
                    }
                }
                Account account = next;
                if (account == null) {
                    account = (Account) CollectionsKt.firstOrNull((List) arrayList);
                }
                return Optional3.asOptional(account);
            }
        }).doOnNext(new Consumer() { // from class: com.robinhood.librobinhood.data.store.AccountStore$streamCachedOriginalSelfDirectedIndividualAccount$2$5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Optional<Account> optional) {
                Timber.INSTANCE.mo3350d("Dao's first account is " + optional, new Object[0]);
            }
        }).replay(1).autoConnect().doOnNext(new Consumer() { // from class: com.robinhood.librobinhood.data.store.AccountStore$streamCachedOriginalSelfDirectedIndividualAccount$2$6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Optional<Account> optional) {
                Timber.INSTANCE.mo3350d("Emitting account from share: " + optional, new Object[0]);
            }
        });
    }

    private final Observable<Account> mapOriginalSelfDirectedIndividualAccount(final Flow<? extends PaginatedResult<ApiAccount>> flow) {
        return asObservable(new Flow<Account>() { // from class: com.robinhood.librobinhood.data.store.AccountStore$mapOriginalSelfDirectedIndividualAccount$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Account> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.AccountStore$mapOriginalSelfDirectedIndividualAccount$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountStore$mapOriginalSelfDirectedIndividualAccount$$inlined$mapNotNull$1$2", m3645f = "AccountStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.AccountStore$mapOriginalSelfDirectedIndividualAccount$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Account accountM2605x793ce273 = AccountStore.INSTANCE.m2605x793ce273(((PaginatedResult) obj).getResults());
                        if (accountM2605x793ce273 != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(accountM2605x793ce273, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        });
    }

    private final Observable<Optional<Account>> streamCachedAccount(String accountNumber) {
        Observable observableTakeUntil = asObservable(this.dao.getAccount(accountNumber)).doOnSubscribe(new Consumer() { // from class: com.robinhood.librobinhood.data.store.AccountStore.streamCachedAccount.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                Timber.INSTANCE.mo3350d("AccountStore subscribed to dao", new Object[0]);
            }
        }).doOnDispose(new Action() { // from class: com.robinhood.librobinhood.data.store.AccountStore.streamCachedAccount.2
            @Override // io.reactivex.functions.Action
            public final void run() {
                Timber.INSTANCE.mo3350d("AccountStore unsubscribed from dao", new Object[0]);
            }
        }).doOnNext(new Consumer() { // from class: com.robinhood.librobinhood.data.store.AccountStore.streamCachedAccount.3
            @Override // io.reactivex.functions.Consumer
            public final void accept(List<Account> list) {
                Timber.INSTANCE.mo3350d("Dao emitted account list with " + list.size() + " accounts", new Object[0]);
            }
        }).takeUntil(getLogoutKillswitch().getKillswitchObservable());
        Intrinsics.checkNotNullExpressionValue(observableTakeUntil, "takeUntil(...)");
        Observable<Optional<Account>> observableDoOnNext = ObservablesKt.mapFirstOptional(observableTakeUntil).doOnNext(new Consumer() { // from class: com.robinhood.librobinhood.data.store.AccountStore.streamCachedAccount.4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Optional<Account> optional) {
                Timber.INSTANCE.mo3350d("Dao's first account is " + optional, new Object[0]);
            }
        }).replay(1).refCount().doOnNext(new Consumer() { // from class: com.robinhood.librobinhood.data.store.AccountStore.streamCachedAccount.5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Optional<Account> optional) {
                Timber.INSTANCE.mo3350d("Emitting account from share: " + optional, new Object[0]);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        return observableDoOnNext;
    }

    private final Observable<Optional<Account>> streamCachedAccountByRhs(String rhsAccountNumber) {
        Observable<Optional<Account>> observableRefCount = ObservablesKt.mapFirstOptional(asObservable(takeWhileLoggedIn(this.dao.getAccountByRhs(rhsAccountNumber)))).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        return observableRefCount;
    }

    private final BehaviorRelay<Optional<String>> getActiveAccountNumber() {
        return (BehaviorRelay) this.activeAccountNumber.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BehaviorRelay activeAccountNumber_delegate$lambda$1(AccountStore accountStore) {
        final BehaviorRelay behaviorRelayCreateDefault = BehaviorRelay.createDefault(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        Observable<Optional<Account>> observableDoOnNext = accountStore.getStreamCachedOriginalSelfDirectedIndividualAccount().takeUntil(new Predicate() { // from class: com.robinhood.librobinhood.data.store.AccountStore$activeAccountNumber$2$1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Optional<Account> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it instanceof Some;
            }
        }).doOnNext(new Consumer() { // from class: com.robinhood.librobinhood.data.store.AccountStore$activeAccountNumber$2$2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Optional<Account> optional) {
                Account accountComponent1 = optional.component1();
                if (accountComponent1 != null) {
                    behaviorRelayCreateDefault.accept(Optional.INSTANCE.m2972of(accountComponent1.getAccountNumber()));
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        ScopedSubscriptionKt.subscribeIn(observableDoOnNext, accountStore.getStoreScope());
        return behaviorRelayCreateDefault;
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    @Deprecated
    /* renamed from: getActiveAccountNumber, reason: collision with other method in class */
    public Observable<Optional<String>> mo22580getActiveAccountNumber() {
        return getActiveAccountNumber();
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Observable<Optional<String>> streamIndividualAccountNumberOptional() {
        Observable<Optional<String>> observableDistinctUntilChanged = streamIndividualAccountOptional().map(new Function() { // from class: com.robinhood.librobinhood.data.store.AccountStore.streamIndividualAccountNumberOptional.1
            @Override // io.reactivex.functions.Function
            public final Optional<String> apply(Optional<Account> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                Account accountComponent1 = optional.component1();
                return Optional3.asOptional(accountComponent1 != null ? accountComponent1.getAccountNumber() : null);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Observable<String> streamIndividualAccountNumber() {
        return ObservablesKt.filterIsPresent(streamIndividualAccountNumberOptional());
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Single<Optional<String>> getIndividualAccountNumber() {
        Single<Optional<String>> originalSelfDirectedIndividualAccountNumberObservable;
        synchronized (this) {
            originalSelfDirectedIndividualAccountNumberObservable = this.accountNumberSingle;
            if (originalSelfDirectedIndividualAccountNumberObservable == null) {
                originalSelfDirectedIndividualAccountNumberObservable = getOriginalSelfDirectedIndividualAccountNumberObservable();
                this.accountNumberSingle = originalSelfDirectedIndividualAccountNumberObservable;
            }
        }
        return originalSelfDirectedIndividualAccountNumberObservable;
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Maybe<String> getIndividualAccountNumberMaybe() {
        return SinglesKt.unwrapOptional(getIndividualAccountNumber());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.android.lib.account.AccountProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIndividualAccountNumberForced(Continuation<? super String> continuation) {
        C335021 c335021;
        if (continuation instanceof C335021) {
            c335021 = (C335021) continuation;
            int i = c335021.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c335021.label = i - Integer.MIN_VALUE;
            } else {
                c335021 = new C335021(continuation);
            }
        }
        Object objAwait = c335021.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c335021.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwait);
            Single<Optional<String>> individualAccountNumber = getIndividualAccountNumber();
            c335021.label = 1;
            objAwait = RxAwait3.await(individualAccountNumber, c335021);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwait);
        }
        String str = (String) ((Optional) objAwait).getOrNull();
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Must have account number!");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.android.lib.account.AccountProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAccountForced(String str, Continuation<? super Account> continuation) {
        C334971 c334971;
        if (continuation instanceof C334971) {
            c334971 = (C334971) continuation;
            int i = c334971.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c334971.label = i - Integer.MIN_VALUE;
            } else {
                c334971 = new C334971(continuation);
            }
        }
        C334971 c3349712 = c334971;
        Object objForceFetch$default = c3349712.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3349712.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<String, ApiAccount> endpoint = this.getAccount;
            c3349712.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, str, null, c3349712, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        return ((ApiAccount) objForceFetch$default).toDbAccount();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.android.lib.account.AccountProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAccountsByTypeForced(BrokerageAccountType brokerageAccountType, Continuation<? super List<Account>> continuation) {
        C334981 c334981;
        if (continuation instanceof C334981) {
            c334981 = (C334981) continuation;
            int i = c334981.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c334981.label = i - Integer.MIN_VALUE;
            } else {
                c334981 = new C334981(continuation);
            }
        }
        Object objFirstOrNull = c334981.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c334981.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            Flow flowForceFetchAllPages = PaginatedEndpointKt.forceFetchAllPages(this.getAccounts);
            c334981.L$0 = brokerageAccountType;
            c334981.label = 1;
            if (FlowKt.collect(flowForceFetchAllPages, c334981) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirstOrNull);
            List list = (List) objFirstOrNull;
            return list == null ? CollectionsKt.emptyList() : list;
        }
        brokerageAccountType = (BrokerageAccountType) c334981.L$0;
        ResultKt.throwOnFailure(objFirstOrNull);
        Flow<List<Account>> accountsByType = this.dao.getAccountsByType(brokerageAccountType);
        c334981.L$0 = null;
        c334981.label = 2;
        objFirstOrNull = FlowKt.firstOrNull(accountsByType, c334981);
    }

    private final Single<Optional<String>> getOriginalSelfDirectedIndividualAccountNumberObservable() {
        Single<Optional<String>> singleCache = getStreamCachedOriginalSelfDirectedIndividualAccount().first(Optional2.INSTANCE).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.AccountStore.getOriginalSelfDirectedIndividualAccountNumberObservable.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<Account>> apply(Optional<Account> account) {
                Intrinsics.checkNotNullParameter(account, "account");
                if (account == Optional2.INSTANCE) {
                    AccountStore accountStore = AccountStore.this;
                    return accountStore.mapOriginalSelfDirectedIndividualAccountOptional(PaginatedEndpointKt.forceFetchAllPages(accountStore.getAccounts));
                }
                Single singleJust = Single.just(account);
                Intrinsics.checkNotNull(singleJust);
                return singleJust;
            }
        }).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.AccountStore.getOriginalSelfDirectedIndividualAccountNumberObservable.2
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<String>> apply(Optional<Account> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                Account accountComponent1 = optional.component1();
                AccountStore accountStore = AccountStore.this;
                synchronized (accountStore) {
                    accountStore.accountNumberSingle = accountComponent1 == null ? null : Single.just(Optional3.asOptional(accountComponent1.getAccountNumber()));
                    Unit unit = Unit.INSTANCE;
                }
                return Single.just(Optional3.asOptional(accountComponent1 != null ? accountComponent1.getAccountNumber() : null));
            }
        }).cache();
        Intrinsics.checkNotNullExpressionValue(singleCache, "cache(...)");
        return singleCache;
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Observable<List<String>> streamAllSelfDirectedAccountNumbers() {
        Observable map = streamAllSelfDirectedAccounts().map(new Function() { // from class: com.robinhood.librobinhood.data.store.AccountStore.streamAllSelfDirectedAccountNumbers.1
            @Override // io.reactivex.functions.Function
            public final List<String> apply(List<Account> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                List<Account> list = it;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((Account) it2.next()).getAccountNumber());
                }
                return arrayList;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Observable<List<String>> streamAllManagedAccountNumbers() {
        Observable map = streamAllManagedAccounts().map(new Function() { // from class: com.robinhood.librobinhood.data.store.AccountStore.streamAllManagedAccountNumbers.1
            @Override // io.reactivex.functions.Function
            public final List<String> apply(List<Account> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                List<Account> list = it;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((Account) it2.next()).getAccountNumber());
                }
                return arrayList;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Observable<Account> streamIndividualAccount() {
        Observable<Optional<Account>> observableDoOnNext = getStreamCachedOriginalSelfDirectedIndividualAccount().doOnNext(new Consumer() { // from class: com.robinhood.librobinhood.data.store.AccountStore.streamIndividualAccount.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Optional<Account> optional) {
                Timber.INSTANCE.mo3350d("Emitting from getAccount: " + optional, new Object[0]);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        return ObservablesKt.filterIsPresent(observableDoOnNext);
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Observable<Account> streamAccount(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return ObservablesKt.filterIsPresent(streamAccountOptional(accountNumber));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportIncorrectAccountNumberArgument(String message) {
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException(message), true, null, 4, null);
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Observable<Optional<Account>> streamAccountOptional(final String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Observable<Optional<Account>> observableDoOnNext = streamCachedAccount(accountNumber).doOnNext(new Consumer() { // from class: com.robinhood.librobinhood.data.store.AccountStore.streamAccountOptional.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Optional<Account> optional) {
                Account accountComponent1 = optional.component1();
                if (Intrinsics.areEqual(accountComponent1 != null ? accountComponent1.getAccountNumber() : null, accountNumber)) {
                    return;
                }
                if (Intrinsics.areEqual(accountComponent1 != null ? accountComponent1.getAccountNumberRhs() : null, accountNumber)) {
                    this.reportIncorrectAccountNumberArgument("(ONLY THROWN IN DEBUG BUILDS: WON'T HAPPEN IN PROD BUILDS) Requested an account by accountNumber, but provided an rhsAccountNumber. You probably want to check your assumptions about this parameter.");
                }
            }
        }).doOnNext(new Consumer() { // from class: com.robinhood.librobinhood.data.store.AccountStore.streamAccountOptional.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Optional<Account> optional) {
                Timber.INSTANCE.mo3350d("Emitting from streamAccountOptional: " + optional, new Object[0]);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        return observableDoOnNext;
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Observable<Account> streamAccountByRhs(String rhsAccountNumber) {
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        return ObservablesKt.filterIsPresent(streamAccountOptionalByRhs(rhsAccountNumber));
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Observable<Optional<Account>> streamAccountOptionalByRhs(final String rhsAccountNumber) {
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        Observable<Optional<Account>> observableDoOnNext = streamCachedAccountByRhs(rhsAccountNumber).doOnNext(new Consumer() { // from class: com.robinhood.librobinhood.data.store.AccountStore.streamAccountOptionalByRhs.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Optional<Account> optional) {
                Account accountComponent1 = optional.component1();
                if (Intrinsics.areEqual(accountComponent1 != null ? accountComponent1.getAccountNumberRhs() : null, rhsAccountNumber)) {
                    return;
                }
                if (Intrinsics.areEqual(accountComponent1 != null ? accountComponent1.getAccountNumber() : null, rhsAccountNumber)) {
                    this.reportIncorrectAccountNumberArgument("Requested an account by rhsAccountNumber, but provided an accountNumber. You probably want to check your assumptions about this parameter.");
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        return observableDoOnNext;
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Flow<List<Account>> streamAccountsByTypes(Set<? extends BrokerageAccountType> types) {
        Intrinsics.checkNotNullParameter(types, "types");
        return takeWhileLoggedIn(this.dao.getAccountsByTypes(types));
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Observable<List<Account>> streamAllSelfDirectedAccounts() {
        final Flow<List<Account>> allAccounts = this.dao.getAllAccounts();
        return asObservable(takeWhileLoggedIn(new Flow<List<? extends Account>>() { // from class: com.robinhood.librobinhood.data.store.AccountStore$streamAllSelfDirectedAccounts$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends Account>> flowCollector, Continuation continuation) {
                Object objCollect = allAccounts.collect(new C334942(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.AccountStore$streamAllSelfDirectedAccounts$$inlined$map$1$2 */
            public static final class C334942<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountStore$streamAllSelfDirectedAccounts$$inlined$map$1$2", m3645f = "AccountStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.AccountStore$streamAllSelfDirectedAccounts$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C334942.this.emit(null, this);
                    }
                }

                public C334942(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        ArrayList arrayList = new ArrayList();
                        for (T t : (List) obj) {
                            if (((Account) t).getManagementType() == ManagementType.SELF_DIRECTED) {
                                arrayList.add(t);
                            }
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        }));
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Observable<List<Account>> streamAllManagedAccounts() {
        final Flow<List<Account>> allAccounts = this.dao.getAllAccounts();
        return asObservable(takeWhileLoggedIn(new Flow<List<? extends Account>>() { // from class: com.robinhood.librobinhood.data.store.AccountStore$streamAllManagedAccounts$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends Account>> flowCollector, Continuation continuation) {
                Object objCollect = allAccounts.collect(new C334932(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.AccountStore$streamAllManagedAccounts$$inlined$map$1$2 */
            public static final class C334932<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountStore$streamAllManagedAccounts$$inlined$map$1$2", m3645f = "AccountStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.AccountStore$streamAllManagedAccounts$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C334932.this.emit(null, this);
                    }
                }

                public C334932(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        ArrayList arrayList = new ArrayList();
                        for (T t : (List) obj) {
                            if (((Account) t).getManagementType() == ManagementType.MANAGED) {
                                arrayList.add(t);
                            }
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        }));
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Observable<List<Account>> streamAllAccounts() {
        return asObservable(takeWhileLoggedIn(this.dao.getAllAccounts()));
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Observable<Account> pollIndividualAccount(long interval, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        PaginatedEndpoint<Unit, ApiAccount> paginatedEndpoint = this.getAccounts;
        Duration durationOfMillis = Duration.ofMillis(timeUnit.toMillis(interval));
        Intrinsics.checkNotNullExpressionValue(durationOfMillis, "ofMillis(...)");
        return mapOriginalSelfDirectedIndividualAccount(PaginatedEndpointKt.pollAllPages(paginatedEndpoint, durationOfMillis));
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Observable<Account> pollAccount(String accountNumber, long interval, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Endpoint<String, ApiAccount> endpoint = this.getAccount;
        Duration durationOfMillis = Duration.ofMillis(timeUnit.toMillis(interval));
        Intrinsics.checkNotNullExpressionValue(durationOfMillis, "ofMillis(...)");
        final Flow flowPoll$default = Endpoint.DefaultImpls.poll$default(endpoint, accountNumber, durationOfMillis, null, 4, null);
        return asObservable(new Flow<Account>() { // from class: com.robinhood.librobinhood.data.store.AccountStore$pollAccount$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Account> flowCollector, Continuation continuation) {
                Object objCollect = flowPoll$default.collect(new C334922(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.AccountStore$pollAccount$$inlined$map$1$2 */
            public static final class C334922<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountStore$pollAccount$$inlined$map$1$2", m3645f = "AccountStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.AccountStore$pollAccount$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C334922.this.emit(null, this);
                    }
                }

                public C334922(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Account dbAccount = ((ApiAccount) obj).toDbAccount();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(dbAccount, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        });
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Single<Boolean> forceFetchHasBrokerageAccountIfNotCached() {
        Single<Boolean> singleFlatMap = asObservable(this.dao.getIndividualAccounts()).first(CollectionsKt.emptyList()).map(new Function() { // from class: com.robinhood.librobinhood.data.store.AccountStore.forceFetchHasBrokerageAccountIfNotCached.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(List<Account> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.isEmpty());
            }
        }).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.AccountStore.forceFetchHasBrokerageAccountIfNotCached.2
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Boolean> apply(Boolean hasAccounts) {
                Intrinsics.checkNotNullParameter(hasAccounts, "hasAccounts");
                if (hasAccounts.booleanValue()) {
                    return Single.just(Boolean.TRUE);
                }
                AccountStore accountStore = AccountStore.this;
                return accountStore.mapOriginalSelfDirectedIndividualAccountOptional(PaginatedEndpointKt.forceFetchAllPages(accountStore.getAccounts)).map(new Function() { // from class: com.robinhood.librobinhood.data.store.AccountStore.forceFetchHasBrokerageAccountIfNotCached.2.1
                    @Override // io.reactivex.functions.Function
                    public final Boolean apply(Optional<Account> it) {
                        boolean z;
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (Intrinsics.areEqual(it, Optional2.INSTANCE)) {
                            z = false;
                        } else {
                            if (!(it instanceof Some)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Observable<Account> getIndividualAccountForced() {
        Observable observableFlatMapObservable = mapOriginalSelfDirectedIndividualAccountOptional(PaginatedEndpointKt.forceFetchAllPages(this.getAccounts)).flatMapObservable(new Function() { // from class: com.robinhood.librobinhood.data.store.AccountStore.getIndividualAccountForced.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Account> apply(Optional<Account> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                Account accountComponent1 = optional.component1();
                if (accountComponent1 != null) {
                    return Observable.just(accountComponent1).concatWith(AccountStore.this.streamIndividualAccount());
                }
                return Observable.empty();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMapObservable, "flatMapObservable(...)");
        return observableFlatMapObservable;
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Observable<Optional<Account>> streamIndividualAccountOptional() {
        return getStreamCachedOriginalSelfDirectedIndividualAccount();
    }

    /* compiled from: AccountStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountStore$streamAllSelfDirectedIndividualAccounts$1", m3645f = "AccountStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.AccountStore$streamAllSelfDirectedIndividualAccounts$1 */
    /* loaded from: classes13.dex */
    static final class C335111 extends ContinuationImpl7 implements Function2<FlowCollector<? super List<? extends Account>>, Continuation<? super Unit>, Object> {
        int label;

        C335111(Continuation<? super C335111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountStore.this.new C335111(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends Account>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super List<Account>>) flowCollector, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super List<Account>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C335111) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AccountStore.this.refresh(false);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Flow<List<Account>> streamAllSelfDirectedIndividualAccounts() {
        return FlowKt.onStart(this.dao.getIndividualSelfDirectedAccounts(), new C335111(null));
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Flow<List<Account>> getAllSelfDirectedIndividualAccountsForced() {
        final Flow flowForceFetchAllPages = PaginatedEndpointKt.forceFetchAllPages(this.getAccounts);
        return FlowKt.distinctUntilChanged(FlowKt.onCompletion(FlowKt.m28818catch(new Flow<List<? extends Account>>() { // from class: com.robinhood.librobinhood.data.store.AccountStore$getAllSelfDirectedIndividualAccountsForced$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends Account>> flowCollector, Continuation continuation) {
                Object objCollect = flowForceFetchAllPages.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.AccountStore$getAllSelfDirectedIndividualAccountsForced$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountStore$getAllSelfDirectedIndividualAccountsForced$$inlined$map$1$2", m3645f = "AccountStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.AccountStore$getAllSelfDirectedIndividualAccountsForced$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        List listFilterSelfDirectedIndividualAccounts = AccountStore.INSTANCE.filterSelfDirectedIndividualAccounts(((PaginatedResult) obj).getResults());
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFilterSelfDirectedIndividualAccounts, 10));
                        Iterator<T> it = listFilterSelfDirectedIndividualAccounts.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((ApiAccount) it.next()).toDbAccount());
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        }, new C334992(null)), new C335003(null)));
    }

    /* compiled from: AccountStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/robinhood/models/db/Account;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountStore$getAllSelfDirectedIndividualAccountsForced$2", m3645f = "AccountStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.AccountStore$getAllSelfDirectedIndividualAccountsForced$2 */
    /* loaded from: classes13.dex */
    static final class C334992 extends ContinuationImpl7 implements Function3<FlowCollector<? super List<? extends Account>>, Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C334992(Continuation<? super C334992> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends Account>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super List<Account>>) flowCollector, th, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super List<Account>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            C334992 c334992 = new C334992(continuation);
            c334992.L$0 = th;
            return c334992.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.L$0;
            if (Throwables.is4xxHttpException(th)) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AccountStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/robinhood/models/db/Account;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountStore$getAllSelfDirectedIndividualAccountsForced$3", m3645f = "AccountStore.kt", m3646l = {393}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.AccountStore$getAllSelfDirectedIndividualAccountsForced$3 */
    /* loaded from: classes13.dex */
    static final class C335003 extends ContinuationImpl7 implements Function3<FlowCollector<? super List<? extends Account>>, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C335003(Continuation<? super C335003> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends Account>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super List<Account>>) flowCollector, th, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super List<Account>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            C335003 c335003 = AccountStore.this.new C335003(continuation);
            c335003.L$0 = flowCollector;
            return c335003.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Flow<List<Account>> individualSelfDirectedAccounts = AccountStore.this.dao.getIndividualSelfDirectedAccounts();
                this.label = 1;
                if (FlowKt.emitAll(flowCollector, individualSelfDirectedAccounts, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Job refresh(boolean force) {
        Timber.INSTANCE.mo3350d("Refreshing account store with force=" + force, new Object[0]);
        return this.getAccounts.refreshAllPages(Unit.INSTANCE, force);
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Completable setWithdrawalsLocked(boolean locked) {
        final ApiReceivedAchSettings.UpdateRequest updateRequest = new ApiReceivedAchSettings.UpdateRequest(Boolean.valueOf(locked));
        Single<R> singleFlatMap = getIndividualAccountNumberMaybe().toSingle().flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.AccountStore.setWithdrawalsLocked.1

            /* compiled from: AccountStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiReceivedAchSettings;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountStore$setWithdrawalsLocked$1$1", m3645f = "AccountStore.kt", m3646l = {412}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.AccountStore$setWithdrawalsLocked$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiReceivedAchSettings>, Object> {
                final /* synthetic */ String $accountNumber;
                final /* synthetic */ ApiReceivedAchSettings.UpdateRequest $request;
                int label;
                final /* synthetic */ AccountStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AccountStore accountStore, String str, ApiReceivedAchSettings.UpdateRequest updateRequest, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = accountStore;
                    this.$accountNumber = str;
                    this.$request = updateRequest;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$accountNumber, this.$request, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiReceivedAchSettings> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    Brokeback brokeback = this.this$0.brokeback;
                    String str = this.$accountNumber;
                    Intrinsics.checkNotNull(str);
                    ApiReceivedAchSettings.UpdateRequest updateRequest = this.$request;
                    this.label = 1;
                    Object objUpdateReceivedAchSettings = brokeback.updateReceivedAchSettings(str, updateRequest, this);
                    return objUpdateReceivedAchSettings == coroutine_suspended ? coroutine_suspended : objUpdateReceivedAchSettings;
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Tuples2<String, ApiReceivedAchSettings>> apply(final String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                AccountStore accountStore = AccountStore.this;
                return RxFactory.DefaultImpls.rxSingle$default(accountStore, null, new AnonymousClass1(accountStore, accountNumber, updateRequest, null), 1, null).map(new Function() { // from class: com.robinhood.librobinhood.data.store.AccountStore.setWithdrawalsLocked.1.2
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<String, ApiReceivedAchSettings> apply(ApiReceivedAchSettings settings) {
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        return new Tuples2<>(accountNumber, settings);
                    }
                });
            }
        });
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        final Function1<Tuples2<? extends String, ? extends ApiReceivedAchSettings>, Unit> function1 = new Function1<Tuples2<? extends String, ? extends ApiReceivedAchSettings>, Unit>() { // from class: com.robinhood.librobinhood.data.store.AccountStore$setWithdrawalsLocked$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Tuples2<? extends String, ? extends ApiReceivedAchSettings> tuples2) {
                m22581invoke(tuples2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22581invoke(Tuples2<? extends String, ? extends ApiReceivedAchSettings> tuples2) {
                if (logoutKillswitch.isLoggedOut()) {
                    Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
                    return;
                }
                try {
                    Tuples2<? extends String, ? extends ApiReceivedAchSettings> tuples22 = tuples2;
                    String strComponent1 = tuples22.component1();
                    Intrinsics.checkNotNullExpressionValue(strComponent1, "component1(...)");
                    ApiReceivedAchSettings apiReceivedAchSettingsComponent2 = tuples22.component2();
                    Intrinsics.checkNotNullExpressionValue(apiReceivedAchSettingsComponent2, "component2(...)");
                    this.dao.updatedReceivedAchSettings(strComponent1, apiReceivedAchSettingsComponent2.getReceived_ach_debit_locked());
                } catch (IllegalStateException e) {
                    if (logoutKillswitch.isLoggedOut()) {
                        Timber.INSTANCE.mo3355e(e, "Ignoring exception due to logout.", new Object[0]);
                        try {
                            roomDatabase.close();
                            return;
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                    throw e;
                }
            }
        };
        Completable completableSubscribeOn = singleFlatMap.doOnSuccess(new Consumer(function1) { // from class: com.robinhood.librobinhood.data.store.AccountStore$sam$io_reactivex_functions_Consumer$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(function1, "function");
                this.function = function1;
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(Object obj) {
                this.function.invoke(obj);
            }
        }).ignoreElement().subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(completableSubscribeOn, "subscribeOn(...)");
        return completableSubscribeOn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<Optional<Account>> mapOriginalSelfDirectedIndividualAccountOptional(Flow<? extends PaginatedResult<ApiAccount>> flow) {
        Single<Optional<Account>> singleFirst = ObservablesKt.toOptionals(mapOriginalSelfDirectedIndividualAccount(flow)).first(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(singleFirst, "first(...)");
        return singleFirst;
    }

    /* compiled from: AccountStore.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0002\b\bJ\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AccountStore$Companion;", "", "<init>", "()V", "getOriginalSelfDirectedIndividualAccount", "Lcom/robinhood/models/db/Account;", "", "Lcom/robinhood/models/api/ApiAccount;", "getOriginalSelfDirectedIndividualAccount$lib_store_account_externalDebug", "filterSelfDirectedIndividualAccounts", "lib-store-account_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getOriginalSelfDirectedIndividualAccount$lib_store_account_externalDebug */
        public final Account m2605x793ce273(List<ApiAccount> list) {
            Object next;
            Intrinsics.checkNotNullParameter(list, "<this>");
            List<ApiAccount> listFilterSelfDirectedIndividualAccounts = filterSelfDirectedIndividualAccounts(list);
            Iterator<T> it = listFilterSelfDirectedIndividualAccounts.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ApiAccount) next).getIs_original()) {
                    break;
                }
            }
            ApiAccount apiAccount = (ApiAccount) next;
            if (apiAccount == null) {
                apiAccount = (ApiAccount) CollectionsKt.firstOrNull((List) listFilterSelfDirectedIndividualAccounts);
            }
            if (apiAccount != null) {
                return apiAccount.toDbAccount();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<ApiAccount> filterSelfDirectedIndividualAccounts(List<ApiAccount> list) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                ApiAccount apiAccount = (ApiAccount) obj;
                if (apiAccount.getBrokerage_account_type() == BrokerageAccountType.INDIVIDUAL && apiAccount.getManagement_type() == ManagementType.SELF_DIRECTED) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }
}
