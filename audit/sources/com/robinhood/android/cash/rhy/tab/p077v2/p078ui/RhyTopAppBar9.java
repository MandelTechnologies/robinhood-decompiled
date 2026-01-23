package com.robinhood.android.cash.rhy.tab.p077v2.p078ui;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyTopAppBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.RhyTopAppBarKt$RhyTopAppBar$2$2$3$1, reason: use source file name */
/* loaded from: classes7.dex */
final class RhyTopAppBar9 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope4 $button;
    final /* synthetic */ float $margin;

    RhyTopAppBar9(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, float f) {
        this.$button = constraintLayoutBaseScope4;
        this.$margin = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), this.$button.getTop(), this.$margin, 0.0f, 4, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), this.$button.getEnd(), this.$margin, 0.0f, 4, null);
    }
}
