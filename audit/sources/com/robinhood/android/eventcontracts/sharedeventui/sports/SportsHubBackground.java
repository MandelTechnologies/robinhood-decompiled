package com.robinhood.android.eventcontracts.sharedeventui.sports;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: SportsHubBackground.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.sports.ComposableSingletons$SportsHubBackgroundKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class SportsHubBackground {
    public static final SportsHubBackground INSTANCE = new SportsHubBackground();
    private static Function2<Composer, Integer, Unit> lambda$825822520 = ComposableLambda3.composableLambdaInstance(825822520, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.sports.ComposableSingletons$SportsHubBackgroundKt$lambda$825822520$1
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
                ComposerKt.traceEventStart(825822520, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.sports.ComposableSingletons$SportsHubBackgroundKt.lambda$825822520.<anonymous> (SportsHubBackground.kt:147)");
            }
            SportsHubBackground4.SportsHubBackground(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$687653620 = ComposableLambda3.composableLambdaInstance(687653620, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.sports.ComposableSingletons$SportsHubBackgroundKt$lambda$687653620$1
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
                ComposerKt.traceEventStart(687653620, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.sports.ComposableSingletons$SportsHubBackgroundKt.lambda$687653620.<anonymous> (SportsHubBackground.kt:159)");
            }
            SportsHubBackground4.SportsHubBackground(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$687653620$lib_shared_event_ui_externalDebug() {
        return lambda$687653620;
    }

    public final Function2<Composer, Integer, Unit> getLambda$825822520$lib_shared_event_ui_externalDebug() {
        return lambda$825822520;
    }
}
