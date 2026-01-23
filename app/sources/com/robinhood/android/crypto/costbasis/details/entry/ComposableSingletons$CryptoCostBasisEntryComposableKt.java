package com.robinhood.android.crypto.costbasis.details.entry;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: CryptoCostBasisEntryComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$CryptoCostBasisEntryComposableKt {
    public static final ComposableSingletons$CryptoCostBasisEntryComposableKt INSTANCE = new ComposableSingletons$CryptoCostBasisEntryComposableKt();
    private static Function2<Composer, Integer, Unit> lambda$1142766855 = ComposableLambda3.composableLambdaInstance(1142766855, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.details.entry.ComposableSingletons$CryptoCostBasisEntryComposableKt$lambda$1142766855$1
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
                ComposerKt.traceEventStart(1142766855, i, -1, "com.robinhood.android.crypto.costbasis.details.entry.ComposableSingletons$CryptoCostBasisEntryComposableKt.lambda$1142766855.<anonymous> (CryptoCostBasisEntryComposable.kt:181)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<BentoAppBarScope, Composer, Integer, Unit> lambda$1198335323 = ComposableLambda3.composableLambdaInstance(1198335323, false, C12797x34b1ba8b.INSTANCE);

    /* renamed from: lambda$-1718403878, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8810lambda$1718403878 = ComposableLambda3.composableLambdaInstance(-1718403878, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.details.entry.ComposableSingletons$CryptoCostBasisEntryComposableKt$lambda$-1718403878$1
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
                ComposerKt.traceEventStart(-1718403878, i, -1, "com.robinhood.android.crypto.costbasis.details.entry.ComposableSingletons$CryptoCostBasisEntryComposableKt.lambda$-1718403878.<anonymous> (CryptoCostBasisEntryComposable.kt:180)");
            }
            ComposableSingletons$CryptoCostBasisEntryComposableKt composableSingletons$CryptoCostBasisEntryComposableKt = ComposableSingletons$CryptoCostBasisEntryComposableKt.INSTANCE;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableSingletons$CryptoCostBasisEntryComposableKt.getLambda$1142766855$feature_crypto_cost_basis_externalDebug(), null, composableSingletons$CryptoCostBasisEntryComposableKt.getLambda$1198335323$feature_crypto_cost_basis_externalDebug(), null, null, false, false, null, null, 0L, null, composer, 390, 0, 2042);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-200545027, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8811lambda$200545027 = ComposableLambda3.composableLambdaInstance(-200545027, false, C12795x7695c331.INSTANCE);

    /* renamed from: getLambda$-1718403878$feature_crypto_cost_basis_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12914getLambda$1718403878$feature_crypto_cost_basis_externalDebug() {
        return f8810lambda$1718403878;
    }

    /* renamed from: getLambda$-200545027$feature_crypto_cost_basis_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12915getLambda$200545027$feature_crypto_cost_basis_externalDebug() {
        return f8811lambda$200545027;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1142766855$feature_crypto_cost_basis_externalDebug() {
        return lambda$1142766855;
    }

    public final Function3<BentoAppBarScope, Composer, Integer, Unit> getLambda$1198335323$feature_crypto_cost_basis_externalDebug() {
        return lambda$1198335323;
    }
}
