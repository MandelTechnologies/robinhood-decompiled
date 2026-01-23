package com.robinhood.librobinhood.data.store.bonfire.slip;

import com.robinhood.models.p320db.SlipHub;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.SharedFlow2;

/* compiled from: SlipHubStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/SlipHub;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.slip.SlipHubStore$endpoint$2", m3645f = "SlipHubStore.kt", m3646l = {24}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.slip.SlipHubStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class SlipHubStore3 extends ContinuationImpl7 implements Function2<SlipHub, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SlipHubStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlipHubStore3(SlipHubStore slipHubStore, Continuation<? super SlipHubStore3> continuation) {
        super(2, continuation);
        this.this$0 = slipHubStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SlipHubStore3 slipHubStore3 = new SlipHubStore3(this.this$0, continuation);
        slipHubStore3.L$0 = obj;
        return slipHubStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SlipHub slipHub, Continuation<? super Unit> continuation) {
        return ((SlipHubStore3) create(slipHub, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SlipHub slipHub = (SlipHub) this.L$0;
            SharedFlow2 sharedFlow2 = this.this$0.slipHubSharedFlow;
            this.label = 1;
            if (sharedFlow2.emit(slipHub, this) == coroutine_suspended) {
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
