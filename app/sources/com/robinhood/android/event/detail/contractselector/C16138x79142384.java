package com.robinhood.android.event.detail.contractselector;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import androidx.constraintlayout.compose.Dimension;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContractSelectorCenterAlignedVariant.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.contractselector.ContractSelectorCenterAlignedVariantKt$ContractSelectorCenterAlignedVariant$1$3$1 */
/* loaded from: classes3.dex */
final class C16138x79142384 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope4 $leftButton;
    final /* synthetic */ ConstraintLayoutBaseScope4 $openInterest;
    final /* synthetic */ ConstraintLayoutBaseScope4 $rightButton;

    C16138x79142384(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ConstraintLayoutBaseScope4 constraintLayoutBaseScope42, ConstraintLayoutBaseScope4 constraintLayoutBaseScope43) {
        this.$openInterest = constraintLayoutBaseScope4;
        this.$leftButton = constraintLayoutBaseScope42;
        this.$rightButton = constraintLayoutBaseScope43;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), this.$openInterest.getTop(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), this.$leftButton.getEnd(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), this.$rightButton.getStart(), 0.0f, 0.0f, 6, null);
        constrainAs.setWidth(Dimension.INSTANCE.getPreferredWrapContent());
    }
}
