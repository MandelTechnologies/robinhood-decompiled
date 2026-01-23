package com.robinhood.android.event.detail;

import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: EventDetailContent.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailContentKt$EventDetailContent$1$1$1", m3645f = "EventDetailContent.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EventDetailContentKt$EventDetailContent$1$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Clock $clock;
    final /* synthetic */ SnapshotState<Instant> $now;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventDetailContentKt$EventDetailContent$1$1$1(SnapshotState<Instant> snapshotState, Clock clock, Continuation<? super EventDetailContentKt$EventDetailContent$1$1$1> continuation) {
        super(2, continuation);
        this.$now = snapshotState;
        this.$clock = clock;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EventDetailContentKt$EventDetailContent$1$1$1(this.$now, this.$clock, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EventDetailContentKt$EventDetailContent$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        do {
            this.$now.setValue(Instant.now(this.$clock));
            this.label = 1;
        } while (DelayKt.delay(100L, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
