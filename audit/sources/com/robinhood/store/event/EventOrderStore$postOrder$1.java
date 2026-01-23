package com.robinhood.store.event;

import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.CreateEventContractOrderRequestDto;
import com.robinhood.ceres.p284v1.FuturesOrderDto;
import com.robinhood.store.futures.extensions.HttpExceptions;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import retrofit2.HttpException;

/* compiled from: EventOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/ceres/v1/FuturesOrderDto;", "request", "Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventOrderStore$postOrder$1", m3645f = "EventOrderStore.kt", m3646l = {91}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class EventOrderStore$postOrder$1 extends ContinuationImpl7 implements Function2<CreateEventContractOrderRequestDto, Continuation<? super FuturesOrderDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventOrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventOrderStore$postOrder$1(EventOrderStore eventOrderStore, Continuation<? super EventOrderStore$postOrder$1> continuation) {
        super(2, continuation);
        this.this$0 = eventOrderStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventOrderStore$postOrder$1 eventOrderStore$postOrder$1 = new EventOrderStore$postOrder$1(this.this$0, continuation);
        eventOrderStore$postOrder$1.L$0 = obj;
        return eventOrderStore$postOrder$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CreateEventContractOrderRequestDto createEventContractOrderRequestDto, Continuation<? super FuturesOrderDto> continuation) {
        return ((EventOrderStore$postOrder$1) create(createEventContractOrderRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CreateEventContractOrderRequestDto createEventContractOrderRequestDto = (CreateEventContractOrderRequestDto) this.L$0;
                Ceres ceres = this.this$0.ceres;
                this.label = 1;
                obj = ceres.CreateEventContractOrder(createEventContractOrderRequestDto, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (FuturesOrderDto) obj;
        } catch (HttpException e) {
            throw HttpExceptions.convertToStandardErrorIfPossible(e);
        }
    }
}
