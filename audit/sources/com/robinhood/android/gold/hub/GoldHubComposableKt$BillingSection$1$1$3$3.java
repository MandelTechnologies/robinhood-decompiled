package com.robinhood.android.gold.hub;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.gold.lib.hub.api.ApiGoldHubBilling;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.GoldHubAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldHubComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
final class GoldHubComposableKt$BillingSection$1$1$3$3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SduiActionHandler<GoldHubAction> $actionHandler;
    final /* synthetic */ ApiGoldHubBilling $billing;

    /* JADX WARN: Multi-variable type inference failed */
    GoldHubComposableKt$BillingSection$1$1$3$3(ApiGoldHubBilling apiGoldHubBilling, SduiActionHandler<? super GoldHubAction> sduiActionHandler) {
        this.$billing = apiGoldHubBilling;
        this.$actionHandler = sduiActionHandler;
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
            ComposerKt.traceEventStart(-1899393807, i, -1, "com.robinhood.android.gold.hub.BillingSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldHubComposable.kt:629)");
        }
        AnnotatedString annotatedString = new AnnotatedString(this.$billing.getValue(), null, 2, null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        BentoText2.m20748BentoTextQnj7Zds(annotatedString, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8186);
        String subtitle = this.$billing.getSubtitle();
        if (subtitle != null) {
            final ApiGoldHubBilling apiGoldHubBilling = this.$billing;
            final SduiActionHandler<GoldHubAction> sduiActionHandler = this.$actionHandler;
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(apiGoldHubBilling) | composer.changedInstance(sduiActionHandler);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$BillingSection$1$1$3$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoldHubComposableKt$BillingSection$1$1$3$3.invoke$lambda$3$lambda$2$lambda$1(apiGoldHubBilling, sduiActionHandler);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoMarkdownText2.BentoMarkdownText(subtitle, (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) objRememberedValue, (Function1<? super String, Unit>) null, composer, 0, 22);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2$lambda$1(ApiGoldHubBilling apiGoldHubBilling, SduiActionHandler sduiActionHandler) {
        GoldHubAction action = apiGoldHubBilling.getAction();
        if (action != null) {
            sduiActionHandler.mo15941handle(action);
        }
        return Unit.INSTANCE;
    }
}
