package com.robinhood.shared.tradeladder.p398ui.ladder;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.Close2;
import androidx.compose.material3.IconKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.compose.C11917R;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar.TitleContent;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar.TitleContentState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: GenericLadderTopBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$GenericLadderTopBarKt {
    public static final ComposableSingletons$GenericLadderTopBarKt INSTANCE = new ComposableSingletons$GenericLadderTopBarKt();
    private static Function2<Composer, Integer, Unit> lambda$13346498 = ComposableLambda3.composableLambdaInstance(13346498, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.ComposableSingletons$GenericLadderTopBarKt$lambda$13346498$1
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
                ComposerKt.traceEventStart(13346498, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.ComposableSingletons$GenericLadderTopBarKt.lambda$13346498.<anonymous> (GenericLadderTopBar.kt:90)");
            }
            IconKt.m5872Iconww6aTOc(Close2.getClose(Icons.Filled.INSTANCE), StringResources_androidKt.stringResource(C11917R.string.app_bar_navigate_back, composer, 0), (Modifier) null, ((Styles) composer.consume(Styles2.getLocalStyles())).getAppBar(composer, 0).getColors().m21685getForegroundColor0d7_KjU(), composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-319904795, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9509lambda$319904795 = ComposableLambda3.composableLambdaInstance(-319904795, false, ComposableSingletons$GenericLadderTopBarKt$lambda$319904795$1.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$687017894 = ComposableLambda3.composableLambdaInstance(687017894, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.ComposableSingletons$GenericLadderTopBarKt$lambda$687017894$1
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
                ComposerKt.traceEventStart(687017894, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.ComposableSingletons$GenericLadderTopBarKt.lambda$687017894.<anonymous> (GenericLadderTopBar.kt:100)");
            }
            StringResource.Companion companion = StringResource.INSTANCE;
            TitleContent.TitleContent(new TitleContentState(companion.invoke("Mock Title"), false, companion.invoke("+$500"), TitleContentState.DeltaDirection.POSITIVE, false), null, composer, StringResource.$stable, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1693940583 = ComposableLambda3.composableLambdaInstance(1693940583, false, ComposableSingletons$GenericLadderTopBarKt$lambda$1693940583$1.INSTANCE);

    /* renamed from: lambda$-587181335, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9510lambda$587181335 = ComposableLambda3.composableLambdaInstance(-587181335, false, ComposableSingletons$GenericLadderTopBarKt$lambda$587181335$1.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$962381297 = ComposableLambda3.composableLambdaInstance(962381297, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.ComposableSingletons$GenericLadderTopBarKt$lambda$962381297$1
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
                ComposerKt.traceEventStart(962381297, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.ComposableSingletons$GenericLadderTopBarKt.lambda$962381297.<anonymous> (GenericLadderTopBar.kt:81)");
            }
            ComposableSingletons$GenericLadderTopBarKt composableSingletons$GenericLadderTopBarKt = ComposableSingletons$GenericLadderTopBarKt.INSTANCE;
            GenericLadderTopBarKt.GenericLadderTopBar(composableSingletons$GenericLadderTopBarKt.m26067getLambda$319904795$lib_trade_ladder_externalDebug(), composableSingletons$GenericLadderTopBarKt.getLambda$687017894$lib_trade_ladder_externalDebug(), composableSingletons$GenericLadderTopBarKt.getLambda$1693940583$lib_trade_ladder_externalDebug(), null, composableSingletons$GenericLadderTopBarKt.m26068getLambda$587181335$lib_trade_ladder_externalDebug(), composer, 25014, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-319904795$lib_trade_ladder_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m26067getLambda$319904795$lib_trade_ladder_externalDebug() {
        return f9509lambda$319904795;
    }

    /* renamed from: getLambda$-587181335$lib_trade_ladder_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m26068getLambda$587181335$lib_trade_ladder_externalDebug() {
        return f9510lambda$587181335;
    }

    public final Function2<Composer, Integer, Unit> getLambda$13346498$lib_trade_ladder_externalDebug() {
        return lambda$13346498;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1693940583$lib_trade_ladder_externalDebug() {
        return lambda$1693940583;
    }

    public final Function2<Composer, Integer, Unit> getLambda$687017894$lib_trade_ladder_externalDebug() {
        return lambda$687017894;
    }

    public final Function2<Composer, Integer, Unit> getLambda$962381297$lib_trade_ladder_externalDebug() {
        return lambda$962381297;
    }
}
