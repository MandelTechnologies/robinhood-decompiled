package com.robinhood.android.equityscreener.indicators;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RangeSlider.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equityscreener.indicators.RangeSliderKt", m3645f = "RangeSlider.kt", m3646l = {489}, m3647m = "awaitSlop-8vUncbI")
/* renamed from: com.robinhood.android.equityscreener.indicators.RangeSliderKt$awaitSlop$1, reason: use source file name */
/* loaded from: classes3.dex */
final class RangeSlider8 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    RangeSlider8(Continuation<? super RangeSlider8> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RangeSlider2.m13982awaitSlop8vUncbI(null, 0L, 0, this);
    }
}
