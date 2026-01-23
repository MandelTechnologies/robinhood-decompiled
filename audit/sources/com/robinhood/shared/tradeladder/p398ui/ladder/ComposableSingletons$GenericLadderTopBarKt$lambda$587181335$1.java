package com.robinhood.shared.tradeladder.p398ui.ladder;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar.DetailContent6;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GenericLadderTopBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.ComposableSingletons$GenericLadderTopBarKt$lambda$-587181335$1, reason: invalid class name */
/* loaded from: classes12.dex */
final class ComposableSingletons$GenericLadderTopBarKt$lambda$587181335$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$GenericLadderTopBarKt$lambda$587181335$1 INSTANCE = new ComposableSingletons$GenericLadderTopBarKt$lambda$587181335$1();

    ComposableSingletons$GenericLadderTopBarKt$lambda$587181335$1() {
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
            ComposerKt.traceEventStart(-587181335, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.ComposableSingletons$GenericLadderTopBarKt.lambda$-587181335.<anonymous> (GenericLadderTopBar.kt:127)");
        }
        BigDecimal bigDecimal = new BigDecimal(500);
        BigDecimal bigDecimal2 = new BigDecimal(1000);
        StringResource stringResourceInvoke = StringResource.INSTANCE.invoke("2 Positions");
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.ComposableSingletons$GenericLadderTopBarKt$lambda$-587181335$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.ComposableSingletons$GenericLadderTopBarKt$lambda$-587181335$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function02 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.ComposableSingletons$GenericLadderTopBarKt$lambda$-587181335$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        DetailContent6.DetailContent(bigDecimal, bigDecimal2, true, stringResourceInvoke, 3, true, false, null, function0, function02, (Function0) objRememberedValue3, null, composer, (StringResource.$stable << 9) | 920347008, 6, 2048);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
