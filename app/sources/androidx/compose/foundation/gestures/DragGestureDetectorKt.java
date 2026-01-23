package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventKt;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.p011ui.input.pointer.PointerId;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.PointerType;
import androidx.compose.p011ui.platform.ViewConfiguration;
import androidx.compose.p011ui.unit.C2002Dp;
import com.plaid.internal.EnumC7081g;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DragGestureDetector.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aY\u0010\u000e\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u0014\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0017\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0082\u0001\u0010\u001e\u001a\u00020\n*\u00020\u00182\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001a26\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\n0\u0003H\u0086@¢\u0006\u0004\b\u001e\u0010\u001f\u001aâ\u0001\u0010\u001e\u001a\u00020\n*\u00020\u00182K\u0010\u0019\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\n0 2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\n0\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a2\b\u0010&\u001a\u0004\u0018\u00010%26\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\n0\u0003H\u0080@¢\u0006\u0004\b\u001e\u0010'\u001a\u0082\u0001\u0010(\u001a\u00020\n*\u00020\u00182\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001a26\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\n0\u0003H\u0086@¢\u0006\u0004\b(\u0010\u001f\u001aY\u0010+\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110)¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b*\u0010\r\u001a!\u0010-\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b,\u0010\u0016\u001aa\u00103\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010/\u001a\u00020.26\u00100\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110)¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a3\u00105\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0013\u001a\u0082\u0001\u00107\u001a\u00020\n*\u00020\u00182\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001a26\u00106\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110)¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\n0\u0003H\u0086@¢\u0006\u0004\b7\u0010\u001f\u001a!\u00109\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b8\u0010\u0016\u001a\u001e\u0010=\u001a\u00020\u0011*\u00020:2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a\u001e\u0010A\u001a\u00020)*\u00020>2\u0006\u0010/\u001a\u00020.H\u0000ø\u0001\u0000¢\u0006\u0004\b?\u0010@\"\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D\"\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010D\"\u0014\u0010F\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010D\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006G"}, m3636d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Lkotlin/ParameterName;", "name", "change", "Landroidx/compose/ui/geometry/Offset;", "overSlop", "", "onTouchSlopReached", "awaitTouchSlopOrCancellation-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitTouchSlopOrCancellation", "Lkotlin/Function1;", "onDrag", "", "drag-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "drag", "awaitDragOrCancellation-rnUCldI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDragOrCancellation", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onDragStart", "Lkotlin/Function0;", "onDragEnd", "onDragCancel", "dragAmount", "detectDragGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "down", "slopTriggerChange", "overSlopOffset", "shouldAwaitTouchSlop", "Landroidx/compose/foundation/gestures/Orientation;", "orientationLock", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectDragGesturesAfterLongPress", "", "awaitVerticalTouchSlopOrCancellation-jO51t88", "awaitVerticalTouchSlopOrCancellation", "awaitVerticalDragOrCancellation-rnUCldI", "awaitVerticalDragOrCancellation", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "onPointerSlopReached", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitHorizontalPointerSlopOrCancellation", "horizontalDrag-jO51t88", "horizontalDrag", "onHorizontalDrag", "detectHorizontalDragGestures", "awaitLongPressOrCancellation-rnUCldI", "awaitLongPressOrCancellation", "Landroidx/compose/ui/input/pointer/PointerEvent;", "isPointerUp-DmW0f2w", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "isPointerUp", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "pointerSlop", "Landroidx/compose/ui/unit/Dp;", "mouseSlop", "F", "defaultTouchSlop", "mouseToTouchSlopRatio", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DragGestureDetectorKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0180 -> B:62:0x0186). Please report as a decompilation issue!!! */
    /* renamed from: awaitTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4976awaitTouchSlopOrCancellationjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
        Function2<? super PointerInputChange, ? super Offset, Unit> function22;
        Ref.LongRef longRef;
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$12;
        float f;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        Ref.LongRef longRef2;
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
        float f2;
        TouchSlopDetector touchSlopDetector2;
        int size;
        int i;
        PointerEventPass pointerEventPass;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        int i2;
        Object objAwaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) continuation;
            int i3 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label = i3 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitTouchSlopOrCancellation$1(continuation);
            }
        }
        Object obj3 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label;
        int i5 = 1;
        PointerEventPass pointerEventPass2 = null;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj3);
            int iM7209getTouchT8wyACA = PointerType.INSTANCE.m7209getTouchT8wyACA();
            long jM6553getZeroF1C5BW0 = Offset.INSTANCE.m6553getZeroF1C5BW0();
            if (m4981isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                return null;
            }
            float fM4982pointerSlopE8SPZFQ = m4982pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), iM7209getTouchT8wyACA);
            Ref.LongRef longRef3 = new Ref.LongRef();
            longRef3.element = j;
            TouchSlopDetector touchSlopDetector3 = new TouchSlopDetector(null, jM6553getZeroF1C5BW0, null);
            function22 = function2;
            longRef = longRef3;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
            f = fM4982pointerSlopE8SPZFQ;
            touchSlopDetector = touchSlopDetector3;
            awaitPointerEventScope2 = awaitPointerEventScope;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = longRef;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i5;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i5, pointerEventPass2);
            if (objAwaitPointerEvent$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i4 == 1) {
            float f3 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0;
            TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3;
            Ref.LongRef longRef4 = (Ref.LongRef) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2;
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1;
            Function2<? super PointerInputChange, ? super Offset, Unit> function23 = (Function2) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0;
            ResultKt.throwOnFailure(obj3);
            f2 = f3;
            awaitPointerEventScope2 = awaitPointerEventScope3;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
            touchSlopDetector2 = touchSlopDetector4;
            function22 = function23;
            longRef2 = longRef4;
            PointerEvent pointerEvent = (PointerEvent) obj3;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            size = changes.size();
            i = 0;
            while (true) {
                if (i < size) {
                }
                i = i2 + 1;
                pointerEventPass2 = pointerEventPass;
            }
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null) {
                return pointerEventPass;
            }
            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            }
            pointerEventPass2 = pointerEventPass;
            i5 = 1;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = longRef;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i5;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i5, pointerEventPass2);
            if (objAwaitPointerEvent$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i4 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        float f4 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0;
        PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$4;
        TouchSlopDetector touchSlopDetector5 = (TouchSlopDetector) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3;
        longRef = (Ref.LongRef) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2;
        AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1;
        Function2<? super PointerInputChange, ? super Offset, Unit> function24 = (Function2) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0;
        ResultKt.throwOnFailure(obj3);
        touchSlopDetector = touchSlopDetector5;
        pointerEventPass = null;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
        f = f4;
        awaitPointerEventScope2 = awaitPointerEventScope4;
        if (!pointerInputChange2.isConsumed()) {
            return pointerEventPass;
        }
        function22 = function24;
        pointerEventPass2 = pointerEventPass;
        i5 = 1;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = longRef;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i5;
        objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i5, pointerEventPass2);
        if (objAwaitPointerEvent$default != coroutine_suspended) {
            float f5 = f;
            touchSlopDetector2 = touchSlopDetector;
            obj3 = objAwaitPointerEvent$default;
            longRef2 = longRef;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$12;
            f2 = f5;
            PointerEvent pointerEvent2 = (PointerEvent) obj3;
            List<PointerInputChange> changes2 = pointerEvent2.getChanges();
            size = changes2.size();
            i = 0;
            while (true) {
                if (i < size) {
                    pointerEventPass = pointerEventPass2;
                    obj = pointerEventPass;
                    break;
                }
                obj = changes2.get(i);
                pointerEventPass = pointerEventPass2;
                i2 = i;
                if (PointerId.m7170equalsimpl0(((PointerInputChange) obj).getId(), longRef2.element)) {
                    break;
                }
                i = i2 + 1;
                pointerEventPass2 = pointerEventPass;
            }
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null || pointerInputChange.isConsumed()) {
                return pointerEventPass;
            }
            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                int size2 = changes3.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size2) {
                        obj2 = pointerEventPass;
                        break;
                    }
                    obj2 = changes3.get(i6);
                    if (((PointerInputChange) obj2).getPressed()) {
                        break;
                    }
                    i6++;
                }
                PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                if (pointerInputChange3 == null) {
                    return pointerEventPass;
                }
                longRef2.element = pointerInputChange3.getId();
                touchSlopDetector = touchSlopDetector2;
                f = f2;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
                longRef = longRef2;
            } else {
                long jM5048addPointerInputChangedBAh8RU = touchSlopDetector2.m5048addPointerInputChangedBAh8RU(pointerInputChange, f2);
                if ((9223372034707292159L & jM5048addPointerInputChangedBAh8RU) != 9205357640488583168L) {
                    function22.invoke(pointerInputChange, Offset.m6534boximpl(jM5048addPointerInputChangedBAh8RU));
                    if (pointerInputChange.isConsumed()) {
                        return pointerInputChange;
                    }
                    touchSlopDetector2.reset();
                    touchSlopDetector = touchSlopDetector2;
                    f = f2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
                    longRef = longRef2;
                } else {
                    PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.L$0 = function22;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.L$2 = longRef2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.L$3 = touchSlopDetector2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.L$4 = pointerInputChange;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.F$0 = f2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.label = 2;
                    if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass3, dragGestureDetectorKt$awaitTouchSlopOrCancellation$13) != coroutine_suspended) {
                        function24 = function22;
                        touchSlopDetector = touchSlopDetector2;
                        f = f2;
                        pointerInputChange2 = pointerInputChange;
                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
                        longRef = longRef2;
                        if (!pointerInputChange2.isConsumed()) {
                        }
                    }
                }
            }
            pointerEventPass2 = pointerEventPass;
            i5 = 1;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = longRef;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i5;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i5, pointerEventPass2);
            if (objAwaitPointerEvent$default != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /* renamed from: drag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4979dragjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Continuation<? super Boolean> continuation) {
        DragGestureDetectorKt$drag$1 dragGestureDetectorKt$drag$1;
        PointerInputChange pointerInputChange;
        if (continuation instanceof DragGestureDetectorKt$drag$1) {
            dragGestureDetectorKt$drag$1 = (DragGestureDetectorKt$drag$1) continuation;
            int i = dragGestureDetectorKt$drag$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$drag$1.label = i - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$drag$1 = new DragGestureDetectorKt$drag$1(continuation);
            }
        }
        Object objM4973awaitDragOrCancellationrnUCldI = dragGestureDetectorKt$drag$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = dragGestureDetectorKt$drag$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM4973awaitDragOrCancellationrnUCldI);
            dragGestureDetectorKt$drag$1.L$0 = awaitPointerEventScope;
            dragGestureDetectorKt$drag$1.L$1 = function1;
            dragGestureDetectorKt$drag$1.label = 1;
            objM4973awaitDragOrCancellationrnUCldI = m4973awaitDragOrCancellationrnUCldI(awaitPointerEventScope, j, dragGestureDetectorKt$drag$1);
            if (objM4973awaitDragOrCancellationrnUCldI == coroutine_suspended) {
            }
            pointerInputChange = (PointerInputChange) objM4973awaitDragOrCancellationrnUCldI;
            if (pointerInputChange == null) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Function1<? super PointerInputChange, Unit> function12 = (Function1) dragGestureDetectorKt$drag$1.L$1;
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) dragGestureDetectorKt$drag$1.L$0;
            ResultKt.throwOnFailure(objM4973awaitDragOrCancellationrnUCldI);
            function1 = function12;
            awaitPointerEventScope = awaitPointerEventScope2;
            pointerInputChange = (PointerInputChange) objM4973awaitDragOrCancellationrnUCldI;
            if (pointerInputChange == null) {
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    return boxing.boxBoolean(true);
                }
                function1.invoke(pointerInputChange);
                j = pointerInputChange.getId();
                dragGestureDetectorKt$drag$1.L$0 = awaitPointerEventScope;
                dragGestureDetectorKt$drag$1.L$1 = function1;
                dragGestureDetectorKt$drag$1.label = 1;
                objM4973awaitDragOrCancellationrnUCldI = m4973awaitDragOrCancellationrnUCldI(awaitPointerEventScope, j, dragGestureDetectorKt$drag$1);
                if (objM4973awaitDragOrCancellationrnUCldI == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pointerInputChange = (PointerInputChange) objM4973awaitDragOrCancellationrnUCldI;
                if (pointerInputChange == null) {
                    return boxing.boxBoolean(false);
                }
            }
        }
    }

    static {
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl((float) 0.125d);
        mouseSlop = fM7995constructorimpl;
        float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(18);
        defaultTouchSlop = fM7995constructorimpl2;
        mouseToTouchSlopRatio = fM7995constructorimpl / fM7995constructorimpl2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d0, code lost:
    
        if (androidx.compose.p011ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /* renamed from: awaitDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4973awaitDragOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitDragOrCancellation$1 dragGestureDetectorKt$awaitDragOrCancellation$1;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object objAwaitPointerEvent$default;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DragGestureDetectorKt$awaitDragOrCancellation$1) {
            dragGestureDetectorKt$awaitDragOrCancellation$1 = (DragGestureDetectorKt$awaitDragOrCancellation$1) continuation;
            int i = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitDragOrCancellation$1.label = i - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitDragOrCancellation$1 = new DragGestureDetectorKt$awaitDragOrCancellation$1(continuation);
            }
        }
        Object obj = dragGestureDetectorKt$awaitDragOrCancellation$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitDragOrCancellation$1.L$1;
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitDragOrCancellation$1.L$0;
            ResultKt.throwOnFailure(obj);
            Ref.LongRef longRef3 = longRef2;
            awaitPointerEventScope2 = awaitPointerEventScope3;
            PointerEvent pointerEvent = (PointerEvent) obj;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i4 < size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i4);
                if (PointerId.m7170equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
                    break;
                }
                i4++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null) {
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    while (true) {
                        if (i3 >= size2) {
                            pointerInputChange2 = null;
                            break;
                        }
                        pointerInputChange2 = changes2.get(i3);
                        if (pointerInputChange2.getPressed()) {
                            break;
                        }
                        i3++;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange2;
                    if (pointerInputChange4 != null) {
                        longRef3.element = pointerInputChange4.getId();
                        longRef = longRef3;
                    }
                }
                dragGestureDetectorKt$awaitDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitDragOrCancellation$1.L$1 = longRef;
                dragGestureDetectorKt$awaitDragOrCancellation$1.label = 1;
                objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitDragOrCancellation$1, 1, null);
                if (objAwaitPointerEvent$default != coroutine_suspended) {
                    return coroutine_suspended;
                }
                Ref.LongRef longRef4 = longRef;
                obj = objAwaitPointerEvent$default;
                longRef3 = longRef4;
                PointerEvent pointerEvent2 = (PointerEvent) obj;
                List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                int size3 = changes3.size();
                int i32 = 0;
                int i42 = 0;
                while (true) {
                    if (i42 < size3) {
                    }
                    i42++;
                }
                PointerInputChange pointerInputChange32 = pointerInputChange;
                if (pointerInputChange32 == null) {
                    pointerInputChange32 = null;
                }
            }
            if (pointerInputChange32 == null || pointerInputChange32.isConsumed()) {
                return null;
            }
            return pointerInputChange32;
        }
        ResultKt.throwOnFailure(obj);
        if (m4981isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
            return null;
        }
        longRef = new Ref.LongRef();
        longRef.element = j;
        awaitPointerEventScope2 = awaitPointerEventScope;
        dragGestureDetectorKt$awaitDragOrCancellation$1.L$0 = awaitPointerEventScope2;
        dragGestureDetectorKt$awaitDragOrCancellation$1.L$1 = longRef;
        dragGestureDetectorKt$awaitDragOrCancellation$1.label = 1;
        objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitDragOrCancellation$1, 1, null);
        if (objAwaitPointerEvent$default != coroutine_suspended) {
        }
    }

    public static /* synthetic */ Object detectDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.2
                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m4983invokek4lQ0M(long j) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m4983invokek4lQ0M(offset.getPackedValue());
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 4) != 0) {
            function02 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        Function0 function03 = function02;
        return detectDragGestures(pointerInputScope, function1, function0, function03, function2, continuation);
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, final Function1<? super Offset, Unit> function1, final Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super Unit> continuation) {
        Object objDetectDragGestures = detectDragGestures(pointerInputScope, new Function3<PointerInputChange, PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, Offset offset) {
                m4984invoke0AR0LA0(pointerInputChange, pointerInputChange2, offset.getPackedValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-0AR0LA0, reason: not valid java name */
            public final void m4984invoke0AR0LA0(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j) {
                function1.invoke(Offset.m6534boximpl(pointerInputChange2.getPosition()));
            }
        }, new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
                invoke2(pointerInputChange);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PointerInputChange pointerInputChange) {
                function0.invoke();
            }
        }, function02, new Function0<Boolean>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.TRUE;
            }
        }, null, function2, continuation);
        return objDetectDragGestures == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectDragGestures : Unit.INSTANCE;
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, Function3<? super PointerInputChange, ? super PointerInputChange, ? super Offset, Unit> function3, Function1<? super PointerInputChange, Unit> function1, Function0<Unit> function0, Function0<Boolean> function02, Orientation orientation, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new C10969(function02, new Ref.LongRef(), orientation, function3, function2, function0, function1, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9", m3645f = "DragGestureDetector.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, 1061, 1101, EnumC7081g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, 1148, 1190, 1202}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9 */
    /* loaded from: classes4.dex */
    static final class C10969 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
        final /* synthetic */ Function0<Unit> $onDragCancel;
        final /* synthetic */ Function1<PointerInputChange, Unit> $onDragEnd;
        final /* synthetic */ Function3<PointerInputChange, PointerInputChange, Offset, Unit> $onDragStart;
        final /* synthetic */ Orientation $orientationLock;
        final /* synthetic */ Ref.LongRef $overSlop;
        final /* synthetic */ Function0<Boolean> $shouldAwaitTouchSlop;
        float F$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C10969(Function0<Boolean> function0, Ref.LongRef longRef, Orientation orientation, Function3<? super PointerInputChange, ? super PointerInputChange, ? super Offset, Unit> function3, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Function0<Unit> function02, Function1<? super PointerInputChange, Unit> function1, Continuation<? super C10969> continuation) {
            super(2, continuation);
            this.$shouldAwaitTouchSlop = function0;
            this.$overSlop = longRef;
            this.$orientationLock = orientation;
            this.$onDragStart = function3;
            this.$onDrag = function2;
            this.$onDragCancel = function02;
            this.$onDragEnd = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C10969 c10969 = new C10969(this.$shouldAwaitTouchSlop, this.$overSlop, this.$orientationLock, this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, continuation);
            c10969.L$0 = obj;
            return c10969;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C10969) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:164:0x04b8, code lost:
        
            if (androidx.compose.foundation.gestures.DragGestureDetectorKt.m4981isPointerUpDmW0f2w(r2.getCurrentEvent(), r0) != false) goto L165;
         */
        /* JADX WARN: Code restructure failed: missing block: B:168:0x04e0, code lost:
        
            if (r9 != r6) goto L170;
         */
        /* JADX WARN: Code restructure failed: missing block: B:205:0x056d, code lost:
        
            if (r8 == false) goto L206;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x02fb, code lost:
        
            if (r4 == r6) goto L169;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:182:0x051a, B:193:0x0546], limit reached: 221 */
        /* JADX WARN: Removed duplicated region for block: B:118:0x03c0 A[PHI: r0 r1 r2 r4 r7 r9 r10 r11 r16 r18
          0x03c0: PHI (r0v21 float) = (r0v19 float), (r0v22 float) binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r1v36 androidx.compose.ui.input.pointer.PointerInputChange) = 
          (r1v34 androidx.compose.ui.input.pointer.PointerInputChange)
          (r1v38 androidx.compose.ui.input.pointer.PointerInputChange)
         binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r2v26 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
          (r2v24 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
          (r2v29 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
         binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r4v19 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
          (r4v17 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
          (r4v20 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
         binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r7v30 androidx.compose.foundation.gestures.TouchSlopDetector) = 
          (r7v28 androidx.compose.foundation.gestures.TouchSlopDetector)
          (r7v32 androidx.compose.foundation.gestures.TouchSlopDetector)
         binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r9v13 java.lang.Object) = (r9v12 java.lang.Object), (r9v21 java.lang.Object) binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r10v9 kotlin.jvm.internal.Ref$LongRef) = (r10v7 kotlin.jvm.internal.Ref$LongRef), (r10v10 kotlin.jvm.internal.Ref$LongRef) binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r11v20 kotlin.jvm.internal.Ref$LongRef) = (r11v18 kotlin.jvm.internal.Ref$LongRef), (r11v21 kotlin.jvm.internal.Ref$LongRef) binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r16v16 long) = (r16v14 long), (r16v17 long) binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r18v12 long) = (r18v10 long), (r18v13 long) binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:120:0x03d0  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x0406  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x0433  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x047b  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x047f  */
        /* JADX WARN: Removed duplicated region for block: B:163:0x048e  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:233:0x03f0 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:237:0x0215 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x01b2  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x01b5  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x01e6 A[PHI: r0 r1 r2 r4 r5 r7 r8 r9 r11 r16 r18
          0x01e6: PHI (r0v10 float) = (r0v9 float), (r0v11 float) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r1v18 androidx.compose.ui.input.pointer.PointerInputChange) = 
          (r1v17 androidx.compose.ui.input.pointer.PointerInputChange)
          (r1v20 androidx.compose.ui.input.pointer.PointerInputChange)
         binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r2v8 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
          (r2v7 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
          (r2v11 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
         binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r4v5 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
          (r4v4 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
          (r4v6 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
         binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r5v5 androidx.compose.foundation.gestures.TouchSlopDetector) = 
          (r5v4 androidx.compose.foundation.gestures.TouchSlopDetector)
          (r5v6 androidx.compose.foundation.gestures.TouchSlopDetector)
         binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r7v7 java.lang.Object) = (r7v6 java.lang.Object), (r7v17 java.lang.Object) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r8v4 kotlin.jvm.internal.Ref$LongRef) = (r8v3 kotlin.jvm.internal.Ref$LongRef), (r8v6 kotlin.jvm.internal.Ref$LongRef) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r9v2 kotlin.jvm.internal.Ref$LongRef) = (r9v1 kotlin.jvm.internal.Ref$LongRef), (r9v3 kotlin.jvm.internal.Ref$LongRef) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r11v1 int) = (r11v0 int), (r11v14 int) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r16v6 long) = (r16v5 long), (r16v7 long) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r18v2 long) = (r18v1 long), (r18v3 long) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x01f6  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x022e  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x025a  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x02a0  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x02a6  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x02b2  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x02b9  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x02c2 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x02d6  */
        /* JADX WARN: Type inference failed for: r13v10, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
        /* JADX WARN: Type inference failed for: r13v11 */
        /* JADX WARN: Type inference failed for: r13v12 */
        /* JADX WARN: Type inference failed for: r13v2 */
        /* JADX WARN: Type inference failed for: r13v3 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x0389 -> B:113:0x038b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x03f7 -> B:113:0x038b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x044c -> B:81:0x02be). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x0453 -> B:115:0x03a4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:154:0x0473 -> B:155:0x0475). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x0485 -> B:81:0x02be). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x04e0 -> B:170:0x04e3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x01b2 -> B:74:0x02a4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x021d -> B:43:0x021e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x026f -> B:74:0x02a4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0297 -> B:71:0x029a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0333 -> B:89:0x02e3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long j;
            AwaitPointerEventScope awaitPointerEventScope;
            Object objAwaitFirstDown;
            PointerInputChange pointerInputChange;
            boolean zBooleanValue;
            Object objAwaitFirstDown$default;
            AwaitPointerEventScope awaitPointerEventScope2;
            boolean z;
            PointerInputChange pointerInputChange2;
            long j2;
            float fM4982pointerSlopE8SPZFQ;
            Ref.LongRef longRef;
            AwaitPointerEventScope awaitPointerEventScope3;
            Ref.LongRef longRef2;
            TouchSlopDetector touchSlopDetector;
            Object objAwaitPointerEvent$default;
            int size;
            int i;
            PointerInputChange pointerInputChange3;
            PointerInputChange pointerInputChange4;
            Ref.LongRef longRef3;
            PointerInputChange pointerInputChange5;
            PointerInputChange pointerInputChange6;
            PointerInputChange pointerInputChange7;
            int i2;
            long id;
            PointerInputChange pointerInputChange8;
            Object objAwaitPointerEvent;
            float fM4982pointerSlopE8SPZFQ2;
            TouchSlopDetector touchSlopDetector2;
            Object objAwaitPointerEvent$default2;
            Ref.LongRef longRef4;
            Ref.LongRef longRef5;
            AwaitPointerEventScope awaitPointerEventScope4;
            PointerEventPass pointerEventPass;
            PointerEvent pointerEvent;
            int size2;
            int i3;
            PointerEvent pointerEvent2;
            PointerInputChange pointerInputChange9;
            PointerInputChange pointerInputChange10;
            PointerInputChange pointerInputChange11;
            PointerInputChange pointerInputChange12;
            PointerInputChange pointerInputChange13;
            int i4;
            long id2;
            Function2<PointerInputChange, Offset, Unit> function2;
            Orientation orientation;
            int size3;
            int i5;
            PointerInputChange pointerInputChange14;
            PointerInputChange pointerInputChange15;
            boolean z2;
            PointerInputChange pointerInputChange16;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = 0;
            int i7 = 1;
            PointerEventPass pointerEventPass2 = 0;
            switch (this.label) {
                case 0:
                    j = 9205357640488583168L;
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    PointerEventPass pointerEventPass3 = PointerEventPass.Initial;
                    this.L$0 = awaitPointerEventScope;
                    this.label = 1;
                    objAwaitFirstDown = TapGestureDetector4.awaitFirstDown(awaitPointerEventScope, false, pointerEventPass3, this);
                    if (objAwaitFirstDown != coroutine_suspended) {
                        pointerInputChange = (PointerInputChange) objAwaitFirstDown;
                        zBooleanValue = this.$shouldAwaitTouchSlop.invoke().booleanValue();
                        if (!zBooleanValue) {
                            pointerInputChange.consume();
                        }
                        this.L$0 = awaitPointerEventScope;
                        this.L$1 = pointerInputChange;
                        this.Z$0 = zBooleanValue;
                        this.label = 2;
                        objAwaitFirstDown$default = TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
                        if (objAwaitFirstDown$default != coroutine_suspended) {
                            awaitPointerEventScope2 = awaitPointerEventScope;
                            z = zBooleanValue;
                            pointerInputChange2 = (PointerInputChange) objAwaitFirstDown$default;
                            this.$overSlop.element = Offset.INSTANCE.m6553getZeroF1C5BW0();
                            if (!z) {
                                j2 = 9223372034707292159L;
                                if (ComposeFoundationFlags.DragGesturePickUpEnabled && pointerInputChange == null) {
                                    List<PointerInputChange> changes = awaitPointerEventScope2.getCurrentEvent().getChanges();
                                    size3 = changes.size();
                                    for (i5 = 0; i5 < size3; i5++) {
                                        if (changes.get(i5).getPressed()) {
                                            pointerInputChange8 = pointerInputChange;
                                            PointerEventPass pointerEventPass4 = PointerEventPass.Final;
                                            this.L$0 = awaitPointerEventScope2;
                                            this.L$1 = pointerInputChange2;
                                            this.L$2 = pointerInputChange8;
                                            this.L$3 = null;
                                            this.L$4 = null;
                                            this.L$5 = null;
                                            this.L$6 = null;
                                            this.label = 5;
                                            objAwaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass4, this);
                                            break;
                                        }
                                    }
                                }
                                if (pointerInputChange != null) {
                                    this.$onDragStart.invoke(pointerInputChange2, pointerInputChange, Offset.m6534boximpl(this.$overSlop.element));
                                    this.$onDrag.invoke(pointerInputChange, Offset.m6534boximpl(this.$overSlop.element));
                                    id2 = pointerInputChange.getId();
                                    function2 = this.$onDrag;
                                    orientation = this.$orientationLock;
                                    break;
                                }
                                return Unit.INSTANCE;
                            }
                            id = pointerInputChange2.getId();
                            int type2 = pointerInputChange2.getType();
                            Orientation orientation2 = this.$orientationLock;
                            longRef = this.$overSlop;
                            long jM6553getZeroF1C5BW0 = Offset.INSTANCE.m6553getZeroF1C5BW0();
                            j2 = 9223372034707292159L;
                            if (!DragGestureDetectorKt.m4981isPointerUpDmW0f2w(awaitPointerEventScope2.getCurrentEvent(), id)) {
                                pointerInputChange = pointerEventPass2;
                                if (pointerInputChange != null && !pointerInputChange.isConsumed()) {
                                    i6 = 0;
                                    i7 = 1;
                                    pointerEventPass2 = 0;
                                    id = pointerInputChange2.getId();
                                    int type22 = pointerInputChange2.getType();
                                    Orientation orientation22 = this.$orientationLock;
                                    longRef = this.$overSlop;
                                    long jM6553getZeroF1C5BW02 = Offset.INSTANCE.m6553getZeroF1C5BW0();
                                    j2 = 9223372034707292159L;
                                    if (!DragGestureDetectorKt.m4981isPointerUpDmW0f2w(awaitPointerEventScope2.getCurrentEvent(), id)) {
                                        fM4982pointerSlopE8SPZFQ = DragGestureDetectorKt.m4982pointerSlopE8SPZFQ(awaitPointerEventScope2.getViewConfiguration(), type22);
                                        longRef2 = new Ref.LongRef();
                                        longRef2.element = id;
                                        touchSlopDetector = new TouchSlopDetector(orientation22, jM6553getZeroF1C5BW02, pointerEventPass2);
                                        awaitPointerEventScope3 = awaitPointerEventScope2;
                                        this.L$0 = awaitPointerEventScope3;
                                        this.L$1 = pointerInputChange2;
                                        this.L$2 = awaitPointerEventScope2;
                                        this.L$3 = longRef;
                                        this.L$4 = longRef2;
                                        this.L$5 = touchSlopDetector;
                                        this.L$6 = pointerEventPass2;
                                        this.F$0 = fM4982pointerSlopE8SPZFQ;
                                        this.label = 3;
                                        objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, this, i7, pointerEventPass2);
                                        if (objAwaitPointerEvent$default != coroutine_suspended) {
                                            PointerEvent pointerEvent3 = (PointerEvent) objAwaitPointerEvent$default;
                                            List<PointerInputChange> changes2 = pointerEvent3.getChanges();
                                            size = changes2.size();
                                            i = i6;
                                            while (true) {
                                                if (i >= size) {
                                                    pointerInputChange3 = changes2.get(i);
                                                    i2 = size;
                                                    if (!PointerId.m7170equalsimpl0(pointerInputChange3.getId(), longRef2.element)) {
                                                        i++;
                                                        size = i2;
                                                    }
                                                } else {
                                                    pointerInputChange3 = null;
                                                }
                                            }
                                            pointerInputChange4 = pointerInputChange3;
                                            if (pointerInputChange4 != null && !pointerInputChange4.isConsumed()) {
                                                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                                                    long jM5048addPointerInputChangedBAh8RU = touchSlopDetector.m5048addPointerInputChangedBAh8RU(pointerInputChange4, fM4982pointerSlopE8SPZFQ);
                                                    if ((jM5048addPointerInputChangedBAh8RU & j2) != j) {
                                                        pointerInputChange4.consume();
                                                        longRef.element = jM5048addPointerInputChangedBAh8RU;
                                                        if (pointerInputChange4.isConsumed()) {
                                                            awaitPointerEventScope2 = awaitPointerEventScope3;
                                                            pointerInputChange = pointerInputChange4;
                                                            if (pointerInputChange != null) {
                                                                i6 = 0;
                                                                i7 = 1;
                                                                pointerEventPass2 = 0;
                                                                id = pointerInputChange2.getId();
                                                                int type222 = pointerInputChange2.getType();
                                                                Orientation orientation222 = this.$orientationLock;
                                                                longRef = this.$overSlop;
                                                                long jM6553getZeroF1C5BW022 = Offset.INSTANCE.m6553getZeroF1C5BW0();
                                                                j2 = 9223372034707292159L;
                                                                if (!DragGestureDetectorKt.m4981isPointerUpDmW0f2w(awaitPointerEventScope2.getCurrentEvent(), id)) {
                                                                }
                                                            }
                                                        } else {
                                                            touchSlopDetector.reset();
                                                            i6 = 0;
                                                            i7 = 1;
                                                            pointerEventPass2 = 0;
                                                        }
                                                    } else {
                                                        PointerEventPass pointerEventPass5 = PointerEventPass.Final;
                                                        this.L$0 = awaitPointerEventScope3;
                                                        this.L$1 = pointerInputChange2;
                                                        this.L$2 = awaitPointerEventScope2;
                                                        this.L$3 = longRef;
                                                        this.L$4 = longRef2;
                                                        this.L$5 = touchSlopDetector;
                                                        this.L$6 = pointerInputChange4;
                                                        this.F$0 = fM4982pointerSlopE8SPZFQ;
                                                        this.label = 4;
                                                        if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass5, this) != coroutine_suspended) {
                                                            longRef3 = longRef;
                                                            pointerInputChange5 = pointerInputChange2;
                                                            pointerInputChange6 = pointerInputChange4;
                                                            if (pointerInputChange6.isConsumed()) {
                                                                pointerInputChange2 = pointerInputChange5;
                                                                i6 = 0;
                                                                i7 = 1;
                                                                pointerEventPass2 = 0;
                                                                longRef = longRef3;
                                                            } else {
                                                                awaitPointerEventScope2 = awaitPointerEventScope3;
                                                                pointerInputChange2 = pointerInputChange5;
                                                                pointerInputChange = null;
                                                                if (pointerInputChange != null) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    List<PointerInputChange> changes3 = pointerEvent3.getChanges();
                                                    int size4 = changes3.size();
                                                    int i8 = 0;
                                                    while (true) {
                                                        if (i8 < size4) {
                                                            pointerInputChange7 = changes3.get(i8);
                                                            if (!pointerInputChange7.getPressed()) {
                                                                i8++;
                                                            }
                                                        } else {
                                                            pointerInputChange7 = null;
                                                        }
                                                    }
                                                    PointerInputChange pointerInputChange17 = pointerInputChange7;
                                                    if (pointerInputChange17 != null) {
                                                        longRef2.element = pointerInputChange17.getId();
                                                        i6 = 0;
                                                        i7 = 1;
                                                        pointerEventPass2 = 0;
                                                    }
                                                }
                                                this.L$0 = awaitPointerEventScope3;
                                                this.L$1 = pointerInputChange2;
                                                this.L$2 = awaitPointerEventScope2;
                                                this.L$3 = longRef;
                                                this.L$4 = longRef2;
                                                this.L$5 = touchSlopDetector;
                                                this.L$6 = pointerEventPass2;
                                                this.F$0 = fM4982pointerSlopE8SPZFQ;
                                                this.label = 3;
                                                objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, this, i7, pointerEventPass2);
                                                if (objAwaitPointerEvent$default != coroutine_suspended) {
                                                }
                                            }
                                            awaitPointerEventScope2 = awaitPointerEventScope3;
                                            pointerInputChange = null;
                                            if (pointerInputChange != null) {
                                            }
                                        }
                                    }
                                }
                                if (ComposeFoundationFlags.DragGesturePickUpEnabled) {
                                    List<PointerInputChange> changes4 = awaitPointerEventScope2.getCurrentEvent().getChanges();
                                    size3 = changes4.size();
                                    while (i5 < size3) {
                                    }
                                }
                                if (pointerInputChange != null) {
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    j = 9205357640488583168L;
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objAwaitFirstDown = obj;
                    pointerInputChange = (PointerInputChange) objAwaitFirstDown;
                    zBooleanValue = this.$shouldAwaitTouchSlop.invoke().booleanValue();
                    if (!zBooleanValue) {
                    }
                    this.L$0 = awaitPointerEventScope;
                    this.L$1 = pointerInputChange;
                    this.Z$0 = zBooleanValue;
                    this.label = 2;
                    objAwaitFirstDown$default = TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
                    if (objAwaitFirstDown$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 2:
                    j = 9205357640488583168L;
                    z = this.Z$0;
                    PointerInputChange pointerInputChange18 = (PointerInputChange) this.L$1;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    pointerInputChange = pointerInputChange18;
                    objAwaitFirstDown$default = obj;
                    pointerInputChange2 = (PointerInputChange) objAwaitFirstDown$default;
                    this.$overSlop.element = Offset.INSTANCE.m6553getZeroF1C5BW0();
                    if (!z) {
                    }
                    id = pointerInputChange2.getId();
                    int type2222 = pointerInputChange2.getType();
                    Orientation orientation2222 = this.$orientationLock;
                    longRef = this.$overSlop;
                    long jM6553getZeroF1C5BW0222 = Offset.INSTANCE.m6553getZeroF1C5BW0();
                    j2 = 9223372034707292159L;
                    if (!DragGestureDetectorKt.m4981isPointerUpDmW0f2w(awaitPointerEventScope2.getCurrentEvent(), id)) {
                    }
                    break;
                case 3:
                    j = 9205357640488583168L;
                    fM4982pointerSlopE8SPZFQ = this.F$0;
                    TouchSlopDetector touchSlopDetector3 = (TouchSlopDetector) this.L$5;
                    Ref.LongRef longRef6 = (Ref.LongRef) this.L$4;
                    Ref.LongRef longRef7 = (Ref.LongRef) this.L$3;
                    AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) this.L$2;
                    PointerInputChange pointerInputChange19 = (PointerInputChange) this.L$1;
                    AwaitPointerEventScope awaitPointerEventScope6 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    longRef = longRef7;
                    awaitPointerEventScope3 = awaitPointerEventScope6;
                    longRef2 = longRef6;
                    awaitPointerEventScope2 = awaitPointerEventScope5;
                    j2 = 9223372034707292159L;
                    touchSlopDetector = touchSlopDetector3;
                    pointerInputChange2 = pointerInputChange19;
                    objAwaitPointerEvent$default = obj;
                    PointerEvent pointerEvent32 = (PointerEvent) objAwaitPointerEvent$default;
                    List<PointerInputChange> changes22 = pointerEvent32.getChanges();
                    size = changes22.size();
                    i = i6;
                    while (true) {
                        if (i >= size) {
                        }
                        i++;
                        size = i2;
                    }
                    pointerInputChange4 = pointerInputChange3;
                    if (pointerInputChange4 != null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                        }
                        this.L$0 = awaitPointerEventScope3;
                        this.L$1 = pointerInputChange2;
                        this.L$2 = awaitPointerEventScope2;
                        this.L$3 = longRef;
                        this.L$4 = longRef2;
                        this.L$5 = touchSlopDetector;
                        this.L$6 = pointerEventPass2;
                        this.F$0 = fM4982pointerSlopE8SPZFQ;
                        this.label = 3;
                        objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, this, i7, pointerEventPass2);
                        if (objAwaitPointerEvent$default != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    pointerInputChange = null;
                    if (pointerInputChange != null) {
                    }
                    if (ComposeFoundationFlags.DragGesturePickUpEnabled) {
                    }
                    if (pointerInputChange != null) {
                    }
                    return Unit.INSTANCE;
                case 4:
                    j = 9205357640488583168L;
                    fM4982pointerSlopE8SPZFQ = this.F$0;
                    pointerInputChange6 = (PointerInputChange) this.L$6;
                    TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) this.L$5;
                    Ref.LongRef longRef8 = (Ref.LongRef) this.L$4;
                    Ref.LongRef longRef9 = (Ref.LongRef) this.L$3;
                    AwaitPointerEventScope awaitPointerEventScope7 = (AwaitPointerEventScope) this.L$2;
                    pointerInputChange5 = (PointerInputChange) this.L$1;
                    AwaitPointerEventScope awaitPointerEventScope8 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    touchSlopDetector = touchSlopDetector4;
                    awaitPointerEventScope2 = awaitPointerEventScope7;
                    longRef3 = longRef9;
                    longRef2 = longRef8;
                    awaitPointerEventScope3 = awaitPointerEventScope8;
                    j2 = 9223372034707292159L;
                    if (pointerInputChange6.isConsumed()) {
                    }
                    break;
                case 5:
                    j = 9205357640488583168L;
                    pointerInputChange8 = (PointerInputChange) this.L$2;
                    pointerInputChange2 = (PointerInputChange) this.L$1;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objAwaitPointerEvent = obj;
                    j2 = 9223372034707292159L;
                    PointerEvent pointerEvent4 = (PointerEvent) objAwaitPointerEvent;
                    List<PointerInputChange> changes5 = pointerEvent4.getChanges();
                    int size5 = changes5.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 < size5) {
                            if (changes5.get(i9).isConsumed()) {
                                List<PointerInputChange> changes6 = pointerEvent4.getChanges();
                                int size6 = changes6.size();
                                for (int i10 = 0; i10 < size6; i10++) {
                                    if (changes6.get(i10).getPressed()) {
                                        break;
                                    }
                                }
                            } else {
                                i9++;
                            }
                        }
                    }
                    List<PointerInputChange> changes7 = pointerEvent4.getChanges();
                    int size7 = changes7.size();
                    for (int i11 = 0; i11 < size7; i11++) {
                        if (changes7.get(i11).getPressed()) {
                            PointerInputChange pointerInputChange20 = (PointerInputChange) CollectionsKt.firstOrNull((List) pointerEvent4.getChanges());
                            long jM6546minusMKHz9U = Offset.m6546minusMKHz9U(pointerInputChange20 != null ? pointerInputChange20.getPosition() : Offset.INSTANCE.m6553getZeroF1C5BW0(), pointerInputChange2.getPosition());
                            long id3 = pointerInputChange2.getId();
                            int type3 = pointerInputChange2.getType();
                            Orientation orientation3 = this.$orientationLock;
                            longRef5 = this.$overSlop;
                            if (!DragGestureDetectorKt.m4981isPointerUpDmW0f2w(awaitPointerEventScope2.getCurrentEvent(), id3)) {
                                fM4982pointerSlopE8SPZFQ2 = DragGestureDetectorKt.m4982pointerSlopE8SPZFQ(awaitPointerEventScope2.getViewConfiguration(), type3);
                                longRef4 = new Ref.LongRef();
                                longRef4.element = id3;
                                pointerEventPass = null;
                                touchSlopDetector2 = new TouchSlopDetector(orientation3, jM6546minusMKHz9U, null);
                                awaitPointerEventScope4 = awaitPointerEventScope2;
                                this.L$0 = awaitPointerEventScope4;
                                this.L$1 = pointerInputChange2;
                                this.L$2 = awaitPointerEventScope2;
                                this.L$3 = longRef5;
                                this.L$4 = longRef4;
                                this.L$5 = touchSlopDetector2;
                                this.L$6 = pointerEventPass;
                                this.F$0 = fM4982pointerSlopE8SPZFQ2;
                                this.label = 6;
                                objAwaitPointerEvent$default2 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, this, 1, pointerEventPass);
                                if (objAwaitPointerEvent$default2 != coroutine_suspended) {
                                    pointerEvent = (PointerEvent) objAwaitPointerEvent$default2;
                                    List<PointerInputChange> changes8 = pointerEvent.getChanges();
                                    size2 = changes8.size();
                                    i3 = 0;
                                    while (true) {
                                        if (i3 >= size2) {
                                            PointerInputChange pointerInputChange21 = changes8.get(i3);
                                            i4 = size2;
                                            pointerEvent2 = pointerEvent;
                                            if (PointerId.m7170equalsimpl0(pointerInputChange21.getId(), longRef4.element)) {
                                                pointerInputChange9 = pointerInputChange21;
                                            } else {
                                                i3++;
                                                pointerEvent = pointerEvent2;
                                                size2 = i4;
                                            }
                                        } else {
                                            pointerEvent2 = pointerEvent;
                                            pointerInputChange9 = null;
                                        }
                                    }
                                    pointerInputChange10 = pointerInputChange9;
                                    if (pointerInputChange10 != null && !pointerInputChange10.isConsumed()) {
                                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange10)) {
                                            List<PointerInputChange> changes9 = pointerEvent2.getChanges();
                                            int size8 = changes9.size();
                                            int i12 = 0;
                                            while (true) {
                                                if (i12 < size8) {
                                                    PointerInputChange pointerInputChange22 = changes9.get(i12);
                                                    if (pointerInputChange22.getPressed()) {
                                                        pointerInputChange13 = pointerInputChange22;
                                                    } else {
                                                        i12++;
                                                    }
                                                } else {
                                                    pointerInputChange13 = null;
                                                }
                                            }
                                            PointerInputChange pointerInputChange23 = pointerInputChange13;
                                            if (pointerInputChange23 != null) {
                                                longRef4.element = pointerInputChange23.getId();
                                            }
                                        } else if ((touchSlopDetector2.m5048addPointerInputChangedBAh8RU(pointerInputChange10, fM4982pointerSlopE8SPZFQ2) & j2) != j) {
                                            pointerInputChange10.consume();
                                            longRef5.element = PointerEventKt.positionChange(pointerInputChange10);
                                            if (pointerInputChange10.isConsumed()) {
                                                awaitPointerEventScope2 = awaitPointerEventScope4;
                                                pointerInputChange = pointerInputChange10;
                                                if (ComposeFoundationFlags.DragGesturePickUpEnabled) {
                                                }
                                                if (pointerInputChange != null) {
                                                }
                                                return Unit.INSTANCE;
                                            }
                                            touchSlopDetector2.reset();
                                        } else {
                                            PointerEventPass pointerEventPass6 = PointerEventPass.Final;
                                            this.L$0 = awaitPointerEventScope4;
                                            this.L$1 = pointerInputChange2;
                                            this.L$2 = awaitPointerEventScope2;
                                            this.L$3 = longRef5;
                                            this.L$4 = longRef4;
                                            this.L$5 = touchSlopDetector2;
                                            this.L$6 = pointerInputChange10;
                                            this.F$0 = fM4982pointerSlopE8SPZFQ2;
                                            this.label = 7;
                                            if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass6, this) != coroutine_suspended) {
                                                pointerInputChange11 = pointerInputChange2;
                                                pointerInputChange12 = pointerInputChange10;
                                                if (pointerInputChange12.isConsumed()) {
                                                    pointerInputChange2 = pointerInputChange11;
                                                } else {
                                                    awaitPointerEventScope2 = awaitPointerEventScope4;
                                                    pointerInputChange2 = pointerInputChange11;
                                                }
                                            }
                                        }
                                        pointerEventPass = null;
                                        this.L$0 = awaitPointerEventScope4;
                                        this.L$1 = pointerInputChange2;
                                        this.L$2 = awaitPointerEventScope2;
                                        this.L$3 = longRef5;
                                        this.L$4 = longRef4;
                                        this.L$5 = touchSlopDetector2;
                                        this.L$6 = pointerEventPass;
                                        this.F$0 = fM4982pointerSlopE8SPZFQ2;
                                        this.label = 6;
                                        objAwaitPointerEvent$default2 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, this, 1, pointerEventPass);
                                        if (objAwaitPointerEvent$default2 != coroutine_suspended) {
                                        }
                                    }
                                    awaitPointerEventScope2 = awaitPointerEventScope4;
                                }
                                return coroutine_suspended;
                            }
                            pointerInputChange = null;
                            if (ComposeFoundationFlags.DragGesturePickUpEnabled) {
                            }
                            if (pointerInputChange != null) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    pointerInputChange = pointerInputChange8;
                    if (ComposeFoundationFlags.DragGesturePickUpEnabled) {
                    }
                    if (pointerInputChange != null) {
                    }
                    return Unit.INSTANCE;
                case 6:
                    j = 9205357640488583168L;
                    fM4982pointerSlopE8SPZFQ2 = this.F$0;
                    TouchSlopDetector touchSlopDetector5 = (TouchSlopDetector) this.L$5;
                    Ref.LongRef longRef10 = (Ref.LongRef) this.L$4;
                    Ref.LongRef longRef11 = (Ref.LongRef) this.L$3;
                    AwaitPointerEventScope awaitPointerEventScope9 = (AwaitPointerEventScope) this.L$2;
                    PointerInputChange pointerInputChange24 = (PointerInputChange) this.L$1;
                    AwaitPointerEventScope awaitPointerEventScope10 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    touchSlopDetector2 = touchSlopDetector5;
                    pointerInputChange2 = pointerInputChange24;
                    objAwaitPointerEvent$default2 = obj;
                    longRef4 = longRef10;
                    longRef5 = longRef11;
                    awaitPointerEventScope2 = awaitPointerEventScope9;
                    awaitPointerEventScope4 = awaitPointerEventScope10;
                    j2 = 9223372034707292159L;
                    pointerEvent = (PointerEvent) objAwaitPointerEvent$default2;
                    List<PointerInputChange> changes82 = pointerEvent.getChanges();
                    size2 = changes82.size();
                    i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                        }
                        i3++;
                        pointerEvent = pointerEvent2;
                        size2 = i4;
                    }
                    pointerInputChange10 = pointerInputChange9;
                    if (pointerInputChange10 != null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange10)) {
                        }
                        pointerEventPass = null;
                        this.L$0 = awaitPointerEventScope4;
                        this.L$1 = pointerInputChange2;
                        this.L$2 = awaitPointerEventScope2;
                        this.L$3 = longRef5;
                        this.L$4 = longRef4;
                        this.L$5 = touchSlopDetector2;
                        this.L$6 = pointerEventPass;
                        this.F$0 = fM4982pointerSlopE8SPZFQ2;
                        this.label = 6;
                        objAwaitPointerEvent$default2 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, this, 1, pointerEventPass);
                        if (objAwaitPointerEvent$default2 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    pointerInputChange = null;
                    if (ComposeFoundationFlags.DragGesturePickUpEnabled) {
                    }
                    if (pointerInputChange != null) {
                    }
                    return Unit.INSTANCE;
                case 7:
                    fM4982pointerSlopE8SPZFQ2 = this.F$0;
                    pointerInputChange12 = (PointerInputChange) this.L$6;
                    TouchSlopDetector touchSlopDetector6 = (TouchSlopDetector) this.L$5;
                    Ref.LongRef longRef12 = (Ref.LongRef) this.L$4;
                    Ref.LongRef longRef13 = (Ref.LongRef) this.L$3;
                    AwaitPointerEventScope awaitPointerEventScope11 = (AwaitPointerEventScope) this.L$2;
                    pointerInputChange11 = (PointerInputChange) this.L$1;
                    j = 9205357640488583168L;
                    AwaitPointerEventScope awaitPointerEventScope12 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    longRef4 = longRef12;
                    longRef5 = longRef13;
                    awaitPointerEventScope4 = awaitPointerEventScope12;
                    j2 = 9223372034707292159L;
                    touchSlopDetector2 = touchSlopDetector6;
                    awaitPointerEventScope2 = awaitPointerEventScope11;
                    if (pointerInputChange12.isConsumed()) {
                    }
                    break;
                case 8:
                    Ref.LongRef longRef14 = (Ref.LongRef) this.L$4;
                    AwaitPointerEventScope awaitPointerEventScope13 = (AwaitPointerEventScope) this.L$3;
                    Orientation orientation4 = (Orientation) this.L$2;
                    function2 = (Function2) this.L$1;
                    AwaitPointerEventScope awaitPointerEventScope14 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    Object objAwaitPointerEvent$default3 = obj;
                    PointerEvent pointerEvent5 = (PointerEvent) objAwaitPointerEvent$default3;
                    List<PointerInputChange> changes10 = pointerEvent5.getChanges();
                    int size9 = changes10.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size9) {
                            pointerInputChange15 = changes10.get(i13);
                            if (!PointerId.m7170equalsimpl0(pointerInputChange15.getId(), longRef14.element)) {
                                i13++;
                            }
                        } else {
                            pointerInputChange15 = null;
                        }
                    }
                    PointerInputChange pointerInputChange25 = pointerInputChange15;
                    if (pointerInputChange25 != null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange25)) {
                            List<PointerInputChange> changes11 = pointerEvent5.getChanges();
                            int size10 = changes11.size();
                            int i14 = 0;
                            while (true) {
                                if (i14 < size10) {
                                    pointerInputChange16 = changes11.get(i14);
                                    if (!pointerInputChange16.getPressed()) {
                                        i14++;
                                    }
                                } else {
                                    pointerInputChange16 = null;
                                }
                            }
                            PointerInputChange pointerInputChange26 = pointerInputChange16;
                            if (pointerInputChange26 != null) {
                                longRef14.element = pointerInputChange26.getId();
                                this.L$0 = awaitPointerEventScope14;
                                this.L$1 = function2;
                                this.L$2 = orientation4;
                                this.L$3 = awaitPointerEventScope13;
                                this.L$4 = longRef14;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.label = 8;
                                objAwaitPointerEvent$default3 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope13, null, this, 1, null);
                                break;
                            }
                        } else {
                            long jPositionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange25);
                            if ((orientation4 != null ? Float.intBitsToFloat((int) (orientation4 == Orientation.Vertical ? jPositionChangeIgnoreConsumed & 4294967295L : jPositionChangeIgnoreConsumed >> 32)) : Offset.m6541getDistanceimpl(jPositionChangeIgnoreConsumed)) == 0.0f) {
                                z2 = true;
                                break;
                            } else {
                                z2 = false;
                                break;
                            }
                        }
                    } else {
                        pointerInputChange25 = null;
                    }
                    if (pointerInputChange25 == null || pointerInputChange25.isConsumed()) {
                        pointerInputChange14 = null;
                    } else if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange25)) {
                        pointerInputChange14 = pointerInputChange25;
                    } else {
                        function2.invoke(pointerInputChange25, Offset.m6534boximpl(PointerEventKt.positionChange(pointerInputChange25)));
                        pointerInputChange25.consume();
                        id2 = pointerInputChange25.getId();
                        AwaitPointerEventScope awaitPointerEventScope15 = awaitPointerEventScope14;
                        orientation = orientation4;
                        awaitPointerEventScope2 = awaitPointerEventScope15;
                        Ref.LongRef longRef15 = new Ref.LongRef();
                        longRef15.element = id2;
                        awaitPointerEventScope13 = awaitPointerEventScope2;
                        longRef14 = longRef15;
                        orientation4 = orientation;
                        awaitPointerEventScope14 = awaitPointerEventScope13;
                        this.L$0 = awaitPointerEventScope14;
                        this.L$1 = function2;
                        this.L$2 = orientation4;
                        this.L$3 = awaitPointerEventScope13;
                        this.L$4 = longRef14;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.label = 8;
                        objAwaitPointerEvent$default3 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope13, null, this, 1, null);
                    }
                    if (pointerInputChange14 == null) {
                        this.$onDragCancel.invoke();
                    } else {
                        this.$onDragEnd.invoke(pointerInputChange14);
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", m3645f = "DragGestureDetector.kt", m3646l = {354, 355, 360}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 */
    /* loaded from: classes4.dex */
    static final class C10975 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
        final /* synthetic */ Function0<Unit> $onDragCancel;
        final /* synthetic */ Function0<Unit> $onDragEnd;
        final /* synthetic */ Function1<Offset, Unit> $onDragStart;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C10975(Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super C10975> continuation) {
            super(2, continuation);
            this.$onDragStart = function1;
            this.$onDragEnd = function0;
            this.$onDragCancel = function02;
            this.$onDrag = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C10975 c10975 = new C10975(this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$onDrag, continuation);
            c10975.L$0 = obj;
            return c10975;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C10975) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0064 A[Catch: CancellationException -> 0x00b6, PHI: r1 r8 r12
          0x0064: PHI (r1v8 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
          (r1v4 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
          (r1v9 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
         binds: [B:16:0x002f, B:28:0x0061] A[DONT_GENERATE, DONT_INLINE]
          0x0064: PHI (r8v6 androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5) = 
          (r8v2 androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5)
          (r8v7 androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5)
         binds: [B:16:0x002f, B:28:0x0061] A[DONT_GENERATE, DONT_INLINE]
          0x0064: PHI (r12v12 java.lang.Object) = (r12v0 java.lang.Object), (r12v18 java.lang.Object) binds: [B:16:0x002f, B:28:0x0061] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x00b6, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a6, B:42:0x00b2, B:45:0x00b9, B:46:0x00bc, B:47:0x00c2, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[Catch: CancellationException -> 0x00b6, TryCatch #2 {CancellationException -> 0x00b6, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a6, B:42:0x00b2, B:45:0x00b9, B:46:0x00bc, B:47:0x00c2, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0094 A[Catch: CancellationException -> 0x00b6, TryCatch #2 {CancellationException -> 0x00b6, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a6, B:42:0x00b2, B:45:0x00b9, B:46:0x00bc, B:47:0x00c2, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00c2 A[Catch: CancellationException -> 0x00b6, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00b6, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a6, B:42:0x00b2, B:45:0x00b9, B:46:0x00bc, B:47:0x00c2, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CancellationException cancellationException;
            C10975 c10975;
            AwaitPointerEventScope awaitPointerEventScope;
            AwaitPointerEventScope awaitPointerEventScope2;
            PointerInputChange pointerInputChange;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                try {
                    this.L$0 = awaitPointerEventScope3;
                    this.label = 1;
                    c10975 = this;
                } catch (CancellationException e) {
                    e = e;
                    c10975 = this;
                }
                try {
                    obj = TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope3, false, null, c10975, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    awaitPointerEventScope = awaitPointerEventScope3;
                    long id = ((PointerInputChange) obj).getId();
                    c10975.L$0 = awaitPointerEventScope;
                    c10975.label = 2;
                    obj = DragGestureDetectorKt.m4975awaitLongPressOrCancellationrnUCldI(awaitPointerEventScope, id, this);
                    if (obj == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                } catch (CancellationException e2) {
                    e = e2;
                    cancellationException = e;
                    c10975.$onDragCancel.invoke();
                    throw cancellationException;
                }
            }
            try {
                if (i == 1) {
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    c10975 = this;
                    long id2 = ((PointerInputChange) obj).getId();
                    c10975.L$0 = awaitPointerEventScope;
                    c10975.label = 2;
                    obj = DragGestureDetectorKt.m4975awaitLongPressOrCancellationrnUCldI(awaitPointerEventScope, id2, this);
                    if (obj == coroutine_suspended) {
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange != null) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 2) {
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    c10975 = this;
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null) {
                        c10975.$onDragStart.invoke(Offset.m6534boximpl(pointerInputChange.getPosition()));
                        long id3 = pointerInputChange.getId();
                        final Function2<PointerInputChange, Offset, Unit> function2 = c10975.$onDrag;
                        Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.5.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange2) {
                                invoke2(pointerInputChange2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(PointerInputChange pointerInputChange2) {
                                function2.invoke(pointerInputChange2, Offset.m6534boximpl(PointerEventKt.positionChange(pointerInputChange2)));
                                pointerInputChange2.consume();
                            }
                        };
                        c10975.L$0 = awaitPointerEventScope;
                        c10975.label = 3;
                        obj = DragGestureDetectorKt.m4979dragjO51t88(awaitPointerEventScope, id3, function1, this);
                        if (obj != coroutine_suspended) {
                            awaitPointerEventScope2 = awaitPointerEventScope;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    c10975 = this;
                    if (!((Boolean) obj).booleanValue()) {
                        List<PointerInputChange> changes = awaitPointerEventScope2.getCurrentEvent().getChanges();
                        int size = changes.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            PointerInputChange pointerInputChange2 = changes.get(i2);
                            if (PointerEventKt.changedToUp(pointerInputChange2)) {
                                pointerInputChange2.consume();
                            }
                        }
                        c10975.$onDragEnd.invoke();
                    } else {
                        c10975.$onDragCancel.invoke();
                    }
                }
            } catch (CancellationException e3) {
                cancellationException = e3;
                c10975 = this;
                c10975.$onDragCancel.invoke();
                throw cancellationException;
            }
            return Unit.INSTANCE;
        }
    }

    public static final Object detectDragGesturesAfterLongPress(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new C10975(function1, function0, function02, function2, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0193 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0187 -> B:61:0x018d). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4978awaitVerticalTouchSlopOrCancellationjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
        Ref.LongRef longRef;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12;
        float f;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
        float f2;
        TouchSlopDetector touchSlopDetector2;
        int size;
        int i;
        PointerEventPass pointerEventPass;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        int i2;
        Object objAwaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) continuation;
            int i3 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label = i3 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1(continuation);
            }
        }
        Object obj3 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label;
        int i5 = 1;
        PointerEventPass pointerEventPass2 = null;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj3);
            int iM7209getTouchT8wyACA = PointerType.INSTANCE.m7209getTouchT8wyACA();
            Orientation orientation = Orientation.Vertical;
            long jM6553getZeroF1C5BW0 = Offset.INSTANCE.m6553getZeroF1C5BW0();
            if (m4981isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                return null;
            }
            float fM4982pointerSlopE8SPZFQ = m4982pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), iM7209getTouchT8wyACA);
            longRef = new Ref.LongRef();
            longRef.element = j;
            TouchSlopDetector touchSlopDetector3 = new TouchSlopDetector(orientation, jM6553getZeroF1C5BW0, null);
            function22 = function2;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
            f = fM4982pointerSlopE8SPZFQ;
            touchSlopDetector = touchSlopDetector3;
            awaitPointerEventScope2 = awaitPointerEventScope;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = longRef;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i5;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i5, pointerEventPass2);
            if (objAwaitPointerEvent$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i4 == 1) {
            float f3 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$0;
            TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$3;
            Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$2;
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$1;
            Function2<? super PointerInputChange, ? super Float, Unit> function23 = (Function2) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$0;
            ResultKt.throwOnFailure(obj3);
            longRef = longRef2;
            f2 = f3;
            awaitPointerEventScope2 = awaitPointerEventScope3;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
            touchSlopDetector2 = touchSlopDetector4;
            function22 = function23;
            PointerEvent pointerEvent = (PointerEvent) obj3;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            size = changes.size();
            i = 0;
            while (true) {
                if (i < size) {
                }
                i = i2 + 1;
                pointerEventPass2 = pointerEventPass;
            }
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null) {
                return pointerEventPass;
            }
            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            }
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = longRef;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i5;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i5, pointerEventPass2);
            if (objAwaitPointerEvent$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i4 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        float f4 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$0;
        PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$4;
        TouchSlopDetector touchSlopDetector5 = (TouchSlopDetector) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$3;
        Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$2;
        AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$1;
        Function2<? super PointerInputChange, ? super Float, Unit> function24 = (Function2) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$0;
        ResultKt.throwOnFailure(obj3);
        touchSlopDetector = touchSlopDetector5;
        pointerEventPass = null;
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
        f = f4;
        awaitPointerEventScope2 = awaitPointerEventScope4;
        if (!pointerInputChange2.isConsumed()) {
            return pointerEventPass;
        }
        function22 = function24;
        pointerEventPass2 = pointerEventPass;
        i5 = 1;
        longRef = longRef3;
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = longRef;
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i5;
        objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i5, pointerEventPass2);
        if (objAwaitPointerEvent$default != coroutine_suspended) {
            float f5 = f;
            touchSlopDetector2 = touchSlopDetector;
            obj3 = objAwaitPointerEvent$default;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12;
            f2 = f5;
            PointerEvent pointerEvent2 = (PointerEvent) obj3;
            List<PointerInputChange> changes2 = pointerEvent2.getChanges();
            size = changes2.size();
            i = 0;
            while (true) {
                if (i < size) {
                    pointerEventPass = pointerEventPass2;
                    obj = pointerEventPass;
                    break;
                }
                obj = changes2.get(i);
                pointerEventPass = pointerEventPass2;
                i2 = i;
                if (PointerId.m7170equalsimpl0(((PointerInputChange) obj).getId(), longRef.element)) {
                    break;
                }
                i = i2 + 1;
                pointerEventPass2 = pointerEventPass;
            }
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null || pointerInputChange.isConsumed()) {
                return pointerEventPass;
            }
            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                int size2 = changes3.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size2) {
                        obj2 = pointerEventPass;
                        break;
                    }
                    obj2 = changes3.get(i6);
                    if (((PointerInputChange) obj2).getPressed()) {
                        break;
                    }
                    i6++;
                }
                PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                if (pointerInputChange3 == null) {
                    return pointerEventPass;
                }
                longRef.element = pointerInputChange3.getId();
                touchSlopDetector = touchSlopDetector2;
                f = f2;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
                pointerEventPass2 = pointerEventPass;
                i5 = 1;
            } else {
                long jM5048addPointerInputChangedBAh8RU = touchSlopDetector2.m5048addPointerInputChangedBAh8RU(pointerInputChange, f2);
                if ((9223372034707292159L & jM5048addPointerInputChangedBAh8RU) != 9205357640488583168L) {
                    function22.invoke(pointerInputChange, boxing.boxFloat(Float.intBitsToFloat((int) (jM5048addPointerInputChangedBAh8RU & 4294967295L))));
                    if (pointerInputChange.isConsumed()) {
                        return pointerInputChange;
                    }
                    touchSlopDetector2.reset();
                    touchSlopDetector = touchSlopDetector2;
                    f = f2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
                    pointerEventPass2 = pointerEventPass;
                    i5 = 1;
                } else {
                    PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.L$0 = function22;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.L$2 = longRef;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.L$3 = touchSlopDetector2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.L$4 = pointerInputChange;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.F$0 = f2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.label = 2;
                    if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass3, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13) != coroutine_suspended) {
                        touchSlopDetector = touchSlopDetector2;
                        f = f2;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
                        longRef3 = longRef;
                        function24 = function22;
                        pointerInputChange2 = pointerInputChange;
                        if (!pointerInputChange2.isConsumed()) {
                        }
                    }
                }
            }
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = longRef;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i5;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i5, pointerEventPass2);
            if (objAwaitPointerEvent$default != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e1, code lost:
    
        if ((java.lang.Float.intBitsToFloat((int) (androidx.compose.p011ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11) & 4294967295L)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4977awaitVerticalDragOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitVerticalDragOrCancellation$1 dragGestureDetectorKt$awaitVerticalDragOrCancellation$1;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object objAwaitPointerEvent$default;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DragGestureDetectorKt$awaitVerticalDragOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalDragOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalDragOrCancellation$1) continuation;
            int i = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label = i - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalDragOrCancellation$1(continuation);
            }
        }
        Object obj = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1;
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0;
            ResultKt.throwOnFailure(obj);
            Ref.LongRef longRef3 = longRef2;
            awaitPointerEventScope2 = awaitPointerEventScope3;
            PointerEvent pointerEvent = (PointerEvent) obj;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i3);
                if (PointerId.m7170equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
                    break;
                }
                i3++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null) {
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    while (true) {
                        if (i >= size2) {
                            pointerInputChange2 = null;
                            break;
                        }
                        pointerInputChange2 = changes2.get(i);
                        if (pointerInputChange2.getPressed()) {
                            break;
                        }
                        i++;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange2;
                    if (pointerInputChange4 != null) {
                        longRef3.element = pointerInputChange4.getId();
                        longRef = longRef3;
                    }
                }
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1 = longRef;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label = 1;
                objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalDragOrCancellation$1, 1, null);
                if (objAwaitPointerEvent$default != coroutine_suspended) {
                    return coroutine_suspended;
                }
                Ref.LongRef longRef4 = longRef;
                obj = objAwaitPointerEvent$default;
                longRef3 = longRef4;
                PointerEvent pointerEvent2 = (PointerEvent) obj;
                List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                int size3 = changes3.size();
                int i32 = 0;
                while (true) {
                    if (i32 < size3) {
                    }
                    i32++;
                }
                PointerInputChange pointerInputChange32 = pointerInputChange;
                if (pointerInputChange32 == null) {
                    pointerInputChange32 = null;
                }
            }
            if (pointerInputChange32 == null || pointerInputChange32.isConsumed()) {
                return null;
            }
            return pointerInputChange32;
        }
        ResultKt.throwOnFailure(obj);
        if (m4981isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
            return null;
        }
        longRef = new Ref.LongRef();
        longRef.element = j;
        awaitPointerEventScope2 = awaitPointerEventScope;
        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1 = longRef;
        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label = 1;
        objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalDragOrCancellation$1, 1, null);
        if (objAwaitPointerEvent$default != coroutine_suspended) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x017e -> B:61:0x0184). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4974awaitHorizontalPointerSlopOrCancellationgDDlDlE(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
        float fM4982pointerSlopE8SPZFQ;
        Ref.LongRef longRef;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        float f;
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
        TouchSlopDetector touchSlopDetector2;
        int size;
        int i2;
        PointerEventPass pointerEventPass;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        int i3;
        Object objAwaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) continuation;
            int i4 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i4 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1(continuation);
            }
        }
        Object obj3 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
        int i6 = 1;
        PointerEventPass pointerEventPass2 = null;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj3);
            Orientation orientation = Orientation.Horizontal;
            long jM6553getZeroF1C5BW0 = Offset.INSTANCE.m6553getZeroF1C5BW0();
            if (m4981isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                return null;
            }
            fM4982pointerSlopE8SPZFQ = m4982pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
            longRef = new Ref.LongRef();
            longRef.element = j;
            function22 = function2;
            touchSlopDetector = new TouchSlopDetector(orientation, jM6553getZeroF1C5BW0, null);
            awaitPointerEventScope2 = awaitPointerEventScope;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = function22;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = longRef;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = pointerEventPass2;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = fM4982pointerSlopE8SPZFQ;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i6;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i6, pointerEventPass2);
            if (objAwaitPointerEvent$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i5 == 1) {
            float f2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
            TouchSlopDetector touchSlopDetector3 = (TouchSlopDetector) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
            Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
            Function2<? super PointerInputChange, ? super Float, Unit> function23 = (Function2) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
            ResultKt.throwOnFailure(obj3);
            f = f2;
            awaitPointerEventScope2 = awaitPointerEventScope3;
            longRef = longRef2;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
            touchSlopDetector2 = touchSlopDetector3;
            function22 = function23;
            PointerEvent pointerEvent = (PointerEvent) obj3;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            size = changes.size();
            i2 = 0;
            while (true) {
                if (i2 < size) {
                }
                i2 = i3 + 1;
                pointerEventPass2 = pointerEventPass;
            }
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null) {
                return pointerEventPass;
            }
            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            }
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = function22;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = longRef;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = pointerEventPass2;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = fM4982pointerSlopE8SPZFQ;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i6;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i6, pointerEventPass2);
            if (objAwaitPointerEvent$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i5 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        float f3 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
        PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4;
        TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
        Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
        AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
        Function2<? super PointerInputChange, ? super Float, Unit> function24 = (Function2) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
        ResultKt.throwOnFailure(obj3);
        touchSlopDetector = touchSlopDetector4;
        pointerEventPass = null;
        fM4982pointerSlopE8SPZFQ = f3;
        awaitPointerEventScope2 = awaitPointerEventScope4;
        if (!pointerInputChange2.isConsumed()) {
            return pointerEventPass;
        }
        function22 = function24;
        pointerEventPass2 = pointerEventPass;
        i6 = 1;
        longRef = longRef3;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = function22;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = longRef;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = pointerEventPass2;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = fM4982pointerSlopE8SPZFQ;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i6;
        objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i6, pointerEventPass2);
        if (objAwaitPointerEvent$default != coroutine_suspended) {
            DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
            touchSlopDetector2 = touchSlopDetector;
            obj3 = objAwaitPointerEvent$default;
            f = fM4982pointerSlopE8SPZFQ;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13;
            PointerEvent pointerEvent2 = (PointerEvent) obj3;
            List<PointerInputChange> changes2 = pointerEvent2.getChanges();
            size = changes2.size();
            i2 = 0;
            while (true) {
                if (i2 < size) {
                    pointerEventPass = pointerEventPass2;
                    obj = pointerEventPass;
                    break;
                }
                obj = changes2.get(i2);
                pointerEventPass = pointerEventPass2;
                i3 = i2;
                if (PointerId.m7170equalsimpl0(((PointerInputChange) obj).getId(), longRef.element)) {
                    break;
                }
                i2 = i3 + 1;
                pointerEventPass2 = pointerEventPass;
            }
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null || pointerInputChange.isConsumed()) {
                return pointerEventPass;
            }
            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                int size2 = changes3.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size2) {
                        obj2 = pointerEventPass;
                        break;
                    }
                    obj2 = changes3.get(i7);
                    if (((PointerInputChange) obj2).getPressed()) {
                        break;
                    }
                    i7++;
                }
                PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                if (pointerInputChange3 == null) {
                    return pointerEventPass;
                }
                longRef.element = pointerInputChange3.getId();
                touchSlopDetector = touchSlopDetector2;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
                fM4982pointerSlopE8SPZFQ = f;
                pointerEventPass2 = pointerEventPass;
                i6 = 1;
            } else {
                long jM5048addPointerInputChangedBAh8RU = touchSlopDetector2.m5048addPointerInputChangedBAh8RU(pointerInputChange, f);
                if ((9223372034707292159L & jM5048addPointerInputChangedBAh8RU) != 9205357640488583168L) {
                    function22.invoke(pointerInputChange, boxing.boxFloat(Float.intBitsToFloat((int) (jM5048addPointerInputChangedBAh8RU >> 32))));
                    if (pointerInputChange.isConsumed()) {
                        return pointerInputChange;
                    }
                    touchSlopDetector2.reset();
                    touchSlopDetector = touchSlopDetector2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
                    fM4982pointerSlopE8SPZFQ = f;
                    pointerEventPass2 = pointerEventPass;
                    i6 = 1;
                } else {
                    PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = longRef;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = touchSlopDetector2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$4 = pointerInputChange;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.label = 2;
                    if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass3, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12) != coroutine_suspended) {
                        touchSlopDetector = touchSlopDetector2;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
                        fM4982pointerSlopE8SPZFQ = f;
                        longRef3 = longRef;
                        function24 = function22;
                        pointerInputChange2 = pointerInputChange;
                        if (!pointerInputChange2.isConsumed()) {
                        }
                    }
                }
            }
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = function22;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = longRef;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = pointerEventPass2;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = fM4982pointerSlopE8SPZFQ;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i6;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i6, pointerEventPass2);
            if (objAwaitPointerEvent$default != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0118, code lost:
    
        if ((r0 == 0.0f) == false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:35:0x00c5, B:46:0x00f1], limit reached: 73 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0083 -> B:23:0x0089). Please report as a decompilation issue!!! */
    /* renamed from: horizontalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4980horizontalDragjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Continuation<? super Boolean> continuation) {
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$1;
        long id;
        Orientation orientation;
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$12;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function1<? super PointerInputChange, Unit> function12;
        Orientation orientation2;
        AwaitPointerEventScope awaitPointerEventScope3;
        Ref.LongRef longRef;
        Object objAwaitPointerEvent$default;
        AwaitPointerEventScope awaitPointerEventScope4;
        PointerInputChange pointerInputChange;
        float fIntBitsToFloat;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DragGestureDetectorKt$horizontalDrag$1) {
            dragGestureDetectorKt$horizontalDrag$1 = (DragGestureDetectorKt$horizontalDrag$1) continuation;
            int i = dragGestureDetectorKt$horizontalDrag$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$horizontalDrag$1.label = i - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$horizontalDrag$1 = new DragGestureDetectorKt$horizontalDrag$1(continuation);
            }
        }
        Object obj = dragGestureDetectorKt$horizontalDrag$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = dragGestureDetectorKt$horizontalDrag$1.label;
        int i3 = 1;
        PointerEventPass pointerEventPass = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Orientation orientation3 = Orientation.Horizontal;
            id = j;
            if (!m4981isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), id)) {
                orientation = orientation3;
                dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$1;
                awaitPointerEventScope2 = awaitPointerEventScope;
                function12 = function1;
                Ref.LongRef longRef2 = new Ref.LongRef();
                longRef2.element = id;
                awaitPointerEventScope3 = awaitPointerEventScope2;
                orientation2 = orientation;
                longRef = longRef2;
                dragGestureDetectorKt$horizontalDrag$12.L$0 = function12;
                dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$horizontalDrag$12.L$2 = orientation2;
                dragGestureDetectorKt$horizontalDrag$12.L$3 = awaitPointerEventScope3;
                dragGestureDetectorKt$horizontalDrag$12.L$4 = longRef;
                dragGestureDetectorKt$horizontalDrag$12.label = i3;
                objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, i3, pointerEventPass);
                if (objAwaitPointerEvent$default == coroutine_suspended) {
                }
            }
            return boxing.boxBoolean(pointerEventPass == null);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        longRef = (Ref.LongRef) dragGestureDetectorKt$horizontalDrag$1.L$4;
        awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$horizontalDrag$1.L$3;
        orientation2 = (Orientation) dragGestureDetectorKt$horizontalDrag$1.L$2;
        AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) dragGestureDetectorKt$horizontalDrag$1.L$1;
        Function1<? super PointerInputChange, Unit> function13 = (Function1) dragGestureDetectorKt$horizontalDrag$1.L$0;
        ResultKt.throwOnFailure(obj);
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$13 = dragGestureDetectorKt$horizontalDrag$1;
        function12 = function13;
        PointerEvent pointerEvent = (PointerEvent) obj;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i4 = 0;
        while (true) {
            if (i4 < size) {
                awaitPointerEventScope4 = awaitPointerEventScope3;
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i4);
            awaitPointerEventScope4 = awaitPointerEventScope3;
            if (PointerId.m7170equalsimpl0(pointerInputChange.getId(), longRef.element)) {
                break;
            }
            i4++;
            awaitPointerEventScope3 = awaitPointerEventScope4;
        }
        PointerInputChange pointerInputChange3 = pointerInputChange;
        if (pointerInputChange3 == 0) {
            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                long jPositionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange3);
                if (orientation2 != null) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (orientation2 == Orientation.Vertical ? jPositionChangeIgnoreConsumed & 4294967295L : jPositionChangeIgnoreConsumed >> 32));
                } else {
                    fIntBitsToFloat = Offset.m6541getDistanceimpl(jPositionChangeIgnoreConsumed);
                }
            } else {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i5);
                    if (pointerInputChange2.getPressed()) {
                        break;
                    }
                    i5++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 != null) {
                    longRef.element = pointerInputChange4.getId();
                    awaitPointerEventScope3 = awaitPointerEventScope4;
                    awaitPointerEventScope2 = awaitPointerEventScope5;
                    dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$13;
                    i3 = 1;
                    pointerEventPass = null;
                    dragGestureDetectorKt$horizontalDrag$12.L$0 = function12;
                    dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$horizontalDrag$12.L$2 = orientation2;
                    dragGestureDetectorKt$horizontalDrag$12.L$3 = awaitPointerEventScope3;
                    dragGestureDetectorKt$horizontalDrag$12.L$4 = longRef;
                    dragGestureDetectorKt$horizontalDrag$12.label = i3;
                    objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, i3, pointerEventPass);
                    if (objAwaitPointerEvent$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$14 = dragGestureDetectorKt$horizontalDrag$12;
                    awaitPointerEventScope5 = awaitPointerEventScope2;
                    obj = objAwaitPointerEvent$default;
                    dragGestureDetectorKt$horizontalDrag$13 = dragGestureDetectorKt$horizontalDrag$14;
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                    int size3 = changes3.size();
                    int i42 = 0;
                    while (true) {
                        if (i42 < size3) {
                        }
                        i42++;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                    }
                    PointerInputChange pointerInputChange32 = pointerInputChange;
                    if (pointerInputChange32 == 0) {
                        pointerInputChange32 = 0;
                    }
                }
            }
        }
        if (pointerInputChange32 == 0 || pointerInputChange32.isConsumed()) {
            pointerEventPass = null;
        } else if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange32)) {
            pointerEventPass = pointerInputChange32;
        } else {
            function12.invoke(pointerInputChange32);
            orientation = orientation2;
            id = pointerInputChange32.getId();
            awaitPointerEventScope2 = awaitPointerEventScope5;
            dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$13;
            i3 = 1;
            pointerEventPass = null;
            Ref.LongRef longRef22 = new Ref.LongRef();
            longRef22.element = id;
            awaitPointerEventScope3 = awaitPointerEventScope2;
            orientation2 = orientation;
            longRef = longRef22;
            dragGestureDetectorKt$horizontalDrag$12.L$0 = function12;
            dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
            dragGestureDetectorKt$horizontalDrag$12.L$2 = orientation2;
            dragGestureDetectorKt$horizontalDrag$12.L$3 = awaitPointerEventScope3;
            dragGestureDetectorKt$horizontalDrag$12.L$4 = longRef;
            dragGestureDetectorKt$horizontalDrag$12.label = i3;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, i3, pointerEventPass);
            if (objAwaitPointerEvent$default == coroutine_suspended) {
            }
        }
        return boxing.boxBoolean(pointerEventPass == null);
    }

    public static /* synthetic */ Object detectHorizontalDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.2
                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m4985invokek4lQ0M(long j) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m4985invokek4lQ0M(offset.getPackedValue());
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 4) != 0) {
            function02 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        Function0 function03 = function02;
        return detectHorizontalDragGestures(pointerInputScope, function1, function0, function03, function2, continuation);
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5", m3645f = "DragGestureDetector.kt", m3646l = {661, 664, 672}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5 */
    /* loaded from: classes4.dex */
    static final class C11015 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onDragCancel;
        final /* synthetic */ Function0<Unit> $onDragEnd;
        final /* synthetic */ Function1<Offset, Unit> $onDragStart;
        final /* synthetic */ Function2<PointerInputChange, Float, Unit> $onHorizontalDrag;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C11015(Function1<? super Offset, Unit> function1, Function2<? super PointerInputChange, ? super Float, Unit> function2, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super C11015> continuation) {
            super(2, continuation);
            this.$onDragStart = function1;
            this.$onHorizontalDrag = function2;
            this.$onDragEnd = function0;
            this.$onDragCancel = function02;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11015 c11015 = new C11015(this.$onDragStart, this.$onHorizontalDrag, this.$onDragEnd, this.$onDragCancel, continuation);
            c11015.L$0 = obj;
            return c11015;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C11015) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
        
            if (r13 == r0) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C11015 c11015;
            AwaitPointerEventScope awaitPointerEventScope;
            final Ref.FloatRef floatRef;
            C11015 c110152;
            AwaitPointerEventScope awaitPointerEventScope2;
            PointerInputChange pointerInputChange;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                this.L$0 = awaitPointerEventScope3;
                this.label = 1;
                c11015 = this;
                obj = TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope3, false, null, c11015, 2, null);
                if (obj != coroutine_suspended) {
                    awaitPointerEventScope = awaitPointerEventScope3;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    c110152 = this;
                    if (((Boolean) obj).booleanValue()) {
                        c110152.$onDragEnd.invoke();
                    } else {
                        c110152.$onDragCancel.invoke();
                    }
                    return Unit.INSTANCE;
                }
                floatRef = (Ref.FloatRef) this.L$1;
                awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                c110152 = this;
                pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange != null) {
                    c110152.$onDragStart.invoke(Offset.m6534boximpl(pointerInputChange.getPosition()));
                    c110152.$onHorizontalDrag.invoke(pointerInputChange, boxing.boxFloat(floatRef.element));
                    long id = pointerInputChange.getId();
                    final Function2<PointerInputChange, Float, Unit> function2 = c110152.$onHorizontalDrag;
                    Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.5.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange2) {
                            invoke2(pointerInputChange2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(PointerInputChange pointerInputChange2) {
                            function2.invoke(pointerInputChange2, Float.valueOf(Float.intBitsToFloat((int) (PointerEventKt.positionChange(pointerInputChange2) >> 32))));
                            pointerInputChange2.consume();
                        }
                    };
                    c110152.L$0 = null;
                    c110152.L$1 = null;
                    c110152.label = 3;
                    obj = DragGestureDetectorKt.m4980horizontalDragjO51t88(awaitPointerEventScope2, id, function1, this);
                }
                return Unit.INSTANCE;
            }
            AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            c11015 = this;
            awaitPointerEventScope = awaitPointerEventScope4;
            PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
            floatRef = new Ref.FloatRef();
            C11015 c110153 = c11015;
            long id2 = pointerInputChange2.getId();
            int type2 = pointerInputChange2.getType();
            Function2<PointerInputChange, Float, Unit> function22 = new Function2<PointerInputChange, Float, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange3, Float f) {
                    invoke(pointerInputChange3, f.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PointerInputChange pointerInputChange3, float f) {
                    pointerInputChange3.consume();
                    floatRef.element = f;
                }
            };
            c110153.L$0 = awaitPointerEventScope;
            c110153.L$1 = floatRef;
            c110153.label = 2;
            obj = DragGestureDetectorKt.m4974awaitHorizontalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope, id2, type2, function22, c110153);
            c110152 = c110153;
            if (obj != coroutine_suspended) {
                awaitPointerEventScope2 = awaitPointerEventScope;
                pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange != null) {
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
    }

    public static final Object detectHorizontalDragGestures(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new C11015(function1, function2, function0, function02, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* renamed from: awaitLongPressOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4975awaitLongPressOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$1 dragGestureDetectorKt$awaitLongPressOrCancellation$1;
        PointerInputChange pointerInputChange;
        Ref.BooleanRef booleanRef;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DragGestureDetectorKt$awaitLongPressOrCancellation$1) {
            dragGestureDetectorKt$awaitLongPressOrCancellation$1 = (DragGestureDetectorKt$awaitLongPressOrCancellation$1) continuation;
            int i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.label = i - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(continuation);
            }
        }
        Object obj = dragGestureDetectorKt$awaitLongPressOrCancellation$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (m4981isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                int size = changes.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i3);
                    if (PointerId.m7170equalsimpl0(pointerInputChange.getId(), j)) {
                        break;
                    }
                    i3++;
                }
                PointerInputChange pointerInputChange3 = pointerInputChange;
                if (pointerInputChange3 == 0) {
                    return null;
                }
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                objectRef2.element = pointerInputChange3;
                long longPressTimeoutMillis = awaitPointerEventScope.getViewConfiguration().getLongPressTimeoutMillis();
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(booleanRef2, objectRef2, objectRef, null);
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0 = pointerInputChange3;
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1 = objectRef;
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$2 = booleanRef2;
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.label = 1;
                if (awaitPointerEventScope.withTimeout(longPressTimeoutMillis, dragGestureDetectorKt$awaitLongPressOrCancellation$2, dragGestureDetectorKt$awaitLongPressOrCancellation$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef = booleanRef2;
                j = objectRef;
                pointerInputChange2 = pointerInputChange3;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = (Ref.BooleanRef) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$2;
                Ref.ObjectRef objectRef3 = (Ref.ObjectRef) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1;
                PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0;
                ResultKt.throwOnFailure(obj);
                j = objectRef3;
                pointerInputChange2 = pointerInputChange4;
            }
            if (!booleanRef.element) {
                return null;
            }
            PointerInputChange pointerInputChange5 = (PointerInputChange) j.element;
            return pointerInputChange5 == null ? pointerInputChange2 : pointerInputChange5;
        } catch (PointerEventTimeoutCancellationException unused) {
            PointerInputChange pointerInputChange6 = (PointerInputChange) j.element;
            return pointerInputChange6 == null ? pointerInputChange2 : pointerInputChange6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    public static final boolean m4981isPointerUpDmW0f2w(PointerEvent pointerEvent, long j) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i);
            if (PointerId.m7170equalsimpl0(pointerInputChange.getId(), j)) {
                break;
            }
            i++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z = true;
        }
        return true ^ z;
    }

    /* renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m4982pointerSlopE8SPZFQ(ViewConfiguration viewConfiguration, int i) {
        return PointerType.m7203equalsimpl0(i, PointerType.INSTANCE.m7207getMouseT8wyACA()) ? viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio : viewConfiguration.getTouchSlop();
    }
}
