package com.robinhood.store.event;

import com.robinhood.prediction_markets.proto.p361v1.combo.ComboService;
import com.robinhood.prediction_markets.proto.p361v1.combo.CreateComboRFQRequestDto;
import com.robinhood.prediction_markets.proto.p361v1.combo.CreateComboRFQResponseDto;
import com.robinhood.store.event.RfqResult;
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

/* compiled from: EventComboStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/store/event/RfqResult;", "it", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventComboStore$getRfq$1", m3645f = "EventComboStore.kt", m3646l = {47}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class EventComboStore$getRfq$1 extends ContinuationImpl7 implements Function2<CreateComboRFQRequestDto, Continuation<? super RfqResult>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventComboStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventComboStore$getRfq$1(EventComboStore eventComboStore, Continuation<? super EventComboStore$getRfq$1> continuation) {
        super(2, continuation);
        this.this$0 = eventComboStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventComboStore$getRfq$1 eventComboStore$getRfq$1 = new EventComboStore$getRfq$1(this.this$0, continuation);
        eventComboStore$getRfq$1.L$0 = obj;
        return eventComboStore$getRfq$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CreateComboRFQRequestDto createComboRFQRequestDto, Continuation<? super RfqResult> continuation) {
        return ((EventComboStore$getRfq$1) create(createComboRFQRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String strM26462constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CreateComboRFQRequestDto createComboRFQRequestDto = (CreateComboRFQRequestDto) this.L$0;
                ComboService comboService = this.this$0.comboService;
                this.label = 1;
                obj = comboService.CreateComboRFQ(createComboRFQRequestDto, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return EventComboStoreKt.toUiModel((CreateComboRFQResponseDto) obj);
        } catch (HttpException e) {
            if (e.code() == 400) {
                strM26462constructorimpl = RfqResult.RfqError.m26462constructorimpl(HttpExceptions.extractErrorMessage(e));
            } else {
                strM26462constructorimpl = RfqResult.RfqError.m26462constructorimpl(null);
            }
            return RfqResult.RfqError.m26461boximpl(strM26462constructorimpl);
        }
    }
}
