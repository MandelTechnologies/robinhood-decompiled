package com.robinhood.store.event;

import com.robinhood.idl.Dto3;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.prediction_markets.proto.p361v1.idl.GetEventRequestDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService;
import com.robinhood.store.util.PredictionMarketsRequestHeaderDelegate2;
import com.robinhood.utils.extensions.Uuids;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: EventStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/MessageDto;", "Params", "", "params", "com/robinhood/store/event/EventStore$createExperimentBasedEndpoint$1"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventStore$special$$inlined$createExperimentBasedEndpoint$default$9", m3645f = "EventStore.kt", m3646l = {570, 580, 582, 576, 585}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.store.event.EventStore$special$$inlined$createExperimentBasedEndpoint$default$9 */
/* loaded from: classes12.dex */
public final class C41405xc410f9ac extends ContinuationImpl7 implements Function2<UUID, Continuation<? super Response<? extends Dto3<?>>>, Object> {
    int I$0;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ EventStore this$0;
    final /* synthetic */ EventStore this$0$inline_fun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41405xc410f9ac(EventStore eventStore, Continuation continuation, EventStore eventStore2, EventStore eventStore3) {
        super(2, continuation);
        this.this$0$inline_fun = eventStore;
        this.this$0 = eventStore2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventStore eventStore = this.this$0$inline_fun;
        EventStore eventStore2 = this.this$0;
        C41405xc410f9ac c41405xc410f9ac = new C41405xc410f9ac(eventStore, continuation, eventStore2, eventStore2);
        c41405xc410f9ac.L$0 = obj;
        return c41405xc410f9ac;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super Response<? extends Dto3<?>>> continuation) {
        return ((C41405xc410f9ac) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
    
        if (r2 != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fb, code lost:
    
        if (r2 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6 A[PHI: r2 r3 r10
      0x00c6: PHI (r2v10 com.robinhood.prediction_markets.proto.v1.idl.InstrumentService) = 
      (r2v9 com.robinhood.prediction_markets.proto.v1.idl.InstrumentService)
      (r2v20 com.robinhood.prediction_markets.proto.v1.idl.InstrumentService)
     binds: [B:30:0x00c3, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r3v6 java.lang.Object) = (r3v5 java.lang.Object), (r3v10 java.lang.Object) binds: [B:30:0x00c3, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r10v7 com.robinhood.prediction_markets.proto.v1.idl.GetEventRequestDto) = 
      (r10v6 com.robinhood.prediction_markets.proto.v1.idl.GetEventRequestDto)
      (r10v9 com.robinhood.prediction_markets.proto.v1.idl.GetEventRequestDto)
     binds: [B:30:0x00c3, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object objFirstOrNull;
        Object objGetEvent;
        Object objIsInGdpExperimentEnabled;
        String str;
        InstrumentService instrumentService;
        int i;
        GetEventRequestDto getEventRequestDto;
        Object objBuildRequestHeader;
        Object objGetEvent2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            obj2 = this.L$0;
            Flow flow = this.this$0$inline_fun.shouldUseBffEndpoints;
            this.L$0 = obj2;
            this.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flow, this);
            if (objFirstOrNull != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            obj2 = this.L$0;
            ResultKt.throwOnFailure(obj);
            objFirstOrNull = obj;
        } else {
            if (i2 == 2) {
                int i3 = this.I$0;
                InstrumentService instrumentService2 = (InstrumentService) this.L$1;
                String str2 = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                i = i3;
                instrumentService = instrumentService2;
                str = str2;
                objIsInGdpExperimentEnabled = obj;
                getEventRequestDto = new GetEventRequestDto(str, i == 0, ((Boolean) objIsInGdpExperimentEnabled).booleanValue(), null, 10, null);
                PredictionMarketsRequestHeaderDelegate2 predictionMarketsRequestHeaderDelegate2 = this.this$0.requestHeaderPlugin;
                this.L$0 = getEventRequestDto;
                this.L$1 = instrumentService;
                this.label = 3;
                objBuildRequestHeader = predictionMarketsRequestHeaderDelegate2.buildRequestHeader(this);
                if (objBuildRequestHeader != coroutine_suspended) {
                    Request<GetEventRequestDto> request = new Request<>(getEventRequestDto, (Map) objBuildRequestHeader);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 4;
                    objGetEvent2 = instrumentService.GetEvent(request, this);
                }
                return coroutine_suspended;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    ResultKt.throwOnFailure(obj);
                    objGetEvent2 = obj;
                    return (Response) objGetEvent2;
                }
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objGetEvent = obj;
                return (Response) objGetEvent;
            }
            instrumentService = (InstrumentService) this.L$1;
            GetEventRequestDto getEventRequestDto2 = (GetEventRequestDto) this.L$0;
            ResultKt.throwOnFailure(obj);
            getEventRequestDto = getEventRequestDto2;
            objBuildRequestHeader = obj;
            Request<GetEventRequestDto> request2 = new Request<>(getEventRequestDto, (Map) objBuildRequestHeader);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 4;
            objGetEvent2 = instrumentService.GetEvent(request2, this);
        }
        if (Intrinsics.areEqual(objFirstOrNull, boxing.boxBoolean(true))) {
            InstrumentService instrumentService3 = this.this$0.predictionMarketsInstrumentService;
            String strSafeToString = Uuids.safeToString((UUID) obj2);
            EventStore eventStore = this.this$0;
            this.L$0 = strSafeToString;
            this.L$1 = instrumentService3;
            this.I$0 = 0;
            this.label = 2;
            objIsInGdpExperimentEnabled = eventStore.isInGdpExperimentEnabled(this);
            if (objIsInGdpExperimentEnabled != coroutine_suspended) {
                str = strSafeToString;
                instrumentService = instrumentService3;
                i = 0;
                getEventRequestDto = new GetEventRequestDto(str, i == 0, ((Boolean) objIsInGdpExperimentEnabled).booleanValue(), null, 10, null);
                PredictionMarketsRequestHeaderDelegate2 predictionMarketsRequestHeaderDelegate22 = this.this$0.requestHeaderPlugin;
                this.L$0 = getEventRequestDto;
                this.L$1 = instrumentService;
                this.label = 3;
                objBuildRequestHeader = predictionMarketsRequestHeaderDelegate22.buildRequestHeader(this);
                if (objBuildRequestHeader != coroutine_suspended) {
                }
            }
        } else {
            com.robinhood.arsenal.proto.p281v1.idl.InstrumentService instrumentService4 = this.this$0.instrumentService;
            Request<com.robinhood.arsenal.proto.p281v1.idl.GetEventRequestDto> request3 = new Request<>(new com.robinhood.arsenal.proto.p281v1.idl.GetEventRequestDto(Uuids.safeToString((UUID) obj2)), null, 2, null);
            this.L$0 = null;
            this.label = 5;
            objGetEvent = instrumentService4.GetEvent(request3, this);
        }
        return coroutine_suspended;
    }
}
