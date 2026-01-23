package com.robinhood.librobinhood.data.store;

import androidx.room.RoomDatabase;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.retrofit.Nummus;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.CryptoPortfolioStore;
import com.robinhood.models.api.ApiCryptoPortfolio;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.crypto.p314db.CryptoPortfolio;
import com.robinhood.models.crypto.p314db.CryptoPortfolio2;
import com.robinhood.models.dao.CryptoPortfolioDao;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Some;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p408rx.Poll;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import timber.log.Timber;

/* compiled from: CryptoPortfolioStore.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001%B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160 J\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\"0 J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00160 2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020$H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006&"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoPortfolioStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/CryptoPortfolioDao;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "nummus", "Lcom/robinhood/api/retrofit/Nummus;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/CryptoPortfolioDao;Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/api/retrofit/Nummus;)V", "saveAction", "Lkotlin/Function1;", "Lcom/robinhood/models/crypto/db/CryptoPortfolio;", "", "refresh", "force", "", "fetchPortfolioEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/CryptoPortfolioStore$PortfolioArgs;", "Lcom/robinhood/models/api/ApiCryptoPortfolio;", "queryCryptoPortfolio", "Lcom/robinhood/android/moria/db/Query;", "getQueryCryptoPortfolio", "()Lcom/robinhood/android/moria/db/Query;", "streamCryptoPortfolioByCryptoAccountId", "Lkotlinx/coroutines/flow/Flow;", "cryptoAccountId", "Ljava/util/UUID;", "pollCryptoPortfolio", "Lio/reactivex/Observable;", "streamCryptoPortfolioOptional", "Lcom/robinhood/utils/Optional;", "createNetworkObservable", "", "PortfolioArgs", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class CryptoPortfolioStore extends Store {
    private final CryptoAccountStore cryptoAccountStore;
    private final CryptoPortfolioDao dao;
    private final Endpoint<PortfolioArgs, ApiCryptoPortfolio> fetchPortfolioEndpoint;
    private final Nummus nummus;
    private final Query<PortfolioArgs, CryptoPortfolio> queryCryptoPortfolio;
    private final Function1<CryptoPortfolio, Unit> saveAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoPortfolioStore(StoreBundle storeBundle, final CryptoPortfolioDao dao, CryptoAccountStore cryptoAccountStore, Nummus nummus2) {
        super(storeBundle, CryptoPortfolio.INSTANCE);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(nummus2, "nummus");
        this.dao = dao;
        this.cryptoAccountStore = cryptoAccountStore;
        this.nummus = nummus2;
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.saveAction = new Function1<CryptoPortfolio, Unit>() { // from class: com.robinhood.librobinhood.data.store.CryptoPortfolioStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CryptoPortfolio cryptoPortfolio) {
                m22624invoke(cryptoPortfolio);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22624invoke(CryptoPortfolio cryptoPortfolio) {
                if (!logoutKillswitch.isLoggedOut()) {
                    try {
                        dao.insert(cryptoPortfolio);
                        return;
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
                Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
            }
        };
        Endpoint<PortfolioArgs, ApiCryptoPortfolio> endpointCreate$default = Endpoint.Companion.create$default(Endpoint.INSTANCE, new CryptoPortfolioStore2(this, null), getLogoutKillswitch(), new CryptoPortfolioStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.fetchPortfolioEndpoint = endpointCreate$default;
        this.queryCryptoPortfolio = Store.create$default(this, Query.INSTANCE, "streamCryptoPortfolio", CollectionsKt.listOf(new RefreshEach(new CryptoPortfolioStore4(endpointCreate$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoPortfolioStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoPortfolioStore.queryCryptoPortfolio$lambda$1(this.f$0, (CryptoPortfolioStore.PortfolioArgs) obj);
            }
        }, false, 8, null);
    }

    public final void refresh(final boolean force) {
        this.cryptoAccountStore.refresh(false);
        Observable observableTake = asObservable(this.cryptoAccountStore.streamAccountOptional()).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        ScopedSubscriptionKt.subscribeIn(observableTake, getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoPortfolioStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoPortfolioStore.refresh$lambda$0(this.f$0, force, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refresh$lambda$0(final CryptoPortfolioStore cryptoPortfolioStore, final boolean z, Optional optional) {
        if (optional instanceof Some) {
            Observable observableSwitchMap = cryptoPortfolioStore.asObservable(FlowKt.filterNotNull(cryptoPortfolioStore.cryptoAccountStore.streamAccount())).take(1L).switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.CryptoPortfolioStore$refresh$1$1
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends ApiCryptoPortfolio> apply(CryptoAccount it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return this.this$0.createNetworkObservable(z, it.getId());
                }
            });
            Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
            ScopedSubscriptionKt.subscribeIn(observableSwitchMap, cryptoPortfolioStore.getStoreScope());
        }
        return Unit.INSTANCE;
    }

    public final Query<PortfolioArgs, CryptoPortfolio> getQueryCryptoPortfolio() {
        return this.queryCryptoPortfolio;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryCryptoPortfolio$lambda$1(CryptoPortfolioStore cryptoPortfolioStore, PortfolioArgs args) {
        Intrinsics.checkNotNullParameter(args, "args");
        if (args.getCryptoAccountId() != null) {
            return cryptoPortfolioStore.dao.getCryptoPortfolioById(args.getCryptoAccountId());
        }
        return Operators.mapFirstItemOrNull(cryptoPortfolioStore.dao.getCryptoPortfolioOrEmpty());
    }

    public final Flow<CryptoPortfolio> streamCryptoPortfolioByCryptoAccountId(UUID cryptoAccountId) {
        Intrinsics.checkNotNullParameter(cryptoAccountId, "cryptoAccountId");
        return this.queryCryptoPortfolio.asFlow(new PortfolioArgs(cryptoAccountId));
    }

    /* compiled from: CryptoPortfolioStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoPortfolioStore$PortfolioArgs;", "", "cryptoAccountId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getCryptoAccountId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class PortfolioArgs {
        private final UUID cryptoAccountId;

        public static /* synthetic */ PortfolioArgs copy$default(PortfolioArgs portfolioArgs, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = portfolioArgs.cryptoAccountId;
            }
            return portfolioArgs.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCryptoAccountId() {
            return this.cryptoAccountId;
        }

        public final PortfolioArgs copy(UUID cryptoAccountId) {
            return new PortfolioArgs(cryptoAccountId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PortfolioArgs) && Intrinsics.areEqual(this.cryptoAccountId, ((PortfolioArgs) other).cryptoAccountId);
        }

        public int hashCode() {
            UUID uuid = this.cryptoAccountId;
            if (uuid == null) {
                return 0;
            }
            return uuid.hashCode();
        }

        public String toString() {
            return "PortfolioArgs(cryptoAccountId=" + this.cryptoAccountId + ")";
        }

        public PortfolioArgs(UUID uuid) {
            this.cryptoAccountId = uuid;
        }

        public final UUID getCryptoAccountId() {
            return this.cryptoAccountId;
        }
    }

    public final Observable<ApiCryptoPortfolio> pollCryptoPortfolio() {
        Observable<ApiCryptoPortfolio> observableSwitchMap = asObservable(FlowKt.filterNotNull(this.cryptoAccountStore.streamAccount())).take(1L).switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.CryptoPortfolioStore.pollCryptoPortfolio.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ApiCryptoPortfolio> apply(CryptoAccount account) {
                Intrinsics.checkNotNullParameter(account, "account");
                ScopedSubscriptionKt.subscribeIn(CryptoPortfolioStore.this.createNetworkObservable(false, account.getId()), CryptoPortfolioStore.this.getStoreScope());
                Observable<R> observableCompose = CryptoPortfolioStore.this.createNetworkObservable(true, account.getId()).compose(new Poll(5L, TimeUnit.SECONDS, true));
                Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
                return observableCompose;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    public final Observable<Optional<CryptoPortfolio>> streamCryptoPortfolioOptional() {
        return ObservablesKt.mapFirstOptional(asObservable(takeWhileLoggedIn(this.dao.getCryptoPortfolioOrEmpty())));
    }

    /* compiled from: CryptoPortfolioStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiCryptoPortfolio;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoPortfolioStore$createNetworkObservable$1", m3645f = "CryptoPortfolioStore.kt", m3646l = {113}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoPortfolioStore$createNetworkObservable$1 */
    /* loaded from: classes13.dex */
    static final class C337431 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiCryptoPortfolio>, Object> {
        final /* synthetic */ String $cryptoAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C337431(String str, Continuation<? super C337431> continuation) {
            super(2, continuation);
            this.$cryptoAccountId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPortfolioStore.this.new C337431(this.$cryptoAccountId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiCryptoPortfolio> continuation) {
            return ((C337431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Nummus nummus2 = CryptoPortfolioStore.this.nummus;
            String str = this.$cryptoAccountId;
            this.label = 1;
            Object objFetchPortfolio = nummus2.fetchPortfolio(str, this);
            return objFetchPortfolio == coroutine_suspended ? coroutine_suspended : objFetchPortfolio;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<ApiCryptoPortfolio> createNetworkObservable(boolean force, String cryptoAccountId) {
        Observable<ApiCryptoPortfolio> observable = refresh(RxFactory.DefaultImpls.rxSingle$default(this, null, new C337431(cryptoAccountId, null), 1, null)).key(cryptoAccountId).force(force).saveAction(new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoPortfolioStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoPortfolioStore.createNetworkObservable$lambda$2(this.f$0, (ApiCryptoPortfolio) obj);
            }
        }).toMaybe(getNetworkWrapper()).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createNetworkObservable$lambda$2(CryptoPortfolioStore cryptoPortfolioStore, ApiCryptoPortfolio it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cryptoPortfolioStore.saveAction.invoke(CryptoPortfolio2.toDbModel$default(it, null, 1, null));
        return Unit.INSTANCE;
    }
}
