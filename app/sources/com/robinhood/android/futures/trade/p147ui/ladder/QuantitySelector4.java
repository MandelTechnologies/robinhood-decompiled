package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.constraintlayout.compose.ConstrainScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuantitySelector.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.trade.ui.ladder.QuantitySelectorKt$QuantitySelector$2$2$1, reason: use source file name */
/* loaded from: classes10.dex */
final class QuantitySelector4 implements Function1<ConstrainScope, Unit> {
    public static final QuantitySelector4 INSTANCE = new QuantitySelector4();

    QuantitySelector4() {
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
    }
}
