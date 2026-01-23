package com.robinhood.librobinhood.data.store;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.trade.equity.retrofit.TradeEquityBonfireApi;
import com.robinhood.models.api.ApiInstrumentBuyingPower;
import com.robinhood.models.dao.InstrumentBuyingPowerDao;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.p320db.InstrumentBuyingPower3;
import com.robinhood.models.p320db.StaleConfig;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p479j$.time.Duration;

/* compiled from: InstrumentBuyingPowerStore.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eJ\u001e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0012J$\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001e0'2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0010\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R/\u0010#\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010 \u001a\u0004\b%\u0010\"¨\u0006*"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "Lcom/robinhood/store/Store;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "tradeEquityBonfireApi", "Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/InstrumentBuyingPowerDao;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/InstrumentBuyingPowerDao;)V", "individualAccountInstrumentEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/models/api/ApiInstrumentBuyingPower;", "selectedAccountInstrumentEndpoint", "Lkotlin/Pair;", "", "selectedAccountInstrumentEndpointReplace", "Lcom/robinhood/librobinhood/data/store/ReplaceOrderInstrumentBuyingPowerQuery;", "refreshIndividualAccount", "", "force", "", "instrumentId", "refreshSelectedAccount", "accountNumber", "streamIndividualAccountBuyingPowerForInstrument", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/InstrumentBuyingPower;", "getStreamIndividualAccountBuyingPowerForInstrument$annotations", "()V", "getStreamIndividualAccountBuyingPowerForInstrument", "()Lcom/robinhood/android/moria/db/Query;", "streamSelectedAccountBuyingPowerForInstrument", "getStreamSelectedAccountBuyingPowerForInstrument$annotations", "getStreamSelectedAccountBuyingPowerForInstrument", "streamSelectedAccountBuyingPowerForInstrumentReplace", "Lkotlinx/coroutines/flow/Flow;", "orderToReplaceId", "Companion", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class InstrumentBuyingPowerStore extends Store {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AccountProvider accountProvider;
    private final InstrumentBuyingPowerDao dao;
    private final Endpoint<UUID, ApiInstrumentBuyingPower> individualAccountInstrumentEndpoint;
    private final Endpoint<Tuples2<UUID, String>, ApiInstrumentBuyingPower> selectedAccountInstrumentEndpoint;
    private final Endpoint<ReplaceOrderInstrumentBuyingPowerQuery, ApiInstrumentBuyingPower> selectedAccountInstrumentEndpointReplace;
    private final Query<UUID, InstrumentBuyingPower> streamIndividualAccountBuyingPowerForInstrument;
    private final Query<Tuples2<UUID, String>, InstrumentBuyingPower> streamSelectedAccountBuyingPowerForInstrument;
    private final TradeEquityBonfireApi tradeEquityBonfireApi;

    public static /* synthetic */ void getStreamIndividualAccountBuyingPowerForInstrument$annotations() {
    }

    public static /* synthetic */ void getStreamSelectedAccountBuyingPowerForInstrument$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentBuyingPowerStore(AccountProvider accountProvider, TradeEquityBonfireApi tradeEquityBonfireApi, StoreBundle storeBundle, InstrumentBuyingPowerDao dao) {
        super(storeBundle, InstrumentBuyingPower.INSTANCE);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(tradeEquityBonfireApi, "tradeEquityBonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.accountProvider = accountProvider;
        this.tradeEquityBonfireApi = tradeEquityBonfireApi;
        this.dao = dao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.individualAccountInstrumentEndpoint = Endpoint.Companion.createWithParams$default(companion, new InstrumentBuyingPowerStore2(this, null), getLogoutKillswitch(), new InstrumentBuyingPowerStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.selectedAccountInstrumentEndpoint = Endpoint.Companion.createWithParams$default(companion, new InstrumentBuyingPowerStore4(this, null), getLogoutKillswitch(), new InstrumentBuyingPowerStore5(this, null), storeBundle.getClock(), null, 16, null);
        this.selectedAccountInstrumentEndpointReplace = Endpoint.Companion.createWithParams$default(companion, new InstrumentBuyingPowerStore6(this, null), getLogoutKillswitch(), new InstrumentBuyingPowerStore7(null), storeBundle.getClock(), null, 16, null);
        Query.Companion companion2 = Query.INSTANCE;
        this.streamIndividualAccountBuyingPowerForInstrument = Store.create$default(this, companion2, CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentBuyingPowerStore.streamIndividualAccountBuyingPowerForInstrument$lambda$0(this.f$0, (UUID) obj);
            }
        })), new InstrumentBuyingPowerStore8(dao), false, 4, null);
        this.streamSelectedAccountBuyingPowerForInstrument = Store.create$default(this, companion2, "streamSelectedAccountBuyingPowerForInstrument", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentBuyingPowerStore.streamSelectedAccountBuyingPowerForInstrument$lambda$1(this.f$0, (Tuples2) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentBuyingPowerStore.streamSelectedAccountBuyingPowerForInstrument$lambda$2(this.f$0, (Tuples2) obj);
            }
        }, false, 8, null);
    }

    public final void refreshIndividualAccount(boolean force, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Endpoint.DefaultImpls.refresh$default(this.individualAccountInstrumentEndpoint, instrumentId, force, null, 4, null);
    }

    public final void refreshSelectedAccount(boolean force, UUID instrumentId, String accountNumber) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Endpoint.DefaultImpls.refresh$default(this.selectedAccountInstrumentEndpoint, new Tuples2(instrumentId, accountNumber), force, null, 4, null);
    }

    public final Query<UUID, InstrumentBuyingPower> getStreamIndividualAccountBuyingPowerForInstrument() {
        return this.streamIndividualAccountBuyingPowerForInstrument;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamIndividualAccountBuyingPowerForInstrument$lambda$0(InstrumentBuyingPowerStore instrumentBuyingPowerStore, UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return Endpoint.DefaultImpls.poll$default(instrumentBuyingPowerStore.individualAccountInstrumentEndpoint, id, null, null, 6, null);
    }

    public final Query<Tuples2<UUID, String>, InstrumentBuyingPower> getStreamSelectedAccountBuyingPowerForInstrument() {
        return this.streamSelectedAccountBuyingPowerForInstrument;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamSelectedAccountBuyingPowerForInstrument$lambda$1(InstrumentBuyingPowerStore instrumentBuyingPowerStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return Endpoint.DefaultImpls.poll$default(instrumentBuyingPowerStore.selectedAccountInstrumentEndpoint, new Tuples2((UUID) tuples2.component1(), (String) tuples2.component2()), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamSelectedAccountBuyingPowerForInstrument$lambda$2(InstrumentBuyingPowerStore instrumentBuyingPowerStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return instrumentBuyingPowerStore.dao.getInstrumentBuyingPowerByIdAndAccountNumber((UUID) tuples2.component1(), (String) tuples2.component2());
    }

    public final Flow<InstrumentBuyingPower> streamSelectedAccountBuyingPowerForInstrumentReplace(UUID instrumentId, String accountNumber, UUID orderToReplaceId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderToReplaceId, "orderToReplaceId");
        final Flow flowPoll$default = Endpoint.DefaultImpls.poll$default(this.selectedAccountInstrumentEndpointReplace, new ReplaceOrderInstrumentBuyingPowerQuery(instrumentId, accountNumber, orderToReplaceId), null, null, 6, null);
        return new Flow<InstrumentBuyingPower>() { // from class: com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore$streamSelectedAccountBuyingPowerForInstrumentReplace$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super InstrumentBuyingPower> flowCollector, Continuation continuation) {
                Object objCollect = flowPoll$default.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore$streamSelectedAccountBuyingPowerForInstrumentReplace$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore$streamSelectedAccountBuyingPowerForInstrumentReplace$$inlined$map$1$2", m3645f = "InstrumentBuyingPowerStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore$streamSelectedAccountBuyingPowerForInstrumentReplace$$inlined$map$1$2$1, reason: invalid class name */
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
                        InstrumentBuyingPower dbModel = InstrumentBuyingPower3.toDbModel((ApiInstrumentBuyingPower) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(dbModel, anonymousClass1) == coroutine_suspended) {
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

    /* compiled from: InstrumentBuyingPowerStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore$Companion;", "Lcom/robinhood/models/db/StaleConfig;", "<init>", "()V", "j$/time/Duration", "getNormalStaleTimeout", "()Lj$/time/Duration;", "normalStaleTimeout", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StaleConfig {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.models.p320db.StaleConfig
        public Duration getShortStaleTimeout() {
            return StaleConfig.DefaultImpls.getShortStaleTimeout(this);
        }

        @Override // com.robinhood.models.p320db.StaleConfig
        public Duration getNormalStaleTimeout() {
            return Durations.INSTANCE.getFIVE_SECONDS();
        }
    }
}
