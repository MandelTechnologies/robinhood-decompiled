package com.robinhood.shared.agreements.agreementsscreen;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdentiAgreementScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.agreements.agreementsscreen.ComposableSingletons$IdentiAgreementScreenKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class IdentiAgreementScreen {
    public static final IdentiAgreementScreen INSTANCE = new IdentiAgreementScreen();

    /* renamed from: lambda$-1104989870, reason: not valid java name */
    private static Function3<PaddingValues, Composer, Integer, Unit> f9386lambda$1104989870 = ComposableLambda3.composableLambdaInstance(-1104989870, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.agreements.agreementsscreen.ComposableSingletons$IdentiAgreementScreenKt$lambda$-1104989870$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i |= composer.changed(paddingValues) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1104989870, i, -1, "com.robinhood.shared.agreements.agreementsscreen.ComposableSingletons$IdentiAgreementScreenKt.lambda$-1104989870.<anonymous> (IdentiAgreementScreen.kt:110)");
            }
            IdentiAgreementScreen4.LoadingContent(paddingValues, composer, i & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1115154398 = ComposableLambda3.composableLambdaInstance(1115154398, false, IdentiAgreementScreen3.INSTANCE);

    /* renamed from: getLambda$-1104989870$lib_agreements_screen_externalDebug, reason: not valid java name */
    public final Function3<PaddingValues, Composer, Integer, Unit> m24773getLambda$1104989870$lib_agreements_screen_externalDebug() {
        return f9386lambda$1104989870;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1115154398$lib_agreements_screen_externalDebug() {
        return lambda$1115154398;
    }
}
