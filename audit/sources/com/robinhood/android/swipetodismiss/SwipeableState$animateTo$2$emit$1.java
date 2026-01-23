package com.robinhood.android.swipetodismiss;

import com.robinhood.android.swipetodismiss.SwipeableState;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Swipeable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.swipetodismiss.SwipeableState$animateTo$2", m3645f = "Swipeable.kt", m3646l = {358}, m3647m = "emit")
/* loaded from: classes9.dex */
final class SwipeableState$animateTo$2$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SwipeableState.C292112<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SwipeableState$animateTo$2$emit$1(SwipeableState.C292112<? super T> c292112, Continuation<? super SwipeableState$animateTo$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = c292112;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Map) null, (Continuation<? super Unit>) this);
    }
}
