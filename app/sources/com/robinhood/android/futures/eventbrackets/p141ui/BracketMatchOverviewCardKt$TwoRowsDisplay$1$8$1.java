package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.Dimension;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BracketMatchOverviewCard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class BracketMatchOverviewCardKt$TwoRowsDisplay$1$8$1 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope4 $seed1Name;
    final /* synthetic */ ConstraintLayoutBaseScope.VerticalAnchor $verticalPercentGuideline;

    BracketMatchOverviewCardKt$TwoRowsDisplay$1$8$1(ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4) {
        this.$verticalPercentGuideline = verticalAnchor;
        this.$seed1Name = constraintLayoutBaseScope4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstrainScope.m8130linkTo8ZKsbrE$default(constrainAs, this.$verticalPercentGuideline, constrainAs.getParent().getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 60, (Object) null);
        ConstrainScope.centerVerticallyTo$default(constrainAs, this.$seed1Name, 0.0f, 2, null);
        constrainAs.setWidth(ConstraintLayoutKt.getAtLeastWrapContent(Dimension.INSTANCE.m8159preferredValue0680j_4(C2002Dp.m7995constructorimpl(40))));
    }
}
