package com.robinhood.android.transfers.p271ui.composecomponents;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: OutgoingWireMemoEntryScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.composecomponents.ComposableSingletons$OutgoingWireMemoEntryScreenKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class OutgoingWireMemoEntryScreen {
    public static final OutgoingWireMemoEntryScreen INSTANCE = new OutgoingWireMemoEntryScreen();

    /* renamed from: lambda$-298897063, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9287lambda$298897063 = ComposableLambda3.composableLambdaInstance(-298897063, false, OutgoingWireMemoEntryScreen2.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$202424846 = ComposableLambda3.composableLambdaInstance(202424846, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.composecomponents.ComposableSingletons$OutgoingWireMemoEntryScreenKt$lambda$202424846$1
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
                ComposerKt.traceEventStart(202424846, i, -1, "com.robinhood.android.transfers.ui.composecomponents.ComposableSingletons$OutgoingWireMemoEntryScreenKt.lambda$202424846.<anonymous> (OutgoingWireMemoEntryScreen.kt:25)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(OutgoingWireMemoEntryScreen.INSTANCE.m19746getLambda$298897063$feature_transfers_externalRelease(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-298897063$feature_transfers_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m19746getLambda$298897063$feature_transfers_externalRelease() {
        return f9287lambda$298897063;
    }

    public final Function2<Composer, Integer, Unit> getLambda$202424846$feature_transfers_externalRelease() {
        return lambda$202424846;
    }
}
