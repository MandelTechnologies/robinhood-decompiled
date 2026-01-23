package com.robinhood.shared.posttransfer.confirmationwithlottie;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: TransferConfirmationWithLottieScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.posttransfer.confirmationwithlottie.ComposableSingletons$TransferConfirmationWithLottieScreenKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class TransferConfirmationWithLottieScreen {
    public static final TransferConfirmationWithLottieScreen INSTANCE = new TransferConfirmationWithLottieScreen();
    private static Function2<Composer, Integer, Unit> lambda$1390164169 = ComposableLambda3.composableLambdaInstance(1390164169, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.posttransfer.confirmationwithlottie.ComposableSingletons$TransferConfirmationWithLottieScreenKt$lambda$1390164169$1
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
                ComposerKt.traceEventStart(1390164169, i, -1, "com.robinhood.shared.posttransfer.confirmationwithlottie.ComposableSingletons$TransferConfirmationWithLottieScreenKt.lambda$1390164169.<anonymous> (TransferConfirmationWithLottieScreen.kt:57)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1651596482 = ComposableLambda3.composableLambdaInstance(1651596482, false, TransferConfirmationWithLottieScreen4.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$1362016258 = ComposableLambda3.composableLambdaInstance(1362016258, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.posttransfer.confirmationwithlottie.ComposableSingletons$TransferConfirmationWithLottieScreenKt$lambda$1362016258$1
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
                ComposerKt.traceEventStart(1362016258, i, -1, "com.robinhood.shared.posttransfer.confirmationwithlottie.ComposableSingletons$TransferConfirmationWithLottieScreenKt.lambda$1362016258.<anonymous> (TransferConfirmationWithLottieScreen.kt:138)");
            }
            CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(Navigator.INSTANCE), TransferConfirmationWithLottieScreen.INSTANCE.getLambda$1651596482$lib_post_transfer_externalDebug(), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1362016258$lib_post_transfer_externalDebug() {
        return lambda$1362016258;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1390164169$lib_post_transfer_externalDebug() {
        return lambda$1390164169;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1651596482$lib_post_transfer_externalDebug() {
        return lambda$1651596482;
    }
}
