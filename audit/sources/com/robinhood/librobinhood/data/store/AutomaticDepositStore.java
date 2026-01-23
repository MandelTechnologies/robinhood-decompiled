package com.robinhood.librobinhood.data.store;

import bff_money_movement.service.p019v1.BffMoneyMovementService;
import bff_money_movement.service.p019v1.DepositScheduleStateDto;
import bff_money_movement.service.p019v1.UpdateDepositScheduleRequestDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.cashier.Cashier;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.data.store.logging.utils.EventLoggers;
import com.robinhood.android.data.store.logging.utils.LoggingUtils4;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.models.dao.AutomaticDepositDao;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.AutomaticDeposit;
import com.robinhood.models.p320db.AutomaticDeposit2;
import com.robinhood.models.p355ui.AutomaticDepositWithBankInfo;
import com.robinhood.models.p355ui.UiAutomaticDeposit;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.NetworkContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.StringsKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.math.BigDecimal;
import java.util.List;
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
import kotlinx.coroutines.flow.FlowKt;
import retrofit2.Response;

/* compiled from: AutomaticDepositStore.kt */
@Metadata(m3635d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0!J\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0!2\u0006\u0010$\u001a\u00020\u001eJ\u000e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(J\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0!J \u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,2\u0006\u0010.\u001a\u00020\u001e2\b\b\u0002\u0010/\u001a\u00020(J.\u00100\u001a\u00020-2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0086@¢\u0006\u0002\u00109J\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020-0;2\u0006\u0010$\u001a\u00020\u001eJ\u001e\u0010<\u001a\u00020\u00162\u0006\u0010=\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020?H\u0086@¢\u0006\u0002\u0010@J \u0010A\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u001e2\b\b\u0002\u0010B\u001a\u00020(H\u0086@¢\u0006\u0002\u0010CR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001f0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006D"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "Lcom/robinhood/store/Store;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "cashier", "Lcom/robinhood/android/api/cashier/Cashier;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "dao", "Lcom/robinhood/models/dao/AutomaticDepositDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lbff_money_movement/service/v1/BffMoneyMovementService;Lcom/robinhood/android/api/cashier/Cashier;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/models/dao/AutomaticDepositDao;Lcom/robinhood/store/StoreBundle;)V", "listEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "", "Lcom/robinhood/models/api/ApiAutomaticDeposit;", "listQuery", "Lcom/robinhood/android/moria/db/Query;", "", "Lcom/robinhood/models/ui/AutomaticDepositWithBankInfo;", "skipEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "", "Lretrofit2/Response;", "getAutomaticDeposits", "Lio/reactivex/Observable;", "getAutomaticDeposit", "Lcom/robinhood/models/ui/UiAutomaticDeposit;", "automaticDepositId", "refresh", "Lkotlinx/coroutines/Job;", "force", "", "getMetadata", "Lcom/robinhood/api/utils/Metadata;", "getNextDepositForAccount", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/AutomaticDeposit;", "rhsAccountNumber", "forceRefresh", "createAutomaticDeposit", "achRhId", "Ljava/util/UUID;", "amount", "Ljava/math/BigDecimal;", "frequency", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "baseEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "(Ljava/util/UUID;Ljava/math/BigDecimal;Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "skipAutomaticDeposit", "Lio/reactivex/Single;", "updateAutomaticDeposit", "id", "state", "Lbff_money_movement/service/v1/DepositScheduleStateDto;", "(Ljava/lang/String;Lbff_money_movement/service/v1/DepositScheduleStateDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAutomaticDeposit", "isExtraCash", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-direct-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class AutomaticDepositStore extends Store {
    private final AccountProvider accountProvider;
    private final AchRelationshipStore achRelationshipStore;
    private final BffMoneyMovementService bffMoneyMovementService;
    private final Cashier cashier;
    private final AutomaticDepositDao dao;
    private final EventLogger eventLogger;
    private final PaginatedEndpoint<Unit, ApiAutomaticDeposit> listEndpoint;
    private final Query<Unit, List<AutomaticDepositWithBankInfo>> listQuery;
    private final PostEndpoint<String, Response<ApiAutomaticDeposit>> skipEndpoint;
    private final TransfersBonfireApi transfersBonfireApi;

    /* compiled from: AutomaticDepositStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AutomaticDepositStore", m3645f = "AutomaticDepositStore.kt", m3646l = {156}, m3647m = "createAutomaticDeposit")
    /* renamed from: com.robinhood.librobinhood.data.store.AutomaticDepositStore$createAutomaticDeposit$1 */
    static final class C336011 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C336011(Continuation<? super C336011> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AutomaticDepositStore.this.createAutomaticDeposit(null, null, null, null, this);
        }
    }

    /* compiled from: AutomaticDepositStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AutomaticDepositStore", m3645f = "AutomaticDepositStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE}, m3647m = "deleteAutomaticDeposit")
    /* renamed from: com.robinhood.librobinhood.data.store.AutomaticDepositStore$deleteAutomaticDeposit$1 */
    static final class C336031 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C336031(Continuation<? super C336031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AutomaticDepositStore.this.deleteAutomaticDeposit(null, false, this);
        }
    }

    /* compiled from: AutomaticDepositStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AutomaticDepositStore", m3645f = "AutomaticDepositStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE}, m3647m = "updateAutomaticDeposit")
    /* renamed from: com.robinhood.librobinhood.data.store.AutomaticDepositStore$updateAutomaticDeposit$1 */
    static final class C336071 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C336071(Continuation<? super C336071> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AutomaticDepositStore.this.updateAutomaticDeposit(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutomaticDepositStore(AccountProvider accountProvider, AchRelationshipStore achRelationshipStore, BffMoneyMovementService bffMoneyMovementService, Cashier cashier, TransfersBonfireApi transfersBonfireApi, EventLogger eventLogger, AutomaticDepositDao dao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        Intrinsics.checkNotNullParameter(cashier, "cashier");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountProvider = accountProvider;
        this.achRelationshipStore = achRelationshipStore;
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.cashier = cashier;
        this.transfersBonfireApi = transfersBonfireApi;
        this.eventLogger = eventLogger;
        this.dao = dao;
        this.listEndpoint = PaginatedEndpoint.INSTANCE.create(new AutomaticDepositStore3(this, null), getLogoutKillswitch(), new AutomaticDepositStore4(this, null), storeBundle.getClock(), new DefaultStaleDecider(Durations.INSTANCE.getFIFTEEN_SECONDS(), storeBundle.getClock()));
        this.listQuery = Store.create$default(this, Query.INSTANCE, "automaticDepositListQuery", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.AutomaticDepositStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutomaticDepositStore.listQuery$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.AutomaticDepositStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutomaticDepositStore.listQuery$lambda$1(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.skipEndpoint = PostEndpoint.INSTANCE.create(new AutomaticDepositStore5(this, null), new AutomaticDepositStore6(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job listQuery$lambda$0(AutomaticDepositStore automaticDepositStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return PaginatedEndpointKt.refreshAllPages$default(automaticDepositStore.listEndpoint, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow listQuery$lambda$1(AutomaticDepositStore automaticDepositStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return automaticDepositStore.dao.getAutomaticDeposits();
    }

    public final Observable<List<AutomaticDepositWithBankInfo>> getAutomaticDeposits() {
        return this.listQuery.asObservable(Unit.INSTANCE);
    }

    public final Observable<UiAutomaticDeposit> getAutomaticDeposit(String automaticDepositId) {
        Intrinsics.checkNotNullParameter(automaticDepositId, "automaticDepositId");
        Observable<UiAutomaticDeposit> observableSwitchMap = asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.getAutomaticDeposit(automaticDepositId)))).switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.AutomaticDepositStore.getAutomaticDeposit.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends UiAutomaticDeposit> apply(final AutomaticDeposit automaticDeposit) {
                Observable<Optional<Account>> observableJust;
                Intrinsics.checkNotNullParameter(automaticDeposit, "automaticDeposit");
                AutomaticDepositStore.this.achRelationshipStore.refresh(false);
                Observables observables = Observables.INSTANCE;
                if (automaticDeposit.getDestinationAccount().getAccountType() != ApiAutomaticDeposit.DestinationAccountType.RHY_ACCOUNT) {
                    AutomaticDepositStore.this.accountProvider.refresh(false);
                    observableJust = AutomaticDepositStore.this.accountProvider.streamAccountOptionalByRhs(automaticDeposit.getDestinationAccount().getAccountId());
                } else {
                    observableJust = Observable.just(Optional2.INSTANCE);
                    Intrinsics.checkNotNull(observableJust);
                }
                Observable observableCombineLatest = Observable.combineLatest(observableJust, AutomaticDepositStore.this.achRelationshipStore.getAchRelationship(StringsKt.toUuid(automaticDeposit.getAchRelationshipId())), new BiFunction<T1, T2, R>() { // from class: com.robinhood.librobinhood.data.store.AutomaticDepositStore$getAutomaticDeposit$1$apply$$inlined$combineLatest$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // io.reactivex.functions.BiFunction
                    public final R apply(T1 t1, T2 t2) {
                        Intrinsics.checkParameterIsNotNull(t1, "t1");
                        Intrinsics.checkParameterIsNotNull(t2, "t2");
                        Account account = (Account) ((Optional) t1).component1();
                        Intrinsics.checkNotNull(automaticDeposit);
                        return (R) new UiAutomaticDeposit(automaticDeposit, (AchRelationship) t2, account);
                    }
                });
                Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
                return observableCombineLatest;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    public final Job refresh(boolean force) {
        return PaginatedEndpointKt.refreshAllPages(this.listEndpoint, force);
    }

    public final Observable<com.robinhood.api.utils.Metadata> getMetadata() {
        return getNetworkWrapper().getMetadata(Store.KEY_DEFAULT);
    }

    public static /* synthetic */ Flow getNextDepositForAccount$default(AutomaticDepositStore automaticDepositStore, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return automaticDepositStore.getNextDepositForAccount(str, z);
    }

    public final Flow<AutomaticDeposit> getNextDepositForAccount(String rhsAccountNumber, boolean forceRefresh) {
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        PaginatedEndpointKt.refreshAllPages(this.listEndpoint, forceRefresh);
        return this.dao.getNextDepositForAccount(rhsAccountNumber);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createAutomaticDeposit(UUID uuid, BigDecimal bigDecimal, ApiAutomaticDeposit.Frequency frequency, UserInteractionEventData userInteractionEventData, Continuation<? super AutomaticDeposit> continuation) {
        C336011 c336011;
        AutomaticDepositStore automaticDepositStore;
        if (continuation instanceof C336011) {
            c336011 = (C336011) continuation;
            int i = c336011.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c336011.label = i - Integer.MIN_VALUE;
            } else {
                c336011 = new C336011(continuation);
            }
        }
        Object objLogResponseMetadataAndUnwrap = c336011.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c336011.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLogResponseMetadataAndUnwrap);
            EventLogger eventLogger = this.eventLogger;
            automaticDepositStore = this;
            AutomaticDepositStore2 automaticDepositStore2 = new AutomaticDepositStore2(automaticDepositStore, uuid, bigDecimal, frequency, null);
            NetworkContext.Tag tag = NetworkContext.Tag.SUBMIT_RECURRING_DEPOSIT;
            c336011.label = 1;
            objLogResponseMetadataAndUnwrap = EventLoggers.logResponseMetadataAndUnwrap(eventLogger, userInteractionEventData, automaticDepositStore2, tag, c336011);
            if (objLogResponseMetadataAndUnwrap == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLogResponseMetadataAndUnwrap);
            automaticDepositStore = this;
        }
        PaginatedEndpointKt.refreshAllPages(automaticDepositStore.listEndpoint, true);
        return AutomaticDeposit2.toDbModel((ApiAutomaticDeposit) objLogResponseMetadataAndUnwrap);
    }

    public final Single<AutomaticDeposit> skipAutomaticDeposit(final String automaticDepositId) {
        Intrinsics.checkNotNullParameter(automaticDepositId, "automaticDepositId");
        Single<AutomaticDeposit> map = EventLoggers.logResponseMetadataAndUnwrap(this.eventLogger, RxFactory.DefaultImpls.rxSingle$default(this, null, new C336051(automaticDepositId, null), 1, null), new Function1() { // from class: com.robinhood.librobinhood.data.store.AutomaticDepositStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutomaticDepositStore.skipAutomaticDeposit$lambda$2(automaticDepositId, (Response) obj);
            }
        }, new Function1() { // from class: com.robinhood.librobinhood.data.store.AutomaticDepositStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutomaticDepositStore.skipAutomaticDeposit$lambda$3(automaticDepositId, (Throwable) obj);
            }
        }).map(new Function() { // from class: com.robinhood.librobinhood.data.store.AutomaticDepositStore.skipAutomaticDeposit.4
            @Override // io.reactivex.functions.Function
            public final AutomaticDeposit apply(ApiAutomaticDeposit p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return AutomaticDeposit2.toDbModel(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* compiled from: AutomaticDepositStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiAutomaticDeposit;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AutomaticDepositStore$skipAutomaticDeposit$1", m3645f = "AutomaticDepositStore.kt", m3646l = {EnumC7081g.f2773x8d9721ad}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.AutomaticDepositStore$skipAutomaticDeposit$1 */
    static final class C336051 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Response<ApiAutomaticDeposit>>, Object> {
        final /* synthetic */ String $automaticDepositId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C336051(String str, Continuation<? super C336051> continuation) {
            super(2, continuation);
            this.$automaticDepositId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AutomaticDepositStore.this.new C336051(this.$automaticDepositId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<ApiAutomaticDeposit>> continuation) {
            return ((C336051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PostEndpoint postEndpoint = AutomaticDepositStore.this.skipEndpoint;
            String str = this.$automaticDepositId;
            this.label = 1;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, str, null, this, 2, null);
            return objPost$default == coroutine_suspended ? coroutine_suspended : objPost$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventData skipAutomaticDeposit$lambda$2(String str, Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return new UserInteractionEventData(UserInteractionEventData.EventType.NETWORK, new Screen(Screen.Name.RECURRING_DEPOSIT_DETAIL, null, str, null, 10, null), null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LoggingUtils4.toNetworkContext((Response<?>) response, NetworkContext.Tag.SKIP_RECURRING_DEPOSIT), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -8193, -1, -1, -1, -1, 16383, null), null, null, 108, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventData skipAutomaticDeposit$lambda$3(String str, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        return new UserInteractionEventData(UserInteractionEventData.EventType.NETWORK, new Screen(Screen.Name.RECURRING_DEPOSIT_DETAIL, null, str, null, 10, null), null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LoggingUtils4.toNetworkContext(t, NetworkContext.Tag.SKIP_RECURRING_DEPOSIT), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -8193, -1, -1, -1, -1, 16383, null), null, null, 108, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateAutomaticDeposit(String str, DepositScheduleStateDto depositScheduleStateDto, Continuation<? super Unit> continuation) {
        C336071 c336071;
        if (continuation instanceof C336071) {
            c336071 = (C336071) continuation;
            int i = c336071.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c336071.label = i - Integer.MIN_VALUE;
            } else {
                c336071 = new C336071(continuation);
            }
        }
        Object obj = c336071.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c336071.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            BffMoneyMovementService bffMoneyMovementService = this.bffMoneyMovementService;
            UpdateDepositScheduleRequestDto updateDepositScheduleRequestDto = new UpdateDepositScheduleRequestDto(str, depositScheduleStateDto);
            c336071.label = 1;
            if (bffMoneyMovementService.UpdateDepositSchedule(updateDepositScheduleRequestDto, c336071) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        refresh(true);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object deleteAutomaticDeposit$default(AutomaticDepositStore automaticDepositStore, String str, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return automaticDepositStore.deleteAutomaticDeposit(str, z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r7.UpdateDepositSchedule(r8, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r7.deleteAutomaticDeposit(r6, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteAutomaticDeposit(String str, boolean z, Continuation<? super Unit> continuation) {
        C336031 c336031;
        if (continuation instanceof C336031) {
            c336031 = (C336031) continuation;
            int i = c336031.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c336031.label = i - Integer.MIN_VALUE;
            } else {
                c336031 = new C336031(continuation);
            }
        }
        Object obj = c336031.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c336031.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (z) {
                BffMoneyMovementService bffMoneyMovementService = this.bffMoneyMovementService;
                UpdateDepositScheduleRequestDto updateDepositScheduleRequestDto = new UpdateDepositScheduleRequestDto(str, DepositScheduleStateDto.DEPOSIT_SCHEDULE_STATE_CANCELED);
                c336031.label = 1;
            } else {
                Cashier cashier = this.cashier;
                c336031.label = 2;
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Unit unit = Unit.INSTANCE;
        }
        PaginatedEndpointKt.refreshAllPages(this.listEndpoint, true);
        return Unit.INSTANCE;
    }
}
