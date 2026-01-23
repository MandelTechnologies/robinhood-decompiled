package com.robinhood.store.event;

import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.arsenal.EventContract2;
import com.robinhood.android.models.event.p186db.predictionmarkets.EventContract3;
import com.robinhood.arsenal.proto.p281v1.idl.EventContractDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Response;
import com.robinhood.prediction_markets.proto.p361v1.idl.GetEventContractResponseDto;
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

/* compiled from: EventStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\n¨\u0006\u0005"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/MessageDto;", "com/robinhood/store/event/EventStore$createExperimentBasedEndpoint$2"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventStore$special$$inlined$createExperimentBasedEndpoint$default$2", m3645f = "EventStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.store.event.EventStore$special$$inlined$createExperimentBasedEndpoint$default$2 */
/* loaded from: classes12.dex */
public final class C41398xc410f9a5 extends ContinuationImpl7 implements Function2<Response<? extends Dto3<?>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41398xc410f9a5(Continuation continuation, EventStore eventStore) {
        super(2, continuation);
        this.this$0 = eventStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C41398xc410f9a5 c41398xc410f9a5 = new C41398xc410f9a5(continuation, this.this$0);
        c41398xc410f9a5.L$0 = obj;
        return c41398xc410f9a5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Response<? extends Dto3<?>> response, Continuation<? super Unit> continuation) {
        return ((C41398xc410f9a5) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Dto3 dto3 = (Dto3) ((Response) this.L$0).getData();
        EventContract dbModel = null;
        if (!(dto3 instanceof GetEventContractResponseDto)) {
            if (dto3 instanceof EventContractDto) {
                dbModel = EventContract2.toDbModel((EventContractDto) dto3);
            }
        } else {
            com.robinhood.prediction_markets.proto.p361v1.idl.EventContractDto event_contract = ((GetEventContractResponseDto) dto3).getEvent_contract();
            if (event_contract != null) {
                dbModel = EventContract3.toDbModel(event_contract);
            }
        }
        if (dbModel != null) {
            this.this$0.eventContractDao.insert(CollectionsKt.listOf(dbModel), this.this$0.eventToContractDao);
        }
        return Unit.INSTANCE;
    }
}
