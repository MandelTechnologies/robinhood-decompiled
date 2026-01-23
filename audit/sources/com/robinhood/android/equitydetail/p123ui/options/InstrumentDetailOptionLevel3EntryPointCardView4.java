package com.robinhood.android.equitydetail.p123ui.options;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import androidx.constraintlayout.compose.Dimension;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentDetailOptionLevel3EntryPointCardView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardViewKt$InstrumentDetailOptionLevel3EntryPointCardComposable$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class InstrumentDetailOptionLevel3EntryPointCardView4 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope.VerticalAnchor $bodyTextEndBarrier;
    final /* synthetic */ ConstraintLayoutBaseScope4 $cardButton;

    InstrumentDetailOptionLevel3EntryPointCardView4(ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4) {
        this.$bodyTextEndBarrier = verticalAnchor;
        this.$cardButton = constraintLayoutBaseScope4;
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
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), this.$bodyTextEndBarrier, 0.0f, 0.0f, 6, null);
        ConstrainScope.m8129linkTo8ZKsbrE$default(constrainAs, constrainAs.getParent().getTop(), this.$cardButton.getTop(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60, (Object) null);
        constrainAs.setWidth(Dimension.INSTANCE.getFillToConstraints());
    }
}
