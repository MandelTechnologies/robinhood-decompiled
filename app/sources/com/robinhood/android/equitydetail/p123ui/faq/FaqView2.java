package com.robinhood.android.equitydetail.p123ui.faq;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: FaqView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.faq.ComposableSingletons$FaqViewKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FaqView2 {
    public static final FaqView2 INSTANCE = new FaqView2();

    /* renamed from: lambda$-1414473887, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8910lambda$1414473887 = ComposableLambda3.composableLambdaInstance(-1414473887, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.faq.ComposableSingletons$FaqViewKt$lambda$-1414473887$1
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
                ComposerKt.traceEventStart(-1414473887, i, -1, "com.robinhood.android.equitydetail.ui.faq.ComposableSingletons$FaqViewKt.lambda$-1414473887.<anonymous> (FaqView.kt:58)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1414473887$feature_equity_detail_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13877getLambda$1414473887$feature_equity_detail_externalDebug() {
        return f8910lambda$1414473887;
    }
}
