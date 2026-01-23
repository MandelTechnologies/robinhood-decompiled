package com.robinhood.shared.tradeladder.p398ui.ladder.shared.p399ui;

import androidx.compose.material3.SnackbarDuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LadderSnackbar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.ui.ComposableSingletons$LadderSnackbarKt$lambda$-1626262743$1, reason: use source file name */
/* loaded from: classes12.dex */
final class LadderSnackbar2 implements Function2<Composer, Integer, Unit> {
    public static final LadderSnackbar2 INSTANCE = new LadderSnackbar2();

    LadderSnackbar2() {
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
            ComposerKt.traceEventStart(-1626262743, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.ui.ComposableSingletons$LadderSnackbarKt.lambda$-1626262743.<anonymous> (LadderSnackbar.kt:97)");
        }
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.ALERT_12;
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke("You've been flagged as a pattern day trader.");
        StringResource stringResourceInvoke2 = companion.invoke("Learn More");
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.ui.ComposableSingletons$LadderSnackbarKt$lambda$-1626262743$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        LadderSnackbar3.LadderSnackbar(new LadderSnackbarVisuals(serverToBentoAssetMapper2, stringResourceInvoke, stringResourceInvoke2, (Function0) objRememberedValue, null, SnackbarDuration.Short, true, 16, null), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
