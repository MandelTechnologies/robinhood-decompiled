package com.robinhood.android.support.supporthub;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import androidx.constraintlayout.compose.Dimension;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportHubComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
final class SupportHubComposableKt$RecommendationActions$2$1$1$1$1 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope4 $cta;
    final /* synthetic */ ConstraintLayoutBaseScope4 $image;

    SupportHubComposableKt$RecommendationActions$2$1$1$1$1(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ConstraintLayoutBaseScope4 constraintLayoutBaseScope42) {
        this.$image = constraintLayoutBaseScope4;
        this.$cta = constraintLayoutBaseScope42;
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
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), this.$image.getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), this.$cta.getTop(), 0.0f, 0.0f, 6, null);
        Dimension.Companion companion = Dimension.INSTANCE;
        constrainAs.setWidth(companion.getFillToConstraints());
        constrainAs.setHeight(companion.getWrapContent());
    }
}
