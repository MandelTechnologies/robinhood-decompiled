package com.robinhood.android.options.lib.simulatedreturn.chart;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import androidx.constraintlayout.compose.Dimension;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedReturnChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$OptionsSimulatedReturnBaseChart$6$1$5$1 */
/* loaded from: classes11.dex */
final class C23288xd4920729 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope4 $dividerAboveChartRef;
    final /* synthetic */ ConstraintLayoutBaseScope4 $dividerAboveXAxisRef;
    final /* synthetic */ ConstraintLayoutBaseScope4 $yAxisRef;

    C23288xd4920729(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ConstraintLayoutBaseScope4 constraintLayoutBaseScope42, ConstraintLayoutBaseScope4 constraintLayoutBaseScope43) {
        this.$dividerAboveChartRef = constraintLayoutBaseScope4;
        this.$dividerAboveXAxisRef = constraintLayoutBaseScope42;
        this.$yAxisRef = constraintLayoutBaseScope43;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), this.$dividerAboveChartRef.getBottom(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), this.$dividerAboveXAxisRef.getTop(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), this.$yAxisRef.getStart(), 0.0f, 0.0f, 6, null);
        Dimension.Companion companion = Dimension.INSTANCE;
        constrainAs.setWidth(companion.getFillToConstraints());
        constrainAs.setHeight(companion.getFillToConstraints());
    }
}
