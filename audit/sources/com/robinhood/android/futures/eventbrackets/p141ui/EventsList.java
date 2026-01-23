package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: EventsList.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.eventbrackets.ui.ComposableSingletons$EventsListKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventsList {
    public static final EventsList INSTANCE = new EventsList();
    private static Function2<Composer, Integer, Unit> lambda$1673541562 = ComposableLambda3.composableLambdaInstance(1673541562, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.ui.ComposableSingletons$EventsListKt$lambda$1673541562$1
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
                ComposerKt.traceEventStart(1673541562, i, -1, "com.robinhood.android.futures.eventbrackets.ui.ComposableSingletons$EventsListKt.lambda$1673541562.<anonymous> (EventsList.kt:97)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1943606138, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8982lambda$1943606138 = ComposableLambda3.composableLambdaInstance(-1943606138, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.ui.ComposableSingletons$EventsListKt$lambda$-1943606138$1
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
                ComposerKt.traceEventStart(-1943606138, i, -1, "com.robinhood.android.futures.eventbrackets.ui.ComposableSingletons$EventsListKt.lambda$-1943606138.<anonymous> (EventsList.kt:116)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1943606138$feature_event_brackets_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14647getLambda$1943606138$feature_event_brackets_externalDebug() {
        return f8982lambda$1943606138;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1673541562$feature_event_brackets_externalDebug() {
        return lambda$1673541562;
    }
}
