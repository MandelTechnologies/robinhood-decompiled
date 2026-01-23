package androidx.compose.foundation.lazy;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.LayoutModifierNode;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Constraints2;
import androidx.compose.runtime.SnapshotState4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LazyItemScopeImpl.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ&\u0010\u0013\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, m3636d2 = {"Landroidx/compose/foundation/lazy/ParentSizeNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "", "fraction", "Landroidx/compose/runtime/State;", "", "widthState", "heightState", "<init>", "(FLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "F", "getFraction", "()F", "setFraction", "(F)V", "Landroidx/compose/runtime/State;", "getWidthState", "()Landroidx/compose/runtime/State;", "setWidthState", "(Landroidx/compose/runtime/State;)V", "getHeightState", "setHeightState", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.lazy.ParentSizeNode, reason: use source file name */
/* loaded from: classes4.dex */
final class LazyItemScopeImpl3 extends Modifier.Node implements LayoutModifierNode {
    private float fraction;
    private SnapshotState4<Integer> heightState;
    private SnapshotState4<Integer> widthState;

    public final void setFraction(float f) {
        this.fraction = f;
    }

    public final void setWidthState(SnapshotState4<Integer> snapshotState4) {
        this.widthState = snapshotState4;
    }

    public final void setHeightState(SnapshotState4<Integer> snapshotState4) {
        this.heightState = snapshotState4;
    }

    public LazyItemScopeImpl3(float f, SnapshotState4<Integer> snapshotState4, SnapshotState4<Integer> snapshotState42) {
        this.fraction = f;
        this.widthState = snapshotState4;
        this.heightState = snapshotState42;
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo4771measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        SnapshotState4<Integer> snapshotState4 = this.widthState;
        int iRound = (snapshotState4 == null || snapshotState4.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(snapshotState4.getValue().floatValue() * this.fraction);
        SnapshotState4<Integer> snapshotState42 = this.heightState;
        int iRound2 = (snapshotState42 == null || snapshotState42.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(snapshotState42.getValue().floatValue() * this.fraction);
        int iM7977getMinWidthimpl = iRound != Integer.MAX_VALUE ? iRound : Constraints.m7977getMinWidthimpl(j);
        int iM7976getMinHeightimpl = iRound2 != Integer.MAX_VALUE ? iRound2 : Constraints.m7976getMinHeightimpl(j);
        if (iRound == Integer.MAX_VALUE) {
            iRound = Constraints.m7975getMaxWidthimpl(j);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = Constraints.m7974getMaxHeightimpl(j);
        }
        final Placeable placeableMo7239measureBRTryo0 = measurable.mo7239measureBRTryo0(Constraints2.Constraints(iM7977getMinWidthimpl, iRound, iM7976getMinHeightimpl, iRound2));
        return MeasureScope.layout$default(measureScope, placeableMo7239measureBRTryo0.getWidth(), placeableMo7239measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.ParentSizeNode$measure$1
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
}
