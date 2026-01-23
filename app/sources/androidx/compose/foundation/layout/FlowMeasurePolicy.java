package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.p011ui.layout.IntrinsicMeasurable;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.MultiContentMeasurePolicy;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Constraints2;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;

/* compiled from: FlowLayout.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J2\u0010\u001e\u001a\u00020\u001b*\u00020\u00152\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\"\u001a\u00020\u000e*\u00020\u001f2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00160\u00162\u0006\u0010!\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010#J/\u0010%\u001a\u00020\u000e*\u00020\u001f2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00160\u00162\u0006\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010#J/\u0010&\u001a\u00020\u000e*\u00020\u001f2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00160\u00162\u0006\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010#J/\u0010'\u001a\u00020\u000e*\u00020\u001f2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00160\u00162\u0006\u0010!\u001a\u00020\u000eH\u0016¢\u0006\u0004\b'\u0010#JK\u0010*\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b*\u0010+J+\u0010-\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u000e¢\u0006\u0004\b-\u0010.JK\u00100\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010/\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b0\u0010+J\u0019\u00102\u001a\u00020\u000e*\u00020 2\u0006\u00101\u001a\u00020\u000e¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u00020\u000e*\u00020 2\u0006\u00101\u001a\u00020\u000e¢\u0006\u0004\b4\u00103J\u0019\u00105\u001a\u00020\u000e*\u00020 2\u0006\u00101\u001a\u00020\u000e¢\u0006\u0004\b5\u00103J\u0010\u00107\u001a\u000206HÖ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020\u00032\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b=\u0010>R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010?\u001a\u0004\b\u0004\u0010@R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\n\u0010GR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010GR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010KR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010KR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010L\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, m3636d2 = {"Landroidx/compose/foundation/layout/FlowMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "", "isHorizontal", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacing", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "crossAxisArrangementSpacing", "", "maxItemsInMainAxis", "maxLines", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "overflow", "<init>", "(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "maxIntrinsicWidth", "crossAxisAvailable", "crossAxisSpacing", "minIntrinsicMainAxisSize", "(Ljava/util/List;IIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)I", "arrangementSpacing", "maxIntrinsicMainAxisSize", "(Ljava/util/List;II)I", "mainAxisAvailable", "intrinsicCrossAxisSize", "size", "maxMainAxisIntrinsicItemSize", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "minCrossAxisIntrinsicItemSize", "minMainAxisIntrinsicItemSize", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getHorizontalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getVerticalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "F", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "I", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "foundation-layout_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final /* data */ class FlowMeasurePolicy implements MultiContentMeasurePolicy, FlowLineMeasurePolicy {
    private final CrossAxisAlignment crossAxisAlignment;
    private final float crossAxisArrangementSpacing;
    private final Arrangement.Horizontal horizontalArrangement;
    private final boolean isHorizontal;
    private final float mainAxisSpacing;
    private final int maxItemsInMainAxis;
    private final int maxLines;
    private final FlowLayoutOverflowState overflow;
    private final Arrangement.Vertical verticalArrangement;

    public /* synthetic */ FlowMeasurePolicy(boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, CrossAxisAlignment crossAxisAlignment, float f2, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, horizontal, vertical, f, crossAxisAlignment, f2, i, i2, flowLayoutOverflowState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlowMeasurePolicy)) {
            return false;
        }
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) other;
        return this.isHorizontal == flowMeasurePolicy.isHorizontal && Intrinsics.areEqual(this.horizontalArrangement, flowMeasurePolicy.horizontalArrangement) && Intrinsics.areEqual(this.verticalArrangement, flowMeasurePolicy.verticalArrangement) && C2002Dp.m7997equalsimpl0(this.mainAxisSpacing, flowMeasurePolicy.mainAxisSpacing) && Intrinsics.areEqual(this.crossAxisAlignment, flowMeasurePolicy.crossAxisAlignment) && C2002Dp.m7997equalsimpl0(this.crossAxisArrangementSpacing, flowMeasurePolicy.crossAxisArrangementSpacing) && this.maxItemsInMainAxis == flowMeasurePolicy.maxItemsInMainAxis && this.maxLines == flowMeasurePolicy.maxLines && Intrinsics.areEqual(this.overflow, flowMeasurePolicy.overflow);
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.isHorizontal) * 31) + this.horizontalArrangement.hashCode()) * 31) + this.verticalArrangement.hashCode()) * 31) + C2002Dp.m7998hashCodeimpl(this.mainAxisSpacing)) * 31) + this.crossAxisAlignment.hashCode()) * 31) + C2002Dp.m7998hashCodeimpl(this.crossAxisArrangementSpacing)) * 31) + Integer.hashCode(this.maxItemsInMainAxis)) * 31) + Integer.hashCode(this.maxLines)) * 31) + this.overflow.hashCode();
    }

    public String toString() {
        return "FlowMeasurePolicy(isHorizontal=" + this.isHorizontal + ", horizontalArrangement=" + this.horizontalArrangement + ", verticalArrangement=" + this.verticalArrangement + ", mainAxisSpacing=" + ((Object) C2002Dp.m7999toStringimpl(this.mainAxisSpacing)) + ", crossAxisAlignment=" + this.crossAxisAlignment + ", crossAxisArrangementSpacing=" + ((Object) C2002Dp.m7999toStringimpl(this.crossAxisArrangementSpacing)) + ", maxItemsInMainAxis=" + this.maxItemsInMainAxis + ", maxLines=" + this.maxLines + ", overflow=" + this.overflow + ')';
    }

    private FlowMeasurePolicy(boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, CrossAxisAlignment crossAxisAlignment, float f2, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState) {
        this.isHorizontal = z;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.mainAxisSpacing = f;
        this.crossAxisAlignment = crossAxisAlignment;
        this.crossAxisArrangementSpacing = f2;
        this.maxItemsInMainAxis = i;
        this.maxLines = i2;
        this.overflow = flowLayoutOverflowState;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    /* renamed from: isHorizontal, reason: from getter */
    public boolean getIsHorizontal() {
        return this.isHorizontal;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @Override // androidx.compose.p011ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo5116measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j) {
        LayoutOrientation layoutOrientation;
        if (this.maxLines == 0 || this.maxItemsInMainAxis == 0 || list.isEmpty() || (Constraints.m7974getMaxHeightimpl(j) == 0 && this.overflow.getType() != FlowLayoutOverflow.OverflowType.Visible)) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$measure$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null);
        }
        List list2 = (List) CollectionsKt.first((List) list);
        if (list2.isEmpty()) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$measure$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null);
        }
        List list3 = (List) CollectionsKt.getOrNull(list, 1);
        Measurable measurable = list3 != null ? (Measurable) CollectionsKt.firstOrNull(list3) : null;
        List list4 = (List) CollectionsKt.getOrNull(list, 2);
        Measurable measurable2 = list4 != null ? (Measurable) CollectionsKt.firstOrNull(list4) : null;
        this.overflow.setItemCount$foundation_layout_release(list2.size());
        this.overflow.m5113setOverflowMeasurableshBUhpc$foundation_layout_release(this, measurable, measurable2, j);
        Iterator it = list2.iterator();
        float f = this.mainAxisSpacing;
        float f2 = this.crossAxisArrangementSpacing;
        if (getIsHorizontal()) {
            layoutOrientation = LayoutOrientation.Horizontal;
        } else {
            layoutOrientation = LayoutOrientation.Vertical;
        }
        return FlowLayoutKt.m5109breakDownItemsdi9J0FM(measureScope, this, it, f, f2, OrientationIndependentConstraints.m5131constructorimpl(j, layoutOrientation), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    @Override // androidx.compose.p011ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) CollectionsKt.getOrNull(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.getOrNull(list, 2);
        flowLayoutOverflowState.m5114setOverflowMeasurableshBUhpc$foundation_layout_release(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list3) : null, getIsHorizontal(), Constraints2.Constraints$default(0, 0, 0, i, 7, null));
        if (getIsHorizontal()) {
            List<? extends IntrinsicMeasurable> listEmptyList = (List) CollectionsKt.firstOrNull((List) list);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return minIntrinsicMainAxisSize(listEmptyList, i, intrinsicMeasureScope.mo5010roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo5010roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends IntrinsicMeasurable> listEmptyList2 = (List) CollectionsKt.firstOrNull((List) list);
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return intrinsicCrossAxisSize(listEmptyList2, i, intrinsicMeasureScope.mo5010roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo5010roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    @Override // androidx.compose.p011ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) CollectionsKt.getOrNull(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.getOrNull(list, 2);
        flowLayoutOverflowState.m5114setOverflowMeasurableshBUhpc$foundation_layout_release(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list3) : null, getIsHorizontal(), Constraints2.Constraints$default(0, i, 0, 0, 13, null));
        if (getIsHorizontal()) {
            List<? extends IntrinsicMeasurable> listEmptyList = (List) CollectionsKt.firstOrNull((List) list);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return intrinsicCrossAxisSize(listEmptyList, i, intrinsicMeasureScope.mo5010roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo5010roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends IntrinsicMeasurable> listEmptyList2 = (List) CollectionsKt.firstOrNull((List) list);
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return minIntrinsicMainAxisSize(listEmptyList2, i, intrinsicMeasureScope.mo5010roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo5010roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    @Override // androidx.compose.p011ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) CollectionsKt.getOrNull(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.getOrNull(list, 2);
        flowLayoutOverflowState.m5114setOverflowMeasurableshBUhpc$foundation_layout_release(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list3) : null, getIsHorizontal(), Constraints2.Constraints$default(0, i, 0, 0, 13, null));
        if (getIsHorizontal()) {
            List<? extends IntrinsicMeasurable> listEmptyList = (List) CollectionsKt.firstOrNull((List) list);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return intrinsicCrossAxisSize(listEmptyList, i, intrinsicMeasureScope.mo5010roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo5010roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends IntrinsicMeasurable> listEmptyList2 = (List) CollectionsKt.firstOrNull((List) list);
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return maxIntrinsicMainAxisSize(listEmptyList2, i, intrinsicMeasureScope.mo5010roundToPx0680j_4(this.mainAxisSpacing));
    }

    @Override // androidx.compose.p011ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) CollectionsKt.getOrNull(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.getOrNull(list, 2);
        flowLayoutOverflowState.m5114setOverflowMeasurableshBUhpc$foundation_layout_release(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list3) : null, getIsHorizontal(), Constraints2.Constraints$default(0, 0, 0, i, 7, null));
        if (getIsHorizontal()) {
            List<? extends IntrinsicMeasurable> listEmptyList = (List) CollectionsKt.firstOrNull((List) list);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return maxIntrinsicMainAxisSize(listEmptyList, i, intrinsicMeasureScope.mo5010roundToPx0680j_4(this.mainAxisSpacing));
        }
        List<? extends IntrinsicMeasurable> listEmptyList2 = (List) CollectionsKt.firstOrNull((List) list);
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return intrinsicCrossAxisSize(listEmptyList2, i, intrinsicMeasureScope.mo5010roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo5010roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> measurables, int height, int arrangementSpacing) {
        int i = this.maxItemsInMainAxis;
        int size = measurables.size();
        int i2 = 0;
        int iMax = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            int iMaxMainAxisIntrinsicItemSize = maxMainAxisIntrinsicItemSize(measurables.get(i2), height) + arrangementSpacing;
            int i5 = i2 + 1;
            if (i5 - i3 == i || i5 == measurables.size()) {
                iMax = Math.max(iMax, (i4 + iMaxMainAxisIntrinsicItemSize) - arrangementSpacing);
                i4 = 0;
                i3 = i2;
            } else {
                i4 += iMaxMainAxisIntrinsicItemSize;
            }
            i2 = i5;
        }
        return iMax;
    }

    public final int maxMainAxisIntrinsicItemSize(IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getIsHorizontal() ? intrinsicMeasurable.maxIntrinsicWidth(i) : intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    public final int minCrossAxisIntrinsicItemSize(IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getIsHorizontal() ? intrinsicMeasurable.minIntrinsicHeight(i) : intrinsicMeasurable.minIntrinsicWidth(i);
    }

    public final int minMainAxisIntrinsicItemSize(IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getIsHorizontal() ? intrinsicMeasurable.minIntrinsicWidth(i) : intrinsicMeasurable.minIntrinsicHeight(i);
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> measurables, int crossAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) {
        List<? extends IntrinsicMeasurable> list = measurables;
        int i = maxItemsInMainAxis;
        int i2 = maxLines;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i3);
            int iMinMainAxisIntrinsicItemSize = minMainAxisIntrinsicItemSize(intrinsicMeasurable, crossAxisAvailable);
            iArr[i3] = iMinMainAxisIntrinsicItemSize;
            iArr2[i3] = minCrossAxisIntrinsicItemSize(intrinsicMeasurable, iMinMainAxisIntrinsicItemSize);
        }
        int i4 = Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE && i != Integer.MAX_VALUE) {
            i4 = i * i2;
        }
        int iMin = Math.min(i4 - (((i4 >= list.size() || !(overflow.getType() == FlowLayoutOverflow.OverflowType.ExpandIndicator || overflow.getType() == FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) && (i4 < list.size() || i2 < overflow.getMinLinesToShowCollapse() || overflow.getType() != FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) ? 0 : 1), list.size());
        int iSum = ArraysKt.sum(iArr) + ((list.size() - 1) * mainAxisSpacing);
        if (size2 != 0) {
            int iM4739getFirstimpl = iArr2[0];
            ?? it = new PrimitiveRanges2(1, ArraysKt.getLastIndex(iArr2)).iterator();
            while (it.hasNext()) {
                int i5 = iArr2[it.nextInt()];
                if (iM4739getFirstimpl < i5) {
                    iM4739getFirstimpl = i5;
                }
            }
            if (size != 0) {
                int i6 = iArr[0];
                ?? it2 = new PrimitiveRanges2(1, ArraysKt.getLastIndex(iArr)).iterator();
                while (it2.hasNext()) {
                    int i7 = iArr[it2.nextInt()];
                    if (i6 < i7) {
                        i6 = i7;
                    }
                }
                int i8 = i6;
                int i9 = iSum;
                while (i8 <= i9 && iM4739getFirstimpl != crossAxisAvailable) {
                    int i10 = (i8 + i9) / 2;
                    long jIntrinsicCrossAxisSize = FlowLayoutKt.intrinsicCrossAxisSize(list, iArr, iArr2, i10, mainAxisSpacing, crossAxisSpacing, i, i2, overflow);
                    iM4739getFirstimpl = IntIntPair.m4739getFirstimpl(jIntrinsicCrossAxisSize);
                    int iM4740getSecondimpl = IntIntPair.m4740getSecondimpl(jIntrinsicCrossAxisSize);
                    if (iM4739getFirstimpl > crossAxisAvailable || iM4740getSecondimpl < iMin) {
                        i8 = i10 + 1;
                        if (i8 > i9) {
                            return i8;
                        }
                    } else {
                        if (iM4739getFirstimpl >= crossAxisAvailable) {
                            return i10;
                        }
                        i9 = i10 - 1;
                    }
                    list = measurables;
                    i = maxItemsInMainAxis;
                    i2 = maxLines;
                    iSum = i10;
                }
                return iSum;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    public final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> measurables, int mainAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) {
        long jM4736constructorimpl;
        int i = 0;
        if (measurables.isEmpty()) {
            jM4736constructorimpl = IntIntPair.m4736constructorimpl(0, 0);
        } else {
            FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(maxItemsInMainAxis, overflow, OrientationIndependentConstraints.m5129constructorimpl(0, mainAxisAvailable, 0, Integer.MAX_VALUE), maxLines, mainAxisSpacing, crossAxisSpacing, null);
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.getOrNull(measurables, 0);
            int iMinCrossAxisIntrinsicItemSize = intrinsicMeasurable != null ? minCrossAxisIntrinsicItemSize(intrinsicMeasurable, mainAxisAvailable) : 0;
            int iMinMainAxisIntrinsicItemSize = intrinsicMeasurable != null ? minMainAxisIntrinsicItemSize(intrinsicMeasurable, iMinCrossAxisIntrinsicItemSize) : 0;
            int i2 = 0;
            if (flowLayoutBuildingBlocks.m5107getWrapInfoOpUlnko(measurables.size() > 1, 0, IntIntPair.m4736constructorimpl(mainAxisAvailable, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : IntIntPair.m4735boximpl(IntIntPair.m4736constructorimpl(iMinMainAxisIntrinsicItemSize, iMinCrossAxisIntrinsicItemSize)), 0, 0, 0, false, false).getIsLastItemInContainer()) {
                IntIntPair intIntPairM5112ellipsisSizeF35zmw$foundation_layout_release = overflow.m5112ellipsisSizeF35zmw$foundation_layout_release(intrinsicMeasurable != null, 0, 0);
                jM4736constructorimpl = IntIntPair.m4736constructorimpl(intIntPairM5112ellipsisSizeF35zmw$foundation_layout_release != null ? IntIntPair.m4740getSecondimpl(intIntPairM5112ellipsisSizeF35zmw$foundation_layout_release.getPackedValue()) : 0, 0);
            } else {
                int size = measurables.size();
                int i3 = mainAxisAvailable;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    if (i4 >= size) {
                        break;
                    }
                    int i9 = i3 - iMinMainAxisIntrinsicItemSize;
                    int i10 = i4 + 1;
                    int iMax = Math.max(i8, iMinCrossAxisIntrinsicItemSize);
                    IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.getOrNull(measurables, i10);
                    int iMinCrossAxisIntrinsicItemSize2 = intrinsicMeasurable2 != null ? minCrossAxisIntrinsicItemSize(intrinsicMeasurable2, mainAxisAvailable) : i;
                    int iMinMainAxisIntrinsicItemSize2 = intrinsicMeasurable2 != null ? minMainAxisIntrinsicItemSize(intrinsicMeasurable2, iMinCrossAxisIntrinsicItemSize2) + mainAxisSpacing : i;
                    boolean z = i4 + 2 < measurables.size();
                    int i11 = i10 - i6;
                    int i12 = i7;
                    int i13 = iMinMainAxisIntrinsicItemSize2;
                    int i14 = iMinCrossAxisIntrinsicItemSize2;
                    FlowLayoutBuildingBlocks.WrapInfo wrapInfoM5107getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m5107getWrapInfoOpUlnko(z, i11, IntIntPair.m4736constructorimpl(i9, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : IntIntPair.m4735boximpl(IntIntPair.m4736constructorimpl(iMinMainAxisIntrinsicItemSize2, iMinCrossAxisIntrinsicItemSize2)), i12, i2, iMax, false, false);
                    if (wrapInfoM5107getWrapInfoOpUlnko.getIsLastItemInLine()) {
                        int iM4740getSecondimpl = i2 + iMax + crossAxisSpacing;
                        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM5107getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i12, iM4740getSecondimpl, i9, i11);
                        int i15 = i13 - mainAxisSpacing;
                        i7 = i12 + 1;
                        if (wrapInfoM5107getWrapInfoOpUlnko.getIsLastItemInContainer()) {
                            if (wrapEllipsisInfo != null) {
                                long ellipsisSize = wrapEllipsisInfo.getEllipsisSize();
                                if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                                    iM4740getSecondimpl += IntIntPair.m4740getSecondimpl(ellipsisSize) + crossAxisSpacing;
                                }
                            }
                            i2 = iM4740getSecondimpl;
                            i5 = i10;
                        } else {
                            i2 = iM4740getSecondimpl;
                            iMinMainAxisIntrinsicItemSize = i15;
                            i6 = i10;
                            i8 = 0;
                            i3 = mainAxisAvailable;
                        }
                    } else {
                        i3 = i9;
                        i7 = i12;
                        i8 = iMax;
                        iMinMainAxisIntrinsicItemSize = i13;
                    }
                    iMinCrossAxisIntrinsicItemSize = i14;
                    i4 = i10;
                    i5 = i4;
                    i = 0;
                }
                jM4736constructorimpl = IntIntPair.m4736constructorimpl(i2 - crossAxisSpacing, i5);
            }
        }
        return IntIntPair.m4739getFirstimpl(jM4736constructorimpl);
    }
}
