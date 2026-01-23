package com.robinhood.android.event.detail.contractselector;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContractSelectorCenterAlignedVariant.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.contractselector.ContractSelectorCenterAlignedVariantKt$ContractSelectorCenterAlignedVariant$1$7$1 */
/* loaded from: classes3.dex */
final class C16142x79143288 implements Function1<ConstrainScope, Unit> {
    public static final C16142x79143288 INSTANCE = new C16142x79143288();

    C16142x79143288() {
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        ConstrainScope.centerVerticallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
    }
}
