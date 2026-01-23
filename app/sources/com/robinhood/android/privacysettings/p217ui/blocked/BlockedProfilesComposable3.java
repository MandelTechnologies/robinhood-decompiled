package com.robinhood.android.privacysettings.p217ui.blocked;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.privacysettings.C25869R;
import com.robinhood.compose.bento.component.BentoText2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: BlockedProfilesComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.privacysettings.ui.blocked.ComposableSingletons$BlockedProfilesComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class BlockedProfilesComposable3 {
    public static final BlockedProfilesComposable3 INSTANCE = new BlockedProfilesComposable3();

    /* renamed from: lambda$-797950349, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9184lambda$797950349 = ComposableLambda3.composableLambdaInstance(-797950349, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.privacysettings.ui.blocked.ComposableSingletons$BlockedProfilesComposableKt$lambda$-797950349$1
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
                ComposerKt.traceEventStart(-797950349, i, -1, "com.robinhood.android.privacysettings.ui.blocked.ComposableSingletons$BlockedProfilesComposableKt.lambda$-797950349.<anonymous> (BlockedProfilesComposable.kt:179)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25869R.string.blocked_profiles_unblock, composer, 0), null, null, null, FontWeight.INSTANCE.getBold(), TextDecoration.INSTANCE.getUnderline(), null, 0, false, 0, 0, null, 0, null, composer, 221184, 0, 16334);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-797950349$feature_privacy_settings_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m17739getLambda$797950349$feature_privacy_settings_externalDebug() {
        return f9184lambda$797950349;
    }
}
