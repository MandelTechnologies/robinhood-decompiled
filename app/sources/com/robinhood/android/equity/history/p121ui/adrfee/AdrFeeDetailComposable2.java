package com.robinhood.android.equity.history.p121ui.adrfee;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AdrFeeDetailComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equity.history.ui.adrfee.ComposableSingletons$AdrFeeDetailComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class AdrFeeDetailComposable2 {
    public static final AdrFeeDetailComposable2 INSTANCE = new AdrFeeDetailComposable2();

    /* renamed from: lambda$-1091670171, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8904lambda$1091670171 = ComposableLambda3.composableLambdaInstance(-1091670171, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equity.history.ui.adrfee.ComposableSingletons$AdrFeeDetailComposableKt$lambda$-1091670171$1
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
                ComposerKt.traceEventStart(-1091670171, i, -1, "com.robinhood.android.equity.history.ui.adrfee.ComposableSingletons$AdrFeeDetailComposableKt.lambda$-1091670171.<anonymous> (AdrFeeDetailComposable.kt:306)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1091670171$feature_equity_history_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13715getLambda$1091670171$feature_equity_history_externalDebug() {
        return f8904lambda$1091670171;
    }
}
