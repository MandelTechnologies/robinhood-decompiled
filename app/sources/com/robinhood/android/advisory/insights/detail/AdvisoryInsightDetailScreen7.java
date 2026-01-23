package com.robinhood.android.advisory.insights.detail;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ScrollExtensions;
import androidx.compose.runtime.SnapshotState4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AdvisoryInsightDetailScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$TextContentSection$2$1", m3645f = "AdvisoryInsightDetailScreen.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$TextContentSection$2$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AdvisoryInsightDetailScreen7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AudioControllerState $audioController;
    final /* synthetic */ long $audioDurationMs;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ SnapshotState4<Float> $totalScrollDistance;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisoryInsightDetailScreen7(AudioControllerState audioControllerState, CoroutineScope coroutineScope, ScrollState scrollState, SnapshotState4<Float> snapshotState4, long j, Continuation<? super AdvisoryInsightDetailScreen7> continuation) {
        super(2, continuation);
        this.$audioController = audioControllerState;
        this.$coroutineScope = coroutineScope;
        this.$scrollState = scrollState;
        this.$totalScrollDistance = snapshotState4;
        this.$audioDurationMs = j;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvisoryInsightDetailScreen7(this.$audioController, this.$coroutineScope, this.$scrollState, this.$totalScrollDistance, this.$audioDurationMs, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvisoryInsightDetailScreen7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AudioControllerState audioControllerState = this.$audioController;
        if (audioControllerState == null || !audioControllerState.isReady() || this.$audioController.getStatus() != InsightAudioComponents6.PLAYING) {
            BuildersKt__Builders_commonKt.launch$default(this.$coroutineScope, null, null, new C87972(this.$scrollState, null), 3, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(this.$coroutineScope, null, null, new C87961(this.$scrollState, this.$totalScrollDistance, this.$audioDurationMs, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AdvisoryInsightDetailScreen.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$TextContentSection$2$1$1", m3645f = "AdvisoryInsightDetailScreen.kt", m3646l = {483}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$TextContentSection$2$1$1 */
    static final class C87961 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $audioDurationMs;
        final /* synthetic */ ScrollState $scrollState;
        final /* synthetic */ SnapshotState4<Float> $totalScrollDistance;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C87961(ScrollState scrollState, SnapshotState4<Float> snapshotState4, long j, Continuation<? super C87961> continuation) {
            super(2, continuation);
            this.$scrollState = scrollState;
            this.$totalScrollDistance = snapshotState4;
            this.$audioDurationMs = j;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C87961(this.$scrollState, this.$totalScrollDistance, this.$audioDurationMs, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C87961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScrollState scrollState = this.$scrollState;
                int iFloatValue = (int) this.$totalScrollDistance.getValue().floatValue();
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default((int) this.$audioDurationMs, 0, Easing3.getLinearEasing(), 2, null);
                this.label = 1;
                if (scrollState.animateScrollTo(iFloatValue, tweenSpecTween$default, this) == coroutine_suspended) {
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

    /* compiled from: AdvisoryInsightDetailScreen.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$TextContentSection$2$1$2", m3645f = "AdvisoryInsightDetailScreen.kt", m3646l = {492}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$TextContentSection$2$1$2 */
    static final class C87972 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ScrollState $scrollState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C87972(ScrollState scrollState, Continuation<? super C87972> continuation) {
            super(2, continuation);
            this.$scrollState = scrollState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C87972(this.$scrollState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C87972) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScrollState scrollState = this.$scrollState;
                this.label = 1;
                if (ScrollExtensions.stopScroll$default(scrollState, null, this, 1, null) == coroutine_suspended) {
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
}
