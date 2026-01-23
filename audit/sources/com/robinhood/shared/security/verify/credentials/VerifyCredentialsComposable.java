package com.robinhood.shared.security.verify.credentials;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: VerifyCredentialsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.security.verify.credentials.ComposableSingletons$VerifyCredentialsComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class VerifyCredentialsComposable {
    public static final VerifyCredentialsComposable INSTANCE = new VerifyCredentialsComposable();

    /* renamed from: lambda$-355714610, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9476lambda$355714610 = ComposableLambda3.composableLambdaInstance(-355714610, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.security.verify.credentials.ComposableSingletons$VerifyCredentialsComposableKt$lambda$-355714610$1
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
                ComposerKt.traceEventStart(-355714610, i, -1, "com.robinhood.shared.security.verify.credentials.ComposableSingletons$VerifyCredentialsComposableKt.lambda$-355714610.<anonymous> (VerifyCredentialsComposable.kt:96)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39685R.string.verify_credentials_app_bar_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-355714610$feature_verify_credentials_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25665getLambda$355714610$feature_verify_credentials_externalDebug() {
        return f9476lambda$355714610;
    }
}
