package com.robinhood.shared.tradeladder.p398ui.ladder.gestures;

import android.os.SystemClock;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGesture;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventKt;
import androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.p011ui.input.pointer.PointerId;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.gestures.LongPressFastTrackGestureDetector4;
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
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LongPressFastTrackGestureDetector.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u001a2\u0010\u0000\u001a\u00020\n*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0082@¢\u0006\u0002\u0010\f\u001a:\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\n0\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082H¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"longPressWithFastTrack", "Landroidx/compose/ui/Modifier;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "debounceTimeInMs", "", "onEvent", "Lkotlin/Function0;", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/interaction/MutableInteractionSource;JLkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processEvents", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "processEvents-TUCjRT4", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JJLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitNextEventOrUp", "awaitNextEventOrUp-rnUCldI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.gestures.LongPressFastTrackGestureDetectorKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class LongPressFastTrackGestureDetector4 {
    public static /* synthetic */ Modifier longPressWithFastTrack$default(Modifier modifier, InteractionSource3 interactionSource3, Indication indication, long j, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 100;
        }
        return longPressWithFastTrack(modifier, interactionSource3, indication, j, (Function0<Unit>) function0);
    }

    public static final Modifier longPressWithFastTrack(Modifier modifier, final InteractionSource3 interactionSource, Indication indication, final long j, final Function0<Unit> onEvent) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        return SuspendingPointerInputFilterKt.pointerInput(IndicationKt.indication(modifier, interactionSource, indication), Unit.INSTANCE, new PointerInputEventHandler() { // from class: com.robinhood.shared.tradeladder.ui.ladder.gestures.LongPressFastTrackGestureDetectorKt.longPressWithFastTrack.1
            @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                Object objLongPressWithFastTrack = LongPressFastTrackGestureDetector4.longPressWithFastTrack(pointerInputScope, interactionSource, j, onEvent, continuation);
                return objLongPressWithFastTrack == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objLongPressWithFastTrack : Unit.INSTANCE;
            }
        });
    }

    static /* synthetic */ Object longPressWithFastTrack$default(PointerInputScope pointerInputScope, InteractionSource3 interactionSource3, long j, Function0 function0, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 100;
        }
        return longPressWithFastTrack(pointerInputScope, interactionSource3, j, (Function0<Unit>) function0, (Continuation<? super Unit>) continuation);
    }

    /* compiled from: LongPressFastTrackGestureDetector.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.tradeladder.ui.ladder.gestures.LongPressFastTrackGestureDetectorKt$longPressWithFastTrack$3", m3645f = "LongPressFastTrackGestureDetector.kt", m3646l = {42, 48, 51}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.gestures.LongPressFastTrackGestureDetectorKt$longPressWithFastTrack$3 */
    static final class C409713 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $debounceTimeInMs;
        final /* synthetic */ InteractionSource3 $interactionSource;
        final /* synthetic */ Function0<Unit> $onEvent;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C409713(Function0<Unit> function0, InteractionSource3 interactionSource3, long j, Continuation<? super C409713> continuation) {
            super(2, continuation);
            this.$onEvent = function0;
            this.$interactionSource = interactionSource3;
            this.$debounceTimeInMs = j;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C409713 c409713 = new C409713(this.$onEvent, this.$interactionSource, this.$debounceTimeInMs, continuation);
            c409713.L$0 = obj;
            return c409713;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C409713) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C409713 c409713;
            AwaitPointerEventScope awaitPointerEventScope;
            AwaitPointerEventScope awaitPointerEventScope2;
            PressInteraction.Press press;
            PointerInputChange pointerInputChange;
            PressInteraction.Press press2;
            AwaitPointerEventScope awaitPointerEventScope3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) this.L$0;
                this.L$0 = awaitPointerEventScope4;
                this.label = 1;
                c409713 = this;
                obj = TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope4, false, null, c409713, 2, null);
                if (obj != coroutine_suspended) {
                    awaitPointerEventScope = awaitPointerEventScope4;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    press2 = (PressInteraction.Press) this.L$1;
                    awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    c409713 = this;
                    if (((Boolean) obj).booleanValue()) {
                        List<PointerInputChange> changes = awaitPointerEventScope3.getCurrentEvent().getChanges();
                        int size = changes.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            PointerInputChange pointerInputChange2 = changes.get(i2);
                            if (PointerEventKt.changedToUp(pointerInputChange2)) {
                                pointerInputChange2.consume();
                            }
                        }
                    }
                    press = press2;
                    c409713.$interactionSource.tryEmit(new PressInteraction.Release(press));
                    return Unit.INSTANCE;
                }
                press = (PressInteraction.Press) this.L$1;
                AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                c409713 = this;
                awaitPointerEventScope2 = awaitPointerEventScope5;
                pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange != null) {
                    final Ref.LongRef longRef = new Ref.LongRef();
                    long id = pointerInputChange.getId();
                    final long j = c409713.$debounceTimeInMs;
                    final Function0<Unit> function0 = c409713.$onEvent;
                    Function1 function1 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.gestures.LongPressFastTrackGestureDetectorKt$longPressWithFastTrack$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LongPressFastTrackGestureDetector4.C409713.invokeSuspend$lambda$0(longRef, j, function0, (PointerInputChange) obj2);
                        }
                    };
                    c409713.L$0 = awaitPointerEventScope2;
                    c409713.L$1 = press;
                    c409713.label = 3;
                    C409713 c4097132 = c409713;
                    obj = LongPressFastTrackGestureDetector4.m26109processEventsTUCjRT4(awaitPointerEventScope2, id, j, function1, c4097132);
                    c409713 = c4097132;
                    if (obj != coroutine_suspended) {
                        press2 = press;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        press = press2;
                    }
                    return coroutine_suspended;
                }
                c409713.$interactionSource.tryEmit(new PressInteraction.Release(press));
                return Unit.INSTANCE;
            }
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            c409713 = this;
            PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
            c409713.$onEvent.invoke();
            PressInteraction.Press press3 = new PressInteraction.Press(pointerInputChange3.getPosition(), null);
            c409713.$interactionSource.tryEmit(press3);
            long id2 = pointerInputChange3.getId();
            c409713.L$0 = awaitPointerEventScope;
            c409713.L$1 = press3;
            c409713.label = 2;
            obj = DragGestureDetectorKt.m4975awaitLongPressOrCancellationrnUCldI(awaitPointerEventScope, id2, this);
            if (obj != coroutine_suspended) {
                awaitPointerEventScope2 = awaitPointerEventScope;
                press = press3;
                pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange != null) {
                }
                c409713.$interactionSource.tryEmit(new PressInteraction.Release(press));
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Ref.LongRef longRef, long j, Function0 function0, PointerInputChange pointerInputChange) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - longRef.element >= j) {
                function0.invoke();
                longRef.element = jElapsedRealtime;
            }
            if (pointerInputChange != null) {
                pointerInputChange.consume();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object longPressWithFastTrack(PointerInputScope pointerInputScope, InteractionSource3 interactionSource3, long j, Function0<Unit> function0, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new C409713(function0, interactionSource3, j, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(5:11|(3:34|12|13)|33|21|(2:25|(2:27|28)(6:29|18|(1:20)|33|21|(0)(2:23|24)))(0)) */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e A[Catch: PointerEventTimeoutCancellationException -> 0x0089, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x0089, blocks: (B:21:0x006a, B:23:0x006e, B:25:0x0074, B:27:0x007a, B:29:0x007f, B:18:0x0054), top: B:33:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074 A[Catch: PointerEventTimeoutCancellationException -> 0x0089, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x0089, blocks: (B:21:0x006a, B:23:0x006e, B:25:0x0074, B:27:0x007a, B:29:0x007f, B:18:0x0054), top: B:33:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0067 -> B:33:0x006a). Please report as a decompilation issue!!! */
    /* renamed from: processEvents-TUCjRT4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m26109processEventsTUCjRT4(AwaitPointerEventScope awaitPointerEventScope, long j, long j2, Function1<? super PointerInputChange, Unit> function1, Continuation<? super Boolean> continuation) {
        LongPressFastTrackGestureDetector5 longPressFastTrackGestureDetector5;
        Ref.LongRef longRef;
        PointerInputChange pointerInputChange;
        if (continuation instanceof LongPressFastTrackGestureDetector5) {
            longPressFastTrackGestureDetector5 = (LongPressFastTrackGestureDetector5) continuation;
            int i = longPressFastTrackGestureDetector5.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                longPressFastTrackGestureDetector5.label = i - Integer.MIN_VALUE;
            } else {
                longPressFastTrackGestureDetector5 = new LongPressFastTrackGestureDetector5(continuation);
            }
        }
        Object objWithTimeout = longPressFastTrackGestureDetector5.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = longPressFastTrackGestureDetector5.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithTimeout);
            Ref.LongRef longRef2 = new Ref.LongRef();
            longRef2.element = j;
            longRef = longRef2;
            LongPressFastTrackGestureDetector6 longPressFastTrackGestureDetector6 = new LongPressFastTrackGestureDetector6(longRef, null);
            longPressFastTrackGestureDetector5.L$0 = awaitPointerEventScope;
            longPressFastTrackGestureDetector5.L$1 = function1;
            longPressFastTrackGestureDetector5.L$2 = longRef;
            longPressFastTrackGestureDetector5.J$0 = j2;
            longPressFastTrackGestureDetector5.label = 1;
            objWithTimeout = awaitPointerEventScope.withTimeout(j2, longPressFastTrackGestureDetector6, longPressFastTrackGestureDetector5);
            if (objWithTimeout == coroutine_suspended) {
            }
            pointerInputChange = (PointerInputChange) objWithTimeout;
            if (pointerInputChange == null) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = longPressFastTrackGestureDetector5.J$0;
            longRef = (Ref.LongRef) longPressFastTrackGestureDetector5.L$2;
            Function1<? super PointerInputChange, Unit> function12 = (Function1) longPressFastTrackGestureDetector5.L$1;
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) longPressFastTrackGestureDetector5.L$0;
            try {
                ResultKt.throwOnFailure(objWithTimeout);
                function1 = function12;
                awaitPointerEventScope = awaitPointerEventScope2;
                j2 = j3;
            } catch (PointerEventTimeoutCancellationException unused) {
                function1 = function12;
                awaitPointerEventScope = awaitPointerEventScope2;
                j2 = j3;
                function1.invoke(null);
                LongPressFastTrackGestureDetector6 longPressFastTrackGestureDetector62 = new LongPressFastTrackGestureDetector6(longRef, null);
                longPressFastTrackGestureDetector5.L$0 = awaitPointerEventScope;
                longPressFastTrackGestureDetector5.L$1 = function1;
                longPressFastTrackGestureDetector5.L$2 = longRef;
                longPressFastTrackGestureDetector5.J$0 = j2;
                longPressFastTrackGestureDetector5.label = 1;
                objWithTimeout = awaitPointerEventScope.withTimeout(j2, longPressFastTrackGestureDetector62, longPressFastTrackGestureDetector5);
                if (objWithTimeout == coroutine_suspended) {
                }
                pointerInputChange = (PointerInputChange) objWithTimeout;
                if (pointerInputChange == null) {
                }
            }
            pointerInputChange = (PointerInputChange) objWithTimeout;
            if (pointerInputChange == null) {
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    return boxing.boxBoolean(true);
                }
                function1.invoke(pointerInputChange);
                longRef.element = pointerInputChange.getId();
                LongPressFastTrackGestureDetector6 longPressFastTrackGestureDetector622 = new LongPressFastTrackGestureDetector6(longRef, null);
                longPressFastTrackGestureDetector5.L$0 = awaitPointerEventScope;
                longPressFastTrackGestureDetector5.L$1 = function1;
                longPressFastTrackGestureDetector5.L$2 = longRef;
                longPressFastTrackGestureDetector5.J$0 = j2;
                longPressFastTrackGestureDetector5.label = 1;
                objWithTimeout = awaitPointerEventScope.withTimeout(j2, longPressFastTrackGestureDetector622, longPressFastTrackGestureDetector5);
                if (objWithTimeout == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pointerInputChange = (PointerInputChange) objWithTimeout;
                if (pointerInputChange == null) {
                    return boxing.boxBoolean(false);
                }
            }
        }
    }

    /* renamed from: awaitNextEventOrUp-rnUCldI, reason: not valid java name */
    private static final Object m26108awaitNextEventOrUprnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation<? super PointerInputChange> continuation) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = j;
        while (true) {
            int i = 0;
            InlineMarker.mark(0);
            PointerInputChange pointerInputChange3 = null;
            Object objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
            InlineMarker.mark(1);
            PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i2);
                if (Boolean.valueOf(PointerId.m7170equalsimpl0(pointerInputChange.getId(), longRef.element)).booleanValue()) {
                    break;
                }
                i2++;
            }
            pointerInputChange2 = pointerInputChange;
            if (pointerInputChange2 == null) {
                return null;
            }
            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                break;
            }
            List<PointerInputChange> changes2 = pointerEvent.getChanges();
            int size2 = changes2.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                PointerInputChange pointerInputChange4 = changes2.get(i);
                if (Boolean.valueOf(pointerInputChange4.getPressed()).booleanValue()) {
                    pointerInputChange3 = pointerInputChange4;
                    break;
                }
                i++;
            }
            PointerInputChange pointerInputChange5 = pointerInputChange3;
            if (pointerInputChange5 == null) {
                break;
            }
            longRef.element = pointerInputChange5.getId();
        }
        return pointerInputChange2;
    }
}
