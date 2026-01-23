package com.robinhood.android.investmentstracker.composables;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.investmentstracker.C19501R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AccountListAppBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investmentstracker.composables.ComposableSingletons$AccountListAppBarKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class AccountListAppBar2 {
    public static final AccountListAppBar2 INSTANCE = new AccountListAppBar2();
    private static Function2<Composer, Integer, Unit> lambda$1376479265 = ComposableLambda3.composableLambdaInstance(1376479265, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.ComposableSingletons$AccountListAppBarKt$lambda$1376479265$1
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
                ComposerKt.traceEventStart(1376479265, i, -1, "com.robinhood.android.investmentstracker.composables.ComposableSingletons$AccountListAppBarKt.lambda$1376479265.<anonymous> (AccountListAppBar.kt:32)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            String strStringResource = StringResources_androidKt.stringResource(C19501R.string.investments_tracker_setting_header, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierFillMaxWidth$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 48, 0, 8120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1376479265$feature_investments_tracker_externalDebug() {
        return lambda$1376479265;
    }
}
