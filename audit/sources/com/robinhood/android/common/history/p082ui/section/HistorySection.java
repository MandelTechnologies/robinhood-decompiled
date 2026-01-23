package com.robinhood.android.common.history.p082ui.section;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.history.p082ui.HistoryRowsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: HistorySection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.history.ui.section.ComposableSingletons$HistorySectionKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class HistorySection {
    public static final HistorySection INSTANCE = new HistorySection();

    /* renamed from: lambda$-2136837853, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8730lambda$2136837853 = ComposableLambda3.composableLambdaInstance(-2136837853, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.section.ComposableSingletons$HistorySectionKt$lambda$-2136837853$1
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
                ComposerKt.traceEventStart(-2136837853, i, -1, "com.robinhood.android.common.history.ui.section.ComposableSingletons$HistorySectionKt.lambda$-2136837853.<anonymous> (HistorySection.kt:65)");
            }
            HistoryRowsKt.DefaultHistoryHeader(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1960086187, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8729lambda$1960086187 = ComposableLambda3.composableLambdaInstance(-1960086187, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.section.ComposableSingletons$HistorySectionKt$lambda$-1960086187$1
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
                ComposerKt.traceEventStart(-1960086187, i, -1, "com.robinhood.android.common.history.ui.section.ComposableSingletons$HistorySectionKt.lambda$-1960086187.<anonymous> (HistorySection.kt:66)");
            }
            HistoryRowsKt.DefaultHistoryFooter(null, null, null, composer, 0, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1960086187$lib_history_row_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12247getLambda$1960086187$lib_history_row_externalDebug() {
        return f8729lambda$1960086187;
    }

    /* renamed from: getLambda$-2136837853$lib_history_row_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12248getLambda$2136837853$lib_history_row_externalDebug() {
        return f8730lambda$2136837853;
    }
}
