package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.Batch;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore;
import com.robinhood.models.api.ApiAggregateOptionQuote;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.dao.AggregateOptionPositionQuoteDao;
import com.robinhood.models.p320db.AggregateOptionPositionLeg;
import com.robinhood.models.p320db.AggregateOptionPositionQuote;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p355ui.UiAggregateOptionPosition;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;

/* compiled from: AggregateOptionQuoteStore.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 22\u00020\u0001:\u000232B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00140\u001f0\u000e2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J-\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R(\u0010+\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(\u0012\u0006\u0012\u0004\u0018\u00010*0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R(\u0010-\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(\u0012\u0006\u0012\u0004\u0018\u00010*0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u001a0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u00101\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u001a0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100¨\u00064"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "optionsApi", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/models/dao/AggregateOptionPositionQuoteDao;", "dao", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "optionsExtendedHoursEnabledStore", "<init>", "(Lcom/robinhood/android/api/options/retrofit/OptionsApi;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/AggregateOptionPositionQuoteDao;Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;)V", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/models/ui/UiAggregateOptionPosition;", "positionFlow", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/AggregateOptionPositionQuote;", "pollAndStreamMap", "(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "positions", "", "force", "", "refreshQuotes", "(Ljava/util/List;Z)V", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "position", "Lkotlin/Pair;", "pollAndStreamQuote", "(Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;)Lkotlinx/coroutines/flow/Flow;", "streamMap", "(Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "Lcom/robinhood/models/dao/AggregateOptionPositionQuoteDao;", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "Lcom/robinhood/api/PaginatedEndpoint;", "", "Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore$PositionRequest;", "Lcom/robinhood/models/api/ApiAggregateOptionQuote;", "endpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "extendedHoursEndpoint", "Lcom/robinhood/android/moria/db/Query;", "query", "Lcom/robinhood/android/moria/db/Query;", "extendedHoursQuery", "Companion", "PositionRequest", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class AggregateOptionQuoteStore extends Store {
    private static final int MAX_BATCH_SIZE = 17;
    private final AggregateOptionPositionQuoteDao dao;
    private final PaginatedEndpoint<Iterable<PositionRequest>, ApiAggregateOptionQuote> endpoint;
    private final PaginatedEndpoint<Iterable<PositionRequest>, ApiAggregateOptionQuote> extendedHoursEndpoint;
    private final Query<PositionRequest, Unit> extendedHoursQuery;
    private final OptionsApi optionsApi;
    private final OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore;
    private final Query<PositionRequest, Unit> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregateOptionQuoteStore(OptionsApi optionsApi, Clock clock, StoreBundle storeBundle, AggregateOptionPositionQuoteDao dao, OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
        this.optionsApi = optionsApi;
        this.dao = dao;
        this.optionsExtendedHoursEnabledStore = optionsExtendedHoursEnabledStore;
        PaginatedEndpoint.Companion companion = PaginatedEndpoint.INSTANCE;
        this.endpoint = PaginatedEndpoint.Companion.createWeightedBatched$default(companion, 17, new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(AggregateOptionQuoteStore.endpoint$lambda$0((AggregateOptionQuoteStore.PositionRequest) obj));
            }
        }, new AggregateOptionQuoteStore2(this, null), getLogoutKillswitch(), new AggregateOptionQuoteStore3(this, clock, null), storeBundle.getClock(), null, 64, null);
        this.extendedHoursEndpoint = PaginatedEndpoint.Companion.createWeightedBatched$default(companion, 17, new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(AggregateOptionQuoteStore.extendedHoursEndpoint$lambda$1((AggregateOptionQuoteStore.PositionRequest) obj));
            }
        }, new AggregateOptionQuoteStore4(this, null), getLogoutKillswitch(), new AggregateOptionQuoteStore5(this, clock, null), storeBundle.getClock(), null, 64, null);
        Query.Companion companion2 = Query.INSTANCE;
        this.query = Store.create$default(this, companion2, "aggregateOptionQuoteQuery", CollectionsKt.listOf(new Batch(getStoreScope(), 17, false, 0L, new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AggregateOptionQuoteStore.query$lambda$2(this.f$0, (Collection) obj);
            }
        }, 12, null)), new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AggregateOptionQuoteStore.query$lambda$3((AggregateOptionQuoteStore.PositionRequest) obj);
            }
        }, false, 8, null);
        this.extendedHoursQuery = Store.create$default(this, companion2, "aggregateOptionQuoteQuery", CollectionsKt.listOf(new Batch(getStoreScope(), 17, false, 0L, new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AggregateOptionQuoteStore.extendedHoursQuery$lambda$4(this.f$0, (Collection) obj);
            }
        }, 12, null)), new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AggregateOptionQuoteStore.extendedHoursQuery$lambda$5((AggregateOptionQuoteStore.PositionRequest) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int endpoint$lambda$0(PositionRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return request.getNumberOfLegs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int extendedHoursEndpoint$lambda$1(PositionRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return request.getNumberOfLegs();
    }

    public final Flow<Map<UUID, AggregateOptionPositionQuote>> pollAndStreamMap(final Flow<? extends List<? extends UiAggregateOptionPosition>> positionFlow) {
        Intrinsics.checkNotNullParameter(positionFlow, "positionFlow");
        return FlowKt.mapLatest(FlowKt.distinctUntilChanged(FlowKt.transformLatest(FlowKt.transformLatest(Operators.combine(FlowKt.distinctUntilChanged(new Flow<List<? extends PositionRequest>>() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$pollAndStreamMap$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends AggregateOptionQuoteStore.PositionRequest>> flowCollector, Continuation continuation) {
                Object objCollect = positionFlow.collect(new C335792(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$pollAndStreamMap$$inlined$map$1$2 */
            public static final class C335792<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$pollAndStreamMap$$inlined$map$1$2", m3645f = "AggregateOptionQuoteStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$pollAndStreamMap$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C335792.this.emit(null, this);
                    }
                }

                public C335792(FlowCollector flowCollector) {
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
                        List list = (List) obj;
                        AggregateOptionQuoteStore.PositionRequest.Companion companion = AggregateOptionQuoteStore.PositionRequest.INSTANCE;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(companion.from((UiAggregateOptionPosition) it.next()));
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
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
        }), FlowKt.distinctUntilChanged(this.optionsExtendedHoursEnabledStore.isIndexOptionsExtendedHoursEnabled())), new C33577xd264a4cf(null, this)), new C33578xd264a4d0(null, this))), new C335824(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$2(AggregateOptionQuoteStore aggregateOptionQuoteStore, Collection requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        return PaginatedEndpoint.DefaultImpls.pollAllPages$default(aggregateOptionQuoteStore.endpoint, requests, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$3(PositionRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FlowKt.flow(new AggregateOptionQuoteStore9(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow extendedHoursQuery$lambda$4(AggregateOptionQuoteStore aggregateOptionQuoteStore, Collection requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        return PaginatedEndpoint.DefaultImpls.pollAllPages$default(aggregateOptionQuoteStore.extendedHoursEndpoint, requests, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow extendedHoursQuery$lambda$5(PositionRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FlowKt.flow(new AggregateOptionQuoteStore6(null));
    }

    /* compiled from: AggregateOptionQuoteStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/AggregateOptionPositionQuote;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$pollAndStreamMap$4", m3645f = "AggregateOptionQuoteStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$pollAndStreamMap$4 */
    static final class C335824 extends ContinuationImpl7 implements Function2<List<? extends AggregateOptionPositionQuote>, Continuation<? super Map<UUID, ? extends AggregateOptionPositionQuote>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C335824(Continuation<? super C335824> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C335824 c335824 = new C335824(continuation);
            c335824.L$0 = obj;
            return c335824;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends AggregateOptionPositionQuote> list, Continuation<? super Map<UUID, ? extends AggregateOptionPositionQuote>> continuation) {
            return invoke2((List<AggregateOptionPositionQuote>) list, (Continuation<? super Map<UUID, AggregateOptionPositionQuote>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<AggregateOptionPositionQuote> list, Continuation<? super Map<UUID, AggregateOptionPositionQuote>> continuation) {
            return ((C335824) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (Object obj2 : list) {
                linkedHashMap.put(((AggregateOptionPositionQuote) obj2).getAggregateOptionPositionId(), obj2);
            }
            return linkedHashMap;
        }
    }

    /* compiled from: AggregateOptionQuoteStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$refreshQuotes$1", m3645f = "AggregateOptionQuoteStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$refreshQuotes$1 */
    static final class C335831 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $force;
        final /* synthetic */ List<UiAggregateOptionPosition> $positions;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C335831(List<? extends UiAggregateOptionPosition> list, boolean z, Continuation<? super C335831> continuation) {
            super(2, continuation);
            this.$positions = list;
            this.$force = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AggregateOptionQuoteStore.this.new C335831(this.$positions, this.$force, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C335831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowIsIndexOptionsExtendedHoursEnabled = AggregateOptionQuoteStore.this.optionsExtendedHoursEnabledStore.isIndexOptionsExtendedHoursEnabled();
                this.label = 1;
                obj = FlowKt.firstOrNull(flowIsIndexOptionsExtendedHoursEnabled, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (Intrinsics.areEqual((Boolean) obj, boxing.boxBoolean(true))) {
                PaginatedEndpoint paginatedEndpoint = AggregateOptionQuoteStore.this.extendedHoursEndpoint;
                List<UiAggregateOptionPosition> list = this.$positions;
                PositionRequest.Companion companion = PositionRequest.INSTANCE;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(companion.from((UiAggregateOptionPosition) it.next()));
                }
                paginatedEndpoint.refreshAllPages(arrayList, this.$force);
            } else {
                PaginatedEndpoint paginatedEndpoint2 = AggregateOptionQuoteStore.this.endpoint;
                List<UiAggregateOptionPosition> list2 = this.$positions;
                PositionRequest.Companion companion2 = PositionRequest.INSTANCE;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(companion2.from((UiAggregateOptionPosition) it2.next()));
                }
                paginatedEndpoint2.refreshAllPages(arrayList2, this.$force);
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void refreshQuotes$default(AggregateOptionQuoteStore aggregateOptionQuoteStore, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        aggregateOptionQuoteStore.refreshQuotes(list, z);
    }

    public final void refreshQuotes(List<? extends UiAggregateOptionPosition> positions, boolean force) {
        Intrinsics.checkNotNullParameter(positions, "positions");
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C335831(positions, force, null), 3, null);
    }

    public final Flow<Tuples2<UiAggregateOptionPositionFull, AggregateOptionPositionQuote>> pollAndStreamQuote(final UiAggregateOptionPositionFull position) {
        Intrinsics.checkNotNullParameter(position, "position");
        final Flow<Map<UUID, AggregateOptionPositionQuote>> flowPollAndStreamMap = pollAndStreamMap(FlowKt.flowOf(CollectionsKt.listOf(position)));
        final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<AggregateOptionPositionQuote>() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$pollAndStreamQuote$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super AggregateOptionPositionQuote> flowCollector, Continuation continuation) {
                Object objCollect = flowPollAndStreamMap.collect(new AnonymousClass2(flowCollector, position), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$pollAndStreamQuote$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ UiAggregateOptionPositionFull $position$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$pollAndStreamQuote$$inlined$mapNotNull$1$2", m3645f = "AggregateOptionQuoteStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$pollAndStreamQuote$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, UiAggregateOptionPositionFull uiAggregateOptionPositionFull) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$position$inlined = uiAggregateOptionPositionFull;
                }

                /* JADX WARN: Multi-variable type inference failed */
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
                        Object obj3 = ((Map) obj).get(this.$position$inlined.getId());
                        if (obj3 != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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
        });
        return new Flow<Tuples2<? extends UiAggregateOptionPositionFull, ? extends AggregateOptionPositionQuote>>() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$pollAndStreamQuote$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Tuples2<? extends UiAggregateOptionPositionFull, ? extends AggregateOptionPositionQuote>> flowCollector, Continuation continuation) {
                Object objCollect = flowDistinctUntilChanged.collect(new C335802(flowCollector, position), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$pollAndStreamQuote$$inlined$map$1$2 */
            public static final class C335802<T> implements FlowCollector {
                final /* synthetic */ UiAggregateOptionPositionFull $position$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$pollAndStreamQuote$$inlined$map$1$2", m3645f = "AggregateOptionQuoteStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$pollAndStreamQuote$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C335802.this.emit(null, this);
                    }
                }

                public C335802(FlowCollector flowCollector, UiAggregateOptionPositionFull uiAggregateOptionPositionFull) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$position$inlined = uiAggregateOptionPositionFull;
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
                        Tuples2 tuples2M3642to = Tuples4.m3642to(this.$position$inlined, (AggregateOptionPositionQuote) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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

    public final Flow<Map<UUID, AggregateOptionPositionQuote>> streamMap(List<? extends UiAggregateOptionPosition> positions) {
        Intrinsics.checkNotNullParameter(positions, "positions");
        AggregateOptionPositionQuoteDao aggregateOptionPositionQuoteDao = this.dao;
        List<? extends UiAggregateOptionPosition> list = positions;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((UiAggregateOptionPosition) it.next()).getAggregateOptionPosition().getId());
        }
        return FlowKt.mapLatest(aggregateOptionPositionQuoteDao.getAggregateOptionPositionQuotes(arrayList), new C335842(null));
    }

    /* compiled from: AggregateOptionQuoteStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/AggregateOptionPositionQuote;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$streamMap$2", m3645f = "AggregateOptionQuoteStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$streamMap$2 */
    static final class C335842 extends ContinuationImpl7 implements Function2<List<? extends AggregateOptionPositionQuote>, Continuation<? super Map<UUID, ? extends AggregateOptionPositionQuote>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C335842(Continuation<? super C335842> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C335842 c335842 = new C335842(continuation);
            c335842.L$0 = obj;
            return c335842;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends AggregateOptionPositionQuote> list, Continuation<? super Map<UUID, ? extends AggregateOptionPositionQuote>> continuation) {
            return invoke2((List<AggregateOptionPositionQuote>) list, (Continuation<? super Map<UUID, AggregateOptionPositionQuote>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<AggregateOptionPositionQuote> list, Continuation<? super Map<UUID, AggregateOptionPositionQuote>> continuation) {
            return ((C335842) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (Object obj2 : list) {
                linkedHashMap.put(((AggregateOptionPositionQuote) obj2).getAggregateOptionPositionId(), obj2);
            }
            return linkedHashMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AggregateOptionQuoteStore.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\b\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001$B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010\u0017\u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\nHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006%"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore$PositionRequest;", "", "instrumentIds", "", "ratios", "strategyIds", "types", "aggregateOptionPositionId", "Ljava/util/UUID;", "numberOfLegs", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;I)V", "getInstrumentIds", "()Ljava/lang/String;", "getRatios", "getStrategyIds", "getTypes", "getAggregateOptionPositionId", "()Ljava/util/UUID;", "getNumberOfLegs", "()I", "compareTo", "other", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "", "hashCode", "toString", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class PositionRequest implements Comparable<PositionRequest> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final UUID aggregateOptionPositionId;
        private final String instrumentIds;
        private final int numberOfLegs;
        private final String ratios;
        private final String strategyIds;
        private final String types;

        public static /* synthetic */ PositionRequest copy$default(PositionRequest positionRequest, String str, String str2, String str3, String str4, UUID uuid, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = positionRequest.instrumentIds;
            }
            if ((i2 & 2) != 0) {
                str2 = positionRequest.ratios;
            }
            if ((i2 & 4) != 0) {
                str3 = positionRequest.strategyIds;
            }
            if ((i2 & 8) != 0) {
                str4 = positionRequest.types;
            }
            if ((i2 & 16) != 0) {
                uuid = positionRequest.aggregateOptionPositionId;
            }
            if ((i2 & 32) != 0) {
                i = positionRequest.numberOfLegs;
            }
            UUID uuid2 = uuid;
            int i3 = i;
            return positionRequest.copy(str, str2, str3, str4, uuid2, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstrumentIds() {
            return this.instrumentIds;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRatios() {
            return this.ratios;
        }

        /* renamed from: component3, reason: from getter */
        public final String getStrategyIds() {
            return this.strategyIds;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTypes() {
            return this.types;
        }

        /* renamed from: component5, reason: from getter */
        public final UUID getAggregateOptionPositionId() {
            return this.aggregateOptionPositionId;
        }

        /* renamed from: component6, reason: from getter */
        public final int getNumberOfLegs() {
            return this.numberOfLegs;
        }

        public final PositionRequest copy(String instrumentIds, String ratios, String strategyIds, String types, UUID aggregateOptionPositionId, int numberOfLegs) {
            Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
            Intrinsics.checkNotNullParameter(ratios, "ratios");
            Intrinsics.checkNotNullParameter(strategyIds, "strategyIds");
            Intrinsics.checkNotNullParameter(types, "types");
            Intrinsics.checkNotNullParameter(aggregateOptionPositionId, "aggregateOptionPositionId");
            return new PositionRequest(instrumentIds, ratios, strategyIds, types, aggregateOptionPositionId, numberOfLegs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PositionRequest)) {
                return false;
            }
            PositionRequest positionRequest = (PositionRequest) other;
            return Intrinsics.areEqual(this.instrumentIds, positionRequest.instrumentIds) && Intrinsics.areEqual(this.ratios, positionRequest.ratios) && Intrinsics.areEqual(this.strategyIds, positionRequest.strategyIds) && Intrinsics.areEqual(this.types, positionRequest.types) && Intrinsics.areEqual(this.aggregateOptionPositionId, positionRequest.aggregateOptionPositionId) && this.numberOfLegs == positionRequest.numberOfLegs;
        }

        public int hashCode() {
            return (((((((((this.instrumentIds.hashCode() * 31) + this.ratios.hashCode()) * 31) + this.strategyIds.hashCode()) * 31) + this.types.hashCode()) * 31) + this.aggregateOptionPositionId.hashCode()) * 31) + Integer.hashCode(this.numberOfLegs);
        }

        public String toString() {
            return "PositionRequest(instrumentIds=" + this.instrumentIds + ", ratios=" + this.ratios + ", strategyIds=" + this.strategyIds + ", types=" + this.types + ", aggregateOptionPositionId=" + this.aggregateOptionPositionId + ", numberOfLegs=" + this.numberOfLegs + ")";
        }

        public PositionRequest(String instrumentIds, String ratios, String strategyIds, String types, UUID aggregateOptionPositionId, int i) {
            Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
            Intrinsics.checkNotNullParameter(ratios, "ratios");
            Intrinsics.checkNotNullParameter(strategyIds, "strategyIds");
            Intrinsics.checkNotNullParameter(types, "types");
            Intrinsics.checkNotNullParameter(aggregateOptionPositionId, "aggregateOptionPositionId");
            this.instrumentIds = instrumentIds;
            this.ratios = ratios;
            this.strategyIds = strategyIds;
            this.types = types;
            this.aggregateOptionPositionId = aggregateOptionPositionId;
            this.numberOfLegs = i;
        }

        public final String getInstrumentIds() {
            return this.instrumentIds;
        }

        public final String getRatios() {
            return this.ratios;
        }

        public final String getStrategyIds() {
            return this.strategyIds;
        }

        public final String getTypes() {
            return this.types;
        }

        public final UUID getAggregateOptionPositionId() {
            return this.aggregateOptionPositionId;
        }

        public final int getNumberOfLegs() {
            return this.numberOfLegs;
        }

        @Override // java.lang.Comparable
        public int compareTo(PositionRequest other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return this.aggregateOptionPositionId.compareTo(other.aggregateOptionPositionId);
        }

        /* compiled from: AggregateOptionQuoteStore.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore$PositionRequest$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore$PositionRequest;", "position", "Lcom/robinhood/models/ui/UiAggregateOptionPosition;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final PositionRequest from(final UiAggregateOptionPosition position) {
                Intrinsics.checkNotNullParameter(position, "position");
                List<AggregateOptionPositionLeg> legs = position.getLegs();
                List<AggregateOptionPositionLeg> list = legs;
                return new PositionRequest(CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$PositionRequest$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AggregateOptionQuoteStore.PositionRequest.Companion.from$lambda$0((AggregateOptionPositionLeg) obj);
                    }
                }, 30, null), CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$PositionRequest$Companion$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AggregateOptionQuoteStore.PositionRequest.Companion.from$lambda$1((AggregateOptionPositionLeg) obj);
                    }
                }, 30, null), CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$PositionRequest$Companion$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AggregateOptionQuoteStore.PositionRequest.Companion.from$lambda$2(position, (AggregateOptionPositionLeg) obj);
                    }
                }, 30, null), CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$PositionRequest$Companion$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AggregateOptionQuoteStore.PositionRequest.Companion.from$lambda$3((AggregateOptionPositionLeg) obj);
                    }
                }, 30, null), position.getAggregateOptionPosition().getId(), legs.size());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final CharSequence from$lambda$0(AggregateOptionPositionLeg it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return OptionInstrument.INSTANCE.getPath(it.getOptionInstrumentId());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final CharSequence from$lambda$1(AggregateOptionPositionLeg leg) {
                Intrinsics.checkNotNullParameter(leg, "leg");
                String plainString = leg.getRatioQuantity().toPlainString();
                Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
                return plainString;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final CharSequence from$lambda$2(UiAggregateOptionPosition uiAggregateOptionPosition, AggregateOptionPositionLeg it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String string2 = uiAggregateOptionPosition.getAggregateOptionPosition().getId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                return string2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final CharSequence from$lambda$3(AggregateOptionPositionLeg leg) {
                Intrinsics.checkNotNullParameter(leg, "leg");
                return leg.getPositionType().getServerValue();
            }
        }
    }
}
