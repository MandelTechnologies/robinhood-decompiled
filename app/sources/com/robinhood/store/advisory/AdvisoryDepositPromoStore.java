package com.robinhood.store.advisory;

import advisory.proto.p008v1.AdvisoryService;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.models.advisory.p304db.card.StrategiesDashboardCard;
import com.robinhood.models.advisory.p304db.promo.DepositPromoConfig;
import com.robinhood.models.advisory.p304db.promo.DepositPromoResponse;
import com.robinhood.prefs.StringToBooleanMapPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.datetime.Durations;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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

/* compiled from: AdvisoryDepositPromoStore.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00152\u0006\u0010\u0016\u001a\u00020\fJ\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00152\u0006\u0010\u0016\u001a\u00020\fJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00180\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00180\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/store/advisory/AdvisoryDepositPromoStore;", "Lcom/robinhood/store/Store;", "advisoryService", "Ladvisory/proto/v1/AdvisoryService;", "dismissedDepositPromosPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ladvisory/proto/v1/AdvisoryService;Lcom/robinhood/prefs/StringToBooleanMapPreference;Lcom/robinhood/store/StoreBundle;)V", "depositPromoFlowMap", "", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/models/advisory/db/promo/DepositPromoConfig;", "depositPromoEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/advisory/db/promo/DepositPromoResponse;", "depositPromoQuery", "Lcom/robinhood/android/moria/db/Query;", "streamDepositPromoConfig", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "dashboardCardFlowMap", "Lcom/robinhood/models/advisory/db/card/StrategiesDashboardCard$Response;", "dashboardCardEndpoint", "dashboardCardQuery", "streamHighestPriorityNonDismissedCard", "Lcom/robinhood/models/advisory/db/card/StrategiesDashboardCard;", "dismissCard", "", "id", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class AdvisoryDepositPromoStore extends Store {
    private final AdvisoryService advisoryService;
    private final Endpoint<String, StrategiesDashboardCard.Response> dashboardCardEndpoint;
    private final Map<String, StateFlow2<StrategiesDashboardCard.Response>> dashboardCardFlowMap;
    private final Query<String, StrategiesDashboardCard.Response> dashboardCardQuery;
    private final Endpoint<String, DepositPromoResponse> depositPromoEndpoint;
    private final Map<String, StateFlow2<DepositPromoConfig>> depositPromoFlowMap;
    private final Query<String, DepositPromoConfig> depositPromoQuery;
    private final StringToBooleanMapPreference dismissedDepositPromosPref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryDepositPromoStore(AdvisoryService advisoryService, @HasDismissedStrategiesDepositsPromoPref StringToBooleanMapPreference dismissedDepositPromosPref, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
        Intrinsics.checkNotNullParameter(dismissedDepositPromosPref, "dismissedDepositPromosPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.advisoryService = advisoryService;
        this.dismissedDepositPromosPref = dismissedDepositPromosPref;
        this.depositPromoFlowMap = new LinkedHashMap();
        Endpoint.Companion companion = Endpoint.INSTANCE;
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        Clock clock = storeBundle.getClock();
        Duration duration = Durations.FIVE_MINUTES;
        this.depositPromoEndpoint = companion.create(new AdvisoryDepositPromoStore4(this, null), logoutKillswitch, new AdvisoryDepositPromoStore5(this, null), clock, new DefaultStaleDecider(duration, storeBundle.getClock()));
        Query.Companion companion2 = Query.INSTANCE;
        this.depositPromoQuery = Store.create$default(this, companion2, "depositPromoQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.advisory.AdvisoryDepositPromoStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvisoryDepositPromoStore.depositPromoQuery$lambda$0(this.f$0, (String) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.advisory.AdvisoryDepositPromoStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvisoryDepositPromoStore.depositPromoQuery$lambda$2(this.f$0, (String) obj);
            }
        }, false, 8, null);
        this.dashboardCardFlowMap = new LinkedHashMap();
        this.dashboardCardEndpoint = companion.create(new AdvisoryDepositPromoStore2(this, null), getLogoutKillswitch(), new AdvisoryDepositPromoStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(duration, storeBundle.getClock()));
        this.dashboardCardQuery = Store.create$default(this, companion2, "dashboardCardQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.advisory.AdvisoryDepositPromoStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvisoryDepositPromoStore.dashboardCardQuery$lambda$3(this.f$0, (String) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.advisory.AdvisoryDepositPromoStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvisoryDepositPromoStore.dashboardCardQuery$lambda$5(this.f$0, (String) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow depositPromoQuery$lambda$0(AdvisoryDepositPromoStore advisoryDepositPromoStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return Endpoint.DefaultImpls.poll$default(advisoryDepositPromoStore.depositPromoEndpoint, accountNumber, Durations.FIVE_MINUTES, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow depositPromoQuery$lambda$2(AdvisoryDepositPromoStore advisoryDepositPromoStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Map<String, StateFlow2<DepositPromoConfig>> map = advisoryDepositPromoStore.depositPromoFlowMap;
        StateFlow2<DepositPromoConfig> stateFlow2MutableStateFlow = map.get(accountNumber);
        if (stateFlow2MutableStateFlow == null) {
            stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(null);
            map.put(accountNumber, stateFlow2MutableStateFlow);
        }
        return stateFlow2MutableStateFlow;
    }

    public final Flow<DepositPromoConfig> streamDepositPromoConfig(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return this.depositPromoQuery.asFlow(accountNumber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow dashboardCardQuery$lambda$3(AdvisoryDepositPromoStore advisoryDepositPromoStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return Endpoint.DefaultImpls.poll$default(advisoryDepositPromoStore.dashboardCardEndpoint, accountNumber, Durations.FIVE_MINUTES, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow dashboardCardQuery$lambda$5(AdvisoryDepositPromoStore advisoryDepositPromoStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Map<String, StateFlow2<StrategiesDashboardCard.Response>> map = advisoryDepositPromoStore.dashboardCardFlowMap;
        StateFlow2<StrategiesDashboardCard.Response> stateFlow2MutableStateFlow = map.get(accountNumber);
        if (stateFlow2MutableStateFlow == null) {
            stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(null);
            map.put(accountNumber, stateFlow2MutableStateFlow);
        }
        return stateFlow2MutableStateFlow;
    }

    public final Flow<StrategiesDashboardCard> streamHighestPriorityNonDismissedCard(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        final Flow<StrategiesDashboardCard.Response> flowAsFlow = this.dashboardCardQuery.asFlow(accountNumber);
        return FlowKt.combine(new Flow<List<? extends StrategiesDashboardCard>>() { // from class: com.robinhood.store.advisory.AdvisoryDepositPromoStore$streamHighestPriorityNonDismissedCard$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.advisory.AdvisoryDepositPromoStore$streamHighestPriorityNonDismissedCard$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.advisory.AdvisoryDepositPromoStore$streamHighestPriorityNonDismissedCard$$inlined$map$1$2", m3645f = "AdvisoryDepositPromoStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.advisory.AdvisoryDepositPromoStore$streamHighestPriorityNonDismissedCard$$inlined$map$1$2$1, reason: invalid class name */
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
                        List<StrategiesDashboardCard> cards = ((StrategiesDashboardCard.Response) obj).getCards();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(cards, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super List<? extends StrategiesDashboardCard>> flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Context7.buffer$default(RxConvert.asFlow(this.dismissedDepositPromosPref.streamChanges()), Integer.MAX_VALUE, null, 2, null), new C413082(null));
    }

    /* compiled from: AdvisoryDepositPromoStore.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/advisory/db/card/StrategiesDashboardCard;", "cards", "", "dismissedPromos", "", "", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.advisory.AdvisoryDepositPromoStore$streamHighestPriorityNonDismissedCard$2", m3645f = "AdvisoryDepositPromoStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.store.advisory.AdvisoryDepositPromoStore$streamHighestPriorityNonDismissedCard$2 */
    static final class C413082 extends ContinuationImpl7 implements Function3<List<? extends StrategiesDashboardCard>, Map<String, ? extends Boolean>, Continuation<? super StrategiesDashboardCard>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C413082(Continuation<? super C413082> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(List<? extends StrategiesDashboardCard> list, Map<String, ? extends Boolean> map, Continuation<? super StrategiesDashboardCard> continuation) {
            return invoke2((List<StrategiesDashboardCard>) list, (Map<String, Boolean>) map, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<StrategiesDashboardCard> list, Map<String, Boolean> map, Continuation<? super StrategiesDashboardCard> continuation) {
            C413082 c413082 = new C413082(continuation);
            c413082.L$0 = list;
            c413082.L$1 = map;
            return c413082.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object next;
            StrategiesDashboardCard.DismissSettings dismissSettings;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            Map map = (Map) this.L$1;
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    return null;
                }
                next = it.next();
                dismissSettings = ((StrategiesDashboardCard) next).getDismissSettings();
            } while (map.containsKey(dismissSettings != null ? dismissSettings.getDismissId() : null));
            return next;
        }
    }

    public final void dismissCard(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.dismissedDepositPromosPref.set(id, true);
    }
}
