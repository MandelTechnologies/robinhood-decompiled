package com.robinhood.android.eventcontracts.hub.p134v2.cards;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LiveEventCard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
final class LiveEventCardKt$LiveEventCard$4$1$10$1 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope.HorizontalAnchor $contractInfoHorizontalBarrier;
    final /* synthetic */ float $defaultBentoSpacing;
    final /* synthetic */ ConstraintLayoutBaseScope4 $progressBar;
    final /* synthetic */ LiveEventCardViewState $state;

    LiveEventCardKt$LiveEventCard$4$1$10$1(ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, LiveEventCardViewState liveEventCardViewState, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, float f) {
        this.$contractInfoHorizontalBarrier = horizontalAnchor;
        this.$state = liveEventCardViewState;
        this.$progressBar = constraintLayoutBaseScope4;
        this.$defaultBentoSpacing = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), this.$contractInfoHorizontalBarrier, this.$state.m14323getPillTopPaddingD9Ej5fM(), 0.0f, 4, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), this.$progressBar.getTop(), this.$defaultBentoSpacing, 0.0f, 4, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        constrainAs.setVerticalBias(1.0f);
    }
}
