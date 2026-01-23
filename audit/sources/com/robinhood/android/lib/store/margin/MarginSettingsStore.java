package com.robinhood.android.lib.store.margin;

import androidx.room.RoomDatabase;
import com.robinhood.android.data.store.portfolio.TraderPortfolioStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiMarginInvestingInfo;
import com.robinhood.models.api.ApiMarginSetting;
import com.robinhood.models.api.BrokebackMarginApi;
import com.robinhood.models.api.MarginCall;
import com.robinhood.models.dao.MarginSettingsDao;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.MarginSetting;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.models.subscription.api.MarginUpgradePlans;
import com.robinhood.models.subscription.api.MarginUpgradePlans2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.schedulers.Schedulers;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import timber.log.Timber;

/* compiled from: MarginSettingsStore.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0018J\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001bJ\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001fJ\u001e\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0 0\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00152\u0006\u0010\u0017\u001a\u00020\u0018J \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0&0\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u0016\u0010'\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010(R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/lib/store/margin/MarginSettingsStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/MarginSettingsDao;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "brokebackMarginApi", "Lcom/robinhood/models/api/BrokebackMarginApi;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/MarginSettingsDao;Lcom/robinhood/api/retrofit/Brokeback;Lcom/robinhood/models/api/BrokebackMarginApi;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;)V", "saveAction", "Lkotlin/Function1;", "Lcom/robinhood/models/api/ApiMarginSetting;", "", "getMarginSettings", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/MarginSetting;", "accountNumber", "", "refreshAccount", "force", "", "updateDayTradeSetting", "enableDayTradesProtection", "getMarginSubscriptionPlans", "Lio/reactivex/Single;", "", "Lcom/robinhood/models/subscription/api/MarginUpgradePlan;", "getMarginCalls", "Lcom/robinhood/models/api/MarginCall;", "isUnderMarginCall", "getUnmetMaintenanceCall", "Lcom/robinhood/utils/Optional;", "isEligibleForTieredRates", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class MarginSettingsStore extends Store {
    private final AccountProvider accountProvider;
    private final Brokeback brokeback;
    private final BrokebackMarginApi brokebackMarginApi;
    private final MarginSettingsDao dao;
    private final TraderPortfolioStore portfolioStore;
    private final Function1<ApiMarginSetting, Unit> saveAction;

    /* compiled from: MarginSettingsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.store.margin.MarginSettingsStore", m3645f = "MarginSettingsStore.kt", m3646l = {102}, m3647m = "isEligibleForTieredRates")
    /* renamed from: com.robinhood.android.lib.store.margin.MarginSettingsStore$isEligibleForTieredRates$1 */
    /* loaded from: classes8.dex */
    static final class C205851 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C205851(Continuation<? super C205851> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MarginSettingsStore.this.isEligibleForTieredRates(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginSettingsStore(StoreBundle storeBundle, final MarginSettingsDao dao, Brokeback brokeback, BrokebackMarginApi brokebackMarginApi, AccountProvider accountProvider, TraderPortfolioStore portfolioStore) {
        super(storeBundle, MarginSetting.INSTANCE);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(brokebackMarginApi, "brokebackMarginApi");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        this.dao = dao;
        this.brokeback = brokeback;
        this.brokebackMarginApi = brokebackMarginApi;
        this.accountProvider = accountProvider;
        this.portfolioStore = portfolioStore;
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.saveAction = new Function1<ApiMarginSetting, Unit>() { // from class: com.robinhood.android.lib.store.margin.MarginSettingsStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiMarginSetting apiMarginSetting) {
                m15903invoke(apiMarginSetting);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m15903invoke(ApiMarginSetting apiMarginSetting) {
                if (!logoutKillswitch.isLoggedOut()) {
                    try {
                        dao.insert(apiMarginSetting);
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
    }

    public final Observable<MarginSetting> getMarginSettings(final String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Observable<MarginSetting> observableDefer = Observable.defer(new Callable() { // from class: com.robinhood.android.lib.store.margin.MarginSettingsStore.getMarginSettings.1
            @Override // java.util.concurrent.Callable
            public final ObservableSource<? extends MarginSetting> call() {
                MarginSettingsStore.this.refreshAccount(true, accountNumber);
                MarginSettingsStore marginSettingsStore = MarginSettingsStore.this;
                return marginSettingsStore.asObservable(FlowKt.filterNotNull(marginSettingsStore.dao.getMarginSetting(accountNumber)));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDefer, "defer(...)");
        return observableDefer;
    }

    /* compiled from: MarginSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiMarginSetting;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.store.margin.MarginSettingsStore$refreshAccount$1", m3645f = "MarginSettingsStore.kt", m3646l = {48}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.store.margin.MarginSettingsStore$refreshAccount$1 */
    /* loaded from: classes8.dex */
    static final class C205861 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiMarginSetting>, Object> {
        final /* synthetic */ String $accountNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C205861(String str, Continuation<? super C205861> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginSettingsStore.this.new C205861(this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiMarginSetting> continuation) {
            return ((C205861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            BrokebackMarginApi brokebackMarginApi = MarginSettingsStore.this.brokebackMarginApi;
            String str = this.$accountNumber;
            this.label = 1;
            Object marginSettings = brokebackMarginApi.getMarginSettings(str, this);
            return marginSettings == coroutine_suspended ? coroutine_suspended : marginSettings;
        }
    }

    public final void refreshAccount(boolean force, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        ScopedSubscriptionKt.subscribeIn(refresh(RxFactory.DefaultImpls.rxSingle$default(this, null, new C205861(accountNumber, null), 1, null)).key(accountNumber).force(force).saveAction(this.saveAction).toMaybe(getNetworkWrapper()), getStoreScope());
    }

    /* compiled from: MarginSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiMarginSetting;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.store.margin.MarginSettingsStore$updateDayTradeSetting$1", m3645f = "MarginSettingsStore.kt", m3646l = {60}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.store.margin.MarginSettingsStore$updateDayTradeSetting$1 */
    /* loaded from: classes8.dex */
    static final class C205871 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiMarginSetting>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ boolean $enableDayTradesProtection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C205871(String str, boolean z, Continuation<? super C205871> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$enableDayTradesProtection = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginSettingsStore.this.new C205871(this.$accountNumber, this.$enableDayTradesProtection, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiMarginSetting> continuation) {
            return ((C205871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            BrokebackMarginApi brokebackMarginApi = MarginSettingsStore.this.brokebackMarginApi;
            String str = this.$accountNumber;
            ApiMarginSetting.UpdateSettingRequest updateSettingRequest = new ApiMarginSetting.UpdateSettingRequest(this.$enableDayTradesProtection);
            this.label = 1;
            Object objUpdateDayTradeSetting = brokebackMarginApi.updateDayTradeSetting(str, updateSettingRequest, this);
            return objUpdateDayTradeSetting == coroutine_suspended ? coroutine_suspended : objUpdateDayTradeSetting;
        }
    }

    public final Observable<ApiMarginSetting> updateDayTradeSetting(String accountNumber, boolean enableDayTradesProtection) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Single singleRxSingle$default = RxFactory.DefaultImpls.rxSingle$default(this, null, new C205871(accountNumber, enableDayTradesProtection, null), 1, null);
        final Function1<ApiMarginSetting, Unit> function1 = this.saveAction;
        Observable<ApiMarginSetting> observable = singleRxSingle$default.doOnSuccess(new Consumer(function1) { // from class: com.robinhood.android.lib.store.margin.MarginSettingsStore$sam$io_reactivex_functions_Consumer$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(function1, "function");
                this.function = function1;
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(Object obj) {
                this.function.invoke(obj);
            }
        }).subscribeOn(Schedulers.m3346io()).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    /* compiled from: MarginSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/subscription/api/MarginUpgradePlans;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.store.margin.MarginSettingsStore$getMarginSubscriptionPlans$1", m3645f = "MarginSettingsStore.kt", m3646l = {70}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.store.margin.MarginSettingsStore$getMarginSubscriptionPlans$1 */
    /* loaded from: classes8.dex */
    static final class C205811 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super MarginUpgradePlans>, Object> {
        int label;

        C205811(Continuation<? super C205811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginSettingsStore.this.new C205811(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MarginUpgradePlans> continuation) {
            return ((C205811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Brokeback brokeback = MarginSettingsStore.this.brokeback;
            this.label = 1;
            Object marginSubscriptionPlans = brokeback.getMarginSubscriptionPlans(this);
            return marginSubscriptionPlans == coroutine_suspended ? coroutine_suspended : marginSubscriptionPlans;
        }
    }

    public final Single<List<MarginUpgradePlans2>> getMarginSubscriptionPlans() {
        Single<List<MarginUpgradePlans2>> singleSubscribeOn = RxFactory.DefaultImpls.rxSingle$default(this, null, new C205811(null), 1, null).map(new Function() { // from class: com.robinhood.android.lib.store.margin.MarginSettingsStore.getMarginSubscriptionPlans.2
            @Override // io.reactivex.functions.Function
            public final List<MarginUpgradePlans2> apply(MarginUpgradePlans it) {
                Intrinsics.checkNotNullParameter(it, "it");
                List<MarginUpgradePlans2> plans = it.getPlans();
                ArrayList arrayList = new ArrayList();
                for (T t : plans) {
                    if (((MarginUpgradePlans2) t).getIs_default()) {
                        arrayList.add(t);
                    }
                }
                return arrayList;
            }
        }).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "subscribeOn(...)");
        return singleSubscribeOn;
    }

    /* compiled from: MarginSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/models/api/MarginCall;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.store.margin.MarginSettingsStore$getMarginCalls$1", m3645f = "MarginSettingsStore.kt", m3646l = {76}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.store.margin.MarginSettingsStore$getMarginCalls$1 */
    /* loaded from: classes8.dex */
    static final class C205791 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends MarginCall>>, Object> {
        final /* synthetic */ String $accountNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C205791(String str, Continuation<? super C205791> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginSettingsStore.this.new C205791(this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends MarginCall>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<MarginCall>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<MarginCall>> continuation) {
            return ((C205791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BrokebackMarginApi brokebackMarginApi = MarginSettingsStore.this.brokebackMarginApi;
                String str = this.$accountNumber;
                List<String> listListOf = str != null ? CollectionsKt.listOf(str) : null;
                this.label = 1;
                obj = brokebackMarginApi.getMarginCalls(listListOf, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((PaginatedResult) obj).getResults();
        }
    }

    public static /* synthetic */ Observable getMarginCalls$default(MarginSettingsStore marginSettingsStore, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return marginSettingsStore.getMarginCalls(str);
    }

    public final Observable<List<MarginCall>> getMarginCalls(String accountNumber) {
        Observable<List<MarginCall>> observable = RxFactory.DefaultImpls.rxSingle$default(this, null, new C205791(accountNumber, null), 1, null).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    public final Observable<Boolean> isUnderMarginCall(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.accountProvider.refresh(false);
        this.portfolioStore.refreshPortfolio(accountNumber, false);
        Observables observables = Observables.INSTANCE;
        Observable<Boolean> observableCombineLatest = Observable.combineLatest(getUnmetMaintenanceCall(accountNumber), this.accountProvider.streamAccount(accountNumber), this.portfolioStore.getPortfolio(accountNumber), new Function3<T1, T2, T3, R>() { // from class: com.robinhood.android.lib.store.margin.MarginSettingsStore$isUnderMarginCall$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public final R apply(T1 t1, T2 t2, T3 t3) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Account account = (Account) t2;
                MarginCall marginCall = (MarginCall) ((Optional) t1).component1();
                BigDecimal excessMaintenanceWithUnclearedDeposits = ((Portfolio) t3).getExcessMaintenanceWithUnclearedDeposits();
                return (R) Boolean.valueOf(marginCall != null && account.isMargin() && Intrinsics.areEqual(excessMaintenanceWithUnclearedDeposits != null ? Boolean.valueOf(BigDecimals7.isNegative(excessMaintenanceWithUnclearedDeposits)) : null, Boolean.TRUE));
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…neFunction(t1, t2, t3) })");
        return observableCombineLatest;
    }

    /* compiled from: MarginSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/MarginCall;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.store.margin.MarginSettingsStore$getUnmetMaintenanceCall$1", m3645f = "MarginSettingsStore.kt", m3646l = {95}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.lib.store.margin.MarginSettingsStore$getUnmetMaintenanceCall$1 */
    /* loaded from: classes8.dex */
    static final class C205831 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends MarginCall>>, Object> {
        final /* synthetic */ String $accountNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C205831(String str, Continuation<? super C205831> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginSettingsStore.this.new C205831(this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends MarginCall>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<MarginCall>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<MarginCall>> continuation) {
            return ((C205831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            Object obj2 = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BrokebackMarginApi brokebackMarginApi = MarginSettingsStore.this.brokebackMarginApi;
                String str = this.$accountNumber;
                List<String> listListOf = str != null ? CollectionsKt.listOf(str) : null;
                this.label = 1;
                obj = brokebackMarginApi.getMarginCalls(listListOf, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Iterator it = ((Iterable) obj).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((MarginCall) next).isUnresolvedMaintenanceCall()) {
                    obj2 = next;
                    break;
                }
            }
            return Optional3.asOptional(obj2);
        }
    }

    private final Observable<Optional<MarginCall>> getUnmetMaintenanceCall(String accountNumber) {
        Observable<Optional<MarginCall>> observable = RxFactory.DefaultImpls.rxSingle$default(this, null, new C205831(accountNumber, null), 1, null).onErrorReturn(new Function() { // from class: com.robinhood.android.lib.store.margin.MarginSettingsStore.getUnmetMaintenanceCall.2
            @Override // io.reactivex.functions.Function
            public final Optional<MarginCall> apply(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional2.INSTANCE;
            }
        }).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    static /* synthetic */ Observable getUnmetMaintenanceCall$default(MarginSettingsStore marginSettingsStore, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return marginSettingsStore.getUnmetMaintenanceCall(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isEligibleForTieredRates(String str, Continuation<? super Boolean> continuation) {
        C205851 c205851;
        if (continuation instanceof C205851) {
            c205851 = (C205851) continuation;
            int i = c205851.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c205851.label = i - Integer.MIN_VALUE;
            } else {
                c205851 = new C205851(continuation);
            }
        }
        Object marginInvestingInfo = c205851.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c205851.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(marginInvestingInfo);
            BrokebackMarginApi brokebackMarginApi = this.brokebackMarginApi;
            c205851.label = 1;
            marginInvestingInfo = brokebackMarginApi.getMarginInvestingInfo(str, c205851);
            if (marginInvestingInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(marginInvestingInfo);
        }
        return boxing.boxBoolean(((ApiMarginInvestingInfo) marginInvestingInfo).getEligibleForTieredRates());
    }
}
