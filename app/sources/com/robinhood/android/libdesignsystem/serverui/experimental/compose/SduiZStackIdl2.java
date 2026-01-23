package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.ZStackDto;

/* compiled from: SduiZStackIdl.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackIdlKt$SduiZStack$1$layerModifier$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class SduiZStackIdl2 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope.VerticalAnchor $centerHorizontal;
    final /* synthetic */ ConstraintLayoutBaseScope.HorizontalAnchor $centerVertical;
    final /* synthetic */ ZStackDto.LayerDto $layer;

    SduiZStackIdl2(ZStackDto.LayerDto layerDto, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor) {
        this.$layer = layerDto;
        this.$centerHorizontal = verticalAnchor;
        this.$centerVertical = horizontalAnchor;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        SduiZStackIdl.convertConstraints(constrainAs, this.$layer, this.$centerHorizontal, this.$centerVertical);
    }
}
