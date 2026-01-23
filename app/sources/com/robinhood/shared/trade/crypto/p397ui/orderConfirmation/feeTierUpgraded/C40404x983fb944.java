package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierUpgraded;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoFeeTierUpgradedComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$3$1$5$1$1$1 */
/* loaded from: classes12.dex */
final class C40404x983fb944 implements Function1<ConstrainScope, Unit> {
    public static final C40404x983fb944 INSTANCE = new C40404x983fb944();

    C40404x983fb944() {
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstrainScope.centerVerticallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
    }
}
