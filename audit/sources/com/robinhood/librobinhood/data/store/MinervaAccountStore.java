package com.robinhood.librobinhood.data.store;

import androidx.room.RoomDatabase;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.directdeposit.p101ui.prefilled.partial.EditDepositAmountActivity;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.api.rhy.RhyCardShipmentEligibilityApi;
import com.robinhood.api.rhy.RhyCmSunsetApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.minerva.ApiCardShipmentEligibility;
import com.robinhood.models.api.minerva.ApiFilledForm;
import com.robinhood.models.api.minerva.ApiMinervaAccount;
import com.robinhood.models.api.minerva.ApiRoutingDetails;
import com.robinhood.models.api.minerva.ApiSetRhyCardPreference;
import com.robinhood.models.api.minerva.ApiShippingUpdateRequest;
import com.robinhood.models.api.minerva.RhyMigrationSunset;
import com.robinhood.models.api.minerva.RhyMigrationVariables;
import com.robinhood.models.dao.MinervaAccountDao;
import com.robinhood.models.p320db.bonfire.RhyAccountRoutingDetails;
import com.robinhood.models.p320db.bonfire.RhyAccountRoutingDetails2;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.models.p320db.mcduckling.MinervaAccount2;
import com.robinhood.models.p355ui.DirectDepositAmount;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import timber.log.Timber;

/* compiled from: MinervaAccountStore.kt */
@Metadata(m3635d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003OPQB1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001b0\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u001fJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u00182\u0006\u0010#\u001a\u00020$J\u0012\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00190\u0018J\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u00182\u0006\u0010'\u001a\u00020$J\u001a\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001b0\u00182\u0006\u0010'\u001a\u00020$J\u001c\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001b0\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010*\u001a\u00020+2\u0006\u0010#\u001a\u00020$2\u0006\u0010,\u001a\u00020\u001fJ\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.J\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u001b0\u0018J\f\u00101\u001a\b\u0012\u0004\u0012\u0002020.J\u0006\u00103\u001a\u00020+J\u0006\u00104\u001a\u00020+J\u000e\u00105\u001a\u000206H\u0086@¢\u0006\u0002\u00107J\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020$H\u0086@¢\u0006\u0002\u0010;J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0086@¢\u0006\u0002\u0010@J&\u0010A\u001a\u00020\u00112\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020FH\u0086@¢\u0006\u0002\u0010GJ\f\u0010H\u001a\b\u0012\u0004\u0012\u00020I0.J\u001c\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130K2\u0006\u0010!\u001a\u00020\u001fH\u0002J\u0014\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001b0.H\u0002J\u0014\u0010M\u001a\u0004\u0018\u00010\u0010*\b\u0012\u0004\u0012\u00020\u00100\u0019H\u0002J\u0014\u0010N\u001a\u0004\u0018\u00010\u0010*\b\u0012\u0004\u0012\u00020\u00100\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006R"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/MinervaAccountDao;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "rhyCmSunsetApi", "Lcom/robinhood/api/rhy/RhyCmSunsetApi;", "rhyCardShipmentEligibilityApi", "Lcom/robinhood/api/rhy/RhyCardShipmentEligibilityApi;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/MinervaAccountDao;Lcom/robinhood/api/retrofit/Minerva;Lcom/robinhood/api/rhy/RhyCmSunsetApi;Lcom/robinhood/api/rhy/RhyCardShipmentEligibilityApi;)V", "saveAction", "Lkotlin/Function1;", "Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "", "accountsSaveAction", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/minerva/ApiMinervaAccount;", "routingDetails", "Lcom/robinhood/models/db/bonfire/RhyAccountRoutingDetails;", "cachedObservable", "Lio/reactivex/Observable;", "", "checkAccount", "Lcom/robinhood/utils/Optional;", "accountType", "Lcom/robinhood/models/api/minerva/ApiMinervaAccount$Type;", "hasAccount", "", "refresh", "force", "streamAccount", "minervaAccountId", "Ljava/util/UUID;", "streamAccounts", "streamRhyMinervaAccount", "rhyAccountId", "streamRhyMinervaAccountOptional", "streamAccountOptional", "toggleLocationProtection", "Lio/reactivex/Completable;", "enable", "getRoutingDetails", "Lio/reactivex/Single;", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$RoutingDetailsResult;", "getRoutingDetailsOptional", "getCmSunset", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$SunsetDetailsResult;", "cmSunsetOptOut", "cmSunsetEmailAccountInfo", "getRhyMigrationVariables", "Lcom/robinhood/models/api/minerva/RhyMigrationVariables;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getShippingUpdateRequest", "Lcom/robinhood/models/api/minerva/ApiShippingUpdateRequest;", "id", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCardPreference", "Lcom/robinhood/models/api/minerva/ApiSetRhyCardPreference;", "rhyCardPreference", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$RhyCardPreference;", "(Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$RhyCardPreference;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitFilledForm", "employerName", "", "signature", EditDepositAmountActivity.EXTRA_DEPOSIT_AMOUNT, "Lcom/robinhood/models/ui/DirectDepositAmount;", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/ui/DirectDepositAmount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRhyCardShipmentEligibility", "Lcom/robinhood/models/api/minerva/ApiCardShipmentEligibility;", "accountsMaybe", "Lio/reactivex/Maybe;", "getBrokerageMinervaAccountForced", "firstBrokerageMinervaAccount", "firstCmAccount", "RoutingDetailsResult", "SunsetDetailsResult", "RhyCardPreference", "lib-store-account_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class MinervaAccountStore extends Store {
    private final Function1<PaginatedResult<ApiMinervaAccount>, Unit> accountsSaveAction;
    private final Observable<List<MinervaAccount>> cachedObservable;
    private final MinervaAccountDao dao;
    private final Minerva minerva;
    private final RhyCardShipmentEligibilityApi rhyCardShipmentEligibilityApi;
    private final RhyCmSunsetApi rhyCmSunsetApi;
    private RhyAccountRoutingDetails routingDetails;
    private final Function1<MinervaAccount, Unit> saveAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinervaAccountStore(StoreBundle storeBundle, final MinervaAccountDao dao, Minerva minerva, RhyCmSunsetApi rhyCmSunsetApi, RhyCardShipmentEligibilityApi rhyCardShipmentEligibilityApi) {
        super(storeBundle, MinervaAccount.INSTANCE);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(minerva, "minerva");
        Intrinsics.checkNotNullParameter(rhyCmSunsetApi, "rhyCmSunsetApi");
        Intrinsics.checkNotNullParameter(rhyCardShipmentEligibilityApi, "rhyCardShipmentEligibilityApi");
        this.dao = dao;
        this.minerva = minerva;
        this.rhyCmSunsetApi = rhyCmSunsetApi;
        this.rhyCardShipmentEligibilityApi = rhyCardShipmentEligibilityApi;
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.saveAction = new Function1<MinervaAccount, Unit>() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MinervaAccount minervaAccount) {
                m22665invoke(minervaAccount);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22665invoke(MinervaAccount minervaAccount) {
                if (!logoutKillswitch.isLoggedOut()) {
                    try {
                        dao.insert(minervaAccount);
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
        final LogoutKillswitch logoutKillswitch2 = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase2 = ((Store) this).roomDatabase;
        this.accountsSaveAction = new Function1<PaginatedResult<? extends ApiMinervaAccount>, Unit>() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore$special$$inlined$safeSave$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PaginatedResult<? extends ApiMinervaAccount> paginatedResult) {
                m22666invoke(paginatedResult);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22666invoke(PaginatedResult<? extends ApiMinervaAccount> paginatedResult) {
                if (!logoutKillswitch2.isLoggedOut()) {
                    try {
                        dao.insertAccounts(paginatedResult);
                        return;
                    } catch (IllegalStateException e) {
                        if (logoutKillswitch2.isLoggedOut()) {
                            Timber.INSTANCE.mo3355e(e, "Ignoring exception due to logout.", new Object[0]);
                            try {
                                roomDatabase2.close();
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
        this.cachedObservable = asObservable(FlowKt.shareIn(takeWhileLoggedIn(FlowKt.distinctUntilChanged(dao.getAccounts())), getStoreScope(), SharingStarted.INSTANCE.getLazily(), 1));
    }

    public static /* synthetic */ Observable checkAccount$default(MinervaAccountStore minervaAccountStore, ApiMinervaAccount.Type type2, int i, Object obj) {
        if ((i & 1) != 0) {
            type2 = ApiMinervaAccount.Type.BROKERAGE;
        }
        return minervaAccountStore.checkAccount(type2);
    }

    public final Observable<Optional<MinervaAccount>> checkAccount(ApiMinervaAccount.Type accountType) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Observable optionals = ObservablesKt.toOptionals(streamAccount(accountType));
        Observable observableAutoConnect = accountsMaybe(true).flatMapObservable(new Function() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore$checkAccount$networkObs$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional2> apply(PaginatedResult<ApiMinervaAccount> page) {
                Intrinsics.checkNotNullParameter(page, "page");
                if (page.getResults().isEmpty()) {
                    return Observable.just(Optional2.INSTANCE);
                }
                return Observable.never();
            }
        }).publish().autoConnect();
        Intrinsics.checkNotNullExpressionValue(observableAutoConnect, "autoConnect(...)");
        Observable<Optional<MinervaAccount>> observableAmb = Observable.amb(CollectionsKt.listOf((Object[]) new Observable[]{optionals, observableAutoConnect}));
        Intrinsics.checkNotNullExpressionValue(observableAmb, "amb(...)");
        return observableAmb;
    }

    public static /* synthetic */ Observable hasAccount$default(MinervaAccountStore minervaAccountStore, ApiMinervaAccount.Type type2, int i, Object obj) {
        if ((i & 1) != 0) {
            type2 = ApiMinervaAccount.Type.BROKERAGE;
        }
        return minervaAccountStore.hasAccount(type2);
    }

    public final Observable<Boolean> hasAccount(ApiMinervaAccount.Type accountType) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Observable map = checkAccount(accountType).map(new Function() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore.hasAccount.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Optional<MinervaAccount> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!(it instanceof Optional2));
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public static /* synthetic */ void refresh$default(MinervaAccountStore minervaAccountStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        minervaAccountStore.refresh(z);
    }

    public final void refresh(boolean force) {
        ScopedSubscriptionKt.subscribeIn(accountsMaybe(force), getStoreScope());
    }

    public static /* synthetic */ Observable streamAccount$default(MinervaAccountStore minervaAccountStore, ApiMinervaAccount.Type type2, int i, Object obj) {
        if ((i & 1) != 0) {
            type2 = ApiMinervaAccount.Type.BROKERAGE;
        }
        return minervaAccountStore.streamAccount(type2);
    }

    public final Observable<MinervaAccount> streamAccount(final ApiMinervaAccount.Type accountType) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Observable<R> map = this.cachedObservable.map(new Function() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore.streamAccount.1
            @Override // io.reactivex.functions.Function
            public final Optional<MinervaAccount> apply(List<MinervaAccount> accounts2) {
                Object next;
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                ApiMinervaAccount.Type type2 = accountType;
                Iterator<T> it = accounts2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((MinervaAccount) next).getAccountType() == type2) {
                        break;
                    }
                }
                return Optional3.asOptional(next);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable<MinervaAccount> observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    public final Observable<MinervaAccount> streamAccount(final UUID minervaAccountId) {
        Intrinsics.checkNotNullParameter(minervaAccountId, "minervaAccountId");
        Observable<R> map = this.cachedObservable.map(new Function() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore.streamAccount.2
            @Override // io.reactivex.functions.Function
            public final Optional<MinervaAccount> apply(List<MinervaAccount> accounts2) {
                Object next;
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                UUID uuid = minervaAccountId;
                Iterator<T> it = accounts2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((MinervaAccount) next).getId(), uuid)) {
                        break;
                    }
                }
                return Optional3.asOptional(next);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable<MinervaAccount> observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    public final Observable<List<MinervaAccount>> streamAccounts() {
        Observable<List<MinervaAccount>> observableDistinctUntilChanged = this.cachedObservable.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    public final Observable<MinervaAccount> streamRhyMinervaAccount(final UUID rhyAccountId) {
        Intrinsics.checkNotNullParameter(rhyAccountId, "rhyAccountId");
        Observable<R> map = this.cachedObservable.map(new Function() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore.streamRhyMinervaAccount.1
            @Override // io.reactivex.functions.Function
            public final Optional<MinervaAccount> apply(List<MinervaAccount> accounts2) {
                Object next;
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                UUID uuid = rhyAccountId;
                Iterator<T> it = accounts2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((MinervaAccount) next).getRhyAccountId(), uuid)) {
                        break;
                    }
                }
                return Optional3.asOptional(next);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable<MinervaAccount> observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    public final Observable<Optional<MinervaAccount>> streamRhyMinervaAccountOptional(final UUID rhyAccountId) {
        Intrinsics.checkNotNullParameter(rhyAccountId, "rhyAccountId");
        Observable<Optional<MinervaAccount>> observableDistinctUntilChanged = this.cachedObservable.map(new Function() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore.streamRhyMinervaAccountOptional.1
            @Override // io.reactivex.functions.Function
            public final Optional<MinervaAccount> apply(List<MinervaAccount> accounts2) {
                Object next;
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                UUID uuid = rhyAccountId;
                Iterator<T> it = accounts2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((MinervaAccount) next).getRhyAccountId(), uuid)) {
                        break;
                    }
                }
                return Optional3.asOptional(next);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    public static /* synthetic */ Observable streamAccountOptional$default(MinervaAccountStore minervaAccountStore, ApiMinervaAccount.Type type2, int i, Object obj) {
        if ((i & 1) != 0) {
            type2 = ApiMinervaAccount.Type.BROKERAGE;
        }
        return minervaAccountStore.streamAccountOptional(type2);
    }

    public final Observable<Optional<MinervaAccount>> streamAccountOptional(final ApiMinervaAccount.Type accountType) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Observable<Optional<MinervaAccount>> observableDistinctUntilChanged = this.cachedObservable.map(new Function() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore.streamAccountOptional.1
            @Override // io.reactivex.functions.Function
            public final Optional<MinervaAccount> apply(List<MinervaAccount> accounts2) {
                Object next;
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                ApiMinervaAccount.Type type2 = accountType;
                Iterator<T> it = accounts2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((MinervaAccount) next).getAccountType() == type2) {
                        break;
                    }
                }
                return Optional3.asOptional(next);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    /* compiled from: MinervaAccountStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/minerva/ApiMinervaAccount;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MinervaAccountStore$toggleLocationProtection$1", m3645f = "MinervaAccountStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.MinervaAccountStore$toggleLocationProtection$1 */
    /* loaded from: classes13.dex */
    static final class C339651 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiMinervaAccount>, Object> {
        final /* synthetic */ boolean $enable;
        final /* synthetic */ UUID $minervaAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C339651(UUID uuid, boolean z, Continuation<? super C339651> continuation) {
            super(2, continuation);
            this.$minervaAccountId = uuid;
            this.$enable = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MinervaAccountStore.this.new C339651(this.$minervaAccountId, this.$enable, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiMinervaAccount> continuation) {
            return ((C339651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Minerva minerva = MinervaAccountStore.this.minerva;
            UUID uuid = this.$minervaAccountId;
            ApiMinervaAccount.ToggleLocationProtection toggleLocationProtection = new ApiMinervaAccount.ToggleLocationProtection(this.$enable);
            this.label = 1;
            Object obj2 = minerva.toggleLocationProtection(uuid, toggleLocationProtection, this);
            return obj2 == coroutine_suspended ? coroutine_suspended : obj2;
        }
    }

    public final Completable toggleLocationProtection(UUID minervaAccountId, boolean enable) {
        Intrinsics.checkNotNullParameter(minervaAccountId, "minervaAccountId");
        Single map = RxFactory.DefaultImpls.rxSingle$default(this, null, new C339651(minervaAccountId, enable, null), 1, null).map(new Function() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore.toggleLocationProtection.2
            @Override // io.reactivex.functions.Function
            public final MinervaAccount apply(ApiMinervaAccount it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return MinervaAccount2.toDbModel(it);
            }
        });
        final Function1<MinervaAccount, Unit> function1 = this.saveAction;
        Completable completableIgnoreElement = map.doOnSuccess(new Consumer(function1) { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore$sam$io_reactivex_functions_Consumer$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(function1, "function");
                this.function = function1;
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(Object obj) {
                this.function.invoke(obj);
            }
        }).ignoreElement();
        Intrinsics.checkNotNullExpressionValue(completableIgnoreElement, "ignoreElement(...)");
        return completableIgnoreElement;
    }

    public final Single<RoutingDetailsResult> getRoutingDetails() {
        RhyAccountRoutingDetails rhyAccountRoutingDetails = this.routingDetails;
        if (rhyAccountRoutingDetails != null) {
            Single<RoutingDetailsResult> singleJust = Single.just(new RoutingDetailsResult.Success(rhyAccountRoutingDetails));
            Intrinsics.checkNotNull(singleJust);
            return singleJust;
        }
        Single singleFlatMap = getBrokerageMinervaAccountForced().flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore.getRoutingDetails.1

            /* compiled from: MinervaAccountStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/minerva/ApiRoutingDetails;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MinervaAccountStore$getRoutingDetails$1$1", m3645f = "MinervaAccountStore.kt", m3646l = {182}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.MinervaAccountStore$getRoutingDetails$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiRoutingDetails>, Object> {
                final /* synthetic */ MinervaAccount $account;
                int label;
                final /* synthetic */ MinervaAccountStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(MinervaAccountStore minervaAccountStore, MinervaAccount minervaAccount, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = minervaAccountStore;
                    this.$account = minervaAccount;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$account, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiRoutingDetails> continuation) {
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
                    Minerva minerva = this.this$0.minerva;
                    UUID id = this.$account.getId();
                    this.label = 1;
                    Object routingDetails = minerva.getRoutingDetails(id, this);
                    return routingDetails == coroutine_suspended ? coroutine_suspended : routingDetails;
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends RoutingDetailsResult> apply(Optional<MinervaAccount> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                MinervaAccount minervaAccountComponent1 = optional.component1();
                if (minervaAccountComponent1 != null) {
                    MinervaAccountStore minervaAccountStore = MinervaAccountStore.this;
                    Single<R> map = RxFactory.DefaultImpls.rxSingle$default(minervaAccountStore, null, new AnonymousClass1(minervaAccountStore, minervaAccountComponent1, null), 1, null).map(new Function() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore.getRoutingDetails.1.2
                        @Override // io.reactivex.functions.Function
                        public final RhyAccountRoutingDetails apply(ApiRoutingDetails p0) {
                            Intrinsics.checkNotNullParameter(p0, "p0");
                            return RhyAccountRoutingDetails2.toDbModel(p0);
                        }
                    });
                    final MinervaAccountStore minervaAccountStore2 = MinervaAccountStore.this;
                    Single<R> map2 = map.doOnSuccess(new Consumer() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore.getRoutingDetails.1.3
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(RhyAccountRoutingDetails rhyAccountRoutingDetails2) {
                            minervaAccountStore2.routingDetails = rhyAccountRoutingDetails2;
                        }
                    }).map(new Function() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore.getRoutingDetails.1.4
                        @Override // io.reactivex.functions.Function
                        public final RoutingDetailsResult.Success apply(RhyAccountRoutingDetails p0) {
                            Intrinsics.checkNotNullParameter(p0, "p0");
                            return new RoutingDetailsResult.Success(p0);
                        }
                    });
                    Intrinsics.checkNotNull(map2);
                    return map2;
                }
                Single singleJust2 = Single.just(RoutingDetailsResult.NoAccountFound.INSTANCE);
                Intrinsics.checkNotNull(singleJust2);
                return singleJust2;
            }
        });
        Intrinsics.checkNotNull(singleFlatMap);
        return singleFlatMap;
    }

    public final Observable<Optional<RoutingDetailsResult>> getRoutingDetailsOptional() {
        RhyAccountRoutingDetails rhyAccountRoutingDetails = this.routingDetails;
        if (rhyAccountRoutingDetails != null) {
            Observable<Optional<RoutingDetailsResult>> observableJust = Observable.just(Optional.INSTANCE.m2972of(new RoutingDetailsResult.Success(rhyAccountRoutingDetails)));
            Intrinsics.checkNotNull(observableJust);
            return observableJust;
        }
        Observable<Optional<RoutingDetailsResult>> observableFlatMap = streamAccountOptional$default(this, null, 1, null).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore.getRoutingDetailsOptional.1

            /* compiled from: MinervaAccountStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/minerva/ApiRoutingDetails;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MinervaAccountStore$getRoutingDetailsOptional$1$1", m3645f = "MinervaAccountStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.MinervaAccountStore$getRoutingDetailsOptional$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiRoutingDetails>, Object> {
                final /* synthetic */ MinervaAccount $account;
                int label;
                final /* synthetic */ MinervaAccountStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(MinervaAccountStore minervaAccountStore, MinervaAccount minervaAccount, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = minervaAccountStore;
                    this.$account = minervaAccount;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$account, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiRoutingDetails> continuation) {
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
                    Minerva minerva = this.this$0.minerva;
                    UUID id = this.$account.getId();
                    this.label = 1;
                    Object routingDetails = minerva.getRoutingDetails(id, this);
                    return routingDetails == coroutine_suspended ? coroutine_suspended : routingDetails;
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<RoutingDetailsResult>> apply(Optional<MinervaAccount> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                MinervaAccount minervaAccountComponent1 = optional.component1();
                if (minervaAccountComponent1 != null) {
                    MinervaAccountStore minervaAccountStore = MinervaAccountStore.this;
                    Single<R> map = RxFactory.DefaultImpls.rxSingle$default(minervaAccountStore, null, new AnonymousClass1(minervaAccountStore, minervaAccountComponent1, null), 1, null).map(new Function() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore.getRoutingDetailsOptional.1.2
                        @Override // io.reactivex.functions.Function
                        public final RhyAccountRoutingDetails apply(ApiRoutingDetails p0) {
                            Intrinsics.checkNotNullParameter(p0, "p0");
                            return RhyAccountRoutingDetails2.toDbModel(p0);
                        }
                    });
                    final MinervaAccountStore minervaAccountStore2 = MinervaAccountStore.this;
                    Observable<R> observable = map.doOnSuccess(new Consumer() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore.getRoutingDetailsOptional.1.3
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(RhyAccountRoutingDetails rhyAccountRoutingDetails2) {
                            minervaAccountStore2.routingDetails = rhyAccountRoutingDetails2;
                        }
                    }).map(new Function() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore.getRoutingDetailsOptional.1.4
                        @Override // io.reactivex.functions.Function
                        public final RoutingDetailsResult.Success apply(RhyAccountRoutingDetails p0) {
                            Intrinsics.checkNotNullParameter(p0, "p0");
                            return new RoutingDetailsResult.Success(p0);
                        }
                    }).toObservable();
                    Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
                    return ObservablesKt.toOptionals(observable);
                }
                Observable observableJust2 = Observable.just(Optional.INSTANCE.m2972of(RoutingDetailsResult.NoAccountFound.INSTANCE));
                Intrinsics.checkNotNull(observableJust2);
                return observableJust2;
            }
        });
        Intrinsics.checkNotNull(observableFlatMap);
        return observableFlatMap;
    }

    public final Single<SunsetDetailsResult> getCmSunset() {
        Single singleFlatMap = this.cachedObservable.firstOrError().flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore.getCmSunset.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends SunsetDetailsResult> apply(List<MinervaAccount> minervaAccounts) {
                Intrinsics.checkNotNullParameter(minervaAccounts, "minervaAccounts");
                MinervaAccount minervaAccountFirstCmAccount = MinervaAccountStore.this.firstCmAccount(minervaAccounts);
                if (minervaAccountFirstCmAccount != null) {
                    MinervaAccountStore minervaAccountStore = MinervaAccountStore.this;
                    return RxFactory.DefaultImpls.rxSingle$default(minervaAccountStore, null, new AnonymousClass1(minervaAccountStore, minervaAccountFirstCmAccount, null), 1, null);
                }
                Maybe<T> maybeTimeout = MinervaAccountStore.this.accountsMaybe(true).timeout(10L, TimeUnit.SECONDS);
                final MinervaAccountStore minervaAccountStore2 = MinervaAccountStore.this;
                Single<R> singleFlatMapSingle = maybeTimeout.flatMapSingle(new Function() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore.getCmSunset.1.2
                    @Override // io.reactivex.functions.Function
                    public final SingleSource<? extends SunsetDetailsResult> apply(PaginatedResult<ApiMinervaAccount> result) {
                        Intrinsics.checkNotNullParameter(result, "result");
                        MinervaAccountStore minervaAccountStore3 = minervaAccountStore2;
                        List<ApiMinervaAccount> results = result.getResults();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
                        Iterator<T> it = results.iterator();
                        while (it.hasNext()) {
                            arrayList.add(MinervaAccount2.toDbModel((ApiMinervaAccount) it.next()));
                        }
                        MinervaAccount minervaAccountFirstCmAccount2 = minervaAccountStore3.firstCmAccount(arrayList);
                        if (minervaAccountFirstCmAccount2 == null) {
                            Single singleJust = Single.just(SunsetDetailsResult.NoAccountFound.INSTANCE);
                            Intrinsics.checkNotNull(singleJust);
                            return singleJust;
                        }
                        MinervaAccountStore minervaAccountStore4 = minervaAccountStore2;
                        return RxFactory.DefaultImpls.rxSingle$default(minervaAccountStore4, null, new AnonymousClass1(minervaAccountStore4, minervaAccountFirstCmAccount2, null), 1, null);
                    }

                    /* compiled from: MinervaAccountStore.kt */
                    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$SunsetDetailsResult$Success;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MinervaAccountStore$getCmSunset$1$2$1", m3645f = "MinervaAccountStore.kt", m3646l = {EnumC7081g.f2779x59907a3d}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.librobinhood.data.store.MinervaAccountStore$getCmSunset$1$2$1, reason: invalid class name */
                    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super SunsetDetailsResult.Success>, Object> {
                        final /* synthetic */ MinervaAccount $refreshedAccount;
                        int label;
                        final /* synthetic */ MinervaAccountStore this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(MinervaAccountStore minervaAccountStore, MinervaAccount minervaAccount, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.this$0 = minervaAccountStore;
                            this.$refreshedAccount = minervaAccount;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass1(this.this$0, this.$refreshedAccount, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SunsetDetailsResult.Success> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                RhyCmSunsetApi rhyCmSunsetApi = this.this$0.rhyCmSunsetApi;
                                UUID id = this.$refreshedAccount.getId();
                                this.label = 1;
                                obj = rhyCmSunsetApi.getCmShutdown(id, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return new SunsetDetailsResult.Success((RhyMigrationSunset) obj);
                        }
                    }
                });
                Intrinsics.checkNotNull(singleFlatMapSingle);
                return singleFlatMapSingle;
            }

            /* compiled from: MinervaAccountStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$SunsetDetailsResult$Success;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MinervaAccountStore$getCmSunset$1$1", m3645f = "MinervaAccountStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.MinervaAccountStore$getCmSunset$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super SunsetDetailsResult.Success>, Object> {
                final /* synthetic */ MinervaAccount $account;
                int label;
                final /* synthetic */ MinervaAccountStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(MinervaAccountStore minervaAccountStore, MinervaAccount minervaAccount, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = minervaAccountStore;
                    this.$account = minervaAccount;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$account, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SunsetDetailsResult.Success> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        RhyCmSunsetApi rhyCmSunsetApi = this.this$0.rhyCmSunsetApi;
                        UUID id = this.$account.getId();
                        this.label = 1;
                        obj = rhyCmSunsetApi.getCmShutdown(id, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return new SunsetDetailsResult.Success((RhyMigrationSunset) obj);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    public final Completable cmSunsetOptOut() {
        Completable completableFlatMapCompletable = this.cachedObservable.firstOrError().flatMapCompletable(new Function() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore.cmSunsetOptOut.1
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(List<MinervaAccount> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                MinervaAccount minervaAccountFirstCmAccount = MinervaAccountStore.this.firstCmAccount(it);
                if (minervaAccountFirstCmAccount != null) {
                    MinervaAccountStore minervaAccountStore = MinervaAccountStore.this;
                    return RxFactory.DefaultImpls.rxCompletable$default(minervaAccountStore, null, new AnonymousClass1(minervaAccountStore, minervaAccountFirstCmAccount, null), 1, null);
                }
                return Completable.complete();
            }

            /* compiled from: MinervaAccountStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MinervaAccountStore$cmSunsetOptOut$1$1", m3645f = "MinervaAccountStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.MinervaAccountStore$cmSunsetOptOut$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ MinervaAccount $account;
                int label;
                final /* synthetic */ MinervaAccountStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(MinervaAccountStore minervaAccountStore, MinervaAccount minervaAccount, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = minervaAccountStore;
                    this.$account = minervaAccount;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$account, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        RhyCmSunsetApi rhyCmSunsetApi = this.this$0.rhyCmSunsetApi;
                        UUID id = this.$account.getId();
                        this.label = 1;
                        if (rhyCmSunsetApi.cmShutdownOptOut(id, this) == coroutine_suspended) {
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
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
        return completableFlatMapCompletable;
    }

    public final Completable cmSunsetEmailAccountInfo() {
        Completable completableFlatMapCompletable = this.cachedObservable.firstOrError().flatMapCompletable(new Function() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore.cmSunsetEmailAccountInfo.1
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(List<MinervaAccount> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                MinervaAccount minervaAccountFirstCmAccount = MinervaAccountStore.this.firstCmAccount(it);
                if (minervaAccountFirstCmAccount != null) {
                    MinervaAccountStore minervaAccountStore = MinervaAccountStore.this;
                    return RxFactory.DefaultImpls.rxCompletable$default(minervaAccountStore, null, new AnonymousClass1(minervaAccountStore, minervaAccountFirstCmAccount, null), 1, null);
                }
                return Completable.complete();
            }

            /* compiled from: MinervaAccountStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MinervaAccountStore$cmSunsetEmailAccountInfo$1$1", m3645f = "MinervaAccountStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.MinervaAccountStore$cmSunsetEmailAccountInfo$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ MinervaAccount $account;
                int label;
                final /* synthetic */ MinervaAccountStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(MinervaAccountStore minervaAccountStore, MinervaAccount minervaAccount, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = minervaAccountStore;
                    this.$account = minervaAccount;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$account, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        RhyCmSunsetApi rhyCmSunsetApi = this.this$0.rhyCmSunsetApi;
                        UUID id = this.$account.getId();
                        this.label = 1;
                        if (rhyCmSunsetApi.cmShutdownEmailAcctInfo(id, this) == coroutine_suspended) {
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
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
        return completableFlatMapCompletable;
    }

    public final Object getRhyMigrationVariables(Continuation<? super RhyMigrationVariables> continuation) {
        return this.minerva.getRhyMigrationVariables(continuation);
    }

    public final Object getShippingUpdateRequest(UUID uuid, Continuation<? super ApiShippingUpdateRequest> continuation) {
        return this.minerva.getShippingUpdateRequest(uuid, continuation);
    }

    public final Object setCardPreference(RhyCardPreference rhyCardPreference, Continuation<? super ApiSetRhyCardPreference> continuation) {
        return this.minerva.setRhyCardPreference(new ApiSetRhyCardPreference(rhyCardPreference.getCardValue()), continuation);
    }

    public final Object submitFilledForm(String str, String str2, DirectDepositAmount directDepositAmount, Continuation<? super Unit> continuation) {
        ApiFilledForm apiFilledForm = new ApiFilledForm(str, str2, true, null, null, 24, null);
        if (directDepositAmount instanceof DirectDepositAmount.PartialPaycheck.Dollars) {
            apiFilledForm = ApiFilledForm.copy$default(apiFilledForm, null, null, false, ((DirectDepositAmount.PartialPaycheck.Dollars) directDepositAmount).getAmount().toString(), null, 23, null);
        } else if (directDepositAmount instanceof DirectDepositAmount.PartialPaycheck.Percent) {
            apiFilledForm = ApiFilledForm.copy$default(apiFilledForm, null, null, false, null, String.valueOf(((DirectDepositAmount.PartialPaycheck.Percent) directDepositAmount).getPercent()), 15, null);
        } else if (!Intrinsics.areEqual(directDepositAmount, DirectDepositAmount.EntirePaycheck.INSTANCE) && !Intrinsics.areEqual(directDepositAmount, DirectDepositAmount.Unsupported.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objSubmitFilledForm = this.minerva.submitFilledForm(apiFilledForm, continuation);
        return objSubmitFilledForm == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSubmitFilledForm : Unit.INSTANCE;
    }

    public final Single<ApiCardShipmentEligibility> getRhyCardShipmentEligibility() {
        Observable<R> map = streamAccount(ApiMinervaAccount.Type.RHY_SPENDING).map(new Function() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore$getRhyCardShipmentEligibility$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((MinervaAccount) it).getId());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C33951x4c8a1574<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Single<ApiCardShipmentEligibility> singleFlatMap = ObservablesKt.filterIsPresent(map).firstOrError().flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore.getRhyCardShipmentEligibility.2

            /* compiled from: MinervaAccountStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/minerva/ApiCardShipmentEligibility;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MinervaAccountStore$getRhyCardShipmentEligibility$2$1", m3645f = "MinervaAccountStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.MinervaAccountStore$getRhyCardShipmentEligibility$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiCardShipmentEligibility>, Object> {
                final /* synthetic */ UUID $it;
                int label;
                final /* synthetic */ MinervaAccountStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(MinervaAccountStore minervaAccountStore, UUID uuid, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = minervaAccountStore;
                    this.$it = uuid;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$it, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiCardShipmentEligibility> continuation) {
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
                    RhyCardShipmentEligibilityApi rhyCardShipmentEligibilityApi = this.this$0.rhyCardShipmentEligibilityApi;
                    UUID uuid = this.$it;
                    Intrinsics.checkNotNull(uuid);
                    this.label = 1;
                    Object cardShipmentEligibility = rhyCardShipmentEligibilityApi.getCardShipmentEligibility(uuid, this);
                    return cardShipmentEligibility == coroutine_suspended ? coroutine_suspended : cardShipmentEligibility;
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends ApiCardShipmentEligibility> apply(UUID it) {
                Intrinsics.checkNotNullParameter(it, "it");
                MinervaAccountStore minervaAccountStore = MinervaAccountStore.this;
                return RxFactory.DefaultImpls.rxSingle$default(minervaAccountStore, null, new AnonymousClass1(minervaAccountStore, it, null), 1, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Maybe<PaginatedResult<ApiMinervaAccount>> accountsMaybe(boolean force) {
        return refreshPaginated(new Function1() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MinervaAccountStore.accountsMaybe$lambda$2(this.f$0, (String) obj);
            }
        }).saveAction(this.accountsSaveAction).force(force).toMaybe(getNetworkWrapper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Single accountsMaybe$lambda$2(MinervaAccountStore minervaAccountStore, String str) {
        Single singleOnErrorReturn = RxFactory.DefaultImpls.rxSingle$default(minervaAccountStore, null, new MinervaAccountStore2(minervaAccountStore, str, null), 1, null).onErrorReturn(new Function() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore$accountsMaybe$1$2
            @Override // io.reactivex.functions.Function
            public final PaginatedResult<ApiMinervaAccount> apply(Throwable throwable) throws Throwable {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Integer httpStatusCode = Throwables.getHttpStatusCode(throwable);
                if (httpStatusCode == null || httpStatusCode.intValue() != 404) {
                    throw throwable;
                }
                return new PaginatedResult<>(CollectionsKt.emptyList(), null, null, 6, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleOnErrorReturn, "onErrorReturn(...)");
        return singleOnErrorReturn;
    }

    private final Single<Optional<MinervaAccount>> getBrokerageMinervaAccountForced() {
        Single singleFlatMap = this.cachedObservable.firstOrError().flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.MinervaAccountStore.getBrokerageMinervaAccountForced.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<MinervaAccount>> apply(List<MinervaAccount> accounts2) {
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                MinervaAccount minervaAccountFirstBrokerageMinervaAccount = MinervaAccountStore.this.firstBrokerageMinervaAccount(accounts2);
                if (minervaAccountFirstBrokerageMinervaAccount != null) {
                    return Single.just(Optional3.asOptional(minervaAccountFirstBrokerageMinervaAccount));
                }
                return MinervaAccountStore.this.checkAccount(ApiMinervaAccount.Type.BROKERAGE).firstOrError();
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MinervaAccount firstBrokerageMinervaAccount(List<MinervaAccount> list) {
        Object next;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((MinervaAccount) next).getAccountType() == ApiMinervaAccount.Type.BROKERAGE) {
                break;
            }
        }
        return (MinervaAccount) next;
    }

    /* compiled from: MinervaAccountStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$RoutingDetailsResult;", "", "<init>", "()V", "Success", "NoAccountFound", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$RoutingDetailsResult$NoAccountFound;", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$RoutingDetailsResult$Success;", "lib-store-account_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes13.dex */
    public static abstract class RoutingDetailsResult {
        public /* synthetic */ RoutingDetailsResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private RoutingDetailsResult() {
        }

        /* compiled from: MinervaAccountStore.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$RoutingDetailsResult$Success;", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$RoutingDetailsResult;", "routingDetails", "Lcom/robinhood/models/db/bonfire/RhyAccountRoutingDetails;", "<init>", "(Lcom/robinhood/models/db/bonfire/RhyAccountRoutingDetails;)V", "getRoutingDetails", "()Lcom/robinhood/models/db/bonfire/RhyAccountRoutingDetails;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-account_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends RoutingDetailsResult {
            private final RhyAccountRoutingDetails routingDetails;

            public static /* synthetic */ Success copy$default(Success success, RhyAccountRoutingDetails rhyAccountRoutingDetails, int i, Object obj) {
                if ((i & 1) != 0) {
                    rhyAccountRoutingDetails = success.routingDetails;
                }
                return success.copy(rhyAccountRoutingDetails);
            }

            /* renamed from: component1, reason: from getter */
            public final RhyAccountRoutingDetails getRoutingDetails() {
                return this.routingDetails;
            }

            public final Success copy(RhyAccountRoutingDetails routingDetails) {
                Intrinsics.checkNotNullParameter(routingDetails, "routingDetails");
                return new Success(routingDetails);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.routingDetails, ((Success) other).routingDetails);
            }

            public int hashCode() {
                return this.routingDetails.hashCode();
            }

            public String toString() {
                return "Success(routingDetails=" + this.routingDetails + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(RhyAccountRoutingDetails routingDetails) {
                super(null);
                Intrinsics.checkNotNullParameter(routingDetails, "routingDetails");
                this.routingDetails = routingDetails;
            }

            public final RhyAccountRoutingDetails getRoutingDetails() {
                return this.routingDetails;
            }
        }

        /* compiled from: MinervaAccountStore.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$RoutingDetailsResult$NoAccountFound;", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$RoutingDetailsResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-account_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NoAccountFound extends RoutingDetailsResult {
            public static final NoAccountFound INSTANCE = new NoAccountFound();

            public boolean equals(Object other) {
                return this == other || (other instanceof NoAccountFound);
            }

            public int hashCode() {
                return 1831051810;
            }

            public String toString() {
                return "NoAccountFound";
            }

            private NoAccountFound() {
                super(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MinervaAccount firstCmAccount(List<MinervaAccount> list) {
        Object next;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            MinervaAccount minervaAccount = (MinervaAccount) next;
            if (minervaAccount.getAccountType() == ApiMinervaAccount.Type.BROKERAGE && minervaAccount.getEnrollmentState() == ApiMinervaAccount.EnrollmentState.UPGRADED) {
                break;
            }
        }
        return (MinervaAccount) next;
    }

    /* compiled from: MinervaAccountStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$SunsetDetailsResult;", "", "<init>", "()V", "Success", "NoAccountFound", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$SunsetDetailsResult$NoAccountFound;", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$SunsetDetailsResult$Success;", "lib-store-account_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes13.dex */
    public static abstract class SunsetDetailsResult {
        public /* synthetic */ SunsetDetailsResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private SunsetDetailsResult() {
        }

        /* compiled from: MinervaAccountStore.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$SunsetDetailsResult$Success;", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$SunsetDetailsResult;", "cmSunset", "Lcom/robinhood/models/api/minerva/RhyMigrationSunset;", "<init>", "(Lcom/robinhood/models/api/minerva/RhyMigrationSunset;)V", "getCmSunset", "()Lcom/robinhood/models/api/minerva/RhyMigrationSunset;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-account_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends SunsetDetailsResult {
            private final RhyMigrationSunset cmSunset;

            public static /* synthetic */ Success copy$default(Success success, RhyMigrationSunset rhyMigrationSunset, int i, Object obj) {
                if ((i & 1) != 0) {
                    rhyMigrationSunset = success.cmSunset;
                }
                return success.copy(rhyMigrationSunset);
            }

            /* renamed from: component1, reason: from getter */
            public final RhyMigrationSunset getCmSunset() {
                return this.cmSunset;
            }

            public final Success copy(RhyMigrationSunset cmSunset) {
                Intrinsics.checkNotNullParameter(cmSunset, "cmSunset");
                return new Success(cmSunset);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.cmSunset, ((Success) other).cmSunset);
            }

            public int hashCode() {
                return this.cmSunset.hashCode();
            }

            public String toString() {
                return "Success(cmSunset=" + this.cmSunset + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(RhyMigrationSunset cmSunset) {
                super(null);
                Intrinsics.checkNotNullParameter(cmSunset, "cmSunset");
                this.cmSunset = cmSunset;
            }

            public final RhyMigrationSunset getCmSunset() {
                return this.cmSunset;
            }
        }

        /* compiled from: MinervaAccountStore.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$SunsetDetailsResult$NoAccountFound;", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$SunsetDetailsResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-account_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NoAccountFound extends SunsetDetailsResult {
            public static final NoAccountFound INSTANCE = new NoAccountFound();

            public boolean equals(Object other) {
                return this == other || (other instanceof NoAccountFound);
            }

            public int hashCode() {
                return 1391584740;
            }

            public String toString() {
                return "NoAccountFound";
            }

            private NoAccountFound() {
                super(null);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MinervaAccountStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$RhyCardPreference;", "", "cardValue", "", "needsShippingAddress", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "getCardValue", "()Ljava/lang/String;", "getNeedsShippingAddress", "()Z", "PLASTIC", "VIRTUAL", "lib-store-account_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes13.dex */
    public static final class RhyCardPreference {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RhyCardPreference[] $VALUES;
        public static final RhyCardPreference PLASTIC = new RhyCardPreference("PLASTIC", 0, "rhy_green", true);
        public static final RhyCardPreference VIRTUAL = new RhyCardPreference("VIRTUAL", 1, "virtual", false);
        private final String cardValue;
        private final boolean needsShippingAddress;

        private static final /* synthetic */ RhyCardPreference[] $values() {
            return new RhyCardPreference[]{PLASTIC, VIRTUAL};
        }

        public static EnumEntries<RhyCardPreference> getEntries() {
            return $ENTRIES;
        }

        private RhyCardPreference(String str, int i, String str2, boolean z) {
            this.cardValue = str2;
            this.needsShippingAddress = z;
        }

        public final String getCardValue() {
            return this.cardValue;
        }

        public final boolean getNeedsShippingAddress() {
            return this.needsShippingAddress;
        }

        static {
            RhyCardPreference[] rhyCardPreferenceArr$values = $values();
            $VALUES = rhyCardPreferenceArr$values;
            $ENTRIES = EnumEntries2.enumEntries(rhyCardPreferenceArr$values);
        }

        public static RhyCardPreference valueOf(String str) {
            return (RhyCardPreference) Enum.valueOf(RhyCardPreference.class, str);
        }

        public static RhyCardPreference[] values() {
            return (RhyCardPreference[]) $VALUES.clone();
        }
    }
}
