package com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar;

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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: NavigationContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ComposableSingletons$NavigationContentKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class NavigationContent {
    public static final NavigationContent INSTANCE = new NavigationContent();
    private static Function2<Composer, Integer, Unit> lambda$529187435 = ComposableLambda3.composableLambdaInstance(529187435, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ComposableSingletons$NavigationContentKt$lambda$529187435$1
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
                ComposerKt.traceEventStart(529187435, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ComposableSingletons$NavigationContentKt.lambda$529187435.<anonymous> (NavigationContent.kt:36)");
            }
            IconKt.m5872Iconww6aTOc(Close2.getClose(Icons.Filled.INSTANCE), StringResources_androidKt.stringResource(C11917R.string.app_bar_navigate_back, composer, 0), (Modifier) null, ((Styles) composer.consume(Styles2.getLocalStyles())).getAppBar(composer, 0).getColors().m21685getForegroundColor0d7_KjU(), composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$529187435$lib_trade_ladder_externalDebug() {
        return lambda$529187435;
    }
}
