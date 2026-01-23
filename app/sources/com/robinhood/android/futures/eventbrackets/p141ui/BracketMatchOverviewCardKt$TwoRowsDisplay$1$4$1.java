package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
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
final class BracketMatchOverviewCardKt$TwoRowsDisplay$1$4$1 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope.HorizontalAnchor $horizontalGuideline;
    final /* synthetic */ ConstraintLayoutBaseScope.VerticalAnchor $verticalScoresBarrier;
    final /* synthetic */ ConstraintLayoutBaseScope.VerticalAnchor $verticalSeedIdBarrier;

    BracketMatchOverviewCardKt$TwoRowsDisplay$1$4$1(ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor) {
        this.$verticalSeedIdBarrier = verticalAnchor;
        this.$verticalScoresBarrier = verticalAnchor2;
        this.$horizontalGuideline = horizontalAnchor;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        float f = 8;
        ConstrainScope.m8130linkTo8ZKsbrE$default(constrainAs, this.$verticalSeedIdBarrier, this.$verticalScoresBarrier, C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), 0.0f, 0.0f, 0.0f, 48, (Object) null);
        ConstrainScope.m8129linkTo8ZKsbrE$default(constrainAs, this.$horizontalGuideline, constrainAs.getParent().getBottom(), C2002Dp.m7995constructorimpl(4), 0.0f, 0.0f, 0.0f, 0.0f, 120, (Object) null);
        constrainAs.setWidth(Dimension.INSTANCE.getFillToConstraints());
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }
}
