package com.robinhood.android.directdeposit.p101ui.shim;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: DirectDepositShimActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directdeposit.ui.shim.ComposableSingletons$DirectDepositShimActivityKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class DirectDepositShimActivity2 {
    public static final DirectDepositShimActivity2 INSTANCE = new DirectDepositShimActivity2();

    /* renamed from: lambda$-552610019, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8874lambda$552610019 = ComposableLambda3.composableLambdaInstance(-552610019, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.directdeposit.ui.shim.ComposableSingletons$DirectDepositShimActivityKt$lambda$-552610019$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-552610019, i, -1, "com.robinhood.android.directdeposit.ui.shim.ComposableSingletons$DirectDepositShimActivityKt.lambda$-552610019.<anonymous> (DirectDepositShimActivity.kt:48)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-552610019$feature_direct_deposit_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13334getLambda$552610019$feature_direct_deposit_externalDebug() {
        return f8874lambda$552610019;
    }
}
