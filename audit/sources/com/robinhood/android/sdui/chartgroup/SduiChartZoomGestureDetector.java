package com.robinhood.android.sdui.chartgroup;

import androidx.compose.foundation.gestures.ForEachGesture;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.foundation.gestures.TransformGestureDetector;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventKt;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiChartZoomGestureDetector.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u008e\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042`\u0010\u0005\u001a\\\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\u00062\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0080@¢\u0006\u0002\u0010\u0011\u001a;\u0010\u0012\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u00020\u00040\u0016H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a;\u0010\u0017\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u00020\u00010\u0016H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, m3636d2 = {"detectChartZoomGestures", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "panZoomLock", "", "onGesture", "Lkotlin/Function4;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "centroid", "pan", "", "zoom", "rotation", "onEndOrCanceled", "Lkotlin/Function0;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fastAny", "T", "", "predicate", "Lkotlin/Function1;", "fastForEach", "action", "lib-sdui-charts_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.sdui.chartgroup.SduiChartZoomGestureDetectorKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SduiChartZoomGestureDetector {
    public static /* synthetic */ Object detectChartZoomGestures$default(PointerInputScope pointerInputScope, boolean z, Function4 function4, Function0 function0, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: com.robinhood.android.sdui.chartgroup.SduiChartZoomGestureDetectorKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        return detectChartZoomGestures(pointerInputScope, z, function4, function0, continuation);
    }

    /* compiled from: SduiChartZoomGestureDetector.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.sdui.chartgroup.SduiChartZoomGestureDetectorKt$detectChartZoomGestures$3", m3645f = "SduiChartZoomGestureDetector.kt", m3646l = {35, 38}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.sdui.chartgroup.SduiChartZoomGestureDetectorKt$detectChartZoomGestures$3 */
    static final class C279033 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onEndOrCanceled;
        final /* synthetic */ Function4<Offset, Offset, Float, Float, Unit> $onGesture;
        final /* synthetic */ boolean $panZoomLock;
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        int I$1;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C279033(boolean z, Function4<? super Offset, ? super Offset, ? super Float, ? super Float, Unit> function4, Function0<Unit> function0, Continuation<? super C279033> continuation) {
            super(2, continuation);
            this.$panZoomLock = z;
            this.$onGesture = function4;
            this.$onEndOrCanceled = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C279033 c279033 = new C279033(this.$panZoomLock, this.$onGesture, this.$onEndOrCanceled, continuation);
            c279033.L$0 = obj;
            return c279033;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C279033) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0093, code lost:
        
            if (r15 == r6) goto L16;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0166  */
        /* JADX WARN: Type inference failed for: r8v12 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v4, types: [int] */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0093 -> B:17:0x0096). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            long jM6547plusMKHz9U;
            float f;
            AwaitPointerEventScope awaitPointerEventScope;
            float f2;
            float f3;
            int i2;
            Object objAwaitPointerEvent$default;
            boolean z;
            float f4;
            float f5;
            int i3;
            int size;
            int i4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i5 = this.label;
            float f6 = 1.0f;
            int i6 = 2;
            float f7 = 0.0f;
            boolean z2 = false;
            boolean z3 = true;
            z3 = true;
            z3 = true;
            if (i5 == 0) {
                ResultKt.throwOnFailure(obj);
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                long jM6553getZeroF1C5BW0 = Offset.INSTANCE.m6553getZeroF1C5BW0();
                float touchSlop = awaitPointerEventScope2.getViewConfiguration().getTouchSlop();
                this.L$0 = awaitPointerEventScope2;
                this.F$0 = 0.0f;
                this.F$1 = 1.0f;
                this.J$0 = jM6553getZeroF1C5BW0;
                this.I$0 = 0;
                this.F$2 = touchSlop;
                this.I$1 = 0;
                this.label = 1;
                if (TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope2, false, null, this, 2, null) != coroutine_suspended) {
                    i = 0;
                    jM6547plusMKHz9U = jM6553getZeroF1C5BW0;
                    f = touchSlop;
                    awaitPointerEventScope = awaitPointerEventScope2;
                    f2 = 1.0f;
                    f3 = 0.0f;
                    i2 = 0;
                }
                return coroutine_suspended;
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = this.I$1;
                f = this.F$2;
                i = this.I$0;
                jM6547plusMKHz9U = this.J$0;
                f2 = this.F$1;
                f3 = this.F$0;
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                objAwaitPointerEvent$default = obj;
                PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent$default;
                float f8 = f6;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size2 = changes.size();
                float f9 = f7;
                ?? r9 = z2;
                while (true) {
                    if (r9 >= size2) {
                        z = z2;
                        break;
                    }
                    if (changes.get(r9).isConsumed()) {
                        z = z3;
                        break;
                    }
                    r9++;
                }
                if (z) {
                    f4 = f;
                } else {
                    float fCalculateZoom = TransformGestureDetector.calculateZoom(pointerEvent);
                    float fCalculateRotation = TransformGestureDetector.calculateRotation(pointerEvent);
                    float f10 = f2;
                    long jCalculatePan = TransformGestureDetector.calculatePan(pointerEvent);
                    if (i == 0) {
                        f5 = f10 * fCalculateZoom;
                        f3 += fCalculateRotation;
                        jM6547plusMKHz9U = Offset.m6547plusMKHz9U(jM6547plusMKHz9U, jCalculatePan);
                        float fCalculateCentroidSize = TransformGestureDetector.calculateCentroidSize(pointerEvent, z2);
                        int i7 = i2;
                        float fAbs = Math.abs(1 - f5) * fCalculateCentroidSize;
                        float fAbs2 = Math.abs(((3.1415927f * f3) * fCalculateCentroidSize) / 180.0f);
                        float fM6541getDistanceimpl = Offset.m6541getDistanceimpl(jM6547plusMKHz9U);
                        if (fAbs > f || fAbs2 > f || fM6541getDistanceimpl > f) {
                            i2 = (!this.$panZoomLock || fAbs2 >= f) ? 0 : 1;
                            i = 1;
                        } else {
                            i2 = i7;
                        }
                    } else {
                        f5 = f10;
                    }
                    if (i != 0) {
                        z2 = false;
                        long jCalculateCentroid = TransformGestureDetector.calculateCentroid(pointerEvent, false);
                        if (i2 != 0) {
                            fCalculateRotation = f9;
                        }
                        if (fCalculateRotation == f9 && fCalculateZoom == f8) {
                            i3 = i2;
                            f4 = f;
                            if (!Offset.m6540equalsimpl0(jCalculatePan, Offset.INSTANCE.m6553getZeroF1C5BW0())) {
                            }
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
                            size = changes2.size();
                            for (i4 = 0; i4 < size; i4++) {
                                PointerInputChange pointerInputChange = changes2.get(i4);
                                if (PointerEventKt.positionChanged(pointerInputChange)) {
                                    pointerInputChange.consume();
                                }
                            }
                        } else {
                            i3 = i2;
                            f4 = f;
                        }
                        this.$onGesture.invoke(Offset.m6534boximpl(jCalculateCentroid), Offset.m6534boximpl(jCalculatePan), boxing.boxFloat(fCalculateZoom), boxing.boxFloat(fCalculateRotation));
                        List<PointerInputChange> changes22 = pointerEvent.getChanges();
                        size = changes22.size();
                        while (i4 < size) {
                        }
                    } else {
                        i3 = i2;
                        f4 = f;
                        z2 = false;
                    }
                    i2 = i3;
                    f2 = f5;
                }
                if (!z) {
                    List<PointerInputChange> changes3 = pointerEvent.getChanges();
                    int size3 = changes3.size();
                    for (?? r8 = z2; r8 < size3; r8++) {
                        if (changes3.get(r8).getPressed()) {
                            f6 = f8;
                            f7 = f9;
                            f = f4;
                            i6 = 2;
                            z3 = true;
                        }
                    }
                }
                this.$onEndOrCanceled.invoke();
                return Unit.INSTANCE;
            }
            i2 = this.I$1;
            f = this.F$2;
            i = this.I$0;
            jM6547plusMKHz9U = this.J$0;
            f2 = this.F$1;
            f3 = this.F$0;
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = awaitPointerEventScope;
            this.F$0 = f3;
            this.F$1 = f2;
            this.J$0 = jM6547plusMKHz9U;
            this.I$0 = i;
            this.F$2 = f;
            this.I$1 = i2;
            this.label = i6;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, this, z3 ? 1 : 0, null);
        }
    }

    public static final Object detectChartZoomGestures(PointerInputScope pointerInputScope, boolean z, Function4<? super Offset, ? super Offset, ? super Float, ? super Float, Unit> function4, Function0<Unit> function0, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new C279033(z, function4, function0, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    public static final <T> boolean fastAny(List<? extends T> list, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (predicate.invoke(list.get(i)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <T> void fastForEach(List<? extends T> list, Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            action.invoke(list.get(i));
        }
    }
}
