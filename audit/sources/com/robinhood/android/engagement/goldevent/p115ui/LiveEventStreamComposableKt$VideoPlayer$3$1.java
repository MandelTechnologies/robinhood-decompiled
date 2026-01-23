package com.robinhood.android.engagement.goldevent.p115ui;

import androidx.compose.runtime.SnapshotLongState2;
import androidx.compose.runtime.SnapshotState;
import androidx.media3.exoplayer.ExoPlayer;
import com.robinhood.android.engagement.goldevent.StreamingUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: LiveEventStreamComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$VideoPlayer$3$1", m3645f = "LiveEventStreamComposable.kt", m3646l = {316}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class LiveEventStreamComposableKt$VideoPlayer$3$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotLongState2 $currentPosition$delegate;
    final /* synthetic */ SnapshotLongState2 $duration$delegate;
    final /* synthetic */ SnapshotLongState2 $dvrWindowSize$delegate;
    final /* synthetic */ ExoPlayer $exoPlayer;
    final /* synthetic */ SnapshotState<Boolean> $isEventLive$delegate;
    final /* synthetic */ SnapshotLongState2 $timeBehindLive$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LiveEventStreamComposableKt$VideoPlayer$3$1(ExoPlayer exoPlayer, SnapshotLongState2 snapshotLongState2, SnapshotLongState2 snapshotLongState22, SnapshotState<Boolean> snapshotState, SnapshotLongState2 snapshotLongState23, SnapshotLongState2 snapshotLongState24, Continuation<? super LiveEventStreamComposableKt$VideoPlayer$3$1> continuation) {
        super(2, continuation);
        this.$exoPlayer = exoPlayer;
        this.$currentPosition$delegate = snapshotLongState2;
        this.$duration$delegate = snapshotLongState22;
        this.$isEventLive$delegate = snapshotState;
        this.$dvrWindowSize$delegate = snapshotLongState23;
        this.$timeBehindLive$delegate = snapshotLongState24;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiveEventStreamComposableKt$VideoPlayer$3$1(this.$exoPlayer, this.$currentPosition$delegate, this.$duration$delegate, this.$isEventLive$delegate, this.$dvrWindowSize$delegate, this.$timeBehindLive$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiveEventStreamComposableKt$VideoPlayer$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            if (StreamingUtils.hasValidHlsStream(this.$exoPlayer)) {
                this.$currentPosition$delegate.setLongValue(RangesKt.coerceAtLeast(this.$exoPlayer.getCurrentPosition(), 0L));
                this.$duration$delegate.setLongValue(RangesKt.coerceAtLeast(this.$exoPlayer.getDuration(), 0L));
                LiveEventStreamComposableKt.VideoPlayer_Z6NMxzw$lambda$18(this.$isEventLive$delegate, this.$exoPlayer.isCurrentMediaItemLive());
                this.$dvrWindowSize$delegate.setLongValue(StreamingUtils.getDvrWindowSize(this.$exoPlayer));
                if (LiveEventStreamComposableKt.VideoPlayer_Z6NMxzw$lambda$17(this.$isEventLive$delegate)) {
                    this.$timeBehindLive$delegate.setLongValue(StreamingUtils.getDvrWindowSize(this.$exoPlayer) - this.$exoPlayer.getCurrentPosition());
                }
            }
            this.label = 1;
        } while (DelayKt.delay(16L, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
