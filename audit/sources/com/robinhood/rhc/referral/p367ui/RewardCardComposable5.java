package com.robinhood.rhc.referral.p367ui;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardCardComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rhc.referral.ui.RewardCardComposableKt$RewardCardComposable$1$1$4$1, reason: use source file name */
/* loaded from: classes26.dex */
final class RewardCardComposable5 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ float $spacingMedium;

    RewardCardComposable5(float f) {
        this.$spacingMedium = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), this.$spacingMedium, 0.0f, 4, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), this.$spacingMedium, 0.0f, 4, null);
    }
}
