package com.robinhood.android.eventcontracts.sharedeventui;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: LastTradePriceBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.ComposableSingletons$LastTradePriceBarKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class LastTradePriceBar {
    public static final LastTradePriceBar INSTANCE = new LastTradePriceBar();
    private static Function2<Composer, Integer, Unit> lambda$1603672412 = ComposableLambda3.composableLambdaInstance(1603672412, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.ComposableSingletons$LastTradePriceBarKt$lambda$1603672412$1
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
                ComposerKt.traceEventStart(1603672412, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.ComposableSingletons$LastTradePriceBarKt.lambda$1603672412.<anonymous> (LastTradePriceBar.kt:70)");
            }
            Color.Companion companion = Color.INSTANCE;
            LastTradePriceBar5.m14375LastTradePriceBareopBjH0(0.5f, companion.m6721getGreen0d7_KjU(), companion.m6717getBlue0d7_KjU(), null, composer, 438, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1475423409 = ComposableLambda3.composableLambdaInstance(1475423409, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.ComposableSingletons$LastTradePriceBarKt$lambda$1475423409$1
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
                ComposerKt.traceEventStart(1475423409, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.ComposableSingletons$LastTradePriceBarKt.lambda$1475423409.<anonymous> (LastTradePriceBar.kt:82)");
            }
            Color.Companion companion = Color.INSTANCE;
            LastTradePriceBar5.m14375LastTradePriceBareopBjH0(0.0f, companion.m6721getGreen0d7_KjU(), companion.m6717getBlue0d7_KjU(), null, composer, 438, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1095529304 = ComposableLambda3.composableLambdaInstance(1095529304, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.ComposableSingletons$LastTradePriceBarKt$lambda$1095529304$1
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
                ComposerKt.traceEventStart(1095529304, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.ComposableSingletons$LastTradePriceBarKt.lambda$1095529304.<anonymous> (LastTradePriceBar.kt:94)");
            }
            Color.Companion companion = Color.INSTANCE;
            LastTradePriceBar5.m14375LastTradePriceBareopBjH0(1.0f, companion.m6721getGreen0d7_KjU(), companion.m6717getBlue0d7_KjU(), null, composer, 438, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1095529304$lib_shared_event_ui_externalDebug() {
        return lambda$1095529304;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1475423409$lib_shared_event_ui_externalDebug() {
        return lambda$1475423409;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1603672412$lib_shared_event_ui_externalDebug() {
        return lambda$1603672412;
    }
}
