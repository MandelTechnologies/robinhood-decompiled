package com.robinhood.shared.tradeladder.p398ui.ladder.gestures;

import androidx.compose.foundation.gestures.ForEachGesture;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.foundation.gestures.TransformGestureDetector;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerId;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import com.robinhood.shared.tradeladder.p398ui.ladder.extensions.OffsetKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LadderZoomGestureDetector.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0090\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u000226\u0010\u0003\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b26\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0004H\u0086@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"detectZoom", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onZoomStart", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "distance", "center", "onZoomEnd", "Lkotlin/Function0;", "onZoomDistanceChange", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderZoomGestureDetectorKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class LadderZoomGestureDetector2 {

    /* compiled from: LadderZoomGestureDetector.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderZoomGestureDetectorKt$detectZoom$2", m3645f = "LadderZoomGestureDetector.kt", m3646l = {28, 33}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderZoomGestureDetectorKt$detectZoom$2 */
    static final class C409682 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<Float, Float, Unit> $onZoomDistanceChange;
        final /* synthetic */ Function0<Unit> $onZoomEnd;
        final /* synthetic */ Function2<Float, Float, Unit> $onZoomStart;
        float F$0;
        float F$1;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C409682(Function2<? super Float, ? super Float, Unit> function2, Function2<? super Float, ? super Float, Unit> function22, Function0<Unit> function0, Continuation<? super C409682> continuation) {
            super(2, continuation);
            this.$onZoomStart = function2;
            this.$onZoomDistanceChange = function22;
            this.$onZoomEnd = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C409682 c409682 = new C409682(this.$onZoomStart, this.$onZoomDistanceChange, this.$onZoomEnd, continuation);
            c409682.L$0 = obj;
            return c409682;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C409682) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0088, code lost:
        
            if (r12 == r1) goto L16;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0088 -> B:17:0x008b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            float touchSlop;
            Map linkedHashMap;
            float f;
            int i;
            int i2;
            Object objAwaitPointerEvent;
            float f2;
            float fM26094distanceTo0a9Yr6o;
            float fIntBitsToFloat;
            boolean z;
            int i3;
            boolean z2;
            float f3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.label;
            float f4 = 1.0f;
            int i5 = 2;
            int i6 = 0;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                touchSlop = awaitPointerEventScope.getViewConfiguration().getTouchSlop();
                linkedHashMap = new LinkedHashMap();
                PointerEventPass pointerEventPass = PointerEventPass.Initial;
                this.L$0 = awaitPointerEventScope;
                this.L$1 = linkedHashMap;
                this.F$0 = 1.0f;
                this.I$0 = 0;
                this.F$1 = touchSlop;
                this.I$1 = 0;
                this.label = 1;
                if (TapGestureDetector4.awaitFirstDown(awaitPointerEventScope, false, pointerEventPass, this) != coroutine_suspended) {
                    f = 1.0f;
                    i = 0;
                    i2 = 0;
                }
                return coroutine_suspended;
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$1;
                touchSlop = this.F$1;
                i2 = this.I$0;
                f = this.F$0;
                linkedHashMap = (Map) this.L$1;
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                objAwaitPointerEvent = obj;
                PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent;
                if (pointerEvent.getChanges().size() == i5) {
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i7 = i6;
                    while (i7 < size) {
                        PointerInputChange pointerInputChange = changes.get(i7);
                        if (pointerInputChange.getPressed()) {
                            f3 = f4;
                            linkedHashMap.put(PointerId.m7167boximpl(pointerInputChange.getId()), Offset.m6534boximpl(pointerInputChange.getPosition()));
                        } else {
                            f3 = f4;
                            linkedHashMap.remove(PointerId.m7167boximpl(pointerInputChange.getId()));
                        }
                        i7++;
                        f4 = f3;
                    }
                    float f5 = f4;
                    if (linkedHashMap.size() == i5) {
                        List list = MapsKt.toList(linkedHashMap);
                        f2 = touchSlop;
                        fM26094distanceTo0a9Yr6o = OffsetKt.m26094distanceTo0a9Yr6o(((Offset) ((Tuples2) list.get(i6)).getSecond()).getPackedValue(), ((Offset) ((Tuples2) list.get(1)).getSecond()).getPackedValue());
                    } else {
                        f2 = touchSlop;
                        fM26094distanceTo0a9Yr6o = 0.0f;
                    }
                    if (linkedHashMap.size() == i5) {
                        List list2 = MapsKt.toList(linkedHashMap);
                        long packedValue = ((Offset) ((Tuples2) list2.get(i6)).getSecond()).getPackedValue();
                        long packedValue2 = ((Offset) ((Tuples2) list2.get(1)).getSecond()).getPackedValue();
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (packedValue >> 32)) + Float.intBitsToFloat((int) (packedValue2 >> 32));
                        float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (packedValue & 4294967295L)) + Float.intBitsToFloat((int) (packedValue2 & 4294967295L))) / i5;
                        fIntBitsToFloat = Float.intBitsToFloat((int) (Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2 / r6) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L)) & 4294967295L));
                    } else {
                        fIntBitsToFloat = 0.0f;
                    }
                    if (i == 0) {
                        this.$onZoomStart.invoke(boxing.boxFloat(fM26094distanceTo0a9Yr6o), boxing.boxFloat(fIntBitsToFloat));
                        i = 1;
                    }
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size2) {
                            z = false;
                            break;
                        }
                        if (changes2.get(i8).isConsumed()) {
                            z = true;
                            break;
                        }
                        i8++;
                    }
                    if (z) {
                        i3 = 0;
                        z2 = true;
                    } else {
                        float fCalculateZoom = TransformGestureDetector.calculateZoom(pointerEvent);
                        if (i2 == 0) {
                            f *= fCalculateZoom;
                            i3 = 0;
                            z2 = true;
                            if (Math.abs(1 - f) * TransformGestureDetector.calculateCentroidSize(pointerEvent, false) > f2) {
                                i2 = 1;
                            }
                        } else {
                            i3 = 0;
                            z2 = true;
                        }
                        if (i2 != 0 && fCalculateZoom != f5) {
                            this.$onZoomDistanceChange.invoke(boxing.boxFloat(fM26094distanceTo0a9Yr6o), boxing.boxFloat(fIntBitsToFloat));
                        }
                        List<PointerInputChange> changes3 = pointerEvent.getChanges();
                        int size3 = changes3.size();
                        for (int i9 = i3; i9 < size3; i9++) {
                            changes3.get(i9).consume();
                        }
                    }
                    if (!z) {
                        List<PointerInputChange> changes4 = pointerEvent.getChanges();
                        int size4 = changes4.size();
                        for (int i10 = i3; i10 < size4; i10++) {
                            if (changes4.get(i10).getPressed()) {
                                i6 = i3;
                                f4 = f5;
                                i5 = 2;
                                touchSlop = f2;
                            }
                        }
                    }
                }
                if (i != 0) {
                    this.$onZoomEnd.invoke();
                }
                return Unit.INSTANCE;
            }
            i = this.I$1;
            touchSlop = this.F$1;
            i2 = this.I$0;
            f = this.F$0;
            linkedHashMap = (Map) this.L$1;
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
            this.L$0 = awaitPointerEventScope;
            this.L$1 = linkedHashMap;
            this.F$0 = f;
            this.I$0 = i2;
            this.F$1 = touchSlop;
            this.I$1 = i;
            this.label = i5;
            objAwaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(pointerEventPass2, this);
        }
    }

    public static final Object detectZoom(PointerInputScope pointerInputScope, Function2<? super Float, ? super Float, Unit> function2, Function0<Unit> function0, Function2<? super Float, ? super Float, Unit> function22, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new C409682(function2, function22, function0, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }
}
