package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.p011ui.layout.IntrinsicMeasurable;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FlowLayoutOverflow.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J6\u0010\u001e\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ6\u0010\u001e\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\u0016\u001a\u0004\u0018\u00010!2\b\u0010\u0017\u001a\u0004\u0018\u00010!2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010'R\u001a\u0010\u0006\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b0\u0010'R\u001a\u00101\u001a\u00020#8\u0000X\u0080D¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010%R\"\u00104\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u0010'\"\u0004\b6\u00107R\"\u00108\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u0010.\u001a\u0004\b9\u0010'\"\u0004\b:\u00107R\u0018\u0010\u0016\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010\u0017\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010;R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010>R\u001e\u0010@\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b@\u0010AR\u001e\u0010B\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bB\u0010ARJ\u0010H\u001a6\u0012\u0013\u0012\u00110\t¢\u0006\f\bD\u0012\b\bE\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bD\u0012\b\bE\u0012\u0004\b\b(G\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010'\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006L"}, m3636d2 = {"Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "", "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "type", "", "minLinesToShowCollapse", "minCrossAxisSizeToShowCollapse", "<init>", "(Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;II)V", "", "hasNext", "lineIndex", "totalCrossAxisSize", "Landroidx/collection/IntIntPair;", "ellipsisSize-F35zm-w$foundation_layout_release", "(ZII)Landroidx/collection/IntIntPair;", "ellipsisSize", "Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", "ellipsisInfo$foundation_layout_release", "(ZII)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", "ellipsisInfo", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "seeMoreMeasurable", "collapseMeasurable", "isHorizontal", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "setOverflowMeasurables--hBUhpc$foundation_layout_release", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/layout/IntrinsicMeasurable;ZJ)V", "setOverflowMeasurables", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "measurePolicy", "Landroidx/compose/ui/layout/Measurable;", "(Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;Landroidx/compose/ui/layout/Measurable;Landroidx/compose/ui/layout/Measurable;J)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "getType$foundation_layout_release", "()Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "I", "getMinLinesToShowCollapse$foundation_layout_release", "getMinCrossAxisSizeToShowCollapse$foundation_layout_release", "shownItemLazyErrorMessage", "Ljava/lang/String;", "getShownItemLazyErrorMessage$foundation_layout_release", "itemShown", "getItemShown$foundation_layout_release", "setItemShown$foundation_layout_release", "(I)V", "itemCount", "getItemCount$foundation_layout_release", "setItemCount$foundation_layout_release", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "seeMorePlaceable", "Landroidx/compose/ui/layout/Placeable;", "collapsePlaceable", "seeMoreSize", "Landroidx/collection/IntIntPair;", "collapseSize", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "isExpandable", "noOfItemsShown", "getOverflowMeasurable", "Lkotlin/jvm/functions/Function2;", "getShownItemCount$foundation_layout_release", "shownItemCount", "foundation-layout_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final /* data */ class FlowLayoutOverflowState {
    private Measurable collapseMeasurable;
    private Placeable collapsePlaceable;
    private IntIntPair collapseSize;
    private Function2<? super Boolean, ? super Integer, ? extends Measurable> getOverflowMeasurable;
    private int itemCount;
    private final int minCrossAxisSizeToShowCollapse;
    private final int minLinesToShowCollapse;
    private Measurable seeMoreMeasurable;
    private Placeable seeMorePlaceable;
    private IntIntPair seeMoreSize;
    private final FlowLayoutOverflow.OverflowType type;
    private final String shownItemLazyErrorMessage = "Accessing shownItemCount before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase.";
    private int itemShown = -1;

    /* compiled from: FlowLayoutOverflow.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlowLayoutOverflow.OverflowType.values().length];
            try {
                iArr[FlowLayoutOverflow.OverflowType.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.Clip.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.ExpandIndicator.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlowLayoutOverflowState)) {
            return false;
        }
        FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) other;
        return this.type == flowLayoutOverflowState.type && this.minLinesToShowCollapse == flowLayoutOverflowState.minLinesToShowCollapse && this.minCrossAxisSizeToShowCollapse == flowLayoutOverflowState.minCrossAxisSizeToShowCollapse;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + Integer.hashCode(this.minLinesToShowCollapse)) * 31) + Integer.hashCode(this.minCrossAxisSizeToShowCollapse);
    }

    public String toString() {
        return "FlowLayoutOverflowState(type=" + this.type + ", minLinesToShowCollapse=" + this.minLinesToShowCollapse + ", minCrossAxisSizeToShowCollapse=" + this.minCrossAxisSizeToShowCollapse + ')';
    }

    public FlowLayoutOverflowState(FlowLayoutOverflow.OverflowType overflowType, int i, int i2) {
        this.type = overflowType;
        this.minLinesToShowCollapse = i;
        this.minCrossAxisSizeToShowCollapse = i2;
    }

    /* renamed from: getType$foundation_layout_release, reason: from getter */
    public final FlowLayoutOverflow.OverflowType getType() {
        return this.type;
    }

    /* renamed from: getMinLinesToShowCollapse$foundation_layout_release, reason: from getter */
    public final int getMinLinesToShowCollapse() {
        return this.minLinesToShowCollapse;
    }

    public final int getShownItemCount$foundation_layout_release() {
        int i = this.itemShown;
        if (i != -1) {
            return i;
        }
        throw new IllegalStateException(this.shownItemLazyErrorMessage);
    }

    public final void setItemShown$foundation_layout_release(int i) {
        this.itemShown = i;
    }

    public final void setItemCount$foundation_layout_release(int i) {
        this.itemCount = i;
    }

    /* renamed from: ellipsisSize-F35zm-w$foundation_layout_release, reason: not valid java name */
    public final IntIntPair m5112ellipsisSizeF35zmw$foundation_layout_release(boolean hasNext, int lineIndex, int totalCrossAxisSize) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (hasNext) {
                    return this.seeMoreSize;
                }
                if (lineIndex + 1 < this.minLinesToShowCollapse || totalCrossAxisSize < this.minCrossAxisSizeToShowCollapse) {
                    return null;
                }
                return this.collapseSize;
            }
            if (hasNext) {
                return this.seeMoreSize;
            }
        }
        return null;
    }

    public final FlowLayoutBuildingBlocks.WrapEllipsisInfo ellipsisInfo$foundation_layout_release(boolean hasNext, int lineIndex, int totalCrossAxisSize) {
        Measurable measurableInvoke;
        IntIntPair intIntPair;
        Placeable placeable;
        Measurable measurable;
        Placeable placeable2;
        int i = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i == 1 || i == 2) {
            return null;
        }
        if (i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (hasNext) {
            Function2<? super Boolean, ? super Integer, ? extends Measurable> function2 = this.getOverflowMeasurable;
            if (function2 == null || (measurableInvoke = function2.invoke(Boolean.TRUE, Integer.valueOf(getShownItemCount$foundation_layout_release()))) == null) {
                measurableInvoke = this.seeMoreMeasurable;
            }
            intIntPair = this.seeMoreSize;
            if (this.getOverflowMeasurable == null) {
                placeable = this.seeMorePlaceable;
                measurable = measurableInvoke;
                placeable2 = placeable;
            }
            measurable = measurableInvoke;
            placeable2 = null;
        } else {
            if (lineIndex < this.minLinesToShowCollapse - 1 || totalCrossAxisSize < this.minCrossAxisSizeToShowCollapse) {
                measurableInvoke = null;
            } else {
                Function2<? super Boolean, ? super Integer, ? extends Measurable> function22 = this.getOverflowMeasurable;
                if (function22 == null || (measurableInvoke = function22.invoke(Boolean.FALSE, Integer.valueOf(getShownItemCount$foundation_layout_release()))) == null) {
                    measurableInvoke = this.collapseMeasurable;
                }
            }
            intIntPair = this.collapseSize;
            if (this.getOverflowMeasurable == null) {
                placeable = this.collapsePlaceable;
                measurable = measurableInvoke;
                placeable2 = placeable;
            }
            measurable = measurableInvoke;
            placeable2 = null;
        }
        if (measurable == null) {
            return null;
        }
        Intrinsics.checkNotNull(intIntPair);
        return new FlowLayoutBuildingBlocks.WrapEllipsisInfo(measurable, placeable2, intIntPair.getPackedValue(), false, 8, null);
    }

    /* renamed from: setOverflowMeasurables--hBUhpc$foundation_layout_release, reason: not valid java name */
    public final void m5114setOverflowMeasurableshBUhpc$foundation_layout_release(IntrinsicMeasurable seeMoreMeasurable, IntrinsicMeasurable collapseMeasurable, boolean isHorizontal, long constraints) {
        long jM5131constructorimpl = OrientationIndependentConstraints.m5131constructorimpl(constraints, isHorizontal ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        if (seeMoreMeasurable != null) {
            int iMainAxisMin = FlowLayoutKt.mainAxisMin(seeMoreMeasurable, isHorizontal, Constraints.m7974getMaxHeightimpl(jM5131constructorimpl));
            this.seeMoreSize = IntIntPair.m4735boximpl(IntIntPair.m4736constructorimpl(iMainAxisMin, FlowLayoutKt.crossAxisMin(seeMoreMeasurable, isHorizontal, iMainAxisMin)));
            this.seeMoreMeasurable = seeMoreMeasurable instanceof Measurable ? (Measurable) seeMoreMeasurable : null;
            this.seeMorePlaceable = null;
        }
        if (collapseMeasurable != null) {
            int iMainAxisMin2 = FlowLayoutKt.mainAxisMin(collapseMeasurable, isHorizontal, Constraints.m7974getMaxHeightimpl(jM5131constructorimpl));
            this.collapseSize = IntIntPair.m4735boximpl(IntIntPair.m4736constructorimpl(iMainAxisMin2, FlowLayoutKt.crossAxisMin(collapseMeasurable, isHorizontal, iMainAxisMin2)));
            this.collapseMeasurable = collapseMeasurable instanceof Measurable ? (Measurable) collapseMeasurable : null;
            this.collapsePlaceable = null;
        }
    }

    /* renamed from: setOverflowMeasurables--hBUhpc$foundation_layout_release, reason: not valid java name */
    public final void m5113setOverflowMeasurableshBUhpc$foundation_layout_release(final FlowLineMeasurePolicy measurePolicy, Measurable seeMoreMeasurable, Measurable collapseMeasurable, long constraints) {
        LayoutOrientation layoutOrientation = measurePolicy.isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical;
        long jM5134toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m5134toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m5133copyyUG9Ft0$default(OrientationIndependentConstraints.m5131constructorimpl(constraints, layoutOrientation), 0, 0, 0, 0, 10, null), layoutOrientation);
        if (seeMoreMeasurable != null) {
            FlowLayoutKt.m5110measureAndCacherqJ1uqs(seeMoreMeasurable, measurePolicy, jM5134toBoxConstraintsOenEA2s, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutOverflowState$setOverflowMeasurables$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable placeable) {
                    invoke2(placeable);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable placeable) {
                    int iMainAxisSize;
                    int iCrossAxisSize;
                    if (placeable != null) {
                        FlowLineMeasurePolicy flowLineMeasurePolicy = measurePolicy;
                        iMainAxisSize = flowLineMeasurePolicy.mainAxisSize(placeable);
                        iCrossAxisSize = flowLineMeasurePolicy.crossAxisSize(placeable);
                    } else {
                        iMainAxisSize = 0;
                        iCrossAxisSize = 0;
                    }
                    this.this$0.seeMoreSize = IntIntPair.m4735boximpl(IntIntPair.m4736constructorimpl(iMainAxisSize, iCrossAxisSize));
                    this.this$0.seeMorePlaceable = placeable;
                }
            });
            this.seeMoreMeasurable = seeMoreMeasurable;
        }
        if (collapseMeasurable != null) {
            FlowLayoutKt.m5110measureAndCacherqJ1uqs(collapseMeasurable, measurePolicy, jM5134toBoxConstraintsOenEA2s, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutOverflowState$setOverflowMeasurables$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable placeable) {
                    invoke2(placeable);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable placeable) {
                    int iMainAxisSize;
                    int iCrossAxisSize;
                    if (placeable != null) {
                        FlowLineMeasurePolicy flowLineMeasurePolicy = measurePolicy;
                        iMainAxisSize = flowLineMeasurePolicy.mainAxisSize(placeable);
                        iCrossAxisSize = flowLineMeasurePolicy.crossAxisSize(placeable);
                    } else {
                        iMainAxisSize = 0;
                        iCrossAxisSize = 0;
                    }
                    this.this$0.collapseSize = IntIntPair.m4735boximpl(IntIntPair.m4736constructorimpl(iMainAxisSize, iCrossAxisSize));
                    this.this$0.collapsePlaceable = placeable;
                }
            });
            this.collapseMeasurable = collapseMeasurable;
        }
    }
}
