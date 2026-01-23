package androidx.compose.animation;

import androidx.collection.ScatterMap6;
import androidx.collection.ScatterMap7;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors3;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.ParentDataModifier;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.compose.NavTransition2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AnimatedContent.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003\\]^B'\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0015\u001a\u00020\u0012*\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0004¢\u0006\u0004\b\u0015\u0010\u0016JK\u0010$\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00192!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#JK\u0010)\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00192!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010.\u001a\u00020+2\u0006\u0010*\u001a\u00020\u0012H\u0001¢\u0006\u0004\b,\u0010-R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b0\u00101R\"\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R1\u0010C\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000b8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR,\u0010F\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0E0D8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR*\u0010J\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010E8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0018\u0010S\u001a\u00020P*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0018\u0010U\u001a\u00020P*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010RR\u001a\u0010\r\u001a\u00020\u000b8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bV\u0010@R\u0014\u0010Y\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010[\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010X\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006`²\u0006\u0014\u0010_\u001a\u00020P\"\u0004\b\u0000\u0010\u00018\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "S", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/core/Transition;", NavTransition2.KEY_TRANSITION, "Landroidx/compose/ui/Alignment;", "contentAlignment", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/unit/IntSize;", "fullSize", "currentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculateOffset-emnUabE", "(JJ)J", "calculateOffset", "Landroidx/compose/animation/ContentTransform;", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "using", "(Landroidx/compose/animation/ContentTransform;Landroidx/compose/animation/SizeTransform;)Landroidx/compose/animation/ContentTransform;", "Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "towards", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "offsetForFullSlide", "initialOffset", "Landroidx/compose/animation/EnterTransition;", "slideIntoContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "slideIntoContainer", "targetOffset", "Landroidx/compose/animation/ExitTransition;", "slideOutOfContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "slideOutOfContainer", "contentTransform", "Landroidx/compose/ui/Modifier;", "createSizeAnimationModifier$animation_release", "(Landroidx/compose/animation/ContentTransform;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "createSizeAnimationModifier", "Landroidx/compose/animation/core/Transition;", "getTransition$animation_release", "()Landroidx/compose/animation/core/Transition;", "Landroidx/compose/ui/Alignment;", "getContentAlignment", "()Landroidx/compose/ui/Alignment;", "setContentAlignment", "(Landroidx/compose/ui/Alignment;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection$animation_release", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection$animation_release", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "<set-?>", "measuredSize$delegate", "Landroidx/compose/runtime/MutableState;", "getMeasuredSize-YbymL2g$animation_release", "()J", "setMeasuredSize-ozmzZPI$animation_release", "(J)V", "measuredSize", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/State;", "targetSizeMap", "Landroidx/collection/MutableScatterMap;", "getTargetSizeMap$animation_release", "()Landroidx/collection/MutableScatterMap;", "animatedSize", "Landroidx/compose/runtime/State;", "getAnimatedSize$animation_release", "()Landroidx/compose/runtime/State;", "setAnimatedSize$animation_release", "(Landroidx/compose/runtime/State;)V", "", "isLeft-gWo6LJ4", "(I)Z", "isLeft", "isRight-gWo6LJ4", "isRight", "getCurrentSize-YbymL2g", "getInitialState", "()Ljava/lang/Object;", "initialState", "getTargetState", "targetState", "ChildData", "SizeModifierElement", "SizeModifierNode", "shouldAnimateSize", "animation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AnimatedContentTransitionScopeImpl<S> implements AnimatedContentTransitionScope<S> {
    private SnapshotState4<IntSize> animatedSize;
    private Alignment contentAlignment;
    private LayoutDirection layoutDirection;

    /* renamed from: measuredSize$delegate, reason: from kotlin metadata */
    private final SnapshotState measuredSize = SnapshotState3.mutableStateOf$default(IntSize.m8055boximpl(IntSize.INSTANCE.m8064getZeroYbymL2g()), null, 2, null);
    private final ScatterMap6<S, SnapshotState4<IntSize>> targetSizeMap = ScatterMap7.mutableScatterMapOf();
    private final Transition<S> transition;

    private static final boolean createSizeAnimationModifier$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    public AnimatedContentTransitionScopeImpl(Transition<S> transition, Alignment alignment, LayoutDirection layoutDirection) {
        this.transition = transition;
        this.contentAlignment = alignment;
        this.layoutDirection = layoutDirection;
    }

    public final Transition<S> getTransition$animation_release() {
        return this.transition;
    }

    public Alignment getContentAlignment() {
        return this.contentAlignment;
    }

    public void setContentAlignment(Alignment alignment) {
        this.contentAlignment = alignment;
    }

    public final void setLayoutDirection$animation_release(LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getInitialState() {
        return this.transition.getSegment().getInitialState();
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getTargetState() {
        return this.transition.getSegment().getTargetState();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public ContentTransform using(ContentTransform contentTransform, SizeTransform sizeTransform) {
        contentTransform.setSizeTransform$animation_release(sizeTransform);
        return contentTransform;
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    /* renamed from: slideIntoContainer-mOhB8PU */
    public EnterTransition mo4751slideIntoContainermOhB8PU(int towards, FiniteAnimationSpec<IntOffset> animationSpec, final Function1<? super Integer, Integer> initialOffset) {
        if (m4765isLeftgWo6LJ4(towards)) {
            return EnterExitTransitionKt.slideInHorizontally(animationSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Integer invoke(int i) {
                    long j = i;
                    return initialOffset.invoke(Integer.valueOf(((int) (this.m4764getCurrentSizeYbymL2g() >> 32)) - IntOffset.m8038getXimpl(this.m4763calculateOffsetemnUabE(IntSize.m8056constructorimpl((j & 4294967295L) | (j << 32)), this.m4764getCurrentSizeYbymL2g()))));
                }
            });
        }
        if (m4766isRightgWo6LJ4(towards)) {
            return EnterExitTransitionKt.slideInHorizontally(animationSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Integer invoke(int i) {
                    long j = i;
                    return initialOffset.invoke(Integer.valueOf((-IntOffset.m8038getXimpl(this.m4763calculateOffsetemnUabE(IntSize.m8056constructorimpl((j & 4294967295L) | (j << 32)), this.m4764getCurrentSizeYbymL2g()))) - i));
                }
            });
        }
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.INSTANCE;
        if (AnimatedContentTransitionScope.SlideDirection.m4754equalsimpl0(towards, companion.m4760getUpDKzdypw())) {
            return EnterExitTransitionKt.slideInVertically(animationSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Integer invoke(int i) {
                    long j = i;
                    return initialOffset.invoke(Integer.valueOf(((int) (this.m4764getCurrentSizeYbymL2g() & 4294967295L)) - IntOffset.m8039getYimpl(this.m4763calculateOffsetemnUabE(IntSize.m8056constructorimpl((4294967295L & j) | (j << 32)), this.m4764getCurrentSizeYbymL2g()))));
                }
            });
        }
        if (AnimatedContentTransitionScope.SlideDirection.m4754equalsimpl0(towards, companion.m4755getDownDKzdypw())) {
            return EnterExitTransitionKt.slideInVertically(animationSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Integer invoke(int i) {
                    long j = i;
                    return initialOffset.invoke(Integer.valueOf((-IntOffset.m8039getYimpl(this.m4763calculateOffsetemnUabE(IntSize.m8056constructorimpl((j & 4294967295L) | (j << 32)), this.m4764getCurrentSizeYbymL2g()))) - i));
                }
            });
        }
        return EnterTransition.INSTANCE.getNone();
    }

    /* renamed from: isLeft-gWo6LJ4, reason: not valid java name */
    private final boolean m4765isLeftgWo6LJ4(int i) {
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.INSTANCE;
        if (AnimatedContentTransitionScope.SlideDirection.m4754equalsimpl0(i, companion.m4757getLeftDKzdypw())) {
            return true;
        }
        if (AnimatedContentTransitionScope.SlideDirection.m4754equalsimpl0(i, companion.m4759getStartDKzdypw()) && this.layoutDirection == LayoutDirection.Ltr) {
            return true;
        }
        return AnimatedContentTransitionScope.SlideDirection.m4754equalsimpl0(i, companion.m4756getEndDKzdypw()) && this.layoutDirection == LayoutDirection.Rtl;
    }

    /* renamed from: isRight-gWo6LJ4, reason: not valid java name */
    private final boolean m4766isRightgWo6LJ4(int i) {
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.INSTANCE;
        if (AnimatedContentTransitionScope.SlideDirection.m4754equalsimpl0(i, companion.m4758getRightDKzdypw())) {
            return true;
        }
        if (AnimatedContentTransitionScope.SlideDirection.m4754equalsimpl0(i, companion.m4759getStartDKzdypw()) && this.layoutDirection == LayoutDirection.Rtl) {
            return true;
        }
        return AnimatedContentTransitionScope.SlideDirection.m4754equalsimpl0(i, companion.m4756getEndDKzdypw()) && this.layoutDirection == LayoutDirection.Ltr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateOffset-emnUabE, reason: not valid java name */
    public final long m4763calculateOffsetemnUabE(long fullSize, long currentSize) {
        return getContentAlignment().mo6433alignKFBX0sM(fullSize, currentSize, LayoutDirection.Ltr);
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    /* renamed from: slideOutOfContainer-mOhB8PU */
    public ExitTransition mo4752slideOutOfContainermOhB8PU(int towards, FiniteAnimationSpec<IntOffset> animationSpec, final Function1<? super Integer, Integer> targetOffset) {
        if (m4765isLeftgWo6LJ4(towards)) {
            return EnterExitTransitionKt.slideOutHorizontally(animationSpec, new Function1<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$1
                final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Integer invoke(int i) {
                    SnapshotState4 snapshotState4 = (SnapshotState4) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                    long j = i;
                    return targetOffset.invoke(Integer.valueOf((-IntOffset.m8038getXimpl(this.this$0.m4763calculateOffsetemnUabE(IntSize.m8056constructorimpl((j & 4294967295L) | (j << 32)), snapshotState4 != null ? ((IntSize) snapshotState4.getValue()).getPackedValue() : IntSize.INSTANCE.m8064getZeroYbymL2g()))) - i));
                }
            });
        }
        if (m4766isRightgWo6LJ4(towards)) {
            return EnterExitTransitionKt.slideOutHorizontally(animationSpec, new Function1<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$2
                final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Integer invoke(int i) {
                    SnapshotState4 snapshotState4 = (SnapshotState4) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                    long packedValue = snapshotState4 != null ? ((IntSize) snapshotState4.getValue()).getPackedValue() : IntSize.INSTANCE.m8064getZeroYbymL2g();
                    long j = i;
                    return targetOffset.invoke(Integer.valueOf((-IntOffset.m8038getXimpl(this.this$0.m4763calculateOffsetemnUabE(IntSize.m8056constructorimpl((j & 4294967295L) | (j << 32)), packedValue))) + ((int) (packedValue >> 32))));
                }
            });
        }
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.INSTANCE;
        if (AnimatedContentTransitionScope.SlideDirection.m4754equalsimpl0(towards, companion.m4760getUpDKzdypw())) {
            return EnterExitTransitionKt.slideOutVertically(animationSpec, new Function1<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$3
                final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Integer invoke(int i) {
                    SnapshotState4 snapshotState4 = (SnapshotState4) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                    long j = i;
                    return targetOffset.invoke(Integer.valueOf((-IntOffset.m8039getYimpl(this.this$0.m4763calculateOffsetemnUabE(IntSize.m8056constructorimpl((j & 4294967295L) | (j << 32)), snapshotState4 != null ? ((IntSize) snapshotState4.getValue()).getPackedValue() : IntSize.INSTANCE.m8064getZeroYbymL2g()))) - i));
                }
            });
        }
        if (AnimatedContentTransitionScope.SlideDirection.m4754equalsimpl0(towards, companion.m4755getDownDKzdypw())) {
            return EnterExitTransitionKt.slideOutVertically(animationSpec, new Function1<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$4
                final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Integer invoke(int i) {
                    SnapshotState4 snapshotState4 = (SnapshotState4) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                    long packedValue = snapshotState4 != null ? ((IntSize) snapshotState4.getValue()).getPackedValue() : IntSize.INSTANCE.m8064getZeroYbymL2g();
                    long j = i;
                    return targetOffset.invoke(Integer.valueOf((-IntOffset.m8039getYimpl(this.this$0.m4763calculateOffsetemnUabE(IntSize.m8056constructorimpl((j & 4294967295L) | (j << 32)), packedValue))) + ((int) (packedValue & 4294967295L))));
                }
            });
        }
        return ExitTransition.INSTANCE.getNone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMeasuredSize-YbymL2g$animation_release, reason: not valid java name */
    public final long m4767getMeasuredSizeYbymL2g$animation_release() {
        return ((IntSize) this.measuredSize.getValue()).getPackedValue();
    }

    /* renamed from: setMeasuredSize-ozmzZPI$animation_release, reason: not valid java name */
    public final void m4768setMeasuredSizeozmzZPI$animation_release(long j) {
        this.measuredSize.setValue(IntSize.m8055boximpl(j));
    }

    public final ScatterMap6<S, SnapshotState4<IntSize>> getTargetSizeMap$animation_release() {
        return this.targetSizeMap;
    }

    public final void setAnimatedSize$animation_release(SnapshotState4<IntSize> snapshotState4) {
        this.animatedSize = snapshotState4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCurrentSize-YbymL2g, reason: not valid java name */
    public final long m4764getCurrentSizeYbymL2g() {
        SnapshotState4<IntSize> snapshotState4 = this.animatedSize;
        return snapshotState4 != null ? snapshotState4.getValue().getPackedValue() : m4767getMeasuredSizeYbymL2g$animation_release();
    }

    public final Modifier createSizeAnimationModifier$animation_release(ContentTransform contentTransform, Composer composer, int i) {
        Modifier modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(93755870, i, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:556)");
        }
        boolean zChanged = composer.changed(this);
        Object objRememberedValue = composer.rememberedValue();
        Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation = null;
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        SnapshotState4 snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(contentTransform.getSizeTransform(), composer, 0);
        if (Intrinsics.areEqual(this.transition.getCurrentState(), this.transition.getTargetState())) {
            createSizeAnimationModifier$lambda$3(snapshotState, false);
        } else if (snapshotState4RememberUpdatedState.getValue() != null) {
            createSizeAnimationModifier$lambda$3(snapshotState, true);
        }
        if (createSizeAnimationModifier$lambda$2(snapshotState)) {
            composer.startReplaceGroup(249676467);
            deferredAnimationCreateDeferredAnimation = TransitionKt.createDeferredAnimation(this.transition, VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), null, composer, 0, 2);
            boolean zChanged2 = composer.changed(deferredAnimationCreateDeferredAnimation);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                SizeTransform sizeTransform = (SizeTransform) snapshotState4RememberUpdatedState.getValue();
                objRememberedValue2 = (sizeTransform == null || sizeTransform.getClip()) ? Clip.clipToBounds(Modifier.INSTANCE) : Modifier.INSTANCE;
                composer.updateRememberedValue(objRememberedValue2);
            }
            modifier = (Modifier) objRememberedValue2;
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(249942509);
            composer.endReplaceGroup();
            this.animatedSize = null;
            modifier = Modifier.INSTANCE;
        }
        Modifier modifierThen = modifier.then(new SizeModifierElement(deferredAnimationCreateDeferredAnimation, snapshotState4RememberUpdatedState, this));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return modifierThen;
    }

    private static final void createSizeAnimationModifier$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: AnimatedContent.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\n\u001a\u00020\u000b*\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016R+\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\u0002\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u000e"}, m3636d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData;", "Landroidx/compose/ui/layout/ParentDataModifier;", "isTarget", "", "(Z)V", "<set-?>", "()Z", "setTarget", "isTarget$delegate", "Landroidx/compose/runtime/MutableState;", "modifyParentData", "", "Landroidx/compose/ui/unit/Density;", "parentData", "animation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class ChildData implements ParentDataModifier {

        /* renamed from: isTarget$delegate, reason: from kotlin metadata */
        private final SnapshotState isTarget;

        @Override // androidx.compose.p011ui.layout.ParentDataModifier
        public Object modifyParentData(Density density, Object obj) {
            return this;
        }

        public ChildData(boolean z) {
            this.isTarget = SnapshotState3.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean isTarget() {
            return ((Boolean) this.isTarget.getValue()).booleanValue();
        }

        public final void setTarget(boolean z) {
            this.isTarget.setValue(Boolean.valueOf(z));
        }
    }

    /* compiled from: AnimatedContent.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002BE\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004R\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR/\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004R\b\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, m3636d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;", "S", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode;", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "sizeAnimation", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "scope", "<init>", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "node", "", "update", "(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode;)V", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/runtime/State;", "getSizeTransform", "()Landroidx/compose/runtime/State;", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "getScope", "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "animation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class SizeModifierElement<S> extends ModifierNodeElement<SizeModifierNode<S>> {
        private final AnimatedContentTransitionScopeImpl<S> scope;
        private final Transition<S>.DeferredAnimation<IntSize, AnimationVectors3> sizeAnimation;
        private final SnapshotState4<SizeTransform> sizeTransform;

        /* JADX WARN: Multi-variable type inference failed */
        public SizeModifierElement(Transition<S>.DeferredAnimation<IntSize, AnimationVectors3> deferredAnimation, SnapshotState4<? extends SizeTransform> snapshotState4, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            this.sizeAnimation = deferredAnimation;
            this.sizeTransform = snapshotState4;
            this.scope = animatedContentTransitionScopeImpl;
        }

        @Override // androidx.compose.p011ui.node.ModifierNodeElement
        /* renamed from: create */
        public SizeModifierNode<S> getNode() {
            return new SizeModifierNode<>(this.sizeAnimation, this.sizeTransform, this.scope);
        }

        public int hashCode() {
            int iHashCode = this.scope.hashCode() * 31;
            Transition<S>.DeferredAnimation<IntSize, AnimationVectors3> deferredAnimation = this.sizeAnimation;
            return ((iHashCode + (deferredAnimation != null ? deferredAnimation.hashCode() : 0)) * 31) + this.sizeTransform.hashCode();
        }

        public boolean equals(Object other) {
            if (!(other instanceof SizeModifierElement)) {
                return false;
            }
            SizeModifierElement sizeModifierElement = (SizeModifierElement) other;
            return Intrinsics.areEqual(sizeModifierElement.sizeAnimation, this.sizeAnimation) && Intrinsics.areEqual(sizeModifierElement.sizeTransform, this.sizeTransform);
        }

        @Override // androidx.compose.p011ui.node.ModifierNodeElement
        public void update(SizeModifierNode<S> node) {
            node.setSizeAnimation(this.sizeAnimation);
            node.setSizeTransform(this.sizeTransform);
            node.setScope(this.scope);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedContent.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002BE\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003R\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u001e\u001a\u00020\u001b*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR:\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003R\b\u0012\u0004\u0012\u00028\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b.\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, m3636d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode;", "S", "Landroidx/compose/animation/LayoutModifierNodeWithPassThroughIntrinsics;", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "sizeAnimation", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "scope", "<init>", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "lastContinuousSizeOrDefault-mzRDjE0", "(J)J", "lastContinuousSizeOrDefault", "", "onReset", "()V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "setSizeAnimation", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", "Landroidx/compose/runtime/State;", "getSizeTransform", "()Landroidx/compose/runtime/State;", "setSizeTransform", "(Landroidx/compose/runtime/State;)V", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "getScope", "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "setScope", "(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", "lastSize", "J", "animation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    static final class SizeModifierNode<S> extends AnimationModifier2 {
        private long lastSize = AnimatedContentKt.UnspecifiedSize;
        private AnimatedContentTransitionScopeImpl<S> scope;
        private Transition<S>.DeferredAnimation<IntSize, AnimationVectors3> sizeAnimation;
        private SnapshotState4<? extends SizeTransform> sizeTransform;

        public final void setSizeAnimation(Transition<S>.DeferredAnimation<IntSize, AnimationVectors3> deferredAnimation) {
            this.sizeAnimation = deferredAnimation;
        }

        public final SnapshotState4<SizeTransform> getSizeTransform() {
            return this.sizeTransform;
        }

        public final void setSizeTransform(SnapshotState4<? extends SizeTransform> snapshotState4) {
            this.sizeTransform = snapshotState4;
        }

        public final AnimatedContentTransitionScopeImpl<S> getScope() {
            return this.scope;
        }

        public final void setScope(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            this.scope = animatedContentTransitionScopeImpl;
        }

        public SizeModifierNode(Transition<S>.DeferredAnimation<IntSize, AnimationVectors3> deferredAnimation, SnapshotState4<? extends SizeTransform> snapshotState4, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            this.sizeAnimation = deferredAnimation;
            this.sizeTransform = snapshotState4;
            this.scope = animatedContentTransitionScopeImpl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lastContinuousSizeOrDefault-mzRDjE0, reason: not valid java name */
        public final long m4770lastContinuousSizeOrDefaultmzRDjE0(long j) {
            return IntSize.m8058equalsimpl0(this.lastSize, AnimatedContentKt.UnspecifiedSize) ? j : this.lastSize;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onReset() {
            super.onReset();
            this.lastSize = AnimatedContentKt.UnspecifiedSize;
        }

        @Override // androidx.compose.p011ui.node.LayoutModifierNode
        /* renamed from: measure-3p2s80s, reason: not valid java name */
        public MeasureResult mo4771measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
            final long packedValue;
            final Placeable placeableMo7239measureBRTryo0 = measurable.mo7239measureBRTryo0(j);
            if (measureScope.isLookingAhead()) {
                packedValue = IntSize.m8056constructorimpl((placeableMo7239measureBRTryo0.getWidth() << 32) | (placeableMo7239measureBRTryo0.getHeight() & 4294967295L));
            } else if (this.sizeAnimation == null) {
                packedValue = IntSize.m8056constructorimpl((placeableMo7239measureBRTryo0.getWidth() << 32) | (placeableMo7239measureBRTryo0.getHeight() & 4294967295L));
                this.lastSize = IntSize.m8056constructorimpl((placeableMo7239measureBRTryo0.getWidth() << 32) | (placeableMo7239measureBRTryo0.getHeight() & 4294967295L));
            } else {
                final long jM8056constructorimpl = IntSize.m8056constructorimpl((placeableMo7239measureBRTryo0.getWidth() << 32) | (placeableMo7239measureBRTryo0.getHeight() & 4294967295L));
                Transition<S>.DeferredAnimation<IntSize, AnimationVectors3> deferredAnimation = this.sizeAnimation;
                Intrinsics.checkNotNull(deferredAnimation);
                SnapshotState4<IntSize> snapshotState4Animate = deferredAnimation.animate(new Function1<Transition.Segment<S>, FiniteAnimationSpec<IntSize>>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1
                    final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                        this.this$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final FiniteAnimationSpec<IntSize> invoke(Transition.Segment<S> segment) {
                        long packedValue2;
                        FiniteAnimationSpec<IntSize> finiteAnimationSpecMo4811createAnimationSpecTemP2vQ;
                        if (Intrinsics.areEqual(segment.getInitialState(), this.this$0.getScope().getInitialState())) {
                            packedValue2 = this.this$0.m4770lastContinuousSizeOrDefaultmzRDjE0(jM8056constructorimpl);
                        } else {
                            SnapshotState4<IntSize> snapshotState4 = this.this$0.getScope().getTargetSizeMap$animation_release().get(segment.getInitialState());
                            packedValue2 = snapshotState4 != null ? snapshotState4.getValue().getPackedValue() : IntSize.INSTANCE.m8064getZeroYbymL2g();
                        }
                        SnapshotState4<IntSize> snapshotState42 = this.this$0.getScope().getTargetSizeMap$animation_release().get(segment.getTargetState());
                        long packedValue3 = snapshotState42 != null ? snapshotState42.getValue().getPackedValue() : IntSize.INSTANCE.m8064getZeroYbymL2g();
                        SizeTransform value = this.this$0.getSizeTransform().getValue();
                        return (value == null || (finiteAnimationSpecMo4811createAnimationSpecTemP2vQ = value.mo4811createAnimationSpecTemP2vQ(packedValue2, packedValue3)) == null) ? AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null) : finiteAnimationSpecMo4811createAnimationSpecTemP2vQ;
                    }
                }, new Function1<S, IntSize>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2
                    final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                        this.this$0 = this;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ IntSize invoke(Object obj) {
                        return IntSize.m8055boximpl(m4772invokeYEO4UFw(obj));
                    }

                    /* renamed from: invoke-YEO4UFw, reason: not valid java name */
                    public final long m4772invokeYEO4UFw(S s) {
                        if (Intrinsics.areEqual(s, this.this$0.getScope().getInitialState())) {
                            return this.this$0.m4770lastContinuousSizeOrDefaultmzRDjE0(jM8056constructorimpl);
                        }
                        SnapshotState4<IntSize> snapshotState4 = this.this$0.getScope().getTargetSizeMap$animation_release().get(s);
                        return snapshotState4 != null ? snapshotState4.getValue().getPackedValue() : IntSize.INSTANCE.m8064getZeroYbymL2g();
                    }
                });
                this.scope.setAnimatedSize$animation_release(snapshotState4Animate);
                packedValue = snapshotState4Animate.getValue().getPackedValue();
                this.lastSize = snapshotState4Animate.getValue().getPackedValue();
            }
            return MeasureScope.layout$default(measureScope, (int) (packedValue >> 32), (int) (packedValue & 4294967295L), null, new Function1<Placeable.PlacementScope, Unit>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1
                final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope.m7264place70tqf50$default(placementScope, placeableMo7239measureBRTryo0, this.this$0.getScope().getContentAlignment().mo6433alignKFBX0sM(IntSize.m8056constructorimpl((placeableMo7239measureBRTryo0.getWidth() << 32) | (placeableMo7239measureBRTryo0.getHeight() & 4294967295L)), packedValue, LayoutDirection.Ltr), 0.0f, 2, null);
                }
            }, 4, null);
        }
    }
}
