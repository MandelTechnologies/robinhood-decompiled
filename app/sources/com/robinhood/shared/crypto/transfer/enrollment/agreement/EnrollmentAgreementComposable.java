package com.robinhood.shared.crypto.transfer.enrollment.agreement;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: EnrollmentAgreementComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.enrollment.agreement.ComposableSingletons$EnrollmentAgreementComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class EnrollmentAgreementComposable {
    public static final EnrollmentAgreementComposable INSTANCE = new EnrollmentAgreementComposable();
    private static Function2<Composer, Integer, Unit> lambda$1567328698 = ComposableLambda3.composableLambdaInstance(1567328698, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.ComposableSingletons$EnrollmentAgreementComposableKt$lambda$1567328698$1
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
                ComposerKt.traceEventStart(1567328698, i, -1, "com.robinhood.shared.crypto.transfer.enrollment.agreement.ComposableSingletons$EnrollmentAgreementComposableKt.lambda$1567328698.<anonymous> (EnrollmentAgreementComposable.kt:97)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1525198089, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9418lambda$1525198089 = ComposableLambda3.composableLambdaInstance(-1525198089, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.ComposableSingletons$EnrollmentAgreementComposableKt$lambda$-1525198089$1
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
                ComposerKt.traceEventStart(-1525198089, i, -1, "com.robinhood.shared.crypto.transfer.enrollment.agreement.ComposableSingletons$EnrollmentAgreementComposableKt.lambda$-1525198089.<anonymous> (EnrollmentAgreementComposable.kt:326)");
            }
            EnrollmentAgreementComposable5.Content(new EnrollmentAgreementViewState(AppType.TRADER, EnrollmentAgreementViewState.CryptoAccountState.HasAccount.INSTANCE, false), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1456086583 = ComposableLambda3.composableLambdaInstance(1456086583, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.ComposableSingletons$EnrollmentAgreementComposableKt$lambda$1456086583$1
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
                ComposerKt.traceEventStart(1456086583, i, -1, "com.robinhood.shared.crypto.transfer.enrollment.agreement.ComposableSingletons$EnrollmentAgreementComposableKt.lambda$1456086583.<anonymous> (EnrollmentAgreementComposable.kt:323)");
            }
            CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(Navigator.INSTANCE), EnrollmentAgreementComposable.INSTANCE.m24992getLambda$1525198089$feature_crypto_transfer_externalDebug(), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1525198089$feature_crypto_transfer_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m24992getLambda$1525198089$feature_crypto_transfer_externalDebug() {
        return f9418lambda$1525198089;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1456086583$feature_crypto_transfer_externalDebug() {
        return lambda$1456086583;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1567328698$feature_crypto_transfer_externalDebug() {
        return lambda$1567328698;
    }
}
