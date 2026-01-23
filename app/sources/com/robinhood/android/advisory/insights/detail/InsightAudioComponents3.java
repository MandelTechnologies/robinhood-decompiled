package com.robinhood.android.advisory.insights.detail;

import androidx.compose.runtime.SnapshotState;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InsightAudioComponents.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.insights.detail.InsightAudioComponentsKt$rememberAudioController$1$1", m3645f = "InsightAudioComponents.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advisory.insights.detail.InsightAudioComponentsKt$rememberAudioController$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class InsightAudioComponents3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $audioUrl;
    final /* synthetic */ SnapshotState<String> $currentUrl$delegate;
    final /* synthetic */ ExoPlayer $exoPlayer;
    final /* synthetic */ SnapshotState<Boolean> $isReady$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InsightAudioComponents3(String str, ExoPlayer exoPlayer, SnapshotState<String> snapshotState, SnapshotState<Boolean> snapshotState2, Continuation<? super InsightAudioComponents3> continuation) {
        super(2, continuation);
        this.$audioUrl = str;
        this.$exoPlayer = exoPlayer;
        this.$currentUrl$delegate = snapshotState;
        this.$isReady$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InsightAudioComponents3(this.$audioUrl, this.$exoPlayer, this.$currentUrl$delegate, this.$isReady$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InsightAudioComponents3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (!Intrinsics.areEqual(this.$audioUrl, InsightAudioComponents2.rememberAudioController$lambda$15(this.$currentUrl$delegate))) {
                this.$currentUrl$delegate.setValue(this.$audioUrl);
                InsightAudioComponents2.rememberAudioController$lambda$10(this.$isReady$delegate, false);
                this.$exoPlayer.setMediaItem(MediaItem.fromUri(this.$audioUrl));
                this.$exoPlayer.prepare();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
