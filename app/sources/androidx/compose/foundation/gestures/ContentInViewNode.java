package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatorMutex2;
import androidx.compose.foundation.internal.InlineClassHelper;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier8;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p011ui.node.CompositionLocalConsumerModifierNode2;
import androidx.compose.p011ui.node.DelegatableNode2;
import androidx.compose.p011ui.node.LayoutAwareModifierNode;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.IntSize2;
import androidx.compose.runtime.collection.MutableVector;
import com.plaid.internal.EnumC7081g;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job6;
import kotlinx.coroutines.JobKt;

/* compiled from: ContentInViewNode.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001EB'\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u001e\u0010\u001e\u001a\u00020\u001f2\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!H\u0096@¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\"2\u0006\u0010 \u001a\u00020\"H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\"\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\n\u0010,\u001a\u0004\u0018\u00010\"H\u0002J\n\u0010-\u001a\u0004\u0018\u00010\"H\u0002J\b\u0010.\u001a\u00020\u001fH\u0002J\u0010\u0010/\u001a\u00020\u001f2\b\u00100\u001a\u0004\u0018\u00010\u0012J\u001a\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b3\u00104J\"\u00105\u001a\u0002062\u0006\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b7\u00108J\b\u00109\u001a\u00020\fH\u0002J \u0010:\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u001f\u0010;\u001a\u00020<*\u00020=2\u0006\u0010>\u001a\u00020=H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\u001f\u0010;\u001a\u00020<*\u00020\u00192\u0006\u0010>\u001a\u00020\u0019H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\bA\u0010@J \u0010B\u001a\u00020\n*\u00020\"2\b\b\u0002\u00102\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\bC\u0010DR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006F"}, m3636d2 = {"Landroidx/compose/foundation/gestures/ContentInViewNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "scrollingLogic", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "reverseDirection", "", "bringIntoViewSpec", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "(Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/ScrollingLogic;ZLandroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "bringIntoViewRequests", "Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "childWasMaxVisibleBeforeViewportShrunk", "focusedChild", "Landroidx/compose/ui/layout/LayoutCoordinates;", "isAnimationRunning", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "trackingFocusedChild", "<set-?>", "Landroidx/compose/ui/unit/IntSize;", "viewportSize", "getViewportSize-YbymL2g$foundation_release", "()J", "J", "bringChildIntoView", "", "localRect", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateRectForParent", "calculateScrollDelta", "", "computeDestination", "childBounds", "containerSize", "computeDestination-O0kMr_c", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/Rect;", "findBringIntoViewRequest", "getFocusedChildBounds", "launchAnimation", "onFocusBoundsChanged", "newBounds", "onRemeasured", "size", "onRemeasured-ozmzZPI", "(J)V", "relocationOffset", "Landroidx/compose/ui/geometry/Offset;", "relocationOffset-BMxPBkI", "(Landroidx/compose/ui/geometry/Rect;J)J", "requireBringIntoViewSpec", "update", "compareTo", "", "Landroidx/compose/ui/geometry/Size;", "other", "compareTo-iLBOSCw", "(JJ)I", "compareTo-TemP2vQ", "isMaxVisible", "isMaxVisible-O0kMr_c", "(Landroidx/compose/ui/geometry/Rect;J)Z", "Request", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ContentInViewNode extends Modifier.Node implements BringIntoViewResponder, LayoutAwareModifierNode, CompositionLocalConsumerModifierNode {
    private BringIntoViewSpec bringIntoViewSpec;
    private boolean childWasMaxVisibleBeforeViewportShrunk;
    private LayoutCoordinates focusedChild;
    private boolean isAnimationRunning;
    private Orientation orientation;
    private boolean reverseDirection;
    private final ScrollingLogic scrollingLogic;
    private final boolean shouldAutoInvalidate;
    private boolean trackingFocusedChild;
    private final BringIntoViewRequestPriorityQueue bringIntoViewRequests = new BringIntoViewRequestPriorityQueue();
    private long viewportSize = IntSize.INSTANCE.m8064getZeroYbymL2g();

    /* compiled from: ContentInViewNode.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ContentInViewNode(Orientation orientation, ScrollingLogic scrollingLogic, boolean z, BringIntoViewSpec bringIntoViewSpec) {
        this.orientation = orientation;
        this.scrollingLogic = scrollingLogic;
        this.reverseDirection = z;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* renamed from: getViewportSize-YbymL2g$foundation_release, reason: not valid java name and from getter */
    public final long getViewportSize() {
        return this.viewportSize;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public Rect calculateRectForParent(Rect localRect) {
        if (IntSize.m8058equalsimpl0(this.viewportSize, IntSize.INSTANCE.m8064getZeroYbymL2g())) {
            InlineClassHelper.throwIllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return m4962computeDestinationO0kMr_c(localRect, this.viewportSize);
    }

    private final BringIntoViewSpec requireBringIntoViewSpec() {
        BringIntoViewSpec bringIntoViewSpec = this.bringIntoViewSpec;
        return bringIntoViewSpec == null ? (BringIntoViewSpec) CompositionLocalConsumerModifierNode2.currentValueOf(this, BringIntoViewSpec_androidKt.getLocalBringIntoViewSpec()) : bringIntoViewSpec;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public Object bringChildIntoView(Function0<Rect> function0, Continuation<? super Unit> continuation) {
        Rect rectInvoke = function0.invoke();
        if (rectInvoke == null || m4964isMaxVisibleO0kMr_c$default(this, rectInvoke, 0L, 1, null)) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (this.bringIntoViewRequests.enqueue(new Request(function0, cancellableContinuationImpl)) && !this.isAnimationRunning) {
            launchAnimation();
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public final void onFocusBoundsChanged(LayoutCoordinates newBounds) {
        Rect focusedChildBounds;
        this.focusedChild = newBounds;
        if (this.childWasMaxVisibleBeforeViewportShrunk && (focusedChildBounds = getFocusedChildBounds()) != null && !m4963isMaxVisibleO0kMr_c(focusedChildBounds, this.viewportSize)) {
            this.trackingFocusedChild = true;
            launchAnimation();
        }
        this.childWasMaxVisibleBeforeViewportShrunk = false;
    }

    @Override // androidx.compose.p011ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    public void mo4967onRemeasuredozmzZPI(long size) {
        Rect focusedChildBounds;
        long j = this.viewportSize;
        this.viewportSize = size;
        if (m4960compareToTemP2vQ(size, j) >= 0 || this.isAnimationRunning || this.trackingFocusedChild || (focusedChildBounds = getFocusedChildBounds()) == null || !m4963isMaxVisibleO0kMr_c(focusedChildBounds, j)) {
            return;
        }
        this.childWasMaxVisibleBeforeViewportShrunk = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getFocusedChildBounds() {
        if (!getIsAttached()) {
            return null;
        }
        LayoutCoordinates layoutCoordinatesRequireLayoutCoordinates = DelegatableNode2.requireLayoutCoordinates(this);
        LayoutCoordinates layoutCoordinates = this.focusedChild;
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.isAttached()) {
                layoutCoordinates = null;
            }
            if (layoutCoordinates != null) {
                return layoutCoordinatesRequireLayoutCoordinates.localBoundingBoxOf(layoutCoordinates, false);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchAnimation() {
        BringIntoViewSpec bringIntoViewSpecRequireBringIntoViewSpec = requireBringIntoViewSpec();
        if (this.isAnimationRunning) {
            InlineClassHelper.throwIllegalStateException("launchAnimation called when previous animation was running");
        }
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new C10852(new UpdatableAnimationState(BringIntoViewSpec.INSTANCE.getDefaultScrollAnimationSpec$foundation_release()), bringIntoViewSpecRequireBringIntoViewSpec, null), 1, null);
    }

    /* compiled from: ContentInViewNode.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", m3645f = "ContentInViewNode.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2 */
    /* loaded from: classes4.dex */
    static final class C10852 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UpdatableAnimationState $animationState;
        final /* synthetic */ BringIntoViewSpec $bringIntoViewSpec;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10852(UpdatableAnimationState updatableAnimationState, BringIntoViewSpec bringIntoViewSpec, Continuation<? super C10852> continuation) {
            super(2, continuation);
            this.$animationState = updatableAnimationState;
            this.$bringIntoViewSpec = bringIntoViewSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C10852 c10852 = ContentInViewNode.this.new C10852(this.$animationState, this.$bringIntoViewSpec, continuation);
            c10852.L$0 = obj;
            return c10852;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10852) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Job job = JobKt.getJob(((CoroutineScope) this.L$0).getCoroutineContext());
                        ContentInViewNode.this.isAnimationRunning = true;
                        ScrollingLogic scrollingLogic = ContentInViewNode.this.scrollingLogic;
                        MutatorMutex2 mutatorMutex2 = MutatorMutex2.Default;
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationState, ContentInViewNode.this, this.$bringIntoViewSpec, job, null);
                        this.label = 1;
                        if (scrollingLogic.scroll(mutatorMutex2, anonymousClass1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    ContentInViewNode.this.bringIntoViewRequests.resumeAndRemoveAll();
                    ContentInViewNode.this.isAnimationRunning = false;
                    ContentInViewNode.this.bringIntoViewRequests.cancelAndRemoveAll(null);
                    ContentInViewNode.this.trackingFocusedChild = false;
                    return Unit.INSTANCE;
                } catch (CancellationException e) {
                    throw e;
                }
            } catch (Throwable th) {
                ContentInViewNode.this.isAnimationRunning = false;
                ContentInViewNode.this.bringIntoViewRequests.cancelAndRemoveAll(null);
                ContentInViewNode.this.trackingFocusedChild = false;
                throw th;
            }
        }

        /* compiled from: ContentInViewNode.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", m3645f = "ContentInViewNode.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<NestedScrollScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Job $animationJob;
            final /* synthetic */ UpdatableAnimationState $animationState;
            final /* synthetic */ BringIntoViewSpec $bringIntoViewSpec;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ContentInViewNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(UpdatableAnimationState updatableAnimationState, ContentInViewNode contentInViewNode, BringIntoViewSpec bringIntoViewSpec, Job job, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$animationState = updatableAnimationState;
                this.this$0 = contentInViewNode;
                this.$bringIntoViewSpec = bringIntoViewSpec;
                this.$animationJob = job;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationState, this.this$0, this.$bringIntoViewSpec, this.$animationJob, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(NestedScrollScope nestedScrollScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(nestedScrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
                    this.$animationState.setValue(this.this$0.calculateScrollDelta(this.$bringIntoViewSpec));
                    final UpdatableAnimationState updatableAnimationState = this.$animationState;
                    final ContentInViewNode contentInViewNode = this.this$0;
                    final Job job = this.$animationJob;
                    Function1<Float, Unit> function1 = new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                            invoke(f.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(float f) {
                            float f2 = contentInViewNode.reverseDirection ? 1.0f : -1.0f;
                            ScrollingLogic scrollingLogic = contentInViewNode.scrollingLogic;
                            float fM5041toFloatk4lQ0M = f2 * scrollingLogic.m5041toFloatk4lQ0M(scrollingLogic.m5039reverseIfNeededMKHz9U(nestedScrollScope.mo5007scrollByOzD1aCk(scrollingLogic.m5039reverseIfNeededMKHz9U(scrollingLogic.m5042toOffsettuRUvjQ(f2 * f)), NestedScrollModifier8.INSTANCE.m7136getUserInputWNlRxjI())));
                            if (Math.abs(fM5041toFloatk4lQ0M) < Math.abs(f)) {
                                Job6.cancel$default(job, "Scroll animation cancelled because scroll was not consumed (" + fM5041toFloatk4lQ0M + " < " + f + ')', null, 2, null);
                            }
                        }
                    };
                    final ContentInViewNode contentInViewNode2 = this.this$0;
                    final UpdatableAnimationState updatableAnimationState2 = this.$animationState;
                    final BringIntoViewSpec bringIntoViewSpec = this.$bringIntoViewSpec;
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = contentInViewNode2.bringIntoViewRequests;
                            ContentInViewNode contentInViewNode3 = contentInViewNode2;
                            while (true) {
                                if (bringIntoViewRequestPriorityQueue.requests.getSize() != 0) {
                                    Rect rectInvoke = ((Request) bringIntoViewRequestPriorityQueue.requests.last()).getCurrentBounds().invoke();
                                    if (!(rectInvoke == null ? true : ContentInViewNode.m4964isMaxVisibleO0kMr_c$default(contentInViewNode3, rectInvoke, 0L, 1, null))) {
                                        break;
                                    } else {
                                        ((Request) bringIntoViewRequestPriorityQueue.requests.removeAt(bringIntoViewRequestPriorityQueue.requests.getSize() - 1)).getContinuation().resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (contentInViewNode2.trackingFocusedChild) {
                                Rect focusedChildBounds = contentInViewNode2.getFocusedChildBounds();
                                if (focusedChildBounds != null && ContentInViewNode.m4964isMaxVisibleO0kMr_c$default(contentInViewNode2, focusedChildBounds, 0L, 1, null)) {
                                    contentInViewNode2.trackingFocusedChild = false;
                                }
                            }
                            updatableAnimationState2.setValue(contentInViewNode2.calculateScrollDelta(bringIntoViewSpec));
                        }
                    };
                    this.label = 1;
                    if (updatableAnimationState.animateToZero(function1, function0, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float calculateScrollDelta(BringIntoViewSpec bringIntoViewSpec) {
        if (IntSize.m8058equalsimpl0(this.viewportSize, IntSize.INSTANCE.m8064getZeroYbymL2g())) {
            return 0.0f;
        }
        Rect rectFindBringIntoViewRequest = findBringIntoViewRequest();
        if (rectFindBringIntoViewRequest == null) {
            rectFindBringIntoViewRequest = this.trackingFocusedChild ? getFocusedChildBounds() : null;
            if (rectFindBringIntoViewRequest == null) {
                return 0.0f;
            }
        }
        long jM8067toSizeozmzZPI = IntSize2.m8067toSizeozmzZPI(this.viewportSize);
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return bringIntoViewSpec.calculateScrollDistance(rectFindBringIntoViewRequest.getTop(), rectFindBringIntoViewRequest.getBottom() - rectFindBringIntoViewRequest.getTop(), Float.intBitsToFloat((int) (jM8067toSizeozmzZPI & 4294967295L)));
        }
        if (i == 2) {
            return bringIntoViewSpec.calculateScrollDistance(rectFindBringIntoViewRequest.getLeft(), rectFindBringIntoViewRequest.getRight() - rectFindBringIntoViewRequest.getLeft(), Float.intBitsToFloat((int) (jM8067toSizeozmzZPI >> 32)));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Rect findBringIntoViewRequest() {
        MutableVector mutableVector = this.bringIntoViewRequests.requests;
        int size = mutableVector.getSize() - 1;
        Object[] objArr = mutableVector.content;
        Rect rect = null;
        if (size < objArr.length) {
            while (size >= 0) {
                Rect rectInvoke = ((Request) objArr[size]).getCurrentBounds().invoke();
                if (rectInvoke != null) {
                    if (m4961compareToiLBOSCw(rectInvoke.m6559getSizeNHjbRc(), IntSize2.m8067toSizeozmzZPI(this.viewportSize)) > 0) {
                        return rect == null ? rectInvoke : rect;
                    }
                    rect = rectInvoke;
                }
                size--;
            }
        }
        return rect;
    }

    /* renamed from: computeDestination-O0kMr_c, reason: not valid java name */
    private final Rect m4962computeDestinationO0kMr_c(Rect childBounds, long containerSize) {
        return childBounds.m6562translatek4lQ0M(Offset.m6535constructorimpl(m4965relocationOffsetBMxPBkI(childBounds, containerSize) ^ (-9223372034707292160L)));
    }

    /* renamed from: isMaxVisible-O0kMr_c$default, reason: not valid java name */
    static /* synthetic */ boolean m4964isMaxVisibleO0kMr_c$default(ContentInViewNode contentInViewNode, Rect rect, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = contentInViewNode.viewportSize;
        }
        return contentInViewNode.m4963isMaxVisibleO0kMr_c(rect, j);
    }

    /* renamed from: isMaxVisible-O0kMr_c, reason: not valid java name */
    private final boolean m4963isMaxVisibleO0kMr_c(Rect rect, long j) {
        long jM4965relocationOffsetBMxPBkI = m4965relocationOffsetBMxPBkI(rect, j);
        return Math.abs(Float.intBitsToFloat((int) (jM4965relocationOffsetBMxPBkI >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jM4965relocationOffsetBMxPBkI & 4294967295L))) <= 0.5f;
    }

    /* renamed from: relocationOffset-BMxPBkI, reason: not valid java name */
    private final long m4965relocationOffsetBMxPBkI(Rect childBounds, long containerSize) {
        long jM8067toSizeozmzZPI = IntSize2.m8067toSizeozmzZPI(containerSize);
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return Offset.m6535constructorimpl((Float.floatToRawIntBits(requireBringIntoViewSpec().calculateScrollDistance(childBounds.getLeft(), childBounds.getRight() - childBounds.getLeft(), Float.intBitsToFloat((int) (jM8067toSizeozmzZPI >> 32)))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        float fCalculateScrollDistance = requireBringIntoViewSpec().calculateScrollDistance(childBounds.getTop(), childBounds.getBottom() - childBounds.getTop(), Float.intBitsToFloat((int) (jM8067toSizeozmzZPI & 4294967295L)));
        return Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fCalculateScrollDistance) & 4294967295L));
    }

    /* renamed from: compareTo-TemP2vQ, reason: not valid java name */
    private final int m4960compareToTemP2vQ(long j, long j2) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return Intrinsics.compare((int) (j & 4294967295L), (int) (j2 & 4294967295L));
        }
        if (i == 2) {
            return Intrinsics.compare((int) (j >> 32), (int) (j2 >> 32));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: compareTo-iLBOSCw, reason: not valid java name */
    private final int m4961compareToiLBOSCw(long j, long j2) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return Float.compare(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        }
        if (i == 2) {
            return Float.compare(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void update(Orientation orientation, boolean reverseDirection, BringIntoViewSpec bringIntoViewSpec) {
        this.orientation = orientation;
        this.reverseDirection = reverseDirection;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }

    /* compiled from: ContentInViewNode.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m3636d2 = {"Landroidx/compose/foundation/gestures/ContentInViewNode$Request;", "", "currentBounds", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CancellableContinuation;)V", "getContinuation", "()Lkotlinx/coroutines/CancellableContinuation;", "getCurrentBounds", "()Lkotlin/jvm/functions/Function0;", "toString", "", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Request {
        private final CancellableContinuation<Unit> continuation;
        private final Function0<Rect> currentBounds;

        /* JADX WARN: Multi-variable type inference failed */
        public Request(Function0<Rect> function0, CancellableContinuation<? super Unit> cancellableContinuation) {
            this.currentBounds = function0;
            this.continuation = cancellableContinuation;
        }

        public final Function0<Rect> getCurrentBounds() {
            return this.currentBounds;
        }

        public final CancellableContinuation<Unit> getContinuation() {
            return this.continuation;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String toString() {
            String str;
            CoroutineName coroutineName = (CoroutineName) this.continuation.getContext().get(CoroutineName.INSTANCE);
            String name = coroutineName != null ? coroutineName.getName() : null;
            StringBuilder sb = new StringBuilder();
            sb.append("Request@");
            String string2 = Integer.toString(hashCode(), CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            sb.append(string2);
            if (name != null) {
                str = '[' + name + "](";
                if (str == null) {
                    str = "(";
                }
            }
            sb.append(str);
            sb.append("currentBounds()=");
            sb.append(this.currentBounds.invoke());
            sb.append(", continuation=");
            sb.append(this.continuation);
            sb.append(')');
            return sb.toString();
        }
    }
}
