package com.robinhood.android.engagement.goldevent;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import microgram.contracts.gold_live_event.proto.p490v1.EventService;
import microgram.contracts.gold_live_event.proto.p490v1.HandleUserDismissRequestDto;

/* compiled from: LiveEventStreamDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$onDismiss$1$1", m3645f = "LiveEventStreamDuxo.kt", m3646l = {330}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$onDismiss$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class LiveEventStreamDuxo5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LiveEventStreamDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LiveEventStreamDuxo5(LiveEventStreamDuxo liveEventStreamDuxo, Continuation<? super LiveEventStreamDuxo5> continuation) {
        super(2, continuation);
        this.this$0 = liveEventStreamDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiveEventStreamDuxo5(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiveEventStreamDuxo5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            EventService eventService = this.this$0.goldEventService;
            HandleUserDismissRequestDto handleUserDismissRequestDto = new HandleUserDismissRequestDto();
            this.label = 1;
            if (eventService.HandleUserDismiss(handleUserDismissRequestDto, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
