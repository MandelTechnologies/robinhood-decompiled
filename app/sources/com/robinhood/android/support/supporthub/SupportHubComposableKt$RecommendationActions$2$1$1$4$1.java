package com.robinhood.android.support.supporthub;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import androidx.constraintlayout.compose.Dimension;
import com.robinhood.models.p355ui.supporthub.RecommendationCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SupportHubComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
final class SupportHubComposableKt$RecommendationActions$2$1$1$4$1 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ RecommendationCard $action;
    final /* synthetic */ ConstraintLayoutBaseScope4 $content;

    SupportHubComposableKt$RecommendationActions$2$1$1$4$1(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, RecommendationCard recommendationCard) {
        this.$content = constraintLayoutBaseScope4;
        this.$action = recommendationCard;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Dimension dimensionPercent;
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), this.$content.getEnd(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        if (this.$action.getImgUrl() == null || (dimensionPercent = Dimension.INSTANCE.percent(0.3f)) == null) {
            dimensionPercent = Dimension.INSTANCE.percent(0.0f);
        }
        constrainAs.setWidth(dimensionPercent);
        constrainAs.setHeight(Dimension.INSTANCE.getFillToConstraints());
    }
}
