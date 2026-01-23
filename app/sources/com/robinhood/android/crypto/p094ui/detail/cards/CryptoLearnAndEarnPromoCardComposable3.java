package com.robinhood.android.crypto.p094ui.detail.cards;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoLearnAndEarnPromoCardComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoLearnAndEarnPromoCardComposableKt$CryptoLearnAndEarnPromoCardComposable$1$1$2$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoLearnAndEarnPromoCardComposable3 implements Function1<ConstrainScope, Unit> {
    public static final CryptoLearnAndEarnPromoCardComposable3 INSTANCE = new CryptoLearnAndEarnPromoCardComposable3();

    CryptoLearnAndEarnPromoCardComposable3() {
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
    }
}
