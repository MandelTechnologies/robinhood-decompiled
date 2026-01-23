package com.robinhood.android.creditcard.p091ui.waitlist.screens;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: SimplifiedWaitlistConfirmationComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.waitlist.screens.ComposableSingletons$SimplifiedWaitlistConfirmationComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class SimplifiedWaitlistConfirmationComposable {
    public static final SimplifiedWaitlistConfirmationComposable INSTANCE = new SimplifiedWaitlistConfirmationComposable();
    private static Function2<Composer, Integer, Unit> lambda$1321077313 = ComposableLambda3.composableLambdaInstance(1321077313, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.ComposableSingletons$SimplifiedWaitlistConfirmationComposableKt$lambda$1321077313$1
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
                ComposerKt.traceEventStart(1321077313, i, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.ComposableSingletons$SimplifiedWaitlistConfirmationComposableKt.lambda$1321077313.<anonymous> (SimplifiedWaitlistConfirmationComposable.kt:148)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1321077313$feature_credit_card_externalDebug() {
        return lambda$1321077313;
    }
}
