package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AddAccountAgreementOverlay.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$AddAccountAgreementOverlayKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class AddAccountAgreementOverlay3 {
    public static final AddAccountAgreementOverlay3 INSTANCE = new AddAccountAgreementOverlay3();
    private static Function2<Composer, Integer, Unit> lambda$1381087960 = ComposableLambda3.composableLambdaInstance(1381087960, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$AddAccountAgreementOverlayKt$lambda$1381087960$1
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
                ComposerKt.traceEventStart(1381087960, i, -1, "com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$AddAccountAgreementOverlayKt.lambda$1381087960.<anonymous> (AddAccountAgreementOverlay.kt:62)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1381087960$feature_investments_tracker_externalDebug() {
        return lambda$1381087960;
    }
}
