package com.robinhood.android.event.history.p131ui.order;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: EventOrderScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.history.ui.order.ComposableSingletons$EventOrderScreenKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventOrderScreen {
    public static final EventOrderScreen INSTANCE = new EventOrderScreen();
    private static Function2<Composer, Integer, Unit> lambda$38967968 = ComposableLambda3.composableLambdaInstance(38967968, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.history.ui.order.ComposableSingletons$EventOrderScreenKt$lambda$38967968$1
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
                ComposerKt.traceEventStart(38967968, i, -1, "com.robinhood.android.event.history.ui.order.ComposableSingletons$EventOrderScreenKt.lambda$38967968.<anonymous> (EventOrderScreen.kt:106)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$38967968$feature_event_history_externalDebug() {
        return lambda$38967968;
    }
}
