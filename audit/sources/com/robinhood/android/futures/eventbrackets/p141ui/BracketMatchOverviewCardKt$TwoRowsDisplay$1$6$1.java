package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope9;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BracketMatchOverviewCard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class BracketMatchOverviewCardKt$TwoRowsDisplay$1$6$1 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ boolean $hasScores;
    final /* synthetic */ ConstraintLayoutBaseScope4 $seed2Name;
    final /* synthetic */ ConstraintLayoutBaseScope4 $verticalDivider;

    BracketMatchOverviewCardKt$TwoRowsDisplay$1$6$1(boolean z, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ConstraintLayoutBaseScope4 constraintLayoutBaseScope42) {
        this.$hasScores = z;
        this.$seed2Name = constraintLayoutBaseScope4;
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
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), this.$seed2Name.getTop(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), this.$seed2Name.getBottom(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), this.$verticalDivider.getStart(), C2002Dp.m7995constructorimpl(8), 0.0f, 4, null);
        ConstrainScope.centerVerticallyTo$default(constrainAs, this.$seed2Name, 0.0f, 2, null);
    }
}
