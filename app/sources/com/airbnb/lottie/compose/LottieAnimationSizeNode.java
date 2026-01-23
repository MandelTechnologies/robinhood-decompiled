package com.airbnb.lottie.compose;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.LayoutModifierNode;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Constraints2;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.IntSize2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LottieAnimationSizeNode.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u0010\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, m3636d2 = {"Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "", "width", "height", "<init>", "(II)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "I", "getWidth", "()I", "setWidth", "(I)V", "getHeight", "setHeight", "lottie-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class LottieAnimationSizeNode extends Modifier.Node implements LayoutModifierNode {
    private int height;
    private int width;

    public final void setWidth(int i) {
        this.width = i;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public LottieAnimationSizeNode(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo4771measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        long jConstraints;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jM7987constrain4WqzIAM = Constraints2.m7987constrain4WqzIAM(j, IntSize2.IntSize(this.width, this.height));
        if (Constraints.m7974getMaxHeightimpl(j) == Integer.MAX_VALUE && Constraints.m7975getMaxWidthimpl(j) != Integer.MAX_VALUE) {
            jConstraints = Constraints2.Constraints(IntSize.m8060getWidthimpl(jM7987constrain4WqzIAM), IntSize.m8060getWidthimpl(jM7987constrain4WqzIAM), (IntSize.m8060getWidthimpl(jM7987constrain4WqzIAM) * this.height) / this.width, (IntSize.m8060getWidthimpl(jM7987constrain4WqzIAM) * this.height) / this.width);
        } else if (Constraints.m7975getMaxWidthimpl(j) == Integer.MAX_VALUE && Constraints.m7974getMaxHeightimpl(j) != Integer.MAX_VALUE) {
            jConstraints = Constraints2.Constraints((IntSize.m8059getHeightimpl(jM7987constrain4WqzIAM) * this.width) / this.height, (IntSize.m8059getHeightimpl(jM7987constrain4WqzIAM) * this.width) / this.height, IntSize.m8059getHeightimpl(jM7987constrain4WqzIAM), IntSize.m8059getHeightimpl(jM7987constrain4WqzIAM));
        } else {
            jConstraints = Constraints2.Constraints(IntSize.m8060getWidthimpl(jM7987constrain4WqzIAM), IntSize.m8060getWidthimpl(jM7987constrain4WqzIAM), IntSize.m8059getHeightimpl(jM7987constrain4WqzIAM), IntSize.m8059getHeightimpl(jM7987constrain4WqzIAM));
        }
        final Placeable placeableMo7239measureBRTryo0 = measurable.mo7239measureBRTryo0(jConstraints);
        return MeasureScope.layout$default(measure, placeableMo7239measureBRTryo0.getWidth(), placeableMo7239measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationSizeNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(layout, placeableMo7239measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
