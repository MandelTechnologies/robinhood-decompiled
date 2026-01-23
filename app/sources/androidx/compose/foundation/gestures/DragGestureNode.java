package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p011ui.input.pointer.util.VelocityTracker;
import androidx.compose.p011ui.input.pointer.util.VelocityTracker4;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.PointerInputModifierNode;
import androidx.compose.p011ui.unit.Velocity;
import androidx.compose.p011ui.unit.Velocity2;
import com.robinhood.android.equities.companyfinancials.p116ui.CompanyFinancialsSection;
import com.robinhood.models.dao.RhRoomDatabase;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel4;
import kotlinx.coroutines.channels.Channel5;

/* compiled from: Draggable.kt */
@Metadata(m3635d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJO\u0010%\u001a\u00020\u000e2=\u0010$\u001a9\b\u0001\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\"\u0012\u0006\u0012\u0004\u0018\u00010#0\u001dH¦@¢\u0006\u0004\b%\u0010&J\u001a\u0010+\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H&ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001a\u0010/\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020,H&ø\u0001\u0000¢\u0006\u0004\b.\u0010*J\u000f\u00100\u001a\u00020\u0005H&¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000eH\u0016¢\u0006\u0004\b2\u0010\u0010J*\u0010;\u001a\u00020\u000e2\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0016ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020\u000eH\u0016¢\u0006\u0004\b<\u0010\u0010J\r\u0010=\u001a\u00020\u000e¢\u0006\u0004\b=\u0010\u0010JO\u0010?\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010>\u001a\u00020\u0005¢\u0006\u0004\b?\u0010@R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010AR<\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0006\u0010C\u001a\u0004\bD\u0010ER$\u0010\u0007\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u00058\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0007\u0010F\u001a\u0004\bG\u00101R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010B\u001a\u0004\u0018\u00010\b8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\t\u0010H\u001a\u0004\bI\u0010JR \u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010CR\u001e\u0010N\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010FR\u0018\u0010T\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010U\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006V"}, m3636d2 = {"Landroidx/compose/foundation/gestures/DragGestureNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "canDrag", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/gestures/Orientation;", "orientationLock", "<init>", "(Lkotlin/jvm/functions/Function1;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/Orientation;)V", "", "startListeningForEvents", "()V", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "initializePointerInputNode", "()Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", "event", "processDragStart", "(Landroidx/compose/foundation/gestures/DragEvent$DragStarted;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "processDragStop", "(Landroidx/compose/foundation/gestures/DragEvent$DragStopped;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processDragCancel", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Lkotlin/ParameterName;", "name", "dragDelta", "Lkotlin/coroutines/Continuation;", "", "forEachDelta", "drag", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/geometry/Offset;", "startedPosition", "onDragStarted-k-4lQ0M", "(J)V", "onDragStarted", "Landroidx/compose/ui/unit/Velocity;", "velocity", "onDragStopped-TH1AsA0", "onDragStopped", "startDragImmediately", "()Z", "onDetach", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "disposeInteractionSource", "shouldResetPointerInputHandling", "update", "(Lkotlin/jvm/functions/Function1;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/Orientation;Z)V", "Landroidx/compose/foundation/gestures/Orientation;", "<set-?>", "Lkotlin/jvm/functions/Function1;", "getCanDrag", "()Lkotlin/jvm/functions/Function1;", "Z", "getEnabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "_canDrag", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/gestures/DragEvent;", "channel", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "dragInteraction", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "isListeningForEvents", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public abstract class DragGestureNode extends DelegatingNode implements PointerInputModifierNode {
    private final Function1<PointerInputChange, Boolean> _canDrag = new Function1<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$_canDrag$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return this.this$0.getCanDrag().invoke(pointerInputChange);
        }
    };
    private Function1<? super PointerInputChange, Boolean> canDrag;
    private Channel<DragEvent> channel;
    private DragInteraction.Start dragInteraction;
    private boolean enabled;
    private InteractionSource3 interactionSource;
    private boolean isListeningForEvents;
    private Orientation orientationLock;
    private SuspendingPointerInputModifierNode pointerInputNode;

    /* compiled from: Draggable.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.DragGestureNode", m3645f = "Draggable.kt", m3646l = {RhRoomDatabase.MIGRATION_START_VER}, m3647m = "processDragCancel")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1 */
    static final class C11041 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C11041(Continuation<? super C11041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DragGestureNode.this.processDragCancel(this);
        }
    }

    /* compiled from: Draggable.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.DragGestureNode", m3645f = "Draggable.kt", m3646l = {534, 537}, m3647m = "processDragStart")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1 */
    static final class C11051 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C11051(Continuation<? super C11051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DragGestureNode.this.processDragStart(null, this);
        }
    }

    /* compiled from: Draggable.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.DragGestureNode", m3645f = "Draggable.kt", m3646l = {544}, m3647m = "processDragStop")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1 */
    static final class C11061 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C11061(Continuation<? super C11061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DragGestureNode.this.processDragStop(null, this);
        }
    }

    public abstract Object drag(Function2<? super Function1<? super DragEvent.DragDelta, Unit>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation);

    /* renamed from: onDragStarted-k-4lQ0M */
    public abstract void mo4955onDragStartedk4lQ0M(long startedPosition);

    /* renamed from: onDragStopped-TH1AsA0 */
    public abstract void mo4956onDragStoppedTH1AsA0(long velocity);

    /* renamed from: startDragImmediately */
    public abstract boolean getStartDragImmediately();

    public DragGestureNode(Function1<? super PointerInputChange, Boolean> function1, boolean z, InteractionSource3 interactionSource3, Orientation orientation) {
        this.orientationLock = orientation;
        this.canDrag = function1;
        this.enabled = z;
        this.interactionSource = interactionSource3;
    }

    protected final Function1<PointerInputChange, Boolean> getCanDrag() {
        return this.canDrag;
    }

    protected final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startListeningForEvents() {
        this.isListeningForEvents = true;
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new C11071(null), 3, null);
    }

    /* compiled from: Draggable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", m3645f = "Draggable.kt", m3646l = {421, 423, CompanyFinancialsSection.BAR_ANIMATION_DURATION, 432, 434, 437}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1 */
    static final class C11071 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        C11071(Continuation<? super C11071> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11071 c11071 = DragGestureNode.this.new C11071(continuation);
            c11071.L$0 = obj;
            return c11071;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x00fc, code lost:
        
            if (r7.processDragCancel(r6) != r0) goto L11;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:44:0x00db, B:40:0x00c1], limit reached: 56 */
        /* JADX WARN: Path cross not found for [B:46:0x00df, B:19:0x005e], limit reached: 56 */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[PHI: r1 r3
          0x0034: PHI (r1v14 kotlin.jvm.internal.Ref$ObjectRef) = (r1v6 kotlin.jvm.internal.Ref$ObjectRef), (r1v19 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:13:0x0031, B:36:0x00b8] A[DONT_GENERATE, DONT_INLINE]
          0x0034: PHI (r3v8 kotlinx.coroutines.CoroutineScope) = (r3v5 kotlinx.coroutines.CoroutineScope), (r3v11 kotlinx.coroutines.CoroutineScope) binds: [B:13:0x0031, B:36:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[PHI: r4
          0x005e: PHI (r4v7 kotlinx.coroutines.CoroutineScope) = 
          (r4v0 kotlinx.coroutines.CoroutineScope)
          (r4v3 kotlinx.coroutines.CoroutineScope)
          (r4v3 kotlinx.coroutines.CoroutineScope)
          (r4v3 kotlinx.coroutines.CoroutineScope)
          (r4v5 kotlinx.coroutines.CoroutineScope)
          (r4v8 kotlinx.coroutines.CoroutineScope)
         binds: [B:18:0x0056, B:45:0x00dd, B:47:0x00ec, B:41:0x00d6, B:30:0x008e, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00c1 A[Catch: CancellationException -> 0x00d9, TryCatch #2 {CancellationException -> 0x00d9, blocks: (B:38:0x00bb, B:40:0x00c1, B:44:0x00db, B:46:0x00df), top: B:59:0x00bb }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[Catch: CancellationException -> 0x00d9, TryCatch #2 {CancellationException -> 0x00d9, blocks: (B:38:0x00bb, B:40:0x00c1, B:44:0x00db, B:46:0x00df), top: B:59:0x00bb }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00ff  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008e -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d6 -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00dd -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00ec -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00fc -> B:11:0x0027). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Ref.ObjectRef objectRef;
            Ref.ObjectRef objectRef2;
            Ref.ObjectRef objectRef3;
            CoroutineScope coroutineScope2;
            CoroutineScope coroutineScope3;
            T t;
            DragGestureNode dragGestureNode;
            AnonymousClass1 anonymousClass1;
            T t2;
            T t3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                    if (!CoroutineScope2.isActive(coroutineScope)) {
                        objectRef = new Ref.ObjectRef();
                        Channel channel = DragGestureNode.this.channel;
                        if (channel == null) {
                            objectRef2 = objectRef;
                            t2 = 0;
                            objectRef.element = t2;
                            t3 = objectRef2.element;
                            if (t3 instanceof DragEvent.DragStarted) {
                            }
                            return coroutine_suspended;
                        }
                        this.L$0 = coroutineScope;
                        this.L$1 = objectRef;
                        this.L$2 = objectRef;
                        this.label = 1;
                        obj = channel.receive(this);
                        if (obj != coroutine_suspended) {
                            objectRef2 = objectRef;
                            t2 = (DragEvent) obj;
                            objectRef.element = t2;
                            t3 = objectRef2.element;
                            if (t3 instanceof DragEvent.DragStarted) {
                                this.L$0 = coroutineScope;
                                this.L$1 = objectRef2;
                                this.L$2 = null;
                                this.label = 2;
                                if (DragGestureNode.this.processDragStart((DragEvent.DragStarted) t3, this) != coroutine_suspended) {
                                    objectRef3 = objectRef2;
                                    coroutineScope2 = coroutineScope;
                                    dragGestureNode = DragGestureNode.this;
                                    anonymousClass1 = new AnonymousClass1(objectRef3, dragGestureNode, null);
                                    this.L$0 = coroutineScope2;
                                    this.L$1 = objectRef3;
                                    this.label = 3;
                                    if (dragGestureNode.drag(anonymousClass1, this) != coroutine_suspended) {
                                        coroutineScope = coroutineScope2;
                                        try {
                                        } catch (CancellationException unused) {
                                            coroutineScope3 = coroutineScope;
                                            DragGestureNode dragGestureNode2 = DragGestureNode.this;
                                            this.L$0 = coroutineScope3;
                                            this.L$1 = null;
                                            this.label = 6;
                                            break;
                                        }
                                        t = objectRef3.element;
                                        if (t instanceof DragEvent.DragStopped) {
                                            DragGestureNode dragGestureNode3 = DragGestureNode.this;
                                            Intrinsics.checkNotNull(t, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped");
                                            this.L$0 = coroutineScope;
                                            this.L$1 = null;
                                            this.label = 4;
                                            if (dragGestureNode3.processDragStop((DragEvent.DragStopped) t, this) != coroutine_suspended) {
                                                if (!CoroutineScope2.isActive(coroutineScope)) {
                                                }
                                            }
                                        } else {
                                            if (t instanceof DragEvent.DragCancelled) {
                                                DragGestureNode dragGestureNode4 = DragGestureNode.this;
                                                this.L$0 = coroutineScope;
                                                this.L$1 = null;
                                                this.label = 5;
                                                if (dragGestureNode4.processDragCancel(this) != coroutine_suspended) {
                                                }
                                            }
                                            if (!CoroutineScope2.isActive(coroutineScope)) {
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return coroutine_suspended;
                    }
                case 1:
                    objectRef = (Ref.ObjectRef) this.L$2;
                    objectRef2 = (Ref.ObjectRef) this.L$1;
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    t2 = (DragEvent) obj;
                    objectRef.element = t2;
                    t3 = objectRef2.element;
                    if (t3 instanceof DragEvent.DragStarted) {
                    }
                    return coroutine_suspended;
                case 2:
                    objectRef3 = (Ref.ObjectRef) this.L$1;
                    coroutineScope2 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    dragGestureNode = DragGestureNode.this;
                    anonymousClass1 = new AnonymousClass1(objectRef3, dragGestureNode, null);
                    this.L$0 = coroutineScope2;
                    this.L$1 = objectRef3;
                    this.label = 3;
                    if (dragGestureNode.drag(anonymousClass1, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 3:
                    objectRef3 = (Ref.ObjectRef) this.L$1;
                    coroutineScope2 = (CoroutineScope) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (CancellationException unused2) {
                        coroutineScope3 = coroutineScope2;
                        DragGestureNode dragGestureNode22 = DragGestureNode.this;
                        this.L$0 = coroutineScope3;
                        this.L$1 = null;
                        this.label = 6;
                        break;
                    }
                    coroutineScope = coroutineScope2;
                    t = objectRef3.element;
                    if (t instanceof DragEvent.DragStopped) {
                    }
                    break;
                case 4:
                    coroutineScope3 = (CoroutineScope) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (CancellationException unused3) {
                        DragGestureNode dragGestureNode222 = DragGestureNode.this;
                        this.L$0 = coroutineScope3;
                        this.L$1 = null;
                        this.label = 6;
                        break;
                    }
                    coroutineScope = coroutineScope3;
                    if (!CoroutineScope2.isActive(coroutineScope)) {
                    }
                    break;
                case 5:
                    coroutineScope3 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = coroutineScope3;
                    if (!CoroutineScope2.isActive(coroutineScope)) {
                    }
                    break;
                case 6:
                    coroutineScope3 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = coroutineScope3;
                    if (!CoroutineScope2.isActive(coroutineScope)) {
                    }
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: Draggable.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "processDelta", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Lkotlin/ParameterName;", "name", "dragDelta"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", m3645f = "Draggable.kt", m3646l = {428}, m3647m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Function1<? super DragEvent.DragDelta, ? extends Unit>, Continuation<? super Unit>, Object> {
            final /* synthetic */ Ref.ObjectRef<DragEvent> $event;
            /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ DragGestureNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Ref.ObjectRef<DragEvent> objectRef, DragGestureNode dragGestureNode, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$event = objectRef;
                this.this$0 = dragGestureNode;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$event, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Function1<? super DragEvent.DragDelta, ? extends Unit> function1, Continuation<? super Unit> continuation) {
                return invoke2((Function1<? super DragEvent.DragDelta, Unit>) function1, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Function1<? super DragEvent.DragDelta, Unit> function1, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(function1, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0049 -> B:25:0x005b). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0055 -> B:24:0x0058). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Function1 function1;
                DragEvent dragEvent;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    function1 = (Function1) this.L$0;
                    dragEvent = this.$event.element;
                    if (dragEvent instanceof DragEvent.DragStopped) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ref.ObjectRef<DragEvent> objectRef = (Ref.ObjectRef) this.L$1;
                function1 = (Function1) this.L$0;
                ResultKt.throwOnFailure(obj);
                T t = (DragEvent) obj;
                objectRef.element = t;
                dragEvent = this.$event.element;
                if ((dragEvent instanceof DragEvent.DragStopped) && !(dragEvent instanceof DragEvent.DragCancelled)) {
                    t = 0;
                    DragEvent.DragDelta dragDelta = dragEvent instanceof DragEvent.DragDelta ? (DragEvent.DragDelta) dragEvent : null;
                    if (dragDelta != null) {
                        function1.invoke(dragDelta);
                    }
                    objectRef = this.$event;
                    Channel channel = this.this$0.channel;
                    if (channel != null) {
                        this.L$0 = function1;
                        this.L$1 = objectRef;
                        this.label = 1;
                        obj = channel.receive(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        T t2 = (DragEvent) obj;
                    }
                    objectRef.element = t2;
                    dragEvent = this.$event.element;
                    if (dragEvent instanceof DragEvent.DragStopped) {
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.isListeningForEvents = false;
        disposeInteractionSource();
    }

    @Override // androidx.compose.p011ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo4851onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        if (this.enabled && this.pointerInputNode == null) {
            this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(initializePointerInputNode());
        }
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.mo4851onPointerEventH0pRuoY(pointerEvent, pass, bounds);
        }
    }

    private final SuspendingPointerInputModifierNode initializePointerInputNode() {
        return SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.gestures.DragGestureNode.initializePointerInputNode.1
            @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
            public final Object invoke(final PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                final VelocityTracker velocityTracker = new VelocityTracker();
                final DragGestureNode dragGestureNode = DragGestureNode.this;
                Function3<PointerInputChange, PointerInputChange, Offset, Unit> function3 = new Function3<PointerInputChange, PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragStart$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, Offset offset) {
                        m4987invoke0AR0LA0(pointerInputChange, pointerInputChange2, offset.getPackedValue());
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke-0AR0LA0, reason: not valid java name */
                    public final void m4987invoke0AR0LA0(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j) {
                        if (dragGestureNode.getCanDrag().invoke(pointerInputChange).booleanValue()) {
                            if (!dragGestureNode.isListeningForEvents) {
                                if (dragGestureNode.channel == null) {
                                    dragGestureNode.channel = Channel4.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                                }
                                dragGestureNode.startListeningForEvents();
                            }
                            VelocityTracker4.addPointerInputChange(velocityTracker, pointerInputChange);
                            long jM6546minusMKHz9U = Offset.m6546minusMKHz9U(pointerInputChange2.getPosition(), j);
                            Channel channel = dragGestureNode.channel;
                            if (channel != null) {
                                Channel5.m28802boximpl(channel.mo8337trySendJP2dKIU(new DragEvent.DragStarted(jM6546minusMKHz9U, null)));
                            }
                        }
                    }
                };
                final DragGestureNode dragGestureNode2 = DragGestureNode.this;
                Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragEnd$1
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
                        VelocityTracker4.addPointerInputChange(velocityTracker, pointerInputChange);
                        float maximumFlingVelocity = pointerInputScope.getViewConfiguration().getMaximumFlingVelocity();
                        long jM7218calculateVelocityAH228Gc = velocityTracker.m7218calculateVelocityAH228Gc(Velocity2.Velocity(maximumFlingVelocity, maximumFlingVelocity));
                        velocityTracker.resetTracking();
                        Channel channel = dragGestureNode2.channel;
                        if (channel != null) {
                            Channel5.m28802boximpl(channel.mo8337trySendJP2dKIU(new DragEvent.DragStopped(DraggableKt.m4993toValidVelocityTH1AsA0(jM7218calculateVelocityAH228Gc), null)));
                        }
                    }
                };
                final DragGestureNode dragGestureNode3 = DragGestureNode.this;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragCancel$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Channel channel = dragGestureNode3.channel;
                        if (channel != null) {
                            Channel5.m28802boximpl(channel.mo8337trySendJP2dKIU(DragEvent.DragCancelled.INSTANCE));
                        }
                    }
                };
                final DragGestureNode dragGestureNode4 = DragGestureNode.this;
                Function0<Boolean> function02 = new Function0<Boolean>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$shouldAwaitTouchSlop$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return Boolean.valueOf(!dragGestureNode4.getStartDragImmediately());
                    }
                };
                final DragGestureNode dragGestureNode5 = DragGestureNode.this;
                Object objCoroutineScope = CoroutineScope2.coroutineScope(new AnonymousClass1(DragGestureNode.this, pointerInputScope, function3, function1, function0, function02, new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDrag$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
                        m4986invokeUv8p0NA(pointerInputChange, offset.getPackedValue());
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                    public final void m4986invokeUv8p0NA(PointerInputChange pointerInputChange, long j) {
                        VelocityTracker4.addPointerInputChange(velocityTracker, pointerInputChange);
                        Channel channel = dragGestureNode5.channel;
                        if (channel != null) {
                            Channel5.m28802boximpl(channel.mo8337trySendJP2dKIU(new DragEvent.DragDelta(j, null)));
                        }
                    }
                }, null), continuation);
                return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
            }

            /* compiled from: Draggable.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1", m3645f = "Draggable.kt", m3646l = {512}, m3647m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
                final /* synthetic */ Function0<Unit> $onDragCancel;
                final /* synthetic */ Function1<PointerInputChange, Unit> $onDragEnd;
                final /* synthetic */ Function3<PointerInputChange, PointerInputChange, Offset, Unit> $onDragStart;
                final /* synthetic */ Function0<Boolean> $shouldAwaitTouchSlop;
                final /* synthetic */ PointerInputScope $this_SuspendingPointerInputModifierNode;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ DragGestureNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(DragGestureNode dragGestureNode, PointerInputScope pointerInputScope, Function3<? super PointerInputChange, ? super PointerInputChange, ? super Offset, Unit> function3, Function1<? super PointerInputChange, Unit> function1, Function0<Unit> function0, Function0<Boolean> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = dragGestureNode;
                    this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
                    this.$onDragStart = function3;
                    this.$onDragEnd = function1;
                    this.$onDragCancel = function0;
                    this.$shouldAwaitTouchSlop = function02;
                    this.$onDrag = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_SuspendingPointerInputModifierNode, this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$shouldAwaitTouchSlop, this.$onDrag, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    CoroutineScope coroutineScope;
                    AnonymousClass1 anonymousClass1;
                    CancellationException cancellationException;
                    Channel channel;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        coroutineScope = (CoroutineScope) this.L$0;
                        try {
                            Orientation orientation = this.this$0.orientationLock;
                            PointerInputScope pointerInputScope = this.$this_SuspendingPointerInputModifierNode;
                            Function3<PointerInputChange, PointerInputChange, Offset, Unit> function3 = this.$onDragStart;
                            Function1<PointerInputChange, Unit> function1 = this.$onDragEnd;
                            Function0<Unit> function0 = this.$onDragCancel;
                            Function0<Boolean> function02 = this.$shouldAwaitTouchSlop;
                            Function2<PointerInputChange, Offset, Unit> function2 = this.$onDrag;
                            this.L$0 = coroutineScope;
                            this.label = 1;
                            anonymousClass1 = this;
                            try {
                                if (DragGestureDetectorKt.detectDragGestures(pointerInputScope, function3, function1, function0, function02, orientation, function2, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } catch (CancellationException e) {
                                e = e;
                                cancellationException = e;
                                channel = anonymousClass1.this$0.channel;
                                if (channel != null) {
                                    Channel5.m28802boximpl(channel.mo8337trySendJP2dKIU(DragEvent.DragCancelled.INSTANCE));
                                }
                                if (!CoroutineScope2.isActive(coroutineScope)) {
                                    throw cancellationException;
                                }
                                return Unit.INSTANCE;
                            }
                        } catch (CancellationException e2) {
                            e = e2;
                            anonymousClass1 = this;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        coroutineScope = (CoroutineScope) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (CancellationException e3) {
                            cancellationException = e3;
                            anonymousClass1 = this;
                            channel = anonymousClass1.this$0.channel;
                            if (channel != null) {
                            }
                            if (!CoroutineScope2.isActive(coroutineScope)) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
        });
    }

    @Override // androidx.compose.p011ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.onCancelPointerInput();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r2.emit(r5, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processDragStart(DragEvent.DragStarted dragStarted, Continuation<? super Unit> continuation) {
        C11051 c11051;
        DragGestureNode dragGestureNode;
        DragInteraction.Start start;
        DragEvent.DragStarted dragStarted2;
        DragInteraction.Start start2;
        DragGestureNode dragGestureNode2;
        if (continuation instanceof C11051) {
            c11051 = (C11051) continuation;
            int i = c11051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c11051.label = i - Integer.MIN_VALUE;
            } else {
                c11051 = new C11051(continuation);
            }
        }
        Object obj = c11051.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c11051.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            DragInteraction.Start start3 = this.dragInteraction;
            if (start3 != null && (r2 = this.interactionSource) != null) {
                DragInteraction.Cancel cancel = new DragInteraction.Cancel(start3);
                c11051.L$0 = this;
                c11051.L$1 = dragStarted;
                c11051.label = 1;
            }
            dragGestureNode = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                start2 = (DragInteraction.Start) c11051.L$2;
                dragStarted2 = (DragEvent.DragStarted) c11051.L$1;
                dragGestureNode2 = (DragGestureNode) c11051.L$0;
                ResultKt.throwOnFailure(obj);
                start = start2;
                dragGestureNode = dragGestureNode2;
                dragStarted = dragStarted2;
                dragGestureNode.dragInteraction = start;
                dragGestureNode.mo4955onDragStartedk4lQ0M(dragStarted.getStartPoint());
                return Unit.INSTANCE;
            }
            dragStarted = (DragEvent.DragStarted) c11051.L$1;
            dragGestureNode = (DragGestureNode) c11051.L$0;
            ResultKt.throwOnFailure(obj);
        }
        start = new DragInteraction.Start();
        InteractionSource3 interactionSource3 = dragGestureNode.interactionSource;
        if (interactionSource3 != null) {
            c11051.L$0 = dragGestureNode;
            c11051.L$1 = dragStarted;
            c11051.L$2 = start;
            c11051.label = 2;
            if (interactionSource3.emit(start, c11051) != coroutine_suspended) {
                dragStarted2 = dragStarted;
                start2 = start;
                dragGestureNode2 = dragGestureNode;
                start = start2;
                dragGestureNode = dragGestureNode2;
                dragStarted = dragStarted2;
            }
            return coroutine_suspended;
        }
        dragGestureNode.dragInteraction = start;
        dragGestureNode.mo4955onDragStartedk4lQ0M(dragStarted.getStartPoint());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processDragStop(DragEvent.DragStopped dragStopped, Continuation<? super Unit> continuation) {
        C11061 c11061;
        DragGestureNode dragGestureNode;
        if (continuation instanceof C11061) {
            c11061 = (C11061) continuation;
            int i = c11061.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c11061.label = i - Integer.MIN_VALUE;
            } else {
                c11061 = new C11061(continuation);
            }
        }
        Object obj = c11061.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c11061.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            DragInteraction.Start start = this.dragInteraction;
            if (start != null) {
                InteractionSource3 interactionSource3 = this.interactionSource;
                if (interactionSource3 != null) {
                    DragInteraction.Stop stop = new DragInteraction.Stop(start);
                    c11061.L$0 = this;
                    c11061.L$1 = dragStopped;
                    c11061.label = 1;
                    if (interactionSource3.emit(stop, c11061) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                dragGestureNode = this;
            } else {
                dragGestureNode = this;
                dragGestureNode.mo4956onDragStoppedTH1AsA0(dragStopped.getVelocity());
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dragStopped = (DragEvent.DragStopped) c11061.L$1;
            dragGestureNode = (DragGestureNode) c11061.L$0;
            ResultKt.throwOnFailure(obj);
        }
        dragGestureNode.dragInteraction = null;
        dragGestureNode.mo4956onDragStoppedTH1AsA0(dragStopped.getVelocity());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processDragCancel(Continuation<? super Unit> continuation) {
        C11041 c11041;
        DragGestureNode dragGestureNode;
        if (continuation instanceof C11041) {
            c11041 = (C11041) continuation;
            int i = c11041.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c11041.label = i - Integer.MIN_VALUE;
            } else {
                c11041 = new C11041(continuation);
            }
        }
        Object obj = c11041.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c11041.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            DragInteraction.Start start = this.dragInteraction;
            if (start != null) {
                InteractionSource3 interactionSource3 = this.interactionSource;
                if (interactionSource3 != null) {
                    DragInteraction.Cancel cancel = new DragInteraction.Cancel(start);
                    c11041.L$0 = this;
                    c11041.label = 1;
                    if (interactionSource3.emit(cancel, c11041) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                dragGestureNode = this;
            } else {
                dragGestureNode = this;
                dragGestureNode.mo4956onDragStoppedTH1AsA0(Velocity.INSTANCE.m8109getZero9UxMQ8M());
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dragGestureNode = (DragGestureNode) c11041.L$0;
            ResultKt.throwOnFailure(obj);
        }
        dragGestureNode.dragInteraction = null;
        dragGestureNode.mo4956onDragStoppedTH1AsA0(Velocity.INSTANCE.m8109getZero9UxMQ8M());
        return Unit.INSTANCE;
    }

    public final void disposeInteractionSource() {
        DragInteraction.Start start = this.dragInteraction;
        if (start != null) {
            InteractionSource3 interactionSource3 = this.interactionSource;
            if (interactionSource3 != null) {
                interactionSource3.tryEmit(new DragInteraction.Cancel(start));
            }
            this.dragInteraction = null;
        }
    }

    public static /* synthetic */ void update$default(DragGestureNode dragGestureNode, Function1 function1, boolean z, InteractionSource3 interactionSource3, Orientation orientation, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((i & 1) != 0) {
            function1 = dragGestureNode.canDrag;
        }
        if ((i & 2) != 0) {
            z = dragGestureNode.enabled;
        }
        if ((i & 4) != 0) {
            interactionSource3 = dragGestureNode.interactionSource;
        }
        if ((i & 8) != 0) {
            orientation = dragGestureNode.orientationLock;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        boolean z3 = z2;
        InteractionSource3 interactionSource32 = interactionSource3;
        Function1 function12 = function1;
        dragGestureNode.update(function12, z, interactionSource32, orientation, z3);
    }

    public final void update(Function1<? super PointerInputChange, Boolean> canDrag, boolean enabled, InteractionSource3 interactionSource, Orientation orientationLock, boolean shouldResetPointerInputHandling) {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode;
        this.canDrag = canDrag;
        boolean z = true;
        if (this.enabled != enabled) {
            this.enabled = enabled;
            if (!enabled) {
                disposeInteractionSource();
                SuspendingPointerInputModifierNode suspendingPointerInputModifierNode2 = this.pointerInputNode;
                if (suspendingPointerInputModifierNode2 != null) {
                    undelegate(suspendingPointerInputModifierNode2);
                }
                this.pointerInputNode = null;
            }
            shouldResetPointerInputHandling = true;
        }
        if (!Intrinsics.areEqual(this.interactionSource, interactionSource)) {
            disposeInteractionSource();
            this.interactionSource = interactionSource;
        }
        if (this.orientationLock != orientationLock) {
            this.orientationLock = orientationLock;
        } else {
            z = shouldResetPointerInputHandling;
        }
        if (!z || (suspendingPointerInputModifierNode = this.pointerInputNode) == null) {
            return;
        }
        suspendingPointerInputModifierNode.resetPointerInputHandler();
    }
}
