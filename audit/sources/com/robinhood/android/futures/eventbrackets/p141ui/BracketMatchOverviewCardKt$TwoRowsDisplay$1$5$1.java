package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope9;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BracketMatchOverviewCard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class BracketMatchOverviewCardKt$TwoRowsDisplay$1$5$1 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ boolean $hasScores;
    final /* synthetic */ ConstraintLayoutBaseScope4 $seed1Name;
    final /* synthetic */ ConstraintLayoutBaseScope4 $verticalDivider;

    BracketMatchOverviewCardKt$TwoRowsDisplay$1$5$1(boolean z, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ConstraintLayoutBaseScope4 constraintLayoutBaseScope42) {
        this.$hasScores = z;
        this.$seed1Name = constraintLayoutBaseScope4;
        this.$verticalDivider = constraintLayoutBaseScope42;
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
        ConstrainScope.m8130linkTo8ZKsbrE$default(constrainAs, this.$seed1Name.getEnd(), this.$verticalDivider.getStart(), 0.0f, C2002Dp.m7995constructorimpl(8), 0.0f, 0.0f, 1.0f, 52, (Object) null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), this.$seed1Name.getBottom(), 0.0f, 0.0f, 6, null);
        ConstrainScope.centerVerticallyTo$default(constrainAs, this.$seed1Name, 0.0f, 2, null);
    }
}
