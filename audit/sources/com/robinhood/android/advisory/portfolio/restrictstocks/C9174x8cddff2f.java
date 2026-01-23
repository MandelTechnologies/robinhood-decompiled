package com.robinhood.android.advisory.portfolio.restrictstocks;

import androidx.compose.material3.SnackbarData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: RestrictStocksScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.ComposableSingletons$RestrictStocksScreenKt$lambda$502192397$1$1$1 */
/* loaded from: classes7.dex */
/* synthetic */ class C9174x8cddff2f extends FunctionReferenceImpl implements Function0<Unit> {
    C9174x8cddff2f(Object obj) {
        super(0, obj, SnackbarData.class, "performAction", "performAction()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((SnackbarData) this.receiver).performAction();
    }
}
