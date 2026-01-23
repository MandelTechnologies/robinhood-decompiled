package com.robinhood.android.engagement.goldevent.p115ui;

import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.engagement.goldevent.LiveEventStreamViewState3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: LiveEventStreamComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
final class LiveEventStreamComposableKt$VideoPlayer$7$3$1$1 implements PointerInputEventHandler {
    final /* synthetic */ LiveEventStreamViewState3 $playbackState;
    final /* synthetic */ SnapshotState<Boolean> $showControls$delegate;

    LiveEventStreamComposableKt$VideoPlayer$7$3$1$1(LiveEventStreamViewState3 liveEventStreamViewState3, SnapshotState<Boolean> snapshotState) {
        this.$playbackState = liveEventStreamViewState3;
        this.$showControls$delegate = snapshotState;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final LiveEventStreamViewState3 liveEventStreamViewState3 = this.$playbackState;
        final SnapshotState<Boolean> snapshotState = this.$showControls$delegate;
        Object objDetectTapGestures$default = TapGestureDetector4.detectTapGestures$default(pointerInputScope, null, null, null, new Function1() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$VideoPlayer$7$3$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveEventStreamComposableKt$VideoPlayer$7$3$1$1.invoke$lambda$0(liveEventStreamViewState3, snapshotState, (Offset) obj);
            }
        }, continuation, 7, null);
        return objDetectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(LiveEventStreamViewState3 liveEventStreamViewState3, SnapshotState snapshotState, Offset offset) {
        if (liveEventStreamViewState3 == LiveEventStreamViewState3.PLAYING) {
            LiveEventStreamComposableKt.VideoPlayer_Z6NMxzw$lambda$32(snapshotState, !LiveEventStreamComposableKt.VideoPlayer_Z6NMxzw$lambda$31(snapshotState));
        }
        return Unit.INSTANCE;
    }
}
