package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
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
final class BracketMatchOverviewCardKt$TwoRowsDisplay$1$2$1 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope.HorizontalAnchor $horizontalGuideline;
    final /* synthetic */ ConstraintLayoutBaseScope4 $seed2Name;
    final /* synthetic */ ConstraintLayoutBaseScope.VerticalAnchor $verticalSeedIdBarrier;

    BracketMatchOverviewCardKt$TwoRowsDisplay$1$2$1(ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4) {
        this.$horizontalGuideline = horizontalAnchor;
        this.$verticalSeedIdBarrier = verticalAnchor;
        this.$seed2Name = constraintLayoutBaseScope4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), this.$horizontalGuideline, C2002Dp.m7995constructorimpl(4), 0.0f, 4, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), this.$verticalSeedIdBarrier, 0.0f, 0.0f, 6, null);
        ConstrainScope.centerVerticallyTo$default(constrainAs, this.$seed2Name, 0.0f, 2, null);
    }
}
