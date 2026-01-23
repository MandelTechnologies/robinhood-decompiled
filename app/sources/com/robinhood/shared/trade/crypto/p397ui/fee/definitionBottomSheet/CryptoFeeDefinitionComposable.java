package com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoFeeDefinitionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.ComposableSingletons$CryptoFeeDefinitionComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoFeeDefinitionComposable {
    public static final CryptoFeeDefinitionComposable INSTANCE = new CryptoFeeDefinitionComposable();

    /* renamed from: lambda$-507048002, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9482lambda$507048002 = ComposableLambda3.composableLambdaInstance(-507048002, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.ComposableSingletons$CryptoFeeDefinitionComposableKt$lambda$-507048002$1
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
                ComposerKt.traceEventStart(-507048002, i, -1, "com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.ComposableSingletons$CryptoFeeDefinitionComposableKt.lambda$-507048002.<anonymous> (CryptoFeeDefinitionComposable.kt:144)");
            }
            CryptoFeeDefinitionComposable3.LoadingContent(true, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-507048002$feature_trade_crypto_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25820getLambda$507048002$feature_trade_crypto_externalDebug() {
        return f9482lambda$507048002;
    }
}
