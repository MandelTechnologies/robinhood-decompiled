package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libs.tab.CurrentTabManager;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.trade.equity.retrofit.TradeEquityBonfireApi;
import com.robinhood.compose.bento.component.BentoTabBarState;
import com.robinhood.librobinhood.data.prefs.InstrumentAccountNumberPref;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore2;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.dao.bonfire.instrument.InstrumentAccountSwitcherDao;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentAccountSwitcher;
import com.robinhood.prefs.StringPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: InstrumentAccountSwitcherStore.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B;\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150&0%J\u0010\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0015J$\u0010*\u001a\b\u0012\u0004\u0012\u00020+0%2\u0006\u0010,\u001a\u00020\u001c2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dJ(\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u001c2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\b\u0002\u00101\u001a\u000202R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0019\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001b\u0012\u0004\u0012\u00020\u001f0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001f0!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00063"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "Lcom/robinhood/store/Store;", "accountNumberPreference", "Lcom/robinhood/prefs/StringPreference;", "dao", "Lcom/robinhood/models/dao/bonfire/instrument/InstrumentAccountSwitcherDao;", "tradeEquityApi", "Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;", "currentTabManager", "Lcom/robinhood/android/libs/tab/CurrentTabManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/models/dao/bonfire/instrument/InstrumentAccountSwitcherDao;Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;Lcom/robinhood/android/libs/tab/CurrentTabManager;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/store/StoreBundle;)V", "getMoshi", "()Lcom/robinhood/utils/moshi/LazyMoshi;", "tabToAccount", "", "Lcom/robinhood/compose/bento/component/BentoTabBarState$Tab;", "", "setStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "accountSwitcherEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "Ljava/util/UUID;", "", "Lcom/robinhood/models/api/BrokerageAccountType;", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher;", "instrumentAccountSwitcherQuery", "Lcom/robinhood/android/moria/db/Query;", "getInstrumentAccountSwitcherQuery", "()Lcom/robinhood/android/moria/db/Query;", "streamActiveAccountNumber", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "setActiveAccountNumber", "", "accountNumber", "forceFetchAccountSwitcher", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherRefreshState;", "instrumentId", "includeAccountTypes", "refresh", "Lkotlinx/coroutines/Job;", "instrumentUuid", "force", "", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class InstrumentAccountSwitcherStore extends Store {
    private final StringPreference accountNumberPreference;
    private final Endpoint<Tuples2<UUID, List<BrokerageAccountType>>, InstrumentAccountSwitcher> accountSwitcherEndpoint;
    private final CurrentTabManager currentTabManager;
    private final Query<UUID, InstrumentAccountSwitcher> instrumentAccountSwitcherQuery;
    private final LazyMoshi moshi;
    private final JsonAdapter<Set<String>> setStringAdapter;
    private final Map<BentoTabBarState.Tab, String> tabToAccount;
    private final TradeEquityBonfireApi tradeEquityApi;

    public final LazyMoshi getMoshi() {
        return this.moshi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentAccountSwitcherStore(@InstrumentAccountNumberPref StringPreference accountNumberPreference, InstrumentAccountSwitcherDao dao, TradeEquityBonfireApi tradeEquityApi, CurrentTabManager currentTabManager, LazyMoshi moshi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountNumberPreference, "accountNumberPreference");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(tradeEquityApi, "tradeEquityApi");
        Intrinsics.checkNotNullParameter(currentTabManager, "currentTabManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountNumberPreference = accountNumberPreference;
        this.tradeEquityApi = tradeEquityApi;
        this.currentTabManager = currentTabManager;
        this.moshi = moshi;
        this.tabToAccount = new LinkedHashMap();
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C346371(null), 3, null);
        Types types = Types.INSTANCE;
        this.setStringAdapter = moshi.adapter(new TypeToken<Set<? extends String>>() { // from class: com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore$special$$inlined$getAdapter$1
        }.getType());
        this.accountSwitcherEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new InstrumentAccountSwitcherStore3(this, null), getLogoutKillswitch(), new InstrumentAccountSwitcherStore4(dao, null), storeBundle.getClock(), null, 16, null);
        this.instrumentAccountSwitcherQuery = Store.create$default(this, Query.INSTANCE, "queryAccountSwitcher", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentAccountSwitcherStore.instrumentAccountSwitcherQuery$lambda$0(this.f$0, (UUID) obj);
            }
        })), new InstrumentAccountSwitcherStore5(dao), false, 8, null);
    }

    /* compiled from: InstrumentAccountSwitcherStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore$1", m3645f = "InstrumentAccountSwitcherStore.kt", m3646l = {44}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore$1 */
    static final class C346371 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C346371(Continuation<? super C346371> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InstrumentAccountSwitcherStore.this.new C346371(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C346371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<BentoTabBarState.Tab> currentTab = InstrumentAccountSwitcherStore.this.currentTabManager.getCurrentTab();
                final InstrumentAccountSwitcherStore instrumentAccountSwitcherStore = InstrumentAccountSwitcherStore.this;
                FlowCollector<? super BentoTabBarState.Tab> flowCollector = new FlowCollector() { // from class: com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((BentoTabBarState.Tab) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(BentoTabBarState.Tab tab, Continuation<? super Unit> continuation) {
                        String str = (String) instrumentAccountSwitcherStore.tabToAccount.get(tab);
                        if (str != null) {
                            instrumentAccountSwitcherStore.accountNumberPreference.set(str);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (currentTab.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    public final Query<UUID, InstrumentAccountSwitcher> getInstrumentAccountSwitcherQuery() {
        return this.instrumentAccountSwitcherQuery;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow instrumentAccountSwitcherQuery$lambda$0(InstrumentAccountSwitcherStore instrumentAccountSwitcherStore, UUID instrumentUuid) {
        Intrinsics.checkNotNullParameter(instrumentUuid, "instrumentUuid");
        return Endpoint.DefaultImpls.poll$default(instrumentAccountSwitcherStore.accountSwitcherEndpoint, new Tuples2(instrumentUuid, CollectionsKt.emptyList()), null, null, 6, null);
    }

    public final Observable<Optional<String>> streamActiveAccountNumber() {
        Observable map = this.accountNumberPreference.changes().map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore.streamActiveAccountNumber.1
            @Override // io.reactivex.functions.Function
            public final Optional<String> apply(Optional<String> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                String strComponent1 = optional.component1();
                if (strComponent1 == null || StringsKt.isBlank(strComponent1)) {
                    strComponent1 = null;
                }
                return Optional3.asOptional(strComponent1);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final void setActiveAccountNumber(String accountNumber) {
        if (accountNumber != null && !StringsKt.isBlank(accountNumber)) {
            this.tabToAccount.put(this.currentTabManager.getCurrentTab().getValue(), accountNumber);
            this.accountNumberPreference.set(accountNumber);
        } else {
            this.accountNumberPreference.set(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Observable forceFetchAccountSwitcher$default(InstrumentAccountSwitcherStore instrumentAccountSwitcherStore, UUID uuid, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        return instrumentAccountSwitcherStore.forceFetchAccountSwitcher(uuid, list);
    }

    /* compiled from: InstrumentAccountSwitcherStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherRefreshState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore$forceFetchAccountSwitcher$1", m3645f = "InstrumentAccountSwitcherStore.kt", m3646l = {117, 119, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore$forceFetchAccountSwitcher$1 */
    static final class C346381 extends ContinuationImpl7 implements Function2<FlowCollector<? super InstrumentAccountSwitcherStore2>, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<BrokerageAccountType> $includeAccountTypes;
        final /* synthetic */ UUID $instrumentId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C346381(UUID uuid, List<? extends BrokerageAccountType> list, Continuation<? super C346381> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
            this.$includeAccountTypes = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C346381 c346381 = InstrumentAccountSwitcherStore.this.new C346381(this.$instrumentId, this.$includeAccountTypes, continuation);
            c346381.L$0 = obj;
            return c346381;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super InstrumentAccountSwitcherStore2> flowCollector, Continuation<? super Unit> continuation) {
            return ((C346381) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:(1:(4:(1:(1:8)(2:9|10))(3:11|48|12)|13|44|45)(6:16|50|17|18|46|32))(1:22))(3:23|(1:25)|43)|52|26|27|54|28|(3:31|46|32)|43|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
        
            if (r4.emit(r0, r11) != r1) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
        
            r3 = r12;
            r12 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0098, code lost:
        
            r8 = r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a8, code lost:
        
            if (r3.emit(r0, r11) == r1) goto L43;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            C346381 c346381;
            FlowCollector flowCollector2;
            Exception exc;
            FlowCollector flowCollector3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                InstrumentAccountSwitcherStore2.Loading loading = InstrumentAccountSwitcherStore2.Loading.INSTANCE;
                this.L$0 = flowCollector;
                this.label = 1;
                if (flowCollector.emit(loading, this) == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                flowCollector = flowCollector4;
            } else if (i == 2) {
                flowCollector3 = (FlowCollector) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    c346381 = this;
                    try {
                        InstrumentAccountSwitcherStore2.Success success = new InstrumentAccountSwitcherStore2.Success((InstrumentAccountSwitcher) obj);
                        c346381.L$0 = flowCollector3;
                        c346381.label = 3;
                    } catch (Exception e) {
                        exc = e;
                        flowCollector2 = flowCollector3;
                        InstrumentAccountSwitcherStore2.Failure failure = new InstrumentAccountSwitcherStore2.Failure(exc);
                        c346381.L$0 = null;
                        c346381.label = 4;
                    }
                } catch (Exception e2) {
                    exc = e2;
                    c346381 = this;
                    flowCollector2 = flowCollector3;
                    InstrumentAccountSwitcherStore2.Failure failure2 = new InstrumentAccountSwitcherStore2.Failure(exc);
                    c346381.L$0 = null;
                    c346381.label = 4;
                }
            } else {
                if (i == 3) {
                    flowCollector2 = (FlowCollector) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e3) {
                        exc = e3;
                        c346381 = this;
                        InstrumentAccountSwitcherStore2.Failure failure22 = new InstrumentAccountSwitcherStore2.Failure(exc);
                        c346381.L$0 = null;
                        c346381.label = 4;
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            Endpoint endpoint = InstrumentAccountSwitcherStore.this.accountSwitcherEndpoint;
            Tuples2 tuples2 = new Tuples2(this.$instrumentId, this.$includeAccountTypes);
            this.L$0 = flowCollector;
            this.label = 2;
            c346381 = this;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, tuples2, null, c346381, 2, null);
            if (objForceFetch$default != coroutine_suspended) {
                flowCollector3 = flowCollector;
                obj = objForceFetch$default;
                InstrumentAccountSwitcherStore2.Success success2 = new InstrumentAccountSwitcherStore2.Success((InstrumentAccountSwitcher) obj);
                c346381.L$0 = flowCollector3;
                c346381.label = 3;
            }
            return coroutine_suspended;
        }
    }

    public final Observable<InstrumentAccountSwitcherStore2> forceFetchAccountSwitcher(UUID instrumentId, List<? extends BrokerageAccountType> includeAccountTypes) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(includeAccountTypes, "includeAccountTypes");
        return asObservable(FlowKt.flowOn(FlowKt.flow(new C346381(instrumentId, includeAccountTypes, null)), Dispatchers.getIO()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Job refresh$default(InstrumentAccountSwitcherStore instrumentAccountSwitcherStore, UUID uuid, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return instrumentAccountSwitcherStore.refresh(uuid, list, z);
    }

    public final Job refresh(UUID instrumentUuid, List<? extends BrokerageAccountType> includeAccountTypes, boolean force) {
        Intrinsics.checkNotNullParameter(instrumentUuid, "instrumentUuid");
        Intrinsics.checkNotNullParameter(includeAccountTypes, "includeAccountTypes");
        return Endpoint.DefaultImpls.refresh$default(this.accountSwitcherEndpoint, new Tuples2(instrumentUuid, includeAccountTypes), force, null, 4, null);
    }
}
