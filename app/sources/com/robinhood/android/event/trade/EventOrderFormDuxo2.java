package com.robinhood.android.event.trade;

import com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EventOrderFormDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboRequestAmount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$9$2$2", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$9$2$2, reason: use source file name */
/* loaded from: classes3.dex */
final class EventOrderFormDuxo2 extends ContinuationImpl7 implements Function2<StreamComboQuoteUseCase4, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ EventOrderFormDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventOrderFormDuxo2(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super EventOrderFormDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = eventOrderFormDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EventOrderFormDuxo2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(StreamComboQuoteUseCase4 streamComboQuoteUseCase4, Continuation<? super Unit> continuation) {
        return ((EventOrderFormDuxo2) create(streamComboQuoteUseCase4, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new C164521(null));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* compiled from: EventOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$9$2$2$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$9$2$2$1 */
    static final class C164521 extends ContinuationImpl7 implements Function2<EventOrderFormDataState, Continuation<? super EventOrderFormDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C164521(Continuation<? super C164521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C164521 c164521 = new C164521(continuation);
            c164521.L$0 = obj;
            return c164521;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EventOrderFormDataState eventOrderFormDataState, Continuation<? super EventOrderFormDataState> continuation) {
            return ((C164521) create(eventOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EventOrderFormDataState.copy$default((EventOrderFormDataState) this.L$0, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 1071644671, null);
        }
    }
}
