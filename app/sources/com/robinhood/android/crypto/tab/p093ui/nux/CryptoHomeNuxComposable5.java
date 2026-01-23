package com.robinhood.android.crypto.tab.p093ui.nux;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeNuxComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.tab.ui.nux.CryptoHomeNuxComposableKt$CryptoHomeNuxComposable$1$2$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoHomeNuxComposable5 implements Function1<ConstrainScope, Unit> {
    public static final CryptoHomeNuxComposable5 INSTANCE = new CryptoHomeNuxComposable5();

    CryptoHomeNuxComposable5() {
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
    }
}
