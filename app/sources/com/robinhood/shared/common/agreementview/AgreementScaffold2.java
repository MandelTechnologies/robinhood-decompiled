package com.robinhood.shared.common.agreementview;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AgreementScaffold.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.common.agreementview.ComposableSingletons$AgreementScaffoldKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class AgreementScaffold2 {
    public static final AgreementScaffold2 INSTANCE = new AgreementScaffold2();
    private static Function2<Composer, Integer, Unit> lambda$1098200051 = ComposableLambda3.composableLambdaInstance(1098200051, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.agreementview.ComposableSingletons$AgreementScaffoldKt$lambda$1098200051$1
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
                ComposerKt.traceEventStart(1098200051, i, -1, "com.robinhood.shared.common.agreementview.ComposableSingletons$AgreementScaffoldKt.lambda$1098200051.<anonymous> (AgreementScaffold.kt:25)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1098200051$lib_agreement_view_externalDebug() {
        return lambda$1098200051;
    }
}
