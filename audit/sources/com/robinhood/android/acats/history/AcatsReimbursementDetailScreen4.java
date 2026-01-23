package com.robinhood.android.acats.history;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsReimbursementDetailScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acats.history.ComposableSingletons$AcatsReimbursementDetailScreenKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsReimbursementDetailScreen4 {
    public static final AcatsReimbursementDetailScreen4 INSTANCE = new AcatsReimbursementDetailScreen4();

    /* renamed from: lambda$-1182543397, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8598lambda$1182543397 = ComposableLambda3.composableLambdaInstance(-1182543397, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.history.ComposableSingletons$AcatsReimbursementDetailScreenKt$lambda$-1182543397$1
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
                ComposerKt.traceEventStart(-1182543397, i, -1, "com.robinhood.android.acats.history.ComposableSingletons$AcatsReimbursementDetailScreenKt.lambda$-1182543397.<anonymous> (AcatsReimbursementDetailScreen.kt:46)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1182543397$feature_acats_history_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10629getLambda$1182543397$feature_acats_history_externalDebug() {
        return f8598lambda$1182543397;
    }
}
