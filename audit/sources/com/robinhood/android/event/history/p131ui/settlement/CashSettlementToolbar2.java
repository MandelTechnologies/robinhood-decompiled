package com.robinhood.android.event.history.p131ui.settlement;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CashSettlementToolbar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.history.ui.settlement.ComposableSingletons$CashSettlementToolbarKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class CashSettlementToolbar2 {
    public static final CashSettlementToolbar2 INSTANCE = new CashSettlementToolbar2();

    /* renamed from: lambda$-50610185, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8952lambda$50610185 = ComposableLambda3.composableLambdaInstance(-50610185, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.history.ui.settlement.ComposableSingletons$CashSettlementToolbarKt$lambda$-50610185$1
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
                ComposerKt.traceEventStart(-50610185, i, -1, "com.robinhood.android.event.history.ui.settlement.ComposableSingletons$CashSettlementToolbarKt.lambda$-50610185.<anonymous> (CashSettlementToolbar.kt:20)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-50610185$feature_event_history_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14273getLambda$50610185$feature_event_history_externalDebug() {
        return f8952lambda$50610185;
    }
}
