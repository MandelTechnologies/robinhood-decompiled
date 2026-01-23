package com.robinhood.android.options.lib.simulatedreturn.chart;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import androidx.constraintlayout.compose.Dimension;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedReturnChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$OptionsSimulatedReturnBaseChart$6$1$3$1 */
/* loaded from: classes11.dex */
final class C23287xd491ffa7 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope4 $chartRef;
    final /* synthetic */ ConstraintLayoutBaseScope4 $dateLabelRef;
    final /* synthetic */ boolean $usePreTradeStyle;

    C23287xd491ffa7(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ConstraintLayoutBaseScope4 constraintLayoutBaseScope42, boolean z) {
        this.$dateLabelRef = constraintLayoutBaseScope4;
        this.$chartRef = constraintLayoutBaseScope42;
        this.$usePreTradeStyle = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), this.$dateLabelRef.getBottom(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), this.$chartRef.getTop(), 0.0f, 0.0f, 6, null);
        if (this.$usePreTradeStyle) {
            ConstrainScope.m8130linkTo8ZKsbrE$default(constrainAs, this.$chartRef.getStart(), this.$chartRef.getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, (Object) null);
        } else {
            ConstrainScope.m8130linkTo8ZKsbrE$default(constrainAs, constrainAs.getParent().getStart(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, (Object) null);
        }
        constrainAs.setWidth(Dimension.INSTANCE.getFillToConstraints());
    }
}
