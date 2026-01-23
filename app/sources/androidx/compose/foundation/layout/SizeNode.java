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
import androidx.compose.p011ui.unit.Constraints2;
import androidx.compose.p011ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Size.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0014\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0019\u001a\u00020\u0017*\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u00020\u0017*\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ#\u0010\u001d\u001a\u00020\u0017*\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ#\u0010\u001e\u001a\u00020\u0017*\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001aR(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R(\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R(\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u00102\u001a\u00020\u000f*\u00020/8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b0\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00063"}, m3636d2 = {"Landroidx/compose/foundation/layout/SizeNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/unit/Dp;", "minWidth", "minHeight", "maxWidth", "maxHeight", "", "enforceIncoming", "<init>", "(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "F", "getMinWidth-D9Ej5fM", "()F", "setMinWidth-0680j_4", "(F)V", "getMinHeight-D9Ej5fM", "setMinHeight-0680j_4", "getMaxWidth-D9Ej5fM", "setMaxWidth-0680j_4", "getMaxHeight-D9Ej5fM", "setMaxHeight-0680j_4", "Z", "getEnforceIncoming", "()Z", "setEnforceIncoming", "(Z)V", "Landroidx/compose/ui/unit/Density;", "getTargetConstraints-OenEA2s", "(Landroidx/compose/ui/unit/Density;)J", "targetConstraints", "foundation-layout_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class SizeNode extends Modifier.Node implements LayoutModifierNode {
    private boolean enforceIncoming;
    private float maxHeight;
    private float maxWidth;
    private float minHeight;
    private float minWidth;

    public /* synthetic */ SizeNode(float f, float f2, float f3, float f4, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z);
    }

    /* renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m5181setMinWidth0680j_4(float f) {
        this.minWidth = f;
    }

    /* renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m5180setMinHeight0680j_4(float f) {
        this.minHeight = f;
    }

    /* renamed from: setMaxWidth-0680j_4, reason: not valid java name */
    public final void m5179setMaxWidth0680j_4(float f) {
        this.maxWidth = f;
    }

    /* renamed from: setMaxHeight-0680j_4, reason: not valid java name */
    public final void m5178setMaxHeight0680j_4(float f) {
        this.maxHeight = f;
    }

    public final void setEnforceIncoming(boolean z) {
        this.enforceIncoming = z;
    }

    private SizeNode(float f, float f2, float f3, float f4, boolean z) {
        this.minWidth = f;
        this.minHeight = f2;
        this.maxWidth = f3;
        this.maxHeight = f4;
        this.enforceIncoming = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* renamed from: getTargetConstraints-OenEA2s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long m5177getTargetConstraintsOenEA2s(Density density) {
        int iMo5010roundToPx0680j_4;
        int iMo5010roundToPx0680j_42;
        int iMo5010roundToPx0680j_43;
        int i = 0;
        if (Float.isNaN(this.maxWidth)) {
            iMo5010roundToPx0680j_4 = Integer.MAX_VALUE;
        } else {
            iMo5010roundToPx0680j_4 = density.mo5010roundToPx0680j_4(this.maxWidth);
            if (iMo5010roundToPx0680j_4 < 0) {
                iMo5010roundToPx0680j_4 = 0;
            }
        }
        if (Float.isNaN(this.maxHeight)) {
            iMo5010roundToPx0680j_42 = Integer.MAX_VALUE;
        } else {
            iMo5010roundToPx0680j_42 = density.mo5010roundToPx0680j_4(this.maxHeight);
            if (iMo5010roundToPx0680j_42 < 0) {
                iMo5010roundToPx0680j_42 = 0;
            }
        }
        if (Float.isNaN(this.minWidth)) {
            iMo5010roundToPx0680j_43 = 0;
        } else {
            iMo5010roundToPx0680j_43 = density.mo5010roundToPx0680j_4(this.minWidth);
            if (iMo5010roundToPx0680j_43 < 0) {
                iMo5010roundToPx0680j_43 = 0;
            }
            if (iMo5010roundToPx0680j_43 > iMo5010roundToPx0680j_4) {
                iMo5010roundToPx0680j_43 = iMo5010roundToPx0680j_4;
            }
            if (iMo5010roundToPx0680j_43 == Integer.MAX_VALUE) {
            }
        }
        if (!Float.isNaN(this.minHeight)) {
            int iMo5010roundToPx0680j_44 = density.mo5010roundToPx0680j_4(this.minHeight);
            if (iMo5010roundToPx0680j_44 < 0) {
                iMo5010roundToPx0680j_44 = 0;
            }
            if (iMo5010roundToPx0680j_44 > iMo5010roundToPx0680j_42) {
                iMo5010roundToPx0680j_44 = iMo5010roundToPx0680j_42;
            }
            if (iMo5010roundToPx0680j_44 != Integer.MAX_VALUE) {
                i = iMo5010roundToPx0680j_44;
            }
        }
        return Constraints2.Constraints(iMo5010roundToPx0680j_43, iMo5010roundToPx0680j_4, i, iMo5010roundToPx0680j_42);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo4771measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int iM7977getMinWidthimpl;
        int iM7975getMaxWidthimpl;
        int iM7976getMinHeightimpl;
        int iM7974getMaxHeightimpl;
        long jConstraints;
        long jM5177getTargetConstraintsOenEA2s = m5177getTargetConstraintsOenEA2s(measureScope);
        if (this.enforceIncoming) {
            jConstraints = Constraints2.m7988constrainN9IONVI(j, jM5177getTargetConstraintsOenEA2s);
        } else {
            if (Float.isNaN(this.minWidth)) {
                iM7977getMinWidthimpl = Constraints.m7977getMinWidthimpl(j);
                int iM7975getMaxWidthimpl2 = Constraints.m7975getMaxWidthimpl(jM5177getTargetConstraintsOenEA2s);
                if (iM7977getMinWidthimpl > iM7975getMaxWidthimpl2) {
                    iM7977getMinWidthimpl = iM7975getMaxWidthimpl2;
                }
            } else {
                iM7977getMinWidthimpl = Constraints.m7977getMinWidthimpl(jM5177getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.maxWidth)) {
                iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(j);
                int iM7977getMinWidthimpl2 = Constraints.m7977getMinWidthimpl(jM5177getTargetConstraintsOenEA2s);
                if (iM7975getMaxWidthimpl < iM7977getMinWidthimpl2) {
                    iM7975getMaxWidthimpl = iM7977getMinWidthimpl2;
                }
            } else {
                iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(jM5177getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.minHeight)) {
                iM7976getMinHeightimpl = Constraints.m7976getMinHeightimpl(j);
                int iM7974getMaxHeightimpl2 = Constraints.m7974getMaxHeightimpl(jM5177getTargetConstraintsOenEA2s);
                if (iM7976getMinHeightimpl > iM7974getMaxHeightimpl2) {
                    iM7976getMinHeightimpl = iM7974getMaxHeightimpl2;
                }
            } else {
                iM7976getMinHeightimpl = Constraints.m7976getMinHeightimpl(jM5177getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.maxHeight)) {
                iM7974getMaxHeightimpl = Constraints.m7974getMaxHeightimpl(j);
                int iM7976getMinHeightimpl2 = Constraints.m7976getMinHeightimpl(jM5177getTargetConstraintsOenEA2s);
                if (iM7974getMaxHeightimpl < iM7976getMinHeightimpl2) {
                    iM7974getMaxHeightimpl = iM7976getMinHeightimpl2;
                }
            } else {
                iM7974getMaxHeightimpl = Constraints.m7974getMaxHeightimpl(jM5177getTargetConstraintsOenEA2s);
            }
            jConstraints = Constraints2.Constraints(iM7977getMinWidthimpl, iM7975getMaxWidthimpl, iM7976getMinHeightimpl, iM7974getMaxHeightimpl);
        }
        final Placeable placeableMo7239measureBRTryo0 = measurable.mo7239measureBRTryo0(jConstraints);
        return MeasureScope.layout$default(measureScope, placeableMo7239measureBRTryo0.getWidth(), placeableMo7239measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.SizeNode$measure$1
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
        long jM5177getTargetConstraintsOenEA2s = m5177getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m7973getHasFixedWidthimpl(jM5177getTargetConstraintsOenEA2s)) {
            return Constraints.m7975getMaxWidthimpl(jM5177getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i = Constraints2.m7989constrainHeightK40F9xA(jM5177getTargetConstraintsOenEA2s, i);
        }
        return Constraints2.m7990constrainWidthK40F9xA(jM5177getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicWidth(i));
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long jM5177getTargetConstraintsOenEA2s = m5177getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m7972getHasFixedHeightimpl(jM5177getTargetConstraintsOenEA2s)) {
            return Constraints.m7974getMaxHeightimpl(jM5177getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i = Constraints2.m7990constrainWidthK40F9xA(jM5177getTargetConstraintsOenEA2s, i);
        }
        return Constraints2.m7989constrainHeightK40F9xA(jM5177getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicHeight(i));
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long jM5177getTargetConstraintsOenEA2s = m5177getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m7973getHasFixedWidthimpl(jM5177getTargetConstraintsOenEA2s)) {
            return Constraints.m7975getMaxWidthimpl(jM5177getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i = Constraints2.m7989constrainHeightK40F9xA(jM5177getTargetConstraintsOenEA2s, i);
        }
        return Constraints2.m7990constrainWidthK40F9xA(jM5177getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicWidth(i));
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long jM5177getTargetConstraintsOenEA2s = m5177getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m7972getHasFixedHeightimpl(jM5177getTargetConstraintsOenEA2s)) {
            return Constraints.m7974getMaxHeightimpl(jM5177getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i = Constraints2.m7990constrainWidthK40F9xA(jM5177getTargetConstraintsOenEA2s, i);
        }
        return Constraints2.m7989constrainHeightK40F9xA(jM5177getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicHeight(i));
    }
}
