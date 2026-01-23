package com.robinhood.shared.tradeladder.p398ui.ladder;

import androidx.compose.foundation.Background3;
import androidx.compose.material3.IconButton5;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.component.BentoAppBarDefaults;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GenericLadderTopBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.ComposableSingletons$GenericLadderTopBarKt$lambda$-319904795$1, reason: invalid class name */
/* loaded from: classes12.dex */
final class ComposableSingletons$GenericLadderTopBarKt$lambda$319904795$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$GenericLadderTopBarKt$lambda$319904795$1 INSTANCE = new ComposableSingletons$GenericLadderTopBarKt$lambda$319904795$1();

    ComposableSingletons$GenericLadderTopBarKt$lambda$319904795$1() {
    }

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
            ComposerKt.traceEventStart(-319904795, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.ComposableSingletons$GenericLadderTopBarKt.lambda$-319904795.<anonymous> (GenericLadderTopBar.kt:83)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.ComposableSingletons$GenericLadderTopBarKt$lambda$-319904795$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        IconButton5.IconButton((Function0) objRememberedValue, LocalShowPlaceholder.withBentoPlaceholder$default(TestTag3.testTag(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, Color.INSTANCE.m6725getTransparent0d7_KjU(), null, 2, null), BentoAppBarDefaults.NavIconTestTag), false, null, 3, null), false, null, null, ComposableSingletons$GenericLadderTopBarKt.INSTANCE.getLambda$13346498$lib_trade_ladder_externalDebug(), composer, 196614, 28);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
