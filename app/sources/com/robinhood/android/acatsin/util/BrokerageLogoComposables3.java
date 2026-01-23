package com.robinhood.android.acatsin.util;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: BrokerageLogoComposables.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.util.ComposableSingletons$BrokerageLogoComposablesKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class BrokerageLogoComposables3 {
    public static final BrokerageLogoComposables3 INSTANCE = new BrokerageLogoComposables3();
    private static Function2<Composer, Integer, Unit> lambda$269417499 = ComposableLambda3.composableLambdaInstance(269417499, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.util.ComposableSingletons$BrokerageLogoComposablesKt$lambda$269417499$1
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
                ComposerKt.traceEventStart(269417499, i, -1, "com.robinhood.android.acatsin.util.ComposableSingletons$BrokerageLogoComposablesKt.lambda$269417499.<anonymous> (BrokerageLogoComposables.kt:126)");
            }
            BrokerageLogoComposables.RobinhoodBrokerageLogo(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-2046999337, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8615lambda$2046999337 = ComposableLambda3.composableLambdaInstance(-2046999337, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.util.ComposableSingletons$BrokerageLogoComposablesKt$lambda$-2046999337$1
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
                ComposerKt.traceEventStart(-2046999337, i, -1, "com.robinhood.android.acatsin.util.ComposableSingletons$BrokerageLogoComposablesKt.lambda$-2046999337.<anonymous> (BrokerageLogoComposables.kt:135)");
            }
            BrokerageLogoComposables.ContraBrokerageLogo(null, null, composer, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-2046999337$feature_acats_in_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10780getLambda$2046999337$feature_acats_in_externalDebug() {
        return f8615lambda$2046999337;
    }

    public final Function2<Composer, Integer, Unit> getLambda$269417499$feature_acats_in_externalDebug() {
        return lambda$269417499;
    }
}
