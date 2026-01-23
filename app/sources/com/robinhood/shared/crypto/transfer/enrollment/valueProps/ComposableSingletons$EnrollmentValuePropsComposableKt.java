package com.robinhood.shared.crypto.transfer.enrollment.valueProps;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: EnrollmentValuePropsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$EnrollmentValuePropsComposableKt {
    public static final ComposableSingletons$EnrollmentValuePropsComposableKt INSTANCE = new ComposableSingletons$EnrollmentValuePropsComposableKt();
    private static Function2<Composer, Integer, Unit> lambda$1483543146 = ComposableLambda3.composableLambdaInstance(1483543146, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.ComposableSingletons$EnrollmentValuePropsComposableKt$lambda$1483543146$1
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
                ComposerKt.traceEventStart(1483543146, i, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.ComposableSingletons$EnrollmentValuePropsComposableKt.lambda$1483543146.<anonymous> (EnrollmentValuePropsComposable.kt:76)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1532273740, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9423lambda$1532273740 = ComposableLambda3.composableLambdaInstance(-1532273740, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.ComposableSingletons$EnrollmentValuePropsComposableKt$lambda$-1532273740$1
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
                ComposerKt.traceEventStart(-1532273740, i, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.ComposableSingletons$EnrollmentValuePropsComposableKt.lambda$-1532273740.<anonymous> (EnrollmentValuePropsComposable.kt:110)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1118487581 = ComposableLambda3.composableLambdaInstance(1118487581, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.ComposableSingletons$EnrollmentValuePropsComposableKt$lambda$1118487581$1
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
                ComposerKt.traceEventStart(1118487581, i, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.ComposableSingletons$EnrollmentValuePropsComposableKt.lambda$1118487581.<anonymous> (EnrollmentValuePropsComposable.kt:131)");
            }
            EnrollmentValuePropsComposableKt.IntroText(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$157304652 = ComposableLambda3.composableLambdaInstance(157304652, false, C38009xea084ebb.INSTANCE);

    /* renamed from: getLambda$-1532273740$feature_crypto_transfer_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25019getLambda$1532273740$feature_crypto_transfer_externalDebug() {
        return f9423lambda$1532273740;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1118487581$feature_crypto_transfer_externalDebug() {
        return lambda$1118487581;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1483543146$feature_crypto_transfer_externalDebug() {
        return lambda$1483543146;
    }

    public final Function2<Composer, Integer, Unit> getLambda$157304652$feature_crypto_transfer_externalDebug() {
        return lambda$157304652;
    }
}
