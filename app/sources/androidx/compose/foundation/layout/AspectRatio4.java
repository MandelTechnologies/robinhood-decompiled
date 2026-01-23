package androidx.compose.foundation.layout;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.IntrinsicMeasurable;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.LayoutModifierNode;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AspectRatio.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\r\u001a\u00020\n*\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0011\u001a\u00020\n*\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0013\u001a\u00020\n*\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0010J\u001e\u0010\u0015\u001a\u00020\n*\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0010J\u001e\u0010\u0017\u001a\u00020\n*\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0010J&\u0010\u001f\u001a\u00020\u001c*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010$\u001a\u00020\"*\u00020 2\u0006\u0010\u001a\u001a\u00020!2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J#\u0010&\u001a\u00020\"*\u00020 2\u0006\u0010\u001a\u001a\u00020!2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010%J#\u0010(\u001a\u00020\"*\u00020 2\u0006\u0010\u001a\u001a\u00020!2\u0006\u0010'\u001a\u00020\"H\u0016¢\u0006\u0004\b(\u0010%J#\u0010)\u001a\u00020\"*\u00020 2\u0006\u0010\u001a\u001a\u00020!2\u0006\u0010'\u001a\u00020\"H\u0016¢\u0006\u0004\b)\u0010%R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, m3636d2 = {"Landroidx/compose/foundation/layout/AspectRatioNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "", "aspectRatio", "", "matchHeightConstraintsFirst", "<init>", "(FZ)V", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/IntSize;", "findSize-ToXhtMw", "(J)J", "findSize", "enforceConstraints", "tryMaxWidth-JN-0ABg", "(JZ)J", "tryMaxWidth", "tryMaxHeight-JN-0ABg", "tryMaxHeight", "tryMinWidth-JN-0ABg", "tryMinWidth", "tryMinHeight-JN-0ABg", "tryMinHeight", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "F", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "Z", "getMatchHeightConstraintsFirst", "()Z", "setMatchHeightConstraintsFirst", "(Z)V", "foundation-layout_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.layout.AspectRatioNode, reason: use source file name */
/* loaded from: classes.dex */
final class AspectRatio4 extends Modifier.Node implements LayoutModifierNode {
    private float aspectRatio;
    private boolean matchHeightConstraintsFirst;

    public final void setAspectRatio(float f) {
        this.aspectRatio = f;
    }

    public final void setMatchHeightConstraintsFirst(boolean z) {
        this.matchHeightConstraintsFirst = z;
    }

    public AspectRatio4(float f, boolean z) {
        this.aspectRatio = f;
        this.matchHeightConstraintsFirst = z;
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo4771measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        long jM5095findSizeToXhtMw = m5095findSizeToXhtMw(j);
        if (!IntSize.m8058equalsimpl0(jM5095findSizeToXhtMw, IntSize.INSTANCE.m8064getZeroYbymL2g())) {
            j = Constraints.INSTANCE.m7984fixedJhjzzOo((int) (jM5095findSizeToXhtMw >> 32), (int) (jM5095findSizeToXhtMw & 4294967295L));
        }
        final Placeable placeableMo7239measureBRTryo0 = measurable.mo7239measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, placeableMo7239measureBRTryo0.getWidth(), placeableMo7239measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.AspectRatioNode$measure$1
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

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i * this.aspectRatio);
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i * this.aspectRatio);
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i / this.aspectRatio);
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i / this.aspectRatio);
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    /* renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m5095findSizeToXhtMw(long j) {
        if (!this.matchHeightConstraintsFirst) {
            long jM5097tryMaxWidthJN0ABg = m5097tryMaxWidthJN0ABg(j, true);
            IntSize.Companion companion = IntSize.INSTANCE;
            if (!IntSize.m8058equalsimpl0(jM5097tryMaxWidthJN0ABg, companion.m8064getZeroYbymL2g())) {
                return jM5097tryMaxWidthJN0ABg;
            }
            long jM5096tryMaxHeightJN0ABg = m5096tryMaxHeightJN0ABg(j, true);
            if (!IntSize.m8058equalsimpl0(jM5096tryMaxHeightJN0ABg, companion.m8064getZeroYbymL2g())) {
                return jM5096tryMaxHeightJN0ABg;
            }
            long jM5099tryMinWidthJN0ABg = m5099tryMinWidthJN0ABg(j, true);
            if (!IntSize.m8058equalsimpl0(jM5099tryMinWidthJN0ABg, companion.m8064getZeroYbymL2g())) {
                return jM5099tryMinWidthJN0ABg;
            }
            long jM5098tryMinHeightJN0ABg = m5098tryMinHeightJN0ABg(j, true);
            if (!IntSize.m8058equalsimpl0(jM5098tryMinHeightJN0ABg, companion.m8064getZeroYbymL2g())) {
                return jM5098tryMinHeightJN0ABg;
            }
            long jM5097tryMaxWidthJN0ABg2 = m5097tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m8058equalsimpl0(jM5097tryMaxWidthJN0ABg2, companion.m8064getZeroYbymL2g())) {
                return jM5097tryMaxWidthJN0ABg2;
            }
            long jM5096tryMaxHeightJN0ABg2 = m5096tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m8058equalsimpl0(jM5096tryMaxHeightJN0ABg2, companion.m8064getZeroYbymL2g())) {
                return jM5096tryMaxHeightJN0ABg2;
            }
            long jM5099tryMinWidthJN0ABg2 = m5099tryMinWidthJN0ABg(j, false);
            if (!IntSize.m8058equalsimpl0(jM5099tryMinWidthJN0ABg2, companion.m8064getZeroYbymL2g())) {
                return jM5099tryMinWidthJN0ABg2;
            }
            long jM5098tryMinHeightJN0ABg2 = m5098tryMinHeightJN0ABg(j, false);
            if (!IntSize.m8058equalsimpl0(jM5098tryMinHeightJN0ABg2, companion.m8064getZeroYbymL2g())) {
                return jM5098tryMinHeightJN0ABg2;
            }
        } else {
            long jM5096tryMaxHeightJN0ABg3 = m5096tryMaxHeightJN0ABg(j, true);
            IntSize.Companion companion2 = IntSize.INSTANCE;
            if (!IntSize.m8058equalsimpl0(jM5096tryMaxHeightJN0ABg3, companion2.m8064getZeroYbymL2g())) {
                return jM5096tryMaxHeightJN0ABg3;
            }
            long jM5097tryMaxWidthJN0ABg3 = m5097tryMaxWidthJN0ABg(j, true);
            if (!IntSize.m8058equalsimpl0(jM5097tryMaxWidthJN0ABg3, companion2.m8064getZeroYbymL2g())) {
                return jM5097tryMaxWidthJN0ABg3;
            }
            long jM5098tryMinHeightJN0ABg3 = m5098tryMinHeightJN0ABg(j, true);
            if (!IntSize.m8058equalsimpl0(jM5098tryMinHeightJN0ABg3, companion2.m8064getZeroYbymL2g())) {
                return jM5098tryMinHeightJN0ABg3;
            }
            long jM5099tryMinWidthJN0ABg3 = m5099tryMinWidthJN0ABg(j, true);
            if (!IntSize.m8058equalsimpl0(jM5099tryMinWidthJN0ABg3, companion2.m8064getZeroYbymL2g())) {
                return jM5099tryMinWidthJN0ABg3;
            }
            long jM5096tryMaxHeightJN0ABg4 = m5096tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m8058equalsimpl0(jM5096tryMaxHeightJN0ABg4, companion2.m8064getZeroYbymL2g())) {
                return jM5096tryMaxHeightJN0ABg4;
            }
            long jM5097tryMaxWidthJN0ABg4 = m5097tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m8058equalsimpl0(jM5097tryMaxWidthJN0ABg4, companion2.m8064getZeroYbymL2g())) {
                return jM5097tryMaxWidthJN0ABg4;
            }
            long jM5098tryMinHeightJN0ABg4 = m5098tryMinHeightJN0ABg(j, false);
            if (!IntSize.m8058equalsimpl0(jM5098tryMinHeightJN0ABg4, companion2.m8064getZeroYbymL2g())) {
                return jM5098tryMinHeightJN0ABg4;
            }
            long jM5099tryMinWidthJN0ABg4 = m5099tryMinWidthJN0ABg(j, false);
            if (!IntSize.m8058equalsimpl0(jM5099tryMinWidthJN0ABg4, companion2.m8064getZeroYbymL2g())) {
                return jM5099tryMinWidthJN0ABg4;
            }
        }
        return IntSize.INSTANCE.m8064getZeroYbymL2g();
    }

    /* renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m5097tryMaxWidthJN0ABg(long j, boolean z) {
        int iRound;
        int iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(j);
        if (iM7975getMaxWidthimpl != Integer.MAX_VALUE && (iRound = Math.round(iM7975getMaxWidthimpl / this.aspectRatio)) > 0 && (!z || AspectRatio3.m5094isSatisfiedByNN6EwU(j, iM7975getMaxWidthimpl, iRound))) {
            return IntSize.m8056constructorimpl((iM7975getMaxWidthimpl << 32) | (iRound & 4294967295L));
        }
        return IntSize.INSTANCE.m8064getZeroYbymL2g();
    }

    /* renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m5096tryMaxHeightJN0ABg(long j, boolean z) {
        int iRound;
        int iM7974getMaxHeightimpl = Constraints.m7974getMaxHeightimpl(j);
        if (iM7974getMaxHeightimpl != Integer.MAX_VALUE && (iRound = Math.round(iM7974getMaxHeightimpl * this.aspectRatio)) > 0 && (!z || AspectRatio3.m5094isSatisfiedByNN6EwU(j, iRound, iM7974getMaxHeightimpl))) {
            return IntSize.m8056constructorimpl((iRound << 32) | (iM7974getMaxHeightimpl & 4294967295L));
        }
        return IntSize.INSTANCE.m8064getZeroYbymL2g();
    }

    /* renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m5099tryMinWidthJN0ABg(long j, boolean z) {
        int iM7977getMinWidthimpl = Constraints.m7977getMinWidthimpl(j);
        int iRound = Math.round(iM7977getMinWidthimpl / this.aspectRatio);
        if (iRound > 0 && (!z || AspectRatio3.m5094isSatisfiedByNN6EwU(j, iM7977getMinWidthimpl, iRound))) {
            return IntSize.m8056constructorimpl((iM7977getMinWidthimpl << 32) | (iRound & 4294967295L));
        }
        return IntSize.INSTANCE.m8064getZeroYbymL2g();
    }

    /* renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m5098tryMinHeightJN0ABg(long j, boolean z) {
        int iM7976getMinHeightimpl = Constraints.m7976getMinHeightimpl(j);
        int iRound = Math.round(iM7976getMinHeightimpl * this.aspectRatio);
        if (iRound > 0 && (!z || AspectRatio3.m5094isSatisfiedByNN6EwU(j, iRound, iM7976getMinHeightimpl))) {
            return IntSize.m8056constructorimpl((iRound << 32) | (iM7976getMinHeightimpl & 4294967295L));
        }
        return IntSize.INSTANCE.m8064getZeroYbymL2g();
    }
}
