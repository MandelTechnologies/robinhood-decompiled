package com.robinhood.android.futures.trade.p147ui.ladder.gestures;

import androidx.compose.foundation.gestures.ForEachGesture;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.foundation.gestures.TransformGestureDetector;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
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
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LadderZoomGestureDetector.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001aB\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0086@¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"detectZoom", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onZoomStart", "Lkotlin/Function0;", "onZoomEnd", "onZoom", "Lkotlin/Function1;", "", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.trade.ui.ladder.gestures.LadderZoomGestureDetectorKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class LadderZoomGestureDetector {

    /* compiled from: LadderZoomGestureDetector.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.gestures.LadderZoomGestureDetectorKt$detectZoom$2", m3645f = "LadderZoomGestureDetector.kt", m3646l = {24, 29}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.gestures.LadderZoomGestureDetectorKt$detectZoom$2 */
    static final class C175862 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Float, Unit> $onZoom;
        final /* synthetic */ Function0<Unit> $onZoomEnd;
        final /* synthetic */ Function0<Unit> $onZoomStart;
        float F$0;
        float F$1;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C175862(Function0<Unit> function0, Function1<? super Float, Unit> function1, Function0<Unit> function02, Continuation<? super C175862> continuation) {
            super(2, continuation);
            this.$onZoomStart = function0;
            this.$onZoom = function1;
            this.$onZoomEnd = function02;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C175862 c175862 = new C175862(this.$onZoomStart, this.$onZoom, this.$onZoomEnd, continuation);
            c175862.L$0 = obj;
            return c175862;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C175862) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0077, code lost:
        
            if (r11 == r1) goto L16;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0077 -> B:17:0x007a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            float touchSlop;
            float f;
            int i;
            int i2;
            Object objAwaitPointerEvent;
            boolean z;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                touchSlop = awaitPointerEventScope.getViewConfiguration().getTouchSlop();
                PointerEventPass pointerEventPass = PointerEventPass.Initial;
                this.L$0 = awaitPointerEventScope;
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
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$1;
                touchSlop = this.F$1;
                i2 = this.I$0;
                f = this.F$0;
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                objAwaitPointerEvent = obj;
                PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent;
                if (pointerEvent.getChanges().size() == 2) {
                    if (i == 0) {
                        this.$onZoomStart.invoke();
                        i = 1;
                    }
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            z = false;
                            break;
                        }
                        if (changes.get(i4).isConsumed()) {
                            z = true;
                            break;
                        }
                        i4++;
                    }
                    if (!z) {
                        float fCalculateZoom = TransformGestureDetector.calculateZoom(pointerEvent);
                        if (i2 == 0) {
                            f *= fCalculateZoom;
                            if (Math.abs(1 - f) * TransformGestureDetector.calculateCentroidSize(pointerEvent, false) > touchSlop) {
                                i2 = 1;
                            }
                        }
                        if (i2 != 0 && fCalculateZoom != 1.0f) {
                            this.$onZoom.invoke(boxing.boxFloat(fCalculateZoom));
                        }
                        List<PointerInputChange> changes2 = pointerEvent.getChanges();
                        int size2 = changes2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            changes2.get(i5).consume();
                        }
                    }
                    if (!z) {
                        List<PointerInputChange> changes3 = pointerEvent.getChanges();
                        int size3 = changes3.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            if (!changes3.get(i6).getPressed()) {
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
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
            this.L$0 = awaitPointerEventScope;
            this.F$0 = f;
            this.I$0 = i2;
            this.F$1 = touchSlop;
            this.I$1 = i;
            this.label = 2;
            objAwaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(pointerEventPass2, this);
        }
    }

    public static final Object detectZoom(PointerInputScope pointerInputScope, Function0<Unit> function0, Function0<Unit> function02, Function1<? super Float, Unit> function1, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new C175862(function0, function1, function02, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }
}
