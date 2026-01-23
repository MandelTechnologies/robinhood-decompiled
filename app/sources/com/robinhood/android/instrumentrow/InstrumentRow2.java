package com.robinhood.android.instrumentrow;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: InstrumentRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.instrumentrow.ComposableSingletons$InstrumentRowKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InstrumentRow2 {
    public static final InstrumentRow2 INSTANCE = new InstrumentRow2();

    /* renamed from: lambda$-872895968, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9035lambda$872895968 = ComposableLambda3.composableLambdaInstance(-872895968, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.instrumentrow.ComposableSingletons$InstrumentRowKt$lambda$-872895968$1
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
                ComposerKt.traceEventStart(-872895968, i, -1, "com.robinhood.android.instrumentrow.ComposableSingletons$InstrumentRowKt.lambda$-872895968.<anonymous> (InstrumentRow.kt:509)");
            }
            InstrumentRow5.LoadingInstrumentRow(null, false, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1286873362 = ComposableLambda3.composableLambdaInstance(1286873362, false, InstrumentRow4.INSTANCE);

    /* renamed from: getLambda$-872895968$lib_instrument_row_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15331getLambda$872895968$lib_instrument_row_externalDebug() {
        return f9035lambda$872895968;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1286873362$lib_instrument_row_externalDebug() {
        return lambda$1286873362;
    }
}
