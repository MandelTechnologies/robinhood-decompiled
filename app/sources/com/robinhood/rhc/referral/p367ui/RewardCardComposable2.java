package com.robinhood.rhc.referral.p367ui;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import androidx.constraintlayout.compose.Dimension;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardCardComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rhc.referral.ui.RewardCardComposableKt$RewardCardComposable$1$1$1$1, reason: use source file name */
/* loaded from: classes26.dex */
final class RewardCardComposable2 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope4 $actionRef;
    final /* synthetic */ ConstraintLayoutBaseScope.VerticalAnchor $contentGuideline;
    final /* synthetic */ float $spacingDefault;
    final /* synthetic */ float $spacingMedium;
    final /* synthetic */ float $spacingXsmall;
    final /* synthetic */ ConstraintLayoutBaseScope4 $subtitle;
    final /* synthetic */ boolean $subtitleVisible;

    RewardCardComposable2(float f, boolean z, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ConstraintLayoutBaseScope4 constraintLayoutBaseScope42, float f2, float f3, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor) {
        this.$spacingMedium = f;
        this.$subtitleVisible = z;
        this.$subtitle = constraintLayoutBaseScope4;
        this.$actionRef = constraintLayoutBaseScope42;
        this.$spacingXsmall = f2;
        this.$spacingDefault = f3;
        this.$contentGuideline = verticalAnchor;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        constrainAs.setWidth(Dimension.INSTANCE.getFillToConstraints());
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), this.$spacingMedium, 0.0f, 4, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), (this.$subtitleVisible ? this.$subtitle : this.$actionRef).getTop(), this.$subtitleVisible ? this.$spacingXsmall : this.$spacingDefault, 0.0f, 4, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), this.$contentGuideline, this.$spacingDefault, 0.0f, 4, null);
    }
}
