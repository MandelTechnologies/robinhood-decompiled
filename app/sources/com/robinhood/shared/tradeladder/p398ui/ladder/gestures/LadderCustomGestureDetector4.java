package com.robinhood.shared.tradeladder.p398ui.ladder.gestures;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGesture;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventKt;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerId;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.util.VelocityTracker;
import androidx.compose.p011ui.unit.Velocity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.shared.tradeladder.p398ui.ladder.gestures.LadderCustomGestureDetector4;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LadderCustomGestureDetector.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0090\u0001\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00030\t2\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H\u0086@¢\u0006\u0002\u0010\u0013\u001a \u0010\u0014\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H\u0086@¢\u0006\u0002\u0010\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"LONG_PRESS_TIMEOUT_MILLIS", "", "ladderCustomDragAfterLongPress", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onDragStart", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "onDragEnd", "Lkotlin/Function2;", "", "", "onDrag", "Lkotlin/Function3;", "Lcom/robinhood/shared/tradeladder/ui/ladder/gestures/DragDirection;", "wasTouchOnPendingOrder", "Lkotlin/Function0;", "onTouchNotOnPendingOrder", "onGestureEnded", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectTouchDownWithoutConsumingEvent", "onDown", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderCustomGestureDetectorKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class LadderCustomGestureDetector4 {
    private static final long LONG_PRESS_TIMEOUT_MILLIS = 200;

    public static /* synthetic */ Object ladderCustomDragAfterLongPress$default(PointerInputScope pointerInputScope, Function1 function1, Function2 function2, Function3 function3, Function0 function0, Function0 function02, Function0 function03, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderCustomGestureDetectorKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return LadderCustomGestureDetector4.ladderCustomDragAfterLongPress$lambda$0((Offset) obj2);
                }
            };
        }
        if ((i & 2) != 0) {
            function2 = new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderCustomGestureDetectorKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return LadderCustomGestureDetector4.ladderCustomDragAfterLongPress$lambda$1(((Boolean) obj2).booleanValue(), (Float) obj3);
                }
            };
        }
        return ladderCustomDragAfterLongPress(pointerInputScope, function1, function2, function3, function0, function02, function03, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ladderCustomDragAfterLongPress$lambda$0(Offset offset) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ladderCustomDragAfterLongPress$lambda$1(boolean z, Float f) {
        return Unit.INSTANCE;
    }

    /* compiled from: LadderCustomGestureDetector.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderCustomGestureDetectorKt$ladderCustomDragAfterLongPress$4", m3645f = "LadderCustomGestureDetector.kt", m3646l = {42, 48, 60, 91}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderCustomGestureDetectorKt$ladderCustomDragAfterLongPress$4 */
    static final class C409484 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<Float, Float, LadderCustomGestureDetector3, Unit> $onDrag;
        final /* synthetic */ Function2<Boolean, Float, Unit> $onDragEnd;
        final /* synthetic */ Function1<Offset, Unit> $onDragStart;
        final /* synthetic */ Function0<Unit> $onGestureEnded;
        final /* synthetic */ Function0<Boolean> $onTouchNotOnPendingOrder;
        final /* synthetic */ Function0<Boolean> $wasTouchOnPendingOrder;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C409484(Function0<Boolean> function0, Function0<Boolean> function02, Function1<? super Offset, Unit> function1, Function2<? super Boolean, ? super Float, Unit> function2, Function0<Unit> function03, Function3<? super Float, ? super Float, ? super LadderCustomGestureDetector3, Unit> function3, Continuation<? super C409484> continuation) {
            super(2, continuation);
            this.$wasTouchOnPendingOrder = function0;
            this.$onTouchNotOnPendingOrder = function02;
            this.$onDragStart = function1;
            this.$onDragEnd = function2;
            this.$onGestureEnded = function03;
            this.$onDrag = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C409484 c409484 = new C409484(this.$wasTouchOnPendingOrder, this.$onTouchNotOnPendingOrder, this.$onDragStart, this.$onDragEnd, this.$onGestureEnded, this.$onDrag, continuation);
            c409484.L$0 = obj;
            return c409484;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C409484) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:90:0x0244, code lost:
        
            if (r0 == r6) goto L91;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:115:0x02b0  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d3 A[Catch: CancellationException -> 0x002f, TryCatch #0 {CancellationException -> 0x002f, blocks: (B:9:0x0023, B:52:0x0110, B:49:0x00f6, B:21:0x006c, B:38:0x00cf, B:40:0x00d3, B:44:0x00dc, B:24:0x007b), top: B:117:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00f6 A[Catch: CancellationException -> 0x002f, TRY_ENTER, TryCatch #0 {CancellationException -> 0x002f, blocks: (B:9:0x0023, B:52:0x0110, B:49:0x00f6, B:21:0x006c, B:38:0x00cf, B:40:0x00d3, B:44:0x00dc, B:24:0x007b), top: B:117:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0206 A[Catch: CancellationException -> 0x015b, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x015b, blocks: (B:92:0x0247, B:94:0x024f, B:96:0x0262, B:98:0x026e, B:99:0x0271, B:100:0x0274, B:102:0x0280, B:104:0x028e, B:106:0x029c, B:105:0x0292, B:55:0x0123, B:57:0x012f, B:58:0x0139, B:60:0x013f, B:67:0x015f, B:69:0x0164, B:85:0x0206, B:89:0x022e, B:72:0x01b3, B:74:0x01bf, B:77:0x01e7, B:79:0x01f5, B:82:0x01fb, B:83:0x0203), top: B:118:0x0123 }] */
        /* JADX WARN: Type inference failed for: r0v24, types: [T, com.robinhood.shared.tradeladder.ui.ladder.gestures.DragDirection] */
        /* JADX WARN: Type inference failed for: r4v18 */
        /* JADX WARN: Type inference failed for: r4v19, types: [int] */
        /* JADX WARN: Type inference failed for: r4v30 */
        /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x010c -> B:52:0x0110). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef objectRef;
            boolean z;
            AwaitPointerEventScope awaitPointerEventScope;
            Ref.ObjectRef objectRef2;
            Object objAwaitFirstDown$default;
            Object objWaitForUpOrCancellation;
            Ref.FloatRef floatRef;
            final VelocityTracker velocityTracker;
            final Ref.FloatRef floatRef2;
            PointerInputChange pointerInputChange;
            AwaitPointerEventScope awaitPointerEventScope2;
            PointerInputChange pointerInputChange2;
            PointerInputChange pointerInputChange3;
            boolean z2;
            Ref.ObjectRef objectRef3;
            AwaitPointerEventScope awaitPointerEventScope3;
            Object objM4979dragjO51t88;
            PointerInputChange pointerInputChange4;
            boolean z3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            int i2 = 3;
            boolean z4 = true;
            PointerInputChange pointerInputChange5 = null;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    objectRef2 = new Ref.ObjectRef();
                    try {
                        this.L$0 = awaitPointerEventScope;
                        this.L$1 = objectRef2;
                        this.label = 1;
                        objAwaitFirstDown$default = TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
                        if (objAwaitFirstDown$default == coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    } catch (CancellationException e) {
                        e = e;
                        z = false;
                        objectRef = objectRef2;
                        if (objectRef.element != null) {
                        }
                        throw e;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        objWaitForUpOrCancellation = obj;
                        pointerInputChange3 = (PointerInputChange) objWaitForUpOrCancellation;
                        if (pointerInputChange3 != null) {
                            pointerInputChange3.consume();
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        VelocityTracker velocityTracker2 = (VelocityTracker) this.L$2;
                        objectRef3 = (Ref.ObjectRef) this.L$1;
                        awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        velocityTracker = velocityTracker2;
                        z2 = true;
                        z = false;
                        objM4979dragjO51t88 = obj;
                        if (((Boolean) objM4979dragjO51t88).booleanValue()) {
                            List<PointerInputChange> changes = awaitPointerEventScope3.getCurrentEvent().getChanges();
                            int size = changes.size();
                            for (?? r4 = z; r4 < size; r4++) {
                                PointerInputChange pointerInputChange6 = changes.get(r4);
                                if (PointerEventKt.changedToUp(pointerInputChange6)) {
                                    pointerInputChange6.consume();
                                }
                            }
                            this.$onDragEnd.invoke(boxing.boxBoolean(z2), objectRef3.element == LadderCustomGestureDetector3.HORIZONTAL ? boxing.boxFloat(Velocity.m8101getXimpl(velocityTracker.m7217calculateVelocity9UxMQ8M())) : null);
                        } else {
                            this.$onDragEnd.invoke(boxing.boxBoolean(z), null);
                        }
                        this.$onGestureEnded.invoke();
                        return Unit.INSTANCE;
                    }
                    pointerInputChange2 = (PointerInputChange) this.L$6;
                    Ref.FloatRef floatRef3 = (Ref.FloatRef) this.L$5;
                    Ref.FloatRef floatRef4 = (Ref.FloatRef) this.L$4;
                    VelocityTracker velocityTracker3 = (VelocityTracker) this.L$3;
                    PointerInputChange pointerInputChange7 = (PointerInputChange) this.L$2;
                    Ref.ObjectRef objectRef4 = (Ref.ObjectRef) this.L$1;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        floatRef2 = floatRef4;
                        velocityTracker = velocityTracker3;
                        pointerInputChange = pointerInputChange7;
                        Object objAwaitPointerEvent = obj;
                        floatRef = floatRef3;
                        objectRef = objectRef4;
                        PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent;
                        List<PointerInputChange> changes2 = pointerEvent.getChanges();
                        int size2 = changes2.size();
                        int i3 = 0;
                        z = false;
                        while (i3 < size2) {
                            try {
                                if (!PointerEventKt.changedToUp(changes2.get(i3))) {
                                    Iterator it = pointerEvent.getChanges().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            pointerInputChange4 = pointerInputChange5;
                                            break;
                                        }
                                        ?? next = it.next();
                                        if (PointerId.m7170equalsimpl0(((PointerInputChange) next).getId(), pointerInputChange.getId())) {
                                            pointerInputChange4 = next;
                                            break;
                                        }
                                    }
                                    PointerInputChange pointerInputChange8 = pointerInputChange4;
                                    if (pointerInputChange8 != null) {
                                        float fAbs = Math.abs(Float.intBitsToFloat((int) (pointerInputChange8.getPosition() >> 32)) - Float.intBitsToFloat((int) (pointerInputChange.getPosition() >> 32)));
                                        float fAbs2 = Math.abs(Float.intBitsToFloat((int) (pointerInputChange8.getPosition() & 4294967295L)) - Float.intBitsToFloat((int) (pointerInputChange.getPosition() & 4294967295L)));
                                        if (pointerInputChange8.getUptimeMillis() - pointerInputChange.getUptimeMillis() > 200) {
                                            z3 = z4;
                                        } else if (fAbs > awaitPointerEventScope2.getViewConfiguration().getTouchSlop()) {
                                            objectRef.element = LadderCustomGestureDetector3.HORIZONTAL;
                                            z3 = z4;
                                            velocityTracker.m7216addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition());
                                            velocityTracker.m7216addPositionUv8p0NA(pointerInputChange8.getUptimeMillis(), pointerInputChange8.getPosition());
                                            floatRef2.element = fAbs;
                                            floatRef.element = fAbs2;
                                        } else {
                                            z3 = z4;
                                            if (fAbs2 > awaitPointerEventScope2.getViewConfiguration().getTouchSlop()) {
                                                return Unit.INSTANCE;
                                            }
                                        }
                                        pointerInputChange2 = pointerInputChange8;
                                    } else {
                                        z3 = z4;
                                    }
                                    z4 = z3;
                                    i2 = 3;
                                    pointerInputChange5 = null;
                                    if (pointerInputChange2 != null) {
                                        PointerEventPass pointerEventPass = PointerEventPass.Initial;
                                        this.L$0 = awaitPointerEventScope2;
                                        this.L$1 = objectRef;
                                        this.L$2 = pointerInputChange;
                                        this.L$3 = velocityTracker;
                                        this.L$4 = floatRef2;
                                        this.L$5 = floatRef;
                                        this.L$6 = pointerInputChange2;
                                        this.label = i2;
                                        objAwaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass, this);
                                        if (objAwaitPointerEvent == coroutine_suspended) {
                                        }
                                        PointerEvent pointerEvent2 = (PointerEvent) objAwaitPointerEvent;
                                        List<PointerInputChange> changes22 = pointerEvent2.getChanges();
                                        int size22 = changes22.size();
                                        int i32 = 0;
                                        z = false;
                                        while (i32 < size22) {
                                        }
                                    } else {
                                        z2 = z4;
                                        z = false;
                                        this.$onDragStart.invoke(Offset.m6534boximpl(pointerInputChange2.getPosition()));
                                        long id = pointerInputChange2.getId();
                                        final Function3<Float, Float, LadderCustomGestureDetector3, Unit> function3 = this.$onDrag;
                                        final AwaitPointerEventScope awaitPointerEventScope4 = awaitPointerEventScope2;
                                        final Ref.ObjectRef objectRef5 = objectRef;
                                        final Ref.FloatRef floatRef5 = floatRef;
                                        try {
                                            Function1 function1 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderCustomGestureDetectorKt$ladderCustomDragAfterLongPress$4$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj2) {
                                                    return LadderCustomGestureDetector4.C409484.invokeSuspend$lambda$3(velocityTracker, floatRef2, floatRef5, objectRef5, awaitPointerEventScope4, function3, (PointerInputChange) obj2);
                                                }
                                            };
                                            objectRef3 = objectRef5;
                                            awaitPointerEventScope3 = awaitPointerEventScope4;
                                            this.L$0 = awaitPointerEventScope3;
                                            this.L$1 = objectRef3;
                                            this.L$2 = velocityTracker;
                                            this.L$3 = null;
                                            this.L$4 = null;
                                            this.L$5 = null;
                                            this.L$6 = null;
                                            this.label = 4;
                                            objM4979dragjO51t88 = DragGestureDetectorKt.m4979dragjO51t88(awaitPointerEventScope3, id, function1, this);
                                        } catch (CancellationException e2) {
                                            e = e2;
                                            objectRef = objectRef5;
                                            if (objectRef.element != null) {
                                            }
                                            throw e;
                                        }
                                    }
                                    return coroutine_suspended;
                                }
                                i32++;
                                pointerInputChange5 = null;
                            } catch (CancellationException e3) {
                                e = e3;
                                if (objectRef.element != null) {
                                    this.$onDragEnd.invoke(boxing.boxBoolean(z), null);
                                }
                                throw e;
                            }
                        }
                        return Unit.INSTANCE;
                    } catch (CancellationException e4) {
                        e = e4;
                        objectRef = objectRef4;
                        z = false;
                        if (objectRef.element != null) {
                        }
                        throw e;
                    }
                }
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) this.L$1;
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                objectRef2 = objectRef6;
                objAwaitFirstDown$default = obj;
                PointerInputChange pointerInputChange9 = (PointerInputChange) objAwaitFirstDown$default;
                if (this.$wasTouchOnPendingOrder.invoke().booleanValue()) {
                    VelocityTracker velocityTracker4 = new VelocityTracker();
                    Ref.FloatRef floatRef6 = new Ref.FloatRef();
                    floatRef = new Ref.FloatRef();
                    velocityTracker = velocityTracker4;
                    floatRef2 = floatRef6;
                    pointerInputChange = pointerInputChange9;
                    objectRef = objectRef2;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    pointerInputChange2 = null;
                    if (pointerInputChange2 != null) {
                    }
                    return coroutine_suspended;
                }
                try {
                    if (!this.$onTouchNotOnPendingOrder.invoke().booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                    this.L$0 = objectRef2;
                    this.L$1 = null;
                    this.label = 2;
                    objWaitForUpOrCancellation = TapGestureDetector4.waitForUpOrCancellation(awaitPointerEventScope, pointerEventPass2, this);
                    if (objWaitForUpOrCancellation != coroutine_suspended) {
                        pointerInputChange3 = (PointerInputChange) objWaitForUpOrCancellation;
                        if (pointerInputChange3 != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                } catch (CancellationException e5) {
                    e = e5;
                    objectRef = objectRef2;
                    z = false;
                    if (objectRef.element != null) {
                    }
                    throw e;
                }
            } catch (CancellationException e6) {
                e = e6;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v12, types: [T, com.robinhood.shared.tradeladder.ui.ladder.gestures.DragDirection] */
        /* JADX WARN: Type inference failed for: r4v13, types: [T, com.robinhood.shared.tradeladder.ui.ladder.gestures.DragDirection] */
        public static final Unit invokeSuspend$lambda$3(VelocityTracker velocityTracker, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, Ref.ObjectRef objectRef, AwaitPointerEventScope awaitPointerEventScope, Function3 function3, PointerInputChange pointerInputChange) {
            velocityTracker.m7216addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition());
            long jPositionChange = PointerEventKt.positionChange(pointerInputChange);
            floatRef.element += Float.intBitsToFloat((int) (jPositionChange >> 32));
            floatRef2.element += Float.intBitsToFloat((int) (jPositionChange & 4294967295L));
            if (objectRef.element == 0) {
                float fAbs = Math.abs(floatRef.element);
                float fAbs2 = Math.abs(floatRef2.element);
                if (fAbs2 >= fAbs && fAbs2 >= awaitPointerEventScope.getViewConfiguration().getTouchSlop()) {
                    objectRef.element = LadderCustomGestureDetector3.VERTICAL;
                } else if (fAbs >= awaitPointerEventScope.getViewConfiguration().getTouchSlop()) {
                    objectRef.element = LadderCustomGestureDetector3.HORIZONTAL;
                }
            }
            LadderCustomGestureDetector3 ladderCustomGestureDetector3 = (LadderCustomGestureDetector3) objectRef.element;
            if (ladderCustomGestureDetector3 != null) {
                function3.invoke(Float.valueOf(floatRef.element), Float.valueOf(floatRef2.element), ladderCustomGestureDetector3);
            }
            pointerInputChange.consume();
            return Unit.INSTANCE;
        }
    }

    public static final Object ladderCustomDragAfterLongPress(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function2<? super Boolean, ? super Float, Unit> function2, Function3<? super Float, ? super Float, ? super LadderCustomGestureDetector3, Unit> function3, Function0<Boolean> function0, Function0<Boolean> function02, Function0<Unit> function03, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new C409484(function0, function02, function1, function2, function03, function3, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    /* compiled from: LadderCustomGestureDetector.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderCustomGestureDetectorKt$detectTouchDownWithoutConsumingEvent$2", m3645f = "LadderCustomGestureDetector.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderCustomGestureDetectorKt$detectTouchDownWithoutConsumingEvent$2 */
    static final class C409472 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onDown;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C409472(Function0<Unit> function0, Continuation<? super C409472> continuation) {
            super(2, continuation);
            this.$onDown = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C409472 c409472 = new C409472(this.$onDown, continuation);
            c409472.L$0 = obj;
            return c409472;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C409472) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C409472 c409472;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                this.label = 1;
                c409472 = this;
                if (TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope, false, null, c409472, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c409472 = this;
            }
            c409472.$onDown.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final Object detectTouchDownWithoutConsumingEvent(PointerInputScope pointerInputScope, Function0<Unit> function0, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new C409472(function0, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }
}
