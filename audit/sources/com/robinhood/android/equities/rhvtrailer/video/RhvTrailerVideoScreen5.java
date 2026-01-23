package com.robinhood.android.equities.rhvtrailer.video;

import androidx.compose.runtime.SnapshotState;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RhvTrailerVideoScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$ClickToPauseVideoPlayer$1$1", m3645f = "RhvTrailerVideoScreen.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$ClickToPauseVideoPlayer$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class RhvTrailerVideoScreen5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<ExoPlayer> $playerRef;
    final /* synthetic */ RhvTrailerVideoScreen3 $state;
    final /* synthetic */ SnapshotState<Boolean> $suppressNextPending$delegate;
    int label;

    /* compiled from: RhvTrailerVideoScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$ClickToPauseVideoPlayer$1$1$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RhvTrailerVideoScreen3.values().length];
            try {
                iArr[RhvTrailerVideoScreen3.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RhvTrailerVideoScreen3.PLAYING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RhvTrailerVideoScreen3.ENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhvTrailerVideoScreen5(SnapshotState<ExoPlayer> snapshotState, RhvTrailerVideoScreen3 rhvTrailerVideoScreen3, SnapshotState<Boolean> snapshotState2, Continuation<? super RhvTrailerVideoScreen5> continuation) {
        super(2, continuation);
        this.$playerRef = snapshotState;
        this.$state = rhvTrailerVideoScreen3;
        this.$suppressNextPending$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RhvTrailerVideoScreen5(this.$playerRef, this.$state, this.$suppressNextPending$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RhvTrailerVideoScreen5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ExoPlayer value = this.$playerRef.getValue();
        if (value == null) {
            return Unit.INSTANCE;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.$state.ordinal()];
        if (i == 1) {
            value.setPlayWhenReady(false);
            value.pause();
        } else if (i == 2) {
            long duration = value.getDuration();
            long currentPosition = value.getCurrentPosition();
            if (value.getPlaybackState() == 4 || (duration > 0 && currentPosition >= duration - 300)) {
                RhvTrailerVideoScreen4.ClickToPauseVideoPlayer$lambda$13(this.$suppressNextPending$delegate, true);
                value.seekTo(0L);
            }
            value.setPlayWhenReady(true);
            value.play();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            value.setPlayWhenReady(false);
            value.pause();
        }
        return Unit.INSTANCE;
    }
}
