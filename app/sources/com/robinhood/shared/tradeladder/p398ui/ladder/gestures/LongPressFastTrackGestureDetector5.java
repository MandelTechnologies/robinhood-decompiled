package com.robinhood.shared.tradeladder.p398ui.ladder.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LongPressFastTrackGestureDetector.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.tradeladder.ui.ladder.gestures.LongPressFastTrackGestureDetectorKt", m3645f = "LongPressFastTrackGestureDetector.kt", m3646l = {82}, m3647m = "processEvents-TUCjRT4")
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.gestures.LongPressFastTrackGestureDetectorKt$processEvents$1, reason: use source file name */
/* loaded from: classes12.dex */
final class LongPressFastTrackGestureDetector5 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    LongPressFastTrackGestureDetector5(Continuation<? super LongPressFastTrackGestureDetector5> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return LongPressFastTrackGestureDetector4.m26109processEventsTUCjRT4(null, 0L, 0L, null, this);
    }
}
