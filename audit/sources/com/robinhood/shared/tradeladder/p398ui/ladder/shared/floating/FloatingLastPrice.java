package com.robinhood.shared.tradeladder.p398ui.ladder.shared.floating;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: FloatingLastPrice.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.floating.ComposableSingletons$FloatingLastPriceKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class FloatingLastPrice {
    public static final FloatingLastPrice INSTANCE = new FloatingLastPrice();

    /* renamed from: lambda$-933083315, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9517lambda$933083315 = ComposableLambda3.composableLambdaInstance(-933083315, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.floating.ComposableSingletons$FloatingLastPriceKt$lambda$-933083315$1
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
                ComposerKt.traceEventStart(-933083315, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.floating.ComposableSingletons$FloatingLastPriceKt.lambda$-933083315.<anonymous> (FloatingLastPrice.kt:50)");
            }
            FloatingLastPrice4.FloatingLastPrice(StringResource.INSTANCE.invoke("Last Price: $123.45"), true, Modifier.INSTANCE, composer, StringResource.$stable | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1047582755 = ComposableLambda3.composableLambdaInstance(1047582755, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.floating.ComposableSingletons$FloatingLastPriceKt$lambda$1047582755$1
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
                ComposerKt.traceEventStart(1047582755, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.floating.ComposableSingletons$FloatingLastPriceKt.lambda$1047582755.<anonymous> (FloatingLastPrice.kt:62)");
            }
            FloatingLastPrice4.FloatingLastPrice(StringResource.INSTANCE.invoke("Last Price: $123.45"), false, Modifier.INSTANCE, composer, StringResource.$stable | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-933083315$lib_trade_ladder_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m26129getLambda$933083315$lib_trade_ladder_externalDebug() {
        return f9517lambda$933083315;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1047582755$lib_trade_ladder_externalDebug() {
        return lambda$1047582755;
    }
}
