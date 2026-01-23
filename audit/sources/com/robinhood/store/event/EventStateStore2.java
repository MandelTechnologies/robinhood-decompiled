package com.robinhood.store.event;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.prediction_markets.proto.p361v1.idl.GetEventStateRequestDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.GetEventStateResponseDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService;
import com.robinhood.store.util.PredictionMarketsRequestHeaderDelegate2;
import com.robinhood.utils.extensions.Uuids;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EventStateStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventStateResponseDto;", "uuids", "", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventStateStore$getEventStateEndpoint$1", m3645f = "EventStateStore.kt", m3646l = {54, 49}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.store.event.EventStateStore$getEventStateEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class EventStateStore2 extends ContinuationImpl7 implements Function2<List<? extends UUID>, Continuation<? super Response<? extends GetEventStateResponseDto>>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ EventStateStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventStateStore2(EventStateStore eventStateStore, Continuation<? super EventStateStore2> continuation) {
        super(2, continuation);
        this.this$0 = eventStateStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventStateStore2 eventStateStore2 = new EventStateStore2(this.this$0, continuation);
        eventStateStore2.L$0 = obj;
        return eventStateStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends UUID> list, Continuation<? super Response<? extends GetEventStateResponseDto>> continuation) {
        return invoke2((List<UUID>) list, (Continuation<? super Response<GetEventStateResponseDto>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<UUID> list, Continuation<? super Response<GetEventStateResponseDto>> continuation) {
        return ((EventStateStore2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        if (r9 == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        GetEventStateRequestDto getEventStateRequestDto;
        LayoutService layoutService;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            if (!list.isEmpty()) {
                LayoutService layoutService2 = this.this$0.layoutService;
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Uuids.safeToString((UUID) it.next()));
                }
                GetEventStateRequestDto getEventStateRequestDto2 = new GetEventStateRequestDto(arrayList);
                PredictionMarketsRequestHeaderDelegate2 predictionMarketsRequestHeaderDelegate2 = this.this$0.requestHeaderPlugin;
                this.L$0 = layoutService2;
                this.L$1 = getEventStateRequestDto2;
                this.label = 1;
                Object objBuildRequestHeader = predictionMarketsRequestHeaderDelegate2.buildRequestHeader(this);
                if (objBuildRequestHeader != coroutine_suspended) {
                    getEventStateRequestDto = getEventStateRequestDto2;
                    obj = objBuildRequestHeader;
                    layoutService = layoutService2;
                }
                return coroutine_suspended;
            }
            return new Response(new GetEventStateResponseDto(null, 1, null), null, 2, null);
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return (Response) obj;
        }
        getEventStateRequestDto = (GetEventStateRequestDto) this.L$1;
        layoutService = (LayoutService) this.L$0;
        ResultKt.throwOnFailure(obj);
        Request<GetEventStateRequestDto> request = new Request<>(getEventStateRequestDto, (Map) obj);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj = layoutService.GetEventState(request, this);
    }
}
