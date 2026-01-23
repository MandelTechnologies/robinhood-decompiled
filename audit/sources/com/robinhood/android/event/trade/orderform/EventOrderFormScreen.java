package com.robinhood.android.event.trade.orderform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: EventOrderFormScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.trade.orderform.ComposableSingletons$EventOrderFormScreenKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventOrderFormScreen {
    public static final EventOrderFormScreen INSTANCE = new EventOrderFormScreen();
    private static Function2<Composer, Integer, Unit> lambda$1254669449 = ComposableLambda3.composableLambdaInstance(1254669449, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.ComposableSingletons$EventOrderFormScreenKt$lambda$1254669449$1
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
                ComposerKt.traceEventStart(1254669449, i, -1, "com.robinhood.android.event.trade.orderform.ComposableSingletons$EventOrderFormScreenKt.lambda$1254669449.<anonymous> (EventOrderFormScreen.kt:180)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1254669449$feature_event_trade_externalDebug() {
        return lambda$1254669449;
    }
}
