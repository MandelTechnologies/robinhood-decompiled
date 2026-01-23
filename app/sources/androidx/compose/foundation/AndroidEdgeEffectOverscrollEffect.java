package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.ForEachGesture;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.geometry.SizeKt;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier8;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerId;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p011ui.node.DelegatableNode;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.Velocity;
import androidx.compose.p011ui.unit.Velocity2;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* compiled from: AndroidOverscroll.android.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018J\u001a\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0018J\u001a\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0018J6\u0010&\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\"H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%J?\u0010/\u001a\u00020\f2\u0006\u0010(\u001a\u00020'2\"\u0010,\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0*\u0012\u0006\u0012\u0004\u0018\u00010+0)H\u0096@ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001a\u00104\u001a\u00020\f2\u0006\u00101\u001a\u000200H\u0000ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u0015\u00107\u001a\u00020\u000fH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u000f\u00109\u001a\u00020\fH\u0000¢\u0006\u0004\b8\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R\u001c\u0010;\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R \u0010A\u001a\b\u0012\u0004\u0012\u00020\f0@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR(\u0010E\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bE\u0010F\u0012\u0004\bK\u0010\u000e\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0016\u0010L\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010FR\u001c\u0010M\u001a\u0002008\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bM\u0010<R\u001c\u0010O\u001a\u00020N8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bO\u0010<R\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010T\u001a\u00020S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010H\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, m3636d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "Landroid/content/Context;", "context", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/graphics/Color;", "glowColor", "Landroidx/compose/foundation/layout/PaddingValues;", "glowDrawPadding", "<init>", "(Landroid/content/Context;Landroidx/compose/ui/unit/Density;JLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "animateToReleaseIfNeeded", "()V", "Landroidx/compose/ui/geometry/Offset;", "delta", "", "releaseOppositeOverscroll-k-4lQ0M", "(J)Z", "releaseOppositeOverscroll", "scroll", "", "pullTop-k-4lQ0M", "(J)F", "pullTop", "pullBottom-k-4lQ0M", "pullBottom", "pullLeft-k-4lQ0M", "pullLeft", "pullRight-k-4lQ0M", "pullRight", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "Lkotlin/Function1;", "performScroll", "applyToScroll-Rhakbz0", "(JILkotlin/jvm/functions/Function1;)J", "applyToScroll", "Landroidx/compose/ui/unit/Velocity;", "velocity", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "performFling", "applyToFling-BMRW4eQ", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyToFling", "Landroidx/compose/ui/geometry/Size;", "size", "updateSize-uvyYCjk$foundation_release", "(J)V", "updateSize", "displacement-F1C5BW0$foundation_release", "()J", "displacement", "invalidateOverscroll$foundation_release", "invalidateOverscroll", "Landroidx/compose/ui/unit/Density;", "pointerPosition", "J", "Landroidx/compose/foundation/EdgeEffectWrapper;", "edgeEffectWrapper", "Landroidx/compose/foundation/EdgeEffectWrapper;", "Landroidx/compose/runtime/MutableState;", "redrawSignal", "Landroidx/compose/runtime/MutableState;", "getRedrawSignal$foundation_release", "()Landroidx/compose/runtime/MutableState;", "invalidationEnabled", "Z", "getInvalidationEnabled$foundation_release", "()Z", "setInvalidationEnabled$foundation_release", "(Z)V", "getInvalidationEnabled$foundation_release$annotations", "scrollCycleInProgress", "containerSize", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "node", "Landroidx/compose/ui/node/DelegatableNode;", "getNode", "()Landroidx/compose/ui/node/DelegatableNode;", "isInProgress", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect implements Overscroll {
    private long containerSize;
    private final Density density;
    private final EdgeEffectWrapper edgeEffectWrapper;
    private boolean invalidationEnabled;
    private final DelegatableNode node;
    private long pointerId;
    private final SuspendingPointerInputModifierNode pointerInputNode;
    private long pointerPosition;
    private final SnapshotState<Unit> redrawSignal;
    private boolean scrollCycleInProgress;

    public /* synthetic */ AndroidEdgeEffectOverscrollEffect(Context context, Density density, long j, PaddingValues paddingValues, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, density, j, paddingValues);
    }

    private AndroidEdgeEffectOverscrollEffect(Context context, Density density, long j, PaddingValues paddingValues) {
        DelegatableNode glowOverscrollNode;
        this.density = density;
        this.pointerPosition = Offset.INSTANCE.m6552getUnspecifiedF1C5BW0();
        EdgeEffectWrapper edgeEffectWrapper = new EdgeEffectWrapper(context, Color2.m6735toArgb8_81llA(j));
        this.edgeEffectWrapper = edgeEffectWrapper;
        this.redrawSignal = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
        this.invalidationEnabled = true;
        this.containerSize = Size.INSTANCE.m6589getZeroNHjbRc();
        this.pointerId = PointerId.m7168constructorimpl(-1L);
        SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode = SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1

            /* compiled from: AndroidOverscroll.android.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1", m3645f = "AndroidOverscroll.android.kt", m3646l = {783, 787}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1 */
            static final class C10201 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C10201(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, Continuation<? super C10201> continuation) {
                    super(2, continuation);
                    this.this$0 = androidEdgeEffectOverscrollEffect;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C10201 c10201 = new C10201(this.this$0, continuation);
                    c10201.L$0 = obj;
                    return c10201;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                    return ((C10201) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
                
                    if (r15 != r0) goto L18;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005e -> B:18:0x0061). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    C10201 c10201;
                    AwaitPointerEventScope awaitPointerEventScope;
                    Object obj2;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                        this.L$0 = awaitPointerEventScope2;
                        this.label = 1;
                        c10201 = this;
                        obj = TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope2, false, null, c10201, 2, null);
                        if (obj != coroutine_suspended) {
                            awaitPointerEventScope = awaitPointerEventScope2;
                        }
                        return coroutine_suspended;
                    }
                    if (i == 1) {
                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        c10201 = this;
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        c10201 = this;
                        List<PointerInputChange> changes = ((PointerEvent) obj).getChanges();
                        ArrayList arrayList = new ArrayList(changes.size());
                        int size = changes.size();
                        int i2 = 0;
                        for (int i3 = 0; i3 < size; i3++) {
                            PointerInputChange pointerInputChange = changes.get(i3);
                            if (pointerInputChange.getPressed()) {
                                arrayList.add(pointerInputChange);
                            }
                        }
                        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = c10201.this$0;
                        int size2 = arrayList.size();
                        while (true) {
                            if (i2 >= size2) {
                                obj2 = null;
                                break;
                            }
                            obj2 = arrayList.get(i2);
                            if (PointerId.m7170equalsimpl0(((PointerInputChange) obj2).getId(), androidEdgeEffectOverscrollEffect.pointerId)) {
                                break;
                            }
                            i2++;
                        }
                        PointerInputChange pointerInputChange2 = (PointerInputChange) obj2;
                        if (pointerInputChange2 == null) {
                            pointerInputChange2 = (PointerInputChange) CollectionsKt.firstOrNull((List) arrayList);
                        }
                        if (pointerInputChange2 != null) {
                            c10201.this$0.pointerId = pointerInputChange2.getId();
                            c10201.this$0.pointerPosition = pointerInputChange2.getPosition();
                        }
                        if (arrayList.isEmpty()) {
                            c10201.this$0.pointerId = PointerId.m7168constructorimpl(-1L);
                            return Unit.INSTANCE;
                        }
                        c10201.L$0 = awaitPointerEventScope;
                        c10201.label = 2;
                        obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, this, 1, null);
                    }
                    PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
                    c10201.this$0.pointerId = pointerInputChange3.getId();
                    c10201.this$0.pointerPosition = pointerInputChange3.getPosition();
                    c10201.L$0 = awaitPointerEventScope;
                    c10201.label = 2;
                    obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, this, 1, null);
                }
            }

            @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new C10201(this.this$0, null), continuation);
                return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
            }
        });
        this.pointerInputNode = SuspendingPointerInputModifierNode;
        if (Build.VERSION.SDK_INT >= 31) {
            glowOverscrollNode = new StretchOverscrollNode(SuspendingPointerInputModifierNode, this, edgeEffectWrapper);
        } else {
            glowOverscrollNode = new GlowOverscrollNode(SuspendingPointerInputModifierNode, this, edgeEffectWrapper, paddingValues);
        }
        this.node = glowOverscrollNode;
    }

    public final SnapshotState<Unit> getRedrawSignal$foundation_release() {
        return this.redrawSignal;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8 A[PHI: r11
      0x00b8: PHI (r11v9 float) = (r11v8 float), (r11v12 float) binds: [B:43:0x00e9, B:32:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0132 A[PHI: r14
      0x0132: PHI (r14v9 float) = (r14v8 float), (r14v12 float) binds: [B:67:0x0162, B:56:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.foundation.Overscroll
    /* renamed from: applyToScroll-Rhakbz0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long mo4860applyToScrollRhakbz0(long delta, int source, Function1<? super Offset, Offset> performScroll) {
        float fM4854pullBottomk4lQ0M;
        float fIntBitsToFloat;
        float fM4856pullRightk4lQ0M;
        float fIntBitsToFloat2;
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        if (Size.m6585isEmptyimpl(this.containerSize)) {
            return performScroll.invoke(Offset.m6534boximpl(delta)).getPackedValue();
        }
        if (!this.scrollCycleInProgress) {
            if (this.edgeEffectWrapper.isLeftStretched()) {
                m4855pullLeftk4lQ0M(Offset.INSTANCE.m6553getZeroF1C5BW0());
            }
            if (this.edgeEffectWrapper.isRightStretched()) {
                m4856pullRightk4lQ0M(Offset.INSTANCE.m6553getZeroF1C5BW0());
            }
            if (this.edgeEffectWrapper.isTopStretched()) {
                m4857pullTopk4lQ0M(Offset.INSTANCE.m6553getZeroF1C5BW0());
            }
            if (this.edgeEffectWrapper.isBottomStretched()) {
                m4854pullBottomk4lQ0M(Offset.INSTANCE.m6553getZeroF1C5BW0());
            }
            this.scrollCycleInProgress = true;
        }
        float fM4870destretchMultiplierGyEprt8 = AndroidOverscroll_androidKt.m4870destretchMultiplierGyEprt8(source);
        long jM6548timestuRUvjQ = Offset.m6548timestuRUvjQ(delta, fM4870destretchMultiplierGyEprt8);
        int i2 = (int) (delta & 4294967295L);
        if (Float.intBitsToFloat(i2) != 0.0f) {
            if (this.edgeEffectWrapper.isTopStretched() && Float.intBitsToFloat(i2) < 0.0f) {
                fM4854pullBottomk4lQ0M = m4857pullTopk4lQ0M(jM6548timestuRUvjQ);
                if (!this.edgeEffectWrapper.isTopStretched()) {
                    this.edgeEffectWrapper.getOrCreateTopEffect().finish();
                }
                if (fM4854pullBottomk4lQ0M == Float.intBitsToFloat((int) (jM6548timestuRUvjQ & 4294967295L))) {
                    fIntBitsToFloat = Float.intBitsToFloat(i2);
                }
            } else if (!this.edgeEffectWrapper.isBottomStretched() || Float.intBitsToFloat(i2) <= 0.0f) {
                fIntBitsToFloat = 0.0f;
            } else {
                fM4854pullBottomk4lQ0M = m4854pullBottomk4lQ0M(jM6548timestuRUvjQ);
                if (!this.edgeEffectWrapper.isBottomStretched()) {
                    this.edgeEffectWrapper.getOrCreateBottomEffect().finish();
                }
                fIntBitsToFloat = fM4854pullBottomk4lQ0M == Float.intBitsToFloat((int) (jM6548timestuRUvjQ & 4294967295L)) ? Float.intBitsToFloat(i2) : fM4854pullBottomk4lQ0M / fM4870destretchMultiplierGyEprt8;
            }
        }
        int i3 = (int) (delta >> 32);
        if (Float.intBitsToFloat(i3) != 0.0f) {
            if (this.edgeEffectWrapper.isLeftStretched() && Float.intBitsToFloat(i3) < 0.0f) {
                fM4856pullRightk4lQ0M = m4855pullLeftk4lQ0M(jM6548timestuRUvjQ);
                if (!this.edgeEffectWrapper.isLeftStretched()) {
                    this.edgeEffectWrapper.getOrCreateLeftEffect().finish();
                }
                if (fM4856pullRightk4lQ0M == Float.intBitsToFloat((int) (jM6548timestuRUvjQ >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i3);
                }
            } else if (!this.edgeEffectWrapper.isRightStretched() || Float.intBitsToFloat(i3) <= 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fM4856pullRightk4lQ0M = m4856pullRightk4lQ0M(jM6548timestuRUvjQ);
                if (!this.edgeEffectWrapper.isRightStretched()) {
                    this.edgeEffectWrapper.getOrCreateRightEffect().finish();
                }
                fIntBitsToFloat2 = fM4856pullRightk4lQ0M == Float.intBitsToFloat((int) (jM6548timestuRUvjQ >> 32)) ? Float.intBitsToFloat(i3) : fM4856pullRightk4lQ0M / fM4870destretchMultiplierGyEprt8;
            }
        }
        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L));
        Offset.Companion companion = Offset.INSTANCE;
        if (!Offset.m6540equalsimpl0(jM6535constructorimpl, companion.m6553getZeroF1C5BW0())) {
            invalidateOverscroll$foundation_release();
        }
        long jM6546minusMKHz9U = Offset.m6546minusMKHz9U(delta, jM6535constructorimpl);
        long packedValue = performScroll.invoke(Offset.m6534boximpl(jM6546minusMKHz9U)).getPackedValue();
        long jM6546minusMKHz9U2 = Offset.m6546minusMKHz9U(jM6546minusMKHz9U, packedValue);
        if ((Float.intBitsToFloat((int) (jM6546minusMKHz9U >> 32)) != 0.0f || Float.intBitsToFloat((int) (jM6546minusMKHz9U & 4294967295L)) != 0.0f) && (Float.intBitsToFloat((int) (packedValue >> 32)) != 0.0f || Float.intBitsToFloat((int) (packedValue & 4294967295L)) != 0.0f)) {
            EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
            if (edgeEffectWrapper.isLeftStretched() || edgeEffectWrapper.isTopStretched() || edgeEffectWrapper.isRightStretched() || edgeEffectWrapper.isBottomStretched()) {
                animateToReleaseIfNeeded();
            }
        }
        if (NestedScrollModifier8.m7133equalsimpl0(source, NestedScrollModifier8.INSTANCE.m7136getUserInputWNlRxjI())) {
            int i4 = (int) (jM6546minusMKHz9U2 >> 32);
            if (Float.intBitsToFloat(i4) > 0.5f) {
                m4855pullLeftk4lQ0M(jM6546minusMKHz9U2);
            } else if (Float.intBitsToFloat(i4) < -0.5f) {
                m4856pullRightk4lQ0M(jM6546minusMKHz9U2);
            } else {
                z2 = false;
                i = (int) (jM6546minusMKHz9U2 & 4294967295L);
                if (Float.intBitsToFloat(i) <= 0.5f) {
                    m4857pullTopk4lQ0M(jM6546minusMKHz9U2);
                } else if (Float.intBitsToFloat(i) < -0.5f) {
                    m4854pullBottomk4lQ0M(jM6546minusMKHz9U2);
                } else {
                    z3 = false;
                    z = !z2 || z3;
                }
                z3 = true;
                if (z2) {
                }
            }
            z2 = true;
            i = (int) (jM6546minusMKHz9U2 & 4294967295L);
            if (Float.intBitsToFloat(i) <= 0.5f) {
            }
            z3 = true;
            if (z2) {
            }
        }
        if (!Offset.m6540equalsimpl0(jM6546minusMKHz9U, companion.m6553getZeroF1C5BW0())) {
            z = m4858releaseOppositeOverscrollk4lQ0M(delta) || z;
        }
        if (z) {
            invalidateOverscroll$foundation_release();
        }
        return Offset.m6547plusMKHz9U(jM6535constructorimpl, packedValue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r14.invoke(r12, r0) == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.Overscroll
    /* renamed from: applyToFling-BMRW4eQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo4859applyToFlingBMRW4eQ(long j, Function2<? super Velocity, ? super Continuation<? super Velocity>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        AndroidEdgeEffectOverscrollEffect$applyToFling$1 androidEdgeEffectOverscrollEffect$applyToFling$1;
        long jM8104minusAH228Gc;
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect;
        long jM8104minusAH228Gc2;
        if (continuation instanceof AndroidEdgeEffectOverscrollEffect$applyToFling$1) {
            androidEdgeEffectOverscrollEffect$applyToFling$1 = (AndroidEdgeEffectOverscrollEffect$applyToFling$1) continuation;
            int i = androidEdgeEffectOverscrollEffect$applyToFling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidEdgeEffectOverscrollEffect$applyToFling$1.label = i - Integer.MIN_VALUE;
            } else {
                androidEdgeEffectOverscrollEffect$applyToFling$1 = new AndroidEdgeEffectOverscrollEffect$applyToFling$1(this, continuation);
            }
        }
        Object objInvoke = androidEdgeEffectOverscrollEffect$applyToFling$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = androidEdgeEffectOverscrollEffect$applyToFling$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(objInvoke);
                return Unit.INSTANCE;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jM8104minusAH228Gc = androidEdgeEffectOverscrollEffect$applyToFling$1.J$0;
            androidEdgeEffectOverscrollEffect = (AndroidEdgeEffectOverscrollEffect) androidEdgeEffectOverscrollEffect$applyToFling$1.L$0;
            ResultKt.throwOnFailure(objInvoke);
            jM8104minusAH228Gc2 = Velocity.m8104minusAH228Gc(jM8104minusAH228Gc, ((Velocity) objInvoke).getPackedValue());
            androidEdgeEffectOverscrollEffect.scrollCycleInProgress = false;
            if (Velocity.m8101getXimpl(jM8104minusAH228Gc2) <= 0.0f) {
                EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.edgeEffectWrapper.getOrCreateLeftEffect(), MathKt.roundToInt(Velocity.m8101getXimpl(jM8104minusAH228Gc2)));
            } else if (Velocity.m8101getXimpl(jM8104minusAH228Gc2) < 0.0f) {
                EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.edgeEffectWrapper.getOrCreateRightEffect(), -MathKt.roundToInt(Velocity.m8101getXimpl(jM8104minusAH228Gc2)));
            }
            if (Velocity.m8102getYimpl(jM8104minusAH228Gc2) <= 0.0f) {
                EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.edgeEffectWrapper.getOrCreateTopEffect(), MathKt.roundToInt(Velocity.m8102getYimpl(jM8104minusAH228Gc2)));
            } else if (Velocity.m8102getYimpl(jM8104minusAH228Gc2) < 0.0f) {
                EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.edgeEffectWrapper.getOrCreateBottomEffect(), -MathKt.roundToInt(Velocity.m8102getYimpl(jM8104minusAH228Gc2)));
            }
            androidEdgeEffectOverscrollEffect.animateToReleaseIfNeeded();
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objInvoke);
        if (Size.m6585isEmptyimpl(this.containerSize)) {
            Velocity velocityM8095boximpl = Velocity.m8095boximpl(j);
            androidEdgeEffectOverscrollEffect$applyToFling$1.label = 1;
        } else {
            long jVelocity = Velocity2.Velocity((!this.edgeEffectWrapper.isLeftStretched() || Velocity.m8101getXimpl(j) >= 0.0f) ? (!this.edgeEffectWrapper.isRightStretched() || Velocity.m8101getXimpl(j) <= 0.0f) ? 0.0f : -EdgeEffectCompat.INSTANCE.absorbToRelaxIfNeeded(this.edgeEffectWrapper.getOrCreateRightEffect(), -Velocity.m8101getXimpl(j), Float.intBitsToFloat((int) (this.containerSize >> 32)), this.density) : EdgeEffectCompat.INSTANCE.absorbToRelaxIfNeeded(this.edgeEffectWrapper.getOrCreateLeftEffect(), Velocity.m8101getXimpl(j), Float.intBitsToFloat((int) (this.containerSize >> 32)), this.density), (!this.edgeEffectWrapper.isTopStretched() || Velocity.m8102getYimpl(j) >= 0.0f) ? (!this.edgeEffectWrapper.isBottomStretched() || Velocity.m8102getYimpl(j) <= 0.0f) ? 0.0f : -EdgeEffectCompat.INSTANCE.absorbToRelaxIfNeeded(this.edgeEffectWrapper.getOrCreateBottomEffect(), -Velocity.m8102getYimpl(j), Float.intBitsToFloat((int) (4294967295L & this.containerSize)), this.density) : EdgeEffectCompat.INSTANCE.absorbToRelaxIfNeeded(this.edgeEffectWrapper.getOrCreateTopEffect(), Velocity.m8102getYimpl(j), Float.intBitsToFloat((int) (4294967295L & this.containerSize)), this.density));
            if (!Velocity.m8100equalsimpl0(jVelocity, Velocity.INSTANCE.m8109getZero9UxMQ8M())) {
                invalidateOverscroll$foundation_release();
            }
            jM8104minusAH228Gc = Velocity.m8104minusAH228Gc(j, jVelocity);
            Velocity velocityM8095boximpl2 = Velocity.m8095boximpl(jM8104minusAH228Gc);
            androidEdgeEffectOverscrollEffect$applyToFling$1.L$0 = this;
            androidEdgeEffectOverscrollEffect$applyToFling$1.J$0 = jM8104minusAH228Gc;
            androidEdgeEffectOverscrollEffect$applyToFling$1.label = 2;
            objInvoke = function2.invoke(velocityM8095boximpl2, androidEdgeEffectOverscrollEffect$applyToFling$1);
            if (objInvoke != coroutine_suspended) {
                androidEdgeEffectOverscrollEffect = this;
                jM8104minusAH228Gc2 = Velocity.m8104minusAH228Gc(jM8104minusAH228Gc, ((Velocity) objInvoke).getPackedValue());
                androidEdgeEffectOverscrollEffect.scrollCycleInProgress = false;
                if (Velocity.m8101getXimpl(jM8104minusAH228Gc2) <= 0.0f) {
                }
                if (Velocity.m8102getYimpl(jM8104minusAH228Gc2) <= 0.0f) {
                }
                androidEdgeEffectOverscrollEffect.animateToReleaseIfNeeded();
                return Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }

    @Override // androidx.compose.foundation.Overscroll
    public boolean isInProgress() {
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = edgeEffectWrapper.topEffect;
        if (edgeEffect != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.bottomEffect;
        if (edgeEffect2 != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.leftEffect;
        if (edgeEffect3 != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.rightEffect;
        return (edgeEffect4 == null || EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect4) == 0.0f) ? false : true;
    }

    /* renamed from: updateSize-uvyYCjk$foundation_release, reason: not valid java name */
    public final void m4862updateSizeuvyYCjk$foundation_release(long size) {
        boolean zM6579equalsimpl0 = Size.m6579equalsimpl0(this.containerSize, Size.INSTANCE.m6589getZeroNHjbRc());
        boolean zM6579equalsimpl02 = Size.m6579equalsimpl0(size, this.containerSize);
        this.containerSize = size;
        if (!zM6579equalsimpl02) {
            this.edgeEffectWrapper.m4909updateSizeozmzZPI(IntSize.m8056constructorimpl((MathKt.roundToInt(Float.intBitsToFloat((int) (size & 4294967295L))) & 4294967295L) | (MathKt.roundToInt(Float.intBitsToFloat((int) (size >> 32))) << 32)));
        }
        if (zM6579equalsimpl0 || zM6579equalsimpl02) {
            return;
        }
        animateToReleaseIfNeeded();
    }

    /* renamed from: displacement-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m4861displacementF1C5BW0$foundation_release() {
        long jM6590getCenteruvyYCjk = this.pointerPosition;
        if ((9223372034707292159L & jM6590getCenteruvyYCjk) == 9205357640488583168L) {
            jM6590getCenteruvyYCjk = SizeKt.m6590getCenteruvyYCjk(this.containerSize);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM6590getCenteruvyYCjk >> 32)) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM6590getCenteruvyYCjk & 4294967295L)) / Float.intBitsToFloat((int) (this.containerSize & 4294967295L));
        return Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    @Override // androidx.compose.foundation.Overscroll
    public DelegatableNode getNode() {
        return this.node;
    }

    public final void invalidateOverscroll$foundation_release() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(Unit.INSTANCE);
        }
    }

    private final void animateToReleaseIfNeeded() {
        boolean z;
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = edgeEffectWrapper.topEffect;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            invalidateOverscroll$foundation_release();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* renamed from: releaseOppositeOverscroll-k-4lQ0M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m4858releaseOppositeOverscrollk4lQ0M(long delta) {
        boolean zIsLeftAnimating;
        if (this.edgeEffectWrapper.isLeftAnimating()) {
            int i = (int) (delta >> 32);
            if (Float.intBitsToFloat(i) < 0.0f) {
                EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateLeftEffect(), Float.intBitsToFloat(i));
                zIsLeftAnimating = this.edgeEffectWrapper.isLeftAnimating();
            } else {
                zIsLeftAnimating = false;
            }
        }
        if (this.edgeEffectWrapper.isRightAnimating()) {
            int i2 = (int) (delta >> 32);
            if (Float.intBitsToFloat(i2) > 0.0f) {
                EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateRightEffect(), Float.intBitsToFloat(i2));
                zIsLeftAnimating = zIsLeftAnimating || this.edgeEffectWrapper.isRightAnimating();
            }
        }
        if (this.edgeEffectWrapper.isTopAnimating()) {
            int i3 = (int) (delta & 4294967295L);
            if (Float.intBitsToFloat(i3) < 0.0f) {
                EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateTopEffect(), Float.intBitsToFloat(i3));
                zIsLeftAnimating = zIsLeftAnimating || this.edgeEffectWrapper.isTopAnimating();
            }
        }
        if (this.edgeEffectWrapper.isBottomAnimating()) {
            int i4 = (int) (delta & 4294967295L);
            if (Float.intBitsToFloat(i4) > 0.0f) {
                EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateBottomEffect(), Float.intBitsToFloat(i4));
                return zIsLeftAnimating || this.edgeEffectWrapper.isBottomAnimating();
            }
        }
        return zIsLeftAnimating;
    }

    /* renamed from: pullTop-k-4lQ0M, reason: not valid java name */
    private final float m4857pullTopk4lQ0M(long scroll) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m4861displacementF1C5BW0$foundation_release() >> 32));
        int i = (int) (scroll & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.containerSize & 4294967295L));
        EdgeEffect orCreateTopEffect = this.edgeEffectWrapper.getOrCreateTopEffect();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(orCreateTopEffect) == 0.0f ? edgeEffectCompat.onPullDistanceCompat(orCreateTopEffect, fIntBitsToFloat2, fIntBitsToFloat) * Float.intBitsToFloat((int) (this.containerSize & 4294967295L)) : Float.intBitsToFloat(i);
    }

    /* renamed from: pullBottom-k-4lQ0M, reason: not valid java name */
    private final float m4854pullBottomk4lQ0M(long scroll) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m4861displacementF1C5BW0$foundation_release() >> 32));
        int i = (int) (scroll & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.containerSize & 4294967295L));
        EdgeEffect orCreateBottomEffect = this.edgeEffectWrapper.getOrCreateBottomEffect();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(orCreateBottomEffect) == 0.0f ? (-edgeEffectCompat.onPullDistanceCompat(orCreateBottomEffect, -fIntBitsToFloat2, 1 - fIntBitsToFloat)) * Float.intBitsToFloat((int) (this.containerSize & 4294967295L)) : Float.intBitsToFloat(i);
    }

    /* renamed from: pullLeft-k-4lQ0M, reason: not valid java name */
    private final float m4855pullLeftk4lQ0M(long scroll) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m4861displacementF1C5BW0$foundation_release() & 4294967295L));
        int i = (int) (scroll >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        EdgeEffect orCreateLeftEffect = this.edgeEffectWrapper.getOrCreateLeftEffect();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(orCreateLeftEffect) == 0.0f ? edgeEffectCompat.onPullDistanceCompat(orCreateLeftEffect, fIntBitsToFloat2, 1 - fIntBitsToFloat) * Float.intBitsToFloat((int) (this.containerSize >> 32)) : Float.intBitsToFloat(i);
    }

    /* renamed from: pullRight-k-4lQ0M, reason: not valid java name */
    private final float m4856pullRightk4lQ0M(long scroll) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m4861displacementF1C5BW0$foundation_release() & 4294967295L));
        int i = (int) (scroll >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        EdgeEffect orCreateRightEffect = this.edgeEffectWrapper.getOrCreateRightEffect();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(orCreateRightEffect) == 0.0f ? (-edgeEffectCompat.onPullDistanceCompat(orCreateRightEffect, -fIntBitsToFloat2, fIntBitsToFloat)) * Float.intBitsToFloat((int) (this.containerSize >> 32)) : Float.intBitsToFloat(i);
    }
}
