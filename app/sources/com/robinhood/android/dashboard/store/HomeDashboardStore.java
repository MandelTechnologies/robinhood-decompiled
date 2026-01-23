package com.robinhood.android.dashboard.store;

import com.robinhood.android.home.api.HomeApi;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.coroutines.RetryOnError;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.home.HomeAccountSwitcher;
import com.robinhood.models.home.HomeState;
import com.robinhood.models.home.api.ApiHomeAccountSwitcher;
import com.robinhood.models.home.api.ApiHomeState;
import com.robinhood.models.home.api.HomeAccountSwitcherAccountIdentifier;
import com.robinhood.models.home.dao.HomeStateDao;
import com.robinhood.models.p320db.Account;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import p479j$.time.Duration;
import retrofit2.Response;

/* compiled from: HomeDashboardStore.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0002J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eJ\u0006\u0010 \u001a\u00020\u0014J\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u0010J\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0#J\u0016\u0010&\u001a\u00020\u00142\f\u0010'\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0017H\u0002J\u0016\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010,R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\rX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00170\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR \u0010-\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u0002000\u001d¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001f¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "Lcom/robinhood/store/Store;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "homeApi", "Lcom/robinhood/android/home/api/HomeApi;", "homeStateDao", "Lcom/robinhood/models/home/dao/HomeStateDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/home/api/HomeApi;Lcom/robinhood/models/home/dao/HomeStateDao;Lcom/robinhood/store/StoreBundle;)V", "preferredDashboard", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/android/home/contracts/HomeDashboardType;", "streamIndividualAccountNumber", "Lkotlinx/coroutines/flow/Flow;", "", "streamHomeDashboardType", "setHomeDashboardType", "", "dashboardType", "activeAccountSwitcher", "Lcom/robinhood/models/home/HomeAccountSwitcher;", "accountSwitcherEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lretrofit2/Response;", "Lcom/robinhood/models/home/api/ApiHomeAccountSwitcher;", "homeAccountSwitcherQuery", "Lcom/robinhood/android/moria/db/Query;", "getHomeAccountSwitcherQuery", "()Lcom/robinhood/android/moria/db/Query;", "forceRefresh", "streamAccountSwitcher", "streamHomeAccounts", "Lio/reactivex/Observable;", "", "Lcom/robinhood/models/db/Account;", "updateHomeDashboardTypeIfNecessary", "accounts", "clearActiveDashboardIfStale", "switcher", "refreshHomeState", "accountNumber", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "homeStateEndpoint", "Lcom/robinhood/models/home/api/ApiHomeState;", "homeStateQuery", "Lcom/robinhood/models/home/HomeState;", "getHomeStateQuery", "Companion", "lib-store-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class HomeDashboardStore extends Store {
    private static final List<BrokerageAccountType> HOME_DASHBOARD_SUPPORTED_ACCOUNT_TYPES = CollectionsKt.listOf((Object[]) new BrokerageAccountType[]{BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.JOINT_TENANCY_WITH_ROS});
    private final AccountProvider accountProvider;
    private final Endpoint<Unit, Response<ApiHomeAccountSwitcher>> accountSwitcherEndpoint;
    private final StateFlow2<HomeAccountSwitcher> activeAccountSwitcher;
    private final Query<Unit, HomeAccountSwitcher> homeAccountSwitcherQuery;
    private final HomeApi homeApi;
    private final HomeStateDao homeStateDao;
    private final Endpoint<String, Response<ApiHomeState>> homeStateEndpoint;
    private final Query<String, HomeState> homeStateQuery;
    private final StateFlow2<HomeDashboardType> preferredDashboard;

    /* compiled from: HomeDashboardStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HomeAccountSwitcherAccountIdentifier.values().length];
            try {
                iArr[HomeAccountSwitcherAccountIdentifier.ACCOUNT_NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeAccountSwitcherAccountIdentifier.APPLICATION_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeAccountSwitcherAccountIdentifier.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeDashboardStore(AccountProvider accountProvider, HomeApi homeApi, HomeStateDao homeStateDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(homeApi, "homeApi");
        Intrinsics.checkNotNullParameter(homeStateDao, "homeStateDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountProvider = accountProvider;
        this.homeApi = homeApi;
        this.homeStateDao = homeStateDao;
        this.preferredDashboard = StateFlow4.MutableStateFlow(null);
        this.activeAccountSwitcher = StateFlow4.MutableStateFlow(null);
        Endpoint.Companion companion = Endpoint.INSTANCE;
        HomeDashboardStore2 homeDashboardStore2 = new HomeDashboardStore2(this, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        HomeDashboardStore3 homeDashboardStore3 = new HomeDashboardStore3(this, null);
        Clock clock = storeBundle.getClock();
        Durations durations = Durations.INSTANCE;
        this.accountSwitcherEndpoint = companion.create(homeDashboardStore2, logoutKillswitch, homeDashboardStore3, clock, new DefaultStaleDecider(durations.getONE_MINUTE(), storeBundle.getClock()));
        Query.Companion companion2 = Query.INSTANCE;
        this.homeAccountSwitcherQuery = Store.create$default(this, companion2, "homeAccountSwitcherQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.dashboard.store.HomeDashboardStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeDashboardStore.homeAccountSwitcherQuery$lambda$1(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.dashboard.store.HomeDashboardStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeDashboardStore.homeAccountSwitcherQuery$lambda$2(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.homeStateEndpoint = companion.create(new HomeDashboardStore4(this, null), getLogoutKillswitch(), new HomeDashboardStore5(this, null), storeBundle.getClock(), new DefaultStaleDecider(durations.getONE_HOUR(), storeBundle.getClock()));
        this.homeStateQuery = Store.create$default(this, companion2, "homeStateQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.dashboard.store.HomeDashboardStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeDashboardStore.homeStateQuery$lambda$9(this.f$0, (String) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.dashboard.store.HomeDashboardStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeDashboardStore.homeStateQuery$lambda$10(this.f$0, (String) obj);
            }
        }, false, 8, null);
    }

    private final Flow<String> streamIndividualAccountNumber() {
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.accountProvider.streamIndividualAccountNumberOptional()), Integer.MAX_VALUE, null, 2, null);
        return new Flow<String>() { // from class: com.robinhood.android.dashboard.store.HomeDashboardStore$streamIndividualAccountNumber$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.dashboard.store.HomeDashboardStore$streamIndividualAccountNumber$$inlined$map$1$2 */
            public static final class C137862<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.dashboard.store.HomeDashboardStore$streamIndividualAccountNumber$$inlined$map$1$2", m3645f = "HomeDashboardStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.dashboard.store.HomeDashboardStore$streamIndividualAccountNumber$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C137862.this.emit(null, this);
                    }
                }

                public C137862(FlowCollector flowCollector) {
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
                        String str = (String) ((Optional) obj).component1();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(str, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new C137862(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Flow<HomeDashboardType> streamHomeDashboardType() {
        return FlowKt.combine(this.preferredDashboard, streamIndividualAccountNumber(), new C137901(null));
    }

    /* compiled from: HomeDashboardStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/home/contracts/HomeDashboardType;", "preferredDashboard", "individualAccountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.store.HomeDashboardStore$streamHomeDashboardType$1", m3645f = "HomeDashboardStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.dashboard.store.HomeDashboardStore$streamHomeDashboardType$1 */
    static final class C137901 extends ContinuationImpl7 implements Function3<HomeDashboardType, String, Continuation<? super HomeDashboardType>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C137901(Continuation<? super C137901> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(HomeDashboardType homeDashboardType, String str, Continuation<? super HomeDashboardType> continuation) {
            C137901 c137901 = new C137901(continuation);
            c137901.L$0 = homeDashboardType;
            c137901.L$1 = str;
            return c137901.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HomeDashboardType homeDashboardType = (HomeDashboardType) this.L$0;
            String str = (String) this.L$1;
            if (homeDashboardType != null) {
                return homeDashboardType;
            }
            if (str != null) {
                return new HomeDashboardType.Account(str);
            }
            return HomeDashboardType.Nux.INSTANCE;
        }
    }

    public final void setHomeDashboardType(HomeDashboardType dashboardType) {
        Intrinsics.checkNotNullParameter(dashboardType, "dashboardType");
        this.preferredDashboard.setValue(dashboardType);
    }

    public final Query<Unit, HomeAccountSwitcher> getHomeAccountSwitcherQuery() {
        return this.homeAccountSwitcherQuery;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow homeAccountSwitcherQuery$lambda$1(HomeDashboardStore homeDashboardStore, Unit params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Endpoint8.backendPoll$default(homeDashboardStore.accountSwitcherEndpoint, params, Durations.INSTANCE.getONE_MINUTE(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow homeAccountSwitcherQuery$lambda$2(HomeDashboardStore homeDashboardStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return homeDashboardStore.activeAccountSwitcher;
    }

    public final void forceRefresh() {
        Endpoint8.refresh$default(this.accountSwitcherEndpoint, true, null, 2, null);
        this.accountProvider.refresh(true);
    }

    public final Flow<HomeAccountSwitcher> streamAccountSwitcher() {
        return this.homeAccountSwitcherQuery.asFlow(Unit.INSTANCE);
    }

    public final Observable<List<Account>> streamHomeAccounts() {
        Observable map = this.accountProvider.streamAllAccounts().doOnNext(new Consumer() { // from class: com.robinhood.android.dashboard.store.HomeDashboardStore.streamHomeAccounts.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(List<Account> p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                HomeDashboardStore.this.updateHomeDashboardTypeIfNecessary(p0);
            }
        }).map(new Function() { // from class: com.robinhood.android.dashboard.store.HomeDashboardStore.streamHomeAccounts.2
            @Override // io.reactivex.functions.Function
            public final List<Account> apply(List<Account> accounts2) {
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                ArrayList arrayList = new ArrayList();
                for (T t : accounts2) {
                    if (HomeDashboardStore.HOME_DASHBOARD_SUPPORTED_ACCOUNT_TYPES.contains(((Account) t).getBrokerageAccountType())) {
                        arrayList.add(t);
                    }
                }
                return arrayList;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateHomeDashboardTypeIfNecessary(List<Account> accounts2) {
        Tuples2 tuples2M3642to;
        HomeDashboardType value = this.preferredDashboard.getValue();
        if ((value instanceof HomeDashboardType.Account) || value == null) {
            return;
        }
        Object obj = null;
        if (!(value instanceof HomeDashboardType.Nux)) {
            if (!(value instanceof HomeDashboardType.PendingApplication)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator<T> it = accounts2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((Account) next).getBrokerageAccountType() == ((HomeDashboardType.PendingApplication) value).getBrokerageAccountType()) {
                    obj = next;
                    break;
                }
            }
            tuples2M3642to = Tuples4.m3642to(obj, ((HomeDashboardType.PendingApplication) value).getBrokerageAccountType());
        } else {
            Iterator<T> it2 = accounts2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Account account = (Account) next2;
                if (account.getBrokerageAccountType() == BrokerageAccountType.INDIVIDUAL && account.getManagementType() == ManagementType.SELF_DIRECTED) {
                    obj = next2;
                    break;
                }
            }
            tuples2M3642to = Tuples4.m3642to(obj, BrokerageAccountType.INDIVIDUAL);
        }
        Account account2 = (Account) tuples2M3642to.component1();
        if (account2 != null) {
            setHomeDashboardType(new HomeDashboardType.Account(account2.getAccountNumber()));
            forceRefresh();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearActiveDashboardIfStale(HomeAccountSwitcher switcher) {
        Object next;
        HomeDashboardType account;
        HomeDashboardType value = this.preferredDashboard.getValue();
        HomeDashboardType.PendingApplication pendingApplication = value instanceof HomeDashboardType.PendingApplication ? (HomeDashboardType.PendingApplication) value : null;
        if (pendingApplication == null) {
            return;
        }
        List<HomeAccountSwitcher.Account> accounts2 = switcher.getAccounts();
        if (!(accounts2 instanceof Collection) || !accounts2.isEmpty()) {
            Iterator<T> it = accounts2.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((HomeAccountSwitcher.Account) it.next()).getIdentifier(), pendingApplication.getApplicationId())) {
                    return;
                }
            }
        }
        Iterator<T> it2 = switcher.getAccounts().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (((HomeAccountSwitcher.Account) next).getBrokerageAccountType() == pendingApplication.getBrokerageAccountType()) {
                    break;
                }
            }
        }
        HomeAccountSwitcher.Account account2 = (HomeAccountSwitcher.Account) next;
        if (account2 == null) {
            account2 = (HomeAccountSwitcher.Account) CollectionsKt.firstOrNull((List) switcher.getAccounts());
        }
        HomeAccountSwitcherAccountIdentifier identifierType = account2 != null ? account2.getIdentifierType() : null;
        int i = identifierType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[identifierType.ordinal()];
        if (i == -1) {
            account = HomeDashboardType.Nux.INSTANCE;
        } else if (i == 1) {
            account = new HomeDashboardType.Account(account2.getIdentifier());
        } else if (i == 2) {
            account = new HomeDashboardType.PendingApplication(account2.getIdentifier(), account2.getBrokerageAccountType());
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            account = HomeDashboardType.Nux.INSTANCE;
        }
        setHomeDashboardType(account);
        this.accountProvider.refresh(true);
    }

    public final Object refreshHomeState(String str, Continuation<? super Unit> continuation) {
        Object objRetryExponential = RetryOnError.retryExponential(3, new Function1() { // from class: com.robinhood.android.dashboard.store.HomeDashboardStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(HomeDashboardStore.refreshHomeState$lambda$8((Throwable) obj));
            }
        }, new C137873(str, null), continuation);
        return objRetryExponential == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRetryExponential : Unit.INSTANCE;
    }

    /* compiled from: HomeDashboardStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.store.HomeDashboardStore$refreshHomeState$3", m3645f = "HomeDashboardStore.kt", m3646l = {224}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.dashboard.store.HomeDashboardStore$refreshHomeState$3 */
    static final class C137873 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C137873(String str, Continuation<? super C137873> continuation) {
            super(1, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return HomeDashboardStore.this.new C137873(this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C137873) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = HomeDashboardStore.this.homeStateEndpoint;
                String str = this.$accountNumber;
                this.label = 1;
                if (Endpoint.DefaultImpls.fetch$default(endpoint, str, null, this, 2, null) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean refreshHomeState$lambda$8(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Throwables.isNetworkRelated(it);
    }

    public final Query<String, HomeState> getHomeStateQuery() {
        return this.homeStateQuery;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow homeStateQuery$lambda$9(HomeDashboardStore homeDashboardStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Endpoint<String, Response<ApiHomeState>> endpoint = homeDashboardStore.homeStateEndpoint;
        Duration durationOfSeconds = Duration.ofSeconds(30L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return Endpoint8.backendPoll$default(endpoint, accountNumber, durationOfSeconds, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow homeStateQuery$lambda$10(HomeDashboardStore homeDashboardStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return FlowKt.filterNotNull(homeDashboardStore.homeStateDao.streamHomeState(accountNumber));
    }
}
