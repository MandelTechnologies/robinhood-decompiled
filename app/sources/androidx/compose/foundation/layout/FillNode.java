package androidx.compose.foundation.layout;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.LayoutModifierNode;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Constraints2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Size.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u0011\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, m3636d2 = {"Landroidx/compose/foundation/layout/FillNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/layout/Direction;", "direction", "", "fraction", "<init>", "(Landroidx/compose/foundation/layout/Direction;F)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/foundation/layout/Direction;", "getDirection", "()Landroidx/compose/foundation/layout/Direction;", "setDirection", "(Landroidx/compose/foundation/layout/Direction;)V", "F", "getFraction", "()F", "setFraction", "(F)V", "foundation-layout_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class FillNode extends Modifier.Node implements LayoutModifierNode {
    private Direction direction;
    private float fraction;

    public final void setDirection(Direction direction) {
        this.direction = direction;
    }

    public final void setFraction(float f) {
        this.fraction = f;
    }

    public FillNode(Direction direction, float f) {
        this.direction = direction;
        this.fraction = f;
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo4771measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int iM7977getMinWidthimpl;
        int iM7975getMaxWidthimpl;
        int iM7974getMaxHeightimpl;
        int iM7974getMaxHeightimpl2;
        if (Constraints.m7971getHasBoundedWidthimpl(j) && this.direction != Direction.Vertical) {
            int iRound = Math.round(Constraints.m7975getMaxWidthimpl(j) * this.fraction);
            int iM7977getMinWidthimpl2 = Constraints.m7977getMinWidthimpl(j);
            iM7977getMinWidthimpl = Constraints.m7975getMaxWidthimpl(j);
            if (iRound < iM7977getMinWidthimpl2) {
                iRound = iM7977getMinWidthimpl2;
            }
            if (iRound <= iM7977getMinWidthimpl) {
                iM7977getMinWidthimpl = iRound;
            }
            iM7975getMaxWidthimpl = iM7977getMinWidthimpl;
        } else {
            iM7977getMinWidthimpl = Constraints.m7977getMinWidthimpl(j);
            iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(j);
        }
        if (Constraints.m7970getHasBoundedHeightimpl(j) && this.direction != Direction.Horizontal) {
            int iRound2 = Math.round(Constraints.m7974getMaxHeightimpl(j) * this.fraction);
            int iM7976getMinHeightimpl = Constraints.m7976getMinHeightimpl(j);
            iM7974getMaxHeightimpl2 = Constraints.m7974getMaxHeightimpl(j);
            if (iRound2 < iM7976getMinHeightimpl) {
                iRound2 = iM7976getMinHeightimpl;
            }
            if (iRound2 <= iM7974getMaxHeightimpl2) {
                iM7974getMaxHeightimpl2 = iRound2;
            }
            iM7974getMaxHeightimpl = iM7974getMaxHeightimpl2;
        } else {
            int iM7976getMinHeightimpl2 = Constraints.m7976getMinHeightimpl(j);
            iM7974getMaxHeightimpl = Constraints.m7974getMaxHeightimpl(j);
            iM7974getMaxHeightimpl2 = iM7976getMinHeightimpl2;
        }
        final Placeable placeableMo7239measureBRTryo0 = measurable.mo7239measureBRTryo0(Constraints2.Constraints(iM7977getMinWidthimpl, iM7975getMaxWidthimpl, iM7974getMaxHeightimpl2, iM7974getMaxHeightimpl));
        return MeasureScope.layout$default(measureScope, placeableMo7239measureBRTryo0.getWidth(), placeableMo7239measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FillNode$measure$1
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
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo7239measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
