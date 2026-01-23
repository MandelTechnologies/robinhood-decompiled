package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import com.robinhood.models.serverdriven.experimental.api.ZStackLayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SduiZStack.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackKt$SduiZStack$1$layerModifier$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class SduiZStack8 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope.VerticalAnchor $centerHorizontal;
    final /* synthetic */ ConstraintLayoutBaseScope.HorizontalAnchor $centerVertical;
    final /* synthetic */ ZStackLayer<ActionT> $layer;

    /* JADX WARN: Multi-variable type inference failed */
    SduiZStack8(ZStackLayer<? extends ActionT> zStackLayer, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor) {
        this.$layer = zStackLayer;
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
        SduiZStack7.convertConstraints(constrainAs, this.$layer, this.$centerHorizontal, this.$centerVertical);
    }
}
