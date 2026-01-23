package com.robinhood.android.event.gamedetail;

import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: GameDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Ljava/util/UUID;", "it", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$eventIdFlow$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes3.dex */
final class GameDetailDuxo$onCreate$1$eventIdFlow$1 extends ContinuationImpl7 implements Function2<EventContract, Continuation<? super UUID>, Object> {
    /* synthetic */ Object L$0;
    int label;

    GameDetailDuxo$onCreate$1$eventIdFlow$1(Continuation<? super GameDetailDuxo$onCreate$1$eventIdFlow$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GameDetailDuxo$onCreate$1$eventIdFlow$1 gameDetailDuxo$onCreate$1$eventIdFlow$1 = new GameDetailDuxo$onCreate$1$eventIdFlow$1(continuation);
        gameDetailDuxo$onCreate$1$eventIdFlow$1.L$0 = obj;
        return gameDetailDuxo$onCreate$1$eventIdFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EventContract eventContract, Continuation<? super UUID> continuation) {
        return ((GameDetailDuxo$onCreate$1$eventIdFlow$1) create(eventContract, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        EventContract eventContract = (EventContract) this.L$0;
        UUID parentEventId = eventContract.getParentEventId();
        return parentEventId == null ? eventContract.getEventId() : parentEventId;
    }
}
