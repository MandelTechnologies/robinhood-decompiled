package com.robinhood.android.investorprofile.p162ui.profile;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.investorprofile.C19641R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: InvestmentProfileSettingsBonfireIdentiScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investorprofile.ui.profile.ComposableSingletons$InvestmentProfileSettingsBonfireIdentiScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestmentProfileSettingsBonfireIdentiScreen {
    public static final InvestmentProfileSettingsBonfireIdentiScreen INSTANCE = new InvestmentProfileSettingsBonfireIdentiScreen();

    /* renamed from: lambda$-1666253020, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9076lambda$1666253020 = ComposableLambda3.composableLambdaInstance(-1666253020, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.ui.profile.ComposableSingletons$InvestmentProfileSettingsBonfireIdentiScreenKt$lambda$-1666253020$1
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
                ComposerKt.traceEventStart(-1666253020, i, -1, "com.robinhood.android.investorprofile.ui.profile.ComposableSingletons$InvestmentProfileSettingsBonfireIdentiScreenKt.lambda$-1666253020.<anonymous> (InvestmentProfileSettingsBonfireIdentiScreen.kt:390)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), composer, 6, 0);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C19641R.string.investment_profile_no_goals, composer, 0), modifierM21622defaultHorizontalPaddingWMci_g0, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8184);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1666253020$feature_investor_profile_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15661getLambda$1666253020$feature_investor_profile_externalDebug() {
        return f9076lambda$1666253020;
    }
}
