package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AutoSendToggleRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$AutoSendToggleRowKt$lambda$977731317$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AutoSendToggleRow3 implements Function2<Composer, Integer, Unit> {
    public static final AutoSendToggleRow3 INSTANCE = new AutoSendToggleRow3();

    AutoSendToggleRow3() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(boolean z) {
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(977731317, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$AutoSendToggleRowKt.lambda$977731317.<anonymous> (AutoSendToggleRow.kt:43)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$AutoSendToggleRowKt$lambda$977731317$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutoSendToggleRow3.invoke$lambda$1$lambda$0(((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        AutoSendToggleRow.AutoSendToggleRow(true, (Function1) objRememberedValue, null, composer, 54, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
