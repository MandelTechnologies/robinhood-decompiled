package com.robinhood.store.event;

import com.robinhood.android.models.event.p186db.arsenal.EventContract2;
import com.robinhood.android.models.event.p186db.predictionmarkets.EventContract3;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Response;
import com.robinhood.prediction_markets.proto.p361v1.idl.EventContractDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.ListEventContractsResponseDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
@DebugMetadata(m3644c = "com.robinhood.store.event.EventStore$special$$inlined$createExperimentBasedEndpoint$default$4", m3645f = "EventStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.store.event.EventStore$special$$inlined$createExperimentBasedEndpoint$default$4 */
/* loaded from: classes12.dex */
public final class C41400xc410f9a7 extends ContinuationImpl7 implements Function2<Response<? extends Dto3<?>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41400xc410f9a7(Continuation continuation, EventStore eventStore) {
        super(2, continuation);
        this.this$0 = eventStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C41400xc410f9a7 c41400xc410f9a7 = new C41400xc410f9a7(continuation, this.this$0);
        c41400xc410f9a7.L$0 = obj;
        return c41400xc410f9a7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Response<? extends Dto3<?>> response, Continuation<? super Unit> continuation) {
        return ((C41400xc410f9a7) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Dto3 dto3 = (Dto3) ((Response) this.L$0).getData();
        if (dto3 instanceof ListEventContractsResponseDto) {
            List<EventContractDto> results = ((ListEventContractsResponseDto) dto3).getResults();
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
            Iterator<T> it = results.iterator();
            while (it.hasNext()) {
                arrayList.add(EventContract3.toDbModel((EventContractDto) it.next()));
            }
        } else if (dto3 instanceof com.robinhood.arsenal.proto.p281v1.idl.ListEventContractsResponseDto) {
            List<com.robinhood.arsenal.proto.p281v1.idl.EventContractDto> results2 = ((com.robinhood.arsenal.proto.p281v1.idl.ListEventContractsResponseDto) dto3).getResults();
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results2, 10));
            Iterator<T> it2 = results2.iterator();
            while (it2.hasNext()) {
                arrayList.add(EventContract2.toDbModel((com.robinhood.arsenal.proto.p281v1.idl.EventContractDto) it2.next()));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.this$0.eventContractDao.insert(arrayList, this.this$0.eventToContractDao);
        }
        return Unit.INSTANCE;
    }
}
