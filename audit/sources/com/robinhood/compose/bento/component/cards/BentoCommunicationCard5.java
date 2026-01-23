package com.robinhood.compose.bento.component.cards;

import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import androidx.constraintlayout.compose.Dimension;
import com.robinhood.compose.theme.style.CommunicationCardStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoCommunicationCard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.cards.BentoCommunicationCardKt$BentoCommunicationCard$1$1$5$1, reason: use source file name */
/* loaded from: classes15.dex */
final class BentoCommunicationCard5 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope.VerticalAnchor $bodyTextEndBarrier;
    final /* synthetic */ ConstraintLayoutBaseScope4 $cta;
    final /* synthetic */ Painter $painter;
    final /* synthetic */ CommunicationCardStyle $style;

    BentoCommunicationCard5(CommunicationCardStyle communicationCardStyle, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, Painter painter) {
        this.$style = communicationCardStyle;
        this.$cta = constraintLayoutBaseScope4;
        this.$bodyTextEndBarrier = verticalAnchor;
        this.$painter = painter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        float fM21764getTextEndPaddingWithoutIllustrationD9Ej5fM;
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), this.$style.getSpacing().m21765getTextPaddingD9Ej5fM(), 0.0f, 4, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), this.$style.getSpacing().m21765getTextPaddingD9Ej5fM(), 0.0f, 4, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), this.$cta.getTop(), this.$style.getSpacing().m21765getTextPaddingD9Ej5fM(), 0.0f, 4, null);
        ConstraintScopeCommon6 end = constrainAs.getEnd();
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor = this.$bodyTextEndBarrier;
        if (this.$painter != null) {
            fM21764getTextEndPaddingWithoutIllustrationD9Ej5fM = this.$style.getSpacing().m21765getTextPaddingD9Ej5fM();
        } else {
            fM21764getTextEndPaddingWithoutIllustrationD9Ej5fM = this.$style.getSpacing().m21764getTextEndPaddingWithoutIllustrationD9Ej5fM();
        }
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(end, verticalAnchor, fM21764getTextEndPaddingWithoutIllustrationD9Ej5fM, 0.0f, 4, null);
        Dimension.Companion companion = Dimension.INSTANCE;
        constrainAs.setHeight(companion.getFillToConstraints());
        constrainAs.setWidth(companion.getFillToConstraints());
    }
}
