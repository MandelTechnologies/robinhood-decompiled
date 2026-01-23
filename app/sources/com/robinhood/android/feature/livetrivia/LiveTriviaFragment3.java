package com.robinhood.android.feature.livetrivia;

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

/* compiled from: LiveTriviaFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.feature.livetrivia.LiveTriviaFragment$ComposeContent$3$1$1", m3645f = "LiveTriviaFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.feature.livetrivia.LiveTriviaFragment$ComposeContent$3$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class LiveTriviaFragment3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $videoUrl;
    int label;
    final /* synthetic */ LiveTriviaFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LiveTriviaFragment3(String str, LiveTriviaFragment liveTriviaFragment, Continuation<? super LiveTriviaFragment3> continuation) {
        super(2, continuation);
        this.$videoUrl = str;
        this.this$0 = liveTriviaFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiveTriviaFragment3(this.$videoUrl, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiveTriviaFragment3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$videoUrl != null) {
            this.this$0.getDuxo().onVideoLoadingChange(false);
            ExoPlayer exoPlayer = this.this$0.exoPlayer;
            if (exoPlayer != null) {
                exoPlayer.setMediaSource(this.this$0.getMediaSource(this.$videoUrl));
            }
            ExoPlayer exoPlayer2 = this.this$0.exoPlayer;
            if (exoPlayer2 != null) {
                exoPlayer2.prepare();
            }
        }
        return Unit.INSTANCE;
    }
}
