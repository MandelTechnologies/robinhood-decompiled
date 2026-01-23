package com.robinhood.android.retirement.match;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MatchOptionsScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.match.ComposableSingletons$MatchOptionsScreenKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class MatchOptionsScreen {
    public static final MatchOptionsScreen INSTANCE = new MatchOptionsScreen();

    /* renamed from: lambda$-1931526036, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9214lambda$1931526036 = ComposableLambda3.composableLambdaInstance(-1931526036, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.match.ComposableSingletons$MatchOptionsScreenKt$lambda$-1931526036$1
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
                ComposerKt.traceEventStart(-1931526036, i, -1, "com.robinhood.android.retirement.match.ComposableSingletons$MatchOptionsScreenKt.lambda$-1931526036.<anonymous> (MatchOptionsScreen.kt:55)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-903294093, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9215lambda$903294093 = ComposableLambda3.composableLambdaInstance(-903294093, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.match.ComposableSingletons$MatchOptionsScreenKt$lambda$-903294093$1
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
                ComposerKt.traceEventStart(-903294093, i, -1, "com.robinhood.android.retirement.match.ComposableSingletons$MatchOptionsScreenKt.lambda$-903294093.<anonymous> (MatchOptionsScreen.kt:103)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1931526036$lib_retirement_contributions_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m18143getLambda$1931526036$lib_retirement_contributions_externalDebug() {
        return f9214lambda$1931526036;
    }

    /* renamed from: getLambda$-903294093$lib_retirement_contributions_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m18144getLambda$903294093$lib_retirement_contributions_externalDebug() {
        return f9215lambda$903294093;
    }
}
