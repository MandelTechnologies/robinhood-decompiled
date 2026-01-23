package com.robinhood.android.eventcontracts.hub.p134v2.p135ui;

import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.eventcontracts.hub.p134v2.p135ui.CardPills7;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CardPills.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.ui.ComposableSingletons$CardPillsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class CardPills3 {
    public static final CardPills3 INSTANCE = new CardPills3();
    private static Function2<Composer, Integer, Unit> lambda$2018439561 = ComposableLambda3.composableLambdaInstance(2018439561, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.ui.ComposableSingletons$CardPillsKt$lambda$2018439561$1
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
                ComposerKt.traceEventStart(2018439561, i, -1, "com.robinhood.android.eventcontracts.hub.v2.ui.ComposableSingletons$CardPillsKt.lambda$2018439561.<anonymous> (CardPills.kt:156)");
            }
            CardPills.QuoteWithPositionPill(new CardPills7.QuoteWithPositionPillState("90¢", StringResource.INSTANCE.invoke("100"), new DayNightColor(Color2.Color(4285537050L), Color2.Color(4285537050L), null)), null, false, null, composer, StringResource.$stable, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1226802683 = ComposableLambda3.composableLambdaInstance(1226802683, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.ui.ComposableSingletons$CardPillsKt$lambda$1226802683$1
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
                ComposerKt.traceEventStart(1226802683, i, -1, "com.robinhood.android.eventcontracts.hub.v2.ui.ComposableSingletons$CardPillsKt.lambda$1226802683.<anonymous> (CardPills.kt:173)");
            }
            CardPills.QuoteWithPositionPill(new CardPills7.QuoteWithPositionPillState("90¢", StringResource.INSTANCE.invoke("1 No"), new DayNightColor(Color2.Color(4285537050L), Color2.Color(4285537050L), null)), null, false, null, composer, StringResource.$stable, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1016344341, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8959lambda$1016344341 = ComposableLambda3.composableLambdaInstance(-1016344341, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.ui.ComposableSingletons$CardPillsKt$lambda$-1016344341$1
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
                ComposerKt.traceEventStart(-1016344341, i, -1, "com.robinhood.android.eventcontracts.hub.v2.ui.ComposableSingletons$CardPillsKt.lambda$-1016344341.<anonymous> (CardPills.kt:190)");
            }
            CardPills.QuoteWithNoPositionPill("No 90¢", null, false, null, composer, 6, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1016344341$feature_hub_v2_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14353getLambda$1016344341$feature_hub_v2_externalDebug() {
        return f8959lambda$1016344341;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1226802683$feature_hub_v2_externalDebug() {
        return lambda$1226802683;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2018439561$feature_hub_v2_externalDebug() {
        return lambda$2018439561;
    }
}
