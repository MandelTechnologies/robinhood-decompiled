package com.robinhood.android.futures.eventbrackets.screen.tournament;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoadingScaffold.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.ComposableSingletons$LoadingScaffoldKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class LoadingScaffold {
    public static final LoadingScaffold INSTANCE = new LoadingScaffold();
    private static Function2<Composer, Integer, Unit> lambda$204720086 = ComposableLambda3.composableLambdaInstance(204720086, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.ComposableSingletons$LoadingScaffoldKt$lambda$204720086$1
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
                ComposerKt.traceEventStart(204720086, i, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.ComposableSingletons$LoadingScaffoldKt.lambda$204720086.<anonymous> (LoadingScaffold.kt:22)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1728954828, reason: not valid java name */
    private static Function3<PaddingValues, Composer, Integer, Unit> f8980lambda$1728954828 = ComposableLambda3.composableLambdaInstance(-1728954828, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.ComposableSingletons$LoadingScaffoldKt$lambda$-1728954828$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i |= composer.changed(paddingValues) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1728954828, i, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.ComposableSingletons$LoadingScaffoldKt.lambda$-1728954828.<anonymous> (LoadingScaffold.kt:29)");
            }
            LoadingScreenComposablesKt.GenericBoxesLoadingScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1728954828$feature_event_brackets_externalDebug, reason: not valid java name */
    public final Function3<PaddingValues, Composer, Integer, Unit> m14598getLambda$1728954828$feature_event_brackets_externalDebug() {
        return f8980lambda$1728954828;
    }

    public final Function2<Composer, Integer, Unit> getLambda$204720086$feature_event_brackets_externalDebug() {
        return lambda$204720086;
    }
}
