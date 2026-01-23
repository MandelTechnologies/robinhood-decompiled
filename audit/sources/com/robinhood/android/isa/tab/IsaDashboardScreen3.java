package com.robinhood.android.isa.tab;

import android.content.Context;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.isa.contributions.IsaContributionHub3;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IsaDashboardScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.isa.tab.IsaDashboardScreenKt$IsaDashboardScreen$1$2, reason: use source file name */
/* loaded from: classes10.dex */
final class IsaDashboardScreen3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ String $accountNumber;
    final /* synthetic */ Context $context;
    final /* synthetic */ Navigator $navigator;

    IsaDashboardScreen3(Navigator navigator, Context context, String str) {
        this.$navigator = navigator;
        this.$context = context;
        this.$accountNumber = str;
    }

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
            ComposerKt.traceEventStart(973322813, i, -1, "com.robinhood.android.isa.tab.IsaDashboardScreen.<anonymous>.<anonymous> (IsaDashboardScreen.kt:52)");
        }
        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer, 0, 5);
        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
        String strStringResource = StringResources_androidKt.stringResource(C19973R.string.isa_dashboard_cta_add_money, composer, 0);
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changed(this.$accountNumber);
        final Navigator navigator = this.$navigator;
        final Context context = this.$context;
        final String str = this.$accountNumber;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.isa.tab.IsaDashboardScreenKt$IsaDashboardScreen$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IsaDashboardScreen3.invoke$lambda$1$lambda$0(navigator, context, str);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoButtonBar2.BentoButtonBar(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, false, null, null, (Function0) objRememberedValue, strStringResource, false, null, false, null, null, false, null, false, composer, 0, 0, 65342);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context, String str) {
        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, IsaContributionHub3.addMoneyDeeplink(str), null, null, false, null, 60, null);
        return Unit.INSTANCE;
    }
}
