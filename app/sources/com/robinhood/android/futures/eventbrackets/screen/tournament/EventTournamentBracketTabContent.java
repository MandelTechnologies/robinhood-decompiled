package com.robinhood.android.futures.eventbrackets.screen.tournament;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.futures.eventbrackets.p141ui.EmptyLiveGamesStack;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: EventTournamentBracketTabContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.ComposableSingletons$EventTournamentBracketTabContentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventTournamentBracketTabContent {
    public static final EventTournamentBracketTabContent INSTANCE = new EventTournamentBracketTabContent();

    /* renamed from: lambda$-1930348449, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8979lambda$1930348449 = ComposableLambda3.composableLambdaInstance(-1930348449, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.ComposableSingletons$EventTournamentBracketTabContentKt$lambda$-1930348449$1
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
                ComposerKt.traceEventStart(-1930348449, i, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.ComposableSingletons$EventTournamentBracketTabContentKt.lambda$-1930348449.<anonymous> (EventTournamentBracketTabContent.kt:93)");
            }
            EmptyLiveGamesStack.EmptyLiveGamesStack(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1930348449$feature_event_brackets_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14597getLambda$1930348449$feature_event_brackets_externalDebug() {
        return f8979lambda$1930348449;
    }
}
