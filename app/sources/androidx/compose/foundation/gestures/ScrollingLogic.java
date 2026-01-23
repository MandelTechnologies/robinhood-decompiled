package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatorMutex2;
import androidx.compose.foundation.Overscroll;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier2;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier8;
import androidx.compose.p011ui.unit.Velocity;
import androidx.compose.p011ui.unit.Velocity2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Scrollable.kt */
@Metadata(m3635d1 = {"\u0000\u0083\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001`\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0016\u001a\u00020\u0013*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0019\u001a\u00020\u0012*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001d\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010%\u001a\u00020\u001f*\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u001fH\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010\u0018J\u0017\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0013H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u001f*\u00020\u0013ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0014\u00100\u001a\u00020\u001f*\u00020\u001fø\u0001\u0000¢\u0006\u0004\b/\u0010\u0018J\u0014\u0010\u0016\u001a\u00020\u0013*\u00020\u001fø\u0001\u0000¢\u0006\u0004\b1\u0010\u0015J\u0017\u00103\u001a\u00020\u0012*\u00020\u0013ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u0010-J\u0011\u00104\u001a\u00020\u0013*\u00020\u0013¢\u0006\u0004\b4\u00105J\u0014\u00104\u001a\u00020\u001f*\u00020\u001fø\u0001\u0000¢\u0006\u0004\b6\u0010\u0018J\u0018\u00108\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u001fø\u0001\u0000¢\u0006\u0004\b7\u0010\u0018J#\u0010>\u001a\u00020;2\u0006\u00109\u001a\u00020\u00122\u0006\u0010:\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u001b\u0010B\u001a\u00020\u00122\u0006\u0010?\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\r\u0010C\u001a\u00020\n¢\u0006\u0004\bC\u0010DJC\u0010&\u001a\u00020;2\b\b\u0002\u0010F\u001a\u00020E2'\u0010K\u001a#\b\u0001\u0012\u0004\u0012\u00020H\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0I\u0012\u0006\u0012\u0004\u0018\u00010\u00010G¢\u0006\u0002\bJH\u0086@¢\u0006\u0004\b&\u0010LJ?\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010MJ\r\u0010N\u001a\u00020\n¢\u0006\u0004\bN\u0010DR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010TR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010UR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010VR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010WR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010XR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010YR$\u0010[\u001a\u00020\n2\u0006\u0010Z\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b[\u0010W\u001a\u0004\b[\u0010DR\u001c\u0010\\\u001a\u00020!8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR \u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010g\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u0010D\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006h"}, m3636d2 = {"Landroidx/compose/foundation/gestures/ScrollingLogic;", "", "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollableState", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "reverseDirection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "nestedScrollDispatcher", "Lkotlin/Function0;", "isScrollableNodeAttached", "<init>", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/unit/Velocity;", "", "toFloat-TH1AsA0", "(J)F", "toFloat", "singleAxisVelocity-AH228Gc", "(J)J", "singleAxisVelocity", "newValue", "update-QWom1Mo", "(JF)J", "update", "Landroidx/compose/foundation/gestures/ScrollScope;", "Landroidx/compose/ui/geometry/Offset;", "delta", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "performScroll-3eAAhYA", "(Landroidx/compose/foundation/gestures/ScrollScope;JI)J", "performScroll", "scroll", "dispatchRawDelta-MK-Hz9U", "dispatchRawDelta", "pixels", "shouldCancelFling", "(F)Z", "toOffset-tuRUvjQ", "(F)J", "toOffset", "singleAxisOffset-MK-Hz9U", "singleAxisOffset", "toFloat-k-4lQ0M", "toVelocity-adjELrA", "toVelocity", "reverseIfNeeded", "(F)F", "reverseIfNeeded-MK-Hz9U", "performRawScroll-MK-Hz9U", "performRawScroll", "initialVelocity", "isMouseWheel", "", "onScrollStopped-BMRW4eQ", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onScrollStopped", "available", "doFlingAnimation-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doFlingAnimation", "shouldScrollImmediately", "()Z", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/NestedScrollScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "block", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/OverscrollEffect;ZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)Z", "isVertical", "Landroidx/compose/foundation/gestures/ScrollableState;", "getScrollableState", "()Landroidx/compose/foundation/gestures/ScrollableState;", "setScrollableState", "(Landroidx/compose/foundation/gestures/ScrollableState;)V", "Landroidx/compose/foundation/OverscrollEffect;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/gestures/Orientation;", "Z", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "Lkotlin/jvm/functions/Function0;", "<set-?>", "isFlinging", "latestScrollSource", "I", "outerStateScope", "Landroidx/compose/foundation/gestures/ScrollScope;", "androidx/compose/foundation/gestures/ScrollingLogic$nestedScrollScope$1", "nestedScrollScope", "Landroidx/compose/foundation/gestures/ScrollingLogic$nestedScrollScope$1;", "Lkotlin/Function1;", "performScrollForOverscroll", "Lkotlin/jvm/functions/Function1;", "getShouldDispatchOverscroll", "shouldDispatchOverscroll", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ScrollingLogic {
    private FlingBehavior flingBehavior;
    private boolean isFlinging;
    private final Function0<Boolean> isScrollableNodeAttached;
    private NestedScrollModifier2 nestedScrollDispatcher;
    private Orientation orientation;
    private Overscroll overscrollEffect;
    private boolean reverseDirection;
    private ScrollableState scrollableState;
    private int latestScrollSource = NestedScrollModifier8.INSTANCE.m7136getUserInputWNlRxjI();
    private ScrollableState4 outerStateScope = ScrollableKt.NoOpScrollScope;
    private final ScrollingLogic$nestedScrollScope$1 nestedScrollScope = new NestedScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1
        @Override // androidx.compose.foundation.gestures.NestedScrollScope
        /* renamed from: scrollBy-OzD1aCk */
        public long mo5007scrollByOzD1aCk(long offset, int source) {
            return this.this$0.m5032performScroll3eAAhYA(this.this$0.outerStateScope, offset, source);
        }

        @Override // androidx.compose.foundation.gestures.NestedScrollScope
        /* renamed from: scrollByWithOverscroll-OzD1aCk */
        public long mo5008scrollByWithOverscrollOzD1aCk(long offset, int source) {
            this.this$0.latestScrollSource = source;
            Overscroll overscroll = this.this$0.overscrollEffect;
            if (overscroll == null || !this.this$0.getShouldDispatchOverscroll()) {
                return this.this$0.m5032performScroll3eAAhYA(this.this$0.outerStateScope, offset, source);
            }
            return overscroll.mo4860applyToScrollRhakbz0(offset, this.this$0.latestScrollSource, this.this$0.performScrollForOverscroll);
        }
    };
    private final Function1<Offset, Offset> performScrollForOverscroll = new Function1<Offset, Offset>() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$performScrollForOverscroll$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Offset invoke(Offset offset) {
            return Offset.m6534boximpl(m5045invokeMKHz9U(offset.getPackedValue()));
        }

        /* renamed from: invoke-MK-Hz9U, reason: not valid java name */
        public final long m5045invokeMKHz9U(long j) {
            ScrollableState4 scrollableState4 = this.this$0.outerStateScope;
            ScrollingLogic scrollingLogic = this.this$0;
            return scrollingLogic.m5032performScroll3eAAhYA(scrollableState4, j, scrollingLogic.latestScrollSource);
        }
    };

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1] */
    public ScrollingLogic(ScrollableState scrollableState, Overscroll overscroll, FlingBehavior flingBehavior, Orientation orientation, boolean z, NestedScrollModifier2 nestedScrollModifier2, Function0<Boolean> function0) {
        this.scrollableState = scrollableState;
        this.overscrollEffect = overscroll;
        this.flingBehavior = flingBehavior;
        this.orientation = orientation;
        this.reverseDirection = z;
        this.nestedScrollDispatcher = nestedScrollModifier2;
        this.isScrollableNodeAttached = function0;
    }

    public final ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    /* renamed from: isFlinging, reason: from getter */
    public final boolean getIsFlinging() {
        return this.isFlinging;
    }

    /* renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m5042toOffsettuRUvjQ(float f) {
        if (f == 0.0f) {
            return Offset.INSTANCE.m6553getZeroF1C5BW0();
        }
        if (this.orientation == Orientation.Horizontal) {
            return Offset.m6535constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        return Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    /* renamed from: singleAxisOffset-MK-Hz9U, reason: not valid java name */
    public final long m5040singleAxisOffsetMKHz9U(long j) {
        return this.orientation == Orientation.Horizontal ? Offset.m6537copydBAh8RU$default(j, 0.0f, 0.0f, 1, null) : Offset.m6537copydBAh8RU$default(j, 0.0f, 0.0f, 2, null);
    }

    /* renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m5041toFloatk4lQ0M(long j) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
    }

    /* renamed from: toVelocity-adjELrA, reason: not valid java name */
    public final long m5043toVelocityadjELrA(float f) {
        if (f == 0.0f) {
            return Velocity.INSTANCE.m8109getZero9UxMQ8M();
        }
        return this.orientation == Orientation.Horizontal ? Velocity2.Velocity(f, 0.0f) : Velocity2.Velocity(0.0f, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m5034toFloatTH1AsA0(long j) {
        return this.orientation == Orientation.Horizontal ? Velocity.m8101getXimpl(j) : Velocity.m8102getYimpl(j);
    }

    /* renamed from: singleAxisVelocity-AH228Gc, reason: not valid java name */
    private final long m5033singleAxisVelocityAH228Gc(long j) {
        return this.orientation == Orientation.Horizontal ? Velocity.m8098copyOhffZ5M$default(j, 0.0f, 0.0f, 1, null) : Velocity.m8098copyOhffZ5M$default(j, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: update-QWom1Mo, reason: not valid java name */
    public final long m5035updateQWom1Mo(long j, float f) {
        return this.orientation == Orientation.Horizontal ? Velocity.m8098copyOhffZ5M$default(j, f, 0.0f, 2, null) : Velocity.m8098copyOhffZ5M$default(j, 0.0f, f, 1, null);
    }

    public final float reverseIfNeeded(float f) {
        return this.reverseDirection ? f * (-1) : f;
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m5039reverseIfNeededMKHz9U(long j) {
        return this.reverseDirection ? Offset.m6548timestuRUvjQ(j, -1.0f) : j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performScroll-3eAAhYA, reason: not valid java name */
    public final long m5032performScroll3eAAhYA(ScrollableState4 scrollableState4, long j, int i) {
        long jM7131dispatchPreScrollOzD1aCk = this.nestedScrollDispatcher.m7131dispatchPreScrollOzD1aCk(j, i);
        long jM6546minusMKHz9U = Offset.m6546minusMKHz9U(j, jM7131dispatchPreScrollOzD1aCk);
        long jM5039reverseIfNeededMKHz9U = m5039reverseIfNeededMKHz9U(m5042toOffsettuRUvjQ(scrollableState4.scrollBy(m5041toFloatk4lQ0M(m5039reverseIfNeededMKHz9U(m5040singleAxisOffsetMKHz9U(jM6546minusMKHz9U))))));
        return Offset.m6547plusMKHz9U(Offset.m6547plusMKHz9U(jM7131dispatchPreScrollOzD1aCk, jM5039reverseIfNeededMKHz9U), this.nestedScrollDispatcher.m7129dispatchPostScrollDzOQY0M(jM5039reverseIfNeededMKHz9U, Offset.m6546minusMKHz9U(jM6546minusMKHz9U, jM5039reverseIfNeededMKHz9U), i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldDispatchOverscroll() {
        return this.scrollableState.getCanScrollForward() || this.scrollableState.getCanScrollBackward();
    }

    /* renamed from: performRawScroll-MK-Hz9U, reason: not valid java name */
    public final long m5038performRawScrollMKHz9U(long scroll) {
        if (this.scrollableState.isScrollInProgress()) {
            return Offset.INSTANCE.m6553getZeroF1C5BW0();
        }
        return m5031dispatchRawDeltaMKHz9U(scroll);
    }

    /* renamed from: dispatchRawDelta-MK-Hz9U, reason: not valid java name */
    private final long m5031dispatchRawDeltaMKHz9U(long scroll) {
        return m5042toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m5041toFloatk4lQ0M(scroll)))));
    }

    /* renamed from: onScrollStopped-BMRW4eQ, reason: not valid java name */
    public final Object m5037onScrollStoppedBMRW4eQ(long j, boolean z, Continuation<? super Unit> continuation) {
        if (z && !ScrollableKt.getShouldBeTriggeredByMouseWheel(this.flingBehavior)) {
            return Unit.INSTANCE;
        }
        long jM5033singleAxisVelocityAH228Gc = m5033singleAxisVelocityAH228Gc(j);
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this, null);
        Overscroll overscroll = this.overscrollEffect;
        if (overscroll != null && getShouldDispatchOverscroll()) {
            Object objMo4859applyToFlingBMRW4eQ = overscroll.mo4859applyToFlingBMRW4eQ(jM5033singleAxisVelocityAH228Gc, scrollingLogic$onScrollStopped$performFling$1, continuation);
            return objMo4859applyToFlingBMRW4eQ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo4859applyToFlingBMRW4eQ : Unit.INSTANCE;
        }
        Object objInvoke = scrollingLogic$onScrollStopped$performFling$1.invoke(Velocity.m8095boximpl(jM5033singleAxisVelocityAH228Gc), continuation);
        return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldCancelFling(float pixels) {
        if (pixels <= 0.0f || this.scrollableState.getCanScrollForward()) {
            return (pixels < 0.0f && !this.scrollableState.getCanScrollBackward()) || !this.isScrollableNodeAttached.invoke().booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: doFlingAnimation-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5036doFlingAnimationQWom1Mo(long j, Continuation<? super Velocity> continuation) {
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$1;
        ScrollingLogic scrollingLogic;
        Ref.LongRef longRef;
        if (continuation instanceof ScrollingLogic$doFlingAnimation$1) {
            scrollingLogic$doFlingAnimation$1 = (ScrollingLogic$doFlingAnimation$1) continuation;
            int i = scrollingLogic$doFlingAnimation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                scrollingLogic$doFlingAnimation$1.label = i - Integer.MIN_VALUE;
            } else {
                scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, continuation);
            }
        }
        Object obj = scrollingLogic$doFlingAnimation$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = scrollingLogic$doFlingAnimation$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.LongRef longRef2 = new Ref.LongRef();
            longRef2.element = j;
            this.isFlinging = true;
            MutatorMutex2 mutatorMutex2 = MutatorMutex2.Default;
            ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this, longRef2, j, null);
            scrollingLogic$doFlingAnimation$1.L$0 = this;
            scrollingLogic$doFlingAnimation$1.L$1 = longRef2;
            scrollingLogic$doFlingAnimation$1.label = 1;
            if (scroll(mutatorMutex2, scrollingLogic$doFlingAnimation$2, scrollingLogic$doFlingAnimation$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            scrollingLogic = this;
            longRef = longRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            longRef = (Ref.LongRef) scrollingLogic$doFlingAnimation$1.L$1;
            scrollingLogic = (ScrollingLogic) scrollingLogic$doFlingAnimation$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        scrollingLogic.isFlinging = false;
        return Velocity.m8095boximpl(longRef.element);
    }

    public final boolean shouldScrollImmediately() {
        if (this.scrollableState.isScrollInProgress()) {
            return true;
        }
        Overscroll overscroll = this.overscrollEffect;
        return overscroll != null ? overscroll.isInProgress() : false;
    }

    /* compiled from: Scrollable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", m3645f = "Scrollable.kt", m3646l = {834}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollingLogic$scroll$2 */
    /* loaded from: classes4.dex */
    static final class C11392 extends ContinuationImpl7 implements Function2<ScrollableState4, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<NestedScrollScope, Continuation<? super Unit>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C11392(Function2<? super NestedScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C11392> continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11392 c11392 = ScrollingLogic.this.new C11392(this.$block, continuation);
            c11392.L$0 = obj;
            return c11392;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollableState4 scrollableState4, Continuation<? super Unit> continuation) {
            return ((C11392) create(scrollableState4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScrollingLogic.this.outerStateScope = (ScrollableState4) this.L$0;
                Function2<NestedScrollScope, Continuation<? super Unit>, Object> function2 = this.$block;
                ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$1 = ScrollingLogic.this.nestedScrollScope;
                this.label = 1;
                if (function2.invoke(scrollingLogic$nestedScrollScope$1, this) == coroutine_suspended) {
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

    public final Object scroll(MutatorMutex2 mutatorMutex2, Function2<? super NestedScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objScroll = this.scrollableState.scroll(mutatorMutex2, new C11392(function2, null), continuation);
        return objScroll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll : Unit.INSTANCE;
    }

    public final boolean update(ScrollableState scrollableState, Orientation orientation, Overscroll overscrollEffect, boolean reverseDirection, FlingBehavior flingBehavior, NestedScrollModifier2 nestedScrollDispatcher) {
        boolean z;
        boolean z2 = true;
        if (Intrinsics.areEqual(this.scrollableState, scrollableState)) {
            z = false;
        } else {
            this.scrollableState = scrollableState;
            z = true;
        }
        this.overscrollEffect = overscrollEffect;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z = true;
        }
        if (this.reverseDirection != reverseDirection) {
            this.reverseDirection = reverseDirection;
        } else {
            z2 = z;
        }
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        return z2;
    }

    public final boolean isVertical() {
        return this.orientation == Orientation.Vertical;
    }
}
