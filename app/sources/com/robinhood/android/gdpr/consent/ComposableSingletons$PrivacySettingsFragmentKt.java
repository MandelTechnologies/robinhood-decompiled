package com.robinhood.android.gdpr.consent;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PrivacySettingsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class ComposableSingletons$PrivacySettingsFragmentKt {
    public static final ComposableSingletons$PrivacySettingsFragmentKt INSTANCE = new ComposableSingletons$PrivacySettingsFragmentKt();
    private static Function2<Composer, Integer, Unit> lambda$2086717126 = ComposableLambda3.composableLambdaInstance(2086717126, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gdpr.consent.ComposableSingletons$PrivacySettingsFragmentKt$lambda$2086717126$1
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
                ComposerKt.traceEventStart(2086717126, i, -1, "com.robinhood.android.gdpr.consent.ComposableSingletons$PrivacySettingsFragmentKt.lambda$2086717126.<anonymous> (PrivacySettingsFragment.kt:119)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$2086717126$feature_gdpr_consent_externalDebug() {
        return lambda$2086717126;
    }
}
