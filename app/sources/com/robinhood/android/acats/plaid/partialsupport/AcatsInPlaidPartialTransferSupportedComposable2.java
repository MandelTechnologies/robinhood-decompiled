package com.robinhood.android.acats.plaid.partialsupport;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsInPlaidPartialTransferSupportedComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acats.plaid.partialsupport.ComposableSingletons$AcatsInPlaidPartialTransferSupportedComposableKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsInPlaidPartialTransferSupportedComposable2 {
    public static final AcatsInPlaidPartialTransferSupportedComposable2 INSTANCE = new AcatsInPlaidPartialTransferSupportedComposable2();

    /* renamed from: lambda$-896090062, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8600lambda$896090062 = ComposableLambda3.composableLambdaInstance(-896090062, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.partialsupport.ComposableSingletons$AcatsInPlaidPartialTransferSupportedComposableKt$lambda$-896090062$1
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
                ComposerKt.traceEventStart(-896090062, i, -1, "com.robinhood.android.acats.plaid.partialsupport.ComposableSingletons$AcatsInPlaidPartialTransferSupportedComposableKt.lambda$-896090062.<anonymous> (AcatsInPlaidPartialTransferSupportedComposable.kt:37)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-896090062$lib_acats_plaid_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10638getLambda$896090062$lib_acats_plaid_externalDebug() {
        return f8600lambda$896090062;
    }
}
