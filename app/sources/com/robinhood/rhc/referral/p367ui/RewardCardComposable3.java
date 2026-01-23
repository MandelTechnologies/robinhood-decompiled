package com.robinhood.rhc.referral.p367ui;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope9;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import androidx.constraintlayout.compose.Dimension;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardCardComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rhc.referral.ui.RewardCardComposableKt$RewardCardComposable$1$1$2$1, reason: use source file name */
/* loaded from: classes26.dex */
final class RewardCardComposable3 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope4 $actionRef;
    final /* synthetic */ ConstraintLayoutBaseScope.VerticalAnchor $contentGuideline;
    final /* synthetic */ float $spacingDefault;
    final /* synthetic */ float $spacingMedium;
    final /* synthetic */ boolean $subtitleVisible;

    RewardCardComposable3(float f, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, float f2, boolean z) {
        this.$spacingMedium = f;
        this.$contentGuideline = verticalAnchor;
        this.$actionRef = constraintLayoutBaseScope4;
        this.$spacingDefault = f2;
        this.$subtitleVisible = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        ConstraintLayoutBaseScope9 gone;
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        constrainAs.setWidth(Dimension.INSTANCE.getFillToConstraints());
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), this.$spacingMedium, 0.0f, 4, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), this.$contentGuideline, 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), this.$actionRef.getTop(), this.$spacingDefault, 0.0f, 4, null);
        if (this.$subtitleVisible) {
            gone = ConstraintLayoutBaseScope9.INSTANCE.getVisible();
        } else {
            gone = ConstraintLayoutBaseScope9.INSTANCE.getGone();
        }
        constrainAs.setVisibility(gone);
    }
}
