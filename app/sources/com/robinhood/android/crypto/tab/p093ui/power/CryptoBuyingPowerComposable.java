package com.robinhood.android.crypto.tab.p093ui.power;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.crypto.tab.C13013R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoBuyingPowerComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.tab.ui.power.ComposableSingletons$CryptoBuyingPowerComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoBuyingPowerComposable {
    public static final CryptoBuyingPowerComposable INSTANCE = new CryptoBuyingPowerComposable();

    /* renamed from: lambda$-1272161802, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8842lambda$1272161802 = ComposableLambda3.composableLambdaInstance(-1272161802, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.power.ComposableSingletons$CryptoBuyingPowerComposableKt$lambda$-1272161802$1
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
                ComposerKt.traceEventStart(-1272161802, i, -1, "com.robinhood.android.crypto.tab.ui.power.ComposableSingletons$CryptoBuyingPowerComposableKt.lambda$-1272161802.<anonymous> (CryptoBuyingPowerComposable.kt:76)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C13013R.string.crypto_home_buying_power_tooltip, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1272161802$feature_crypto_tab_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13044getLambda$1272161802$feature_crypto_tab_externalDebug() {
        return f8842lambda$1272161802;
    }
}
