package com.robinhood.android.creditcard.p091ui.welcome;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: WelcomeCreditCardComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.welcome.ComposableSingletons$WelcomeCreditCardComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class WelcomeCreditCardComposable {
    public static final WelcomeCreditCardComposable INSTANCE = new WelcomeCreditCardComposable();

    /* renamed from: lambda$-570432953, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8809lambda$570432953 = ComposableLambda3.composableLambdaInstance(-570432953, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.welcome.ComposableSingletons$WelcomeCreditCardComposableKt$lambda$-570432953$1
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
                ComposerKt.traceEventStart(-570432953, i, -1, "com.robinhood.android.creditcard.ui.welcome.ComposableSingletons$WelcomeCreditCardComposableKt.lambda$-570432953.<anonymous> (WelcomeCreditCardComposable.kt:88)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-570432953$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12907getLambda$570432953$feature_credit_card_externalDebug() {
        return f8809lambda$570432953;
    }
}
