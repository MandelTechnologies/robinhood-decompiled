package com.robinhood.shared.crypto.history.section;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.history.p082ui.HistoryRowsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoHistorySection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.history.section.ComposableSingletons$CryptoHistorySectionKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoHistorySection {
    public static final CryptoHistorySection INSTANCE = new CryptoHistorySection();
    private static Function2<Composer, Integer, Unit> lambda$1382321664 = ComposableLambda3.composableLambdaInstance(1382321664, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.history.section.ComposableSingletons$CryptoHistorySectionKt$lambda$1382321664$1
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
                ComposerKt.traceEventStart(1382321664, i, -1, "com.robinhood.shared.crypto.history.section.ComposableSingletons$CryptoHistorySectionKt.lambda$1382321664.<anonymous> (CryptoHistorySection.kt:39)");
            }
            HistoryRowsKt.DefaultHistoryHeader(null, StringResources_androidKt.stringResource(C37708R.string.crypto_detail_your_history_label, composer, 0), composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1382321664$lib_history_section_externalDebug() {
        return lambda$1382321664;
    }
}
