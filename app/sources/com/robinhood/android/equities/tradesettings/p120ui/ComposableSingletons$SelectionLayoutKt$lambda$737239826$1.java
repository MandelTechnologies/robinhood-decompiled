package com.robinhood.android.equities.tradesettings.p120ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SelectionLayout.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class ComposableSingletons$SelectionLayoutKt$lambda$737239826$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$SelectionLayoutKt$lambda$737239826$1 INSTANCE = new ComposableSingletons$SelectionLayoutKt$lambda$737239826$1();

    ComposableSingletons$SelectionLayoutKt$lambda$737239826$1() {
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
            ComposerKt.traceEventStart(737239826, i, -1, "com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$SelectionLayoutKt.lambda$737239826.<anonymous> (SelectionLayout.kt:80)");
        }
        ComposableSingletons$SelectionLayoutKt composableSingletons$SelectionLayoutKt = ComposableSingletons$SelectionLayoutKt.INSTANCE;
        Function2<Composer, Integer, Unit> lambda$184978761$lib_trade_settings_externalDebug = composableSingletons$SelectionLayoutKt.getLambda$184978761$lib_trade_settings_externalDebug();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$SelectionLayoutKt$lambda$737239826$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        SelectionLayoutKt.SelectionLayout(true, true, lambda$184978761$lib_trade_settings_externalDebug, (Function0) objRememberedValue, composableSingletons$SelectionLayoutKt.getLambda$204519883$lib_trade_settings_externalDebug(), null, null, composer, 28086, 96);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
