package com.robinhood.android.engagement.goldevent.p115ui;

import android.view.Surface;
import androidx.compose.foundation.SurfaceCoroutineScope;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import timber.log.Timber;

/* compiled from: LiveEventStreamComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/foundation/SurfaceCoroutineScope;", "surface", "Landroid/view/Surface;", "width", "", "height"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$VideoPlayer$7$2$1$1", m3645f = "LiveEventStreamComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class LiveEventStreamComposableKt$VideoPlayer$7$2$1$1 extends ContinuationImpl7 implements Function5<SurfaceCoroutineScope, Surface, Integer, Integer, Continuation<? super Unit>, Object> {
    final /* synthetic */ ExoPlayer $exoPlayer;
    /* synthetic */ int I$0;
    /* synthetic */ int I$1;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LiveEventStreamComposableKt$VideoPlayer$7$2$1$1(ExoPlayer exoPlayer, Continuation<? super LiveEventStreamComposableKt$VideoPlayer$7$2$1$1> continuation) {
        super(5, continuation);
        this.$exoPlayer = exoPlayer;
    }

    public final Object invoke(SurfaceCoroutineScope surfaceCoroutineScope, Surface surface, int i, int i2, Continuation<? super Unit> continuation) {
        LiveEventStreamComposableKt$VideoPlayer$7$2$1$1 liveEventStreamComposableKt$VideoPlayer$7$2$1$1 = new LiveEventStreamComposableKt$VideoPlayer$7$2$1$1(this.$exoPlayer, continuation);
        liveEventStreamComposableKt$VideoPlayer$7$2$1$1.L$0 = surfaceCoroutineScope;
        liveEventStreamComposableKt$VideoPlayer$7$2$1$1.L$1 = surface;
        liveEventStreamComposableKt$VideoPlayer$7$2$1$1.I$0 = i;
        liveEventStreamComposableKt$VideoPlayer$7$2$1$1.I$1 = i2;
        return liveEventStreamComposableKt$VideoPlayer$7$2$1$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Object invoke(SurfaceCoroutineScope surfaceCoroutineScope, Surface surface, Integer num, Integer num2, Continuation<? super Unit> continuation) {
        return invoke(surfaceCoroutineScope, surface, num.intValue(), num2.intValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SurfaceCoroutineScope surfaceCoroutineScope = (SurfaceCoroutineScope) this.L$0;
        Surface surface = (Surface) this.L$1;
        int i = this.I$0;
        int i2 = this.I$1;
        Timber.INSTANCE.mo3350d("Surface created: " + i + " x " + i2, new Object[0]);
        this.$exoPlayer.setVideoSurface(surface);
        final ExoPlayer exoPlayer = this.$exoPlayer;
        surfaceCoroutineScope.onDestroyed(surface, new Function1() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$VideoPlayer$7$2$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return LiveEventStreamComposableKt$VideoPlayer$7$2$1$1.invokeSuspend$lambda$0(exoPlayer, (Surface) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(ExoPlayer exoPlayer, Surface surface) {
        exoPlayer.clearVideoSurface();
        return Unit.INSTANCE;
    }
}
