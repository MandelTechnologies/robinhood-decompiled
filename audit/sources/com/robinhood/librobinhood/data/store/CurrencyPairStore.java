package com.robinhood.librobinhood.data.store;

import androidx.room.RoomDatabase;
import com.robinhood.api.retrofit.Nummus;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.g11n.iso.RegionCode;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiCurrencyPair;
import com.robinhood.models.api.retrofit.NummusApi;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p314db.Currency4;
import com.robinhood.models.crypto.p314db.CurrencyPair;
import com.robinhood.models.crypto.p314db.CurrencyPair2;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.dao.CurrencyDao;
import com.robinhood.models.dao.CurrencyPairDao;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
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
import kotlinx.coroutines.flow.FlowKt;
import timber.log.Timber;

/* compiled from: CurrencyPairStore.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ*\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001e0\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e2\b\b\u0002\u0010 \u001a\u00020!J\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001e0\u0019J\u0016\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010$\u001a\u00020\u00152\u0006\u0010#\u001a\u00020!R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0017\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "currencyDao", "Lcom/robinhood/models/dao/CurrencyDao;", "currencyPairDao", "Lcom/robinhood/models/dao/CurrencyPairDao;", "nummus", "Lcom/robinhood/api/retrofit/Nummus;", "nummusApi", "Lcom/robinhood/models/api/retrofit/NummusApi;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/models/dao/CurrencyDao;Lcom/robinhood/models/dao/CurrencyPairDao;Lcom/robinhood/api/retrofit/Nummus;Lcom/robinhood/models/api/retrofit/NummusApi;Lcom/robinhood/shared/app/type/AppType;)V", "saveAction", "Lkotlin/Function1;", "Lcom/robinhood/models/api/ApiCurrencyPair;", "", "saveActionPaginated", "Lcom/robinhood/models/PaginatedResult;", "streamCurrencyPair", "Lio/reactivex/Observable;", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "id", "Ljava/util/UUID;", "streamCurrencyPairs", "", "ids", "allowOmission", "", "refresh", "force", "refreshAll", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CurrencyPairStore extends Store {
    private final AppType appType;
    private final AuthManager authManager;
    private final CurrencyDao currencyDao;
    private final CurrencyPairDao currencyPairDao;
    private final Nummus nummus;
    private final NummusApi nummusApi;
    private final Function1<ApiCurrencyPair, Unit> saveAction;
    private final Function1<PaginatedResult<ApiCurrencyPair>, Unit> saveActionPaginated;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrencyPairStore(StoreBundle storeBundle, AuthManager authManager, CurrencyDao currencyDao, CurrencyPairDao currencyPairDao, Nummus nummus2, NummusApi nummusApi, AppType appType) {
        super(storeBundle, CurrencyPair.INSTANCE);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(currencyDao, "currencyDao");
        Intrinsics.checkNotNullParameter(currencyPairDao, "currencyPairDao");
        Intrinsics.checkNotNullParameter(nummus2, "nummus");
        Intrinsics.checkNotNullParameter(nummusApi, "nummusApi");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.authManager = authManager;
        this.currencyDao = currencyDao;
        this.currencyPairDao = currencyPairDao;
        this.nummus = nummus2;
        this.nummusApi = nummusApi;
        this.appType = appType;
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.saveAction = new Function1<ApiCurrencyPair, Unit>() { // from class: com.robinhood.librobinhood.data.store.CurrencyPairStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiCurrencyPair apiCurrencyPair) {
                m22635invoke(apiCurrencyPair);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22635invoke(ApiCurrencyPair apiCurrencyPair) {
                if (logoutKillswitch.isLoggedOut()) {
                    Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
                    return;
                }
                try {
                    ApiCurrencyPair apiCurrencyPair2 = apiCurrencyPair;
                    this.currencyPairDao.insert((CurrencyPairDao) CurrencyPair2.toDbModel(apiCurrencyPair2));
                    this.currencyDao.insert(CollectionsKt.listOf((Object[]) new Currency[]{Currency4.toDbModel(apiCurrencyPair2.getAssetCurrency()), Currency4.toDbModel(apiCurrencyPair2.getQuoteCurrency())}));
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
        final LogoutKillswitch logoutKillswitch2 = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase2 = ((Store) this).roomDatabase;
        this.saveActionPaginated = new Function1<PaginatedResult<? extends ApiCurrencyPair>, Unit>() { // from class: com.robinhood.librobinhood.data.store.CurrencyPairStore$special$$inlined$safeSave$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PaginatedResult<? extends ApiCurrencyPair> paginatedResult) {
                m22636invoke(paginatedResult);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22636invoke(PaginatedResult<? extends ApiCurrencyPair> paginatedResult) {
                if (logoutKillswitch2.isLoggedOut()) {
                    Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
                    return;
                }
                try {
                    PaginatedResult<? extends ApiCurrencyPair> paginatedResult2 = paginatedResult;
                    CurrencyPairDao currencyPairDao2 = this.currencyPairDao;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(paginatedResult2, 10));
                    Iterator<? extends ApiCurrencyPair> it = paginatedResult2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(CurrencyPair2.toDbModel(it.next()));
                    }
                    currencyPairDao2.insert((Iterable) arrayList);
                    CurrencyDao currencyDao2 = this.currencyDao;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(paginatedResult2, 10));
                    for (ApiCurrencyPair apiCurrencyPair : paginatedResult2) {
                        arrayList2.add(CollectionsKt.listOf((Object[]) new Currency[]{Currency4.toDbModel(apiCurrencyPair.getAssetCurrency()), Currency4.toDbModel(apiCurrencyPair.getQuoteCurrency())}));
                    }
                    currencyDao2.insert(CollectionsKt.flatten(arrayList2));
                } catch (IllegalStateException e) {
                    if (!logoutKillswitch2.isLoggedOut()) {
                        throw e;
                    }
                    Timber.INSTANCE.mo3355e(e, "Ignoring exception due to logout.", new Object[0]);
                    try {
                        roomDatabase2.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        };
    }

    public final Observable<UiCurrencyPair> streamCurrencyPair(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.currencyPairDao.getCurrencyPair(id))));
    }

    public static /* synthetic */ Observable streamCurrencyPairs$default(CurrencyPairStore currencyPairStore, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return currencyPairStore.streamCurrencyPairs(list, z);
    }

    public final Observable<List<UiCurrencyPair>> streamCurrencyPairs(final List<UUID> ids, final boolean allowOmission) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Observable<List<UiCurrencyPair>> observableConcatMap = asObservable(this.currencyPairDao.getCurrencyPairs()).takeUntil(getLogoutKillswitch().getKillswitchObservable()).concatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.CurrencyPairStore.streamCurrencyPairs.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<UiCurrencyPair>> apply(List<UiCurrencyPair> pairs) {
                T next;
                Intrinsics.checkNotNullParameter(pairs, "pairs");
                List<UUID> list = ids;
                ArrayList arrayList = new ArrayList();
                for (UUID uuid : list) {
                    Iterator<T> it = pairs.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = (T) null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.areEqual(((UiCurrencyPair) next).getId(), uuid)) {
                            break;
                        }
                    }
                    UiCurrencyPair uiCurrencyPair = next;
                    if (uiCurrencyPair != null) {
                        arrayList.add(uiCurrencyPair);
                    }
                }
                if (allowOmission || arrayList.size() == ids.size()) {
                    return Observable.just(arrayList);
                }
                return Observable.empty();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableConcatMap, "concatMap(...)");
        return observableConcatMap;
    }

    public final Observable<List<UiCurrencyPair>> streamCurrencyPairs() {
        return asObservable(takeWhileLoggedIn(this.currencyPairDao.getCurrencyPairs()));
    }

    /* compiled from: CurrencyPairStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiCurrencyPair;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CurrencyPairStore$refresh$1", m3645f = "CurrencyPairStore.kt", m3646l = {89}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CurrencyPairStore$refresh$1 */
    static final class C337861 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiCurrencyPair>, Object> {
        final /* synthetic */ UUID $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C337861(UUID uuid, Continuation<? super C337861> continuation) {
            super(2, continuation);
            this.$id = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurrencyPairStore.this.new C337861(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiCurrencyPair> continuation) {
            return ((C337861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Nummus nummus2 = CurrencyPairStore.this.nummus;
            UUID uuid = this.$id;
            this.label = 1;
            Object objFetchCurrencyPair = nummus2.fetchCurrencyPair(uuid, this);
            return objFetchCurrencyPair == coroutine_suspended ? coroutine_suspended : objFetchCurrencyPair;
        }
    }

    public final void refresh(boolean force, UUID id) {
        Single singleRxSingle$default;
        Intrinsics.checkNotNullParameter(id, "id");
        if (this.authManager.isLoggedIn()) {
            singleRxSingle$default = RxFactory.DefaultImpls.rxSingle$default(this, null, new C337861(id, null), 1, null);
        } else {
            singleRxSingle$default = RxFactory.DefaultImpls.rxSingle$default(this, null, new C337872(id, null), 1, null);
        }
        ScopedSubscriptionKt.subscribeIn(refresh(singleRxSingle$default).force(force).key(id).saveAction(this.saveAction).toMaybe(getNetworkWrapper()), getStoreScope());
    }

    /* compiled from: CurrencyPairStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiCurrencyPair;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CurrencyPairStore$refresh$2", m3645f = "CurrencyPairStore.kt", m3646l = {92}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CurrencyPairStore$refresh$2 */
    static final class C337872 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiCurrencyPair>, Object> {
        final /* synthetic */ UUID $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C337872(UUID uuid, Continuation<? super C337872> continuation) {
            super(2, continuation);
            this.$id = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurrencyPairStore.this.new C337872(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiCurrencyPair> continuation) {
            return ((C337872) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            NummusApi nummusApi = CurrencyPairStore.this.nummusApi;
            RegionCode regionCode = CurrencyPairStore.this.appType.toRegionCode();
            UUID uuid = this.$id;
            this.label = 1;
            Object currencyPairAnonymous = nummusApi.getCurrencyPairAnonymous(regionCode, uuid, this);
            return currencyPairAnonymous == coroutine_suspended ? coroutine_suspended : currencyPairAnonymous;
        }
    }

    public final void refreshAll(boolean force) {
        ScopedSubscriptionKt.subscribeIn(refreshPaginated(new Function1() { // from class: com.robinhood.librobinhood.data.store.CurrencyPairStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CurrencyPairStore.refreshAll$lambda$4(this.f$0, (String) obj);
            }
        }).force(force).key(Store.KEY_DEFAULT_PAGINATED).saveAction(this.saveActionPaginated).toMaybe(getNetworkWrapper()), getStoreScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Single refreshAll$lambda$4(CurrencyPairStore currencyPairStore, String str) {
        if (currencyPairStore.authManager.isLoggedIn()) {
            return RxFactory.DefaultImpls.rxSingle$default(currencyPairStore, null, new CurrencyPairStore2(currencyPairStore, str, null), 1, null);
        }
        return RxFactory.DefaultImpls.rxSingle$default(currencyPairStore, null, new CurrencyPairStore3(currencyPairStore, str, null), 1, null);
    }
}
