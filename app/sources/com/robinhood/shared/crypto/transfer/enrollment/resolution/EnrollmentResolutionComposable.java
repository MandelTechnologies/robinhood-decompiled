package com.robinhood.shared.crypto.transfer.enrollment.resolution;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: EnrollmentResolutionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.enrollment.resolution.ComposableSingletons$EnrollmentResolutionComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class EnrollmentResolutionComposable {
    public static final EnrollmentResolutionComposable INSTANCE = new EnrollmentResolutionComposable();

    /* renamed from: lambda$-847450214, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9422lambda$847450214 = ComposableLambda3.composableLambdaInstance(-847450214, false, EnrollmentResolutionComposable2.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$218417344 = ComposableLambda3.composableLambdaInstance(218417344, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.resolution.ComposableSingletons$EnrollmentResolutionComposableKt$lambda$218417344$1
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
                ComposerKt.traceEventStart(218417344, i, -1, "com.robinhood.shared.crypto.transfer.enrollment.resolution.ComposableSingletons$EnrollmentResolutionComposableKt.lambda$218417344.<anonymous> (EnrollmentResolutionComposable.kt:152)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<BentoAppBarScope, Composer, Integer, Unit> lambda$788159764 = ComposableLambda3.composableLambdaInstance(788159764, false, EnrollmentResolutionComposable4.INSTANCE);

    /* renamed from: getLambda$-847450214$feature_crypto_transfer_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25014getLambda$847450214$feature_crypto_transfer_externalDebug() {
        return f9422lambda$847450214;
    }

    public final Function2<Composer, Integer, Unit> getLambda$218417344$feature_crypto_transfer_externalDebug() {
        return lambda$218417344;
    }

    public final Function3<BentoAppBarScope, Composer, Integer, Unit> getLambda$788159764$feature_crypto_transfer_externalDebug() {
        return lambda$788159764;
    }
}
