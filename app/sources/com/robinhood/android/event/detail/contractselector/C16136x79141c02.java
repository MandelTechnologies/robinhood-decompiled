package com.robinhood.android.event.detail.contractselector;

import androidx.constraintlayout.compose.ChainConstrainScope2;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContractSelectorCenterAlignedVariant.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.contractselector.ContractSelectorCenterAlignedVariantKt$ContractSelectorCenterAlignedVariant$1$1$1 */
/* loaded from: classes3.dex */
final class C16136x79141c02 implements Function1<ChainConstrainScope2, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope4 $leftButton;
    final /* synthetic */ ConstraintLayoutBaseScope4 $rightButton;

    C16136x79141c02(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ConstraintLayoutBaseScope4 constraintLayoutBaseScope42) {
        this.$leftButton = constraintLayoutBaseScope4;
        this.$rightButton = constraintLayoutBaseScope42;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ChainConstrainScope2 chainConstrainScope2) {
        invoke2(chainConstrainScope2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ChainConstrainScope2 constrain) {
        Intrinsics.checkNotNullParameter(constrain, "$this$constrain");
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getStart(), this.$leftButton.getEnd(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getEnd(), this.$rightButton.getStart(), 0.0f, 0.0f, 6, null);
    }
}
