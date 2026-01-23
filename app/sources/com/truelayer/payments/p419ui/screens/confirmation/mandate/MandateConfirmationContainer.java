package com.truelayer.payments.p419ui.screens.confirmation.mandate;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MandateConfirmationContainer.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.confirmation.mandate.ComposableSingletons$MandateConfirmationContainerKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class MandateConfirmationContainer {
    public static final MandateConfirmationContainer INSTANCE = new MandateConfirmationContainer();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9587lambda1 = ComposableLambda3.composableLambdaInstance(-905074689, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.ComposableSingletons$MandateConfirmationContainerKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-905074689, i, -1, "com.truelayer.payments.ui.screens.confirmation.mandate.ComposableSingletons$MandateConfirmationContainerKt.lambda-1.<anonymous> (MandateConfirmationContainer.kt:106)");
                }
                MandateConfirmationContainer3.MandateConfirmationContainer(MandateHelpers2.INSTANCE.getConfirmationViewData(), null, null, null, null, null, composer, 8, 62);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27096getLambda1$payments_ui_release() {
        return f9587lambda1;
    }
}
