package com.robinhood.android.futures.trade.p147ui.orderform;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintScopeCommon4;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderFormRows.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
final class OrderFormRowsKt$PriceRow$1$5$1 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope4 $ask;
    final /* synthetic */ ConstraintLayoutBaseScope4 $bid;

    OrderFormRowsKt$PriceRow$1$5$1(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ConstraintLayoutBaseScope4 constraintLayoutBaseScope42) {
        this.$bid = constraintLayoutBaseScope4;
        this.$ask = constraintLayoutBaseScope42;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon4.m8119linkToVpY3zN4$default(constrainAs.getBaseline(), this.$bid.getBaseline(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), this.$ask.getEnd(), 0.0f, 0.0f, 6, null);
    }
}
