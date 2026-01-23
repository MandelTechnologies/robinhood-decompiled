package com.robinhood.shared.common.compose.multimodebottomsheet;

import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MultiModeAnchoredDraggable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableKt$restartable$2$1", m3645f = "MultiModeAnchoredDraggable.kt", m3646l = {743}, m3647m = "emit")
/* loaded from: classes26.dex */
final class MultiModeAnchoredDraggableKt$restartable$2$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MultiModeAnchoredDraggableKt.C374122.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MultiModeAnchoredDraggableKt$restartable$2$1$emit$1(MultiModeAnchoredDraggableKt.C374122.AnonymousClass1<? super T> anonymousClass1, Continuation<? super MultiModeAnchoredDraggableKt$restartable$2$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
