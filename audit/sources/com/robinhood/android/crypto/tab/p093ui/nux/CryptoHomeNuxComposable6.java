package com.robinhood.android.crypto.tab.p093ui.nux;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeNuxComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.tab.ui.nux.CryptoHomeNuxComposableKt$CryptoHomeNuxComposable$1$3$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoHomeNuxComposable6 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope.HorizontalAnchor $nuxVariationBarrier;

    CryptoHomeNuxComposable6(ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor) {
        this.$nuxVariationBarrier = horizontalAnchor;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), this.$nuxVariationBarrier, 0.0f, 0.0f, 6, null);
    }
}
