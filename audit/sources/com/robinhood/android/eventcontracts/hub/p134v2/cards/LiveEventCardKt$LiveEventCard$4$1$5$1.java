package com.robinhood.android.eventcontracts.hub.p134v2.cards;

import androidx.constraintlayout.compose.ConstrainScope;
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
final class LiveEventCardKt$LiveEventCard$4$1$5$1 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope4 $hyphen;
    final /* synthetic */ ConstraintLayoutBaseScope4 $leftContractInfo;
    final /* synthetic */ float $smallBentoSpacing;

    LiveEventCardKt$LiveEventCard$4$1$5$1(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ConstraintLayoutBaseScope4 constraintLayoutBaseScope42, float f) {
        this.$leftContractInfo = constraintLayoutBaseScope4;
        this.$hyphen = constraintLayoutBaseScope42;
        this.$smallBentoSpacing = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), this.$leftContractInfo.getTop(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), this.$leftContractInfo.getBottom(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), this.$hyphen.getStart(), this.$smallBentoSpacing, 0.0f, 4, null);
    }
}
