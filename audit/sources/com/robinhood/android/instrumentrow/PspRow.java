package com.robinhood.android.instrumentrow;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.instrumentrow.models.BackgroundColor;
import com.robinhood.android.instrumentrow.models.Text;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PspRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.instrumentrow.ComposableSingletons$PspRowKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class PspRow {
    public static final PspRow INSTANCE = new PspRow();

    /* renamed from: lambda$-1556052177, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9036lambda$1556052177 = ComposableLambda3.composableLambdaInstance(-1556052177, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.instrumentrow.ComposableSingletons$PspRowKt$lambda$-1556052177$1
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
                ComposerKt.traceEventStart(-1556052177, i, -1, "com.robinhood.android.instrumentrow.ComposableSingletons$PspRowKt.lambda$-1556052177.<anonymous> (PspRow.kt:161)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            PspRow3.PspRow(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), new PspRowState(new Text("🎁 1 share of AAPL", bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null), new Text("6d 11hr to claim", bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), null), bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), new BackgroundColor(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null), null), null, composer, 6, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1556052177$lib_instrument_row_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15333getLambda$1556052177$lib_instrument_row_externalDebug() {
        return f9036lambda$1556052177;
    }
}
