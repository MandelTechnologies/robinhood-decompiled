package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationState2;
import androidx.compose.animation.core.AnimationState3;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.SuspendAnimation;
import androidx.compose.foundation.MutatorMutex2;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier8;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerEventType;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.Velocity;
import com.plaid.internal.EnumC7081g;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceBuilder2;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.Supervisor3;
import kotlinx.coroutines.Timeout6;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel4;
import kotlinx.coroutines.channels.Channel5;

/* compiled from: MouseWheelScrollable.kt */
@Metadata(m3635d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001_BR\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00121\u0010\r\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\f*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u0018\u001a\u00020\f*\u00020\u00022'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0002\b\u0016H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010 \u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010#\u001a\u0004\u0018\u00010\"*\b\u0012\u0004\u0012\u00020\"0!H\u0002¢\u0006\u0004\b#\u0010$J\u001a\u0010%\u001a\u00020\"*\b\u0012\u0004\u0012\u00020\"0!H\u0082@¢\u0006\u0004\b%\u0010&J+\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*\"\u0004\b\u0000\u0010'2\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000(H\u0002¢\u0006\u0004\b+\u0010,J\u001e\u00101\u001a\u00020\u001d*\u00020\u00022\u0006\u0010.\u001a\u00020-H\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\f2\u0006\u0010.\u001a\u00020\"H\u0002¢\u0006\u0004\b2\u00103J,\u00107\u001a\u00020\f*\u00020\u00022\u0006\u0010.\u001a\u00020\"2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000204H\u0082@¢\u0006\u0004\b7\u00108J[\u0010B\u001a\u00020\f*\u00020\u00152\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020:092\u0006\u0010<\u001a\u0002042\u0006\u0010>\u001a\u00020=2!\u0010A\u001a\u001d\u0012\u0013\u0012\u001104¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(@\u0012\u0004\u0012\u00020\u001d0?H\u0082@¢\u0006\u0004\bB\u0010CJ\u001b\u00107\u001a\u000204*\u00020\u00152\u0006\u0010D\u001a\u000204H\u0002¢\u0006\u0004\b7\u0010EJ\u0015\u0010F\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bF\u0010GJ(\u0010L\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010I\u001a\u00020H2\u0006\u0010\u001c\u001a\u00020\u001bø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ\u0015\u0010O\u001a\u00020\f2\u0006\u0010N\u001a\u00020M¢\u0006\u0004\bO\u0010PR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010QR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010RR?\u0010\r\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010SR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010TR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010W\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006`"}, m3636d2 = {"Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;", "", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollingLogic", "Landroidx/compose/foundation/gestures/ScrollConfig;", "mouseWheelScrollConfig", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Velocity;", "Lkotlin/ParameterName;", "name", "velocity", "Lkotlin/coroutines/Continuation;", "", "onScrollStopped", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Landroidx/compose/foundation/gestures/ScrollConfig;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "consume", "(Landroidx/compose/ui/input/pointer/PointerEvent;)V", "Landroidx/compose/foundation/gestures/NestedScrollScope;", "Lkotlin/ExtensionFunctionType;", "block", "userScroll", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pointerEvent", "Landroidx/compose/ui/unit/IntSize;", "bounds", "", "onMouseWheel-O0kMr_c", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "onMouseWheel", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "sumOrNull", "(Lkotlinx/coroutines/channels/Channel;)Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "busyReceive", "(Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "E", "Lkotlin/Function0;", "builderAction", "Lkotlin/sequences/Sequence;", "untilNull", "(Lkotlin/jvm/functions/Function0;)Lkotlin/sequences/Sequence;", "Landroidx/compose/ui/geometry/Offset;", "scrollDelta", "canConsumeDelta-Uv8p0NA", "(Landroidx/compose/foundation/gestures/ScrollingLogic;J)Z", "canConsumeDelta", "trackVelocity", "(Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;)V", "", "threshold", "speed", "dispatchMouseWheelScroll", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;FFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationState;", "Landroidx/compose/animation/core/AnimationVector1D;", "animationState", "targetValue", "", "durationMillis", "Lkotlin/Function1;", "lastValue", "shouldCancelAnimation", "animateMouseWheelScroll", "(Landroidx/compose/foundation/gestures/NestedScrollScope;Landroidx/compose/animation/core/AnimationState;FILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "(Landroidx/compose/foundation/gestures/NestedScrollScope;F)F", "updateDensity", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "startReceivingMouseWheelEvents", "(Lkotlinx/coroutines/CoroutineScope;)V", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "Landroidx/compose/foundation/gestures/ScrollConfig;", "Lkotlin/jvm/functions/Function2;", "Landroidx/compose/ui/unit/Density;", "channel", "Lkotlinx/coroutines/channels/Channel;", "isScrolling", "Z", "Lkotlinx/coroutines/Job;", "receivingMouseWheelEventsJob", "Lkotlinx/coroutines/Job;", "Landroidx/compose/foundation/gestures/MouseWheelVelocityTracker;", "velocityTracker", "Landroidx/compose/foundation/gestures/MouseWheelVelocityTracker;", "MouseWheelScrollDelta", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic, reason: use source file name */
/* loaded from: classes4.dex */
public final class MouseWheelScrollable2 {
    private Density density;
    private boolean isScrolling;
    private final ScrollConfig mouseWheelScrollConfig;
    private final Function2<Velocity, Continuation<? super Unit>, Object> onScrollStopped;
    private Job receivingMouseWheelEventsJob;
    private final ScrollingLogic scrollingLogic;
    private final Channel<MouseWheelScrollDelta> channel = Channel4.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
    private final MouseWheelScrollable6 velocityTracker = new MouseWheelScrollable6();

    /* compiled from: MouseWheelScrollable.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", m3645f = "MouseWheelScrollable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE}, m3647m = "dispatchMouseWheelScroll")
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 */
    static final class C11161 extends ContinuationImpl {
        float F$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C11161(Continuation<? super C11161> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MouseWheelScrollable2.this.dispatchMouseWheelScroll(null, null, 0.0f, 0.0f, this);
        }
    }

    /* compiled from: MouseWheelScrollable.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", m3645f = "MouseWheelScrollable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m3647m = "userScroll")
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1 */
    static final class C11231 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C11231(Continuation<? super C11231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MouseWheelScrollable2.this.userScroll(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MouseWheelScrollable2(ScrollingLogic scrollingLogic, ScrollConfig scrollConfig, Function2<? super Velocity, ? super Continuation<? super Unit>, ? extends Object> function2, Density density) {
        this.scrollingLogic = scrollingLogic;
        this.mouseWheelScrollConfig = scrollConfig;
        this.onScrollStopped = function2;
        this.density = density;
    }

    public final void updateDensity(Density density) {
        this.density = density;
    }

    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public final void m5001onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        if (pass == PointerEventPass.Main && PointerEventType.m7156equalsimpl0(pointerEvent.getType(), PointerEventType.INSTANCE.m7162getScroll7fucELk())) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i = 0; i < size; i++) {
                if (changes.get(i).isConsumed()) {
                    return;
                }
            }
            if (m5000onMouseWheelO0kMr_c(pointerEvent, bounds)) {
                consume(pointerEvent);
            }
        }
    }

    private final void consume(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            changes.get(i).consume();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MouseWheelScrollable.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, m3636d2 = {"Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "", "Landroidx/compose/ui/geometry/Offset;", "value", "", "timeMillis", "", "shouldApplyImmediately", "<init>", "(JJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "plus", "(Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;)Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "copy-9KIMszo", "(JJZ)Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "J", "getValue-F1C5BW0", "()J", "getTimeMillis", "Z", "getShouldApplyImmediately", "()Z", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta, reason: from toString */
    static final /* data */ class MouseWheelScrollDelta {
        private final boolean shouldApplyImmediately;
        private final long timeMillis;
        private final long value;

        public /* synthetic */ MouseWheelScrollDelta(long j, long j2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, z);
        }

        /* renamed from: copy-9KIMszo$default, reason: not valid java name */
        public static /* synthetic */ MouseWheelScrollDelta m5002copy9KIMszo$default(MouseWheelScrollDelta mouseWheelScrollDelta, long j, long j2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                j = mouseWheelScrollDelta.value;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = mouseWheelScrollDelta.timeMillis;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                z = mouseWheelScrollDelta.shouldApplyImmediately;
            }
            return mouseWheelScrollDelta.m5003copy9KIMszo(j3, j4, z);
        }

        /* renamed from: copy-9KIMszo, reason: not valid java name */
        public final MouseWheelScrollDelta m5003copy9KIMszo(long value, long timeMillis, boolean shouldApplyImmediately) {
            return new MouseWheelScrollDelta(value, timeMillis, shouldApplyImmediately, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MouseWheelScrollDelta)) {
                return false;
            }
            MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollDelta) other;
            return Offset.m6540equalsimpl0(this.value, mouseWheelScrollDelta.value) && this.timeMillis == mouseWheelScrollDelta.timeMillis && this.shouldApplyImmediately == mouseWheelScrollDelta.shouldApplyImmediately;
        }

        public int hashCode() {
            return (((Offset.m6545hashCodeimpl(this.value) * 31) + Long.hashCode(this.timeMillis)) * 31) + Boolean.hashCode(this.shouldApplyImmediately);
        }

        public String toString() {
            return "MouseWheelScrollDelta(value=" + ((Object) Offset.m6549toStringimpl(this.value)) + ", timeMillis=" + this.timeMillis + ", shouldApplyImmediately=" + this.shouldApplyImmediately + ')';
        }

        private MouseWheelScrollDelta(long j, long j2, boolean z) {
            this.value = j;
            this.timeMillis = j2;
            this.shouldApplyImmediately = z;
        }

        /* renamed from: getValue-F1C5BW0, reason: not valid java name and from getter */
        public final long getValue() {
            return this.value;
        }

        public final long getTimeMillis() {
            return this.timeMillis;
        }

        public final boolean getShouldApplyImmediately() {
            return this.shouldApplyImmediately;
        }

        public final MouseWheelScrollDelta plus(MouseWheelScrollDelta other) {
            return new MouseWheelScrollDelta(Offset.m6547plusMKHz9U(this.value, other.value), Math.max(this.timeMillis, other.timeMillis), this.shouldApplyImmediately, null);
        }
    }

    public final void startReceivingMouseWheelEvents(CoroutineScope coroutineScope) {
        if (this.receivingMouseWheelEventsJob == null) {
            this.receivingMouseWheelEventsJob = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C11201(null), 3, null);
        }
    }

    /* compiled from: MouseWheelScrollable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1", m3645f = "MouseWheelScrollable.kt", m3646l = {107, 110}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 */
    static final class C11201 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C11201(Continuation<? super C11201> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11201 c11201 = MouseWheelScrollable2.this.new C11201(continuation);
            c11201.L$0 = obj;
            return c11201;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            C11201 c11201;
            CoroutineScope coroutineScope;
            CoroutineScope coroutineScope2;
            Throwable th2;
            MouseWheelScrollDelta mouseWheelScrollDelta;
            float fMo5016toPx0680j_4;
            float fMo5016toPx0680j_42;
            MouseWheelScrollable2 mouseWheelScrollable2;
            ScrollingLogic scrollingLogic;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i != 0) {
                    try {
                        if (i == 1) {
                            coroutineScope = (CoroutineScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            try {
                                mouseWheelScrollDelta = (MouseWheelScrollDelta) obj;
                                fMo5016toPx0680j_4 = MouseWheelScrollable2.this.density.mo5016toPx0680j_4(MouseWheelScrollable.AnimationThreshold);
                                fMo5016toPx0680j_42 = MouseWheelScrollable2.this.density.mo5016toPx0680j_4(MouseWheelScrollable.AnimationSpeed);
                                mouseWheelScrollable2 = MouseWheelScrollable2.this;
                                scrollingLogic = mouseWheelScrollable2.scrollingLogic;
                                this.L$0 = coroutineScope;
                                this.label = 2;
                                if (mouseWheelScrollable2.dispatchMouseWheelScroll(scrollingLogic, mouseWheelScrollDelta, fMo5016toPx0680j_4, fMo5016toPx0680j_42, c11201) != coroutine_suspended) {
                                    coroutineScope2 = coroutineScope;
                                }
                                return coroutine_suspended;
                            } catch (Throwable th3) {
                                th2 = th3;
                                th = th2;
                                MouseWheelScrollable2.this.receivingMouseWheelEventsJob = null;
                                throw th;
                            }
                            c11201 = this;
                        } else {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            coroutineScope2 = coroutineScope3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c11201 = this;
                        MouseWheelScrollable2.this.receivingMouseWheelEventsJob = null;
                        throw th;
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    coroutineScope2 = (CoroutineScope) this.L$0;
                }
                if (JobKt.isActive(coroutineScope2.getCoroutineContext())) {
                    Channel channel = MouseWheelScrollable2.this.channel;
                    this.L$0 = coroutineScope2;
                    this.label = 1;
                    Object objReceive = channel.receive(this);
                    if (objReceive == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope = coroutineScope2;
                    obj = objReceive;
                    mouseWheelScrollDelta = (MouseWheelScrollDelta) obj;
                    fMo5016toPx0680j_4 = MouseWheelScrollable2.this.density.mo5016toPx0680j_4(MouseWheelScrollable.AnimationThreshold);
                    fMo5016toPx0680j_42 = MouseWheelScrollable2.this.density.mo5016toPx0680j_4(MouseWheelScrollable.AnimationSpeed);
                    mouseWheelScrollable2 = MouseWheelScrollable2.this;
                    scrollingLogic = mouseWheelScrollable2.scrollingLogic;
                    this.L$0 = coroutineScope;
                    this.label = 2;
                    c11201 = this;
                    if (mouseWheelScrollable2.dispatchMouseWheelScroll(scrollingLogic, mouseWheelScrollDelta, fMo5016toPx0680j_4, fMo5016toPx0680j_42, c11201) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                MouseWheelScrollable2.this.receivingMouseWheelEventsJob = null;
                return Unit.INSTANCE;
            } catch (Throwable th5) {
                th2 = th5;
                c11201 = this;
                th = th2;
                MouseWheelScrollable2.this.receivingMouseWheelEventsJob = null;
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object userScroll(ScrollingLogic scrollingLogic, Function2<? super NestedScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        C11231 c11231;
        MouseWheelScrollable2 mouseWheelScrollable2;
        if (continuation instanceof C11231) {
            c11231 = (C11231) continuation;
            int i = c11231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c11231.label = i - Integer.MIN_VALUE;
            } else {
                c11231 = new C11231(continuation);
            }
        }
        Object obj = c11231.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c11231.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            this.isScrolling = true;
            C11242 c11242 = new C11242(scrollingLogic, function2, null);
            c11231.L$0 = this;
            c11231.label = 1;
            if (Supervisor3.supervisorScope(c11242, c11231) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mouseWheelScrollable2 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mouseWheelScrollable2 = (MouseWheelScrollable2) c11231.L$0;
            ResultKt.throwOnFailure(obj);
        }
        mouseWheelScrollable2.isScrolling = false;
        return Unit.INSTANCE;
    }

    /* compiled from: MouseWheelScrollable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2", m3645f = "MouseWheelScrollable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2 */
    static final class C11242 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<NestedScrollScope, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ ScrollingLogic $this_userScroll;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C11242(ScrollingLogic scrollingLogic, Function2<? super NestedScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C11242> continuation) {
            super(2, continuation);
            this.$this_userScroll = scrollingLogic;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C11242(this.$this_userScroll, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11242) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScrollingLogic scrollingLogic = this.$this_userScroll;
                MutatorMutex2 mutatorMutex2 = MutatorMutex2.UserInput;
                Function2<NestedScrollScope, Continuation<? super Unit>, Object> function2 = this.$block;
                this.label = 1;
                if (scrollingLogic.scroll(mutatorMutex2, function2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: onMouseWheel-O0kMr_c, reason: not valid java name */
    private final boolean m5000onMouseWheelO0kMr_c(PointerEvent pointerEvent, long bounds) {
        long jMo4959calculateMouseWheelScroll8xgXZGE = this.mouseWheelScrollConfig.mo4959calculateMouseWheelScroll8xgXZGE(this.density, pointerEvent, bounds);
        if (m4999canConsumeDeltaUv8p0NA(this.scrollingLogic, jMo4959calculateMouseWheelScroll8xgXZGE)) {
            return Channel5.m28810isSuccessimpl(this.channel.mo8337trySendJP2dKIU(new MouseWheelScrollDelta(jMo4959calculateMouseWheelScroll8xgXZGE, ((PointerInputChange) CollectionsKt.first((List) pointerEvent.getChanges())).getUptimeMillis(), !this.mouseWheelScrollConfig.isSmoothScrollingEnabled() || this.mouseWheelScrollConfig.isPreciseWheelScroll(pointerEvent), null)));
        }
        return this.isScrolling;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MouseWheelScrollDelta sumOrNull(final Channel<MouseWheelScrollDelta> channel) {
        MouseWheelScrollDelta mouseWheelScrollDeltaPlus = null;
        for (MouseWheelScrollDelta mouseWheelScrollDelta : untilNull(new Function0<MouseWheelScrollDelta>() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.sumOrNull.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final MouseWheelScrollDelta invoke() {
                return (MouseWheelScrollDelta) Channel5.m28806getOrNullimpl(channel.mo28799tryReceivePtdJZtk());
            }
        })) {
            mouseWheelScrollDeltaPlus = mouseWheelScrollDeltaPlus == null ? mouseWheelScrollDelta : mouseWheelScrollDeltaPlus.plus(mouseWheelScrollDelta);
        }
        return mouseWheelScrollDeltaPlus;
    }

    /* compiled from: MouseWheelScrollable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2", m3645f = "MouseWheelScrollable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2 */
    static final class C11142 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super MouseWheelScrollDelta>, Object> {
        final /* synthetic */ Channel<MouseWheelScrollDelta> $this_busyReceive;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11142(Channel<MouseWheelScrollDelta> channel, Continuation<? super C11142> continuation) {
            super(2, continuation);
            this.$this_busyReceive = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11142 c11142 = new C11142(this.$this_busyReceive, continuation);
            c11142.L$0 = obj;
            return c11142;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MouseWheelScrollDelta> continuation) {
            return ((C11142) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r1v3, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
                if (r1 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new MouseWheelScrollable3(null), 3, null);
                    Channel<MouseWheelScrollDelta> channel = this.$this_busyReceive;
                    this.L$0 = jobLaunch$default;
                    this.label = 1;
                    obj = channel.receive(this);
                    r1 = jobLaunch$default;
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (r1 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Job job = (Job) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    r1 = job;
                }
                MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollDelta) obj;
                Job.DefaultImpls.cancel$default(r1, null, 1, null);
                return mouseWheelScrollDelta;
            } catch (Throwable th) {
                Job.DefaultImpls.cancel$default(r1, null, 1, null);
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object busyReceive(Channel<MouseWheelScrollDelta> channel, Continuation<? super MouseWheelScrollDelta> continuation) {
        return CoroutineScope2.coroutineScope(new C11142(channel, null), continuation);
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: MouseWheelScrollable.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "E", "Lkotlin/sequences/SequenceScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1", m3645f = "MouseWheelScrollable.kt", m3646l = {EnumC7081g.f2780x600b66fe}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1 */
    static final class C11221<E> extends ContinuationImpl5 implements Function2<SequenceBuilder2<? super E>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<E> $builderAction;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C11221(Function0<? extends E> function0, Continuation<? super C11221> continuation) {
            super(2, continuation);
            this.$builderAction = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11221 c11221 = new C11221(this.$builderAction, continuation);
            c11221.L$0 = obj;
            return c11221;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceBuilder2<? super E> sequenceBuilder2, Continuation<? super Unit> continuation) {
            return ((C11221) create(sequenceBuilder2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0037 -> B:15:0x003b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003a -> B:15:0x003b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r1 = r4.L$1
                java.lang.Object r3 = r4.L$0
                kotlin.sequences.SequenceScope r3 = (kotlin.sequences.SequenceBuilder2) r3
                kotlin.ResultKt.throwOnFailure(r5)
                goto L3b
            L15:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1d:
                kotlin.ResultKt.throwOnFailure(r5)
                java.lang.Object r5 = r4.L$0
                kotlin.sequences.SequenceScope r5 = (kotlin.sequences.SequenceBuilder2) r5
                r3 = r5
            L25:
                kotlin.jvm.functions.Function0<E> r5 = r4.$builderAction
                java.lang.Object r1 = r5.invoke()
                if (r1 == 0) goto L3a
                r4.L$0 = r3
                r4.L$1 = r1
                r4.label = r2
                java.lang.Object r5 = r3.yield(r1, r4)
                if (r5 != r0) goto L3b
                return r0
            L3a:
                r1 = 0
            L3b:
                if (r1 != 0) goto L25
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollable2.C11221.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final <E> Sequence<E> untilNull(Function0<? extends E> builderAction) {
        return SequencesKt.sequence(new C11221(builderAction, null));
    }

    /* renamed from: canConsumeDelta-Uv8p0NA, reason: not valid java name */
    private final boolean m4999canConsumeDeltaUv8p0NA(ScrollingLogic scrollingLogic, long j) {
        float fM5041toFloatk4lQ0M = scrollingLogic.m5041toFloatk4lQ0M(scrollingLogic.m5039reverseIfNeededMKHz9U(j));
        if (fM5041toFloatk4lQ0M == 0.0f) {
            return false;
        }
        if (fM5041toFloatk4lQ0M > 0.0f) {
            return scrollingLogic.getScrollableState().getCanScrollForward();
        }
        return scrollingLogic.getScrollableState().getCanScrollBackward();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackVelocity(MouseWheelScrollDelta scrollDelta) {
        this.velocityTracker.m5005addDeltaUv8p0NA(scrollDelta.getTimeMillis(), scrollDelta.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0110, code lost:
    
        if (r0.invoke(r1, r9) == r10) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, androidx.compose.animation.core.AnimationState] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object dispatchMouseWheelScroll(ScrollingLogic scrollingLogic, MouseWheelScrollDelta mouseWheelScrollDelta, float f, float f2, Continuation<? super Unit> continuation) {
        C11161 c11161;
        Ref.FloatRef floatRef;
        MouseWheelScrollable2 mouseWheelScrollable2;
        float f3;
        ScrollingLogic scrollingLogic2;
        if (continuation instanceof C11161) {
            c11161 = (C11161) continuation;
            int i = c11161.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c11161.label = i - Integer.MIN_VALUE;
            } else {
                c11161 = new C11161(continuation);
            }
        }
        C11161 c111612 = c11161;
        Object obj = c111612.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c111612.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = mouseWheelScrollDelta;
            trackVelocity(mouseWheelScrollDelta);
            MouseWheelScrollDelta mouseWheelScrollDeltaSumOrNull = sumOrNull(this.channel);
            if (mouseWheelScrollDeltaSumOrNull != null) {
                trackVelocity(mouseWheelScrollDeltaSumOrNull);
                objectRef.element = ((MouseWheelScrollDelta) objectRef.element).plus(mouseWheelScrollDeltaSumOrNull);
            }
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            float fM5041toFloatk4lQ0M = scrollingLogic.m5041toFloatk4lQ0M(scrollingLogic.m5039reverseIfNeededMKHz9U(((MouseWheelScrollDelta) objectRef.element).getValue()));
            floatRef2.element = fM5041toFloatk4lQ0M;
            if (MouseWheelScrollable.isLowScrollingDelta(fM5041toFloatk4lQ0M)) {
                return Unit.INSTANCE;
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = AnimationState3.AnimationState$default(0.0f, 0.0f, 0L, 0L, false, 30, null);
            C11173 c11173 = new C11173(floatRef2, objectRef2, objectRef, f, this, f2, scrollingLogic, null);
            c111612.L$0 = this;
            c111612.L$1 = scrollingLogic;
            c111612.L$2 = floatRef2;
            c111612.F$0 = f2;
            c111612.label = 1;
            if (userScroll(scrollingLogic, c11173, c111612) != coroutine_suspended) {
                floatRef = floatRef2;
                mouseWheelScrollable2 = this;
                f3 = f2;
                scrollingLogic2 = scrollingLogic;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        f3 = c111612.F$0;
        floatRef = (Ref.FloatRef) c111612.L$2;
        scrollingLogic2 = (ScrollingLogic) c111612.L$1;
        mouseWheelScrollable2 = (MouseWheelScrollable2) c111612.L$0;
        ResultKt.throwOnFailure(obj);
        long jM5006calculateVelocity9UxMQ8M = mouseWheelScrollable2.velocityTracker.m5006calculateVelocity9UxMQ8M();
        if (Velocity.m8100equalsimpl0(jM5006calculateVelocity9UxMQ8M, Velocity.INSTANCE.m8109getZero9UxMQ8M())) {
            jM5006calculateVelocity9UxMQ8M = scrollingLogic2.m5043toVelocityadjELrA(scrollingLogic2.reverseIfNeeded(Math.signum(floatRef.element)) * Math.min(Math.abs(floatRef.element) / 100, f3) * 1000);
        }
        Function2<Velocity, Continuation<? super Unit>, Object> function2 = mouseWheelScrollable2.onScrollStopped;
        Velocity velocityM8095boximpl = Velocity.m8095boximpl(jM5006calculateVelocity9UxMQ8M);
        c111612.L$0 = null;
        c111612.L$1 = null;
        c111612.L$2 = null;
        c111612.label = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, androidx.compose.animation.core.AnimationState] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object dispatchMouseWheelScroll$waitNextScrollDelta(MouseWheelScrollable2 mouseWheelScrollable2, Ref.ObjectRef<MouseWheelScrollDelta> objectRef, Ref.FloatRef floatRef, ScrollingLogic scrollingLogic, Ref.ObjectRef<AnimationState<Float, AnimationVectors2>> objectRef2, long j, Continuation<? super Boolean> continuation) {
        MouseWheelScrollable4 mouseWheelScrollable4;
        Ref.FloatRef floatRef2;
        ScrollingLogic scrollingLogic2;
        Ref.ObjectRef<AnimationState<Float, AnimationVectors2>> objectRef3;
        Ref.ObjectRef<MouseWheelScrollDelta> objectRef4;
        MouseWheelScrollable2 mouseWheelScrollable22 = mouseWheelScrollable2;
        if (continuation instanceof MouseWheelScrollable4) {
            mouseWheelScrollable4 = (MouseWheelScrollable4) continuation;
            int i = mouseWheelScrollable4.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mouseWheelScrollable4.label = i - Integer.MIN_VALUE;
            } else {
                mouseWheelScrollable4 = new MouseWheelScrollable4(continuation);
            }
        }
        Object objWithTimeoutOrNull = mouseWheelScrollable4.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = mouseWheelScrollable4.label;
        boolean z = false;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithTimeoutOrNull);
            if (j < 0) {
                return boxing.boxBoolean(false);
            }
            MouseWheelScrollable5 mouseWheelScrollable5 = new MouseWheelScrollable5(mouseWheelScrollable22, null);
            mouseWheelScrollable4.L$0 = mouseWheelScrollable22;
            mouseWheelScrollable4.L$1 = objectRef;
            floatRef2 = floatRef;
            mouseWheelScrollable4.L$2 = floatRef2;
            scrollingLogic2 = scrollingLogic;
            mouseWheelScrollable4.L$3 = scrollingLogic2;
            objectRef3 = objectRef2;
            mouseWheelScrollable4.L$4 = objectRef3;
            mouseWheelScrollable4.label = 1;
            objWithTimeoutOrNull = Timeout6.withTimeoutOrNull(j, mouseWheelScrollable5, mouseWheelScrollable4);
            if (objWithTimeoutOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef4 = objectRef;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref.ObjectRef<AnimationState<Float, AnimationVectors2>> objectRef5 = (Ref.ObjectRef) mouseWheelScrollable4.L$4;
            ScrollingLogic scrollingLogic3 = (ScrollingLogic) mouseWheelScrollable4.L$3;
            Ref.FloatRef floatRef3 = (Ref.FloatRef) mouseWheelScrollable4.L$2;
            objectRef4 = (Ref.ObjectRef) mouseWheelScrollable4.L$1;
            MouseWheelScrollable2 mouseWheelScrollable23 = (MouseWheelScrollable2) mouseWheelScrollable4.L$0;
            ResultKt.throwOnFailure(objWithTimeoutOrNull);
            objectRef3 = objectRef5;
            scrollingLogic2 = scrollingLogic3;
            floatRef2 = floatRef3;
            mouseWheelScrollable22 = mouseWheelScrollable23;
        }
        MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollDelta) objWithTimeoutOrNull;
        if (mouseWheelScrollDelta != null) {
            ?? M5002copy9KIMszo$default = MouseWheelScrollDelta.m5002copy9KIMszo$default(mouseWheelScrollDelta, 0L, 0L, objectRef4.element.getShouldApplyImmediately(), 3, null);
            objectRef4.element = M5002copy9KIMszo$default;
            floatRef2.element = scrollingLogic2.m5041toFloatk4lQ0M(scrollingLogic2.m5039reverseIfNeededMKHz9U(M5002copy9KIMszo$default.getValue()));
            objectRef3.element = AnimationState3.AnimationState$default(0.0f, 0.0f, 0L, 0L, false, 30, null);
            mouseWheelScrollable22.trackVelocity(mouseWheelScrollDelta);
            z = !MouseWheelScrollable.isLowScrollingDelta(floatRef2.element);
        }
        return boxing.boxBoolean(z);
    }

    /* compiled from: MouseWheelScrollable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", m3645f = "MouseWheelScrollable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE, 283}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 */
    static final class C11173 extends ContinuationImpl7 implements Function2<NestedScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<AnimationState<Float, AnimationVectors2>> $animationState;
        final /* synthetic */ float $speed;
        final /* synthetic */ Ref.ObjectRef<MouseWheelScrollDelta> $targetScrollDelta;
        final /* synthetic */ Ref.FloatRef $targetValue;
        final /* synthetic */ ScrollingLogic $this_dispatchMouseWheelScroll;
        final /* synthetic */ float $threshold;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ MouseWheelScrollable2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11173(Ref.FloatRef floatRef, Ref.ObjectRef<AnimationState<Float, AnimationVectors2>> objectRef, Ref.ObjectRef<MouseWheelScrollDelta> objectRef2, float f, MouseWheelScrollable2 mouseWheelScrollable2, float f2, ScrollingLogic scrollingLogic, Continuation<? super C11173> continuation) {
            super(2, continuation);
            this.$targetValue = floatRef;
            this.$animationState = objectRef;
            this.$targetScrollDelta = objectRef2;
            this.$threshold = f;
            this.this$0 = mouseWheelScrollable2;
            this.$speed = f2;
            this.$this_dispatchMouseWheelScroll = scrollingLogic;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11173 c11173 = new C11173(this.$targetValue, this.$animationState, this.$targetScrollDelta, this.$threshold, this.this$0, this.$speed, this.$this_dispatchMouseWheelScroll, continuation);
            c11173.L$0 = obj;
            return c11173;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(NestedScrollScope nestedScrollScope, Continuation<? super Unit> continuation) {
            return ((C11173) create(nestedScrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x018e  */
        /* JADX WARN: Type inference failed for: r2v12, types: [T, androidx.compose.animation.core.AnimationState] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x014f -> B:30:0x0151). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x015d -> B:13:0x0067). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            NestedScrollScope nestedScrollScope;
            Ref.BooleanRef booleanRef;
            NestedScrollScope nestedScrollScope2;
            Ref.BooleanRef booleanRef2;
            int i;
            Ref.BooleanRef booleanRef3;
            NestedScrollScope nestedScrollScope3;
            C11173 c11173 = this;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c11173.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                NestedScrollScope nestedScrollScope4 = (NestedScrollScope) c11173.L$0;
                Ref.BooleanRef booleanRef4 = new Ref.BooleanRef();
                booleanRef4.element = true;
                nestedScrollScope = nestedScrollScope4;
                booleanRef = booleanRef4;
                if (!booleanRef.element) {
                }
            } else if (i2 == 1) {
                Ref.BooleanRef booleanRef5 = (Ref.BooleanRef) c11173.L$2;
                booleanRef3 = (Ref.BooleanRef) c11173.L$1;
                nestedScrollScope3 = (NestedScrollScope) c11173.L$0;
                ResultKt.throwOnFailure(obj);
                booleanRef5.element = ((Boolean) obj).booleanValue();
                c11173 = this;
                booleanRef = booleanRef3;
                nestedScrollScope = nestedScrollScope3;
                if (!booleanRef.element) {
                }
            } else if (i2 == 2) {
                i = c11173.I$0;
                Ref.BooleanRef booleanRef6 = (Ref.BooleanRef) c11173.L$1;
                NestedScrollScope nestedScrollScope5 = (NestedScrollScope) c11173.L$0;
                ResultKt.throwOnFailure(obj);
                booleanRef2 = booleanRef6;
                nestedScrollScope2 = nestedScrollScope5;
                if (booleanRef2.element) {
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ref.BooleanRef booleanRef7 = (Ref.BooleanRef) c11173.L$2;
                booleanRef3 = (Ref.BooleanRef) c11173.L$1;
                nestedScrollScope3 = (NestedScrollScope) c11173.L$0;
                ResultKt.throwOnFailure(obj);
                booleanRef2 = booleanRef7;
                Object objDispatchMouseWheelScroll$waitNextScrollDelta = obj;
                booleanRef2.element = ((Boolean) objDispatchMouseWheelScroll$waitNextScrollDelta).booleanValue();
                booleanRef = booleanRef3;
                nestedScrollScope = nestedScrollScope3;
                if (!booleanRef.element) {
                    booleanRef.element = false;
                    float fFloatValue = c11173.$targetValue.element - c11173.$animationState.element.getValue().floatValue();
                    if (c11173.$targetScrollDelta.element.getShouldApplyImmediately() || Math.abs(fFloatValue) < c11173.$threshold) {
                        Ref.BooleanRef booleanRef8 = booleanRef;
                        NestedScrollScope nestedScrollScope6 = nestedScrollScope;
                        c11173.this$0.dispatchMouseWheelScroll(nestedScrollScope6, fFloatValue);
                        MouseWheelScrollable2 mouseWheelScrollable2 = c11173.this$0;
                        Ref.ObjectRef<MouseWheelScrollDelta> objectRef = c11173.$targetScrollDelta;
                        Ref.FloatRef floatRef = c11173.$targetValue;
                        ScrollingLogic scrollingLogic = c11173.$this_dispatchMouseWheelScroll;
                        Ref.ObjectRef<AnimationState<Float, AnimationVectors2>> objectRef2 = c11173.$animationState;
                        c11173.L$0 = nestedScrollScope6;
                        c11173.L$1 = booleanRef8;
                        c11173.L$2 = booleanRef8;
                        c11173.label = 1;
                        Object objDispatchMouseWheelScroll$waitNextScrollDelta2 = MouseWheelScrollable2.dispatchMouseWheelScroll$waitNextScrollDelta(mouseWheelScrollable2, objectRef, floatRef, scrollingLogic, objectRef2, 50L, c11173);
                        if (objDispatchMouseWheelScroll$waitNextScrollDelta2 != coroutine_suspended) {
                            booleanRef3 = booleanRef8;
                            nestedScrollScope3 = nestedScrollScope6;
                            booleanRef8.element = ((Boolean) objDispatchMouseWheelScroll$waitNextScrollDelta2).booleanValue();
                            c11173 = this;
                            booleanRef = booleanRef3;
                            nestedScrollScope = nestedScrollScope3;
                            if (!booleanRef.element) {
                                return Unit.INSTANCE;
                            }
                        }
                    } else {
                        float fSignum = Math.signum(fFloatValue) * c11173.$threshold;
                        c11173.this$0.dispatchMouseWheelScroll(nestedScrollScope, fSignum);
                        Ref.ObjectRef<AnimationState<Float, AnimationVectors2>> objectRef3 = c11173.$animationState;
                        AnimationState<Float, AnimationVectors2> animationState = objectRef3.element;
                        objectRef3.element = AnimationState3.copy$default((AnimationState) animationState, animationState.getValue().floatValue() + fSignum, 0.0f, 0L, 0L, false, 30, (Object) null);
                        int iCoerceAtMost = RangesKt.coerceAtMost(MathKt.roundToInt(Math.abs(c11173.$targetValue.element - c11173.$animationState.element.getValue().floatValue()) / c11173.$speed), 100);
                        final MouseWheelScrollable2 mouseWheelScrollable22 = c11173.this$0;
                        AnimationState<Float, AnimationVectors2> animationState2 = c11173.$animationState.element;
                        final Ref.FloatRef floatRef2 = c11173.$targetValue;
                        float f = floatRef2.element;
                        final Ref.ObjectRef<MouseWheelScrollDelta> objectRef4 = c11173.$targetScrollDelta;
                        final ScrollingLogic scrollingLogic2 = c11173.$this_dispatchMouseWheelScroll;
                        final Ref.BooleanRef booleanRef9 = booleanRef;
                        Function1<Float, Boolean> function1 = new Function1<Float, Boolean>() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.dispatchMouseWheelScroll.3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(Float f2) {
                                return invoke(f2.floatValue());
                            }

                            /* JADX WARN: Type inference failed for: r3v2, types: [T, androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta] */
                            public final Boolean invoke(float f2) {
                                MouseWheelScrollable2 mouseWheelScrollable23 = mouseWheelScrollable22;
                                MouseWheelScrollDelta mouseWheelScrollDeltaSumOrNull = mouseWheelScrollable23.sumOrNull(mouseWheelScrollable23.channel);
                                if (mouseWheelScrollDeltaSumOrNull != null) {
                                    mouseWheelScrollable22.trackVelocity(mouseWheelScrollDeltaSumOrNull);
                                    Ref.ObjectRef<MouseWheelScrollDelta> objectRef5 = objectRef4;
                                    objectRef5.element = objectRef5.element.plus(mouseWheelScrollDeltaSumOrNull);
                                    Ref.FloatRef floatRef3 = floatRef2;
                                    ScrollingLogic scrollingLogic3 = scrollingLogic2;
                                    floatRef3.element = scrollingLogic3.m5041toFloatk4lQ0M(scrollingLogic3.m5039reverseIfNeededMKHz9U(objectRef4.element.getValue()));
                                    booleanRef9.element = !MouseWheelScrollable.isLowScrollingDelta(floatRef2.element - f2);
                                }
                                return Boolean.valueOf(mouseWheelScrollDeltaSumOrNull != null);
                            }
                        };
                        booleanRef2 = booleanRef9;
                        c11173.L$0 = nestedScrollScope;
                        c11173.L$1 = booleanRef2;
                        c11173.L$2 = null;
                        c11173.I$0 = iCoerceAtMost;
                        c11173.label = 2;
                        Object objAnimateMouseWheelScroll = mouseWheelScrollable22.animateMouseWheelScroll(nestedScrollScope, animationState2, f, iCoerceAtMost, function1, c11173);
                        nestedScrollScope2 = nestedScrollScope;
                        if (objAnimateMouseWheelScroll != coroutine_suspended) {
                            i = iCoerceAtMost;
                            if (booleanRef2.element) {
                                c11173.L$0 = nestedScrollScope2;
                                c11173.L$1 = booleanRef2;
                                c11173.L$2 = booleanRef2;
                                c11173.label = 3;
                                objDispatchMouseWheelScroll$waitNextScrollDelta = MouseWheelScrollable2.dispatchMouseWheelScroll$waitNextScrollDelta(c11173.this$0, c11173.$targetScrollDelta, c11173.$targetValue, c11173.$this_dispatchMouseWheelScroll, c11173.$animationState, 50 - i, c11173);
                                if (objDispatchMouseWheelScroll$waitNextScrollDelta != coroutine_suspended) {
                                    booleanRef3 = booleanRef2;
                                    nestedScrollScope3 = nestedScrollScope2;
                                    booleanRef2.element = ((Boolean) objDispatchMouseWheelScroll$waitNextScrollDelta).booleanValue();
                                    booleanRef = booleanRef3;
                                    nestedScrollScope = nestedScrollScope3;
                                    if (!booleanRef.element) {
                                    }
                                }
                            } else {
                                booleanRef = booleanRef2;
                                nestedScrollScope = nestedScrollScope2;
                                if (!booleanRef.element) {
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateMouseWheelScroll(final NestedScrollScope nestedScrollScope, AnimationState<Float, AnimationVectors2> animationState, float f, int i, final Function1<? super Float, Boolean> function1, Continuation<? super Unit> continuation) {
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = animationState.getValue().floatValue();
        Object objAnimateTo = SuspendAnimation.animateTo(animationState, boxing.boxFloat(f), AnimationSpecKt.tween$default(i, 0, Easing3.getLinearEasing(), 2, null), true, new Function1<AnimationState2<Float, AnimationVectors2>, Unit>() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.animateMouseWheelScroll.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AnimationState2<Float, AnimationVectors2> animationState2) {
                invoke2(animationState2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AnimationState2<Float, AnimationVectors2> animationState2) {
                float fFloatValue = animationState2.getValue().floatValue() - floatRef.element;
                if (!MouseWheelScrollable.isLowScrollingDelta(fFloatValue)) {
                    if (!MouseWheelScrollable.isLowScrollingDelta(fFloatValue - this.dispatchMouseWheelScroll(nestedScrollScope, fFloatValue))) {
                        animationState2.cancelAnimation();
                        return;
                    } else {
                        floatRef.element += fFloatValue;
                    }
                }
                if (function1.invoke(Float.valueOf(floatRef.element)).booleanValue()) {
                    animationState2.cancelAnimation();
                }
            }
        }, continuation);
        return objAnimateTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float dispatchMouseWheelScroll(NestedScrollScope nestedScrollScope, float f) {
        ScrollingLogic scrollingLogic = this.scrollingLogic;
        return scrollingLogic.m5041toFloatk4lQ0M(scrollingLogic.m5039reverseIfNeededMKHz9U(nestedScrollScope.mo5007scrollByOzD1aCk(scrollingLogic.m5042toOffsettuRUvjQ(scrollingLogic.reverseIfNeeded(f)), NestedScrollModifier8.INSTANCE.m7136getUserInputWNlRxjI())));
    }
}
