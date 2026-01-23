package com.robinhood.android.advisory.insights.detail;

import androidx.compose.runtime.SnapshotState;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InsightAudioComponents.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.insights.detail.InsightAudioComponentsKt$rememberAudioController$2$1", m3645f = "InsightAudioComponents.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advisory.insights.detail.InsightAudioComponentsKt$rememberAudioController$2$1, reason: use source file name */
/* loaded from: classes7.dex */
final class InsightAudioComponents4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<InsightAudioComponents6> $desiredStatus$delegate;
    final /* synthetic */ ExoPlayer $exoPlayer;
    final /* synthetic */ SnapshotState<Boolean> $isReady$delegate;
    final /* synthetic */ SnapshotState<InsightAudioComponents6> $status$delegate;
    int label;

    /* compiled from: InsightAudioComponents.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.insights.detail.InsightAudioComponentsKt$rememberAudioController$2$1$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InsightAudioComponents6.values().length];
            try {
                iArr[InsightAudioComponents6.PLAYING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InsightAudioComponents6.STOPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InsightAudioComponents4(ExoPlayer exoPlayer, SnapshotState<Boolean> snapshotState, SnapshotState<InsightAudioComponents6> snapshotState2, SnapshotState<InsightAudioComponents6> snapshotState3, Continuation<? super InsightAudioComponents4> continuation) {
        super(2, continuation);
        this.$exoPlayer = exoPlayer;
        this.$isReady$delegate = snapshotState;
        this.$desiredStatus$delegate = snapshotState2;
        this.$status$delegate = snapshotState3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InsightAudioComponents4(this.$exoPlayer, this.$isReady$delegate, this.$desiredStatus$delegate, this.$status$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InsightAudioComponents4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (InsightAudioComponents2.rememberAudioController$lambda$9(this.$isReady$delegate)) {
                int i = WhenMappings.$EnumSwitchMapping$0[InsightAudioComponents2.rememberAudioController$lambda$3(this.$desiredStatus$delegate).ordinal()];
                if (i == 1) {
                    this.$exoPlayer.play();
                } else if (i == 2) {
                    this.$exoPlayer.seekTo(0L);
                    this.$exoPlayer.pause();
                } else {
                    this.$exoPlayer.pause();
                }
            } else {
                this.$exoPlayer.pause();
            }
            this.$status$delegate.setValue(InsightAudioComponents2.rememberAudioController$lambda$3(this.$desiredStatus$delegate));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
