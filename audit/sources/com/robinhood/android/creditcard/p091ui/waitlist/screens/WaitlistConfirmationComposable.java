package com.robinhood.android.creditcard.p091ui.waitlist.screens;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: WaitlistConfirmationComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.waitlist.screens.ComposableSingletons$WaitlistConfirmationComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class WaitlistConfirmationComposable {
    public static final WaitlistConfirmationComposable INSTANCE = new WaitlistConfirmationComposable();
    private static Function2<Composer, Integer, Unit> lambda$472051206 = ComposableLambda3.composableLambdaInstance(472051206, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.ComposableSingletons$WaitlistConfirmationComposableKt$lambda$472051206$1
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
                ComposerKt.traceEventStart(472051206, i, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.ComposableSingletons$WaitlistConfirmationComposableKt.lambda$472051206.<anonymous> (WaitlistConfirmationComposable.kt:131)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$472051206$feature_credit_card_externalDebug() {
        return lambda$472051206;
    }
}
