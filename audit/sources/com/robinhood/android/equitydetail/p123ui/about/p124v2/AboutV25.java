package com.robinhood.android.equitydetail.p123ui.about.p124v2;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AboutV2.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitydetail.ui.about.v2.ComposableSingletons$AboutV2Kt$lambda$121973470$1, reason: use source file name */
/* loaded from: classes3.dex */
final class AboutV25 implements Function2<Composer, Integer, Unit> {
    public static final AboutV25 INSTANCE = new AboutV25();

    AboutV25() {
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
            ComposerKt.traceEventStart(121973470, i, -1, "com.robinhood.android.equitydetail.ui.about.v2.ComposableSingletons$AboutV2Kt.lambda$121973470.<anonymous> (AboutV2.kt:305)");
        }
        AboutV2ViewState aboutV2ViewStateBuildTestViewState$default = AboutV2.buildTestViewState$default(null, null, AboutV2ViewState2.POSITIVE, true, true, false, 35, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.equitydetail.ui.about.v2.ComposableSingletons$AboutV2Kt$lambda$121973470$1$$ExternalSyntheticLambda0
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
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equitydetail.ui.about.v2.ComposableSingletons$AboutV2Kt$lambda$121973470$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        AboutV2.AboutV2(aboutV2ViewStateBuildTestViewState$default, (Function0<Unit>) function0, (Function0<Unit>) objRememberedValue2, composer, 432);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
