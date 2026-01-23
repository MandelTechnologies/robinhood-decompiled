package com.robinhood.android.event.detail.duel;

import com.robinhood.android.event.detail.builders.ContractListData;
import com.robinhood.android.event.detail.p129ui.bottomsheets.EventDetailDisplayDataBottomSheet;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.arsenal.EventViewMode;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.order.UiEventOrder;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.store.event.EventContractPositionStore;
import com.robinhood.store.event.EventMarketdataStore;
import com.robinhood.store.event.EventOrderStore;
import com.robinhood.store.event.EventStore;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.utils.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: StreamContractListUseCase.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJU\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0014\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00100\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013H\u0086\u0002Jn\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020 0\u001c2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\"0\u001c2\u0006\u0010#\u001a\u00020\u00182\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00100\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/event/detail/duel/StreamContractListUseCase;", "", "eventStore", "Lcom/robinhood/store/event/EventStore;", "eventMarketdataStore", "Lcom/robinhood/store/event/EventMarketdataStore;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "eventContractPositionStore", "Lcom/robinhood/store/event/EventContractPositionStore;", "eventOrderStore", "Lcom/robinhood/store/event/EventOrderStore;", "<init>", "(Lcom/robinhood/store/event/EventStore;Lcom/robinhood/store/event/EventMarketdataStore;Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/store/event/EventContractPositionStore;Lcom/robinhood/store/event/EventOrderStore;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/android/event/detail/builders/ContractListData;", "eventId", "Ljava/util/UUID;", "viewMode", "Lcom/robinhood/android/models/event/db/arsenal/EventViewMode;", "existingOrderContractIdsFlow", "displayModeFlow", "Lcom/robinhood/android/event/detail/ui/bottomsheets/EventDetailContractDisplayMode;", "defaultSelectedContractId", "buildPairContractListData", "orderedContracts", "", "", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "quotes", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "positions", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "displayMode", "pendingOrdersByContractId", "Lcom/robinhood/android/models/event/db/order/UiEventOrder;", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class StreamContractListUseCase {
    public static final int $stable = 8;
    private final EventContractPositionStore eventContractPositionStore;
    private final EventMarketdataStore eventMarketdataStore;
    private final EventOrderStore eventOrderStore;
    private final EventStore eventStore;
    private final FuturesAccountStore futuresAccountStore;

    public StreamContractListUseCase(EventStore eventStore, EventMarketdataStore eventMarketdataStore, FuturesAccountStore futuresAccountStore, EventContractPositionStore eventContractPositionStore, EventOrderStore eventOrderStore) {
        Intrinsics.checkNotNullParameter(eventStore, "eventStore");
        Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(eventContractPositionStore, "eventContractPositionStore");
        Intrinsics.checkNotNullParameter(eventOrderStore, "eventOrderStore");
        this.eventStore = eventStore;
        this.eventMarketdataStore = eventMarketdataStore;
        this.futuresAccountStore = futuresAccountStore;
        this.eventContractPositionStore = eventContractPositionStore;
        this.eventOrderStore = eventOrderStore;
    }

    public final Flow<List<ContractListData>> invoke(UUID eventId, EventViewMode viewMode, Flow<? extends List<UUID>> existingOrderContractIdsFlow, Flow<? extends EventDetailDisplayDataBottomSheet> displayModeFlow, UUID defaultSelectedContractId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(viewMode, "viewMode");
        Intrinsics.checkNotNullParameter(existingOrderContractIdsFlow, "existingOrderContractIdsFlow");
        Intrinsics.checkNotNullParameter(displayModeFlow, "displayModeFlow");
        final Flow<UiEcEvent> flowStreamEvent = this.eventStore.streamEvent(eventId);
        Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<List<? extends UUID>>() { // from class: com.robinhood.android.event.detail.duel.StreamContractListUseCase$invoke$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.event.detail.duel.StreamContractListUseCase$invoke$$inlined$map$1$2 */
            public static final class C161832<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.duel.StreamContractListUseCase$invoke$$inlined$map$1$2", m3645f = "StreamContractListUseCase.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.event.detail.duel.StreamContractListUseCase$invoke$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C161832.this.emit(null, this);
                    }
                }

                public C161832(FlowCollector flowCollector) {
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
                        Collection<EventContract> collectionValues = ((UiEcEvent) obj).getOrderedContracts().values();
                        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                        Collection<EventContract> collection = collectionValues;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
                        Iterator<T> it = collection.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((EventContract) it.next()).getContractId());
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends UUID>> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamEvent.collect(new C161832(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), new StreamContractListUseCase$invoke$$inlined$flatMapLatest$1(null, this));
        final Flow flowTransformLatest2 = FlowKt.transformLatest(this.futuresAccountStore.streamRhsAccountNumberWithFuturesAccountAllowed(), new StreamContractListUseCase$invoke$$inlined$flatMapLatest$2(null, this));
        Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<FuturesAccount>() { // from class: com.robinhood.android.event.detail.duel.StreamContractListUseCase$invoke$$inlined$map$2

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.event.detail.duel.StreamContractListUseCase$invoke$$inlined$map$2$2 */
            public static final class C161842<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.duel.StreamContractListUseCase$invoke$$inlined$map$2$2", m3645f = "StreamContractListUseCase.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.event.detail.duel.StreamContractListUseCase$invoke$$inlined$map$2$2$1, reason: invalid class name */
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
                        return C161842.this.emit(null, this);
                    }
                }

                public C161842(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                        Object orNull = ((Optional) obj).getOrNull();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(orNull, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super FuturesAccount> flowCollector, Continuation continuation) {
                Object objCollect = flowTransformLatest2.collect(new C161842(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
        return FlowKt.combine(flowStreamEvent, FlowKt.combine(flowTransformLatest, FlowKt.transformLatest(flowDistinctUntilChanged, new StreamContractListUseCase$invoke$$inlined$flatMapLatest$3(null, this)), FlowKt.transformLatest(flowDistinctUntilChanged, new StreamContractListUseCase$invoke$$inlined$flatMapLatest$4(null, this, eventId)), new StreamContractListUseCase2(null)), existingOrderContractIdsFlow, displayModeFlow, new C161861(viewMode, this, null));
    }

    /* compiled from: StreamContractListUseCase.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042B\u0010\u0005\u001a>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00010\u00070\u00062\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u000eH\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/event/detail/builders/ContractListData;", "event", "Lcom/robinhood/android/models/event/ui/UiEcEvent;", "<destruct>", "Lkotlin/Triple;", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "Lcom/robinhood/android/models/event/db/order/UiEventOrder;", "currentList", "displayMode", "Lcom/robinhood/android/event/detail/ui/bottomsheets/EventDetailContractDisplayMode;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.detail.duel.StreamContractListUseCase$invoke$1", m3645f = "StreamContractListUseCase.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.detail.duel.StreamContractListUseCase$invoke$1 */
    static final class C161861 extends ContinuationImpl7 implements Function5<UiEcEvent, Tuples3<? extends Map<UUID, ? extends EventQuote>, ? extends Map<UUID, ? extends UiEventContractPosition>, ? extends Map<UUID, ? extends List<? extends UiEventOrder>>>, List<? extends UUID>, EventDetailDisplayDataBottomSheet, Continuation<? super List<? extends ContractListData>>, Object> {
        final /* synthetic */ EventViewMode $viewMode;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        /* synthetic */ Object L$3;
        int label;
        final /* synthetic */ StreamContractListUseCase this$0;

        /* compiled from: StreamContractListUseCase.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.event.detail.duel.StreamContractListUseCase$invoke$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EventViewMode.values().length];
                try {
                    iArr[EventViewMode.MULTI.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EventViewMode.PAIR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EventViewMode.UNSPECIFIED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C161861(EventViewMode eventViewMode, StreamContractListUseCase streamContractListUseCase, Continuation<? super C161861> continuation) {
            super(5, continuation);
            this.$viewMode = eventViewMode;
            this.this$0 = streamContractListUseCase;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(UiEcEvent uiEcEvent, Tuples3<? extends Map<UUID, EventQuote>, ? extends Map<UUID, UiEventContractPosition>, ? extends Map<UUID, ? extends List<UiEventOrder>>> tuples3, List<UUID> list, EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet, Continuation<? super List<ContractListData>> continuation) {
            C161861 c161861 = new C161861(this.$viewMode, this.this$0, continuation);
            c161861.L$0 = uiEcEvent;
            c161861.L$1 = tuples3;
            c161861.L$2 = list;
            c161861.L$3 = eventDetailDisplayDataBottomSheet;
            return c161861.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Object invoke(UiEcEvent uiEcEvent, Tuples3<? extends Map<UUID, ? extends EventQuote>, ? extends Map<UUID, ? extends UiEventContractPosition>, ? extends Map<UUID, ? extends List<? extends UiEventOrder>>> tuples3, List<? extends UUID> list, EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet, Continuation<? super List<? extends ContractListData>> continuation) {
            return invoke2(uiEcEvent, (Tuples3<? extends Map<UUID, EventQuote>, ? extends Map<UUID, UiEventContractPosition>, ? extends Map<UUID, ? extends List<UiEventOrder>>>) tuples3, (List<UUID>) list, eventDetailDisplayDataBottomSheet, (Continuation<? super List<ContractListData>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UiEcEvent uiEcEvent = (UiEcEvent) this.L$0;
            Tuples3 tuples3 = (Tuples3) this.L$1;
            List list = (List) this.L$2;
            EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet = (EventDetailDisplayDataBottomSheet) this.L$3;
            Map map = (Map) tuples3.component1();
            Map map2 = (Map) tuples3.component2();
            Map map3 = (Map) tuples3.component3();
            int i = WhenMappings.$EnumSwitchMapping$0[this.$viewMode.ordinal()];
            if (i == 1) {
                Collection<EventContract> collectionValues = uiEcEvent.getOrderedContracts().values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                return StreamContractListUseCase3.buildMultiContractListData(CollectionsKt.toList(collectionValues), map2, map, list, eventDetailDisplayDataBottomSheet, null, map3);
            }
            if (i == 2) {
                return this.this$0.buildPairContractListData(uiEcEvent.getOrderedContracts(), map, map2, eventDetailDisplayDataBottomSheet, map3);
            }
            if (i == 3) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ContractListData> buildPairContractListData(Map<Integer, EventContract> orderedContracts, Map<UUID, EventQuote> quotes, Map<UUID, UiEventContractPosition> positions, EventDetailDisplayDataBottomSheet displayMode, Map<UUID, ? extends List<UiEventOrder>> pendingOrdersByContractId) {
        List list = CollectionsKt.toList(orderedContracts.keySet());
        Integer num = (Integer) CollectionsKt.getOrNull(list, 0);
        if (num != null) {
            int iIntValue = num.intValue();
            Integer num2 = (Integer) CollectionsKt.getOrNull(list, 1);
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                if ((iIntValue < 0 && iIntValue2 < 0) || (iIntValue >= 0 && iIntValue2 >= 0)) {
                    Collection<EventContract> collectionValues = orderedContracts.values();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues, 10));
                    for (EventContract eventContract : collectionValues) {
                        UiEventContractPosition uiEventContractPosition = positions.get(eventContract.getContractId());
                        EventQuote eventQuote = quotes.get(eventContract.getContractId());
                        List<UiEventOrder> listEmptyList = pendingOrdersByContractId.get(eventContract.getContractId());
                        if (listEmptyList == null) {
                            listEmptyList = CollectionsKt.emptyList();
                        }
                        EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet = displayMode;
                        arrayList.add(new ContractListData(eventContract, uiEventContractPosition, eventQuote, eventDetailDisplayDataBottomSheet, listEmptyList));
                        displayMode = eventDetailDisplayDataBottomSheet;
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }
}
