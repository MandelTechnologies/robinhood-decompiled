package androidx.compose.foundation.gestures;

import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventKt;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerId;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DragGestureDetector.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", m3645f = "DragGestureDetector.kt", m3646l = {971, 993}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<PointerInputChange> $currentDown;
    final /* synthetic */ Ref.BooleanRef $deepPress;
    final /* synthetic */ Ref.ObjectRef<PointerInputChange> $longPress;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragGestureDetectorKt$awaitLongPressOrCancellation$2(Ref.BooleanRef booleanRef, Ref.ObjectRef<PointerInputChange> objectRef, Ref.ObjectRef<PointerInputChange> objectRef2, Continuation<? super DragGestureDetectorKt$awaitLongPressOrCancellation$2> continuation) {
        super(2, continuation);
        this.$deepPress = booleanRef;
        this.$currentDown = objectRef;
        this.$longPress = objectRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.$deepPress, this.$currentDown, this.$longPress, continuation);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.L$0 = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        r2 = r6 ? 1 : 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2 A[EDGE_INSN: B:68:0x00e2->B:44:0x00e2 BREAK  A[LOOP:0: B:39:0x00cf->B:43:0x00df], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [T, androidx.compose.ui.input.pointer.PointerInputChange] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00be -> B:38:0x00c1). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        int i;
        Object objAwaitPointerEvent;
        PointerEvent pointerEvent;
        int size;
        int i2;
        int size2;
        int i3;
        Object objAwaitPointerEvent2;
        T t;
        PointerInputChange pointerInputChange;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        Object obj2 = null;
        boolean z = true;
        z = true;
        z = true;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            i = 0;
            if (i != 0) {
            }
        } else {
            if (i4 == 1) {
                i = this.I$0;
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                objAwaitPointerEvent = obj;
                pointerEvent = (PointerEvent) objAwaitPointerEvent;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                size = changes.size();
                i2 = 0;
                while (true) {
                    if (i2 >= size) {
                    }
                    i2++;
                }
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                size2 = changes2.size();
                while (i3 < size2) {
                }
                if (TapGestureDetector_androidKt.isDeepPress(pointerEvent)) {
                }
                PointerEventPass pointerEventPass = PointerEventPass.Final;
                this.L$0 = awaitPointerEventScope;
                this.L$1 = pointerEvent;
                this.I$0 = i;
                this.label = 2;
                objAwaitPointerEvent2 = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, this);
                if (objAwaitPointerEvent2 != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            PointerEvent pointerEvent2 = (PointerEvent) this.L$1;
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            objAwaitPointerEvent2 = obj;
            List<PointerInputChange> changes3 = ((PointerEvent) objAwaitPointerEvent2).getChanges();
            int size3 = changes3.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size3) {
                    break;
                }
                if (changes3.get(i5).isConsumed()) {
                    i = z ? 1 : 0;
                    break;
                }
                i5++;
            }
            if (!DragGestureDetectorKt.m4981isPointerUpDmW0f2w(pointerEvent2, this.$currentDown.element.getId())) {
                List<PointerInputChange> changes4 = pointerEvent2.getChanges();
                int size4 = changes4.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size4) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes4.get(i6);
                    if (pointerInputChange.getPressed()) {
                        break;
                    }
                    i6++;
                }
                PointerInputChange pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 == 0) {
                    i = z ? 1 : 0;
                    awaitPointerEventScope = awaitPointerEventScope2;
                    obj2 = null;
                    if (i != 0) {
                        return Unit.INSTANCE;
                    }
                    PointerEventPass pointerEventPass2 = PointerEventPass.Main;
                    this.L$0 = awaitPointerEventScope;
                    this.L$1 = obj2;
                    this.I$0 = i;
                    this.label = z ? 1 : 0;
                    objAwaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(pointerEventPass2, this);
                    if (objAwaitPointerEvent != coroutine_suspended) {
                        pointerEvent = (PointerEvent) objAwaitPointerEvent;
                        List<PointerInputChange> changes5 = pointerEvent.getChanges();
                        size = changes5.size();
                        i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                i = z ? 1 : 0;
                                break;
                            }
                            if (!PointerEventKt.changedToUpIgnoreConsumed(changes5.get(i2))) {
                                break;
                            }
                            i2++;
                        }
                        List<PointerInputChange> changes22 = pointerEvent.getChanges();
                        size2 = changes22.size();
                        for (i3 = 0; i3 < size2; i3++) {
                            PointerInputChange pointerInputChange3 = changes22.get(i3);
                            if (pointerInputChange3.isConsumed() || PointerEventKt.m7154isOutOfBoundsjwHxaWs(pointerInputChange3, awaitPointerEventScope.mo7138getSizeYbymL2g(), awaitPointerEventScope.mo7137getExtendedTouchPaddingNHjbRc())) {
                                break;
                            }
                        }
                        if (TapGestureDetector_androidKt.isDeepPress(pointerEvent)) {
                            this.$deepPress.element = z;
                            i = z ? 1 : 0;
                        }
                        PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                        this.L$0 = awaitPointerEventScope;
                        this.L$1 = pointerEvent;
                        this.I$0 = i;
                        this.label = 2;
                        objAwaitPointerEvent2 = awaitPointerEventScope.awaitPointerEvent(pointerEventPass3, this);
                        if (objAwaitPointerEvent2 != coroutine_suspended) {
                            awaitPointerEventScope2 = awaitPointerEventScope;
                            pointerEvent2 = pointerEvent;
                            List<PointerInputChange> changes32 = ((PointerEvent) objAwaitPointerEvent2).getChanges();
                            int size32 = changes32.size();
                            int i52 = 0;
                            while (true) {
                                if (i52 >= size32) {
                                }
                                i52++;
                            }
                            if (!DragGestureDetectorKt.m4981isPointerUpDmW0f2w(pointerEvent2, this.$currentDown.element.getId())) {
                                Ref.ObjectRef<PointerInputChange> objectRef = this.$longPress;
                                List<PointerInputChange> changes6 = pointerEvent2.getChanges();
                                Ref.ObjectRef<PointerInputChange> objectRef2 = this.$currentDown;
                                int size5 = changes6.size();
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= size5) {
                                        t = 0;
                                        break;
                                    }
                                    t = changes6.get(i7);
                                    Ref.ObjectRef<PointerInputChange> objectRef3 = objectRef2;
                                    if (PointerId.m7170equalsimpl0(((PointerInputChange) t).getId(), objectRef2.element.getId())) {
                                        break;
                                    }
                                    i7++;
                                    objectRef2 = objectRef3;
                                }
                                objectRef.element = t;
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                this.$currentDown.element = pointerInputChange2;
                this.$longPress.element = pointerInputChange2;
            }
            awaitPointerEventScope = awaitPointerEventScope2;
            obj2 = null;
            z = true;
            if (i != 0) {
            }
        }
    }
}
