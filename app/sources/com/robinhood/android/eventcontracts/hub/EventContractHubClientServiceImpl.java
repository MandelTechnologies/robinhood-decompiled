package com.robinhood.android.eventcontracts.hub;

import com.robinhood.android.models.event.p186db.arsenal.EventTopic;
import com.robinhood.android.models.event.p186db.arsenal.EventTopic3;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.store.event.EventTopicsStore;
import event_contract_hub.proto.p461v1.EventContractHubClientService;
import event_contract_hub.proto.p461v1.GetEventTopicsRequestDto;
import event_contract_hub.proto.p461v1.GetEventTopicsResponseDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: EventContractHubClientServiceImpl.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/EventContractHubClientServiceImpl;", "Levent_contract_hub/proto/v1/EventContractHubClientService;", "eventTopicsStore", "Lcom/robinhood/store/event/EventTopicsStore;", "<init>", "(Lcom/robinhood/store/event/EventTopicsStore;)V", "GetEventTopics", "Lkotlinx/coroutines/flow/Flow;", "Levent_contract_hub/proto/v1/GetEventTopicsResponseDto;", "request", "Levent_contract_hub/proto/v1/GetEventTopicsRequestDto;", "lib-event-contract-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EventContractHubClientServiceImpl implements EventContractHubClientService {
    private final EventTopicsStore eventTopicsStore;

    public Flow<Response<GetEventTopicsResponseDto>> GetEventTopics(Request<GetEventTopicsRequestDto> request) {
        return EventContractHubClientService.DefaultImpls.GetEventTopics(this, request);
    }

    public EventContractHubClientServiceImpl(EventTopicsStore eventTopicsStore) {
        Intrinsics.checkNotNullParameter(eventTopicsStore, "eventTopicsStore");
        this.eventTopicsStore = eventTopicsStore;
    }

    @Override // event_contract_hub.proto.p461v1.EventContractHubClientService
    public Flow<GetEventTopicsResponseDto> GetEventTopics(GetEventTopicsRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        final Flow<List<EventTopic>> flowStreamEventTopicsListByLocation = this.eventTopicsStore.streamEventTopicsListByLocation(EventTopic3.EVENT_TOPIC_LOCATION_HUB);
        final Flow<List<? extends EventTopic>> flow = new Flow<List<? extends EventTopic>>() { // from class: com.robinhood.android.eventcontracts.hub.EventContractHubClientServiceImpl$GetEventTopics$$inlined$filter$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.eventcontracts.hub.EventContractHubClientServiceImpl$GetEventTopics$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.EventContractHubClientServiceImpl$GetEventTopics$$inlined$filter$1$2", m3645f = "EventContractHubClientServiceImpl.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.eventcontracts.hub.EventContractHubClientServiceImpl$GetEventTopics$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
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
                        if (!((List) obj).isEmpty()) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends EventTopic>> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamEventTopicsListByLocation.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        return new Flow<GetEventTopicsResponseDto>() { // from class: com.robinhood.android.eventcontracts.hub.EventContractHubClientServiceImpl$GetEventTopics$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.eventcontracts.hub.EventContractHubClientServiceImpl$GetEventTopics$$inlined$map$1$2 */
            public static final class C165262<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.EventContractHubClientServiceImpl$GetEventTopics$$inlined$map$1$2", m3645f = "EventContractHubClientServiceImpl.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.eventcontracts.hub.EventContractHubClientServiceImpl$GetEventTopics$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C165262.this.emit(null, this);
                    }
                }

                public C165262(FlowCollector flowCollector) {
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
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        int i3 = 0;
                        for (T t : list) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            arrayList.add(EventTopicDtoMapper.toIdlEventTopic((EventTopic) t, i3));
                            i3 = i4;
                        }
                        GetEventTopicsResponseDto getEventTopicsResponseDto = new GetEventTopicsResponseDto(arrayList);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(getEventTopicsResponseDto, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super GetEventTopicsResponseDto> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C165262(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
