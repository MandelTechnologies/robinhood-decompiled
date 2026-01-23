package com.robinhood.librobinhood.data.store;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.QueryKt;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiCryptoAccount;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.retrofit.NummusApi;
import com.robinhood.models.crypto.dao.CryptoAccountDao;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.crypto.p314db.CryptoAccount2;
import com.robinhood.models.crypto.p314db.CryptoAccountInfo;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.p320db.Account;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.SinglesKt;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.rx2.RxConvert;
import timber.log.Timber;

/* compiled from: CryptoAccountStore.kt */
@Metadata(m3635d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u001b0\u001dJ\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001dJ\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u001dJ\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001dJ\u0010\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0086@¢\u0006\u0002\u0010#J\u0016\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001d2\u0006\u0010%\u001a\u00020&J\u0016\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001d2\u0006\u0010(\u001a\u00020!J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0016J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00020!0/H\u0016J\u0014\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001b0/H\u0016J\f\u00103\u001a\b\u0012\u0004\u0012\u00020!0\u001dJ\u0012\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001b0\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u0010(\u001a\u00020!H\u0016J\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u001b0/2\u0006\u0010(\u001a\u00020!H\u0016J\u0014\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001b06H\u0016J\u000e\u00107\u001a\b\u0012\u0004\u0012\u00020!08H\u0016J\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0016J\u0006\u0010=\u001a\u00020\u0014J\u0014\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u001b0/H\u0016J\b\u0010?\u001a\u00020@H\u0017J\u0014\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00180/H\u0016J\u000e\u0010B\u001a\u00020@H\u0096@¢\u0006\u0002\u0010#J\u0016\u0010C\u001a\u00020@2\u0006\u0010(\u001a\u00020!H\u0096@¢\u0006\u0002\u0010DJ\u001c\u0010E\u001a\b\u0012\u0004\u0012\u0002000\u00182\u0006\u0010F\u001a\u00020GH\u0096@¢\u0006\u0002\u0010HJ\b\u0010I\u001a\u00020@H\u0016J\b\u0010J\u001a\u00020@H\u0016J\u0010\u0010K\u001a\u00020@2\u0006\u0010L\u001a\u00020!H\u0016J\u0010\u0010M\u001a\u00020@2\u0006\u0010L\u001a\u00020!H\u0016J\"\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00180\u001d2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020G0PH\u0016J\u0014\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00180/H\u0016J\u0014\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00180/H\u0016J\u0018\u0010S\u001a\u00020@2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020WH\u0016J \u0010X\u001a\u00020@2\u0006\u0010(\u001a\u00020!2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020WH\u0016J\u000e\u0010Y\u001a\b\u0012\u0004\u0012\u0002000/H\u0016J\b\u0010Z\u001a\u00020@H\u0016J\u0010\u0010[\u001a\u00020@2\u0006\u0010\\\u001a\u00020<H\u0016J\u0014\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00180\u001dH\u0016J\u0014\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00180\u001dH\u0016J\u0018\u0010_\u001a\u00020\u00142\u0006\u0010`\u001a\u00020a2\u0006\u0010(\u001a\u00020!H\u0017J\u0018\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u001d2\u0006\u0010`\u001a\u00020aH\u0017J\u0018\u0010c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001d2\u0006\u0010`\u001a\u00020aH\u0017J\u0018\u0010d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u001d2\u0006\u0010`\u001a\u00020aH\u0017J\u0018\u0010e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010f0\u001d2\u0006\u0010`\u001a\u00020aH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u001b0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b*\u0010+¨\u0006g"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "dao", "Lcom/robinhood/models/crypto/dao/CryptoAccountDao;", "nummus", "Lcom/robinhood/models/api/retrofit/NummusApi;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/models/crypto/dao/CryptoAccountDao;Lcom/robinhood/models/api/retrofit/NummusApi;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/store/StoreBundle;)V", "getAccountsEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "", "Lcom/robinhood/models/api/ApiCryptoAccount;", "getAccountsQuery", "Lcom/robinhood/android/moria/db/Query;", "", "Lcom/robinhood/models/crypto/db/CryptoAccount;", "getAccountQuery", "Lcom/robinhood/utils/Optional;", "streamAccountOptional", "Lkotlinx/coroutines/flow/Flow;", "streamAccount", "streamAllCryptoAccounts", "streamAccountId", "", "fetchCryptoAccount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamSelectedAccountByNummusId", "cryptoAccountId", "Ljava/util/UUID;", "streamSelectedAccountByAccountNumber", "accountNumber", "streamCachedIndividualAccount", "getStreamCachedIndividualAccount", "()Lkotlinx/coroutines/flow/Flow;", "streamCachedIndividualAccount$delegate", "Lkotlin/Lazy;", "streamIndividualAccount", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/Account;", "streamIndividualAccountNumber", "streamIndividualAccountNumberOptional", "streamRhsAccountNumber", "streamRhsAccountNumberOptional", "getIndividualAccountNumber", "Lio/reactivex/Single;", "getIndividualAccountNumberMaybe", "Lio/reactivex/Maybe;", "refresh", "Lkotlinx/coroutines/Job;", "force", "", "refreshIfNull", "streamIndividualAccountOptional", "getActiveAccountNumber", "", "streamAllSelfDirectedAccounts", "getIndividualAccountNumberForced", "getAccountForced", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAccountsByTypeForced", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "(Lcom/robinhood/models/api/BrokerageAccountType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamAllSelfDirectedAccountNumbers", "streamAllManagedAccountNumbers", "streamAccountByRhs", "rhsAccountNumber", "streamAccountOptionalByRhs", "streamAccountsByTypes", "types", "", "streamAllManagedAccounts", "streamAllAccounts", "pollIndividualAccount", "interval", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "pollAccount", "getIndividualAccountForced", "forceFetchHasBrokerageAccountIfNotCached", "setWithdrawalsLocked", "locked", "streamAllSelfDirectedIndividualAccounts", "getAllSelfDirectedIndividualAccountsForced", "setSelectedAccountNumber", "location", "Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation;", "streamAccountNumber", "streamCryptoAccount", "streamCryptoAccountId", "streamAccountInfo", "Lcom/robinhood/models/crypto/db/CryptoAccountInfo;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class CryptoAccountStore extends Store implements AccountProvider, CryptoAccountProvider {
    private final AppType appType;
    private final AuthManager authManager;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoAccountDao dao;
    private final Query<Unit, Optional<CryptoAccount>> getAccountQuery;
    private final PaginatedEndpoint<Unit, ApiCryptoAccount> getAccountsEndpoint;
    private final Query<Unit, List<CryptoAccount>> getAccountsQuery;
    private final NummusApi nummus;

    /* renamed from: streamCachedIndividualAccount$delegate, reason: from kotlin metadata */
    private final Lazy streamCachedIndividualAccount;

    /* compiled from: CryptoAccountStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountStore", m3645f = "CryptoAccountStore.kt", m3646l = {120}, m3647m = "fetchCryptoAccount")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$fetchCryptoAccount$1 */
    /* loaded from: classes13.dex */
    static final class C336681 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C336681(Continuation<? super C336681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoAccountStore.this.fetchCryptoAccount(this);
        }
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public /* bridge */ /* synthetic */ Single forceFetchHasBrokerageAccountIfNotCached() {
        return (Single) m22605forceFetchHasBrokerageAccountIfNotCached();
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    /* renamed from: getActiveAccountNumber */
    public /* bridge */ /* synthetic */ Observable mo22580getActiveAccountNumber() {
        return (Observable) getActiveAccountNumber();
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public /* bridge */ /* synthetic */ Observable pollAccount(String str, long j, TimeUnit timeUnit) {
        return (Observable) m22606pollAccount(str, j, timeUnit);
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public /* bridge */ /* synthetic */ Observable pollIndividualAccount(long j, TimeUnit timeUnit) {
        return (Observable) m22607pollIndividualAccount(j, timeUnit);
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public /* bridge */ /* synthetic */ Completable setWithdrawalsLocked(boolean z) {
        return (Completable) m22608setWithdrawalsLocked(z);
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public /* bridge */ /* synthetic */ Observable streamAccountByRhs(String str) {
        return (Observable) m22609streamAccountByRhs(str);
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public /* bridge */ /* synthetic */ Observable streamAccountOptionalByRhs(String str) {
        return (Observable) m22610streamAccountOptionalByRhs(str);
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public /* bridge */ /* synthetic */ Observable streamAllManagedAccountNumbers() {
        return (Observable) m22611streamAllManagedAccountNumbers();
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public /* bridge */ /* synthetic */ Observable streamAllSelfDirectedAccountNumbers() {
        return (Observable) m22612streamAllSelfDirectedAccountNumbers();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoAccountStore(CryptoExperimentsStore cryptoExperimentsStore, CryptoAccountDao dao, NummusApi nummus2, AuthManager authManager, AppType appType, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(nummus2, "nummus");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.dao = dao;
        this.nummus = nummus2;
        this.authManager = authManager;
        this.appType = appType;
        this.getAccountsEndpoint = PaginatedEndpoint.INSTANCE.create(new CryptoAccountStore2(this, null), getLogoutKillswitch(), new CryptoAccountStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(CryptoAccount.INSTANCE.getNormalStaleTimeout(), storeBundle.getClock()));
        Query.Companion companion = Query.INSTANCE;
        this.getAccountsQuery = Store.create$default(this, companion, "getAccountQuery", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoAccountStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoAccountStore.getAccountsQuery$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoAccountStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoAccountStore.getAccountsQuery$lambda$1(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.getAccountQuery = Store.create$default(this, companion, "getAccountQuery", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoAccountStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoAccountStore.getAccountQuery$lambda$2(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoAccountStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoAccountStore.getAccountQuery$lambda$3(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.streamCachedIndividualAccount = LazyKt.lazy(new Function0() { // from class: com.robinhood.librobinhood.data.store.CryptoAccountStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoAccountStore.streamCachedIndividualAccount_delegate$lambda$12(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job getAccountsQuery$lambda$0(CryptoAccountStore cryptoAccountStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return cryptoAccountStore.getAccountsEndpoint.refreshAllPages(Unit.INSTANCE, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getAccountsQuery$lambda$1(CryptoAccountStore cryptoAccountStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return cryptoAccountStore.dao.getAccounts();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job getAccountQuery$lambda$2(CryptoAccountStore cryptoAccountStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return cryptoAccountStore.getAccountsEndpoint.refreshAllPages(Unit.INSTANCE, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getAccountQuery$lambda$3(CryptoAccountStore cryptoAccountStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Operators.toOptionals(cryptoAccountStore.dao.getDefaultAccount());
    }

    public final Flow<Optional<CryptoAccount>> streamAccountOptional() {
        return QueryKt.asFlow(this.getAccountQuery);
    }

    public final Flow<CryptoAccount> streamAccount() {
        final Flow flowAsFlow = QueryKt.asFlow(this.getAccountQuery);
        return new Flow<CryptoAccount>() { // from class: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamAccount$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamAccount$$inlined$map$1$2 */
            public static final class C336562<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountStore$streamAccount$$inlined$map$1$2", m3645f = "CryptoAccountStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamAccount$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C336562.this.emit(null, this);
                    }
                }

                public C336562(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Multi-variable type inference failed */
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
                        Object orNull = ((Optional) obj).getOrNull();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(orNull, anonymousClass1) == coroutine_suspended) {
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super CryptoAccount> flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new C336562(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Flow<List<CryptoAccount>> streamAllCryptoAccounts() {
        return QueryKt.asFlow(this.getAccountsQuery);
    }

    public final Flow<String> streamAccountId() {
        final Flow flowFilterNotNull = FlowKt.filterNotNull(streamAccount());
        return new Flow<String>() { // from class: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamAccountId$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                Object objCollect = flowFilterNotNull.collect(new C336572(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamAccountId$$inlined$map$1$2 */
            public static final class C336572<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountStore$streamAccountId$$inlined$map$1$2", m3645f = "CryptoAccountStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamAccountId$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C336572.this.emit(null, this);
                    }
                }

                public C336572(FlowCollector flowCollector) {
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
                        String id = ((CryptoAccount) obj).getId();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(id, anonymousClass1) == coroutine_suspended) {
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
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchCryptoAccount(Continuation<? super CryptoAccount> continuation) {
        C336681 c336681;
        if (continuation instanceof C336681) {
            c336681 = (C336681) continuation;
            int i = c336681.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c336681.label = i - Integer.MIN_VALUE;
            } else {
                c336681 = new C336681(continuation);
            }
        }
        C336681 c3366812 = c336681;
        Object objForceFetch$default = c3366812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3366812.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<Tuples2<Unit, PaginationCursor>, PaginatedResult<ApiCryptoAccount>> endpoint = this.getAccountsEndpoint.getEndpoint();
            Tuples2 tuples2M3642to = Tuples4.m3642to(Unit.INSTANCE, null);
            c3366812.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, tuples2M3642to, null, c3366812, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        ApiCryptoAccount apiCryptoAccount = (ApiCryptoAccount) CollectionsKt.firstOrNull(((PaginatedResult) objForceFetch$default).getResults());
        if (apiCryptoAccount != null) {
            return CryptoAccount2.toDbModel(apiCryptoAccount);
        }
        return null;
    }

    public final Flow<CryptoAccount> streamSelectedAccountByNummusId(final UUID cryptoAccountId) {
        Intrinsics.checkNotNullParameter(cryptoAccountId, "cryptoAccountId");
        final Flow flowAsFlow = QueryKt.asFlow(this.getAccountsQuery);
        return new Flow<CryptoAccount>() { // from class: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamSelectedAccountByNummusId$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super CryptoAccount> flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new AnonymousClass2(flowCollector, cryptoAccountId), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamSelectedAccountByNummusId$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ UUID $cryptoAccountId$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountStore$streamSelectedAccountByNummusId$$inlined$map$1$2", m3645f = "CryptoAccountStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamSelectedAccountByNummusId$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, UUID uuid) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$cryptoAccountId$inlined = uuid;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    T next;
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
                        Iterator<T> it = ((List) obj).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                            if (Intrinsics.areEqual(StringsKt.toUuid(((CryptoAccount) next).getId()), this.$cryptoAccountId$inlined)) {
                                break;
                            }
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(next, anonymousClass1) == coroutine_suspended) {
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
        };
    }

    public final Flow<CryptoAccount> streamSelectedAccountByAccountNumber(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        if (this.appType == AppType.RHC) {
            throw new IllegalStateException("RHS account number is not available on RHC. Use `streamSelectedAccountByNummusId` instead.");
        }
        return FlowKt.transformLatest(this.cryptoExperimentsStore.streamCryptoMibExperiment(), new C33665xf713d3e2(null, this, accountNumber));
    }

    private final Flow<CryptoAccount> getStreamCachedIndividualAccount() {
        return (Flow) this.streamCachedIndividualAccount.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamCachedIndividualAccount_delegate$lambda$12(CryptoAccountStore cryptoAccountStore) {
        return FlowKt.onEach(FlowKt.shareIn(FlowKt.onEach(cryptoAccountStore.takeWhileLoggedInNullable(FlowKt.onCompletion(FlowKt.onStart(cryptoAccountStore.streamAccount(), new CryptoAccountStore4(null)), new CryptoAccountStore5(null))), new CryptoAccountStore6(null)), cryptoAccountStore.getStoreScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1), new CryptoAccountStore7(null));
    }

    /* compiled from: CryptoAccountStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/db/CryptoAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountStore$streamIndividualAccount$1", m3645f = "CryptoAccountStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamIndividualAccount$1 */
    /* loaded from: classes13.dex */
    static final class C336711 extends ContinuationImpl7 implements Function2<CryptoAccount, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C336711(Continuation<? super C336711> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C336711 c336711 = new C336711(continuation);
            c336711.L$0 = obj;
            return c336711;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoAccount cryptoAccount, Continuation<? super Unit> continuation) {
            return ((C336711) create(cryptoAccount, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoAccount cryptoAccount = (CryptoAccount) this.L$0;
            Timber.INSTANCE.mo3350d("Emitting from getAccount: " + cryptoAccount, new Object[0]);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Observable<Account> streamIndividualAccount() {
        return asObservable(CryptoAccountStore8.asAccount(FlowKt.filterNotNull(FlowKt.onEach(getStreamCachedIndividualAccount(), new C336711(null)))));
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Observable<String> streamIndividualAccountNumber() {
        final Flow flowFilterNotNull = FlowKt.filterNotNull(getStreamCachedIndividualAccount());
        return asObservable(new Flow<String>() { // from class: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamIndividualAccountNumber$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                Object objCollect = flowFilterNotNull.collect(new C336612(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamIndividualAccountNumber$$inlined$map$1$2 */
            public static final class C336612<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountStore$streamIndividualAccountNumber$$inlined$map$1$2", m3645f = "CryptoAccountStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamIndividualAccountNumber$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C336612.this.emit(null, this);
                    }
                }

                public C336612(FlowCollector flowCollector) {
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
                        String accountNumber = ((CryptoAccount) obj).getAccountNumber();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(accountNumber, anonymousClass1) == coroutine_suspended) {
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
    public Observable<Optional<String>> streamIndividualAccountNumberOptional() {
        final Flow<CryptoAccount> streamCachedIndividualAccount = getStreamCachedIndividualAccount();
        return asObservable(new Flow<Optional<? extends String>>() { // from class: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamIndividualAccountNumberOptional$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Optional<? extends String>> flowCollector, Continuation continuation) {
                Object objCollect = streamCachedIndividualAccount.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamIndividualAccountNumberOptional$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountStore$streamIndividualAccountNumberOptional$$inlined$map$1$2", m3645f = "CryptoAccountStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamIndividualAccountNumberOptional$$inlined$map$1$2$1, reason: invalid class name */
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
                        CryptoAccount cryptoAccount = (CryptoAccount) obj;
                        Optional optionalAsOptional = Optional3.asOptional(cryptoAccount != null ? cryptoAccount.getAccountNumber() : null);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(optionalAsOptional, anonymousClass1) == coroutine_suspended) {
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

    public final Flow<String> streamRhsAccountNumber() {
        if (this.appType == AppType.RHC) {
            throw new IllegalStateException("RHS account number is not available on RHC");
        }
        final Flow flowFilterNotNull = FlowKt.filterNotNull(getStreamCachedIndividualAccount());
        return new Flow<String>() { // from class: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamRhsAccountNumber$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                Object objCollect = flowFilterNotNull.collect(new C336632(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamRhsAccountNumber$$inlined$map$1$2 */
            public static final class C336632<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountStore$streamRhsAccountNumber$$inlined$map$1$2", m3645f = "CryptoAccountStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamRhsAccountNumber$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C336632.this.emit(null, this);
                    }
                }

                public C336632(FlowCollector flowCollector) {
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
                        String rhsAccountNumber = ((CryptoAccount) obj).getRhsAccountNumber();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(rhsAccountNumber, anonymousClass1) == coroutine_suspended) {
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
        };
    }

    public final Flow<Optional<String>> streamRhsAccountNumberOptional() {
        if (this.appType == AppType.RHC) {
            throw new IllegalStateException("RHS account number is not available on RHC");
        }
        final Flow<CryptoAccount> streamCachedIndividualAccount = getStreamCachedIndividualAccount();
        return Operators.toOptionals(new Flow<String>() { // from class: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamRhsAccountNumberOptional$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                Object objCollect = streamCachedIndividualAccount.collect(new C336642(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamRhsAccountNumberOptional$$inlined$map$1$2 */
            public static final class C336642<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountStore$streamRhsAccountNumberOptional$$inlined$map$1$2", m3645f = "CryptoAccountStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamRhsAccountNumberOptional$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C336642.this.emit(null, this);
                    }
                }

                public C336642(FlowCollector flowCollector) {
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
                        CryptoAccount cryptoAccount = (CryptoAccount) obj;
                        String rhsAccountNumber = cryptoAccount != null ? cryptoAccount.getRhsAccountNumber() : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(rhsAccountNumber, anonymousClass1) == coroutine_suspended) {
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
    public Observable<Account> streamAccount(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return asObservable(CryptoAccountStore8.asAccount(FlowKt.filterNotNull(streamAccount())));
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Observable<Optional<Account>> streamAccountOptional(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return asObservable(Operators.toOptionals(CryptoAccountStore8.asAccountNullable(streamAccount())));
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Single<Optional<String>> getIndividualAccountNumber() {
        final Flow flowTake = FlowKt.take(getStreamCachedIndividualAccount(), 1);
        Single<Optional<String>> singleFirstOrError = asObservable(new Flow<Optional<? extends String>>() { // from class: com.robinhood.librobinhood.data.store.CryptoAccountStore$getIndividualAccountNumber$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Optional<? extends String>> flowCollector, Continuation continuation) {
                Object objCollect = flowTake.collect(new C336552(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$getIndividualAccountNumber$$inlined$map$1$2 */
            public static final class C336552<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountStore$getIndividualAccountNumber$$inlined$map$1$2", m3645f = "CryptoAccountStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$getIndividualAccountNumber$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C336552.this.emit(null, this);
                    }
                }

                public C336552(FlowCollector flowCollector) {
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
                        CryptoAccount cryptoAccount = (CryptoAccount) obj;
                        Optional optionalAsOptional = Optional3.asOptional(cryptoAccount != null ? cryptoAccount.getAccountNumber() : null);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(optionalAsOptional, anonymousClass1) == coroutine_suspended) {
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
        }).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        return singleFirstOrError;
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Maybe<String> getIndividualAccountNumberMaybe() {
        return SinglesKt.unwrapOptional(getIndividualAccountNumber());
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Job refresh(boolean force) {
        return this.getAccountsEndpoint.refreshAllPages(Unit.INSTANCE, force);
    }

    public final void refreshIfNull() {
        ScopedSubscriptionKt.subscribeIn(asObservable(FlowKt.take(streamAccountOptional(), 1)), getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoAccountStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoAccountStore.refreshIfNull$lambda$18(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshIfNull$lambda$18(CryptoAccountStore cryptoAccountStore, Optional account) {
        Intrinsics.checkNotNullParameter(account, "account");
        if (account instanceof Optional2) {
            cryptoAccountStore.refresh(true);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Observable<Optional<Account>> streamIndividualAccountOptional() {
        return asObservable(Operators.toOptionals(CryptoAccountStore8.asAccountNullable(getStreamCachedIndividualAccount())));
    }

    @Deprecated
    public Void getActiveAccountNumber() {
        throw new IllegalStateException("Deprecated");
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Observable<List<Account>> streamAllSelfDirectedAccounts() {
        if (this.authManager.isLoggedIn()) {
            Observable map = streamIndividualAccount().map(new Function() { // from class: com.robinhood.librobinhood.data.store.CryptoAccountStore.streamAllSelfDirectedAccounts.1
                @Override // io.reactivex.functions.Function
                public final List<Account> apply(Account it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CollectionsKt.listOf(it);
                }
            });
            Intrinsics.checkNotNull(map);
            return map;
        }
        Observable<List<Account>> observableJust = Observable.just(CollectionsKt.emptyList());
        Intrinsics.checkNotNull(observableJust);
        return observableJust;
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Object getIndividualAccountNumberForced(Continuation<?> continuation) {
        throw new IllegalStateException("Should not be used for RHC");
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Object getAccountForced(String str, Continuation<?> continuation) {
        throw new IllegalStateException("Should not be used for RHC");
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Object getAccountsByTypeForced(BrokerageAccountType brokerageAccountType, Continuation<? super List<Account>> continuation) {
        throw new IllegalStateException("Should not be used for RHC");
    }

    /* renamed from: streamAllSelfDirectedAccountNumbers, reason: collision with other method in class */
    public Void m22612streamAllSelfDirectedAccountNumbers() {
        throw new IllegalStateException("Should not be used for RHC");
    }

    /* renamed from: streamAllManagedAccountNumbers, reason: collision with other method in class */
    public Void m22611streamAllManagedAccountNumbers() {
        throw new IllegalStateException("Should not be used for RHC");
    }

    /* renamed from: streamAccountByRhs, reason: collision with other method in class */
    public Void m22609streamAccountByRhs(String rhsAccountNumber) {
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        throw new IllegalStateException("Should not be used for RHC");
    }

    /* renamed from: streamAccountOptionalByRhs, reason: collision with other method in class */
    public Void m22610streamAccountOptionalByRhs(String rhsAccountNumber) {
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        throw new IllegalStateException("Should not be used for RHC");
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Flow<List<Account>> streamAccountsByTypes(Set<? extends BrokerageAccountType> types) {
        Intrinsics.checkNotNullParameter(types, "types");
        throw new IllegalStateException("Should not be used for RHC");
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Observable<List<Account>> streamAllManagedAccounts() {
        Observable<List<Account>> observableJust = Observable.just(CollectionsKt.emptyList());
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        return observableJust;
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Observable<List<Account>> streamAllAccounts() {
        Observable map = streamIndividualAccount().map(new Function() { // from class: com.robinhood.librobinhood.data.store.CryptoAccountStore.streamAllAccounts.1
            @Override // io.reactivex.functions.Function
            public final List<Account> apply(Account it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return CollectionsKt.listOf(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* renamed from: pollIndividualAccount, reason: collision with other method in class */
    public Void m22607pollIndividualAccount(long interval, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        throw new IllegalStateException("Not yet implemented");
    }

    /* renamed from: pollAccount, reason: collision with other method in class */
    public Void m22606pollAccount(String accountNumber, long interval, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        throw new IllegalStateException("Not yet implemented");
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Observable<Account> getIndividualAccountForced() {
        throw new IllegalStateException("Not yet implemented");
    }

    /* renamed from: forceFetchHasBrokerageAccountIfNotCached, reason: collision with other method in class */
    public Void m22605forceFetchHasBrokerageAccountIfNotCached() {
        throw new IllegalStateException("Should not be used for RHC");
    }

    /* renamed from: setWithdrawalsLocked, reason: collision with other method in class */
    public Void m22608setWithdrawalsLocked(boolean locked) {
        throw new IllegalStateException("Should not be used for RHC");
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Flow<List<Account>> streamAllSelfDirectedIndividualAccounts() {
        throw new IllegalStateException("Should not be used for RHC");
    }

    @Override // com.robinhood.android.lib.account.AccountProvider
    public Flow<List<Account>> getAllSelfDirectedIndividualAccountsForced() {
        throw new IllegalStateException("Should not be used for RHC");
    }

    @Override // com.robinhood.android.lib.account.crypto.CryptoAccountProvider
    @Deprecated
    /* renamed from: setSelectedAccountNumber */
    public void mo15792setSelectedAccountNumber(CryptoAccountSwitcherLocation location, String accountNumber) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        if (this.appType == AppType.TRADER) {
            throw new IllegalStateException("CryptoAccountStore injection is only used for non-selected account functions in US.");
        }
    }

    @Override // com.robinhood.android.lib.account.crypto.CryptoAccountProvider
    @Deprecated
    public Flow<String> streamAccountNumber(CryptoAccountSwitcherLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        if (this.appType != AppType.TRADER) {
            final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(streamIndividualAccountNumberOptional()), Integer.MAX_VALUE, null, 2, null);
            return new Flow<String>() { // from class: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamAccountNumber$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                    Object objCollect = flowBuffer$default.collect(new C336592(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamAccountNumber$$inlined$map$1$2 */
                public static final class C336592<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountStore$streamAccountNumber$$inlined$map$1$2", m3645f = "CryptoAccountStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamAccountNumber$$inlined$map$1$2$1, reason: invalid class name */
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
                            return C336592.this.emit(null, this);
                        }
                    }

                    public C336592(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
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
                            Object orNull = ((Optional) obj).getOrNull();
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(orNull, anonymousClass1) == coroutine_suspended) {
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
            };
        }
        throw new IllegalStateException("CryptoAccountStore injection is only used for non-selected account functions in US.");
    }

    @Override // com.robinhood.android.lib.account.crypto.CryptoAccountProvider
    @Deprecated
    public Flow<CryptoAccount> streamCryptoAccount(CryptoAccountSwitcherLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        if (this.appType == AppType.TRADER) {
            throw new IllegalStateException("CryptoAccountStore injection is only used for non-selected account functions in US.");
        }
        return streamAccount();
    }

    @Override // com.robinhood.android.lib.account.crypto.CryptoAccountProvider
    @Deprecated
    public Flow<UUID> streamCryptoAccountId(CryptoAccountSwitcherLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        if (this.appType == AppType.TRADER) {
            throw new IllegalStateException("CryptoAccountStore injection is only used for non-selected account functions in US.");
        }
        final Flow<CryptoAccount> flowStreamAccount = streamAccount();
        return new Flow<UUID>() { // from class: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamCryptoAccountId$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamAccount.collect(new C336602(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamCryptoAccountId$$inlined$map$1$2 */
            public static final class C336602<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountStore$streamCryptoAccountId$$inlined$map$1$2", m3645f = "CryptoAccountStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamCryptoAccountId$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C336602.this.emit(null, this);
                    }
                }

                public C336602(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    String id;
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
                        CryptoAccount cryptoAccount = (CryptoAccount) obj;
                        UUID uuid = (cryptoAccount == null || (id = cryptoAccount.getId()) == null) ? null : StringsKt.toUuid(id);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(uuid, anonymousClass1) == coroutine_suspended) {
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
        };
    }

    @Override // com.robinhood.android.lib.account.crypto.CryptoAccountProvider
    @Deprecated
    public Flow<CryptoAccountInfo> streamAccountInfo(CryptoAccountSwitcherLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        if (this.appType == AppType.TRADER) {
            throw new IllegalStateException("CryptoAccountStore injection is only used for non-selected account functions in US.");
        }
        final Flow<CryptoAccount> flowStreamAccount = streamAccount();
        return new Flow<CryptoAccountInfo.CryptoAccount>() { // from class: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamAccountInfo$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super CryptoAccountInfo.CryptoAccount> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamAccount.collect(new C336582(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamAccountInfo$$inlined$map$1$2 */
            public static final class C336582<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountStore$streamAccountInfo$$inlined$map$1$2", m3645f = "CryptoAccountStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamAccountInfo$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C336582.this.emit(null, this);
                    }
                }

                public C336582(FlowCollector flowCollector) {
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
                        CryptoAccount cryptoAccount = (CryptoAccount) obj;
                        CryptoAccountInfo.CryptoAccount cryptoAccount2 = cryptoAccount != null ? new CryptoAccountInfo.CryptoAccount(StringsKt.toUuid(cryptoAccount.getId())) : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(cryptoAccount2, anonymousClass1) == coroutine_suspended) {
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
        };
    }
}
