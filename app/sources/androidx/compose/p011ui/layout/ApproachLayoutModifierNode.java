package androidx.compose.p011ui.layout;

import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.LayoutModifierNode;
import androidx.compose.p011ui.node.LayoutModifierNode3;
import androidx.compose.p011ui.node.LookaheadDelegate;
import androidx.compose.p011ui.node.NodeCoordinator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ApproachLayoutModifierNode.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u0003*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u001c\u0010\u001a\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J&\u0010\u001c\u001a\u00020\t*\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010 \u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u001c\u0010!\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016H\u0016ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\"À\u0006\u0001"}, m3636d2 = {"Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "isMeasurementApproachInProgress", "", "lookaheadSize", "Landroidx/compose/ui/unit/IntSize;", "isMeasurementApproachInProgress-ozmzZPI", "(J)Z", "approachMeasure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "approachMeasure-3p2s80s", "(Landroidx/compose/ui/layout/ApproachMeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "isPlacementApproachInProgress", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "lookaheadCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "maxApproachIntrinsicHeight", "", "Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxApproachIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureScope;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minApproachIntrinsicHeight", "minApproachIntrinsicWidth", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public interface ApproachLayoutModifierNode extends LayoutModifierNode {
    /* renamed from: approachMeasure-3p2s80s, reason: not valid java name */
    MeasureResult m7221approachMeasure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j);

    /* renamed from: isMeasurementApproachInProgress-ozmzZPI, reason: not valid java name */
    boolean m7222isMeasurementApproachInProgressozmzZPI(long lookaheadSize);

    default boolean isPlacementApproachInProgress(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
        return false;
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    default MeasureResult mo4771measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable placeableMo7239measureBRTryo0 = measurable.mo7239measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, placeableMo7239measureBRTryo0.getWidth(), placeableMo7239measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$measure$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo7239measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    default int minApproachIntrinsicWidth(ApproachMeasureScope2 approachMeasureScope2, IntrinsicMeasurable intrinsicMeasurable, int i) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        Intrinsics.checkNotNull(coordinator);
        LookaheadDelegate lookaheadDelegate = coordinator.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        if (lookaheadDelegate.getHasMeasureResult()) {
            return LayoutModifierNode3.INSTANCE.minWidth$ui_release(new LayoutModifierNode3.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.minApproachIntrinsicWidth.1
                @Override // androidx.compose.p011ui.node.LayoutModifierNode3.ApproachMeasureBlock
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo7223measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j) {
                    return ApproachLayoutModifierNode.this.m7221approachMeasure3p2s80s(approachMeasureScope, measurable, j);
                }
            }, approachMeasureScope2, intrinsicMeasurable, i);
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    default int minApproachIntrinsicHeight(ApproachMeasureScope2 approachMeasureScope2, IntrinsicMeasurable intrinsicMeasurable, int i) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        Intrinsics.checkNotNull(coordinator);
        LookaheadDelegate lookaheadDelegate = coordinator.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        if (lookaheadDelegate.getHasMeasureResult()) {
            return LayoutModifierNode3.INSTANCE.minHeight$ui_release(new LayoutModifierNode3.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.minApproachIntrinsicHeight.1
                @Override // androidx.compose.p011ui.node.LayoutModifierNode3.ApproachMeasureBlock
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo7223measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j) {
                    return ApproachLayoutModifierNode.this.m7221approachMeasure3p2s80s(approachMeasureScope, measurable, j);
                }
            }, approachMeasureScope2, intrinsicMeasurable, i);
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    default int maxApproachIntrinsicWidth(ApproachMeasureScope2 approachMeasureScope2, IntrinsicMeasurable intrinsicMeasurable, int i) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        Intrinsics.checkNotNull(coordinator);
        LookaheadDelegate lookaheadDelegate = coordinator.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        if (lookaheadDelegate.getHasMeasureResult()) {
            return LayoutModifierNode3.INSTANCE.maxWidth$ui_release(new LayoutModifierNode3.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.maxApproachIntrinsicWidth.1
                @Override // androidx.compose.p011ui.node.LayoutModifierNode3.ApproachMeasureBlock
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo7223measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j) {
                    return ApproachLayoutModifierNode.this.m7221approachMeasure3p2s80s(approachMeasureScope, measurable, j);
                }
            }, approachMeasureScope2, intrinsicMeasurable, i);
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    default int maxApproachIntrinsicHeight(ApproachMeasureScope2 approachMeasureScope2, IntrinsicMeasurable intrinsicMeasurable, int i) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        Intrinsics.checkNotNull(coordinator);
        LookaheadDelegate lookaheadDelegate = coordinator.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        if (lookaheadDelegate.getHasMeasureResult()) {
            return LayoutModifierNode3.INSTANCE.maxHeight$ui_release(new LayoutModifierNode3.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.maxApproachIntrinsicHeight.1
                @Override // androidx.compose.p011ui.node.LayoutModifierNode3.ApproachMeasureBlock
                /* renamed from: measure-3p2s80s, reason: not valid java name */
                public final MeasureResult mo7223measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j) {
                    return ApproachLayoutModifierNode.this.m7221approachMeasure3p2s80s(approachMeasureScope, measurable, j);
                }
            }, approachMeasureScope2, intrinsicMeasurable, i);
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }
}
