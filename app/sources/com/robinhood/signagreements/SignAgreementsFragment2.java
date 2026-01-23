package com.robinhood.signagreements;

import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: SignAgreementsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.signagreements.ComposableSingletons$SignAgreementsFragmentKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class SignAgreementsFragment2 {
    public static final SignAgreementsFragment2 INSTANCE = new SignAgreementsFragment2();

    /* renamed from: lambda$-1330785473, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9538lambda$1330785473 = ComposableLambda3.composableLambdaInstance(-1330785473, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.signagreements.ComposableSingletons$SignAgreementsFragmentKt$lambda$-1330785473$1
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
                ComposerKt.traceEventStart(-1330785473, i, -1, "com.robinhood.signagreements.ComposableSingletons$SignAgreementsFragmentKt.lambda$-1330785473.<anonymous> (SignAgreementsFragment.kt:36)");
            }
            LoadingScreenComposablesKt.ListLoadingScreenComposable(WindowInsetsPadding_androidKt.systemBarsPadding(Modifier.INSTANCE), false, false, 0, composer, 0, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1330785473$feature_sign_agreements_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m26417getLambda$1330785473$feature_sign_agreements_externalDebug() {
        return f9538lambda$1330785473;
    }
}
