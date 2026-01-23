package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelper2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.LayoutModifierNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Padding.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\u000f\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, m3636d2 = {"Landroidx/compose/foundation/layout/PaddingValuesModifier;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "<init>", "(Landroidx/compose/foundation/layout/PaddingValues;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/foundation/layout/PaddingValues;", "getPaddingValues", "()Landroidx/compose/foundation/layout/PaddingValues;", "setPaddingValues", "foundation-layout_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class PaddingValuesModifier extends Modifier.Node implements LayoutModifierNode {
    private PaddingValues paddingValues;

    public final void setPaddingValues(PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }

    public PaddingValuesModifier(PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo4771measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        float fMo5118calculateLeftPaddingu2uoSUM = this.paddingValues.mo5118calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection());
        float top = this.paddingValues.getTop();
        float fMo5119calculateRightPaddingu2uoSUM = this.paddingValues.mo5119calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection());
        float bottom = this.paddingValues.getBottom();
        float f = 0;
        if (!((C2002Dp.m7994compareTo0680j_4(bottom, C2002Dp.m7995constructorimpl(f)) >= 0) & (C2002Dp.m7994compareTo0680j_4(fMo5118calculateLeftPaddingu2uoSUM, C2002Dp.m7995constructorimpl(f)) >= 0) & (C2002Dp.m7994compareTo0680j_4(top, C2002Dp.m7995constructorimpl(f)) >= 0) & (C2002Dp.m7994compareTo0680j_4(fMo5119calculateRightPaddingu2uoSUM, C2002Dp.m7995constructorimpl(f)) >= 0))) {
            InlineClassHelper2.throwIllegalArgumentException("Padding must be non-negative");
        }
        final int iMo5010roundToPx0680j_4 = measureScope.mo5010roundToPx0680j_4(fMo5118calculateLeftPaddingu2uoSUM);
        int iMo5010roundToPx0680j_42 = measureScope.mo5010roundToPx0680j_4(fMo5119calculateRightPaddingu2uoSUM) + iMo5010roundToPx0680j_4;
        final int iMo5010roundToPx0680j_43 = measureScope.mo5010roundToPx0680j_4(top);
        int iMo5010roundToPx0680j_44 = measureScope.mo5010roundToPx0680j_4(bottom) + iMo5010roundToPx0680j_43;
        final Placeable placeableMo7239measureBRTryo0 = measurable.mo7239measureBRTryo0(Constraints2.m7991offsetNN6EwU(j, -iMo5010roundToPx0680j_42, -iMo5010roundToPx0680j_44));
        return MeasureScope.layout$default(measureScope, Constraints2.m7990constrainWidthK40F9xA(j, placeableMo7239measureBRTryo0.getWidth() + iMo5010roundToPx0680j_42), Constraints2.m7989constrainHeightK40F9xA(j, placeableMo7239measureBRTryo0.getHeight() + iMo5010roundToPx0680j_44), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.PaddingValuesModifier$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                Placeable.PlacementScope.place$default(placementScope, placeableMo7239measureBRTryo0, iMo5010roundToPx0680j_4, iMo5010roundToPx0680j_43, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
