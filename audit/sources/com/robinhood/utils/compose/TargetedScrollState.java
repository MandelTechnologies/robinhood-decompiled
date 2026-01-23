package com.robinhood.utils.compose;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.unit.Density;
import com.plaid.internal.EnumC7081g;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TargetedScroll.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u0017¢\u0006\u0002\u0010\u001eJ\u0013\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00028\u0000¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\u001b2\u0006\u0010&\u001a\u00028\u0000¢\u0006\u0002\u0010'J\u001b\u0010)\u001a\u00020**\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b+\u0010,J\u001b\u0010-\u001a\u00020.*\u00020/2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b0\u00101J\u001b\u00102\u001a\u00020 *\u0002032\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b4\u00105R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0019R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u00066"}, m3636d2 = {"Lcom/robinhood/utils/compose/TargetedScrollState;", "T", "", "scrollState", "Landroidx/compose/foundation/ScrollState;", "scrollCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "currentLocalDensity", "Landroidx/compose/ui/unit/Density;", "constraintsScope", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "<init>", "(Landroidx/compose/foundation/ScrollState;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/unit/Density;Landroidx/compose/foundation/layout/BoxWithConstraintsScope;)V", "getScrollState", "()Landroidx/compose/foundation/ScrollState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "setOrientation", "(Landroidx/compose/foundation/gestures/Orientation;)V", "scrollTargetLayoutCoordinatesMap", "", "Landroidx/compose/ui/layout/LayoutCoordinates;", "queuedScrollTarget", "Ljava/lang/Object;", "registerTarget", "", "key", "layoutCoordinates", "(Ljava/lang/Object;Landroidx/compose/ui/layout/LayoutCoordinates;)V", "parentCenter", "", "getParentCenter", "()F", "parentCenter$delegate", "Lkotlin/Lazy;", "centerOn", "target", "(Ljava/lang/Object;)V", "scrollTo", "maxLength", "Landroidx/compose/ui/unit/Dp;", "maxLength-chRvn1I", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/foundation/gestures/Orientation;)F", "length", "", "Landroidx/compose/ui/unit/IntSize;", "length-viCIZxY", "(JLandroidx/compose/foundation/gestures/Orientation;)I", "offset", "Landroidx/compose/ui/geometry/Offset;", "offset-3MmeM6k", "(JLandroidx/compose/foundation/gestures/Orientation;)F", "lib-utils-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
final class TargetedScrollState<T> {
    private final BoxWithConstraints4 constraintsScope;
    private final Density currentLocalDensity;
    public Orientation orientation;

    /* renamed from: parentCenter$delegate, reason: from kotlin metadata */
    private final Lazy parentCenter;
    private T queuedScrollTarget;
    private final CoroutineScope scrollCoroutineScope;
    private final ScrollState scrollState;
    private final Map<T, LayoutCoordinates> scrollTargetLayoutCoordinatesMap;

    /* compiled from: TargetedScroll.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
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

    public TargetedScrollState(ScrollState scrollState, CoroutineScope scrollCoroutineScope, Density currentLocalDensity, BoxWithConstraints4 constraintsScope) {
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(scrollCoroutineScope, "scrollCoroutineScope");
        Intrinsics.checkNotNullParameter(currentLocalDensity, "currentLocalDensity");
        Intrinsics.checkNotNullParameter(constraintsScope, "constraintsScope");
        this.scrollState = scrollState;
        this.scrollCoroutineScope = scrollCoroutineScope;
        this.currentLocalDensity = currentLocalDensity;
        this.constraintsScope = constraintsScope;
        this.scrollTargetLayoutCoordinatesMap = new LinkedHashMap();
        this.parentCenter = LazyKt.lazy(new Function0() { // from class: com.robinhood.utils.compose.TargetedScrollState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(TargetedScrollState.parentCenter_delegate$lambda$1(this.f$0));
            }
        });
    }

    public final ScrollState getScrollState() {
        return this.scrollState;
    }

    public final Orientation getOrientation() {
        Orientation orientation = this.orientation;
        if (orientation != null) {
            return orientation;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orientation");
        return null;
    }

    public final void setOrientation(Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "<set-?>");
        this.orientation = orientation;
    }

    public final void registerTarget(T key, LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        this.scrollTargetLayoutCoordinatesMap.put(key, layoutCoordinates);
        if (Intrinsics.areEqual(key, this.queuedScrollTarget)) {
            centerOn(key);
            this.queuedScrollTarget = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getParentCenter() {
        return ((Number) this.parentCenter.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float parentCenter_delegate$lambda$1(TargetedScrollState targetedScrollState) {
        return targetedScrollState.currentLocalDensity.mo5016toPx0680j_4(targetedScrollState.m26596maxLengthchRvn1I(targetedScrollState.constraintsScope, targetedScrollState.getOrientation())) / 2;
    }

    public final void centerOn(T target) {
        LayoutCoordinates layoutCoordinates = this.scrollTargetLayoutCoordinatesMap.get(target);
        if (layoutCoordinates == null) {
            this.queuedScrollTarget = target;
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.scrollCoroutineScope, null, null, new C418411(this, m26597offset3MmeM6k(LayoutCoordinates2.positionInParent(layoutCoordinates), getOrientation()) + (m26595lengthviCIZxY(layoutCoordinates.mo7241getSizeYbymL2g(), getOrientation()) / 2), null), 3, null);
    }

    /* compiled from: TargetedScroll.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.utils.compose.TargetedScrollState$centerOn$1", m3645f = "TargetedScroll.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.utils.compose.TargetedScrollState$centerOn$1 */
    static final class C418411 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $itemCenter;
        int label;
        final /* synthetic */ TargetedScrollState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C418411(TargetedScrollState<T> targetedScrollState, float f, Continuation<? super C418411> continuation) {
            super(2, continuation);
            this.this$0 = targetedScrollState;
            this.$itemCenter = f;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C418411(this.this$0, this.$itemCenter, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C418411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScrollState scrollState = this.this$0.getScrollState();
                int parentCenter = (int) (this.$itemCenter - this.this$0.getParentCenter());
                this.label = 1;
                if (ScrollState.animateScrollTo$default(scrollState, parentCenter, null, this, 2, null) == coroutine_suspended) {
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

    public final void scrollTo(T target) {
        LayoutCoordinates layoutCoordinates = this.scrollTargetLayoutCoordinatesMap.get(target);
        if (layoutCoordinates == null) {
            throw new IllegalStateException("Required value was null.");
        }
        BuildersKt__Builders_commonKt.launch$default(this.scrollCoroutineScope, null, null, new C418421(this, m26597offset3MmeM6k(LayoutCoordinates2.positionInParent(layoutCoordinates), getOrientation()), null), 3, null);
    }

    /* compiled from: TargetedScroll.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.utils.compose.TargetedScrollState$scrollTo$1", m3645f = "TargetedScroll.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.utils.compose.TargetedScrollState$scrollTo$1 */
    static final class C418421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $itemPosition;
        int label;
        final /* synthetic */ TargetedScrollState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C418421(TargetedScrollState<T> targetedScrollState, float f, Continuation<? super C418421> continuation) {
            super(2, continuation);
            this.this$0 = targetedScrollState;
            this.$itemPosition = f;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C418421(this.this$0, this.$itemPosition, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C418421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScrollState scrollState = this.this$0.getScrollState();
                int i2 = (int) this.$itemPosition;
                this.label = 1;
                if (ScrollState.animateScrollTo$default(scrollState, i2, null, this, 2, null) == coroutine_suspended) {
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

    /* renamed from: maxLength-chRvn1I, reason: not valid java name */
    private final float m26596maxLengthchRvn1I(BoxWithConstraints4 boxWithConstraints4, Orientation orientation) {
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return boxWithConstraints4.mo5102getMaxHeightD9Ej5fM();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return boxWithConstraints4.mo5103getMaxWidthD9Ej5fM();
    }

    /* renamed from: length-viCIZxY, reason: not valid java name */
    private final int m26595lengthviCIZxY(long j, Orientation orientation) {
        long j2;
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            j2 = j & 4294967295L;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            j2 = j >> 32;
        }
        return (int) j2;
    }

    /* renamed from: offset-3MmeM6k, reason: not valid java name */
    private final float m26597offset3MmeM6k(long j, Orientation orientation) {
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        if (i == 2) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new NoWhenBranchMatchedException();
    }
}
