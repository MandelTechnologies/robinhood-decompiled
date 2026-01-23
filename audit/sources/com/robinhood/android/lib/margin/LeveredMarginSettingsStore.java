package com.robinhood.android.lib.margin;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.data.store.portfolio.TraderPortfolioStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.api.ApiEnableMarginInvestingRequestBody;
import com.robinhood.android.lib.margin.api.ApiMarginSettingUpdate;
import com.robinhood.android.lib.margin.api.ApiMarginSettings;
import com.robinhood.android.lib.margin.api.ApiMarginSettingsRequestBody;
import com.robinhood.android.lib.margin.api.ApiToggleMarginInvestingResponse;
import com.robinhood.android.lib.margin.api.ApiToggleMarginInvestingResponse2;
import com.robinhood.android.lib.margin.api.MarginInvestingApi;
import com.robinhood.android.lib.margin.p167db.dao.LeveredMarginSettingsDao;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.money.Currencies;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* compiled from: LeveredMarginSettingsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u00013B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#J\u0014\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190'0&H\u0002J\u001c\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190'0&2\u0006\u0010\u001d\u001a\u00020\u0012H\u0002J\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00190&2\u0006\u0010\u001d\u001a\u00020\u0012J\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00190&J\u0016\u0010+\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010,J\u000e\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u0012J\"\u0010/\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u00100\u001a\u00020#2\b\u00101\u001a\u0004\u0018\u00010!J\u001a\u00102\u001a\u00020.2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00122\u0006\u00100\u001a\u00020#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "Lcom/robinhood/store/Store;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "marginInvestingApi", "Lcom/robinhood/android/lib/margin/api/MarginInvestingApi;", "leveredMarginSettingsDao", "Lcom/robinhood/android/lib/margin/db/dao/LeveredMarginSettingsDao;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/lib/margin/api/MarginInvestingApi;Lcom/robinhood/android/lib/margin/db/dao/LeveredMarginSettingsDao;Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;Lcom/robinhood/store/StoreBundle;)V", "getEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/android/lib/margin/api/ApiMarginSettings;", "postEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore$MarginSettingsUpdate;", "query", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/android/lib/margin/db/models/MarginSettings;", "enableMarginInvesting", "Lio/reactivex/Single;", "Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResponse;", "accountNumber", "planId", "Ljava/util/UUID;", "borrowingLimit", "Lcom/robinhood/models/util/Money;", "enableMarginWithdrawal", "", "skip2kCheck", "streamMarginSettingsIndividualOptional", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "streamMarginSettingsOptional", "streamMarginSettings", "streamMarginSettingsIndividual", "fetchMarginSettings", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disableMarginInvesting", "Lio/reactivex/Completable;", "setMarginInvesting", "enabled", "userSetLimit", "toggleMarginWithdrawal", "MarginSettingsUpdate", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class LeveredMarginSettingsStore extends Store {
    private final AccountProvider accountProvider;
    private final Endpoint<String, ApiMarginSettings> getEndpoint;
    private final LeveredMarginSettingsDao leveredMarginSettingsDao;
    private final MarginInvestingApi marginInvestingApi;
    private final MarginSubscriptionStore marginSubscriptionStore;
    private final TraderPortfolioStore portfolioStore;
    private final PostEndpoint<MarginSettingsUpdate, ApiMarginSettings> postEndpoint;
    private final Query<String, MarginSettings> query;

    /* compiled from: LeveredMarginSettingsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.margin.LeveredMarginSettingsStore", m3645f = "LeveredMarginSettingsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE}, m3647m = "fetchMarginSettings")
    /* renamed from: com.robinhood.android.lib.margin.LeveredMarginSettingsStore$fetchMarginSettings$1 */
    static final class C203101 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C203101(Continuation<? super C203101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LeveredMarginSettingsStore.this.fetchMarginSettings(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeveredMarginSettingsStore(AccountProvider accountProvider, MarginInvestingApi marginInvestingApi, LeveredMarginSettingsDao leveredMarginSettingsDao, TraderPortfolioStore portfolioStore, MarginSubscriptionStore marginSubscriptionStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(marginInvestingApi, "marginInvestingApi");
        Intrinsics.checkNotNullParameter(leveredMarginSettingsDao, "leveredMarginSettingsDao");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountProvider = accountProvider;
        this.marginInvestingApi = marginInvestingApi;
        this.leveredMarginSettingsDao = leveredMarginSettingsDao;
        this.portfolioStore = portfolioStore;
        this.marginSubscriptionStore = marginSubscriptionStore;
        Endpoint<String, ApiMarginSettings> endpointCreate$default = Endpoint.Companion.create$default(Endpoint.INSTANCE, new LeveredMarginSettingsStore2(marginInvestingApi), getLogoutKillswitch(), new LeveredMarginSettingsStore3(leveredMarginSettingsDao), storeBundle.getClock(), null, 16, null);
        this.getEndpoint = endpointCreate$default;
        this.postEndpoint = PostEndpoint.INSTANCE.create(new LeveredMarginSettingsStore4(this, null), new LeveredMarginSettingsStore5(leveredMarginSettingsDao));
        this.query = Store.create$default(this, Query.INSTANCE, "queryMarginSettings", CollectionsKt.listOf(new RefreshEach(new LeveredMarginSettingsStore6(endpointCreate$default))), new Function1() { // from class: com.robinhood.android.lib.margin.LeveredMarginSettingsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LeveredMarginSettingsStore.query$lambda$1(this.f$0, (String) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getEndpoint$insert(LeveredMarginSettingsDao leveredMarginSettingsDao, ApiMarginSettings apiMarginSettings, Continuation continuation) {
        leveredMarginSettingsDao.insert(apiMarginSettings);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object postEndpoint$insert$0(LeveredMarginSettingsDao leveredMarginSettingsDao, ApiMarginSettings apiMarginSettings, Continuation continuation) {
        leveredMarginSettingsDao.insert(apiMarginSettings);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(LeveredMarginSettingsStore leveredMarginSettingsStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return leveredMarginSettingsStore.leveredMarginSettingsDao.getLeveredMarginSettings(accountNumber);
    }

    /* compiled from: LeveredMarginSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.margin.LeveredMarginSettingsStore$enableMarginInvesting$1", m3645f = "LeveredMarginSettingsStore.kt", m3646l = {78, 96}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.margin.LeveredMarginSettingsStore$enableMarginInvesting$1 */
    static final class C203091 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiToggleMarginInvestingResponse>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ Money $borrowingLimit;
        final /* synthetic */ boolean $enableMarginWithdrawal;
        final /* synthetic */ UUID $planId;
        final /* synthetic */ boolean $skip2kCheck;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C203091(String str, UUID uuid, Money money, boolean z, boolean z2, Continuation<? super C203091> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$planId = uuid;
            this.$borrowingLimit = money;
            this.$enableMarginWithdrawal = z;
            this.$skip2kCheck = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LeveredMarginSettingsStore.this.new C203091(this.$accountNumber, this.$planId, this.$borrowingLimit, this.$enableMarginWithdrawal, this.$skip2kCheck, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiToggleMarginInvestingResponse> continuation) {
            return ((C203091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ApiToggleMarginInvestingResponse apiToggleMarginInvestingResponse;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MarginInvestingApi marginInvestingApi = LeveredMarginSettingsStore.this.marginInvestingApi;
                String str = this.$accountNumber;
                ApiEnableMarginInvestingRequestBody apiEnableMarginInvestingRequestBody = new ApiEnableMarginInvestingRequestBody(this.$planId, new ApiMarginSettingUpdate(true, this.$borrowingLimit), new ApiMarginSettingUpdate(this.$enableMarginWithdrawal, null, 2, null), this.$skip2kCheck);
                this.label = 1;
                obj = marginInvestingApi.enableMarginInvesting(str, apiEnableMarginInvestingRequestBody, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apiToggleMarginInvestingResponse = (ApiToggleMarginInvestingResponse) this.L$0;
                ResultKt.throwOnFailure(obj);
                LeveredMarginSettingsStore.this.marginSubscriptionStore.refreshCurrentMarginSubscription(true);
                return apiToggleMarginInvestingResponse;
            }
            ResultKt.throwOnFailure(obj);
            ApiToggleMarginInvestingResponse apiToggleMarginInvestingResponse2 = (ApiToggleMarginInvestingResponse) obj;
            if (apiToggleMarginInvestingResponse2.getResult() != ApiToggleMarginInvestingResponse2.SUCCESS) {
                return apiToggleMarginInvestingResponse2;
            }
            Job jobRefresh$default = Endpoint.DefaultImpls.refresh$default(LeveredMarginSettingsStore.this.getEndpoint, apiToggleMarginInvestingResponse2.getAccountNumber(), false, null, 6, null);
            this.L$0 = apiToggleMarginInvestingResponse2;
            this.label = 2;
            if (jobRefresh$default.join(this) != coroutine_suspended) {
                apiToggleMarginInvestingResponse = apiToggleMarginInvestingResponse2;
                LeveredMarginSettingsStore.this.marginSubscriptionStore.refreshCurrentMarginSubscription(true);
                return apiToggleMarginInvestingResponse;
            }
            return coroutine_suspended;
        }
    }

    public final Single<ApiToggleMarginInvestingResponse> enableMarginInvesting(String accountNumber, UUID planId, Money borrowingLimit, boolean enableMarginWithdrawal, boolean skip2kCheck) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C203091(accountNumber, planId, borrowingLimit, enableMarginWithdrawal, skip2kCheck, null), 1, null);
    }

    private final Observable<Optional<MarginSettings>> streamMarginSettingsIndividualOptional() {
        Observable observableSwitchMap = this.accountProvider.streamIndividualAccountNumberOptional().switchMap(new Function() { // from class: com.robinhood.android.lib.margin.LeveredMarginSettingsStore.streamMarginSettingsIndividualOptional.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<MarginSettings>> apply(Optional<String> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                String strComponent1 = optional.component1();
                if (strComponent1 != null) {
                    return LeveredMarginSettingsStore.this.streamMarginSettingsOptional(strComponent1);
                }
                Observable observableJust = Observable.just(Optional2.INSTANCE);
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<Optional<MarginSettings>> streamMarginSettingsOptional(String accountNumber) {
        return ObservablesKt.toOptionals(asObservable(this.query.asFlow(accountNumber)));
    }

    public final Observable<MarginSettings> streamMarginSettings(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return ObservablesKt.filterIsPresent(streamMarginSettingsOptional(accountNumber));
    }

    public final Observable<MarginSettings> streamMarginSettingsIndividual() {
        return ObservablesKt.filterIsPresent(streamMarginSettingsIndividualOptional());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchMarginSettings(String str, Continuation<? super MarginSettings> continuation) {
        C203101 c203101;
        if (continuation instanceof C203101) {
            c203101 = (C203101) continuation;
            int i = c203101.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c203101.label = i - Integer.MIN_VALUE;
            } else {
                c203101 = new C203101(continuation);
            }
        }
        C203101 c2031012 = c203101;
        Object objForceFetch$default = c2031012.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c2031012.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<String, ApiMarginSettings> endpoint = this.getEndpoint;
            c2031012.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, str, null, c2031012, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        return ((ApiMarginSettings) objForceFetch$default).toDbModel();
    }

    public final Completable disableMarginInvesting(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return setMarginInvesting(accountNumber, false, Money3.toMoney(ZERO, Currencies.USD));
    }

    /* compiled from: LeveredMarginSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.margin.LeveredMarginSettingsStore$setMarginInvesting$1", m3645f = "LeveredMarginSettingsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.margin.LeveredMarginSettingsStore$setMarginInvesting$1 */
    static final class C203111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ Money $userSetLimit;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C203111(String str, boolean z, Money money, Continuation<? super C203111> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$enabled = z;
            this.$userSetLimit = money;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LeveredMarginSettingsStore.this.new C203111(this.$accountNumber, this.$enabled, this.$userSetLimit, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C203111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C203111 c203111;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = LeveredMarginSettingsStore.this.postEndpoint;
                MarginSettingsUpdate marginSettingsUpdate = new MarginSettingsUpdate(this.$accountNumber, new ApiMarginSettingsRequestBody(new ApiMarginSettingUpdate(this.$enabled, this.$userSetLimit), null, 2, null));
                this.label = 1;
                c203111 = this;
                if (PostEndpoint.DefaultImpls.post$default(postEndpoint, marginSettingsUpdate, null, c203111, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c203111 = this;
            }
            LeveredMarginSettingsStore.this.accountProvider.refresh(true);
            LeveredMarginSettingsStore.this.portfolioStore.refreshPortfolio(c203111.$accountNumber, true);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Completable setMarginInvesting$default(LeveredMarginSettingsStore leveredMarginSettingsStore, String str, boolean z, Money money, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return leveredMarginSettingsStore.setMarginInvesting(str, z, money);
    }

    public final Completable setMarginInvesting(String accountNumber, boolean enabled, Money userSetLimit) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C203111(accountNumber, enabled, userSetLimit, null), 1, null);
    }

    /* compiled from: LeveredMarginSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.margin.LeveredMarginSettingsStore$toggleMarginWithdrawal$1", m3645f = "LeveredMarginSettingsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.margin.LeveredMarginSettingsStore$toggleMarginWithdrawal$1 */
    static final class C203131 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ boolean $enabled;
        int label;
        final /* synthetic */ LeveredMarginSettingsStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C203131(String str, LeveredMarginSettingsStore leveredMarginSettingsStore, boolean z, Continuation<? super C203131> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.this$0 = leveredMarginSettingsStore;
            this.$enabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C203131(this.$accountNumber, this.this$0, this.$enabled, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C203131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
        
            if (com.robinhood.android.moria.network.PostEndpoint.DefaultImpls.post$default(r6, r7, null, r9, 2, null) != r0) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            Money money;
            C203131 c203131;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                str = this.$accountNumber;
                if (str == null) {
                    AccountProvider accountProvider = this.this$0.accountProvider;
                    this.label = 1;
                    obj = accountProvider.getIndividualAccountNumberForced(this);
                    if (obj == coroutine_suspended) {
                    }
                } else {
                    if (this.$enabled) {
                        BigDecimal ZERO = BigDecimal.ZERO;
                        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                        money = Money3.toMoney(ZERO, Currencies.USD);
                    } else {
                        money = null;
                    }
                    PostEndpoint postEndpoint = this.this$0.postEndpoint;
                    MarginSettingsUpdate marginSettingsUpdate = new MarginSettingsUpdate(str, new ApiMarginSettingsRequestBody(null, new ApiMarginSettingUpdate(this.$enabled, money), 1, null));
                    this.label = 2;
                    c203131 = this;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c203131 = this;
                c203131.this$0.accountProvider.refresh(true);
                c203131.this$0.portfolioStore.refreshIndividualAccountPortfolio(true);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            str = (String) obj;
            if (this.$enabled) {
            }
            PostEndpoint postEndpoint2 = this.this$0.postEndpoint;
            MarginSettingsUpdate marginSettingsUpdate2 = new MarginSettingsUpdate(str, new ApiMarginSettingsRequestBody(null, new ApiMarginSettingUpdate(this.$enabled, money), 1, null));
            this.label = 2;
            c203131 = this;
        }
    }

    public static /* synthetic */ Completable toggleMarginWithdrawal$default(LeveredMarginSettingsStore leveredMarginSettingsStore, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return leveredMarginSettingsStore.toggleMarginWithdrawal(str, z);
    }

    public final Completable toggleMarginWithdrawal(String accountNumber, boolean enabled) {
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C203131(accountNumber, this, enabled, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LeveredMarginSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore$MarginSettingsUpdate;", "", "accountNumber", "", "requestBody", "Lcom/robinhood/android/lib/margin/api/ApiMarginSettingsRequestBody;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/lib/margin/api/ApiMarginSettingsRequestBody;)V", "getAccountNumber", "()Ljava/lang/String;", "getRequestBody", "()Lcom/robinhood/android/lib/margin/api/ApiMarginSettingsRequestBody;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class MarginSettingsUpdate {
        private final String accountNumber;
        private final ApiMarginSettingsRequestBody requestBody;

        public static /* synthetic */ MarginSettingsUpdate copy$default(MarginSettingsUpdate marginSettingsUpdate, String str, ApiMarginSettingsRequestBody apiMarginSettingsRequestBody, int i, Object obj) {
            if ((i & 1) != 0) {
                str = marginSettingsUpdate.accountNumber;
            }
            if ((i & 2) != 0) {
                apiMarginSettingsRequestBody = marginSettingsUpdate.requestBody;
            }
            return marginSettingsUpdate.copy(str, apiMarginSettingsRequestBody);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiMarginSettingsRequestBody getRequestBody() {
            return this.requestBody;
        }

        public final MarginSettingsUpdate copy(String accountNumber, ApiMarginSettingsRequestBody requestBody) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(requestBody, "requestBody");
            return new MarginSettingsUpdate(accountNumber, requestBody);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarginSettingsUpdate)) {
                return false;
            }
            MarginSettingsUpdate marginSettingsUpdate = (MarginSettingsUpdate) other;
            return Intrinsics.areEqual(this.accountNumber, marginSettingsUpdate.accountNumber) && Intrinsics.areEqual(this.requestBody, marginSettingsUpdate.requestBody);
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.requestBody.hashCode();
        }

        public String toString() {
            return "MarginSettingsUpdate(accountNumber=" + this.accountNumber + ", requestBody=" + this.requestBody + ")";
        }

        public MarginSettingsUpdate(String accountNumber, ApiMarginSettingsRequestBody requestBody) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(requestBody, "requestBody");
            this.accountNumber = accountNumber;
            this.requestBody = requestBody;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final ApiMarginSettingsRequestBody getRequestBody() {
            return this.requestBody;
        }
    }
}
