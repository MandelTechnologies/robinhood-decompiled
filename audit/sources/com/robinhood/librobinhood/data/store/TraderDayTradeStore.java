package com.robinhood.librobinhood.data.store;

import androidx.room.RoomDatabase;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.TraderDayTradeStore;
import com.robinhood.models.api.ApiDayTradeCheck;
import com.robinhood.models.api.ApiDayTrades;
import com.robinhood.models.api.ApiDayTrades2;
import com.robinhood.models.api.ApiDayTrades3;
import com.robinhood.models.dao.EquityDayTradeDao;
import com.robinhood.models.dao.OptionDayTradeDao;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.DayTradeCheck;
import com.robinhood.models.p320db.DayTradeCheck2;
import com.robinhood.models.p320db.DayTrades;
import com.robinhood.models.p320db.DayTrades2;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p355ui.UiDayTrades;
import com.robinhood.models.p355ui.UiDayTrades2;
import com.robinhood.models.p355ui.UiDayTrades3;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.base.DayTradeStore;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

/* compiled from: TraderDayTradeStore.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001>B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0,2\u0006\u0010/\u001a\u000200J\u0010\u00101\u001a\u00020*2\u0006\u00102\u001a\u000203H\u0016J\u0016\u00101\u001a\u00020*2\u0006\u0010/\u001a\u0002002\u0006\u00102\u001a\u000203J\u001c\u00104\u001a\b\u0012\u0004\u0012\u0002050,2\u0006\u0010/\u001a\u0002002\u0006\u00106\u001a\u000207J\u001e\u00108\u001a\b\u0012\u0004\u0012\u00020)092\u0006\u0010/\u001a\u0002002\u0006\u00102\u001a\u000203H\u0002J\u001c\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0-0,2\u0006\u0010/\u001a\u000200H\u0002J\u001c\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0-0,2\u0006\u0010/\u001a\u000200H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/store/base/DayTradeStore;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "equitiesBrokeback", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "equityDayTradeDao", "Lcom/robinhood/models/dao/EquityDayTradeDao;", "optionDayTradeDao", "Lcom/robinhood/models/dao/OptionDayTradeDao;", "<init>", "(Lcom/robinhood/api/retrofit/Brokeback;Lcom/robinhood/api/equity/EquitiesBrokeback;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/EquityDayTradeDao;Lcom/robinhood/models/dao/OptionDayTradeDao;)V", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "getInstrumentStore", "()Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "setInstrumentStore", "(Lcom/robinhood/librobinhood/data/store/InstrumentStore;)V", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "getOptionOrderStore", "()Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "setOptionOrderStore", "(Lcom/robinhood/librobinhood/data/store/OptionOrderStore;)V", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "getOrderStore", "()Lcom/robinhood/librobinhood/data/store/OrderStore;", "setOrderStore", "(Lcom/robinhood/librobinhood/data/store/OrderStore;)V", "saveAction", "Lkotlin/Function1;", "Lcom/robinhood/models/api/ApiDayTrades;", "", "getAllDayTrades", "Lio/reactivex/Observable;", "", "Lcom/robinhood/models/ui/UiDayTrade;", "accountNumber", "", "refresh", "force", "", "getDayTradeCheck", "Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore$DayTradeCheckState;", "instrumentId", "Ljava/util/UUID;", "getNetworkRequest", "Lio/reactivex/Maybe;", "getEquityDayTrades", "Lcom/robinhood/models/ui/UiEquityDayTrade;", "getOptionDayTrades", "Lcom/robinhood/models/ui/UiOptionDayTrade;", "DayTradeCheckState", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class TraderDayTradeStore extends Store implements DayTradeStore {
    public AccountProvider accountProvider;
    private final Brokeback brokeback;
    private final EquitiesBrokeback equitiesBrokeback;
    private final EquityDayTradeDao equityDayTradeDao;
    public InstrumentStore instrumentStore;
    private final OptionDayTradeDao optionDayTradeDao;
    public OptionOrderStore optionOrderStore;
    public OrderStore orderStore;
    private final Function1<ApiDayTrades, Unit> saveAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TraderDayTradeStore(Brokeback brokeback, EquitiesBrokeback equitiesBrokeback, StoreBundle storeBundle, EquityDayTradeDao equityDayTradeDao, OptionDayTradeDao optionDayTradeDao) {
        super(storeBundle, DayTrades.INSTANCE);
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(equitiesBrokeback, "equitiesBrokeback");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(equityDayTradeDao, "equityDayTradeDao");
        Intrinsics.checkNotNullParameter(optionDayTradeDao, "optionDayTradeDao");
        this.brokeback = brokeback;
        this.equitiesBrokeback = equitiesBrokeback;
        this.equityDayTradeDao = equityDayTradeDao;
        this.optionDayTradeDao = optionDayTradeDao;
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.saveAction = new Function1<ApiDayTrades, Unit>() { // from class: com.robinhood.librobinhood.data.store.TraderDayTradeStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiDayTrades apiDayTrades) {
                m22726invoke(apiDayTrades);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22726invoke(ApiDayTrades apiDayTrades) {
                if (logoutKillswitch.isLoggedOut()) {
                    Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
                    return;
                }
                try {
                    ApiDayTrades apiDayTrades2 = apiDayTrades;
                    this.equityDayTradeDao.deleteAllEquityDayTrades(apiDayTrades2.getAccount_number());
                    this.optionDayTradeDao.deleteAllOptionDayTrades(apiDayTrades2.getAccount_number());
                    List<ApiDayTrades2> equity_day_trades = apiDayTrades2.getEquity_day_trades();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(equity_day_trades, 10));
                    Iterator<T> it = equity_day_trades.iterator();
                    while (it.hasNext()) {
                        arrayList.add(DayTrades2.toDbModel((ApiDayTrades2) it.next(), apiDayTrades2.getAccount_number()));
                    }
                    this.equityDayTradeDao.insert(arrayList);
                    List<ApiDayTrades3> option_day_trades = apiDayTrades2.getOption_day_trades();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(option_day_trades, 10));
                    Iterator<T> it2 = option_day_trades.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(DayTrades2.toDbModel((ApiDayTrades3) it2.next(), apiDayTrades2.getAccount_number()));
                    }
                    this.optionDayTradeDao.insert(arrayList2);
                } catch (IllegalStateException e) {
                    if (!logoutKillswitch.isLoggedOut()) {
                        throw e;
                    }
                    Timber.INSTANCE.mo3355e(e, "Ignoring exception due to logout.", new Object[0]);
                    try {
                        roomDatabase.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        };
    }

    public final AccountProvider getAccountProvider() {
        AccountProvider accountProvider = this.accountProvider;
        if (accountProvider != null) {
            return accountProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountProvider");
        return null;
    }

    public final void setAccountProvider(AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "<set-?>");
        this.accountProvider = accountProvider;
    }

    public final InstrumentStore getInstrumentStore() {
        InstrumentStore instrumentStore = this.instrumentStore;
        if (instrumentStore != null) {
            return instrumentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("instrumentStore");
        return null;
    }

    public final void setInstrumentStore(InstrumentStore instrumentStore) {
        Intrinsics.checkNotNullParameter(instrumentStore, "<set-?>");
        this.instrumentStore = instrumentStore;
    }

    public final OptionOrderStore getOptionOrderStore() {
        OptionOrderStore optionOrderStore = this.optionOrderStore;
        if (optionOrderStore != null) {
            return optionOrderStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionOrderStore");
        return null;
    }

    public final void setOptionOrderStore(OptionOrderStore optionOrderStore) {
        Intrinsics.checkNotNullParameter(optionOrderStore, "<set-?>");
        this.optionOrderStore = optionOrderStore;
    }

    public final OrderStore getOrderStore() {
        OrderStore orderStore = this.orderStore;
        if (orderStore != null) {
            return orderStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderStore");
        return null;
    }

    public final void setOrderStore(OrderStore orderStore) {
        Intrinsics.checkNotNullParameter(orderStore, "<set-?>");
        this.orderStore = orderStore;
    }

    public final Observable<List<UiDayTrades>> getAllDayTrades(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Observable<List<UiDayTrades2>> equityDayTrades = getEquityDayTrades(accountNumber);
        Observable<List<UiDayTrades3>> optionDayTrades = getOptionDayTrades(accountNumber);
        Observables observables = Observables.INSTANCE;
        Observable<List<UiDayTrades>> observableCombineLatest = Observable.combineLatest(equityDayTrades, optionDayTrades, new BiFunction<T1, T2, R>() { // from class: com.robinhood.librobinhood.data.store.TraderDayTradeStore$getAllDayTrades$$inlined$combineLatest$1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                return (R) CollectionsKt.sortedWith(CollectionsKt.plus((Collection) t1, (Iterable) t2), new Comparator() { // from class: com.robinhood.librobinhood.data.store.TraderDayTradeStore$getAllDayTrades$lambda$4$$inlined$sortedBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t, T t3) {
                        return ComparisonsKt.compareValues(((UiDayTrades) t).getDayTrade().getDate(), ((UiDayTrades) t3).getDayTrade().getDate());
                    }
                });
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        return observableCombineLatest;
    }

    @Override // com.robinhood.store.base.DayTradeStore
    public void refresh(final boolean force) {
        AccountProvider.DefaultImpls.refresh$default(getAccountProvider(), false, 1, null);
        Completable completableFlatMapCompletable = getAccountProvider().streamAllSelfDirectedAccountNumbers().firstElement().flatMapCompletable(new Function() { // from class: com.robinhood.librobinhood.data.store.TraderDayTradeStore.refresh.1
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(List<String> accountNumbers) {
                Intrinsics.checkNotNullParameter(accountNumbers, "accountNumbers");
                List<String> list = accountNumbers;
                TraderDayTradeStore traderDayTradeStore = TraderDayTradeStore.this;
                boolean z = force;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(traderDayTradeStore.getNetworkRequest((String) it.next(), z).ignoreElement());
                }
                return Completable.merge(arrayList);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
        ScopedSubscriptionKt.subscribeIn(completableFlatMapCompletable, getStoreScope());
    }

    public final void refresh(String accountNumber, boolean force) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        ScopedSubscriptionKt.subscribeIn(getNetworkRequest(accountNumber, force), getStoreScope());
    }

    public final Observable<DayTradeCheckState> getDayTradeCheck(String accountNumber, final UUID instrumentId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        final String url = Instrument.INSTANCE.getUrl(instrumentId);
        Observable<DayTradeCheckState> observableFlatMap = getAccountProvider().streamAccount(accountNumber).take(1L).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.TraderDayTradeStore.getDayTradeCheck.1

            /* compiled from: TraderDayTradeStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiDayTradeCheck;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderDayTradeStore$getDayTradeCheck$1$1", m3645f = "TraderDayTradeStore.kt", m3646l = {86}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.TraderDayTradeStore$getDayTradeCheck$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiDayTradeCheck>, Object> {
                final /* synthetic */ Account $account;
                final /* synthetic */ String $instrumentPath;
                int label;
                final /* synthetic */ TraderDayTradeStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(TraderDayTradeStore traderDayTradeStore, Account account, String str, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = traderDayTradeStore;
                    this.$account = account;
                    this.$instrumentPath = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$account, this.$instrumentPath, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiDayTradeCheck> continuation) {
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
                    EquitiesBrokeback equitiesBrokeback = this.this$0.equitiesBrokeback;
                    String accountNumber = this.$account.getAccountNumber();
                    String str = this.$instrumentPath;
                    this.label = 1;
                    Object dayTradeCheck = equitiesBrokeback.getDayTradeCheck(accountNumber, str, this);
                    return dayTradeCheck == coroutine_suspended ? coroutine_suspended : dayTradeCheck;
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends DayTradeCheckState> apply(final Account account) {
                Intrinsics.checkNotNullParameter(account, "account");
                if (account.isMargin()) {
                    TraderDayTradeStore traderDayTradeStore = TraderDayTradeStore.this;
                    return RxFactory.DefaultImpls.rxSingle$default(traderDayTradeStore, null, new AnonymousClass1(traderDayTradeStore, account, url, null), 1, null).toObservable().map(new Function() { // from class: com.robinhood.librobinhood.data.store.TraderDayTradeStore.getDayTradeCheck.1.2
                        @Override // io.reactivex.functions.Function
                        public final DayTradeCheckState.HasValue apply(ApiDayTradeCheck it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return new DayTradeCheckState.HasValue(account.getAccountNumber(), DayTradeCheck2.toDbModel(it));
                        }
                    });
                }
                return Observable.just(DayTradeCheckState.SkipBecauseCashAccount.INSTANCE);
            }
        }).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.TraderDayTradeStore.getDayTradeCheck.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends DayTradeCheckState> apply(final DayTradeCheckState dayTradeCheck) {
                Intrinsics.checkNotNullParameter(dayTradeCheck, "dayTradeCheck");
                if (dayTradeCheck instanceof DayTradeCheckState.SkipBecauseCashAccount) {
                    return Observable.just(dayTradeCheck);
                }
                if (!(dayTradeCheck instanceof DayTradeCheckState.HasValue)) {
                    throw new NoWhenBranchMatchedException();
                }
                return TraderDayTradeStore.this.getOrderStore().getOrdersByInstrument(instrumentId, ((DayTradeCheckState.HasValue) dayTradeCheck).getAccountNumber()).take(1L).map(new Function() { // from class: com.robinhood.librobinhood.data.store.TraderDayTradeStore.getDayTradeCheck.2.1
                    @Override // io.reactivex.functions.Function
                    public final DayTradeCheckState.HasValue apply(List<Order> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        ((DayTradeCheckState.HasValue) dayTradeCheck).getValue().populateOrders(it);
                        return (DayTradeCheckState.HasValue) dayTradeCheck;
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return observableFlatMap;
    }

    /* compiled from: TraderDayTradeStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiDayTrades;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderDayTradeStore$getNetworkRequest$1", m3645f = "TraderDayTradeStore.kt", m3646l = {115}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.TraderDayTradeStore$getNetworkRequest$1 */
    static final class C343861 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiDayTrades>, Object> {
        final /* synthetic */ String $accountNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C343861(String str, Continuation<? super C343861> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TraderDayTradeStore.this.new C343861(this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiDayTrades> continuation) {
            return ((C343861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Brokeback brokeback = TraderDayTradeStore.this.brokeback;
            String str = this.$accountNumber;
            this.label = 1;
            Object recentDayTrades = brokeback.getRecentDayTrades(str, this);
            return recentDayTrades == coroutine_suspended ? coroutine_suspended : recentDayTrades;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Maybe<ApiDayTrades> getNetworkRequest(String accountNumber, boolean force) {
        Maybe<ApiDayTrades> maybeDoOnSuccess = refresh(RxFactory.DefaultImpls.rxSingle$default(this, null, new C343861(accountNumber, null), 1, null)).saveAction(this.saveAction).force(force).toMaybe(getNetworkWrapper()).doOnSuccess(new C343872());
        Intrinsics.checkNotNullExpressionValue(maybeDoOnSuccess, "doOnSuccess(...)");
        return maybeDoOnSuccess;
    }

    /* compiled from: TraderDayTradeStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.TraderDayTradeStore$getNetworkRequest$2 */
    static final class C343872<T> implements Consumer {
        C343872() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(ApiDayTrades apiDayTrades) {
            TraderDayTradeStore.this.getInstrumentStore().pingInstruments(apiDayTrades.getEquity_day_trades(), new Function1() { // from class: com.robinhood.librobinhood.data.store.TraderDayTradeStore$getNetworkRequest$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TraderDayTradeStore.C343872.accept$lambda$0((ApiDayTrades2) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UUID accept$lambda$0(ApiDayTrades2 dayTrade) {
            Intrinsics.checkNotNullParameter(dayTrade, "dayTrade");
            return dayTrade.getInstrumentId();
        }
    }

    private final Observable<List<UiDayTrades2>> getEquityDayTrades(String accountNumber) {
        return asObservable(takeWhileLoggedIn(this.equityDayTradeDao.getEquityDayTrades(accountNumber)));
    }

    private final Observable<List<UiDayTrades3>> getOptionDayTrades(String accountNumber) {
        return asObservable(takeWhileLoggedIn(this.optionDayTradeDao.getOptionDayTrades(accountNumber)));
    }

    /* compiled from: TraderDayTradeStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore$DayTradeCheckState;", "", "<init>", "()V", "HasValue", "SkipBecauseCashAccount", "Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore$DayTradeCheckState$HasValue;", "Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore$DayTradeCheckState$SkipBecauseCashAccount;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class DayTradeCheckState {
        public /* synthetic */ DayTradeCheckState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DayTradeCheckState() {
        }

        /* compiled from: TraderDayTradeStore.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore$DayTradeCheckState$HasValue;", "Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore$DayTradeCheckState;", "accountNumber", "", "value", "Lcom/robinhood/models/db/DayTradeCheck;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/db/DayTradeCheck;)V", "getAccountNumber", "()Ljava/lang/String;", "getValue", "()Lcom/robinhood/models/db/DayTradeCheck;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class HasValue extends DayTradeCheckState {
            private final String accountNumber;
            private final DayTradeCheck value;

            public static /* synthetic */ HasValue copy$default(HasValue hasValue, String str, DayTradeCheck dayTradeCheck, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = hasValue.accountNumber;
                }
                if ((i & 2) != 0) {
                    dayTradeCheck = hasValue.value;
                }
                return hasValue.copy(str, dayTradeCheck);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            /* renamed from: component2, reason: from getter */
            public final DayTradeCheck getValue() {
                return this.value;
            }

            public final HasValue copy(String accountNumber, DayTradeCheck value) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(value, "value");
                return new HasValue(accountNumber, value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HasValue)) {
                    return false;
                }
                HasValue hasValue = (HasValue) other;
                return Intrinsics.areEqual(this.accountNumber, hasValue.accountNumber) && Intrinsics.areEqual(this.value, hasValue.value);
            }

            public int hashCode() {
                return (this.accountNumber.hashCode() * 31) + this.value.hashCode();
            }

            public String toString() {
                return "HasValue(accountNumber=" + this.accountNumber + ", value=" + this.value + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HasValue(String accountNumber, DayTradeCheck value) {
                super(null);
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(value, "value");
                this.accountNumber = accountNumber;
                this.value = value;
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public final DayTradeCheck getValue() {
                return this.value;
            }
        }

        /* compiled from: TraderDayTradeStore.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore$DayTradeCheckState$SkipBecauseCashAccount;", "Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore$DayTradeCheckState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SkipBecauseCashAccount extends DayTradeCheckState {
            public static final SkipBecauseCashAccount INSTANCE = new SkipBecauseCashAccount();

            public boolean equals(Object other) {
                return this == other || (other instanceof SkipBecauseCashAccount);
            }

            public int hashCode() {
                return -1258822412;
            }

            public String toString() {
                return "SkipBecauseCashAccount";
            }

            private SkipBecauseCashAccount() {
                super(null);
            }
        }
    }
}
