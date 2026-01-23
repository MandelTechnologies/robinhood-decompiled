package com.robinhood.android.creditcard.p091ui.creditapplication.finalterms;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RewardsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class RewardsComposableKt$Rewards$1$1$4 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ EventLogger $eventLogger;

    RewardsComposableKt$Rewards$1$1$4(EventLogger eventLogger, Context context) {
        this.$eventLogger = eventLogger;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-69967154, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.Rewards.<anonymous>.<anonymous>.<anonymous> (RewardsComposable.kt:157)");
        }
        final String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_final_terms_see_rewards_link, composer, 0);
        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, RewardsComposableKt.REWARDS_SIPC_BUTTON_TEST_TAG);
        String strStringResource2 = StringResources_androidKt.stringResource(C12201R.string.credit_app_final_terms_coastal_disclosure, composer, 0);
        String strStringResource3 = StringResources_androidKt.stringResource(C12201R.string.credit_app_final_terms_see_rewards, composer, 0);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        TextStyle textAnnotation = bentoTheme.getTypography(composer, i2).getTextAnnotation();
        int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
        long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(strStringResource) | composer.changedInstance(this.$context);
        final EventLogger eventLogger = this.$eventLogger;
        final Context context = this.$context;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.RewardsComposableKt$Rewards$1$1$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RewardsComposableKt$Rewards$1$1$4.invoke$lambda$1$lambda$0(eventLogger, strStringResource, context);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoTextWithLink.m20753BentoTextWithSubstringLinkXkG1Q0A(strStringResource2, strStringResource3, (Function0) objRememberedValue, modifierTestTag, jM21426getFg20d7_KjU, 0L, textAnnotation, iM7919getCentere0LSkKk, composer, 3072, 32);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, String str, Context context) {
        loggingUtils.logLinkClick$default(eventLogger, str, null, 2, null);
        WebUtils.viewUrl$default(context, str, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }
}
