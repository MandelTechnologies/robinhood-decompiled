package com.robinhood.android.swipetodismiss;

import androidx.compose.p011ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Swipeable.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.swipetodismiss.SwipeableKt$swipeable$4$4$1", m3645f = "Swipeable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes9.dex */
final class SwipeableKt$swipeable$4$4$1 extends ContinuationImpl7 implements Function3<CoroutineScope, Offset, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onDragStarted;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableKt$swipeable$4$4$1(Function0<Unit> function0, Continuation<? super SwipeableKt$swipeable$4$4$1> continuation) {
        super(3, continuation);
        this.$onDragStarted = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Offset offset, Continuation<? super Unit> continuation) {
        return m19212invoked4ec7I(coroutineScope, offset.getPackedValue(), continuation);
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m19212invoked4ec7I(CoroutineScope coroutineScope, long j, Continuation<? super Unit> continuation) {
        return new SwipeableKt$swipeable$4$4$1(this.$onDragStarted, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$onDragStarted.invoke();
        return Unit.INSTANCE;
    }
}
