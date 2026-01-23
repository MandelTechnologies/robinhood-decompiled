package androidx.compose.p011ui.layout;

import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.internal.InlineClassHelper4;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.Dp4;
import androidx.compose.p011ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Layout.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\f\u001a\u00020\t*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t*\u00020\rH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b*\u00020\rH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\b*\u00020\u0013H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0012\u001a\u00020\b*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u0018*\u00020\u0017H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u0013*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0015J\u0017\u0010\u001d\u001a\u00020\u0013*\u00020\rH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0011J\u0014\u0010!\u001a\u00020 *\u00020\u001fH\u0097\u0001¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u0017*\u00020\u0018H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\u001aJ\u0017\u0010'\u001a\u00020\r*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001a\u0010'\u001a\u00020\r*\u00020\u0013H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010&J\u001a\u0010'\u001a\u00020\r*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)Jg\u00107\u001a\u0002062\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\t0,2\u0019\u00103\u001a\u0015\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u000201\u0018\u00010/¢\u0006\u0002\b22\u0017\u00105\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002010/¢\u0006\u0002\b2H\u0016¢\u0006\u0004\b7\u00108R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u00138\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\u00138\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b?\u0010=R\u0014\u0010B\u001a\u00020A8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010C\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, m3636d2 = {"Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;", "intrinsicMeasureScope", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<init>", "(Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "", "Lkotlin/ExtensionFunctionType;", "rulers", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "getDensity", "()F", "density", "getFontScale", "fontScale", "", "isLookingAhead", "()Z", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ApproachIntrinsicsMeasureScope implements ApproachMeasureScope, ApproachMeasureScope2 {
    private final /* synthetic */ ApproachMeasureScope2 $$delegate_0;
    private final LayoutDirection layoutDirection;

    @Override // androidx.compose.p011ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.p011ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return this.$$delegate_0.isLookingAhead();
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public int mo5009roundToPxR2X_6o(long j) {
        return this.$$delegate_0.mo5009roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public int mo5010roundToPx0680j_4(float f) {
        return this.$$delegate_0.mo5010roundToPx0680j_4(f);
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo5011toDpGaN1DYA(long j) {
        return this.$$delegate_0.mo5011toDpGaN1DYA(j);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo5012toDpu2uoSUM(float f) {
        return this.$$delegate_0.mo5012toDpu2uoSUM(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo5013toDpu2uoSUM(int i) {
        return this.$$delegate_0.mo5013toDpu2uoSUM(i);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo5014toDpSizekrfVVM(long j) {
        return this.$$delegate_0.mo5014toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public float mo5015toPxR2X_6o(long j) {
        return this.$$delegate_0.mo5015toPxR2X_6o(j);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public float mo5016toPx0680j_4(float f) {
        return this.$$delegate_0.mo5016toPx0680j_4(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    public Rect toRect(Dp4 dp4) {
        return this.$$delegate_0.toRect(dp4);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo5017toSizeXkaWNTQ(long j) {
        return this.$$delegate_0.mo5017toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo5018toSp0xMU5do(float f) {
        return this.$$delegate_0.mo5018toSp0xMU5do(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo5019toSpkPz2Gy4(float f) {
        return this.$$delegate_0.mo5019toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo5020toSpkPz2Gy4(int i) {
        return this.$$delegate_0.mo5020toSpkPz2Gy4(i);
    }

    @Override // androidx.compose.p011ui.layout.MeasureScope
    public MeasureResult layout(final int width, final int height, final Map<AlignmentLine, Integer> alignmentLines, final Function1<? super MeasureScope2, Unit> rulers, Function1<? super Placeable.PlacementScope, Unit> placementBlock) {
        boolean z = false;
        if (width < 0) {
            width = 0;
        }
        if (height < 0) {
            height = 0;
        }
        if ((width & (-16777216)) == 0 && ((-16777216) & height) == 0) {
            z = true;
        }
        if (!z) {
            InlineClassHelper4.throwIllegalStateException("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult() { // from class: androidx.compose.ui.layout.ApproachIntrinsicsMeasureScope.layout.1
            @Override // androidx.compose.p011ui.layout.MeasureResult
            public void placeChildren() {
            }

            @Override // androidx.compose.p011ui.layout.MeasureResult
            /* renamed from: getWidth, reason: from getter */
            public int getF168$w() {
                return width;
            }

            @Override // androidx.compose.p011ui.layout.MeasureResult
            /* renamed from: getHeight, reason: from getter */
            public int getF167$h() {
                return height;
            }

            @Override // androidx.compose.p011ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return alignmentLines;
            }

            @Override // androidx.compose.p011ui.layout.MeasureResult
            public Function1<MeasureScope2, Unit> getRulers() {
                return rulers;
            }
        };
    }

    public ApproachIntrinsicsMeasureScope(ApproachMeasureScope2 approachMeasureScope2, LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
        this.$$delegate_0 = approachMeasureScope2;
    }

    @Override // androidx.compose.p011ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }
}
