package com.robinhood.android.crypto.tab.view;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintScopeCommon4;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoNewsArticleComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.tab.view.CryptoNewsArticleComposableKt$CryptoNewsArticleComposable$1$2$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoNewsArticleComposable3 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope4 $sourceTextRef;

    CryptoNewsArticleComposable3(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4) {
        this.$sourceTextRef = constraintLayoutBaseScope4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), this.$sourceTextRef.getEnd(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon4.m8119linkToVpY3zN4$default(constrainAs.getBaseline(), this.$sourceTextRef.getBaseline(), 0.0f, 0.0f, 6, null);
    }
}
