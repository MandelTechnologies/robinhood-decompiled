package com.robinhood.shared.crypto.transfer.enrollment.protect;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EnrollmentProtectComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.enrollment.protect.ComposableSingletons$EnrollmentProtectComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class EnrollmentProtectComposable {
    public static final EnrollmentProtectComposable INSTANCE = new EnrollmentProtectComposable();

    /* renamed from: lambda$-1959070175, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9421lambda$1959070175 = ComposableLambda3.composableLambdaInstance(-1959070175, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.protect.ComposableSingletons$EnrollmentProtectComposableKt$lambda$-1959070175$1
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
                ComposerKt.traceEventStart(-1959070175, i, -1, "com.robinhood.shared.crypto.transfer.enrollment.protect.ComposableSingletons$EnrollmentProtectComposableKt.lambda$-1959070175.<anonymous> (EnrollmentProtectComposable.kt:51)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1381870721, reason: not valid java name */
    private static Function3<PaddingValues, Composer, Integer, Unit> f9420lambda$1381870721 = ComposableLambda3.composableLambdaInstance(-1381870721, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.protect.ComposableSingletons$EnrollmentProtectComposableKt$lambda$-1381870721$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues contentPadding, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
            if ((i & 6) == 0) {
                i |= composer.changed(contentPadding) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1381870721, i, -1, "com.robinhood.shared.crypto.transfer.enrollment.protect.ComposableSingletons$EnrollmentProtectComposableKt.lambda$-1381870721.<anonymous> (EnrollmentProtectComposable.kt:60)");
            }
            EnrollmentProtectComposable4.Content(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), contentPadding), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1381870721$feature_crypto_transfer_externalDebug, reason: not valid java name */
    public final Function3<PaddingValues, Composer, Integer, Unit> m25008getLambda$1381870721$feature_crypto_transfer_externalDebug() {
        return f9420lambda$1381870721;
    }

    /* renamed from: getLambda$-1959070175$feature_crypto_transfer_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25009getLambda$1959070175$feature_crypto_transfer_externalDebug() {
        return f9421lambda$1959070175;
    }
}
