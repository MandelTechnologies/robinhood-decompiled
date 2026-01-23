package com.robinhood.android.eventcontracts.sharedeventui.wavebackground;

import androidx.compose.runtime.SnapshotFloatState2;
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

/* compiled from: WavyRenderEffect.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.sharedeventui.wavebackground.WavyRenderEffectKt$wavyRenderEffect$1$1$1", m3645f = "WavyRenderEffect.kt", m3646l = {48}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.wavebackground.WavyRenderEffectKt$wavyRenderEffect$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class WavyRenderEffect2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotFloatState2 $timeMs;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WavyRenderEffect2(SnapshotFloatState2 snapshotFloatState2, Continuation<? super WavyRenderEffect2> continuation) {
        super(2, continuation);
        this.$timeMs = snapshotFloatState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WavyRenderEffect2(this.$timeMs, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WavyRenderEffect2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            this.$timeMs.setFloatValue((System.currentTimeMillis() % 100000) / 1000.0f);
            this.label = 1;
        } while (DelayKt.delay(10L, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
