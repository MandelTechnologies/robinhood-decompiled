package com.robinhood.compose.common;

import androidx.compose.animation.core.Animation4;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MonotonicFrameClock2;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MarqueeText.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.compose.common.MarqueeTextKt$MarqueeText$1$1", m3645f = "MarqueeText.kt", m3646l = {97, 99}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.compose.common.MarqueeTextKt$MarqueeText$1$1, reason: use source file name */
/* loaded from: classes15.dex */
final class MarqueeText5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $durationMillis;
    final /* synthetic */ SnapshotState<TextLayoutInfo> $textLayoutInfoState;
    final /* synthetic */ SnapshotIntState2 $timeOffset$delegate;
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarqueeText5(SnapshotState<TextLayoutInfo> snapshotState, int i, SnapshotIntState2 snapshotIntState2, Continuation<? super MarqueeText5> continuation) {
        super(2, continuation);
        this.$textLayoutInfoState = snapshotState;
        this.$durationMillis = i;
        this.$timeOffset$delegate = snapshotIntState2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invokeSuspend$lambda$0(long j) {
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invokeSuspend$lambda$1(long j) {
        return j;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarqueeText5(this.$textLayoutInfoState, this.$durationMillis, this.$timeOffset$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarqueeText5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x009c, code lost:
    
        if (r5 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bd, code lost:
    
        if (r9 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bf, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00bd -> B:22:0x00c0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        TextLayoutInfo textLayoutInfo;
        int textWidth;
        Animation4 animation4;
        Object objWithFrameNanos;
        TextLayoutInfo textLayoutInfo2;
        long jLongValue;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TextLayoutInfo value = this.$textLayoutInfoState.getValue();
            if (value == null) {
                return Unit.INSTANCE;
            }
            textLayoutInfo = value;
            textWidth = (this.$durationMillis * value.getTextWidth()) / value.getContainerWidth();
            animation4 = new Animation4(AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(textWidth, 0, Easing3.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), boxing.boxInt(0), boxing.boxInt(-textLayoutInfo.getTextWidth()), null, 16, null);
            Function1 function1 = new Function1() { // from class: com.robinhood.compose.common.MarqueeTextKt$MarqueeText$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Long.valueOf(MarqueeText5.invokeSuspend$lambda$0(((Long) obj2).longValue()));
                }
            };
            this.L$0 = textLayoutInfo;
            this.L$1 = animation4;
            this.I$0 = textWidth;
            this.label = 1;
            objWithFrameNanos = MonotonicFrameClock2.withFrameNanos(function1, this);
        } else if (i == 1) {
            textWidth = this.I$0;
            Animation4 animation42 = (Animation4) this.L$1;
            textLayoutInfo = (TextLayoutInfo) this.L$0;
            ResultKt.throwOnFailure(obj);
            animation4 = animation42;
            objWithFrameNanos = obj;
            textLayoutInfo2 = textLayoutInfo;
            jLongValue = ((Number) objWithFrameNanos).longValue();
            Function1 function12 = new Function1() { // from class: com.robinhood.compose.common.MarqueeTextKt$MarqueeText$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Long.valueOf(MarqueeText5.invokeSuspend$lambda$1(((Long) obj2).longValue()));
                }
            };
            this.L$0 = textLayoutInfo2;
            this.L$1 = animation4;
            this.I$0 = textWidth;
            this.J$0 = jLongValue;
            this.label = 2;
            objWithFrameNanos = MonotonicFrameClock2.withFrameNanos(function12, this);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jLongValue = this.J$0;
            textWidth = this.I$0;
            animation4 = (Animation4) this.L$1;
            textLayoutInfo2 = (TextLayoutInfo) this.L$0;
            ResultKt.throwOnFailure(obj);
            Object objWithFrameNanos2 = obj;
            long jLongValue2 = ((Number) objWithFrameNanos2).longValue() - jLongValue;
            this.$timeOffset$delegate.setIntValue(((Number) animation4.getValueFromNanos(jLongValue2)).intValue());
            if (animation4.isFinishedFromNanos(jLongValue2)) {
                textLayoutInfo = textLayoutInfo2;
                animation4 = new Animation4(AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(textWidth, 0, Easing3.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), boxing.boxInt(0), boxing.boxInt(-textLayoutInfo.getTextWidth()), null, 16, null);
                Function1 function13 = new Function1() { // from class: com.robinhood.compose.common.MarqueeTextKt$MarqueeText$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Long.valueOf(MarqueeText5.invokeSuspend$lambda$0(((Long) obj2).longValue()));
                    }
                };
                this.L$0 = textLayoutInfo;
                this.L$1 = animation4;
                this.I$0 = textWidth;
                this.label = 1;
                objWithFrameNanos = MonotonicFrameClock2.withFrameNanos(function13, this);
            }
            Function1 function122 = new Function1() { // from class: com.robinhood.compose.common.MarqueeTextKt$MarqueeText$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Long.valueOf(MarqueeText5.invokeSuspend$lambda$1(((Long) obj2).longValue()));
                }
            };
            this.L$0 = textLayoutInfo2;
            this.L$1 = animation4;
            this.I$0 = textWidth;
            this.J$0 = jLongValue;
            this.label = 2;
            objWithFrameNanos2 = MonotonicFrameClock2.withFrameNanos(function122, this);
        }
    }
}
