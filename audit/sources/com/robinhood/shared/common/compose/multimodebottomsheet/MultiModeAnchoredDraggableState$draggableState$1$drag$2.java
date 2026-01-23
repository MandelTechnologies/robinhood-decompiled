package com.robinhood.shared.common.compose.multimodebottomsheet;

import androidx.compose.foundation.gestures.DragScope;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: MultiModeAnchoredDraggable.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/AnchoredDragScope;", "it", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeDraggableAnchors;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState$draggableState$1$drag$2", m3645f = "MultiModeAnchoredDraggable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes26.dex */
final class MultiModeAnchoredDraggableState$draggableState$1$drag$2<T> extends ContinuationImpl7 implements Function3<AnchoredDragScope, MultiModeDraggableAnchors<T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<DragScope, Continuation<? super Unit>, Object> $block;
    int label;
    final /* synthetic */ MultiModeAnchoredDraggableState$draggableState$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MultiModeAnchoredDraggableState$draggableState$1$drag$2(MultiModeAnchoredDraggableState$draggableState$1 multiModeAnchoredDraggableState$draggableState$1, Function2<? super DragScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super MultiModeAnchoredDraggableState$draggableState$1$drag$2> continuation) {
        super(3, continuation);
        this.this$0 = multiModeAnchoredDraggableState$draggableState$1;
        this.$block = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(AnchoredDragScope anchoredDragScope, MultiModeDraggableAnchors<T> multiModeDraggableAnchors, Continuation<? super Unit> continuation) {
        return new MultiModeAnchoredDraggableState$draggableState$1$drag$2(this.this$0, this.$block, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MultiModeAnchoredDraggableState$draggableState$1$dragScope$1 multiModeAnchoredDraggableState$draggableState$1$dragScope$1 = this.this$0.dragScope;
            Function2<DragScope, Continuation<? super Unit>, Object> function2 = this.$block;
            this.label = 1;
            if (function2.invoke(multiModeAnchoredDraggableState$draggableState$1$dragScope$1, this) == coroutine_suspended) {
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
