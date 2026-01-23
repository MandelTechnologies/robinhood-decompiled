package androidx.compose.foundation.gestures;

import androidx.compose.p011ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: TapGestureDetector.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", m3645f = "TapGestureDetector.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1, reason: use source file name */
/* loaded from: classes4.dex */
final class TapGestureDetector5 extends ContinuationImpl7 implements Function3<TapGestureDetector2, Offset, Continuation<? super Unit>, Object> {
    int label;

    TapGestureDetector5(Continuation<? super TapGestureDetector5> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(TapGestureDetector2 tapGestureDetector2, Offset offset, Continuation<? super Unit> continuation) {
        return m5046invoked4ec7I(tapGestureDetector2, offset.getPackedValue(), continuation);
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m5046invoked4ec7I(TapGestureDetector2 tapGestureDetector2, long j, Continuation<? super Unit> continuation) {
        return new TapGestureDetector5(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
