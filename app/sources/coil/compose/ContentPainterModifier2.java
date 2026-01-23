package coil.compose;

import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.geometry.SizeKt;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.IntrinsicMeasurable;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.layout.ScaleFactor;
import androidx.compose.p011ui.layout.ScaleFactor2;
import androidx.compose.p011ui.node.DrawModifierNode;
import androidx.compose.p011ui.node.LayoutModifierNode;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Constraints2;
import androidx.compose.p011ui.unit.IntOffset;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* compiled from: ContentPainterModifier.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0013J&\u0010\u001f\u001a\u00020\u001c*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010$\u001a\u00020\"*\u00020 2\u0006\u0010\u001b\u001a\u00020!2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J#\u0010&\u001a\u00020\"*\u00020 2\u0006\u0010\u001b\u001a\u00020!2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010%J#\u0010(\u001a\u00020\"*\u00020 2\u0006\u0010\u001b\u001a\u00020!2\u0006\u0010'\u001a\u00020\"H\u0016¢\u0006\u0004\b(\u0010%J#\u0010)\u001a\u00020\"*\u00020 2\u0006\u0010\u001b\u001a\u00020!2\u0006\u0010'\u001a\u00020\"H\u0016¢\u0006\u0004\b)\u0010%J\u0013\u0010,\u001a\u00020+*\u00020*H\u0016¢\u0006\u0004\b,\u0010-R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006K"}, m3636d2 = {"Lcoil/compose/ContentPainterNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/graphics/painter/Painter;", PlaceTypes.PAINTER, "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "Landroidx/compose/ui/geometry/Size;", "dstSize", "calculateScaledSize-E7KxVPU", "(J)J", "calculateScaledSize", "Landroidx/compose/ui/unit/Constraints;", "constraints", "modifyConstraints-ZezNO4M", "modifyConstraints", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "setPainter", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "setAlignment", "(Landroidx/compose/ui/Alignment;)V", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "setContentScale", "(Landroidx/compose/ui/layout/ContentScale;)V", "F", "getAlpha", "()F", "setAlpha", "(F)V", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "", "getShouldAutoInvalidate", "()Z", "shouldAutoInvalidate", "coil-compose-base_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: coil.compose.ContentPainterNode, reason: use source file name */
/* loaded from: classes16.dex */
public final class ContentPainterModifier2 extends Modifier.Node implements DrawModifierNode, LayoutModifierNode {
    private Alignment alignment;
    private float alpha;
    private ColorFilter colorFilter;
    private ContentScale contentScale;
    private Painter painter;

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final Painter getPainter() {
        return this.painter;
    }

    public final void setPainter(Painter painter) {
        this.painter = painter;
    }

    public final void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public final void setContentScale(ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public ContentPainterModifier2(Painter painter, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter) {
        this.painter = painter;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f;
        this.colorFilter = colorFilter;
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo4771measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable placeableMo7239measureBRTryo0 = measurable.mo7239measureBRTryo0(m9112modifyConstraintsZezNO4M(j));
        return MeasureScope.layout$default(measureScope, placeableMo7239measureBRTryo0.getWidth(), placeableMo7239measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: coil.compose.ContentPainterNode$measure$1
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
        if (this.painter.mo7005getIntrinsicSizeNHjbRc() != Size.INSTANCE.m6588getUnspecifiedNHjbRc()) {
            int iMinIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(Constraints.m7974getMaxHeightimpl(m9112modifyConstraintsZezNO4M(Constraints2.Constraints$default(0, 0, 0, i, 7, null))));
            return Math.max(MathKt.roundToInt(Size.m6583getWidthimpl(m9111calculateScaledSizeE7KxVPU(SizeKt.Size(iMinIntrinsicWidth, i)))), iMinIntrinsicWidth);
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.painter.mo7005getIntrinsicSizeNHjbRc() != Size.INSTANCE.m6588getUnspecifiedNHjbRc()) {
            int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(Constraints.m7974getMaxHeightimpl(m9112modifyConstraintsZezNO4M(Constraints2.Constraints$default(0, 0, 0, i, 7, null))));
            return Math.max(MathKt.roundToInt(Size.m6583getWidthimpl(m9111calculateScaledSizeE7KxVPU(SizeKt.Size(iMaxIntrinsicWidth, i)))), iMaxIntrinsicWidth);
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.painter.mo7005getIntrinsicSizeNHjbRc() != Size.INSTANCE.m6588getUnspecifiedNHjbRc()) {
            int iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(Constraints.m7975getMaxWidthimpl(m9112modifyConstraintsZezNO4M(Constraints2.Constraints$default(0, i, 0, 0, 13, null))));
            return Math.max(MathKt.roundToInt(Size.m6580getHeightimpl(m9111calculateScaledSizeE7KxVPU(SizeKt.Size(i, iMinIntrinsicHeight)))), iMinIntrinsicHeight);
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.painter.mo7005getIntrinsicSizeNHjbRc() != Size.INSTANCE.m6588getUnspecifiedNHjbRc()) {
            int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(Constraints.m7975getMaxWidthimpl(m9112modifyConstraintsZezNO4M(Constraints2.Constraints$default(0, i, 0, 0, 13, null))));
            return Math.max(MathKt.roundToInt(Size.m6580getHeightimpl(m9111calculateScaledSizeE7KxVPU(SizeKt.Size(i, iMaxIntrinsicHeight)))), iMaxIntrinsicHeight);
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    /* renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m9111calculateScaledSizeE7KxVPU(long dstSize) {
        if (Size.m6585isEmptyimpl(dstSize)) {
            return Size.INSTANCE.m6589getZeroNHjbRc();
        }
        long jMo7005getIntrinsicSizeNHjbRc = this.painter.mo7005getIntrinsicSizeNHjbRc();
        if (jMo7005getIntrinsicSizeNHjbRc == Size.INSTANCE.m6588getUnspecifiedNHjbRc()) {
            return dstSize;
        }
        float fM6583getWidthimpl = Size.m6583getWidthimpl(jMo7005getIntrinsicSizeNHjbRc);
        if (Float.isInfinite(fM6583getWidthimpl) || Float.isNaN(fM6583getWidthimpl)) {
            fM6583getWidthimpl = Size.m6583getWidthimpl(dstSize);
        }
        float fM6580getHeightimpl = Size.m6580getHeightimpl(jMo7005getIntrinsicSizeNHjbRc);
        if (Float.isInfinite(fM6580getHeightimpl) || Float.isNaN(fM6580getHeightimpl)) {
            fM6580getHeightimpl = Size.m6580getHeightimpl(dstSize);
        }
        long jSize = SizeKt.Size(fM6583getWidthimpl, fM6580getHeightimpl);
        long jMo7234computeScaleFactorH7hwNQA = this.contentScale.mo7234computeScaleFactorH7hwNQA(jSize, dstSize);
        float fM7277getScaleXimpl = ScaleFactor.m7277getScaleXimpl(jMo7234computeScaleFactorH7hwNQA);
        if (Float.isInfinite(fM7277getScaleXimpl) || Float.isNaN(fM7277getScaleXimpl)) {
            return dstSize;
        }
        float fM7278getScaleYimpl = ScaleFactor.m7278getScaleYimpl(jMo7234computeScaleFactorH7hwNQA);
        return (Float.isInfinite(fM7278getScaleYimpl) || Float.isNaN(fM7278getScaleYimpl)) ? dstSize : ScaleFactor2.m7280timesmw2e94(jMo7234computeScaleFactorH7hwNQA, jSize);
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m9112modifyConstraintsZezNO4M(long constraints) {
        float fM7977getMinWidthimpl;
        int iM7976getMinHeightimpl;
        float fM9125constrainHeightK40F9xA;
        boolean zM7973getHasFixedWidthimpl = Constraints.m7973getHasFixedWidthimpl(constraints);
        boolean zM7972getHasFixedHeightimpl = Constraints.m7972getHasFixedHeightimpl(constraints);
        if (!zM7973getHasFixedWidthimpl || !zM7972getHasFixedHeightimpl) {
            boolean z = Constraints.m7971getHasBoundedWidthimpl(constraints) && Constraints.m7970getHasBoundedHeightimpl(constraints);
            long jMo7005getIntrinsicSizeNHjbRc = this.painter.mo7005getIntrinsicSizeNHjbRc();
            if (jMo7005getIntrinsicSizeNHjbRc != Size.INSTANCE.m6588getUnspecifiedNHjbRc()) {
                if (z && (zM7973getHasFixedWidthimpl || zM7972getHasFixedHeightimpl)) {
                    fM7977getMinWidthimpl = Constraints.m7975getMaxWidthimpl(constraints);
                    iM7976getMinHeightimpl = Constraints.m7974getMaxHeightimpl(constraints);
                } else {
                    float fM6583getWidthimpl = Size.m6583getWidthimpl(jMo7005getIntrinsicSizeNHjbRc);
                    float fM6580getHeightimpl = Size.m6580getHeightimpl(jMo7005getIntrinsicSizeNHjbRc);
                    fM7977getMinWidthimpl = (Float.isInfinite(fM6583getWidthimpl) || Float.isNaN(fM6583getWidthimpl)) ? Constraints.m7977getMinWidthimpl(constraints) : UtilsKt.m9126constrainWidthK40F9xA(constraints, fM6583getWidthimpl);
                    if (Float.isInfinite(fM6580getHeightimpl) || Float.isNaN(fM6580getHeightimpl)) {
                        iM7976getMinHeightimpl = Constraints.m7976getMinHeightimpl(constraints);
                    } else {
                        fM9125constrainHeightK40F9xA = UtilsKt.m9125constrainHeightK40F9xA(constraints, fM6580getHeightimpl);
                        long jM9111calculateScaledSizeE7KxVPU = m9111calculateScaledSizeE7KxVPU(SizeKt.Size(fM7977getMinWidthimpl, fM9125constrainHeightK40F9xA));
                        return Constraints.m7967copyZbe2FdA$default(constraints, Constraints2.m7990constrainWidthK40F9xA(constraints, MathKt.roundToInt(Size.m6583getWidthimpl(jM9111calculateScaledSizeE7KxVPU))), 0, Constraints2.m7989constrainHeightK40F9xA(constraints, MathKt.roundToInt(Size.m6580getHeightimpl(jM9111calculateScaledSizeE7KxVPU))), 0, 10, null);
                    }
                }
                fM9125constrainHeightK40F9xA = iM7976getMinHeightimpl;
                long jM9111calculateScaledSizeE7KxVPU2 = m9111calculateScaledSizeE7KxVPU(SizeKt.Size(fM7977getMinWidthimpl, fM9125constrainHeightK40F9xA));
                return Constraints.m7967copyZbe2FdA$default(constraints, Constraints2.m7990constrainWidthK40F9xA(constraints, MathKt.roundToInt(Size.m6583getWidthimpl(jM9111calculateScaledSizeE7KxVPU2))), 0, Constraints2.m7989constrainHeightK40F9xA(constraints, MathKt.roundToInt(Size.m6580getHeightimpl(jM9111calculateScaledSizeE7KxVPU2))), 0, 10, null);
            }
            if (z) {
                return Constraints.m7967copyZbe2FdA$default(constraints, Constraints.m7975getMaxWidthimpl(constraints), 0, Constraints.m7974getMaxHeightimpl(constraints), 0, 10, null);
            }
        }
        return constraints;
    }

    @Override // androidx.compose.p011ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        long jM9111calculateScaledSizeE7KxVPU = m9111calculateScaledSizeE7KxVPU(contentDrawScope.mo6963getSizeNHjbRc());
        long jMo6433alignKFBX0sM = this.alignment.mo6433alignKFBX0sM(UtilsKt.m9128toIntSizeuvyYCjk(jM9111calculateScaledSizeE7KxVPU), UtilsKt.m9128toIntSizeuvyYCjk(contentDrawScope.mo6963getSizeNHjbRc()), contentDrawScope.getLayoutDirection());
        float fM8031component1impl = IntOffset.m8031component1impl(jMo6433alignKFBX0sM);
        float fM8032component2impl = IntOffset.m8032component2impl(jMo6433alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(fM8031component1impl, fM8032component2impl);
        this.painter.m7010drawx_KDEd0(contentDrawScope, jM9111calculateScaledSizeE7KxVPU, this.alpha, this.colorFilter);
        contentDrawScope.getDrawContext().getTransform().translate(-fM8031component1impl, -fM8032component2impl);
        contentDrawScope.drawContent();
    }
}
