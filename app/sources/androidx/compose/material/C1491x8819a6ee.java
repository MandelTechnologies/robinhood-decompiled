package androidx.compose.material;

import androidx.compose.material.ModalBottomSheetKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ModalBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", m3645f = "ModalBottomSheet.kt", m3646l = {561}, m3647m = "onPreFling-QWom1Mo")
/* renamed from: androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 */
/* loaded from: classes4.dex */
final class C1491x8819a6ee extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ModalBottomSheetKt.C14891 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1491x8819a6ee(ModalBottomSheetKt.C14891 c14891, Continuation<? super C1491x8819a6ee> continuation) {
        super(continuation);
        this.this$0 = c14891;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo5609onPreFlingQWom1Mo(0L, this);
    }
}
