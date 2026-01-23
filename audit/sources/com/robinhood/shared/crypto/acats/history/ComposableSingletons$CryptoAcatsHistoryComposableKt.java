package com.robinhood.shared.crypto.acats.history;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import bonfire_crypto.proto.p042v1.crypto_migrations.p043v1.CryptoMigrationsDetailResponseDto;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: CryptoAcatsHistoryComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$CryptoAcatsHistoryComposableKt {
    public static final ComposableSingletons$CryptoAcatsHistoryComposableKt INSTANCE = new ComposableSingletons$CryptoAcatsHistoryComposableKt();
    private static Function2<Composer, Integer, Unit> lambda$1899391636 = ComposableLambda3.composableLambdaInstance(1899391636, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.history.ComposableSingletons$CryptoAcatsHistoryComposableKt$lambda$1899391636$1
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
                ComposerKt.traceEventStart(1899391636, i, -1, "com.robinhood.shared.crypto.acats.history.ComposableSingletons$CryptoAcatsHistoryComposableKt.lambda$1899391636.<anonymous> (CryptoAcatsHistoryComposable.kt:83)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<BentoAppBarScope, Composer, Integer, Unit> lambda$57329856 = ComposableLambda3.composableLambdaInstance(57329856, false, C37538x932c5c43.INSTANCE);

    /* renamed from: lambda$-1186148831, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9398lambda$1186148831 = ComposableLambda3.composableLambdaInstance(-1186148831, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.history.ComposableSingletons$CryptoAcatsHistoryComposableKt$lambda$-1186148831$1
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
                ComposerKt.traceEventStart(-1186148831, i, -1, "com.robinhood.shared.crypto.acats.history.ComposableSingletons$CryptoAcatsHistoryComposableKt.lambda$-1186148831.<anonymous> (CryptoAcatsHistoryComposable.kt:75)");
            }
            ComposableSingletons$CryptoAcatsHistoryComposableKt composableSingletons$CryptoAcatsHistoryComposableKt = ComposableSingletons$CryptoAcatsHistoryComposableKt.INSTANCE;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableSingletons$CryptoAcatsHistoryComposableKt.getLambda$1899391636$feature_acats_externalRelease(), null, composableSingletons$CryptoAcatsHistoryComposableKt.getLambda$57329856$feature_acats_externalRelease(), null, null, false, false, null, null, 0L, null, composer, 390, 0, 2042);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<CryptoMigrationsDetailResponseDto, Composer, Integer, Unit> lambda$1062841268 = ComposableLambda3.composableLambdaInstance(1062841268, false, new Function3<CryptoMigrationsDetailResponseDto, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.history.ComposableSingletons$CryptoAcatsHistoryComposableKt$lambda$1062841268$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(CryptoMigrationsDetailResponseDto cryptoMigrationsDetailResponseDto, Composer composer, Integer num) {
            invoke(cryptoMigrationsDetailResponseDto, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(CryptoMigrationsDetailResponseDto cryptoMigrationsDetailResponseDto, Composer composer, int i) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1062841268, i, -1, "com.robinhood.shared.crypto.acats.history.ComposableSingletons$CryptoAcatsHistoryComposableKt.lambda$1062841268.<anonymous> (CryptoAcatsHistoryComposable.kt:92)");
            }
            if (cryptoMigrationsDetailResponseDto == null) {
                composer.startReplaceGroup(605370568);
                LoadingScreenComposablesKt.ListLoadingScreenComposable(null, true, false, 4, composer, 3120, 5);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(605571324);
                CryptoAcatsHistoryComposableKt.MigrationDetailContent(cryptoMigrationsDetailResponseDto, null, composer, i & 14, 2);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1186148831$feature_acats_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m24875getLambda$1186148831$feature_acats_externalRelease() {
        return f9398lambda$1186148831;
    }

    public final Function3<CryptoMigrationsDetailResponseDto, Composer, Integer, Unit> getLambda$1062841268$feature_acats_externalRelease() {
        return lambda$1062841268;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1899391636$feature_acats_externalRelease() {
        return lambda$1899391636;
    }

    public final Function3<BentoAppBarScope, Composer, Integer, Unit> getLambda$57329856$feature_acats_externalRelease() {
        return lambda$57329856;
    }
}
