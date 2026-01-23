package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope9;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BracketMatchOverviewCard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
final class BracketMatchOverviewCardKt$TwoRowsDisplay$1$7$1 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ boolean $hasScores;
    final /* synthetic */ ConstraintLayoutBaseScope.VerticalAnchor $verticalPercentGuideline;

    BracketMatchOverviewCardKt$TwoRowsDisplay$1$7$1(boolean z, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor) {
        this.$hasScores = z;
        this.$verticalPercentGuideline = verticalAnchor;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        constrainAs.setVisibility(this.$hasScores ? ConstraintLayoutBaseScope9.INSTANCE.getVisible() : ConstraintLayoutBaseScope9.INSTANCE.getGone());
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), this.$verticalPercentGuideline, 0.0f, 0.0f, 6, null);
    }
}
