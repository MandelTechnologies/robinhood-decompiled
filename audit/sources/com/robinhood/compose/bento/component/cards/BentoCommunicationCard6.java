package com.robinhood.compose.bento.component.cards;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import com.robinhood.compose.theme.style.CommunicationCardStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoCommunicationCard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.cards.BentoCommunicationCardKt$BentoCommunicationCard$1$1$6$1, reason: use source file name */
/* loaded from: classes15.dex */
final class BentoCommunicationCard6 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ CommunicationCardStyle $style;

    BentoCommunicationCard6(CommunicationCardStyle communicationCardStyle) {
        this.$style = communicationCardStyle;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), this.$style.getSpacing().m21765getTextPaddingD9Ej5fM(), 0.0f, 4, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), this.$style.getSpacing().m21765getTextPaddingD9Ej5fM(), 0.0f, 4, null);
    }
}
