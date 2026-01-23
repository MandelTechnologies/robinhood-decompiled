package com.robinhood.shared.posttransfer.confirmationwithlottie;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransferConfirmationWithLottieScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.posttransfer.confirmationwithlottie.ComposableSingletons$TransferConfirmationWithLottieScreenKt$lambda$1651596482$1, reason: use source file name */
/* loaded from: classes6.dex */
final class TransferConfirmationWithLottieScreen4 implements Function2<Composer, Integer, Unit> {
    public static final TransferConfirmationWithLottieScreen4 INSTANCE = new TransferConfirmationWithLottieScreen4();

    TransferConfirmationWithLottieScreen4() {
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
            ComposerKt.traceEventStart(1651596482, i, -1, "com.robinhood.shared.posttransfer.confirmationwithlottie.ComposableSingletons$TransferConfirmationWithLottieScreenKt.lambda$1651596482.<anonymous> (TransferConfirmationWithLottieScreen.kt:141)");
        }
        GenericButton genericButton = new GenericButton("Continue", null, false, "", null, null, 54, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.posttransfer.confirmationwithlottie.ComposableSingletons$TransferConfirmationWithLottieScreenKt$lambda$1651596482$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        TransferConfirmationWithLottieScreen5.TransferConfirmationWithLottieScreen("Transfer Complete", "Because you’re eligible for Instant Deposits, we’ll invest your money now.", "Instant Deposits are subject to limitations and restrictions. [Learn more]()", "", "", genericButton, (Function0) objRememberedValue, null, composer, 1600950, 128);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
